package controllers;

import java.math.BigDecimal;
import apimodels.Direction;
import apimodels.Route;
import apimodels.Shipment;
import apimodels.Stop;

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
public class RouteApiControllerImp extends RouteApiControllerImpInterface {
    @Override
    public Route approveRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public Route copyRoute(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public Route createRoute(Http.Request request, BigDecimal version, Route body) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public List<Direction> createRouteDirections(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Direction>();
    }

    @Override
    public Route createRoutePolyline(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public void deleteRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Route disapproveRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public Route getRoute(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean showInheritedProperties) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public List<Direction> getRouteDirections(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Direction>();
    }

    @Override
    public List<Shipment> getRouteShipments(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Shipment>();
    }

    @Override
    public Stop getRouteStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        //Do your magic!!!
        return new Stop();
    }

    @Override
    public List<Stop> getRouteStops(Http.Request request, BigDecimal version, Long routeId, @NotNull Boolean confirmedOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<Stop>();
    }

    @Override
    public List<Shipment> getShipmentsAtStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Shipment>();
    }

    @Override
    public void optimizeRoute(Http.Request request, BigDecimal version, Long routeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void removeStop(Http.Request request, BigDecimal version, Long routeId, Long stopId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<Stop> reorderRouteStopsPatch(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception {
        //Do your magic!!!
        return new ArrayList<Stop>();
    }

    @Override
    public List<Stop> reorderRouteStopsPost(Http.Request request, BigDecimal version, Long routeId, List<@Valid Stop> body) throws Exception {
        //Do your magic!!!
        return new ArrayList<Stop>();
    }

    @Override
    public List<Route> searchRoutes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includesEmpty, @NotNull Boolean rootOnly, @NotNull Boolean showInheritedProperties, Long hubId, Long programId, Long scheduledStart, Long scheduledEnd, Long updatedStart, Long updatedEnd, Boolean featured, Integer seatCount, Boolean approved, Boolean started, Boolean completed, Boolean valid, Long parentId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Route>();
    }

    @Override
    public void setDriver(Http.Request request, BigDecimal version, Long id, Long driverId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Route updateRoute(Http.Request request, BigDecimal version, Long routeId, Route body) throws Exception {
        //Do your magic!!!
        return new Route();
    }

    @Override
    public void updateRouteStop(Http.Request request, BigDecimal version, Long routeId, Long stopId, Stop body) throws Exception {
        //Do your magic!!!
    }

}
