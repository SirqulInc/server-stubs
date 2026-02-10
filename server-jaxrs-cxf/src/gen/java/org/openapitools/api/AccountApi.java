package org.openapitools.api;

import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AssetListResponse;
import java.math.BigDecimal;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserSettingsResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}")
@Api(value = "/", description = "")
public interface AccountApi  {

    /**
     * Search Accounts by Location
     *
     * Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.
     *
     */
    @GET
    @Path("/account/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Accounts by Location", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserLocationSearchResponse.class) })
    public UserLocationSearchResponse accountLocationSearch(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("postalCode") String postalCode, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @QueryParam("range") @DefaultValue("10")Double range, @QueryParam("locationLastUpdated") Long locationLastUpdated, @QueryParam("gender") String gender, @QueryParam("minAge") Integer minAge, @QueryParam("maxAge") Integer maxAge, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("100")Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("roles") String roles, @QueryParam("tags") String tags, @QueryParam("experience") String experience, @QueryParam("categoryIds") String categoryIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceOperator") @DefaultValue("AND")String audienceOperator, @QueryParam("updateCurrentLocation") @DefaultValue("false")Boolean updateCurrentLocation, @QueryParam("updatePreferredSettings") @DefaultValue("false")Boolean updatePreferredSettings, @QueryParam("showExactLocations") @DefaultValue("true")Boolean showExactLocations, @QueryParam("showConnectionToSearcher") @DefaultValue("false")Boolean showConnectionToSearcher, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("verifiedUserOnly") Boolean verifiedUserOnly, @QueryParam("contentAdminOnly") Boolean contentAdminOnly);

    /**
     * Block Account
     *
     * Moves or removes an account into the user&#39;s blocked group.
     *
     */
    @POST
    @Path("/account/block")
    @Produces({ "*/*" })
    @ApiOperation(value = "Block Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse blockAccount(@PathParam("version") BigDecimal version, @QueryParam("accountIdBeingBlocked") @NotNull Long accountIdBeingBlocked, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("blockFlagValue") @DefaultValue("true")Boolean blockFlagValue, @QueryParam("removeFromGroupsIfBlocked") @DefaultValue("false")Boolean removeFromGroupsIfBlocked, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Create Account
     *
     * Create a new account by role.
     *
     */
    @POST
    @Path("/account/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public AccountLoginResponse createAccount(@PathParam("version") BigDecimal version, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("streetAddress") String streetAddress, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("role") String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("inviteToken") String inviteToken, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("sendValidation") Boolean sendValidation, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("homeLatitude") Double homeLatitude, @QueryParam("homeLongitude") Double homeLongitude, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId);

    /**
     * Update Account
     *
     * Edit the user&#39;s profile information
     *
     */
    @POST
    @Path("/account/profile/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public ProfileInfoResponse editAccount(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("role") String role, @QueryParam("assetId") Long assetId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("makeProfileInfoPublic") Boolean makeProfileInfoPublic, @QueryParam("makeGameInfoPublic") Boolean makeGameInfoPublic, @QueryParam("makeFriendsInfoPublic") Boolean makeFriendsInfoPublic, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("matchToken") String matchToken, @QueryParam("gameExperience") String gameExperience, @QueryParam("categories") String categories, @QueryParam("categoryIds") String categoryIds, @QueryParam("responseFilters") @DefaultValue("PROFILE,PROFILE_CONTACT")String responseFilters, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId, @QueryParam("nonGuestUsername") String nonGuestUsername);

    /**
     * Update Username and Email
     *
     * Update account&#39;s own username and/or emailAddress
     *
     */
    @POST
    @Path("/account/username/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Username and Email", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse editUsername(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("emailAddress") String emailAddress, @QueryParam("username") String username);

    /**
     * Get Account
     *
     * Gets a user&#39;s account profile. Application settings and account settings will also be returned for the owner of the account.
     *
     */
    @GET
    @Path("/account/profile/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse getAccount(@PathParam("version") BigDecimal version, @QueryParam("returnNulls") @DefaultValue("false")Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @QueryParam("connectionAccountId") @DefaultValue("0")Long connectionAccountId, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("purchaseType") @DefaultValue("SIRQUL")String purchaseType, @QueryParam("updateViewedDate") @DefaultValue("false")Boolean updateViewedDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Profile Assets
     *
     * Get a list of assets a person has ever uploaded. Filters the list based on parameters.
     *
     */
    @GET
    @Path("/account/profile/assets")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Profile Assets", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AssetListResponse.class) })
    public AssetListResponse getProfileAssets(@PathParam("version") BigDecimal version, @QueryParam("returnNulls") @DefaultValue("false")Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("mediaTypes") String mediaTypes, @QueryParam("mimeTypes") String mimeTypes, @QueryParam("sortField") @DefaultValue("CREATED")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("0")Integer limit);

    /**
     * Search Accounts
     *
     * Gets a user&#39;s account profile and their referral List.
     *
     */
    @GET
    @Path("/account/referral/list")
    @ApiOperation(value = "Search Accounts", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getReferralList(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retrieveType") String retrieveType, @QueryParam("levelLimit") BigDecimal levelLimit, @QueryParam("ancestorLevelLimit") BigDecimal ancestorLevelLimit, @QueryParam("childrenLevelLimit") BigDecimal childrenLevelLimit, @QueryParam("ancestorListStart") BigDecimal ancestorListStart, @QueryParam("ancestorListLimit") BigDecimal ancestorListLimit, @QueryParam("childrenListStart") BigDecimal childrenListStart, @QueryParam("childrenListLimit") BigDecimal childrenListLimit, @QueryParam("childrenChildren") @DefaultValue("true")Boolean childrenChildren);

    /**
     * Get Account Settings
     *
     * Get the account settings for a user
     *
     */
    @GET
    @Path("/account/settings/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Account Settings", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public UserSettingsResponse getSettings(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Login as Account
     *
     * A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.
     *
     */
    @POST
    @Path("/account/login/delegate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login as Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse loginDelegate(@PathParam("version") BigDecimal version, @QueryParam("accessToken") @NotNull String accessToken, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accessTokenSecret") String accessTokenSecret, @QueryParam("delegatedAccountId") Long delegatedAccountId, @QueryParam("delegatedUsername") String delegatedUsername, @QueryParam("networkUID") @DefaultValue("USERNAME")String networkUID, @QueryParam("ageRestriction") @DefaultValue("0")Integer ageRestriction, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Login Account
     *
     * General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}
     *
     */
    @POST
    @Path("/account/login")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse loginGeneral(@PathParam("version") BigDecimal version, @QueryParam("accessToken") @NotNull String accessToken, @QueryParam("networkUID") @NotNull @DefaultValue("USERNAME")String networkUID, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accessTokenSecret") String accessTokenSecret, @QueryParam("ageRestriction") @DefaultValue("0")Integer ageRestriction, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("emailMatch") @DefaultValue("false")Boolean emailMatch, @QueryParam("chosenAccountId") @DefaultValue("0")Long chosenAccountId, @QueryParam("thirdPartyCredentialId") @DefaultValue("0")Long thirdPartyCredentialId);

    /**
     * Login Account (Username)
     *
     * Login to system with an account
     *
     */
    @POST
    @Path("/account/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Account (Username)", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse loginUsername(@PathParam("version") BigDecimal version, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("responseFilters") String responseFilters);

    /**
     * Logout Account
     *
     * Cleans up the users data for logging out.
     *
     */
    @POST
    @Path("/account/logout")
    @Produces({ "*/*" })
    @ApiOperation(value = "Logout Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse logout(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Merge Account
     *
     * Merges the analytics, achievements, leaderboards of two accounts.
     *
     */
    @POST
    @Path("/account/merge")
    @Produces({ "*/*" })
    @ApiOperation(value = "Merge Account", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse mergeAccount(@PathParam("version") BigDecimal version, @QueryParam("mergeAccountId") @NotNull Long mergeAccountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Update Password
     *
     * Update the account password.
     *
     */
    @POST
    @Path("/account/passwordchange")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Password", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse passwordChange(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("oldPassword") @NotNull String oldPassword, @QueryParam("newPassword") @NotNull String newPassword, @QueryParam("confirmPassword") @NotNull String confirmPassword);

    /**
     * Reset Password
     *
     * Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.
     *
     */
    @POST
    @Path("/account/passwordreset")
    @Produces({ "*/*" })
    @ApiOperation(value = "Reset Password", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse passwordReset(@PathParam("version") BigDecimal version, @QueryParam("token") @NotNull String token, @QueryParam("password") @NotNull String password, @QueryParam("confirm") @NotNull String confirm);

    /**
     * Request Password Reset
     *
     * Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.
     *
     */
    @POST
    @Path("/account/requestpasswordreset")
    @Produces({ "*/*" })
    @ApiOperation(value = "Request Password Reset", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse requestPasswordReset(@PathParam("version") BigDecimal version, @QueryParam("email") @NotNull String email, @QueryParam("from") @DefaultValue("Sirqul")String from, @QueryParam("domain") String domain, @QueryParam("subUrl") String subUrl, @QueryParam("referer") @DefaultValue("http://dev.sirqul.com/resetpassword")String referer);

    /**
     * Send Validation Request
     *
     * Send an email to validate a user&#39;s account.
     *
     */
    @POST
    @Path("/account/requestValidateAccount")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send Validation Request", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse requestValidateAccount(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Search Accounts
     *
     * Search for account profiles.
     *
     */
    @GET
    @Path("/account/profile/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Accounts", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class, responseContainer = "List") })
    public List<ProfileResponse> searchAccounts(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("radius") @DefaultValue("5")Double radius, @QueryParam("gender") String gender, @QueryParam("gameExperience") String gameExperience, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @QueryParam("returnNulls") @DefaultValue("true")Boolean returnNulls, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters, @QueryParam("purchaseType") @DefaultValue("SIRQUL")String purchaseType, @QueryParam("sortField") @DefaultValue("id")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly);

    /**
     * Login Account (Encrypted Username)
     *
     * ogin with encrypted user-name and password.
     *
     */
    @POST
    @Path("/account/login/validate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Login Account (Encrypted Username)", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse secureLogin(@PathParam("version") BigDecimal version, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("gameType") @NotNull String gameType, @QueryParam("deviceId") String deviceId, @QueryParam("charsetName") @DefaultValue("UTF-8")String charsetName, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnProfile") @DefaultValue("false")Boolean returnProfile, @QueryParam("responseFilters") @DefaultValue("PROFILE")String responseFilters);

    /**
     * Create Account (Encrypted Username)
     *
     * Create a new account by role (with encrypted user-name and password)
     *
     */
    @POST
    @Path("/account/create/validate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Account (Encrypted Username)", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public ProfileInfoResponse secureSignup(@PathParam("version") BigDecimal version, @QueryParam("deviceId") @NotNull String deviceId, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("name") String name, @QueryParam("inviteToken") String inviteToken, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("address") String address, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("role") @DefaultValue("MEMBER")String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("acceptedTerms") @DefaultValue("true")Boolean acceptedTerms, @QueryParam("charsetName") @DefaultValue("UTF-8")String charsetName, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType);

    /**
     * Save Match Token
     *
     * Save user&#39;s match token to be used for profile match making
     *
     */
    @POST
    @Path("/consumer/profile/matchToken")
    @Produces({ "*/*" })
    @ApiOperation(value = "Save Match Token", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse setMatchToken(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("matchToken") String matchToken, @QueryParam("gameType") @DefaultValue("BOOPY")String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Update Account Active Status
     *
     * Activate or deactivate an account (requires appropriate permissions).
     *
     */
    @POST
    @Path("/account/active/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Account Active Status", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateActveStatus(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("connectionAccountId") @NotNull Long connectionAccountId, @QueryParam("active") @NotNull Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey);

    /**
     * Update Location
     *
     * Update the account location
     *
     */
    @POST
    @Path("/account/location/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Location", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateLocation(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("clientTime") Long clientTime);

    /**
     * Update Account Settings
     *
     * Update the account settings for a user
     *
     */
    @POST
    @Path("/account/settings/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Account Settings", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public UserSettingsResponse updateSettings(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("blockedNotifications") String blockedNotifications, @QueryParam("suggestionMethod") String suggestionMethod, @QueryParam("suggestionCount") Integer suggestionCount, @QueryParam("suggestionTimeFrame") Integer suggestionTimeFrame, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("favoriteVisibility") String favoriteVisibility, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Save Validation Status
     *
     * Validate the account&#39;s email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.
     *
     */
    @POST
    @Path("/account/validateAccountSignup")
    @Produces({ "*/*" })
    @ApiOperation(value = "Save Validation Status", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public AccountLoginResponse validateAccountSignup(@PathParam("version") BigDecimal version, @QueryParam("token") @NotNull String token);

    /**
     * Validate Password Reset Token
     *
     * Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.
     *
     */
    @POST
    @Path("/account/validatepasswordreset")
    @Produces({ "*/*" })
    @ApiOperation(value = "Validate Password Reset Token", tags={ "Account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse validatePasswordReset(@PathParam("version") BigDecimal version, @QueryParam("token") @NotNull String token);
}
