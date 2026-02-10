package controllers;

import java.math.BigDecimal;
import apimodels.CountResponse;
import java.io.InputStream;
import apimodels.ProfileResponse;
import apimodels.SirqulResponse;
import apimodels.TicketListResponse;
import apimodels.TicketOfferResponse;

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
public class TicketApiControllerImp extends TicketApiControllerImpInterface {
    @Override
    public CountResponse getTicketCount(Http.Request request, BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String ticketType) throws Exception {
        //Do your magic!!!
        return new CountResponse();
    }

    @Override
    public TicketListResponse getTicketList(Http.Request request, BigDecimal version, String deviceId, Long accountId, String ticketObjectType, String actionType, String ticketIds, String objectIds, String receiptTokens, String gameType, String appKey) throws Exception {
        //Do your magic!!!
        return new TicketListResponse();
    }

    @Override
    public SirqulResponse giftPurchase(Http.Request request, BigDecimal version, @NotNull Long receiverAccountId, @NotNull Long ticketId, String deviceId, Long accountId, Long assetId, String customMessage, String gameType, String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse saveTicket(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, String receiptData, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ProfileResponse saveTicketViaFileUpload(Http.Request request, BigDecimal version, @NotNull String actionType, @NotNull String ticketObjectType, @NotNull InputStream receiptData, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public TicketOfferResponse ticketOffers(Http.Request request, BigDecimal version) throws Exception {
        //Do your magic!!!
        return new TicketOfferResponse();
    }

}
