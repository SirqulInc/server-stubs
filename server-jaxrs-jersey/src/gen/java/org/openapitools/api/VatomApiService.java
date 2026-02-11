package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class VatomApiService {
    public abstract Response createFollowing( @NotNull Long accountId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createSpace( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVatomEvent( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFollowing( @NotNull Long accountId, @NotNull String vatomRelsKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePointsBalance( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteSpace( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVatomEvent( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVatomNFT( @NotNull Long accountId, @NotNull String vatomId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response executeActionOnNFT( @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response geomapSearch( @NotNull Long accountId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBusinessBehaviors( @NotNull Long accountId, @NotNull String appKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBusinessCoinsBalance( @NotNull Long accountId, @NotNull String appKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBusinessIds( @NotNull Long accountId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBusinessInfo( @NotNull Long accountId, @NotNull String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBusinessUsers( @NotNull Long accountId, @NotNull String appKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCampaignGroupEntities( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCampaignGroupRules( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCampaignGroupStats( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCampaignInfo( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getEventGuestList( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getInventory( @NotNull Long accountId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMyFollowing( @NotNull Long accountId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPointsBalance( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPointsBalanceAsBusiness( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSpace( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserCoinsAsBusiness( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserCoinsBalance( @NotNull Long accountId, @NotNull String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserFollowers( @NotNull Long accountId, @NotNull String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserFollowing( @NotNull Long accountId, @NotNull String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserInfo( @NotNull Long accountId, @NotNull String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserProfile( @NotNull Long accountId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVatomEvent( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVatomNFT( @NotNull Long accountId, @NotNull String vatomId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listCommunities( @NotNull Long accountId, @NotNull String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listEvents( @NotNull Long accountId, @NotNull String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listSpaces( @NotNull Long accountId, @NotNull String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserCoinTransactions( @NotNull Long accountId, @NotNull String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUserCoinTransactionsAsBusiness( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response performActionOnNFT( @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomAction, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response redeemNFT( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response redeemUserCoinsAsBusiness( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchBusinesses( @NotNull Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchCampaignGroups( @NotNull Long accountId, @NotNull String appKey,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchIdentities( @NotNull Long accountId,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchInventory( @NotNull Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response sendNFT( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response setPointsBalanceAsBusiness( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferUserCoins( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateBusinessCoins( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateEventGuestList( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateSpace( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUserCoinsAsBusiness( @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUserProfile( @NotNull Long accountId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateVatomEvent( @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext) throws NotFoundException;
}
