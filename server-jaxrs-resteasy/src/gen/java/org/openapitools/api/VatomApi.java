package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.VatomApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

@Path("/vatom")


@io.swagger.annotations.Api(description = "the vatom API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VatomApi  {

    @Inject VatomApiService service;

    @POST
    @Path("/me/rels/following/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create following", notes = "Create following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createFollowing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFollowing(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/spaces/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Space", notes = "Create a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createSpace( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSpace(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/events/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Event", notes = "Create a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createVatomEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVatomEvent(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/me/rels/following/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete following", notes = "Delete following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteFollowing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomRelsKey") String vatomRelsKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFollowing(accountId,vatomRelsKey,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/campaign/points/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Reset All Points Balance", notes = "Reset All Points Balance.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deletePointsBalance( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePointsBalance(accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/spaces/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Space", notes = "Delete a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteSpace( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSpace(accountId,appKey,vatomSpaceId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/events/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Event", notes = "Delete a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVatomEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVatomEvent(accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vatoms/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom NFT", notes = "Delete Vatom NFT", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVatomNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVatomNFT(accountId,vatomId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vatoms/execute-action")
    
    
    @io.swagger.annotations.ApiOperation(value = "Execute Action on NFT", notes = "Execute Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response executeActionOnNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.executeActionOnNFT(accountId,vatomId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatoms/geo-map/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom Geo Map", notes = "Search Vatom Geo Map", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response geomapSearch( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.geomapSearch(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/behaviors")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Behaviors", notes = "Gets the behaviors of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessBehaviors( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessBehaviors(accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a Business", notes = "Get the coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessCoinsBalance( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessCoinsBalance(accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/me/businesses")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the user business ids", notes = "Get the business ids the logged in user has access to.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessIds( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessIds(accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Info", notes = "Gets the business info tied to this account.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessInfo( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessInfo(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/users")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Users", notes = "Gets the users of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessUsers( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessUsers(accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign-groups/entities")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Entities", notes = "Get campaign group entities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupEntities( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupEntities(accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign-groups/rules")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Rules", notes = "Get campaign group rules.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupRules( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupRules(accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign-groups/stats")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Stats", notes = "Get campaign group stats.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupStats( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupStats(accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign-groups/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Info", notes = "Gets the info on a campaign.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignInfo( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignInfo(accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/events/guests/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event Guest List", notes = "Gets the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getEventGuestList( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEventGuestList(accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/me/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User's Inventory", notes = "Gets the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getInventory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInventory(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/me/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get following", notes = "Get following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getMyFollowing( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMyFollowing(accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/u/campaign/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getPointsBalance( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPointsBalance(accountId,vatomUserId,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign/u/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance as Business", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getPointsBalanceAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPointsBalanceAsBusiness(accountId,appKey,vatomUserId,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/spaces/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Space", notes = "Gets the details of a space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getSpace( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSpace(accountId,appKey,vatomSpaceId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/users/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a user (as a Business)", notes = "Get the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserCoinsAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserCoinsAsBusiness(accountId,vatomUserId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/u/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Gets the coins balance for a Vatom User", notes = "Gets the coins balance for a Vatom User.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserCoinsBalance( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserCoinsBalance(accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/users/rels/followers")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user followers", notes = "Get user followers.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserFollowers( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserFollowers(accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/users/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user following", notes = "Get user following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserFollowing( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserFollowing(accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/user/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get User Info", notes = "Get a User's Info.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserInfo( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserInfo(accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/me/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserProfile( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserProfile(accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/events/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event", notes = "Gets the details of a event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getVatomEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVatomEvent(accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatoms/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom NFT Details", notes = "Get Vatom NFT Details", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getVatomNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVatomNFT(accountId,vatomId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/communities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Communities", notes = "Gets the communities tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listCommunities( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listCommunities(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/events/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Events", notes = "Gets the events tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listEvents( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listEvents(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/spaces/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Spaces", notes = "Gets the spaces tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listSpaces( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listSpaces(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/u/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Coin Transactions for a Vatom User", notes = "Gets the logged in user's Vatom coin transactions.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listUserCoinTransactions( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listUserCoinTransactions(accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/users/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List coin transactions for a user (as a Business)", notes = "List coin transactions for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listUserCoinTransactionsAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listUserCoinTransactionsAsBusiness(accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/me/vatoms/actions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Perform Action on NFT", notes = "Perform Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response performActionOnNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @NotNull @QueryParam("vatomAction") String vatomAction, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.performActionOnNFT(accountId,vatomId,vatomAction,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/redemptions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem NFT", notes = "Redeem an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response redeemNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemNFT(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/users/coins/redeem")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem the coins for a user (as a Business)", notes = "Redeem the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response redeemUserCoinsAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemUserCoinsAsBusiness(accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search for Vatom Businesses", notes = "Searches for Vatom businesses.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchBusinesses( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBusinesses(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/b/campaign-groups/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Campaign Groups", notes = "Search campaign groups.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchCampaignGroups( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCampaignGroups(accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/me/identities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search User Identities", notes = "Search User Identities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchIdentities( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchIdentities(accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/user-inventory/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom User's Inventory", notes = "Searches the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchInventory( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchInventory(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/campaigns/send")
    
    
    @io.swagger.annotations.ApiOperation(value = "Send NFT", notes = "Send an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response sendNFT( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendNFT(accountId,appKey,vatomCampaignId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/campaign/u/points/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Points Balance as Business", notes = "Sets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response setPointsBalanceAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setPointsBalanceAsBusiness(accountId,appKey,vatomUserId,vatomCampaignId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/u/coins/transfer")
    
    
    @io.swagger.annotations.ApiOperation(value = "Transfer coins from Vatom Users", notes = "Transfer coins from Vatom Users.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response transferUserCoins( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.transferUserCoins(accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Fund coins for a Business", notes = "Fund/update coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateBusinessCoins( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessCoins(accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/events/guests/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event Guest List", notes = "Update the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateEventGuestList( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEventGuestList(accountId,appKey,vatomEventId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/spaces/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Space", notes = "Update a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateSpace( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSpace(accountId,appKey,vatomSpaceId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/users/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update the coins for a user (as a Business)", notes = "Update the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateUserCoinsAsBusiness( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserCoinsAsBusiness(accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/me/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateUserProfile( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserProfile(accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/b/events/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event", notes = "Update a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateVatomEvent( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVatomEvent(accountId,appKey,vatomEventId,vatomParameters,returnRawResponse,securityContext);
    }
}
