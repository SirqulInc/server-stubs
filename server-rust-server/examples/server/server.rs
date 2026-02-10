//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

    let server = Server::new();

    let service = MakeService::new(server);
    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
    ConsumerCreateResponse,
    ConsumerUpdateResponse,
    QueueCreateResponse,
    QueueDeleteResponse,
    QueueGetResponse,
    QueuePublishResponse,
    QueueSearchResponse,
    QueueUpdateResponse,
    AccountLocationSearchResponse,
    BlockAccountResponse,
    CreateAccountResponse,
    EditAccountResponse,
    EditUsernameResponse,
    GetAccountResponse,
    GetProfileAssetsResponse,
    GetReferralListResponse,
    GetSettingsResponse,
    LoginDelegateResponse,
    LoginGeneralResponse,
    LoginUsernameResponse,
    LogoutResponse,
    MergeAccountResponse,
    PasswordChangeResponse,
    PasswordResetResponse,
    RequestPasswordResetResponse,
    RequestValidateAccountResponse,
    SearchAccountsResponse,
    SecureLoginResponse,
    SecureSignupResponse,
    SetMatchTokenResponse,
    UpdateActveStatusResponse,
    UpdateLocationResponse,
    UpdateSettingsResponse,
    ValidateAccountSignupResponse,
    ValidatePasswordResetResponse,
    ApiVersionAchievementTierSearchPostResponse,
    CreateAchievementResponse,
    CreateAchievementTierResponse,
    DeleteAchievementResponse,
    DeleteAchievementTierResponse,
    GetAchievementResponse,
    GetAchievementTierResponse,
    GetUserAchievementsResponse,
    ListAchievementTagsResponse,
    ListAchievementsResponse,
    SearchAchievementsResponse,
    UpdateAchievementResponse,
    UpdateAchievementTierResponse,
    UpdateUserAchievementResponse,
    CreateEntityReferenceResponse,
    AddAlbumCollectionResponse,
    AddAlbumUsersResponse,
    ApproveAlbumResponse,
    GetAlbumCollectionResponse,
    LeaveAlbumResponse,
    RemoveAlbumResponse,
    RemoveAlbumUsersResponse,
    SearchAlbumsResponse,
    UpdateAlbumCollectionResponse,
    ActivitiesResponse,
    AggregatedFilteredUsageResponse,
    FilteredUsageResponse,
    UsageResponse,
    UsageBatchResponse,
    GetAppDataResponse,
    PostAppDataResponse,
    RegenAppDataResponse,
    CreateApplicationResponse,
    CreateApplicationPlacementResponse,
    DeleteApplicationResponse,
    DeleteApplicationPlacementResponse,
    GetApplicationResponse,
    GetApplicationPlacementResponse,
    GetApplicationVersionsResponse,
    GetUniqueUsersByAppResponse,
    ListApplicationsResponse,
    SearchApplicationPlacementResponse,
    SearchApplicationSettingsResponse,
    SearchApplicationsResponse,
    UpdateApplicationResponse,
    UpdateApplicationActiveResponse,
    UpdateApplicationPlacementResponse,
    UploadApplicationCertificateResponse,
    CreateApplicationConfigResponse,
    DeleteApplicationConfigResponse,
    GetApplicationConfigResponse,
    GetApplicationConfigByConfigVersionResponse,
    SearchApplicationConfigResponse,
    UpdateApplicationConfigResponse,
    AssetMorphResponse,
    CreateAssetResponse,
    DeleteAssetResponse,
    GetAssetResponse,
    RemoveAssetResponse,
    SearchAssetsResponse,
    UpdateAssetResponse,
    AssetDownloadResponse,
    AssigmentAssigneeAccountSearchResponse,
    AssignmentCreateResponse,
    AssignmentDeleteResponse,
    AssignmentGetResponse,
    AssignmentSearchResponse,
    AssignmentStatusCreateResponse,
    AssignmentStatusDeleteResponse,
    AssignmentStatusGetResponse,
    AssignmentStatusSearchResponse,
    AssignmentStatusUpdateResponse,
    AssignmentUpdateResponse,
    CreateAudienceResponse,
    DeleteAudienceResponse,
    GetAgeGroupsResponse,
    GetAudienceResponse,
    GetAudienceListResponse,
    GetDevicesResponse,
    GetExperiencesResponse,
    GetGroupedAudiencesResponse,
    ListByAccountResponse,
    ListByAudienceResponse,
    ListLastestByAccountResponse,
    SendByAccountResponse,
    UpdateAudienceResponse,
    CreateBidResponse,
    DeleteBidResponse,
    GetBidResponse,
    UpdateBidResponse,
    CreateBillableEntityResponse,
    DeleteBillableEntityResponse,
    GetBillableEntityResponse,
    UpdateBillableEntityResponse,
    AddPaymentMethodResponse,
    CreatePaymentMethodResponse,
    CreateSmartContractResponse,
    GetCryptoBalanceResponse,
    GetPaymentMethodResponse,
    SearchPaymentMethodResponse,
    GetStatusCsvResponse,
    ListStatusCsvResponse,
    StatusCsvResponse,
    UploadCsvResponse,
    CreateCargoTypeResponse,
    SearchCargoTypesResponse,
    DeleteCargoTypeResponse,
    GetCargoTypeResponse,
    UpdateCargoTypeResponse,
    SearchCarriersResponse,
    CategoryDistanceSearchResponse,
    CreateCategoryResponse,
    DeleteCategoryResponse,
    DuplicateCategoryResponse,
    GetCategoryResponse,
    SearchCategoriesResponse,
    UpdateCategoryResponse,
    AddConnectionToGroupResponse,
    AddConnectionsToGroupResponse,
    AddSubGroupsResponse,
    CreateOrUpdateConnectionResponse,
    CreateOrUpdateGroupResponse,
    FollowAcceptResponse,
    FollowRejectResponse,
    FollowRemoveResponse,
    FollowRequestResponse,
    FriendAcceptResponse,
    FriendRejectResponse,
    FriendRemoveResponse,
    FriendRequestResponse,
    GetConnectionSentFriendRequestsResponse,
    GetConnectionsResponse,
    GetGroupDetailsResponse,
    GroupSearchResponse,
    RemoveConnectionFromGroupResponse,
    RemoveConnectionsFromGroupResponse,
    RemoveGroupResponse,
    RemoveSubGroupsResponse,
    SearchConnectionsResponse,
    AddOrUpdateAlbumContestResponse,
    ApproveAlbumContestResponse,
    DeleteContestResponse,
    GetAlbumContestResponse,
    GetAlbumContestsResponse,
    VoteOnAlbumContestResponse,
    AddPreviewResponse,
    AdsFindResponse,
    CreateCreativeResponse,
    DeleteCreativeResponse,
    GetCreativeResponse,
    GetCreativesByApplicationResponse,
    RemovePreviewResponse,
    UpdateCreativeResponse,
    CreateResponse,
    GetDependentsResponse,
    RemoveDependentResponse,
    CheckDisbursementsResponse,
    CreateDisbursementResponse,
    GetDisbursementResponse,
    SearchDisbursementsResponse,
    UpdateDisbursementResponse,
    AssignEmployeeResponse,
    AssignToLocationEmployeeResponse,
    CreateEmployeeResponse,
    DeleteEmployeeResponse,
    GetEmployeeResponse,
    SearchEmployeesResponse,
    UnassignEmployeeResponse,
    UpdateEmployeeResponse,
    AttendEventResponse,
    CreateEventResponse,
    DeleteEventResponse,
    GetEventResponse,
    SearchEventTransactionsResponse,
    SearchEventsResponse,
    UpdateEventResponse,
    GetTokenResponse,
    GraphInterfaceResponse,
    AddFavoriteResponse,
    DeleteFavoriteResponse,
    GetFavoriteResponse,
    SearchFavoritesResponse,
    WhoHasFavoritedResponse,
    CreateFilterResponse,
    DeleteFilterResponse,
    GetFilterResponse,
    SearchFiltersResponse,
    UpdateFilterResponse,
    CreateFlagResponse,
    DeleteFlagResponse,
    GetFlagResponse,
    GetFlagThresholdResponse,
    UpdateFlagThresholdResponse,
    CreateGameResponse,
    DeleteGameResponse,
    GetGameResponse,
    SearchGamesResponse,
    UpdateGameResponse,
    CreateGameLevelResponse,
    DeleteGameLevelResponse,
    GetGameLevelResponse,
    GetGameLevelsByApplicationResponse,
    GetGameLevelsByBillableEntityResponse,
    GetQuestionsInLevelResponse,
    GetWordsInLevelResponse,
    UpdateGameLevelResponse,
    UpdateQuestionsInLevelResponse,
    UpdateWordsInLevelResponse,
    AcceptInviteResponse,
    AlbumContestInviteResponse,
    AlbumInviteResponse,
    EventInviteResponse,
    GameInviteResponse,
    GetInviteResponse,
    MissionInviteResponse,
    OfferInviteResponse,
    OfferLocationInviteResponse,
    RetailerLocationInviteResponse,
    CreateLeaderboardResponse,
    DeleteLeaderboardResponse,
    GetLeaderboardResponse,
    SearchLeaderboardsResponse,
    UpdateLeaderboardResponse,
    RegisterLikeResponse,
    RemoveLikeResponse,
    SearchLikesResponse,
    CreateListingResponse,
    DeleteListingResponse,
    GetListingResponse,
    SearchListingResponse,
    SummaryListingResponse,
    UpdateListingResponse,
    CacheTrilaterationDataResponse,
    CacheTrilaterationDataGzipResponse,
    GetLocationByIpResponse,
    GetLocationByTrilaterationResponse,
    GetLocationsResponse,
    CreateLocationV2Response,
    UpdateLocationV2Response,
    CreateMediaResponse,
    DeleteMediaResponse,
    GetMediaResponse,
    SearchMediaResponse,
    UpdateMediaResponse,
    CreateMissionResponse,
    DeleteMissionResponse,
    FindMissionsResponse,
    GetMissionResponse,
    ImportMissionResponse,
    SearchMissionFormatsResponse,
    SearchMissionsResponse,
    SearchMissionsByBillableEntityResponse,
    UpdateMissionResponse,
    CreateMissionInviteResponse,
    DeleteMissionInviteResponse,
    GetMissionInviteResponse,
    SearchMissionInvitesResponse,
    UpdateMissionInviteResponse,
    BatchOperationResponse,
    CreateNoteResponse,
    DeleteNoteResponse,
    GetNoteResponse,
    SearchNotesResponse,
    UpdateNoteResponse,
    CreateNotificationTemplateResponse,
    CreateOrUpdateBlockedNotificationsResponse,
    DeleteNotificationTemplateResponse,
    GetNotificationTemplateResponse,
    GetNotificationsResponse,
    RegisterNotificationTokenResponse,
    SearchBlockedNotificationsResponse,
    SearchNotificationTemplateResponse,
    SearchRecipientsResponse,
    SearchRecipientsCountResponse,
    SendBatchNotificationsResponse,
    SendCustomNotificationsResponse,
    UpdateNotificationTemplateResponse,
    AddFieldResponse,
    CreateObjectResponse,
    DeleteFieldResponse,
    DeleteObjectResponse,
    GetObjectResponse,
    SearchObjectResponse,
    CreateDataResponse,
    SearchDataResponse,
    DeleteDataResponse,
    GetDataResponse,
    UpdateDataResponse,
    BatchUpdateOfferLocationsResponse,
    CreateOfferResponse,
    DeleteOfferResponse,
    DeleteOfferLocationResponse,
    GetOfferResponse,
    GetOfferDetailsResponse,
    GetOfferListCountsResponse,
    GetOfferLocationResponse,
    GetOfferLocationsForRetailersResponse,
    GetOffersForRetailersResponse,
    RedeemOfferTransactionResponse,
    SearchOfferTransactionsForRetailersResponse,
    SearchOffersForConsumerResponse,
    TopOfferTransactionsResponse,
    UpdateOfferResponse,
    UpdateOfferStatusResponse,
    CreateOfferTransactionStatusResponse,
    DeleteOfferTransactionStatusResponse,
    GetOfferTransactionStatusResponse,
    SearchOfferTransactionStatusesResponse,
    UpdateOfferTransactionStatusResponse,
    ImageGenerationResponse,
    RequestOptimizationResponse,
    GetOptimizationResultResponse,
    AddMovieResponse,
    AiDocsResponse,
    AiFindImagesResponse,
    AiTagsResponse,
    AiTextResponse,
    BatchResponse,
    CreateInstantEpisodeResponse,
    CreateVoiceCanvasResponse,
    EmotionResponse,
    StartVideoRenderResponse,
    SttResponse,
    SummarizeTopicsResponse,
    TechTuneResponse,
    TtsResponse,
    GetAddMovieResultResponse,
    GetBatchResponse,
    GetEmotionResponse,
    GetEpisodeStatusResponse,
    GetRenderStatusResponse,
    GetSttResponse,
    GetTechTuneResponse,
    GetTopicsResponse,
    GetTtsResponse,
    GetVoiceCanvasResponse,
    CreatePackResponse,
    DeletePackResponse,
    GetPackResponse,
    SearchPacksResponse,
    UpdatePackResponse,
    ProcessAllParticipantsResponse,
    ProcessParticipantsResponse,
    ComputePathResponse,
    CreatePostalCodeResponse,
    DeletePostalCodeResponse,
    GetPostalCodeResponse,
    GetPostalCodesResponse,
    UpdatePostalCodeResponse,
    CreatePersonaResponse,
    DeletePersonaResponse,
    GetPersonaListResponse,
    SearchPersonaResponse,
    UpdatePersonaResponse,
    CreateProgramResponse,
    SearchProgramsResponse,
    DeleteProgramResponse,
    GetProgramResponse,
    PostProgramResponse,
    PutProgramResponse,
    CreatePurchaseItemResponse,
    DeletePurchaseItemResponse,
    GetPurchaseItemResponse,
    SearchPurchaseItemsResponse,
    UpdatePurchaseItemResponse,
    CreateOrderResponse,
    DeleteOrderResponse,
    GetOrderResponse,
    PreviewOrderResponse,
    SearchOrdersResponse,
    UpdateOrderResponse,
    CreateQuestionResponse,
    DeleteQuestionResponse,
    GetQuestionResponse,
    SearchQuestionsResponse,
    UpdateQuestionResponse,
    GetHistoricalRankingsResponse,
    GetRankingsResponse,
    GetUserRankResponse,
    OverrideUserRankResponse,
    UpdateRankingsResponse,
    CreateRatingResponse,
    DeleteRatingResponse,
    SearchLocationRatingIndexesResponse,
    SearchRatingIndexesResponse,
    SearchRatingsResponse,
    UpdateRatingResponse,
    CreateRegionResponse,
    DeleteRegionResponse,
    GetRegionResponse,
    SearchRegionsResponse,
    UpdateRegionResponse,
    CreateBatchResponse,
    CreateRegionLegSummaryBatchResponse,
    DeleteBatchResponse,
    GetReportBatchResponse,
    RunReportResponse,
    SearchBatchResponse,
    CreateReservationResponse,
    DeleteReservationResponse,
    ReservableAvailabilityResponse,
    SearchAvailabilityResponse,
    SearchReservationsResponse,
    SearchScheduleResponse,
    CreateRetailerResponse,
    DeleteRetailerResponse,
    GetRetailerResponse,
    GetRetailersResponse,
    RetailerLoginCheckResponse,
    UpdateRetailerResponse,
    CreateRetailerLocationConsumerResponse,
    CreateRetailerLocationsResponse,
    DeleteRetailerLocationResponse,
    GetRetailerLocationResponse,
    GetRetailerLocationConsumerResponse,
    IndexedRetailerLocationDistanceSearchResponse,
    IndexedRetailerLocationSearchResponse,
    SearchRetailerLocationsResponse,
    UpdateRetailerLocationsResponse,
    GetRetaokilerResponse,
    CreateRouteResponse,
    SearchRoutesResponse,
    ApproveRouteResponse,
    CopyRouteResponse,
    CreateRouteDirectionsResponse,
    CreateRoutePolylineResponse,
    DeleteRouteResponse,
    DisapproveRouteResponse,
    GetRouteResponse,
    GetRouteDirectionsResponse,
    GetRouteShipmentsResponse,
    GetRouteStopsResponse,
    OptimizeRouteResponse,
    ReorderRouteStopsPatchResponse,
    ReorderRouteStopsPostResponse,
    UpdateRouteResponse,
    GetRouteStopResponse,
    GetShipmentsAtStopResponse,
    RemoveStopResponse,
    SetDriverResponse,
    UpdateRouteStopResponse,
    CreateRouteSettingsResponse,
    SearchRouteSettingsResponse,
    DeleteRouteSettingsResponse,
    GetRouteSettingsResponse,
    UpdateRouteSettingsResponse,
    ComputeRoutingResponse,
    CreateScheduledNotificationResponse,
    DeleteScheduledNotificationResponse,
    GetScheduledNotificationResponse,
    ScheduleNotificationListingsResponse,
    SearchScheduledNotificationsResponse,
    UpdateScheduledNotificationResponse,
    CreateScoreResponse,
    GetScoreResponse,
    SearchScoresResponse,
    CreateSecureApplicationResponse,
    DeleteSecureApplicationResponse,
    LoginSecureResponse,
    PurchaseSecureResponse,
    ResetSecureResponse,
    UpdateSecureApplicationResponse,
    CreateServiceHubResponse,
    SearchServiceHubsResponse,
    DeleteServiceHubResponse,
    GetServiceHubResponse,
    PostServiceHubResponse,
    PutServiceHubResponse,
    CreateShipmentResponse,
    SearchShipmentsResponse,
    CancelShipmentResponse,
    DeleteShipmentResponse,
    GetShipmentResponse,
    UpdateShipmentResponse,
    UpdateShipmentStatusResponse,
    CreateShipmentBatchResponse,
    SearchShipmentBatchResponse,
    DeleteShipmentBatchResponse,
    GetShipmentBatchResponse,
    GetShipmentBatchStatusResponse,
    SimulationResponse,
    GetStopResponse,
    UpdateStopResponse,
    CreateStripeCheckoutSessionResponse,
    CreateSubscriptionResponse,
    DeleteSubscriptionResponse,
    GetSubscriptionResponse,
    GetSubscriptionPlanResponse,
    GetSubscriptionPlansResponse,
    GetSubscriptionUsageResponse,
    UpdateSubscriptionResponse,
    CreateTaskResponse,
    DeleteTaskResponse,
    GetTaskResponse,
    SearchTasksResponse,
    UpdateTaskResponse,
    CreateTerritoryResponse,
    DeleteTerritoryResponse,
    GetTerritoryResponse,
    SearchTerritoriesResponse,
    UpdateTerritoryResponse,
    AddOrUpdateThemeDescriptorResponse,
    GetThemeDescriptorResponse,
    GetThemeDescriptorsResponse,
    RemoveThemeDescriptorResponse,
    CreateCredentialResponse,
    CreateNetworkResponse,
    DeleteCredentialResponse,
    DeleteNetworkResponse,
    GetCredentialResponse,
    GetNetworkResponse,
    SearchCredentialsResponse,
    SearchNetworksResponse,
    SendMfaChallengeResponse,
    UpdateCredentialResponse,
    UpdateNetworkResponse,
    GetTicketCountResponse,
    GetTicketListResponse,
    GiftPurchaseResponse,
    SaveTicketResponse,
    SaveTicketViaFileUploadResponse,
    TicketOffersResponse,
    CreateTournamentResponse,
    DeleteTournamentResponse,
    GetTournamentResponse,
    SearchObjectsResponse,
    SearchRoundsResponse,
    SearchTournamentsResponse,
    SubmitTournamentScoreResponse,
    SubmitTournamentVoteResponse,
    SubstituteTournamentPlayerResponse,
    UpdateTournamentResponse,
    BatchSaveTrackingResponse,
    GetPredictedLocationsResponse,
    GetPredictedPathResponse,
    GetPreferredLocationsResponse,
    GetTrackingLegsResponse,
    SaveTrackingLegResponse,
    SaveTrackingStepResponse,
    SearchAccountsWithTrackingLegsResponse,
    SearchTrackingLegsResponse,
    CreateTriggerResponse,
    DeleteTriggerResponse,
    GetTriggerResponse,
    SearchTriggersResponse,
    UpdateTriggerResponse,
    CreateTripResponse,
    ProcessTripMatchesResponse,
    SearchResponse,
    SearchTripsResponse,
    UpdateTripNotificationsResponse,
    DeleteResponse,
    DriveTripResponse,
    FlexibleTripResponse,
    GetTripResponse,
    GetTripMatchesResponse,
    RideResponse,
    UpdateLocationsResponse,
    UpdateRecurrenceLocationsResponse,
    UpdateRecurrenceShipmentsResponse,
    UpdateShipmentsResponse,
    UpdateTripResponse,
    SmsBuyOfferResponse,
    AuthorizeTwitterResponse,
    LoginTwitterResponse,
    AddUsersToPermissionableResponse,
    ApprovePermissionableResponse,
    LeaveFromPermissionableResponse,
    RemoveUsersFromPermissionableResponse,
    SearchPermissionablesResponse,
    SearchPermissionablesFollowingDistanceResponse,
    CreateFollowingResponse,
    CreateSpaceResponse,
    CreateVatomEventResponse,
    DeleteFollowingResponse,
    DeletePointsBalanceResponse,
    DeleteSpaceResponse,
    DeleteVatomEventResponse,
    DeleteVatomNftResponse,
    ExecuteActionOnNftResponse,
    GeomapSearchResponse,
    GetBusinessBehaviorsResponse,
    GetBusinessCoinsBalanceResponse,
    GetBusinessIdsResponse,
    GetBusinessInfoResponse,
    GetBusinessUsersResponse,
    GetCampaignGroupEntitiesResponse,
    GetCampaignGroupRulesResponse,
    GetCampaignGroupStatsResponse,
    GetCampaignInfoResponse,
    GetEventGuestListResponse,
    GetInventoryResponse,
    GetMyFollowingResponse,
    GetPointsBalanceResponse,
    GetPointsBalanceAsBusinessResponse,
    GetSpaceResponse,
    GetUserCoinsAsBusinessResponse,
    GetUserCoinsBalanceResponse,
    GetUserFollowersResponse,
    GetUserFollowingResponse,
    GetUserInfoResponse,
    GetUserProfileResponse,
    GetVatomEventResponse,
    GetVatomNftResponse,
    ListCommunitiesResponse,
    ListEventsResponse,
    ListSpacesResponse,
    ListUserCoinTransactionsResponse,
    ListUserCoinTransactionsAsBusinessResponse,
    PerformActionOnNftResponse,
    RedeemNftResponse,
    RedeemUserCoinsAsBusinessResponse,
    SearchBusinessesResponse,
    SearchCampaignGroupsResponse,
    SearchIdentitiesResponse,
    SearchInventoryResponse,
    SendNftResponse,
    SetPointsBalanceAsBusinessResponse,
    TransferUserCoinsResponse,
    UpdateBusinessCoinsResponse,
    UpdateEventGuestListResponse,
    UpdateSpaceResponse,
    UpdateUserCoinsAsBusinessResponse,
    UpdateUserProfileResponse,
    UpdateVatomEventResponse,
    CreateVehicleResponse,
    SearchVehicleResponse,
    DeleteVehicleResponse,
    GetVehicleResponse,
    UpdateVehicleResponse,
    CreateVehicleTypeResponse,
    SearchVehicleTypesResponse,
    DeleteVehicleTypeResponse,
    GetVehicleTypeResponse,
    UpdateVehicleTypeResponse,
    CreateOfferTransactionResponse,
    DeleteOfferTransactionResponse,
    GetOfferTransactionResponse,
    PreviewOfferTransactionResponse,
    SearchOfferTransactionsResponse,
    UpdateOfferTransactionResponse,
    SearchWeatherResponse,
    CreateWordResponse,
    DeleteWordResponse,
    GetWordResponse,
    GetWordsResponse,
    UpdateWordResponse,
    RunWorkflowResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Create Consumer
    async fn consumer_create(
        &self,
        version: f64,
        app_key: String,
        name: String,
        hostname: String,
        username: String,
        password: String,
        data_mapping: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        port: Option<i32>,
        virtual_host: Option<String>,
        exchanger: Option<String>,
        exchanger_type: Option<String>,
        workers: Option<i32>,
        use_ssl: Option<bool>,
        context: &C) -> Result<ConsumerCreateResponse, ApiError>
    {
        info!("consumer_create({}, \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, name, hostname, username, password, data_mapping, device_id, account_id, port, virtual_host, exchanger, exchanger_type, workers, use_ssl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Consumer
    async fn consumer_update(
        &self,
        version: f64,
        app_key: String,
        queue_id: i64,
        data_mapping: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        use_ssl: Option<bool>,
        context: &C) -> Result<ConsumerUpdateResponse, ApiError>
    {
        info!("consumer_update({}, \"{}\", {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, queue_id, data_mapping, device_id, account_id, use_ssl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Queue
    async fn queue_create(
        &self,
        version: f64,
        app_key: String,
        name: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        workers: Option<i32>,
        analytic_tags: Option<String>,
        hostname: Option<String>,
        port: Option<i32>,
        username: Option<String>,
        password: Option<String>,
        virtual_host: Option<String>,
        use_ssl: Option<bool>,
        context: &C) -> Result<QueueCreateResponse, ApiError>
    {
        info!("queue_create({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, name, device_id, account_id, workers, analytic_tags, hostname, port, username, password, virtual_host, use_ssl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Queue
    async fn queue_delete(
        &self,
        version: f64,
        queue_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<QueueDeleteResponse, ApiError>
    {
        info!("queue_delete({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, queue_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Queue
    async fn queue_get(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        queue_id: Option<i64>,
        app_key: Option<String>,
        name: Option<String>,
        hostname: Option<String>,
        virtual_host: Option<String>,
        context: &C) -> Result<QueueGetResponse, ApiError>
    {
        info!("queue_get({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, queue_id, app_key, name, hostname, virtual_host, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Publish Queue
    async fn queue_publish(
        &self,
        version: f64,
        message: String,
        queue_id: Option<i64>,
        app_key: Option<String>,
        name: Option<String>,
        hostname: Option<String>,
        virtual_host: Option<String>,
        context: &C) -> Result<QueuePublishResponse, ApiError>
    {
        info!("queue_publish({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, message, queue_id, app_key, name, hostname, virtual_host, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Queue
    async fn queue_search(
        &self,
        version: f64,
        queue_id: Option<i64>,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<QueueSearchResponse, ApiError>
    {
        info!("queue_search({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, queue_id, device_id, account_id, name, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Queue
    async fn queue_update(
        &self,
        version: f64,
        queue_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        workers: Option<i32>,
        analytic_tags: Option<String>,
        hostname: Option<String>,
        port: Option<i32>,
        username: Option<String>,
        password: Option<String>,
        virtual_host: Option<String>,
        use_ssl: Option<bool>,
        context: &C) -> Result<QueueUpdateResponse, ApiError>
    {
        info!("queue_update({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, queue_id, device_id, account_id, app_key, workers, analytic_tags, hostname, port, username, password, virtual_host, use_ssl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Accounts by Location
    async fn account_location_search(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        postal_code: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        app_key: Option<String>,
        range: Option<f64>,
        location_last_updated: Option<i64>,
        gender: Option<String>,
        min_age: Option<i32>,
        max_age: Option<i32>,
        companionship_index: Option<i32>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        search_mode: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        roles: Option<String>,
        tags: Option<String>,
        experience: Option<String>,
        category_ids: Option<String>,
        audience_ids: Option<String>,
        audience_operator: Option<String>,
        update_current_location: Option<bool>,
        update_preferred_settings: Option<bool>,
        show_exact_locations: Option<bool>,
        show_connection_to_searcher: Option<bool>,
        flag_count_minimum: Option<i64>,
        verified_user_only: Option<bool>,
        content_admin_only: Option<bool>,
        context: &C) -> Result<AccountLocationSearchResponse, ApiError>
    {
        info!("account_location_search({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, q, keyword, postal_code, latitude, longitude, app_key, range, location_last_updated, gender, min_age, max_age, companionship_index, _i, start, _l, limit, search_mode, sort_field, descending, roles, tags, experience, category_ids, audience_ids, audience_operator, update_current_location, update_preferred_settings, show_exact_locations, show_connection_to_searcher, flag_count_minimum, verified_user_only, content_admin_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Block Account
    async fn block_account(
        &self,
        version: f64,
        account_id_being_blocked: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        block_flag_value: Option<bool>,
        remove_from_groups_if_blocked: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<BlockAccountResponse, ApiError>
    {
        info!("block_account({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id_being_blocked, device_id, account_id, block_flag_value, remove_from_groups_if_blocked, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Account
    async fn create_account(
        &self,
        version: f64,
        username: String,
        password: String,
        name: Option<String>,
        prefix_name: Option<String>,
        first_name: Option<String>,
        middle_name: Option<String>,
        last_name: Option<String>,
        suffix_name: Option<String>,
        title: Option<String>,
        device_id: Option<String>,
        device_id_type: Option<String>,
        email_address: Option<String>,
        asset_id: Option<i64>,
        street_address: Option<String>,
        zipcode: Option<String>,
        gender: Option<String>,
        birthday: Option<i64>,
        home_phone: Option<String>,
        cell_phone: Option<String>,
        cell_phone_carrier: Option<String>,
        business_phone: Option<String>,
        role: Option<String>,
        platforms: Option<String>,
        tags: Option<String>,
        about_us: Option<String>,
        game_experience: Option<String>,
        category_ids: Option<String>,
        hometown: Option<String>,
        height: Option<String>,
        height_index: Option<i32>,
        ethnicity: Option<String>,
        body_type: Option<String>,
        marital_status: Option<String>,
        children: Option<String>,
        religion: Option<String>,
        education: Option<String>,
        education_index: Option<i32>,
        smoke: Option<String>,
        drink: Option<String>,
        companionship: Option<String>,
        companionship_index: Option<i32>,
        preferred_min_age: Option<i32>,
        preferred_max_age: Option<i32>,
        preferred_min_height: Option<i32>,
        preferred_max_height: Option<i32>,
        preferred_gender: Option<String>,
        preferred_education: Option<String>,
        preferred_education_index: Option<i32>,
        preferred_body_type: Option<String>,
        preferred_ethnicity: Option<String>,
        preferred_location: Option<String>,
        preferred_location_range: Option<f64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        accepted_terms: Option<bool>,
        invite_token: Option<String>,
        referral_account_id: Option<i64>,
        send_validation: Option<bool>,
        game_type: Option<String>,
        app_key: Option<String>,
        app_version: Option<String>,
        response_type: Option<String>,
        audience_ids_to_add: Option<String>,
        app_blob: Option<String>,
        app_enable_push: Option<bool>,
        app_enable_sms: Option<bool>,
        app_enable_email: Option<bool>,
        location_visibility: Option<String>,
        home_latitude: Option<f64>,
        home_longitude: Option<f64>,
        app_nickname: Option<String>,
        personal_audience_id: Option<i64>,
        context: &C) -> Result<CreateAccountResponse, ApiError>
    {
        info!("create_account({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, username, password, name, prefix_name, first_name, middle_name, last_name, suffix_name, title, device_id, device_id_type, email_address, asset_id, street_address, zipcode, gender, birthday, home_phone, cell_phone, cell_phone_carrier, business_phone, role, platforms, tags, about_us, game_experience, category_ids, hometown, height, height_index, ethnicity, body_type, marital_status, children, religion, education, education_index, smoke, drink, companionship, companionship_index, preferred_min_age, preferred_max_age, preferred_min_height, preferred_max_height, preferred_gender, preferred_education, preferred_education_index, preferred_body_type, preferred_ethnicity, preferred_location, preferred_location_range, latitude, longitude, accepted_terms, invite_token, referral_account_id, send_validation, game_type, app_key, app_version, response_type, audience_ids_to_add, app_blob, app_enable_push, app_enable_sms, app_enable_email, location_visibility, home_latitude, home_longitude, app_nickname, personal_audience_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Account
    async fn edit_account(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        role: Option<String>,
        asset_id: Option<i64>,
        name: Option<String>,
        prefix_name: Option<String>,
        first_name: Option<String>,
        middle_name: Option<String>,
        last_name: Option<String>,
        suffix_name: Option<String>,
        title: Option<String>,
        gender: Option<String>,
        age: Option<i32>,
        birthday: Option<i64>,
        home_phone: Option<String>,
        cell_phone: Option<String>,
        cell_phone_carrier: Option<String>,
        business_phone: Option<String>,
        email_address: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        zipcode: Option<String>,
        country: Option<String>,
        make_profile_info_public: Option<bool>,
        make_game_info_public: Option<bool>,
        make_friends_info_public: Option<bool>,
        hometown: Option<String>,
        height: Option<String>,
        height_index: Option<i32>,
        ethnicity: Option<String>,
        body_type: Option<String>,
        marital_status: Option<String>,
        children: Option<String>,
        religion: Option<String>,
        education: Option<String>,
        education_index: Option<i32>,
        smoke: Option<String>,
        drink: Option<String>,
        companionship: Option<String>,
        companionship_index: Option<i32>,
        preferred_min_age: Option<i32>,
        preferred_max_age: Option<i32>,
        preferred_min_height: Option<i32>,
        preferred_max_height: Option<i32>,
        preferred_gender: Option<String>,
        preferred_education: Option<String>,
        preferred_education_index: Option<i32>,
        preferred_body_type: Option<String>,
        preferred_ethnicity: Option<String>,
        preferred_location: Option<String>,
        preferred_location_range: Option<f64>,
        platforms: Option<String>,
        tags: Option<String>,
        about_us: Option<String>,
        match_token: Option<String>,
        game_experience: Option<String>,
        categories: Option<String>,
        category_ids: Option<String>,
        response_filters: Option<String>,
        show_as_zipcode: Option<bool>,
        show_exact_location: Option<bool>,
        show_others_exact_location: Option<bool>,
        accepted_terms: Option<bool>,
        location_visibility: Option<String>,
        app_blob: Option<String>,
        app_enable_push: Option<bool>,
        app_enable_sms: Option<bool>,
        app_enable_email: Option<bool>,
        game_type: Option<String>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_profile: Option<bool>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        referral_account_id: Option<i64>,
        app_nickname: Option<String>,
        personal_audience_id: Option<i64>,
        non_guest_username: Option<String>,
        context: &C) -> Result<EditAccountResponse, ApiError>
    {
        info!("edit_account({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, connection_account_id, role, asset_id, name, prefix_name, first_name, middle_name, last_name, suffix_name, title, gender, age, birthday, home_phone, cell_phone, cell_phone_carrier, business_phone, email_address, street_address, street_address2, city, state, zipcode, country, make_profile_info_public, make_game_info_public, make_friends_info_public, hometown, height, height_index, ethnicity, body_type, marital_status, children, religion, education, education_index, smoke, drink, companionship, companionship_index, preferred_min_age, preferred_max_age, preferred_min_height, preferred_max_height, preferred_gender, preferred_education, preferred_education_index, preferred_body_type, preferred_ethnicity, preferred_location, preferred_location_range, platforms, tags, about_us, match_token, game_experience, categories, category_ids, response_filters, show_as_zipcode, show_exact_location, show_others_exact_location, accepted_terms, location_visibility, app_blob, app_enable_push, app_enable_sms, app_enable_email, game_type, app_key, latitude, longitude, return_profile, audience_ids_to_add, audience_ids_to_remove, referral_account_id, app_nickname, personal_audience_id, non_guest_username, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Username and Email
    async fn edit_username(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        email_address: Option<String>,
        username: Option<String>,
        context: &C) -> Result<EditUsernameResponse, ApiError>
    {
        info!("edit_username({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, email_address, username, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Account
    async fn get_account(
        &self,
        version: f64,
        return_nulls: Option<bool>,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_email: Option<String>,
        connection_account_id: Option<i64>,
        response_filters: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        purchase_type: Option<String>,
        update_viewed_date: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetAccountResponse, ApiError>
    {
        info!("get_account({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, device_id, account_id, connection_account_email, connection_account_id, response_filters, game_type, app_key, purchase_type, update_viewed_date, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Profile Assets
    async fn get_profile_assets(
        &self,
        version: f64,
        return_nulls: Option<bool>,
        device_id: Option<String>,
        account_id: Option<i64>,
        owner_id: Option<i64>,
        media_types: Option<String>,
        mime_types: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetProfileAssetsResponse, ApiError>
    {
        info!("get_profile_assets({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, device_id, account_id, owner_id, media_types, mime_types, sort_field, descending, latitude, longitude, _i, start, _l, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Accounts
    async fn get_referral_list(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        retrieve_type: Option<String>,
        level_limit: Option<f64>,
        ancestor_level_limit: Option<f64>,
        children_level_limit: Option<f64>,
        ancestor_list_start: Option<f64>,
        ancestor_list_limit: Option<f64>,
        children_list_start: Option<f64>,
        children_list_limit: Option<f64>,
        children_children: Option<bool>,
        context: &C) -> Result<GetReferralListResponse, ApiError>
    {
        info!("get_referral_list({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, retrieve_type, level_limit, ancestor_level_limit, children_level_limit, ancestor_list_start, ancestor_list_limit, children_list_start, children_list_limit, children_children, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Account Settings
    async fn get_settings(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetSettingsResponse, ApiError>
    {
        info!("get_settings({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login as Account
    async fn login_delegate(
        &self,
        version: f64,
        access_token: String,
        app_key: String,
        device_id: Option<String>,
        access_token_secret: Option<String>,
        delegated_account_id: Option<i64>,
        delegated_username: Option<String>,
        network_uid: Option<String>,
        age_restriction: Option<i32>,
        response_filters: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<LoginDelegateResponse, ApiError>
    {
        info!("login_delegate({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, access_token, app_key, device_id, access_token_secret, delegated_account_id, delegated_username, network_uid, age_restriction, response_filters, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Account
    async fn login_general(
        &self,
        version: f64,
        access_token: String,
        network_uid: String,
        app_key: String,
        device_id: Option<String>,
        device_id_type: Option<String>,
        access_token_secret: Option<String>,
        age_restriction: Option<i32>,
        response_filters: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        email_match: Option<bool>,
        chosen_account_id: Option<i64>,
        third_party_credential_id: Option<i64>,
        context: &C) -> Result<LoginGeneralResponse, ApiError>
    {
        info!("login_general({}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, access_token, network_uid, app_key, device_id, device_id_type, access_token_secret, age_restriction, response_filters, latitude, longitude, email_match, chosen_account_id, third_party_credential_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Account (Username)
    async fn login_username(
        &self,
        version: f64,
        username: String,
        password: String,
        device_id: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        app: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        return_profile: Option<bool>,
        response_filters: Option<String>,
        context: &C) -> Result<LoginUsernameResponse, ApiError>
    {
        info!("login_username({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, username, password, device_id, latitude, longitude, app, game_type, app_key, return_profile, response_filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Logout Account
    async fn logout(
        &self,
        version: f64,
        device_id: Option<String>,
        device_id_type: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<LogoutResponse, ApiError>
    {
        info!("logout({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, device_id_type, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Merge Account
    async fn merge_account(
        &self,
        version: f64,
        merge_account_id: i64,
        app_key: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<MergeAccountResponse, ApiError>
    {
        info!("merge_account({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, merge_account_id, app_key, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Password
    async fn password_change(
        &self,
        version: f64,
        account_id: i64,
        old_password: String,
        new_password: String,
        confirm_password: String,
        context: &C) -> Result<PasswordChangeResponse, ApiError>
    {
        info!("password_change({}, {}, \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, old_password, new_password, confirm_password, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Reset Password
    async fn password_reset(
        &self,
        version: f64,
        token: String,
        password: String,
        confirm: String,
        context: &C) -> Result<PasswordResetResponse, ApiError>
    {
        info!("password_reset({}, \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, token, password, confirm, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Request Password Reset
    async fn request_password_reset(
        &self,
        version: f64,
        email: String,
        from: Option<String>,
        domain: Option<String>,
        sub_url: Option<String>,
        referer: Option<String>,
        context: &C) -> Result<RequestPasswordResetResponse, ApiError>
    {
        info!("request_password_reset({}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, email, from, domain, sub_url, referer, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Validation Request
    async fn request_validate_account(
        &self,
        version: f64,
        account_id: i64,
        context: &C) -> Result<RequestValidateAccountResponse, ApiError>
    {
        info!("request_validate_account({}, {}) - X-Span-ID: {:?}", version, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Accounts
    async fn search_accounts(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        keyword: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        radius: Option<f64>,
        gender: Option<models::SearchAccountsGenderParameter>,
        game_experience: Option<models::SearchAccountsGameExperienceParameter>,
        age: Option<i32>,
        category_ids: Option<String>,
        return_nulls: Option<bool>,
        response_filters: Option<String>,
        purchase_type: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchAccountsResponse, ApiError>
    {
        info!("search_accounts({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, keyword, latitude, longitude, radius, gender, game_experience, age, category_ids, return_nulls, response_filters, purchase_type, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Account (Encrypted Username)
    async fn secure_login(
        &self,
        version: f64,
        username: String,
        password: String,
        game_type: String,
        device_id: Option<String>,
        charset_name: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_profile: Option<bool>,
        response_filters: Option<String>,
        context: &C) -> Result<SecureLoginResponse, ApiError>
    {
        info!("secure_login({}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, username, password, game_type, device_id, charset_name, latitude, longitude, return_profile, response_filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Account (Encrypted Username)
    async fn secure_signup(
        &self,
        version: f64,
        device_id: String,
        username: String,
        password: String,
        name: Option<String>,
        invite_token: Option<String>,
        prefix_name: Option<String>,
        first_name: Option<String>,
        middle_name: Option<String>,
        last_name: Option<String>,
        suffix_name: Option<String>,
        title: Option<String>,
        device_id_type: Option<String>,
        email_address: Option<String>,
        asset_id: Option<i64>,
        address: Option<String>,
        zipcode: Option<String>,
        gender: Option<String>,
        birthday: Option<i64>,
        home_phone: Option<String>,
        cell_phone: Option<String>,
        cell_phone_carrier: Option<String>,
        business_phone: Option<String>,
        role: Option<String>,
        platforms: Option<String>,
        tags: Option<String>,
        about_us: Option<String>,
        game_experience: Option<String>,
        category_ids: Option<String>,
        hometown: Option<String>,
        height: Option<String>,
        height_index: Option<i32>,
        ethnicity: Option<String>,
        body_type: Option<String>,
        marital_status: Option<String>,
        children: Option<String>,
        religion: Option<String>,
        education: Option<String>,
        education_index: Option<i32>,
        smoke: Option<String>,
        drink: Option<String>,
        companionship: Option<String>,
        companionship_index: Option<i32>,
        preferred_min_age: Option<i32>,
        preferred_max_age: Option<i32>,
        preferred_min_height: Option<i32>,
        preferred_max_height: Option<i32>,
        preferred_gender: Option<String>,
        preferred_education: Option<String>,
        preferred_education_index: Option<i32>,
        preferred_body_type: Option<String>,
        preferred_ethnicity: Option<String>,
        preferred_location: Option<String>,
        preferred_location_range: Option<f64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        accepted_terms: Option<bool>,
        charset_name: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        app_version: Option<String>,
        response_type: Option<String>,
        context: &C) -> Result<SecureSignupResponse, ApiError>
    {
        info!("secure_signup({}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, username, password, name, invite_token, prefix_name, first_name, middle_name, last_name, suffix_name, title, device_id_type, email_address, asset_id, address, zipcode, gender, birthday, home_phone, cell_phone, cell_phone_carrier, business_phone, role, platforms, tags, about_us, game_experience, category_ids, hometown, height, height_index, ethnicity, body_type, marital_status, children, religion, education, education_index, smoke, drink, companionship, companionship_index, preferred_min_age, preferred_max_age, preferred_min_height, preferred_max_height, preferred_gender, preferred_education, preferred_education_index, preferred_body_type, preferred_ethnicity, preferred_location, preferred_location_range, latitude, longitude, accepted_terms, charset_name, game_type, app_key, app_version, response_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Save Match Token
    async fn set_match_token(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        match_token: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<SetMatchTokenResponse, ApiError>
    {
        info!("set_match_token({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, match_token, game_type, app_key, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Account Active Status
    async fn update_actve_status(
        &self,
        version: f64,
        account_id: i64,
        connection_account_id: i64,
        active: bool,
        device_id: Option<String>,
        app_key: Option<String>,
        context: &C) -> Result<UpdateActveStatusResponse, ApiError>
    {
        info!("update_actve_status({}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, connection_account_id, active, device_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Location
    async fn update_location(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        client_time: Option<i64>,
        context: &C) -> Result<UpdateLocationResponse, ApiError>
    {
        info!("update_location({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, client_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Account Settings
    async fn update_settings(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        blocked_notifications: Option<String>,
        suggestion_method: Option<String>,
        suggestion_count: Option<i32>,
        suggestion_time_frame: Option<i32>,
        show_others_exact_location: Option<bool>,
        show_as_zipcode: Option<bool>,
        show_exact_location: Option<bool>,
        favorite_visibility: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<UpdateSettingsResponse, ApiError>
    {
        info!("update_settings({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, blocked_notifications, suggestion_method, suggestion_count, suggestion_time_frame, show_others_exact_location, show_as_zipcode, show_exact_location, favorite_visibility, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Save Validation Status
    async fn validate_account_signup(
        &self,
        version: f64,
        token: String,
        context: &C) -> Result<ValidateAccountSignupResponse, ApiError>
    {
        info!("validate_account_signup({}, \"{}\") - X-Span-ID: {:?}", version, token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Validate Password Reset Token
    async fn validate_password_reset(
        &self,
        version: f64,
        token: String,
        context: &C) -> Result<ValidatePasswordResetResponse, ApiError>
    {
        info!("validate_password_reset({}, \"{}\") - X-Span-ID: {:?}", version, token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Searches an Achievement Tier
    async fn api_version_achievement_tier_search_post(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        keyword: Option<String>,
        achievement_type: Option<i64>,
        rank_type: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        descending_goal: Option<bool>,
        start: Option<i64>,
        limit: Option<i64>,
        context: &C) -> Result<ApiVersionAchievementTierSearchPostResponse, ApiError>
    {
        info!("api_version_achievement_tier_search_post({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, keyword, achievement_type, rank_type, sort_field, descending, descending_goal, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Achievement
    async fn create_achievement(
        &self,
        version: f64,
        app_key: String,
        title: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        analytics_tag: Option<String>,
        description: Option<String>,
        rank_type: Option<String>,
        rank_increment: Option<i32>,
        min_increment: Option<i32>,
        max_increment: Option<i32>,
        validate: Option<bool>,
        active: Option<bool>,
        trigger_definition: Option<String>,
        context: &C) -> Result<CreateAchievementResponse, ApiError>
    {
        info!("create_achievement({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, title, device_id, account_id, analytics_tag, description, rank_type, rank_increment, min_increment, max_increment, validate, active, trigger_definition, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Achievement Tier
    async fn create_achievement_tier(
        &self,
        version: f64,
        achievement_id: i64,
        score_all_instances: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        icon: Option<swagger::ByteArray>,
        icon_asset_id: Option<i64>,
        title: Option<String>,
        description: Option<String>,
        goal_count: Option<i64>,
        mission_id: Option<i64>,
        game_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        game_object_id: Option<i32>,
        context: &C) -> Result<CreateAchievementTierResponse, ApiError>
    {
        info!("create_achievement_tier({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, achievement_id, score_all_instances, device_id, account_id, icon, icon_asset_id, title, description, goal_count, mission_id, game_id, pack_id, game_level_id, game_object_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Achievement
    async fn delete_achievement(
        &self,
        version: f64,
        achievement_id: i64,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteAchievementResponse, ApiError>
    {
        info!("delete_achievement({}, {}, {:?}) - X-Span-ID: {:?}", version, achievement_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Achievement Tier
    async fn delete_achievement_tier(
        &self,
        version: f64,
        achievement_tier_id: i64,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteAchievementTierResponse, ApiError>
    {
        info!("delete_achievement_tier({}, {}, {:?}) - X-Span-ID: {:?}", version, achievement_tier_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Achievement
    async fn get_achievement(
        &self,
        version: f64,
        achievement_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        achievement_type: Option<String>,
        context: &C) -> Result<GetAchievementResponse, ApiError>
    {
        info!("get_achievement({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, achievement_id, device_id, account_id, achievement_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Gets an achievement tier
    async fn get_achievement_tier(
        &self,
        version: f64,
        account_id: i64,
        achievement_tier_id: i64,
        context: &C) -> Result<GetAchievementTierResponse, ApiError>
    {
        info!("get_achievement_tier({}, {}, {}) - X-Span-ID: {:?}", version, account_id, achievement_tier_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Achievement Progress
    async fn get_user_achievements(
        &self,
        version: f64,
        return_nulls: bool,
        app_key: String,
        include_undiscovered: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_email: Option<String>,
        connection_account_id: Option<i64>,
        rank_type: Option<String>,
        achievement_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetUserAchievementsResponse, ApiError>
    {
        info!("get_user_achievements({}, {}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, app_key, include_undiscovered, device_id, account_id, connection_account_email, connection_account_id, rank_type, achievement_type, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Achievement Tags
    async fn list_achievement_tags(
        &self,
        version: f64,
        app_key: Option<String>,
        context: &C) -> Result<ListAchievementTagsResponse, ApiError>
    {
        info!("list_achievement_tags({}, {:?}) - X-Span-ID: {:?}", version, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Achievements
    async fn list_achievements(
        &self,
        version: f64,
        sort_field: models::ListAchievementsSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        keyword: Option<String>,
        achievement_type: Option<String>,
        rank_type: Option<String>,
        context: &C) -> Result<ListAchievementsResponse, ApiError>
    {
        info!("list_achievements({}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, device_id, account_id, app_key, keyword, achievement_type, rank_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Achievements
    async fn search_achievements(
        &self,
        version: f64,
        app_key: String,
        sort_field: models::SearchAchievementsSortFieldParameter,
        descending: bool,
        include_tiers: bool,
        include_inactive_tiers: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        keyword: Option<String>,
        achievement_type: Option<String>,
        rank_type: Option<String>,
        context: &C) -> Result<SearchAchievementsResponse, ApiError>
    {
        info!("search_achievements({}, \"{}\", {:?}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, sort_field, descending, include_tiers, include_inactive_tiers, start, limit, device_id, account_id, keyword, achievement_type, rank_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Achievement
    async fn update_achievement(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        achievement_id: Option<i64>,
        analytics_tag: Option<String>,
        title: Option<String>,
        description: Option<String>,
        rank_type: Option<String>,
        rank_increment: Option<i32>,
        min_increment: Option<i32>,
        null_min_increment: Option<bool>,
        max_increment: Option<i32>,
        null_max_increment: Option<bool>,
        validate: Option<bool>,
        active: Option<bool>,
        trigger_definition: Option<String>,
        context: &C) -> Result<UpdateAchievementResponse, ApiError>
    {
        info!("update_achievement({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, achievement_id, analytics_tag, title, description, rank_type, rank_increment, min_increment, null_min_increment, max_increment, null_max_increment, validate, active, trigger_definition, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Achievement Tier
    async fn update_achievement_tier(
        &self,
        version: f64,
        achievement_tier_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        icon: Option<swagger::ByteArray>,
        icon_asset_id: Option<i64>,
        title: Option<String>,
        description: Option<String>,
        goal_count: Option<i64>,
        mission_id: Option<i64>,
        game_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        game_object_id: Option<i64>,
        score_all_instances: Option<bool>,
        context: &C) -> Result<UpdateAchievementTierResponse, ApiError>
    {
        info!("update_achievement_tier({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, achievement_tier_id, device_id, account_id, icon, icon_asset_id, title, description, goal_count, mission_id, game_id, pack_id, game_level_id, game_object_id, score_all_instances, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Achievement Progress
    async fn update_user_achievement(
        &self,
        version: f64,
        account_id: i64,
        achievement_id: Option<i64>,
        tag: Option<String>,
        custom_id: Option<i64>,
        increment: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        return_progress: Option<bool>,
        context: &C) -> Result<UpdateUserAchievementResponse, ApiError>
    {
        info!("update_user_achievement({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, achievement_id, tag, custom_id, increment, start_date, end_date, return_progress, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create an entity reference.
    async fn create_entity_reference(
        &self,
        version: f64,
        body: models::EntityReference,
        context: &C) -> Result<CreateEntityReferenceResponse, ApiError>
    {
        info!("create_entity_reference({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Album
    async fn add_album_collection(
        &self,
        version: f64,
        title: String,
        cover_asset_nullable: bool,
        include_cover_in_asset_list: bool,
        public_read: bool,
        public_write: bool,
        public_delete: bool,
        public_add: bool,
        anonymous: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        assets_to_add: Option<String>,
        media: Option<swagger::ByteArray>,
        media_url: Option<String>,
        asset_id: Option<i64>,
        attached_media: Option<swagger::ByteArray>,
        attached_media_url: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        tags: Option<String>,
        description: Option<String>,
        album_type: Option<String>,
        album_type_id: Option<i64>,
        sub_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        location_description: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        game_type: Option<String>,
        app_key: Option<String>,
        cell_phone: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        full_address: Option<String>,
        meta_data: Option<String>,
        category_ids: Option<String>,
        category_filter_ids: Option<String>,
        audience_ids: Option<String>,
        include_all_app_users_as_members: Option<bool>,
        include_audiences_as_members: Option<bool>,
        audience_operator: Option<String>,
        approval_status: Option<models::ApproveAlbumApprovalStatusParameter>,
        linked_object_type: Option<String>,
        linked_object_id: Option<i64>,
        context: &C) -> Result<AddAlbumCollectionResponse, ApiError>
    {
        info!("add_album_collection({}, \"{}\", {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, title, cover_asset_nullable, include_cover_in_asset_list, public_read, public_write, public_delete, public_add, anonymous, device_id, account_id, assets_to_add, media, media_url, asset_id, attached_media, attached_media_url, start_date, end_date, tags, description, album_type, album_type_id, sub_type, latitude, longitude, location_description, visibility, game_type, app_key, cell_phone, street_address, street_address2, city, state, postal_code, full_address, meta_data, category_ids, category_filter_ids, audience_ids, include_all_app_users_as_members, include_audiences_as_members, audience_operator, approval_status, linked_object_type, linked_object_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Album Users
    async fn add_album_users(
        &self,
        version: f64,
        album_id: i64,
        include_friend_group: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        read: Option<bool>,
        write: Option<bool>,
        delete: Option<bool>,
        add: Option<bool>,
        connections: Option<String>,
        connection_groups: Option<String>,
        context: &C) -> Result<AddAlbumUsersResponse, ApiError>
    {
        info!("add_album_users({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, include_friend_group, device_id, account_id, read, write, delete, add, connections, connection_groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Approve Album
    async fn approve_album(
        &self,
        version: f64,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        approval_status: Option<models::ApproveAlbumApprovalStatusParameter>,
        verified: Option<bool>,
        context: &C) -> Result<ApproveAlbumResponse, ApiError>
    {
        info!("approve_album({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, device_id, account_id, approval_status, verified, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    ///  Get Album
    async fn get_album_collection(
        &self,
        version: f64,
        return_nulls: bool,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        like_preview_size: Option<i32>,
        asset_preview_size: Option<i32>,
        note_preview_size: Option<i32>,
        connection_preview_size: Option<i32>,
        audience_preview_size: Option<i32>,
        context: &C) -> Result<GetAlbumCollectionResponse, ApiError>
    {
        info!("get_album_collection({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, album_id, device_id, account_id, like_preview_size, asset_preview_size, note_preview_size, connection_preview_size, audience_preview_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Leave Album
    async fn leave_album(
        &self,
        version: f64,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<LeaveAlbumResponse, ApiError>
    {
        info!("leave_album({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Album
    async fn remove_album(
        &self,
        version: f64,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<RemoveAlbumResponse, ApiError>
    {
        info!("remove_album({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Album Users
    async fn remove_album_users(
        &self,
        version: f64,
        album_id: i64,
        remove_friend_group: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        connections: Option<String>,
        connection_groups: Option<String>,
        context: &C) -> Result<RemoveAlbumUsersResponse, ApiError>
    {
        info!("remove_album_users({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, remove_friend_group, device_id, account_id, connections, connection_groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Albums
    async fn search_albums(
        &self,
        version: f64,
        filter: String,
        album_type_id: i64,
        sub_type: String,
        include_inactive: bool,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        range: f64,
        include_liked: bool,
        include_favorited: bool,
        include_permissions: bool,
        like_preview_size: i32,
        asset_preview_size: i32,
        note_preview_size: i32,
        connection_preview_size: i32,
        audience_preview_size: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        owner_id: Option<i64>,
        album_ids: Option<String>,
        exclude_album_ids: Option<String>,
        media_id: Option<i64>,
        keyword: Option<String>,
        album_type: Option<String>,
        limit_per_album_type: Option<i32>,
        date_created: Option<i64>,
        updated_since: Option<i64>,
        updated_before: Option<i64>,
        created_since: Option<i64>,
        created_before: Option<i64>,
        started_since: Option<i64>,
        started_before: Option<i64>,
        ended_since: Option<i64>,
        ended_before: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        app_key: Option<String>,
        category_ids: Option<String>,
        category_filter_ids: Option<String>,
        audience_ids: Option<String>,
        exclude_audience_ids: Option<String>,
        include_completable: Option<bool>,
        include_rating: Option<bool>,
        search_mode: Option<String>,
        stack_search: Option<bool>,
        stack_window_size: Option<i32>,
        min_stack_per_page: Option<i32>,
        stack_pagination_identifier: Option<String>,
        stack_details: Option<bool>,
        flag_count_minimum: Option<i64>,
        remove_flagged_content: Option<bool>,
        verified_filter: Option<bool>,
        linked_object_type: Option<String>,
        linked_object_id: Option<i64>,
        order_audience_id: Option<i64>,
        ignore_default_app_filter: Option<bool>,
        search_expression: Option<String>,
        generate_albums: Option<bool>,
        context: &C) -> Result<SearchAlbumsResponse, ApiError>
    {
        info!("search_albums({}, \"{}\", {}, \"{}\", {}, \"{}\", {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, filter, album_type_id, sub_type, include_inactive, sort_field, descending, start, limit, range, include_liked, include_favorited, include_permissions, like_preview_size, asset_preview_size, note_preview_size, connection_preview_size, audience_preview_size, device_id, account_id, connection_account_id, owner_id, album_ids, exclude_album_ids, media_id, keyword, album_type, limit_per_album_type, date_created, updated_since, updated_before, created_since, created_before, started_since, started_before, ended_since, ended_before, latitude, longitude, app_key, category_ids, category_filter_ids, audience_ids, exclude_audience_ids, include_completable, include_rating, search_mode, stack_search, stack_window_size, min_stack_per_page, stack_pagination_identifier, stack_details, flag_count_minimum, remove_flagged_content, verified_filter, linked_object_type, linked_object_id, order_audience_id, ignore_default_app_filter, search_expression, generate_albums, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Album
    async fn update_album_collection(
        &self,
        version: f64,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        assets_to_add: Option<String>,
        assets_to_remove: Option<String>,
        asset_id: Option<i64>,
        media: Option<swagger::ByteArray>,
        media_url: Option<String>,
        active: Option<bool>,
        title: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        tags: Option<String>,
        description: Option<String>,
        album_type: Option<String>,
        album_type_id: Option<i64>,
        sub_type: Option<String>,
        public_read: Option<bool>,
        public_write: Option<bool>,
        public_delete: Option<bool>,
        public_add: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        location_description: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        cell_phone: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        full_address: Option<String>,
        anonymous: Option<bool>,
        meta_data: Option<String>,
        category_ids: Option<String>,
        category_filter_ids: Option<String>,
        audience_ids: Option<String>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        include_all_app_users_as_members: Option<bool>,
        include_audiences_as_members: Option<bool>,
        audience_operator: Option<String>,
        linked_object_type: Option<String>,
        linked_object_id: Option<i64>,
        index_now: Option<bool>,
        context: &C) -> Result<UpdateAlbumCollectionResponse, ApiError>
    {
        info!("update_album_collection({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_id, device_id, account_id, assets_to_add, assets_to_remove, asset_id, media, media_url, active, title, start_date, end_date, tags, description, album_type, album_type_id, sub_type, public_read, public_write, public_delete, public_add, latitude, longitude, location_description, visibility, cell_phone, street_address, street_address2, city, state, postal_code, full_address, anonymous, meta_data, category_ids, category_filter_ids, audience_ids, audience_ids_to_add, audience_ids_to_remove, include_all_app_users_as_members, include_audiences_as_members, audience_operator, linked_object_type, linked_object_id, index_now, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get User Activity
    async fn activities(
        &self,
        version: f64,
        start: i32,
        limit: i32,
        account_id: i64,
        context: &C) -> Result<ActivitiesResponse, ApiError>
    {
        info!("activities({}, {}, {}, {}) - X-Span-ID: {:?}", version, start, limit, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Aggregated Filtered Usage
    async fn aggregated_filtered_usage(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        application_id: Option<i64>,
        app_key: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        device_type: Option<String>,
        device: Option<String>,
        device_os: Option<String>,
        gender: Option<String>,
        age_group: Option<String>,
        country: Option<String>,
        state: Option<String>,
        city: Option<String>,
        zip: Option<String>,
        model: Option<String>,
        tag: Option<String>,
        user_account_id: Option<i64>,
        user_account_display: Option<String>,
        user_account_username: Option<String>,
        group_by_root: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        group_by: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        distinct_count: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        sort_field: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        descending: Option<bool>,
        hide_unknown: Option<bool>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        _l: Option<i32>,
        limit: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AggregatedFilteredUsageResponse, ApiError>
    {
        info!("aggregated_filtered_usage({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, application_id, app_key, start_date, end_date, device_type, device, device_os, gender, age_group, country, state, city, zip, model, tag, user_account_id, user_account_display, user_account_username, group_by_root, group_by, distinct_count, sort_field, descending, hide_unknown, response_format, _l, limit, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Filtered Usage
    async fn filtered_usage(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        application_id: Option<i64>,
        app_key: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        device_type: Option<String>,
        device: Option<String>,
        device_os: Option<String>,
        gender: Option<String>,
        age_group: Option<String>,
        country: Option<String>,
        state: Option<String>,
        city: Option<String>,
        zip: Option<String>,
        model: Option<String>,
        tag: Option<String>,
        user_account_id: Option<i64>,
        user_account_display: Option<String>,
        user_account_username: Option<String>,
        custom_id: Option<i64>,
        custom_type: Option<String>,
        custom_value: Option<f64>,
        custom_value2: Option<f64>,
        custom_long: Option<i64>,
        custom_long2: Option<i64>,
        custom_message: Option<String>,
        custom_message2: Option<String>,
        group_by: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        distinct_count: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        sum_column: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        sort_field: Option<models::AggregatedFilteredUsageGroupByRootParameter>,
        descending: Option<bool>,
        hide_unknown: Option<bool>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        _l: Option<i32>,
        limit: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<FilteredUsageResponse, ApiError>
    {
        info!("filtered_usage({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, application_id, app_key, start_date, end_date, device_type, device, device_os, gender, age_group, country, state, city, zip, model, tag, user_account_id, user_account_display, user_account_username, custom_id, custom_type, custom_value, custom_value2, custom_long, custom_long2, custom_message, custom_message2, group_by, distinct_count, sum_column, sort_field, descending, hide_unknown, response_format, _l, limit, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Usage Record
    async fn usage(
        &self,
        version: f64,
        tag: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        application_id: Option<i64>,
        app_key: Option<String>,
        app_version: Option<String>,
        device: Option<String>,
        device_type: Option<String>,
        device_os: Option<String>,
        model: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        custom_id: Option<i64>,
        custom_type: Option<String>,
        achievement_increment: Option<i64>,
        city: Option<String>,
        state: Option<String>,
        country: Option<String>,
        zip: Option<String>,
        location_description: Option<String>,
        client_time: Option<i64>,
        error_message: Option<String>,
        ip: Option<String>,
        user_agent: Option<String>,
        background_event: Option<bool>,
        custom_message: Option<String>,
        custom_message2: Option<String>,
        custom_value: Option<f64>,
        custom_value2: Option<f64>,
        custom_long: Option<i64>,
        custom_long2: Option<i64>,
        context: &C) -> Result<UsageResponse, ApiError>
    {
        info!("usage({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, tag, device_id, account_id, application_id, app_key, app_version, device, device_type, device_os, model, latitude, longitude, custom_id, custom_type, achievement_increment, city, state, country, zip, location_description, client_time, error_message, ip, user_agent, background_event, custom_message, custom_message2, custom_value, custom_value2, custom_long, custom_long2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Multiple Usage Records
    async fn usage_batch(
        &self,
        version: f64,
        app_key: String,
        device: String,
        data: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_version: Option<String>,
        device_type: Option<String>,
        device_os: Option<String>,
        model: Option<String>,
        update_ranking: Option<bool>,
        return_summary_response: Option<bool>,
        context: &C) -> Result<UsageBatchResponse, ApiError>
    {
        info!("usage_batch({}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, device, data, device_id, account_id, app_version, device_type, device_os, model, update_ranking, return_summary_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get App Data
    async fn get_app_data(
        &self,
        version: f64,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        include_game_data: Option<bool>,
        q: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        _i: Option<i32>,
        _l: Option<i32>,
        game_object_count: Option<bool>,
        filter: Option<String>,
        date_created: Option<i64>,
        owner_id: Option<i64>,
        mission_ids: Option<String>,
        game_ids: Option<String>,
        pack_ids: Option<String>,
        game_level_ids: Option<String>,
        app_version: Option<String>,
        include_higher_version_packs: Option<bool>,
        include_higher_version_levels: Option<bool>,
        response_groups: Option<String>,
        purchase_type: Option<String>,
        context: &C) -> Result<GetAppDataResponse, ApiError>
    {
        info!("get_app_data({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, start, limit, device_id, account_id, game_type, include_game_data, q, keyword, sort_field, descending, _i, _l, game_object_count, filter, date_created, owner_id, mission_ids, game_ids, pack_ids, game_level_ids, app_version, include_higher_version_packs, include_higher_version_levels, response_groups, purchase_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create App Data
    async fn post_app_data(
        &self,
        version: f64,
        game_type: String,
        start: i32,
        limit: i32,
        data: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        include_game_data: Option<bool>,
        q: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        _i: Option<i32>,
        _l: Option<i32>,
        game_object_count: Option<bool>,
        filter: Option<String>,
        date_created: Option<i64>,
        owner_id: Option<i64>,
        mission_ids: Option<String>,
        game_ids: Option<String>,
        pack_ids: Option<String>,
        game_level_ids: Option<String>,
        app_version: Option<String>,
        include_higher_version_packs: Option<bool>,
        include_higher_version_levels: Option<bool>,
        response_groups: Option<String>,
        purchase_type: Option<String>,
        context: &C) -> Result<PostAppDataResponse, ApiError>
    {
        info!("post_app_data({}, \"{}\", {}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, game_type, start, limit, data, device_id, account_id, include_game_data, q, keyword, sort_field, descending, _i, _l, game_object_count, filter, date_created, owner_id, mission_ids, game_ids, pack_ids, game_level_ids, app_version, include_higher_version_packs, include_higher_version_levels, response_groups, purchase_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Regenerate App Data
    async fn regen_app_data(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        build_version: Option<String>,
        api_version: Option<String>,
        context: &C) -> Result<RegenAppDataResponse, ApiError>
    {
        info!("regen_app_data({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, build_version, api_version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Application
    async fn create_application(
        &self,
        version: f64,
        app_name: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        about: Option<String>,
        bundle_id: Option<String>,
        app_icon_asset_id: Option<i64>,
        app_logo_asset_id: Option<i64>,
        facebook_app_id: Option<String>,
        facebook_app_secret: Option<String>,
        google_api_key: Option<String>,
        update_eula_date: Option<bool>,
        eula_version: Option<String>,
        landing_page_url: Option<String>,
        show_in_activities: Option<bool>,
        activity_description: Option<String>,
        invite_welcome_text: Option<String>,
        invite_page_url: Option<String>,
        url_scheme: Option<String>,
        platforms: Option<String>,
        download_urls: Option<String>,
        category_ids: Option<String>,
        scoring_type: Option<models::CreateApplicationScoringTypeParameter>,
        hint_cost: Option<i32>,
        max_score: Option<i32>,
        tickets_per_point: Option<f32>,
        has_game_data: Option<bool>,
        public_notifications: Option<bool>,
        use_matching_algorithm: Option<bool>,
        global_tickets: Option<bool>,
        build_version: Option<f32>,
        api_version: Option<f32>,
        placement_name: Option<String>,
        placement_description: Option<String>,
        placement_size: Option<models::CreateApplicationPlacementSizeParameter>,
        placement_height: Option<i32>,
        placement_width: Option<i32>,
        placement_refresh_interval: Option<i32>,
        create_object_store: Option<bool>,
        public_content_approval: Option<bool>,
        production_mode: Option<bool>,
        minimum_session_length: Option<i32>,
        session_gap_length: Option<i32>,
        local_ads_enabled: Option<bool>,
        sqoot_api_key: Option<String>,
        trilat_processing_type: Option<models::CreateApplicationTrilatProcessingTypeParameter>,
        max_sample_size: Option<i32>,
        min_rssi: Option<f64>,
        modules: Option<String>,
        authorized_count: Option<i32>,
        authorized_servers: Option<String>,
        default_timezone: Option<String>,
        smtp_pass: Option<String>,
        meta_data: Option<String>,
        placement_meta_data: Option<String>,
        ips_floor: Option<bool>,
        enable_apns_badge: Option<bool>,
        include_in_report: Option<bool>,
        default_app_filter_id: Option<i64>,
        enable_welcome_email: Option<bool>,
        apple_app_id: Option<String>,
        apple_team_id: Option<String>,
        apple_auth_key_id: Option<String>,
        apple_auth_key: Option<swagger::ByteArray>,
        apple_issuer_id: Option<String>,
        app_store_key_id: Option<String>,
        app_store_key: Option<swagger::ByteArray>,
        google_private_key_file: Option<swagger::ByteArray>,
        authorize_net_api_key: Option<String>,
        authorize_net_transaction_key: Option<String>,
        email_sender: Option<String>,
        smtp_user: Option<String>,
        smtp_host: Option<String>,
        vatom_business_id: Option<String>,
        vatom_rest_client_id: Option<String>,
        vatom_rest_secret_key: Option<String>,
        twilio_account_sid: Option<String>,
        twilio_auth_token: Option<String>,
        twilio_sender_phone_number: Option<String>,
        open_ai_secret_key: Option<String>,
        context: &C) -> Result<CreateApplicationResponse, ApiError>
    {
        info!("create_application({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_name, device_id, account_id, about, bundle_id, app_icon_asset_id, app_logo_asset_id, facebook_app_id, facebook_app_secret, google_api_key, update_eula_date, eula_version, landing_page_url, show_in_activities, activity_description, invite_welcome_text, invite_page_url, url_scheme, platforms, download_urls, category_ids, scoring_type, hint_cost, max_score, tickets_per_point, has_game_data, public_notifications, use_matching_algorithm, global_tickets, build_version, api_version, placement_name, placement_description, placement_size, placement_height, placement_width, placement_refresh_interval, create_object_store, public_content_approval, production_mode, minimum_session_length, session_gap_length, local_ads_enabled, sqoot_api_key, trilat_processing_type, max_sample_size, min_rssi, modules, authorized_count, authorized_servers, default_timezone, smtp_pass, meta_data, placement_meta_data, ips_floor, enable_apns_badge, include_in_report, default_app_filter_id, enable_welcome_email, apple_app_id, apple_team_id, apple_auth_key_id, apple_auth_key, apple_issuer_id, app_store_key_id, app_store_key, google_private_key_file, authorize_net_api_key, authorize_net_transaction_key, email_sender, smtp_user, smtp_host, vatom_business_id, vatom_rest_client_id, vatom_rest_secret_key, twilio_account_sid, twilio_auth_token, twilio_sender_phone_number, open_ai_secret_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Ad Placement
    async fn create_application_placement(
        &self,
        version: f64,
        app_key: String,
        size: models::CreateApplicationPlacementSizeParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        height: Option<i32>,
        width: Option<i32>,
        refresh_interval: Option<i32>,
        default_image_id: Option<i64>,
        active: Option<bool>,
        context: &C) -> Result<CreateApplicationPlacementResponse, ApiError>
    {
        info!("create_application_placement({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, size, device_id, account_id, name, description, height, width, refresh_interval, default_image_id, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Application
    async fn delete_application(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        context: &C) -> Result<DeleteApplicationResponse, ApiError>
    {
        info!("delete_application({}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Ad Placement
    async fn delete_application_placement(
        &self,
        version: f64,
        placement_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteApplicationPlacementResponse, ApiError>
    {
        info!("delete_application_placement({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, placement_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Application
    async fn get_application(
        &self,
        version: f64,
        app_key: Option<String>,
        application_id: Option<i64>,
        context: &C) -> Result<GetApplicationResponse, ApiError>
    {
        info!("get_application({}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, application_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Ad Placement
    async fn get_application_placement(
        &self,
        version: f64,
        placement_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetApplicationPlacementResponse, ApiError>
    {
        info!("get_application_placement({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, placement_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get API versions
    async fn get_application_versions(
        &self,
        version: f64,
        context: &C) -> Result<GetApplicationVersionsResponse, ApiError>
    {
        info!("get_application_versions({}) - X-Span-ID: {:?}", version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Application Users
    async fn get_unique_users_by_app(
        &self,
        version: f64,
        app_key: String,
        q: Option<String>,
        keyword: Option<String>,
        since: Option<i64>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetUniqueUsersByAppResponse, ApiError>
    {
        info!("get_unique_users_by_app({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, q, keyword, since, _i, start, _l, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Applications
    async fn list_applications(
        &self,
        version: f64,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        platforms: Option<String>,
        device_ids: Option<String>,
        device_versions: Option<String>,
        category_ids: Option<String>,
        sort_field: Option<models::ListApplicationsSortFieldParameter>,
        has_ads: Option<bool>,
        public_notifications: Option<bool>,
        filter_billable: Option<bool>,
        filter_content_admin: Option<bool>,
        descending: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        application_ids: Option<String>,
        has_object_store: Option<bool>,
        active_only: Option<bool>,
        context: &C) -> Result<ListApplicationsResponse, ApiError>
    {
        info!("list_applications({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, q, keyword, platforms, device_ids, device_versions, category_ids, sort_field, has_ads, public_notifications, filter_billable, filter_content_admin, descending, _i, start, _l, limit, application_ids, has_object_store, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search for Ad Placements
    async fn search_application_placement(
        &self,
        version: f64,
        app_key: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchApplicationPlacementResponse, ApiError>
    {
        info!("search_application_placement({}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, device_id, account_id, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search for Application Settings
    async fn search_application_settings(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchApplicationSettingsResponse, ApiError>
    {
        info!("search_application_settings({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, connection_account_id, keyword, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Applications
    async fn search_applications(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        q: Option<String>,
        keyword: Option<String>,
        q_search_fields: Option<String>,
        sort_field: Option<models::SearchApplicationsSortFieldParameter>,
        descending: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        has_ads: Option<bool>,
        public_notifications: Option<bool>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchApplicationsResponse, ApiError>
    {
        info!("search_applications({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, q, keyword, q_search_fields, sort_field, descending, _i, start, _l, limit, has_ads, public_notifications, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Application
    async fn update_application(
        &self,
        version: f64,
        app_key: String,
        app_name: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        about: Option<String>,
        bundle_id: Option<String>,
        app_icon_asset_id: Option<i64>,
        app_logo_asset_id: Option<i64>,
        facebook_app_id: Option<String>,
        facebook_app_secret: Option<String>,
        google_api_key: Option<String>,
        update_eula_date: Option<bool>,
        eula_version: Option<String>,
        landing_page_url: Option<String>,
        show_in_activities: Option<bool>,
        activity_description: Option<String>,
        invite_welcome_text: Option<String>,
        invite_page_url: Option<String>,
        url_scheme: Option<String>,
        platforms: Option<String>,
        download_urls: Option<String>,
        category_ids: Option<String>,
        scoring_type: Option<models::CreateApplicationScoringTypeParameter>,
        hint_cost: Option<i32>,
        max_score: Option<i32>,
        tickets_per_point: Option<f32>,
        has_game_data: Option<bool>,
        public_notifications: Option<bool>,
        use_matching_algorithm: Option<bool>,
        global_tickets: Option<bool>,
        build_version: Option<f32>,
        api_version: Option<f32>,
        placement_name: Option<String>,
        placement_description: Option<String>,
        placement_size: Option<models::CreateApplicationPlacementSizeParameter>,
        placement_height: Option<i32>,
        placement_width: Option<i32>,
        placement_refresh_interval: Option<i32>,
        create_object_store: Option<bool>,
        public_content_approval: Option<bool>,
        production_mode: Option<bool>,
        minimum_session_length: Option<i32>,
        session_gap_length: Option<i32>,
        local_ads_enabled: Option<bool>,
        sqoot_api_key: Option<String>,
        trilat_processing_type: Option<models::CreateApplicationTrilatProcessingTypeParameter>,
        max_sample_size: Option<i32>,
        min_rssi: Option<f64>,
        modules: Option<String>,
        authorized_count: Option<i32>,
        authorized_servers: Option<String>,
        default_timezone: Option<String>,
        smtp_pass: Option<String>,
        meta_data: Option<String>,
        placement_meta_data: Option<String>,
        ips_floor: Option<bool>,
        enable_apns_badge: Option<bool>,
        include_in_report: Option<bool>,
        default_app_filter_id: Option<i64>,
        enable_welcome_email: Option<bool>,
        apple_app_id: Option<String>,
        apple_team_id: Option<String>,
        apple_auth_key_id: Option<String>,
        apple_auth_key: Option<swagger::ByteArray>,
        apple_issuer_id: Option<String>,
        app_store_key_id: Option<String>,
        app_store_key: Option<swagger::ByteArray>,
        google_private_key_file: Option<swagger::ByteArray>,
        authorize_net_api_key: Option<String>,
        authorize_net_transaction_key: Option<String>,
        email_sender: Option<String>,
        smtp_user: Option<String>,
        smtp_host: Option<String>,
        vatom_business_id: Option<String>,
        vatom_rest_client_id: Option<String>,
        vatom_rest_secret_key: Option<String>,
        twilio_account_sid: Option<String>,
        twilio_auth_token: Option<String>,
        twilio_sender_phone_number: Option<String>,
        open_ai_secret_key: Option<String>,
        context: &C) -> Result<UpdateApplicationResponse, ApiError>
    {
        info!("update_application({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, app_name, device_id, account_id, about, bundle_id, app_icon_asset_id, app_logo_asset_id, facebook_app_id, facebook_app_secret, google_api_key, update_eula_date, eula_version, landing_page_url, show_in_activities, activity_description, invite_welcome_text, invite_page_url, url_scheme, platforms, download_urls, category_ids, scoring_type, hint_cost, max_score, tickets_per_point, has_game_data, public_notifications, use_matching_algorithm, global_tickets, build_version, api_version, placement_name, placement_description, placement_size, placement_height, placement_width, placement_refresh_interval, create_object_store, public_content_approval, production_mode, minimum_session_length, session_gap_length, local_ads_enabled, sqoot_api_key, trilat_processing_type, max_sample_size, min_rssi, modules, authorized_count, authorized_servers, default_timezone, smtp_pass, meta_data, placement_meta_data, ips_floor, enable_apns_badge, include_in_report, default_app_filter_id, enable_welcome_email, apple_app_id, apple_team_id, apple_auth_key_id, apple_auth_key, apple_issuer_id, app_store_key_id, app_store_key, google_private_key_file, authorize_net_api_key, authorize_net_transaction_key, email_sender, smtp_user, smtp_host, vatom_business_id, vatom_rest_client_id, vatom_rest_secret_key, twilio_account_sid, twilio_auth_token, twilio_sender_phone_number, open_ai_secret_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Change Appliation Status
    async fn update_application_active(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        active: bool,
        context: &C) -> Result<UpdateApplicationActiveResponse, ApiError>
    {
        info!("update_application_active({}, {}, \"{}\", {}) - X-Span-ID: {:?}", version, account_id, app_key, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Ad Placement
    async fn update_application_placement(
        &self,
        version: f64,
        placement_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        size: Option<models::CreateApplicationPlacementSizeParameter>,
        height: Option<i32>,
        width: Option<i32>,
        refresh_interval: Option<i32>,
        default_image_id: Option<i64>,
        active: Option<bool>,
        context: &C) -> Result<UpdateApplicationPlacementResponse, ApiError>
    {
        info!("update_application_placement({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, placement_id, device_id, account_id, name, description, size, height, width, refresh_interval, default_image_id, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Application Certificate
    async fn upload_application_certificate(
        &self,
        version: f64,
        app_key: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        certificate: Option<swagger::ByteArray>,
        context: &C) -> Result<UploadApplicationCertificateResponse, ApiError>
    {
        info!("upload_application_certificate({}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, device_id, account_id, certificate, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create AppConfig
    async fn create_application_config(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        config_version: String,
        asset_id: i64,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        udid: Option<String>,
        context: &C) -> Result<CreateApplicationConfigResponse, ApiError>
    {
        info!("create_application_config({}, {}, \"{}\", \"{}\", {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, config_version, asset_id, retailer_id, retailer_location_id, udid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete AppConfig
    async fn delete_application_config(
        &self,
        version: f64,
        account_id: i64,
        config_id: i64,
        context: &C) -> Result<DeleteApplicationConfigResponse, ApiError>
    {
        info!("delete_application_config({}, {}, {}) - X-Span-ID: {:?}", version, account_id, config_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get AppConfig
    async fn get_application_config(
        &self,
        version: f64,
        account_id: i64,
        config_id: i64,
        context: &C) -> Result<GetApplicationConfigResponse, ApiError>
    {
        info!("get_application_config({}, {}, {}) - X-Span-ID: {:?}", version, account_id, config_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get AppConfig by Version
    async fn get_application_config_by_config_version(
        &self,
        version: f64,
        app_key: String,
        config_version: String,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        udid: Option<String>,
        allow_older_versions: Option<bool>,
        context: &C) -> Result<GetApplicationConfigByConfigVersionResponse, ApiError>
    {
        info!("get_application_config_by_config_version({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, config_version, retailer_id, retailer_location_id, udid, allow_older_versions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search AppConfigs
    async fn search_application_config(
        &self,
        version: f64,
        account_id: i64,
        app_key: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        udid: Option<String>,
        config_version: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchApplicationConfigResponse, ApiError>
    {
        info!("search_application_config({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, retailer_id, retailer_location_id, udid, config_version, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update AppConfig
    async fn update_application_config(
        &self,
        version: f64,
        account_id: i64,
        config_id: i64,
        app_key: Option<String>,
        config_version: Option<String>,
        asset_id: Option<i64>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        udid: Option<String>,
        context: &C) -> Result<UpdateApplicationConfigResponse, ApiError>
    {
        info!("update_application_config({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, config_id, app_key, config_version, asset_id, retailer_id, retailer_location_id, udid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Convert Offer to Creative
    async fn asset_morph(
        &self,
        version: f64,
        offer_id: i64,
        ad_size: models::CreateApplicationPlacementSizeParameter,
        creative_id: Option<i64>,
        width: Option<i32>,
        height: Option<i32>,
        background_size: Option<String>,
        template: Option<String>,
        context: &C) -> Result<AssetMorphResponse, ApiError>
    {
        info!("asset_morph({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_id, ad_size, creative_id, width, height, background_size, template, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Asset
    async fn create_asset(
        &self,
        version: f64,
        return_nulls: Option<bool>,
        device_id: Option<String>,
        account_id: Option<i64>,
        album_id: Option<i64>,
        collection_id: Option<i64>,
        add_to_default_album: Option<String>,
        add_to_media_library: Option<bool>,
        version_code: Option<i32>,
        version_name: Option<String>,
        meta_data: Option<String>,
        caption: Option<String>,
        asset_type: Option<String>,
        approval_status: Option<String>,
        assigned_account_id: Option<i64>,
        media: Option<swagger::ByteArray>,
        media_url: Option<String>,
        media_string: Option<String>,
        media_string_file_name: Option<String>,
        media_string_content_type: Option<String>,
        media_height: Option<i32>,
        media_width: Option<i32>,
        attached_media: Option<swagger::ByteArray>,
        attached_media_url: Option<String>,
        attached_media_string: Option<String>,
        attached_media_string_file_name: Option<String>,
        attached_media_string_content_type: Option<String>,
        attached_media_height: Option<i32>,
        attached_media_width: Option<i32>,
        location_description: Option<String>,
        app: Option<String>,
        app_key: Option<String>,
        search_tags: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreateAssetResponse, ApiError>
    {
        info!("create_asset({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, device_id, account_id, album_id, collection_id, add_to_default_album, add_to_media_library, version_code, version_name, meta_data, caption, asset_type, approval_status, assigned_account_id, media, media_url, media_string, media_string_file_name, media_string_content_type, media_height, media_width, attached_media, attached_media_url, attached_media_string, attached_media_string_file_name, attached_media_string_content_type, attached_media_height, attached_media_width, location_description, app, app_key, search_tags, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Asset
    async fn delete_asset(
        &self,
        version: f64,
        asset_id: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<DeleteAssetResponse, ApiError>
    {
        info!("delete_asset({}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, asset_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Asset
    async fn get_asset(
        &self,
        version: f64,
        asset_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        note_descending: Option<bool>,
        context: &C) -> Result<GetAssetResponse, ApiError>
    {
        info!("get_asset({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, asset_id, device_id, account_id, note_descending, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Asset from Collection
    async fn remove_asset(
        &self,
        version: f64,
        asset_id: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        album_id: Option<i64>,
        collection_id: Option<i64>,
        remove_from_default_albums: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveAssetResponse, ApiError>
    {
        info!("remove_asset({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, asset_id, device_id, account_id, album_id, collection_id, remove_from_default_albums, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Assets
    async fn search_assets(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        album_ids: Option<String>,
        asset_ids: Option<String>,
        app_key: Option<String>,
        media_type: Option<String>,
        mime_type: Option<String>,
        keyword: Option<String>,
        version_code: Option<i32>,
        version_name: Option<String>,
        updated_since: Option<i64>,
        updated_before: Option<i64>,
        sort_field: Option<String>,
        descending: Option<bool>,
        search_media_library: Option<bool>,
        filter_by_billable: Option<bool>,
        active_only: Option<bool>,
        return_app: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        search_mode: Option<String>,
        asset_type: Option<String>,
        approval_status: Option<String>,
        assigned_account_id: Option<i64>,
        context: &C) -> Result<SearchAssetsResponse, ApiError>
    {
        info!("search_assets({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, album_ids, asset_ids, app_key, media_type, mime_type, keyword, version_code, version_name, updated_since, updated_before, sort_field, descending, search_media_library, filter_by_billable, active_only, return_app, start, limit, search_mode, asset_type, approval_status, assigned_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Asset
    async fn update_asset(
        &self,
        version: f64,
        asset_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        album_id: Option<i64>,
        attached_asset_id: Option<i64>,
        version_code: Option<i32>,
        version_name: Option<String>,
        meta_data: Option<String>,
        caption: Option<String>,
        asset_type: Option<String>,
        approval_status: Option<String>,
        assigned_account_id: Option<i64>,
        media: Option<swagger::ByteArray>,
        media_url: Option<String>,
        media_string: Option<String>,
        media_string_file_name: Option<String>,
        media_string_content_type: Option<String>,
        media_height: Option<i32>,
        media_width: Option<i32>,
        attached_media: Option<swagger::ByteArray>,
        attached_media_url: Option<String>,
        attached_media_string: Option<String>,
        attached_media_string_file_name: Option<String>,
        attached_media_string_content_type: Option<String>,
        attached_media_height: Option<i32>,
        attached_media_width: Option<i32>,
        location_description: Option<String>,
        search_tags: Option<String>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<UpdateAssetResponse, ApiError>
    {
        info!("update_asset({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, asset_id, device_id, account_id, album_id, attached_asset_id, version_code, version_name, meta_data, caption, asset_type, approval_status, assigned_account_id, media, media_url, media_string, media_string_file_name, media_string_content_type, media_height, media_width, attached_media, attached_media_url, attached_media_string, attached_media_string_file_name, attached_media_string_content_type, attached_media_height, attached_media_width, location_description, search_tags, app_key, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Download Asset
    async fn asset_download(
        &self,
        version: f64,
        filename: String,
        context: &C) -> Result<AssetDownloadResponse, ApiError>
    {
        info!("asset_download({}, \"{}\") - X-Span-ID: {:?}", version, filename, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Assignment Assignees
    async fn assigment_assignee_account_search(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        context: &C) -> Result<AssigmentAssigneeAccountSearchResponse, ApiError>
    {
        info!("assigment_assignee_account_search({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Assignment
    async fn assignment_create(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        assignee_account_id: i64,
        description: Option<String>,
        retailer_location_id: Option<i64>,
        tags: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<AssignmentCreateResponse, ApiError>
    {
        info!("assignment_create({}, {}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, assignee_account_id, description, retailer_location_id, tags, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Assignment
    async fn assignment_delete(
        &self,
        version: f64,
        account_id: i64,
        assignment_id: i64,
        context: &C) -> Result<AssignmentDeleteResponse, ApiError>
    {
        info!("assignment_delete({}, {}, {}) - X-Span-ID: {:?}", version, account_id, assignment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Assignment
    async fn assignment_get(
        &self,
        version: f64,
        account_id: i64,
        assignment_id: i64,
        context: &C) -> Result<AssignmentGetResponse, ApiError>
    {
        info!("assignment_get({}, {}, {}) - X-Span-ID: {:?}", version, account_id, assignment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Assignments
    async fn assignment_search(
        &self,
        version: f64,
        account_id: i64,
        sort_field: models::AssignmentSearchSortFieldParameter,
        descending: bool,
        active_only: bool,
        start: i32,
        limit: i32,
        creator_account_id: Option<i64>,
        assignee_account_ids: Option<String>,
        retailer_location_ids: Option<String>,
        current_status_type: Option<models::AssignmentSearchCurrentStatusTypeParameter>,
        keyword: Option<String>,
        context: &C) -> Result<AssignmentSearchResponse, ApiError>
    {
        info!("assignment_search({}, {}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, active_only, start, limit, creator_account_id, assignee_account_ids, retailer_location_ids, current_status_type, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Assignment Status
    async fn assignment_status_create(
        &self,
        version: f64,
        account_id: i64,
        assignment_id: i64,
        scheduled_notification_id: Option<i64>,
        to_do: Option<models::AssignmentStatusCreateToDoParameter>,
        connection: Option<models::AssignmentStatusCreateConnectionParameter>,
        method: Option<models::AssignmentStatusCreateMethodParameter>,
        status: Option<models::AssignmentStatusCreateStatusParameter>,
        closure: Option<models::AssignmentStatusCreateClosureParameter>,
        message: Option<String>,
        follow_up: Option<i64>,
        active: Option<bool>,
        context: &C) -> Result<AssignmentStatusCreateResponse, ApiError>
    {
        info!("assignment_status_create({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, assignment_id, scheduled_notification_id, to_do, connection, method, status, closure, message, follow_up, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Deletes Assignment Status
    async fn assignment_status_delete(
        &self,
        version: f64,
        account_id: i64,
        assignment_status_id: i64,
        context: &C) -> Result<AssignmentStatusDeleteResponse, ApiError>
    {
        info!("assignment_status_delete({}, {}, {}) - X-Span-ID: {:?}", version, account_id, assignment_status_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Assignment Status
    async fn assignment_status_get(
        &self,
        version: f64,
        account_id: i64,
        assignment_status_id: i64,
        context: &C) -> Result<AssignmentStatusGetResponse, ApiError>
    {
        info!("assignment_status_get({}, {}, {}) - X-Span-ID: {:?}", version, account_id, assignment_status_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Assignment Statuses
    async fn assignment_status_search(
        &self,
        version: f64,
        account_id: i64,
        sort_field: models::AssignmentStatusSearchSortFieldParameter,
        descending: bool,
        active_only: bool,
        start: i32,
        limit: i32,
        assignment_id: Option<i64>,
        creator_account_id: Option<i64>,
        assignee_account_id: Option<i64>,
        retailer_location_id: Option<i64>,
        status_type: Option<models::AssignmentStatusCreateStatusParameter>,
        keyword: Option<String>,
        context: &C) -> Result<AssignmentStatusSearchResponse, ApiError>
    {
        info!("assignment_status_search({}, {}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, active_only, start, limit, assignment_id, creator_account_id, assignee_account_id, retailer_location_id, status_type, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Assignment Status
    async fn assignment_status_update(
        &self,
        version: f64,
        account_id: i64,
        assignment_status_id: i64,
        scheduled_notification_id: Option<i64>,
        to_do: Option<models::AssignmentStatusCreateToDoParameter>,
        connection: Option<models::AssignmentStatusCreateConnectionParameter>,
        method: Option<models::AssignmentStatusCreateMethodParameter>,
        status: Option<models::AssignmentStatusCreateStatusParameter>,
        closure: Option<models::AssignmentStatusCreateClosureParameter>,
        message: Option<String>,
        follow_up: Option<i64>,
        active: Option<bool>,
        context: &C) -> Result<AssignmentStatusUpdateResponse, ApiError>
    {
        info!("assignment_status_update({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, assignment_status_id, scheduled_notification_id, to_do, connection, method, status, closure, message, follow_up, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Assignment
    async fn assignment_update(
        &self,
        version: f64,
        account_id: i64,
        assignment_id: i64,
        name: Option<String>,
        description: Option<String>,
        assignee_account_id: Option<i64>,
        retailer_location_id: Option<i64>,
        tags: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<AssignmentUpdateResponse, ApiError>
    {
        info!("assignment_update({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, assignment_id, name, description, assignee_account_id, retailer_location_id, tags, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Audience
    async fn create_audience(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        description: Option<String>,
        search_tags: Option<String>,
        gender: Option<String>,
        age_groups: Option<String>,
        category_ids: Option<String>,
        application_ids: Option<String>,
        game_experience_level: Option<String>,
        devices: Option<String>,
        device_ids: Option<String>,
        device_versions: Option<String>,
        locations: Option<String>,
        radius: Option<String>,
        start_time_offset: Option<i32>,
        end_time_offset: Option<i32>,
        send_suggestion: Option<bool>,
        associate_description: Option<String>,
        associate_type: Option<String>,
        associate_id: Option<i64>,
        grouping_id: Option<String>,
        meta_data: Option<String>,
        visibility: Option<String>,
        audience_type: Option<String>,
        use_order: Option<bool>,
        cohort_regions_data: Option<String>,
        app_key: Option<String>,
        trilateration_types: Option<String>,
        unique_name: Option<bool>,
        context: &C) -> Result<CreateAudienceResponse, ApiError>
    {
        info!("create_audience({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, description, search_tags, gender, age_groups, category_ids, application_ids, game_experience_level, devices, device_ids, device_versions, locations, radius, start_time_offset, end_time_offset, send_suggestion, associate_description, associate_type, associate_id, grouping_id, meta_data, visibility, audience_type, use_order, cohort_regions_data, app_key, trilateration_types, unique_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Audience
    async fn delete_audience(
        &self,
        version: f64,
        account_id: i64,
        audience_id: i64,
        context: &C) -> Result<DeleteAudienceResponse, ApiError>
    {
        info!("delete_audience({}, {}, {}) - X-Span-ID: {:?}", version, account_id, audience_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Age Groups
    async fn get_age_groups(
        &self,
        version: f64,
        context: &C) -> Result<GetAgeGroupsResponse, ApiError>
    {
        info!("get_age_groups({}) - X-Span-ID: {:?}", version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Audience
    async fn get_audience(
        &self,
        version: f64,
        account_id: i64,
        audience_id: i64,
        app_key: Option<String>,
        return_account_count: Option<bool>,
        return_album_count: Option<bool>,
        album_types_for_count: Option<String>,
        context: &C) -> Result<GetAudienceResponse, ApiError>
    {
        info!("get_audience({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, audience_id, app_key, return_account_count, return_album_count, album_types_for_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Audiences
    async fn get_audience_list(
        &self,
        version: f64,
        account_id: Option<i64>,
        album_ids: Option<String>,
        keyword: Option<String>,
        keyword_fields: Option<String>,
        sort_field: Option<models::GetAudienceListSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        send_suggestion: Option<bool>,
        active_only: Option<bool>,
        group_by_grouping_id: Option<bool>,
        app_key: Option<String>,
        return_global: Option<bool>,
        exact_keyword: Option<bool>,
        audience_type: Option<String>,
        audience_types: Option<String>,
        return_account_count: Option<bool>,
        return_album_count: Option<bool>,
        album_types_for_count: Option<String>,
        context: &C) -> Result<GetAudienceListResponse, ApiError>
    {
        info!("get_audience_list({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, album_ids, keyword, keyword_fields, sort_field, descending, start, limit, send_suggestion, active_only, group_by_grouping_id, app_key, return_global, exact_keyword, audience_type, audience_types, return_account_count, return_album_count, album_types_for_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Devices
    async fn get_devices(
        &self,
        version: f64,
        include_inactive: bool,
        context: &C) -> Result<GetDevicesResponse, ApiError>
    {
        info!("get_devices({}, {}) - X-Span-ID: {:?}", version, include_inactive, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Experiences
    async fn get_experiences(
        &self,
        version: f64,
        context: &C) -> Result<GetExperiencesResponse, ApiError>
    {
        info!("get_experiences({}) - X-Span-ID: {:?}", version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get GroupedAudiences
    async fn get_grouped_audiences(
        &self,
        version: f64,
        account_id: i64,
        audience_grouping_id: String,
        context: &C) -> Result<GetGroupedAudiencesResponse, ApiError>
    {
        info!("get_grouped_audiences({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, audience_grouping_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Suggestions by Audience
    async fn list_by_account(
        &self,
        version: f64,
        account_id: i64,
        limit: i32,
        suggestion_type: String,
        context: &C) -> Result<ListByAccountResponse, ApiError>
    {
        info!("list_by_account({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, limit, suggestion_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Offers by Audience
    async fn list_by_audience(
        &self,
        version: f64,
        limit: i32,
        gender: Option<String>,
        age: Option<i32>,
        category_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<ListByAudienceResponse, ApiError>
    {
        info!("list_by_audience({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, limit, gender, age, category_ids, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Sent Suggestions 
    async fn list_lastest_by_account(
        &self,
        version: f64,
        account_id: i64,
        timeframe: i32,
        suggestion_type: String,
        context: &C) -> Result<ListLastestByAccountResponse, ApiError>
    {
        info!("list_lastest_by_account({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, timeframe, suggestion_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Suggestions
    async fn send_by_account(
        &self,
        version: f64,
        account_id: i64,
        latitude: f64,
        longitude: f64,
        context: &C) -> Result<SendByAccountResponse, ApiError>
    {
        info!("send_by_account({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Audience
    async fn update_audience(
        &self,
        version: f64,
        account_id: i64,
        audience_id: i64,
        name: Option<String>,
        description: Option<String>,
        search_tags: Option<String>,
        gender: Option<String>,
        age_groups: Option<String>,
        category_ids: Option<String>,
        application_ids: Option<String>,
        game_experience_level: Option<String>,
        devices: Option<String>,
        device_ids: Option<String>,
        device_versions: Option<String>,
        locations: Option<String>,
        radius: Option<String>,
        active: Option<bool>,
        send_suggestion: Option<bool>,
        start_time_offset: Option<i32>,
        end_time_offset: Option<i32>,
        associate_description: Option<String>,
        associate_type: Option<String>,
        associate_id: Option<i64>,
        grouping_id: Option<String>,
        meta_data: Option<String>,
        visibility: Option<String>,
        audience_type: Option<String>,
        use_order: Option<bool>,
        cohort_regions_data: Option<String>,
        app_key: Option<String>,
        trilateration_types: Option<String>,
        unique_name: Option<bool>,
        context: &C) -> Result<UpdateAudienceResponse, ApiError>
    {
        info!("update_audience({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, audience_id, name, description, search_tags, gender, age_groups, category_ids, application_ids, game_experience_level, devices, device_ids, device_versions, locations, radius, active, send_suggestion, start_time_offset, end_time_offset, associate_description, associate_type, associate_id, grouping_id, meta_data, visibility, audience_type, use_order, cohort_regions_data, app_key, trilateration_types, unique_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Bid
    async fn create_bid(
        &self,
        version: f64,
        biddable_type: String,
        biddable_id: i64,
        amount_per_view: f64,
        amount_per_action: f64,
        budget_amount: f64,
        budget_schedule: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<CreateBidResponse, ApiError>
    {
        info!("create_bid({}, \"{}\", {}, {}, {}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, biddable_type, biddable_id, amount_per_view, amount_per_action, budget_amount, budget_schedule, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Bid
    async fn delete_bid(
        &self,
        version: f64,
        bid_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteBidResponse, ApiError>
    {
        info!("delete_bid({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, bid_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Bid
    async fn get_bid(
        &self,
        version: f64,
        bid_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetBidResponse, ApiError>
    {
        info!("get_bid({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, bid_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Bid
    async fn update_bid(
        &self,
        version: f64,
        bid_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        amount_per_view: Option<f64>,
        amount_per_action: Option<f64>,
        budget_amount: Option<f64>,
        budget_schedule: Option<String>,
        context: &C) -> Result<UpdateBidResponse, ApiError>
    {
        info!("update_bid({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, bid_id, device_id, account_id, amount_per_view, amount_per_action, budget_amount, budget_schedule, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Billable
    async fn create_billable_entity(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        authorize_net_api_key: Option<String>,
        authorize_net_transaction_key: Option<String>,
        context: &C) -> Result<CreateBillableEntityResponse, ApiError>
    {
        info!("create_billable_entity({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, name, street_address, street_address2, city, state, postal_code, business_phone, business_phone_ext, authorize_net_api_key, authorize_net_transaction_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Billable
    async fn delete_billable_entity(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteBillableEntityResponse, ApiError>
    {
        info!("delete_billable_entity({}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Billable
    async fn get_billable_entity(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        include_counts: Option<bool>,
        include_payments: Option<bool>,
        context: &C) -> Result<GetBillableEntityResponse, ApiError>
    {
        info!("get_billable_entity({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, include_counts, include_payments, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Billable
    async fn update_billable_entity(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        authorize_net_api_key: Option<String>,
        authorize_net_transaction_key: Option<String>,
        context: &C) -> Result<UpdateBillableEntityResponse, ApiError>
    {
        info!("update_billable_entity({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, name, street_address, street_address2, city, state, postal_code, business_phone, business_phone_ext, authorize_net_api_key, authorize_net_transaction_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Payment Method
    async fn add_payment_method(
        &self,
        version: f64,
        account_id: i64,
        payment_method_id: Option<i64>,
        account_name: Option<String>,
        first_name: Option<String>,
        last_name: Option<String>,
        address: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        phone: Option<String>,
        credit_card_number: Option<String>,
        expiration_date: Option<String>,
        ccv: Option<String>,
        account_number: Option<String>,
        bank_name: Option<String>,
        routing_number: Option<String>,
        default_payment_method: Option<bool>,
        payment_method_nickname: Option<String>,
        tax_id: Option<String>,
        provider_customer_profile_id: Option<String>,
        provider_payment_profile_id: Option<String>,
        meta_data: Option<String>,
        context: &C) -> Result<AddPaymentMethodResponse, ApiError>
    {
        info!("add_payment_method({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, payment_method_id, account_name, first_name, last_name, address, city, state, postal_code, country, phone, credit_card_number, expiration_date, ccv, account_number, bank_name, routing_number, default_payment_method, payment_method_nickname, tax_id, provider_customer_profile_id, provider_payment_profile_id, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Payment Method
    async fn create_payment_method(
        &self,
        version: f64,
        account_id: i64,
        account_name: Option<String>,
        first_name: Option<String>,
        last_name: Option<String>,
        address: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        phone: Option<String>,
        credit_card_number: Option<String>,
        expiration_date: Option<String>,
        ccv: Option<String>,
        account_number: Option<String>,
        bank_name: Option<String>,
        routing_number: Option<String>,
        payment_method_nickname: Option<String>,
        tax_id: Option<String>,
        default_payment_method: Option<bool>,
        auth_token: Option<String>,
        provider: Option<String>,
        provider_customer_profile_id: Option<String>,
        provider_payment_profile_id: Option<String>,
        meta_data: Option<String>,
        app_key: Option<String>,
        context: &C) -> Result<CreatePaymentMethodResponse, ApiError>
    {
        info!("create_payment_method({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, account_name, first_name, last_name, address, city, state, postal_code, country, phone, credit_card_number, expiration_date, ccv, account_number, bank_name, routing_number, payment_method_nickname, tax_id, default_payment_method, auth_token, provider, provider_customer_profile_id, provider_payment_profile_id, meta_data, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Smart Contract
    async fn create_smart_contract(
        &self,
        version: f64,
        account_id: i64,
        token_name: String,
        token_symbol: String,
        payment_method_id: Option<i64>,
        context: &C) -> Result<CreateSmartContractResponse, ApiError>
    {
        info!("create_smart_contract({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, token_name, token_symbol, payment_method_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Crypto Balances
    async fn get_crypto_balance(
        &self,
        version: f64,
        account_id: i64,
        owner_account_id: Option<i64>,
        payment_method_id: Option<i64>,
        context: &C) -> Result<GetCryptoBalanceResponse, ApiError>
    {
        info!("get_crypto_balance({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, owner_account_id, payment_method_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Payment Method
    async fn get_payment_method(
        &self,
        version: f64,
        account_id: i64,
        payment_method_id: Option<i64>,
        get_current_balance: Option<bool>,
        context: &C) -> Result<GetPaymentMethodResponse, ApiError>
    {
        info!("get_payment_method({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, payment_method_id, get_current_balance, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Payment Methods
    async fn search_payment_method(
        &self,
        version: f64,
        account_id: i64,
        provider: Option<String>,
        param_type: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchPaymentMethodResponse, ApiError>
    {
        info!("search_payment_method({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, provider, param_type, keyword, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Detail Status
    async fn get_status_csv(
        &self,
        version: f64,
        account_id: i64,
        batch_id: i64,
        response_group: models::GetStatusCsvResponseGroupParameter,
        start: i64,
        limit: i64,
        context: &C) -> Result<GetStatusCsvResponse, ApiError>
    {
        info!("get_status_csv({}, {}, {}, {:?}, {}, {}) - X-Span-ID: {:?}", version, account_id, batch_id, response_group, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Status
    async fn list_status_csv(
        &self,
        version: f64,
        account_id: i64,
        start: i32,
        limit: i32,
        context: &C) -> Result<ListStatusCsvResponse, ApiError>
    {
        info!("list_status_csv({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Batch Status
    async fn status_csv(
        &self,
        version: f64,
        account_id: i64,
        batch_id: i64,
        context: &C) -> Result<StatusCsvResponse, ApiError>
    {
        info!("status_csv({}, {}, {}) - X-Span-ID: {:?}", version, account_id, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Upload CSV
    async fn upload_csv(
        &self,
        version: f64,
        account_id: i64,
        upload_type: models::UploadCsvUploadTypeParameter,
        import_file: swagger::ByteArray,
        file_format: models::UploadCsvFileFormatParameter,
        app_key: Option<String>,
        context: &C) -> Result<UploadCsvResponse, ApiError>
    {
        info!("upload_csv({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, upload_type, import_file, file_format, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Cargo Type
    async fn create_cargo_type(
        &self,
        version: f64,
        body: Option<models::CargoType>,
        context: &C) -> Result<CreateCargoTypeResponse, ApiError>
    {
        info!("create_cargo_type({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Cargo Type
    async fn search_cargo_types(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        retailer_id: Option<i64>,
        hub_id: Option<i64>,
        context: &C) -> Result<SearchCargoTypesResponse, ApiError>
    {
        info!("search_cargo_types({}, \"{}\", {}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, retailer_id, hub_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Cargo Type
    async fn delete_cargo_type(
        &self,
        version: f64,
        cargo_type_id: i64,
        context: &C) -> Result<DeleteCargoTypeResponse, ApiError>
    {
        info!("delete_cargo_type({}, {}) - X-Span-ID: {:?}", version, cargo_type_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Cargo Type
    async fn get_cargo_type(
        &self,
        version: f64,
        cargo_type_id: i64,
        context: &C) -> Result<GetCargoTypeResponse, ApiError>
    {
        info!("get_cargo_type({}, {}) - X-Span-ID: {:?}", version, cargo_type_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Cargo Type
    async fn update_cargo_type(
        &self,
        version: f64,
        cargo_type_id: i64,
        body: Option<models::CargoType>,
        context: &C) -> Result<UpdateCargoTypeResponse, ApiError>
    {
        info!("update_cargo_type({}, {}, {:?}) - X-Span-ID: {:?}", version, cargo_type_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Carriers
    async fn search_carriers(
        &self,
        version: f64,
        keyword: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchCarriersResponse, ApiError>
    {
        info!("search_carriers({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, keyword, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Categories by Distance
    async fn category_distance_search(
        &self,
        version: f64,
        account_id: Option<i64>,
        keyword: Option<String>,
        app_key: Option<String>,
        category_ids: Option<String>,
        parent_category_ids: Option<String>,
        root_only: Option<bool>,
        sort_field: Option<models::SearchCategoriesSortFieldParameter>,
        response_group: Option<models::SearchCategoriesResponseGroupParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        return_external: Option<bool>,
        exact_match: Option<bool>,
        param_type: Option<String>,
        external_type: Option<String>,
        min_offer_count: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        range: Option<f64>,
        context: &C) -> Result<CategoryDistanceSearchResponse, ApiError>
    {
        info!("category_distance_search({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, app_key, category_ids, parent_category_ids, root_only, sort_field, response_group, descending, start, limit, active_only, return_external, exact_match, param_type, external_type, min_offer_count, latitude, longitude, range, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Category
    async fn create_category(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        app_key: Option<String>,
        parent_category_id: Option<i64>,
        description: Option<String>,
        param_type: Option<String>,
        asset_id: Option<i64>,
        external_id: Option<String>,
        external_type: Option<String>,
        external_category_slug: Option<String>,
        sqoot_slug: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        search_tags: Option<String>,
        context: &C) -> Result<CreateCategoryResponse, ApiError>
    {
        info!("create_category({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, app_key, parent_category_id, description, param_type, asset_id, external_id, external_type, external_category_slug, sqoot_slug, active, meta_data, search_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Category
    async fn delete_category(
        &self,
        version: f64,
        account_id: i64,
        category_id: i64,
        context: &C) -> Result<DeleteCategoryResponse, ApiError>
    {
        info!("delete_category({}, {}, {}) - X-Span-ID: {:?}", version, account_id, category_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Duplicate Category
    async fn duplicate_category(
        &self,
        version: f64,
        account_id: i64,
        category_id: i64,
        app_key: Option<String>,
        parent_category_id: Option<i64>,
        context: &C) -> Result<DuplicateCategoryResponse, ApiError>
    {
        info!("duplicate_category({}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, category_id, app_key, parent_category_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Category
    async fn get_category(
        &self,
        version: f64,
        category_id: i64,
        return_external: Option<bool>,
        context: &C) -> Result<GetCategoryResponse, ApiError>
    {
        info!("get_category({}, {}, {:?}) - X-Span-ID: {:?}", version, category_id, return_external, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Categories
    async fn search_categories(
        &self,
        version: f64,
        account_id: Option<i64>,
        keyword: Option<String>,
        app_key: Option<String>,
        category_id: Option<String>,
        category_ids: Option<String>,
        parent_category_ids: Option<String>,
        root_only: Option<bool>,
        sort_field: Option<models::SearchCategoriesSortFieldParameter>,
        response_group: Option<models::SearchCategoriesResponseGroupParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        return_external: Option<bool>,
        exact_match: Option<bool>,
        param_type: Option<String>,
        external_type: Option<String>,
        exclude_external_type: Option<bool>,
        min_offer_count: Option<i32>,
        search_depth: Option<i32>,
        search_mode: Option<String>,
        context: &C) -> Result<SearchCategoriesResponse, ApiError>
    {
        info!("search_categories({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, app_key, category_id, category_ids, parent_category_ids, root_only, sort_field, response_group, descending, start, limit, active_only, return_external, exact_match, param_type, external_type, exclude_external_type, min_offer_count, search_depth, search_mode, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Category
    async fn update_category(
        &self,
        version: f64,
        account_id: i64,
        category_id: i64,
        parent_category_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        param_type: Option<String>,
        asset_id: Option<i64>,
        external_id: Option<String>,
        external_type: Option<String>,
        external_category_slug: Option<String>,
        sqoot_slug: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        search_tags: Option<String>,
        context: &C) -> Result<UpdateCategoryResponse, ApiError>
    {
        info!("update_category({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, category_id, parent_category_id, name, description, param_type, asset_id, external_id, external_type, external_category_slug, sqoot_slug, active, meta_data, search_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Connection
    async fn add_connection_to_group(
        &self,
        version: f64,
        return_nulls: bool,
        group_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_id: Option<i64>,
        connection_account_id: Option<i64>,
        pending_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddConnectionToGroupResponse, ApiError>
    {
        info!("add_connection_to_group({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, group_id, device_id, account_id, connection_id, connection_account_id, pending_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Connections
    async fn add_connections_to_group(
        &self,
        version: f64,
        connection_group_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_ids: Option<String>,
        connection_account_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddConnectionsToGroupResponse, ApiError>
    {
        info!("add_connections_to_group({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, connection_group_id, device_id, account_id, connection_ids, connection_account_ids, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Connection Groups
    async fn add_sub_groups(
        &self,
        version: f64,
        return_nulls: bool,
        group_id: i64,
        sub_group_ids: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddSubGroupsResponse, ApiError>
    {
        info!("add_sub_groups({}, {}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, group_id, sub_group_ids, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create or Update Connection
    async fn create_or_update_connection(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_id: Option<i64>,
        connection_account_id: Option<i64>,
        pending_id: Option<i64>,
        group_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        is_trusted: Option<bool>,
        ignore_friend_request: Option<bool>,
        is_contact: Option<bool>,
        is_blocked: Option<bool>,
        is_following: Option<bool>,
        connection_response: Option<bool>,
        context: &C) -> Result<CreateOrUpdateConnectionResponse, ApiError>
    {
        info!("create_or_update_connection({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, connection_id, connection_account_id, pending_id, group_id, game_type, app_key, is_trusted, ignore_friend_request, is_contact, is_blocked, is_following, connection_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create or Update Connection Group
    async fn create_or_update_group(
        &self,
        version: f64,
        return_nulls: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        group_id: Option<i64>,
        asset_id: Option<i64>,
        connections: Option<String>,
        description: Option<String>,
        can_view_profile_info: Option<bool>,
        can_view_game_info: Option<bool>,
        can_view_friend_info: Option<bool>,
        active: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreateOrUpdateGroupResponse, ApiError>
    {
        info!("create_or_update_group({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, device_id, account_id, name, group_id, asset_id, connections, description, can_view_profile_info, can_view_game_info, can_view_friend_info, active, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Accept Follow Request
    async fn follow_accept(
        &self,
        version: f64,
        account_id: i64,
        connection_account_id: i64,
        app_key: String,
        context: &C) -> Result<FollowAcceptResponse, ApiError>
    {
        info!("follow_accept({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, connection_account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Reject Follow Request
    async fn follow_reject(
        &self,
        version: f64,
        account_id: i64,
        connection_account_id: i64,
        app_key: String,
        context: &C) -> Result<FollowRejectResponse, ApiError>
    {
        info!("follow_reject({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, connection_account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Follower / Unfollow
    async fn follow_remove(
        &self,
        version: f64,
        account_id: i64,
        connection_account_id: i64,
        app_key: String,
        context: &C) -> Result<FollowRemoveResponse, ApiError>
    {
        info!("follow_remove({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, connection_account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Follow Request
    async fn follow_request(
        &self,
        version: f64,
        account_id: i64,
        connection_account_id: i64,
        app_key: String,
        approval_needed: Option<bool>,
        context: &C) -> Result<FollowRequestResponse, ApiError>
    {
        info!("follow_request({}, {}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, connection_account_id, app_key, approval_needed, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Accept Friend
    async fn friend_accept(
        &self,
        version: f64,
        friend_account_id: i64,
        notify_friend: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        notification_message: Option<String>,
        context: &C) -> Result<FriendAcceptResponse, ApiError>
    {
        info!("friend_accept({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, friend_account_id, notify_friend, device_id, account_id, game_type, app_key, notification_message, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Decline Friend
    async fn friend_reject(
        &self,
        version: f64,
        friend_account_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        notify_friend: Option<bool>,
        notification_message: Option<String>,
        context: &C) -> Result<FriendRejectResponse, ApiError>
    {
        info!("friend_reject({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, friend_account_id, device_id, account_id, game_type, app_key, notify_friend, notification_message, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Friend
    async fn friend_remove(
        &self,
        version: f64,
        friend_account_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        notify_friend: Option<bool>,
        remove_from_groups: Option<bool>,
        context: &C) -> Result<FriendRemoveResponse, ApiError>
    {
        info!("friend_remove({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, friend_account_id, device_id, account_id, notify_friend, remove_from_groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Request Friend
    async fn friend_request(
        &self,
        version: f64,
        friend_account_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        notification_message: Option<String>,
        context: &C) -> Result<FriendRequestResponse, ApiError>
    {
        info!("friend_request({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, friend_account_id, device_id, account_id, game_type, app_key, notification_message, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Sent Friend Requests
    async fn get_connection_sent_friend_requests(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetConnectionSentFriendRequestsResponse, ApiError>
    {
        info!("get_connection_sent_friend_requests({}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Connections
    async fn get_connections(
        &self,
        version: f64,
        return_nulls: bool,
        filter: String,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        _i: Option<i32>,
        _l: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetConnectionsResponse, ApiError>
    {
        info!("get_connections({}, {}, \"{}\", \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, filter, sort_field, descending, start, limit, device_id, account_id, connection_account_id, q, keyword, _i, _l, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Connection Group
    async fn get_group_details(
        &self,
        version: f64,
        combine_connections: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        group_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetGroupDetailsResponse, ApiError>
    {
        info!("get_group_details({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, combine_connections, device_id, account_id, group_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Connection Groups
    async fn group_search(
        &self,
        version: f64,
        sort_field: models::GroupSearchSortFieldParameter,
        descending: bool,
        active_only: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        keyword: Option<String>,
        context: &C) -> Result<GroupSearchResponse, ApiError>
    {
        info!("group_search({}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, active_only, start, limit, device_id, account_id, latitude, longitude, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Connection
    async fn remove_connection_from_group(
        &self,
        version: f64,
        return_nulls: bool,
        group_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_id: Option<i64>,
        connection_account_id: Option<i64>,
        pending_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveConnectionFromGroupResponse, ApiError>
    {
        info!("remove_connection_from_group({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, group_id, device_id, account_id, connection_id, connection_account_id, pending_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Connections
    async fn remove_connections_from_group(
        &self,
        version: f64,
        connection_group_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_ids: Option<String>,
        connection_account_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveConnectionsFromGroupResponse, ApiError>
    {
        info!("remove_connections_from_group({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, connection_group_id, device_id, account_id, connection_ids, connection_account_ids, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Connection Group
    async fn remove_group(
        &self,
        version: f64,
        return_nulls: bool,
        group_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveGroupResponse, ApiError>
    {
        info!("remove_group({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, group_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Connection Groups
    async fn remove_sub_groups(
        &self,
        version: f64,
        return_nulls: bool,
        group_id: i64,
        sub_group_ids: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveSubGroupsResponse, ApiError>
    {
        info!("remove_sub_groups({}, {}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, group_id, sub_group_ids, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Possible Connections
    async fn search_connections(
        &self,
        version: f64,
        return_nulls: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        game_type: Option<String>,
        app_key: Option<String>,
        _i: Option<i32>,
        _l: Option<i32>,
        sort_field: Option<String>,
        has_location: Option<bool>,
        context: &C) -> Result<SearchConnectionsResponse, ApiError>
    {
        info!("search_connections({}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, return_nulls, start, limit, device_id, account_id, q, keyword, latitude, longitude, game_type, app_key, _i, _l, sort_field, has_location, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create or Update Contest
    async fn add_or_update_album_contest(
        &self,
        version: f64,
        public_read: bool,
        public_write: bool,
        public_delete: bool,
        public_add: bool,
        visibility: models::AddAlbumCollectionVisibilityParameter,
        include_friend_group: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        contest_type: Option<String>,
        album_contest_id: Option<i64>,
        title: Option<String>,
        description: Option<String>,
        album_id1: Option<i64>,
        remove_album1: Option<bool>,
        album_id2: Option<i64>,
        remove_album2: Option<bool>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        location_description: Option<String>,
        connection_ids_to_add: Option<String>,
        connection_group_ids_to_add: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddOrUpdateAlbumContestResponse, ApiError>
    {
        info!("add_or_update_album_contest({}, {}, {}, {}, {}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, public_read, public_write, public_delete, public_add, visibility, include_friend_group, device_id, account_id, game_type, app_key, contest_type, album_contest_id, title, description, album_id1, remove_album1, album_id2, remove_album2, start_date, end_date, location_description, connection_ids_to_add, connection_group_ids_to_add, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Approve Contest
    async fn approve_album_contest(
        &self,
        version: f64,
        album_contest_id: i64,
        approval_status: models::ApproveAlbumApprovalStatusParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<ApproveAlbumContestResponse, ApiError>
    {
        info!("approve_album_contest({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_contest_id, approval_status, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Contest
    async fn delete_contest(
        &self,
        version: f64,
        album_contest_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<DeleteContestResponse, ApiError>
    {
        info!("delete_contest({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_contest_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Contest
    async fn get_album_contest(
        &self,
        version: f64,
        album_contest_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetAlbumContestResponse, ApiError>
    {
        info!("get_album_contest({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_contest_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Contests
    async fn get_album_contests(
        &self,
        version: f64,
        filter: String,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        app_type: Option<String>,
        contest_type: Option<String>,
        owner_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        _i: Option<i32>,
        _l: Option<i32>,
        date_created: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetAlbumContestsResponse, ApiError>
    {
        info!("get_album_contests({}, \"{}\", \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, filter, sort_field, descending, start, limit, device_id, account_id, game_type, app_key, app_type, contest_type, owner_id, q, keyword, _i, _l, date_created, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Vote on Contest
    async fn vote_on_album_contest(
        &self,
        version: f64,
        album_contest_id: i64,
        album_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        contest_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<VoteOnAlbumContestResponse, ApiError>
    {
        info!("vote_on_album_contest({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, album_contest_id, album_id, device_id, account_id, contest_type, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Preview
    async fn add_preview(
        &self,
        version: f64,
        account_id: i64,
        creative_id: i64,
        context: &C) -> Result<AddPreviewResponse, ApiError>
    {
        info!("add_preview({}, {}, {}) - X-Span-ID: {:?}", version, account_id, creative_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Find Missions
    async fn ads_find(
        &self,
        version: f64,
        app_key: String,
        randomize: bool,
        targeted_ads_only: bool,
        param_type: Option<String>,
        account_id: Option<i64>,
        app_version: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        device: Option<String>,
        device_identifier: Option<i64>,
        device_version: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        include_audiences: Option<bool>,
        allocates_tickets: Option<bool>,
        mission_ids: Option<String>,
        context: &C) -> Result<AdsFindResponse, ApiError>
    {
        info!("ads_find({}, \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, randomize, targeted_ads_only, param_type, account_id, app_version, latitude, longitude, device, device_identifier, device_version, start, limit, include_audiences, allocates_tickets, mission_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Creative
    async fn create_creative(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        active: bool,
        wait_for_asset: bool,
        description: Option<String>,
        asset_image_id: Option<i64>,
        action: Option<String>,
        data: Option<String>,
        suffix: Option<String>,
        param_type: Option<String>,
        balance: Option<f64>,
        reference_id: Option<i64>,
        app_version: Option<String>,
        mission_id: Option<i64>,
        offer_id: Option<i64>,
        context: &C) -> Result<CreateCreativeResponse, ApiError>
    {
        info!("create_creative({}, {}, \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, active, wait_for_asset, description, asset_image_id, action, data, suffix, param_type, balance, reference_id, app_version, mission_id, offer_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Creative
    async fn delete_creative(
        &self,
        version: f64,
        account_id: i64,
        creative_id: i64,
        context: &C) -> Result<DeleteCreativeResponse, ApiError>
    {
        info!("delete_creative({}, {}, {}) - X-Span-ID: {:?}", version, account_id, creative_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Creative
    async fn get_creative(
        &self,
        version: f64,
        account_id: i64,
        creative_id: i64,
        context: &C) -> Result<GetCreativeResponse, ApiError>
    {
        info!("get_creative({}, {}, {}) - X-Span-ID: {:?}", version, account_id, creative_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Creatives
    async fn get_creatives_by_application(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        start: i32,
        limit: i32,
        mission_id: Option<i64>,
        keyword: Option<String>,
        context: &C) -> Result<GetCreativesByApplicationResponse, ApiError>
    {
        info!("get_creatives_by_application({}, {}, \"{}\", {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, start, limit, mission_id, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove Preview
    async fn remove_preview(
        &self,
        version: f64,
        account_id: i64,
        creative_id: i64,
        context: &C) -> Result<RemovePreviewResponse, ApiError>
    {
        info!("remove_preview({}, {}, {}) - X-Span-ID: {:?}", version, account_id, creative_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Creative
    async fn update_creative(
        &self,
        version: f64,
        account_id: i64,
        creative_id: i64,
        name: Option<String>,
        description: Option<String>,
        asset_image_id: Option<i64>,
        action: Option<String>,
        data: Option<String>,
        suffix: Option<String>,
        param_type: Option<String>,
        balance: Option<f64>,
        active: Option<bool>,
        reference_id: Option<i64>,
        app_version: Option<String>,
        mission_id: Option<i64>,
        context: &C) -> Result<UpdateCreativeResponse, ApiError>
    {
        info!("update_creative({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, creative_id, name, description, asset_image_id, action, data, suffix, param_type, balance, active, reference_id, app_version, mission_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Dependent
    async fn create(
        &self,
        version: f64,
        account_id: i64,
        body: Option<models::Account>,
        context: &C) -> Result<CreateResponse, ApiError>
    {
        info!("create({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get dependent list of an account
    async fn get_dependents(
        &self,
        version: f64,
        account_id: i64,
        context: &C) -> Result<GetDependentsResponse, ApiError>
    {
        info!("get_dependents({}, {}) - X-Span-ID: {:?}", version, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Dependent
    async fn remove_dependent(
        &self,
        version: f64,
        account_id: i64,
        dependent_id: i64,
        context: &C) -> Result<RemoveDependentResponse, ApiError>
    {
        info!("remove_dependent({}, {}, {}) - X-Span-ID: {:?}", version, account_id, dependent_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Check Disbursements
    async fn check_disbursements(
        &self,
        version: f64,
        disbursement_id: i64,
        context: &C) -> Result<CheckDisbursementsResponse, ApiError>
    {
        info!("check_disbursements({}, {}) - X-Span-ID: {:?}", version, disbursement_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Disbursement
    async fn create_disbursement(
        &self,
        version: f64,
        account_id: i64,
        receiver_account_id: i64,
        original_sender_account_id: i64,
        amount: f64,
        provider: models::CreateDisbursementProviderParameter,
        scheduled_date: Option<i64>,
        title: Option<String>,
        comment: Option<String>,
        external_id: Option<String>,
        introspection_params: Option<String>,
        context: &C) -> Result<CreateDisbursementResponse, ApiError>
    {
        info!("create_disbursement({}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, receiver_account_id, original_sender_account_id, amount, provider, scheduled_date, title, comment, external_id, introspection_params, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Disbursement
    async fn get_disbursement(
        &self,
        version: f64,
        account_id: i64,
        disbursement_id: i64,
        context: &C) -> Result<GetDisbursementResponse, ApiError>
    {
        info!("get_disbursement({}, {}, {}) - X-Span-ID: {:?}", version, account_id, disbursement_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Disbursements
    async fn search_disbursements(
        &self,
        version: f64,
        account_id: i64,
        receiver_account_id: Option<i64>,
        statuses: Option<String>,
        providers: Option<String>,
        before_date: Option<i64>,
        after_date: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        external_id: Option<String>,
        context: &C) -> Result<SearchDisbursementsResponse, ApiError>
    {
        info!("search_disbursements({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, receiver_account_id, statuses, providers, before_date, after_date, start, limit, active_only, external_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Disbursement
    async fn update_disbursement(
        &self,
        version: f64,
        account_id: i64,
        disbursement_id: i64,
        amount: Option<f64>,
        provider: Option<models::CreateDisbursementProviderParameter>,
        scheduled_date: Option<i64>,
        title: Option<String>,
        comment: Option<String>,
        external_id: Option<String>,
        retry: Option<bool>,
        introspection_params: Option<String>,
        context: &C) -> Result<UpdateDisbursementResponse, ApiError>
    {
        info!("update_disbursement({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, disbursement_id, amount, provider, scheduled_date, title, comment, external_id, retry, introspection_params, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Assign Employee
    async fn assign_employee(
        &self,
        version: f64,
        account_id: i64,
        manager_account_id: i64,
        employee_account_id: i64,
        role: Option<String>,
        context: &C) -> Result<AssignEmployeeResponse, ApiError>
    {
        info!("assign_employee({}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, manager_account_id, employee_account_id, role, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Assign Employee to Location
    async fn assign_to_location_employee(
        &self,
        version: f64,
        account_id: i64,
        retailer_location_id: i64,
        employee_account_id: Option<i64>,
        assign: Option<bool>,
        context: &C) -> Result<AssignToLocationEmployeeResponse, ApiError>
    {
        info!("assign_to_location_employee({}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, retailer_location_id, employee_account_id, assign, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Employee
    async fn create_employee(
        &self,
        version: f64,
        account_id: i64,
        manager_account_id: i64,
        username: String,
        password: String,
        name: Option<String>,
        prefix_name: Option<String>,
        first_name: Option<String>,
        middle_name: Option<String>,
        last_name: Option<String>,
        suffix_name: Option<String>,
        title: Option<String>,
        about_us: Option<String>,
        asset_id: Option<i64>,
        gender: Option<models::SearchAccountsGenderParameter>,
        home_phone: Option<String>,
        cell_phone: Option<String>,
        cell_phone_carrier: Option<String>,
        business_phone: Option<String>,
        email_address: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        zipcode: Option<String>,
        country: Option<String>,
        role: Option<String>,
        retailer_location_ids: Option<String>,
        settings_app_key: Option<String>,
        app_blob: Option<String>,
        assigned_device_id: Option<String>,
        context: &C) -> Result<CreateEmployeeResponse, ApiError>
    {
        info!("create_employee({}, {}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, manager_account_id, username, password, name, prefix_name, first_name, middle_name, last_name, suffix_name, title, about_us, asset_id, gender, home_phone, cell_phone, cell_phone_carrier, business_phone, email_address, street_address, street_address2, city, state, zipcode, country, role, retailer_location_ids, settings_app_key, app_blob, assigned_device_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Employee
    async fn delete_employee(
        &self,
        version: f64,
        account_id: i64,
        employee_account_id: i64,
        context: &C) -> Result<DeleteEmployeeResponse, ApiError>
    {
        info!("delete_employee({}, {}, {}) - X-Span-ID: {:?}", version, account_id, employee_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Employee
    async fn get_employee(
        &self,
        version: f64,
        account_id: i64,
        employee_account_id: i64,
        settings_app_key: Option<String>,
        context: &C) -> Result<GetEmployeeResponse, ApiError>
    {
        info!("get_employee({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, employee_account_id, settings_app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Employees
    async fn search_employees(
        &self,
        version: f64,
        account_id: i64,
        role: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        sort_field: Option<models::SearchEmployeesSortFieldParameter>,
        descending: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        managed_only: Option<bool>,
        settings_app_key: Option<String>,
        category_ids: Option<String>,
        query: Option<String>,
        context: &C) -> Result<SearchEmployeesResponse, ApiError>
    {
        info!("search_employees({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, role, retailer_id, retailer_location_id, q, keyword, sort_field, descending, _i, start, _l, limit, active_only, managed_only, settings_app_key, category_ids, query, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Unassign Employee
    async fn unassign_employee(
        &self,
        version: f64,
        account_id: i64,
        employee_account_id: i64,
        context: &C) -> Result<UnassignEmployeeResponse, ApiError>
    {
        info!("unassign_employee({}, {}, {}) - X-Span-ID: {:?}", version, account_id, employee_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Employee
    async fn update_employee(
        &self,
        version: f64,
        account_id: i64,
        employee_account_id: i64,
        manager_account_id: Option<i64>,
        name: Option<String>,
        prefix_name: Option<String>,
        first_name: Option<String>,
        middle_name: Option<String>,
        last_name: Option<String>,
        suffix_name: Option<String>,
        title: Option<String>,
        asset_id: Option<i64>,
        gender: Option<models::SearchAccountsGenderParameter>,
        home_phone: Option<String>,
        cell_phone: Option<String>,
        cell_phone_carrier: Option<String>,
        business_phone: Option<String>,
        email_address: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        zipcode: Option<String>,
        country: Option<String>,
        role: Option<String>,
        active: Option<bool>,
        password: Option<String>,
        retailer_location_ids: Option<String>,
        settings_app_key: Option<String>,
        app_blob: Option<String>,
        assigned_device_id: Option<String>,
        context: &C) -> Result<UpdateEmployeeResponse, ApiError>
    {
        info!("update_employee({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, employee_account_id, manager_account_id, name, prefix_name, first_name, middle_name, last_name, suffix_name, title, asset_id, gender, home_phone, cell_phone, cell_phone_carrier, business_phone, email_address, street_address, street_address2, city, state, zipcode, country, role, active, password, retailer_location_ids, settings_app_key, app_blob, assigned_device_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Attend Event
    async fn attend_event(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        listing_id: Option<i64>,
        retailer_location_id: Option<i64>,
        offer_location_id: Option<i64>,
        transaction_id: Option<i64>,
        status: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AttendEventResponse, ApiError>
    {
        info!("attend_event({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, listing_id, retailer_location_id, offer_location_id, transaction_id, status, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Event
    async fn create_event(
        &self,
        version: f64,
        account_id: i64,
        title: String,
        retailer_location_ids: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        active: Option<bool>,
        image_asset_id: Option<i64>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateEventResponse, ApiError>
    {
        info!("create_event({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, title, retailer_location_ids, sub_title, details, category_ids, filter_ids, active, image_asset_id, redeemable_start, redeemable_end, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Event
    async fn delete_event(
        &self,
        version: f64,
        account_id: i64,
        event_id: i64,
        context: &C) -> Result<DeleteEventResponse, ApiError>
    {
        info!("delete_event({}, {}, {}) - X-Span-ID: {:?}", version, account_id, event_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Event
    async fn get_event(
        &self,
        version: f64,
        account_id: i64,
        event_id: i64,
        context: &C) -> Result<GetEventResponse, ApiError>
    {
        info!("get_event({}, {}, {}) - X-Span-ID: {:?}", version, account_id, event_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Event Attendance
    async fn search_event_transactions(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        exclude_retailer_location_id: Option<i64>,
        listing_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        customer_account_ids: Option<String>,
        affiliated_category_ids: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        statuses: Option<String>,
        sort_field: Option<models::SearchEventTransactionsSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchEventTransactionsResponse, ApiError>
    {
        info!("search_event_transactions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, keyword, retailer_id, retailer_location_id, exclude_retailer_location_id, listing_id, offer_id, offer_location_id, customer_account_ids, affiliated_category_ids, start_date, end_date, statuses, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Events
    async fn search_events(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        active_only: Option<bool>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        offer_audience_ids: Option<String>,
        transaction_audience_ids: Option<String>,
        sort_field: Option<models::SearchEventsSortFieldParameter>,
        descending: Option<bool>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchEventsResponse, ApiError>
    {
        info!("search_events({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, active_only, category_ids, filter_ids, offer_audience_ids, transaction_audience_ids, sort_field, descending, start_date, end_date, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Event
    async fn update_event(
        &self,
        version: f64,
        account_id: i64,
        event_id: i64,
        retailer_location_ids: Option<String>,
        title: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        active: Option<bool>,
        image_asset_id: Option<i64>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        context: &C) -> Result<UpdateEventResponse, ApiError>
    {
        info!("update_event({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, event_id, retailer_location_ids, title, sub_title, details, category_ids, filter_ids, active, image_asset_id, redeemable_start, redeemable_end, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Facebook Token
    async fn get_token(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetTokenResponse, ApiError>
    {
        info!("get_token({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Post to Facebook
    async fn graph_interface(
        &self,
        version: f64,
        event: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        permissionable_type: Option<String>,
        permissionable_id: Option<i64>,
        asset_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GraphInterfaceResponse, ApiError>
    {
        info!("graph_interface({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, event, device_id, account_id, permissionable_type, permissionable_id, asset_id, game_type, app_key, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Favorite
    async fn add_favorite(
        &self,
        version: f64,
        favoritable_id: i64,
        favoritable_type: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddFavoriteResponse, ApiError>
    {
        info!("add_favorite({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, favoritable_id, favoritable_type, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Favorite
    async fn delete_favorite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        favorite_id: Option<i64>,
        favoritable_id: Option<i64>,
        favoritable_type: Option<String>,
        context: &C) -> Result<DeleteFavoriteResponse, ApiError>
    {
        info!("delete_favorite({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, favorite_id, favoritable_id, favoritable_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Favorite
    async fn get_favorite(
        &self,
        version: f64,
        favorite_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetFavoriteResponse, ApiError>
    {
        info!("get_favorite({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, favorite_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Favorites
    async fn search_favorites(
        &self,
        version: f64,
        favoritable_type: String,
        sort_field: models::SearchFavoritesSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        return_full_response: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        secondary_type: Option<String>,
        keyword: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<SearchFavoritesResponse, ApiError>
    {
        info!("search_favorites({}, \"{}\", {:?}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, favoritable_type, sort_field, descending, start, limit, active_only, return_full_response, device_id, account_id, connection_account_id, secondary_type, keyword, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Who has Favorited
    async fn who_has_favorited(
        &self,
        version: f64,
        favoritable_id: i64,
        favoritable_type: String,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        keyword: Option<String>,
        context: &C) -> Result<WhoHasFavoritedResponse, ApiError>
    {
        info!("who_has_favorited({}, {}, \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, favoritable_id, favoritable_type, start, limit, device_id, account_id, latitude, longitude, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Filter
    async fn create_filter(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        app_key: Option<String>,
        parent_filter_id: Option<i64>,
        description: Option<String>,
        external_id: Option<String>,
        external_type: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateFilterResponse, ApiError>
    {
        info!("create_filter({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, app_key, parent_filter_id, description, external_id, external_type, active, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Filter
    async fn delete_filter(
        &self,
        version: f64,
        account_id: i64,
        filter_id: i64,
        context: &C) -> Result<DeleteFilterResponse, ApiError>
    {
        info!("delete_filter({}, {}, {}) - X-Span-ID: {:?}", version, account_id, filter_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Filter
    async fn get_filter(
        &self,
        version: f64,
        filter_id: i64,
        context: &C) -> Result<GetFilterResponse, ApiError>
    {
        info!("get_filter({}, {}) - X-Span-ID: {:?}", version, filter_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Filters
    async fn search_filters(
        &self,
        version: f64,
        account_id: Option<i64>,
        keyword: Option<String>,
        app_key: Option<String>,
        response_group: Option<models::SearchCategoriesResponseGroupParameter>,
        root_only: Option<bool>,
        sort_field: Option<models::SearchCategoriesSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchFiltersResponse, ApiError>
    {
        info!("search_filters({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, app_key, response_group, root_only, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Filter
    async fn update_filter(
        &self,
        version: f64,
        account_id: i64,
        filter_id: i64,
        parent_filter_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        external_id: Option<String>,
        external_type: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        context: &C) -> Result<UpdateFilterResponse, ApiError>
    {
        info!("update_filter({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, filter_id, parent_filter_id, name, description, external_id, external_type, active, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Flag
    async fn create_flag(
        &self,
        version: f64,
        flagable_type: String,
        flagable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        flag_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreateFlagResponse, ApiError>
    {
        info!("create_flag({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, flagable_type, flagable_id, device_id, account_id, flag_description, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Flag
    async fn delete_flag(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        item_being_flagged_type: Option<String>,
        item_being_flagged_id: Option<i64>,
        flagable_type: Option<String>,
        flagable_id: Option<i64>,
        context: &C) -> Result<DeleteFlagResponse, ApiError>
    {
        info!("delete_flag({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, item_being_flagged_type, item_being_flagged_id, flagable_type, flagable_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Flag
    async fn get_flag(
        &self,
        version: f64,
        flagable_type: String,
        flagable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetFlagResponse, ApiError>
    {
        info!("get_flag({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, flagable_type, flagable_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Flag Threshold
    async fn get_flag_threshold(
        &self,
        version: f64,
        item_being_flagged_type: String,
        app_key: String,
        context: &C) -> Result<GetFlagThresholdResponse, ApiError>
    {
        info!("get_flag_threshold({}, \"{}\", \"{}\") - X-Span-ID: {:?}", version, item_being_flagged_type, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Flag Threshold
    async fn update_flag_threshold(
        &self,
        version: f64,
        item_being_flagged_type: String,
        threshold: i64,
        app_key: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<UpdateFlagThresholdResponse, ApiError>
    {
        info!("update_flag_threshold({}, \"{}\", {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, item_being_flagged_type, threshold, app_key, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a Game
    async fn create_game(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        title: Option<String>,
        description: Option<String>,
        meta_data: Option<String>,
        pack_ids: Option<String>,
        include_game_data: Option<bool>,
        context: &C) -> Result<CreateGameResponse, ApiError>
    {
        info!("create_game({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, title, description, meta_data, pack_ids, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a Game
    async fn delete_game(
        &self,
        version: f64,
        account_id: i64,
        game_id: i64,
        context: &C) -> Result<DeleteGameResponse, ApiError>
    {
        info!("delete_game({}, {}, {}) - X-Span-ID: {:?}", version, account_id, game_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get a Game by id
    async fn get_game(
        &self,
        version: f64,
        account_id: i64,
        game_id: i64,
        include_game_data: Option<bool>,
        context: &C) -> Result<GetGameResponse, ApiError>
    {
        info!("get_game({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, game_id, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search a Game
    async fn search_games(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        start: i32,
        limit: i32,
        keyword: Option<String>,
        app_version: Option<String>,
        include_game_data: Option<bool>,
        include_inactive: Option<bool>,
        context: &C) -> Result<SearchGamesResponse, ApiError>
    {
        info!("search_games({}, {}, \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, start, limit, keyword, app_version, include_game_data, include_inactive, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update a Game
    async fn update_game(
        &self,
        version: f64,
        account_id: Option<i64>,
        game_id: Option<i64>,
        app_key: Option<String>,
        title: Option<String>,
        description: Option<String>,
        meta_data: Option<String>,
        pack_ids: Option<String>,
        include_game_data: Option<bool>,
        context: &C) -> Result<UpdateGameResponse, ApiError>
    {
        info!("update_game({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, game_id, app_key, title, description, meta_data, pack_ids, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Game Level
    async fn create_game_level(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        game_data: String,
        game_data_suffix: String,
        app_key: Option<String>,
        description: Option<String>,
        difficulty: Option<String>,
        app_version: Option<String>,
        asset_image_id: Option<i64>,
        asset_icon_id: Option<i64>,
        visibility: Option<String>,
        friend_group: Option<bool>,
        connection_ids: Option<String>,
        connection_group_ids: Option<String>,
        balance: Option<f64>,
        active: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_count: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        tutorial_title: Option<String>,
        tutorial_message: Option<String>,
        tutorial_alignment: Option<String>,
        tutorial_image_asset_id: Option<i64>,
        offer_id: Option<i64>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateGameLevelResponse, ApiError>
    {
        info!("create_game_level({}, {}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, game_data, game_data_suffix, app_key, description, difficulty, app_version, asset_image_id, asset_icon_id, visibility, friend_group, connection_ids, connection_group_ids, balance, active, allocate_tickets, ticket_count, ticket_type, points, tutorial_title, tutorial_message, tutorial_alignment, tutorial_image_asset_id, offer_id, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Game Level
    async fn delete_game_level(
        &self,
        version: f64,
        account_id: i64,
        level_id: i64,
        context: &C) -> Result<DeleteGameLevelResponse, ApiError>
    {
        info!("delete_game_level({}, {}, {}) - X-Span-ID: {:?}", version, account_id, level_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Game Level
    async fn get_game_level(
        &self,
        version: f64,
        account_id: i64,
        level_id: i64,
        include_game_data: Option<bool>,
        context: &C) -> Result<GetGameLevelResponse, ApiError>
    {
        info!("get_game_level({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, level_id, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Game Levels
    async fn get_game_levels_by_application(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        app_version: Option<String>,
        include_game_data: Option<bool>,
        filters: Option<String>,
        context: &C) -> Result<GetGameLevelsByApplicationResponse, ApiError>
    {
        info!("get_game_levels_by_application({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, keyword, sort_field, descending, start, limit, app_version, include_game_data, filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Game Level by Billable Entity
    async fn get_game_levels_by_billable_entity(
        &self,
        version: f64,
        account_id: i64,
        app_key: Option<String>,
        keyword: Option<String>,
        sort_field: Option<models::GetGameLevelsByBillableEntitySortFieldParameter>,
        descending: Option<bool>,
        active_only: Option<bool>,
        start: Option<i64>,
        limit: Option<i64>,
        context: &C) -> Result<GetGameLevelsByBillableEntityResponse, ApiError>
    {
        info!("get_game_levels_by_billable_entity({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, keyword, sort_field, descending, active_only, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Level Questions
    async fn get_questions_in_level(
        &self,
        version: f64,
        level_id: i64,
        account_id: i64,
        context: &C) -> Result<GetQuestionsInLevelResponse, ApiError>
    {
        info!("get_questions_in_level({}, {}, {}) - X-Span-ID: {:?}", version, level_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Level Words
    async fn get_words_in_level(
        &self,
        version: f64,
        level_id: i64,
        account_id: i64,
        context: &C) -> Result<GetWordsInLevelResponse, ApiError>
    {
        info!("get_words_in_level({}, {}, {}) - X-Span-ID: {:?}", version, level_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Game Level
    async fn update_game_level(
        &self,
        version: f64,
        account_id: i64,
        level_id: i64,
        app_key: Option<String>,
        name: Option<String>,
        description: Option<String>,
        difficulty: Option<String>,
        app_version: Option<String>,
        asset_image_id: Option<i64>,
        asset_icon_id: Option<i64>,
        game_data: Option<String>,
        game_data_suffix: Option<String>,
        visibility: Option<String>,
        friend_group: Option<bool>,
        connection_ids: Option<String>,
        connection_group_ids: Option<String>,
        balance: Option<f64>,
        active: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_count: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        tutorial_title: Option<String>,
        tutorial_message: Option<String>,
        tutorial_alignment: Option<String>,
        tutorial_image_asset_id: Option<i64>,
        offer_id: Option<i64>,
        meta_data: Option<String>,
        context: &C) -> Result<UpdateGameLevelResponse, ApiError>
    {
        info!("update_game_level({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, level_id, app_key, name, description, difficulty, app_version, asset_image_id, asset_icon_id, game_data, game_data_suffix, visibility, friend_group, connection_ids, connection_group_ids, balance, active, allocate_tickets, ticket_count, ticket_type, points, tutorial_title, tutorial_message, tutorial_alignment, tutorial_image_asset_id, offer_id, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Level Questions
    async fn update_questions_in_level(
        &self,
        version: f64,
        level_id: i64,
        account_id: i64,
        question_ids: String,
        context: &C) -> Result<UpdateQuestionsInLevelResponse, ApiError>
    {
        info!("update_questions_in_level({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, level_id, account_id, question_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Level Words
    async fn update_words_in_level(
        &self,
        version: f64,
        level_id: i64,
        account_id: i64,
        word_ids: String,
        context: &C) -> Result<UpdateWordsInLevelResponse, ApiError>
    {
        info!("update_words_in_level({}, {}, {}, \"{}\") - X-Span-ID: {:?}", version, level_id, account_id, word_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Accept Invite
    async fn accept_invite(
        &self,
        version: f64,
        token: String,
        account_id: i64,
        album_id: Option<i64>,
        mission_id: Option<i64>,
        album_contest_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        retailer_location_id: Option<i64>,
        app_key: Option<String>,
        auto_friend: Option<bool>,
        auto_attend_event: Option<bool>,
        auto_favorite_offer: Option<bool>,
        auto_favorite_offer_location: Option<bool>,
        auto_favorite_retailer_location: Option<bool>,
        context: &C) -> Result<AcceptInviteResponse, ApiError>
    {
        info!("accept_invite({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, token, account_id, album_id, mission_id, album_contest_id, offer_id, offer_location_id, retailer_location_id, app_key, auto_friend, auto_attend_event, auto_favorite_offer, auto_favorite_offer_location, auto_favorite_retailer_location, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Contest
    async fn album_contest_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_id: Option<i64>,
        app_key: Option<String>,
        album_contest_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AlbumContestInviteResponse, ApiError>
    {
        info!("album_contest_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_id, app_key, album_contest_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Collection
    async fn album_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_id: Option<i64>,
        app_key: Option<String>,
        album_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AlbumInviteResponse, ApiError>
    {
        info!("album_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_id, app_key, album_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Event
    async fn event_invite(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        listing_id: i64,
        receiver_account_ids: Option<String>,
        retailer_location_id: Option<i64>,
        context: &C) -> Result<EventInviteResponse, ApiError>
    {
        info!("event_invite({}, {}, \"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, listing_id, receiver_account_ids, retailer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Game Level
    async fn game_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_id: Option<i64>,
        app_key: Option<String>,
        game_level_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GameInviteResponse, ApiError>
    {
        info!("game_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_id, app_key, game_level_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Invite
    async fn get_invite(
        &self,
        version: f64,
        account_id: Option<i64>,
        token: Option<String>,
        album_id: Option<i64>,
        mission_id: Option<i64>,
        album_contest_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        retailer_location_id: Option<i64>,
        app_key: Option<String>,
        context: &C) -> Result<GetInviteResponse, ApiError>
    {
        info!("get_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, token, album_id, mission_id, album_contest_id, offer_id, offer_location_id, retailer_location_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Mission
    async fn mission_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_id: Option<i64>,
        app_key: Option<String>,
        mission_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<MissionInviteResponse, ApiError>
    {
        info!("mission_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_id, app_key, mission_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Offer
    async fn offer_invite(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        offer_id: i64,
        context: &C) -> Result<OfferInviteResponse, ApiError>
    {
        info!("offer_invite({}, {}, \"{}\", {}) - X-Span-ID: {:?}", version, account_id, app_key, offer_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Offer Location
    async fn offer_location_invite(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        offer_location_id: i64,
        context: &C) -> Result<OfferLocationInviteResponse, ApiError>
    {
        info!("offer_location_invite({}, {}, \"{}\", {}) - X-Span-ID: {:?}", version, account_id, app_key, offer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Invite to Retailer Location
    async fn retailer_location_invite(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        retailer_location_id: i64,
        album_id: Option<i64>,
        context: &C) -> Result<RetailerLocationInviteResponse, ApiError>
    {
        info!("retailer_location_invite({}, {}, \"{}\", {}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, retailer_location_id, album_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    async fn create_leaderboard(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        rank_type: Option<String>,
        leaderboard_mode: Option<String>,
        icon_media: Option<swagger::ByteArray>,
        icon_asset_id: Option<i64>,
        banner_media: Option<swagger::ByteArray>,
        banner_asset_id: Option<i64>,
        limitation: Option<i32>,
        sort_field: Option<String>,
        title: Option<String>,
        description: Option<String>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateLeaderboardResponse, ApiError>
    {
        info!("create_leaderboard({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, rank_type, leaderboard_mode, icon_media, icon_asset_id, banner_media, banner_asset_id, limitation, sort_field, title, description, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete the Leader Board
    async fn delete_leaderboard(
        &self,
        version: f64,
        leaderboard_id: i64,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteLeaderboardResponse, ApiError>
    {
        info!("delete_leaderboard({}, {}, {:?}) - X-Span-ID: {:?}", version, leaderboard_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Read a leaderboard by id and retrieve the matching ranking list
    async fn get_leaderboard(
        &self,
        version: f64,
        leaderboard_id: i64,
        account_id: Option<i64>,
        include_full_ranking_list: Option<bool>,
        context: &C) -> Result<GetLeaderboardResponse, ApiError>
    {
        info!("get_leaderboard({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, leaderboard_id, account_id, include_full_ranking_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search leaderboard and retrieve the matching ranking list
    async fn search_leaderboards(
        &self,
        version: f64,
        account_id: Option<i64>,
        app_key: Option<String>,
        global_only: Option<bool>,
        keyword: Option<String>,
        leaderboard_ids: Option<String>,
        rank_types: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        include_inactive: Option<bool>,
        include_app_response: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchLeaderboardsResponse, ApiError>
    {
        info!("search_leaderboards({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, global_only, keyword, leaderboard_ids, rank_types, sort_field, descending, include_inactive, include_app_response, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation
    async fn update_leaderboard(
        &self,
        version: f64,
        leaderboard_id: i64,
        account_id: Option<i64>,
        app_key: Option<String>,
        rank_type: Option<String>,
        leaderboard_mode: Option<String>,
        sort_field: Option<String>,
        icon_media: Option<swagger::ByteArray>,
        icon_asset_id: Option<i64>,
        banner_media: Option<swagger::ByteArray>,
        banner_asset_id: Option<i64>,
        limitation: Option<i32>,
        active: Option<bool>,
        title: Option<String>,
        description: Option<String>,
        meta_data: Option<String>,
        context: &C) -> Result<UpdateLeaderboardResponse, ApiError>
    {
        info!("update_leaderboard({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, leaderboard_id, account_id, app_key, rank_type, leaderboard_mode, sort_field, icon_media, icon_asset_id, banner_media, banner_asset_id, limitation, active, title, description, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Like
    async fn register_like(
        &self,
        version: f64,
        likable_type: String,
        likable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        permissionable_type: Option<String>,
        permissionable_id: Option<i64>,
        like: Option<bool>,
        app: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RegisterLikeResponse, ApiError>
    {
        info!("register_like({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, likable_type, likable_id, device_id, account_id, permissionable_type, permissionable_id, like, app, game_type, app_key, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Like
    async fn remove_like(
        &self,
        version: f64,
        likable_type: String,
        likable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveLikeResponse, ApiError>
    {
        info!("remove_like({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, likable_type, likable_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Likes
    async fn search_likes(
        &self,
        version: f64,
        likable_type: String,
        likable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_ids: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        updated_since: Option<i64>,
        updated_before: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchLikesResponse, ApiError>
    {
        info!("search_likes({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, likable_type, likable_id, device_id, account_id, connection_account_ids, sort_field, descending, updated_since, updated_before, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Listing
    async fn create_listing(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        filter_ids: Option<String>,
        description: Option<String>,
        start: Option<i64>,
        end: Option<i64>,
        location_name: Option<String>,
        location_description: Option<String>,
        is_private: Option<bool>,
        external_id: Option<String>,
        external_id2: Option<String>,
        external_group_id: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateListingResponse, ApiError>
    {
        info!("create_listing({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, filter_ids, description, start, end, location_name, location_description, is_private, external_id, external_id2, external_group_id, active, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Listing
    async fn delete_listing(
        &self,
        version: f64,
        account_id: i64,
        listing_id: i64,
        context: &C) -> Result<DeleteListingResponse, ApiError>
    {
        info!("delete_listing({}, {}, {}) - X-Span-ID: {:?}", version, account_id, listing_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Listing
    async fn get_listing(
        &self,
        version: f64,
        listing_id: i64,
        context: &C) -> Result<GetListingResponse, ApiError>
    {
        info!("get_listing({}, {}) - X-Span-ID: {:?}", version, listing_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Listings
    async fn search_listing(
        &self,
        version: f64,
        account_id: Option<i64>,
        keyword: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        use_listing_order_ids: Option<bool>,
        external_id: Option<String>,
        external_id2: Option<String>,
        external_group_id: Option<String>,
        context: &C) -> Result<SearchListingResponse, ApiError>
    {
        info!("search_listing({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, start, limit, active_only, latitude, longitude, start_date, end_date, category_ids, filter_ids, use_listing_order_ids, external_id, external_id2, external_group_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Summary Listing
    async fn summary_listing(
        &self,
        version: f64,
        account_id: Option<i64>,
        start_date: Option<i64>,
        category_ids: Option<String>,
        days_to_include: Option<i32>,
        use_listing_order_ids: Option<bool>,
        context: &C) -> Result<SummaryListingResponse, ApiError>
    {
        info!("summary_listing({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, start_date, category_ids, days_to_include, use_listing_order_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Listing
    async fn update_listing(
        &self,
        version: f64,
        account_id: i64,
        listing_id: i64,
        filter_ids: Option<String>,
        name: Option<String>,
        description: Option<String>,
        start: Option<i64>,
        end: Option<i64>,
        location_name: Option<String>,
        location_description: Option<String>,
        is_private: Option<bool>,
        external_id: Option<String>,
        external_id2: Option<String>,
        external_group_id: Option<String>,
        active: Option<bool>,
        meta_data: Option<String>,
        context: &C) -> Result<UpdateListingResponse, ApiError>
    {
        info!("update_listing({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, listing_id, filter_ids, name, description, start, end, location_name, location_description, is_private, external_id, external_id2, external_group_id, active, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Trilateration Data with File
    async fn cache_trilateration_data(
        &self,
        version: f64,
        udid: String,
        source_time: Option<i64>,
        minimum_sample_size: Option<i32>,
        data: Option<String>,
        data_file: Option<swagger::ByteArray>,
        context: &C) -> Result<CacheTrilaterationDataResponse, ApiError>
    {
        info!("cache_trilateration_data({}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, udid, source_time, minimum_sample_size, data, data_file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Trilateration Data with Rest
    async fn cache_trilateration_data_gzip(
        &self,
        version: f64,
        body: Option<models::TrilatCacheRequest>,
        context: &C) -> Result<CacheTrilaterationDataGzipResponse, ApiError>
    {
        info!("cache_trilateration_data_gzip({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Location by IP
    async fn get_location_by_ip(
        &self,
        version: f64,
        ip: Option<String>,
        context: &C) -> Result<GetLocationByIpResponse, ApiError>
    {
        info!("get_location_by_ip({}, {:?}) - X-Span-ID: {:?}", version, ip, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Location by Trilateration
    async fn get_location_by_trilateration(
        &self,
        version: f64,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        data: Option<String>,
        response_filters: Option<String>,
        context: &C) -> Result<GetLocationByTrilaterationResponse, ApiError>
    {
        info!("get_location_by_trilateration({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, latitude, longitude, data, response_filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Regions or Postal Codes
    async fn get_locations(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        currentlatitude: Option<f64>,
        currentlongitude: Option<f64>,
        current_latitude: Option<f64>,
        current_longitude: Option<f64>,
        query: Option<String>,
        zipcode: Option<String>,
        zip_code: Option<String>,
        selected_maplatitude: Option<f64>,
        selected_maplongitude: Option<f64>,
        selected_map_latitude: Option<f64>,
        selected_map_longitude: Option<f64>,
        search_range: Option<f64>,
        use_geocode: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetLocationsResponse, ApiError>
    {
        info!("get_locations({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, currentlatitude, currentlongitude, current_latitude, current_longitude, query, zipcode, zip_code, selected_maplatitude, selected_maplongitude, selected_map_latitude, selected_map_longitude, search_range, use_geocode, _i, start, _l, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create new location
    async fn create_location_v2(
        &self,
        version: f64,
        body: Option<models::Location>,
        context: &C) -> Result<CreateLocationV2Response, ApiError>
    {
        info!("create_location_v2({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update an existing location
    async fn update_location_v2(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Location>,
        context: &C) -> Result<UpdateLocationV2Response, ApiError>
    {
        info!("update_location_v2({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Media
    async fn create_media(
        &self,
        version: f64,
        account_id: i64,
        title: String,
        barcode_type: models::CreateMediaBarcodeTypeParameter,
        no_expiration: bool,
        available_limit: i32,
        available_limit_per_user: i32,
        added_limit: i32,
        view_limit: i32,
        max_prints: i32,
        ticket_price: i64,
        full_price: f64,
        discount_price: f64,
        special_offer_type: models::CreateMediaSpecialOfferTypeParameter,
        offer_visibility: models::CreateMediaOfferVisibilityParameter,
        active: bool,
        retailer_location_ids: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        sub_details: Option<String>,
        fine_print: Option<String>,
        barcode_entry: Option<String>,
        external_redeem_options: Option<String>,
        external_url: Option<String>,
        tickets_reward_type: Option<String>,
        tickets_reward: Option<i64>,
        activated: Option<i64>,
        expires: Option<i64>,
        ticket_price_type: Option<String>,
        show_remaining: Option<bool>,
        show_redeemed: Option<bool>,
        replaced: Option<bool>,
        featured: Option<bool>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        barcode_asset_id: Option<i64>,
        image_asset_id: Option<i64>,
        image_asset_id1: Option<i64>,
        image_asset_id2: Option<i64>,
        image_asset_id3: Option<i64>,
        image_asset_id4: Option<i64>,
        image_asset_id5: Option<i64>,
        publisher: Option<String>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        condition_type: Option<models::CreateMediaConditionTypeParameter>,
        isbn: Option<String>,
        asin: Option<String>,
        catalog_numbers: Option<String>,
        parental_rating: Option<String>,
        availability_date: Option<i64>,
        media_type: Option<models::CreateMediaMediaTypeParameter>,
        duration: Option<i32>,
        author: Option<String>,
        release_date: Option<i64>,
        collection_ids: Option<String>,
        availability: Option<String>,
        availability_summary: Option<String>,
        context: &C) -> Result<CreateMediaResponse, ApiError>
    {
        info!("create_media({}, {}, \"{}\", {:?}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, title, barcode_type, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price, full_price, discount_price, special_offer_type, offer_visibility, active, retailer_location_ids, sub_title, details, sub_details, fine_print, barcode_entry, external_redeem_options, external_url, tickets_reward_type, tickets_reward, activated, expires, ticket_price_type, show_remaining, show_redeemed, replaced, featured, category_ids, filter_ids, barcode_asset_id, image_asset_id, image_asset_id1, image_asset_id2, image_asset_id3, image_asset_id4, image_asset_id5, publisher, redeemable_start, redeemable_end, condition_type, isbn, asin, catalog_numbers, parental_rating, availability_date, media_type, duration, author, release_date, collection_ids, availability, availability_summary, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Media
    async fn delete_media(
        &self,
        version: f64,
        account_id: i64,
        media_id: i64,
        context: &C) -> Result<DeleteMediaResponse, ApiError>
    {
        info!("delete_media({}, {}, {}) - X-Span-ID: {:?}", version, account_id, media_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Media Get
    async fn get_media(
        &self,
        version: f64,
        account_id: i64,
        media_id: i64,
        context: &C) -> Result<GetMediaResponse, ApiError>
    {
        info!("get_media({}, {}, {}) - X-Span-ID: {:?}", version, account_id, media_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Media
    async fn search_media(
        &self,
        version: f64,
        account_id: i64,
        active_only: bool,
        sort_field: models::SearchEventsSortFieldParameter,
        descending: bool,
        keyword: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchMediaResponse, ApiError>
    {
        info!("search_media({}, {}, {}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, active_only, sort_field, descending, keyword, category_ids, filter_ids, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Media
    async fn update_media(
        &self,
        version: f64,
        account_id: i64,
        media_id: i64,
        retailer_location_ids: Option<String>,
        offer_locations: Option<String>,
        title: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        sub_details: Option<String>,
        fine_print: Option<String>,
        barcode_type: Option<models::CreateMediaBarcodeTypeParameter>,
        barcode_entry: Option<String>,
        external_redeem_options: Option<String>,
        external_url: Option<String>,
        tickets_reward_type: Option<String>,
        tickets_reward: Option<i64>,
        activated: Option<i64>,
        expires: Option<i64>,
        no_expiration: Option<bool>,
        available_limit: Option<i32>,
        available_limit_per_user: Option<i32>,
        added_limit: Option<i32>,
        view_limit: Option<i32>,
        max_prints: Option<i32>,
        ticket_price_type: Option<String>,
        ticket_price: Option<i64>,
        full_price: Option<f64>,
        discount_price: Option<f64>,
        show_remaining: Option<bool>,
        show_redeemed: Option<bool>,
        replaced: Option<bool>,
        featured: Option<bool>,
        special_offer_type: Option<models::CreateMediaSpecialOfferTypeParameter>,
        offer_visibility: Option<models::CreateMediaOfferVisibilityParameter>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        active: Option<bool>,
        barcode_asset_id: Option<i64>,
        image_asset_id: Option<i64>,
        image_asset_id1: Option<i64>,
        image_asset_id2: Option<i64>,
        image_asset_id3: Option<i64>,
        image_asset_id4: Option<i64>,
        image_asset_id5: Option<i64>,
        publisher: Option<String>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        condition_type: Option<models::CreateMediaConditionTypeParameter>,
        isbn: Option<String>,
        asin: Option<String>,
        catalog_numbers: Option<String>,
        availability_date: Option<i64>,
        parental_rating: Option<String>,
        media_type: Option<models::CreateMediaMediaTypeParameter>,
        duration: Option<i32>,
        author: Option<String>,
        release_date: Option<i64>,
        collection_ids: Option<String>,
        availability: Option<String>,
        availability_summary: Option<String>,
        context: &C) -> Result<UpdateMediaResponse, ApiError>
    {
        info!("update_media({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, media_id, retailer_location_ids, offer_locations, title, sub_title, details, sub_details, fine_print, barcode_type, barcode_entry, external_redeem_options, external_url, tickets_reward_type, tickets_reward, activated, expires, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price_type, ticket_price, full_price, discount_price, show_remaining, show_redeemed, replaced, featured, special_offer_type, offer_visibility, category_ids, filter_ids, active, barcode_asset_id, image_asset_id, image_asset_id1, image_asset_id2, image_asset_id3, image_asset_id4, image_asset_id5, publisher, redeemable_start, redeemable_end, condition_type, isbn, asin, catalog_numbers, availability_date, parental_rating, media_type, duration, author, release_date, collection_ids, availability, availability_summary, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Mission
    async fn create_mission(
        &self,
        version: f64,
        account_id: i64,
        title: String,
        description: Option<String>,
        sub_type: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        active: Option<bool>,
        game_level_ids: Option<String>,
        creative_ids: Option<String>,
        audience_ids: Option<String>,
        mission_task: Option<String>,
        format_type: Option<String>,
        offer_id: Option<i64>,
        balance: Option<f64>,
        advanced_reporting: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_count: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        meta_data: Option<String>,
        application_ids: Option<String>,
        devices: Option<String>,
        device_ids: Option<String>,
        device_versions: Option<String>,
        locations: Option<String>,
        radius: Option<String>,
        context: &C) -> Result<CreateMissionResponse, ApiError>
    {
        info!("create_mission({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, title, description, sub_type, start_date, end_date, active, game_level_ids, creative_ids, audience_ids, mission_task, format_type, offer_id, balance, advanced_reporting, allocate_tickets, ticket_count, ticket_type, points, meta_data, application_ids, devices, device_ids, device_versions, locations, radius, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Mission
    async fn delete_mission(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        context: &C) -> Result<DeleteMissionResponse, ApiError>
    {
        info!("delete_mission({}, {}, {}) - X-Span-ID: {:?}", version, account_id, mission_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Find Missions
    async fn find_missions(
        &self,
        version: f64,
        app_key: String,
        suffix: Option<String>,
        param_type: Option<String>,
        account_id: Option<i64>,
        app_version: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        device: Option<String>,
        device_identifier: Option<i64>,
        device_version: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        include_game_data: Option<bool>,
        include_audiences: Option<bool>,
        allocates_tickets: Option<bool>,
        randomize: Option<bool>,
        targeted_ads_only: Option<bool>,
        mission_ids: Option<String>,
        audience_operator: Option<String>,
        context: &C) -> Result<FindMissionsResponse, ApiError>
    {
        info!("find_missions({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, suffix, param_type, account_id, app_version, latitude, longitude, device, device_identifier, device_version, start, limit, include_game_data, include_audiences, allocates_tickets, randomize, targeted_ads_only, mission_ids, audience_operator, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Mission
    async fn get_mission(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        return_creative: Option<bool>,
        context: &C) -> Result<GetMissionResponse, ApiError>
    {
        info!("get_mission({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, mission_id, return_creative, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Import Mission
    async fn import_mission(
        &self,
        version: f64,
        account_id: i64,
        latitude: f64,
        longitude: f64,
        app_key: String,
        keyword: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        ad_size: Option<models::CreateApplicationPlacementSizeParameter>,
        context: &C) -> Result<ImportMissionResponse, ApiError>
    {
        info!("import_mission({}, {}, {}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, latitude, longitude, app_key, keyword, start, limit, ad_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Mission Formats
    async fn search_mission_formats(
        &self,
        version: f64,
        start: i32,
        limit: i32,
        active_only: bool,
        context: &C) -> Result<SearchMissionFormatsResponse, ApiError>
    {
        info!("search_mission_formats({}, {}, {}, {}) - X-Span-ID: {:?}", version, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Missions
    async fn search_missions(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        sub_type: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        include_game_data: Option<bool>,
        include_audiences: Option<bool>,
        include_inactive: Option<bool>,
        suffix: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        context: &C) -> Result<SearchMissionsResponse, ApiError>
    {
        info!("search_missions({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, sub_type, start, limit, include_game_data, include_audiences, include_inactive, suffix, sort_field, descending, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Missions by Billable Entity
    async fn search_missions_by_billable_entity(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        include_game_data: Option<bool>,
        include_audiences: Option<bool>,
        include_inactive: Option<bool>,
        suffix: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        context: &C) -> Result<SearchMissionsByBillableEntityResponse, ApiError>
    {
        info!("search_missions_by_billable_entity({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, start, limit, include_game_data, include_audiences, include_inactive, suffix, sort_field, descending, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Mission
    async fn update_mission(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        title: Option<String>,
        description: Option<String>,
        sub_type: Option<String>,
        meta_data: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        active: Option<bool>,
        game_level_ids: Option<String>,
        creative_ids: Option<String>,
        audience_ids: Option<String>,
        offer_id: Option<i64>,
        balance: Option<f64>,
        advanced_reporting: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_count: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        application_ids: Option<String>,
        devices: Option<String>,
        device_ids: Option<String>,
        device_versions: Option<String>,
        locations: Option<String>,
        radius: Option<String>,
        context: &C) -> Result<UpdateMissionResponse, ApiError>
    {
        info!("update_mission({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, mission_id, title, description, sub_type, meta_data, start_date, end_date, active, game_level_ids, creative_ids, audience_ids, offer_id, balance, advanced_reporting, allocate_tickets, ticket_count, ticket_type, points, application_ids, devices, device_ids, device_versions, locations, radius, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Mission Invite
    async fn create_mission_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        mission_id: Option<i64>,
        join_code: Option<String>,
        include_game_data: Option<bool>,
        context: &C) -> Result<CreateMissionInviteResponse, ApiError>
    {
        info!("create_mission_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, mission_id, join_code, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Mission Invite
    async fn delete_mission_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        mission_id: Option<i64>,
        mission_invite_id: Option<i64>,
        include_game_data: Option<bool>,
        context: &C) -> Result<DeleteMissionInviteResponse, ApiError>
    {
        info!("delete_mission_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, mission_id, mission_invite_id, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Mission Invite
    async fn get_mission_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        mission_id: Option<i64>,
        mission_invite_id: Option<i64>,
        include_game_data: Option<bool>,
        include_scores: Option<String>,
        context: &C) -> Result<GetMissionInviteResponse, ApiError>
    {
        info!("get_mission_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, mission_id, mission_invite_id, include_game_data, include_scores, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Mission Invites
    async fn search_mission_invites(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        app_version: Option<String>,
        mission_id: Option<i64>,
        status: Option<String>,
        last_updated: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        keyword: Option<String>,
        mission_types: Option<String>,
        filter_by_billable: Option<bool>,
        include_game_data: Option<bool>,
        context: &C) -> Result<SearchMissionInvitesResponse, ApiError>
    {
        info!("search_mission_invites({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, app_version, mission_id, status, last_updated, start, limit, keyword, mission_types, filter_by_billable, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Mission Invite
    async fn update_mission_invite(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        mission_id: Option<i64>,
        mission_invite_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        status: Option<String>,
        permissionable_type: Option<String>,
        permissionable_id: Option<i64>,
        include_game_data: Option<bool>,
        context: &C) -> Result<UpdateMissionInviteResponse, ApiError>
    {
        info!("update_mission_invite({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, mission_id, mission_invite_id, pack_id, game_level_id, status, permissionable_type, permissionable_id, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Batch Note Operation
    async fn batch_operation(
        &self,
        version: f64,
        notable_id: i64,
        notable_type: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        batch_operation: Option<String>,
        context: &C) -> Result<BatchOperationResponse, ApiError>
    {
        info!("batch_operation({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, notable_id, notable_type, device_id, account_id, batch_operation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Note
    async fn create_note(
        &self,
        version: f64,
        comment: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        notable_type: Option<String>,
        notable_id: Option<i64>,
        note_type: Option<String>,
        asset_ids: Option<String>,
        tags: Option<String>,
        permissionable_type: Option<String>,
        permissionable_id: Option<i64>,
        app_key: Option<String>,
        location_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        receiver_account_ids: Option<String>,
        return_full_response: Option<bool>,
        initialize_asset: Option<bool>,
        asset_return_nulls: Option<bool>,
        asset_album_id: Option<i64>,
        asset_collection_id: Option<i64>,
        asset_add_to_default_album: Option<String>,
        asset_add_to_media_library: Option<bool>,
        asset_version_code: Option<i32>,
        asset_version_name: Option<String>,
        asset_meta_data: Option<String>,
        asset_caption: Option<String>,
        asset_media: Option<swagger::ByteArray>,
        asset_media_url: Option<String>,
        asset_media_string: Option<String>,
        asset_media_string_file_name: Option<String>,
        asset_media_string_content_type: Option<String>,
        asset_attached_media: Option<swagger::ByteArray>,
        asset_attached_media_url: Option<String>,
        asset_attached_media_string: Option<String>,
        asset_attached_media_string_file_name: Option<String>,
        asset_attached_media_string_content_type: Option<String>,
        asset_location_description: Option<String>,
        asset_app: Option<String>,
        asset_search_tags: Option<String>,
        asset_latitude: Option<f64>,
        asset_longitude: Option<f64>,
        context: &C) -> Result<CreateNoteResponse, ApiError>
    {
        info!("create_note({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, comment, device_id, account_id, notable_type, notable_id, note_type, asset_ids, tags, permissionable_type, permissionable_id, app_key, location_description, latitude, longitude, meta_data, receiver_account_ids, return_full_response, initialize_asset, asset_return_nulls, asset_album_id, asset_collection_id, asset_add_to_default_album, asset_add_to_media_library, asset_version_code, asset_version_name, asset_meta_data, asset_caption, asset_media, asset_media_url, asset_media_string, asset_media_string_file_name, asset_media_string_content_type, asset_attached_media, asset_attached_media_url, asset_attached_media_string, asset_attached_media_string_file_name, asset_attached_media_string_content_type, asset_location_description, asset_app, asset_search_tags, asset_latitude, asset_longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Note
    async fn delete_note(
        &self,
        version: f64,
        note_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        app_key: Option<String>,
        context: &C) -> Result<DeleteNoteResponse, ApiError>
    {
        info!("delete_note({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, note_id, device_id, account_id, latitude, longitude, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Note
    async fn get_note(
        &self,
        version: f64,
        note_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        return_full_response: Option<bool>,
        context: &C) -> Result<GetNoteResponse, ApiError>
    {
        info!("get_note({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, note_id, device_id, account_id, return_full_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Notes
    async fn search_notes(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        notable_type: Option<String>,
        notable_id: Option<i64>,
        note_types: Option<String>,
        app_key: Option<String>,
        keyword: Option<String>,
        flag_count_minimum: Option<i64>,
        flags_exceed_threshold: Option<bool>,
        include_inactive: Option<bool>,
        sort_field: Option<models::SearchNotesSortFieldParameter>,
        descending: Option<bool>,
        return_full_response: Option<bool>,
        updated_since: Option<i64>,
        updated_before: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchNotesResponse, ApiError>
    {
        info!("search_notes({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, notable_type, notable_id, note_types, app_key, keyword, flag_count_minimum, flags_exceed_threshold, include_inactive, sort_field, descending, return_full_response, updated_since, updated_before, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Note
    async fn update_note(
        &self,
        version: f64,
        note_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        comment: Option<String>,
        note_type: Option<String>,
        asset_ids: Option<String>,
        tags: Option<String>,
        permissionable_type: Option<String>,
        permissionable_id: Option<i64>,
        app_key: Option<String>,
        location_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        return_full_response: Option<bool>,
        active: Option<bool>,
        update_asset: Option<bool>,
        asset_return_nulls: Option<bool>,
        asset_album_id: Option<i64>,
        asset_collection_id: Option<i64>,
        asset_add_to_default_album: Option<String>,
        asset_add_to_media_library: Option<bool>,
        asset_version_code: Option<i32>,
        asset_version_name: Option<String>,
        asset_meta_data: Option<String>,
        asset_caption: Option<String>,
        asset_media: Option<swagger::ByteArray>,
        asset_media_url: Option<String>,
        asset_media_string: Option<String>,
        asset_media_string_file_name: Option<String>,
        asset_media_string_content_type: Option<String>,
        asset_attached_media: Option<swagger::ByteArray>,
        asset_attached_media_url: Option<String>,
        asset_attached_media_string: Option<String>,
        asset_attached_media_string_file_name: Option<String>,
        asset_attached_media_string_content_type: Option<String>,
        asset_location_description: Option<String>,
        asset_app: Option<String>,
        asset_search_tags: Option<String>,
        asset_latitude: Option<f64>,
        asset_longitude: Option<f64>,
        context: &C) -> Result<UpdateNoteResponse, ApiError>
    {
        info!("update_note({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, note_id, device_id, account_id, comment, note_type, asset_ids, tags, permissionable_type, permissionable_id, app_key, location_description, latitude, longitude, meta_data, return_full_response, active, update_asset, asset_return_nulls, asset_album_id, asset_collection_id, asset_add_to_default_album, asset_add_to_media_library, asset_version_code, asset_version_name, asset_meta_data, asset_caption, asset_media, asset_media_url, asset_media_string, asset_media_string_file_name, asset_media_string_content_type, asset_attached_media, asset_attached_media_url, asset_attached_media_string, asset_attached_media_string_file_name, asset_attached_media_string_content_type, asset_location_description, asset_app, asset_search_tags, asset_latitude, asset_longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Notification Template
    async fn create_notification_template(
        &self,
        version: f64,
        account_id: i64,
        conduit: String,
        title: String,
        body: String,
        app_key: Option<String>,
        event: Option<String>,
        tags: Option<String>,
        context: &C) -> Result<CreateNotificationTemplateResponse, ApiError>
    {
        info!("create_notification_template({}, {}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, conduit, title, body, app_key, event, tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create or update blocked notification settings
    async fn create_or_update_blocked_notifications(
        &self,
        version: f64,
        app_key: String,
        data: String,
        account_id: Option<i64>,
        context: &C) -> Result<CreateOrUpdateBlockedNotificationsResponse, ApiError>
    {
        info!("create_or_update_blocked_notifications({}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, app_key, data, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Notification Template
    async fn delete_notification_template(
        &self,
        version: f64,
        account_id: i64,
        notification_template_id: i64,
        context: &C) -> Result<DeleteNotificationTemplateResponse, ApiError>
    {
        info!("delete_notification_template({}, {}, {}) - X-Span-ID: {:?}", version, account_id, notification_template_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Notification Template
    async fn get_notification_template(
        &self,
        version: f64,
        account_id: i64,
        notification_template_id: i64,
        context: &C) -> Result<GetNotificationTemplateResponse, ApiError>
    {
        info!("get_notification_template({}, {}, {}) - X-Span-ID: {:?}", version, account_id, notification_template_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Notifications
    async fn get_notifications(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        app_key: Option<String>,
        event_type: Option<String>,
        content_ids: Option<String>,
        content_types: Option<String>,
        parent_ids: Option<String>,
        parent_types: Option<String>,
        action_category: Option<String>,
        conduits: Option<String>,
        keyword: Option<String>,
        return_read_messages: Option<bool>,
        mark_as_read: Option<bool>,
        from_date: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_sent: Option<bool>,
        ignore_flagged: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetNotificationsResponse, ApiError>
    {
        info!("get_notifications({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, connection_account_id, app_key, event_type, content_ids, content_types, parent_ids, parent_types, action_category, conduits, keyword, return_read_messages, mark_as_read, from_date, latitude, longitude, return_sent, ignore_flagged, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Register Notification Token
    async fn register_notification_token(
        &self,
        version: f64,
        token: String,
        push_type: models::RegisterNotificationTokenPushTypeParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        environment: Option<String>,
        app_key: Option<String>,
        game_type: Option<String>,
        active: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RegisterNotificationTokenResponse, ApiError>
    {
        info!("register_notification_token({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, token, push_type, device_id, account_id, environment, app_key, game_type, active, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search on the user's blocked notification settings
    async fn search_blocked_notifications(
        &self,
        version: f64,
        app_key: String,
        account_id: Option<i64>,
        search_tags: Option<String>,
        events: Option<String>,
        conduits: Option<String>,
        custom_types: Option<String>,
        content_types: Option<String>,
        content_ids: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchBlockedNotificationsResponse, ApiError>
    {
        info!("search_blocked_notifications({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, account_id, search_tags, events, conduits, custom_types, content_types, content_ids, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Notification Templates
    async fn search_notification_template(
        &self,
        version: f64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        app_key: Option<String>,
        event: Option<String>,
        conduit: Option<String>,
        global_only: Option<bool>,
        reserved_only: Option<bool>,
        keyword: Option<String>,
        context: &C) -> Result<SearchNotificationTemplateResponse, ApiError>
    {
        info!("search_notification_template({}, {}, \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, start, limit, app_key, event, conduit, global_only, reserved_only, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search for Recipients
    async fn search_recipients(
        &self,
        version: f64,
        sort_field: models::SearchRecipientsSortFieldParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        conduit: Option<String>,
        keyword: Option<String>,
        audience_id: Option<i64>,
        audience_ids: Option<String>,
        connection_group_ids: Option<String>,
        recipient_account_ids: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRecipientsResponse, ApiError>
    {
        info!("search_recipients({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, device_id, account_id, app_key, conduit, keyword, audience_id, audience_ids, connection_group_ids, recipient_account_ids, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search for Recipients (Counts/Grouped)
    async fn search_recipients_count(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        conduit: Option<String>,
        keyword: Option<String>,
        audience_id: Option<i64>,
        audience_ids: Option<String>,
        connection_group_ids: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRecipientsCountResponse, ApiError>
    {
        info!("search_recipients_count({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, conduit, keyword, audience_id, audience_ids, connection_group_ids, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Batch Notifications
    async fn send_batch_notifications(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        custom_message: String,
        conduit: Option<String>,
        content_id: Option<i64>,
        content_name: Option<String>,
        content_type: Option<String>,
        parent_id: Option<i64>,
        parent_type: Option<String>,
        context: &C) -> Result<SendBatchNotificationsResponse, ApiError>
    {
        info!("send_batch_notifications({}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, custom_message, conduit, content_id, content_name, content_type, parent_id, parent_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Custom Notifications
    async fn send_custom_notifications(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        receiver_account_ids: Option<String>,
        include_friend_group: Option<bool>,
        app_key: Option<String>,
        game_type: Option<String>,
        conduit: Option<String>,
        content_id: Option<i64>,
        content_name: Option<String>,
        content_type: Option<String>,
        parent_id: Option<i64>,
        parent_type: Option<String>,
        action_category: Option<String>,
        subject: Option<String>,
        custom_message: Option<String>,
        friend_only_apns: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<SendCustomNotificationsResponse, ApiError>
    {
        info!("send_custom_notifications({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, receiver_account_ids, include_friend_group, app_key, game_type, conduit, content_id, content_name, content_type, parent_id, parent_type, action_category, subject, custom_message, friend_only_apns, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Notification Template
    async fn update_notification_template(
        &self,
        version: f64,
        account_id: i64,
        notification_template_id: i64,
        title: Option<String>,
        body: Option<String>,
        tags: Option<String>,
        context: &C) -> Result<UpdateNotificationTemplateResponse, ApiError>
    {
        info!("update_notification_template({}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, notification_template_id, title, body, tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Field
    async fn add_field(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        object_name: String,
        field_name: String,
        field_type: String,
        context: &C) -> Result<AddFieldResponse, ApiError>
    {
        info!("add_field({}, {}, \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, object_name, field_name, field_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Object
    async fn create_object(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        object_name: String,
        context: &C) -> Result<CreateObjectResponse, ApiError>
    {
        info!("create_object({}, {}, \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, object_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Field
    async fn delete_field(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        object_name: String,
        field_name: String,
        context: &C) -> Result<DeleteFieldResponse, ApiError>
    {
        info!("delete_field({}, {}, \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, object_name, field_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Object
    async fn delete_object(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        object_name: String,
        context: &C) -> Result<DeleteObjectResponse, ApiError>
    {
        info!("delete_object({}, {}, \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, object_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Object
    async fn get_object(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        object_name: String,
        context: &C) -> Result<GetObjectResponse, ApiError>
    {
        info!("get_object({}, {}, \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, object_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Objects
    async fn search_object(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        start: i64,
        limit: i64,
        keyword: Option<String>,
        context: &C) -> Result<SearchObjectResponse, ApiError>
    {
        info!("search_object({}, {}, \"{}\", {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, start, limit, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Data
    async fn create_data(
        &self,
        version: f64,
        object_name: String,
        account_id: Option<i64>,
        body: Option<String>,
        context: &C) -> Result<CreateDataResponse, ApiError>
    {
        info!("create_data({}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, object_name, account_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Data
    async fn search_data(
        &self,
        version: f64,
        object_name: String,
        count: bool,
        start: i64,
        limit: i64,
        account_id: Option<i64>,
        criteria: Option<String>,
        order: Option<String>,
        include: Option<String>,
        context: &C) -> Result<SearchDataResponse, ApiError>
    {
        info!("search_data({}, \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, object_name, count, start, limit, account_id, criteria, order, include, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Data
    async fn delete_data(
        &self,
        version: f64,
        object_name: String,
        object_id: String,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteDataResponse, ApiError>
    {
        info!("delete_data({}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, object_name, object_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Data
    async fn get_data(
        &self,
        version: f64,
        object_name: String,
        object_id: String,
        account_id: Option<i64>,
        include: Option<String>,
        context: &C) -> Result<GetDataResponse, ApiError>
    {
        info!("get_data({}, \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, object_name, object_id, account_id, include, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Data
    async fn update_data(
        &self,
        version: f64,
        object_name: String,
        object_id: String,
        account_id: Option<i64>,
        body: Option<String>,
        context: &C) -> Result<UpdateDataResponse, ApiError>
    {
        info!("update_data({}, \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, object_name, object_id, account_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Offer Locations
    async fn batch_update_offer_locations(
        &self,
        version: f64,
        data: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<BatchUpdateOfferLocationsResponse, ApiError>
    {
        info!("batch_update_offer_locations({}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, data, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Offer
    async fn create_offer(
        &self,
        version: f64,
        include_offer_locations: bool,
        title: String,
        barcode_type: models::CreateMediaBarcodeTypeParameter,
        no_expiration: bool,
        available_limit: i32,
        available_limit_per_user: i32,
        added_limit: i32,
        view_limit: i32,
        max_prints: i32,
        ticket_price: i64,
        full_price: f64,
        discount_price: f64,
        offer_type: models::CreateOfferOfferTypeParameter,
        special_offer_type: models::CreateMediaSpecialOfferTypeParameter,
        offer_visibility: models::CreateMediaOfferVisibilityParameter,
        active: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        tags: Option<String>,
        parent_offer_id: Option<i64>,
        retailer_location_ids: Option<String>,
        offer_locations: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        sub_details: Option<String>,
        fine_print: Option<String>,
        barcode_entry: Option<String>,
        external_redeem_options: Option<String>,
        external_url: Option<String>,
        external_id: Option<String>,
        tickets_reward_type: Option<String>,
        tickets_reward: Option<i64>,
        activated: Option<i64>,
        expires: Option<i64>,
        ticket_price_type: Option<String>,
        show_remaining: Option<bool>,
        show_redeemed: Option<bool>,
        replaced: Option<bool>,
        featured: Option<bool>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        barcode_asset_id: Option<i64>,
        image_asset_id: Option<i64>,
        image_asset_id1: Option<i64>,
        image_asset_id2: Option<i64>,
        image_asset_id3: Option<i64>,
        image_asset_id4: Option<i64>,
        image_asset_id5: Option<i64>,
        publisher: Option<String>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        brand: Option<String>,
        product_type: Option<models::CreateOfferProductTypeParameter>,
        condition_type: Option<models::CreateMediaConditionTypeParameter>,
        isbn: Option<String>,
        asin: Option<String>,
        catalog_numbers: Option<String>,
        department: Option<String>,
        features: Option<String>,
        minimum_price: Option<f64>,
        width: Option<f64>,
        height: Option<f64>,
        depth: Option<f64>,
        weight: Option<f64>,
        unit: Option<models::CreateOfferUnitParameter>,
        studio: Option<String>,
        parental_rating: Option<String>,
        publish_date: Option<i64>,
        availability_date: Option<i64>,
        size_id: Option<i64>,
        listing_id: Option<i64>,
        media_type: Option<models::CreateMediaMediaTypeParameter>,
        duration: Option<i32>,
        author: Option<String>,
        release_date: Option<i64>,
        collection_ids: Option<String>,
        reboot_time_hour: Option<i32>,
        reboot_time_minute: Option<i32>,
        idle_timeout_in_second: Option<i32>,
        serial_number: Option<String>,
        udid: Option<String>,
        device_type: Option<String>,
        device_power: Option<f64>,
        device_interference: Option<f64>,
        availability: Option<String>,
        availability_summary: Option<String>,
        context: &C) -> Result<CreateOfferResponse, ApiError>
    {
        info!("create_offer({}, {}, \"{}\", {:?}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, include_offer_locations, title, barcode_type, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price, full_price, discount_price, offer_type, special_offer_type, offer_visibility, active, device_id, account_id, tags, parent_offer_id, retailer_location_ids, offer_locations, sub_title, details, sub_details, fine_print, barcode_entry, external_redeem_options, external_url, external_id, tickets_reward_type, tickets_reward, activated, expires, ticket_price_type, show_remaining, show_redeemed, replaced, featured, category_ids, filter_ids, barcode_asset_id, image_asset_id, image_asset_id1, image_asset_id2, image_asset_id3, image_asset_id4, image_asset_id5, publisher, redeemable_start, redeemable_end, brand, product_type, condition_type, isbn, asin, catalog_numbers, department, features, minimum_price, width, height, depth, weight, unit, studio, parental_rating, publish_date, availability_date, size_id, listing_id, media_type, duration, author, release_date, collection_ids, reboot_time_hour, reboot_time_minute, idle_timeout_in_second, serial_number, udid, device_type, device_power, device_interference, availability, availability_summary, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Offer
    async fn delete_offer(
        &self,
        version: f64,
        offer_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteOfferResponse, ApiError>
    {
        info!("delete_offer({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Offer Location
    async fn delete_offer_location(
        &self,
        version: f64,
        offer_location_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteOfferLocationResponse, ApiError>
    {
        info!("delete_offer_location({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_location_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offer
    async fn get_offer(
        &self,
        version: f64,
        offer_id: i64,
        include_offer_locations: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetOfferResponse, ApiError>
    {
        info!("get_offer({}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_id, include_offer_locations, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offer
    async fn get_offer_details(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        distance: Option<f64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        include_offer_locations: Option<bool>,
        include_retailer_locations: Option<bool>,
        include_child_offers: Option<bool>,
        context: &C) -> Result<GetOfferDetailsResponse, ApiError>
    {
        info!("get_offer_details({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, offer_id, offer_location_id, distance, latitude, longitude, include_offer_locations, include_retailer_locations, include_child_offers, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offers (Counts)
    async fn get_offer_list_counts(
        &self,
        version: f64,
        latitude: f64,
        longitude: f64,
        search_range: Option<f64>,
        distance_unit: Option<models::GetOfferListCountsDistanceUnitParameter>,
        context: &C) -> Result<GetOfferListCountsResponse, ApiError>
    {
        info!("get_offer_list_counts({}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, latitude, longitude, search_range, distance_unit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offer Location
    async fn get_offer_location(
        &self,
        version: f64,
        offer_location_id: Option<i64>,
        udid: Option<String>,
        context: &C) -> Result<GetOfferLocationResponse, ApiError>
    {
        info!("get_offer_location({}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_location_id, udid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offer Locations
    async fn get_offer_locations_for_retailers(
        &self,
        version: f64,
        sort_field: models::SearchOffersForConsumerGroupByParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        include_retailer_location: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        offer_type: Option<models::CreateOfferOfferTypeParameter>,
        special_offer_type: Option<models::CreateMediaSpecialOfferTypeParameter>,
        barcode_type: Option<String>,
        barcode_entry: Option<String>,
        isbn: Option<String>,
        asin: Option<String>,
        device_status: Option<models::GetOfferLocationsForRetailersDeviceStatusParameter>,
        needs_notification_sent: Option<bool>,
        last_notification_sent: Option<i64>,
        context: &C) -> Result<GetOfferLocationsForRetailersResponse, ApiError>
    {
        info!("get_offer_locations_for_retailers({}, {:?}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, include_retailer_location, device_id, account_id, keyword, retailer_id, retailer_location_id, offer_type, special_offer_type, barcode_type, barcode_entry, isbn, asin, device_status, needs_notification_sent, last_notification_sent, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offers
    async fn get_offers_for_retailers(
        &self,
        version: f64,
        offer_visibility: models::CreateMediaOfferVisibilityParameter,
        sort_field: models::SearchEventsSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        available_only: bool,
        active_only: bool,
        include_categories: bool,
        include_filters: bool,
        include_offer_locations: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        q: Option<String>,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        coupon_type: Option<models::CreateOfferOfferTypeParameter>,
        offer_type: Option<models::CreateOfferOfferTypeParameter>,
        offer_types: Option<String>,
        special_offer_type: Option<models::CreateMediaSpecialOfferTypeParameter>,
        _i: Option<i32>,
        _l: Option<i32>,
        barcode_type: Option<String>,
        barcode_entry: Option<String>,
        isbn: Option<String>,
        asin: Option<String>,
        device_status: Option<models::GetOfferLocationsForRetailersDeviceStatusParameter>,
        needs_notification_sent: Option<bool>,
        last_notification_sent: Option<i64>,
        context: &C) -> Result<GetOffersForRetailersResponse, ApiError>
    {
        info!("get_offers_for_retailers({}, {:?}, {:?}, {}, {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_visibility, sort_field, descending, start, limit, available_only, active_only, include_categories, include_filters, include_offer_locations, device_id, account_id, category_ids, filter_ids, q, keyword, retailer_id, retailer_location_id, coupon_type, offer_type, offer_types, special_offer_type, _i, _l, barcode_type, barcode_entry, isbn, asin, device_status, needs_notification_sent, last_notification_sent, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Offer Transaction
    async fn redeem_offer_transaction(
        &self,
        version: f64,
        offer_transaction_id: i64,
        status: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        offer_location_id: Option<i64>,
        context: &C) -> Result<RedeemOfferTransactionResponse, ApiError>
    {
        info!("redeem_offer_transaction({}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_transaction_id, status, device_id, account_id, offer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offer Transactions
    async fn search_offer_transactions_for_retailers(
        &self,
        version: f64,
        sort_field: models::SearchEventTransactionsSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        retailer_location_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        redeemed: Option<bool>,
        reservations_only: Option<bool>,
        coupon_type: Option<models::CreateOfferOfferTypeParameter>,
        offer_type: Option<models::CreateOfferOfferTypeParameter>,
        special_offer_type: Option<models::CreateMediaSpecialOfferTypeParameter>,
        customer_account_ids: Option<String>,
        category_ids: Option<String>,
        redeemable_start_date: Option<i64>,
        redeemable_end_date: Option<i64>,
        _i: Option<i32>,
        _l: Option<i32>,
        context: &C) -> Result<SearchOfferTransactionsForRetailersResponse, ApiError>
    {
        info!("search_offer_transactions_for_retailers({}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, device_id, account_id, q, keyword, retailer_id, retailer_location_id, offer_id, offer_location_id, redeemed, reservations_only, coupon_type, offer_type, special_offer_type, customer_account_ids, category_ids, redeemable_start_date, redeemable_end_date, _i, _l, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offers
    async fn search_offers_for_consumer(
        &self,
        version: f64,
        latitude: f64,
        longitude: f64,
        recommendation_type: models::SearchOffersForConsumerRecommendationTypeParameter,
        location_id: i64,
        start: i32,
        limit: i32,
        max_recommendations: i32,
        distance_unit: models::SearchOffersForConsumerDistanceUnitParameter,
        app_key: Option<String>,
        device_id: Option<String>,
        account_id: Option<i64>,
        search_range: Option<f64>,
        tags: Option<String>,
        supported_postal_codes: Option<String>,
        keyword: Option<String>,
        categories: Option<String>,
        filters: Option<String>,
        offer_types: Option<String>,
        param_type: Option<String>,
        sort_field: Option<String>,
        recommend_offer_ids: Option<String>,
        retailer_location_ids: Option<String>,
        offer_id: Option<i64>,
        include_mission: Option<bool>,
        include_categories: Option<bool>,
        include_filters: Option<bool>,
        include_expired: Option<bool>,
        include_favorite: Option<bool>,
        closest_offer_only: Option<bool>,
        search_expression: Option<String>,
        group_by: Option<models::SearchOffersForConsumerGroupByParameter>,
        context: &C) -> Result<SearchOffersForConsumerResponse, ApiError>
    {
        info!("search_offers_for_consumer({}, {}, {}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, latitude, longitude, recommendation_type, location_id, start, limit, max_recommendations, distance_unit, app_key, device_id, account_id, search_range, tags, supported_postal_codes, keyword, categories, filters, offer_types, param_type, sort_field, recommend_offer_ids, retailer_location_ids, offer_id, include_mission, include_categories, include_filters, include_expired, include_favorite, closest_offer_only, search_expression, group_by, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offers (Top)
    async fn top_offer_transactions(
        &self,
        version: f64,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<TopOfferTransactionsResponse, ApiError>
    {
        info!("top_offer_transactions({}, {:?}, {:?}) - X-Span-ID: {:?}", version, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Offer
    async fn update_offer(
        &self,
        version: f64,
        offer_id: i64,
        include_offer_locations: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        parent_offer_id: Option<i64>,
        retailer_location_ids: Option<String>,
        offer_locations: Option<String>,
        tags: Option<String>,
        title: Option<String>,
        sub_title: Option<String>,
        details: Option<String>,
        sub_details: Option<String>,
        fine_print: Option<String>,
        barcode_type: Option<models::CreateMediaBarcodeTypeParameter>,
        barcode_entry: Option<String>,
        external_redeem_options: Option<String>,
        external_url: Option<String>,
        external_id: Option<String>,
        tickets_reward_type: Option<String>,
        tickets_reward: Option<i64>,
        activated: Option<i64>,
        expires: Option<i64>,
        no_expiration: Option<bool>,
        available_limit: Option<i32>,
        available_limit_per_user: Option<i32>,
        added_limit: Option<i32>,
        view_limit: Option<i32>,
        max_prints: Option<i32>,
        ticket_price_type: Option<String>,
        ticket_price: Option<i64>,
        full_price: Option<f64>,
        discount_price: Option<f64>,
        show_remaining: Option<bool>,
        show_redeemed: Option<bool>,
        replaced: Option<bool>,
        featured: Option<bool>,
        offer_type: Option<models::CreateOfferOfferTypeParameter>,
        special_offer_type: Option<models::CreateMediaSpecialOfferTypeParameter>,
        offer_visibility: Option<models::CreateMediaOfferVisibilityParameter>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        active: Option<bool>,
        barcode_asset_id: Option<i64>,
        image_asset_id: Option<i64>,
        image_asset_id1: Option<i64>,
        image_asset_id2: Option<i64>,
        image_asset_id3: Option<i64>,
        image_asset_id4: Option<i64>,
        image_asset_id5: Option<i64>,
        publisher: Option<String>,
        redeemable_start: Option<i64>,
        redeemable_end: Option<i64>,
        brand: Option<String>,
        product_type: Option<models::CreateOfferProductTypeParameter>,
        condition_type: Option<models::CreateMediaConditionTypeParameter>,
        isbn: Option<String>,
        asin: Option<String>,
        catalog_numbers: Option<String>,
        department: Option<String>,
        features: Option<String>,
        minimum_price: Option<f64>,
        width: Option<f64>,
        height: Option<f64>,
        depth: Option<f64>,
        weight: Option<f64>,
        unit: Option<models::CreateOfferUnitParameter>,
        studio: Option<String>,
        parental_rating: Option<String>,
        publish_date: Option<i64>,
        availability_date: Option<i64>,
        size_id: Option<i64>,
        listing_id: Option<i64>,
        media_type: Option<models::CreateMediaMediaTypeParameter>,
        duration: Option<i32>,
        author: Option<String>,
        release_date: Option<i64>,
        collection_ids: Option<String>,
        reboot_time_hour: Option<i32>,
        reboot_time_minute: Option<i32>,
        idle_timeout_in_second: Option<i32>,
        serial_number: Option<String>,
        udid: Option<String>,
        device_type: Option<String>,
        device_power: Option<f64>,
        device_interference: Option<f64>,
        availability: Option<String>,
        availability_summary: Option<String>,
        context: &C) -> Result<UpdateOfferResponse, ApiError>
    {
        info!("update_offer({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_id, include_offer_locations, device_id, account_id, parent_offer_id, retailer_location_ids, offer_locations, tags, title, sub_title, details, sub_details, fine_print, barcode_type, barcode_entry, external_redeem_options, external_url, external_id, tickets_reward_type, tickets_reward, activated, expires, no_expiration, available_limit, available_limit_per_user, added_limit, view_limit, max_prints, ticket_price_type, ticket_price, full_price, discount_price, show_remaining, show_redeemed, replaced, featured, offer_type, special_offer_type, offer_visibility, category_ids, filter_ids, active, barcode_asset_id, image_asset_id, image_asset_id1, image_asset_id2, image_asset_id3, image_asset_id4, image_asset_id5, publisher, redeemable_start, redeemable_end, brand, product_type, condition_type, isbn, asin, catalog_numbers, department, features, minimum_price, width, height, depth, weight, unit, studio, parental_rating, publish_date, availability_date, size_id, listing_id, media_type, duration, author, release_date, collection_ids, reboot_time_hour, reboot_time_minute, idle_timeout_in_second, serial_number, udid, device_type, device_power, device_interference, availability, availability_summary, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Activate Offer
    async fn update_offer_status(
        &self,
        version: f64,
        offer_ids: String,
        active: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<UpdateOfferStatusResponse, ApiError>
    {
        info!("update_offer_status({}, \"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", version, offer_ids, active, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Offer Status
    async fn create_offer_transaction_status(
        &self,
        version: f64,
        name: String,
        code: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        description: Option<String>,
        role: Option<String>,
        active: Option<bool>,
        application_ids: Option<String>,
        context: &C) -> Result<CreateOfferTransactionStatusResponse, ApiError>
    {
        info!("create_offer_transaction_status({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, name, code, device_id, account_id, latitude, longitude, description, role, active, application_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Offer Status
    async fn delete_offer_transaction_status(
        &self,
        version: f64,
        status_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<DeleteOfferTransactionStatusResponse, ApiError>
    {
        info!("delete_offer_transaction_status({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, status_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offer Status
    async fn get_offer_transaction_status(
        &self,
        version: f64,
        status_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetOfferTransactionStatusResponse, ApiError>
    {
        info!("get_offer_transaction_status({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, status_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offer Status
    async fn search_offer_transaction_statuses(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        keyword: Option<String>,
        role: Option<String>,
        app_key: Option<String>,
        sort_field: Option<models::SearchOfferTransactionStatusesSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        include_inactive: Option<bool>,
        context: &C) -> Result<SearchOfferTransactionStatusesResponse, ApiError>
    {
        info!("search_offer_transaction_statuses({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, keyword, role, app_key, sort_field, descending, start, limit, include_inactive, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Offer Status
    async fn update_offer_transaction_status(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        status_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        code: Option<i32>,
        role: Option<String>,
        active: Option<bool>,
        application_ids: Option<String>,
        context: &C) -> Result<UpdateOfferTransactionStatusResponse, ApiError>
    {
        info!("update_offer_transaction_status({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, latitude, longitude, status_id, name, description, code, role, active, application_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Generate images with OpenAI
    async fn image_generation(
        &self,
        version: f64,
        account_id: i64,
        post_body: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ImageGenerationResponse, ApiError>
    {
        info!("image_generation({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, post_body, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Request Optimization
    async fn request_optimization(
        &self,
        version: f64,
        body: Option<models::Orders>,
        context: &C) -> Result<RequestOptimizationResponse, ApiError>
    {
        info!("request_optimization({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Optimization Result
    async fn get_optimization_result(
        &self,
        version: f64,
        batch_id: String,
        start: i32,
        limit: i32,
        context: &C) -> Result<GetOptimizationResultResponse, ApiError>
    {
        info!("get_optimization_result({}, \"{}\", {}, {}) - X-Span-ID: {:?}", version, batch_id, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add Movie
    async fn add_movie(
        &self,
        version: f64,
        account_id: i64,
        movie_name: String,
        third_party_account_id: Option<String>,
        tags: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<AddMovieResponse, ApiError>
    {
        info!("add_movie({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, movie_name, third_party_account_id, tags, file, url, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Docs
    async fn ai_docs(
        &self,
        version: f64,
        account_id: i64,
        doc: String,
        return_topics: Option<bool>,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<AiDocsResponse, ApiError>
    {
        info!("ai_docs({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, doc, return_topics, limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Find images
    async fn ai_find_images(
        &self,
        version: f64,
        account_id: i64,
        text: String,
        parse_flag: Option<String>,
        fetch_flag: Option<String>,
        size: Option<String>,
        context: &C) -> Result<AiFindImagesResponse, ApiError>
    {
        info!("ai_find_images({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, text, parse_flag, fetch_flag, size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tags
    async fn ai_tags(
        &self,
        version: f64,
        account_id: i64,
        tags: String,
        conditional: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<AiTagsResponse, ApiError>
    {
        info!("ai_tags({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, tags, conditional, limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Text
    async fn ai_text(
        &self,
        version: f64,
        account_id: i64,
        terms: String,
        conditional: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        context: &C) -> Result<AiTextResponse, ApiError>
    {
        info!("ai_text({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, terms, conditional, limit, offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Batch Analysis
    async fn batch(
        &self,
        version: f64,
        account_id: i64,
        third_party_account_id: Option<String>,
        limit: Option<i32>,
        operations: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<BatchResponse, ApiError>
    {
        info!("batch({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, third_party_account_id, limit, operations, file, url, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Creates an instant episode
    async fn create_instant_episode(
        &self,
        version: f64,
        account_id: i64,
        data: String,
        context: &C) -> Result<CreateInstantEpisodeResponse, ApiError>
    {
        info!("create_instant_episode({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create VoiceCanvas images
    async fn create_voice_canvas(
        &self,
        version: f64,
        account_id: i64,
        dimensions: String,
        third_party_account_id: Option<String>,
        text: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        parse_flag: Option<bool>,
        fetch_flag: Option<bool>,
        callback: Option<String>,
        context: &C) -> Result<CreateVoiceCanvasResponse, ApiError>
    {
        info!("create_voice_canvas({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, dimensions, third_party_account_id, text, file, url, parse_flag, fetch_flag, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Detect emotions
    async fn emotion(
        &self,
        version: f64,
        account_id: i64,
        third_party_account_id: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<EmotionResponse, ApiError>
    {
        info!("emotion({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, third_party_account_id, file, url, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Starts a StoryStitch video render
    async fn start_video_render(
        &self,
        version: f64,
        account_id: i64,
        data: String,
        context: &C) -> Result<StartVideoRenderResponse, ApiError>
    {
        info!("start_video_render({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Speach to Text
    async fn stt(
        &self,
        version: f64,
        account_id: i64,
        third_party_account_id: Option<String>,
        source_language: Option<String>,
        target_language: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<SttResponse, ApiError>
    {
        info!("stt({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, third_party_account_id, source_language, target_language, file, url, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Summarize Topics
    async fn summarize_topics(
        &self,
        version: f64,
        account_id: i64,
        third_party_account_id: Option<String>,
        doc: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        callback: Option<String>,
        context: &C) -> Result<SummarizeTopicsResponse, ApiError>
    {
        info!("summarize_topics({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, third_party_account_id, doc, file, url, limit, offset, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Detect Technical Issues
    async fn tech_tune(
        &self,
        version: f64,
        account_id: i64,
        num_faces_expected: i32,
        third_party_account_id: Option<String>,
        file: Option<swagger::ByteArray>,
        url: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<TechTuneResponse, ApiError>
    {
        info!("tech_tune({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, num_faces_expected, third_party_account_id, file, url, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Text to Speach
    async fn tts(
        &self,
        version: f64,
        account_id: i64,
        text: String,
        third_party_account_id: Option<String>,
        language: Option<String>,
        voice: Option<String>,
        callback: Option<String>,
        context: &C) -> Result<TtsResponse, ApiError>
    {
        info!("tts({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, text, third_party_account_id, language, voice, callback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Add Movie Result
    async fn get_add_movie_result(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetAddMovieResultResponse, ApiError>
    {
        info!("get_add_movie_result({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Batch Analysis Results
    async fn get_batch(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetBatchResponse, ApiError>
    {
        info!("get_batch({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Emotion Results
    async fn get_emotion(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetEmotionResponse, ApiError>
    {
        info!("get_emotion({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Check episode status
    async fn get_episode_status(
        &self,
        version: f64,
        episode_id: i64,
        account_id: i64,
        context: &C) -> Result<GetEpisodeStatusResponse, ApiError>
    {
        info!("get_episode_status({}, {}, {}) - X-Span-ID: {:?}", version, episode_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Check episode status
    async fn get_render_status(
        &self,
        version: f64,
        render_id: String,
        account_id: i64,
        context: &C) -> Result<GetRenderStatusResponse, ApiError>
    {
        info!("get_render_status({}, \"{}\", {}) - X-Span-ID: {:?}", version, render_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Speach to Text Result
    async fn get_stt(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetSttResponse, ApiError>
    {
        info!("get_stt({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get TechTune Results
    async fn get_tech_tune(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetTechTuneResponse, ApiError>
    {
        info!("get_tech_tune({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Topics
    async fn get_topics(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetTopicsResponse, ApiError>
    {
        info!("get_topics({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Text to Speach Result
    async fn get_tts(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetTtsResponse, ApiError>
    {
        info!("get_tts({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get VoiceCanvas images
    async fn get_voice_canvas(
        &self,
        version: f64,
        request_id: String,
        account_id: i64,
        context: &C) -> Result<GetVoiceCanvasResponse, ApiError>
    {
        info!("get_voice_canvas({}, \"{}\", {}) - X-Span-ID: {:?}", version, request_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Pack
    async fn create_pack(
        &self,
        version: f64,
        account_id: i64,
        title: String,
        pack_order: i64,
        price: i32,
        highest: bool,
        allocate_tickets: bool,
        ticket_count: i64,
        description: Option<String>,
        search_tags: Option<String>,
        active: Option<bool>,
        game_type: Option<String>,
        app_key: Option<String>,
        pack_type: Option<models::CreatePackPackTypeParameter>,
        sequence_type: Option<models::CreatePackSequenceTypeParameter>,
        background_id: Option<i64>,
        image_id: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        author_override: Option<String>,
        price_type: Option<String>,
        game_level_ids: Option<String>,
        in_game: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<CreatePackResponse, ApiError>
    {
        info!("create_pack({}, {}, \"{}\", {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, title, pack_order, price, highest, allocate_tickets, ticket_count, description, search_tags, active, game_type, app_key, pack_type, sequence_type, background_id, image_id, start_date, end_date, author_override, price_type, game_level_ids, in_game, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Pack
    async fn delete_pack(
        &self,
        version: f64,
        account_id: i64,
        pack_id: i64,
        context: &C) -> Result<DeletePackResponse, ApiError>
    {
        info!("delete_pack({}, {}, {}) - X-Span-ID: {:?}", version, account_id, pack_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Pack
    async fn get_pack(
        &self,
        version: f64,
        account_id: i64,
        pack_id: i64,
        include_game_data: bool,
        context: &C) -> Result<GetPackResponse, ApiError>
    {
        info!("get_pack({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, pack_id, include_game_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Packs
    async fn search_packs(
        &self,
        version: f64,
        account_id: i64,
        sort_field: models::SearchPacksSortFieldParameter,
        descending: bool,
        keyword: Option<String>,
        pack_type: Option<models::CreatePackPackTypeParameter>,
        start: Option<i32>,
        limit: Option<i32>,
        include_game_data: Option<bool>,
        include_inactive: Option<bool>,
        app_key: Option<String>,
        context: &C) -> Result<SearchPacksResponse, ApiError>
    {
        info!("search_packs({}, {}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, keyword, pack_type, start, limit, include_game_data, include_inactive, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Pack
    async fn update_pack(
        &self,
        version: f64,
        account_id: i64,
        pack_id: i64,
        allocate_tickets: bool,
        ticket_count: i64,
        title: Option<String>,
        description: Option<String>,
        search_tags: Option<String>,
        active: Option<bool>,
        game_type: Option<String>,
        app_key: Option<String>,
        pack_type: Option<models::CreatePackPackTypeParameter>,
        pack_order: Option<i64>,
        sequence_type: Option<models::CreatePackSequenceTypeParameter>,
        background_id: Option<i64>,
        image_id: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        author_override: Option<String>,
        price: Option<i32>,
        price_type: Option<String>,
        game_level_ids: Option<String>,
        in_game: Option<bool>,
        highest: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<UpdatePackResponse, ApiError>
    {
        info!("update_pack({}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, pack_id, allocate_tickets, ticket_count, title, description, search_tags, active, game_type, app_key, pack_type, pack_order, sequence_type, background_id, image_id, start_date, end_date, author_override, price, price_type, game_level_ids, in_game, highest, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Process All Participant Feeds
    async fn process_all_participants(
        &self,
        version: f64,
        account_id: i64,
        app_key: Option<String>,
        use_short_name_as_id: Option<bool>,
        context: &C) -> Result<ProcessAllParticipantsResponse, ApiError>
    {
        info!("process_all_participants({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, use_short_name_as_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Process Participants Feed
    async fn process_participants(
        &self,
        version: f64,
        account_id: i64,
        league: String,
        app_key: Option<String>,
        use_short_name_as_id: Option<bool>,
        file: Option<swagger::ByteArray>,
        context: &C) -> Result<ProcessParticipantsResponse, ApiError>
    {
        info!("process_participants({}, {}, \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, league, app_key, use_short_name_as_id, file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Calculate Path
    async fn compute_path(
        &self,
        version: f64,
        data: String,
        units: models::ComputePathUnitsParameter,
        reduce_path: bool,
        directions: bool,
        context: &C) -> Result<ComputePathResponse, ApiError>
    {
        info!("compute_path({}, \"{}\", {:?}, {}, {}) - X-Span-ID: {:?}", version, data, units, reduce_path, directions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Postal Code
    async fn create_postal_code(
        &self,
        version: f64,
        account_id: i64,
        code: String,
        latitude: f64,
        longitude: f64,
        state_code: Option<String>,
        city: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<CreatePostalCodeResponse, ApiError>
    {
        info!("create_postal_code({}, {}, \"{}\", {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, code, latitude, longitude, state_code, city, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Postal Code
    async fn delete_postal_code(
        &self,
        version: f64,
        account_id: i64,
        postal_code_id: i64,
        context: &C) -> Result<DeletePostalCodeResponse, ApiError>
    {
        info!("delete_postal_code({}, {}, {}) - X-Span-ID: {:?}", version, account_id, postal_code_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Postal Code
    async fn get_postal_code(
        &self,
        version: f64,
        postal_code_id: i64,
        context: &C) -> Result<GetPostalCodeResponse, ApiError>
    {
        info!("get_postal_code({}, {}) - X-Span-ID: {:?}", version, postal_code_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Postal Codes
    async fn get_postal_codes(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        latitude: Option<f64>,
        longitude: Option<f64>,
        keyword: Option<String>,
        miles: Option<f64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetPostalCodesResponse, ApiError>
    {
        info!("get_postal_codes({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, latitude, longitude, keyword, miles, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Postal Code
    async fn update_postal_code(
        &self,
        version: f64,
        account_id: i64,
        postal_code_id: i64,
        code: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        state_code: Option<String>,
        city: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<UpdatePostalCodeResponse, ApiError>
    {
        info!("update_postal_code({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, postal_code_id, code, latitude, longitude, state_code, city, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Persona
    async fn create_persona(
        &self,
        version: f64,
        account_id: i64,
        title: String,
        preview_accounts: Option<String>,
        date: Option<i64>,
        age: Option<i32>,
        gender: Option<String>,
        game_experience_level: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreatePersonaResponse, ApiError>
    {
        info!("create_persona({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, title, preview_accounts, date, age, gender, game_experience_level, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Persona
    async fn delete_persona(
        &self,
        version: f64,
        account_id: i64,
        persona_id: i64,
        context: &C) -> Result<DeletePersonaResponse, ApiError>
    {
        info!("delete_persona({}, {}, {}) - X-Span-ID: {:?}", version, account_id, persona_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Persona
    async fn get_persona_list(
        &self,
        version: f64,
        account_id: i64,
        persona_id: i64,
        context: &C) -> Result<GetPersonaListResponse, ApiError>
    {
        info!("get_persona_list({}, {}, {}) - X-Span-ID: {:?}", version, account_id, persona_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Personas
    async fn search_persona(
        &self,
        version: f64,
        account_id: i64,
        start: i32,
        limit: i32,
        context: &C) -> Result<SearchPersonaResponse, ApiError>
    {
        info!("search_persona({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Persona
    async fn update_persona(
        &self,
        version: f64,
        account_id: i64,
        persona_id: i64,
        title: Option<String>,
        preview_accounts: Option<String>,
        active: Option<bool>,
        date: Option<i64>,
        age: Option<i32>,
        gender: Option<String>,
        game_experience_level: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<UpdatePersonaResponse, ApiError>
    {
        info!("update_persona({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, persona_id, title, preview_accounts, active, date, age, gender, game_experience_level, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Program
    async fn create_program(
        &self,
        version: f64,
        body: Option<models::Program>,
        context: &C) -> Result<CreateProgramResponse, ApiError>
    {
        info!("create_program({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Programs
    async fn search_programs(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        keyword: Option<String>,
        context: &C) -> Result<SearchProgramsResponse, ApiError>
    {
        info!("search_programs({}, \"{}\", {}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Program
    async fn delete_program(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<DeleteProgramResponse, ApiError>
    {
        info!("delete_program({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Program
    async fn get_program(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetProgramResponse, ApiError>
    {
        info!("get_program({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Program
    async fn post_program(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Program>,
        context: &C) -> Result<PostProgramResponse, ApiError>
    {
        info!("post_program({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Program
    async fn put_program(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Program>,
        context: &C) -> Result<PutProgramResponse, ApiError>
    {
        info!("put_program({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Purchase
    async fn create_purchase_item(
        &self,
        version: f64,
        app_key: String,
        name: String,
        purchase_type: models::CreatePurchaseItemPurchaseTypeParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        description: Option<String>,
        tickets: Option<i32>,
        price: Option<f32>,
        purchase_code: Option<String>,
        secret_key: Option<String>,
        purchase_limit: Option<i32>,
        service_action: Option<models::CreatePurchaseItemServiceActionParameter>,
        cover_asset_id: Option<i64>,
        promo_asset_id: Option<i64>,
        giftable: Option<bool>,
        assetable: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        offer_location_id: Option<i64>,
        context: &C) -> Result<CreatePurchaseItemResponse, ApiError>
    {
        info!("create_purchase_item({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, name, purchase_type, device_id, account_id, description, tickets, price, purchase_code, secret_key, purchase_limit, service_action, cover_asset_id, promo_asset_id, giftable, assetable, allocate_tickets, ticket_type, points, offer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Purchase
    async fn delete_purchase_item(
        &self,
        version: f64,
        purchase_item_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeletePurchaseItemResponse, ApiError>
    {
        info!("delete_purchase_item({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, purchase_item_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Purchase
    async fn get_purchase_item(
        &self,
        version: f64,
        purchase_item_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetPurchaseItemResponse, ApiError>
    {
        info!("get_purchase_item({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, purchase_item_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Purchases
    async fn search_purchase_items(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        filter_by_billable: Option<bool>,
        purchase_type: Option<String>,
        service_action: Option<String>,
        keyword: Option<String>,
        sort_field: Option<models::SearchPurchaseItemsSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchPurchaseItemsResponse, ApiError>
    {
        info!("search_purchase_items({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, filter_by_billable, purchase_type, service_action, keyword, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Purchase
    async fn update_purchase_item(
        &self,
        version: f64,
        purchase_item_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        description: Option<String>,
        tickets: Option<i32>,
        price: Option<f32>,
        purchase_type: Option<models::CreatePurchaseItemPurchaseTypeParameter>,
        purchase_code: Option<String>,
        secret_key: Option<String>,
        purchase_limit: Option<i32>,
        service_action: Option<models::CreatePurchaseItemServiceActionParameter>,
        cover_asset_id: Option<i64>,
        promo_asset_id: Option<i64>,
        giftable: Option<bool>,
        assetable: Option<bool>,
        active: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        offer_location_id: Option<i64>,
        context: &C) -> Result<UpdatePurchaseItemResponse, ApiError>
    {
        info!("update_purchase_item({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, purchase_item_id, device_id, account_id, name, description, tickets, price, purchase_type, purchase_code, secret_key, purchase_limit, service_action, cover_asset_id, promo_asset_id, giftable, assetable, active, allocate_tickets, ticket_type, points, offer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Order
    async fn create_order(
        &self,
        version: f64,
        app_key: String,
        cart: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        description: Option<String>,
        currency_type: Option<models::CreateOrderCurrencyTypeParameter>,
        payment_method_id: Option<i64>,
        external_order_id: Option<String>,
        external_payment_id: Option<String>,
        remote_ref_type: Option<String>,
        external_date: Option<i64>,
        promo_code: Option<String>,
        context: &C) -> Result<CreateOrderResponse, ApiError>
    {
        info!("create_order({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, cart, device_id, account_id, description, currency_type, payment_method_id, external_order_id, external_payment_id, remote_ref_type, external_date, promo_code, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Order
    async fn delete_order(
        &self,
        version: f64,
        order_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteOrderResponse, ApiError>
    {
        info!("delete_order({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, order_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Order
    async fn get_order(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        order_id: Option<i64>,
        external_order_id: Option<String>,
        context: &C) -> Result<GetOrderResponse, ApiError>
    {
        info!("get_order({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, order_id, external_order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Preview Order
    async fn preview_order(
        &self,
        version: f64,
        app_key: String,
        cart: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        description: Option<String>,
        currency_type: Option<models::CreateOrderCurrencyTypeParameter>,
        payment_method_id: Option<i64>,
        external_order_id: Option<String>,
        external_payment_id: Option<String>,
        remote_ref_type: Option<String>,
        external_date: Option<i64>,
        promo_code: Option<String>,
        context: &C) -> Result<PreviewOrderResponse, ApiError>
    {
        info!("preview_order({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, cart, device_id, account_id, description, currency_type, payment_method_id, external_order_id, external_payment_id, remote_ref_type, external_date, promo_code, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Orders
    async fn search_orders(
        &self,
        version: f64,
        app_key: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        descending: Option<bool>,
        active_only: Option<bool>,
        ignore_customer_filter: Option<bool>,
        order_item_types: Option<String>,
        order_item_ids: Option<String>,
        order_custom_types: Option<String>,
        order_custom_ids: Option<String>,
        sort_field: Option<String>,
        offer_types: Option<String>,
        special_offer_types: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        offer_audience_ids: Option<String>,
        transaction_audience_ids: Option<String>,
        offer_ids: Option<String>,
        offer_location_ids: Option<String>,
        retailer_ids: Option<String>,
        retailer_location_ids: Option<String>,
        statuses: Option<String>,
        keyword: Option<String>,
        redeemable_start_date: Option<i64>,
        redeemable_end_date: Option<i64>,
        started_since: Option<i64>,
        started_before: Option<i64>,
        ended_since: Option<i64>,
        ended_before: Option<i64>,
        context: &C) -> Result<SearchOrdersResponse, ApiError>
    {
        info!("search_orders({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, device_id, account_id, start, limit, descending, active_only, ignore_customer_filter, order_item_types, order_item_ids, order_custom_types, order_custom_ids, sort_field, offer_types, special_offer_types, category_ids, filter_ids, offer_audience_ids, transaction_audience_ids, offer_ids, offer_location_ids, retailer_ids, retailer_location_ids, statuses, keyword, redeemable_start_date, redeemable_end_date, started_since, started_before, ended_since, ended_before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Order
    async fn update_order(
        &self,
        version: f64,
        order_id: i64,
        app_key: String,
        cart: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        payment_transaction_id: Option<i64>,
        description: Option<String>,
        currency_type: Option<models::CreateOrderCurrencyTypeParameter>,
        payment_method_id: Option<i64>,
        external_payment_id: Option<String>,
        external_date: Option<i64>,
        context: &C) -> Result<UpdateOrderResponse, ApiError>
    {
        info!("update_order({}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, order_id, app_key, cart, device_id, account_id, payment_transaction_id, description, currency_type, payment_method_id, external_payment_id, external_date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Question
    async fn create_question(
        &self,
        version: f64,
        account_id: i64,
        question: String,
        answers: String,
        active: bool,
        allocate_tickets: bool,
        ticket_count: i64,
        tags: Option<String>,
        video_url: Option<String>,
        asset_id: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<CreateQuestionResponse, ApiError>
    {
        info!("create_question({}, {}, \"{}\", \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, question, answers, active, allocate_tickets, ticket_count, tags, video_url, asset_id, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Question
    async fn delete_question(
        &self,
        version: f64,
        question_id: i64,
        account_id: i64,
        context: &C) -> Result<DeleteQuestionResponse, ApiError>
    {
        info!("delete_question({}, {}, {}) - X-Span-ID: {:?}", version, question_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Question
    async fn get_question(
        &self,
        version: f64,
        question_id: i64,
        account_id: i64,
        context: &C) -> Result<GetQuestionResponse, ApiError>
    {
        info!("get_question({}, {}, {}) - X-Span-ID: {:?}", version, question_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Questions
    async fn search_questions(
        &self,
        version: f64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        active_only: bool,
        start: i32,
        limit: i32,
        keyword: Option<String>,
        context: &C) -> Result<SearchQuestionsResponse, ApiError>
    {
        info!("search_questions({}, {}, \"{}\", {}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, active_only, start, limit, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Question
    async fn update_question(
        &self,
        version: f64,
        question_id: i64,
        account_id: i64,
        ticket_count: i64,
        question: Option<String>,
        answers: Option<String>,
        tags: Option<String>,
        video_url: Option<String>,
        asset_id: Option<i64>,
        active: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<UpdateQuestionResponse, ApiError>
    {
        info!("update_question({}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, question_id, account_id, ticket_count, question, answers, tags, video_url, asset_id, active, allocate_tickets, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Historical Rankings
    async fn get_historical_rankings(
        &self,
        version: f64,
        app_key: String,
        rank_type: String,
        start_date: i64,
        end_date: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetHistoricalRankingsResponse, ApiError>
    {
        info!("get_historical_rankings({}, \"{}\", \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, rank_type, start_date, end_date, device_id, account_id, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Rankings
    async fn get_rankings(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        q: Option<String>,
        keyword: Option<String>,
        rank_type: Option<String>,
        leaderboard_mode: Option<String>,
        within_account_ids: Option<String>,
        return_user_rank: Option<bool>,
        album_id: Option<i64>,
        audience_id: Option<i64>,
        sort_field: Option<String>,
        descending: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetRankingsResponse, ApiError>
    {
        info!("get_rankings({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, game_type, app_key, q, keyword, rank_type, leaderboard_mode, within_account_ids, return_user_rank, album_id, audience_id, sort_field, descending, _i, start, _l, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Personal Rankings
    async fn get_user_rank(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        app_key: Option<String>,
        rank_type: Option<String>,
        return_user_rank: Option<bool>,
        leaderboard_mode: Option<String>,
        sort_field: Option<String>,
        keyword: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<GetUserRankResponse, ApiError>
    {
        info!("get_user_rank({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, app_key, rank_type, return_user_rank, leaderboard_mode, sort_field, keyword, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Override User Rank
    async fn override_user_rank(
        &self,
        version: f64,
        account_id: i64,
        owner_account_id: i64,
        app_key: String,
        rank_type: String,
        total_score: Option<i64>,
        total_count: Option<i64>,
        total_time: Option<i64>,
        daily_score: Option<i64>,
        daily_count: Option<i64>,
        daily_time: Option<i64>,
        weekly_score: Option<i64>,
        weekly_count: Option<i64>,
        weekly_time: Option<i64>,
        monthly_score: Option<i64>,
        monthly_count: Option<i64>,
        monthly_time: Option<i64>,
        top_score: Option<i64>,
        lowest_score: Option<i64>,
        streak_count: Option<i64>,
        streak_best_count: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        context: &C) -> Result<OverrideUserRankResponse, ApiError>
    {
        info!("override_user_rank({}, {}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, owner_account_id, app_key, rank_type, total_score, total_count, total_time, daily_score, daily_count, daily_time, weekly_score, weekly_count, weekly_time, monthly_score, monthly_count, monthly_time, top_score, lowest_score, streak_count, streak_best_count, start_date, end_date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Ranking
    async fn update_rankings(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        rank_type: String,
        increment: Option<i64>,
        time_increment: Option<i64>,
        tag: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        update_global: Option<bool>,
        create_leaderboard: Option<bool>,
        context: &C) -> Result<UpdateRankingsResponse, ApiError>
    {
        info!("update_rankings({}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, rank_type, increment, time_increment, tag, start_date, end_date, update_global, create_leaderboard, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Rating
    async fn create_rating(
        &self,
        version: f64,
        ratable_type: String,
        ratable_id: i64,
        rating_value: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        category_id: Option<i64>,
        display: Option<String>,
        description: Option<String>,
        location_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreateRatingResponse, ApiError>
    {
        info!("create_rating({}, \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, ratable_type, ratable_id, rating_value, device_id, account_id, category_id, display, description, location_description, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Rating
    async fn delete_rating(
        &self,
        version: f64,
        rating_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteRatingResponse, ApiError>
    {
        info!("delete_rating({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, rating_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Location Rating Indexes
    async fn search_location_rating_indexes(
        &self,
        version: f64,
        category_ids: Option<String>,
        keyword: Option<String>,
        location_type: Option<String>,
        sort_field: Option<models::SearchRatingIndexesSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        search_range: Option<f64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_overall_rating: Option<bool>,
        distance_unit: Option<models::SearchOffersForConsumerDistanceUnitParameter>,
        return_retailer: Option<bool>,
        return_assets: Option<bool>,
        return_offers: Option<bool>,
        return_categories: Option<bool>,
        return_filters: Option<bool>,
        context: &C) -> Result<SearchLocationRatingIndexesResponse, ApiError>
    {
        info!("search_location_rating_indexes({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, category_ids, keyword, location_type, sort_field, descending, start, limit, search_range, latitude, longitude, return_overall_rating, distance_unit, return_retailer, return_assets, return_offers, return_categories, return_filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Rating Indexes
    async fn search_rating_indexes(
        &self,
        version: f64,
        ratable_type: models::SearchRatingIndexesRatableTypeParameter,
        ratable_ids: Option<String>,
        category_ids: Option<String>,
        secondary_type: Option<String>,
        keyword: Option<String>,
        sort_field: Option<models::SearchRatingIndexesSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_ratable: Option<bool>,
        return_overall_rating: Option<bool>,
        context: &C) -> Result<SearchRatingIndexesResponse, ApiError>
    {
        info!("search_rating_indexes({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, ratable_type, ratable_ids, category_ids, secondary_type, keyword, sort_field, descending, start, limit, latitude, longitude, return_ratable, return_overall_rating, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Ratings
    async fn search_ratings(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        filter_account_id: Option<i64>,
        ratable_type: Option<String>,
        ratable_id: Option<i64>,
        category_ids: Option<String>,
        keyword: Option<String>,
        sort_field: Option<models::SearchRatingsSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRatingsResponse, ApiError>
    {
        info!("search_ratings({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, filter_account_id, ratable_type, ratable_id, category_ids, keyword, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Rating
    async fn update_rating(
        &self,
        version: f64,
        rating_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        rating_value: Option<i32>,
        category_id: Option<i64>,
        display: Option<String>,
        description: Option<String>,
        location_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<UpdateRatingResponse, ApiError>
    {
        info!("update_rating({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, rating_id, device_id, account_id, rating_value, category_id, display, description, location_description, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Region
    async fn create_region(
        &self,
        version: f64,
        account_id: i64,
        region_class: String,
        short_name: String,
        full_name: Option<String>,
        parent_ids: Option<String>,
        children_ids: Option<String>,
        postal_code_ids: Option<String>,
        locations: Option<String>,
        retailer_location_id: Option<i64>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        start: Option<i64>,
        end: Option<i64>,
        polygon: Option<String>,
        meta_data: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        version_code: Option<i32>,
        root: Option<bool>,
        active: Option<bool>,
        context: &C) -> Result<CreateRegionResponse, ApiError>
    {
        info!("create_region({}, {}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, region_class, short_name, full_name, parent_ids, children_ids, postal_code_ids, locations, retailer_location_id, visibility, category_ids, filter_ids, start, end, polygon, meta_data, latitude, longitude, version_code, root, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Region
    async fn delete_region(
        &self,
        version: f64,
        account_id: i64,
        region_id: i64,
        context: &C) -> Result<DeleteRegionResponse, ApiError>
    {
        info!("delete_region({}, {}, {}) - X-Span-ID: {:?}", version, account_id, region_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Region
    async fn get_region(
        &self,
        version: f64,
        region_id: i64,
        account_id: Option<i64>,
        context: &C) -> Result<GetRegionResponse, ApiError>
    {
        info!("get_region({}, {}, {:?}) - X-Span-ID: {:?}", version, region_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Regions
    async fn search_regions(
        &self,
        version: f64,
        account_id: Option<i64>,
        query: Option<String>,
        keyword: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        range: Option<f64>,
        region_class: Option<models::SearchRegionsRegionClassParameter>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        search_mode: Option<models::SearchRegionsSearchModeParameter>,
        sort_field: Option<models::SearchRegionsSortFieldParameter>,
        descending: Option<bool>,
        include_parent: Option<bool>,
        include_children: Option<bool>,
        include_postal_codes: Option<bool>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        version_code: Option<i32>,
        active_only: Option<bool>,
        show_deleted: Option<bool>,
        last_updated_since: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRegionsResponse, ApiError>
    {
        info!("search_regions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, query, keyword, latitude, longitude, range, region_class, visibility, search_mode, sort_field, descending, include_parent, include_children, include_postal_codes, category_ids, filter_ids, version_code, active_only, show_deleted, last_updated_since, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Region
    async fn update_region(
        &self,
        version: f64,
        account_id: i64,
        region_id: i64,
        region_class: Option<String>,
        short_name: Option<String>,
        full_name: Option<String>,
        parent_ids: Option<String>,
        children_ids: Option<String>,
        postal_code_ids: Option<String>,
        locations: Option<String>,
        retailer_location_id: Option<i64>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        start: Option<i64>,
        end: Option<i64>,
        polygon: Option<String>,
        meta_data: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        version_code: Option<i32>,
        root: Option<bool>,
        active: Option<bool>,
        clear_lists: Option<bool>,
        context: &C) -> Result<UpdateRegionResponse, ApiError>
    {
        info!("update_region({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, region_id, region_class, short_name, full_name, parent_ids, children_ids, postal_code_ids, locations, retailer_location_id, visibility, category_ids, filter_ids, start, end, polygon, meta_data, latitude, longitude, version_code, root, active, clear_lists, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Offline Report
    async fn create_batch(
        &self,
        version: f64,
        account_id: i64,
        status: models::CreateBatchStatusParameter,
        preview_limit: i32,
        app_key: Option<String>,
        endpoint: Option<String>,
        parameters: Option<String>,
        name: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        description: Option<String>,
        page_url: Option<String>,
        context: &C) -> Result<CreateBatchResponse, ApiError>
    {
        info!("create_batch({}, {}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, status, preview_limit, app_key, endpoint, parameters, name, start_date, end_date, description, page_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Offline Report
    async fn create_region_leg_summary_batch<'a>(
        &self,
        version: f64,
        body: Option<&'a Vec<models::RegionLegSummary>>,
        context: &C) -> Result<CreateRegionLegSummaryBatchResponse, ApiError>
    {
        info!("create_region_leg_summary_batch({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Offline Report
    async fn delete_batch(
        &self,
        version: f64,
        account_id: i64,
        batch_id: i64,
        context: &C) -> Result<DeleteBatchResponse, ApiError>
    {
        info!("delete_batch({}, {}, {}) - X-Span-ID: {:?}", version, account_id, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Offline Report
    async fn get_report_batch(
        &self,
        version: f64,
        account_id: i64,
        batch_id: i64,
        all_results: bool,
        context: &C) -> Result<GetReportBatchResponse, ApiError>
    {
        info!("get_report_batch({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, batch_id, all_results, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Run Report
    async fn run_report(
        &self,
        version: f64,
        desc: bool,
        account_id: Option<i64>,
        query: Option<String>,
        parameters: Option<String>,
        order: Option<String>,
        start: Option<i64>,
        limit: Option<i64>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        context: &C) -> Result<RunReportResponse, ApiError>
    {
        info!("run_report({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, desc, account_id, query, parameters, order, start, limit, response_format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Offline Reports
    async fn search_batch(
        &self,
        version: f64,
        account_id: i64,
        start: i32,
        limit: i32,
        names: Option<String>,
        app_key: Option<String>,
        status: Option<models::CreateBatchStatusParameter>,
        global_app_search: Option<bool>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        context: &C) -> Result<SearchBatchResponse, ApiError>
    {
        info!("search_batch({}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, start, limit, names, app_key, status, global_app_search, start_date, end_date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Reservation
    async fn create_reservation(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        app_key: Option<String>,
        meta_data: Option<String>,
        context: &C) -> Result<CreateReservationResponse, ApiError>
    {
        info!("create_reservation({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, start_date, end_date, offer_id, offer_location_id, app_key, meta_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Reservation
    async fn delete_reservation(
        &self,
        version: f64,
        reservation_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteReservationResponse, ApiError>
    {
        info!("delete_reservation({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, reservation_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Availability
    async fn reservable_availability(
        &self,
        version: f64,
        reservable_id: i64,
        reservable_type: models::SearchRatingIndexesRatableTypeParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        availability: Option<String>,
        availability_summary: Option<String>,
        context: &C) -> Result<ReservableAvailabilityResponse, ApiError>
    {
        info!("reservable_availability({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, reservable_id, reservable_type, device_id, account_id, availability, availability_summary, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Availability
    async fn search_availability(
        &self,
        version: f64,
        reservable_id: i64,
        reservable_type: models::SearchRatingIndexesRatableTypeParameter,
        device_id: Option<String>,
        account_id: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchAvailabilityResponse, ApiError>
    {
        info!("search_availability({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, reservable_id, reservable_type, device_id, account_id, start_date, end_date, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Reservations
    async fn search_reservations(
        &self,
        version: f64,
        device_id: Option<String>,
        app_key: Option<String>,
        account_id: Option<i64>,
        filter_account_id: Option<i64>,
        reservable_id: Option<i64>,
        reservable_type: Option<models::SearchRatingIndexesRatableTypeParameter>,
        keyword: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchReservationsResponse, ApiError>
    {
        info!("search_reservations({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, app_key, account_id, filter_account_id, reservable_id, reservable_type, keyword, start_date, end_date, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Schedule
    async fn search_schedule(
        &self,
        version: f64,
        reservable_id: i64,
        reservable_type: models::SearchRatingIndexesRatableTypeParameter,
        start_date: i64,
        end_date: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        time_bucket_mins: Option<i32>,
        context: &C) -> Result<SearchScheduleResponse, ApiError>
    {
        info!("search_schedule({}, {}, {:?}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, reservable_id, reservable_type, start_date, end_date, device_id, account_id, time_bucket_mins, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Retailer
    async fn create_retailer(
        &self,
        version: f64,
        name: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        website: Option<String>,
        email: Option<String>,
        facebook_url: Option<String>,
        twitter_url: Option<String>,
        logo: Option<swagger::ByteArray>,
        logo_asset_id: Option<i64>,
        picture1: Option<swagger::ByteArray>,
        picture1_asset_id: Option<i64>,
        picture2: Option<swagger::ByteArray>,
        picture2_asset_id: Option<i64>,
        category_ids: Option<String>,
        category_ids_to_add: Option<String>,
        category_ids_to_remove: Option<String>,
        filter_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        search_tags: Option<String>,
        retailer_type: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        create_default_location: Option<bool>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        context: &C) -> Result<CreateRetailerResponse, ApiError>
    {
        info!("create_retailer({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, name, device_id, account_id, street_address, street_address2, city, state, postal_code, country, business_phone, business_phone_ext, website, email, facebook_url, twitter_url, logo, logo_asset_id, picture1, picture1_asset_id, picture2, picture2_asset_id, category_ids, category_ids_to_add, category_ids_to_remove, filter_ids, latitude, longitude, meta_data, search_tags, retailer_type, visibility, create_default_location, response_format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Retailer
    async fn delete_retailer(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        retailer_id: Option<i64>,
        context: &C) -> Result<DeleteRetailerResponse, ApiError>
    {
        info!("delete_retailer({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, retailer_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Retailer
    async fn get_retailer(
        &self,
        version: f64,
        retailer_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        include_counts: Option<bool>,
        context: &C) -> Result<GetRetailerResponse, ApiError>
    {
        info!("get_retailer({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_id, device_id, account_id, include_counts, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Retailers
    async fn get_retailers(
        &self,
        version: f64,
        visibility: models::AddAlbumCollectionVisibilityParameter,
        sort_field: models::GetRetailersSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        _i: Option<i32>,
        _l: Option<i32>,
        context: &C) -> Result<GetRetailersResponse, ApiError>
    {
        info!("get_retailers({}, {:?}, {:?}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, visibility, sort_field, descending, start, limit, active_only, device_id, account_id, q, keyword, category_ids, filter_ids, _i, _l, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Retailer
    async fn retailer_login_check(
        &self,
        version: f64,
        username: String,
        password: String,
        device_id: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        app_key: Option<String>,
        context: &C) -> Result<RetailerLoginCheckResponse, ApiError>
    {
        info!("retailer_login_check({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, username, password, device_id, latitude, longitude, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Retailer
    async fn update_retailer(
        &self,
        version: f64,
        retailer_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        website: Option<String>,
        email: Option<String>,
        facebook_url: Option<String>,
        twitter_url: Option<String>,
        logo: Option<swagger::ByteArray>,
        logo_asset_id: Option<i64>,
        picture1: Option<swagger::ByteArray>,
        picture1_asset_id: Option<i64>,
        picture2: Option<swagger::ByteArray>,
        picture2_asset_id: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        search_tags: Option<String>,
        retailer_type: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        context: &C) -> Result<UpdateRetailerResponse, ApiError>
    {
        info!("update_retailer({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_id, device_id, account_id, name, street_address, street_address2, city, state, postal_code, country, business_phone, business_phone_ext, website, email, facebook_url, twitter_url, logo, logo_asset_id, picture1, picture1_asset_id, picture2, picture2_asset_id, category_ids, filter_ids, latitude, longitude, meta_data, search_tags, retailer_type, visibility, active, response_format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Retailer Location (Consumer)
    async fn create_retailer_location_consumer(
        &self,
        version: f64,
        app_key: String,
        name: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        website: Option<String>,
        email: Option<String>,
        details_header: Option<String>,
        details_body: Option<String>,
        hours: Option<String>,
        tags: Option<String>,
        logo_asset_id: Option<i64>,
        picture1_asset_id: Option<i64>,
        picture2_asset_id: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        meta_data: Option<String>,
        public_location: Option<bool>,
        active: Option<bool>,
        location_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<CreateRetailerLocationConsumerResponse, ApiError>
    {
        info!("create_retailer_location_consumer({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, name, device_id, account_id, street_address, street_address2, city, state, postal_code, country, business_phone, business_phone_ext, website, email, details_header, details_body, hours, tags, logo_asset_id, picture1_asset_id, picture2_asset_id, category_ids, filter_ids, meta_data, public_location, active, location_type, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Retailer Location
    async fn create_retailer_locations(
        &self,
        version: f64,
        retailer_id: i64,
        name: String,
        street_address: String,
        city: String,
        state: String,
        postal_code: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        street_address2: Option<String>,
        country: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        website: Option<String>,
        email: Option<String>,
        internal_id: Option<String>,
        details_header: Option<String>,
        details_body: Option<String>,
        hours: Option<String>,
        logo: Option<swagger::ByteArray>,
        logo_asset_id: Option<i64>,
        picture1: Option<swagger::ByteArray>,
        picture1_asset_id: Option<i64>,
        picture2: Option<swagger::ByteArray>,
        picture2_asset_id: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        building: Option<String>,
        google_place_id: Option<String>,
        yelp_id: Option<String>,
        active: Option<bool>,
        public_location: Option<bool>,
        location_type: Option<String>,
        audience_ids: Option<String>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        response_includes: Option<String>,
        context: &C) -> Result<CreateRetailerLocationsResponse, ApiError>
    {
        info!("create_retailer_locations({}, {}, \"{}\", \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_id, name, street_address, city, state, postal_code, device_id, account_id, street_address2, country, business_phone, business_phone_ext, website, email, internal_id, details_header, details_body, hours, logo, logo_asset_id, picture1, picture1_asset_id, picture2, picture2_asset_id, category_ids, filter_ids, latitude, longitude, building, google_place_id, yelp_id, active, public_location, location_type, audience_ids, audience_ids_to_add, audience_ids_to_remove, response_format, response_includes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Retailer Location
    async fn delete_retailer_location(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        retailer_location_id: Option<i64>,
        context: &C) -> Result<DeleteRetailerLocationResponse, ApiError>
    {
        info!("delete_retailer_location({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, retailer_location_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Retailer Location
    async fn get_retailer_location(
        &self,
        version: f64,
        retailer_location_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        retailer_location_token: Option<String>,
        context: &C) -> Result<GetRetailerLocationResponse, ApiError>
    {
        info!("get_retailer_location({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_location_id, device_id, account_id, retailer_location_token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Retailer Location (Consumer)
    async fn get_retailer_location_consumer(
        &self,
        version: f64,
        retailer_location_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<GetRetailerLocationConsumerResponse, ApiError>
    {
        info!("get_retailer_location_consumer({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_location_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Distance Search Retailer Locations (Indexed)
    async fn indexed_retailer_location_distance_search(
        &self,
        version: f64,
        latitude: f64,
        longitude: f64,
        search_range: f64,
        start: i32,
        limit: i32,
        account_id: Option<i64>,
        address: Option<String>,
        has_offers: Option<bool>,
        categories: Option<String>,
        filters: Option<String>,
        audiences: Option<String>,
        retailer_ids: Option<String>,
        retailer_location_ids: Option<String>,
        tags: Option<String>,
        location_type: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        q: Option<String>,
        keyword: Option<String>,
        keyword_operator: Option<String>,
        search_expression: Option<String>,
        distance_unit: Option<models::SearchOffersForConsumerDistanceUnitParameter>,
        return_favorited: Option<bool>,
        return_retailer: Option<bool>,
        return_assets: Option<bool>,
        return_offers: Option<bool>,
        return_categories: Option<bool>,
        return_filters: Option<bool>,
        return_audiences: Option<bool>,
        return_qr_code: Option<bool>,
        return_external_category_data: Option<bool>,
        include_favorite: Option<bool>,
        include_liked: Option<bool>,
        include_rating: Option<bool>,
        context: &C) -> Result<IndexedRetailerLocationDistanceSearchResponse, ApiError>
    {
        info!("indexed_retailer_location_distance_search({}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, latitude, longitude, search_range, start, limit, account_id, address, has_offers, categories, filters, audiences, retailer_ids, retailer_location_ids, tags, location_type, sort_field, descending, q, keyword, keyword_operator, search_expression, distance_unit, return_favorited, return_retailer, return_assets, return_offers, return_categories, return_filters, return_audiences, return_qr_code, return_external_category_data, include_favorite, include_liked, include_rating, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Keyword Search Retailer Locations (Indexed)
    async fn indexed_retailer_location_search(
        &self,
        version: f64,
        account_id: Option<i64>,
        start: Option<i32>,
        limit: Option<i32>,
        has_offers: Option<bool>,
        categories: Option<String>,
        filters: Option<String>,
        audiences: Option<String>,
        retailer_ids: Option<String>,
        retailer_location_ids: Option<String>,
        tags: Option<String>,
        location_type: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        q: Option<String>,
        keyword: Option<String>,
        keyword_operator: Option<String>,
        search_expression: Option<String>,
        return_retailer: Option<bool>,
        return_assets: Option<bool>,
        return_offers: Option<bool>,
        return_categories: Option<bool>,
        return_filters: Option<bool>,
        return_audiences: Option<bool>,
        return_qr_code: Option<bool>,
        return_external_category_data: Option<bool>,
        include_favorite: Option<bool>,
        include_liked: Option<bool>,
        include_rating: Option<bool>,
        context: &C) -> Result<IndexedRetailerLocationSearchResponse, ApiError>
    {
        info!("indexed_retailer_location_search({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, start, limit, has_offers, categories, filters, audiences, retailer_ids, retailer_location_ids, tags, location_type, sort_field, descending, q, keyword, keyword_operator, search_expression, return_retailer, return_assets, return_offers, return_categories, return_filters, return_audiences, return_qr_code, return_external_category_data, include_favorite, include_liked, include_rating, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Retailer Locations (Owned)
    async fn search_retailer_locations(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        retailer_ids: Option<String>,
        retailer_location_ids: Option<String>,
        location_type: Option<String>,
        sort_field: Option<models::SearchRetailerLocationsSortFieldParameter>,
        descending: Option<bool>,
        _i: Option<i32>,
        start: Option<i32>,
        _l: Option<i32>,
        limit: Option<i32>,
        show_public_locations: Option<bool>,
        active_only: Option<bool>,
        return_retailer: Option<bool>,
        return_assets: Option<bool>,
        return_offers: Option<bool>,
        return_categories: Option<bool>,
        return_filters: Option<bool>,
        return_audiences: Option<bool>,
        return_qr_code: Option<bool>,
        include_favorite: Option<bool>,
        include_liked: Option<bool>,
        include_rating: Option<bool>,
        context: &C) -> Result<SearchRetailerLocationsResponse, ApiError>
    {
        info!("search_retailer_locations({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, q, keyword, retailer_ids, retailer_location_ids, location_type, sort_field, descending, _i, start, _l, limit, show_public_locations, active_only, return_retailer, return_assets, return_offers, return_categories, return_filters, return_audiences, return_qr_code, include_favorite, include_liked, include_rating, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Retailer Location
    async fn update_retailer_locations(
        &self,
        version: f64,
        retailer_location_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        name: Option<String>,
        street_address: Option<String>,
        street_address2: Option<String>,
        city: Option<String>,
        state: Option<String>,
        postal_code: Option<String>,
        country: Option<String>,
        business_phone: Option<String>,
        business_phone_ext: Option<String>,
        website: Option<String>,
        email: Option<String>,
        internal_id: Option<String>,
        details_header: Option<String>,
        details_body: Option<String>,
        hours: Option<String>,
        logo: Option<swagger::ByteArray>,
        logo_asset_id: Option<i64>,
        picture1: Option<swagger::ByteArray>,
        picture1_asset_id: Option<i64>,
        picture2: Option<swagger::ByteArray>,
        picture2_asset_id: Option<i64>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        building: Option<String>,
        google_place_id: Option<String>,
        yelp_id: Option<String>,
        meta_data: Option<String>,
        payment_provider: Option<String>,
        active: Option<bool>,
        public_location: Option<bool>,
        location_type: Option<String>,
        audience_ids: Option<String>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        response_format: Option<models::AggregatedFilteredUsageResponseFormatParameter>,
        tags: Option<String>,
        context: &C) -> Result<UpdateRetailerLocationsResponse, ApiError>
    {
        info!("update_retailer_locations({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_location_id, device_id, account_id, name, street_address, street_address2, city, state, postal_code, country, business_phone, business_phone_ext, website, email, internal_id, details_header, details_body, hours, logo, logo_asset_id, picture1, picture1_asset_id, picture2, picture2_asset_id, category_ids, filter_ids, latitude, longitude, building, google_place_id, yelp_id, meta_data, payment_provider, active, public_location, location_type, audience_ids, audience_ids_to_add, audience_ids_to_remove, response_format, tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Retailer
    async fn get_retaokiler(
        &self,
        version: f64,
        retailer_id: i64,
        active_only: bool,
        keyword: Option<String>,
        sort_field: Option<String>,
        start: Option<i64>,
        limit: Option<i64>,
        context: &C) -> Result<GetRetaokilerResponse, ApiError>
    {
        info!("get_retaokiler({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, retailer_id, active_only, keyword, sort_field, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Route
    async fn create_route(
        &self,
        version: f64,
        body: Option<models::Route>,
        context: &C) -> Result<CreateRouteResponse, ApiError>
    {
        info!("create_route({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Routes
    async fn search_routes(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        includes_empty: bool,
        root_only: bool,
        show_inherited_properties: bool,
        hub_id: Option<i64>,
        program_id: Option<i64>,
        scheduled_start: Option<i64>,
        scheduled_end: Option<i64>,
        updated_start: Option<i64>,
        updated_end: Option<i64>,
        featured: Option<bool>,
        seat_count: Option<i32>,
        approved: Option<bool>,
        started: Option<bool>,
        completed: Option<bool>,
        valid: Option<bool>,
        parent_id: Option<i64>,
        context: &C) -> Result<SearchRoutesResponse, ApiError>
    {
        info!("search_routes({}, \"{}\", {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, includes_empty, root_only, show_inherited_properties, hub_id, program_id, scheduled_start, scheduled_end, updated_start, updated_end, featured, seat_count, approved, started, completed, valid, parent_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Approve Route
    async fn approve_route(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<ApproveRouteResponse, ApiError>
    {
        info!("approve_route({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Copy Route
    async fn copy_route(
        &self,
        version: f64,
        route_id: i64,
        body: Option<models::Route>,
        context: &C) -> Result<CopyRouteResponse, ApiError>
    {
        info!("copy_route({}, {}, {:?}) - X-Span-ID: {:?}", version, route_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Route Directions
    async fn create_route_directions(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<CreateRouteDirectionsResponse, ApiError>
    {
        info!("create_route_directions({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Route Polyline
    async fn create_route_polyline(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<CreateRoutePolylineResponse, ApiError>
    {
        info!("create_route_polyline({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Route
    async fn delete_route(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<DeleteRouteResponse, ApiError>
    {
        info!("delete_route({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Disapprove Route
    async fn disapprove_route(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<DisapproveRouteResponse, ApiError>
    {
        info!("disapprove_route({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route
    async fn get_route(
        &self,
        version: f64,
        route_id: i64,
        show_inherited_properties: bool,
        context: &C) -> Result<GetRouteResponse, ApiError>
    {
        info!("get_route({}, {}, {}) - X-Span-ID: {:?}", version, route_id, show_inherited_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route Directions
    async fn get_route_directions(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<GetRouteDirectionsResponse, ApiError>
    {
        info!("get_route_directions({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route Shipments
    async fn get_route_shipments(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<GetRouteShipmentsResponse, ApiError>
    {
        info!("get_route_shipments({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route Stops
    async fn get_route_stops(
        &self,
        version: f64,
        route_id: i64,
        confirmed_only: bool,
        context: &C) -> Result<GetRouteStopsResponse, ApiError>
    {
        info!("get_route_stops({}, {}, {}) - X-Span-ID: {:?}", version, route_id, confirmed_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Optimize Route
    async fn optimize_route(
        &self,
        version: f64,
        route_id: i64,
        context: &C) -> Result<OptimizeRouteResponse, ApiError>
    {
        info!("optimize_route({}, {}) - X-Span-ID: {:?}", version, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Reorder Route Stops
    async fn reorder_route_stops_patch<'a>(
        &self,
        version: f64,
        route_id: i64,
        body: Option<&'a Vec<models::Stop>>,
        context: &C) -> Result<ReorderRouteStopsPatchResponse, ApiError>
    {
        info!("reorder_route_stops_patch({}, {}, {:?}) - X-Span-ID: {:?}", version, route_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Reorder Route Stops
    async fn reorder_route_stops_post<'a>(
        &self,
        version: f64,
        route_id: i64,
        body: Option<&'a Vec<models::Stop>>,
        context: &C) -> Result<ReorderRouteStopsPostResponse, ApiError>
    {
        info!("reorder_route_stops_post({}, {}, {:?}) - X-Span-ID: {:?}", version, route_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Route
    async fn update_route(
        &self,
        version: f64,
        route_id: i64,
        body: Option<models::Route>,
        context: &C) -> Result<UpdateRouteResponse, ApiError>
    {
        info!("update_route({}, {}, {:?}) - X-Span-ID: {:?}", version, route_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route Stop
    async fn get_route_stop(
        &self,
        version: f64,
        route_id: i64,
        stop_id: i64,
        context: &C) -> Result<GetRouteStopResponse, ApiError>
    {
        info!("get_route_stop({}, {}, {}) - X-Span-ID: {:?}", version, route_id, stop_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Shipments At Stop
    async fn get_shipments_at_stop(
        &self,
        version: f64,
        route_id: i64,
        stop_id: i64,
        context: &C) -> Result<GetShipmentsAtStopResponse, ApiError>
    {
        info!("get_shipments_at_stop({}, {}, {}) - X-Span-ID: {:?}", version, route_id, stop_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Stop
    async fn remove_stop(
        &self,
        version: f64,
        route_id: i64,
        stop_id: i64,
        context: &C) -> Result<RemoveStopResponse, ApiError>
    {
        info!("remove_stop({}, {}, {}) - X-Span-ID: {:?}", version, route_id, stop_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Set Driver
    async fn set_driver(
        &self,
        version: f64,
        id: i64,
        driver_id: i64,
        context: &C) -> Result<SetDriverResponse, ApiError>
    {
        info!("set_driver({}, {}, {}) - X-Span-ID: {:?}", version, id, driver_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Route Stop
    async fn update_route_stop(
        &self,
        version: f64,
        route_id: i64,
        stop_id: i64,
        body: Option<models::Stop>,
        context: &C) -> Result<UpdateRouteStopResponse, ApiError>
    {
        info!("update_route_stop({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, route_id, stop_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Route Setting
    async fn create_route_settings(
        &self,
        version: f64,
        body: Option<models::RouteSettings>,
        context: &C) -> Result<CreateRouteSettingsResponse, ApiError>
    {
        info!("create_route_settings({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Route Settings
    async fn search_route_settings(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        hub_id: Option<i64>,
        program_id: Option<i64>,
        keyword: Option<String>,
        context: &C) -> Result<SearchRouteSettingsResponse, ApiError>
    {
        info!("search_route_settings({}, \"{}\", {}, {}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, hub_id, program_id, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Route Setting
    async fn delete_route_settings(
        &self,
        version: f64,
        route_settings_id: i64,
        context: &C) -> Result<DeleteRouteSettingsResponse, ApiError>
    {
        info!("delete_route_settings({}, {}) - X-Span-ID: {:?}", version, route_settings_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Route Setting
    async fn get_route_settings(
        &self,
        version: f64,
        route_settings_id: i64,
        context: &C) -> Result<GetRouteSettingsResponse, ApiError>
    {
        info!("get_route_settings({}, {}) - X-Span-ID: {:?}", version, route_settings_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Route Setting
    async fn update_route_settings(
        &self,
        version: f64,
        route_settings_id: i64,
        body: Option<models::RouteSettings>,
        context: &C) -> Result<UpdateRouteSettingsResponse, ApiError>
    {
        info!("update_route_settings({}, {}, {:?}) - X-Span-ID: {:?}", version, route_settings_id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Compute Route
    async fn compute_routing(
        &self,
        version: f64,
        data: String,
        context: &C) -> Result<ComputeRoutingResponse, ApiError>
    {
        info!("compute_routing({}, \"{}\") - X-Span-ID: {:?}", version, data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Scheduled Notification
    async fn create_scheduled_notification(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        param_type: String,
        message: String,
        content_id: Option<i64>,
        content_name: Option<String>,
        content_type: Option<String>,
        parent_id: Option<i64>,
        parent_type: Option<String>,
        app_key: Option<String>,
        grouping_id: Option<String>,
        connection_group_ids: Option<String>,
        connection_account_ids: Option<String>,
        audience_id: Option<i64>,
        audience_ids: Option<String>,
        album_ids: Option<String>,
        report_id: Option<i64>,
        report_params: Option<String>,
        endpoint_url: Option<String>,
        payload: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        cron_type: Option<String>,
        meta_data: Option<String>,
        conditional_input: Option<String>,
        template_type: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        send_now: Option<bool>,
        event_type: Option<String>,
        deep_link_uri: Option<String>,
        send_to_all: Option<bool>,
        context: &C) -> Result<CreateScheduledNotificationResponse, ApiError>
    {
        info!("create_scheduled_notification({}, {}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, param_type, message, content_id, content_name, content_type, parent_id, parent_type, app_key, grouping_id, connection_group_ids, connection_account_ids, audience_id, audience_ids, album_ids, report_id, report_params, endpoint_url, payload, scheduled_date, start_date, end_date, cron_expression, cron_type, meta_data, conditional_input, template_type, visibility, active, send_now, event_type, deep_link_uri, send_to_all, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Scheduled Notification
    async fn delete_scheduled_notification(
        &self,
        version: f64,
        account_id: i64,
        scheduled_notification_id: i64,
        delete_by_grouping_id: Option<bool>,
        context: &C) -> Result<DeleteScheduledNotificationResponse, ApiError>
    {
        info!("delete_scheduled_notification({}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, scheduled_notification_id, delete_by_grouping_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Scheduled Notification
    async fn get_scheduled_notification(
        &self,
        version: f64,
        account_id: i64,
        scheduled_notification_id: i64,
        context: &C) -> Result<GetScheduledNotificationResponse, ApiError>
    {
        info!("get_scheduled_notification({}, {}, {}) - X-Span-ID: {:?}", version, account_id, scheduled_notification_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Generate Schedule Notifications
    async fn schedule_notification_listings(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        report_name: String,
        message: String,
        offset: i32,
        recipient_report_id: i64,
        report_params: Option<String>,
        param_type: Option<String>,
        context: &C) -> Result<ScheduleNotificationListingsResponse, ApiError>
    {
        info!("schedule_notification_listings({}, {}, \"{}\", \"{}\", \"{}\", {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, report_name, message, offset, recipient_report_id, report_params, param_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Scheduled Notifications
    async fn search_scheduled_notifications(
        &self,
        version: f64,
        account_id: i64,
        grouping_id: Option<String>,
        audience_id: Option<i64>,
        filter: Option<String>,
        types: Option<String>,
        content_ids: Option<String>,
        content_types: Option<String>,
        parent_ids: Option<String>,
        parent_types: Option<String>,
        statuses: Option<String>,
        template_types: Option<String>,
        app_key: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        group_by_grouping_id: Option<bool>,
        return_audience_account_count: Option<bool>,
        context: &C) -> Result<SearchScheduledNotificationsResponse, ApiError>
    {
        info!("search_scheduled_notifications({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, grouping_id, audience_id, filter, types, content_ids, content_types, parent_ids, parent_types, statuses, template_types, app_key, keyword, sort_field, descending, start, limit, active_only, group_by_grouping_id, return_audience_account_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Scheduled Notification
    async fn update_scheduled_notification(
        &self,
        version: f64,
        scheduled_notification_id: i64,
        account_id: i64,
        name: Option<String>,
        param_type: Option<String>,
        message: Option<String>,
        payload: Option<String>,
        content_id: Option<i64>,
        content_name: Option<String>,
        content_type: Option<String>,
        parent_id: Option<i64>,
        parent_type: Option<String>,
        app_key: Option<String>,
        grouping_id: Option<String>,
        connection_group_ids: Option<String>,
        connection_account_ids: Option<String>,
        audience_id: Option<i64>,
        audience_ids: Option<String>,
        album_ids: Option<String>,
        report_id: Option<i64>,
        report_params: Option<String>,
        endpoint_url: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        cron_type: Option<String>,
        meta_data: Option<String>,
        conditional_input: Option<String>,
        template_type: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        error_message: Option<String>,
        status: Option<String>,
        update_by_grouping_id: Option<bool>,
        send_now: Option<bool>,
        event_type: Option<String>,
        deep_link_uri: Option<String>,
        send_to_all: Option<bool>,
        context: &C) -> Result<UpdateScheduledNotificationResponse, ApiError>
    {
        info!("update_scheduled_notification({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, scheduled_notification_id, account_id, name, param_type, message, payload, content_id, content_name, content_type, parent_id, parent_type, app_key, grouping_id, connection_group_ids, connection_account_ids, audience_id, audience_ids, album_ids, report_id, report_params, endpoint_url, scheduled_date, start_date, end_date, cron_expression, cron_type, meta_data, conditional_input, template_type, visibility, active, error_message, status, update_by_grouping_id, send_now, event_type, deep_link_uri, send_to_all, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Score
    async fn create_score(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        points: i32,
        mission_id: Option<i64>,
        game_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        game_object_id: Option<i64>,
        time_taken: Option<i32>,
        highest: Option<bool>,
        context: &C) -> Result<CreateScoreResponse, ApiError>
    {
        info!("create_score({}, {}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, points, mission_id, game_id, pack_id, game_level_id, game_object_id, time_taken, highest, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Score
    async fn get_score(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        mission_id: Option<i64>,
        game_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        game_object_id: Option<i64>,
        score_object_type: Option<String>,
        score_status: Option<String>,
        context: &C) -> Result<GetScoreResponse, ApiError>
    {
        info!("get_score({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, mission_id, game_id, pack_id, game_level_id, game_object_id, score_object_type, score_status, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Score
    async fn search_scores(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        mission_id: Option<i64>,
        game_id: Option<i64>,
        pack_id: Option<i64>,
        game_level_id: Option<i64>,
        game_object_id: Option<i64>,
        context: &C) -> Result<SearchScoresResponse, ApiError>
    {
        info!("search_scores({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, mission_id, game_id, pack_id, game_level_id, game_object_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Secure Application
    async fn create_secure_application(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        key_cert: swagger::ByteArray,
        trust_store: swagger::ByteArray,
        username: String,
        password: String,
        active: Option<bool>,
        biometric_type: Option<models::CreateSecureApplicationBiometricTypeParameter>,
        biometric_position: Option<models::CreateSecureApplicationBiometricPositionParameter>,
        biometric_position2: Option<models::CreateSecureApplicationBiometricPositionParameter>,
        context: &C) -> Result<CreateSecureApplicationResponse, ApiError>
    {
        info!("create_secure_application({}, {}, \"{}\", {:?}, {:?}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, key_cert, trust_store, username, password, active, biometric_type, biometric_position, biometric_position2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Secure Application
    async fn delete_secure_application(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        context: &C) -> Result<DeleteSecureApplicationResponse, ApiError>
    {
        info!("delete_secure_application({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Clear
    async fn login_secure(
        &self,
        version: f64,
        app_key: String,
        biometric_file: swagger::ByteArray,
        device_id: Option<String>,
        biometric_file2: Option<swagger::ByteArray>,
        age_restriction: Option<i32>,
        return_profile: Option<bool>,
        response_filters: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<LoginSecureResponse, ApiError>
    {
        info!("login_secure({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, app_key, biometric_file, device_id, biometric_file2, age_restriction, return_profile, response_filters, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Purchase Clear
    async fn purchase_secure(
        &self,
        version: f64,
        body: models::PaymentRequest,
        context: &C) -> Result<PurchaseSecureResponse, ApiError>
    {
        info!("purchase_secure({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Rest Secure Application
    async fn reset_secure(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        context: &C) -> Result<ResetSecureResponse, ApiError>
    {
        info!("reset_secure({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Secure Application
    async fn update_secure_application(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        active: Option<bool>,
        key_cert: Option<swagger::ByteArray>,
        trust_store: Option<swagger::ByteArray>,
        username: Option<String>,
        password: Option<String>,
        biometric_type: Option<models::UpdateSecureApplicationBiometricTypeParameter>,
        biometric_position: Option<models::UpdateSecureApplicationBiometricPositionParameter>,
        biometric_position2: Option<models::UpdateSecureApplicationBiometricPositionParameter>,
        context: &C) -> Result<UpdateSecureApplicationResponse, ApiError>
    {
        info!("update_secure_application({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, active, key_cert, trust_store, username, password, biometric_type, biometric_position, biometric_position2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Service Hub
    async fn create_service_hub(
        &self,
        version: f64,
        body: Option<models::ServiceHub>,
        context: &C) -> Result<CreateServiceHubResponse, ApiError>
    {
        info!("create_service_hub({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Service Hubs
    async fn search_service_hubs(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        context: &C) -> Result<SearchServiceHubsResponse, ApiError>
    {
        info!("search_service_hubs({}, \"{}\", {}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, keyword, retailer_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Service Hub
    async fn delete_service_hub(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<DeleteServiceHubResponse, ApiError>
    {
        info!("delete_service_hub({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Service Hub
    async fn get_service_hub(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetServiceHubResponse, ApiError>
    {
        info!("get_service_hub({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Service Hub
    async fn post_service_hub(
        &self,
        version: f64,
        id: i64,
        body: Option<models::ServiceHub>,
        context: &C) -> Result<PostServiceHubResponse, ApiError>
    {
        info!("post_service_hub({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Service Hub
    async fn put_service_hub(
        &self,
        version: f64,
        id: i64,
        body: Option<models::ServiceHub>,
        context: &C) -> Result<PutServiceHubResponse, ApiError>
    {
        info!("put_service_hub({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Shipment
    async fn create_shipment(
        &self,
        version: f64,
        body: Option<models::Shipment>,
        context: &C) -> Result<CreateShipmentResponse, ApiError>
    {
        info!("create_shipment({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Shipments
    async fn search_shipments(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        owner_id: Option<i64>,
        rider_id: Option<i64>,
        route_id: Option<i64>,
        context: &C) -> Result<SearchShipmentsResponse, ApiError>
    {
        info!("search_shipments({}, \"{}\", {}, {}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, owner_id, rider_id, route_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancel Shipment
    async fn cancel_shipment(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<CancelShipmentResponse, ApiError>
    {
        info!("cancel_shipment({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Shipment
    async fn delete_shipment(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<DeleteShipmentResponse, ApiError>
    {
        info!("delete_shipment({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Shipment
    async fn get_shipment(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetShipmentResponse, ApiError>
    {
        info!("get_shipment({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Shipment
    async fn update_shipment(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Shipment>,
        context: &C) -> Result<UpdateShipmentResponse, ApiError>
    {
        info!("update_shipment({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Uupdate Shipment Status
    async fn update_shipment_status(
        &self,
        version: f64,
        id: i64,
        body: Option<std::collections::HashMap<String, bool>>,
        context: &C) -> Result<UpdateShipmentStatusResponse, ApiError>
    {
        info!("update_shipment_status({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Shipment Batch
    async fn create_shipment_batch(
        &self,
        version: f64,
        body: Option<models::ShipmentBatch>,
        context: &C) -> Result<CreateShipmentBatchResponse, ApiError>
    {
        info!("create_shipment_batch({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Shipment Batch
    async fn search_shipment_batch(
        &self,
        version: f64,
        hub_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        context: &C) -> Result<SearchShipmentBatchResponse, ApiError>
    {
        info!("search_shipment_batch({}, {}, \"{}\", {}, {}, {}) - X-Span-ID: {:?}", version, hub_id, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Shipment Batch
    async fn delete_shipment_batch(
        &self,
        version: f64,
        batch_id: i64,
        context: &C) -> Result<DeleteShipmentBatchResponse, ApiError>
    {
        info!("delete_shipment_batch({}, {}) - X-Span-ID: {:?}", version, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Shipment Batch
    async fn get_shipment_batch(
        &self,
        version: f64,
        batch_id: i64,
        context: &C) -> Result<GetShipmentBatchResponse, ApiError>
    {
        info!("get_shipment_batch({}, {}) - X-Span-ID: {:?}", version, batch_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Shipment Batch Status
    async fn get_shipment_batch_status(
        &self,
        version: f64,
        batch_id: i64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        valid: Option<bool>,
        started: Option<bool>,
        completed: Option<bool>,
        has_shipment: Option<bool>,
        has_route: Option<bool>,
        keyword: Option<String>,
        context: &C) -> Result<GetShipmentBatchStatusResponse, ApiError>
    {
        info!("get_shipment_batch_status({}, {}, {}, \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, batch_id, account_id, sort_field, descending, start, limit, valid, started, completed, has_shipment, has_route, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Routing Simulation
    async fn simulation(
        &self,
        version: f64,
        data: String,
        real_time: bool,
        context: &C) -> Result<SimulationResponse, ApiError>
    {
        info!("simulation({}, \"{}\", {}) - X-Span-ID: {:?}", version, data, real_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Stop
    async fn get_stop(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetStopResponse, ApiError>
    {
        info!("get_stop({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Stop
    async fn update_stop(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Stop>,
        context: &C) -> Result<UpdateStopResponse, ApiError>
    {
        info!("update_stop({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Stripe Checkout Session
    async fn create_stripe_checkout_session(
        &self,
        version: f64,
        app_key: String,
        stripe_parameters: String,
        context: &C) -> Result<CreateStripeCheckoutSessionResponse, ApiError>
    {
        info!("create_stripe_checkout_session({}, \"{}\", \"{}\") - X-Span-ID: {:?}", version, app_key, stripe_parameters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Subscription
    async fn create_subscription(
        &self,
        version: f64,
        account_id: i64,
        plan_id: Option<i64>,
        promo_code: Option<String>,
        context: &C) -> Result<CreateSubscriptionResponse, ApiError>
    {
        info!("create_subscription({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, plan_id, promo_code, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Subscription
    async fn delete_subscription(
        &self,
        version: f64,
        account_id: i64,
        context: &C) -> Result<DeleteSubscriptionResponse, ApiError>
    {
        info!("delete_subscription({}, {}) - X-Span-ID: {:?}", version, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Subscription
    async fn get_subscription(
        &self,
        version: f64,
        account_id: i64,
        context: &C) -> Result<GetSubscriptionResponse, ApiError>
    {
        info!("get_subscription({}, {}) - X-Span-ID: {:?}", version, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Subscription Plan
    async fn get_subscription_plan(
        &self,
        version: f64,
        plan_id: i64,
        context: &C) -> Result<GetSubscriptionPlanResponse, ApiError>
    {
        info!("get_subscription_plan({}, {}) - X-Span-ID: {:?}", version, plan_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Subscription Plans
    async fn get_subscription_plans(
        &self,
        version: f64,
        visible: Option<bool>,
        role: Option<String>,
        context: &C) -> Result<GetSubscriptionPlansResponse, ApiError>
    {
        info!("get_subscription_plans({}, {:?}, {:?}) - X-Span-ID: {:?}", version, visible, role, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Subscription Usage
    async fn get_subscription_usage(
        &self,
        version: f64,
        account_id: i64,
        application_id: Option<i64>,
        start: Option<i64>,
        end: Option<i64>,
        context: &C) -> Result<GetSubscriptionUsageResponse, ApiError>
    {
        info!("get_subscription_usage({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, application_id, start, end, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Subscription
    async fn update_subscription(
        &self,
        version: f64,
        account_id: i64,
        plan_id: Option<i64>,
        promo_code: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<UpdateSubscriptionResponse, ApiError>
    {
        info!("update_subscription({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, plan_id, promo_code, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Task
    async fn create_task(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        app_key: Option<String>,
        grouping_id: Option<String>,
        endpoint_url: Option<String>,
        payload: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        context: &C) -> Result<CreateTaskResponse, ApiError>
    {
        info!("create_task({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, app_key, grouping_id, endpoint_url, payload, scheduled_date, start_date, end_date, cron_expression, visibility, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Task
    async fn delete_task(
        &self,
        version: f64,
        account_id: i64,
        task_id: i64,
        context: &C) -> Result<DeleteTaskResponse, ApiError>
    {
        info!("delete_task({}, {}, {}) - X-Span-ID: {:?}", version, account_id, task_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Task
    async fn get_task(
        &self,
        version: f64,
        account_id: i64,
        task_id: i64,
        context: &C) -> Result<GetTaskResponse, ApiError>
    {
        info!("get_task({}, {}, {}) - X-Span-ID: {:?}", version, account_id, task_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tasks
    async fn search_tasks(
        &self,
        version: f64,
        account_id: i64,
        grouping_id: Option<String>,
        filter: Option<String>,
        statuses: Option<String>,
        template_types: Option<String>,
        app_key: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchTasksResponse, ApiError>
    {
        info!("search_tasks({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, grouping_id, filter, statuses, template_types, app_key, keyword, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Task
    async fn update_task(
        &self,
        version: f64,
        task_id: i64,
        account_id: i64,
        name: Option<String>,
        app_key: Option<String>,
        grouping_id: Option<String>,
        endpoint_url: Option<String>,
        payload: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        context: &C) -> Result<UpdateTaskResponse, ApiError>
    {
        info!("update_task({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, task_id, account_id, name, app_key, grouping_id, endpoint_url, payload, scheduled_date, start_date, end_date, cron_expression, visibility, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Territory
    async fn create_territory(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        active: Option<bool>,
        context: &C) -> Result<CreateTerritoryResponse, ApiError>
    {
        info!("create_territory({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, name, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Territory
    async fn delete_territory(
        &self,
        version: f64,
        account_id: i64,
        territory_id: i64,
        context: &C) -> Result<DeleteTerritoryResponse, ApiError>
    {
        info!("delete_territory({}, {}, {}) - X-Span-ID: {:?}", version, account_id, territory_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Territory
    async fn get_territory(
        &self,
        version: f64,
        territory_id: i64,
        context: &C) -> Result<GetTerritoryResponse, ApiError>
    {
        info!("get_territory({}, {}) - X-Span-ID: {:?}", version, territory_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Territories
    async fn search_territories(
        &self,
        version: f64,
        sort_field: models::SearchTerritoriesSortFieldParameter,
        descending: bool,
        keyword: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchTerritoriesResponse, ApiError>
    {
        info!("search_territories({}, {:?}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, keyword, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Territory
    async fn update_territory(
        &self,
        version: f64,
        account_id: i64,
        territory_id: i64,
        name: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<UpdateTerritoryResponse, ApiError>
    {
        info!("update_territory({}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, territory_id, name, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create/Update Theme
    async fn add_or_update_theme_descriptor(
        &self,
        version: f64,
        public_read: bool,
        public_write: bool,
        public_delete: bool,
        public_add: bool,
        visibility: models::AddAlbumCollectionVisibilityParameter,
        include_friend_group: bool,
        complete_with_default_values: bool,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        theme_descriptor_id: Option<i64>,
        title: Option<String>,
        description: Option<String>,
        connection_ids_to_add: Option<String>,
        connection_group_ids_to_add: Option<String>,
        app_version: Option<String>,
        color_value_json: Option<String>,
        string_replacer_json: Option<String>,
        custom_json_objects: Option<String>,
        icon_image: Option<swagger::ByteArray>,
        scene_atlas_image: Option<swagger::ByteArray>,
        bg_image: Option<swagger::ByteArray>,
        bg_sound: Option<swagger::ByteArray>,
        music_selection: Option<String>,
        location_description: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<AddOrUpdateThemeDescriptorResponse, ApiError>
    {
        info!("add_or_update_theme_descriptor({}, {}, {}, {}, {}, {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, public_read, public_write, public_delete, public_add, visibility, include_friend_group, complete_with_default_values, device_id, account_id, game_type, theme_descriptor_id, title, description, connection_ids_to_add, connection_group_ids_to_add, app_version, color_value_json, string_replacer_json, custom_json_objects, icon_image, scene_atlas_image, bg_image, bg_sound, music_selection, location_description, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Theme
    async fn get_theme_descriptor(
        &self,
        version: f64,
        theme_descriptor_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetThemeDescriptorResponse, ApiError>
    {
        info!("get_theme_descriptor({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, theme_descriptor_id, device_id, account_id, game_type, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Themes
    async fn get_theme_descriptors(
        &self,
        version: f64,
        filter: String,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        contest_type: Option<String>,
        owner_id: Option<i64>,
        q: Option<String>,
        keyword: Option<String>,
        _i: Option<i32>,
        _l: Option<i32>,
        date_created: Option<i64>,
        app_version: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<GetThemeDescriptorsResponse, ApiError>
    {
        info!("get_theme_descriptors({}, \"{}\", \"{}\", {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, filter, sort_field, descending, start, limit, device_id, account_id, game_type, contest_type, owner_id, q, keyword, _i, _l, date_created, app_version, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Theme
    async fn remove_theme_descriptor(
        &self,
        version: f64,
        theme_descriptor_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<RemoveThemeDescriptorResponse, ApiError>
    {
        info!("remove_theme_descriptor({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, theme_descriptor_id, device_id, account_id, game_type, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Credential
    async fn create_credential(
        &self,
        version: f64,
        third_party_id: String,
        third_party_token: String,
        network_uid: String,
        app_key: String,
        account_id: Option<i64>,
        device_id: Option<String>,
        session_id: Option<String>,
        third_party_name: Option<String>,
        email_address: Option<String>,
        signin_only_mode: Option<bool>,
        response_filters: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        third_party_refresh_token: Option<String>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        context: &C) -> Result<CreateCredentialResponse, ApiError>
    {
        info!("create_credential({}, \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, third_party_id, third_party_token, network_uid, app_key, account_id, device_id, session_id, third_party_name, email_address, signin_only_mode, response_filters, latitude, longitude, meta_data, third_party_refresh_token, audience_ids_to_add, audience_ids_to_remove, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Network
    async fn create_network(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        enable_introspection: bool,
        description: Option<String>,
        introspection_method: Option<String>,
        introspection_url: Option<String>,
        introspection_params: Option<String>,
        required_root_field: Option<String>,
        enable_mfa: Option<bool>,
        size_mfa: Option<i32>,
        shelf_life_mfa: Option<i32>,
        oauth_token_url: Option<String>,
        oauth_private_key: Option<swagger::ByteArray>,
        oauth_public_key: Option<swagger::ByteArray>,
        oauth_client_id: Option<String>,
        oauth_secret_key: Option<String>,
        body: Option<String>,
        context: &C) -> Result<CreateNetworkResponse, ApiError>
    {
        info!("create_network({}, {}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, enable_introspection, description, introspection_method, introspection_url, introspection_params, required_root_field, enable_mfa, size_mfa, shelf_life_mfa, oauth_token_url, oauth_private_key, oauth_public_key, oauth_client_id, oauth_secret_key, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Credential
    async fn delete_credential(
        &self,
        version: f64,
        account_id: i64,
        network_uid: String,
        third_party_id: String,
        app_key: String,
        context: &C) -> Result<DeleteCredentialResponse, ApiError>
    {
        info!("delete_credential({}, {}, \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, account_id, network_uid, third_party_id, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Network
    async fn delete_network(
        &self,
        version: f64,
        account_id: i64,
        network_uid: String,
        context: &C) -> Result<DeleteNetworkResponse, ApiError>
    {
        info!("delete_network({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, network_uid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Credential
    async fn get_credential(
        &self,
        version: f64,
        network_uid: String,
        app_key: String,
        account_id: Option<i64>,
        device_id: Option<String>,
        session_id: Option<String>,
        third_party_credential_id: Option<i64>,
        third_party_token: Option<String>,
        third_party_secret: Option<String>,
        create_new_account: Option<bool>,
        response_filters: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        audience_ids_to_add: Option<String>,
        audience_ids_to_remove: Option<String>,
        referral_account_id: Option<i64>,
        context: &C) -> Result<GetCredentialResponse, ApiError>
    {
        info!("get_credential({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, network_uid, app_key, account_id, device_id, session_id, third_party_credential_id, third_party_token, third_party_secret, create_new_account, response_filters, latitude, longitude, audience_ids_to_add, audience_ids_to_remove, referral_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Network
    async fn get_network(
        &self,
        version: f64,
        account_id: i64,
        network_uid: String,
        context: &C) -> Result<GetNetworkResponse, ApiError>
    {
        info!("get_network({}, {}, \"{}\") - X-Span-ID: {:?}", version, account_id, network_uid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Credentials
    async fn search_credentials(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        network_uid: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchCredentialsResponse, ApiError>
    {
        info!("search_credentials({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, network_uid, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Networks
    async fn search_networks(
        &self,
        version: f64,
        account_id: i64,
        sort_field: models::SearchNetworksSortFieldParameter,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        keyword: Option<String>,
        filter_billable: Option<bool>,
        context: &C) -> Result<SearchNetworksResponse, ApiError>
    {
        info!("search_networks({}, {}, {:?}, {}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, start, limit, active_only, keyword, filter_billable, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send MFA Challenge
    async fn send_mfa_challenge(
        &self,
        version: f64,
        network_uid: String,
        app_key: String,
        third_party_token: Option<String>,
        third_party_credential_id: Option<i64>,
        device_id: Option<String>,
        context: &C) -> Result<SendMfaChallengeResponse, ApiError>
    {
        info!("send_mfa_challenge({}, \"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, network_uid, app_key, third_party_token, third_party_credential_id, device_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Credential
    async fn update_credential(
        &self,
        version: f64,
        network_uid: String,
        third_party_id: String,
        app_key: String,
        device_id: Option<String>,
        third_party_name: Option<String>,
        third_party_token: Option<String>,
        response_filters: Option<String>,
        meta_data: Option<String>,
        third_party_refresh_token: Option<String>,
        context: &C) -> Result<UpdateCredentialResponse, ApiError>
    {
        info!("update_credential({}, \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, network_uid, third_party_id, app_key, device_id, third_party_name, third_party_token, response_filters, meta_data, third_party_refresh_token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Network
    async fn update_network(
        &self,
        version: f64,
        account_id: i64,
        network_uid: String,
        name: Option<String>,
        description: Option<String>,
        enable_introspection: Option<bool>,
        introspection_method: Option<String>,
        introspection_url: Option<String>,
        introspection_params: Option<String>,
        required_root_field: Option<String>,
        enable_mfa: Option<bool>,
        size_mfa: Option<i32>,
        shelf_life_mfa: Option<i32>,
        oauth_token_url: Option<String>,
        oauth_private_key: Option<swagger::ByteArray>,
        oauth_public_key: Option<swagger::ByteArray>,
        oauth_client_id: Option<String>,
        oauth_secret_key: Option<String>,
        body: Option<String>,
        context: &C) -> Result<UpdateNetworkResponse, ApiError>
    {
        info!("update_network({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, network_uid, name, description, enable_introspection, introspection_method, introspection_url, introspection_params, required_root_field, enable_mfa, size_mfa, shelf_life_mfa, oauth_token_url, oauth_private_key, oauth_public_key, oauth_client_id, oauth_secret_key, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Ticket Count
    async fn get_ticket_count(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        ticket_type: Option<String>,
        context: &C) -> Result<GetTicketCountResponse, ApiError>
    {
        info!("get_ticket_count({}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, game_type, app_key, ticket_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Ticket List
    async fn get_ticket_list(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        ticket_object_type: Option<String>,
        action_type: Option<String>,
        ticket_ids: Option<String>,
        object_ids: Option<String>,
        receipt_tokens: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        context: &C) -> Result<GetTicketListResponse, ApiError>
    {
        info!("get_ticket_list({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, ticket_object_type, action_type, ticket_ids, object_ids, receipt_tokens, game_type, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Gift Tickets
    async fn gift_purchase(
        &self,
        version: f64,
        receiver_account_id: i64,
        ticket_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        asset_id: Option<i64>,
        custom_message: Option<String>,
        game_type: Option<String>,
        app_key: Option<String>,
        context: &C) -> Result<GiftPurchaseResponse, ApiError>
    {
        info!("gift_purchase({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, receiver_account_id, ticket_id, device_id, account_id, asset_id, custom_message, game_type, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Save Ticket
    async fn save_ticket(
        &self,
        version: f64,
        action_type: String,
        ticket_object_type: String,
        return_nulls: Option<bool>,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        object_id: Option<i64>,
        purchase_code: Option<String>,
        receipt_token: Option<String>,
        receipt_data: Option<String>,
        count: Option<i64>,
        ticket_type: Option<String>,
        purchase_provider: Option<String>,
        purchase_type: Option<String>,
        return_profile_response: Option<bool>,
        include_profile_response: Option<bool>,
        app_version: Option<String>,
        context: &C) -> Result<SaveTicketResponse, ApiError>
    {
        info!("save_ticket({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, action_type, ticket_object_type, return_nulls, device_id, account_id, game_type, app_key, object_id, purchase_code, receipt_token, receipt_data, count, ticket_type, purchase_provider, purchase_type, return_profile_response, include_profile_response, app_version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Save Ticket with Reciept
    async fn save_ticket_via_file_upload(
        &self,
        version: f64,
        action_type: String,
        ticket_object_type: String,
        receipt_data: swagger::ByteArray,
        return_nulls: Option<bool>,
        device_id: Option<String>,
        account_id: Option<i64>,
        game_type: Option<String>,
        app_key: Option<String>,
        object_id: Option<i64>,
        purchase_code: Option<String>,
        receipt_token: Option<String>,
        count: Option<i64>,
        ticket_type: Option<String>,
        purchase_provider: Option<String>,
        purchase_type: Option<String>,
        return_profile_response: Option<bool>,
        include_profile_response: Option<bool>,
        app_version: Option<String>,
        context: &C) -> Result<SaveTicketViaFileUploadResponse, ApiError>
    {
        info!("save_ticket_via_file_upload({}, \"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, action_type, ticket_object_type, receipt_data, return_nulls, device_id, account_id, game_type, app_key, object_id, purchase_code, receipt_token, count, ticket_type, purchase_provider, purchase_type, return_profile_response, include_profile_response, app_version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Ticket Offers
    async fn ticket_offers(
        &self,
        version: f64,
        context: &C) -> Result<TicketOffersResponse, ApiError>
    {
        info!("ticket_offers({}) - X-Span-ID: {:?}", version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Tournament
    async fn create_tournament(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        title: String,
        cost_to_play: i32,
        start_date: i64,
        sub_type: Option<String>,
        image_asset_id: Option<i64>,
        seconds_between_levels: Option<i32>,
        seconds_for_tie_breaker: Option<i32>,
        seconds_between_packs: Option<i32>,
        maximum_level_length: Option<i32>,
        cost_to_play_type: Option<String>,
        minimum_to_play: Option<i32>,
        starting_limit: Option<i32>,
        available_limit: Option<i32>,
        description: Option<String>,
        meta_data: Option<String>,
        audience_ids: Option<String>,
        active: Option<bool>,
        enable_buy_back: Option<bool>,
        offer_ids: Option<String>,
        offer_asset_id: Option<i64>,
        fixed_reward: Option<bool>,
        split_reward: Option<models::CreateTournamentSplitRewardParameter>,
        allocate_tickets: Option<bool>,
        tournament_data: Option<String>,
        mission_type: Option<models::CreateTournamentMissionTypeParameter>,
        visibility: Option<models::CreateTournamentVisibilityParameter>,
        preliminary_groups: Option<i32>,
        preliminary_group_advancements: Option<String>,
        enable_multiple_entries: Option<bool>,
        enable_multiple_votes: Option<bool>,
        featured: Option<bool>,
        winner_tag: Option<String>,
        tie_tag: Option<String>,
        context: &C) -> Result<CreateTournamentResponse, ApiError>
    {
        info!("create_tournament({}, {}, \"{}\", \"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, title, cost_to_play, start_date, sub_type, image_asset_id, seconds_between_levels, seconds_for_tie_breaker, seconds_between_packs, maximum_level_length, cost_to_play_type, minimum_to_play, starting_limit, available_limit, description, meta_data, audience_ids, active, enable_buy_back, offer_ids, offer_asset_id, fixed_reward, split_reward, allocate_tickets, tournament_data, mission_type, visibility, preliminary_groups, preliminary_group_advancements, enable_multiple_entries, enable_multiple_votes, featured, winner_tag, tie_tag, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Tournament
    async fn delete_tournament(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        context: &C) -> Result<DeleteTournamentResponse, ApiError>
    {
        info!("delete_tournament({}, {}, {}) - X-Span-ID: {:?}", version, account_id, mission_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Tournament
    async fn get_tournament(
        &self,
        version: f64,
        account_id: i64,
        mission_id: Option<i64>,
        join_code: Option<String>,
        include_scores: Option<models::GetTournamentIncludeScoresParameter>,
        object_preview_size: Option<i32>,
        context: &C) -> Result<GetTournamentResponse, ApiError>
    {
        info!("get_tournament({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, mission_id, join_code, include_scores, object_preview_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tournament Objects
    async fn search_objects(
        &self,
        version: f64,
        account_id: i64,
        game_level_id: i64,
        sort_field: Option<models::SearchObjectsSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchObjectsResponse, ApiError>
    {
        info!("search_objects({}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, game_level_id, sort_field, descending, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tournament Rounds
    async fn search_rounds(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        status: Option<String>,
        mission_type: Option<models::SearchRoundsMissionTypeParameter>,
        current_only: Option<bool>,
        visibilities: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRoundsResponse, ApiError>
    {
        info!("search_rounds({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, status, mission_type, current_only, visibilities, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tournaments
    async fn search_tournaments(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        keyword: Option<String>,
        sub_type: Option<String>,
        include_inactive: Option<bool>,
        mission_types: Option<String>,
        filter: Option<models::SearchTournamentsFilterParameter>,
        sort_field: Option<models::SearchTournamentsSortFieldParameter>,
        descending: Option<bool>,
        visibility: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchTournamentsResponse, ApiError>
    {
        info!("search_tournaments({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, keyword, sub_type, include_inactive, mission_types, filter, sort_field, descending, visibility, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Submit Tournament Score
    async fn submit_tournament_score(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        mission_id: i64,
        game_id: i64,
        pack_id: i64,
        scores: String,
        game_level_id: Option<i64>,
        context: &C) -> Result<SubmitTournamentScoreResponse, ApiError>
    {
        info!("submit_tournament_score({}, {}, \"{}\", {}, {}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, mission_id, game_id, pack_id, scores, game_level_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Submit a vote for a multi-stage album tournament.
    async fn submit_tournament_vote(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        mission_id: i64,
        game_object_id: i64,
        device_id: Option<String>,
        check_if_device_already_voted: Option<bool>,
        context: &C) -> Result<SubmitTournamentVoteResponse, ApiError>
    {
        info!("submit_tournament_vote({}, {}, \"{}\", {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, mission_id, game_object_id, device_id, check_if_device_already_voted, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Substitute Tournament Player
    async fn substitute_tournament_player(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        pack_id: i64,
        game_level_id: i64,
        context: &C) -> Result<SubstituteTournamentPlayerResponse, ApiError>
    {
        info!("substitute_tournament_player({}, {}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, mission_id, pack_id, game_level_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Tournament
    async fn update_tournament(
        &self,
        version: f64,
        account_id: i64,
        mission_id: i64,
        title: Option<String>,
        sub_type: Option<String>,
        image_asset_id: Option<i64>,
        seconds_between_levels: Option<i32>,
        seconds_for_tie_breaker: Option<i32>,
        seconds_between_packs: Option<i32>,
        maximum_level_length: Option<i32>,
        cost_to_play: Option<i32>,
        cost_to_play_type: Option<String>,
        minimum_to_play: Option<i32>,
        starting_limit: Option<i32>,
        available_limit: Option<i32>,
        description: Option<String>,
        meta_data: Option<String>,
        start_date: Option<i64>,
        audience_ids: Option<String>,
        active: Option<bool>,
        enable_buy_back: Option<bool>,
        offer_ids: Option<String>,
        offer_asset_id: Option<i64>,
        fixed_reward: Option<bool>,
        split_reward: Option<models::UpdateTournamentSplitRewardParameter>,
        allocate_tickets: Option<bool>,
        tournament_data: Option<String>,
        visibility: Option<models::CreateMediaOfferVisibilityParameter>,
        preliminary_groups: Option<i32>,
        preliminary_group_advancements: Option<String>,
        enable_multiple_entries: Option<bool>,
        enable_multiple_votes: Option<bool>,
        featured: Option<bool>,
        winner_tag: Option<String>,
        tie_tag: Option<String>,
        context: &C) -> Result<UpdateTournamentResponse, ApiError>
    {
        info!("update_tournament({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, mission_id, title, sub_type, image_asset_id, seconds_between_levels, seconds_for_tie_breaker, seconds_between_packs, maximum_level_length, cost_to_play, cost_to_play_type, minimum_to_play, starting_limit, available_limit, description, meta_data, start_date, audience_ids, active, enable_buy_back, offer_ids, offer_asset_id, fixed_reward, split_reward, allocate_tickets, tournament_data, visibility, preliminary_groups, preliminary_group_advancements, enable_multiple_entries, enable_multiple_votes, featured, winner_tag, tie_tag, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Batch Tracking
    async fn batch_save_tracking(
        &self,
        version: f64,
        data: String,
        device_id: Option<String>,
        account_id: Option<i64>,
        generate_accounts: Option<bool>,
        update_account_locations: Option<bool>,
        default_tag: Option<String>,
        slave_uid: Option<String>,
        context: &C) -> Result<BatchSaveTrackingResponse, ApiError>
    {
        info!("batch_save_tracking({}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, data, device_id, account_id, generate_accounts, update_account_locations, default_tag, slave_uid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Predicted Locations
    async fn get_predicted_locations(
        &self,
        version: f64,
        account_id: i64,
        latitude: Option<f64>,
        longitude: Option<f64>,
        date_check: Option<i64>,
        hour_check: Option<String>,
        threshold: Option<i64>,
        distance_unit: Option<models::GetOfferListCountsDistanceUnitParameter>,
        search_range: Option<f64>,
        sort_order: Option<models::GetPredictedLocationsSortOrderParameter>,
        context: &C) -> Result<GetPredictedLocationsResponse, ApiError>
    {
        info!("get_predicted_locations({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, latitude, longitude, date_check, hour_check, threshold, distance_unit, search_range, sort_order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Tracking Path
    async fn get_predicted_path(
        &self,
        version: f64,
        account_id: i64,
        start_step_id: i64,
        end_step_id: i64,
        context: &C) -> Result<GetPredictedPathResponse, ApiError>
    {
        info!("get_predicted_path({}, {}, {}, {}) - X-Span-ID: {:?}", version, account_id, start_step_id, end_step_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Preferred Locations
    async fn get_preferred_locations(
        &self,
        version: f64,
        account_id: i64,
        latitude: Option<f64>,
        longitude: Option<f64>,
        date_check: Option<i64>,
        hour_check: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        search_range: Option<f64>,
        distance_unit: Option<models::GetOfferListCountsDistanceUnitParameter>,
        context: &C) -> Result<GetPreferredLocationsResponse, ApiError>
    {
        info!("get_preferred_locations({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, latitude, longitude, date_check, hour_check, sort_field, descending, start, limit, search_range, distance_unit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tracking
    async fn get_tracking_legs(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        owner_id: Option<i64>,
        tracking_device_id: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        tags: Option<String>,
        get_last_point: Option<bool>,
        context: &C) -> Result<GetTrackingLegsResponse, ApiError>
    {
        info!("get_tracking_legs({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, owner_id, tracking_device_id, start_date, end_date, tags, get_last_point, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Tracking Leg
    async fn save_tracking_leg(
        &self,
        version: f64,
        start_lat: f64,
        start_lng: f64,
        start_date: i64,
        end_lat: f64,
        end_lng: f64,
        end_date: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        distance: Option<f64>,
        duration: Option<i64>,
        steps: Option<String>,
        tags: Option<String>,
        context: &C) -> Result<SaveTrackingLegResponse, ApiError>
    {
        info!("save_tracking_leg({}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, start_lat, start_lng, start_date, end_lat, end_lng, end_date, device_id, account_id, distance, duration, steps, tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Tracking Step
    async fn save_tracking_step(
        &self,
        version: f64,
        leg_id: i64,
        start_lat: f64,
        start_lng: f64,
        start_date: i64,
        end_lat: f64,
        end_lng: f64,
        end_date: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        distance: Option<f64>,
        duration: Option<i64>,
        context: &C) -> Result<SaveTrackingStepResponse, ApiError>
    {
        info!("save_tracking_step({}, {}, {}, {}, {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, leg_id, start_lat, start_lng, start_date, end_lat, end_lng, end_date, device_id, account_id, distance, duration, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Tracking
    async fn search_accounts_with_tracking_legs(
        &self,
        version: f64,
        account_id: i64,
        keyword: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        tags: Option<String>,
        audience_ids: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        range: Option<f64>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchAccountsWithTrackingLegsResponse, ApiError>
    {
        info!("search_accounts_with_tracking_legs({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, keyword, start_date, end_date, tags, audience_ids, latitude, longitude, range, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Tracking (Billable)
    async fn search_tracking_legs(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        tracking_device_id: Option<String>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        tags: Option<String>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchTrackingLegsResponse, ApiError>
    {
        info!("search_tracking_legs({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, tracking_device_id, start_date, end_date, tags, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Trigger
    async fn create_trigger(
        &self,
        version: f64,
        account_id: i64,
        name: String,
        app_key: Option<String>,
        grouping_id: Option<String>,
        endpoint_url: Option<String>,
        payload: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        conditional_input: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        context: &C) -> Result<CreateTriggerResponse, ApiError>
    {
        info!("create_trigger({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, name, app_key, grouping_id, endpoint_url, payload, scheduled_date, start_date, end_date, cron_expression, conditional_input, visibility, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Trigger
    async fn delete_trigger(
        &self,
        version: f64,
        account_id: i64,
        trigger_id: i64,
        context: &C) -> Result<DeleteTriggerResponse, ApiError>
    {
        info!("delete_trigger({}, {}, {}) - X-Span-ID: {:?}", version, account_id, trigger_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Trigger
    async fn get_trigger(
        &self,
        version: f64,
        account_id: i64,
        trigger_id: i64,
        context: &C) -> Result<GetTriggerResponse, ApiError>
    {
        info!("get_trigger({}, {}, {}) - X-Span-ID: {:?}", version, account_id, trigger_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Triggers
    async fn search_triggers(
        &self,
        version: f64,
        account_id: i64,
        grouping_id: Option<String>,
        filter: Option<String>,
        statuses: Option<String>,
        template_types: Option<String>,
        app_key: Option<String>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        active_only: Option<bool>,
        context: &C) -> Result<SearchTriggersResponse, ApiError>
    {
        info!("search_triggers({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, grouping_id, filter, statuses, template_types, app_key, keyword, sort_field, descending, start, limit, active_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Trigger
    async fn update_trigger(
        &self,
        version: f64,
        trigger_id: i64,
        account_id: i64,
        name: Option<String>,
        app_key: Option<String>,
        grouping_id: Option<String>,
        endpoint_url: Option<String>,
        payload: Option<String>,
        scheduled_date: Option<i64>,
        start_date: Option<i64>,
        end_date: Option<i64>,
        cron_expression: Option<String>,
        conditional_input: Option<String>,
        visibility: Option<models::AddAlbumCollectionVisibilityParameter>,
        active: Option<bool>,
        context: &C) -> Result<UpdateTriggerResponse, ApiError>
    {
        info!("update_trigger({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, trigger_id, account_id, name, app_key, grouping_id, endpoint_url, payload, scheduled_date, start_date, end_date, cron_expression, conditional_input, visibility, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Trip
    async fn create_trip(
        &self,
        version: f64,
        body: Option<models::Trip>,
        context: &C) -> Result<CreateTripResponse, ApiError>
    {
        info!("create_trip({}, {:?}) - X-Span-ID: {:?}", version, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Process Trip Matches
    async fn process_trip_matches(
        &self,
        version: f64,
        start_date: Option<i64>,
        end_date: Option<i64>,
        trip_id: Option<i64>,
        context: &C) -> Result<ProcessTripMatchesResponse, ApiError>
    {
        info!("process_trip_matches({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, start_date, end_date, trip_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Trips
    async fn search(
        &self,
        version: f64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        start_date: Option<i64>,
        end_date: Option<i64>,
        has_notifications: Option<bool>,
        context: &C) -> Result<SearchResponse, ApiError>
    {
        info!("search({}, {}, \"{}\", {}, {}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, start, limit, active_only, start_date, end_date, has_notifications, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Trips
    async fn search_trips(
        &self,
        version: f64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        start_date: Option<i64>,
        end_date: Option<i64>,
        matched_has_route: Option<bool>,
        matched_has_driver: Option<bool>,
        context: &C) -> Result<SearchTripsResponse, ApiError>
    {
        info!("search_trips({}, {}, \"{}\", {}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, start, limit, active_only, start_date, end_date, matched_has_route, matched_has_driver, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Trip Notifications
    async fn update_trip_notifications(
        &self,
        version: f64,
        id: i64,
        notifications: Option<String>,
        context: &C) -> Result<UpdateTripNotificationsResponse, ApiError>
    {
        info!("update_trip_notifications({}, {}, {:?}) - X-Span-ID: {:?}", version, id, notifications, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Trip
    async fn delete(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<DeleteResponse, ApiError>
    {
        info!("delete({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Set Trip Preference Driver
    async fn drive_trip(
        &self,
        version: f64,
        id: i64,
        recurrence: bool,
        context: &C) -> Result<DriveTripResponse, ApiError>
    {
        info!("drive_trip({}, {}, {}) - X-Span-ID: {:?}", version, id, recurrence, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Set Trip Preference Flexible
    async fn flexible_trip(
        &self,
        version: f64,
        id: i64,
        recurrence: bool,
        context: &C) -> Result<FlexibleTripResponse, ApiError>
    {
        info!("flexible_trip({}, {}, {}) - X-Span-ID: {:?}", version, id, recurrence, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Trip
    async fn get_trip(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetTripResponse, ApiError>
    {
        info!("get_trip({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Trip Matches
    async fn get_trip_matches(
        &self,
        version: f64,
        id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        matched_has_route: Option<bool>,
        matched_has_driver: Option<bool>,
        context: &C) -> Result<GetTripMatchesResponse, ApiError>
    {
        info!("get_trip_matches({}, {}, \"{}\", {}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, id, sort_field, descending, start, limit, active_only, matched_has_route, matched_has_driver, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Set Trip Preference Rider
    async fn ride(
        &self,
        version: f64,
        id: i64,
        recurrence: bool,
        context: &C) -> Result<RideResponse, ApiError>
    {
        info!("ride({}, {}, {}) - X-Span-ID: {:?}", version, id, recurrence, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Trip Locations
    async fn update_locations(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Trip>,
        context: &C) -> Result<UpdateLocationsResponse, ApiError>
    {
        info!("update_locations({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Recurrence Locations
    async fn update_recurrence_locations(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Trip>,
        context: &C) -> Result<UpdateRecurrenceLocationsResponse, ApiError>
    {
        info!("update_recurrence_locations({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Recurrence Shipments
    async fn update_recurrence_shipments(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Trip>,
        context: &C) -> Result<UpdateRecurrenceShipmentsResponse, ApiError>
    {
        info!("update_recurrence_shipments({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Trip Shipments
    async fn update_shipments(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Trip>,
        context: &C) -> Result<UpdateShipmentsResponse, ApiError>
    {
        info!("update_shipments({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Trip
    async fn update_trip(
        &self,
        version: f64,
        id: i64,
        body: Option<models::Trip>,
        context: &C) -> Result<UpdateTripResponse, ApiError>
    {
        info!("update_trip({}, {}, {:?}) - X-Span-ID: {:?}", version, id, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Buy Offer by SMS
    async fn sms_buy_offer(
        &self,
        version: f64,
        app_key: String,
        body: String,
        from: String,
        currency_type: String,
        context: &C) -> Result<SmsBuyOfferResponse, ApiError>
    {
        info!("sms_buy_offer({}, \"{}\", \"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", version, app_key, body, from, currency_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Authorize Twitter
    async fn authorize_twitter(
        &self,
        version: f64,
        app_key: String,
        context: &C) -> Result<AuthorizeTwitterResponse, ApiError>
    {
        info!("authorize_twitter({}, \"{}\") - X-Span-ID: {:?}", version, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Login Twitter
    async fn login_twitter(
        &self,
        version: f64,
        access_token: String,
        access_token_secret: String,
        app_key: String,
        response_filters: String,
        device_id: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<LoginTwitterResponse, ApiError>
    {
        info!("login_twitter({}, \"{}\", \"{}\", \"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, access_token, access_token_secret, app_key, response_filters, device_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add User
    async fn add_users_to_permissionable(
        &self,
        version: f64,
        permissionable_type: models::AddUsersToPermissionablePermissionableTypeParameter,
        permissionable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        read: Option<bool>,
        write: Option<bool>,
        delete: Option<bool>,
        add: Option<bool>,
        connection_ids: Option<String>,
        connection_account_ids: Option<String>,
        connection_group_ids: Option<String>,
        pending: Option<bool>,
        admin: Option<bool>,
        include_friend_group: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        audience_ids: Option<String>,
        context: &C) -> Result<AddUsersToPermissionableResponse, ApiError>
    {
        info!("add_users_to_permissionable({}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, permissionable_type, permissionable_id, device_id, account_id, read, write, delete, add, connection_ids, connection_account_ids, connection_group_ids, pending, admin, include_friend_group, latitude, longitude, audience_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Approve Permissionable
    async fn approve_permissionable(
        &self,
        version: f64,
        permissionable_type: models::AddUsersToPermissionablePermissionableTypeParameter,
        permissionable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        approval_status: Option<models::ApprovePermissionableApprovalStatusParameter>,
        context: &C) -> Result<ApprovePermissionableResponse, ApiError>
    {
        info!("approve_permissionable({}, {:?}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, permissionable_type, permissionable_id, device_id, account_id, approval_status, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Leave
    async fn leave_from_permissionable(
        &self,
        version: f64,
        permissionable_type: String,
        permissionable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        context: &C) -> Result<LeaveFromPermissionableResponse, ApiError>
    {
        info!("leave_from_permissionable({}, \"{}\", {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, permissionable_type, permissionable_id, device_id, account_id, latitude, longitude, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove User
    async fn remove_users_from_permissionable(
        &self,
        version: f64,
        permissionable_type: models::AddUsersToPermissionablePermissionableTypeParameter,
        permissionable_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_ids: Option<String>,
        connection_account_ids: Option<String>,
        connection_group_ids: Option<String>,
        remove_friend_group: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        audience_ids: Option<String>,
        context: &C) -> Result<RemoveUsersFromPermissionableResponse, ApiError>
    {
        info!("remove_users_from_permissionable({}, {:?}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, permissionable_type, permissionable_id, device_id, account_id, connection_ids, connection_account_ids, connection_group_ids, remove_friend_group, latitude, longitude, audience_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Permissionables
    async fn search_permissionables(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        connection_account_ids: Option<String>,
        permissionable_type: Option<models::AddUsersToPermissionablePermissionableTypeParameter>,
        permissionable_id: Option<i64>,
        keyword: Option<String>,
        sort_field: Option<String>,
        descending: Option<bool>,
        pending: Option<bool>,
        admin: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchPermissionablesResponse, ApiError>
    {
        info!("search_permissionables({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, connection_account_id, connection_account_ids, permissionable_type, permissionable_id, keyword, sort_field, descending, pending, admin, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Permissionables by Distnace
    async fn search_permissionables_following_distance(
        &self,
        version: f64,
        latitude: f64,
        longitude: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        connection_account_id: Option<i64>,
        connection_account_ids: Option<String>,
        permissionable_type: Option<models::AddUsersToPermissionablePermissionableTypeParameter>,
        permissionable_id: Option<i64>,
        search_range: Option<f64>,
        keyword: Option<String>,
        pending: Option<bool>,
        admin: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        context: &C) -> Result<SearchPermissionablesFollowingDistanceResponse, ApiError>
    {
        info!("search_permissionables_following_distance({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, latitude, longitude, device_id, account_id, connection_account_id, connection_account_ids, permissionable_type, permissionable_id, search_range, keyword, pending, admin, start, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create following
    async fn create_following(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<CreateFollowingResponse, ApiError>
    {
        info!("create_following({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Vatom Space
    async fn create_space(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<CreateSpaceResponse, ApiError>
    {
        info!("create_space({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Vatom Event
    async fn create_vatom_event(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<CreateVatomEventResponse, ApiError>
    {
        info!("create_vatom_event({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete following
    async fn delete_following(
        &self,
        version: f64,
        account_id: i64,
        vatom_rels_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<DeleteFollowingResponse, ApiError>
    {
        info!("delete_following({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_rels_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Reset All Points Balance
    async fn delete_points_balance(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<DeletePointsBalanceResponse, ApiError>
    {
        info!("delete_points_balance({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Vatom Space
    async fn delete_space(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_space_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<DeleteSpaceResponse, ApiError>
    {
        info!("delete_space({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_space_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Vatom Event
    async fn delete_vatom_event(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_event_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<DeleteVatomEventResponse, ApiError>
    {
        info!("delete_vatom_event({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_event_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Vatom NFT
    async fn delete_vatom_nft(
        &self,
        version: f64,
        account_id: i64,
        vatom_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<DeleteVatomNftResponse, ApiError>
    {
        info!("delete_vatom_nft({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Execute Action on NFT
    async fn execute_action_on_nft(
        &self,
        version: f64,
        account_id: i64,
        vatom_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ExecuteActionOnNftResponse, ApiError>
    {
        info!("execute_action_on_nft({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Vatom Geo Map
    async fn geomap_search(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GeomapSearchResponse, ApiError>
    {
        info!("geomap_search({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Business Behaviors
    async fn get_business_behaviors(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetBusinessBehaviorsResponse, ApiError>
    {
        info!("get_business_behaviors({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get the coins for a Business
    async fn get_business_coins_balance(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetBusinessCoinsBalanceResponse, ApiError>
    {
        info!("get_business_coins_balance({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get the user business ids
    async fn get_business_ids(
        &self,
        version: f64,
        account_id: i64,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetBusinessIdsResponse, ApiError>
    {
        info!("get_business_ids({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Business Info
    async fn get_business_info(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetBusinessInfoResponse, ApiError>
    {
        info!("get_business_info({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Business Users
    async fn get_business_users(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetBusinessUsersResponse, ApiError>
    {
        info!("get_business_users({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Campaign Group Entities
    async fn get_campaign_group_entities(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetCampaignGroupEntitiesResponse, ApiError>
    {
        info!("get_campaign_group_entities({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Campaign Group Rules
    async fn get_campaign_group_rules(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetCampaignGroupRulesResponse, ApiError>
    {
        info!("get_campaign_group_rules({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Campaign Group Stats
    async fn get_campaign_group_stats(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetCampaignGroupStatsResponse, ApiError>
    {
        info!("get_campaign_group_stats({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Campaign Info
    async fn get_campaign_info(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetCampaignInfoResponse, ApiError>
    {
        info!("get_campaign_info({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Event Guest List
    async fn get_event_guest_list(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_event_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetEventGuestListResponse, ApiError>
    {
        info!("get_event_guest_list({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_event_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom User's Inventory
    async fn get_inventory(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetInventoryResponse, ApiError>
    {
        info!("get_inventory({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get following
    async fn get_my_following(
        &self,
        version: f64,
        account_id: i64,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetMyFollowingResponse, ApiError>
    {
        info!("get_my_following({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Points Balance
    async fn get_points_balance(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetPointsBalanceResponse, ApiError>
    {
        info!("get_points_balance({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Points Balance as Business
    async fn get_points_balance_as_business(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_user_id: String,
        vatom_campaign_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetPointsBalanceAsBusinessResponse, ApiError>
    {
        info!("get_points_balance_as_business({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_user_id, vatom_campaign_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Space
    async fn get_space(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_space_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetSpaceResponse, ApiError>
    {
        info!("get_space({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_space_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get the coins for a user (as a Business)
    async fn get_user_coins_as_business(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        app_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserCoinsAsBusinessResponse, ApiError>
    {
        info!("get_user_coins_as_business({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, app_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Gets the coins balance for a Vatom User
    async fn get_user_coins_balance(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserCoinsBalanceResponse, ApiError>
    {
        info!("get_user_coins_balance({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user followers
    async fn get_user_followers(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserFollowersResponse, ApiError>
    {
        info!("get_user_followers({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user following
    async fn get_user_following(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserFollowingResponse, ApiError>
    {
        info!("get_user_following({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get User Info
    async fn get_user_info(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserInfoResponse, ApiError>
    {
        info!("get_user_info({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom User Profile
    async fn get_user_profile(
        &self,
        version: f64,
        account_id: i64,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetUserProfileResponse, ApiError>
    {
        info!("get_user_profile({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom Event
    async fn get_vatom_event(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_event_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetVatomEventResponse, ApiError>
    {
        info!("get_vatom_event({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_event_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vatom NFT Details
    async fn get_vatom_nft(
        &self,
        version: f64,
        account_id: i64,
        vatom_id: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<GetVatomNftResponse, ApiError>
    {
        info!("get_vatom_nft({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Vatom Communities
    async fn list_communities(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ListCommunitiesResponse, ApiError>
    {
        info!("list_communities({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Vatom Events
    async fn list_events(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ListEventsResponse, ApiError>
    {
        info!("list_events({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Vatom Spaces
    async fn list_spaces(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ListSpacesResponse, ApiError>
    {
        info!("list_spaces({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Coin Transactions for a Vatom User
    async fn list_user_coin_transactions(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ListUserCoinTransactionsResponse, ApiError>
    {
        info!("list_user_coin_transactions({}, {}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List coin transactions for a user (as a Business)
    async fn list_user_coin_transactions_as_business(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        app_key: String,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<ListUserCoinTransactionsAsBusinessResponse, ApiError>
    {
        info!("list_user_coin_transactions_as_business({}, {}, \"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Perform Action on NFT
    async fn perform_action_on_nft(
        &self,
        version: f64,
        account_id: i64,
        vatom_id: String,
        vatom_action: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<PerformActionOnNftResponse, ApiError>
    {
        info!("perform_action_on_nft({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_id, vatom_action, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Redeem NFT
    async fn redeem_nft(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<RedeemNftResponse, ApiError>
    {
        info!("redeem_nft({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Redeem the coins for a user (as a Business)
    async fn redeem_user_coins_as_business(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<RedeemUserCoinsAsBusinessResponse, ApiError>
    {
        info!("redeem_user_coins_as_business({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search for Vatom Businesses
    async fn search_businesses(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SearchBusinessesResponse, ApiError>
    {
        info!("search_businesses({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Campaign Groups
    async fn search_campaign_groups(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SearchCampaignGroupsResponse, ApiError>
    {
        info!("search_campaign_groups({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search User Identities
    async fn search_identities(
        &self,
        version: f64,
        account_id: i64,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SearchIdentitiesResponse, ApiError>
    {
        info!("search_identities({}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Vatom User's Inventory
    async fn search_inventory(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: Option<String>,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SearchInventoryResponse, ApiError>
    {
        info!("search_inventory({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send NFT
    async fn send_nft(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_campaign_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SendNftResponse, ApiError>
    {
        info!("send_nft({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_campaign_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Set Points Balance as Business
    async fn set_points_balance_as_business(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_user_id: String,
        vatom_campaign_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<SetPointsBalanceAsBusinessResponse, ApiError>
    {
        info!("set_points_balance_as_business({}, {}, \"{}\", \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_user_id, vatom_campaign_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Transfer coins from Vatom Users
    async fn transfer_user_coins(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<TransferUserCoinsResponse, ApiError>
    {
        info!("transfer_user_coins({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Fund coins for a Business
    async fn update_business_coins(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateBusinessCoinsResponse, ApiError>
    {
        info!("update_business_coins({}, {}, \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vatom Event Guest List
    async fn update_event_guest_list(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_event_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateEventGuestListResponse, ApiError>
    {
        info!("update_event_guest_list({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vatom Space
    async fn update_space(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_space_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateSpaceResponse, ApiError>
    {
        info!("update_space({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_space_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update the coins for a user (as a Business)
    async fn update_user_coins_as_business(
        &self,
        version: f64,
        account_id: i64,
        vatom_user_id: String,
        app_key: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateUserCoinsAsBusinessResponse, ApiError>
    {
        info!("update_user_coins_as_business({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_user_id, app_key, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vatom User Profile
    async fn update_user_profile(
        &self,
        version: f64,
        account_id: i64,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateUserProfileResponse, ApiError>
    {
        info!("update_user_profile({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vatom Event
    async fn update_vatom_event(
        &self,
        version: f64,
        account_id: i64,
        app_key: String,
        vatom_event_id: String,
        vatom_parameters: String,
        return_raw_response: Option<bool>,
        context: &C) -> Result<UpdateVatomEventResponse, ApiError>
    {
        info!("update_vatom_event({}, {}, \"{}\", \"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", version, account_id, app_key, vatom_event_id, vatom_parameters, return_raw_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Vehicle
    async fn create_vehicle(
        &self,
        version: f64,
        vehicle: String,
        body: Option<models::Vehicle>,
        context: &C) -> Result<CreateVehicleResponse, ApiError>
    {
        info!("create_vehicle({}, \"{}\", {:?}) - X-Span-ID: {:?}", version, vehicle, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Vehicle
    async fn search_vehicle(
        &self,
        version: f64,
        hub_id: i64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        keyword: Option<String>,
        context: &C) -> Result<SearchVehicleResponse, ApiError>
    {
        info!("search_vehicle({}, {}, \"{}\", {}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", version, hub_id, sort_field, descending, start, limit, active_only, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Vehicle
    async fn delete_vehicle(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<DeleteVehicleResponse, ApiError>
    {
        info!("delete_vehicle({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vehicle
    async fn get_vehicle(
        &self,
        version: f64,
        id: i64,
        context: &C) -> Result<GetVehicleResponse, ApiError>
    {
        info!("get_vehicle({}, {}) - X-Span-ID: {:?}", version, id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vehicle
    async fn update_vehicle(
        &self,
        version: f64,
        id: i64,
        vehicle: String,
        body: Option<models::Vehicle>,
        context: &C) -> Result<UpdateVehicleResponse, ApiError>
    {
        info!("update_vehicle({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, id, vehicle, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Vehicle Type
    async fn create_vehicle_type(
        &self,
        version: f64,
        vehicle_type: String,
        body: Option<models::VehicleType>,
        context: &C) -> Result<CreateVehicleTypeResponse, ApiError>
    {
        info!("create_vehicle_type({}, \"{}\", {:?}) - X-Span-ID: {:?}", version, vehicle_type, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Vehicle Type
    async fn search_vehicle_types(
        &self,
        version: f64,
        sort_field: String,
        descending: bool,
        start: i32,
        limit: i32,
        active_only: bool,
        retailer_id: Option<i64>,
        hub_id: Option<i64>,
        context: &C) -> Result<SearchVehicleTypesResponse, ApiError>
    {
        info!("search_vehicle_types({}, \"{}\", {}, {}, {}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, sort_field, descending, start, limit, active_only, retailer_id, hub_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Vehicle Type
    async fn delete_vehicle_type(
        &self,
        version: f64,
        vehicle_type_id: i64,
        context: &C) -> Result<DeleteVehicleTypeResponse, ApiError>
    {
        info!("delete_vehicle_type({}, {}) - X-Span-ID: {:?}", version, vehicle_type_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Vehicle Type
    async fn get_vehicle_type(
        &self,
        version: f64,
        vehicle_type_id: i64,
        context: &C) -> Result<GetVehicleTypeResponse, ApiError>
    {
        info!("get_vehicle_type({}, {}) - X-Span-ID: {:?}", version, vehicle_type_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Vehicle Type
    async fn update_vehicle_type(
        &self,
        version: f64,
        vehicle_type_id: i64,
        vehicle_type: String,
        body: Option<models::VehicleType>,
        context: &C) -> Result<UpdateVehicleTypeResponse, ApiError>
    {
        info!("update_vehicle_type({}, {}, \"{}\", {:?}) - X-Span-ID: {:?}", version, vehicle_type_id, vehicle_type, body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Wallet Offers
    async fn create_offer_transaction(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        offer_cart: Option<String>,
        promo_code: Option<String>,
        currency_type: Option<String>,
        use_points: Option<bool>,
        meta_data: Option<String>,
        app_key: Option<String>,
        status: Option<i32>,
        context: &C) -> Result<CreateOfferTransactionResponse, ApiError>
    {
        info!("create_offer_transaction({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, offer_id, offer_location_id, offer_cart, promo_code, currency_type, use_points, meta_data, app_key, status, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Wallet Offer
    async fn delete_offer_transaction(
        &self,
        version: f64,
        transaction_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        context: &C) -> Result<DeleteOfferTransactionResponse, ApiError>
    {
        info!("delete_offer_transaction({}, {}, {:?}, {:?}) - X-Span-ID: {:?}", version, transaction_id, device_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Wallet Offer
    async fn get_offer_transaction(
        &self,
        version: f64,
        transaction_id: i64,
        device_id: Option<String>,
        account_id: Option<i64>,
        include_mission: Option<bool>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        return_full_response: Option<bool>,
        context: &C) -> Result<GetOfferTransactionResponse, ApiError>
    {
        info!("get_offer_transaction({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, transaction_id, device_id, account_id, include_mission, latitude, longitude, return_full_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Preview Wallet Offers
    async fn preview_offer_transaction(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        offer_id: Option<i64>,
        offer_location_id: Option<i64>,
        offer_cart: Option<String>,
        promo_code: Option<String>,
        currency_type: Option<String>,
        use_points: Option<bool>,
        meta_data: Option<String>,
        app_key: Option<String>,
        context: &C) -> Result<PreviewOfferTransactionResponse, ApiError>
    {
        info!("preview_offer_transaction({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, offer_id, offer_location_id, offer_cart, promo_code, currency_type, use_points, meta_data, app_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Wallet Offers
    async fn search_offer_transactions(
        &self,
        version: f64,
        device_id: Option<String>,
        account_id: Option<i64>,
        keyword: Option<String>,
        retailer_id: Option<i64>,
        retailer_ids: Option<String>,
        retailer_location_id: Option<i64>,
        retailer_location_ids: Option<String>,
        exclude_retailer_location_ids: Option<String>,
        offer_id: Option<i64>,
        offer_ids: Option<String>,
        offer_location_id: Option<i64>,
        offer_location_ids: Option<String>,
        offer_type: Option<models::CreateOfferOfferTypeParameter>,
        offer_types: Option<String>,
        special_offer_type: Option<String>,
        special_offer_types: Option<String>,
        category_ids: Option<String>,
        filter_ids: Option<String>,
        offer_audience_ids: Option<String>,
        sort_field: Option<models::SearchOfferTransactionsSortFieldParameter>,
        descending: Option<bool>,
        start: Option<i32>,
        limit: Option<i32>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        redeemable_start_date: Option<i64>,
        redeemable_end_date: Option<i64>,
        filter_by_parent_offer: Option<bool>,
        started_since: Option<i64>,
        started_before: Option<i64>,
        ended_since: Option<i64>,
        ended_before: Option<i64>,
        redeemed: Option<bool>,
        statuses: Option<String>,
        reservations_only: Option<bool>,
        active_only: Option<bool>,
        return_full_response: Option<bool>,
        recurring_started_since: Option<i64>,
        recurring_started_before: Option<i64>,
        recurring_expiration_since: Option<i64>,
        recurring_expiration_before: Option<i64>,
        context: &C) -> Result<SearchOfferTransactionsResponse, ApiError>
    {
        info!("search_offer_transactions({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, device_id, account_id, keyword, retailer_id, retailer_ids, retailer_location_id, retailer_location_ids, exclude_retailer_location_ids, offer_id, offer_ids, offer_location_id, offer_location_ids, offer_type, offer_types, special_offer_type, special_offer_types, category_ids, filter_ids, offer_audience_ids, sort_field, descending, start, limit, latitude, longitude, redeemable_start_date, redeemable_end_date, filter_by_parent_offer, started_since, started_before, ended_since, ended_before, redeemed, statuses, reservations_only, active_only, return_full_response, recurring_started_since, recurring_started_before, recurring_expiration_since, recurring_expiration_before, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Wallet Offer
    async fn update_offer_transaction(
        &self,
        version: f64,
        transaction_id: i64,
        status: i32,
        device_id: Option<String>,
        account_id: Option<i64>,
        offer_location_id: Option<i64>,
        currency_type: Option<String>,
        use_points: Option<bool>,
        app_key: Option<String>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        meta_data: Option<String>,
        return_full_response: Option<bool>,
        exception_membership_offer_ids: Option<String>,
        context: &C) -> Result<UpdateOfferTransactionResponse, ApiError>
    {
        info!("update_offer_transaction({}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, transaction_id, status, device_id, account_id, offer_location_id, currency_type, use_points, app_key, latitude, longitude, meta_data, return_full_response, exception_membership_offer_ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Weather
    async fn search_weather(
        &self,
        version: f64,
        region_id: Option<i64>,
        latitude: Option<f64>,
        longitude: Option<f64>,
        timezone_offset: Option<i64>,
        context: &C) -> Result<SearchWeatherResponse, ApiError>
    {
        info!("search_weather({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, region_id, latitude, longitude, timezone_offset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Word
    async fn create_word(
        &self,
        version: f64,
        account_id: i64,
        word: String,
        definition: String,
        active: bool,
        allocate_tickets: bool,
        ticket_count: i64,
        asset_id: Option<i64>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<CreateWordResponse, ApiError>
    {
        info!("create_word({}, {}, \"{}\", \"{}\", {}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, word, definition, active, allocate_tickets, ticket_count, asset_id, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Word
    async fn delete_word(
        &self,
        version: f64,
        word_id: i64,
        account_id: i64,
        context: &C) -> Result<DeleteWordResponse, ApiError>
    {
        info!("delete_word({}, {}, {}) - X-Span-ID: {:?}", version, word_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Word
    async fn get_word(
        &self,
        version: f64,
        word_id: i64,
        account_id: i64,
        context: &C) -> Result<GetWordResponse, ApiError>
    {
        info!("get_word({}, {}, {}) - X-Span-ID: {:?}", version, word_id, account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search Words
    async fn get_words(
        &self,
        version: f64,
        account_id: i64,
        sort_field: String,
        descending: bool,
        active_only: bool,
        start: i32,
        limit: i32,
        keyword: Option<String>,
        context: &C) -> Result<GetWordsResponse, ApiError>
    {
        info!("get_words({}, {}, \"{}\", {}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", version, account_id, sort_field, descending, active_only, start, limit, keyword, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update Word
    async fn update_word(
        &self,
        version: f64,
        word_id: i64,
        account_id: i64,
        ticket_count: i64,
        word_text: Option<String>,
        definition: Option<String>,
        asset_id: Option<i64>,
        active: Option<bool>,
        allocate_tickets: Option<bool>,
        ticket_type: Option<String>,
        points: Option<i64>,
        context: &C) -> Result<UpdateWordResponse, ApiError>
    {
        info!("update_word({}, {}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, word_id, account_id, ticket_count, word_text, definition, asset_id, active, allocate_tickets, ticket_type, points, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Run Workflow
    async fn run_workflow(
        &self,
        version: f64,
        account_id: i64,
        workflow_id: i64,
        sku_id: Option<i64>,
        version_code: Option<i32>,
        parameters: Option<String>,
        context: &C) -> Result<RunWorkflowResponse, ApiError>
    {
        info!("run_workflow({}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", version, account_id, workflow_id, sku_id, version_code, parameters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
