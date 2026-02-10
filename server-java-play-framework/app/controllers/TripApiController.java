package controllers;

import java.math.BigDecimal;
import apimodels.Trip;

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
public class TripApiController extends Controller {
    private final TripApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TripApiController(Config configuration, TripApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createTrip(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createTripHttp(request, version, body);
    }

    @ApiAction
    public Result delete(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.deleteHttp(request, version, id);
    }

    @ApiAction
    public Result driveTrip(Http.Request request, BigDecimal version,Long id) throws Exception {
        String valuerecurrence = request.getQueryString("recurrence");
        Boolean recurrence;
        if (valuerecurrence != null) {
            recurrence = Boolean.valueOf(valuerecurrence);
        } else {
            throw new IllegalArgumentException("'recurrence' parameter is required");
        }
        return imp.driveTripHttp(request, version, id, recurrence);
    }

    @ApiAction
    public Result flexibleTrip(Http.Request request, BigDecimal version,Long id) throws Exception {
        String valuerecurrence = request.getQueryString("recurrence");
        Boolean recurrence;
        if (valuerecurrence != null) {
            recurrence = Boolean.valueOf(valuerecurrence);
        } else {
            throw new IllegalArgumentException("'recurrence' parameter is required");
        }
        return imp.flexibleTripHttp(request, version, id, recurrence);
    }

    @ApiAction
    public Result getTrip(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getTripHttp(request, version, id);
    }

    @ApiAction
    public Result getTripMatches(Http.Request request, BigDecimal version,Long id) throws Exception {
        String valuematchedHasRoute = request.getQueryString("matchedHasRoute");
        Boolean matchedHasRoute;
        if (valuematchedHasRoute != null) {
            matchedHasRoute = Boolean.valueOf(valuematchedHasRoute);
        } else {
            matchedHasRoute = null;
        }
        String valuematchedHasDriver = request.getQueryString("matchedHasDriver");
        Boolean matchedHasDriver;
        if (valuematchedHasDriver != null) {
            matchedHasDriver = Boolean.valueOf(valuematchedHasDriver);
        } else {
            matchedHasDriver = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.getTripMatchesHttp(request, version, id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver);
    }

    @ApiAction
    public Result processTripMatches(Http.Request request, BigDecimal version) throws Exception {
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
        String valuetripId = request.getQueryString("tripId");
        Long tripId;
        if (valuetripId != null) {
            tripId = Long.parseLong(valuetripId);
        } else {
            tripId = null;
        }
        return imp.processTripMatchesHttp(request, version, startDate, endDate, tripId);
    }

    @ApiAction
    public Result ride(Http.Request request, BigDecimal version,Long id) throws Exception {
        String valuerecurrence = request.getQueryString("recurrence");
        Boolean recurrence;
        if (valuerecurrence != null) {
            recurrence = Boolean.valueOf(valuerecurrence);
        } else {
            throw new IllegalArgumentException("'recurrence' parameter is required");
        }
        return imp.rideHttp(request, version, id, recurrence);
    }

    @ApiAction
    public Result search(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
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
        String valuehasNotifications = request.getQueryString("hasNotifications");
        Boolean hasNotifications;
        if (valuehasNotifications != null) {
            hasNotifications = Boolean.valueOf(valuehasNotifications);
        } else {
            hasNotifications = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.searchHttp(request, version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications);
    }

    @ApiAction
    public Result searchTrips(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
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
        String valuematchedHasRoute = request.getQueryString("matchedHasRoute");
        Boolean matchedHasRoute;
        if (valuematchedHasRoute != null) {
            matchedHasRoute = Boolean.valueOf(valuematchedHasRoute);
        } else {
            matchedHasRoute = null;
        }
        String valuematchedHasDriver = request.getQueryString("matchedHasDriver");
        Boolean matchedHasDriver;
        if (valuematchedHasDriver != null) {
            matchedHasDriver = Boolean.valueOf(valuematchedHasDriver);
        } else {
            matchedHasDriver = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.searchTripsHttp(request, version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver);
    }

    @ApiAction
    public Result updateLocations(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateLocationsHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateRecurrenceLocations(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateRecurrenceLocationsHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateRecurrenceShipments(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateRecurrenceShipmentsHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateShipments(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateShipmentsHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateTrip(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Trip body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Trip.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateTripHttp(request, version, id, body);
    }

    @ApiAction
    public Result updateTripNotifications(Http.Request request, BigDecimal version) throws Exception {
        String valueid = request.getQueryString("id");
        Long id;
        if (valueid != null) {
            id = Long.parseLong(valueid);
        } else {
            throw new IllegalArgumentException("'id' parameter is required");
        }
        String valuenotifications = request.getQueryString("notifications");
        String notifications;
        if (valuenotifications != null) {
            notifications = valuenotifications;
        } else {
            notifications = null;
        }
        return imp.updateTripNotificationsHttp(request, version, id, notifications);
    }

}
