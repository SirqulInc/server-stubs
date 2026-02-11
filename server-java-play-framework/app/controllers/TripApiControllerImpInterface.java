package controllers;

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

    public Result createTripHttp(Http.Request request, Trip body) throws Exception {
        Trip obj = createTrip(request, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip createTrip(Http.Request request, Trip body) throws Exception;

    public Result deleteHttp(Http.Request request, Long id) throws Exception {
        delete(request, id);
        return ok();

    }

    public abstract void delete(Http.Request request, Long id) throws Exception;

    public Result driveTripHttp(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = driveTrip(request, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip driveTrip(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result flexibleTripHttp(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = flexibleTrip(request, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip flexibleTrip(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result getTripHttp(Http.Request request, Long id) throws Exception {
        Trip obj = getTrip(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip getTrip(Http.Request request, Long id) throws Exception;

    public Result getTripMatchesHttp(Http.Request request, Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        List<Trip> obj = getTripMatches(request, id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> getTripMatches(Http.Request request, Long id, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception;

    public Result processTripMatchesHttp(Http.Request request, Long startDate, Long endDate, Long tripId) throws Exception {
        List<Trip> obj = processTripMatches(request, startDate, endDate, tripId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> processTripMatches(Http.Request request, Long startDate, Long endDate, Long tripId) throws Exception;

    public Result rideHttp(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception {
        Trip obj = ride(request, id, recurrence);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip ride(Http.Request request, Long id, @NotNull Boolean recurrence) throws Exception;

    public Result searchHttp(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) throws Exception {
        List<Trip> obj = search(request, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> search(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean hasNotifications) throws Exception;

    public Result searchTripsHttp(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception {
        List<Trip> obj = searchTrips(request, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> searchTrips(Http.Request request, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long startDate, Long endDate, Boolean matchedHasRoute, Boolean matchedHasDriver) throws Exception;

    public Result updateLocationsHttp(Http.Request request, Long id, Trip body) throws Exception {
        Trip obj = updateLocations(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateLocations(Http.Request request, Long id, Trip body) throws Exception;

    public Result updateRecurrenceLocationsHttp(Http.Request request, Long id, Trip body) throws Exception {
        List<Trip> obj = updateRecurrenceLocations(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> updateRecurrenceLocations(Http.Request request, Long id, Trip body) throws Exception;

    public Result updateRecurrenceShipmentsHttp(Http.Request request, Long id, Trip body) throws Exception {
        List<Trip> obj = updateRecurrenceShipments(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Trip curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Trip> updateRecurrenceShipments(Http.Request request, Long id, Trip body) throws Exception;

    public Result updateShipmentsHttp(Http.Request request, Long id, Trip body) throws Exception {
        Trip obj = updateShipments(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateShipments(Http.Request request, Long id, Trip body) throws Exception;

    public Result updateTripHttp(Http.Request request, Long id, Trip body) throws Exception {
        Trip obj = updateTrip(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateTrip(Http.Request request, Long id, Trip body) throws Exception;

    public Result updateTripNotificationsHttp(Http.Request request, @NotNull Long id, String notifications) throws Exception {
        Trip obj = updateTripNotifications(request, id, notifications);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Trip updateTripNotifications(Http.Request request, @NotNull Long id, String notifications) throws Exception;

}
