package controllers;

import java.math.BigDecimal;
import apimodels.Direction;
import apimodels.Route;
import apimodels.Shipment;
import apimodels.Stop;

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
public abstract class RouteApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result approveRouteHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        Route obj = approveRoute(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route approveRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result copyRouteHttp(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception {
        Route obj = copyRoute(request, version, routeId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route copyRoute(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception;

    public Result createRouteHttp(Http.Request request, BigDecimal version, Route body) throws Exception {
        Route obj = createRoute(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route createRoute(Http.Request request, BigDecimal version, Route body) throws Exception;

    public Result createRouteDirectionsHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        List<Direction> obj = createRouteDirections(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Direction curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Direction> createRouteDirections(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result createRoutePolylineHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        Route obj = createRoutePolyline(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route createRoutePolyline(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result deleteRouteHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        deleteRoute(request, version, routeId);
        return ok();

    }

    public abstract void deleteRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result disapproveRouteHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        Route obj = disapproveRoute(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route disapproveRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result getRouteHttp(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean showInheritedProperties) throws Exception {
        Route obj = getRoute(request, version, routeId, showInheritedProperties);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route getRoute(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean showInheritedProperties) throws Exception;

    public Result getRouteDirectionsHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        List<Direction> obj = getRouteDirections(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Direction curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Direction> getRouteDirections(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result getRouteShipmentsHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        List<Shipment> obj = getRouteShipments(request, version, routeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Shipment curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Shipment> getRouteShipments(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result getRouteStopHttp(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        Stop obj = getRouteStop(request, version, routeId, stopId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Stop getRouteStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception;

    public Result getRouteStopsHttp(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean confirmedOnly) throws Exception {
        List<Stop> obj = getRouteStops(request, version, routeId, confirmedOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Stop curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Stop> getRouteStops(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean confirmedOnly) throws Exception;

    public Result getShipmentsAtStopHttp(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        List<Shipment> obj = getShipmentsAtStop(request, version, routeId, stopId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Shipment curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Shipment> getShipmentsAtStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception;

    public Result optimizeRouteHttp(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        optimizeRoute(request, version, routeId);
        return ok();

    }

    public abstract void optimizeRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception;

    public Result removeStopHttp(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        removeStop(request, version, routeId, stopId);
        return ok();

    }

    public abstract void removeStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception;

    public Result reorderRouteStopsPatchHttp(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception {
        List<Stop> obj = reorderRouteStopsPatch(request, version, routeId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Stop curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Stop> reorderRouteStopsPatch(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception;

    public Result reorderRouteStopsPostHttp(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception {
        List<Stop> obj = reorderRouteStopsPost(request, version, routeId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Stop curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Stop> reorderRouteStopsPost(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception;

    public Result searchRoutesHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includesEmpty, @NotNull Boolean rootOnly, @NotNull Boolean showInheritedProperties, Long hubId, Long programId, Long scheduledStart, Long scheduledEnd, Long updatedStart, Long updatedEnd, Boolean featured, Integer seatCount, Boolean approved, Boolean started, Boolean completed, Boolean valid, Long parentId) throws Exception {
        List<Route> obj = searchRoutes(request, version, sortField, descending, start, limit, activeOnly, includesEmpty, rootOnly, showInheritedProperties, hubId, programId, scheduledStart, scheduledEnd, updatedStart, updatedEnd, featured, seatCount, approved, started, completed, valid, parentId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Route curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Route> searchRoutes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includesEmpty, @NotNull Boolean rootOnly, @NotNull Boolean showInheritedProperties, Long hubId, Long programId, Long scheduledStart, Long scheduledEnd, Long updatedStart, Long updatedEnd, Boolean featured, Integer seatCount, Boolean approved, Boolean started, Boolean completed, Boolean valid, Long parentId) throws Exception;

    public Result setDriverHttp(Http.Request request, BigDecimal version, Long id, Long driverId) throws Exception {
        setDriver(request, version, id, driverId);
        return ok();

    }

    public abstract void setDriver(Http.Request request, BigDecimal version, Long id, Long driverId) throws Exception;

    public Result updateRouteHttp(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception {
        Route obj = updateRoute(request, version, routeId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Route updateRoute(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception;

    public Result updateRouteStopHttp(Http.Request request, BigDecimal version, Long routeId, Long stopId, Stop body) throws Exception {
        updateRouteStop(request, version, routeId, stopId, body);
        return ok();

    }

    public abstract void updateRouteStop(Http.Request request, BigDecimal version, Long routeId, Long stopId, Stop body) throws Exception;

}
