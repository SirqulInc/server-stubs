package controllers;

import apimodels.AccountLoginResponse;
import apimodels.AssetListResponse;
import java.math.BigDecimal;
import apimodels.ProfileInfoResponse;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.UserLocationSearchResponse;
import apimodels.UserSettingsResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class AccountApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result accountLocationSearchHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String postalCode, Double latitude, Double longitude, String appKey, Double range, Long locationLastUpdated, String gender, Integer minAge, Integer maxAge, Integer companionshipIndex, Integer i, Integer start, Integer l, Integer limit, String searchMode, String sortField, Boolean descending, String roles, String tags, String experience, String categoryIds, String audienceIds, String audienceOperator, Boolean updateCurrentLocation, Boolean updatePreferredSettings, Boolean showExactLocations, Boolean showConnectionToSearcher, Long flagCountMinimum, Boolean verifiedUserOnly, Boolean contentAdminOnly) throws Exception {
        UserLocationSearchResponse obj = accountLocationSearch(request, version, deviceId, accountId, q, keyword, postalCode, latitude, longitude, appKey, range, locationLastUpdated, gender, minAge, maxAge, companionshipIndex, i, start, l, limit, searchMode, sortField, descending, roles, tags, experience, categoryIds, audienceIds, audienceOperator, updateCurrentLocation, updatePreferredSettings, showExactLocations, showConnectionToSearcher, flagCountMinimum, verifiedUserOnly, contentAdminOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserLocationSearchResponse accountLocationSearch(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String postalCode, Double latitude, Double longitude, String appKey, Double range, Long locationLastUpdated, String gender, Integer minAge, Integer maxAge, Integer companionshipIndex, Integer i, Integer start, Integer l, Integer limit, String searchMode, String sortField, Boolean descending, String roles, String tags, String experience, String categoryIds, String audienceIds, String audienceOperator, Boolean updateCurrentLocation, Boolean updatePreferredSettings, Boolean showExactLocations, Boolean showConnectionToSearcher, Long flagCountMinimum, Boolean verifiedUserOnly, Boolean contentAdminOnly) throws Exception;

    public Result blockAccountHttp(Http.Request request, BigDecimal version, @NotNull Long accountIdBeingBlocked, String deviceId, Long accountId, Boolean blockFlagValue, Boolean removeFromGroupsIfBlocked, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = blockAccount(request, version, accountIdBeingBlocked, deviceId, accountId, blockFlagValue, removeFromGroupsIfBlocked, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse blockAccount(Http.Request request, BigDecimal version, @NotNull Long accountIdBeingBlocked, String deviceId, Long accountId, Boolean blockFlagValue, Boolean removeFromGroupsIfBlocked, Double latitude, Double longitude) throws Exception;

    public Result createAccountHttp(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceId, String deviceIdType, String emailAddress, Long assetId, String streetAddress, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String inviteToken, Long referralAccountId, Boolean sendValidation, String gameType, String appKey, String appVersion, String responseType, String audienceIdsToAdd, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String locationVisibility, Double homeLatitude, Double homeLongitude, String appNickname, Long personalAudienceId) throws Exception {
        AccountLoginResponse obj = createAccount(request, version, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, deviceId, deviceIdType, emailAddress, assetId, streetAddress, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, inviteToken, referralAccountId, sendValidation, gameType, appKey, appVersion, responseType, audienceIdsToAdd, appBlob, appEnablePush, appEnableSMS, appEnableEmail, locationVisibility, homeLatitude, homeLongitude, appNickname, personalAudienceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AccountLoginResponse createAccount(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceId, String deviceIdType, String emailAddress, Long assetId, String streetAddress, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String inviteToken, Long referralAccountId, Boolean sendValidation, String gameType, String appKey, String appVersion, String responseType, String audienceIdsToAdd, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String locationVisibility, Double homeLatitude, Double homeLongitude, String appNickname, Long personalAudienceId) throws Exception;

    public Result editAccountHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String role, Long assetId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String gender, Integer age, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, Boolean makeProfileInfoPublic, Boolean makeGameInfoPublic, Boolean makeFriendsInfoPublic, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, String platforms, String tags, String aboutUs, String matchToken, String gameExperience, String categories, String categoryIds, String responseFilters, Boolean showAsZipcode, Boolean showExactLocation, Boolean showOthersExactLocation, Boolean acceptedTerms, String locationVisibility, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String gameType, String appKey, Double latitude, Double longitude, Boolean returnProfile, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId, String appNickname, Long personalAudienceId, String nonGuestUsername) throws Exception {
        ProfileInfoResponse obj = editAccount(request, version, deviceId, accountId, connectionAccountId, role, assetId, name, prefixName, firstName, middleName, lastName, suffixName, title, gender, age, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, makeProfileInfoPublic, makeGameInfoPublic, makeFriendsInfoPublic, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, platforms, tags, aboutUs, matchToken, gameExperience, categories, categoryIds, responseFilters, showAsZipcode, showExactLocation, showOthersExactLocation, acceptedTerms, locationVisibility, appBlob, appEnablePush, appEnableSMS, appEnableEmail, gameType, appKey, latitude, longitude, returnProfile, audienceIdsToAdd, audienceIdsToRemove, referralAccountId, appNickname, personalAudienceId, nonGuestUsername);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileInfoResponse editAccount(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String role, Long assetId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String gender, Integer age, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, Boolean makeProfileInfoPublic, Boolean makeGameInfoPublic, Boolean makeFriendsInfoPublic, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, String platforms, String tags, String aboutUs, String matchToken, String gameExperience, String categories, String categoryIds, String responseFilters, Boolean showAsZipcode, Boolean showExactLocation, Boolean showOthersExactLocation, Boolean acceptedTerms, String locationVisibility, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String gameType, String appKey, Double latitude, Double longitude, Boolean returnProfile, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId, String appNickname, Long personalAudienceId, String nonGuestUsername) throws Exception;

    public Result editUsernameHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String emailAddress, String username) throws Exception {
        SirqulResponse obj = editUsername(request, version, deviceId, accountId, emailAddress, username);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse editUsername(Http.Request request, BigDecimal version, String deviceId, Long accountId, String emailAddress, String username) throws Exception;

    public Result getAccountHttp(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String responseFilters, String gameType, String appKey, String purchaseType, Boolean updateViewedDate, Double latitude, Double longitude) throws Exception {
        ProfileResponse obj = getAccount(request, version, returnNulls, deviceId, accountId, connectionAccountEmail, connectionAccountId, responseFilters, gameType, appKey, purchaseType, updateViewedDate, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse getAccount(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String responseFilters, String gameType, String appKey, String purchaseType, Boolean updateViewedDate, Double latitude, Double longitude) throws Exception;

    public Result getProfileAssetsHttp(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long ownerId, String mediaTypes, String mimeTypes, String sortField, Boolean descending, Double latitude, Double longitude, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        AssetListResponse obj = getProfileAssets(request, version, returnNulls, deviceId, accountId, ownerId, mediaTypes, mimeTypes, sortField, descending, latitude, longitude, i, start, l, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssetListResponse getProfileAssets(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long ownerId, String mediaTypes, String mimeTypes, String sortField, Boolean descending, Double latitude, Double longitude, Integer i, Integer start, Integer l, Integer limit) throws Exception;

    public Result getReferralListHttp(Http.Request request, BigDecimal version, Long accountId, String appKey, String retrieveType, BigDecimal levelLimit, BigDecimal ancestorLevelLimit, BigDecimal childrenLevelLimit, BigDecimal ancestorListStart, BigDecimal ancestorListLimit, BigDecimal childrenListStart, BigDecimal childrenListLimit, Boolean childrenChildren) throws Exception {
        getReferralList(request, version, accountId, appKey, retrieveType, levelLimit, ancestorLevelLimit, childrenLevelLimit, ancestorListStart, ancestorListLimit, childrenListStart, childrenListLimit, childrenChildren);
        return ok();

    }

    public abstract void getReferralList(Http.Request request, BigDecimal version, Long accountId, String appKey, String retrieveType, BigDecimal levelLimit, BigDecimal ancestorLevelLimit, BigDecimal childrenLevelLimit, BigDecimal ancestorListStart, BigDecimal ancestorListLimit, BigDecimal childrenListStart, BigDecimal childrenListLimit, Boolean childrenChildren) throws Exception;

    public Result getSettingsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        UserSettingsResponse obj = getSettings(request, version, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserSettingsResponse getSettings(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result loginDelegateHttp(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String appKey, String deviceId, String accessTokenSecret, Long delegatedAccountId, String delegatedUsername, String networkUID, Integer ageRestriction, String responseFilters, Double latitude, Double longitude) throws Exception {
        ProfileResponse obj = loginDelegate(request, version, accessToken, appKey, deviceId, accessTokenSecret, delegatedAccountId, delegatedUsername, networkUID, ageRestriction, responseFilters, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse loginDelegate(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String appKey, String deviceId, String accessTokenSecret, Long delegatedAccountId, String delegatedUsername, String networkUID, Integer ageRestriction, String responseFilters, Double latitude, Double longitude) throws Exception;

    public Result loginGeneralHttp(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String networkUID, @NotNull String appKey, String deviceId, String deviceIdType, String accessTokenSecret, Integer ageRestriction, String responseFilters, Double latitude, Double longitude, Boolean emailMatch, Long chosenAccountId, Long thirdPartyCredentialId) throws Exception {
        ProfileResponse obj = loginGeneral(request, version, accessToken, networkUID, appKey, deviceId, deviceIdType, accessTokenSecret, ageRestriction, responseFilters, latitude, longitude, emailMatch, chosenAccountId, thirdPartyCredentialId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse loginGeneral(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String networkUID, @NotNull String appKey, String deviceId, String deviceIdType, String accessTokenSecret, Integer ageRestriction, String responseFilters, Double latitude, Double longitude, Boolean emailMatch, Long chosenAccountId, Long thirdPartyCredentialId) throws Exception;

    public Result loginUsernameHttp(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String app, String gameType, String appKey, Boolean returnProfile, String responseFilters) throws Exception {
        ProfileResponse obj = loginUsername(request, version, username, password, deviceId, latitude, longitude, app, gameType, appKey, returnProfile, responseFilters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse loginUsername(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String app, String gameType, String appKey, Boolean returnProfile, String responseFilters) throws Exception;

    public Result logoutHttp(Http.Request request, BigDecimal version, String deviceId, String deviceIdType, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = logout(request, version, deviceId, deviceIdType, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse logout(Http.Request request, BigDecimal version, String deviceId, String deviceIdType, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result mergeAccountHttp(Http.Request request, BigDecimal version, @NotNull Long mergeAccountId, @NotNull String appKey, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = mergeAccount(request, version, mergeAccountId, appKey, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse mergeAccount(Http.Request request, BigDecimal version, @NotNull Long mergeAccountId, @NotNull String appKey, String deviceId, Long accountId) throws Exception;

    public Result passwordChangeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String oldPassword, @NotNull String newPassword, @NotNull String confirmPassword) throws Exception {
        SirqulResponse obj = passwordChange(request, version, accountId, oldPassword, newPassword, confirmPassword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse passwordChange(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String oldPassword, @NotNull String newPassword, @NotNull String confirmPassword) throws Exception;

    public Result passwordResetHttp(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String password, @NotNull String confirm) throws Exception {
        SirqulResponse obj = passwordReset(request, version, token, password, confirm);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse passwordReset(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String password, @NotNull String confirm) throws Exception;

    public Result requestPasswordResetHttp(Http.Request request, BigDecimal version, @NotNull String email, String from, String domain, String subUrl, String referer) throws Exception {
        SirqulResponse obj = requestPasswordReset(request, version, email, from, domain, subUrl, referer);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse requestPasswordReset(Http.Request request, BigDecimal version, @NotNull String email, String from, String domain, String subUrl, String referer) throws Exception;

    public Result requestValidateAccountHttp(Http.Request request, BigDecimal version, @NotNull Long accountId) throws Exception {
        SirqulResponse obj = requestValidateAccount(request, version, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse requestValidateAccount(Http.Request request, BigDecimal version, @NotNull Long accountId) throws Exception;

    public Result searchAccountsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, Double latitude, Double longitude, Double radius, String gender, String gameExperience, Integer age, String categoryIds, Boolean returnNulls, String responseFilters, String purchaseType, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<ProfileResponse> obj = searchAccounts(request, version, accountId, appKey, keyword, latitude, longitude, radius, gender, gameExperience, age, categoryIds, returnNulls, responseFilters, purchaseType, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ProfileResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ProfileResponse> searchAccounts(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, Double latitude, Double longitude, Double radius, String gender, String gameExperience, Integer age, String categoryIds, Boolean returnNulls, String responseFilters, String purchaseType, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result secureLoginHttp(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, @NotNull String gameType, String deviceId, String charsetName, Double latitude, Double longitude, Boolean returnProfile, String responseFilters) throws Exception {
        ProfileResponse obj = secureLogin(request, version, username, password, gameType, deviceId, charsetName, latitude, longitude, returnProfile, responseFilters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse secureLogin(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, @NotNull String gameType, String deviceId, String charsetName, Double latitude, Double longitude, Boolean returnProfile, String responseFilters) throws Exception;

    public Result secureSignupHttp(Http.Request request, BigDecimal version, @NotNull String deviceId, @NotNull String username, @NotNull String password, String name, String inviteToken, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceIdType, String emailAddress, Long assetId, String address, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String charsetName, String gameType, String appKey, String appVersion, String responseType) throws Exception {
        ProfileInfoResponse obj = secureSignup(request, version, deviceId, username, password, name, inviteToken, prefixName, firstName, middleName, lastName, suffixName, title, deviceIdType, emailAddress, assetId, address, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, charsetName, gameType, appKey, appVersion, responseType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileInfoResponse secureSignup(Http.Request request, BigDecimal version, @NotNull String deviceId, @NotNull String username, @NotNull String password, String name, String inviteToken, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceIdType, String emailAddress, Long assetId, String address, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String charsetName, String gameType, String appKey, String appVersion, String responseType) throws Exception;

    public Result setMatchTokenHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String matchToken, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = setMatchToken(request, version, deviceId, accountId, matchToken, gameType, appKey, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse setMatchToken(Http.Request request, BigDecimal version, String deviceId, Long accountId, String matchToken, String gameType, String appKey, Double latitude, Double longitude) throws Exception;

    public Result updateActveStatusHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull Boolean active, String deviceId, String appKey) throws Exception {
        SirqulResponse obj = updateActveStatus(request, version, accountId, connectionAccountId, active, deviceId, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateActveStatus(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull Boolean active, String deviceId, String appKey) throws Exception;

    public Result updateLocationHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long clientTime) throws Exception {
        SirqulResponse obj = updateLocation(request, version, deviceId, accountId, latitude, longitude, clientTime);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse updateLocation(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long clientTime) throws Exception;

    public Result updateSettingsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String blockedNotifications, String suggestionMethod, Integer suggestionCount, Integer suggestionTimeFrame, Boolean showOthersExactLocation, Boolean showAsZipcode, Boolean showExactLocation, String favoriteVisibility, Double latitude, Double longitude) throws Exception {
        UserSettingsResponse obj = updateSettings(request, version, deviceId, accountId, blockedNotifications, suggestionMethod, suggestionCount, suggestionTimeFrame, showOthersExactLocation, showAsZipcode, showExactLocation, favoriteVisibility, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserSettingsResponse updateSettings(Http.Request request, BigDecimal version, String deviceId, Long accountId, String blockedNotifications, String suggestionMethod, Integer suggestionCount, Integer suggestionTimeFrame, Boolean showOthersExactLocation, Boolean showAsZipcode, Boolean showExactLocation, String favoriteVisibility, Double latitude, Double longitude) throws Exception;

    public Result validateAccountSignupHttp(Http.Request request, BigDecimal version, @NotNull String token) throws Exception {
        AccountLoginResponse obj = validateAccountSignup(request, version, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AccountLoginResponse validateAccountSignup(Http.Request request, BigDecimal version, @NotNull String token) throws Exception;

    public Result validatePasswordResetHttp(Http.Request request, BigDecimal version, @NotNull String token) throws Exception {
        SirqulResponse obj = validatePasswordReset(request, version, token);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse validatePasswordReset(Http.Request request, BigDecimal version, @NotNull String token) throws Exception;

}
