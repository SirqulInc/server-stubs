package controllers;

import apimodels.AvailabilityResponse;
import java.math.BigDecimal;
import apimodels.ReservationResponse;
import apimodels.TimeSlotResponse;

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
public class ReservationApiController extends Controller {
    private final ReservationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ReservationApiController(Config configuration, ReservationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createReservation(Http.Request request, BigDecimal version) throws Exception {
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
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valueofferId = request.getQueryString("offerId");
        Long offerId;
        if (valueofferId != null) {
            offerId = Long.parseLong(valueofferId);
        } else {
            offerId = null;
        }
        String valueofferLocationId = request.getQueryString("offerLocationId");
        Long offerLocationId;
        if (valueofferLocationId != null) {
            offerLocationId = Long.parseLong(valueofferLocationId);
        } else {
            offerLocationId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createReservationHttp(request, version, deviceId, accountId, startDate, endDate, offerId, offerLocationId, appKey, metaData);
    }

    @ApiAction
    public Result deleteReservation(Http.Request request, BigDecimal version) throws Exception {
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
        String valuereservationId = request.getQueryString("reservationId");
        Long reservationId;
        if (valuereservationId != null) {
            reservationId = Long.parseLong(valuereservationId);
        } else {
            throw new IllegalArgumentException("'reservationId' parameter is required");
        }
        return imp.deleteReservationHttp(request, version, reservationId, deviceId, accountId);
    }

    @ApiAction
    public Result reservableAvailability(Http.Request request, BigDecimal version) throws Exception {
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
        String valuereservableId = request.getQueryString("reservableId");
        Long reservableId;
        if (valuereservableId != null) {
            reservableId = Long.parseLong(valuereservableId);
        } else {
            throw new IllegalArgumentException("'reservableId' parameter is required");
        }
        String valuereservableType = request.getQueryString("reservableType");
        String reservableType;
        if (valuereservableType != null) {
            reservableType = valuereservableType;
        } else {
            throw new IllegalArgumentException("'reservableType' parameter is required");
        }
        String valueavailability = request.getQueryString("availability");
        String availability;
        if (valueavailability != null) {
            availability = valueavailability;
        } else {
            availability = null;
        }
        String valueavailabilitySummary = request.getQueryString("availabilitySummary");
        String availabilitySummary;
        if (valueavailabilitySummary != null) {
            availabilitySummary = valueavailabilitySummary;
        } else {
            availabilitySummary = null;
        }
        return imp.reservableAvailabilityHttp(request, version, reservableId, reservableType, deviceId, accountId, availability, availabilitySummary);
    }

    @ApiAction
    public Result searchAvailability(Http.Request request, BigDecimal version) throws Exception {
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
        String valuereservableId = request.getQueryString("reservableId");
        Long reservableId;
        if (valuereservableId != null) {
            reservableId = Long.parseLong(valuereservableId);
        } else {
            throw new IllegalArgumentException("'reservableId' parameter is required");
        }
        String valuereservableType = request.getQueryString("reservableType");
        String reservableType;
        if (valuereservableType != null) {
            reservableType = valuereservableType;
        } else {
            throw new IllegalArgumentException("'reservableType' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        return imp.searchAvailabilityHttp(request, version, reservableId, reservableType, deviceId, accountId, startDate, endDate, start, limit);
    }

    @ApiAction
    public Result searchReservations(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuefilterAccountId = request.getQueryString("filterAccountId");
        Long filterAccountId;
        if (valuefilterAccountId != null) {
            filterAccountId = Long.parseLong(valuefilterAccountId);
        } else {
            filterAccountId = null;
        }
        String valuereservableId = request.getQueryString("reservableId");
        Long reservableId;
        if (valuereservableId != null) {
            reservableId = Long.parseLong(valuereservableId);
        } else {
            reservableId = null;
        }
        String valuereservableType = request.getQueryString("reservableType");
        String reservableType;
        if (valuereservableType != null) {
            reservableType = valuereservableType;
        } else {
            reservableType = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        return imp.searchReservationsHttp(request, version, deviceId, appKey, accountId, filterAccountId, reservableId, reservableType, keyword, startDate, endDate, start, limit);
    }

    @ApiAction
    public Result searchSchedule(Http.Request request, BigDecimal version) throws Exception {
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
        String valuereservableId = request.getQueryString("reservableId");
        Long reservableId;
        if (valuereservableId != null) {
            reservableId = Long.parseLong(valuereservableId);
        } else {
            throw new IllegalArgumentException("'reservableId' parameter is required");
        }
        String valuereservableType = request.getQueryString("reservableType");
        String reservableType;
        if (valuereservableType != null) {
            reservableType = valuereservableType;
        } else {
            throw new IllegalArgumentException("'reservableType' parameter is required");
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            throw new IllegalArgumentException("'startDate' parameter is required");
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            throw new IllegalArgumentException("'endDate' parameter is required");
        }
        String valuetimeBucketMins = request.getQueryString("timeBucketMins");
        Integer timeBucketMins;
        if (valuetimeBucketMins != null) {
            timeBucketMins = Integer.parseInt(valuetimeBucketMins);
        } else {
            timeBucketMins = 30;
        }
        return imp.searchScheduleHttp(request, version, reservableId, reservableType, startDate, endDate, deviceId, accountId, timeBucketMins);
    }

}
