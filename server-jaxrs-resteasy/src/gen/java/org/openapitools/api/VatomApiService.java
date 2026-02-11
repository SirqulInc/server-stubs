package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;




import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface VatomApiService {
      Response createFollowing(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createSpace(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response createVatomEvent(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFollowing(Long accountId,String vatomRelsKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deletePointsBalance(Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSpace(Long accountId,String appKey,String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVatomEvent(Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVatomNFT(Long accountId,String vatomId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response executeActionOnNFT(Long accountId,String vatomId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response geomapSearch(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessBehaviors(Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessCoinsBalance(Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessIds(Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessInfo(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getBusinessUsers(Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupEntities(Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupRules(Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignGroupStats(Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getCampaignInfo(Long accountId,String appKey,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getEventGuestList(Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getInventory(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getMyFollowing(Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getPointsBalance(Long accountId,String vatomUserId,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getPointsBalanceAsBusiness(Long accountId,String appKey,String vatomUserId,String vatomCampaignId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getSpace(Long accountId,String appKey,String vatomSpaceId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserCoinsAsBusiness(Long accountId,String vatomUserId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserCoinsBalance(Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserFollowers(Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserFollowing(Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserInfo(Long accountId,String vatomUserId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserProfile(Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getVatomEvent(Long accountId,String appKey,String vatomEventId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response getVatomNFT(Long accountId,String vatomId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listCommunities(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listEvents(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listSpaces(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listUserCoinTransactions(Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response listUserCoinTransactionsAsBusiness(Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response performActionOnNFT(Long accountId,String vatomId,String vatomAction,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response redeemNFT(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response redeemUserCoinsAsBusiness(Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchBusinesses(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchCampaignGroups(Long accountId,String appKey,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchIdentities(Long accountId,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response searchInventory(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response sendNFT(Long accountId,String appKey,String vatomCampaignId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response setPointsBalanceAsBusiness(Long accountId,String appKey,String vatomUserId,String vatomCampaignId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response transferUserCoins(Long accountId,String vatomUserId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBusinessCoins(Long accountId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateEventGuestList(Long accountId,String appKey,String vatomEventId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSpace(Long accountId,String appKey,String vatomSpaceId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserCoinsAsBusiness(Long accountId,String vatomUserId,String appKey,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateUserProfile(Long accountId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;
      Response updateVatomEvent(Long accountId,String appKey,String vatomEventId,String vatomParameters,Boolean returnRawResponse,SecurityContext securityContext)
      throws NotFoundException;


}
