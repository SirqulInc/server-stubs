package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AssetListResponse;
import java.math.BigDecimal;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserSettingsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApiServiceImpl implements AccountApiService {
      public Response accountLocationSearch(String deviceId,Long accountId,String q,String keyword,String postalCode,Double latitude,Double longitude,String appKey,Double range,Long locationLastUpdated,String gender,Integer minAge,Integer maxAge,Integer companionshipIndex,Integer i,Integer start,Integer l,Integer limit,String searchMode,String sortField,Boolean descending,String roles,String tags,String experience,String categoryIds,String audienceIds,String audienceOperator,Boolean updateCurrentLocation,Boolean updatePreferredSettings,Boolean showExactLocations,Boolean showConnectionToSearcher,Long flagCountMinimum,Boolean verifiedUserOnly,Boolean contentAdminOnly,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response blockAccount(Long accountIdBeingBlocked,String deviceId,Long accountId,Boolean blockFlagValue,Boolean removeFromGroupsIfBlocked,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createAccount(String username,String password,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String deviceId,String deviceIdType,String emailAddress,Long assetId,String streetAddress,String zipcode,String gender,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String role,String platforms,String tags,String aboutUs,String gameExperience,String categoryIds,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,Double latitude,Double longitude,Boolean acceptedTerms,String inviteToken,Long referralAccountId,Boolean sendValidation,String gameType,String appKey,String appVersion,String responseType,String audienceIdsToAdd,String appBlob,Boolean appEnablePush,Boolean appEnableSMS,Boolean appEnableEmail,String locationVisibility,Double homeLatitude,Double homeLongitude,String appNickname,Long personalAudienceId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response editAccount(String deviceId,Long accountId,Long connectionAccountId,String role,Long assetId,String name,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String gender,Integer age,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String emailAddress,String streetAddress,String streetAddress2,String city,String state,String zipcode,String country,Boolean makeProfileInfoPublic,Boolean makeGameInfoPublic,Boolean makeFriendsInfoPublic,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,String platforms,String tags,String aboutUs,String matchToken,String gameExperience,String categories,String categoryIds,String responseFilters,Boolean showAsZipcode,Boolean showExactLocation,Boolean showOthersExactLocation,Boolean acceptedTerms,String locationVisibility,String appBlob,Boolean appEnablePush,Boolean appEnableSMS,Boolean appEnableEmail,String gameType,String appKey,Double latitude,Double longitude,Boolean returnProfile,String audienceIdsToAdd,String audienceIdsToRemove,Long referralAccountId,String appNickname,Long personalAudienceId,String nonGuestUsername,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response editUsername(String deviceId,Long accountId,String emailAddress,String username,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getAccount(Boolean returnNulls,String deviceId,Long accountId,String connectionAccountEmail,Long connectionAccountId,String responseFilters,String gameType,String appKey,String purchaseType,Boolean updateViewedDate,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getLocationByTrilateration(Long accountId,Double latitude,Double longitude,String data,String responseFilters,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getProfileAssets(Boolean returnNulls,String deviceId,Long accountId,Long ownerId,String mediaTypes,String mimeTypes,String sortField,Boolean descending,Double latitude,Double longitude,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getReferralList(Long accountId,String appKey,String retrieveType,BigDecimal levelLimit,BigDecimal ancestorLevelLimit,BigDecimal childrenLevelLimit,BigDecimal ancestorListStart,BigDecimal ancestorListLimit,BigDecimal childrenListStart,BigDecimal childrenListLimit,Boolean childrenChildren,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getSettings(String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response loginDelegate(String accessToken,String appKey,String deviceId,String accessTokenSecret,Long delegatedAccountId,String delegatedUsername,String networkUID,Integer ageRestriction,String responseFilters,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response loginGeneral(String accessToken,String networkUID,String appKey,String deviceId,String deviceIdType,String accessTokenSecret,Integer ageRestriction,String responseFilters,Double latitude,Double longitude,Boolean emailMatch,Long chosenAccountId,Long thirdPartyCredentialId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response loginUsername(String username,String password,String deviceId,Double latitude,Double longitude,String app,String gameType,String appKey,Boolean returnProfile,String responseFilters,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response logout(String deviceId,String deviceIdType,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response mergeAccount(Long mergeAccountId,String appKey,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response passwordChange(Long accountId,String oldPassword,String newPassword,String confirmPassword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response passwordReset(String token,String password,String confirm,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response requestPasswordReset(String email,String from,String domain,String subUrl,String referer,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response requestValidateAccount(Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchAccounts(Long accountId,String appKey,String keyword,Double latitude,Double longitude,Double radius,String gender,String gameExperience,Integer age,String categoryIds,Boolean returnNulls,String responseFilters,String purchaseType,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response secureLogin(String username,String password,String gameType,String deviceId,String charsetName,Double latitude,Double longitude,Boolean returnProfile,String responseFilters,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response secureSignup(String deviceId,String username,String password,String name,String inviteToken,String prefixName,String firstName,String middleName,String lastName,String suffixName,String title,String deviceIdType,String emailAddress,Long assetId,String address,String zipcode,String gender,Long birthday,String homePhone,String cellPhone,String cellPhoneCarrier,String businessPhone,String role,String platforms,String tags,String aboutUs,String gameExperience,String categoryIds,String hometown,String height,Integer heightIndex,String ethnicity,String bodyType,String maritalStatus,String children,String religion,String education,Integer educationIndex,String smoke,String drink,String companionship,Integer companionshipIndex,Integer preferredMinAge,Integer preferredMaxAge,Integer preferredMinHeight,Integer preferredMaxHeight,String preferredGender,String preferredEducation,Integer preferredEducationIndex,String preferredBodyType,String preferredEthnicity,String preferredLocation,Double preferredLocationRange,Double latitude,Double longitude,Boolean acceptedTerms,String charsetName,String gameType,String appKey,String appVersion,String responseType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateActveStatus(Long accountId,Long connectionAccountId,Boolean active,String deviceId,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateLocation(String deviceId,Long accountId,Double latitude,Double longitude,Long clientTime,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateSettings(String deviceId,Long accountId,String blockedNotifications,String suggestionMethod,Integer suggestionCount,Integer suggestionTimeFrame,Boolean showOthersExactLocation,Boolean showAsZipcode,Boolean showExactLocation,String favoriteVisibility,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response validateAccountSignup(String token,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response validatePasswordReset(String token,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
