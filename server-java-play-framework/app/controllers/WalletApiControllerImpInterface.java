package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionResponse;
import apimodels.SirqulResponse;

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
public abstract class WalletApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createOfferTransactionHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey, Integer status) throws Exception {
        List<OfferTransactionResponse> obj = createOfferTransaction(request, version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey, status);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferTransactionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferTransactionResponse> createOfferTransaction(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey, Integer status) throws Exception;

    public Result deleteOfferTransactionHttp(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = deleteOfferTransaction(request, version, transactionId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId) throws Exception;

    public Result getOfferTransactionHttp(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId, Boolean includeMission, Double latitude, Double longitude, Boolean returnFullResponse) throws Exception {
        OfferTransactionResponse obj = getOfferTransaction(request, version, transactionId, deviceId, accountId, includeMission, latitude, longitude, returnFullResponse);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferTransactionResponse getOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId, Boolean includeMission, Double latitude, Double longitude, Boolean returnFullResponse) throws Exception;

    public Result previewOfferTransactionHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey) throws Exception {
        List<OfferTransactionResponse> obj = previewOfferTransaction(request, version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferTransactionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferTransactionResponse> previewOfferTransaction(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey) throws Exception;

    public Result searchOfferTransactionsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String keyword, Long retailerId, String retailerIds, Long retailerLocationId, String retailerLocationIds, String excludeRetailerLocationIds, Long offerId, String offerIds, Long offerLocationId, String offerLocationIds, String offerType, String offerTypes, String specialOfferType, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Long redeemableStartDate, Long redeemableEndDate, Boolean filterByParentOffer, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Boolean redeemed, String statuses, Boolean reservationsOnly, Boolean activeOnly, Boolean returnFullResponse, Long recurringStartedSince, Long recurringStartedBefore, Long recurringExpirationSince, Long recurringExpirationBefore) throws Exception {
        List<OfferTransactionResponse> obj = searchOfferTransactions(request, version, deviceId, accountId, keyword, retailerId, retailerIds, retailerLocationId, retailerLocationIds, excludeRetailerLocationIds, offerId, offerIds, offerLocationId, offerLocationIds, offerType, offerTypes, specialOfferType, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, sortField, descending, start, limit, latitude, longitude, redeemableStartDate, redeemableEndDate, filterByParentOffer, startedSince, startedBefore, endedSince, endedBefore, redeemed, statuses, reservationsOnly, activeOnly, returnFullResponse, recurringStartedSince, recurringStartedBefore, recurringExpirationSince, recurringExpirationBefore);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferTransactionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferTransactionResponse> searchOfferTransactions(Http.Request request, BigDecimal version, String deviceId, Long accountId, String keyword, Long retailerId, String retailerIds, Long retailerLocationId, String retailerLocationIds, String excludeRetailerLocationIds, Long offerId, String offerIds, Long offerLocationId, String offerLocationIds, String offerType, String offerTypes, String specialOfferType, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Long redeemableStartDate, Long redeemableEndDate, Boolean filterByParentOffer, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Boolean redeemed, String statuses, Boolean reservationsOnly, Boolean activeOnly, Boolean returnFullResponse, Long recurringStartedSince, Long recurringStartedBefore, Long recurringExpirationSince, Long recurringExpirationBefore) throws Exception;

    public Result updateOfferTransactionHttp(Http.Request request, BigDecimal version, @NotNull Long transactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId, String currencyType, Boolean usePoints, String appKey, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, String exceptionMembershipOfferIds) throws Exception {
        OfferTransactionResponse obj = updateOfferTransaction(request, version, transactionId, status, deviceId, accountId, offerLocationId, currencyType, usePoints, appKey, latitude, longitude, metaData, returnFullResponse, exceptionMembershipOfferIds);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferTransactionResponse updateOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId, String currencyType, Boolean usePoints, String appKey, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, String exceptionMembershipOfferIds) throws Exception;

}
