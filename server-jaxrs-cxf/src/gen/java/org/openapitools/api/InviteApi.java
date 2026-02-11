package org.openapitools.api;

import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.SirqulResponse;

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
@Path("/invite")
@Api(value = "/", description = "")
public interface InviteApi  {

    /**
     * Accept Invite
     *
     * Allows a user to accept an invite. The user could also become the inviter&#39;s friend.
     *
     */
    @POST
    @Path("/accept")
    @Produces({ "*/*" })
    @ApiOperation(value = "Accept Invite", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ConsumerInviteResponse.class) })
    public ConsumerInviteResponse acceptInvite(@QueryParam("token") @NotNull String token, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey, @QueryParam("autoFriend") @DefaultValue("true")Boolean autoFriend, @QueryParam("autoAttendEvent") @DefaultValue("false")Boolean autoAttendEvent, @QueryParam("autoFavoriteOffer") @DefaultValue("false")Boolean autoFavoriteOffer, @QueryParam("autoFavoriteOfferLocation") @DefaultValue("false")Boolean autoFavoriteOfferLocation, @QueryParam("autoFavoriteRetailerLocation") @DefaultValue("false")Boolean autoFavoriteRetailerLocation);

    /**
     * Invite to Contest
     *
     * Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    @POST
    @Path("/albumContest")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Contest", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse albumContestInvite(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumContestId") Long albumContestId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Invite to Collection
     *
     * Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    @POST
    @Path("/album")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Collection", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse albumInvite(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumId") Long albumId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Invite to Event
     *
     * Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.
     *
     */
    @POST
    @Path("/event")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Event", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse eventInvite(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("listingId") @NotNull Long listingId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("retailerLocationId") Long retailerLocationId);

    /**
     * Invite to Game Level
     *
     * Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    @POST
    @Path("/gameLevel")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Game Level", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse gameInvite(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Invite
     *
     * This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Invite", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getInvite(@QueryParam("accountId") Long accountId, @QueryParam("token") String token, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey);

    /**
     * Invite to Mission
     *
     * Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    @POST
    @Path("/mission")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Mission", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse missionInvite(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Invite to Offer
     *
     * Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite&#39;s list.
     *
     */
    @POST
    @Path("/offer")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Offer", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse offerInvite(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("offerId") @NotNull Long offerId);

    /**
     * Invite to Offer Location
     *
     * Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite&#39;s list.
     *
     */
    @POST
    @Path("/offerLocation")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Offer Location", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse offerLocationInvite(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("offerLocationId") @NotNull Long offerLocationId);

    /**
     * Invite to Retailer Location
     *
     * Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite&#39;s list.
     *
     */
    @POST
    @Path("/retailerLocation")
    @Produces({ "*/*" })
    @ApiOperation(value = "Invite to Retailer Location", tags={ "Invite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public InviteResponse retailerLocationInvite(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("retailerLocationId") @NotNull Long retailerLocationId, @QueryParam("albumId") Long albumId);
}
