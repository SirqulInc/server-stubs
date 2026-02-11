package org.openapitools.api.impl;

import org.openapitools.api.*;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VatomApiServiceImpl extends VatomApiService {
    @Override
    public Response createFollowing( @NotNull Long accountId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createSpace( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createVatomEvent( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteFollowing( @NotNull Long accountId,  @NotNull String vatomRelsKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deletePointsBalance( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteSpace( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomSpaceId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteVatomEvent( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomEventId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteVatomNFT( @NotNull Long accountId,  @NotNull String vatomId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response executeActionOnNFT( @NotNull Long accountId,  @NotNull String vatomId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response geomapSearch( @NotNull Long accountId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessBehaviors( @NotNull Long accountId,  @NotNull String appKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessCoinsBalance( @NotNull Long accountId,  @NotNull String appKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessIds( @NotNull Long accountId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessInfo( @NotNull Long accountId,  @NotNull String appKey, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessUsers( @NotNull Long accountId,  @NotNull String appKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCampaignGroupEntities( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCampaignGroupRules( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCampaignGroupStats( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCampaignInfo( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEventGuestList( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomEventId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getInventory( @NotNull Long accountId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getMyFollowing( @NotNull Long accountId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPointsBalance( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPointsBalanceAsBusiness( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomUserId,  @NotNull String vatomCampaignId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getSpace( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomSpaceId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserCoinsAsBusiness( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String appKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserCoinsBalance( @NotNull Long accountId,  @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserFollowers( @NotNull Long accountId,  @NotNull String vatomUserId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserFollowing( @NotNull Long accountId,  @NotNull String vatomUserId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserInfo( @NotNull Long accountId,  @NotNull String vatomUserId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getUserProfile( @NotNull Long accountId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getVatomEvent( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomEventId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getVatomNFT( @NotNull Long accountId,  @NotNull String vatomId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listCommunities( @NotNull Long accountId,  @NotNull String appKey, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listEvents( @NotNull Long accountId,  @NotNull String appKey, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listSpaces( @NotNull Long accountId,  @NotNull String appKey, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listUserCoinTransactions( @NotNull Long accountId,  @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listUserCoinTransactionsAsBusiness( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String appKey, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response performActionOnNFT( @NotNull Long accountId,  @NotNull String vatomId,  @NotNull String vatomAction,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response redeemNFT( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response redeemUserCoinsAsBusiness( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchBusinesses( @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchCampaignGroups( @NotNull Long accountId,  @NotNull String appKey, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchIdentities( @NotNull Long accountId, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchInventory( @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sendNFT( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomCampaignId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response setPointsBalanceAsBusiness( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomUserId,  @NotNull String vatomCampaignId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferUserCoins( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateBusinessCoins( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateEventGuestList( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomEventId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateSpace( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomSpaceId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateUserCoinsAsBusiness( @NotNull Long accountId,  @NotNull String vatomUserId,  @NotNull String appKey,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateUserProfile( @NotNull Long accountId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateVatomEvent( @NotNull Long accountId,  @NotNull String appKey,  @NotNull String vatomEventId,  @NotNull String vatomParameters, Boolean returnRawResponse, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
