package controllers;


import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class VatomApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createFollowingHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createFollowing(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createFollowing(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result createSpaceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createSpace(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createSpace(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result createVatomEventHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createVatomEvent(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createVatomEvent(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result deleteFollowingHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomRelsKey, Boolean returnRawResponse) throws Exception {
        deleteFollowing(request, accountId, vatomRelsKey, returnRawResponse);
        return ok();

    }

    public abstract void deleteFollowing(Http.Request request, @NotNull Long accountId, @NotNull String vatomRelsKey, Boolean returnRawResponse) throws Exception;

    public Result deletePointsBalanceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        deletePointsBalance(request, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void deletePointsBalance(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result deleteSpaceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception {
        deleteSpace(request, accountId, appKey, vatomSpaceId, returnRawResponse);
        return ok();

    }

    public abstract void deleteSpace(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception;

    public Result deleteVatomEventHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        deleteVatomEvent(request, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void deleteVatomEvent(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result deleteVatomNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception {
        deleteVatomNFT(request, accountId, vatomId, returnRawResponse);
        return ok();

    }

    public abstract void deleteVatomNFT(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception;

    public Result executeActionOnNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        executeActionOnNFT(request, accountId, vatomId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void executeActionOnNFT(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result geomapSearchHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        geomapSearch(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void geomapSearch(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getBusinessBehaviorsHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessBehaviors(request, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessBehaviors(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getBusinessCoinsBalanceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessCoinsBalance(request, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessCoinsBalance(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getBusinessIdsHttp(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getBusinessIds(request, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessIds(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getBusinessInfoHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        getBusinessInfo(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessInfo(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getBusinessUsersHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessUsers(request, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessUsers(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupEntitiesHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupEntities(request, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupEntities(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupRulesHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupRules(request, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupRules(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupStatsHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupStats(request, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupStats(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignInfoHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignInfo(request, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignInfo(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getEventGuestListHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        getEventGuestList(request, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void getEventGuestList(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result getInventoryHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        getInventory(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getInventory(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getMyFollowingHttp(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getMyFollowing(request, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getMyFollowing(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getPointsBalanceHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getPointsBalance(request, accountId, vatomUserId, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getPointsBalance(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getPointsBalanceAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getPointsBalanceAsBusiness(request, accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getPointsBalanceAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getSpaceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception {
        getSpace(request, accountId, appKey, vatomSpaceId, returnRawResponse);
        return ok();

    }

    public abstract void getSpace(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception;

    public Result getUserCoinsAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getUserCoinsAsBusiness(request, accountId, vatomUserId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getUserCoinsAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getUserCoinsBalanceHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        getUserCoinsBalance(request, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getUserCoinsBalance(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getUserFollowersHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserFollowers(request, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserFollowers(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserFollowingHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserFollowing(request, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserFollowing(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserInfoHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserInfo(request, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserInfo(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserProfileHttp(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getUserProfile(request, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getUserProfile(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getVatomEventHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        getVatomEvent(request, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void getVatomEvent(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result getVatomNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception {
        getVatomNFT(request, accountId, vatomId, returnRawResponse);
        return ok();

    }

    public abstract void getVatomNFT(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception;

    public Result listCommunitiesHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listCommunities(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listCommunities(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listEventsHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listEvents(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listEvents(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listSpacesHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listSpaces(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listSpaces(Http.Request request, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listUserCoinTransactionsHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listUserCoinTransactions(request, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listUserCoinTransactions(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listUserCoinTransactionsAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listUserCoinTransactionsAsBusiness(request, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listUserCoinTransactionsAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result performActionOnNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomAction, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        performActionOnNFT(request, accountId, vatomId, vatomAction, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void performActionOnNFT(Http.Request request, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomAction, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result redeemNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        redeemNFT(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void redeemNFT(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result redeemUserCoinsAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        redeemUserCoinsAsBusiness(request, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void redeemUserCoinsAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result searchBusinessesHttp(Http.Request request, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        searchBusinesses(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void searchBusinesses(Http.Request request, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result searchCampaignGroupsHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        searchCampaignGroups(request, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void searchCampaignGroups(Http.Request request, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result searchIdentitiesHttp(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        searchIdentities(request, accountId, returnRawResponse);
        return ok();

    }

    public abstract void searchIdentities(Http.Request request, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result searchInventoryHttp(Http.Request request, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        searchInventory(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void searchInventory(Http.Request request, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result sendNFTHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        sendNFT(request, accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void sendNFT(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result setPointsBalanceAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        setPointsBalanceAsBusiness(request, accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void setPointsBalanceAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result transferUserCoinsHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        transferUserCoins(request, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void transferUserCoins(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateBusinessCoinsHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateBusinessCoins(request, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateBusinessCoins(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateEventGuestListHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateEventGuestList(request, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateEventGuestList(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateSpaceHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateSpace(request, accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateSpace(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateUserCoinsAsBusinessHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateUserCoinsAsBusiness(request, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateUserCoinsAsBusiness(Http.Request request, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateUserProfileHttp(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateUserProfile(request, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateUserProfile(Http.Request request, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateVatomEventHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateVatomEvent(request, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateVatomEvent(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

}
