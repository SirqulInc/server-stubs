package controllers;

import java.math.BigDecimal;
import apimodels.CountResponse;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.TicketListResponse;
import apimodels.TicketOfferResponse;

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
public class TicketApiController extends Controller {
    private final TicketApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TicketApiController(Config configuration, TicketApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getTicketCount(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        return imp.getTicketCountHttp(request, version, deviceId, accountId, gameType, appKey, ticketType);
    }

    @ApiAction
    public Result getTicketList(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueticketObjectType = request.getQueryString("ticketObjectType");
        String ticketObjectType;
        if (valueticketObjectType != null) {
            ticketObjectType = valueticketObjectType;
        } else {
            ticketObjectType = null;
        }
        String valueactionType = request.getQueryString("actionType");
        String actionType;
        if (valueactionType != null) {
            actionType = valueactionType;
        } else {
            actionType = null;
        }
        String valueticketIds = request.getQueryString("ticketIds");
        String ticketIds;
        if (valueticketIds != null) {
            ticketIds = valueticketIds;
        } else {
            ticketIds = null;
        }
        String valueobjectIds = request.getQueryString("objectIds");
        String objectIds;
        if (valueobjectIds != null) {
            objectIds = valueobjectIds;
        } else {
            objectIds = null;
        }
        String valuereceiptTokens = request.getQueryString("receiptTokens");
        String receiptTokens;
        if (valuereceiptTokens != null) {
            receiptTokens = valuereceiptTokens;
        } else {
            receiptTokens = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.getTicketListHttp(request, version, deviceId, accountId, ticketObjectType, actionType, ticketIds, objectIds, receiptTokens, gameType, appKey);
    }

    @ApiAction
    public Result giftPurchase(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuereceiverAccountId = request.getQueryString("receiverAccountId");
        Long receiverAccountId;
        if (valuereceiverAccountId != null) {
            receiverAccountId = Long.parseLong(valuereceiverAccountId);
        } else {
            throw new IllegalArgumentException("'receiverAccountId' parameter is required");
        }
        String valueticketId = request.getQueryString("ticketId");
        Long ticketId;
        if (valueticketId != null) {
            ticketId = Long.parseLong(valueticketId);
        } else {
            throw new IllegalArgumentException("'ticketId' parameter is required");
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valuecustomMessage = request.getQueryString("customMessage");
        String customMessage;
        if (valuecustomMessage != null) {
            customMessage = valuecustomMessage;
        } else {
            customMessage = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.giftPurchaseHttp(request, version, receiverAccountId, ticketId, deviceId, accountId, assetId, customMessage, gameType, appKey);
    }

    @ApiAction
    public Result saveTicket(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueactionType = request.getQueryString("actionType");
        String actionType;
        if (valueactionType != null) {
            actionType = valueactionType;
        } else {
            throw new IllegalArgumentException("'actionType' parameter is required");
        }
        String valueticketObjectType = request.getQueryString("ticketObjectType");
        String ticketObjectType;
        if (valueticketObjectType != null) {
            ticketObjectType = valueticketObjectType;
        } else {
            throw new IllegalArgumentException("'ticketObjectType' parameter is required");
        }
        String valueobjectId = request.getQueryString("objectId");
        Long objectId;
        if (valueobjectId != null) {
            objectId = Long.parseLong(valueobjectId);
        } else {
            objectId = null;
        }
        String valuepurchaseCode = request.getQueryString("purchaseCode");
        String purchaseCode;
        if (valuepurchaseCode != null) {
            purchaseCode = valuepurchaseCode;
        } else {
            purchaseCode = null;
        }
        String valuereceiptToken = request.getQueryString("receiptToken");
        String receiptToken;
        if (valuereceiptToken != null) {
            receiptToken = valuereceiptToken;
        } else {
            receiptToken = null;
        }
        String valuereceiptData = request.getQueryString("receiptData");
        String receiptData;
        if (valuereceiptData != null) {
            receiptData = valuereceiptData;
        } else {
            receiptData = null;
        }
        String valuecount = request.getQueryString("count");
        Long count;
        if (valuecount != null) {
            count = Long.parseLong(valuecount);
        } else {
            count = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepurchaseProvider = request.getQueryString("purchaseProvider");
        String purchaseProvider;
        if (valuepurchaseProvider != null) {
            purchaseProvider = valuepurchaseProvider;
        } else {
            purchaseProvider = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        String valuereturnProfileResponse = request.getQueryString("returnProfileResponse");
        Boolean returnProfileResponse;
        if (valuereturnProfileResponse != null) {
            returnProfileResponse = Boolean.valueOf(valuereturnProfileResponse);
        } else {
            returnProfileResponse = null;
        }
        String valueincludeProfileResponse = request.getQueryString("includeProfileResponse");
        Boolean includeProfileResponse;
        if (valueincludeProfileResponse != null) {
            includeProfileResponse = Boolean.valueOf(valueincludeProfileResponse);
        } else {
            includeProfileResponse = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        return imp.saveTicketHttp(request, version, actionType, ticketObjectType, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, receiptData, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion);
    }

    @ApiAction
    public Result saveTicketViaFileUpload(Http.Request request, BigDecimal version) throws Exception {
        String valuereturnNulls = request.getQueryString("returnNulls");
        Boolean returnNulls;
        if (valuereturnNulls != null) {
            returnNulls = Boolean.valueOf(valuereturnNulls);
        } else {
            returnNulls = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueactionType = request.getQueryString("actionType");
        String actionType;
        if (valueactionType != null) {
            actionType = valueactionType;
        } else {
            throw new IllegalArgumentException("'actionType' parameter is required");
        }
        String valueticketObjectType = request.getQueryString("ticketObjectType");
        String ticketObjectType;
        if (valueticketObjectType != null) {
            ticketObjectType = valueticketObjectType;
        } else {
            throw new IllegalArgumentException("'ticketObjectType' parameter is required");
        }
        String valueobjectId = request.getQueryString("objectId");
        Long objectId;
        if (valueobjectId != null) {
            objectId = Long.parseLong(valueobjectId);
        } else {
            objectId = null;
        }
        String valuepurchaseCode = request.getQueryString("purchaseCode");
        String purchaseCode;
        if (valuepurchaseCode != null) {
            purchaseCode = valuepurchaseCode;
        } else {
            purchaseCode = null;
        }
        String valuereceiptToken = request.getQueryString("receiptToken");
        String receiptToken;
        if (valuereceiptToken != null) {
            receiptToken = valuereceiptToken;
        } else {
            receiptToken = null;
        }
        String valuereceiptData = request.getQueryString("receiptData");
        InputStream receiptData;
        if (valuereceiptData != null) {
            receiptData = valuereceiptData;
        } else {
            throw new IllegalArgumentException("'receiptData' parameter is required");
        }
        String valuecount = request.getQueryString("count");
        Long count;
        if (valuecount != null) {
            count = Long.parseLong(valuecount);
        } else {
            count = null;
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepurchaseProvider = request.getQueryString("purchaseProvider");
        String purchaseProvider;
        if (valuepurchaseProvider != null) {
            purchaseProvider = valuepurchaseProvider;
        } else {
            purchaseProvider = null;
        }
        String valuepurchaseType = request.getQueryString("purchaseType");
        String purchaseType;
        if (valuepurchaseType != null) {
            purchaseType = valuepurchaseType;
        } else {
            purchaseType = null;
        }
        String valuereturnProfileResponse = request.getQueryString("returnProfileResponse");
        Boolean returnProfileResponse;
        if (valuereturnProfileResponse != null) {
            returnProfileResponse = Boolean.valueOf(valuereturnProfileResponse);
        } else {
            returnProfileResponse = null;
        }
        String valueincludeProfileResponse = request.getQueryString("includeProfileResponse");
        Boolean includeProfileResponse;
        if (valueincludeProfileResponse != null) {
            includeProfileResponse = Boolean.valueOf(valueincludeProfileResponse);
        } else {
            includeProfileResponse = null;
        }
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        return imp.saveTicketViaFileUploadHttp(request, version, actionType, ticketObjectType, receiptData, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion);
    }

    @ApiAction
    public Result ticketOffers(Http.Request request, BigDecimal version) throws Exception {
        return imp.ticketOffersHttp(request, version);
    }

}
