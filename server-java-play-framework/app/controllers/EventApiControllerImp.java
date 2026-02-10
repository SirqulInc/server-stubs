package controllers;

import java.math.BigDecimal;
import apimodels.EventAttendanceResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
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
public class EventApiControllerImp extends EventApiControllerImpInterface {
    @Override
    public OfferResponse attendEvent(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Long listingId, Long retailerLocationId, Long offerLocationId, Long transactionId, Integer status, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new OfferResponse();
    }

    @Override
    public OfferResponse createEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String retailerLocationIds, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, String metaData) throws Exception {
        //Do your magic!!!
        return new OfferResponse();
    }

    @Override
    public SirqulResponse deleteEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public OfferResponse getEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception {
        //Do your magic!!!
        return new OfferResponse();
    }

    @Override
    public List<EventAttendanceResponse> searchEventTransactions(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long retailerId, Long retailerLocationId, Long excludeRetailerLocationId, Long listingId, Long offerId, Long offerLocationId, String customerAccountIds, String affiliatedCategoryIds, Long startDate, Long endDate, String statuses, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<EventAttendanceResponse>();
    }

    @Override
    public List<OfferShortResponse> searchEvents(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Boolean activeOnly, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String sortField, Boolean descending, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferShortResponse>();
    }

    @Override
    public OfferResponse updateEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId, String retailerLocationIds, String title, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd) throws Exception {
        //Do your magic!!!
        return new OfferResponse();
    }

}
