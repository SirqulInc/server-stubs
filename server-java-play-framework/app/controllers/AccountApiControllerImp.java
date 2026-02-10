package controllers;

import apimodels.AccountLoginResponse;
import apimodels.AssetListResponse;
import java.math.BigDecimal;
import apimodels.ProfileInfoResponse;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.UserLocationSearchResponse;
import apimodels.UserSettingsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApiControllerImp extends AccountApiControllerImpInterface {
    @Override
    public UserLocationSearchResponse accountLocationSearch(Http.Request request, BigDecimal version, String deviceId, Long accountId, String q, String keyword, String postalCode, Double latitude, Double longitude, String appKey, Double range, Long locationLastUpdated, String gender, Integer minAge, Integer maxAge, Integer companionshipIndex, Integer i, Integer start, Integer l, Integer limit, String searchMode, String sortField, Boolean descending, String roles, String tags, String experience, String categoryIds, String audienceIds, String audienceOperator, Boolean updateCurrentLocation, Boolean updatePreferredSettings, Boolean showExactLocations, Boolean showConnectionToSearcher, Long flagCountMinimum, Boolean verifiedUserOnly, Boolean contentAdminOnly) throws Exception {
        //Do your magic!!!
        return new UserLocationSearchResponse();
    }

    @Override
    public SirqulResponse blockAccount(Http.Request request, BigDecimal version, @NotNull Long accountIdBeingBlocked, String deviceId, Long accountId, Boolean blockFlagValue, Boolean removeFromGroupsIfBlocked, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AccountLoginResponse createAccount(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceId, String deviceIdType, String emailAddress, Long assetId, String streetAddress, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String inviteToken, Long referralAccountId, Boolean sendValidation, String gameType, String appKey, String appVersion, String responseType, String audienceIdsToAdd, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String locationVisibility, Double homeLatitude, Double homeLongitude, String appNickname, Long personalAudienceId) throws Exception {
        //Do your magic!!!
        return new AccountLoginResponse();
    }

    @Override
    public ProfileInfoResponse editAccount(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String role, Long assetId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String gender, Integer age, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, Boolean makeProfileInfoPublic, Boolean makeGameInfoPublic, Boolean makeFriendsInfoPublic, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, String platforms, String tags, String aboutUs, String matchToken, String gameExperience, String categories, String categoryIds, String responseFilters, Boolean showAsZipcode, Boolean showExactLocation, Boolean showOthersExactLocation, Boolean acceptedTerms, String locationVisibility, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String gameType, String appKey, Double latitude, Double longitude, Boolean returnProfile, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId, String appNickname, Long personalAudienceId, String nonGuestUsername) throws Exception {
        //Do your magic!!!
        return new ProfileInfoResponse();
    }

    @Override
    public SirqulResponse editUsername(Http.Request request, BigDecimal version, String deviceId, Long accountId, String emailAddress, String username) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse getAccount(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String responseFilters, String gameType, String appKey, String purchaseType, Boolean updateViewedDate, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public AssetListResponse getProfileAssets(Http.Request request, BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long ownerId, String mediaTypes, String mimeTypes, String sortField, Boolean descending, Double latitude, Double longitude, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        //Do your magic!!!
        return new AssetListResponse();
    }

    @Override
    public void getReferralList(Http.Request request, BigDecimal version, Long accountId, String appKey, String retrieveType, BigDecimal levelLimit, BigDecimal ancestorLevelLimit, BigDecimal childrenLevelLimit, BigDecimal ancestorListStart, BigDecimal ancestorListLimit, BigDecimal childrenListStart, BigDecimal childrenListLimit, Boolean childrenChildren) throws Exception {
        //Do your magic!!!
    }

    @Override
    public UserSettingsResponse getSettings(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new UserSettingsResponse();
    }

    @Override
    public ProfileResponse loginDelegate(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String appKey, String deviceId, String accessTokenSecret, Long delegatedAccountId, String delegatedUsername, String networkUID, Integer ageRestriction, String responseFilters, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ProfileResponse loginGeneral(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String networkUID, @NotNull String appKey, String deviceId, String deviceIdType, String accessTokenSecret, Integer ageRestriction, String responseFilters, Double latitude, Double longitude, Boolean emailMatch, Long chosenAccountId, Long thirdPartyCredentialId) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ProfileResponse loginUsername(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String app, String gameType, String appKey, Boolean returnProfile, String responseFilters) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public SirqulResponse logout(Http.Request request, BigDecimal version, String deviceId, String deviceIdType, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse mergeAccount(Http.Request request, BigDecimal version, @NotNull Long mergeAccountId, @NotNull String appKey, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse passwordChange(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String oldPassword, @NotNull String newPassword, @NotNull String confirmPassword) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse passwordReset(Http.Request request, BigDecimal version, @NotNull String token, @NotNull String password, @NotNull String confirm) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse requestPasswordReset(Http.Request request, BigDecimal version, @NotNull String email, String from, String domain, String subUrl, String referer) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse requestValidateAccount(Http.Request request, BigDecimal version, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<ProfileResponse> searchAccounts(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String keyword, Double latitude, Double longitude, Double radius, String gender, String gameExperience, Integer age, String categoryIds, Boolean returnNulls, String responseFilters, String purchaseType, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<ProfileResponse>();
    }

    @Override
    public ProfileResponse secureLogin(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, @NotNull String gameType, String deviceId, String charsetName, Double latitude, Double longitude, Boolean returnProfile, String responseFilters) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ProfileInfoResponse secureSignup(Http.Request request, BigDecimal version, @NotNull String deviceId, @NotNull String username, @NotNull String password, String name, String inviteToken, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceIdType, String emailAddress, Long assetId, String address, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String charsetName, String gameType, String appKey, String appVersion, String responseType) throws Exception {
        //Do your magic!!!
        return new ProfileInfoResponse();
    }

    @Override
    public SirqulResponse setMatchToken(Http.Request request, BigDecimal version, String deviceId, Long accountId, String matchToken, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse updateActveStatus(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long connectionAccountId, @NotNull Boolean active, String deviceId, String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse updateLocation(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long clientTime) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public UserSettingsResponse updateSettings(Http.Request request, BigDecimal version, String deviceId, Long accountId, String blockedNotifications, String suggestionMethod, Integer suggestionCount, Integer suggestionTimeFrame, Boolean showOthersExactLocation, Boolean showAsZipcode, Boolean showExactLocation, String favoriteVisibility, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new UserSettingsResponse();
    }

    @Override
    public AccountLoginResponse validateAccountSignup(Http.Request request, BigDecimal version, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new AccountLoginResponse();
    }

    @Override
    public SirqulResponse validatePasswordReset(Http.Request request, BigDecimal version, @NotNull String token) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
