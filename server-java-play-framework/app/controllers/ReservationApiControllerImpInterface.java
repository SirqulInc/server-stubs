package controllers;

import apimodels.AvailabilityResponse;
import java.math.BigDecimal;
import apimodels.ReservationResponse;
import apimodels.TimeSlotResponse;

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
public abstract class ReservationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createReservationHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long startDate, Long endDate, Long offerId, Long offerLocationId, String appKey, String metaData) throws Exception {
        createReservation(request, version, deviceId, accountId, startDate, endDate, offerId, offerLocationId, appKey, metaData);
        return ok();

    }

    public abstract void createReservation(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long startDate, Long endDate, Long offerId, Long offerLocationId, String appKey, String metaData) throws Exception;

    public Result deleteReservationHttp(Http.Request request, BigDecimal version, @NotNull Long reservationId, String deviceId, Long accountId) throws Exception {
        deleteReservation(request, version, reservationId, deviceId, accountId);
        return ok();

    }

    public abstract void deleteReservation(Http.Request request, BigDecimal version, @NotNull Long reservationId, String deviceId, Long accountId) throws Exception;

    public Result reservableAvailabilityHttp(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, String availability, String availabilitySummary) throws Exception {
        List<AvailabilityResponse> obj = reservableAvailability(request, version, reservableId, reservableType, deviceId, accountId, availability, availabilitySummary);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AvailabilityResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AvailabilityResponse> reservableAvailability(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, String availability, String availabilitySummary) throws Exception;

    public Result searchAvailabilityHttp(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        List<AvailabilityResponse> obj = searchAvailability(request, version, reservableId, reservableType, deviceId, accountId, startDate, endDate, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AvailabilityResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AvailabilityResponse> searchAvailability(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, String deviceId, Long accountId, Long startDate, Long endDate, Integer start, Integer limit) throws Exception;

    public Result searchReservationsHttp(Http.Request request, BigDecimal version, String deviceId, String appKey, Long accountId, Long filterAccountId, Long reservableId, String reservableType, String keyword, Long startDate, Long endDate, Integer start, Integer limit) throws Exception {
        List<ReservationResponse> obj = searchReservations(request, version, deviceId, appKey, accountId, filterAccountId, reservableId, reservableType, keyword, startDate, endDate, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ReservationResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ReservationResponse> searchReservations(Http.Request request, BigDecimal version, String deviceId, String appKey, Long accountId, Long filterAccountId, Long reservableId, String reservableType, String keyword, Long startDate, Long endDate, Integer start, Integer limit) throws Exception;

    public Result searchScheduleHttp(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, Integer timeBucketMins) throws Exception {
        List<TimeSlotResponse> obj = searchSchedule(request, version, reservableId, reservableType, startDate, endDate, deviceId, accountId, timeBucketMins);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (TimeSlotResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<TimeSlotResponse> searchSchedule(Http.Request request, BigDecimal version, @NotNull Long reservableId, @NotNull String reservableType, @NotNull Long startDate, @NotNull Long endDate, String deviceId, Long accountId, Integer timeBucketMins) throws Exception;

}
