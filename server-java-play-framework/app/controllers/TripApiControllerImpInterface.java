package controllers;

import java.math.BigDecimal;
import apimodels.Trip;

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
public abstract class TripApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createTripHttp(Http.Request request, BigDecimal version, Trip body) throws Exception {
        Trip obj = createTrip(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip createTrip(Http.Request request, BigDecimal version, Trip body) throws Exception;

    public Result deleteHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        delete(request, version, id);
        return ok();

    }

    public abstract void delete(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result driveTripHttp(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = driveTrip(request, version, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip driveTrip(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result flexibleTripHttp(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = flexibleTrip(request, version, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip flexibleTrip(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result getTripHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        Trip obj = getTrip(request, version, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip getTrip(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result getTripMatchesHttp(Http.Request request, BigDecimal version, Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        List<Trip> obj = getTripMatches(request, version, id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> getTripMatches(Http.Request request, BigDecimal version, Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception;

    public Result processTripMatchesHttp(Http.Request request, BigDecimal version, Long startDate, Long endDate, Long tripId) throws Exception {
        List<Trip> obj = processTripMatches(request, version, startDate, endDate, tripId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> processTripMatches(Http.Request request, BigDecimal version, Long startDate, Long endDate, Long tripId) throws Exception;

    public Result rideHttp(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = ride(request, version, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip ride(Http.Request request, BigDecimal version, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result searchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) throws Exception {
        List<Trip> obj = search(request, version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> search(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) throws Exception;

    public Result searchTripsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        List<Trip> obj = searchTrips(request, version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> searchTrips(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception;

    public Result updateLocationsHttp(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception {
        Trip obj = updateLocations(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateLocations(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception;

    public Result updateRecurrenceLocationsHttp(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception {
        List<Trip> obj = updateRecurrenceLocations(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> updateRecurrenceLocations(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception;

    public Result updateRecurrenceShipmentsHttp(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception {
        List<Trip> obj = updateRecurrenceShipments(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> updateRecurrenceShipments(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception;

    public Result updateShipmentsHttp(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception {
        Trip obj = updateShipments(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateShipments(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception;

    public Result updateTripHttp(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception {
        Trip obj = updateTrip(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateTrip(Http.Request request, BigDecimal version, Long id, Trip body) throws Exception;

    public Result updateTripNotificationsHttp(Http.Request request, BigDecimal version, @NotNull Long id, String notifications) throws Exception {
        Trip obj = updateTripNotifications(request, version, id, notifications);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateTripNotifications(Http.Request request, BigDecimal version, @NotNull Long id, String notifications) throws Exception;

}
