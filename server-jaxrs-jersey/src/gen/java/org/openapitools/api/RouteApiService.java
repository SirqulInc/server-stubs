package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class RouteApiService {
    public abstract Response approveRoute(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response copyRoute(Long routeId,Route body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRoute(Route body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRouteDirections(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRoutePolyline(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRouteSettings(RouteSettings body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteRoute(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteRouteSettings(Long routeSettingsId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response disapproveRoute(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRoute(Long routeId, @NotNull Boolean showInheritedProperties,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRouteDirections(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRouteSettings(Long routeSettingsId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRouteShipments(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRouteStop(Long routeId,Long stopId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRouteStops(Long routeId, @NotNull Boolean confirmedOnly,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getShipmentsAtStop(Long routeId,Long stopId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response optimizeRoute(Long routeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response removeStop(Long routeId,Long stopId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reorderRouteStopsPatch(Long routeId,List<@Valid Stop> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response reorderRouteStopsPost(Long routeId,List<@Valid Stop> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRouteSettings( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly,Long hubId,Long programId,String keyword,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRoutes( @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean includesEmpty, @NotNull Boolean rootOnly, @NotNull Boolean showInheritedProperties,Long hubId,Long programId,Long scheduledStart,Long scheduledEnd,Long updatedStart,Long updatedEnd,Boolean featured,Integer seatCount,Boolean approved,Boolean started,Boolean completed,Boolean valid,Long parentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response setDriver(Long id,Long driverId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRoute(Long routeId,Route body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRouteSettings(Long routeSettingsId,RouteSettings body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRouteStop(Long routeId,Long stopId,Stop body,SecurityContext securityContext) throws NotFoundException;
}
