package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class InviteApiServiceImpl extends InviteApiService {
    @Override
    public Response acceptInvite( @NotNull String token,  @NotNull Long accountId, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, Boolean autoFriend, Boolean autoAttendEvent, Boolean autoFavoriteOffer, Boolean autoFavoriteOfferLocation, Boolean autoFavoriteRetailerLocation, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response albumContestInvite(String deviceId, Long accountId, Long appId, String appKey, Long albumContestId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response albumInvite(String deviceId, Long accountId, Long appId, String appKey, Long albumId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response eventInvite( @NotNull Long accountId,  @NotNull String appKey,  @NotNull Long listingId, String receiverAccountIds, Long retailerLocationId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response gameInvite(String deviceId, Long accountId, Long appId, String appKey, Long gameLevelId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getInvite(Long accountId, String token, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response missionInvite(String deviceId, Long accountId, Long appId, String appKey, Long missionId, Double latitude, Double longitude, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response offerInvite( @NotNull Long accountId,  @NotNull String appKey,  @NotNull Long offerId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response offerLocationInvite( @NotNull Long accountId,  @NotNull String appKey,  @NotNull Long offerLocationId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response retailerLocationInvite( @NotNull Long accountId,  @NotNull String appKey,  @NotNull Long retailerLocationId, Long albumId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
