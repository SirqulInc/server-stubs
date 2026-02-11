package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.AccountListResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import java.io.File;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ApplicationApiService {
      Response createApplication(String appName,String deviceId,Long accountId,String about,String bundleId,Long appIconAssetId,Long appLogoAssetId,String facebookAppId,String facebookAppSecret,String googleApiKey,Boolean updateEULADate,String eulaVersion,String landingPageUrl,Boolean showInActivities,String activityDescription,String inviteWelcomeText,String invitePageUrl,String urlScheme,String platforms,String downloadUrls,String categoryIds,String scoringType,Integer hintCost,Integer maxScore,Float ticketsPerPoint,Boolean hasGameData,Boolean publicNotifications,Boolean useMatchingAlgorithm,Boolean globalTickets,Float buildVersion,Float apiVersion,String placementName,String placementDescription,String placementSize,Integer placementHeight,Integer placementWidth,Integer placementRefreshInterval,Boolean createObjectStore,Boolean publicContentApproval,Boolean productionMode,Integer minimumSessionLength,Integer sessionGapLength,Boolean localAdsEnabled,String sqootApiKey,String trilatProcessingType,Integer maxSampleSize,Double minRSSI,String modules,Integer authorizedCount,String authorizedServers,String defaultTimezone,String smtpPass,String metaData,String placementMetaData,Boolean ipsFloor,Boolean enableAPNSBadge,Boolean includeInReport,Long defaultAppFilterId,Boolean enableWelcomeEmail,String appleAppId,String appleTeamId,String appleAuthKeyId,File appleAuthKey,String appleIssuerId,String appStoreKeyId,File appStoreKey,File googlePrivateKeyFile,String authorizeNetApiKey,String authorizeNetTransactionKey,String emailSender,String smtpUser,String smtpHost,String vatomBusinessId,String vatomRestClientId,String vatomRestSecretKey,String twilioAccountSID,String twilioAuthToken,String twilioSenderPhoneNumber,String openAISecretKey,SecurityContext securityContext)
      throws NotFoundException;
      Response createApplicationPlacement(String appKey,String size,String deviceId,Long accountId,String name,String description,Integer height,Integer width,Integer refreshInterval,Long defaultImageId,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplication(Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplicationPlacement(Long placementId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplication(String appKey,Long applicationId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationPlacement(Long placementId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationVersions(SecurityContext securityContext)
      throws NotFoundException;
      Response getUniqueUsersByApp(String appKey,String q,String keyword,Long since,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response listApplications(Long accountId,String q,String keyword,String platforms,String deviceIds,String deviceVersions,String categoryIds,String sortField,Boolean hasAds,Boolean publicNotifications,Boolean filterBillable,Boolean filterContentAdmin,Boolean descending,Integer i,Integer start,Integer l,Integer limit,String applicationIds,Boolean hasObjectStore,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationPlacement(String appKey,String deviceId,Long accountId,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationSettings(String deviceId,Long accountId,Long connectionAccountId,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplications(String deviceId,Long accountId,Double latitude,Double longitude,String q,String keyword,String qSearchFields,String sortField,Boolean descending,Integer i,Integer start,Integer l,Integer limit,Boolean hasAds,Boolean publicNotifications,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplication(String appKey,String appName,String deviceId,Long accountId,String about,String bundleId,Long appIconAssetId,Long appLogoAssetId,String facebookAppId,String facebookAppSecret,String googleApiKey,Boolean updateEULADate,String eulaVersion,String landingPageUrl,Boolean showInActivities,String activityDescription,String inviteWelcomeText,String invitePageUrl,String urlScheme,String platforms,String downloadUrls,String categoryIds,String scoringType,Integer hintCost,Integer maxScore,Float ticketsPerPoint,Boolean hasGameData,Boolean publicNotifications,Boolean useMatchingAlgorithm,Boolean globalTickets,Float buildVersion,Float apiVersion,String placementName,String placementDescription,String placementSize,Integer placementHeight,Integer placementWidth,Integer placementRefreshInterval,Boolean createObjectStore,Boolean publicContentApproval,Boolean productionMode,Integer minimumSessionLength,Integer sessionGapLength,Boolean localAdsEnabled,String sqootApiKey,String trilatProcessingType,Integer maxSampleSize,Double minRSSI,String modules,Integer authorizedCount,String authorizedServers,String defaultTimezone,String smtpPass,String metaData,String placementMetaData,Boolean ipsFloor,Boolean enableAPNSBadge,Boolean includeInReport,Long defaultAppFilterId,Boolean enableWelcomeEmail,String appleAppId,String appleTeamId,String appleAuthKeyId,File appleAuthKey,String appleIssuerId,String appStoreKeyId,File appStoreKey,File googlePrivateKeyFile,String authorizeNetApiKey,String authorizeNetTransactionKey,String emailSender,String smtpUser,String smtpHost,String vatomBusinessId,String vatomRestClientId,String vatomRestSecretKey,String twilioAccountSID,String twilioAuthToken,String twilioSenderPhoneNumber,String openAISecretKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationActive(Long accountId,String appKey,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationPlacement(Long placementId,String deviceId,Long accountId,String name,String description,String size,Integer height,Integer width,Integer refreshInterval,Long defaultImageId,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadApplicationCertificate(String appKey,String deviceId,Long accountId,File certificate,SecurityContext securityContext)
      throws NotFoundException;


}
