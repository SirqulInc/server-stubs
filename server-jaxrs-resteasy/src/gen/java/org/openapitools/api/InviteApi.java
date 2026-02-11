package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.InviteApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/invite")


@io.swagger.annotations.Api(description = "the invite API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class InviteApi  {

    @Inject InviteApiService service;

    @POST
    @Path("/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Invite", notes = "Allows a user to accept an invite. The user could also become the inviter's friend.", response = ConsumerInviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConsumerInviteResponse.class) })
    public Response acceptInvite( @NotNull @QueryParam("token") String token, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey, @DefaultValue("true") @QueryParam("autoFriend") Boolean autoFriend, @DefaultValue("false") @QueryParam("autoAttendEvent") Boolean autoAttendEvent, @DefaultValue("false") @QueryParam("autoFavoriteOffer") Boolean autoFavoriteOffer, @DefaultValue("false") @QueryParam("autoFavoriteOfferLocation") Boolean autoFavoriteOfferLocation, @DefaultValue("false") @QueryParam("autoFavoriteRetailerLocation") Boolean autoFavoriteRetailerLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.acceptInvite(token,accountId,albumId,missionId,albumContestId,offerId,offerLocationId,retailerLocationId,appKey,autoFriend,autoAttendEvent,autoFavoriteOffer,autoFavoriteOfferLocation,autoFavoriteRetailerLocation,securityContext);
    }
    @POST
    @Path("/albumContest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Contest", notes = "Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response albumContestInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumContestId") Long albumContestId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.albumContestInvite(deviceId,accountId,appId,appKey,albumContestId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/album")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Collection", notes = "Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response albumInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumId") Long albumId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.albumInvite(deviceId,accountId,appId,appKey,albumId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/event")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Event", notes = "Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response eventInvite( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("listingId") Long listingId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("retailerLocationId") Long retailerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.eventInvite(accountId,appKey,listingId,receiverAccountIds,retailerLocationId,securityContext);
    }
    @POST
    @Path("/gameLevel")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Game Level", notes = "Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response gameInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.gameInvite(deviceId,accountId,appId,appKey,gameLevelId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Invite", notes = "This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.", response = SirqulResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getInvite( @QueryParam("accountId") Long accountId, @QueryParam("token") String token, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInvite(accountId,token,albumId,missionId,albumContestId,offerId,offerLocationId,retailerLocationId,appKey,securityContext);
    }
    @POST
    @Path("/mission")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Mission", notes = "Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response missionInvite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.missionInvite(deviceId,accountId,appId,appKey,missionId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/offer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer", notes = "Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response offerInvite( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("offerId") Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.offerInvite(accountId,appKey,offerId,securityContext);
    }
    @POST
    @Path("/offerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer Location", notes = "Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response offerLocationInvite( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.offerLocationInvite(accountId,appKey,offerLocationId,securityContext);
    }
    @POST
    @Path("/retailerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Retailer Location", notes = "Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response retailerLocationInvite( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("albumId") Long albumId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retailerLocationInvite(accountId,appKey,retailerLocationId,albumId,securityContext);
    }
}
