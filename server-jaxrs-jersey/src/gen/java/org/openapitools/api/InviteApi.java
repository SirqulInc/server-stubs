package org.openapitools.api;

import org.openapitools.api.InviteApiService;
import org.openapitools.api.factories.InviteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/invite")


@io.swagger.annotations.Api(description = "the invite API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class InviteApi  {
   private final InviteApiService delegate;

   public InviteApi(@Context ServletConfig servletContext) {
      InviteApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("InviteApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (InviteApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = InviteApiServiceFactory.getInviteApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Invite", notes = "Allows a user to accept an invite. The user could also become the inviter's friend.", response = ConsumerInviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConsumerInviteResponse.class)
    })
    public Response acceptInvite(@ApiParam(value = "the invite token", required = true) @QueryParam("token") @NotNull  String token,@ApiParam(value = "the accountId of the user who is accepting the invite", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the album id associated with this invite (if applicable)") @QueryParam("albumId")  Long albumId,@ApiParam(value = "the mission id associated with this invite (if applicable)") @QueryParam("missionId")  Long missionId,@ApiParam(value = "the album contest id associated with this invite (if applicable)") @QueryParam("albumContestId")  Long albumContestId,@ApiParam(value = "the offer id associated with this invite (if applicable)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "the offer location id associated with this invite (if applicable)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "the retailer location id associated with this invite (if applicable)") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "whether to auto-friend the invite sender and receiver", defaultValue = "true") @DefaultValue("true") @QueryParam("autoFriend")  Boolean autoFriend,@ApiParam(value = "whether to mark the event as attending automatically after invite is accepted", defaultValue = "false") @DefaultValue("false") @QueryParam("autoAttendEvent")  Boolean autoAttendEvent,@ApiParam(value = "whether to mark the offer as favorited automatically after invite is accepted", defaultValue = "false") @DefaultValue("false") @QueryParam("autoFavoriteOffer")  Boolean autoFavoriteOffer,@ApiParam(value = "whether to mark the offer location as favorited automatically after invite is accepted", defaultValue = "false") @DefaultValue("false") @QueryParam("autoFavoriteOfferLocation")  Boolean autoFavoriteOfferLocation,@ApiParam(value = "whether to mark the retailer location as favorited automatically after invite is accepted", defaultValue = "false") @DefaultValue("false") @QueryParam("autoFavoriteRetailerLocation")  Boolean autoFavoriteRetailerLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.acceptInvite(token, accountId, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, autoFriend, autoAttendEvent, autoFavoriteOffer, autoFavoriteOfferLocation, autoFavoriteRetailerLocation, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/albumContest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Contest", notes = "Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response albumContestInvite(@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("appId")  Long appId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the album contest to share") @QueryParam("albumContestId")  Long albumContestId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.albumContestInvite(deviceId, accountId, appId, appKey, albumContestId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/album")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Collection", notes = "Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response albumInvite(@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("appId")  Long appId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the album to share") @QueryParam("albumId")  Long albumId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.albumInvite(deviceId, accountId, appId, appKey, albumId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/event")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Event", notes = "Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response eventInvite(@ApiParam(value = "the account ID of the user making the share", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The ID of the event listing", required = true) @QueryParam("listingId") @NotNull  Long listingId,@ApiParam(value = "the account ID of a Sirqul user they would like to share an event with") @QueryParam("receiverAccountIds")  String receiverAccountIds,@ApiParam(value = "The retailer location id of where the event will take place") @QueryParam("retailerLocationId")  Long retailerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.eventInvite(accountId, appKey, listingId, receiverAccountIds, retailerLocationId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/gameLevel")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Game Level", notes = "Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response gameInvite(@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("appId")  Long appId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the game level that the user owns and is giving access to") @QueryParam("gameLevelId")  Long gameLevelId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.gameInvite(deviceId, accountId, appId, appKey, gameLevelId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Invite", notes = "This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.", response = SirqulResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getInvite(@ApiParam(value = "Account ID of the user if they are logged in") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the invite token") @QueryParam("token")  String token,@ApiParam(value = "album id to match the invite against (if applicable)") @QueryParam("albumId")  Long albumId,@ApiParam(value = "mission id to match the invite against (if applicable)") @QueryParam("missionId")  Long missionId,@ApiParam(value = "album contest id to match the invite against (if applicable)") @QueryParam("albumContestId")  Long albumContestId,@ApiParam(value = "offer id to match the invite against (if applicable)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "offer location id to match the invite against (if applicable)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "retailer location id to match the invite against (if applicable)") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInvite(accountId, token, albumId, missionId, albumContestId, offerId, offerLocationId, retailerLocationId, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/mission")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Mission", notes = "Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response missionInvite(@ApiParam(value = "a unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("appId")  Long appId,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the mission to share") @QueryParam("missionId")  Long missionId,@ApiParam(value = "the current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.missionInvite(deviceId, accountId, appId, appKey, missionId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/offer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer", notes = "Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response offerInvite(@ApiParam(value = "the account ID of the user making the share", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the ID of the offer used to invite to favorite", required = true) @QueryParam("offerId") @NotNull  Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.offerInvite(accountId, appKey, offerId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/offerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer Location", notes = "Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response offerLocationInvite(@ApiParam(value = "the account ID of the user making the share", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "the id of the offer location to share", required = true) @QueryParam("offerLocationId") @NotNull  Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.offerLocationInvite(accountId, appKey, offerLocationId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/retailerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Retailer Location", notes = "Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class)
    })
    public Response retailerLocationInvite(@ApiParam(value = "the account ID of the user making the share", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The retailer location id of where the event will take place", required = true) @QueryParam("retailerLocationId") @NotNull  Long retailerLocationId,@ApiParam(value = "Optional album id to link with the invite") @QueryParam("albumId")  Long albumId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retailerLocationInvite(accountId, appKey, retailerLocationId, albumId, securityContext);
    }
}
