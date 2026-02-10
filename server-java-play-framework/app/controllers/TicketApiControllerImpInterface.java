package controllers;

import java.math.BigDecimal;
import apimodels.CountResponse;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.TicketListResponse;
import apimodels.TicketOfferResponse;

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
public abstract class TicketApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getTicketCountHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String ticketType) throws Exception {
        CountResponse obj = getTicketCount(request, version, deviceId, accountId, gameType, appKey, ticketType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CountResponse getTicketCount(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String ticketType) throws Exception;

    public Result getTicketListHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String ticketObjectType, String actionType, String ticketIds, String objectIds, String receiptTokens, String gameType, String appKey) throws Exception {
        TicketListResponse obj = getTicketList(request, version, deviceId, accountId, ticketObjectType, actionType, ticketIds, objectIds, receiptTokens, gameType, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TicketListResponse getTicketList(Http.Request request, BigDecimal version, String deviceId, Long accountId, String ticketObjectType, String actionType, String ticketIds, String objectIds, String receiptTokens, String gameType, String appKey) throws Exception;

    public Result giftPurchaseHttp(Http.Request request, BigDecimal version, @NotNull Long receiverAccountId, @NotNull Long ticketId, String deviceId, Long accountId, Long assetId, String customMessage, String gameType, String appKey) throws Exception {
        SirqulResponse obj = giftPurchase(request, version, receiverAccountId, ticketId, deviceId, accountId, assetId, customMessage, gameType, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse giftPurchase(Http.Request request, BigDecimal version, @NotNull Long receiverAccountId, @NotNull Long ticketId, String deviceId, Long accountId, Long assetId, String customMessage, String gameType, String appKey) throws Exception;

    public Result saveTicketHttp(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, String receiptData, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception {
        ProfileResponse obj = saveTicket(request, version, actionType, ticketObjectType, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, receiptData, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse saveTicket(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, String receiptData, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception;

    public Result saveTicketViaFileUploadHttp(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, @NotNull InputStream receiptData, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception {
        ProfileResponse obj = saveTicketViaFileUpload(request, version, actionType, ticketObjectType, receiptData, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProfileResponse saveTicketViaFileUpload(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, @NotNull InputStream receiptData, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception;

    public Result ticketOffersHttp(Http.Request request, BigDecimal version) throws Exception {
        TicketOfferResponse obj = ticketOffers(request, version);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TicketOfferResponse ticketOffers(Http.Request request, BigDecimal version) throws Exception;

}
