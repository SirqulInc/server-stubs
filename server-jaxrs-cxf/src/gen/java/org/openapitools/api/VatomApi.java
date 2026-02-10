package org.openapitools.api;

import java.math.BigDecimal;

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
@Path("/api/{version}/vatom")
@Api(value = "/", description = "")
public interface VatomApi  {

    /**
     * Create following
     *
     * Create following.
     *
     */
    @POST
    @Path("/me/rels/following/create")
    @ApiOperation(value = "Create following", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void createFollowing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Create Vatom Space
     *
     * Create a Vatom space.
     *
     */
    @POST
    @Path("/b/spaces/create")
    @ApiOperation(value = "Create Vatom Space", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void createSpace(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Create Vatom Event
     *
     * Create a Vatom event.
     *
     */
    @POST
    @Path("/b/events/create")
    @ApiOperation(value = "Create Vatom Event", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void createVatomEvent(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Delete following
     *
     * Delete following.
     *
     */
    @POST
    @Path("/me/rels/following/delete")
    @ApiOperation(value = "Delete following", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteFollowing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomRelsKey") @NotNull String vatomRelsKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Reset All Points Balance
     *
     * Reset All Points Balance.
     *
     */
    @POST
    @Path("/b/campaign/points/delete")
    @ApiOperation(value = "Reset All Points Balance", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deletePointsBalance(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Delete Vatom Space
     *
     * Delete a Vatom space.
     *
     */
    @POST
    @Path("/b/spaces/delete")
    @ApiOperation(value = "Delete Vatom Space", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteSpace(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomSpaceId") @NotNull String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Delete Vatom Event
     *
     * Delete a Vatom event.
     *
     */
    @POST
    @Path("/b/events/delete")
    @ApiOperation(value = "Delete Vatom Event", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteVatomEvent(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomEventId") @NotNull String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Delete Vatom NFT
     *
     * Delete Vatom NFT
     *
     */
    @POST
    @Path("/vatoms/delete")
    @ApiOperation(value = "Delete Vatom NFT", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteVatomNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomId") @NotNull String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Execute Action on NFT
     *
     * Execute Action on NFT.
     *
     */
    @POST
    @Path("/vatoms/execute-action")
    @ApiOperation(value = "Execute Action on NFT", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void executeActionOnNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomId") @NotNull String vatomId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Search Vatom Geo Map
     *
     * Search Vatom Geo Map
     *
     */
    @GET
    @Path("/vatoms/geo-map/search")
    @ApiOperation(value = "Search Vatom Geo Map", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void geomapSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Business Behaviors
     *
     * Gets the behaviors of a business.
     *
     */
    @GET
    @Path("/b/behaviors")
    @ApiOperation(value = "Get Vatom Business Behaviors", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getBusinessBehaviors(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get the coins for a Business
     *
     * Get the coins for a Businesss.
     *
     */
    @GET
    @Path("/b/coins/get")
    @ApiOperation(value = "Get the coins for a Business", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getBusinessCoinsBalance(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get the user business ids
     *
     * Get the business ids the logged in user has access to.
     *
     */
    @GET
    @Path("/me/businesses")
    @ApiOperation(value = "Get the user business ids", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getBusinessIds(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Business Info
     *
     * Gets the business info tied to this account.
     *
     */
    @GET
    @Path("/b/get")
    @ApiOperation(value = "Get Vatom Business Info", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getBusinessInfo(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Business Users
     *
     * Gets the users of a business.
     *
     */
    @GET
    @Path("/b/users")
    @ApiOperation(value = "Get Vatom Business Users", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getBusinessUsers(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Campaign Group Entities
     *
     * Get campaign group entities.
     *
     */
    @GET
    @Path("/b/campaign-groups/entities")
    @ApiOperation(value = "Get Campaign Group Entities", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getCampaignGroupEntities(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Campaign Group Rules
     *
     * Get campaign group rules.
     *
     */
    @GET
    @Path("/b/campaign-groups/rules")
    @ApiOperation(value = "Get Campaign Group Rules", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getCampaignGroupRules(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Campaign Group Stats
     *
     * Get campaign group stats.
     *
     */
    @GET
    @Path("/b/campaign-groups/stats")
    @ApiOperation(value = "Get Campaign Group Stats", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getCampaignGroupStats(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Campaign Info
     *
     * Gets the info on a campaign.
     *
     */
    @GET
    @Path("/b/campaign-groups/get")
    @ApiOperation(value = "Get Campaign Info", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getCampaignInfo(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Event Guest List
     *
     * Gets the guest list of an event.
     *
     */
    @GET
    @Path("/b/events/guests/get")
    @ApiOperation(value = "Get Vatom Event Guest List", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getEventGuestList(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomEventId") @NotNull String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom User&#39;s Inventory
     *
     * Gets the logged in user&#39;s Vatom Inventory.
     *
     */
    @GET
    @Path("/me/inventory")
    @ApiOperation(value = "Get Vatom User's Inventory", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getInventory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get following
     *
     * Get following.
     *
     */
    @GET
    @Path("/me/rels/following")
    @ApiOperation(value = "Get following", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getMyFollowing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Points Balance
     *
     * Gets the points balance of a Vatom user.
     *
     */
    @GET
    @Path("/u/campaign/points/get")
    @ApiOperation(value = "Get Points Balance", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getPointsBalance(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Points Balance as Business
     *
     * Gets the points balance of a Vatom user.
     *
     */
    @GET
    @Path("/b/campaign/u/points/get")
    @ApiOperation(value = "Get Points Balance as Business", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getPointsBalanceAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Space
     *
     * Gets the details of a space.
     *
     */
    @GET
    @Path("/b/spaces/get")
    @ApiOperation(value = "Get Vatom Space", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getSpace(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomSpaceId") @NotNull String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get the coins for a user (as a Business)
     *
     * Get the coins for a user (as a Business).
     *
     */
    @GET
    @Path("/b/users/coins/get")
    @ApiOperation(value = "Get the coins for a user (as a Business)", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserCoinsAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Gets the coins balance for a Vatom User
     *
     * Gets the coins balance for a Vatom User.
     *
     */
    @GET
    @Path("/u/coins/get")
    @ApiOperation(value = "Gets the coins balance for a Vatom User", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserCoinsBalance(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get user followers
     *
     * Get user followers.
     *
     */
    @GET
    @Path("/users/rels/followers")
    @ApiOperation(value = "Get user followers", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserFollowers(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get user following
     *
     * Get user following.
     *
     */
    @GET
    @Path("/users/rels/following")
    @ApiOperation(value = "Get user following", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserFollowing(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get User Info
     *
     * Get a User&#39;s Info.
     *
     */
    @GET
    @Path("/user/get")
    @ApiOperation(value = "Get User Info", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserInfo(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom User Profile
     *
     * Gets the logged in user&#39;s profile in Vatom.
     *
     */
    @GET
    @Path("/me/get")
    @ApiOperation(value = "Get Vatom User Profile", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getUserProfile(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom Event
     *
     * Gets the details of a event.
     *
     */
    @GET
    @Path("/b/events/get")
    @ApiOperation(value = "Get Vatom Event", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getVatomEvent(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomEventId") @NotNull String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Get Vatom NFT Details
     *
     * Get Vatom NFT Details
     *
     */
    @GET
    @Path("/vatoms/get")
    @ApiOperation(value = "Get Vatom NFT Details", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void getVatomNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomId") @NotNull String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * List Vatom Communities
     *
     * Gets the communities tied to a business.
     *
     */
    @GET
    @Path("/b/communities/search")
    @ApiOperation(value = "List Vatom Communities", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void listCommunities(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * List Vatom Events
     *
     * Gets the events tied to a business.
     *
     */
    @GET
    @Path("/b/events/search")
    @ApiOperation(value = "List Vatom Events", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void listEvents(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * List Vatom Spaces
     *
     * Gets the spaces tied to a business.
     *
     */
    @GET
    @Path("/b/spaces/search")
    @ApiOperation(value = "List Vatom Spaces", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void listSpaces(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * List Coin Transactions for a Vatom User
     *
     * Gets the logged in user&#39;s Vatom coin transactions.
     *
     */
    @GET
    @Path("/u/coins/txns/search")
    @ApiOperation(value = "List Coin Transactions for a Vatom User", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void listUserCoinTransactions(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * List coin transactions for a user (as a Business)
     *
     * List coin transactions for a user (as a Business).
     *
     */
    @GET
    @Path("/b/users/coins/txns/search")
    @ApiOperation(value = "List coin transactions for a user (as a Business)", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void listUserCoinTransactionsAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Perform Action on NFT
     *
     * Perform Action on NFT.
     *
     */
    @POST
    @Path("/me/vatoms/actions")
    @ApiOperation(value = "Perform Action on NFT", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void performActionOnNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomId") @NotNull String vatomId, @QueryParam("vatomAction") @NotNull String vatomAction, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Redeem NFT
     *
     * Redeem an NFT.
     *
     */
    @POST
    @Path("/b/redemptions")
    @ApiOperation(value = "Redeem NFT", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void redeemNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Redeem the coins for a user (as a Business)
     *
     * Redeem the coins for a user (as a Business).
     *
     */
    @POST
    @Path("/b/users/coins/redeem")
    @ApiOperation(value = "Redeem the coins for a user (as a Business)", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void redeemUserCoinsAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Search for Vatom Businesses
     *
     * Searches for Vatom businesses.
     *
     */
    @GET
    @Path("/b/search")
    @ApiOperation(value = "Search for Vatom Businesses", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void searchBusinesses(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Search Campaign Groups
     *
     * Search campaign groups.
     *
     */
    @GET
    @Path("/b/campaign-groups/search")
    @ApiOperation(value = "Search Campaign Groups", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void searchCampaignGroups(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Search User Identities
     *
     * Search User Identities.
     *
     */
    @GET
    @Path("/me/identities/search")
    @ApiOperation(value = "Search User Identities", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void searchIdentities(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Search Vatom User&#39;s Inventory
     *
     * Searches the logged in user&#39;s Vatom Inventory.
     *
     */
    @GET
    @Path("/user-inventory/search")
    @ApiOperation(value = "Search Vatom User's Inventory", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void searchInventory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Send NFT
     *
     * Send an NFT.
     *
     */
    @POST
    @Path("/b/campaigns/send")
    @ApiOperation(value = "Send NFT", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void sendNFT(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Set Points Balance as Business
     *
     * Sets the points balance of a Vatom user.
     *
     */
    @POST
    @Path("/b/campaign/u/points/update")
    @ApiOperation(value = "Set Points Balance as Business", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void setPointsBalanceAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomCampaignId") @NotNull String vatomCampaignId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Transfer coins from Vatom Users
     *
     * Transfer coins from Vatom Users.
     *
     */
    @POST
    @Path("/u/coins/transfer")
    @ApiOperation(value = "Transfer coins from Vatom Users", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void transferUserCoins(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Fund coins for a Business
     *
     * Fund/update coins for a Businesss.
     *
     */
    @POST
    @Path("/b/coins/update")
    @ApiOperation(value = "Fund coins for a Business", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateBusinessCoins(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Update Vatom Event Guest List
     *
     * Update the guest list of an event.
     *
     */
    @POST
    @Path("/b/events/guests/update")
    @ApiOperation(value = "Update Vatom Event Guest List", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateEventGuestList(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomEventId") @NotNull String vatomEventId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Update Vatom Space
     *
     * Update a Vatom space.
     *
     */
    @POST
    @Path("/b/spaces/update")
    @ApiOperation(value = "Update Vatom Space", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateSpace(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomSpaceId") @NotNull String vatomSpaceId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Update the coins for a user (as a Business)
     *
     * Update the coins for a user (as a Business).
     *
     */
    @POST
    @Path("/b/users/coins/update")
    @ApiOperation(value = "Update the coins for a user (as a Business)", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateUserCoinsAsBusiness(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomUserId") @NotNull String vatomUserId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Update Vatom User Profile
     *
     * Gets the logged in user&#39;s profile in Vatom.
     *
     */
    @POST
    @Path("/me/update")
    @ApiOperation(value = "Update Vatom User Profile", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateUserProfile(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);

    /**
     * Update Vatom Event
     *
     * Update a Vatom event.
     *
     */
    @POST
    @Path("/b/events/update")
    @ApiOperation(value = "Update Vatom Event", tags={ "Vatom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateVatomEvent(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("vatomEventId") @NotNull String vatomEventId, @QueryParam("vatomParameters") @NotNull String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse);
}
