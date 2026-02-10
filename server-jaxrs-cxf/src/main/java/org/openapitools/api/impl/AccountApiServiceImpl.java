package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AssetListResponse;
import java.math.BigDecimal;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserSettingsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class AccountApiServiceImpl implements AccountApi {
    /**
     * Search Accounts by Location
     *
     * Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.
     *
     */
    public UserLocationSearchResponse accountLocationSearch(BigDecimal version, String deviceId, Long accountId, String q, String keyword, String postalCode, Double latitude, Double longitude, String appKey, Double range, Long locationLastUpdated, String gender, Integer minAge, Integer maxAge, Integer companionshipIndex, Integer i, Integer start, Integer l, Integer limit, String searchMode, String sortField, Boolean descending, String roles, String tags, String experience, String categoryIds, String audienceIds, String audienceOperator, Boolean updateCurrentLocation, Boolean updatePreferredSettings, Boolean showExactLocations, Boolean showConnectionToSearcher, Long flagCountMinimum, Boolean verifiedUserOnly, Boolean contentAdminOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Block Account
     *
     * Moves or removes an account into the user&#39;s blocked group.
     *
     */
    public SirqulResponse blockAccount(BigDecimal version, Long accountIdBeingBlocked, String deviceId, Long accountId, Boolean blockFlagValue, Boolean removeFromGroupsIfBlocked, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Account
     *
     * Create a new account by role.
     *
     */
    public AccountLoginResponse createAccount(BigDecimal version, String username, String password, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceId, String deviceIdType, String emailAddress, Long assetId, String streetAddress, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String inviteToken, Long referralAccountId, Boolean sendValidation, String gameType, String appKey, String appVersion, String responseType, String audienceIdsToAdd, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String locationVisibility, Double homeLatitude, Double homeLongitude, String appNickname, Long personalAudienceId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Account
     *
     * Edit the user&#39;s profile information
     *
     */
    public ProfileInfoResponse editAccount(BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String role, Long assetId, String name, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String gender, Integer age, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String emailAddress, String streetAddress, String streetAddress2, String city, String state, String zipcode, String country, Boolean makeProfileInfoPublic, Boolean makeGameInfoPublic, Boolean makeFriendsInfoPublic, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, String platforms, String tags, String aboutUs, String matchToken, String gameExperience, String categories, String categoryIds, String responseFilters, Boolean showAsZipcode, Boolean showExactLocation, Boolean showOthersExactLocation, Boolean acceptedTerms, String locationVisibility, String appBlob, Boolean appEnablePush, Boolean appEnableSMS, Boolean appEnableEmail, String gameType, String appKey, Double latitude, Double longitude, Boolean returnProfile, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId, String appNickname, Long personalAudienceId, String nonGuestUsername) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Username and Email
     *
     * Update account&#39;s own username and/or emailAddress
     *
     */
    public SirqulResponse editUsername(BigDecimal version, String deviceId, Long accountId, String emailAddress, String username) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Account
     *
     * Gets a user&#39;s account profile. Application settings and account settings will also be returned for the owner of the account.
     *
     */
    public ProfileResponse getAccount(BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, String connectionAccountEmail, Long connectionAccountId, String responseFilters, String gameType, String appKey, String purchaseType, Boolean updateViewedDate, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Profile Assets
     *
     * Get a list of assets a person has ever uploaded. Filters the list based on parameters.
     *
     */
    public AssetListResponse getProfileAssets(BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, Long ownerId, String mediaTypes, String mimeTypes, String sortField, Boolean descending, Double latitude, Double longitude, Integer i, Integer start, Integer l, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Accounts
     *
     * Gets a user&#39;s account profile and their referral List.
     *
     */
    public void getReferralList(BigDecimal version, Long accountId, String appKey, String retrieveType, BigDecimal levelLimit, BigDecimal ancestorLevelLimit, BigDecimal childrenLevelLimit, BigDecimal ancestorListStart, BigDecimal ancestorListLimit, BigDecimal childrenListStart, BigDecimal childrenListLimit, Boolean childrenChildren) {
        // TODO: Implement...

        
    }

    /**
     * Get Account Settings
     *
     * Get the account settings for a user
     *
     */
    public UserSettingsResponse getSettings(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login as Account
     *
     * A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.
     *
     */
    public ProfileResponse loginDelegate(BigDecimal version, String accessToken, String appKey, String deviceId, String accessTokenSecret, Long delegatedAccountId, String delegatedUsername, String networkUID, Integer ageRestriction, String responseFilters, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Account
     *
     * General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}
     *
     */
    public ProfileResponse loginGeneral(BigDecimal version, String accessToken, String networkUID, String appKey, String deviceId, String deviceIdType, String accessTokenSecret, Integer ageRestriction, String responseFilters, Double latitude, Double longitude, Boolean emailMatch, Long chosenAccountId, Long thirdPartyCredentialId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Account (Username)
     *
     * Login to system with an account
     *
     */
    public ProfileResponse loginUsername(BigDecimal version, String username, String password, String deviceId, Double latitude, Double longitude, String app, String gameType, String appKey, Boolean returnProfile, String responseFilters) {
        // TODO: Implement...

        return null;
    }

    /**
     * Logout Account
     *
     * Cleans up the users data for logging out.
     *
     */
    public SirqulResponse logout(BigDecimal version, String deviceId, String deviceIdType, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Merge Account
     *
     * Merges the analytics, achievements, leaderboards of two accounts.
     *
     */
    public SirqulResponse mergeAccount(BigDecimal version, Long mergeAccountId, String appKey, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Password
     *
     * Update the account password.
     *
     */
    public SirqulResponse passwordChange(BigDecimal version, Long accountId, String oldPassword, String newPassword, String confirmPassword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Reset Password
     *
     * Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.
     *
     */
    public SirqulResponse passwordReset(BigDecimal version, String token, String password, String confirm) {
        // TODO: Implement...

        return null;
    }

    /**
     * Request Password Reset
     *
     * Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.
     *
     */
    public SirqulResponse requestPasswordReset(BigDecimal version, String email, String from, String domain, String subUrl, String referer) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send Validation Request
     *
     * Send an email to validate a user&#39;s account.
     *
     */
    public SirqulResponse requestValidateAccount(BigDecimal version, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Accounts
     *
     * Search for account profiles.
     *
     */
    public List<ProfileResponse> searchAccounts(BigDecimal version, Long accountId, String appKey, String keyword, Double latitude, Double longitude, Double radius, String gender, String gameExperience, Integer age, String categoryIds, Boolean returnNulls, String responseFilters, String purchaseType, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Account (Encrypted Username)
     *
     * ogin with encrypted user-name and password.
     *
     */
    public ProfileResponse secureLogin(BigDecimal version, String username, String password, String gameType, String deviceId, String charsetName, Double latitude, Double longitude, Boolean returnProfile, String responseFilters) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Account (Encrypted Username)
     *
     * Create a new account by role (with encrypted user-name and password)
     *
     */
    public ProfileInfoResponse secureSignup(BigDecimal version, String deviceId, String username, String password, String name, String inviteToken, String prefixName, String firstName, String middleName, String lastName, String suffixName, String title, String deviceIdType, String emailAddress, Long assetId, String address, String zipcode, String gender, Long birthday, String homePhone, String cellPhone, String cellPhoneCarrier, String businessPhone, String role, String platforms, String tags, String aboutUs, String gameExperience, String categoryIds, String hometown, String height, Integer heightIndex, String ethnicity, String bodyType, String maritalStatus, String children, String religion, String education, Integer educationIndex, String smoke, String drink, String companionship, Integer companionshipIndex, Integer preferredMinAge, Integer preferredMaxAge, Integer preferredMinHeight, Integer preferredMaxHeight, String preferredGender, String preferredEducation, Integer preferredEducationIndex, String preferredBodyType, String preferredEthnicity, String preferredLocation, Double preferredLocationRange, Double latitude, Double longitude, Boolean acceptedTerms, String charsetName, String gameType, String appKey, String appVersion, String responseType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Save Match Token
     *
     * Save user&#39;s match token to be used for profile match making
     *
     */
    public SirqulResponse setMatchToken(BigDecimal version, String deviceId, Long accountId, String matchToken, String gameType, String appKey, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Account Active Status
     *
     * Activate or deactivate an account (requires appropriate permissions).
     *
     */
    public SirqulResponse updateActveStatus(BigDecimal version, Long accountId, Long connectionAccountId, Boolean active, String deviceId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Location
     *
     * Update the account location
     *
     */
    public SirqulResponse updateLocation(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long clientTime) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Account Settings
     *
     * Update the account settings for a user
     *
     */
    public UserSettingsResponse updateSettings(BigDecimal version, String deviceId, Long accountId, String blockedNotifications, String suggestionMethod, Integer suggestionCount, Integer suggestionTimeFrame, Boolean showOthersExactLocation, Boolean showAsZipcode, Boolean showExactLocation, String favoriteVisibility, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Save Validation Status
     *
     * Validate the account&#39;s email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.
     *
     */
    public AccountLoginResponse validateAccountSignup(BigDecimal version, String token) {
        // TODO: Implement...

        return null;
    }

    /**
     * Validate Password Reset Token
     *
     * Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.
     *
     */
    public SirqulResponse validatePasswordReset(BigDecimal version, String token) {
        // TODO: Implement...

        return null;
    }

}
