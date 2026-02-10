#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
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
use clap::{Command, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = Command::new("client")
        .arg(Arg::new("operation")
            .help("Sets the operation to run")
            .value_parser([
                "ConsumerCreate",
                "ConsumerUpdate",
                "QueueCreate",
                "QueueDelete",
                "QueueGet",
                "QueuePublish",
                "QueueSearch",
                "QueueUpdate",
                "AccountLocationSearch",
                "BlockAccount",
                "CreateAccount",
                "EditAccount",
                "EditUsername",
                "GetAccount",
                "GetProfileAssets",
                "GetReferralList",
                "GetSettings",
                "LoginDelegate",
                "LoginGeneral",
                "LoginUsername",
                "Logout",
                "MergeAccount",
                "PasswordChange",
                "PasswordReset",
                "RequestPasswordReset",
                "RequestValidateAccount",
                "SearchAccounts",
                "SecureLogin",
                "SecureSignup",
                "SetMatchToken",
                "UpdateActveStatus",
                "UpdateLocation",
                "UpdateSettings",
                "ValidateAccountSignup",
                "ValidatePasswordReset",
                "ApiVersionAchievementTierSearchPost",
                "CreateAchievement",
                "CreateAchievementTier",
                "DeleteAchievement",
                "DeleteAchievementTier",
                "GetAchievement",
                "GetAchievementTier",
                "GetUserAchievements",
                "ListAchievementTags",
                "ListAchievements",
                "SearchAchievements",
                "UpdateAchievement",
                "UpdateAchievementTier",
                "UpdateUserAchievement",
                "CreateEntityReference",
                "AddAlbumCollection",
                "AddAlbumUsers",
                "ApproveAlbum",
                "GetAlbumCollection",
                "LeaveAlbum",
                "RemoveAlbum",
                "RemoveAlbumUsers",
                "SearchAlbums",
                "UpdateAlbumCollection",
                "Activities",
                "AggregatedFilteredUsage",
                "FilteredUsage",
                "Usage",
                "UsageBatch",
                "GetAppData",
                "PostAppData",
                "RegenAppData",
                "CreateApplication",
                "CreateApplicationPlacement",
                "DeleteApplication",
                "DeleteApplicationPlacement",
                "GetApplication",
                "GetApplicationPlacement",
                "GetApplicationVersions",
                "GetUniqueUsersByApp",
                "ListApplications",
                "SearchApplicationPlacement",
                "SearchApplicationSettings",
                "SearchApplications",
                "UpdateApplication",
                "UpdateApplicationActive",
                "UpdateApplicationPlacement",
                "UploadApplicationCertificate",
                "CreateApplicationConfig",
                "DeleteApplicationConfig",
                "GetApplicationConfig",
                "GetApplicationConfigByConfigVersion",
                "SearchApplicationConfig",
                "UpdateApplicationConfig",
                "AssetMorph",
                "CreateAsset",
                "DeleteAsset",
                "GetAsset",
                "RemoveAsset",
                "SearchAssets",
                "UpdateAsset",
                "AssetDownload",
                "AssigmentAssigneeAccountSearch",
                "AssignmentCreate",
                "AssignmentDelete",
                "AssignmentGet",
                "AssignmentSearch",
                "AssignmentStatusCreate",
                "AssignmentStatusDelete",
                "AssignmentStatusGet",
                "AssignmentStatusSearch",
                "AssignmentStatusUpdate",
                "AssignmentUpdate",
                "CreateAudience",
                "DeleteAudience",
                "GetAgeGroups",
                "GetAudience",
                "GetAudienceList",
                "GetDevices",
                "GetExperiences",
                "GetGroupedAudiences",
                "ListByAccount",
                "ListByAudience",
                "ListLastestByAccount",
                "SendByAccount",
                "UpdateAudience",
                "CreateBid",
                "DeleteBid",
                "GetBid",
                "UpdateBid",
                "CreateBillableEntity",
                "DeleteBillableEntity",
                "GetBillableEntity",
                "UpdateBillableEntity",
                "AddPaymentMethod",
                "CreatePaymentMethod",
                "CreateSmartContract",
                "GetCryptoBalance",
                "GetPaymentMethod",
                "SearchPaymentMethod",
                "GetStatusCsv",
                "ListStatusCsv",
                "StatusCsv",
                "UploadCsv",
                "CreateCargoType",
                "SearchCargoTypes",
                "DeleteCargoType",
                "GetCargoType",
                "UpdateCargoType",
                "SearchCarriers",
                "CategoryDistanceSearch",
                "CreateCategory",
                "DeleteCategory",
                "DuplicateCategory",
                "GetCategory",
                "SearchCategories",
                "UpdateCategory",
                "AddConnectionToGroup",
                "AddConnectionsToGroup",
                "AddSubGroups",
                "CreateOrUpdateConnection",
                "CreateOrUpdateGroup",
                "FollowAccept",
                "FollowReject",
                "FollowRemove",
                "FollowRequest",
                "FriendAccept",
                "FriendReject",
                "FriendRemove",
                "FriendRequest",
                "GetConnectionSentFriendRequests",
                "GetConnections",
                "GetGroupDetails",
                "GroupSearch",
                "RemoveConnectionFromGroup",
                "RemoveConnectionsFromGroup",
                "RemoveGroup",
                "RemoveSubGroups",
                "SearchConnections",
                "AddOrUpdateAlbumContest",
                "ApproveAlbumContest",
                "DeleteContest",
                "GetAlbumContest",
                "GetAlbumContests",
                "VoteOnAlbumContest",
                "AddPreview",
                "AdsFind",
                "CreateCreative",
                "DeleteCreative",
                "GetCreative",
                "GetCreativesByApplication",
                "RemovePreview",
                "UpdateCreative",
                "Create",
                "GetDependents",
                "RemoveDependent",
                "CheckDisbursements",
                "CreateDisbursement",
                "GetDisbursement",
                "SearchDisbursements",
                "UpdateDisbursement",
                "AssignEmployee",
                "AssignToLocationEmployee",
                "CreateEmployee",
                "DeleteEmployee",
                "GetEmployee",
                "SearchEmployees",
                "UnassignEmployee",
                "UpdateEmployee",
                "AttendEvent",
                "CreateEvent",
                "DeleteEvent",
                "GetEvent",
                "SearchEventTransactions",
                "SearchEvents",
                "UpdateEvent",
                "GetToken",
                "GraphInterface",
                "AddFavorite",
                "DeleteFavorite",
                "GetFavorite",
                "SearchFavorites",
                "WhoHasFavorited",
                "CreateFilter",
                "DeleteFilter",
                "GetFilter",
                "SearchFilters",
                "UpdateFilter",
                "CreateFlag",
                "DeleteFlag",
                "GetFlag",
                "GetFlagThreshold",
                "UpdateFlagThreshold",
                "CreateGame",
                "DeleteGame",
                "GetGame",
                "SearchGames",
                "UpdateGame",
                "CreateGameLevel",
                "DeleteGameLevel",
                "GetGameLevel",
                "GetGameLevelsByApplication",
                "GetGameLevelsByBillableEntity",
                "GetQuestionsInLevel",
                "GetWordsInLevel",
                "UpdateGameLevel",
                "UpdateQuestionsInLevel",
                "UpdateWordsInLevel",
                "AcceptInvite",
                "AlbumContestInvite",
                "AlbumInvite",
                "EventInvite",
                "GameInvite",
                "GetInvite",
                "MissionInvite",
                "OfferInvite",
                "OfferLocationInvite",
                "RetailerLocationInvite",
                "CreateLeaderboard",
                "DeleteLeaderboard",
                "GetLeaderboard",
                "SearchLeaderboards",
                "UpdateLeaderboard",
                "RegisterLike",
                "RemoveLike",
                "SearchLikes",
                "CreateListing",
                "DeleteListing",
                "GetListing",
                "SearchListing",
                "SummaryListing",
                "UpdateListing",
                "CacheTrilaterationData",
                "CacheTrilaterationDataGzip",
                "GetLocationByIp",
                "GetLocationByTrilateration",
                "GetLocations",
                "CreateLocationV2",
                "UpdateLocationV2",
                "CreateMedia",
                "DeleteMedia",
                "GetMedia",
                "SearchMedia",
                "UpdateMedia",
                "CreateMission",
                "DeleteMission",
                "FindMissions",
                "GetMission",
                "ImportMission",
                "SearchMissionFormats",
                "SearchMissions",
                "SearchMissionsByBillableEntity",
                "UpdateMission",
                "CreateMissionInvite",
                "DeleteMissionInvite",
                "GetMissionInvite",
                "SearchMissionInvites",
                "UpdateMissionInvite",
                "BatchOperation",
                "CreateNote",
                "DeleteNote",
                "GetNote",
                "SearchNotes",
                "UpdateNote",
                "CreateNotificationTemplate",
                "CreateOrUpdateBlockedNotifications",
                "DeleteNotificationTemplate",
                "GetNotificationTemplate",
                "GetNotifications",
                "RegisterNotificationToken",
                "SearchBlockedNotifications",
                "SearchNotificationTemplate",
                "SearchRecipients",
                "SearchRecipientsCount",
                "SendBatchNotifications",
                "SendCustomNotifications",
                "UpdateNotificationTemplate",
                "AddField",
                "CreateObject",
                "DeleteField",
                "DeleteObject",
                "GetObject",
                "SearchObject",
                "CreateData",
                "SearchData",
                "DeleteData",
                "GetData",
                "UpdateData",
                "BatchUpdateOfferLocations",
                "CreateOffer",
                "DeleteOffer",
                "DeleteOfferLocation",
                "GetOffer",
                "GetOfferDetails",
                "GetOfferListCounts",
                "GetOfferLocation",
                "GetOfferLocationsForRetailers",
                "GetOffersForRetailers",
                "RedeemOfferTransaction",
                "SearchOfferTransactionsForRetailers",
                "SearchOffersForConsumer",
                "TopOfferTransactions",
                "UpdateOffer",
                "UpdateOfferStatus",
                "CreateOfferTransactionStatus",
                "DeleteOfferTransactionStatus",
                "GetOfferTransactionStatus",
                "SearchOfferTransactionStatuses",
                "UpdateOfferTransactionStatus",
                "ImageGeneration",
                "RequestOptimization",
                "GetOptimizationResult",
                "AddMovie",
                "AiDocs",
                "AiFindImages",
                "AiTags",
                "AiText",
                "Batch",
                "CreateInstantEpisode",
                "CreateVoiceCanvas",
                "Emotion",
                "StartVideoRender",
                "Stt",
                "SummarizeTopics",
                "TechTune",
                "Tts",
                "GetAddMovieResult",
                "GetBatch",
                "GetEmotion",
                "GetEpisodeStatus",
                "GetRenderStatus",
                "GetStt",
                "GetTechTune",
                "GetTopics",
                "GetTts",
                "GetVoiceCanvas",
                "CreatePack",
                "DeletePack",
                "GetPack",
                "SearchPacks",
                "UpdatePack",
                "ProcessAllParticipants",
                "ProcessParticipants",
                "ComputePath",
                "CreatePostalCode",
                "DeletePostalCode",
                "GetPostalCode",
                "GetPostalCodes",
                "UpdatePostalCode",
                "CreatePersona",
                "DeletePersona",
                "GetPersonaList",
                "SearchPersona",
                "UpdatePersona",
                "CreateProgram",
                "SearchPrograms",
                "DeleteProgram",
                "GetProgram",
                "PostProgram",
                "PutProgram",
                "CreatePurchaseItem",
                "DeletePurchaseItem",
                "GetPurchaseItem",
                "SearchPurchaseItems",
                "UpdatePurchaseItem",
                "CreateOrder",
                "DeleteOrder",
                "GetOrder",
                "PreviewOrder",
                "SearchOrders",
                "UpdateOrder",
                "CreateQuestion",
                "DeleteQuestion",
                "GetQuestion",
                "SearchQuestions",
                "UpdateQuestion",
                "GetHistoricalRankings",
                "GetRankings",
                "GetUserRank",
                "OverrideUserRank",
                "UpdateRankings",
                "CreateRating",
                "DeleteRating",
                "SearchLocationRatingIndexes",
                "SearchRatingIndexes",
                "SearchRatings",
                "UpdateRating",
                "CreateRegion",
                "DeleteRegion",
                "GetRegion",
                "SearchRegions",
                "UpdateRegion",
                "CreateBatch",
                "CreateRegionLegSummaryBatch",
                "DeleteBatch",
                "GetReportBatch",
                "RunReport",
                "SearchBatch",
                "CreateReservation",
                "DeleteReservation",
                "ReservableAvailability",
                "SearchAvailability",
                "SearchReservations",
                "SearchSchedule",
                "CreateRetailer",
                "DeleteRetailer",
                "GetRetailer",
                "GetRetailers",
                "RetailerLoginCheck",
                "UpdateRetailer",
                "CreateRetailerLocationConsumer",
                "CreateRetailerLocations",
                "DeleteRetailerLocation",
                "GetRetailerLocation",
                "GetRetailerLocationConsumer",
                "IndexedRetailerLocationDistanceSearch",
                "IndexedRetailerLocationSearch",
                "SearchRetailerLocations",
                "UpdateRetailerLocations",
                "GetRetaokiler",
                "CreateRoute",
                "SearchRoutes",
                "ApproveRoute",
                "CopyRoute",
                "CreateRouteDirections",
                "CreateRoutePolyline",
                "DeleteRoute",
                "DisapproveRoute",
                "GetRoute",
                "GetRouteDirections",
                "GetRouteShipments",
                "GetRouteStops",
                "OptimizeRoute",
                "ReorderRouteStopsPatch",
                "ReorderRouteStopsPost",
                "UpdateRoute",
                "GetRouteStop",
                "GetShipmentsAtStop",
                "RemoveStop",
                "SetDriver",
                "UpdateRouteStop",
                "CreateRouteSettings",
                "SearchRouteSettings",
                "DeleteRouteSettings",
                "GetRouteSettings",
                "UpdateRouteSettings",
                "ComputeRouting",
                "CreateScheduledNotification",
                "DeleteScheduledNotification",
                "GetScheduledNotification",
                "ScheduleNotificationListings",
                "SearchScheduledNotifications",
                "UpdateScheduledNotification",
                "CreateScore",
                "GetScore",
                "SearchScores",
                "CreateSecureApplication",
                "DeleteSecureApplication",
                "LoginSecure",
                "PurchaseSecure",
                "ResetSecure",
                "UpdateSecureApplication",
                "CreateServiceHub",
                "SearchServiceHubs",
                "DeleteServiceHub",
                "GetServiceHub",
                "PostServiceHub",
                "PutServiceHub",
                "CreateShipment",
                "SearchShipments",
                "CancelShipment",
                "DeleteShipment",
                "GetShipment",
                "UpdateShipment",
                "UpdateShipmentStatus",
                "CreateShipmentBatch",
                "SearchShipmentBatch",
                "DeleteShipmentBatch",
                "GetShipmentBatch",
                "GetShipmentBatchStatus",
                "Simulation",
                "GetStop",
                "UpdateStop",
                "CreateStripeCheckoutSession",
                "CreateSubscription",
                "DeleteSubscription",
                "GetSubscription",
                "GetSubscriptionPlan",
                "GetSubscriptionPlans",
                "GetSubscriptionUsage",
                "UpdateSubscription",
                "CreateTask",
                "DeleteTask",
                "GetTask",
                "SearchTasks",
                "UpdateTask",
                "CreateTerritory",
                "DeleteTerritory",
                "GetTerritory",
                "SearchTerritories",
                "UpdateTerritory",
                "AddOrUpdateThemeDescriptor",
                "GetThemeDescriptor",
                "GetThemeDescriptors",
                "RemoveThemeDescriptor",
                "CreateCredential",
                "CreateNetwork",
                "DeleteCredential",
                "DeleteNetwork",
                "GetCredential",
                "GetNetwork",
                "SearchCredentials",
                "SearchNetworks",
                "SendMfaChallenge",
                "UpdateCredential",
                "UpdateNetwork",
                "GetTicketCount",
                "GetTicketList",
                "GiftPurchase",
                "SaveTicket",
                "SaveTicketViaFileUpload",
                "TicketOffers",
                "CreateTournament",
                "DeleteTournament",
                "GetTournament",
                "SearchObjects",
                "SearchRounds",
                "SearchTournaments",
                "SubmitTournamentScore",
                "SubmitTournamentVote",
                "SubstituteTournamentPlayer",
                "UpdateTournament",
                "BatchSaveTracking",
                "GetPredictedLocations",
                "GetPredictedPath",
                "GetPreferredLocations",
                "GetTrackingLegs",
                "SaveTrackingLeg",
                "SaveTrackingStep",
                "SearchAccountsWithTrackingLegs",
                "SearchTrackingLegs",
                "CreateTrigger",
                "DeleteTrigger",
                "GetTrigger",
                "SearchTriggers",
                "UpdateTrigger",
                "CreateTrip",
                "ProcessTripMatches",
                "Search",
                "SearchTrips",
                "UpdateTripNotifications",
                "Delete",
                "DriveTrip",
                "FlexibleTrip",
                "GetTrip",
                "GetTripMatches",
                "Ride",
                "UpdateLocations",
                "UpdateRecurrenceLocations",
                "UpdateRecurrenceShipments",
                "UpdateShipments",
                "UpdateTrip",
                "SmsBuyOffer",
                "AuthorizeTwitter",
                "LoginTwitter",
                "AddUsersToPermissionable",
                "ApprovePermissionable",
                "LeaveFromPermissionable",
                "RemoveUsersFromPermissionable",
                "SearchPermissionables",
                "SearchPermissionablesFollowingDistance",
                "CreateFollowing",
                "CreateSpace",
                "CreateVatomEvent",
                "DeleteFollowing",
                "DeletePointsBalance",
                "DeleteSpace",
                "DeleteVatomEvent",
                "DeleteVatomNft",
                "ExecuteActionOnNft",
                "GeomapSearch",
                "GetBusinessBehaviors",
                "GetBusinessCoinsBalance",
                "GetBusinessIds",
                "GetBusinessInfo",
                "GetBusinessUsers",
                "GetCampaignGroupEntities",
                "GetCampaignGroupRules",
                "GetCampaignGroupStats",
                "GetCampaignInfo",
                "GetEventGuestList",
                "GetInventory",
                "GetMyFollowing",
                "GetPointsBalance",
                "GetPointsBalanceAsBusiness",
                "GetSpace",
                "GetUserCoinsAsBusiness",
                "GetUserCoinsBalance",
                "GetUserFollowers",
                "GetUserFollowing",
                "GetUserInfo",
                "GetUserProfile",
                "GetVatomEvent",
                "GetVatomNft",
                "ListCommunities",
                "ListEvents",
                "ListSpaces",
                "ListUserCoinTransactions",
                "ListUserCoinTransactionsAsBusiness",
                "PerformActionOnNft",
                "RedeemNft",
                "RedeemUserCoinsAsBusiness",
                "SearchBusinesses",
                "SearchCampaignGroups",
                "SearchIdentities",
                "SearchInventory",
                "SendNft",
                "SetPointsBalanceAsBusiness",
                "TransferUserCoins",
                "UpdateBusinessCoins",
                "UpdateEventGuestList",
                "UpdateSpace",
                "UpdateUserCoinsAsBusiness",
                "UpdateUserProfile",
                "UpdateVatomEvent",
                "CreateVehicle",
                "SearchVehicle",
                "DeleteVehicle",
                "GetVehicle",
                "UpdateVehicle",
                "CreateVehicleType",
                "SearchVehicleTypes",
                "DeleteVehicleType",
                "GetVehicleType",
                "UpdateVehicleType",
                "CreateOfferTransaction",
                "DeleteOfferTransaction",
                "GetOfferTransaction",
                "PreviewOfferTransaction",
                "SearchOfferTransactions",
                "UpdateOfferTransaction",
                "SearchWeather",
                "CreateWord",
                "DeleteWord",
                "GetWord",
                "GetWords",
                "UpdateWord",
                "RunWorkflow",
            ])
            .required(true)
            .index(1))
        .arg(Arg::new("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::new("host")
            .long("host")
            .default_value("localhost")
            .help("Hostname to contact"))
        .arg(Arg::new("port")
            .long("port")
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  "".to_owned()
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(auth_token))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.contains_id("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.get_one::<String>("host").unwrap(),
        matches.get_one::<u16>("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = {
        #[cfg(feature = "client-tls")]
        {
            if is_https {
                // Using HTTPS with native-tls
                let client = Box::new(Client::try_new_https(&base_url)
                    .expect("Failed to create HTTPS client"));
                Box::new(client.with_context(context))
            } else {
                // Using HTTP
                let client = Box::new(Client::try_new_http(&base_url)
                    .expect("Failed to create HTTP client"));
                Box::new(client.with_context(context))
            }
        }

        #[cfg(not(feature = "client-tls"))]
        {
            if is_https {
                panic!("HTTPS requested but TLS support not enabled. \
                        Enable the 'client-tls' feature to use HTTPS.");
            }
            // Using HTTP only
            let client = Box::new(Client::try_new_http(&base_url)
                .expect("Failed to create HTTP client"));
            Box::new(client.with_context(context))
        }
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.get_one::<String>("operation").map(String::as_str) {
        Some("ConsumerCreate") => {
            let result = rt.block_on(client.consumer_create(
                  3.16,
                  "app_key_example".to_string(),
                  "name_example".to_string(),
                  "hostname_example".to_string(),
                  "username_example".to_string(),
                  "password_example".to_string(),
                  "data_mapping_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some("virtual_host_example".to_string()),
                  Some("exchanger_example".to_string()),
                  Some("exchanger_type_example".to_string()),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ConsumerUpdate") => {
            let result = rt.block_on(client.consumer_update(
                  3.16,
                  "app_key_example".to_string(),
                  789,
                  "data_mapping_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueueCreate") => {
            let result = rt.block_on(client.queue_create(
                  3.16,
                  "app_key_example".to_string(),
                  "name_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some("analytic_tags_example".to_string()),
                  Some("hostname_example".to_string()),
                  Some(56),
                  Some("username_example".to_string()),
                  Some("password_example".to_string()),
                  Some("virtual_host_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueueDelete") => {
            let result = rt.block_on(client.queue_delete(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueueGet") => {
            let result = rt.block_on(client.queue_get(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("name_example".to_string()),
                  Some("hostname_example".to_string()),
                  Some("virtual_host_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueuePublish") => {
            let result = rt.block_on(client.queue_publish(
                  3.16,
                  "message_example".to_string(),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("name_example".to_string()),
                  Some("hostname_example".to_string()),
                  Some("virtual_host_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueueSearch") => {
            let result = rt.block_on(client.queue_search(
                  3.16,
                  Some(789),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("QueueUpdate") => {
            let result = rt.block_on(client.queue_update(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(56),
                  Some("analytic_tags_example".to_string()),
                  Some("hostname_example".to_string()),
                  Some(56),
                  Some("username_example".to_string()),
                  Some("password_example".to_string()),
                  Some("virtual_host_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AccountLocationSearch") => {
            let result = rt.block_on(client.account_location_search(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(789),
                  Some("gender_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("search_mode_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some("roles_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("experience_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("audience_operator_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BlockAccount") => {
            let result = rt.block_on(client.block_account(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateAccount") => {
            let result = rt.block_on(client.create_account(
                  3.16,
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some("name_example".to_string()),
                  Some("prefix_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("middle_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("suffix_name_example".to_string()),
                  Some("title_example".to_string()),
                  Some("device_id_example".to_string()),
                  Some("device_id_type_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some(789),
                  Some("street_address_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("gender_example".to_string()),
                  Some(789),
                  Some("home_phone_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("cell_phone_carrier_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("role_example".to_string()),
                  Some("platforms_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("about_us_example".to_string()),
                  Some("game_experience_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("hometown_example".to_string()),
                  Some("height_example".to_string()),
                  Some(56),
                  Some("ethnicity_example".to_string()),
                  Some("body_type_example".to_string()),
                  Some("marital_status_example".to_string()),
                  Some("children_example".to_string()),
                  Some("religion_example".to_string()),
                  Some("education_example".to_string()),
                  Some(56),
                  Some("smoke_example".to_string()),
                  Some("drink_example".to_string()),
                  Some("companionship_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("preferred_gender_example".to_string()),
                  Some("preferred_education_example".to_string()),
                  Some(56),
                  Some("preferred_body_type_example".to_string()),
                  Some("preferred_ethnicity_example".to_string()),
                  Some("preferred_location_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some("invite_token_example".to_string()),
                  Some(789),
                  Some(true),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some("response_type_example".to_string()),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("app_blob_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("location_visibility_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("app_nickname_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EditAccount") => {
            let result = rt.block_on(client.edit_account(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("role_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("prefix_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("middle_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("suffix_name_example".to_string()),
                  Some("title_example".to_string()),
                  Some("gender_example".to_string()),
                  Some(56),
                  Some(789),
                  Some("home_phone_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("cell_phone_carrier_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("country_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("hometown_example".to_string()),
                  Some("height_example".to_string()),
                  Some(56),
                  Some("ethnicity_example".to_string()),
                  Some("body_type_example".to_string()),
                  Some("marital_status_example".to_string()),
                  Some("children_example".to_string()),
                  Some("religion_example".to_string()),
                  Some("education_example".to_string()),
                  Some(56),
                  Some("smoke_example".to_string()),
                  Some("drink_example".to_string()),
                  Some("companionship_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("preferred_gender_example".to_string()),
                  Some("preferred_education_example".to_string()),
                  Some(56),
                  Some("preferred_body_type_example".to_string()),
                  Some("preferred_ethnicity_example".to_string()),
                  Some("preferred_location_example".to_string()),
                  Some(1.2),
                  Some("platforms_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("about_us_example".to_string()),
                  Some("match_token_example".to_string()),
                  Some("game_experience_example".to_string()),
                  Some("categories_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("response_filters_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("location_visibility_example".to_string()),
                  Some("app_blob_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string()),
                  Some(789),
                  Some("app_nickname_example".to_string()),
                  Some(789),
                  Some("non_guest_username_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EditUsername") => {
            let result = rt.block_on(client.edit_username(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("email_address_example".to_string()),
                  Some("username_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAccount") => {
            let result = rt.block_on(client.get_account(
                  3.16,
                  Some(true),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_account_email_example".to_string()),
                  Some(789),
                  Some("response_filters_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("purchase_type_example".to_string()),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetProfileAssets") => {
            let result = rt.block_on(client.get_profile_assets(
                  3.16,
                  Some(true),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("media_types_example".to_string()),
                  Some("mime_types_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReferralList") => {
            let result = rt.block_on(client.get_referral_list(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("retrieve_type_example".to_string()),
                  Some(8.14),
                  Some(8.14),
                  Some(8.14),
                  Some(8.14),
                  Some(8.14),
                  Some(8.14),
                  Some(8.14),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSettings") => {
            let result = rt.block_on(client.get_settings(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LoginDelegate") => {
            let result = rt.block_on(client.login_delegate(
                  3.16,
                  "access_token_example".to_string(),
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some("access_token_secret_example".to_string()),
                  Some(789),
                  Some("delegated_username_example".to_string()),
                  Some("network_uid_example".to_string()),
                  Some(56),
                  Some("response_filters_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LoginGeneral") => {
            let result = rt.block_on(client.login_general(
                  3.16,
                  "access_token_example".to_string(),
                  "network_uid_example".to_string(),
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some("device_id_type_example".to_string()),
                  Some("access_token_secret_example".to_string()),
                  Some(56),
                  Some("response_filters_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LoginUsername") => {
            let result = rt.block_on(client.login_username(
                  3.16,
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("app_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some("response_filters_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Logout") => {
            let result = rt.block_on(client.logout(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some("device_id_type_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MergeAccount") => {
            let result = rt.block_on(client.merge_account(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PasswordChange") => {
            let result = rt.block_on(client.password_change(
                  3.16,
                  789,
                  "old_password_example".to_string(),
                  "new_password_example".to_string(),
                  "confirm_password_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PasswordReset") => {
            let result = rt.block_on(client.password_reset(
                  3.16,
                  "token_example".to_string(),
                  "password_example".to_string(),
                  "confirm_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RequestPasswordReset") => {
            let result = rt.block_on(client.request_password_reset(
                  3.16,
                  "email_example".to_string(),
                  Some("from_example".to_string()),
                  Some("domain_example".to_string()),
                  Some("sub_url_example".to_string()),
                  Some("referer_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RequestValidateAccount") => {
            let result = rt.block_on(client.request_validate_account(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAccounts") => {
            let result = rt.block_on(client.search_accounts(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("keyword_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(models::SearchAccountsGenderParameter::Male),
                  Some(models::SearchAccountsGameExperienceParameter::Any),
                  Some(56),
                  Some("category_ids_example".to_string()),
                  Some(true),
                  Some("response_filters_example".to_string()),
                  Some("purchase_type_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SecureLogin") => {
            let result = rt.block_on(client.secure_login(
                  3.16,
                  "username_example".to_string(),
                  "password_example".to_string(),
                  "game_type_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some("charset_name_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some("response_filters_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SecureSignup") => {
            let result = rt.block_on(client.secure_signup(
                  3.16,
                  "device_id_example".to_string(),
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some("name_example".to_string()),
                  Some("invite_token_example".to_string()),
                  Some("prefix_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("middle_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("suffix_name_example".to_string()),
                  Some("title_example".to_string()),
                  Some("device_id_type_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some(789),
                  Some("address_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("gender_example".to_string()),
                  Some(789),
                  Some("home_phone_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("cell_phone_carrier_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("role_example".to_string()),
                  Some("platforms_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("about_us_example".to_string()),
                  Some("game_experience_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("hometown_example".to_string()),
                  Some("height_example".to_string()),
                  Some(56),
                  Some("ethnicity_example".to_string()),
                  Some("body_type_example".to_string()),
                  Some("marital_status_example".to_string()),
                  Some("children_example".to_string()),
                  Some("religion_example".to_string()),
                  Some("education_example".to_string()),
                  Some(56),
                  Some("smoke_example".to_string()),
                  Some("drink_example".to_string()),
                  Some("companionship_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("preferred_gender_example".to_string()),
                  Some("preferred_education_example".to_string()),
                  Some(56),
                  Some("preferred_body_type_example".to_string()),
                  Some("preferred_ethnicity_example".to_string()),
                  Some("preferred_location_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some("charset_name_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some("response_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SetMatchToken") => {
            let result = rt.block_on(client.set_match_token(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("match_token_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateActveStatus") => {
            let result = rt.block_on(client.update_actve_status(
                  3.16,
                  789,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateLocation") => {
            let result = rt.block_on(client.update_location(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSettings") => {
            let result = rt.block_on(client.update_settings(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("blocked_notifications_example".to_string()),
                  Some("suggestion_method_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("favorite_visibility_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ValidateAccountSignup") => {
            let result = rt.block_on(client.validate_account_signup(
                  3.16,
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ValidatePasswordReset") => {
            let result = rt.block_on(client.validate_password_reset(
                  3.16,
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ApiVersionAchievementTierSearchPost") => {
            let result = rt.block_on(client.api_version_achievement_tier_search_post(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some("rank_type_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateAchievement") => {
            let result = rt.block_on(client.create_achievement(
                  3.16,
                  "app_key_example".to_string(),
                  "title_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("analytics_tag_example".to_string()),
                  Some("description_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some("trigger_definition_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateAchievementTier") => {
            let result = rt.block_on(client.create_achievement_tier(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAchievement") => {
            let result = rt.block_on(client.delete_achievement(
                  3.16,
                  789,
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAchievementTier") => {
            let result = rt.block_on(client.delete_achievement_tier(
                  3.16,
                  789,
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAchievement") => {
            let result = rt.block_on(client.get_achievement(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("achievement_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAchievementTier") => {
            let result = rt.block_on(client.get_achievement_tier(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserAchievements") => {
            let result = rt.block_on(client.get_user_achievements(
                  3.16,
                  true,
                  "app_key_example".to_string(),
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_account_email_example".to_string()),
                  Some(789),
                  Some("rank_type_example".to_string()),
                  Some("achievement_type_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListAchievementTags") => {
            let result = rt.block_on(client.list_achievement_tags(
                  3.16,
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListAchievements") => {
            let result = rt.block_on(client.list_achievements(
                  3.16,
                  models::ListAchievementsSortFieldParameter::Created,
                  true,
                  56,
                  56,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("achievement_type_example".to_string()),
                  Some("rank_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAchievements") => {
            let result = rt.block_on(client.search_achievements(
                  3.16,
                  "app_key_example".to_string(),
                  models::SearchAchievementsSortFieldParameter::Created,
                  true,
                  true,
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("achievement_type_example".to_string()),
                  Some("rank_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateAchievement") => {
            let result = rt.block_on(client.update_achievement(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("analytics_tag_example".to_string()),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("trigger_definition_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateAchievementTier") => {
            let result = rt.block_on(client.update_achievement_tier(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUserAchievement") => {
            let result = rt.block_on(client.update_user_achievement(
                  3.16,
                  789,
                  Some(789),
                  Some("tag_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateEntityReference") => {
            let result = rt.block_on(client.create_entity_reference(
                  3.16,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AddAlbumCollection") => {
            let result = rt.block_on(client.add_album_collection(
                  3.16,
                  "title_example".to_string(),
                  true,
                  true,
                  true,
                  true,
                  true,
                  true,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("assets_to_add_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("media_url_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("attached_media_url_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some("description_example".to_string()),
                  Some("album_type_example".to_string()),
                  Some(789),
                  Some("sub_type_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("location_description_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("full_address_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("category_filter_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("audience_operator_example".to_string()),
                  Some(models::ApproveAlbumApprovalStatusParameter::Pending),
                  Some("linked_object_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddAlbumUsers") => {
            let result = rt.block_on(client.add_album_users(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("connections_example".to_string()),
                  Some("connection_groups_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ApproveAlbum") => {
            let result = rt.block_on(client.approve_album(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(models::ApproveAlbumApprovalStatusParameter::Pending),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAlbumCollection") => {
            let result = rt.block_on(client.get_album_collection(
                  3.16,
                  true,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LeaveAlbum") => {
            let result = rt.block_on(client.leave_album(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveAlbum") => {
            let result = rt.block_on(client.remove_album(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveAlbumUsers") => {
            let result = rt.block_on(client.remove_album_users(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connections_example".to_string()),
                  Some("connection_groups_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAlbums") => {
            let result = rt.block_on(client.search_albums(
                  3.16,
                  "filter_example".to_string(),
                  789,
                  "sub_type_example".to_string(),
                  true,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  1.2,
                  true,
                  true,
                  true,
                  56,
                  56,
                  56,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("album_ids_example".to_string()),
                  Some("exclude_album_ids_example".to_string()),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("album_type_example".to_string()),
                  Some(56),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("app_key_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("category_filter_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("exclude_audience_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("search_mode_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("stack_pagination_identifier_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some("linked_object_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some("search_expression_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateAlbumCollection") => {
            let result = rt.block_on(client.update_album_collection(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("assets_to_add_example".to_string()),
                  Some("assets_to_remove_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("media_url_example".to_string()),
                  Some(true),
                  Some("title_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some("description_example".to_string()),
                  Some("album_type_example".to_string()),
                  Some(789),
                  Some("sub_type_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some("location_description_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some("cell_phone_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("full_address_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("category_filter_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("audience_operator_example".to_string()),
                  Some("linked_object_type_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Activities") => {
            let result = rt.block_on(client.activities(
                  3.16,
                  56,
                  56,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AggregatedFilteredUsage") => {
            let result = rt.block_on(client.aggregated_filtered_usage(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("device_type_example".to_string()),
                  Some("device_example".to_string()),
                  Some("device_os_example".to_string()),
                  Some("gender_example".to_string()),
                  Some("age_group_example".to_string()),
                  Some("country_example".to_string()),
                  Some("state_example".to_string()),
                  Some("city_example".to_string()),
                  Some("zip_example".to_string()),
                  Some("model_example".to_string()),
                  Some("tag_example".to_string()),
                  Some(789),
                  Some("user_account_display_example".to_string()),
                  Some("user_account_username_example".to_string()),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(true),
                  Some(true),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FilteredUsage") => {
            let result = rt.block_on(client.filtered_usage(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("device_type_example".to_string()),
                  Some("device_example".to_string()),
                  Some("device_os_example".to_string()),
                  Some("gender_example".to_string()),
                  Some("age_group_example".to_string()),
                  Some("country_example".to_string()),
                  Some("state_example".to_string()),
                  Some("city_example".to_string()),
                  Some("zip_example".to_string()),
                  Some("model_example".to_string()),
                  Some("tag_example".to_string()),
                  Some(789),
                  Some("user_account_display_example".to_string()),
                  Some("user_account_username_example".to_string()),
                  Some(789),
                  Some("custom_type_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some(789),
                  Some("custom_message_example".to_string()),
                  Some("custom_message2_example".to_string()),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(models::AggregatedFilteredUsageGroupByRootParameter::TagCount),
                  Some(true),
                  Some(true),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Usage") => {
            let result = rt.block_on(client.usage(
                  3.16,
                  "tag_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some("device_example".to_string()),
                  Some("device_type_example".to_string()),
                  Some("device_os_example".to_string()),
                  Some("model_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some("custom_type_example".to_string()),
                  Some(789),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("country_example".to_string()),
                  Some("zip_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(789),
                  Some("error_message_example".to_string()),
                  Some("ip_example".to_string()),
                  Some("user_agent_example".to_string()),
                  Some(true),
                  Some("custom_message_example".to_string()),
                  Some("custom_message2_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UsageBatch") => {
            let result = rt.block_on(client.usage_batch(
                  3.16,
                  "app_key_example".to_string(),
                  "device_example".to_string(),
                  "data_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some("device_type_example".to_string()),
                  Some("device_os_example".to_string()),
                  Some("model_example".to_string()),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAppData") => {
            let result = rt.block_on(client.get_app_data(
                  3.16,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some(true),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("filter_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("mission_ids_example".to_string()),
                  Some("game_ids_example".to_string()),
                  Some("pack_ids_example".to_string()),
                  Some("game_level_ids_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("response_groups_example".to_string()),
                  Some("purchase_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostAppData") => {
            let result = rt.block_on(client.post_app_data(
                  3.16,
                  "game_type_example".to_string(),
                  56,
                  56,
                  "data_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("filter_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("mission_ids_example".to_string()),
                  Some("game_ids_example".to_string()),
                  Some("pack_ids_example".to_string()),
                  Some("game_level_ids_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("response_groups_example".to_string()),
                  Some("purchase_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegenAppData") => {
            let result = rt.block_on(client.regen_app_data(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("build_version_example".to_string()),
                  Some("api_version_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateApplication") => {
            let result = rt.block_on(client.create_application(
                  3.16,
                  "app_name_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("about_example".to_string()),
                  Some("bundle_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("facebook_app_id_example".to_string()),
                  Some("facebook_app_secret_example".to_string()),
                  Some("google_api_key_example".to_string()),
                  Some(true),
                  Some("eula_version_example".to_string()),
                  Some("landing_page_url_example".to_string()),
                  Some(true),
                  Some("activity_description_example".to_string()),
                  Some("invite_welcome_text_example".to_string()),
                  Some("invite_page_url_example".to_string()),
                  Some("url_scheme_example".to_string()),
                  Some("platforms_example".to_string()),
                  Some("download_urls_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some(models::CreateApplicationScoringTypeParameter::GameLevel),
                  Some(56),
                  Some(56),
                  Some(3.4),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(3.4),
                  Some(3.4),
                  Some("placement_name_example".to_string()),
                  Some("placement_description_example".to_string()),
                  Some(models::CreateApplicationPlacementSizeParameter::Config),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("sqoot_api_key_example".to_string()),
                  Some(models::CreateApplicationTrilatProcessingTypeParameter::Default),
                  Some(56),
                  Some(1.2),
                  Some("modules_example".to_string()),
                  Some(56),
                  Some("authorized_servers_example".to_string()),
                  Some("default_timezone_example".to_string()),
                  Some("smtp_pass_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("placement_meta_data_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(true),
                  Some("apple_app_id_example".to_string()),
                  Some("apple_team_id_example".to_string()),
                  Some("apple_auth_key_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("apple_issuer_id_example".to_string()),
                  Some("app_store_key_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("authorize_net_api_key_example".to_string()),
                  Some("authorize_net_transaction_key_example".to_string()),
                  Some("email_sender_example".to_string()),
                  Some("smtp_user_example".to_string()),
                  Some("smtp_host_example".to_string()),
                  Some("vatom_business_id_example".to_string()),
                  Some("vatom_rest_client_id_example".to_string()),
                  Some("vatom_rest_secret_key_example".to_string()),
                  Some("twilio_account_sid_example".to_string()),
                  Some("twilio_auth_token_example".to_string()),
                  Some("twilio_sender_phone_number_example".to_string()),
                  Some("open_ai_secret_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateApplicationPlacement") => {
            let result = rt.block_on(client.create_application_placement(
                  3.16,
                  "app_key_example".to_string(),
                  models::CreateApplicationPlacementSizeParameter::Config,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteApplication") => {
            let result = rt.block_on(client.delete_application(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteApplicationPlacement") => {
            let result = rt.block_on(client.delete_application_placement(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetApplication") => {
            let result = rt.block_on(client.get_application(
                  3.16,
                  Some("app_key_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetApplicationPlacement") => {
            let result = rt.block_on(client.get_application_placement(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetApplicationVersions") => {
            let result = rt.block_on(client.get_application_versions(
                  3.16
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUniqueUsersByApp") => {
            let result = rt.block_on(client.get_unique_users_by_app(
                  3.16,
                  "app_key_example".to_string(),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListApplications") => {
            let result = rt.block_on(client.list_applications(
                  3.16,
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("platforms_example".to_string()),
                  Some("device_ids_example".to_string()),
                  Some("device_versions_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some(models::ListApplicationsSortFieldParameter::Created),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("application_ids_example".to_string()),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchApplicationPlacement") => {
            let result = rt.block_on(client.search_application_placement(
                  3.16,
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchApplicationSettings") => {
            let result = rt.block_on(client.search_application_settings(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchApplications") => {
            let result = rt.block_on(client.search_applications(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("q_search_fields_example".to_string()),
                  Some(models::SearchApplicationsSortFieldParameter::Created),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateApplication") => {
            let result = rt.block_on(client.update_application(
                  3.16,
                  "app_key_example".to_string(),
                  "app_name_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("about_example".to_string()),
                  Some("bundle_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("facebook_app_id_example".to_string()),
                  Some("facebook_app_secret_example".to_string()),
                  Some("google_api_key_example".to_string()),
                  Some(true),
                  Some("eula_version_example".to_string()),
                  Some("landing_page_url_example".to_string()),
                  Some(true),
                  Some("activity_description_example".to_string()),
                  Some("invite_welcome_text_example".to_string()),
                  Some("invite_page_url_example".to_string()),
                  Some("url_scheme_example".to_string()),
                  Some("platforms_example".to_string()),
                  Some("download_urls_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some(models::CreateApplicationScoringTypeParameter::GameLevel),
                  Some(56),
                  Some(56),
                  Some(3.4),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(3.4),
                  Some(3.4),
                  Some("placement_name_example".to_string()),
                  Some("placement_description_example".to_string()),
                  Some(models::CreateApplicationPlacementSizeParameter::Config),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("sqoot_api_key_example".to_string()),
                  Some(models::CreateApplicationTrilatProcessingTypeParameter::Default),
                  Some(56),
                  Some(1.2),
                  Some("modules_example".to_string()),
                  Some(56),
                  Some("authorized_servers_example".to_string()),
                  Some("default_timezone_example".to_string()),
                  Some("smtp_pass_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("placement_meta_data_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(true),
                  Some("apple_app_id_example".to_string()),
                  Some("apple_team_id_example".to_string()),
                  Some("apple_auth_key_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("apple_issuer_id_example".to_string()),
                  Some("app_store_key_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("authorize_net_api_key_example".to_string()),
                  Some("authorize_net_transaction_key_example".to_string()),
                  Some("email_sender_example".to_string()),
                  Some("smtp_user_example".to_string()),
                  Some("smtp_host_example".to_string()),
                  Some("vatom_business_id_example".to_string()),
                  Some("vatom_rest_client_id_example".to_string()),
                  Some("vatom_rest_secret_key_example".to_string()),
                  Some("twilio_account_sid_example".to_string()),
                  Some("twilio_auth_token_example".to_string()),
                  Some("twilio_sender_phone_number_example".to_string()),
                  Some("open_ai_secret_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateApplicationActive") => {
            let result = rt.block_on(client.update_application_active(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateApplicationPlacement") => {
            let result = rt.block_on(client.update_application_placement(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(models::CreateApplicationPlacementSizeParameter::Config),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UploadApplicationCertificate") => {
            let result = rt.block_on(client.upload_application_certificate(
                  3.16,
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateApplicationConfig") => {
            let result = rt.block_on(client.create_application_config(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "config_version_example".to_string(),
                  789,
                  Some(789),
                  Some(789),
                  Some("udid_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteApplicationConfig") => {
            let result = rt.block_on(client.delete_application_config(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetApplicationConfig") => {
            let result = rt.block_on(client.get_application_config(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetApplicationConfigByConfigVersion") => {
            let result = rt.block_on(client.get_application_config_by_config_version(
                  3.16,
                  "app_key_example".to_string(),
                  "config_version_example".to_string(),
                  Some(789),
                  Some(789),
                  Some("udid_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchApplicationConfig") => {
            let result = rt.block_on(client.search_application_config(
                  3.16,
                  789,
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("udid_example".to_string()),
                  Some("config_version_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateApplicationConfig") => {
            let result = rt.block_on(client.update_application_config(
                  3.16,
                  789,
                  789,
                  Some("app_key_example".to_string()),
                  Some("config_version_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("udid_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssetMorph") => {
            let result = rt.block_on(client.asset_morph(
                  3.16,
                  789,
                  models::CreateApplicationPlacementSizeParameter::Config,
                  Some(789),
                  Some(56),
                  Some(56),
                  Some("background_size_example".to_string()),
                  Some("template_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateAsset") => {
            let result = rt.block_on(client.create_asset(
                  3.16,
                  Some(true),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("add_to_default_album_example".to_string()),
                  Some(true),
                  Some(56),
                  Some("version_name_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("caption_example".to_string()),
                  Some("asset_type_example".to_string()),
                  Some("approval_status_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("media_url_example".to_string()),
                  Some("media_string_example".to_string()),
                  Some("media_string_file_name_example".to_string()),
                  Some("media_string_content_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("attached_media_url_example".to_string()),
                  Some("attached_media_string_example".to_string()),
                  Some("attached_media_string_file_name_example".to_string()),
                  Some("attached_media_string_content_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some("location_description_example".to_string()),
                  Some("app_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAsset") => {
            let result = rt.block_on(client.delete_asset(
                  3.16,
                  "asset_id_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAsset") => {
            let result = rt.block_on(client.get_asset(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveAsset") => {
            let result = rt.block_on(client.remove_asset(
                  3.16,
                  "asset_id_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAssets") => {
            let result = rt.block_on(client.search_assets(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("album_ids_example".to_string()),
                  Some("asset_ids_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("media_type_example".to_string()),
                  Some("mime_type_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some("version_name_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("search_mode_example".to_string()),
                  Some("asset_type_example".to_string()),
                  Some("approval_status_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateAsset") => {
            let result = rt.block_on(client.update_asset(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some("version_name_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("caption_example".to_string()),
                  Some("asset_type_example".to_string()),
                  Some("approval_status_example".to_string()),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("media_url_example".to_string()),
                  Some("media_string_example".to_string()),
                  Some("media_string_file_name_example".to_string()),
                  Some("media_string_content_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("attached_media_url_example".to_string()),
                  Some("attached_media_string_example".to_string()),
                  Some("attached_media_string_file_name_example".to_string()),
                  Some("attached_media_string_content_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some("location_description_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssetDownload") => {
            let result = rt.block_on(client.asset_download(
                  3.16,
                  "filename_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssigmentAssigneeAccountSearch") => {
            let result = rt.block_on(client.assigment_assignee_account_search(
                  3.16,
                  789,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentCreate") => {
            let result = rt.block_on(client.assignment_create(
                  3.16,
                  789,
                  "name_example".to_string(),
                  789,
                  Some("description_example".to_string()),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentDelete") => {
            let result = rt.block_on(client.assignment_delete(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentGet") => {
            let result = rt.block_on(client.assignment_get(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentSearch") => {
            let result = rt.block_on(client.assignment_search(
                  3.16,
                  789,
                  models::AssignmentSearchSortFieldParameter::Id,
                  true,
                  true,
                  56,
                  56,
                  Some(789),
                  Some("assignee_account_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some(models::AssignmentSearchCurrentStatusTypeParameter::New),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentStatusCreate") => {
            let result = rt.block_on(client.assignment_status_create(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some(models::AssignmentStatusCreateToDoParameter::SiteVisit),
                  Some(models::AssignmentStatusCreateConnectionParameter::Initial),
                  Some(models::AssignmentStatusCreateMethodParameter::Phone),
                  Some(models::AssignmentStatusCreateStatusParameter::Archived),
                  Some(models::AssignmentStatusCreateClosureParameter::Phone),
                  Some("message_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentStatusDelete") => {
            let result = rt.block_on(client.assignment_status_delete(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentStatusGet") => {
            let result = rt.block_on(client.assignment_status_get(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentStatusSearch") => {
            let result = rt.block_on(client.assignment_status_search(
                  3.16,
                  789,
                  models::AssignmentStatusSearchSortFieldParameter::Id,
                  true,
                  true,
                  56,
                  56,
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(models::AssignmentStatusCreateStatusParameter::Archived),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentStatusUpdate") => {
            let result = rt.block_on(client.assignment_status_update(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some(models::AssignmentStatusCreateToDoParameter::SiteVisit),
                  Some(models::AssignmentStatusCreateConnectionParameter::Initial),
                  Some(models::AssignmentStatusCreateMethodParameter::Phone),
                  Some(models::AssignmentStatusCreateStatusParameter::Archived),
                  Some(models::AssignmentStatusCreateClosureParameter::Phone),
                  Some("message_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignmentUpdate") => {
            let result = rt.block_on(client.assignment_update(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateAudience") => {
            let result = rt.block_on(client.create_audience(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("description_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some("gender_example".to_string()),
                  Some("age_groups_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("application_ids_example".to_string()),
                  Some("game_experience_level_example".to_string()),
                  Some("devices_example".to_string()),
                  Some("device_ids_example".to_string()),
                  Some("device_versions_example".to_string()),
                  Some("locations_example".to_string()),
                  Some("radius_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("associate_description_example".to_string()),
                  Some("associate_type_example".to_string()),
                  Some(789),
                  Some("grouping_id_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("visibility_example".to_string()),
                  Some("audience_type_example".to_string()),
                  Some(true),
                  Some("cohort_regions_data_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("trilateration_types_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteAudience") => {
            let result = rt.block_on(client.delete_audience(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAgeGroups") => {
            let result = rt.block_on(client.get_age_groups(
                  3.16
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAudience") => {
            let result = rt.block_on(client.get_audience(
                  3.16,
                  789,
                  789,
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("album_types_for_count_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAudienceList") => {
            let result = rt.block_on(client.get_audience_list(
                  3.16,
                  Some(789),
                  Some("album_ids_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("keyword_fields_example".to_string()),
                  Some(models::GetAudienceListSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("audience_type_example".to_string()),
                  Some("audience_types_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("album_types_for_count_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetDevices") => {
            let result = rt.block_on(client.get_devices(
                  3.16,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetExperiences") => {
            let result = rt.block_on(client.get_experiences(
                  3.16
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGroupedAudiences") => {
            let result = rt.block_on(client.get_grouped_audiences(
                  3.16,
                  789,
                  "audience_grouping_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListByAccount") => {
            let result = rt.block_on(client.list_by_account(
                  3.16,
                  789,
                  56,
                  "suggestion_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListByAudience") => {
            let result = rt.block_on(client.list_by_audience(
                  3.16,
                  56,
                  Some("gender_example".to_string()),
                  Some(56),
                  Some("category_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListLastestByAccount") => {
            let result = rt.block_on(client.list_lastest_by_account(
                  3.16,
                  789,
                  56,
                  "suggestion_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendByAccount") => {
            let result = rt.block_on(client.send_by_account(
                  3.16,
                  789,
                  1.2,
                  1.2
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateAudience") => {
            let result = rt.block_on(client.update_audience(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some("gender_example".to_string()),
                  Some("age_groups_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("application_ids_example".to_string()),
                  Some("game_experience_level_example".to_string()),
                  Some("devices_example".to_string()),
                  Some("device_ids_example".to_string()),
                  Some("device_versions_example".to_string()),
                  Some("locations_example".to_string()),
                  Some("radius_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("associate_description_example".to_string()),
                  Some("associate_type_example".to_string()),
                  Some(789),
                  Some("grouping_id_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("visibility_example".to_string()),
                  Some("audience_type_example".to_string()),
                  Some(true),
                  Some("cohort_regions_data_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("trilateration_types_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateBid") => {
            let result = rt.block_on(client.create_bid(
                  3.16,
                  "biddable_type_example".to_string(),
                  789,
                  1.2,
                  1.2,
                  1.2,
                  "budget_schedule_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteBid") => {
            let result = rt.block_on(client.delete_bid(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBid") => {
            let result = rt.block_on(client.get_bid(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateBid") => {
            let result = rt.block_on(client.update_bid(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some("budget_schedule_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateBillableEntity") => {
            let result = rt.block_on(client.create_billable_entity(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("authorize_net_api_key_example".to_string()),
                  Some("authorize_net_transaction_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteBillableEntity") => {
            let result = rt.block_on(client.delete_billable_entity(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBillableEntity") => {
            let result = rt.block_on(client.get_billable_entity(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateBillableEntity") => {
            let result = rt.block_on(client.update_billable_entity(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("authorize_net_api_key_example".to_string()),
                  Some("authorize_net_transaction_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddPaymentMethod") => {
            let result = rt.block_on(client.add_payment_method(
                  3.16,
                  789,
                  Some(789),
                  Some("account_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("address_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("phone_example".to_string()),
                  Some("credit_card_number_example".to_string()),
                  Some("expiration_date_example".to_string()),
                  Some("ccv_example".to_string()),
                  Some("account_number_example".to_string()),
                  Some("bank_name_example".to_string()),
                  Some("routing_number_example".to_string()),
                  Some(true),
                  Some("payment_method_nickname_example".to_string()),
                  Some("tax_id_example".to_string()),
                  Some("provider_customer_profile_id_example".to_string()),
                  Some("provider_payment_profile_id_example".to_string()),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreatePaymentMethod") => {
            let result = rt.block_on(client.create_payment_method(
                  3.16,
                  789,
                  Some("account_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("address_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("phone_example".to_string()),
                  Some("credit_card_number_example".to_string()),
                  Some("expiration_date_example".to_string()),
                  Some("ccv_example".to_string()),
                  Some("account_number_example".to_string()),
                  Some("bank_name_example".to_string()),
                  Some("routing_number_example".to_string()),
                  Some("payment_method_nickname_example".to_string()),
                  Some("tax_id_example".to_string()),
                  Some(true),
                  Some("auth_token_example".to_string()),
                  Some("provider_example".to_string()),
                  Some("provider_customer_profile_id_example".to_string()),
                  Some("provider_payment_profile_id_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateSmartContract") => {
            let result = rt.block_on(client.create_smart_contract(
                  3.16,
                  789,
                  "token_name_example".to_string(),
                  "token_symbol_example".to_string(),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCryptoBalance") => {
            let result = rt.block_on(client.get_crypto_balance(
                  3.16,
                  789,
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPaymentMethod") => {
            let result = rt.block_on(client.get_payment_method(
                  3.16,
                  789,
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPaymentMethod") => {
            let result = rt.block_on(client.search_payment_method(
                  3.16,
                  789,
                  Some("provider_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStatusCsv") => {
            let result = rt.block_on(client.get_status_csv(
                  3.16,
                  789,
                  789,
                  models::GetStatusCsvResponseGroupParameter::Summary,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListStatusCsv") => {
            let result = rt.block_on(client.list_status_csv(
                  3.16,
                  789,
                  56,
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("StatusCsv") => {
            let result = rt.block_on(client.status_csv(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UploadCsv") => {
            let result = rt.block_on(client.upload_csv(
                  3.16,
                  789,
                  models::UploadCsvUploadTypeParameter::Offers,
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  models::UploadCsvFileFormatParameter::Excel,
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateCargoType") => {
            let result = rt.block_on(client.create_cargo_type(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchCargoTypes") => {
            let result = rt.block_on(client.search_cargo_types(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteCargoType") => {
            let result = rt.block_on(client.delete_cargo_type(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCargoType") => {
            let result = rt.block_on(client.get_cargo_type(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateCargoType") => {
            let result = rt.block_on(client.update_cargo_type(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchCarriers") => {
            let result = rt.block_on(client.search_carriers(
                  3.16,
                  Some("keyword_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CategoryDistanceSearch") => {
            let result = rt.block_on(client.category_distance_search(
                  3.16,
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("parent_category_ids_example".to_string()),
                  Some(true),
                  Some(models::SearchCategoriesSortFieldParameter::Id),
                  Some(models::SearchCategoriesResponseGroupParameter::All),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("param_type_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some(56),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateCategory") => {
            let result = rt.block_on(client.create_category(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some("description_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some(789),
                  Some("external_id_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some("external_category_slug_example".to_string()),
                  Some("sqoot_slug_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string()),
                  Some("search_tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteCategory") => {
            let result = rt.block_on(client.delete_category(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DuplicateCategory") => {
            let result = rt.block_on(client.duplicate_category(
                  3.16,
                  789,
                  789,
                  Some("app_key_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCategory") => {
            let result = rt.block_on(client.get_category(
                  3.16,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchCategories") => {
            let result = rt.block_on(client.search_categories(
                  3.16,
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("category_id_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("parent_category_ids_example".to_string()),
                  Some(true),
                  Some(models::SearchCategoriesSortFieldParameter::Id),
                  Some(models::SearchCategoriesResponseGroupParameter::All),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("param_type_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("search_mode_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateCategory") => {
            let result = rt.block_on(client.update_category(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some(789),
                  Some("external_id_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some("external_category_slug_example".to_string()),
                  Some("sqoot_slug_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string()),
                  Some("search_tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddConnectionToGroup") => {
            let result = rt.block_on(client.add_connection_to_group(
                  3.16,
                  true,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddConnectionsToGroup") => {
            let result = rt.block_on(client.add_connections_to_group(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddSubGroups") => {
            let result = rt.block_on(client.add_sub_groups(
                  3.16,
                  true,
                  789,
                  "sub_group_ids_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOrUpdateConnection") => {
            let result = rt.block_on(client.create_or_update_connection(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOrUpdateGroup") => {
            let result = rt.block_on(client.create_or_update_group(
                  3.16,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("connections_example".to_string()),
                  Some("description_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FollowAccept") => {
            let result = rt.block_on(client.follow_accept(
                  3.16,
                  789,
                  789,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FollowReject") => {
            let result = rt.block_on(client.follow_reject(
                  3.16,
                  789,
                  789,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FollowRemove") => {
            let result = rt.block_on(client.follow_remove(
                  3.16,
                  789,
                  789,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FollowRequest") => {
            let result = rt.block_on(client.follow_request(
                  3.16,
                  789,
                  789,
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FriendAccept") => {
            let result = rt.block_on(client.friend_accept(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("notification_message_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FriendReject") => {
            let result = rt.block_on(client.friend_reject(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some("notification_message_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FriendRemove") => {
            let result = rt.block_on(client.friend_remove(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FriendRequest") => {
            let result = rt.block_on(client.friend_request(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("notification_message_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetConnectionSentFriendRequests") => {
            let result = rt.block_on(client.get_connection_sent_friend_requests(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetConnections") => {
            let result = rt.block_on(client.get_connections(
                  3.16,
                  true,
                  "filter_example".to_string(),
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGroupDetails") => {
            let result = rt.block_on(client.get_group_details(
                  3.16,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GroupSearch") => {
            let result = rt.block_on(client.group_search(
                  3.16,
                  models::GroupSearchSortFieldParameter::Created,
                  true,
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveConnectionFromGroup") => {
            let result = rt.block_on(client.remove_connection_from_group(
                  3.16,
                  true,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveConnectionsFromGroup") => {
            let result = rt.block_on(client.remove_connections_from_group(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveGroup") => {
            let result = rt.block_on(client.remove_group(
                  3.16,
                  true,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveSubGroups") => {
            let result = rt.block_on(client.remove_sub_groups(
                  3.16,
                  true,
                  789,
                  "sub_group_ids_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchConnections") => {
            let result = rt.block_on(client.search_connections(
                  3.16,
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(56),
                  Some(56),
                  Some("sort_field_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddOrUpdateAlbumContest") => {
            let result = rt.block_on(client.add_or_update_album_contest(
                  3.16,
                  true,
                  true,
                  true,
                  true,
                  models::AddAlbumCollectionVisibilityParameter::Public,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("contest_type_example".to_string()),
                  Some(789),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(789),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some("location_description_example".to_string()),
                  Some("connection_ids_to_add_example".to_string()),
                  Some("connection_group_ids_to_add_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ApproveAlbumContest") => {
            let result = rt.block_on(client.approve_album_contest(
                  3.16,
                  789,
                  models::ApproveAlbumApprovalStatusParameter::Pending,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteContest") => {
            let result = rt.block_on(client.delete_contest(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAlbumContest") => {
            let result = rt.block_on(client.get_album_contest(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAlbumContests") => {
            let result = rt.block_on(client.get_album_contests(
                  3.16,
                  "filter_example".to_string(),
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("app_type_example".to_string()),
                  Some("contest_type_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("VoteOnAlbumContest") => {
            let result = rt.block_on(client.vote_on_album_contest(
                  3.16,
                  789,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("contest_type_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddPreview") => {
            let result = rt.block_on(client.add_preview(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsFind") => {
            let result = rt.block_on(client.ads_find(
                  3.16,
                  "app_key_example".to_string(),
                  true,
                  true,
                  Some("param_type_example".to_string()),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("device_example".to_string()),
                  Some(789),
                  Some("device_version_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some("mission_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateCreative") => {
            let result = rt.block_on(client.create_creative(
                  3.16,
                  789,
                  "name_example".to_string(),
                  true,
                  true,
                  Some("description_example".to_string()),
                  Some(789),
                  Some("action_example".to_string()),
                  Some("data_example".to_string()),
                  Some("suffix_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some(1.2),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteCreative") => {
            let result = rt.block_on(client.delete_creative(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCreative") => {
            let result = rt.block_on(client.get_creative(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCreativesByApplication") => {
            let result = rt.block_on(client.get_creatives_by_application(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  56,
                  56,
                  Some(789),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemovePreview") => {
            let result = rt.block_on(client.remove_preview(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateCreative") => {
            let result = rt.block_on(client.update_creative(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some("action_example".to_string()),
                  Some("data_example".to_string()),
                  Some("suffix_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some(1.2),
                  Some(true),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Create") => {
            let result = rt.block_on(client.create(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetDependents") => {
            let result = rt.block_on(client.get_dependents(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveDependent") => {
            let result = rt.block_on(client.remove_dependent(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CheckDisbursements") => {
            let result = rt.block_on(client.check_disbursements(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateDisbursement") => {
            let result = rt.block_on(client.create_disbursement(
                  3.16,
                  789,
                  789,
                  789,
                  8.14,
                  models::CreateDisbursementProviderParameter::AuthorizeNet,
                  Some(789),
                  Some("title_example".to_string()),
                  Some("comment_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some("introspection_params_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetDisbursement") => {
            let result = rt.block_on(client.get_disbursement(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchDisbursements") => {
            let result = rt.block_on(client.search_disbursements(
                  3.16,
                  789,
                  Some(789),
                  Some("statuses_example".to_string()),
                  Some("providers_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("external_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateDisbursement") => {
            let result = rt.block_on(client.update_disbursement(
                  3.16,
                  789,
                  789,
                  Some(8.14),
                  Some(models::CreateDisbursementProviderParameter::AuthorizeNet),
                  Some(789),
                  Some("title_example".to_string()),
                  Some("comment_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some(true),
                  Some("introspection_params_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignEmployee") => {
            let result = rt.block_on(client.assign_employee(
                  3.16,
                  789,
                  789,
                  789,
                  Some("role_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AssignToLocationEmployee") => {
            let result = rt.block_on(client.assign_to_location_employee(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateEmployee") => {
            let result = rt.block_on(client.create_employee(
                  3.16,
                  789,
                  789,
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some("name_example".to_string()),
                  Some("prefix_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("middle_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("suffix_name_example".to_string()),
                  Some("title_example".to_string()),
                  Some("about_us_example".to_string()),
                  Some(789),
                  Some(models::SearchAccountsGenderParameter::Male),
                  Some("home_phone_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("cell_phone_carrier_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("country_example".to_string()),
                  Some("role_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("settings_app_key_example".to_string()),
                  Some("app_blob_example".to_string()),
                  Some("assigned_device_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteEmployee") => {
            let result = rt.block_on(client.delete_employee(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEmployee") => {
            let result = rt.block_on(client.get_employee(
                  3.16,
                  789,
                  789,
                  Some("settings_app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchEmployees") => {
            let result = rt.block_on(client.search_employees(
                  3.16,
                  789,
                  Some("role_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(models::SearchEmployeesSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some("settings_app_key_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("query_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UnassignEmployee") => {
            let result = rt.block_on(client.unassign_employee(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateEmployee") => {
            let result = rt.block_on(client.update_employee(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some("name_example".to_string()),
                  Some("prefix_name_example".to_string()),
                  Some("first_name_example".to_string()),
                  Some("middle_name_example".to_string()),
                  Some("last_name_example".to_string()),
                  Some("suffix_name_example".to_string()),
                  Some("title_example".to_string()),
                  Some(789),
                  Some(models::SearchAccountsGenderParameter::Male),
                  Some("home_phone_example".to_string()),
                  Some("cell_phone_example".to_string()),
                  Some("cell_phone_carrier_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("country_example".to_string()),
                  Some("role_example".to_string()),
                  Some(true),
                  Some("password_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("settings_app_key_example".to_string()),
                  Some("app_blob_example".to_string()),
                  Some("assigned_device_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AttendEvent") => {
            let result = rt.block_on(client.attend_event(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateEvent") => {
            let result = rt.block_on(client.create_event(
                  3.16,
                  789,
                  "title_example".to_string(),
                  Some("retailer_location_ids_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteEvent") => {
            let result = rt.block_on(client.delete_event(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEvent") => {
            let result = rt.block_on(client.get_event(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchEventTransactions") => {
            let result = rt.block_on(client.search_event_transactions(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("customer_account_ids_example".to_string()),
                  Some("affiliated_category_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("statuses_example".to_string()),
                  Some(models::SearchEventTransactionsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchEvents") => {
            let result = rt.block_on(client.search_events(
                  3.16,
                  789,
                  Some("keyword_example".to_string()),
                  Some(true),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some("offer_audience_ids_example".to_string()),
                  Some("transaction_audience_ids_example".to_string()),
                  Some(models::SearchEventsSortFieldParameter::Id),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateEvent") => {
            let result = rt.block_on(client.update_event(
                  3.16,
                  789,
                  789,
                  Some("retailer_location_ids_example".to_string()),
                  Some("title_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetToken") => {
            let result = rt.block_on(client.get_token(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GraphInterface") => {
            let result = rt.block_on(client.graph_interface(
                  3.16,
                  "event_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("permissionable_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddFavorite") => {
            let result = rt.block_on(client.add_favorite(
                  3.16,
                  789,
                  "favoritable_type_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteFavorite") => {
            let result = rt.block_on(client.delete_favorite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("favoritable_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFavorite") => {
            let result = rt.block_on(client.get_favorite(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchFavorites") => {
            let result = rt.block_on(client.search_favorites(
                  3.16,
                  "favoritable_type_example".to_string(),
                  models::SearchFavoritesSortFieldParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("secondary_type_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("WhoHasFavorited") => {
            let result = rt.block_on(client.who_has_favorited(
                  3.16,
                  789,
                  "favoritable_type_example".to_string(),
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateFilter") => {
            let result = rt.block_on(client.create_filter(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some("description_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteFilter") => {
            let result = rt.block_on(client.delete_filter(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFilter") => {
            let result = rt.block_on(client.get_filter(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchFilters") => {
            let result = rt.block_on(client.search_filters(
                  3.16,
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(models::SearchCategoriesResponseGroupParameter::All),
                  Some(true),
                  Some(models::SearchCategoriesSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateFilter") => {
            let result = rt.block_on(client.update_filter(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some("external_type_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateFlag") => {
            let result = rt.block_on(client.create_flag(
                  3.16,
                  "flagable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("flag_description_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteFlag") => {
            let result = rt.block_on(client.delete_flag(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("item_being_flagged_type_example".to_string()),
                  Some(789),
                  Some("flagable_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFlag") => {
            let result = rt.block_on(client.get_flag(
                  3.16,
                  "flagable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFlagThreshold") => {
            let result = rt.block_on(client.get_flag_threshold(
                  3.16,
                  "item_being_flagged_type_example".to_string(),
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateFlagThreshold") => {
            let result = rt.block_on(client.update_flag_threshold(
                  3.16,
                  "item_being_flagged_type_example".to_string(),
                  789,
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateGame") => {
            let result = rt.block_on(client.create_game(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("pack_ids_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteGame") => {
            let result = rt.block_on(client.delete_game(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGame") => {
            let result = rt.block_on(client.get_game(
                  3.16,
                  789,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchGames") => {
            let result = rt.block_on(client.search_games(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  56,
                  56,
                  Some("keyword_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateGame") => {
            let result = rt.block_on(client.update_game(
                  3.16,
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("pack_ids_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateGameLevel") => {
            let result = rt.block_on(client.create_game_level(
                  3.16,
                  789,
                  "name_example".to_string(),
                  "game_data_example".to_string(),
                  "game_data_suffix_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some("description_example".to_string()),
                  Some("difficulty_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("visibility_example".to_string()),
                  Some(true),
                  Some("connection_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some("tutorial_title_example".to_string()),
                  Some("tutorial_message_example".to_string()),
                  Some("tutorial_alignment_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteGameLevel") => {
            let result = rt.block_on(client.delete_game_level(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGameLevel") => {
            let result = rt.block_on(client.get_game_level(
                  3.16,
                  789,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGameLevelsByApplication") => {
            let result = rt.block_on(client.get_game_levels_by_application(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("app_version_example".to_string()),
                  Some(true),
                  Some("filters_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetGameLevelsByBillableEntity") => {
            let result = rt.block_on(client.get_game_levels_by_billable_entity(
                  3.16,
                  789,
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(models::GetGameLevelsByBillableEntitySortFieldParameter::LevelActive),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetQuestionsInLevel") => {
            let result = rt.block_on(client.get_questions_in_level(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetWordsInLevel") => {
            let result = rt.block_on(client.get_words_in_level(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateGameLevel") => {
            let result = rt.block_on(client.update_game_level(
                  3.16,
                  789,
                  789,
                  Some("app_key_example".to_string()),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some("difficulty_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("game_data_example".to_string()),
                  Some("game_data_suffix_example".to_string()),
                  Some("visibility_example".to_string()),
                  Some(true),
                  Some("connection_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some("tutorial_title_example".to_string()),
                  Some("tutorial_message_example".to_string()),
                  Some("tutorial_alignment_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateQuestionsInLevel") => {
            let result = rt.block_on(client.update_questions_in_level(
                  3.16,
                  789,
                  789,
                  "question_ids_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateWordsInLevel") => {
            let result = rt.block_on(client.update_words_in_level(
                  3.16,
                  789,
                  789,
                  "word_ids_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AcceptInvite") => {
            let result = rt.block_on(client.accept_invite(
                  3.16,
                  "token_example".to_string(),
                  789,
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AlbumContestInvite") => {
            let result = rt.block_on(client.album_contest_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AlbumInvite") => {
            let result = rt.block_on(client.album_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("EventInvite") => {
            let result = rt.block_on(client.event_invite(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789,
                  Some("receiver_account_ids_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GameInvite") => {
            let result = rt.block_on(client.game_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetInvite") => {
            let result = rt.block_on(client.get_invite(
                  3.16,
                  Some(789),
                  Some("token_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MissionInvite") => {
            let result = rt.block_on(client.mission_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OfferInvite") => {
            let result = rt.block_on(client.offer_invite(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OfferLocationInvite") => {
            let result = rt.block_on(client.offer_location_invite(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetailerLocationInvite") => {
            let result = rt.block_on(client.retailer_location_invite(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789,
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateLeaderboard") => {
            let result = rt.block_on(client.create_leaderboard(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some("leaderboard_mode_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(56),
                  Some("sort_field_example".to_string()),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteLeaderboard") => {
            let result = rt.block_on(client.delete_leaderboard(
                  3.16,
                  789,
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLeaderboard") => {
            let result = rt.block_on(client.get_leaderboard(
                  3.16,
                  789,
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchLeaderboards") => {
            let result = rt.block_on(client.search_leaderboards(
                  3.16,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some("keyword_example".to_string()),
                  Some("leaderboard_ids_example".to_string()),
                  Some("rank_types_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateLeaderboard") => {
            let result = rt.block_on(client.update_leaderboard(
                  3.16,
                  789,
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some("leaderboard_mode_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(56),
                  Some(true),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegisterLike") => {
            let result = rt.block_on(client.register_like(
                  3.16,
                  "likable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("permissionable_type_example".to_string()),
                  Some(789),
                  Some(true),
                  Some("app_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveLike") => {
            let result = rt.block_on(client.remove_like(
                  3.16,
                  "likable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchLikes") => {
            let result = rt.block_on(client.search_likes(
                  3.16,
                  "likable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_account_ids_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateListing") => {
            let result = rt.block_on(client.create_listing(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("filter_ids_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("location_name_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(true),
                  Some("external_id_example".to_string()),
                  Some("external_id2_example".to_string()),
                  Some("external_group_id_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteListing") => {
            let result = rt.block_on(client.delete_listing(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetListing") => {
            let result = rt.block_on(client.get_listing(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchListing") => {
            let result = rt.block_on(client.search_listing(
                  3.16,
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(true),
                  Some("external_id_example".to_string()),
                  Some("external_id2_example".to_string()),
                  Some("external_group_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SummaryListing") => {
            let result = rt.block_on(client.summary_listing(
                  3.16,
                  Some(789),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateListing") => {
            let result = rt.block_on(client.update_listing(
                  3.16,
                  789,
                  789,
                  Some("filter_ids_example".to_string()),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("location_name_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(true),
                  Some("external_id_example".to_string()),
                  Some("external_id2_example".to_string()),
                  Some("external_group_id_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CacheTrilaterationData") => {
            let result = rt.block_on(client.cache_trilateration_data(
                  3.16,
                  "udid_example".to_string(),
                  Some(789),
                  Some(56),
                  Some("data_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CacheTrilaterationDataGzip") => {
            let result = rt.block_on(client.cache_trilateration_data_gzip(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLocationByIp") => {
            let result = rt.block_on(client.get_location_by_ip(
                  3.16,
                  Some("ip_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLocationByTrilateration") => {
            let result = rt.block_on(client.get_location_by_trilateration(
                  3.16,
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("data_example".to_string()),
                  Some("response_filters_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetLocations") => {
            let result = rt.block_on(client.get_locations(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some("query_example".to_string()),
                  Some("zipcode_example".to_string()),
                  Some("zip_code_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateLocationV2") => {
            let result = rt.block_on(client.create_location_v2(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateLocationV2") => {
            let result = rt.block_on(client.update_location_v2(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateMedia") => {
            let result = rt.block_on(client.create_media(
                  3.16,
                  789,
                  "title_example".to_string(),
                  models::CreateMediaBarcodeTypeParameter::None,
                  true,
                  56,
                  56,
                  56,
                  56,
                  56,
                  789,
                  1.2,
                  1.2,
                  models::CreateMediaSpecialOfferTypeParameter::All,
                  models::CreateMediaOfferVisibilityParameter::Public,
                  true,
                  Some("retailer_location_ids_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("sub_details_example".to_string()),
                  Some("fine_print_example".to_string()),
                  Some("barcode_entry_example".to_string()),
                  Some("external_redeem_options_example".to_string()),
                  Some("external_url_example".to_string()),
                  Some("tickets_reward_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("ticket_price_type_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("publisher_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(models::CreateMediaConditionTypeParameter::New),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some("catalog_numbers_example".to_string()),
                  Some("parental_rating_example".to_string()),
                  Some(789),
                  Some(models::CreateMediaMediaTypeParameter::Apk),
                  Some(56),
                  Some("author_example".to_string()),
                  Some(789),
                  Some("collection_ids_example".to_string()),
                  Some("availability_example".to_string()),
                  Some("availability_summary_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteMedia") => {
            let result = rt.block_on(client.delete_media(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMedia") => {
            let result = rt.block_on(client.get_media(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchMedia") => {
            let result = rt.block_on(client.search_media(
                  3.16,
                  789,
                  true,
                  models::SearchEventsSortFieldParameter::Id,
                  true,
                  Some("keyword_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateMedia") => {
            let result = rt.block_on(client.update_media(
                  3.16,
                  789,
                  789,
                  Some("retailer_location_ids_example".to_string()),
                  Some("offer_locations_example".to_string()),
                  Some("title_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("sub_details_example".to_string()),
                  Some("fine_print_example".to_string()),
                  Some(models::CreateMediaBarcodeTypeParameter::None),
                  Some("barcode_entry_example".to_string()),
                  Some("external_redeem_options_example".to_string()),
                  Some("external_url_example".to_string()),
                  Some("tickets_reward_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("ticket_price_type_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(models::CreateMediaSpecialOfferTypeParameter::All),
                  Some(models::CreateMediaOfferVisibilityParameter::Public),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("publisher_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(models::CreateMediaConditionTypeParameter::New),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some("catalog_numbers_example".to_string()),
                  Some(789),
                  Some("parental_rating_example".to_string()),
                  Some(models::CreateMediaMediaTypeParameter::Apk),
                  Some(56),
                  Some("author_example".to_string()),
                  Some(789),
                  Some("collection_ids_example".to_string()),
                  Some("availability_example".to_string()),
                  Some("availability_summary_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateMission") => {
            let result = rt.block_on(client.create_mission(
                  3.16,
                  789,
                  "title_example".to_string(),
                  Some("description_example".to_string()),
                  Some("sub_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some("game_level_ids_example".to_string()),
                  Some("creative_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("mission_task_example".to_string()),
                  Some("format_type_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some("meta_data_example".to_string()),
                  Some("application_ids_example".to_string()),
                  Some("devices_example".to_string()),
                  Some("device_ids_example".to_string()),
                  Some("device_versions_example".to_string()),
                  Some("locations_example".to_string()),
                  Some("radius_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteMission") => {
            let result = rt.block_on(client.delete_mission(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FindMissions") => {
            let result = rt.block_on(client.find_missions(
                  3.16,
                  "app_key_example".to_string(),
                  Some("suffix_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("device_example".to_string()),
                  Some(789),
                  Some("device_version_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("mission_ids_example".to_string()),
                  Some("audience_operator_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMission") => {
            let result = rt.block_on(client.get_mission(
                  3.16,
                  789,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ImportMission") => {
            let result = rt.block_on(client.import_mission(
                  3.16,
                  789,
                  1.2,
                  1.2,
                  "app_key_example".to_string(),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(models::CreateApplicationPlacementSizeParameter::Config)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchMissionFormats") => {
            let result = rt.block_on(client.search_mission_formats(
                  3.16,
                  56,
                  56,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchMissions") => {
            let result = rt.block_on(client.search_missions(
                  3.16,
                  789,
                  Some("keyword_example".to_string()),
                  Some("sub_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("suffix_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchMissionsByBillableEntity") => {
            let result = rt.block_on(client.search_missions_by_billable_entity(
                  3.16,
                  789,
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("suffix_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateMission") => {
            let result = rt.block_on(client.update_mission(
                  3.16,
                  789,
                  789,
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("sub_type_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some("game_level_ids_example".to_string()),
                  Some("creative_ids_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some("application_ids_example".to_string()),
                  Some("devices_example".to_string()),
                  Some("device_ids_example".to_string()),
                  Some("device_versions_example".to_string()),
                  Some("locations_example".to_string()),
                  Some("radius_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateMissionInvite") => {
            let result = rt.block_on(client.create_mission_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("join_code_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteMissionInvite") => {
            let result = rt.block_on(client.delete_mission_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMissionInvite") => {
            let result = rt.block_on(client.get_mission_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some("include_scores_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchMissionInvites") => {
            let result = rt.block_on(client.search_mission_invites(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some(789),
                  Some("status_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some("keyword_example".to_string()),
                  Some("mission_types_example".to_string()),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateMissionInvite") => {
            let result = rt.block_on(client.update_mission_invite(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("status_example".to_string()),
                  Some("permissionable_type_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BatchOperation") => {
            let result = rt.block_on(client.batch_operation(
                  3.16,
                  789,
                  "notable_type_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("batch_operation_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateNote") => {
            let result = rt.block_on(client.create_note(
                  3.16,
                  "comment_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("notable_type_example".to_string()),
                  Some(789),
                  Some("note_type_example".to_string()),
                  Some("asset_ids_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("permissionable_type_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some("receiver_account_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some("asset_add_to_default_album_example".to_string()),
                  Some(true),
                  Some(56),
                  Some("asset_version_name_example".to_string()),
                  Some("asset_meta_data_example".to_string()),
                  Some("asset_caption_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("asset_media_url_example".to_string()),
                  Some("asset_media_string_example".to_string()),
                  Some("asset_media_string_file_name_example".to_string()),
                  Some("asset_media_string_content_type_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("asset_attached_media_url_example".to_string()),
                  Some("asset_attached_media_string_example".to_string()),
                  Some("asset_attached_media_string_file_name_example".to_string()),
                  Some("asset_attached_media_string_content_type_example".to_string()),
                  Some("asset_location_description_example".to_string()),
                  Some("asset_app_example".to_string()),
                  Some("asset_search_tags_example".to_string()),
                  Some(1.2),
                  Some(8.14)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteNote") => {
            let result = rt.block_on(client.delete_note(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetNote") => {
            let result = rt.block_on(client.get_note(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchNotes") => {
            let result = rt.block_on(client.search_notes(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("notable_type_example".to_string()),
                  Some(789),
                  Some("note_types_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(models::SearchNotesSortFieldParameter::Id),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateNote") => {
            let result = rt.block_on(client.update_note(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("comment_example".to_string()),
                  Some("note_type_example".to_string()),
                  Some("asset_ids_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("permissionable_type_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some("asset_add_to_default_album_example".to_string()),
                  Some(true),
                  Some(56),
                  Some("asset_version_name_example".to_string()),
                  Some("asset_meta_data_example".to_string()),
                  Some("asset_caption_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("asset_media_url_example".to_string()),
                  Some("asset_media_string_example".to_string()),
                  Some("asset_media_string_file_name_example".to_string()),
                  Some("asset_media_string_content_type_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("asset_attached_media_url_example".to_string()),
                  Some("asset_attached_media_string_example".to_string()),
                  Some("asset_attached_media_string_file_name_example".to_string()),
                  Some("asset_attached_media_string_content_type_example".to_string()),
                  Some("asset_location_description_example".to_string()),
                  Some("asset_app_example".to_string()),
                  Some("asset_search_tags_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateNotificationTemplate") => {
            let result = rt.block_on(client.create_notification_template(
                  3.16,
                  789,
                  "conduit_example".to_string(),
                  "title_example".to_string(),
                  "body_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some("event_example".to_string()),
                  Some("tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOrUpdateBlockedNotifications") => {
            let result = rt.block_on(client.create_or_update_blocked_notifications(
                  3.16,
                  "app_key_example".to_string(),
                  "data_example".to_string(),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteNotificationTemplate") => {
            let result = rt.block_on(client.delete_notification_template(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetNotificationTemplate") => {
            let result = rt.block_on(client.get_notification_template(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetNotifications") => {
            let result = rt.block_on(client.get_notifications(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("event_type_example".to_string()),
                  Some("content_ids_example".to_string()),
                  Some("content_types_example".to_string()),
                  Some("parent_ids_example".to_string()),
                  Some("parent_types_example".to_string()),
                  Some("action_category_example".to_string()),
                  Some("conduits_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RegisterNotificationToken") => {
            let result = rt.block_on(client.register_notification_token(
                  3.16,
                  "token_example".to_string(),
                  models::RegisterNotificationTokenPushTypeParameter::Apns,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("environment_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchBlockedNotifications") => {
            let result = rt.block_on(client.search_blocked_notifications(
                  3.16,
                  "app_key_example".to_string(),
                  Some(789),
                  Some("search_tags_example".to_string()),
                  Some("events_example".to_string()),
                  Some("conduits_example".to_string()),
                  Some("custom_types_example".to_string()),
                  Some("content_types_example".to_string()),
                  Some("content_ids_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchNotificationTemplate") => {
            let result = rt.block_on(client.search_notification_template(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  Some("app_key_example".to_string()),
                  Some("event_example".to_string()),
                  Some("conduit_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRecipients") => {
            let result = rt.block_on(client.search_recipients(
                  3.16,
                  models::SearchRecipientsSortFieldParameter::Id,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("conduit_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some("audience_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some("recipient_account_ids_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRecipientsCount") => {
            let result = rt.block_on(client.search_recipients_count(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("conduit_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some("audience_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendBatchNotifications") => {
            let result = rt.block_on(client.send_batch_notifications(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "custom_message_example".to_string(),
                  Some("conduit_example".to_string()),
                  Some(789),
                  Some("content_name_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some(789),
                  Some("parent_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendCustomNotifications") => {
            let result = rt.block_on(client.send_custom_notifications(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("receiver_account_ids_example".to_string()),
                  Some(true),
                  Some("app_key_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("conduit_example".to_string()),
                  Some(789),
                  Some("content_name_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some(789),
                  Some("parent_type_example".to_string()),
                  Some("action_category_example".to_string()),
                  Some("subject_example".to_string()),
                  Some("custom_message_example".to_string()),
                  Some(true),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateNotificationTemplate") => {
            let result = rt.block_on(client.update_notification_template(
                  3.16,
                  789,
                  789,
                  Some("title_example".to_string()),
                  Some("body_example".to_string()),
                  Some("tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddField") => {
            let result = rt.block_on(client.add_field(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "object_name_example".to_string(),
                  "field_name_example".to_string(),
                  "field_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateObject") => {
            let result = rt.block_on(client.create_object(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "object_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteField") => {
            let result = rt.block_on(client.delete_field(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "object_name_example".to_string(),
                  "field_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteObject") => {
            let result = rt.block_on(client.delete_object(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "object_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetObject") => {
            let result = rt.block_on(client.get_object(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "object_name_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchObject") => {
            let result = rt.block_on(client.search_object(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789,
                  789,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateData") => {
            let result = rt.block_on(client.create_data(
                  3.16,
                  "object_name_example".to_string(),
                  Some(789),
                  Some("body_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchData") => {
            let result = rt.block_on(client.search_data(
                  3.16,
                  "object_name_example".to_string(),
                  true,
                  789,
                  789,
                  Some(789),
                  Some("criteria_example".to_string()),
                  Some("order_example".to_string()),
                  Some("include_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteData") => {
            let result = rt.block_on(client.delete_data(
                  3.16,
                  "object_name_example".to_string(),
                  "object_id_example".to_string(),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetData") => {
            let result = rt.block_on(client.get_data(
                  3.16,
                  "object_name_example".to_string(),
                  "object_id_example".to_string(),
                  Some(789),
                  Some("include_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateData") => {
            let result = rt.block_on(client.update_data(
                  3.16,
                  "object_name_example".to_string(),
                  "object_id_example".to_string(),
                  Some(789),
                  Some("body_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BatchUpdateOfferLocations") => {
            let result = rt.block_on(client.batch_update_offer_locations(
                  3.16,
                  "data_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOffer") => {
            let result = rt.block_on(client.create_offer(
                  3.16,
                  true,
                  "title_example".to_string(),
                  models::CreateMediaBarcodeTypeParameter::None,
                  true,
                  56,
                  56,
                  56,
                  56,
                  56,
                  789,
                  1.2,
                  1.2,
                  models::CreateOfferOfferTypeParameter::Voucher,
                  models::CreateMediaSpecialOfferTypeParameter::All,
                  models::CreateMediaOfferVisibilityParameter::Public,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some(789),
                  Some("retailer_location_ids_example".to_string()),
                  Some("offer_locations_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("sub_details_example".to_string()),
                  Some("fine_print_example".to_string()),
                  Some("barcode_entry_example".to_string()),
                  Some("external_redeem_options_example".to_string()),
                  Some("external_url_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some("tickets_reward_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("ticket_price_type_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("publisher_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("brand_example".to_string()),
                  Some(models::CreateOfferProductTypeParameter::Apparel),
                  Some(models::CreateMediaConditionTypeParameter::New),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some("catalog_numbers_example".to_string()),
                  Some("department_example".to_string()),
                  Some("features_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(models::CreateOfferUnitParameter::Milimeter),
                  Some("studio_example".to_string()),
                  Some("parental_rating_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(models::CreateMediaMediaTypeParameter::Apk),
                  Some(56),
                  Some("author_example".to_string()),
                  Some(789),
                  Some("collection_ids_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("serial_number_example".to_string()),
                  Some("udid_example".to_string()),
                  Some("device_type_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("availability_example".to_string()),
                  Some("availability_summary_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOffer") => {
            let result = rt.block_on(client.delete_offer(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOfferLocation") => {
            let result = rt.block_on(client.delete_offer_location(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOffer") => {
            let result = rt.block_on(client.get_offer(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferDetails") => {
            let result = rt.block_on(client.get_offer_details(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferListCounts") => {
            let result = rt.block_on(client.get_offer_list_counts(
                  3.16,
                  1.2,
                  1.2,
                  Some(8.14),
                  Some(models::GetOfferListCountsDistanceUnitParameter::Miles)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferLocation") => {
            let result = rt.block_on(client.get_offer_location(
                  3.16,
                  Some(789),
                  Some("udid_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferLocationsForRetailers") => {
            let result = rt.block_on(client.get_offer_locations_for_retailers(
                  3.16,
                  models::SearchOffersForConsumerGroupByParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some(models::CreateMediaSpecialOfferTypeParameter::All),
                  Some("barcode_type_example".to_string()),
                  Some("barcode_entry_example".to_string()),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some(models::GetOfferLocationsForRetailersDeviceStatusParameter::Running),
                  Some(true),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOffersForRetailers") => {
            let result = rt.block_on(client.get_offers_for_retailers(
                  3.16,
                  models::CreateMediaOfferVisibilityParameter::Public,
                  models::SearchEventsSortFieldParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  true,
                  true,
                  true,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some("offer_types_example".to_string()),
                  Some(models::CreateMediaSpecialOfferTypeParameter::All),
                  Some(56),
                  Some(56),
                  Some("barcode_type_example".to_string()),
                  Some("barcode_entry_example".to_string()),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some(models::GetOfferLocationsForRetailersDeviceStatusParameter::Running),
                  Some(true),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RedeemOfferTransaction") => {
            let result = rt.block_on(client.redeem_offer_transaction(
                  3.16,
                  789,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchOfferTransactionsForRetailers") => {
            let result = rt.block_on(client.search_offer_transactions_for_retailers(
                  3.16,
                  models::SearchEventTransactionsSortFieldParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some(models::CreateMediaSpecialOfferTypeParameter::All),
                  Some("customer_account_ids_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchOffersForConsumer") => {
            let result = rt.block_on(client.search_offers_for_consumer(
                  3.16,
                  1.2,
                  1.2,
                  models::SearchOffersForConsumerRecommendationTypeParameter::Wallet,
                  789,
                  56,
                  56,
                  56,
                  models::SearchOffersForConsumerDistanceUnitParameter::Miles,
                  Some("app_key_example".to_string()),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some("tags_example".to_string()),
                  Some("supported_postal_codes_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("categories_example".to_string()),
                  Some("filters_example".to_string()),
                  Some("offer_types_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some("recommend_offer_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("search_expression_example".to_string()),
                  Some(models::SearchOffersForConsumerGroupByParameter::Id)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TopOfferTransactions") => {
            let result = rt.block_on(client.top_offer_transactions(
                  3.16,
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateOffer") => {
            let result = rt.block_on(client.update_offer(
                  3.16,
                  789,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("retailer_location_ids_example".to_string()),
                  Some("offer_locations_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("title_example".to_string()),
                  Some("sub_title_example".to_string()),
                  Some("details_example".to_string()),
                  Some("sub_details_example".to_string()),
                  Some("fine_print_example".to_string()),
                  Some(models::CreateMediaBarcodeTypeParameter::None),
                  Some("barcode_entry_example".to_string()),
                  Some("external_redeem_options_example".to_string()),
                  Some("external_url_example".to_string()),
                  Some("external_id_example".to_string()),
                  Some("tickets_reward_type_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("ticket_price_type_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some(models::CreateMediaSpecialOfferTypeParameter::All),
                  Some(models::CreateMediaOfferVisibilityParameter::Public),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("publisher_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("brand_example".to_string()),
                  Some(models::CreateOfferProductTypeParameter::Apparel),
                  Some(models::CreateMediaConditionTypeParameter::New),
                  Some("isbn_example".to_string()),
                  Some("asin_example".to_string()),
                  Some("catalog_numbers_example".to_string()),
                  Some("department_example".to_string()),
                  Some("features_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(models::CreateOfferUnitParameter::Milimeter),
                  Some("studio_example".to_string()),
                  Some("parental_rating_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(models::CreateMediaMediaTypeParameter::Apk),
                  Some(56),
                  Some("author_example".to_string()),
                  Some(789),
                  Some("collection_ids_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("serial_number_example".to_string()),
                  Some("udid_example".to_string()),
                  Some("device_type_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("availability_example".to_string()),
                  Some("availability_summary_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateOfferStatus") => {
            let result = rt.block_on(client.update_offer_status(
                  3.16,
                  "offer_ids_example".to_string(),
                  true,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOfferTransactionStatus") => {
            let result = rt.block_on(client.create_offer_transaction_status(
                  3.16,
                  "name_example".to_string(),
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("description_example".to_string()),
                  Some("role_example".to_string()),
                  Some(true),
                  Some("application_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOfferTransactionStatus") => {
            let result = rt.block_on(client.delete_offer_transaction_status(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferTransactionStatus") => {
            let result = rt.block_on(client.get_offer_transaction_status(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchOfferTransactionStatuses") => {
            let result = rt.block_on(client.search_offer_transaction_statuses(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some("keyword_example".to_string()),
                  Some("role_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(models::SearchOfferTransactionStatusesSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateOfferTransactionStatus") => {
            let result = rt.block_on(client.update_offer_transaction_status(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(56),
                  Some("role_example".to_string()),
                  Some(true),
                  Some("application_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ImageGeneration") => {
            let result = rt.block_on(client.image_generation(
                  3.16,
                  789,
                  "post_body_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RequestOptimization") => {
            let result = rt.block_on(client.request_optimization(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOptimizationResult") => {
            let result = rt.block_on(client.get_optimization_result(
                  3.16,
                  "batch_id_example".to_string(),
                  56,
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddMovie") => {
            let result = rt.block_on(client.add_movie(
                  3.16,
                  789,
                  "movie_name_example".to_string(),
                  Some("third_party_account_id_example".to_string()),
                  Some("tags_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AiDocs") => {
            let result = rt.block_on(client.ai_docs(
                  3.16,
                  789,
                  "doc_example".to_string(),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AiFindImages") => {
            let result = rt.block_on(client.ai_find_images(
                  3.16,
                  789,
                  "text_example".to_string(),
                  Some("parse_flag_example".to_string()),
                  Some("fetch_flag_example".to_string()),
                  Some("size_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AiTags") => {
            let result = rt.block_on(client.ai_tags(
                  3.16,
                  789,
                  "tags_example".to_string(),
                  Some("conditional_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AiText") => {
            let result = rt.block_on(client.ai_text(
                  3.16,
                  789,
                  "terms_example".to_string(),
                  Some("conditional_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Batch") => {
            let result = rt.block_on(client.batch(
                  3.16,
                  789,
                  Some("third_party_account_id_example".to_string()),
                  Some(56),
                  Some("operations_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateInstantEpisode") => {
            let result = rt.block_on(client.create_instant_episode(
                  3.16,
                  789,
                  "data_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateVoiceCanvas") => {
            let result = rt.block_on(client.create_voice_canvas(
                  3.16,
                  789,
                  "dimensions_example".to_string(),
                  Some("third_party_account_id_example".to_string()),
                  Some("text_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Emotion") => {
            let result = rt.block_on(client.emotion(
                  3.16,
                  789,
                  Some("third_party_account_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("StartVideoRender") => {
            let result = rt.block_on(client.start_video_render(
                  3.16,
                  789,
                  "data_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Stt") => {
            let result = rt.block_on(client.stt(
                  3.16,
                  789,
                  Some("third_party_account_id_example".to_string()),
                  Some("source_language_example".to_string()),
                  Some("target_language_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SummarizeTopics") => {
            let result = rt.block_on(client.summarize_topics(
                  3.16,
                  789,
                  Some("third_party_account_id_example".to_string()),
                  Some("doc_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some(56),
                  Some(56),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TechTune") => {
            let result = rt.block_on(client.tech_tune(
                  3.16,
                  789,
                  56,
                  Some("third_party_account_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("url_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Tts") => {
            let result = rt.block_on(client.tts(
                  3.16,
                  789,
                  "text_example".to_string(),
                  Some("third_party_account_id_example".to_string()),
                  Some("language_example".to_string()),
                  Some("voice_example".to_string()),
                  Some("callback_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAddMovieResult") => {
            let result = rt.block_on(client.get_add_movie_result(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBatch") => {
            let result = rt.block_on(client.get_batch(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEmotion") => {
            let result = rt.block_on(client.get_emotion(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEpisodeStatus") => {
            let result = rt.block_on(client.get_episode_status(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRenderStatus") => {
            let result = rt.block_on(client.get_render_status(
                  3.16,
                  "render_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStt") => {
            let result = rt.block_on(client.get_stt(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTechTune") => {
            let result = rt.block_on(client.get_tech_tune(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTopics") => {
            let result = rt.block_on(client.get_topics(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTts") => {
            let result = rt.block_on(client.get_tts(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVoiceCanvas") => {
            let result = rt.block_on(client.get_voice_canvas(
                  3.16,
                  "request_id_example".to_string(),
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreatePack") => {
            let result = rt.block_on(client.create_pack(
                  3.16,
                  789,
                  "title_example".to_string(),
                  789,
                  56,
                  true,
                  true,
                  789,
                  Some("description_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some(true),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(models::CreatePackPackTypeParameter::Tutorial),
                  Some(models::CreatePackSequenceTypeParameter::FirstAvailable),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("author_override_example".to_string()),
                  Some("price_type_example".to_string()),
                  Some("game_level_ids_example".to_string()),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeletePack") => {
            let result = rt.block_on(client.delete_pack(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPack") => {
            let result = rt.block_on(client.get_pack(
                  3.16,
                  789,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPacks") => {
            let result = rt.block_on(client.search_packs(
                  3.16,
                  789,
                  models::SearchPacksSortFieldParameter::Title,
                  true,
                  Some("keyword_example".to_string()),
                  Some(models::CreatePackPackTypeParameter::Tutorial),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdatePack") => {
            let result = rt.block_on(client.update_pack(
                  3.16,
                  789,
                  789,
                  true,
                  789,
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some(true),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(models::CreatePackPackTypeParameter::Tutorial),
                  Some(789),
                  Some(models::CreatePackSequenceTypeParameter::FirstAvailable),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("author_override_example".to_string()),
                  Some(56),
                  Some("price_type_example".to_string()),
                  Some("game_level_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProcessAllParticipants") => {
            let result = rt.block_on(client.process_all_participants(
                  3.16,
                  789,
                  Some("app_key_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProcessParticipants") => {
            let result = rt.block_on(client.process_participants(
                  3.16,
                  789,
                  "league_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE")))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ComputePath") => {
            let result = rt.block_on(client.compute_path(
                  3.16,
                  "data_example".to_string(),
                  models::ComputePathUnitsParameter::Metric,
                  true,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreatePostalCode") => {
            let result = rt.block_on(client.create_postal_code(
                  3.16,
                  789,
                  "code_example".to_string(),
                  1.2,
                  1.2,
                  Some("state_code_example".to_string()),
                  Some("city_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeletePostalCode") => {
            let result = rt.block_on(client.delete_postal_code(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPostalCode") => {
            let result = rt.block_on(client.get_postal_code(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPostalCodes") => {
            let result = rt.block_on(client.get_postal_codes(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  Some(1.2),
                  Some(1.2),
                  Some("keyword_example".to_string()),
                  Some(1.2),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdatePostalCode") => {
            let result = rt.block_on(client.update_postal_code(
                  3.16,
                  789,
                  789,
                  Some("code_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("state_code_example".to_string()),
                  Some("city_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreatePersona") => {
            let result = rt.block_on(client.create_persona(
                  3.16,
                  789,
                  "title_example".to_string(),
                  Some("preview_accounts_example".to_string()),
                  Some(789),
                  Some(56),
                  Some("gender_example".to_string()),
                  Some("game_experience_level_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeletePersona") => {
            let result = rt.block_on(client.delete_persona(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPersonaList") => {
            let result = rt.block_on(client.get_persona_list(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPersona") => {
            let result = rt.block_on(client.search_persona(
                  3.16,
                  789,
                  56,
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdatePersona") => {
            let result = rt.block_on(client.update_persona(
                  3.16,
                  789,
                  789,
                  Some("title_example".to_string()),
                  Some("preview_accounts_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(56),
                  Some("gender_example".to_string()),
                  Some("game_experience_level_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateProgram") => {
            let result = rt.block_on(client.create_program(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPrograms") => {
            let result = rt.block_on(client.search_programs(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteProgram") => {
            let result = rt.block_on(client.delete_program(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetProgram") => {
            let result = rt.block_on(client.get_program(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostProgram") => {
            let result = rt.block_on(client.post_program(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PutProgram") => {
            let result = rt.block_on(client.put_program(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreatePurchaseItem") => {
            let result = rt.block_on(client.create_purchase_item(
                  3.16,
                  "app_key_example".to_string(),
                  "name_example".to_string(),
                  models::CreatePurchaseItemPurchaseTypeParameter::Sirqul,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("description_example".to_string()),
                  Some(56),
                  Some(3.4),
                  Some("purchase_code_example".to_string()),
                  Some("secret_key_example".to_string()),
                  Some(56),
                  Some(models::CreatePurchaseItemServiceActionParameter::DayPremium),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeletePurchaseItem") => {
            let result = rt.block_on(client.delete_purchase_item(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPurchaseItem") => {
            let result = rt.block_on(client.get_purchase_item(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPurchaseItems") => {
            let result = rt.block_on(client.search_purchase_items(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some(true),
                  Some("purchase_type_example".to_string()),
                  Some("service_action_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(models::SearchPurchaseItemsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdatePurchaseItem") => {
            let result = rt.block_on(client.update_purchase_item(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(56),
                  Some(3.4),
                  Some(models::CreatePurchaseItemPurchaseTypeParameter::Sirqul),
                  Some("purchase_code_example".to_string()),
                  Some("secret_key_example".to_string()),
                  Some(56),
                  Some(models::CreatePurchaseItemServiceActionParameter::DayPremium),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOrder") => {
            let result = rt.block_on(client.create_order(
                  3.16,
                  "app_key_example".to_string(),
                  "cart_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("description_example".to_string()),
                  Some(models::CreateOrderCurrencyTypeParameter::Void),
                  Some(789),
                  Some("external_order_id_example".to_string()),
                  Some("external_payment_id_example".to_string()),
                  Some("remote_ref_type_example".to_string()),
                  Some(789),
                  Some("promo_code_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOrder") => {
            let result = rt.block_on(client.delete_order(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOrder") => {
            let result = rt.block_on(client.get_order(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("external_order_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PreviewOrder") => {
            let result = rt.block_on(client.preview_order(
                  3.16,
                  "app_key_example".to_string(),
                  "cart_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("description_example".to_string()),
                  Some(models::CreateOrderCurrencyTypeParameter::Void),
                  Some(789),
                  Some("external_order_id_example".to_string()),
                  Some("external_payment_id_example".to_string()),
                  Some("remote_ref_type_example".to_string()),
                  Some(789),
                  Some("promo_code_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchOrders") => {
            let result = rt.block_on(client.search_orders(
                  3.16,
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("order_item_types_example".to_string()),
                  Some("order_item_ids_example".to_string()),
                  Some("order_custom_types_example".to_string()),
                  Some("order_custom_ids_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some("offer_types_example".to_string()),
                  Some("special_offer_types_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some("offer_audience_ids_example".to_string()),
                  Some("transaction_audience_ids_example".to_string()),
                  Some("offer_ids_example".to_string()),
                  Some("offer_location_ids_example".to_string()),
                  Some("retailer_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("statuses_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateOrder") => {
            let result = rt.block_on(client.update_order(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "cart_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("description_example".to_string()),
                  Some(models::CreateOrderCurrencyTypeParameter::Void),
                  Some(789),
                  Some("external_payment_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateQuestion") => {
            let result = rt.block_on(client.create_question(
                  3.16,
                  789,
                  "question_example".to_string(),
                  "answers_example".to_string(),
                  true,
                  true,
                  789,
                  Some("tags_example".to_string()),
                  Some("video_url_example".to_string()),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteQuestion") => {
            let result = rt.block_on(client.delete_question(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetQuestion") => {
            let result = rt.block_on(client.get_question(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchQuestions") => {
            let result = rt.block_on(client.search_questions(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  true,
                  56,
                  56,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateQuestion") => {
            let result = rt.block_on(client.update_question(
                  3.16,
                  789,
                  789,
                  789,
                  Some("question_example".to_string()),
                  Some("answers_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("video_url_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetHistoricalRankings") => {
            let result = rt.block_on(client.get_historical_rankings(
                  3.16,
                  "app_key_example".to_string(),
                  "rank_type_example".to_string(),
                  789,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRankings") => {
            let result = rt.block_on(client.get_rankings(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some("leaderboard_mode_example".to_string()),
                  Some("within_account_ids_example".to_string()),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserRank") => {
            let result = rt.block_on(client.get_user_rank(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("rank_type_example".to_string()),
                  Some(true),
                  Some("leaderboard_mode_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OverrideUserRank") => {
            let result = rt.block_on(client.override_user_rank(
                  3.16,
                  789,
                  789,
                  "app_key_example".to_string(),
                  "rank_type_example".to_string(),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRankings") => {
            let result = rt.block_on(client.update_rankings(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "rank_type_example".to_string(),
                  Some(789),
                  Some(789),
                  Some("tag_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRating") => {
            let result = rt.block_on(client.create_rating(
                  3.16,
                  "ratable_type_example".to_string(),
                  789,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("display_example".to_string()),
                  Some("description_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRating") => {
            let result = rt.block_on(client.delete_rating(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchLocationRatingIndexes") => {
            let result = rt.block_on(client.search_location_rating_indexes(
                  3.16,
                  Some("category_ids_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("location_type_example".to_string()),
                  Some(models::SearchRatingIndexesSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(models::SearchOffersForConsumerDistanceUnitParameter::Miles),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRatingIndexes") => {
            let result = rt.block_on(client.search_rating_indexes(
                  3.16,
                  models::SearchRatingIndexesRatableTypeParameter::Locatable,
                  Some("ratable_ids_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("secondary_type_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(models::SearchRatingIndexesSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRatings") => {
            let result = rt.block_on(client.search_ratings(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("ratable_type_example".to_string()),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(models::SearchRatingsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRating") => {
            let result = rt.block_on(client.update_rating(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(789),
                  Some("display_example".to_string()),
                  Some("description_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRegion") => {
            let result = rt.block_on(client.create_region(
                  3.16,
                  789,
                  "region_class_example".to_string(),
                  "short_name_example".to_string(),
                  Some("full_name_example".to_string()),
                  Some("parent_ids_example".to_string()),
                  Some("children_ids_example".to_string()),
                  Some("postal_code_ids_example".to_string()),
                  Some("locations_example".to_string()),
                  Some(789),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("polygon_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(56),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRegion") => {
            let result = rt.block_on(client.delete_region(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRegion") => {
            let result = rt.block_on(client.get_region(
                  3.16,
                  789,
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRegions") => {
            let result = rt.block_on(client.search_regions(
                  3.16,
                  Some(789),
                  Some("query_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some(models::SearchRegionsRegionClassParameter::National),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(models::SearchRegionsSearchModeParameter::Rds),
                  Some(models::SearchRegionsSortFieldParameter::Id),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRegion") => {
            let result = rt.block_on(client.update_region(
                  3.16,
                  789,
                  789,
                  Some("region_class_example".to_string()),
                  Some("short_name_example".to_string()),
                  Some("full_name_example".to_string()),
                  Some("parent_ids_example".to_string()),
                  Some("children_ids_example".to_string()),
                  Some("postal_code_ids_example".to_string()),
                  Some("locations_example".to_string()),
                  Some(789),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("polygon_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateBatch") => {
            let result = rt.block_on(client.create_batch(
                  3.16,
                  789,
                  models::CreateBatchStatusParameter::New,
                  56,
                  Some("app_key_example".to_string()),
                  Some("endpoint_example".to_string()),
                  Some("parameters_example".to_string()),
                  Some("name_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("description_example".to_string()),
                  Some("page_url_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRegionLegSummaryBatch") => {
            let result = rt.block_on(client.create_region_leg_summary_batch(
                  3.16,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteBatch") => {
            let result = rt.block_on(client.delete_batch(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReportBatch") => {
            let result = rt.block_on(client.get_report_batch(
                  3.16,
                  789,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RunReport") => {
            let result = rt.block_on(client.run_report(
                  3.16,
                  true,
                  Some(789),
                  Some("query_example".to_string()),
                  Some("parameters_example".to_string()),
                  Some("order_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchBatch") => {
            let result = rt.block_on(client.search_batch(
                  3.16,
                  789,
                  56,
                  56,
                  Some("names_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(models::CreateBatchStatusParameter::New),
                  Some(true),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateReservation") => {
            let result = rt.block_on(client.create_reservation(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("app_key_example".to_string()),
                  Some("meta_data_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteReservation") => {
            let result = rt.block_on(client.delete_reservation(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ReservableAvailability") => {
            let result = rt.block_on(client.reservable_availability(
                  3.16,
                  789,
                  models::SearchRatingIndexesRatableTypeParameter::Locatable,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("availability_example".to_string()),
                  Some("availability_summary_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAvailability") => {
            let result = rt.block_on(client.search_availability(
                  3.16,
                  789,
                  models::SearchRatingIndexesRatableTypeParameter::Locatable,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchReservations") => {
            let result = rt.block_on(client.search_reservations(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(models::SearchRatingIndexesRatableTypeParameter::Locatable),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchSchedule") => {
            let result = rt.block_on(client.search_schedule(
                  3.16,
                  789,
                  models::SearchRatingIndexesRatableTypeParameter::Locatable,
                  789,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRetailer") => {
            let result = rt.block_on(client.create_retailer(
                  3.16,
                  "name_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("website_example".to_string()),
                  Some("email_example".to_string()),
                  Some("facebook_url_example".to_string()),
                  Some("twitter_url_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("category_ids_to_add_example".to_string()),
                  Some("category_ids_to_remove_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some("retailer_type_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRetailer") => {
            let result = rt.block_on(client.delete_retailer(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRetailer") => {
            let result = rt.block_on(client.get_retailer(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRetailers") => {
            let result = rt.block_on(client.get_retailers(
                  3.16,
                  models::AddAlbumCollectionVisibilityParameter::Public,
                  models::GetRetailersSortFieldParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RetailerLoginCheck") => {
            let result = rt.block_on(client.retailer_login_check(
                  3.16,
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRetailer") => {
            let result = rt.block_on(client.update_retailer(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("website_example".to_string()),
                  Some("email_example".to_string()),
                  Some("facebook_url_example".to_string()),
                  Some("twitter_url_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some("search_tags_example".to_string()),
                  Some("retailer_type_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRetailerLocationConsumer") => {
            let result = rt.block_on(client.create_retailer_location_consumer(
                  3.16,
                  "app_key_example".to_string(),
                  "name_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("website_example".to_string()),
                  Some("email_example".to_string()),
                  Some("details_header_example".to_string()),
                  Some("details_body_example".to_string()),
                  Some("hours_example".to_string()),
                  Some("tags_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("location_type_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRetailerLocations") => {
            let result = rt.block_on(client.create_retailer_locations(
                  3.16,
                  789,
                  "name_example".to_string(),
                  "street_address_example".to_string(),
                  "city_example".to_string(),
                  "state_example".to_string(),
                  "postal_code_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("street_address2_example".to_string()),
                  Some("country_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("website_example".to_string()),
                  Some("email_example".to_string()),
                  Some("internal_id_example".to_string()),
                  Some("details_header_example".to_string()),
                  Some("details_body_example".to_string()),
                  Some("hours_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("building_example".to_string()),
                  Some("google_place_id_example".to_string()),
                  Some("yelp_id_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("location_type_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string()),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html),
                  Some("response_includes_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRetailerLocation") => {
            let result = rt.block_on(client.delete_retailer_location(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRetailerLocation") => {
            let result = rt.block_on(client.get_retailer_location(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("retailer_location_token_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRetailerLocationConsumer") => {
            let result = rt.block_on(client.get_retailer_location_consumer(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("IndexedRetailerLocationDistanceSearch") => {
            let result = rt.block_on(client.indexed_retailer_location_distance_search(
                  3.16,
                  1.2,
                  1.2,
                  1.2,
                  56,
                  56,
                  Some(789),
                  Some("address_example".to_string()),
                  Some(true),
                  Some("categories_example".to_string()),
                  Some("filters_example".to_string()),
                  Some("audiences_example".to_string()),
                  Some("retailer_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("location_type_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("keyword_operator_example".to_string()),
                  Some("search_expression_example".to_string()),
                  Some(models::SearchOffersForConsumerDistanceUnitParameter::Miles),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("IndexedRetailerLocationSearch") => {
            let result = rt.block_on(client.indexed_retailer_location_search(
                  3.16,
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some("categories_example".to_string()),
                  Some("filters_example".to_string()),
                  Some("audiences_example".to_string()),
                  Some("retailer_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("tags_example".to_string()),
                  Some("location_type_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("keyword_operator_example".to_string()),
                  Some("search_expression_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRetailerLocations") => {
            let result = rt.block_on(client.search_retailer_locations(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("retailer_ids_example".to_string()),
                  Some("retailer_location_ids_example".to_string()),
                  Some("location_type_example".to_string()),
                  Some(models::SearchRetailerLocationsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRetailerLocations") => {
            let result = rt.block_on(client.update_retailer_locations(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("name_example".to_string()),
                  Some("street_address_example".to_string()),
                  Some("street_address2_example".to_string()),
                  Some("city_example".to_string()),
                  Some("state_example".to_string()),
                  Some("postal_code_example".to_string()),
                  Some("country_example".to_string()),
                  Some("business_phone_example".to_string()),
                  Some("business_phone_ext_example".to_string()),
                  Some("website_example".to_string()),
                  Some("email_example".to_string()),
                  Some("internal_id_example".to_string()),
                  Some("details_header_example".to_string()),
                  Some("details_body_example".to_string()),
                  Some("hours_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(789),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("building_example".to_string()),
                  Some("google_place_id_example".to_string()),
                  Some("yelp_id_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("payment_provider_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("location_type_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string()),
                  Some(models::AggregatedFilteredUsageResponseFormatParameter::Html),
                  Some("tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRetaokiler") => {
            let result = rt.block_on(client.get_retaokiler(
                  3.16,
                  789,
                  true,
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRoute") => {
            let result = rt.block_on(client.create_route(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRoutes") => {
            let result = rt.block_on(client.search_routes(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  true,
                  true,
                  true,
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ApproveRoute") => {
            let result = rt.block_on(client.approve_route(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CopyRoute") => {
            let result = rt.block_on(client.copy_route(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRouteDirections") => {
            let result = rt.block_on(client.create_route_directions(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRoutePolyline") => {
            let result = rt.block_on(client.create_route_polyline(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRoute") => {
            let result = rt.block_on(client.delete_route(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DisapproveRoute") => {
            let result = rt.block_on(client.disapprove_route(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRoute") => {
            let result = rt.block_on(client.get_route(
                  3.16,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRouteDirections") => {
            let result = rt.block_on(client.get_route_directions(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRouteShipments") => {
            let result = rt.block_on(client.get_route_shipments(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRouteStops") => {
            let result = rt.block_on(client.get_route_stops(
                  3.16,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OptimizeRoute") => {
            let result = rt.block_on(client.optimize_route(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ReorderRouteStopsPatch") => {
            let result = rt.block_on(client.reorder_route_stops_patch(
                  3.16,
                  789,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ReorderRouteStopsPost") => {
            let result = rt.block_on(client.reorder_route_stops_post(
                  3.16,
                  789,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRoute") => {
            let result = rt.block_on(client.update_route(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRouteStop") => {
            let result = rt.block_on(client.get_route_stop(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipmentsAtStop") => {
            let result = rt.block_on(client.get_shipments_at_stop(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveStop") => {
            let result = rt.block_on(client.remove_stop(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SetDriver") => {
            let result = rt.block_on(client.set_driver(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRouteStop") => {
            let result = rt.block_on(client.update_route_stop(
                  3.16,
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateRouteSettings") => {
            let result = rt.block_on(client.create_route_settings(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRouteSettings") => {
            let result = rt.block_on(client.search_route_settings(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteRouteSettings") => {
            let result = rt.block_on(client.delete_route_settings(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetRouteSettings") => {
            let result = rt.block_on(client.get_route_settings(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRouteSettings") => {
            let result = rt.block_on(client.update_route_settings(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ComputeRouting") => {
            let result = rt.block_on(client.compute_routing(
                  3.16,
                  "data_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateScheduledNotification") => {
            let result = rt.block_on(client.create_scheduled_notification(
                  3.16,
                  789,
                  "name_example".to_string(),
                  "param_type_example".to_string(),
                  "message_example".to_string(),
                  Some(789),
                  Some("content_name_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some(789),
                  Some("parent_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some(789),
                  Some("audience_ids_example".to_string()),
                  Some("album_ids_example".to_string()),
                  Some(789),
                  Some("report_params_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some("cron_type_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("conditional_input_example".to_string()),
                  Some("template_type_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true),
                  Some(true),
                  Some("event_type_example".to_string()),
                  Some("deep_link_uri_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteScheduledNotification") => {
            let result = rt.block_on(client.delete_scheduled_notification(
                  3.16,
                  789,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetScheduledNotification") => {
            let result = rt.block_on(client.get_scheduled_notification(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ScheduleNotificationListings") => {
            let result = rt.block_on(client.schedule_notification_listings(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "report_name_example".to_string(),
                  "message_example".to_string(),
                  56,
                  789,
                  Some("report_params_example".to_string()),
                  Some("param_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchScheduledNotifications") => {
            let result = rt.block_on(client.search_scheduled_notifications(
                  3.16,
                  789,
                  Some("grouping_id_example".to_string()),
                  Some(789),
                  Some("filter_example".to_string()),
                  Some("types_example".to_string()),
                  Some("content_ids_example".to_string()),
                  Some("content_types_example".to_string()),
                  Some("parent_ids_example".to_string()),
                  Some("parent_types_example".to_string()),
                  Some("statuses_example".to_string()),
                  Some("template_types_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateScheduledNotification") => {
            let result = rt.block_on(client.update_scheduled_notification(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("param_type_example".to_string()),
                  Some("message_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some("content_name_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some(789),
                  Some("parent_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some(789),
                  Some("audience_ids_example".to_string()),
                  Some("album_ids_example".to_string()),
                  Some(789),
                  Some("report_params_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some("cron_type_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("conditional_input_example".to_string()),
                  Some("template_type_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true),
                  Some("error_message_example".to_string()),
                  Some("status_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("event_type_example".to_string()),
                  Some("deep_link_uri_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateScore") => {
            let result = rt.block_on(client.create_score(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  56,
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetScore") => {
            let result = rt.block_on(client.get_score(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("score_object_type_example".to_string()),
                  Some("score_status_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchScores") => {
            let result = rt.block_on(client.search_scores(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateSecureApplication") => {
            let result = rt.block_on(client.create_secure_application(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  "username_example".to_string(),
                  "password_example".to_string(),
                  Some(true),
                  Some(models::CreateSecureApplicationBiometricTypeParameter::Fingerprint),
                  Some(models::CreateSecureApplicationBiometricPositionParameter::Unknown),
                  Some(models::CreateSecureApplicationBiometricPositionParameter::Unknown)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteSecureApplication") => {
            let result = rt.block_on(client.delete_secure_application(
                  3.16,
                  789,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LoginSecure") => {
            let result = rt.block_on(client.login_secure(
                  3.16,
                  "app_key_example".to_string(),
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  Some("device_id_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(56),
                  Some(true),
                  Some("response_filters_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PurchaseSecure") => {
            let result = rt.block_on(client.purchase_secure(
                  3.16,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ResetSecure") => {
            let result = rt.block_on(client.reset_secure(
                  3.16,
                  789,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSecureApplication") => {
            let result = rt.block_on(client.update_secure_application(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(true),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("username_example".to_string()),
                  Some("password_example".to_string()),
                  Some(models::UpdateSecureApplicationBiometricTypeParameter::Fingerprint),
                  Some(models::UpdateSecureApplicationBiometricPositionParameter::Unknown),
                  Some(models::UpdateSecureApplicationBiometricPositionParameter::Unknown)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateServiceHub") => {
            let result = rt.block_on(client.create_service_hub(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchServiceHubs") => {
            let result = rt.block_on(client.search_service_hubs(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some("keyword_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteServiceHub") => {
            let result = rt.block_on(client.delete_service_hub(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetServiceHub") => {
            let result = rt.block_on(client.get_service_hub(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PostServiceHub") => {
            let result = rt.block_on(client.post_service_hub(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PutServiceHub") => {
            let result = rt.block_on(client.put_service_hub(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateShipment") => {
            let result = rt.block_on(client.create_shipment(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchShipments") => {
            let result = rt.block_on(client.search_shipments(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CancelShipment") => {
            let result = rt.block_on(client.cancel_shipment(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteShipment") => {
            let result = rt.block_on(client.delete_shipment(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipment") => {
            let result = rt.block_on(client.get_shipment(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateShipment") => {
            let result = rt.block_on(client.update_shipment(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateShipmentStatus") => {
            let result = rt.block_on(client.update_shipment_status(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateShipmentBatch") => {
            let result = rt.block_on(client.create_shipment_batch(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchShipmentBatch") => {
            let result = rt.block_on(client.search_shipment_batch(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteShipmentBatch") => {
            let result = rt.block_on(client.delete_shipment_batch(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipmentBatch") => {
            let result = rt.block_on(client.get_shipment_batch(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipmentBatchStatus") => {
            let result = rt.block_on(client.get_shipment_batch_status(
                  3.16,
                  789,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Simulation") => {
            let result = rt.block_on(client.simulation(
                  3.16,
                  "data_example".to_string(),
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetStop") => {
            let result = rt.block_on(client.get_stop(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateStop") => {
            let result = rt.block_on(client.update_stop(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateStripeCheckoutSession") => {
            let result = rt.block_on(client.create_stripe_checkout_session(
                  3.16,
                  "app_key_example".to_string(),
                  "stripe_parameters_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateSubscription") => {
            let result = rt.block_on(client.create_subscription(
                  3.16,
                  789,
                  Some(789),
                  Some("promo_code_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteSubscription") => {
            let result = rt.block_on(client.delete_subscription(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscription") => {
            let result = rt.block_on(client.get_subscription(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscriptionPlan") => {
            let result = rt.block_on(client.get_subscription_plan(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscriptionPlans") => {
            let result = rt.block_on(client.get_subscription_plans(
                  3.16,
                  Some(true),
                  Some("role_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSubscriptionUsage") => {
            let result = rt.block_on(client.get_subscription_usage(
                  3.16,
                  789,
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSubscription") => {
            let result = rt.block_on(client.update_subscription(
                  3.16,
                  789,
                  Some(789),
                  Some("promo_code_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateTask") => {
            let result = rt.block_on(client.create_task(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteTask") => {
            let result = rt.block_on(client.delete_task(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTask") => {
            let result = rt.block_on(client.get_task(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTasks") => {
            let result = rt.block_on(client.search_tasks(
                  3.16,
                  789,
                  Some("grouping_id_example".to_string()),
                  Some("filter_example".to_string()),
                  Some("statuses_example".to_string()),
                  Some("template_types_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTask") => {
            let result = rt.block_on(client.update_task(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateTerritory") => {
            let result = rt.block_on(client.create_territory(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteTerritory") => {
            let result = rt.block_on(client.delete_territory(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTerritory") => {
            let result = rt.block_on(client.get_territory(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTerritories") => {
            let result = rt.block_on(client.search_territories(
                  3.16,
                  models::SearchTerritoriesSortFieldParameter::Id,
                  true,
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTerritory") => {
            let result = rt.block_on(client.update_territory(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddOrUpdateThemeDescriptor") => {
            let result = rt.block_on(client.add_or_update_theme_descriptor(
                  3.16,
                  true,
                  true,
                  true,
                  true,
                  models::AddAlbumCollectionVisibilityParameter::Public,
                  true,
                  true,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some(789),
                  Some("title_example".to_string()),
                  Some("description_example".to_string()),
                  Some("connection_ids_to_add_example".to_string()),
                  Some("connection_group_ids_to_add_example".to_string()),
                  Some("app_version_example".to_string()),
                  Some("color_value_json_example".to_string()),
                  Some("string_replacer_json_example".to_string()),
                  Some("custom_json_objects_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("music_selection_example".to_string()),
                  Some("location_description_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetThemeDescriptor") => {
            let result = rt.block_on(client.get_theme_descriptor(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetThemeDescriptors") => {
            let result = rt.block_on(client.get_theme_descriptors(
                  3.16,
                  "filter_example".to_string(),
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("contest_type_example".to_string()),
                  Some(789),
                  Some("q_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(789),
                  Some("app_version_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveThemeDescriptor") => {
            let result = rt.block_on(client.remove_theme_descriptor(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateCredential") => {
            let result = rt.block_on(client.create_credential(
                  3.16,
                  "third_party_id_example".to_string(),
                  "third_party_token_example".to_string(),
                  "network_uid_example".to_string(),
                  "app_key_example".to_string(),
                  Some(789),
                  Some("device_id_example".to_string()),
                  Some("session_id_example".to_string()),
                  Some("third_party_name_example".to_string()),
                  Some("email_address_example".to_string()),
                  Some(true),
                  Some("response_filters_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some("third_party_refresh_token_example".to_string()),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateNetwork") => {
            let result = rt.block_on(client.create_network(
                  3.16,
                  789,
                  "name_example".to_string(),
                  true,
                  Some("description_example".to_string()),
                  Some("introspection_method_example".to_string()),
                  Some("introspection_url_example".to_string()),
                  Some("introspection_params_example".to_string()),
                  Some("required_root_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("oauth_token_url_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("oauth_client_id_example".to_string()),
                  Some("oauth_secret_key_example".to_string()),
                  Some("body_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteCredential") => {
            let result = rt.block_on(client.delete_credential(
                  3.16,
                  789,
                  "network_uid_example".to_string(),
                  "third_party_id_example".to_string(),
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteNetwork") => {
            let result = rt.block_on(client.delete_network(
                  3.16,
                  789,
                  "network_uid_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCredential") => {
            let result = rt.block_on(client.get_credential(
                  3.16,
                  "network_uid_example".to_string(),
                  "app_key_example".to_string(),
                  Some(789),
                  Some("device_id_example".to_string()),
                  Some("session_id_example".to_string()),
                  Some(789),
                  Some("third_party_token_example".to_string()),
                  Some("third_party_secret_example".to_string()),
                  Some(true),
                  Some("response_filters_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("audience_ids_to_add_example".to_string()),
                  Some("audience_ids_to_remove_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetNetwork") => {
            let result = rt.block_on(client.get_network(
                  3.16,
                  789,
                  "network_uid_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchCredentials") => {
            let result = rt.block_on(client.search_credentials(
                  3.16,
                  789,
                  Some("keyword_example".to_string()),
                  Some("network_uid_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchNetworks") => {
            let result = rt.block_on(client.search_networks(
                  3.16,
                  789,
                  models::SearchNetworksSortFieldParameter::Id,
                  true,
                  56,
                  56,
                  true,
                  Some("keyword_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendMfaChallenge") => {
            let result = rt.block_on(client.send_mfa_challenge(
                  3.16,
                  "network_uid_example".to_string(),
                  "app_key_example".to_string(),
                  Some("third_party_token_example".to_string()),
                  Some(789),
                  Some("device_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateCredential") => {
            let result = rt.block_on(client.update_credential(
                  3.16,
                  "network_uid_example".to_string(),
                  "third_party_id_example".to_string(),
                  "app_key_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some("third_party_name_example".to_string()),
                  Some("third_party_token_example".to_string()),
                  Some("response_filters_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("third_party_refresh_token_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateNetwork") => {
            let result = rt.block_on(client.update_network(
                  3.16,
                  789,
                  "network_uid_example".to_string(),
                  Some("name_example".to_string()),
                  Some("description_example".to_string()),
                  Some(true),
                  Some("introspection_method_example".to_string()),
                  Some("introspection_url_example".to_string()),
                  Some("introspection_params_example".to_string()),
                  Some("required_root_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some("oauth_token_url_example".to_string()),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some(swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))),
                  Some("oauth_client_id_example".to_string()),
                  Some("oauth_secret_key_example".to_string()),
                  Some("body_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTicketCount") => {
            let result = rt.block_on(client.get_ticket_count(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("ticket_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTicketList") => {
            let result = rt.block_on(client.get_ticket_list(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("ticket_object_type_example".to_string()),
                  Some("action_type_example".to_string()),
                  Some("ticket_ids_example".to_string()),
                  Some("object_ids_example".to_string()),
                  Some("receipt_tokens_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GiftPurchase") => {
            let result = rt.block_on(client.gift_purchase(
                  3.16,
                  789,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("custom_message_example".to_string()),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SaveTicket") => {
            let result = rt.block_on(client.save_ticket(
                  3.16,
                  "action_type_example".to_string(),
                  "ticket_object_type_example".to_string(),
                  Some(true),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some("purchase_code_example".to_string()),
                  Some("receipt_token_example".to_string()),
                  Some("receipt_data_example".to_string()),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some("purchase_provider_example".to_string()),
                  Some("purchase_type_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("app_version_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SaveTicketViaFileUpload") => {
            let result = rt.block_on(client.save_ticket_via_file_upload(
                  3.16,
                  "action_type_example".to_string(),
                  "ticket_object_type_example".to_string(),
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE")),
                  Some(true),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("game_type_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(789),
                  Some("purchase_code_example".to_string()),
                  Some("receipt_token_example".to_string()),
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some("purchase_provider_example".to_string()),
                  Some("purchase_type_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("app_version_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TicketOffers") => {
            let result = rt.block_on(client.ticket_offers(
                  3.16
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateTournament") => {
            let result = rt.block_on(client.create_tournament(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "title_example".to_string(),
                  56,
                  789,
                  Some("sub_type_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("cost_to_play_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("offer_ids_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(models::CreateTournamentSplitRewardParameter::Even),
                  Some(true),
                  Some("tournament_data_example".to_string()),
                  Some(models::CreateTournamentMissionTypeParameter::Tournament),
                  Some(models::CreateTournamentVisibilityParameter::Public),
                  Some(56),
                  Some("preliminary_group_advancements_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("winner_tag_example".to_string()),
                  Some("tie_tag_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteTournament") => {
            let result = rt.block_on(client.delete_tournament(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTournament") => {
            let result = rt.block_on(client.get_tournament(
                  3.16,
                  789,
                  Some(789),
                  Some("join_code_example".to_string()),
                  Some(models::GetTournamentIncludeScoresParameter::All),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchObjects") => {
            let result = rt.block_on(client.search_objects(
                  3.16,
                  789,
                  789,
                  Some(models::SearchObjectsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRounds") => {
            let result = rt.block_on(client.search_rounds(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("status_example".to_string()),
                  Some(models::SearchRoundsMissionTypeParameter::Tournament),
                  Some(true),
                  Some("visibilities_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTournaments") => {
            let result = rt.block_on(client.search_tournaments(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("keyword_example".to_string()),
                  Some("sub_type_example".to_string()),
                  Some(true),
                  Some("mission_types_example".to_string()),
                  Some(models::SearchTournamentsFilterParameter::All),
                  Some(models::SearchTournamentsSortFieldParameter::Active),
                  Some(true),
                  Some("visibility_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SubmitTournamentScore") => {
            let result = rt.block_on(client.submit_tournament_score(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789,
                  789,
                  789,
                  "scores_example".to_string(),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SubmitTournamentVote") => {
            let result = rt.block_on(client.submit_tournament_vote(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  789,
                  789,
                  Some("device_id_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SubstituteTournamentPlayer") => {
            let result = rt.block_on(client.substitute_tournament_player(
                  3.16,
                  789,
                  789,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTournament") => {
            let result = rt.block_on(client.update_tournament(
                  3.16,
                  789,
                  789,
                  Some("title_example".to_string()),
                  Some("sub_type_example".to_string()),
                  Some(789),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("cost_to_play_type_example".to_string()),
                  Some(56),
                  Some(56),
                  Some(56),
                  Some("description_example".to_string()),
                  Some("meta_data_example".to_string()),
                  Some(789),
                  Some("audience_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some("offer_ids_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(models::UpdateTournamentSplitRewardParameter::Even),
                  Some(true),
                  Some("tournament_data_example".to_string()),
                  Some(models::CreateMediaOfferVisibilityParameter::Public),
                  Some(56),
                  Some("preliminary_group_advancements_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("winner_tag_example".to_string()),
                  Some("tie_tag_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BatchSaveTracking") => {
            let result = rt.block_on(client.batch_save_tracking(
                  3.16,
                  "data_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some("default_tag_example".to_string()),
                  Some("slave_uid_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPredictedLocations") => {
            let result = rt.block_on(client.get_predicted_locations(
                  3.16,
                  789,
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some("hour_check_example".to_string()),
                  Some(789),
                  Some(models::GetOfferListCountsDistanceUnitParameter::Miles),
                  Some(1.2),
                  Some(models::GetPredictedLocationsSortOrderParameter::Matches)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPredictedPath") => {
            let result = rt.block_on(client.get_predicted_path(
                  3.16,
                  789,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPreferredLocations") => {
            let result = rt.block_on(client.get_preferred_locations(
                  3.16,
                  789,
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some("hour_check_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(models::GetOfferListCountsDistanceUnitParameter::Miles)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTrackingLegs") => {
            let result = rt.block_on(client.get_tracking_legs(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tracking_device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SaveTrackingLeg") => {
            let result = rt.block_on(client.save_tracking_leg(
                  3.16,
                  1.2,
                  1.2,
                  789,
                  1.2,
                  1.2,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(789),
                  Some("steps_example".to_string()),
                  Some("tags_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SaveTrackingStep") => {
            let result = rt.block_on(client.save_tracking_step(
                  3.16,
                  789,
                  1.2,
                  1.2,
                  789,
                  1.2,
                  1.2,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchAccountsWithTrackingLegs") => {
            let result = rt.block_on(client.search_accounts_with_tracking_legs(
                  3.16,
                  789,
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some("audience_ids_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some(1.2),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTrackingLegs") => {
            let result = rt.block_on(client.search_tracking_legs(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("tracking_device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("tags_example".to_string()),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateTrigger") => {
            let result = rt.block_on(client.create_trigger(
                  3.16,
                  789,
                  "name_example".to_string(),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some("conditional_input_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteTrigger") => {
            let result = rt.block_on(client.delete_trigger(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTrigger") => {
            let result = rt.block_on(client.get_trigger(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTriggers") => {
            let result = rt.block_on(client.search_triggers(
                  3.16,
                  789,
                  Some("grouping_id_example".to_string()),
                  Some("filter_example".to_string()),
                  Some("statuses_example".to_string()),
                  Some("template_types_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTrigger") => {
            let result = rt.block_on(client.update_trigger(
                  3.16,
                  789,
                  789,
                  Some("name_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some("grouping_id_example".to_string()),
                  Some("endpoint_url_example".to_string()),
                  Some("payload_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("cron_expression_example".to_string()),
                  Some("conditional_input_example".to_string()),
                  Some(models::AddAlbumCollectionVisibilityParameter::Public),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateTrip") => {
            let result = rt.block_on(client.create_trip(
                  3.16,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProcessTripMatches") => {
            let result = rt.block_on(client.process_trip_matches(
                  3.16,
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Search") => {
            let result = rt.block_on(client.search(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchTrips") => {
            let result = rt.block_on(client.search_trips(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTripNotifications") => {
            let result = rt.block_on(client.update_trip_notifications(
                  3.16,
                  789,
                  Some("notifications_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Delete") => {
            let result = rt.block_on(client.delete(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DriveTrip") => {
            let result = rt.block_on(client.drive_trip(
                  3.16,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FlexibleTrip") => {
            let result = rt.block_on(client.flexible_trip(
                  3.16,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTrip") => {
            let result = rt.block_on(client.get_trip(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetTripMatches") => {
            let result = rt.block_on(client.get_trip_matches(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(true),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("Ride") => {
            let result = rt.block_on(client.ride(
                  3.16,
                  789,
                  true
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateLocations") => {
            let result = rt.block_on(client.update_locations(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRecurrenceLocations") => {
            let result = rt.block_on(client.update_recurrence_locations(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateRecurrenceShipments") => {
            let result = rt.block_on(client.update_recurrence_shipments(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateShipments") => {
            let result = rt.block_on(client.update_shipments(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateTrip") => {
            let result = rt.block_on(client.update_trip(
                  3.16,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SmsBuyOffer") => {
            let result = rt.block_on(client.sms_buy_offer(
                  3.16,
                  "app_key_example".to_string(),
                  "body_example".to_string(),
                  "from_example".to_string(),
                  "currency_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AuthorizeTwitter") => {
            let result = rt.block_on(client.authorize_twitter(
                  3.16,
                  "app_key_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LoginTwitter") => {
            let result = rt.block_on(client.login_twitter(
                  3.16,
                  "access_token_example".to_string(),
                  "access_token_secret_example".to_string(),
                  "app_key_example".to_string(),
                  "response_filters_example".to_string(),
                  Some("device_id_example".to_string()),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AddUsersToPermissionable") => {
            let result = rt.block_on(client.add_users_to_permissionable(
                  3.16,
                  models::AddUsersToPermissionablePermissionableTypeParameter::Account,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some("connection_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some("audience_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ApprovePermissionable") => {
            let result = rt.block_on(client.approve_permissionable(
                  3.16,
                  models::AddUsersToPermissionablePermissionableTypeParameter::Account,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(models::ApprovePermissionableApprovalStatusParameter::Pending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LeaveFromPermissionable") => {
            let result = rt.block_on(client.leave_from_permissionable(
                  3.16,
                  "permissionable_type_example".to_string(),
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(1.2),
                  Some(1.2)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RemoveUsersFromPermissionable") => {
            let result = rt.block_on(client.remove_users_from_permissionable(
                  3.16,
                  models::AddUsersToPermissionablePermissionableTypeParameter::Account,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("connection_ids_example".to_string()),
                  Some("connection_account_ids_example".to_string()),
                  Some("connection_group_ids_example".to_string()),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some("audience_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPermissionables") => {
            let result = rt.block_on(client.search_permissionables(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("connection_account_ids_example".to_string()),
                  Some(models::AddUsersToPermissionablePermissionableTypeParameter::Account),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some("sort_field_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPermissionablesFollowingDistance") => {
            let result = rt.block_on(client.search_permissionables_following_distance(
                  3.16,
                  1.2,
                  1.2,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("connection_account_ids_example".to_string()),
                  Some(models::AddUsersToPermissionablePermissionableTypeParameter::Account),
                  Some(789),
                  Some(1.2),
                  Some("keyword_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateFollowing") => {
            let result = rt.block_on(client.create_following(
                  3.16,
                  789,
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateSpace") => {
            let result = rt.block_on(client.create_space(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateVatomEvent") => {
            let result = rt.block_on(client.create_vatom_event(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteFollowing") => {
            let result = rt.block_on(client.delete_following(
                  3.16,
                  789,
                  "vatom_rels_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeletePointsBalance") => {
            let result = rt.block_on(client.delete_points_balance(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteSpace") => {
            let result = rt.block_on(client.delete_space(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_space_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteVatomEvent") => {
            let result = rt.block_on(client.delete_vatom_event(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_event_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteVatomNft") => {
            let result = rt.block_on(client.delete_vatom_nft(
                  3.16,
                  789,
                  "vatom_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ExecuteActionOnNft") => {
            let result = rt.block_on(client.execute_action_on_nft(
                  3.16,
                  789,
                  "vatom_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GeomapSearch") => {
            let result = rt.block_on(client.geomap_search(
                  3.16,
                  789,
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBusinessBehaviors") => {
            let result = rt.block_on(client.get_business_behaviors(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBusinessCoinsBalance") => {
            let result = rt.block_on(client.get_business_coins_balance(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBusinessIds") => {
            let result = rt.block_on(client.get_business_ids(
                  3.16,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBusinessInfo") => {
            let result = rt.block_on(client.get_business_info(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetBusinessUsers") => {
            let result = rt.block_on(client.get_business_users(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignGroupEntities") => {
            let result = rt.block_on(client.get_campaign_group_entities(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignGroupRules") => {
            let result = rt.block_on(client.get_campaign_group_rules(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignGroupStats") => {
            let result = rt.block_on(client.get_campaign_group_stats(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignInfo") => {
            let result = rt.block_on(client.get_campaign_info(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetEventGuestList") => {
            let result = rt.block_on(client.get_event_guest_list(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_event_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetInventory") => {
            let result = rt.block_on(client.get_inventory(
                  3.16,
                  789,
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetMyFollowing") => {
            let result = rt.block_on(client.get_my_following(
                  3.16,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPointsBalance") => {
            let result = rt.block_on(client.get_points_balance(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPointsBalanceAsBusiness") => {
            let result = rt.block_on(client.get_points_balance_as_business(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_user_id_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSpace") => {
            let result = rt.block_on(client.get_space(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_space_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserCoinsAsBusiness") => {
            let result = rt.block_on(client.get_user_coins_as_business(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserCoinsBalance") => {
            let result = rt.block_on(client.get_user_coins_balance(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserFollowers") => {
            let result = rt.block_on(client.get_user_followers(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserFollowing") => {
            let result = rt.block_on(client.get_user_following(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserInfo") => {
            let result = rt.block_on(client.get_user_info(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetUserProfile") => {
            let result = rt.block_on(client.get_user_profile(
                  3.16,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVatomEvent") => {
            let result = rt.block_on(client.get_vatom_event(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_event_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVatomNft") => {
            let result = rt.block_on(client.get_vatom_nft(
                  3.16,
                  789,
                  "vatom_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListCommunities") => {
            let result = rt.block_on(client.list_communities(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListEvents") => {
            let result = rt.block_on(client.list_events(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListSpaces") => {
            let result = rt.block_on(client.list_spaces(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListUserCoinTransactions") => {
            let result = rt.block_on(client.list_user_coin_transactions(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ListUserCoinTransactionsAsBusiness") => {
            let result = rt.block_on(client.list_user_coin_transactions_as_business(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "app_key_example".to_string(),
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PerformActionOnNft") => {
            let result = rt.block_on(client.perform_action_on_nft(
                  3.16,
                  789,
                  "vatom_id_example".to_string(),
                  "vatom_action_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RedeemNft") => {
            let result = rt.block_on(client.redeem_nft(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RedeemUserCoinsAsBusiness") => {
            let result = rt.block_on(client.redeem_user_coins_as_business(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchBusinesses") => {
            let result = rt.block_on(client.search_businesses(
                  3.16,
                  789,
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchCampaignGroups") => {
            let result = rt.block_on(client.search_campaign_groups(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchIdentities") => {
            let result = rt.block_on(client.search_identities(
                  3.16,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchInventory") => {
            let result = rt.block_on(client.search_inventory(
                  3.16,
                  789,
                  Some("vatom_parameters_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SendNft") => {
            let result = rt.block_on(client.send_nft(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SetPointsBalanceAsBusiness") => {
            let result = rt.block_on(client.set_points_balance_as_business(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_user_id_example".to_string(),
                  "vatom_campaign_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TransferUserCoins") => {
            let result = rt.block_on(client.transfer_user_coins(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateBusinessCoins") => {
            let result = rt.block_on(client.update_business_coins(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateEventGuestList") => {
            let result = rt.block_on(client.update_event_guest_list(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_event_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateSpace") => {
            let result = rt.block_on(client.update_space(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_space_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUserCoinsAsBusiness") => {
            let result = rt.block_on(client.update_user_coins_as_business(
                  3.16,
                  789,
                  "vatom_user_id_example".to_string(),
                  "app_key_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateUserProfile") => {
            let result = rt.block_on(client.update_user_profile(
                  3.16,
                  789,
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateVatomEvent") => {
            let result = rt.block_on(client.update_vatom_event(
                  3.16,
                  789,
                  "app_key_example".to_string(),
                  "vatom_event_id_example".to_string(),
                  "vatom_parameters_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateVehicle") => {
            let result = rt.block_on(client.create_vehicle(
                  3.16,
                  "vehicle_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchVehicle") => {
            let result = rt.block_on(client.search_vehicle(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteVehicle") => {
            let result = rt.block_on(client.delete_vehicle(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVehicle") => {
            let result = rt.block_on(client.get_vehicle(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateVehicle") => {
            let result = rt.block_on(client.update_vehicle(
                  3.16,
                  789,
                  "vehicle_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateVehicleType") => {
            let result = rt.block_on(client.create_vehicle_type(
                  3.16,
                  "vehicle_type_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchVehicleTypes") => {
            let result = rt.block_on(client.search_vehicle_types(
                  3.16,
                  "sort_field_example".to_string(),
                  true,
                  56,
                  56,
                  true,
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteVehicleType") => {
            let result = rt.block_on(client.delete_vehicle_type(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetVehicleType") => {
            let result = rt.block_on(client.get_vehicle_type(
                  3.16,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateVehicleType") => {
            let result = rt.block_on(client.update_vehicle_type(
                  3.16,
                  789,
                  "vehicle_type_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateOfferTransaction") => {
            let result = rt.block_on(client.create_offer_transaction(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("offer_cart_example".to_string()),
                  Some("promo_code_example".to_string()),
                  Some("currency_type_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string()),
                  Some("app_key_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOfferTransaction") => {
            let result = rt.block_on(client.delete_offer_transaction(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferTransaction") => {
            let result = rt.block_on(client.get_offer_transaction(
                  3.16,
                  789,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(1.2),
                  Some(1.2),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PreviewOfferTransaction") => {
            let result = rt.block_on(client.preview_offer_transaction(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some("offer_cart_example".to_string()),
                  Some("promo_code_example".to_string()),
                  Some("currency_type_example".to_string()),
                  Some(true),
                  Some("meta_data_example".to_string()),
                  Some("app_key_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchOfferTransactions") => {
            let result = rt.block_on(client.search_offer_transactions(
                  3.16,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some("keyword_example".to_string()),
                  Some(789),
                  Some("retailer_ids_example".to_string()),
                  Some(789),
                  Some("retailer_location_ids_example".to_string()),
                  Some("exclude_retailer_location_ids_example".to_string()),
                  Some(789),
                  Some("offer_ids_example".to_string()),
                  Some(789),
                  Some("offer_location_ids_example".to_string()),
                  Some(models::CreateOfferOfferTypeParameter::Voucher),
                  Some("offer_types_example".to_string()),
                  Some("special_offer_type_example".to_string()),
                  Some("special_offer_types_example".to_string()),
                  Some("category_ids_example".to_string()),
                  Some("filter_ids_example".to_string()),
                  Some("offer_audience_ids_example".to_string()),
                  Some(models::SearchOfferTransactionsSortFieldParameter::Id),
                  Some(true),
                  Some(56),
                  Some(56),
                  Some(1.2),
                  Some(1.2),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(true),
                  Some("statuses_example".to_string()),
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(789),
                  Some(789),
                  Some(789),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateOfferTransaction") => {
            let result = rt.block_on(client.update_offer_transaction(
                  3.16,
                  789,
                  56,
                  Some("device_id_example".to_string()),
                  Some(789),
                  Some(789),
                  Some("currency_type_example".to_string()),
                  Some(true),
                  Some("app_key_example".to_string()),
                  Some(1.2),
                  Some(1.2),
                  Some("meta_data_example".to_string()),
                  Some(true),
                  Some("exception_membership_offer_ids_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchWeather") => {
            let result = rt.block_on(client.search_weather(
                  3.16,
                  Some(789),
                  Some(1.2),
                  Some(1.2),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CreateWord") => {
            let result = rt.block_on(client.create_word(
                  3.16,
                  789,
                  "word_example".to_string(),
                  "definition_example".to_string(),
                  true,
                  true,
                  789,
                  Some(789),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteWord") => {
            let result = rt.block_on(client.delete_word(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetWord") => {
            let result = rt.block_on(client.get_word(
                  3.16,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetWords") => {
            let result = rt.block_on(client.get_words(
                  3.16,
                  789,
                  "sort_field_example".to_string(),
                  true,
                  true,
                  56,
                  56,
                  Some("keyword_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UpdateWord") => {
            let result = rt.block_on(client.update_word(
                  3.16,
                  789,
                  789,
                  789,
                  Some("word_text_example".to_string()),
                  Some("definition_example".to_string()),
                  Some(789),
                  Some(true),
                  Some(true),
                  Some("ticket_type_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RunWorkflow") => {
            let result = rt.block_on(client.run_workflow(
                  3.16,
                  789,
                  789,
                  Some(789),
                  Some(56),
                  Some("parameters_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
