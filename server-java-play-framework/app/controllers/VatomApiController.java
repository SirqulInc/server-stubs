package controllers;

import java.math.BigDecimal;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VatomApiController extends Controller {
    private final VatomApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private VatomApiController(Config configuration, VatomApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createFollowing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.createFollowingHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result createSpace(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.createSpaceHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result createVatomEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.createVatomEventHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result deleteFollowing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomRelsKey = request.getQueryString("vatomRelsKey");
        String vatomRelsKey;
        if (valuevatomRelsKey != null) {
            vatomRelsKey = valuevatomRelsKey;
        } else {
            throw new IllegalArgumentException("'vatomRelsKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.deleteFollowingHttp(request, version, accountId, vatomRelsKey, returnRawResponse);
    }

    @ApiAction
    public Result deletePointsBalance(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.deletePointsBalanceHttp(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result deleteSpace(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomSpaceId = request.getQueryString("vatomSpaceId");
        String vatomSpaceId;
        if (valuevatomSpaceId != null) {
            vatomSpaceId = valuevatomSpaceId;
        } else {
            throw new IllegalArgumentException("'vatomSpaceId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.deleteSpaceHttp(request, version, accountId, appKey, vatomSpaceId, returnRawResponse);
    }

    @ApiAction
    public Result deleteVatomEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomEventId = request.getQueryString("vatomEventId");
        String vatomEventId;
        if (valuevatomEventId != null) {
            vatomEventId = valuevatomEventId;
        } else {
            throw new IllegalArgumentException("'vatomEventId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.deleteVatomEventHttp(request, version, accountId, appKey, vatomEventId, returnRawResponse);
    }

    @ApiAction
    public Result deleteVatomNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomId = request.getQueryString("vatomId");
        String vatomId;
        if (valuevatomId != null) {
            vatomId = valuevatomId;
        } else {
            throw new IllegalArgumentException("'vatomId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.deleteVatomNFTHttp(request, version, accountId, vatomId, returnRawResponse);
    }

    @ApiAction
    public Result executeActionOnNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomId = request.getQueryString("vatomId");
        String vatomId;
        if (valuevatomId != null) {
            vatomId = valuevatomId;
        } else {
            throw new IllegalArgumentException("'vatomId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.executeActionOnNFTHttp(request, version, accountId, vatomId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result geomapSearch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.geomapSearchHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result getBusinessBehaviors(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getBusinessBehaviorsHttp(request, version, accountId, appKey, returnRawResponse);
    }

    @ApiAction
    public Result getBusinessCoinsBalance(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getBusinessCoinsBalanceHttp(request, version, accountId, appKey, returnRawResponse);
    }

    @ApiAction
    public Result getBusinessIds(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getBusinessIdsHttp(request, version, accountId, returnRawResponse);
    }

    @ApiAction
    public Result getBusinessInfo(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getBusinessInfoHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result getBusinessUsers(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getBusinessUsersHttp(request, version, accountId, appKey, returnRawResponse);
    }

    @ApiAction
    public Result getCampaignGroupEntities(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getCampaignGroupEntitiesHttp(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getCampaignGroupRules(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getCampaignGroupRulesHttp(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getCampaignGroupStats(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getCampaignGroupStatsHttp(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getCampaignInfo(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getCampaignInfoHttp(request, version, accountId, appKey, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getEventGuestList(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomEventId = request.getQueryString("vatomEventId");
        String vatomEventId;
        if (valuevatomEventId != null) {
            vatomEventId = valuevatomEventId;
        } else {
            throw new IllegalArgumentException("'vatomEventId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getEventGuestListHttp(request, version, accountId, appKey, vatomEventId, returnRawResponse);
    }

    @ApiAction
    public Result getInventory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getInventoryHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result getMyFollowing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getMyFollowingHttp(request, version, accountId, returnRawResponse);
    }

    @ApiAction
    public Result getPointsBalance(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getPointsBalanceHttp(request, version, accountId, vatomUserId, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getPointsBalanceAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getPointsBalanceAsBusinessHttp(request, version, accountId, appKey, vatomUserId, vatomCampaignId, returnRawResponse);
    }

    @ApiAction
    public Result getSpace(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomSpaceId = request.getQueryString("vatomSpaceId");
        String vatomSpaceId;
        if (valuevatomSpaceId != null) {
            vatomSpaceId = valuevatomSpaceId;
        } else {
            throw new IllegalArgumentException("'vatomSpaceId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getSpaceHttp(request, version, accountId, appKey, vatomSpaceId, returnRawResponse);
    }

    @ApiAction
    public Result getUserCoinsAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserCoinsAsBusinessHttp(request, version, accountId, vatomUserId, appKey, returnRawResponse);
    }

    @ApiAction
    public Result getUserCoinsBalance(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserCoinsBalanceHttp(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result getUserFollowers(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserFollowersHttp(request, version, accountId, vatomUserId, returnRawResponse);
    }

    @ApiAction
    public Result getUserFollowing(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserFollowingHttp(request, version, accountId, vatomUserId, returnRawResponse);
    }

    @ApiAction
    public Result getUserInfo(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserInfoHttp(request, version, accountId, vatomUserId, returnRawResponse);
    }

    @ApiAction
    public Result getUserProfile(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getUserProfileHttp(request, version, accountId, returnRawResponse);
    }

    @ApiAction
    public Result getVatomEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomEventId = request.getQueryString("vatomEventId");
        String vatomEventId;
        if (valuevatomEventId != null) {
            vatomEventId = valuevatomEventId;
        } else {
            throw new IllegalArgumentException("'vatomEventId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getVatomEventHttp(request, version, accountId, appKey, vatomEventId, returnRawResponse);
    }

    @ApiAction
    public Result getVatomNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomId = request.getQueryString("vatomId");
        String vatomId;
        if (valuevatomId != null) {
            vatomId = valuevatomId;
        } else {
            throw new IllegalArgumentException("'vatomId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.getVatomNFTHttp(request, version, accountId, vatomId, returnRawResponse);
    }

    @ApiAction
    public Result listCommunities(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.listCommunitiesHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result listEvents(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.listEventsHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result listSpaces(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.listSpacesHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result listUserCoinTransactions(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.listUserCoinTransactionsHttp(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result listUserCoinTransactionsAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.listUserCoinTransactionsAsBusinessHttp(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result performActionOnNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomId = request.getQueryString("vatomId");
        String vatomId;
        if (valuevatomId != null) {
            vatomId = valuevatomId;
        } else {
            throw new IllegalArgumentException("'vatomId' parameter is required");
        }
        String valuevatomAction = request.getQueryString("vatomAction");
        String vatomAction;
        if (valuevatomAction != null) {
            vatomAction = valuevatomAction;
        } else {
            throw new IllegalArgumentException("'vatomAction' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.performActionOnNFTHttp(request, version, accountId, vatomId, vatomAction, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result redeemNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.redeemNFTHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result redeemUserCoinsAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.redeemUserCoinsAsBusinessHttp(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result searchBusinesses(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.searchBusinessesHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result searchCampaignGroups(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.searchCampaignGroupsHttp(request, version, accountId, appKey, returnRawResponse);
    }

    @ApiAction
    public Result searchIdentities(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.searchIdentitiesHttp(request, version, accountId, returnRawResponse);
    }

    @ApiAction
    public Result searchInventory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            vatomParameters = null;
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.searchInventoryHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result sendNFT(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.sendNFTHttp(request, version, accountId, appKey, vatomCampaignId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result setPointsBalanceAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomCampaignId = request.getQueryString("vatomCampaignId");
        String vatomCampaignId;
        if (valuevatomCampaignId != null) {
            vatomCampaignId = valuevatomCampaignId;
        } else {
            throw new IllegalArgumentException("'vatomCampaignId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.setPointsBalanceAsBusinessHttp(request, version, accountId, appKey, vatomUserId, vatomCampaignId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result transferUserCoins(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.transferUserCoinsHttp(request, version, accountId, vatomUserId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateBusinessCoins(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateBusinessCoinsHttp(request, version, accountId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateEventGuestList(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomEventId = request.getQueryString("vatomEventId");
        String vatomEventId;
        if (valuevatomEventId != null) {
            vatomEventId = valuevatomEventId;
        } else {
            throw new IllegalArgumentException("'vatomEventId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateEventGuestListHttp(request, version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateSpace(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomSpaceId = request.getQueryString("vatomSpaceId");
        String vatomSpaceId;
        if (valuevatomSpaceId != null) {
            vatomSpaceId = valuevatomSpaceId;
        } else {
            throw new IllegalArgumentException("'vatomSpaceId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateSpaceHttp(request, version, accountId, appKey, vatomSpaceId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateUserCoinsAsBusiness(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomUserId = request.getQueryString("vatomUserId");
        String vatomUserId;
        if (valuevatomUserId != null) {
            vatomUserId = valuevatomUserId;
        } else {
            throw new IllegalArgumentException("'vatomUserId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateUserCoinsAsBusinessHttp(request, version, accountId, vatomUserId, appKey, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateUserProfile(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateUserProfileHttp(request, version, accountId, vatomParameters, returnRawResponse);
    }

    @ApiAction
    public Result updateVatomEvent(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuevatomEventId = request.getQueryString("vatomEventId");
        String vatomEventId;
        if (valuevatomEventId != null) {
            vatomEventId = valuevatomEventId;
        } else {
            throw new IllegalArgumentException("'vatomEventId' parameter is required");
        }
        String valuevatomParameters = request.getQueryString("vatomParameters");
        String vatomParameters;
        if (valuevatomParameters != null) {
            vatomParameters = valuevatomParameters;
        } else {
            throw new IllegalArgumentException("'vatomParameters' parameter is required");
        }
        String valuereturnRawResponse = request.getQueryString("returnRawResponse");
        Boolean returnRawResponse;
        if (valuereturnRawResponse != null) {
            returnRawResponse = Boolean.valueOf(valuereturnRawResponse);
        } else {
            returnRawResponse = null;
        }
        return imp.updateVatomEventHttp(request, version, accountId, appKey, vatomEventId, vatomParameters, returnRawResponse);
    }

}
