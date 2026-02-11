package org.openapitools.api;

import org.openapitools.api.AccountApiService;
import org.openapitools.api.factories.AccountApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AssetListResponse;
import java.math.BigDecimal;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserSettingsResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/account")


@io.swagger.annotations.Api(description = "the account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApi  {
   private final AccountApiService delegate;

   public AccountApi(@Context ServletConfig servletContext) {
      AccountApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AccountApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AccountApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AccountApiServiceFactory.getAccountApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts by Location", notes = "Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.", response = UserLocationSearchResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserLocationSearchResponse.class)
    })
    public Response accountLocationSearch(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Deprecated - legacy query parameter") @QueryParam("q")  String q,@ApiParam(value = "An optional keyword to search on, will be ignore if empty (NOT implemented yet)") @QueryParam("keyword")  String keyword,@ApiParam(value = "The postal code to search on, either postalCode or the user's exact location is required") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "The latitude of the user, either postalCode or the user's exact location is required") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The longitude of the user, either postalCode or the user's exact location is required") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The range to search on", defaultValue = "10") @DefaultValue("10") @QueryParam("range")  Double range,@ApiParam(value = "Searches for user's that has updated their location since this date") @QueryParam("locationLastUpdated")  Long locationLastUpdated,@ApiParam(value = "The preferred gender") @QueryParam("gender")  String gender,@ApiParam(value = "The preferred min age") @QueryParam("minAge")  Integer minAge,@ApiParam(value = "The preferred max age") @QueryParam("maxAge")  Integer maxAge,@ApiParam(value = "The preferred companionship index") @QueryParam("companionshipIndex")  Integer companionshipIndex,@ApiParam(value = "this is the start index of a query") @QueryParam("_i")  Integer i,@ApiParam(value = "Start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "this is the limit index of a query") @QueryParam("_l")  Integer l,@ApiParam(value = "Limit of the pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@ApiParam(value = "Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)") @QueryParam("searchMode")  String searchMode,@ApiParam(value = "Sorting field for results (default: DISTANCE)") @QueryParam("sortField")  String sortField,@ApiParam(value = "Whether to sort descending (default: false)") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Roles to filter on") @QueryParam("roles")  String roles,@ApiParam(value = "Tags to filter on") @QueryParam("tags")  String tags,@ApiParam(value = "The experience to filter on") @QueryParam("experience")  String experience,@ApiParam(value = "The category ids to filter on (comma separated)") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The audience ids to filter on (comma separated)") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "Operator used to combine audience filters (default: AND)", defaultValue = "AND") @DefaultValue("AND") @QueryParam("audienceOperator")  String audienceOperator,@ApiParam(value = "Whether to use the given lat & long to update the user's current location", defaultValue = "false") @DefaultValue("false") @QueryParam("updateCurrentLocation")  Boolean updateCurrentLocation,@ApiParam(value = "Whether to use the given parameters to update the user's preferred settings", defaultValue = "false") @DefaultValue("false") @QueryParam("updatePreferredSettings")  Boolean updatePreferredSettings,@ApiParam(value = "Determines whether to always display user exact locations", defaultValue = "true") @DefaultValue("true") @QueryParam("showExactLocations")  Boolean showExactLocations,@ApiParam(value = "Return connection of the accounts in the result to the passed in account if there exists any", defaultValue = "false") @DefaultValue("false") @QueryParam("showConnectionToSearcher")  Boolean showConnectionToSearcher,@ApiParam(value = "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)") @QueryParam("flagCountMinimum")  Long flagCountMinimum,@ApiParam(value = "Returns only verified users") @QueryParam("verifiedUserOnly")  Boolean verifiedUserOnly,@ApiParam(value = "Returns only content admin users") @QueryParam("contentAdminOnly")  Boolean contentAdminOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountLocationSearch(deviceId, accountId, q, keyword, postalCode, latitude, longitude, appKey, range, locationLastUpdated, gender, minAge, maxAge, companionshipIndex, i, start, l, limit, searchMode, sortField, descending, roles, tags, experience, categoryIds, audienceIds, audienceOperator, updateCurrentLocation, updatePreferredSettings, showExactLocations, showConnectionToSearcher, flagCountMinimum, verifiedUserOnly, contentAdminOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/block")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Block Account", notes = "Moves or removes an account into the user's blocked group.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response blockAccount(@ApiParam(value = "The id of the account to be blocked/unblocked", required = true) @QueryParam("accountIdBeingBlocked") @NotNull  Long accountIdBeingBlocked,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Determines whether the account is blocked or unblocked", defaultValue = "true") @DefaultValue("true") @QueryParam("blockFlagValue")  Boolean blockFlagValue,@ApiParam(value = "Determines whether the account is removed from all other groups if blocked", defaultValue = "false") @DefaultValue("false") @QueryParam("removeFromGroupsIfBlocked")  Boolean removeFromGroupsIfBlocked,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.blockAccount(accountIdBeingBlocked, deviceId, accountId, blockFlagValue, removeFromGroupsIfBlocked, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account", notes = "Create a new account by role.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class)
    })
    public Response createAccount(@ApiParam(value = "The access token to authenticate with (ex: username)", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "The secret to authenticate with (ex: password)", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName") @QueryParam("name")  String name,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @QueryParam("prefixName")  String prefixName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @QueryParam("firstName")  String firstName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @QueryParam("middleName")  String middleName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @QueryParam("lastName")  String lastName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @QueryParam("suffixName")  String suffixName,@ApiParam(value = "This field will be used to set the user's job title") @QueryParam("title")  String title,@ApiParam(value = "The unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc") @QueryParam("deviceIdType")  String deviceIdType,@ApiParam(value = "The user's contact email address (NOT the username)") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "The asset id to set the user's profile image") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The street address of the user's contact location") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "The zipcode of the user's contact location") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "The gender of the user (AudienceGender)") @QueryParam("gender")  String gender,@ApiParam(value = "The birthday date of the user in UTC milliseconds") @QueryParam("birthday")  Long birthday,@ApiParam(value = "The home phone number") @QueryParam("homePhone")  String homePhone,@ApiParam(value = "The cellular phone number") @QueryParam("cellPhone")  String cellPhone,@ApiParam(value = "The cellular service provider") @QueryParam("cellPhoneCarrier")  String cellPhoneCarrier,@ApiParam(value = "The business phone number") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The account role (default: MEMBER)") @QueryParam("role")  String role,@ApiParam(value = "Comma separated list of development platforms") @QueryParam("platforms")  String platforms,@ApiParam(value = "Search tags") @QueryParam("tags")  String tags,@ApiParam(value = "About us information") @QueryParam("aboutUs")  String aboutUs,@ApiParam(value = "Game experience of the user") @QueryParam("gameExperience")  String gameExperience,@ApiParam(value = "A list of category ids that represent interests and associations") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The user's hometown") @QueryParam("hometown")  String hometown,@ApiParam(value = "The user's height") @QueryParam("height")  String height,@ApiParam(value = "The user's height in a numerical value that can be used for ordering/searching") @QueryParam("heightIndex")  Integer heightIndex,@ApiParam(value = "The user's ethnicity") @QueryParam("ethnicity")  String ethnicity,@ApiParam(value = "The user's body type") @QueryParam("bodyType")  String bodyType,@ApiParam(value = "The user's marital status") @QueryParam("maritalStatus")  String maritalStatus,@ApiParam(value = "The user's children status") @QueryParam("children")  String children,@ApiParam(value = "The user's religion") @QueryParam("religion")  String religion,@ApiParam(value = "The user's education") @QueryParam("education")  String education,@ApiParam(value = "The user's education in a numerical value that can be used for ordering/searching") @QueryParam("educationIndex")  Integer educationIndex,@ApiParam(value = "The user's smoke status") @QueryParam("smoke")  String smoke,@ApiParam(value = "The user's drink status") @QueryParam("drink")  String drink,@ApiParam(value = "The user's companionship status") @QueryParam("companionship")  String companionship,@ApiParam(value = "The user's companionship index") @QueryParam("companionshipIndex")  Integer companionshipIndex,@ApiParam(value = "The preferred minimum age in the account location search") @QueryParam("preferredMinAge")  Integer preferredMinAge,@ApiParam(value = "The preferred maximum age in the account location search") @QueryParam("preferredMaxAge")  Integer preferredMaxAge,@ApiParam(value = "The preferred minimum height in the account location search") @QueryParam("preferredMinHeight")  Integer preferredMinHeight,@ApiParam(value = "The preferred maximum height in the account location search") @QueryParam("preferredMaxHeight")  Integer preferredMaxHeight,@ApiParam(value = "The preferred gender in the account location search") @QueryParam("preferredGender")  String preferredGender,@ApiParam(value = "The preferred education in the account location search") @QueryParam("preferredEducation")  String preferredEducation,@ApiParam(value = "The preferred education in a numerical value that can be used for ordering/searching") @QueryParam("preferredEducationIndex")  Integer preferredEducationIndex,@ApiParam(value = "The preferred body type in the account location search") @QueryParam("preferredBodyType")  String preferredBodyType,@ApiParam(value = "The preferred ethnicity in the account location search") @QueryParam("preferredEthnicity")  String preferredEthnicity,@ApiParam(value = "The preferred location in the account location search") @QueryParam("preferredLocation")  String preferredLocation,@ApiParam(value = "The preferred location range in the account location search") @QueryParam("preferredLocationRange")  Double preferredLocationRange,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Accepted Terms") @QueryParam("acceptedTerms")  Boolean acceptedTerms,@ApiParam(value = "The inviteToken that the referrer used for this account to sign up") @QueryParam("inviteToken")  String inviteToken,@ApiParam(value = "The accountId of the referrer (used if there is no inviteToken)") @QueryParam("referralAccountId")  Long referralAccountId,@ApiParam(value = "Whether to send validation email") @QueryParam("sendValidation")  Boolean sendValidation,@ApiParam(value = "Deprecated: use appKey") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The application version") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "Returns an AccountLoginResponse if \"AccountLoginResponse\" is passed in") @QueryParam("responseType")  String responseType,@ApiParam(value = "Comma separated list of audience ids to assign to the user") @QueryParam("audienceIdsToAdd")  String audienceIdsToAdd,@ApiParam(value = "Application blob data") @QueryParam("appBlob")  String appBlob,@ApiParam(value = "Enable push for the app") @QueryParam("appEnablePush")  Boolean appEnablePush,@ApiParam(value = "Enable SMS for the app") @QueryParam("appEnableSMS")  Boolean appEnableSMS,@ApiParam(value = "Enable email for the app") @QueryParam("appEnableEmail")  Boolean appEnableEmail,@ApiParam(value = "Location visibility setting") @QueryParam("locationVisibility")  String locationVisibility,@ApiParam(value = "Home latitude") @QueryParam("homeLatitude")  Double homeLatitude,@ApiParam(value = "Home longitude") @QueryParam("homeLongitude")  Double homeLongitude,@ApiParam(value = "The nickname used in the application for this account") @QueryParam("appNickname")  String appNickname,@ApiParam(value = "Personal audience id to associate with this account") @QueryParam("personalAudienceId")  Long personalAudienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAccount(username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, deviceId, deviceIdType, emailAddress, assetId, streetAddress, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, inviteToken, referralAccountId, sendValidation, gameType, appKey, appVersion, responseType, audienceIdsToAdd, appBlob, appEnablePush, appEnableSMS, appEnableEmail, locationVisibility, homeLatitude, homeLongitude, appNickname, personalAudienceId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/profile/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account", notes = "Edit the user's profile information", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class)
    })
    public Response editAccount(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The account id used to edit another person's account") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "The account role to change to") @QueryParam("role")  String role,@ApiParam(value = "The asset id to set the user's profile image") @QueryParam("assetId")  Long assetId,@ApiParam(value = "The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ") @QueryParam("name")  String name,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @QueryParam("prefixName")  String prefixName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @QueryParam("firstName")  String firstName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @QueryParam("middleName")  String middleName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @QueryParam("lastName")  String lastName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @QueryParam("suffixName")  String suffixName,@ApiParam(value = "This field will be used to set the user's job title") @QueryParam("title")  String title,@ApiParam(value = "The gender of the user AudienceGender") @QueryParam("gender")  String gender,@ApiParam(value = "This is deperecated, use the birthday parameter") @QueryParam("age")  Integer age,@ApiParam(value = "The birthday date of the user in UTC milliseconds") @QueryParam("birthday")  Long birthday,@ApiParam(value = "The home phone number") @QueryParam("homePhone")  String homePhone,@ApiParam(value = "The cellular phone number") @QueryParam("cellPhone")  String cellPhone,@ApiParam(value = "The cellular service provider") @QueryParam("cellPhoneCarrier")  String cellPhoneCarrier,@ApiParam(value = "The business phone number") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The user's contact email address (NOT the username)") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "The street address of the user's contact location") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the user's contact location") @QueryParam("city")  String city,@ApiParam(value = "The state of the user's contact location") @QueryParam("state")  String state,@ApiParam(value = "The zipcode of the user's contact location") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "The country of the user's contact location") @QueryParam("country")  String country,@ApiParam(value = "Allow anyone to view the user's personal profile") @QueryParam("makeProfileInfoPublic")  Boolean makeProfileInfoPublic,@ApiParam(value = "Allow anyone to view the user's game/app info") @QueryParam("makeGameInfoPublic")  Boolean makeGameInfoPublic,@ApiParam(value = "Allow anyone to view the user's friends list") @QueryParam("makeFriendsInfoPublic")  Boolean makeFriendsInfoPublic,@ApiParam(value = "The user's hometown") @QueryParam("hometown")  String hometown,@ApiParam(value = "The user's height") @QueryParam("height")  String height,@ApiParam(value = "The user's height in a numerical value that can be used for ordering/searching") @QueryParam("heightIndex")  Integer heightIndex,@ApiParam(value = "The user's ethnicity") @QueryParam("ethnicity")  String ethnicity,@ApiParam(value = "The user's body type") @QueryParam("bodyType")  String bodyType,@ApiParam(value = "The user's marital status") @QueryParam("maritalStatus")  String maritalStatus,@ApiParam(value = "The user's children status") @QueryParam("children")  String children,@ApiParam(value = "The user's religion") @QueryParam("religion")  String religion,@ApiParam(value = "The user's education") @QueryParam("education")  String education,@ApiParam(value = "The user's education in a numerical value that can be used for ordering/searching") @QueryParam("educationIndex")  Integer educationIndex,@ApiParam(value = "The user's smoke status") @QueryParam("smoke")  String smoke,@ApiParam(value = "The user's drink status") @QueryParam("drink")  String drink,@ApiParam(value = "The user's companionship status") @QueryParam("companionship")  String companionship,@ApiParam(value = "The user's companionship index") @QueryParam("companionshipIndex")  Integer companionshipIndex,@ApiParam(value = "The preferred minimum age in the account location search") @QueryParam("preferredMinAge")  Integer preferredMinAge,@ApiParam(value = "The preferred maximum age in the account location search") @QueryParam("preferredMaxAge")  Integer preferredMaxAge,@ApiParam(value = "The preferred minimum height in the account location search") @QueryParam("preferredMinHeight")  Integer preferredMinHeight,@ApiParam(value = "The preferred maximum height in the account location search") @QueryParam("preferredMaxHeight")  Integer preferredMaxHeight,@ApiParam(value = "The preferred gender in the account location search") @QueryParam("preferredGender")  String preferredGender,@ApiParam(value = "The preferred education in the account location search") @QueryParam("preferredEducation")  String preferredEducation,@ApiParam(value = "The preferred education in a numerical value that can be used for ordering/searching") @QueryParam("preferredEducationIndex")  Integer preferredEducationIndex,@ApiParam(value = "The preferred body type in the account location search") @QueryParam("preferredBodyType")  String preferredBodyType,@ApiParam(value = "The preferred ethnicity in the account location search") @QueryParam("preferredEthnicity")  String preferredEthnicity,@ApiParam(value = "The preferred education in the account location search") @QueryParam("preferredLocation")  String preferredLocation,@ApiParam(value = "The preferred location range in the account location search") @QueryParam("preferredLocationRange")  Double preferredLocationRange,@ApiParam(value = "Platforms") @QueryParam("platforms")  String platforms,@ApiParam(value = "Tags") @QueryParam("tags")  String tags,@ApiParam(value = "About Us") @QueryParam("aboutUs")  String aboutUs,@ApiParam(value = "Match Token") @QueryParam("matchToken")  String matchToken,@ApiParam(value = "Game Experience") @QueryParam("gameExperience")  String gameExperience,@ApiParam(value = "Deprecated use categoryIds") @QueryParam("categories")  String categories,@ApiParam(value = "A list of category ids that represent interests and associations") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "A comma separated list of ProfileFilters for filtering the returned response data", defaultValue = "PROFILE,PROFILE_CONTACT") @DefaultValue("PROFILE,PROFILE_CONTACT") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "The user's preference if they want to be shown by zipcode on a map") @QueryParam("showAsZipcode")  Boolean showAsZipcode,@ApiParam(value = "The user's preference if they want to be shown by their exact location on a map") @QueryParam("showExactLocation")  Boolean showExactLocation,@ApiParam(value = "The user's preference if they want to see others exact location on a map") @QueryParam("showOthersExactLocation")  Boolean showOthersExactLocation,@ApiParam(value = "Accepted Terms") @QueryParam("acceptedTerms")  Boolean acceptedTerms,@ApiParam(value = "Location Visibility") @QueryParam("locationVisibility")  String locationVisibility,@ApiParam(value = "App Blob") @QueryParam("appBlob")  String appBlob,@ApiParam(value = "App Enable Push") @QueryParam("appEnablePush")  Boolean appEnablePush,@ApiParam(value = "App Enable SMS") @QueryParam("appEnableSMS")  Boolean appEnableSMS,@ApiParam(value = "App Enable Email") @QueryParam("appEnableEmail")  Boolean appEnableEmail,@ApiParam(value = "Game Type") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Return Profile") @QueryParam("returnProfile")  Boolean returnProfile,@ApiParam(value = "Audience Ids to add") @QueryParam("audienceIdsToAdd")  String audienceIdsToAdd,@ApiParam(value = "Audience Ids to remove") @QueryParam("audienceIdsToRemove")  String audienceIdsToRemove,@ApiParam(value = "The account id of the referrer") @QueryParam("referralAccountId")  Long referralAccountId,@ApiParam(value = "App nickname") @QueryParam("appNickname")  String appNickname,@ApiParam(value = "Personal Audience") @QueryParam("personalAudienceId")  Long personalAudienceId,@ApiParam(value = "The user's username to update with if they currently have a guest username") @QueryParam("nonGuestUsername")  String nonGuestUsername,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editAccount(deviceId, accountId, connectionAccountId, role, assetId, name, prefixName, firstName, middleName, lastName, suffixName, title, gender, age, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, makeProfileInfoPublic, makeGameInfoPublic, makeFriendsInfoPublic, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, platforms, tags, aboutUs, matchToken, gameExperience, categories, categoryIds, responseFilters, showAsZipcode, showExactLocation, showOthersExactLocation, acceptedTerms, locationVisibility, appBlob, appEnablePush, appEnableSMS, appEnableEmail, gameType, appKey, latitude, longitude, returnProfile, audienceIdsToAdd, audienceIdsToRemove, referralAccountId, appNickname, personalAudienceId, nonGuestUsername, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/username/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Username and Email", notes = "Update account's own username and/or emailAddress", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response editUsername(@ApiParam(value = "The device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the user's contact email address (NOT the username) which is also used for email validation") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "the user's username to update with if they currently have a guest username") @QueryParam("username")  String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editUsername(deviceId, accountId, emailAddress, username, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/profile/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account", notes = "Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response getAccount(@ApiParam(value = "Return Nulls", defaultValue = "false") @DefaultValue("false") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Connection Account Email") @QueryParam("connectionAccountEmail")  String connectionAccountEmail,@ApiParam(value = "The account id used to view another person's account", defaultValue = "0") @DefaultValue("0") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "A comma separated list of ProfileFilters for filtering the returned response data", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "Game Type") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "Purchase Type", defaultValue = "SIRQUL") @DefaultValue("SIRQUL") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "Determines whether to track if a person has viewed someone's profile", defaultValue = "false") @DefaultValue("false") @QueryParam("updateViewedDate")  Boolean updateViewedDate,@ApiParam(value = "Latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccount(returnNulls, deviceId, accountId, connectionAccountEmail, connectionAccountId, responseFilters, gameType, appKey, purchaseType, updateViewedDate, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/location/trilaterate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by Trilateration", notes = "Send in device data and calculate a position based on signal strengths.", response = GeoPointResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GeoPointResponse.class)
    })
    public Response getLocationByTrilateration(@ApiParam(value = "The account making the request, if provided the last know location will be updated") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The known GPS latitude to compare to the calculated version") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The known GPS longitude to compare to the calculated version") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The json formated sample data:  ```json {    \"count\": 2,   \"timespan\": 10,    \"samples\": [     {       \"deviceId\": \"device1\",       \"rssi\": [-63, -75]     },      {       \"deviceId\": \"device2\",       \"rssi\": [-83, -79]     }   ] } ``` ") @QueryParam("data")  String data,@ApiParam(value = "Optional response filters (not used currently)") @QueryParam("responseFilters")  String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLocationByTrilateration(accountId, latitude, longitude, data, responseFilters, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/profile/assets")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Profile Assets", notes = "Get a list of assets a person has ever uploaded. Filters the list based on parameters.", response = AssetListResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetListResponse.class)
    })
    public Response getProfileAssets(@ApiParam(value = "Determines whether to return null fields in the response", defaultValue = "false") @DefaultValue("false") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The account id of the person the user wants to view") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "Comma separated list of MediaType") @QueryParam("mediaTypes")  String mediaTypes,@ApiParam(value = "Comma separated list of mime types") @QueryParam("mimeTypes")  String mimeTypes,@ApiParam(value = "Determines what the returning list will be sorted by (see AssetApiMap)", defaultValue = "CREATED") @DefaultValue("CREATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether to return the resulting list in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Latitude used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Longitude used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "_i") @QueryParam("_i")  Integer i,@ApiParam(value = "Start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "_l") @QueryParam("_l")  Integer l,@ApiParam(value = "Limit of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProfileAssets(returnNulls, deviceId, accountId, ownerId, mediaTypes, mimeTypes, sortField, descending, latitude, longitude, i, start, l, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/referral/list")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Gets a user's account profile and their referral List.", response = Void.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response getReferralList(@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it's parents, recursively - GET_ALL will get all of the above") @QueryParam("retrieveType")  String retrieveType,@ApiParam(value = "level limit for children and ancestors of current account, starts from current account") @QueryParam("levelLimit")  BigDecimal levelLimit,@ApiParam(value = "level limit for ancestors, will override levelLimit if this is set") @QueryParam("ancestorLevelLimit")  BigDecimal ancestorLevelLimit,@ApiParam(value = "level limit for children, will override levelLimit if this is set") @QueryParam("childrenLevelLimit")  BigDecimal childrenLevelLimit,@ApiParam(value = "pagination start for children list") @QueryParam("ancestorListStart")  BigDecimal ancestorListStart,@ApiParam(value = "pagination limit for children list") @QueryParam("ancestorListLimit")  BigDecimal ancestorListLimit,@ApiParam(value = "pagination start for children list") @QueryParam("childrenListStart")  BigDecimal childrenListStart,@ApiParam(value = "pagination limit for children list") @QueryParam("childrenListLimit")  BigDecimal childrenListLimit,@ApiParam(value = "if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item", defaultValue = "true") @DefaultValue("true") @QueryParam("childrenChildren")  Boolean childrenChildren,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getReferralList(accountId, appKey, retrieveType, levelLimit, ancestorLevelLimit, childrenLevelLimit, ancestorListStart, ancestorListLimit, childrenListStart, childrenListLimit, childrenChildren, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/settings/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Settings", notes = "Get the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class)
    })
    public Response getSettings(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSettings(deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/login/delegate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login as Account", notes = "A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response loginDelegate(@ApiParam(value = "", required = true) @QueryParam("accessToken") @NotNull  String accessToken,@ApiParam(value = "", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "") @QueryParam("accessTokenSecret")  String accessTokenSecret,@ApiParam(value = "") @QueryParam("delegatedAccountId")  Long delegatedAccountId,@ApiParam(value = "") @QueryParam("delegatedUsername")  String delegatedUsername,@ApiParam(value = "The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE", defaultValue = "USERNAME") @DefaultValue("USERNAME") @QueryParam("networkUID")  String networkUID,@ApiParam(value = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", defaultValue = "0") @DefaultValue("0") @QueryParam("ageRestriction")  Integer ageRestriction,@ApiParam(value = "This determines how much of the profile should be returned, see ProfileFilters", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "") @QueryParam("latitude")  Double latitude,@ApiParam(value = "") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginDelegate(accessToken, appKey, deviceId, accessTokenSecret, delegatedAccountId, delegatedUsername, networkUID, ageRestriction, responseFilters, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account", notes = "General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response loginGeneral(@ApiParam(value = "The access token to authenticate with (ex: username or fb token)", required = true) @QueryParam("accessToken") @NotNull  String accessToken,@ApiParam(value = "The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE ", required = true, defaultValue = "USERNAME") @DefaultValue("USERNAME") @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc") @QueryParam("deviceIdType")  String deviceIdType,@ApiParam(value = "The secret to authenticate with (ex: password)") @QueryParam("accessTokenSecret")  String accessTokenSecret,@ApiParam(value = "Checks user's birthday to see if they meet an age requirement. If the user is under age, an error message is returned.", defaultValue = "0") @DefaultValue("0") @QueryParam("ageRestriction")  Integer ageRestriction,@ApiParam(value = "This determines how much of the profile should be returned, see ProfileFilters", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "Used to update the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Used to update the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Option to check for email if username doesn't match, also support multiple accounts", defaultValue = "false") @DefaultValue("false") @QueryParam("emailMatch")  Boolean emailMatch,@ApiParam(value = "Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request", defaultValue = "0") @DefaultValue("0") @QueryParam("chosenAccountId")  Long chosenAccountId,@ApiParam(value = "Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object", defaultValue = "0") @DefaultValue("0") @QueryParam("thirdPartyCredentialId")  Long thirdPartyCredentialId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginGeneral(accessToken, networkUID, appKey, deviceId, deviceIdType, accessTokenSecret, ageRestriction, responseFilters, latitude, longitude, emailMatch, chosenAccountId, thirdPartyCredentialId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Username)", notes = "Login to system with an account", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response loginUsername(@ApiParam(value = "the user's email address they used to sign-up", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "the password", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "the device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the app") @QueryParam("app")  String app,@ApiParam(value = "This parameter is deprecated. This is deprecated, use appKey.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the profile to return") @QueryParam("returnProfile")  Boolean returnProfile,@ApiParam(value = "a comma separated list of ProfileFilters for filtering the returned response data") @QueryParam("responseFilters")  String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUsername(username, password, deviceId, latitude, longitude, app, gameType, appKey, returnProfile, responseFilters, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/logout")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Logout Account", notes = "Cleans up the users data for logging out.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response logout(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "Device Id Type") @QueryParam("deviceIdType")  String deviceIdType,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logout(deviceId, deviceIdType, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/merge")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Merge Account", notes = "Merges the analytics, achievements, leaderboards of two accounts.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response mergeAccount(@ApiParam(value = "The id of the account to being merged", required = true) @QueryParam("mergeAccountId") @NotNull  Long mergeAccountId,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.mergeAccount(mergeAccountId, appKey, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/passwordchange")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Password", notes = "Update the account password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response passwordChange(@ApiParam(value = "The account to update", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The current password, used to validate access", required = true) @QueryParam("oldPassword") @NotNull  String oldPassword,@ApiParam(value = "The new password to set, cannot be empty", required = true) @QueryParam("newPassword") @NotNull  String newPassword,@ApiParam(value = "The new password to confirm, must match newPassword", required = true) @QueryParam("confirmPassword") @NotNull  String confirmPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.passwordChange(accountId, oldPassword, newPassword, confirmPassword, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/passwordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reset Password", notes = "Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response passwordReset(@ApiParam(value = "The token associated with the account to update, good for 24 hours", required = true) @QueryParam("token") @NotNull  String token,@ApiParam(value = "The new password to set, cannot be empty", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "The new password to confirm, must match newPassword", required = true) @QueryParam("confirm") @NotNull  String confirm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.passwordReset(token, password, confirm, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/requestpasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Password Reset", notes = "Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response requestPasswordReset(@ApiParam(value = "The email/username of the account", required = true) @QueryParam("email") @NotNull  String email,@ApiParam(value = "this is the sender email", defaultValue = "Sirqul") @DefaultValue("Sirqul") @QueryParam("from")  String from,@ApiParam(value = "this is the domain (like dev.sirqul.com) used to generate the password reset link") @QueryParam("domain")  String domain,@ApiParam(value = "this is the the subUrl (like resetpassword) used to generate a password reset link") @QueryParam("subUrl")  String subUrl,@ApiParam(value = "this is used to generate a password reset link", defaultValue = "http://dev.sirqul.com/resetpassword") @DefaultValue("http://dev.sirqul.com/resetpassword") @QueryParam("referer")  String referer,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.requestPasswordReset(email, from, domain, subUrl, referer, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/requestValidateAccount")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Validation Request", notes = "Send an email to validate a user's account.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response requestValidateAccount(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.requestValidateAccount(accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/profile/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Search for account profiles.", response = ProfileResponse.class, responseContainer = "List", tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class, responseContainer = "List")
    })
    public Response searchAccounts(@ApiParam(value = "The id of the account requesting", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The keyword for for querying the account") @QueryParam("keyword")  String keyword,@ApiParam(value = "the latitude") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the radius", defaultValue = "5") @DefaultValue("5") @QueryParam("radius")  Double radius,@ApiParam(value = "the user's gender", allowableValues="MALE, FEMALE, ANY") @QueryParam("gender")  String gender,@ApiParam(value = "the user's Game Experience", allowableValues="ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @QueryParam("gameExperience")  String gameExperience,@ApiParam(value = "the user's age") @QueryParam("age")  Integer age,@ApiParam(value = "the user's Category Ids") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Return Nulls", defaultValue = "true") @DefaultValue("true") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "A comma separated list of ProfileFilters for filtering the returned response data", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "A comma separated list of PurchaseType", defaultValue = "SIRQUL") @DefaultValue("SIRQUL") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "The field to sort by", defaultValue = "id") @DefaultValue("id") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the results. Default is false, which will return the results in ascending order.", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The index into the record set to start with.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active results. Default is false.", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchAccounts(accountId, appKey, keyword, latitude, longitude, radius, gender, gameExperience, age, categoryIds, returnNulls, responseFilters, purchaseType, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/login/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Encrypted Username)", notes = "ogin with encrypted user-name and password.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response secureLogin(@ApiParam(value = "The user's encrypted email address they used to sign-up", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "The encrypted password", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "The application key", required = true) @QueryParam("gameType") @NotNull  String gameType,@ApiParam(value = "The device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "Charset Name", defaultValue = "UTF-8") @DefaultValue("UTF-8") @QueryParam("charsetName")  String charsetName,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Return Profile", defaultValue = "false") @DefaultValue("false") @QueryParam("returnProfile")  Boolean returnProfile,@ApiParam(value = "A comma separated list of ProfileFilters for filtering the returned response data", defaultValue = "PROFILE") @DefaultValue("PROFILE") @QueryParam("responseFilters")  String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.secureLogin(username, password, gameType, deviceId, charsetName, latitude, longitude, returnProfile, responseFilters, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account (Encrypted Username)", notes = "Create a new account by role (with encrypted user-name and password)", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class)
    })
    public Response secureSignup(@ApiParam(value = "The device id", required = true) @QueryParam("deviceId") @NotNull  String deviceId,@ApiParam(value = "The encrypted email of the user, this is what will be used when they login", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "The encrypted password of the user", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName ") @QueryParam("name")  String name,@ApiParam(value = "the inviteToken that the referrer use for this account to sign up") @QueryParam("inviteToken")  String inviteToken,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the prefix of the user's name") @QueryParam("prefixName")  String prefixName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's first name") @QueryParam("firstName")  String firstName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's middle name") @QueryParam("middleName")  String middleName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the user's last name") @QueryParam("lastName")  String lastName,@ApiParam(value = "If the parameter 'name' is empty or not present, this field will be used to set the suffix of the user's name") @QueryParam("suffixName")  String suffixName,@ApiParam(value = "Title") @QueryParam("title")  String title,@ApiParam(value = "Device Id Type") @QueryParam("deviceIdType")  String deviceIdType,@ApiParam(value = "The user's contact email address (NOT the username) which is also used for email validation") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "The asset id to set the user's profile image") @QueryParam("assetId")  Long assetId,@ApiParam(value = "the user's address") @QueryParam("address")  String address,@ApiParam(value = "The street zipcode of the user's contact location") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "The gender of the user AudienceGender") @QueryParam("gender")  String gender,@ApiParam(value = "The birthday date of the user in milliseconds") @QueryParam("birthday")  Long birthday,@ApiParam(value = "the user's home phone number") @QueryParam("homePhone")  String homePhone,@ApiParam(value = "the user's cell phone number") @QueryParam("cellPhone")  String cellPhone,@ApiParam(value = "the user's Cell Phone Carrier") @QueryParam("cellPhoneCarrier")  String cellPhoneCarrier,@ApiParam(value = "the user's Business Phone Number") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST", defaultValue = "MEMBER") @DefaultValue("MEMBER") @QueryParam("role")  String role,@ApiParam(value = "Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK") @QueryParam("platforms")  String platforms,@ApiParam(value = "Search tags") @QueryParam("tags")  String tags,@ApiParam(value = "About Us information") @QueryParam("aboutUs")  String aboutUs,@ApiParam(value = "Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @QueryParam("gameExperience")  String gameExperience,@ApiParam(value = "A list of category ids that represent interests and associations") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The user's hometown") @QueryParam("hometown")  String hometown,@ApiParam(value = "The user's height") @QueryParam("height")  String height,@ApiParam(value = "The user's height in a numerical value that can be used for ordering/searching") @QueryParam("heightIndex")  Integer heightIndex,@ApiParam(value = "The user's ethnicity") @QueryParam("ethnicity")  String ethnicity,@ApiParam(value = "The user's body type") @QueryParam("bodyType")  String bodyType,@ApiParam(value = "The user's maritial status") @QueryParam("maritalStatus")  String maritalStatus,@ApiParam(value = "The user's children status") @QueryParam("children")  String children,@ApiParam(value = "The user's religion") @QueryParam("religion")  String religion,@ApiParam(value = "The user's education") @QueryParam("education")  String education,@ApiParam(value = "The user's education in a numerical value that can be used for ordering/searching") @QueryParam("educationIndex")  Integer educationIndex,@ApiParam(value = "The user's smoke status") @QueryParam("smoke")  String smoke,@ApiParam(value = "The user's drink status") @QueryParam("drink")  String drink,@ApiParam(value = "The user's companionship status") @QueryParam("companionship")  String companionship,@ApiParam(value = "The user's companionship index") @QueryParam("companionshipIndex")  Integer companionshipIndex,@ApiParam(value = "The preferred minimum age in the account location search") @QueryParam("preferredMinAge")  Integer preferredMinAge,@ApiParam(value = "The preferred maximum age in the account location search") @QueryParam("preferredMaxAge")  Integer preferredMaxAge,@ApiParam(value = "The preferred minimum height in the account location search") @QueryParam("preferredMinHeight")  Integer preferredMinHeight,@ApiParam(value = "The preferred maximum height in the account location search") @QueryParam("preferredMaxHeight")  Integer preferredMaxHeight,@ApiParam(value = "The preferred gender in the account location search") @QueryParam("preferredGender")  String preferredGender,@ApiParam(value = "The preferred education in the account location search") @QueryParam("preferredEducation")  String preferredEducation,@ApiParam(value = "The preferred education in a numerical value that can be used for ordering/searching") @QueryParam("preferredEducationIndex")  Integer preferredEducationIndex,@ApiParam(value = "The preferred body type in the account location search") @QueryParam("preferredBodyType")  String preferredBodyType,@ApiParam(value = "The preferred ethnicity in the account location search") @QueryParam("preferredEthnicity")  String preferredEthnicity,@ApiParam(value = "The preferred education in the account location search") @QueryParam("preferredLocation")  String preferredLocation,@ApiParam(value = "The preferred location range in the account location search") @QueryParam("preferredLocationRange")  Double preferredLocationRange,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Accepted Terms", defaultValue = "true") @DefaultValue("true") @QueryParam("acceptedTerms")  Boolean acceptedTerms,@ApiParam(value = "Charset Name", defaultValue = "UTF-8") @DefaultValue("UTF-8") @QueryParam("charsetName")  String charsetName,@ApiParam(value = "Game Type") @QueryParam("gameType")  String gameType,@ApiParam(value = "The application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "App Version") @QueryParam("appVersion")  String appVersion,@ApiParam(value = "Response Type") @QueryParam("responseType")  String responseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.secureSignup(deviceId, username, password, name, inviteToken, prefixName, firstName, middleName, lastName, suffixName, title, deviceIdType, emailAddress, assetId, address, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, charsetName, gameType, appKey, appVersion, responseType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/active/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Active Status", notes = "Activate or deactivate an account (requires appropriate permissions).", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateActveStatus(@ApiParam(value = "the account id of the user (deviceId or accountId required)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)", required = true) @QueryParam("connectionAccountId") @NotNull  Long connectionAccountId,@ApiParam(value = "true will activate the user and false will deactivate", required = true) @QueryParam("active") @NotNull  Boolean active,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the application key that the user belongs to") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateActveStatus(accountId, connectionAccountId, active, deviceId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/location/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Location", notes = "Update the account location", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateLocation(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The time of the update") @QueryParam("clientTime")  Long clientTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateLocation(deviceId, accountId, latitude, longitude, clientTime, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/settings/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Settings", notes = "Update the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class)
    })
    public Response updateSettings(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The notifications to be blocked") @QueryParam("blockedNotifications")  String blockedNotifications,@ApiParam(value = "How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)") @QueryParam("suggestionMethod")  String suggestionMethod,@ApiParam(value = "How many suggestions to receive per time frame") @QueryParam("suggestionCount")  Integer suggestionCount,@ApiParam(value = "The time frame in seconds, 3600 would be a 1 hour time frame") @QueryParam("suggestionTimeFrame")  Integer suggestionTimeFrame,@ApiParam(value = "Show Others Exact Location") @QueryParam("showOthersExactLocation")  Boolean showOthersExactLocation,@ApiParam(value = "Show As Zipcode") @QueryParam("showAsZipcode")  Boolean showAsZipcode,@ApiParam(value = "Show Exact Location") @QueryParam("showExactLocation")  Boolean showExactLocation,@ApiParam(value = "Show favorites") @QueryParam("favoriteVisibility")  String favoriteVisibility,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateSettings(deviceId, accountId, blockedNotifications, suggestionMethod, suggestionCount, suggestionTimeFrame, showOthersExactLocation, showAsZipcode, showExactLocation, favoriteVisibility, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/validateAccountSignup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Validation Status", notes = "Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class)
    })
    public Response validateAccountSignup(@ApiParam(value = "The token associated with the account to update, good for 24 hours", required = true) @QueryParam("token") @NotNull  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.validateAccountSignup(token, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/validatepasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Validate Password Reset Token", notes = "Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response validatePasswordReset(@ApiParam(value = "The token associated with the account to update, good for 24 hours", required = true) @QueryParam("token") @NotNull  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.validatePasswordReset(token, securityContext);
    }
}
