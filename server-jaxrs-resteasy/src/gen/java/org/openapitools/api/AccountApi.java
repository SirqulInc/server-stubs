package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AccountApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/account")


@io.swagger.annotations.Api(description = "the account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountApi  {

    @Inject AccountApiService service;

    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts by Location", notes = "Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.", response = UserLocationSearchResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserLocationSearchResponse.class) })
    public Response accountLocationSearch( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("postalCode") String postalCode, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @DefaultValue("10") @QueryParam("range") Double range, @QueryParam("locationLastUpdated") Long locationLastUpdated, @QueryParam("gender") String gender, @QueryParam("minAge") Integer minAge, @QueryParam("maxAge") Integer maxAge, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("roles") String roles, @QueryParam("tags") String tags, @QueryParam("experience") String experience, @QueryParam("categoryIds") String categoryIds, @QueryParam("audienceIds") String audienceIds, @DefaultValue("AND") @QueryParam("audienceOperator") String audienceOperator, @DefaultValue("false") @QueryParam("updateCurrentLocation") Boolean updateCurrentLocation, @DefaultValue("false") @QueryParam("updatePreferredSettings") Boolean updatePreferredSettings, @DefaultValue("true") @QueryParam("showExactLocations") Boolean showExactLocations, @DefaultValue("false") @QueryParam("showConnectionToSearcher") Boolean showConnectionToSearcher, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("verifiedUserOnly") Boolean verifiedUserOnly, @QueryParam("contentAdminOnly") Boolean contentAdminOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.accountLocationSearch(deviceId,accountId,q,keyword,postalCode,latitude,longitude,appKey,range,locationLastUpdated,gender,minAge,maxAge,companionshipIndex,i,start,l,limit,searchMode,sortField,descending,roles,tags,experience,categoryIds,audienceIds,audienceOperator,updateCurrentLocation,updatePreferredSettings,showExactLocations,showConnectionToSearcher,flagCountMinimum,verifiedUserOnly,contentAdminOnly,securityContext);
    }
    @POST
    @Path("/block")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Block Account", notes = "Moves or removes an account into the user's blocked group.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response blockAccount( @NotNull @QueryParam("accountIdBeingBlocked") Long accountIdBeingBlocked, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("true") @QueryParam("blockFlagValue") Boolean blockFlagValue, @DefaultValue("false") @QueryParam("removeFromGroupsIfBlocked") Boolean removeFromGroupsIfBlocked, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.blockAccount(accountIdBeingBlocked,deviceId,accountId,blockFlagValue,removeFromGroupsIfBlocked,latitude,longitude,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account", notes = "Create a new account by role.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response createAccount( @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("streetAddress") String streetAddress, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("role") String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("inviteToken") String inviteToken, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("sendValidation") Boolean sendValidation, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("homeLatitude") Double homeLatitude, @QueryParam("homeLongitude") Double homeLongitude, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAccount(username,password,name,prefixName,firstName,middleName,lastName,suffixName,title,deviceId,deviceIdType,emailAddress,assetId,streetAddress,zipcode,gender,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,role,platforms,tags,aboutUs,gameExperience,categoryIds,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,latitude,longitude,acceptedTerms,inviteToken,referralAccountId,sendValidation,gameType,appKey,appVersion,responseType,audienceIdsToAdd,appBlob,appEnablePush,appEnableSMS,appEnableEmail,locationVisibility,homeLatitude,homeLongitude,appNickname,personalAudienceId,securityContext);
    }
    @POST
    @Path("/profile/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account", notes = "Edit the user's profile information", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public Response editAccount( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("role") String role, @QueryParam("assetId") Long assetId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("makeProfileInfoPublic") Boolean makeProfileInfoPublic, @QueryParam("makeGameInfoPublic") Boolean makeGameInfoPublic, @QueryParam("makeFriendsInfoPublic") Boolean makeFriendsInfoPublic, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("matchToken") String matchToken, @QueryParam("gameExperience") String gameExperience, @QueryParam("categories") String categories, @QueryParam("categoryIds") String categoryIds, @DefaultValue("PROFILE,PROFILE_CONTACT") @QueryParam("responseFilters") String responseFilters, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId, @QueryParam("nonGuestUsername") String nonGuestUsername,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.editAccount(deviceId,accountId,connectionAccountId,role,assetId,name,prefixName,firstName,middleName,lastName,suffixName,title,gender,age,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,makeProfileInfoPublic,makeGameInfoPublic,makeFriendsInfoPublic,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,platforms,tags,aboutUs,matchToken,gameExperience,categories,categoryIds,responseFilters,showAsZipcode,showExactLocation,showOthersExactLocation,acceptedTerms,locationVisibility,appBlob,appEnablePush,appEnableSMS,appEnableEmail,gameType,appKey,latitude,longitude,returnProfile,audienceIdsToAdd,audienceIdsToRemove,referralAccountId,appNickname,personalAudienceId,nonGuestUsername,securityContext);
    }
    @POST
    @Path("/username/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Username and Email", notes = "Update account's own username and/or emailAddress", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response editUsername( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("emailAddress") String emailAddress, @QueryParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.editUsername(deviceId,accountId,emailAddress,username,securityContext);
    }
    @GET
    @Path("/profile/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account", notes = "Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response getAccount( @DefaultValue("false") @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @DefaultValue("0") @QueryParam("connectionAccountId") Long connectionAccountId, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @DefaultValue("SIRQUL") @QueryParam("purchaseType") String purchaseType, @DefaultValue("false") @QueryParam("updateViewedDate") Boolean updateViewedDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAccount(returnNulls,deviceId,accountId,connectionAccountEmail,connectionAccountId,responseFilters,gameType,appKey,purchaseType,updateViewedDate,latitude,longitude,securityContext);
    }
    @GET
    @Path("/location/trilaterate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by Trilateration", notes = "Send in device data and calculate a position based on signal strengths.", response = GeoPointResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GeoPointResponse.class) })
    public Response getLocationByTrilateration( @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("data") String data, @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocationByTrilateration(accountId,latitude,longitude,data,responseFilters,securityContext);
    }
    @GET
    @Path("/profile/assets")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Profile Assets", notes = "Get a list of assets a person has ever uploaded. Filters the list based on parameters.", response = AssetListResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetListResponse.class) })
    public Response getProfileAssets( @DefaultValue("false") @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("mediaTypes") String mediaTypes, @QueryParam("mimeTypes") String mimeTypes, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("0") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getProfileAssets(returnNulls,deviceId,accountId,ownerId,mediaTypes,mimeTypes,sortField,descending,latitude,longitude,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/referral/list")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Gets a user's account profile and their referral List.", response = Void.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getReferralList( @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retrieveType") String retrieveType, @QueryParam("levelLimit") BigDecimal levelLimit, @QueryParam("ancestorLevelLimit") BigDecimal ancestorLevelLimit, @QueryParam("childrenLevelLimit") BigDecimal childrenLevelLimit, @QueryParam("ancestorListStart") BigDecimal ancestorListStart, @QueryParam("ancestorListLimit") BigDecimal ancestorListLimit, @QueryParam("childrenListStart") BigDecimal childrenListStart, @QueryParam("childrenListLimit") BigDecimal childrenListLimit, @DefaultValue("true") @QueryParam("childrenChildren") Boolean childrenChildren,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getReferralList(accountId,appKey,retrieveType,levelLimit,ancestorLevelLimit,childrenLevelLimit,ancestorListStart,ancestorListLimit,childrenListStart,childrenListLimit,childrenChildren,securityContext);
    }
    @GET
    @Path("/settings/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Settings", notes = "Get the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public Response getSettings( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSettings(deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/login/delegate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login as Account", notes = "A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginDelegate( @NotNull @QueryParam("accessToken") String accessToken, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accessTokenSecret") String accessTokenSecret, @QueryParam("delegatedAccountId") Long delegatedAccountId, @QueryParam("delegatedUsername") String delegatedUsername, @DefaultValue("USERNAME") @QueryParam("networkUID") String networkUID, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginDelegate(accessToken,appKey,deviceId,accessTokenSecret,delegatedAccountId,delegatedUsername,networkUID,ageRestriction,responseFilters,latitude,longitude,securityContext);
    }
    @POST
    @Path("/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account", notes = "General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginGeneral( @NotNull @QueryParam("accessToken") String accessToken, @NotNull @DefaultValue("USERNAME") @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accessTokenSecret") String accessTokenSecret, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("emailMatch") Boolean emailMatch, @DefaultValue("0") @QueryParam("chosenAccountId") Long chosenAccountId, @DefaultValue("0") @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginGeneral(accessToken,networkUID,appKey,deviceId,deviceIdType,accessTokenSecret,ageRestriction,responseFilters,latitude,longitude,emailMatch,chosenAccountId,thirdPartyCredentialId,securityContext);
    }
    @POST
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Username)", notes = "Login to system with an account", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginUsername( @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginUsername(username,password,deviceId,latitude,longitude,app,gameType,appKey,returnProfile,responseFilters,securityContext);
    }
    @POST
    @Path("/logout")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Logout Account", notes = "Cleans up the users data for logging out.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response logout( @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.logout(deviceId,deviceIdType,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/merge")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Merge Account", notes = "Merges the analytics, achievements, leaderboards of two accounts.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response mergeAccount( @NotNull @QueryParam("mergeAccountId") Long mergeAccountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.mergeAccount(mergeAccountId,appKey,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/passwordchange")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Password", notes = "Update the account password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response passwordChange( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("oldPassword") String oldPassword, @NotNull @QueryParam("newPassword") String newPassword, @NotNull @QueryParam("confirmPassword") String confirmPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.passwordChange(accountId,oldPassword,newPassword,confirmPassword,securityContext);
    }
    @POST
    @Path("/passwordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reset Password", notes = "Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response passwordReset( @NotNull @QueryParam("token") String token, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("confirm") String confirm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.passwordReset(token,password,confirm,securityContext);
    }
    @POST
    @Path("/requestpasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Password Reset", notes = "Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response requestPasswordReset( @NotNull @QueryParam("email") String email, @DefaultValue("Sirqul") @QueryParam("from") String from, @QueryParam("domain") String domain, @QueryParam("subUrl") String subUrl, @DefaultValue("http://dev.sirqul.com/resetpassword") @QueryParam("referer") String referer,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestPasswordReset(email,from,domain,subUrl,referer,securityContext);
    }
    @POST
    @Path("/requestValidateAccount")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Validation Request", notes = "Send an email to validate a user's account.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response requestValidateAccount( @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestValidateAccount(accountId,securityContext);
    }
    @GET
    @Path("/profile/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Search for account profiles.", response = ProfileResponse.class, responseContainer = "List", tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class, responseContainer = "List") })
    public Response searchAccounts( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("radius") Double radius,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender,, allowableValues="ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT" @QueryParam("gameExperience") String gameExperience, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @DefaultValue("true") @QueryParam("returnNulls") Boolean returnNulls, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @DefaultValue("SIRQUL") @QueryParam("purchaseType") String purchaseType, @DefaultValue("id") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAccounts(accountId,appKey,keyword,latitude,longitude,radius,gender,gameExperience,age,categoryIds,returnNulls,responseFilters,purchaseType,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @POST
    @Path("/login/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Encrypted Username)", notes = "ogin with encrypted user-name and password.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response secureLogin( @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("gameType") String gameType, @QueryParam("deviceId") String deviceId, @DefaultValue("UTF-8") @QueryParam("charsetName") String charsetName, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("returnProfile") Boolean returnProfile, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.secureLogin(username,password,gameType,deviceId,charsetName,latitude,longitude,returnProfile,responseFilters,securityContext);
    }
    @POST
    @Path("/create/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account (Encrypted Username)", notes = "Create a new account by role (with encrypted user-name and password)", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public Response secureSignup( @NotNull @QueryParam("deviceId") String deviceId, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("inviteToken") String inviteToken, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("address") String address, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @DefaultValue("MEMBER") @QueryParam("role") String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("true") @QueryParam("acceptedTerms") Boolean acceptedTerms, @DefaultValue("UTF-8") @QueryParam("charsetName") String charsetName, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.secureSignup(deviceId,username,password,name,inviteToken,prefixName,firstName,middleName,lastName,suffixName,title,deviceIdType,emailAddress,assetId,address,zipcode,gender,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,role,platforms,tags,aboutUs,gameExperience,categoryIds,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,latitude,longitude,acceptedTerms,charsetName,gameType,appKey,appVersion,responseType,securityContext);
    }
    @POST
    @Path("/active/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Active Status", notes = "Activate or deactivate an account (requires appropriate permissions).", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateActveStatus( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateActveStatus(accountId,connectionAccountId,active,deviceId,appKey,securityContext);
    }
    @POST
    @Path("/location/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Location", notes = "Update the account location", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateLocation( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("clientTime") Long clientTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocation(deviceId,accountId,latitude,longitude,clientTime,securityContext);
    }
    @POST
    @Path("/settings/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Settings", notes = "Update the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public Response updateSettings( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("blockedNotifications") String blockedNotifications, @QueryParam("suggestionMethod") String suggestionMethod, @QueryParam("suggestionCount") Integer suggestionCount, @QueryParam("suggestionTimeFrame") Integer suggestionTimeFrame, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("favoriteVisibility") String favoriteVisibility, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSettings(deviceId,accountId,blockedNotifications,suggestionMethod,suggestionCount,suggestionTimeFrame,showOthersExactLocation,showAsZipcode,showExactLocation,favoriteVisibility,latitude,longitude,securityContext);
    }
    @POST
    @Path("/validateAccountSignup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Validation Status", notes = "Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response validateAccountSignup( @NotNull @QueryParam("token") String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.validateAccountSignup(token,securityContext);
    }
    @POST
    @Path("/validatepasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Validate Password Reset Token", notes = "Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response validatePasswordReset( @NotNull @QueryParam("token") String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.validatePasswordReset(token,securityContext);
    }
}
