package controllers;

import java.math.BigDecimal;
import apimodels.EventAttendanceResponse;
import apimodels.OfferResponse;
import apimodels.OfferShortResponse;
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
public abstract class EventApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result attendEventHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Long listingId, Long retailerLocationId, Long offerLocationId, Long transactionId, Integer status, Double latitude, Double longitude) throws Exception {
        OfferResponse obj = attendEvent(request, version, deviceId, accountId, appKey, listingId, retailerLocationId, offerLocationId, transactionId, status, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferResponse attendEvent(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, Long listingId, Long retailerLocationId, Long offerLocationId, Long transactionId, Integer status, Double latitude, Double longitude) throws Exception;

    public Result createEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String retailerLocationIds, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, String metaData) throws Exception {
        OfferResponse obj = createEvent(request, version, accountId, title, retailerLocationIds, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferResponse createEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String retailerLocationIds, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd, String metaData) throws Exception;

    public Result deleteEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception {
        SirqulResponse obj = deleteEvent(request, version, accountId, eventId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception;

    public Result getEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception {
        OfferResponse obj = getEvent(request, version, accountId, eventId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferResponse getEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId) throws Exception;

    public Result searchEventTransactionsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long retailerId, Long retailerLocationId, Long excludeRetailerLocationId, Long listingId, Long offerId, Long offerLocationId, String customerAccountIds, String affiliatedCategoryIds, Long startDate, Long endDate, String statuses, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        List<EventAttendanceResponse> obj = searchEventTransactions(request, version, deviceId, accountId, appKey, keyword, retailerId, retailerLocationId, excludeRetailerLocationId, listingId, offerId, offerLocationId, customerAccountIds, affiliatedCategoryIds, startDate, endDate, statuses, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (EventAttendanceResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<EventAttendanceResponse> searchEventTransactions(Http.Request request, BigDecimal version, String deviceId, Long accountId, String appKey, String keyword, Long retailerId, Long retailerLocationId, Long excludeRetailerLocationId, Long listingId, Long offerId, Long offerLocationId, String customerAccountIds, String affiliatedCategoryIds, Long startDate, Long endDate, String statuses, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

    public Result searchEventsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Boolean activeOnly, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String sortField, Boolean descending, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        List<OfferShortResponse> obj = searchEvents(request, version, accountId, keyword, activeOnly, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, sortField, descending, startDate, endDate, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (OfferShortResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<OfferShortResponse> searchEvents(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Boolean activeOnly, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String sortField, Boolean descending, Long startDate, Long endDate, Integer start, Integer limit) throws Exception;

    public Result updateEventHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId, String retailerLocationIds, String title, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd) throws Exception {
        OfferResponse obj = updateEvent(request, version, accountId, eventId, retailerLocationIds, title, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferResponse updateEvent(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long eventId, String retailerLocationIds, String title, String subTitle, String details, String categoryIds, String filterIds, Boolean active, Long imageAssetId, Long redeemableStart, Long redeemableEnd) throws Exception;

}
