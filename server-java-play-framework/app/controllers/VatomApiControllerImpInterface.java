package controllers;

import java.math.BigDecimal;

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

    public Result createFollowingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createFollowing(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createFollowing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result createSpaceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createSpace(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createSpace(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result createVatomEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        createVatomEvent(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void createVatomEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result deleteFollowingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomRelsKey, Boolean returnRawResponse) throws Exception {
        deleteFollowing(request, version, accountId, vatomRelsKey, returnRawResponse);
        return ok();

    }

    public abstract void deleteFollowing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomRelsKey, Boolean returnRawResponse) throws Exception;

    public Result deletePointsBalanceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        deletePointsBalance(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void deletePointsBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result deleteSpaceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception {
        deleteSpace(request, version, accountId, appKey, vatomSpaceId, returnRawResponse);
        return ok();

    }

    public abstract void deleteSpace(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception;

    public Result deleteVatomEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        deleteVatomEvent(request, version, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void deleteVatomEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result deleteVatomNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception {
        deleteVatomNFT(request, version, accountId, vatomId, returnRawResponse);
        return ok();

    }

    public abstract void deleteVatomNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception;

    public Result executeActionOnNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        executeActionOnNFT(request, version, accountId, vatomId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void executeActionOnNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result geomapSearchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        geomapSearch(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void geomapSearch(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getBusinessBehaviorsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessBehaviors(request, version, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessBehaviors(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getBusinessCoinsBalanceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessCoinsBalance(request, version, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessCoinsBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getBusinessIdsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getBusinessIds(request, version, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessIds(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getBusinessInfoHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        getBusinessInfo(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessInfo(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getBusinessUsersHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getBusinessUsers(request, version, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getBusinessUsers(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupEntitiesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupEntities(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupEntities(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupRulesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupRules(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupRules(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignGroupStatsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignGroupStats(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignGroupStats(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getCampaignInfoHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getCampaignInfo(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getCampaignInfo(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getEventGuestListHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        getEventGuestList(request, version, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void getEventGuestList(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result getInventoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        getInventory(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getInventory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getMyFollowingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getMyFollowing(request, version, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getMyFollowing(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getPointsBalanceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getPointsBalance(request, version, accountId, vatomUserId, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getPointsBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getPointsBalanceAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception {
        getPointsBalanceAsBusiness(request, version, accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse);
        return ok();

    }

    public abstract void getPointsBalanceAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, Boolean returnRawResponse) throws Exception;

    public Result getSpaceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception {
        getSpace(request, version, accountId, appKey, vatomSpaceId, returnRawResponse);
        return ok();

    }

    public abstract void getSpace(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, Boolean returnRawResponse) throws Exception;

    public Result getUserCoinsAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        getUserCoinsAsBusiness(request, version, accountId, vatomUserId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void getUserCoinsAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result getUserCoinsBalanceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        getUserCoinsBalance(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void getUserCoinsBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result getUserFollowersHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserFollowers(request, version, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserFollowers(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserFollowingHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserFollowing(request, version, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserFollowing(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserInfoHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception {
        getUserInfo(request, version, accountId, vatomUserId, returnRawResponse);
        return ok();

    }

    public abstract void getUserInfo(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, Boolean returnRawResponse) throws Exception;

    public Result getUserProfileHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        getUserProfile(request, version, accountId, returnRawResponse);
        return ok();

    }

    public abstract void getUserProfile(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result getVatomEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception {
        getVatomEvent(request, version, accountId, appKey, vatomEventId, returnRawResponse);
        return ok();

    }

    public abstract void getVatomEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, Boolean returnRawResponse) throws Exception;

    public Result getVatomNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception {
        getVatomNFT(request, version, accountId, vatomId, returnRawResponse);
        return ok();

    }

    public abstract void getVatomNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, Boolean returnRawResponse) throws Exception;

    public Result listCommunitiesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listCommunities(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listCommunities(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listEventsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listEvents(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listEvents(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listSpacesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listSpaces(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listSpaces(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listUserCoinTransactionsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listUserCoinTransactions(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listUserCoinTransactions(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result listUserCoinTransactionsAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception {
        listUserCoinTransactionsAsBusiness(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void listUserCoinTransactionsAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result performActionOnNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomAction, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        performActionOnNFT(request, version, accountId, vatomId, vatomAction, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void performActionOnNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomId, @NotNull String vatomAction, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result redeemNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        redeemNFT(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void redeemNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result redeemUserCoinsAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        redeemUserCoinsAsBusiness(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void redeemUserCoinsAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result searchBusinessesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        searchBusinesses(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void searchBusinesses(Http.Request request, BigDecimal version, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result searchCampaignGroupsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception {
        searchCampaignGroups(request, version, accountId, appKey, returnRawResponse);
        return ok();

    }

    public abstract void searchCampaignGroups(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean returnRawResponse) throws Exception;

    public Result searchIdentitiesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception {
        searchIdentities(request, version, accountId, returnRawResponse);
        return ok();

    }

    public abstract void searchIdentities(Http.Request request, BigDecimal version, @NotNull Long accountId, Boolean returnRawResponse) throws Exception;

    public Result searchInventoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception {
        searchInventory(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void searchInventory(Http.Request request, BigDecimal version, @NotNull Long accountId, String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result sendNFTHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        sendNFT(request, version, accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void sendNFT(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result setPointsBalanceAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        setPointsBalanceAsBusiness(request, version, accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void setPointsBalanceAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomUserId, @NotNull String vatomCampaignId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result transferUserCoinsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        transferUserCoins(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void transferUserCoins(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateBusinessCoinsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateBusinessCoins(request, version, accountId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateBusinessCoins(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateEventGuestListHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateEventGuestList(request, version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateEventGuestList(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateSpaceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateSpace(request, version, accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateSpace(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomSpaceId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateUserCoinsAsBusinessHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateUserCoinsAsBusiness(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateUserCoinsAsBusiness(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomUserId, @NotNull String appKey, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateUserProfileHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateUserProfile(request, version, accountId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateUserProfile(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

    public Result updateVatomEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception {
        updateVatomEvent(request, version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
        return ok();

    }

    public abstract void updateVatomEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String vatomEventId, @NotNull String vatomParameters, Boolean returnRawResponse) throws Exception;

}
