package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ThirdpartyApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;

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

@Path("/thirdparty")


@io.swagger.annotations.Api(description = "the thirdparty API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdpartyApi  {

    @Inject ThirdpartyApiService service;

    @POST
    @Path("/credential/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Credential", notes = "This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. ", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response createCredential( @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("thirdPartyToken") String thirdPartyToken, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("emailAddress") String emailAddress, @DefaultValue("false") @QueryParam("signinOnlyMode") Boolean signinOnlyMode, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCredential(thirdPartyId,thirdPartyToken,networkUID,appKey,accountId,deviceId,sessionId,thirdPartyName,emailAddress,signinOnlyMode,responseFilters,latitude,longitude,metaData,thirdPartyRefreshToken,audienceIdsToAdd,audienceIdsToRemove,securityContext);
    }
    @POST
    @Path("/network/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Network", notes = "Creates a custom third party network.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response createNetwork( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("enableIntrospection") Boolean enableIntrospection, @QueryParam("description") String description, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNetwork(accountId,name,enableIntrospection,description,introspectionMethod,introspectionURL,introspectionParams,requiredRootField,enableMFA,sizeMFA,shelfLifeMFA,oauthTokenURL,oauthPrivateKey,oauthPublicKey,oauthClientId,oauthSecretKey,body,securityContext);
    }
    @POST
    @Path("/credential/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Credential", notes = "Delete a third party network on a Sirqul account.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCredential( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCredential(accountId,networkUID,thirdPartyId,appKey,securityContext);
    }
    @POST
    @Path("/network/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Network", notes = "Marks a custom third party network as deleted. Only the network owners and managers have access to this.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteNetwork( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNetwork(accountId,networkUID,securityContext);
    }
    @POST
    @Path("/credential/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Credential", notes = "Gets the account information given a third party token.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response getCredential( @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartySecret") String thirdPartySecret, @DefaultValue("false") @QueryParam("createNewAccount") Boolean createNewAccount, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCredential(networkUID,appKey,accountId,deviceId,sessionId,thirdPartyCredentialId,thirdPartyToken,thirdPartySecret,createNewAccount,responseFilters,latitude,longitude,audienceIdsToAdd,audienceIdsToRemove,referralAccountId,securityContext);
    }
    @GET
    @Path("/network/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Network", notes = "Get the details of a third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response getNetwork( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNetwork(accountId,networkUID,securityContext);
    }
    @GET
    @Path("/credential/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Credentials", notes = "Search on a user's linked third party networks.", response = ThirdPartyCredentialResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyCredentialResponse.class, responseContainer = "List") })
    public Response searchCredentials( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("networkUID") String networkUID, @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCredentials(accountId,keyword,networkUID,descending,start,limit,securityContext);
    }
    @GET
    @Path("/network/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Networks", notes = "Search on supported third party networks and custom networks from external users.", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List") })
    public Response searchNetworks( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, NAME, DESCRIPTION" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("filterBillable") Boolean filterBillable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNetworks(accountId,sortField,descending,start,limit,activeOnly,keyword,filterBillable,securityContext);
    }
    @POST
    @Path("/credential/mfa/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send MFA Challenge", notes = "Sends an MFA challenge (SMS or Email) for networks with MFA enabled.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendMFAChallenge( @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("deviceId") String deviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendMFAChallenge(networkUID,appKey,thirdPartyToken,thirdPartyCredentialId,deviceId,securityContext);
    }
    @POST
    @Path("/credential/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Credential", notes = "Updates a third-party login for an account.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response updateCredential( @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("responseFilters") String responseFilters, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCredential(networkUID,thirdPartyId,appKey,deviceId,thirdPartyName,thirdPartyToken,responseFilters,metaData,thirdPartyRefreshToken,securityContext);
    }
    @POST
    @Path("/network/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Network", notes = "Updates a custom third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response updateNetwork( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("enableIntrospection") Boolean enableIntrospection, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNetwork(accountId,networkUID,name,description,enableIntrospection,introspectionMethod,introspectionURL,introspectionParams,requiredRootField,enableMFA,sizeMFA,shelfLifeMFA,oauthTokenURL,oauthPrivateKey,oauthPublicKey,oauthClientId,oauthSecretKey,body,securityContext);
    }
}
