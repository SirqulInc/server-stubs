package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;

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
@Path("/api/{version}/thirdparty")
@Api(value = "/", description = "")
public interface ThirdPartyCredentialsApi  {

    /**
     * Create Credential
     *
     * This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user&#39;s third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. 
     *
     */
    @POST
    @Path("/credential/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Credential", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse createCredential(@PathParam("version") BigDecimal version, @QueryParam("thirdPartyId") @NotNull String thirdPartyId, @QueryParam("thirdPartyToken") @NotNull String thirdPartyToken, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("appKey") @NotNull String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("emailAddress") String emailAddress, @QueryParam("signinOnlyMode") @DefaultValue("false")Boolean signinOnlyMode, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove);

    /**
     * Create Network
     *
     * Creates a custom third party network.
     *
     */
    @POST
    @Path("/network/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Network", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public ThirdPartyNetworkResponse createNetwork(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("enableIntrospection") @NotNull Boolean enableIntrospection, @QueryParam("description") String description, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey, @Valid String body);

    /**
     * Delete Credential
     *
     * Delete a third party network on a Sirqul account.
     *
     */
    @POST
    @Path("/credential/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Credential", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteCredential(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("thirdPartyId") @NotNull String thirdPartyId, @QueryParam("appKey") @NotNull String appKey);

    /**
     * Delete Network
     *
     * Marks a custom third party network as deleted. Only the network owners and managers have access to this.
     *
     */
    @POST
    @Path("/network/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Network", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteNetwork(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("networkUID") @NotNull String networkUID);

    /**
     * Get Credential
     *
     * Gets the account information given a third party token.
     *
     */
    @POST
    @Path("/credential/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Credential", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse getCredential(@PathParam("version") BigDecimal version, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("appKey") @NotNull String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartySecret") String thirdPartySecret, @QueryParam("createNewAccount") @DefaultValue("false")Boolean createNewAccount, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId);

    /**
     * Get Network
     *
     * Get the details of a third party network. Only the network owners and managers have access to this.
     *
     */
    @GET
    @Path("/network/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Network", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public ThirdPartyNetworkResponse getNetwork(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("networkUID") @NotNull String networkUID);

    /**
     * Search Credentials
     *
     * Search on a user&#39;s linked third party networks.
     *
     */
    @GET
    @Path("/credential/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Credentials", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThirdPartyCredentialResponse.class, responseContainer = "List") })
    public List<ThirdPartyCredentialResponse> searchCredentials(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword, @QueryParam("networkUID") String networkUID, @QueryParam("descending") Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Search Networks
     *
     * Search on supported third party networks and custom networks from external users.
     *
     */
    @GET
    @Path("/network/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Networks", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List") })
    public List<ThirdPartyNetworkShortResponse> searchNetworks(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("filterBillable") Boolean filterBillable);

    /**
     * Send MFA Challenge
     *
     * Sends an MFA challenge (SMS or Email) for networks with MFA enabled.
     *
     */
    @POST
    @Path("/credential/mfa/send")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send MFA Challenge", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse sendMFAChallenge(@PathParam("version") BigDecimal version, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("appKey") @NotNull String appKey, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("deviceId") String deviceId);

    /**
     * Update Credential
     *
     * Updates a third-party login for an account.
     *
     */
    @POST
    @Path("/credential/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Credential", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse updateCredential(@PathParam("version") BigDecimal version, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("thirdPartyId") @NotNull String thirdPartyId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("responseFilters") String responseFilters, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken);

    /**
     * Update Network
     *
     * Updates a custom third party network. Only the network owners and managers have access to this.
     *
     */
    @POST
    @Path("/network/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Network", tags={ "ThirdParty Credentials" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public ThirdPartyNetworkResponse updateNetwork(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("networkUID") @NotNull String networkUID, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("enableIntrospection") Boolean enableIntrospection, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey, @Valid String body);
}
