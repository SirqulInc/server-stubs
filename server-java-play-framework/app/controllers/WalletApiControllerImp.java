package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WalletApiControllerImp extends WalletApiControllerImpInterface {
    @Override
    public List<OfferTransactionResponse> createOfferTransaction(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey, Integer status) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferTransactionResponse>();
    }

    @Override
    public SirqulResponse deleteOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public OfferTransactionResponse getOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, String deviceId, Long accountId, Boolean includeMission, Double latitude, Double longitude, Boolean returnFullResponse) throws Exception {
        //Do your magic!!!
        return new OfferTransactionResponse();
    }

    @Override
    public List<OfferTransactionResponse> previewOfferTransaction(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long offerId, Long offerLocationId, String offerCart, String promoCode, String currencyType, Boolean usePoints, String metaData, String appKey) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferTransactionResponse>();
    }

    @Override
    public List<OfferTransactionResponse> searchOfferTransactions(Http.Request request, BigDecimal version, String deviceId, Long accountId, String keyword, Long retailerId, String retailerIds, Long retailerLocationId, String retailerLocationIds, String excludeRetailerLocationIds, Long offerId, String offerIds, Long offerLocationId, String offerLocationIds, String offerType, String offerTypes, String specialOfferType, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String sortField, Boolean descending, Integer start, Integer limit, Double latitude, Double longitude, Long redeemableStartDate, Long redeemableEndDate, Boolean filterByParentOffer, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore, Boolean redeemed, String statuses, Boolean reservationsOnly, Boolean activeOnly, Boolean returnFullResponse, Long recurringStartedSince, Long recurringStartedBefore, Long recurringExpirationSince, Long recurringExpirationBefore) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferTransactionResponse>();
    }

    @Override
    public OfferTransactionResponse updateOfferTransaction(Http.Request request, BigDecimal version, @NotNull Long transactionId, @NotNull Integer status, String deviceId, Long accountId, Long offerLocationId, String currencyType, Boolean usePoints, String appKey, Double latitude, Double longitude, String metaData, Boolean returnFullResponse, String exceptionMembershipOfferIds) throws Exception {
        //Do your magic!!!
        return new OfferTransactionResponse();
    }

}
