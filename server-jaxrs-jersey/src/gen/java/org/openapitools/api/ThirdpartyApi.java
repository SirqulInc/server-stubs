package org.openapitools.api;

import org.openapitools.api.ThirdpartyApiService;
import org.openapitools.api.factories.ThirdpartyApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/thirdparty")


@io.swagger.annotations.Api(description = "the thirdparty API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdpartyApi  {
   private final ThirdpartyApiService delegate;

   public ThirdpartyApi(@Context ServletConfig servletContext) {
      ThirdpartyApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ThirdpartyApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ThirdpartyApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ThirdpartyApiServiceFactory.getThirdpartyApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/credential/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Credential", notes = "This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. ", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response createCredential(@ApiParam(value = "the third party user account id", required = true) @QueryParam("thirdPartyId") @NotNull  String thirdPartyId,@ApiParam(value = "the access token to authenticate with (ex: username or fb token or phone number)", required = true) @QueryParam("thirdPartyToken") @NotNull  String thirdPartyToken,@ApiParam(value = "the access provider to authenticate against", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the unique id of the account that needs authenticating (optional for PHONE_V2)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the session id for the request") @QueryParam("sessionId")  String sessionId,@ApiParam(value = "the third party user's display name") @QueryParam("thirdPartyName")  String thirdPartyName,@ApiParam(value = "optional email address associated with the third party account") @QueryParam("emailAddress")  String emailAddress,@ApiParam(value = "when true will error out if can't find any accounts matching (signin only)", defaultValue = "false") @DefaultValue("false") @QueryParam("signinOnlyMode")  Boolean signinOnlyMode,@ApiParam(value = "this determines how much of the profile should be returned, see ProfileFilters") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "the latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "optional refresh token for the third party") @QueryParam("thirdPartyRefreshToken")  String thirdPartyRefreshToken,@ApiParam(value = "audience ids to add to the account") @QueryParam("audienceIdsToAdd")  String audienceIdsToAdd,@ApiParam(value = "audience ids to remove from the account") @QueryParam("audienceIdsToRemove")  String audienceIdsToRemove,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCredential(thirdPartyId, thirdPartyToken, networkUID, appKey, accountId, deviceId, sessionId, thirdPartyName, emailAddress, signinOnlyMode, responseFilters, latitude, longitude, metaData, thirdPartyRefreshToken, audienceIdsToAdd, audienceIdsToRemove, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/network/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Network", notes = "Creates a custom third party network.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class)
    })
    public Response createNetwork(@ApiParam(value = "The account id making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the network", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "Whether the network uses introspection calls", required = true) @QueryParam("enableIntrospection") @NotNull  Boolean enableIntrospection,@ApiParam(value = "The description of the network") @QueryParam("description")  String description,@ApiParam(value = "HTTP method to use for introspection calls (e.g., GET, POST)") @QueryParam("introspectionMethod")  String introspectionMethod,@ApiParam(value = "The HTTP URL of the introspection call") @QueryParam("introspectionURL")  String introspectionURL,@ApiParam(value = "The parameters of the introspection call") @QueryParam("introspectionParams")  String introspectionParams,@ApiParam(value = "Required response params") @QueryParam("requiredRootField")  String requiredRootField,@ApiParam(value = "Whether this network uses MFA") @QueryParam("enableMFA")  Boolean enableMFA,@ApiParam(value = "Size of the MFA token") @QueryParam("sizeMFA")  Integer sizeMFA,@ApiParam(value = "Shelf life (seconds) of the MFA token") @QueryParam("shelfLifeMFA")  Integer shelfLifeMFA,@ApiParam(value = "OAuth token endpoint URL") @QueryParam("oauthTokenURL")  String oauthTokenURL,@ApiParam(value = "OAuth private key file (multipart)") @QueryParam("oauthPrivateKey")  File oauthPrivateKey,@ApiParam(value = "OAuth public key file (multipart)") @QueryParam("oauthPublicKey")  File oauthPublicKey,@ApiParam(value = "OAuth client id") @QueryParam("oauthClientId")  String oauthClientId,@ApiParam(value = "OAuth secret key") @QueryParam("oauthSecretKey")  String oauthSecretKey,@ApiParam(value = "")  String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createNetwork(accountId, name, enableIntrospection, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/credential/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Credential", notes = "Delete a third party network on a Sirqul account.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteCredential(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The third party network identifier", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "The third party user id", required = true) @QueryParam("thirdPartyId") @NotNull  String thirdPartyId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCredential(accountId, networkUID, thirdPartyId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/network/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Network", notes = "Marks a custom third party network as deleted. Only the network owners and managers have access to this.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteNetwork(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The unique identifier for the third party network defined by Sirqul", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteNetwork(accountId, networkUID, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/credential/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Credential", notes = "Gets the account information given a third party token.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response getCredential(@ApiParam(value = "the access provider to authenticate against", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the unique account id of a specific account that will be bound to the third-party credentials") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the session id for the request") @QueryParam("sessionId")  String sessionId,@ApiParam(value = "the third-party credentials id from the response of the credential/create step") @QueryParam("thirdPartyCredentialId")  Long thirdPartyCredentialId,@ApiParam(value = "the access token to authenticate with") @QueryParam("thirdPartyToken")  String thirdPartyToken,@ApiParam(value = "the secret code to authenticate with (used for MFA)") @QueryParam("thirdPartySecret")  String thirdPartySecret,@ApiParam(value = "flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts", defaultValue = "false") @DefaultValue("false") @QueryParam("createNewAccount")  Boolean createNewAccount,@ApiParam(value = "this determines how much of the profile should be returned, see ProfileFilters") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "the latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "audience ids to add to the account") @QueryParam("audienceIdsToAdd")  String audienceIdsToAdd,@ApiParam(value = "audience ids to remove from the account") @QueryParam("audienceIdsToRemove")  String audienceIdsToRemove,@ApiParam(value = "account id of the referrer (inviter-invitee relationship)") @QueryParam("referralAccountId")  Long referralAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCredential(networkUID, appKey, accountId, deviceId, sessionId, thirdPartyCredentialId, thirdPartyToken, thirdPartySecret, createNewAccount, responseFilters, latitude, longitude, audienceIdsToAdd, audienceIdsToRemove, referralAccountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/network/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Network", notes = "Get the details of a third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class)
    })
    public Response getNetwork(@ApiParam(value = "The account id making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The unique identifier for the third party network defined by Sirqul", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNetwork(accountId, networkUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/credential/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Credentials", notes = "Search on a user's linked third party networks.", response = ThirdPartyCredentialResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyCredentialResponse.class, responseContainer = "List")
    })
    public Response searchCredentials(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The keyword used to search on the third party name and network string") @QueryParam("keyword")  String keyword,@ApiParam(value = "The network UID to filter results with") @QueryParam("networkUID")  String networkUID,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start of the pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit of the pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchCredentials(accountId, keyword, networkUID, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/network/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Networks", notes = "Search on supported third party networks and custom networks from external users.", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List")
    })
    public Response searchNetworks(@ApiParam(value = "The account id making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME", required = true, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, NAME, DESCRIPTION") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "The order to return the search results", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start of the pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit of the pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The keyword used to search on the network name and description fields") @QueryParam("keyword")  String keyword,@ApiParam(value = "Determines whether to only return applications that the user has access to") @QueryParam("filterBillable")  Boolean filterBillable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchNetworks(accountId, sortField, descending, start, limit, activeOnly, keyword, filterBillable, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/credential/mfa/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send MFA Challenge", notes = "Sends an MFA challenge (SMS or Email) for networks with MFA enabled.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response sendMFAChallenge(@ApiParam(value = "the third party network provider that has MFA enabled", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the access token to authenticate with") @QueryParam("thirdPartyToken")  String thirdPartyToken,@ApiParam(value = "optional id of the existing third party credential") @QueryParam("thirdPartyCredentialId")  Long thirdPartyCredentialId,@ApiParam(value = "the unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendMFAChallenge(networkUID, appKey, thirdPartyToken, thirdPartyCredentialId, deviceId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/credential/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Credential", notes = "Updates a third-party login for an account.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response updateCredential(@ApiParam(value = "the access provider to authenticate against", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "the third party user account id", required = true) @QueryParam("thirdPartyId") @NotNull  String thirdPartyId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the unique id of the device making the request") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the third party user name") @QueryParam("thirdPartyName")  String thirdPartyName,@ApiParam(value = "the access token to authenticate with (ex: username or fb token)") @QueryParam("thirdPartyToken")  String thirdPartyToken,@ApiParam(value = "this determines how much of the profile should be returned, see ProfileFilters") @QueryParam("responseFilters")  String responseFilters,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "optional refresh token for the third party") @QueryParam("thirdPartyRefreshToken")  String thirdPartyRefreshToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCredential(networkUID, thirdPartyId, appKey, deviceId, thirdPartyName, thirdPartyToken, responseFilters, metaData, thirdPartyRefreshToken, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/network/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Network", notes = "Updates a custom third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class)
    })
    public Response updateNetwork(@ApiParam(value = "The account id making the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The unique identifier for the third party network defined by Sirqul", required = true) @QueryParam("networkUID") @NotNull  String networkUID,@ApiParam(value = "The name of the network") @QueryParam("name")  String name,@ApiParam(value = "The description of the network") @QueryParam("description")  String description,@ApiParam(value = "Whether the network uses introspection calls") @QueryParam("enableIntrospection")  Boolean enableIntrospection,@ApiParam(value = "HTTP method to use for introspection calls (e.g., GET, POST)") @QueryParam("introspectionMethod")  String introspectionMethod,@ApiParam(value = "The HTTP URL of the introspection call") @QueryParam("introspectionURL")  String introspectionURL,@ApiParam(value = "The parameters of the introspection call") @QueryParam("introspectionParams")  String introspectionParams,@ApiParam(value = "Required response params") @QueryParam("requiredRootField")  String requiredRootField,@ApiParam(value = "Whether this network uses MFA") @QueryParam("enableMFA")  Boolean enableMFA,@ApiParam(value = "Size of the MFA token") @QueryParam("sizeMFA")  Integer sizeMFA,@ApiParam(value = "Shelf life (seconds) of the MFA token") @QueryParam("shelfLifeMFA")  Integer shelfLifeMFA,@ApiParam(value = "OAuth token endpoint URL") @QueryParam("oauthTokenURL")  String oauthTokenURL,@ApiParam(value = "OAuth private key file (multipart)") @QueryParam("oauthPrivateKey")  File oauthPrivateKey,@ApiParam(value = "OAuth public key file (multipart)") @QueryParam("oauthPublicKey")  File oauthPublicKey,@ApiParam(value = "OAuth client id") @QueryParam("oauthClientId")  String oauthClientId,@ApiParam(value = "OAuth secret key") @QueryParam("oauthSecretKey")  String oauthSecretKey,@ApiParam(value = "")  String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateNetwork(accountId, networkUID, name, description, enableIntrospection, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, enableMFA, sizeMFA, shelfLifeMFA, oauthTokenURL, oauthPrivateKey, oauthPublicKey, oauthClientId, oauthSecretKey, body, securityContext);
    }
}
