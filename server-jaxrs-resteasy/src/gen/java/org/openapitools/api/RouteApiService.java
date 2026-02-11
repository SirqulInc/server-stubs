package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface RouteApiService {
      Response approveRoute(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response copyRoute(Long routeId,Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response createRoute(Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response createRouteDirections(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response createRoutePolyline(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response createRouteSettings(RouteSettings body,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRoute(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRouteSettings(Long routeSettingsId,SecurityContext securityContext)
      throws NotFoundException;
      Response disapproveRoute(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRoute(Long routeId,Boolean showInheritedProperties,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteDirections(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteSettings(Long routeSettingsId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteShipments(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteStop(Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRouteStops(Long routeId,Boolean confirmedOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response getShipmentsAtStop(Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response optimizeRoute(Long routeId,SecurityContext securityContext)
      throws NotFoundException;
      Response removeStop(Long routeId,Long stopId,SecurityContext securityContext)
      throws NotFoundException;
      Response reorderRouteStopsPatch(Long routeId,List<@Valid Stop> body,SecurityContext securityContext)
      throws NotFoundException;
      Response reorderRouteStopsPost(Long routeId,List<@Valid Stop> body,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRouteSettings(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Long hubId,Long programId,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRoutes(String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean includesEmpty,Boolean rootOnly,Boolean showInheritedProperties,Long hubId,Long programId,Long scheduledStart,Long scheduledEnd,Long updatedStart,Long updatedEnd,Boolean featured,Integer seatCount,Boolean approved,Boolean started,Boolean completed,Boolean valid,Long parentId,SecurityContext securityContext)
      throws NotFoundException;
      Response setDriver(Long id,Long driverId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRoute(Long routeId,Route body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRouteSettings(Long routeSettingsId,RouteSettings body,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRouteStop(Long routeId,Long stopId,Stop body,SecurityContext securityContext)
      throws NotFoundException;


}
