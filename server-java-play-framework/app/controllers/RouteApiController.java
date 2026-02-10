package controllers;

import java.math.BigDecimal;
import apimodels.Direction;
import apimodels.Route;
import apimodels.Shipment;
import apimodels.Stop;

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
public class RouteApiController extends Controller {
    private final RouteApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RouteApiController(Config configuration, RouteApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result approveRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.approveRouteHttp(request, version, routeId);
    }

    @ApiAction
    public Result copyRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Route body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Route.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.copyRouteHttp(request, version, routeId, body);
    }

    @ApiAction
    public Result createRoute(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Route body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Route.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.createRouteHttp(request, version, body);
    }

    @ApiAction
    public Result createRouteDirections(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.createRouteDirectionsHttp(request, version, routeId);
    }

    @ApiAction
    public Result createRoutePolyline(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.createRoutePolylineHttp(request, version, routeId);
    }

    @ApiAction
    public Result deleteRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.deleteRouteHttp(request, version, routeId);
    }

    @ApiAction
    public Result disapproveRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.disapproveRouteHttp(request, version, routeId);
    }

    @ApiAction
    public Result getRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        String valueshowInheritedProperties = request.getQueryString("showInheritedProperties");
        Boolean showInheritedProperties;
        if (valueshowInheritedProperties != null) {
            showInheritedProperties = Boolean.valueOf(valueshowInheritedProperties);
        } else {
            throw new IllegalArgumentException("'showInheritedProperties' parameter is required");
        }
        return imp.getRouteHttp(request, version, routeId, showInheritedProperties);
    }

    @ApiAction
    public Result getRouteDirections(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.getRouteDirectionsHttp(request, version, routeId);
    }

    @ApiAction
    public Result getRouteShipments(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.getRouteShipmentsHttp(request, version, routeId);
    }

    @ApiAction
    public Result getRouteStop(Http.Request request, BigDecimal version,Long routeId,Long stopId) throws Exception {
        return imp.getRouteStopHttp(request, version, routeId, stopId);
    }

    @ApiAction
    public Result getRouteStops(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        String valueconfirmedOnly = request.getQueryString("confirmedOnly");
        Boolean confirmedOnly;
        if (valueconfirmedOnly != null) {
            confirmedOnly = Boolean.valueOf(valueconfirmedOnly);
        } else {
            throw new IllegalArgumentException("'confirmedOnly' parameter is required");
        }
        return imp.getRouteStopsHttp(request, version, routeId, confirmedOnly);
    }

    @ApiAction
    public Result getShipmentsAtStop(Http.Request request, BigDecimal version,Long routeId,Long stopId) throws Exception {
        return imp.getShipmentsAtStopHttp(request, version, routeId, stopId);
    }

    @ApiAction
    public Result optimizeRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        return imp.optimizeRouteHttp(request, version, routeId);
    }

    @ApiAction
    public Result removeStop(Http.Request request, BigDecimal version,Long routeId,Long stopId) throws Exception {
        return imp.removeStopHttp(request, version, routeId, stopId);
    }

    @ApiAction
    public Result reorderRouteStopsPatch(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        List<@Valid Stop> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<@Valid Stop>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (Stop curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            body = null;
        }
        return imp.reorderRouteStopsPatchHttp(request, version, routeId, body);
    }

    @ApiAction
    public Result reorderRouteStopsPost(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        List<@Valid Stop> body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), new TypeReference<List<@Valid Stop>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (Stop curItem : body) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            body = null;
        }
        return imp.reorderRouteStopsPostHttp(request, version, routeId, body);
    }

    @ApiAction
    public Result searchRoutes(Http.Request request, BigDecimal version) throws Exception {
        String valuehubId = request.getQueryString("hubId");
        Long hubId;
        if (valuehubId != null) {
            hubId = Long.parseLong(valuehubId);
        } else {
            hubId = null;
        }
        String valueprogramId = request.getQueryString("programId");
        Long programId;
        if (valueprogramId != null) {
            programId = Long.parseLong(valueprogramId);
        } else {
            programId = null;
        }
        String valuescheduledStart = request.getQueryString("scheduledStart");
        Long scheduledStart;
        if (valuescheduledStart != null) {
            scheduledStart = Long.parseLong(valuescheduledStart);
        } else {
            scheduledStart = null;
        }
        String valuescheduledEnd = request.getQueryString("scheduledEnd");
        Long scheduledEnd;
        if (valuescheduledEnd != null) {
            scheduledEnd = Long.parseLong(valuescheduledEnd);
        } else {
            scheduledEnd = null;
        }
        String valueupdatedStart = request.getQueryString("updatedStart");
        Long updatedStart;
        if (valueupdatedStart != null) {
            updatedStart = Long.parseLong(valueupdatedStart);
        } else {
            updatedStart = null;
        }
        String valueupdatedEnd = request.getQueryString("updatedEnd");
        Long updatedEnd;
        if (valueupdatedEnd != null) {
            updatedEnd = Long.parseLong(valueupdatedEnd);
        } else {
            updatedEnd = null;
        }
        String valuefeatured = request.getQueryString("featured");
        Boolean featured;
        if (valuefeatured != null) {
            featured = Boolean.valueOf(valuefeatured);
        } else {
            featured = null;
        }
        String valueseatCount = request.getQueryString("seatCount");
        Integer seatCount;
        if (valueseatCount != null) {
            seatCount = Integer.parseInt(valueseatCount);
        } else {
            seatCount = null;
        }
        String valueapproved = request.getQueryString("approved");
        Boolean approved;
        if (valueapproved != null) {
            approved = Boolean.valueOf(valueapproved);
        } else {
            approved = null;
        }
        String valuestarted = request.getQueryString("started");
        Boolean started;
        if (valuestarted != null) {
            started = Boolean.valueOf(valuestarted);
        } else {
            started = null;
        }
        String valuecompleted = request.getQueryString("completed");
        Boolean completed;
        if (valuecompleted != null) {
            completed = Boolean.valueOf(valuecompleted);
        } else {
            completed = null;
        }
        String valuevalid = request.getQueryString("valid");
        Boolean valid;
        if (valuevalid != null) {
            valid = Boolean.valueOf(valuevalid);
        } else {
            valid = null;
        }
        String valueparentId = request.getQueryString("parentId");
        Long parentId;
        if (valueparentId != null) {
            parentId = Long.parseLong(valueparentId);
        } else {
            parentId = null;
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
        String valueincludesEmpty = request.getQueryString("includesEmpty");
        Boolean includesEmpty;
        if (valueincludesEmpty != null) {
            includesEmpty = Boolean.valueOf(valueincludesEmpty);
        } else {
            throw new IllegalArgumentException("'includesEmpty' parameter is required");
        }
        String valuerootOnly = request.getQueryString("rootOnly");
        Boolean rootOnly;
        if (valuerootOnly != null) {
            rootOnly = Boolean.valueOf(valuerootOnly);
        } else {
            throw new IllegalArgumentException("'rootOnly' parameter is required");
        }
        String valueshowInheritedProperties = request.getQueryString("showInheritedProperties");
        Boolean showInheritedProperties;
        if (valueshowInheritedProperties != null) {
            showInheritedProperties = Boolean.valueOf(valueshowInheritedProperties);
        } else {
            throw new IllegalArgumentException("'showInheritedProperties' parameter is required");
        }
        return imp.searchRoutesHttp(request, version, sortField, descending, start, limit, activeOnly, includesEmpty, rootOnly, showInheritedProperties, hubId, programId, scheduledStart, scheduledEnd, updatedStart, updatedEnd, featured, seatCount, approved, started, completed, valid, parentId);
    }

    @ApiAction
    public Result setDriver(Http.Request request, BigDecimal version,Long id,Long driverId) throws Exception {
        return imp.setDriverHttp(request, version, id, driverId);
    }

    @ApiAction
    public Result updateRoute(Http.Request request, BigDecimal version,Long routeId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Route body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Route.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateRouteHttp(request, version, routeId, body);
    }

    @ApiAction
    public Result updateRouteStop(Http.Request request, BigDecimal version,Long routeId,Long stopId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Stop body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Stop.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateRouteStopHttp(request, version, routeId, stopId, body);
    }

}
