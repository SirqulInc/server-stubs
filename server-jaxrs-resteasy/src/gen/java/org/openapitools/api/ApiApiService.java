package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Account;
import org.openapitools.model.AccountListResponse;
import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AccountResponse;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.ActivityResponse;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import org.openapitools.model.AppResponse;
import org.openapitools.model.ApplicationConfigResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetListResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.BidResponse;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.CargoType;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
import org.openapitools.model.CellCarrierResponse;
import org.openapitools.model.ChartData;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.CoordsResponse;
import org.openapitools.model.CountResponse;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.CsvImportResponse;
import org.openapitools.model.Direction;
import org.openapitools.model.DisbursementResponse;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.EntityReference;
import org.openapitools.model.EventAttendanceResponse;
import java.io.File;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.GameResponse;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.ImportStatuses;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.LeaderboardResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.LikableResponse;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.Location;
import org.openapitools.model.LocationSearchResponse;
import java.util.Map;
import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
import org.openapitools.model.ObjectStoreResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.OfferTransactionStatusResponse;
import org.openapitools.model.OrderResponse;
import org.openapitools.model.Orders;
import org.openapitools.model.OrsonAiAddMovieResponse;
import org.openapitools.model.OrsonAiBatchResponse;
import org.openapitools.model.OrsonAiEmotionsResponse;
import org.openapitools.model.OrsonAiProtoResponse;
import org.openapitools.model.OrsonAiSTTResponse;
import org.openapitools.model.OrsonAiTTSResponse;
import org.openapitools.model.OrsonAiTechTuneResponse;
import org.openapitools.model.OrsonAiTopicsResponse;
import org.openapitools.model.OrsonAiVoiceCanvasResponse;
import org.openapitools.model.OrsonEpisodeResponse;
import org.openapitools.model.OrsonRenderResponse;
import org.openapitools.model.PackResponse;
import org.openapitools.model.PathingResponse;
import org.openapitools.model.PaymentRequest;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.Program;
import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.QueueResponse;
import org.openapitools.model.RankFullResponse;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.RegionResponse;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.ReservationResponse;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.RetailerResponse;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.RoutingListResponse;
import org.openapitools.model.ScheduledNotificationFullResponse;
import org.openapitools.model.ScoreResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;
import org.openapitools.model.ShipmentOrder;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;
import org.openapitools.model.Stop;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;
import org.openapitools.model.TaskResponse;
import org.openapitools.model.TerritoryResponse;
import org.openapitools.model.ThemeDescriptorResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;
import org.openapitools.model.TimeSlotResponse;
import org.openapitools.model.TokenResponse;
import org.openapitools.model.TournamentResponse;
import org.openapitools.model.TriggerResponse;
import org.openapitools.model.TrilatCacheRequest;
import org.openapitools.model.Trip;
import org.openapitools.model.TwiMLResponse;
import org.openapitools.model.UserActivityResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserPermissionsResponse;
import org.openapitools.model.UserSettingsResponse;
import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;
import org.openapitools.model.WeatherResponse;
import org.openapitools.model.WordzWordResponse;
import org.openapitools.model.WrappedProxyItemResponse;
import org.openapitools.model.WrappedResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ApiApiService {
      Response acceptInvite(BigDecimal version,String token,Long accountId,Long albumId,Long missionId,Long albumContestId,Long offerId,Long offerLocationId,Long retailerLocationId,String appKey,Boolean autoFriend,Boolean autoAttendEvent,Boolean autoFavoriteOffer,Boolean autoFavoriteOfferLocation,Boolean autoFavoriteRetailerLocation,SecurityContext securityContext)
      throws NotFoundException;
      Response accountLocationSearch(BigDecimal version,String deviceId,Long accountId,String q,String keyword,String postalCode,Double latitude,Double longitude,String appKey,Double range,Long locationLastUpdated,String gender,Integer minAge,Integer maxAge,Integer companionshipIndex,Integer i,Integer start,Integer l,Integer limit,String searchMode,String sortField,Boolean descending,String roles,String tags,String experience,String categoryIds,String audienceIds,String audienceOperator,Boolean updateCurrentLocation,Boolean updatePreferredSettings,Boolean showExactLocations,Boolean showConnectionToSearcher,Long flagCountMinimum,Boolean verifiedUserOnly,Boolean contentAdminOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response activities(BigDecimal version,Integer start,Integer limit,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response addAlbumCollection(BigDecimal version,String title,Boolean coverAssetNullable,Boolean includeCoverInAssetList,Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,Boolean anonymous,String deviceId,Long accountId,String assetsToAdd,File media,String mediaURL,Long assetId,File attachedMedia,String attachedMediaURL,Long startDate,Long endDate,String tags,String description,String albumType,Long albumTypeId,String subType,Double latitude,Double longitude,String locationDescription,String visibility,String gameType,String appKey,String cellPhone,String streetAddress,String streetAddress2,String city,String state,String postalCode,String fullAddress,String metaData,String categoryIds,String categoryFilterIds,String audienceIds,Boolean includeAllAppUsersAsMembers,Boolean includeAudiencesAsMembers,String audienceOperator,String approvalStatus,String linkedObjectType,Long linkedObjectId,SecurityContext securityContext)
      throws NotFoundException;
      Response addAlbumUsers(BigDecimal version,Long albumId,Boolean includeFriendGroup,String deviceId,Long accountId,Boolean read,Boolean write,Boolean delete,Boolean add,String connections,String connectionGroups,SecurityContext securityContext)
      throws NotFoundException;
      Response addConnectionToGroup(BigDecimal version,Boolean returnNulls,Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addConnectionsToGroup(BigDecimal version,Long connectionGroupId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addFavorite(BigDecimal version,Long favoritableId,String favoritableType,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addField(BigDecimal version,Long accountId,String appKey,String objectName,String fieldName,String fieldType,SecurityContext securityContext)
      throws NotFoundException;
      Response addMovie(BigDecimal version,Long accountId,String movieName,String thirdPartyAccountId,String tags,File _file,String url,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response addOrUpdateAlbumContest(BigDecimal version,Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,String visibility,Boolean includeFriendGroup,String deviceId,Long accountId,String gameType,String appKey,String contestType,Long albumContestId,String title,String description,Long albumId1,Boolean removeAlbum1,Long albumId2,Boolean removeAlbum2,Long startDate,Long endDate,String locationDescription,String connectionIdsToAdd,String connectionGroupIdsToAdd,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addOrUpdateThemeDescriptor(BigDecimal version,Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,String visibility,Boolean includeFriendGroup,Boolean completeWithDefaultValues,String deviceId,Long accountId,String gameType,Long themeDescriptorId,String title,String description,String connectionIdsToAdd,String connectionGroupIdsToAdd,String appVersion,String colorValueJson,String stringReplacerJson,String customJsonObjects,File iconImage,File sceneAtlasImage,File bgImage,File bgSound,String musicSelection,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addPaymentMethod(BigDecimal version,Long accountId,Long paymentMethodId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,Boolean defaultPaymentMethod,String paymentMethodNickname,String taxId,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response addPreview(BigDecimal version,Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response addSubGroups(BigDecimal version,Boolean returnNulls,Long groupId,String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response addUsersToPermissionable(BigDecimal version,String permissionableType,Long permissionableId,String deviceId,Long accountId,Boolean read,Boolean write,Boolean delete,Boolean add,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean pending,Boolean admin,Boolean includeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext)
      throws NotFoundException;
      Response adsFind(BigDecimal version,String appKey,Boolean randomize,Boolean targetedAdsOnly,String type,Long accountId,String appVersion,Double latitude,Double longitude,String device,Long deviceIdentifier,String deviceVersion,Integer start,Integer limit,Boolean includeAudiences,Boolean allocatesTickets,String missionIds,SecurityContext securityContext)
      throws NotFoundException;
      Response aggregatedFilteredUsage(BigDecimal version,String deviceId,Long accountId,Long applicationId,String appKey,Long startDate,Long endDate,String deviceType,String device,String deviceOS,String gender,String ageGroup,String country,String state,String city,String zip,String model,String tag,Long userAccountId,String userAccountDisplay,String userAccountUsername,String groupByRoot,String groupBy,String distinctCount,String sortField,Boolean descending,Boolean hideUnknown,String responseFormat,Integer l,Integer limit,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response aiDocs(BigDecimal version,Long accountId,String doc,Boolean returnTopics,Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response aiFindImages(BigDecimal version,Long accountId,String text,String parseFlag,String fetchFlag,String size,SecurityContext securityContext)
      throws NotFoundException;
      Response aiTags(BigDecimal version,Long accountId,String tags,String conditional,Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response aiText(BigDecimal version,Long accountId,String terms,String conditional,Integer limit,Integer offset,SecurityContext securityContext)
      throws NotFoundException;
      Response albumContestInvite(BigDecimal version,String deviceId,Long accountId,Long appId,String appKey,Long albumContestId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response albumInvite(BigDecimal version,String deviceId,Long accountId,Long appId,String appKey,Long albumId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response apiVersionAchievementTierSearchPost(BigDecimal version,String deviceId,Long accountId,String appKey,String keyword,Long achievementType,String rankType,String sortField,Boolean descending,Boolean descendingGoal,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response approveAlbum(BigDecimal version,Long albumId,String deviceId,Long accountId,String approvalStatus,Boolean verified,SecurityContext securityContext)
      throws NotFoundException;
      Response approveAlbumContest(BigDecimal version,Long albumContestId,String approvalStatus,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response approvePermissionable(BigDecimal version,String permissionableType,Long permissionableId,String deviceId,Long accountId,String approvalStatus,SecurityContext securityContext)
      throws NotFoundException;
      Response approveRoute(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response assetDownload(BigDecimal version,String filename,SecurityContext securityContext)
      throws NotFoundException;
      Response assetMorph(BigDecimal version,Long offerId,String adSize,Long creativeId,Integer width,Integer height,String backgroundSize,String template,SecurityContext securityContext)
      throws NotFoundException;
      Response assigmentAssigneeAccountSearch(BigDecimal version,Long accountId,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response assignEmployee(BigDecimal version,Long accountId,Long managerAccountId,Long employeeAccountId,String role,SecurityContext securityContext)
      throws NotFoundException;
      Response assignToLocationEmployee(BigDecimal version,Long accountId,Long retailerLocationId,Long employeeAccountId,Boolean assign,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentCreate(BigDecimal version,Long accountId,String name,Long assigneeAccountId,String description,Long retailerLocationId,String tags,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentDelete(BigDecimal version,Long accountId,Long assignmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentGet(BigDecimal version,Long accountId,Long assignmentId,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentSearch(BigDecimal version,Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,Long creatorAccountId,String assigneeAccountIds,String retailerLocationIds,String currentStatusType,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentStatusCreate(BigDecimal version,Long accountId,Long assignmentId,Long scheduledNotificationId,String toDo,String connection,String method,String status,String closure,String message,Long followUp,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentStatusDelete(BigDecimal version,Long accountId,Long assignmentStatusId,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentStatusGet(BigDecimal version,Long accountId,Long assignmentStatusId,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentStatusSearch(BigDecimal version,Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,Long assignmentId,Long creatorAccountId,Long assigneeAccountId,Long retailerLocationId,String statusType,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentStatusUpdate(BigDecimal version,Long accountId,Long assignmentStatusId,Long scheduledNotificationId,String toDo,String connection,String method,String status,String closure,String message,Long followUp,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response assignmentUpdate(BigDecimal version,Long accountId,Long assignmentId,String name,String description,Long assigneeAccountId,Long retailerLocationId,String tags,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response attendEvent(BigDecimal version,String deviceId,Long accountId,String appKey,Long listingId,Long retailerLocationId,Long offerLocationId,Long transactionId,Integer status,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response authorizeTwitter(BigDecimal version,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response batch(BigDecimal version,Long accountId,String thirdPartyAccountId,Integer limit,String operations,File _file,String url,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response batchOperation(BigDecimal version,Long notableId,String notableType,String deviceId,Long accountId,String batchOperation,SecurityContext securityContext)
      throws NotFoundException;
      Response batchSaveTracking(BigDecimal version,String data,String deviceId,Long accountId,Boolean generateAccounts,Boolean updateAccountLocations,String defaultTag,String slaveUID,SecurityContext securityContext)
      throws NotFoundException;
      Response batchUpdateOfferLocations(BigDecimal version,String data,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response blockAccount(BigDecimal version,Long accountIdBeingBlocked,String deviceId,Long accountId,Boolean blockFlagValue,Boolean removeFromGroupsIfBlocked,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response cacheTrilaterationData(BigDecimal version,String udid,Long sourceTime,Integer minimumSampleSize,String data,File dataFile,SecurityContext securityContext)
      throws NotFoundException;
      Response cacheTrilaterationDataGzip(BigDecimal version,TrilatCacheRequest body,SecurityContext securityContext)
      throws NotFoundException;
      Response cancelShipment(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response categoryDistanceSearch(BigDecimal version,Long accountId,String keyword,String appKey,String categoryIds,String parentCategoryIds,Boolean rootOnly,String sortField,String responseGroup,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnExternal,Boolean exactMatch,String type,String externalType,Integer minOfferCount,Double latitude,Double longitude,Double range,SecurityContext securityContext)
      throws NotFoundException;
      Response checkDisbursements(BigDecimal version,Long disbursementId,SecurityContext securityContext)
      throws NotFoundException;
      Response computePath(BigDecimal version,String data,String units,Boolean reducePath,Boolean directions,SecurityContext securityContext)
      throws NotFoundException;
      Response computeRouting(BigDecimal version,String data,SecurityContext securityContext)
      throws NotFoundException;
      Response consumerCreate(BigDecimal version,String appKey,String name,String hostname,String username,String password,String dataMapping,String deviceId,Long accountId,Integer port,String virtualHost,String exchanger,String exchangerType,Integer workers,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response consumerUpdate(BigDecimal version,String appKey,Long queueId,String dataMapping,String deviceId,Long accountId,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response copyRoute(BigDecimal version,Long routeId,Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response create(BigDecimal version,Long accountId,Account body,SecurityContext securityContext)
      throws NotFoundException;
      Response createAccount(BigDecimal version,String username,String password,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String deviceId,String deviceIdType,String emailAddress,Long assetId,String streetAddress,String zipcode,String gender,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String role,String platforms,String tags,String aboutUs,String gameExperience,String categoryIds,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,Double latitude,Double longitude,Boolean acceptedTerms,String inviteToken,Long referralAccountId,Boolean sendValidation,String gameType,String appKey,String appVersion,String responseType,String audienceIdsToAdd,String appBlob,Boolean appEnablePush,Boolean appEnableSMS,Boolean appEnableEmail,String locationVisibility,Double homeLatitude,Double homeLongitude,String appNickname,Long personalAudienceId,SecurityContext securityContext)
      throws NotFoundException;
      Response createAchievement(BigDecimal version,String appKey,String title,String deviceId,Long accountId,String analyticsTag,String description,String rankType,Integer rankIncrement,Integer minIncrement,Integer maxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext)
      throws NotFoundException;
      Response createAchievementTier(BigDecimal version,Long achievementId,Boolean scoreAllInstances,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Integer gameObjectId,SecurityContext securityContext)
      throws NotFoundException;
      Response createApplication(BigDecimal version,String appName,String deviceId,Long accountId,String about,String bundleId,Long appIconAssetId,Long appLogoAssetId,String facebookAppId,String facebookAppSecret,String googleApiKey,Boolean updateEULADate,String eulaVersion,String landingPageUrl,Boolean showInActivities,String activityDescription,String inviteWelcomeText,String invitePageUrl,String urlScheme,String platforms,String downloadUrls,String categoryIds,String scoringType,Integer hintCost,Integer maxScore,Float ticketsPerPoint,Boolean hasGameData,Boolean publicNotifications,Boolean useMatchingAlgorithm,Boolean globalTickets,Float buildVersion,Float apiVersion,String placementName,String placementDescription,String placementSize,Integer placementHeight,Integer placementWidth,Integer placementRefreshInterval,Boolean createObjectStore,Boolean publicContentApproval,Boolean productionMode,Integer minimumSessionLength,Integer sessionGapLength,Boolean localAdsEnabled,String sqootApiKey,String trilatProcessingType,Integer maxSampleSize,Double minRSSI,String modules,Integer authorizedCount,String authorizedServers,String defaultTimezone,String smtpPass,String metaData,String placementMetaData,Boolean ipsFloor,Boolean enableAPNSBadge,Boolean includeInReport,Long defaultAppFilterId,Boolean enableWelcomeEmail,String appleAppId,String appleTeamId,String appleAuthKeyId,File appleAuthKey,String appleIssuerId,String appStoreKeyId,File appStoreKey,File googlePrivateKeyFile,String authorizeNetApiKey,String authorizeNetTransactionKey,String emailSender,String smtpUser,String smtpHost,String vatomBusinessId,String vatomRestClientId,String vatomRestSecretKey,String twilioAccountSID,String twilioAuthToken,String twilioSenderPhoneNumber,String openAISecretKey,SecurityContext securityContext)
      throws NotFoundException;
      Response createApplicationConfig(BigDecimal version,Long accountId,String appKey,String configVersion,Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;
      Response createApplicationPlacement(BigDecimal version,String appKey,String size,String deviceId,Long accountId,String name,String description,Integer height,Integer width,Integer refreshInterval,Long defaultImageId,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createAsset(BigDecimal version,Boolean returnNulls,String deviceId,Long accountId,Long albumId,Long collectionId,String addToDefaultAlbum,Boolean addToMediaLibrary,Integer versionCode,String versionName,String metaData,String caption,String assetType,String approvalStatus,Long assignedAccountId,File media,String mediaUrl,String mediaString,String mediaStringFileName,String mediaStringContentType,Integer mediaHeight,Integer mediaWidth,File attachedMedia,String attachedMediaUrl,String attachedMediaString,String attachedMediaStringFileName,String attachedMediaStringContentType,Integer attachedMediaHeight,Integer attachedMediaWidth,String locationDescription,String app,String appKey,String searchTags,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createAudience(BigDecimal version,Long accountId,String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Integer startTimeOffset,Integer endTimeOffset,Boolean sendSuggestion,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext)
      throws NotFoundException;
      Response createBatch(BigDecimal version,Long accountId,String status,Integer previewLimit,String appKey,String endpoint,String parameters,String name,Long startDate,Long endDate,String description,String pageUrl,SecurityContext securityContext)
      throws NotFoundException;
      Response createBid(BigDecimal version,String biddableType,Long biddableId,Double amountPerView,Double amountPerAction,Double budgetAmount,String budgetSchedule,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response createBillableEntity(BigDecimal version,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext)
      throws NotFoundException;
      Response createCargoType(BigDecimal version,CargoType body,SecurityContext securityContext)
      throws NotFoundException;
      Response createCategory(BigDecimal version,Long accountId,String name,String appKey,Long parentCategoryId,String description,String type,Long assetId,String externalId,String externalType,String externalCategorySlug,String sqootSlug,Boolean active,String metaData,String searchTags,SecurityContext securityContext)
      throws NotFoundException;
      Response createCreative(BigDecimal version,Long accountId,String name,Boolean active,Boolean waitForAsset,String description,Long assetImageId,String action,String data,String suffix,String type,Double balance,Long referenceId,String appVersion,Long missionId,Long offerId,SecurityContext securityContext)
      throws NotFoundException;
      Response createCredential(BigDecimal version,String thirdPartyId,String thirdPartyToken,String networkUID,String appKey,Long accountId,String deviceId,String sessionId,String thirdPartyName,String emailAddress,Boolean signinOnlyMode,String responseFilters,Double latitude,Double longitude,String metaData,String thirdPartyRefreshToken,String audienceIdsToAdd,String audienceIdsToRemove,SecurityContext securityContext)
      throws NotFoundException;
      Response createData(BigDecimal version,String objectName,Long accountId,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response createDisbursement(BigDecimal version,Long accountId,Long receiverAccountId,Long originalSenderAccountId,BigDecimal amount,String provider,Long scheduledDate,String title,String comment,String externalId,String introspectionParams,SecurityContext securityContext)
      throws NotFoundException;
      Response createEmployee(BigDecimal version,Long accountId,Long managerAccountId,String username,String password,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String aboutUs,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext)
      throws NotFoundException;
      Response createEntityReference(BigDecimal version,EntityReference body,SecurityContext securityContext)
      throws NotFoundException;
      Response createEvent(BigDecimal version,Long accountId,String title,String retailerLocationIds,String subTitle,String details,String categoryIds,String filterIds,Boolean active,Long imageAssetId,Long redeemableStart,Long redeemableEnd,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createFilter(BigDecimal version,Long accountId,String name,String appKey,Long parentFilterId,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createFlag(BigDecimal version,String flagableType,Long flagableId,String deviceId,Long accountId,String flagDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createFollowing(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createGame(BigDecimal version,Long accountId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response createGameLevel(BigDecimal version,Long accountId,String name,String gameData,String gameDataSuffix,String appKey,String description,String difficulty,String appVersion,Long assetImageId,Long assetIconId,String visibility,Boolean friendGroup,String connectionIds,String connectionGroupIds,Double balance,Boolean active,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String tutorialTitle,String tutorialMessage,String tutorialAlignment,Long tutorialImageAssetId,Long offerId,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createInstantEpisode(BigDecimal version,Long accountId,String data,SecurityContext securityContext)
      throws NotFoundException;
      Response createLeaderboard(BigDecimal version,Long accountId,String appKey,String rankType,String leaderboardMode,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,String sortField,String title,String description,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createListing(BigDecimal version,Long accountId,String name,String filterIds,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createLocationV2(BigDecimal version,Location body,SecurityContext securityContext)
      throws NotFoundException;
      Response createMedia(BigDecimal version,Long accountId,String title,String barcodeType,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,Long ticketPrice,Double fullPrice,Double discountPrice,String specialOfferType,String offerVisibility,Boolean active,String retailerLocationIds,String subTitle,String details,String subDetails,String finePrint,String barcodeEntry,String externalRedeemOptions,String externalUrl,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,String ticketPriceType,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String categoryIds,String filterIds,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String conditionType,String isbn,String asin,String catalogNumbers,String parentalRating,Long availabilityDate,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response createMission(BigDecimal version,Long accountId,String title,String description,String subType,Long startDate,Long endDate,Boolean active,String gameLevelIds,String creativeIds,String audienceIds,String missionTask,String formatType,Long offerId,Double balance,Boolean advancedReporting,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String metaData,String applicationIds,String devices,String deviceIds,String deviceVersions,String locations,String radius,SecurityContext securityContext)
      throws NotFoundException;
      Response createMissionInvite(BigDecimal version,String deviceId,Long accountId,Long missionId,String joinCode,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response createNetwork(BigDecimal version,Long accountId,String name,Boolean enableIntrospection,String description,String introspectionMethod,String introspectionURL,String introspectionParams,String requiredRootField,Boolean enableMFA,Integer sizeMFA,Integer shelfLifeMFA,String oauthTokenURL,File oauthPrivateKey,File oauthPublicKey,String oauthClientId,String oauthSecretKey,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response createNote(BigDecimal version,String comment,String deviceId,Long accountId,String notableType,Long notableId,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,String receiverAccountIds,Boolean returnFullResponse,Boolean initializeAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,BigDecimal assetLongitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createNotificationTemplate(BigDecimal version,Long accountId,String conduit,String title,String body,String appKey,String event,String tags,SecurityContext securityContext)
      throws NotFoundException;
      Response createObject(BigDecimal version,Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response createOffer(BigDecimal version,Boolean includeOfferLocations,String title,String barcodeType,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,Long ticketPrice,Double fullPrice,Double discountPrice,String offerType,String specialOfferType,String offerVisibility,Boolean active,String deviceId,Long accountId,String tags,Long parentOfferId,String retailerLocationIds,String offerLocations,String subTitle,String details,String subDetails,String finePrint,String barcodeEntry,String externalRedeemOptions,String externalUrl,String externalId,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,String ticketPriceType,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String categoryIds,String filterIds,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String brand,String productType,String conditionType,String isbn,String asin,String catalogNumbers,String department,String features,Double minimumPrice,Double width,Double height,Double depth,Double weight,String unit,String studio,String parentalRating,Long publishDate,Long availabilityDate,Long sizeId,Long listingId,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,Integer rebootTimeHour,Integer rebootTimeMinute,Integer idleTimeoutInSecond,String serialNumber,String udid,String deviceType,Double devicePower,Double deviceInterference,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response createOfferTransaction(BigDecimal version,String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,Integer status,SecurityContext securityContext)
      throws NotFoundException;
      Response createOfferTransactionStatus(BigDecimal version,String name,Integer code,String deviceId,Long accountId,Double latitude,Double longitude,String description,String role,Boolean active,String applicationIds,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrUpdateBlockedNotifications(BigDecimal version,String appKey,String data,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrUpdateConnection(BigDecimal version,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Long groupId,String gameType,String appKey,Boolean isTrusted,Boolean ignoreFriendRequest,Boolean isContact,Boolean isBlocked,Boolean isFollowing,Boolean connectionResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrUpdateGroup(BigDecimal version,Boolean returnNulls,String deviceId,Long accountId,String name,Long groupId,Long assetId,String connections,String description,Boolean canViewProfileInfo,Boolean canViewGameInfo,Boolean canViewFriendInfo,Boolean active,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createOrder(BigDecimal version,String appKey,String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext)
      throws NotFoundException;
      Response createPack(BigDecimal version,Long accountId,String title,Long packOrder,Integer price,Boolean highest,Boolean allocateTickets,Long ticketCount,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,String priceType,String gameLevelIds,Boolean inGame,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response createPaymentMethod(BigDecimal version,Long accountId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,String paymentMethodNickname,String taxId,Boolean defaultPaymentMethod,String authToken,String provider,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response createPersona(BigDecimal version,Long accountId,String title,String previewAccounts,Long date,Integer age,String gender,String gameExperienceLevel,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createPostalCode(BigDecimal version,Long accountId,String code,Double latitude,Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createProgram(BigDecimal version,Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response createPurchaseItem(BigDecimal version,String appKey,String name,String purchaseType,String deviceId,Long accountId,String description,Integer tickets,Float price,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response createQuestion(BigDecimal version,Long accountId,String question,String answers,Boolean active,Boolean allocateTickets,Long ticketCount,String tags,String videoURL,Long assetId,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response createRating(BigDecimal version,String ratableType,Long ratableId,Integer ratingValue,String deviceId,Long accountId,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createRegion(BigDecimal version,Long accountId,String regionClass,String shortName,String fullName,String parentIds,String childrenIds,String postalCodeIds,String locations,Long retailerLocationId,String visibility,String categoryIds,String filterIds,Long start,Long end,String polygon,String metaData,Double latitude,Double longitude,Integer versionCode,Boolean root,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createRegionLegSummaryBatch(BigDecimal version,List<@Valid RegionLegSummary> body,SecurityContext securityContext)
      throws NotFoundException;
      Response createReservation(BigDecimal version,String deviceId,Long accountId,Long startDate,Long endDate,Long offerId,Long offerLocationId,String appKey,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response createRetailer(BigDecimal version,String name,String deviceId,Long accountId,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String facebookUrl,String twitterUrl,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String categoryIdsToAdd,String categoryIdsToRemove,String filterIds,Double latitude,Double longitude,String metaData,String searchTags,String retailerType,String visibility,Boolean createDefaultLocation,String responseFormat,SecurityContext securityContext)
      throws NotFoundException;
      Response createRetailerLocationConsumer(BigDecimal version,String appKey,String name,String deviceId,Long accountId,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String detailsHeader,String detailsBody,String hours,String tags,Long logoAssetId,Long picture1AssetId,Long picture2AssetId,String categoryIds,String filterIds,String metaData,Boolean publicLocation,Boolean active,String locationType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response createRetailerLocations(BigDecimal version,Long retailerId,String name,String streetAddress,String city,String state,String postalCode,String deviceId,Long accountId,String streetAddress2,String country,String businessPhone,String businessPhoneExt,String website,String email,String internalId,String detailsHeader,String detailsBody,String hours,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String building,String googlePlaceId,String yelpId,Boolean active,Boolean publicLocation,String locationType,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,String responseFormat,String responseIncludes,SecurityContext securityContext)
      throws NotFoundException;
      Response createRoute(BigDecimal version,Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response createRouteDirections(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response createRoutePolyline(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response createRouteSettings(BigDecimal version,RouteSettings body,SecurityContext securityContext)
      throws NotFoundException;
      Response createScheduledNotification(BigDecimal version,Long accountId,String name,String type,String message,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext)
      throws NotFoundException;
      Response createScore(BigDecimal version,Long accountId,String appKey,Integer points,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Integer timeTaken,Boolean highest,SecurityContext securityContext)
      throws NotFoundException;
      Response createSecureApplication(BigDecimal version,Long accountId,String appKey,File keyCert,File trustStore,String username,String password,Boolean active,String biometricType,String biometricPosition,String biometricPosition2,SecurityContext securityContext)
      throws NotFoundException;
      Response createServiceHub(BigDecimal version,ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response createShipment(BigDecimal version,Shipment body,SecurityContext securityContext)
      throws NotFoundException;
      Response createShipmentBatch(BigDecimal version,ShipmentBatch body,SecurityContext securityContext)
      throws NotFoundException;
      Response createSmartContract(BigDecimal version,Long accountId,String tokenName,String tokenSymbol,Long paymentMethodId,SecurityContext securityContext)
      throws NotFoundException;
      Response createSpace(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createStripeCheckoutSession(BigDecimal version,String appKey,String stripeParameters,SecurityContext securityContext)
      throws NotFoundException;
      Response createSubscription(BigDecimal version,Long accountId,Long planId,String promoCode,SecurityContext securityContext)
      throws NotFoundException;
      Response createTask(BigDecimal version,Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createTerritory(BigDecimal version,Long accountId,String name,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createTournament(BigDecimal version,Long accountId,String appKey,String title,Integer costToPlay,Long startDate,String subType,Long imageAssetId,Integer secondsBetweenLevels,Integer secondsForTieBreaker,Integer secondsBetweenPacks,Integer maximumLevelLength,String costToPlayType,Integer minimumToPlay,Integer startingLimit,Integer availableLimit,String description,String metaData,String audienceIds,Boolean active,Boolean enableBuyBack,String offerIds,Long offerAssetId,Boolean fixedReward,String splitReward,Boolean allocateTickets,String tournamentData,String missionType,String visibility,Integer preliminaryGroups,String preliminaryGroupAdvancements,Boolean enableMultipleEntries,Boolean enableMultipleVotes,Boolean featured,String winnerTag,String tieTag,SecurityContext securityContext)
      throws NotFoundException;
      Response createTrigger(BigDecimal version,Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response createTrip(BigDecimal version,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response createVatomEvent(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createVehicle(BigDecimal version,String vehicle,Vehicle body,SecurityContext securityContext)
      throws NotFoundException;
      Response createVehicleType(BigDecimal version,String vehicleType,VehicleType body,SecurityContext securityContext)
      throws NotFoundException;
      Response createVoiceCanvas(BigDecimal version,Long accountId,String dimensions,String thirdPartyAccountId,String text,File _file,String url,Boolean parseFlag,Boolean fetchFlag,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response createWord(BigDecimal version,Long accountId,String word,String definition,Boolean active,Boolean allocateTickets,Long ticketCount,Long assetId,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response delete(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAchievement(BigDecimal version,Long achievementId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAchievementTier(BigDecimal version,Long achievementTierId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplication(BigDecimal version,Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplicationConfig(BigDecimal version,Long accountId,Long configId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplicationPlacement(BigDecimal version,Long placementId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAsset(BigDecimal version,String assetId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteAudience(BigDecimal version,Long accountId,Long audienceId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteBatch(BigDecimal version,Long accountId,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteBid(BigDecimal version,Long bidId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteBillableEntity(BigDecimal version,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCargoType(BigDecimal version,Long cargoTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCategory(BigDecimal version,Long accountId,Long categoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteContest(BigDecimal version,Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCreative(BigDecimal version,Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCredential(BigDecimal version,Long accountId,String networkUID,String thirdPartyId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteData(BigDecimal version,String objectName,String objectId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteEmployee(BigDecimal version,Long accountId,Long employeeAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteEvent(BigDecimal version,Long accountId,Long eventId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFavorite(BigDecimal version,String deviceId,Long accountId,Long favoriteId,Long favoritableId,String favoritableType,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteField(BigDecimal version,Long accountId,String appKey,String objectName,String fieldName,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFilter(BigDecimal version,Long accountId,Long filterId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFlag(BigDecimal version,String deviceId,Long accountId,String itemBeingFlaggedType,Long itemBeingFlaggedId,String flagableType,Long flagableId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFollowing(BigDecimal version,Long accountId,String vatomRelsKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteGame(BigDecimal version,Long accountId,Long gameId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteGameLevel(BigDecimal version,Long accountId,Long levelId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteLeaderboard(BigDecimal version,Long leaderboardId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteListing(BigDecimal version,Long accountId,Long listingId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMedia(BigDecimal version,Long accountId,Long mediaId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMission(BigDecimal version,Long accountId,Long missionId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMissionInvite(BigDecimal version,String deviceId,Long accountId,Long missionId,Long missionInviteId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteNetwork(BigDecimal version,Long accountId,String networkUID,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteNote(BigDecimal version,Long noteId,String deviceId,Long accountId,Double latitude,Double longitude,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteNotificationTemplate(BigDecimal version,Long accountId,Long notificationTemplateId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteObject(BigDecimal version,Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOffer(BigDecimal version,Long offerId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOfferLocation(BigDecimal version,Long offerLocationId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOfferTransaction(BigDecimal version,Long transactionId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOfferTransactionStatus(BigDecimal version,Long statusId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOrder(BigDecimal version,Long orderId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePack(BigDecimal version,Long accountId,Long packId,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePersona(BigDecimal version,Long accountId,Long personaId,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePointsBalance(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePostalCode(BigDecimal version,Long accountId,Long postalCodeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteProgram(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePurchaseItem(BigDecimal version,Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteQuestion(BigDecimal version,Long questionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRating(BigDecimal version,Long ratingId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRegion(BigDecimal version,Long accountId,Long regionId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteReservation(BigDecimal version,Long reservationId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRetailer(BigDecimal version,String deviceId,Long accountId,Long retailerId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRetailerLocation(BigDecimal version,String deviceId,Long accountId,Long retailerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRoute(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRouteSettings(BigDecimal version,Long routeSettingsId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteScheduledNotification(BigDecimal version,Long accountId,Long scheduledNotificationId,Boolean deleteByGroupingId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSecureApplication(BigDecimal version,Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteServiceHub(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteShipment(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteShipmentBatch(BigDecimal version,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSpace(BigDecimal version,Long accountId,String appKey,String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSubscription(BigDecimal version,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTask(BigDecimal version,Long accountId,Long taskId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTerritory(BigDecimal version,Long accountId,Long territoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTournament(BigDecimal version,Long accountId,Long missionId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTrigger(BigDecimal version,Long accountId,Long triggerId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVatomEvent(BigDecimal version,Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVatomNFT(BigDecimal version,Long accountId,String vatomId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVehicle(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVehicleType(BigDecimal version,Long vehicleTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteWord(BigDecimal version,Long wordId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response disapproveRoute(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response driveTrip(BigDecimal version,Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response duplicateCategory(BigDecimal version,Long accountId,Long categoryId,String appKey,Long parentCategoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response editAccount(BigDecimal version,String deviceId,Long accountId,Long connectionAccountId,String role,Long assetId,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String gender,Integer age,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,Boolean makeProfileInfoPublic,Boolean makeGameInfoPublic,Boolean makeFriendsInfoPublic,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,String platforms,String tags,String aboutUs,String matchToken,String gameExperience,String categories,String categoryIds,String responseFilters,Boolean showAsZipcode,Boolean showExactLocation,Boolean showOthersExactLocation,Boolean acceptedTerms,String locationVisibility,String appBlob,Boolean appEnablePush,Boolean appEnableSMS,Boolean appEnableEmail,String gameType,String appKey,Double latitude,Double longitude,Boolean returnProfile,String audienceIdsToAdd,String audienceIdsToRemove,Long referralAccountId,String appNickname,Long personalAudienceId,String nonGuestUsername,SecurityContext securityContext)
      throws NotFoundException;
      Response editUsername(BigDecimal version,String deviceId,Long accountId,String emailAddress,String username,SecurityContext securityContext)
      throws NotFoundException;
      Response emotion(BigDecimal version,Long accountId,String thirdPartyAccountId,File _file,String url,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response eventInvite(BigDecimal version,Long accountId,String appKey,Long listingId,String receiverAccountIds,Long retailerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response executeActionOnNFT(BigDecimal version,Long accountId,String vatomId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response filteredUsage(BigDecimal version,String deviceId,Long accountId,Long applicationId,String appKey,Long startDate,Long endDate,String deviceType,String device,String deviceOS,String gender,String ageGroup,String country,String state,String city,String zip,String model,String tag,Long userAccountId,String userAccountDisplay,String userAccountUsername,Long customId,String customType,Double customValue,Double customValue2,Long customLong,Long customLong2,String customMessage,String customMessage2,String groupBy,String distinctCount,String sumColumn,String sortField,Boolean descending,Boolean hideUnknown,String responseFormat,Integer l,Integer limit,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response findMissions(BigDecimal version,String appKey,String suffix,String type,Long accountId,String appVersion,Double latitude,Double longitude,String device,Long deviceIdentifier,String deviceVersion,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean allocatesTickets,Boolean randomize,Boolean targetedAdsOnly,String missionIds,String audienceOperator,SecurityContext securityContext)
      throws NotFoundException;
      Response flexibleTrip(BigDecimal version,Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response followAccept(BigDecimal version,Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followReject(BigDecimal version,Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followRemove(BigDecimal version,Long accountId,Long connectionAccountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response followRequest(BigDecimal version,Long accountId,Long connectionAccountId,String appKey,Boolean approvalNeeded,SecurityContext securityContext)
      throws NotFoundException;
      Response friendAccept(BigDecimal version,Long friendAccountId,Boolean notifyFriend,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response friendReject(BigDecimal version,Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,Boolean notifyFriend,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response friendRemove(BigDecimal version,Long friendAccountId,String deviceId,Long accountId,Boolean notifyFriend,Boolean removeFromGroups,SecurityContext securityContext)
      throws NotFoundException;
      Response friendRequest(BigDecimal version,Long friendAccountId,String deviceId,Long accountId,String gameType,String appKey,String notificationMessage,SecurityContext securityContext)
      throws NotFoundException;
      Response gameInvite(BigDecimal version,String deviceId,Long accountId,Long appId,String appKey,Long gameLevelId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response geomapSearch(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getAccount(BigDecimal version,Boolean returnNulls,String deviceId,Long accountId,String connectionAccountEmail,Long connectionAccountId,String responseFilters,String gameType,String appKey,String purchaseType,Boolean updateViewedDate,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getAchievement(BigDecimal version,Long achievementId,String deviceId,Long accountId,String achievementType,SecurityContext securityContext)
      throws NotFoundException;
      Response getAchievementTier(BigDecimal version,Long accountId,Long achievementTierId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAddMovieResult(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAgeGroups(BigDecimal version,SecurityContext securityContext)
      throws NotFoundException;
      Response getAlbumCollection(BigDecimal version,Boolean returnNulls,Long albumId,String deviceId,Long accountId,Integer likePreviewSize,Integer assetPreviewSize,Integer notePreviewSize,Integer connectionPreviewSize,Integer audiencePreviewSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getAlbumContest(BigDecimal version,Long albumContestId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getAlbumContests(BigDecimal version,String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,String gameType,String appKey,String appType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getAppData(BigDecimal version,Integer start,Integer limit,String deviceId,Long accountId,String gameType,Boolean includeGameData,String q,String keyword,String sortField,Boolean descending,Integer i,Integer l,Boolean gameObjectCount,String filter,Long dateCreated,Long ownerId,String missionIds,String gameIds,String packIds,String gameLevelIds,String appVersion,Boolean includeHigherVersionPacks,Boolean includeHigherVersionLevels,String responseGroups,String purchaseType,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplication(BigDecimal version,String appKey,Long applicationId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationConfig(BigDecimal version,Long accountId,Long configId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationConfigByConfigVersion(BigDecimal version,String appKey,String configVersion,Long retailerId,Long retailerLocationId,String udid,Boolean allowOlderVersions,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationPlacement(BigDecimal version,Long placementId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationVersions(BigDecimal version,SecurityContext securityContext)
      throws NotFoundException;
      Response getAsset(BigDecimal version,Long assetId,String deviceId,Long accountId,Boolean noteDescending,SecurityContext securityContext)
      throws NotFoundException;
      Response getAudience(BigDecimal version,Long accountId,Long audienceId,String appKey,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext)
      throws NotFoundException;
      Response getAudienceList(BigDecimal version,Long accountId,String albumIds,String keyword,String keywordFields,String sortField,Boolean descending,Integer start,Integer limit,Boolean sendSuggestion,Boolean activeOnly,Boolean groupByGroupingId,String appKey,Boolean returnGlobal,Boolean exactKeyword,String audienceType,String audienceTypes,Boolean returnAccountCount,Boolean returnAlbumCount,String albumTypesForCount,SecurityContext securityContext)
      throws NotFoundException;
      Response getBatch(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getBid(BigDecimal version,Long bidId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getBillableEntity(BigDecimal version,String deviceId,Long accountId,Boolean includeCounts,Boolean includePayments,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessBehaviors(BigDecimal version,Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessCoinsBalance(BigDecimal version,Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessIds(BigDecimal version,Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessInfo(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessUsers(BigDecimal version,Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupEntities(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupRules(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupStats(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignInfo(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCargoType(BigDecimal version,Long cargoTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCategory(BigDecimal version,Long categoryId,Boolean returnExternal,SecurityContext securityContext)
      throws NotFoundException;
      Response getConnectionSentFriendRequests(BigDecimal version,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getConnections(BigDecimal version,Boolean returnNulls,String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,Long connectionAccountId,String q,String keyword,Integer i,Integer l,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getCreative(BigDecimal version,Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCreativesByApplication(BigDecimal version,Long accountId,String appKey,Integer start,Integer limit,Long missionId,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response getCredential(BigDecimal version,String networkUID,String appKey,Long accountId,String deviceId,String sessionId,Long thirdPartyCredentialId,String thirdPartyToken,String thirdPartySecret,Boolean createNewAccount,String responseFilters,Double latitude,Double longitude,String audienceIdsToAdd,String audienceIdsToRemove,Long referralAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCryptoBalance(BigDecimal version,Long accountId,Long ownerAccountId,Long paymentMethodId,SecurityContext securityContext)
      throws NotFoundException;
      Response getData(BigDecimal version,String objectName,String objectId,Long accountId,String include,SecurityContext securityContext)
      throws NotFoundException;
      Response getDependents(BigDecimal version,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getDevices(BigDecimal version,Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException;
      Response getDisbursement(BigDecimal version,Long accountId,Long disbursementId,SecurityContext securityContext)
      throws NotFoundException;
      Response getEmotion(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getEmployee(BigDecimal version,Long accountId,Long employeeAccountId,String settingsAppKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getEpisodeStatus(BigDecimal version,Long episodeId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getEvent(BigDecimal version,Long accountId,Long eventId,SecurityContext securityContext)
      throws NotFoundException;
      Response getEventGuestList(BigDecimal version,Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getExperiences(BigDecimal version,SecurityContext securityContext)
      throws NotFoundException;
      Response getFavorite(BigDecimal version,Long favoriteId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getFilter(BigDecimal version,Long filterId,SecurityContext securityContext)
      throws NotFoundException;
      Response getFlag(BigDecimal version,String flagableType,Long flagableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getFlagThreshold(BigDecimal version,String itemBeingFlaggedType,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getGame(BigDecimal version,Long accountId,Long gameId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevel(BigDecimal version,Long accountId,Long levelId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevelsByApplication(BigDecimal version,Long accountId,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,String appVersion,Boolean includeGameData,String filters,SecurityContext securityContext)
      throws NotFoundException;
      Response getGameLevelsByBillableEntity(BigDecimal version,Long accountId,String appKey,String keyword,String sortField,Boolean descending,Boolean activeOnly,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getGroupDetails(BigDecimal version,Boolean combineConnections,String deviceId,Long accountId,Long groupId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getGroupedAudiences(BigDecimal version,Long accountId,String audienceGroupingId,SecurityContext securityContext)
      throws NotFoundException;
      Response getHistoricalRankings(BigDecimal version,String appKey,String rankType,Long startDate,Long endDate,String deviceId,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getInventory(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getInvite(BigDecimal version,Long accountId,String token,Long albumId,Long missionId,Long albumContestId,Long offerId,Long offerLocationId,Long retailerLocationId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getLeaderboard(BigDecimal version,Long leaderboardId,Long accountId,Boolean includeFullRankingList,SecurityContext securityContext)
      throws NotFoundException;
      Response getListing(BigDecimal version,Long listingId,SecurityContext securityContext)
      throws NotFoundException;
      Response getLocationByIp(BigDecimal version,String ip,SecurityContext securityContext)
      throws NotFoundException;
      Response getLocationByTrilateration(BigDecimal version,Long accountId,Double latitude,Double longitude,String data,String responseFilters,SecurityContext securityContext)
      throws NotFoundException;
      Response getLocations(BigDecimal version,String deviceId,Long accountId,Double currentlatitude,Double currentlongitude,Double currentLatitude,Double currentLongitude,String query,String zipcode,String zipCode,Double selectedMaplatitude,Double selectedMaplongitude,Double selectedMapLatitude,Double selectedMapLongitude,Double searchRange,Boolean useGeocode,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getMedia(BigDecimal version,Long accountId,Long mediaId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMission(BigDecimal version,Long accountId,Long missionId,Boolean returnCreative,SecurityContext securityContext)
      throws NotFoundException;
      Response getMissionInvite(BigDecimal version,String deviceId,Long accountId,Long missionId,Long missionInviteId,Boolean includeGameData,String includeScores,SecurityContext securityContext)
      throws NotFoundException;
      Response getMyFollowing(BigDecimal version,Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getNetwork(BigDecimal version,Long accountId,String networkUID,SecurityContext securityContext)
      throws NotFoundException;
      Response getNote(BigDecimal version,Long noteId,String deviceId,Long accountId,Boolean returnFullResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getNotificationTemplate(BigDecimal version,Long accountId,Long notificationTemplateId,SecurityContext securityContext)
      throws NotFoundException;
      Response getNotifications(BigDecimal version,String deviceId,Long accountId,Long connectionAccountId,String appKey,String eventType,String contentIds,String contentTypes,String parentIds,String parentTypes,String actionCategory,String conduits,String keyword,Boolean returnReadMessages,Boolean markAsRead,Long fromDate,Double latitude,Double longitude,Boolean returnSent,Boolean ignoreFlagged,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getObject(BigDecimal version,Long accountId,String appKey,String objectName,SecurityContext securityContext)
      throws NotFoundException;
      Response getOffer(BigDecimal version,Long offerId,Boolean includeOfferLocations,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferDetails(BigDecimal version,String deviceId,Long accountId,Long offerId,Long offerLocationId,Double distance,Double latitude,Double longitude,Boolean includeOfferLocations,Boolean includeRetailerLocations,Boolean includeChildOffers,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferListCounts(BigDecimal version,Double latitude,Double longitude,BigDecimal searchRange,String distanceUnit,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferLocation(BigDecimal version,Long offerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferLocationsForRetailers(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean includeRetailerLocation,String deviceId,Long accountId,String keyword,Long retailerId,Long retailerLocationId,String offerType,String specialOfferType,String barcodeType,String barcodeEntry,String isbn,String asin,String deviceStatus,Boolean needsNotificationSent,Long lastNotificationSent,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferTransaction(BigDecimal version,Long transactionId,String deviceId,Long accountId,Boolean includeMission,Double latitude,Double longitude,Boolean returnFullResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getOfferTransactionStatus(BigDecimal version,Long statusId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getOffersForRetailers(BigDecimal version,String offerVisibility,String sortField,Boolean descending,Integer start,Integer limit,Boolean availableOnly,Boolean activeOnly,Boolean includeCategories,Boolean includeFilters,Boolean includeOfferLocations,String deviceId,Long accountId,String categoryIds,String filterIds,String q,String keyword,Long retailerId,Long retailerLocationId,String couponType,String offerType,String offerTypes,String specialOfferType,Integer i,Integer l,String barcodeType,String barcodeEntry,String isbn,String asin,String deviceStatus,Boolean needsNotificationSent,Long lastNotificationSent,SecurityContext securityContext)
      throws NotFoundException;
      Response getOptimizationResult(BigDecimal version,String batchID,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrder(BigDecimal version,String deviceId,Long accountId,Long orderId,String externalOrderId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPack(BigDecimal version,Long accountId,Long packId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response getPaymentMethod(BigDecimal version,Long accountId,Long paymentMethodId,Boolean getCurrentBalance,SecurityContext securityContext)
      throws NotFoundException;
      Response getPersonaList(BigDecimal version,Long accountId,Long personaId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPointsBalance(BigDecimal version,Long accountId,String vatomUserId,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getPointsBalanceAsBusiness(BigDecimal version,Long accountId,String appKey,String vatomUserId,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getPostalCode(BigDecimal version,Long postalCodeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPostalCodes(BigDecimal version,String sortField,Boolean descending,Double latitude,Double longitude,String keyword,Double miles,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getPredictedLocations(BigDecimal version,Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,Long threshold,String distanceUnit,Double searchRange,String sortOrder,SecurityContext securityContext)
      throws NotFoundException;
      Response getPredictedPath(BigDecimal version,Long accountId,Long startStepId,Long endStepId,SecurityContext securityContext)
      throws NotFoundException;
      Response getPreferredLocations(BigDecimal version,Long accountId,Double latitude,Double longitude,Long dateCheck,String hourCheck,String sortField,Boolean descending,Integer start,Integer limit,Double searchRange,String distanceUnit,SecurityContext securityContext)
      throws NotFoundException;
      Response getProfileAssets(BigDecimal version,Boolean returnNulls,String deviceId,Long accountId,Long ownerId,String mediaTypes,String mimeTypes,String sortField,Boolean descending,Double latitude,Double longitude,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getProgram(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getPurchaseItem(BigDecimal version,Long purchaseItemId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getQuestion(BigDecimal version,Long questionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getQuestionsInLevel(BigDecimal version,Long levelId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRankings(BigDecimal version,String deviceId,Long accountId,String gameType,String appKey,String q,String keyword,String rankType,String leaderboardMode,String withinAccountIds,Boolean returnUserRank,Long albumId,Long audienceId,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getReferralList(BigDecimal version,Long accountId,String appKey,String retrieveType,BigDecimal levelLimit,BigDecimal ancestorLevelLimit,BigDecimal childrenLevelLimit,BigDecimal ancestorListStart,BigDecimal ancestorListLimit,BigDecimal childrenListStart,BigDecimal childrenListLimit,Boolean childrenChildren,SecurityContext securityContext)
      throws NotFoundException;
      Response getRegion(BigDecimal version,Long regionId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRenderStatus(BigDecimal version,String renderId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getReportBatch(BigDecimal version,Long accountId,Long batchId,Boolean allResults,SecurityContext securityContext)
      throws NotFoundException;
      Response getRetailer(BigDecimal version,Long retailerId,String deviceId,Long accountId,Boolean includeCounts,SecurityContext securityContext)
      throws NotFoundException;
      Response getRetailerLocation(BigDecimal version,Long retailerLocationId,String deviceId,Long accountId,String retailerLocationToken,SecurityContext securityContext)
      throws NotFoundException;
      Response getRetailerLocationConsumer(BigDecimal version,Long retailerLocationId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRetailers(BigDecimal version,String visibility,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String q,String keyword,String categoryIds,String filterIds,Integer i,Integer l,SecurityContext securityContext)
      throws NotFoundException;
      Response getRetaokiler(BigDecimal version,Long retailerId,Boolean activeOnly,String keyword,String sortField,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getRoute(BigDecimal version,Long routeId,Boolean showInheritedProperties,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteDirections(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteSettings(BigDecimal version,Long routeSettingsId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteShipments(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteStop(BigDecimal version,Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteStops(BigDecimal version,Long routeId,Boolean confirmedOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response getSTT(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getScheduledNotification(BigDecimal version,Long accountId,Long scheduledNotificationId,SecurityContext securityContext)
      throws NotFoundException;
      Response getScore(BigDecimal version,Long accountId,String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,String scoreObjectType,String scoreStatus,SecurityContext securityContext)
      throws NotFoundException;
      Response getServiceHub(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getSettings(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipment(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentBatch(BigDecimal version,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentBatchStatus(BigDecimal version,Long batchId,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean valid,Boolean started,Boolean completed,Boolean hasShipment,Boolean hasRoute,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentsAtStop(BigDecimal version,Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSpace(BigDecimal version,Long accountId,String appKey,String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getStatusCSV(BigDecimal version,Long accountId,Long batchId,String responseGroup,Long start,Long limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getStop(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscription(BigDecimal version,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionPlan(BigDecimal version,Long planId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionPlans(BigDecimal version,Boolean visible,String role,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionUsage(BigDecimal version,Long accountId,Long applicationId,Long start,Long end,SecurityContext securityContext)
      throws NotFoundException;
      Response getTTS(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTask(BigDecimal version,Long accountId,Long taskId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTechTune(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTerritory(BigDecimal version,Long territoryId,SecurityContext securityContext)
      throws NotFoundException;
      Response getThemeDescriptor(BigDecimal version,Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getThemeDescriptors(BigDecimal version,String filter,String sortField,Boolean descending,Integer start,Integer limit,String deviceId,Long accountId,String gameType,String contestType,Long ownerId,String q,String keyword,Integer i,Integer l,Long dateCreated,String appVersion,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getTicketCount(BigDecimal version,String deviceId,Long accountId,String gameType,String appKey,String ticketType,SecurityContext securityContext)
      throws NotFoundException;
      Response getTicketList(BigDecimal version,String deviceId,Long accountId,String ticketObjectType,String actionType,String ticketIds,String objectIds,String receiptTokens,String gameType,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response getToken(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getTopics(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTournament(BigDecimal version,Long accountId,Long missionId,String joinCode,String includeScores,Integer objectPreviewSize,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrackingLegs(BigDecimal version,String deviceId,Long accountId,Long ownerId,String trackingDeviceId,Long startDate,Long endDate,String tags,Boolean getLastPoint,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrigger(BigDecimal version,Long accountId,Long triggerId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrip(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getTripMatches(BigDecimal version,Long id,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext)
      throws NotFoundException;
      Response getUniqueUsersByApp(BigDecimal version,String appKey,String q,String keyword,Long since,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserAchievements(BigDecimal version,Boolean returnNulls,String appKey,Boolean includeUndiscovered,String deviceId,Long accountId,String connectionAccountEmail,Long connectionAccountId,String rankType,String achievementType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserCoinsAsBusiness(BigDecimal version,Long accountId,String vatomUserId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserCoinsBalance(BigDecimal version,Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserFollowers(BigDecimal version,Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserFollowing(BigDecimal version,Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserInfo(BigDecimal version,Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserProfile(BigDecimal version,Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserRank(BigDecimal version,String deviceId,Long accountId,String appKey,String rankType,Boolean returnUserRank,String leaderboardMode,String sortField,String keyword,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response getVatomEvent(BigDecimal version,Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getVatomNFT(BigDecimal version,Long accountId,String vatomId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicle(BigDecimal version,Long id,SecurityContext securityContext)
      throws NotFoundException;
      Response getVehicleType(BigDecimal version,Long vehicleTypeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVoiceCanvas(BigDecimal version,String requestId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getWord(BigDecimal version,Long wordId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getWords(BigDecimal version,Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response getWordsInLevel(BigDecimal version,Long levelId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response giftPurchase(BigDecimal version,Long receiverAccountId,Long ticketId,String deviceId,Long accountId,Long assetId,String customMessage,String gameType,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response graphInterface(BigDecimal version,String event,String deviceId,Long accountId,String permissionableType,Long permissionableId,Long assetId,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response groupSearch(BigDecimal version,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response imageGeneration(BigDecimal version,Long accountId,String postBody,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response importMission(BigDecimal version,Long accountId,Double latitude,Double longitude,String appKey,String keyword,Integer start,Integer limit,String adSize,SecurityContext securityContext)
      throws NotFoundException;
      Response indexedRetailerLocationDistanceSearch(BigDecimal version,Double latitude,Double longitude,Double searchRange,Integer start,Integer limit,Long accountId,String address,Boolean hasOffers,String categories,String filters,String audiences,String retailerIds,String retailerLocationIds,String tags,String locationType,String sortField,Boolean descending,String q,String keyword,String keywordOperator,String searchExpression,String distanceUnit,Boolean returnFavorited,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean returnExternalCategoryData,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException;
      Response indexedRetailerLocationSearch(BigDecimal version,Long accountId,Integer start,Integer limit,Boolean hasOffers,String categories,String filters,String audiences,String retailerIds,String retailerLocationIds,String tags,String locationType,String sortField,Boolean descending,String q,String keyword,String keywordOperator,String searchExpression,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean returnExternalCategoryData,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException;
      Response leaveAlbum(BigDecimal version,Long albumId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response leaveFromPermissionable(BigDecimal version,String permissionableType,Long permissionableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response listAchievementTags(BigDecimal version,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response listAchievements(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String appKey,String keyword,String achievementType,String rankType,SecurityContext securityContext)
      throws NotFoundException;
      Response listApplications(BigDecimal version,Long accountId,String q,String keyword,String platforms,String deviceIds,String deviceVersions,String categoryIds,String sortField,Boolean hasAds,Boolean publicNotifications,Boolean filterBillable,Boolean filterContentAdmin,Boolean descending,Integer i,Integer start,Integer l,Integer limit,String applicationIds,Boolean hasObjectStore,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response listByAccount(BigDecimal version,Long accountId,Integer limit,String suggestionType,SecurityContext securityContext)
      throws NotFoundException;
      Response listByAudience(BigDecimal version,Integer limit,String gender,Integer age,String categoryIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response listCommunities(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listEvents(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listLastestByAccount(BigDecimal version,Long accountId,Integer timeframe,String suggestionType,SecurityContext securityContext)
      throws NotFoundException;
      Response listSpaces(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listStatusCSV(BigDecimal version,Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response listUserCoinTransactions(BigDecimal version,Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listUserCoinTransactionsAsBusiness(BigDecimal version,Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response loginDelegate(BigDecimal version,String accessToken,String appKey,String deviceId,String accessTokenSecret,Long delegatedAccountId,String delegatedUsername,String networkUID,Integer ageRestriction,String responseFilters,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response loginGeneral(BigDecimal version,String accessToken,String networkUID,String appKey,String deviceId,String deviceIdType,String accessTokenSecret,Integer ageRestriction,String responseFilters,Double latitude,Double longitude,Boolean emailMatch,Long chosenAccountId,Long thirdPartyCredentialId,SecurityContext securityContext)
      throws NotFoundException;
      Response loginSecure(BigDecimal version,String appKey,File biometricFile,String deviceId,File biometricFile2,Integer ageRestriction,Boolean returnProfile,String responseFilters,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response loginTwitter(BigDecimal version,String accessToken,String accessTokenSecret,String appKey,String responseFilters,String deviceId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response loginUsername(BigDecimal version,String username,String password,String deviceId,Double latitude,Double longitude,String app,String gameType,String appKey,Boolean returnProfile,String responseFilters,SecurityContext securityContext)
      throws NotFoundException;
      Response logout(BigDecimal version,String deviceId,String deviceIdType,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response mergeAccount(BigDecimal version,Long mergeAccountId,String appKey,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response missionInvite(BigDecimal version,String deviceId,Long accountId,Long appId,String appKey,Long missionId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response offerInvite(BigDecimal version,Long accountId,String appKey,Long offerId,SecurityContext securityContext)
      throws NotFoundException;
      Response offerLocationInvite(BigDecimal version,Long accountId,String appKey,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response optimizeRoute(BigDecimal version,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response overrideUserRank(BigDecimal version,Long accountId,Long ownerAccountId,String appKey,String rankType,Long totalScore,Long totalCount,Long totalTime,Long dailyScore,Long dailyCount,Long dailyTime,Long weeklyScore,Long weeklyCount,Long weeklyTime,Long monthlyScore,Long monthlyCount,Long monthlyTime,Long topScore,Long lowestScore,Long streakCount,Long streakBestCount,Long startDate,Long endDate,SecurityContext securityContext)
      throws NotFoundException;
      Response passwordChange(BigDecimal version,Long accountId,String oldPassword,String newPassword,String confirmPassword,SecurityContext securityContext)
      throws NotFoundException;
      Response passwordReset(BigDecimal version,String token,String password,String confirm,SecurityContext securityContext)
      throws NotFoundException;
      Response performActionOnNFT(BigDecimal version,Long accountId,String vatomId,String vatomAction,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response postAppData(BigDecimal version,String gameType,Integer start,Integer limit,String data,String deviceId,Long accountId,Boolean includeGameData,String q,String keyword,String sortField,Boolean descending,Integer i,Integer l,Boolean gameObjectCount,String filter,Long dateCreated,Long ownerId,String missionIds,String gameIds,String packIds,String gameLevelIds,String appVersion,Boolean includeHigherVersionPacks,Boolean includeHigherVersionLevels,String responseGroups,String purchaseType,SecurityContext securityContext)
      throws NotFoundException;
      Response postProgram(BigDecimal version,Long id,Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response postServiceHub(BigDecimal version,Long id,ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response previewOfferTransaction(BigDecimal version,String deviceId,Long accountId,Long offerId,Long offerLocationId,String offerCart,String promoCode,String currencyType,Boolean usePoints,String metaData,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response previewOrder(BigDecimal version,String appKey,String cart,String deviceId,Long accountId,String description,String currencyType,Long paymentMethodId,String externalOrderId,String externalPaymentId,String remoteRefType,Long externalDate,String promoCode,SecurityContext securityContext)
      throws NotFoundException;
      Response processAllParticipants(BigDecimal version,Long accountId,String appKey,Boolean useShortNameAsID,SecurityContext securityContext)
      throws NotFoundException;
      Response processParticipants(BigDecimal version,Long accountId,String league,String appKey,Boolean useShortNameAsID,File _file,SecurityContext securityContext)
      throws NotFoundException;
      Response processTripMatches(BigDecimal version,Long startDate,Long endDate,Long tripId,SecurityContext securityContext)
      throws NotFoundException;
      Response purchaseSecure(BigDecimal version,PaymentRequest body,SecurityContext securityContext)
      throws NotFoundException;
      Response putProgram(BigDecimal version,Long id,Program body,SecurityContext securityContext)
      throws NotFoundException;
      Response putServiceHub(BigDecimal version,Long id,ServiceHub body,SecurityContext securityContext)
      throws NotFoundException;
      Response queueCreate(BigDecimal version,String appKey,String name,String deviceId,Long accountId,Integer workers,String analyticTags,String hostname,Integer port,String username,String password,String virtualHost,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response queueDelete(BigDecimal version,Long queueId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response queueGet(BigDecimal version,String deviceId,Long accountId,Long queueId,String appKey,String name,String hostname,String virtualHost,SecurityContext securityContext)
      throws NotFoundException;
      Response queuePublish(BigDecimal version,String message,Long queueId,String appKey,String name,String hostname,String virtualHost,SecurityContext securityContext)
      throws NotFoundException;
      Response queueSearch(BigDecimal version,Long queueId,String deviceId,Long accountId,String name,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response queueUpdate(BigDecimal version,Long queueId,String deviceId,Long accountId,String appKey,Integer workers,String analyticTags,String hostname,Integer port,String username,String password,String virtualHost,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response redeemNFT(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response redeemOfferTransaction(BigDecimal version,Long offerTransactionId,Integer status,String deviceId,Long accountId,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response redeemUserCoinsAsBusiness(BigDecimal version,Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response regenAppData(BigDecimal version,Long accountId,String appKey,String buildVersion,String apiVersion,SecurityContext securityContext)
      throws NotFoundException;
      Response registerLike(BigDecimal version,String likableType,Long likableId,String deviceId,Long accountId,String permissionableType,Long permissionableId,Boolean like,String app,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response registerNotificationToken(BigDecimal version,String token,String pushType,String deviceId,Long accountId,String environment,String appKey,String gameType,Boolean active,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeAlbum(BigDecimal version,Long albumId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeAlbumUsers(BigDecimal version,Long albumId,Boolean removeFriendGroup,String deviceId,Long accountId,String connections,String connectionGroups,SecurityContext securityContext)
      throws NotFoundException;
      Response removeAsset(BigDecimal version,String assetId,String deviceId,Long accountId,Long albumId,Long collectionId,Boolean removeFromDefaultAlbums,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeConnectionFromGroup(BigDecimal version,Boolean returnNulls,Long groupId,String deviceId,Long accountId,Long connectionId,Long connectionAccountId,Long pendingId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeConnectionsFromGroup(BigDecimal version,Long connectionGroupId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeDependent(BigDecimal version,Long accountId,Long dependentId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeGroup(BigDecimal version,Boolean returnNulls,Long groupId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeLike(BigDecimal version,String likableType,Long likableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removePreview(BigDecimal version,Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeStop(BigDecimal version,Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeSubGroups(BigDecimal version,Boolean returnNulls,Long groupId,String subGroupIds,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeThemeDescriptor(BigDecimal version,Long themeDescriptorId,String deviceId,Long accountId,String gameType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response removeUsersFromPermissionable(BigDecimal version,String permissionableType,Long permissionableId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,String connectionGroupIds,Boolean removeFriendGroup,Double latitude,Double longitude,String audienceIds,SecurityContext securityContext)
      throws NotFoundException;
      Response reorderRouteStopsPatch(BigDecimal version,Long routeId,List<@Valid Stop> body,SecurityContext securityContext)
      throws NotFoundException;
      Response reorderRouteStopsPost(BigDecimal version,Long routeId,List<@Valid Stop> body,SecurityContext securityContext)
      throws NotFoundException;
      Response requestOptimization(BigDecimal version,Orders body,SecurityContext securityContext)
      throws NotFoundException;
      Response requestPasswordReset(BigDecimal version,String email,String from,String domain,String subUrl,String referer,SecurityContext securityContext)
      throws NotFoundException;
      Response requestValidateAccount(BigDecimal version,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response reservableAvailability(BigDecimal version,Long reservableId,String reservableType,String deviceId,Long accountId,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response resetSecure(BigDecimal version,Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response retailerLocationInvite(BigDecimal version,Long accountId,String appKey,Long retailerLocationId,Long albumId,SecurityContext securityContext)
      throws NotFoundException;
      Response retailerLoginCheck(BigDecimal version,String username,String password,String deviceId,Double latitude,Double longitude,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response ride(BigDecimal version,Long id,Boolean recurrence,SecurityContext securityContext)
      throws NotFoundException;
      Response runReport(BigDecimal version,Boolean desc,Long accountId,String query,String parameters,String order,Long start,Long limit,String responseFormat,SecurityContext securityContext)
      throws NotFoundException;
      Response runWorkflow(BigDecimal version,Long accountId,Long workflowId,Long skuId,Integer versionCode,String parameters,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTicket(BigDecimal version,String actionType,String ticketObjectType,Boolean returnNulls,String deviceId,Long accountId,String gameType,String appKey,Long objectId,String purchaseCode,String receiptToken,String receiptData,Long count,String ticketType,String purchaseProvider,String purchaseType,Boolean returnProfileResponse,Boolean includeProfileResponse,String appVersion,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTicketViaFileUpload(BigDecimal version,String actionType,String ticketObjectType,File receiptData,Boolean returnNulls,String deviceId,Long accountId,String gameType,String appKey,Long objectId,String purchaseCode,String receiptToken,Long count,String ticketType,String purchaseProvider,String purchaseType,Boolean returnProfileResponse,Boolean includeProfileResponse,String appVersion,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTrackingLeg(BigDecimal version,Double startLat,Double startLng,Long startDate,Double endLat,Double endLng,Long endDate,String deviceId,Long accountId,Double distance,Long duration,String steps,String tags,SecurityContext securityContext)
      throws NotFoundException;
      Response saveTrackingStep(BigDecimal version,Long legId,Double startLat,Double startLng,Long startDate,Double endLat,Double endLng,Long endDate,String deviceId,Long accountId,Double distance,Long duration,SecurityContext securityContext)
      throws NotFoundException;
      Response scheduleNotificationListings(BigDecimal version,Long accountId,String appKey,String reportName,String message,Integer offset,Long recipientReportId,String reportParams,String type,SecurityContext securityContext)
      throws NotFoundException;
      Response search(BigDecimal version,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long startDate,Long endDate,Boolean hasNotifications,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAccounts(BigDecimal version,Long accountId,String appKey,String keyword,Double latitude,Double longitude,Double radius,String gender,String gameExperience,Integer age,String categoryIds,Boolean returnNulls,String responseFilters,String purchaseType,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAccountsWithTrackingLegs(BigDecimal version,Long accountId,String keyword,Long startDate,Long endDate,String tags,String audienceIds,Double latitude,Double longitude,Double range,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAchievements(BigDecimal version,String appKey,String sortField,Boolean descending,Boolean includeTiers,Boolean includeInactiveTiers,Integer start,Integer limit,String deviceId,Long accountId,String keyword,String achievementType,String rankType,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAlbums(BigDecimal version,String filter,Long albumTypeId,String subType,Boolean includeInactive,String sortField,Boolean descending,Integer start,Integer limit,Double range,Boolean includeLiked,Boolean includeFavorited,Boolean includePermissions,Integer likePreviewSize,Integer assetPreviewSize,Integer notePreviewSize,Integer connectionPreviewSize,Integer audiencePreviewSize,String deviceId,Long accountId,Long connectionAccountId,Long ownerId,String albumIds,String excludeAlbumIds,Long mediaId,String keyword,String albumType,Integer limitPerAlbumType,Long dateCreated,Long updatedSince,Long updatedBefore,Long createdSince,Long createdBefore,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,Double latitude,Double longitude,String appKey,String categoryIds,String categoryFilterIds,String audienceIds,String excludeAudienceIds,Boolean includeCompletable,Boolean includeRating,String searchMode,Boolean stackSearch,Integer stackWindowSize,Integer minStackPerPage,String stackPaginationIdentifier,Boolean stackDetails,Long flagCountMinimum,Boolean removeFlaggedContent,Boolean verifiedFilter,String linkedObjectType,Long linkedObjectId,Long orderAudienceId,Boolean ignoreDefaultAppFilter,String searchExpression,Boolean generateAlbums,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationConfig(BigDecimal version,Long accountId,String appKey,Long retailerId,Long retailerLocationId,String udid,String configVersion,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationPlacement(BigDecimal version,String appKey,String deviceId,Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationSettings(BigDecimal version,String deviceId,Long accountId,Long connectionAccountId,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplications(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,String q,String keyword,String qSearchFields,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean hasAds,Boolean publicNotifications,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAssets(BigDecimal version,String deviceId,Long accountId,String albumIds,String assetIds,String appKey,String mediaType,String mimeType,String keyword,Integer versionCode,String versionName,Long updatedSince,Long updatedBefore,String sortField,Boolean descending,Boolean searchMediaLibrary,Boolean filterByBillable,Boolean activeOnly,Boolean returnApp,Integer start,Integer limit,String searchMode,String assetType,String approvalStatus,Long assignedAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchAvailability(BigDecimal version,Long reservableId,String reservableType,String deviceId,Long accountId,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchBatch(BigDecimal version,Long accountId,Integer start,Integer limit,String names,String appKey,String status,Boolean globalAppSearch,Long startDate,Long endDate,SecurityContext securityContext)
      throws NotFoundException;
      Response searchBlockedNotifications(BigDecimal version,String appKey,Long accountId,String searchTags,String events,String conduits,String customTypes,String contentTypes,String contentIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchBusinesses(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCampaignGroups(BigDecimal version,Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCargoTypes(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCarriers(BigDecimal version,String keyword,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCategories(BigDecimal version,Long accountId,String keyword,String appKey,String categoryId,String categoryIds,String parentCategoryIds,Boolean rootOnly,String sortField,String responseGroup,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnExternal,Boolean exactMatch,String type,String externalType,Boolean excludeExternalType,Integer minOfferCount,Integer searchDepth,String searchMode,SecurityContext securityContext)
      throws NotFoundException;
      Response searchConnections(BigDecimal version,Boolean returnNulls,Integer start,Integer limit,String deviceId,Long accountId,String q,String keyword,Double latitude,Double longitude,String gameType,String appKey,Integer i,Integer l,String sortField,Boolean hasLocation,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCredentials(BigDecimal version,Long accountId,String keyword,String networkUID,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchData(BigDecimal version,String objectName,Boolean count,Long start,Long limit,Long accountId,String criteria,String order,String include,SecurityContext securityContext)
      throws NotFoundException;
      Response searchDisbursements(BigDecimal version,Long accountId,Long receiverAccountId,String statuses,String providers,Long beforeDate,Long afterDate,Integer start,Integer limit,Boolean activeOnly,String externalId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchEmployees(BigDecimal version,Long accountId,String role,Long retailerId,Long retailerLocationId,String q,String keyword,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean activeOnly,Boolean managedOnly,String settingsAppKey,String categoryIds,String query,SecurityContext securityContext)
      throws NotFoundException;
      Response searchEventTransactions(BigDecimal version,String deviceId,Long accountId,String appKey,String keyword,Long retailerId,Long retailerLocationId,Long excludeRetailerLocationId,Long listingId,Long offerId,Long offerLocationId,String customerAccountIds,String affiliatedCategoryIds,Long startDate,Long endDate,String statuses,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchEvents(BigDecimal version,Long accountId,String keyword,Boolean activeOnly,String categoryIds,String filterIds,String offerAudienceIds,String transactionAudienceIds,String sortField,Boolean descending,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchFavorites(BigDecimal version,String favoritableType,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnFullResponse,String deviceId,Long accountId,Long connectionAccountId,String secondaryType,String keyword,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response searchFilters(BigDecimal version,Long accountId,String keyword,String appKey,String responseGroup,Boolean rootOnly,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchGames(BigDecimal version,Long accountId,String appKey,Integer start,Integer limit,String keyword,String appVersion,Boolean includeGameData,Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException;
      Response searchIdentities(BigDecimal version,Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchInventory(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchLeaderboards(BigDecimal version,Long accountId,String appKey,Boolean globalOnly,String keyword,String leaderboardIds,String rankTypes,String sortField,Boolean descending,Boolean includeInactive,Boolean includeAppResponse,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchLikes(BigDecimal version,String likableType,Long likableId,String deviceId,Long accountId,String connectionAccountIds,String sortField,Boolean descending,Long updatedSince,Long updatedBefore,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchListing(BigDecimal version,Long accountId,String keyword,Integer start,Integer limit,Boolean activeOnly,Double latitude,Double longitude,Long startDate,Long endDate,String categoryIds,String filterIds,Boolean useListingOrderIds,String externalId,String externalId2,String externalGroupId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchLocationRatingIndexes(BigDecimal version,String categoryIds,String keyword,String locationType,String sortField,Boolean descending,Integer start,Integer limit,Double searchRange,Double latitude,Double longitude,Boolean returnOverallRating,String distanceUnit,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMedia(BigDecimal version,Long accountId,Boolean activeOnly,String sortField,Boolean descending,String keyword,String categoryIds,String filterIds,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionFormats(BigDecimal version,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionInvites(BigDecimal version,String deviceId,Long accountId,String appKey,String appVersion,Long missionId,String status,Long lastUpdated,Integer start,Integer limit,String keyword,String missionTypes,Boolean filterByBillable,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissions(BigDecimal version,Long accountId,String keyword,String subType,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean includeInactive,String suffix,String sortField,Boolean descending,SecurityContext securityContext)
      throws NotFoundException;
      Response searchMissionsByBillableEntity(BigDecimal version,Long accountId,String keyword,Integer start,Integer limit,Boolean includeGameData,Boolean includeAudiences,Boolean includeInactive,String suffix,String sortField,Boolean descending,SecurityContext securityContext)
      throws NotFoundException;
      Response searchNetworks(BigDecimal version,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,Boolean filterBillable,SecurityContext securityContext)
      throws NotFoundException;
      Response searchNotes(BigDecimal version,String deviceId,Long accountId,String notableType,Long notableId,String noteTypes,String appKey,String keyword,Long flagCountMinimum,Boolean flagsExceedThreshold,Boolean includeInactive,String sortField,Boolean descending,Boolean returnFullResponse,Long updatedSince,Long updatedBefore,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchNotificationTemplate(BigDecimal version,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,String appKey,String event,String conduit,Boolean globalOnly,Boolean reservedOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchObject(BigDecimal version,Long accountId,String appKey,Long start,Long limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchObjects(BigDecimal version,Long accountId,Long gameLevelId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOfferTransactionStatuses(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,String role,String appKey,String sortField,Boolean descending,Integer start,Integer limit,Boolean includeInactive,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOfferTransactions(BigDecimal version,String deviceId,Long accountId,String keyword,Long retailerId,String retailerIds,Long retailerLocationId,String retailerLocationIds,String excludeRetailerLocationIds,Long offerId,String offerIds,Long offerLocationId,String offerLocationIds,String offerType,String offerTypes,String specialOfferType,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Long redeemableStartDate,Long redeemableEndDate,Boolean filterByParentOffer,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,Boolean redeemed,String statuses,Boolean reservationsOnly,Boolean activeOnly,Boolean returnFullResponse,Long recurringStartedSince,Long recurringStartedBefore,Long recurringExpirationSince,Long recurringExpirationBefore,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOfferTransactionsForRetailers(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String deviceId,Long accountId,String q,String keyword,Long retailerId,Long retailerLocationId,Long offerId,Long offerLocationId,Boolean redeemed,Boolean reservationsOnly,String couponType,String offerType,String specialOfferType,String customerAccountIds,String categoryIds,Long redeemableStartDate,Long redeemableEndDate,Integer i,Integer l,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOffersForConsumer(BigDecimal version,Double latitude,Double longitude,String recommendationType,Long locationId,Integer start,Integer limit,Integer maxRecommendations,String distanceUnit,String appKey,String deviceId,Long accountId,Double searchRange,String tags,String supportedPostalCodes,String keyword,String categories,String filters,String offerTypes,String type,String sortField,String recommendOfferIds,String retailerLocationIds,Long offerId,Boolean includeMission,Boolean includeCategories,Boolean includeFilters,Boolean includeExpired,Boolean includeFavorite,Boolean closestOfferOnly,String searchExpression,String groupBy,SecurityContext securityContext)
      throws NotFoundException;
      Response searchOrders(BigDecimal version,String appKey,String deviceId,Long accountId,Integer start,Integer limit,Boolean descending,Boolean activeOnly,Boolean ignoreCustomerFilter,String orderItemTypes,String orderItemIds,String orderCustomTypes,String orderCustomIds,String sortField,String offerTypes,String specialOfferTypes,String categoryIds,String filterIds,String offerAudienceIds,String transactionAudienceIds,String offerIds,String offerLocationIds,String retailerIds,String retailerLocationIds,String statuses,String keyword,Long redeemableStartDate,Long redeemableEndDate,Long startedSince,Long startedBefore,Long endedSince,Long endedBefore,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPacks(BigDecimal version,Long accountId,String sortField,Boolean descending,String keyword,String packType,Integer start,Integer limit,Boolean includeGameData,Boolean includeInactive,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPaymentMethod(BigDecimal version,Long accountId,String provider,String type,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPermissionables(BigDecimal version,String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,String keyword,String sortField,Boolean descending,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPermissionablesFollowingDistance(BigDecimal version,Double latitude,Double longitude,String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,Double searchRange,String keyword,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPersona(BigDecimal version,Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPrograms(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPurchaseItems(BigDecimal version,String deviceId,Long accountId,String appKey,Boolean filterByBillable,String purchaseType,String serviceAction,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchQuestions(BigDecimal version,Long accountId,String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRatingIndexes(BigDecimal version,String ratableType,String ratableIds,String categoryIds,String secondaryType,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Boolean returnRatable,Boolean returnOverallRating,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRatings(BigDecimal version,String deviceId,Long accountId,Long filterAccountId,String ratableType,Long ratableId,String categoryIds,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRecipients(BigDecimal version,String sortField,String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String recipientAccountIds,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRecipientsCount(BigDecimal version,String deviceId,Long accountId,String appKey,String conduit,String keyword,Long audienceId,String audienceIds,String connectionGroupIds,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRegions(BigDecimal version,Long accountId,String query,String keyword,Double latitude,Double longitude,Double range,String regionClass,String visibility,String searchMode,String sortField,Boolean descending,Boolean includeParent,Boolean includeChildren,Boolean includePostalCodes,String categoryIds,String filterIds,Integer versionCode,Boolean activeOnly,Boolean showDeleted,Long lastUpdatedSince,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchReservations(BigDecimal version,String deviceId,String appKey,Long accountId,Long filterAccountId,Long reservableId,String reservableType,String keyword,Long startDate,Long endDate,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRetailerLocations(BigDecimal version,String deviceId,Long accountId,String q,String keyword,String retailerIds,String retailerLocationIds,String locationType,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean showPublicLocations,Boolean activeOnly,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,Boolean returnAudiences,Boolean returnQrCode,Boolean includeFavorite,Boolean includeLiked,Boolean includeRating,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRounds(BigDecimal version,Long accountId,String appKey,String status,String missionType,Boolean currentOnly,String visibilities,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRouteSettings(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long hubId,Long programId,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRoutes(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean includesEmpty,Boolean rootOnly,Boolean showInheritedProperties,Long hubId,Long programId,Long scheduledStart,Long scheduledEnd,Long updatedStart,Long updatedEnd,Boolean featured,Integer seatCount,Boolean approved,Boolean started,Boolean completed,Boolean valid,Long parentId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchSchedule(BigDecimal version,Long reservableId,String reservableType,Long startDate,Long endDate,String deviceId,Long accountId,Integer timeBucketMins,SecurityContext securityContext)
      throws NotFoundException;
      Response searchScheduledNotifications(BigDecimal version,Long accountId,String groupingId,Long audienceId,String filter,String types,String contentIds,String contentTypes,String parentIds,String parentTypes,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean groupByGroupingId,Boolean returnAudienceAccountCount,SecurityContext securityContext)
      throws NotFoundException;
      Response searchScores(BigDecimal version,Long accountId,String appKey,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchServiceHubs(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,Long retailerId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchShipmentBatch(BigDecimal version,Long hubId,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchShipments(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long ownerId,Long riderId,Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTasks(BigDecimal version,Long accountId,String groupingId,String filter,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTerritories(BigDecimal version,String sortField,Boolean descending,String keyword,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTournaments(BigDecimal version,Long accountId,String appKey,String keyword,String subType,Boolean includeInactive,String missionTypes,String filter,String sortField,Boolean descending,String visibility,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTrackingLegs(BigDecimal version,Long accountId,String appKey,String trackingDeviceId,Long startDate,Long endDate,String tags,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTriggers(BigDecimal version,Long accountId,String groupingId,String filter,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTrips(BigDecimal version,Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long startDate,Long endDate,Boolean matchedHasRoute,Boolean matchedHasDriver,SecurityContext securityContext)
      throws NotFoundException;
      Response searchVehicle(BigDecimal version,Long hubId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchVehicleTypes(BigDecimal version,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long retailerId,Long hubId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchWeather(BigDecimal version,Long regionId,Double latitude,Double longitude,Long timezoneOffset,SecurityContext securityContext)
      throws NotFoundException;
      Response secureLogin(BigDecimal version,String username,String password,String gameType,String deviceId,String charsetName,Double latitude,Double longitude,Boolean returnProfile,String responseFilters,SecurityContext securityContext)
      throws NotFoundException;
      Response secureSignup(BigDecimal version,String deviceId,String username,String password,String name,String inviteToken,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String deviceIdType,String emailAddress,Long assetId,String address,String zipcode,String gender,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String role,String platforms,String tags,String aboutUs,String gameExperience,String categoryIds,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,Double latitude,Double longitude,Boolean acceptedTerms,String charsetName,String gameType,String appKey,String appVersion,String responseType,SecurityContext securityContext)
      throws NotFoundException;
      Response sendBatchNotifications(BigDecimal version,Long accountId,String appKey,String customMessage,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,SecurityContext securityContext)
      throws NotFoundException;
      Response sendByAccount(BigDecimal version,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response sendCustomNotifications(BigDecimal version,String deviceId,Long accountId,String receiverAccountIds,Boolean includeFriendGroup,String appKey,String gameType,String conduit,Long contentId,String contentName,String contentType,Long parentId,String parentType,String actionCategory,String subject,String customMessage,Boolean friendOnlyAPNS,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response sendMFAChallenge(BigDecimal version,String networkUID,String appKey,String thirdPartyToken,Long thirdPartyCredentialId,String deviceId,SecurityContext securityContext)
      throws NotFoundException;
      Response sendNFT(BigDecimal version,Long accountId,String appKey,String vatomCampaignId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response setDriver(BigDecimal version,Long id,Long driverId,SecurityContext securityContext)
      throws NotFoundException;
      Response setMatchToken(BigDecimal version,String deviceId,Long accountId,String matchToken,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response setPointsBalanceAsBusiness(BigDecimal version,Long accountId,String appKey,String vatomUserId,String vatomCampaignId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response simulation(BigDecimal version,String data,Boolean realTime,SecurityContext securityContext)
      throws NotFoundException;
      Response smsBuyOffer(BigDecimal version,String appKey,String body,String from,String currencyType,SecurityContext securityContext)
      throws NotFoundException;
      Response startVideoRender(BigDecimal version,Long accountId,String data,SecurityContext securityContext)
      throws NotFoundException;
      Response statusCSV(BigDecimal version,Long accountId,Long batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response stt(BigDecimal version,Long accountId,String thirdPartyAccountId,String sourceLanguage,String targetLanguage,File _file,String url,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response submitTournamentScore(BigDecimal version,Long accountId,String appKey,Long missionId,Long gameId,Long packId,String scores,Long gameLevelId,SecurityContext securityContext)
      throws NotFoundException;
      Response submitTournamentVote(BigDecimal version,Long accountId,String appKey,Long missionId,Long gameObjectId,String deviceId,Boolean checkIfDeviceAlreadyVoted,SecurityContext securityContext)
      throws NotFoundException;
      Response substituteTournamentPlayer(BigDecimal version,Long accountId,Long missionId,Long packId,Long gameLevelId,SecurityContext securityContext)
      throws NotFoundException;
      Response summarizeTopics(BigDecimal version,Long accountId,String thirdPartyAccountId,String doc,File _file,String url,Integer limit,Integer offset,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response summaryListing(BigDecimal version,Long accountId,Long startDate,String categoryIds,Integer daysToInclude,Boolean useListingOrderIds,SecurityContext securityContext)
      throws NotFoundException;
      Response techTune(BigDecimal version,Long accountId,Integer numFacesExpected,String thirdPartyAccountId,File _file,String url,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response ticketOffers(BigDecimal version,SecurityContext securityContext)
      throws NotFoundException;
      Response topOfferTransactions(BigDecimal version,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response transferUserCoins(BigDecimal version,Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response tts(BigDecimal version,Long accountId,String text,String thirdPartyAccountId,String language,String voice,String paramCallback,SecurityContext securityContext)
      throws NotFoundException;
      Response unassignEmployee(BigDecimal version,Long accountId,Long employeeAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAchievement(BigDecimal version,String deviceId,Long accountId,Long achievementId,String analyticsTag,String title,String description,String rankType,Integer rankIncrement,Integer minIncrement,Boolean nullMinIncrement,Integer maxIncrement,Boolean nullMaxIncrement,Boolean validate,Boolean active,String triggerDefinition,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAchievementTier(BigDecimal version,Long achievementTierId,String deviceId,Long accountId,File icon,Long iconAssetId,String title,String description,Long goalCount,Long missionId,Long gameId,Long packId,Long gameLevelId,Long gameObjectId,Boolean scoreAllInstances,SecurityContext securityContext)
      throws NotFoundException;
      Response updateActveStatus(BigDecimal version,Long accountId,Long connectionAccountId,Boolean active,String deviceId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAlbumCollection(BigDecimal version,Long albumId,String deviceId,Long accountId,String assetsToAdd,String assetsToRemove,Long assetId,File media,String mediaURL,Boolean active,String title,Long startDate,Long endDate,String tags,String description,String albumType,Long albumTypeId,String subType,Boolean publicRead,Boolean publicWrite,Boolean publicDelete,Boolean publicAdd,Double latitude,Double longitude,String locationDescription,String visibility,String cellPhone,String streetAddress,String streetAddress2,String city,String state,String postalCode,String fullAddress,Boolean anonymous,String metaData,String categoryIds,String categoryFilterIds,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,Boolean includeAllAppUsersAsMembers,Boolean includeAudiencesAsMembers,String audienceOperator,String linkedObjectType,Long linkedObjectId,Boolean indexNow,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplication(BigDecimal version,String appKey,String appName,String deviceId,Long accountId,String about,String bundleId,Long appIconAssetId,Long appLogoAssetId,String facebookAppId,String facebookAppSecret,String googleApiKey,Boolean updateEULADate,String eulaVersion,String landingPageUrl,Boolean showInActivities,String activityDescription,String inviteWelcomeText,String invitePageUrl,String urlScheme,String platforms,String downloadUrls,String categoryIds,String scoringType,Integer hintCost,Integer maxScore,Float ticketsPerPoint,Boolean hasGameData,Boolean publicNotifications,Boolean useMatchingAlgorithm,Boolean globalTickets,Float buildVersion,Float apiVersion,String placementName,String placementDescription,String placementSize,Integer placementHeight,Integer placementWidth,Integer placementRefreshInterval,Boolean createObjectStore,Boolean publicContentApproval,Boolean productionMode,Integer minimumSessionLength,Integer sessionGapLength,Boolean localAdsEnabled,String sqootApiKey,String trilatProcessingType,Integer maxSampleSize,Double minRSSI,String modules,Integer authorizedCount,String authorizedServers,String defaultTimezone,String smtpPass,String metaData,String placementMetaData,Boolean ipsFloor,Boolean enableAPNSBadge,Boolean includeInReport,Long defaultAppFilterId,Boolean enableWelcomeEmail,String appleAppId,String appleTeamId,String appleAuthKeyId,File appleAuthKey,String appleIssuerId,String appStoreKeyId,File appStoreKey,File googlePrivateKeyFile,String authorizeNetApiKey,String authorizeNetTransactionKey,String emailSender,String smtpUser,String smtpHost,String vatomBusinessId,String vatomRestClientId,String vatomRestSecretKey,String twilioAccountSID,String twilioAuthToken,String twilioSenderPhoneNumber,String openAISecretKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationActive(BigDecimal version,Long accountId,String appKey,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationConfig(BigDecimal version,Long accountId,Long configId,String appKey,String configVersion,Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationPlacement(BigDecimal version,Long placementId,String deviceId,Long accountId,String name,String description,String size,Integer height,Integer width,Integer refreshInterval,Long defaultImageId,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAsset(BigDecimal version,Long assetId,String deviceId,Long accountId,Long albumId,Long attachedAssetId,Integer versionCode,String versionName,String metaData,String caption,String assetType,String approvalStatus,Long assignedAccountId,File media,String mediaUrl,String mediaString,String mediaStringFileName,String mediaStringContentType,Integer mediaHeight,Integer mediaWidth,File attachedMedia,String attachedMediaUrl,String attachedMediaString,String attachedMediaStringFileName,String attachedMediaStringContentType,Integer attachedMediaHeight,Integer attachedMediaWidth,String locationDescription,String searchTags,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response updateAudience(BigDecimal version,Long accountId,Long audienceId,String name,String description,String searchTags,String gender,String ageGroups,String categoryIds,String applicationIds,String gameExperienceLevel,String devices,String deviceIds,String deviceVersions,String locations,String radius,Boolean active,Boolean sendSuggestion,Integer startTimeOffset,Integer endTimeOffset,String associateDescription,String associateType,Long associateId,String groupingId,String metaData,String visibility,String audienceType,Boolean useOrder,String cohortRegionsData,String appKey,String trilaterationTypes,Boolean uniqueName,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBid(BigDecimal version,Long bidId,String deviceId,Long accountId,Double amountPerView,Double amountPerAction,Double budgetAmount,String budgetSchedule,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBillableEntity(BigDecimal version,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBusinessCoins(BigDecimal version,Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCargoType(BigDecimal version,Long cargoTypeId,CargoType body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCategory(BigDecimal version,Long accountId,Long categoryId,Long parentCategoryId,String name,String description,String type,Long assetId,String externalId,String externalType,String externalCategorySlug,String sqootSlug,Boolean active,String metaData,String searchTags,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCreative(BigDecimal version,Long accountId,Long creativeId,String name,String description,Long assetImageId,String action,String data,String suffix,String type,Double balance,Boolean active,Long referenceId,String appVersion,Long missionId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCredential(BigDecimal version,String networkUID,String thirdPartyId,String appKey,String deviceId,String thirdPartyName,String thirdPartyToken,String responseFilters,String metaData,String thirdPartyRefreshToken,SecurityContext securityContext)
      throws NotFoundException;
      Response updateData(BigDecimal version,String objectName,String objectId,Long accountId,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateDisbursement(BigDecimal version,Long accountId,Long disbursementId,BigDecimal amount,String provider,Long scheduledDate,String title,String comment,String externalId,Boolean retry,String introspectionParams,SecurityContext securityContext)
      throws NotFoundException;
      Response updateEmployee(BigDecimal version,Long accountId,Long employeeAccountId,Long managerAccountId,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,Long assetId,String gender,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,String role,Boolean active,String password,String retailerLocationIds,String settingsAppKey,String appBlob,String assignedDeviceId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateEvent(BigDecimal version,Long accountId,Long eventId,String retailerLocationIds,String title,String subTitle,String details,String categoryIds,String filterIds,Boolean active,Long imageAssetId,Long redeemableStart,Long redeemableEnd,SecurityContext securityContext)
      throws NotFoundException;
      Response updateEventGuestList(BigDecimal version,Long accountId,String appKey,String vatomEventId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateFilter(BigDecimal version,Long accountId,Long filterId,Long parentFilterId,String name,String description,String externalId,String externalType,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateFlagThreshold(BigDecimal version,String itemBeingFlaggedType,Long threshold,String appKey,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateGame(BigDecimal version,Long accountId,Long gameId,String appKey,String title,String description,String metaData,String packIds,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateGameLevel(BigDecimal version,Long accountId,Long levelId,String appKey,String name,String description,String difficulty,String appVersion,Long assetImageId,Long assetIconId,String gameData,String gameDataSuffix,String visibility,Boolean friendGroup,String connectionIds,String connectionGroupIds,Double balance,Boolean active,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String tutorialTitle,String tutorialMessage,String tutorialAlignment,Long tutorialImageAssetId,Long offerId,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLeaderboard(BigDecimal version,Long leaderboardId,Long accountId,String appKey,String rankType,String leaderboardMode,String sortField,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,Boolean active,String title,String description,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateListing(BigDecimal version,Long accountId,Long listingId,String filterIds,String name,String description,Long start,Long end,String locationName,String locationDescription,Boolean isPrivate,String externalId,String externalId2,String externalGroupId,Boolean active,String metaData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLocation(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,Long clientTime,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLocationV2(BigDecimal version,Long id,Location body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateLocations(BigDecimal version,Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMedia(BigDecimal version,Long accountId,Long mediaId,String retailerLocationIds,String offerLocations,String title,String subTitle,String details,String subDetails,String finePrint,String barcodeType,String barcodeEntry,String externalRedeemOptions,String externalUrl,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,String ticketPriceType,Long ticketPrice,Double fullPrice,Double discountPrice,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String specialOfferType,String offerVisibility,String categoryIds,String filterIds,Boolean active,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String conditionType,String isbn,String asin,String catalogNumbers,Long availabilityDate,String parentalRating,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMission(BigDecimal version,Long accountId,Long missionId,String title,String description,String subType,String metaData,Long startDate,Long endDate,Boolean active,String gameLevelIds,String creativeIds,String audienceIds,Long offerId,Double balance,Boolean advancedReporting,Boolean allocateTickets,Long ticketCount,String ticketType,Long points,String applicationIds,String devices,String deviceIds,String deviceVersions,String locations,String radius,SecurityContext securityContext)
      throws NotFoundException;
      Response updateMissionInvite(BigDecimal version,String deviceId,Long accountId,String appKey,Long missionId,Long missionInviteId,Long packId,Long gameLevelId,String status,String permissionableType,Long permissionableId,Boolean includeGameData,SecurityContext securityContext)
      throws NotFoundException;
      Response updateNetwork(BigDecimal version,Long accountId,String networkUID,String name,String description,Boolean enableIntrospection,String introspectionMethod,String introspectionURL,String introspectionParams,String requiredRootField,Boolean enableMFA,Integer sizeMFA,Integer shelfLifeMFA,String oauthTokenURL,File oauthPrivateKey,File oauthPublicKey,String oauthClientId,String oauthSecretKey,String body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateNote(BigDecimal version,Long noteId,String deviceId,Long accountId,String comment,String noteType,String assetIds,String tags,String permissionableType,Long permissionableId,String appKey,String locationDescription,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,Boolean active,Boolean updateAsset,Boolean assetReturnNulls,Long assetAlbumId,Long assetCollectionId,String assetAddToDefaultAlbum,Boolean assetAddToMediaLibrary,Integer assetVersionCode,String assetVersionName,String assetMetaData,String assetCaption,File assetMedia,String assetMediaUrl,String assetMediaString,String assetMediaStringFileName,String assetMediaStringContentType,File assetAttachedMedia,String assetAttachedMediaUrl,String assetAttachedMediaString,String assetAttachedMediaStringFileName,String assetAttachedMediaStringContentType,String assetLocationDescription,String assetApp,String assetSearchTags,Double assetLatitude,Double assetLongitude,SecurityContext securityContext)
      throws NotFoundException;
      Response updateNotificationTemplate(BigDecimal version,Long accountId,Long notificationTemplateId,String title,String body,String tags,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOffer(BigDecimal version,Long offerId,Boolean includeOfferLocations,String deviceId,Long accountId,Long parentOfferId,String retailerLocationIds,String offerLocations,String tags,String title,String subTitle,String details,String subDetails,String finePrint,String barcodeType,String barcodeEntry,String externalRedeemOptions,String externalUrl,String externalId,String ticketsRewardType,Long ticketsReward,Long activated,Long expires,Boolean noExpiration,Integer availableLimit,Integer availableLimitPerUser,Integer addedLimit,Integer viewLimit,Integer maxPrints,String ticketPriceType,Long ticketPrice,Double fullPrice,Double discountPrice,Boolean showRemaining,Boolean showRedeemed,Boolean replaced,Boolean featured,String offerType,String specialOfferType,String offerVisibility,String categoryIds,String filterIds,Boolean active,Long barcodeAssetId,Long imageAssetId,Long imageAssetId1,Long imageAssetId2,Long imageAssetId3,Long imageAssetId4,Long imageAssetId5,String publisher,Long redeemableStart,Long redeemableEnd,String brand,String productType,String conditionType,String isbn,String asin,String catalogNumbers,String department,String features,Double minimumPrice,Double width,Double height,Double depth,Double weight,String unit,String studio,String parentalRating,Long publishDate,Long availabilityDate,Long sizeId,Long listingId,String mediaType,Integer duration,String author,Long releaseDate,String collectionIds,Integer rebootTimeHour,Integer rebootTimeMinute,Integer idleTimeoutInSecond,String serialNumber,String udid,String deviceType,Double devicePower,Double deviceInterference,String availability,String availabilitySummary,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferStatus(BigDecimal version,String offerIds,Boolean active,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferTransaction(BigDecimal version,Long transactionId,Integer status,String deviceId,Long accountId,Long offerLocationId,String currencyType,Boolean usePoints,String appKey,Double latitude,Double longitude,String metaData,Boolean returnFullResponse,String exceptionMembershipOfferIds,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOfferTransactionStatus(BigDecimal version,String deviceId,Long accountId,Double latitude,Double longitude,Long statusId,String name,String description,Integer code,String role,Boolean active,String applicationIds,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrder(BigDecimal version,Long orderId,String appKey,String cart,String deviceId,Long accountId,Long paymentTransactionId,String description,String currencyType,Long paymentMethodId,String externalPaymentId,Long externalDate,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePack(BigDecimal version,Long accountId,Long packId,Boolean allocateTickets,Long ticketCount,String title,String description,String searchTags,Boolean active,String gameType,String appKey,String packType,Long packOrder,String sequenceType,Long backgroundId,Long imageId,Long startDate,Long endDate,String authorOverride,Integer price,String priceType,String gameLevelIds,Boolean inGame,Boolean highest,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePersona(BigDecimal version,Long accountId,Long personaId,String title,String previewAccounts,Boolean active,Long date,Integer age,String gender,String gameExperienceLevel,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePostalCode(BigDecimal version,Long accountId,Long postalCodeId,String code,Double latitude,Double longitude,String stateCode,String city,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updatePurchaseItem(BigDecimal version,Long purchaseItemId,String deviceId,Long accountId,String name,String description,Integer tickets,Float price,String purchaseType,String purchaseCode,String secretKey,Integer purchaseLimit,String serviceAction,Long coverAssetId,Long promoAssetId,Boolean giftable,Boolean assetable,Boolean active,Boolean allocateTickets,String ticketType,Long points,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateQuestion(BigDecimal version,Long questionId,Long accountId,Long ticketCount,String question,String answers,String tags,String videoURL,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response updateQuestionsInLevel(BigDecimal version,Long levelId,Long accountId,String questionIds,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRankings(BigDecimal version,Long accountId,String appKey,String rankType,Long increment,Long timeIncrement,String tag,Long startDate,Long endDate,Boolean updateGlobal,Boolean createLeaderboard,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRating(BigDecimal version,Long ratingId,String deviceId,Long accountId,Integer ratingValue,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRecurrenceLocations(BigDecimal version,Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRecurrenceShipments(BigDecimal version,Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRegion(BigDecimal version,Long accountId,Long regionId,String regionClass,String shortName,String fullName,String parentIds,String childrenIds,String postalCodeIds,String locations,Long retailerLocationId,String visibility,String categoryIds,String filterIds,Long start,Long end,String polygon,String metaData,Double latitude,Double longitude,Integer versionCode,Boolean root,Boolean active,Boolean clearLists,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRetailer(BigDecimal version,Long retailerId,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String facebookUrl,String twitterUrl,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String metaData,String searchTags,String retailerType,String visibility,Boolean active,String responseFormat,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRetailerLocations(BigDecimal version,Long retailerLocationId,String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String internalId,String detailsHeader,String detailsBody,String hours,File logo,Long logoAssetId,File picture1,Long picture1AssetId,File picture2,Long picture2AssetId,String categoryIds,String filterIds,Double latitude,Double longitude,String building,String googlePlaceId,String yelpId,String metaData,String paymentProvider,Boolean active,Boolean publicLocation,String locationType,String audienceIds,String audienceIdsToAdd,String audienceIdsToRemove,String responseFormat,String tags,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRoute(BigDecimal version,Long routeId,Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRouteSettings(BigDecimal version,Long routeSettingsId,RouteSettings body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRouteStop(BigDecimal version,Long routeId,Long stopId,Stop body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateScheduledNotification(BigDecimal version,Long scheduledNotificationId,Long accountId,String name,String type,String message,String payload,Long contentId,String contentName,String contentType,Long parentId,String parentType,String appKey,String groupingId,String connectionGroupIds,String connectionAccountIds,Long audienceId,String audienceIds,String albumIds,Long reportId,String reportParams,String endpointURL,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String cronType,String metaData,String conditionalInput,String templateType,String visibility,Boolean active,String errorMessage,String status,Boolean updateByGroupingId,Boolean sendNow,String eventType,String deepLinkURI,Boolean sendToAll,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSecureApplication(BigDecimal version,Long accountId,String appKey,Boolean active,File keyCert,File trustStore,String username,String password,String biometricType,String biometricPosition,String biometricPosition2,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSettings(BigDecimal version,String deviceId,Long accountId,String blockedNotifications,String suggestionMethod,Integer suggestionCount,Integer suggestionTimeFrame,Boolean showOthersExactLocation,Boolean showAsZipcode,Boolean showExactLocation,String favoriteVisibility,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipment(BigDecimal version,Long id,Shipment body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipmentStatus(BigDecimal version,Long id,Map<String, Boolean> body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateShipments(BigDecimal version,Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSpace(BigDecimal version,Long accountId,String appKey,String vatomSpaceId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateStop(BigDecimal version,Long id,Stop body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSubscription(BigDecimal version,Long accountId,Long planId,String promoCode,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTask(BigDecimal version,Long taskId,Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTerritory(BigDecimal version,Long accountId,Long territoryId,String name,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTournament(BigDecimal version,Long accountId,Long missionId,String title,String subType,Long imageAssetId,Integer secondsBetweenLevels,Integer secondsForTieBreaker,Integer secondsBetweenPacks,Integer maximumLevelLength,Integer costToPlay,String costToPlayType,Integer minimumToPlay,Integer startingLimit,Integer availableLimit,String description,String metaData,Long startDate,String audienceIds,Boolean active,Boolean enableBuyBack,String offerIds,Long offerAssetId,Boolean fixedReward,String splitReward,Boolean allocateTickets,String tournamentData,String visibility,Integer preliminaryGroups,String preliminaryGroupAdvancements,Boolean enableMultipleEntries,Boolean enableMultipleVotes,Boolean featured,String winnerTag,String tieTag,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTrigger(BigDecimal version,Long triggerId,Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTrip(BigDecimal version,Long id,Trip body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTripNotifications(BigDecimal version,Long id,String notifications,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserAchievement(BigDecimal version,Long accountId,Long achievementId,String tag,Long customId,Long increment,Long startDate,Long endDate,Boolean returnProgress,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserCoinsAsBusiness(BigDecimal version,Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserProfile(BigDecimal version,Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVatomEvent(BigDecimal version,Long accountId,String appKey,String vatomEventId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVehicle(BigDecimal version,Long id,String vehicle,Vehicle body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVehicleType(BigDecimal version,Long vehicleTypeId,String vehicleType,VehicleType body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateWord(BigDecimal version,Long wordId,Long accountId,Long ticketCount,String wordText,String definition,Long assetId,Boolean active,Boolean allocateTickets,String ticketType,Long points,SecurityContext securityContext)
      throws NotFoundException;
      Response updateWordsInLevel(BigDecimal version,Long levelId,Long accountId,String wordIds,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadApplicationCertificate(BigDecimal version,String appKey,String deviceId,Long accountId,File certificate,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadCSV(BigDecimal version,Long accountId,String uploadType,File importFile,String fileFormat,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response usage(BigDecimal version,String tag,String deviceId,Long accountId,Long applicationId,String appKey,String appVersion,String device,String deviceType,String deviceOS,String model,Double latitude,Double longitude,Long customId,String customType,Long achievementIncrement,String city,String state,String country,String zip,String locationDescription,Long clientTime,String errorMessage,String ip,String userAgent,Boolean backgroundEvent,String customMessage,String customMessage2,Double customValue,Double customValue2,Long customLong,Long customLong2,SecurityContext securityContext)
      throws NotFoundException;
      Response usageBatch(BigDecimal version,String appKey,String device,String data,String deviceId,Long accountId,String appVersion,String deviceType,String deviceOS,String model,Boolean updateRanking,Boolean returnSummaryResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response validateAccountSignup(BigDecimal version,String token,SecurityContext securityContext)
      throws NotFoundException;
      Response validatePasswordReset(BigDecimal version,String token,SecurityContext securityContext)
      throws NotFoundException;
      Response voteOnAlbumContest(BigDecimal version,Long albumContestId,Long albumId,String deviceId,Long accountId,String contestType,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response whoHasFavorited(BigDecimal version,Long favoritableId,String favoritableType,Integer start,Integer limit,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,SecurityContext securityContext)
      throws NotFoundException;


}
