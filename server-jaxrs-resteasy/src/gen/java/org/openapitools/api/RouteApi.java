package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RouteApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/route")


@io.swagger.annotations.Api(description = "the route API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RouteApi  {

    @Inject RouteApiService service;

    @POST
    @Path("/{routeId}/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Route", notes = "Approve a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response approveRoute( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveRoute(routeId,securityContext);
    }
    @POST
    @Path("/{routeId}/copy")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Copy Route", notes = "Make an copy of the given route with optional overriding properties", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response copyRoute( @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.copyRoute(routeId,body,securityContext);
    }
    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route", notes = "Create new route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response createRoute(@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRoute(body,securityContext);
    }
    @PUT
    @Path("/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Directions", notes = "Regenerate the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public Response createRouteDirections( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRouteDirections(routeId,securityContext);
    }
    @PUT
    @Path("/{routeId}/polyline")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Polyline", notes = "Update the polyline of the requested route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response createRoutePolyline( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRoutePolyline(routeId,securityContext);
    }
    @POST
    @Path("/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Setting", notes = "Create a new route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response createRouteSettings(@ApiParam(value = "" ) @Valid RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRouteSettings(body,securityContext);
    }
    @DELETE
    @Path("/{routeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Route", notes = "Delete an existing route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteRoute( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRoute(routeId,securityContext);
    }
    @DELETE
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Route Setting", notes = "Delete an existing route setting", response = Object.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response deleteRouteSettings( @PathParam("routeSettingsId") Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRouteSettings(routeSettingsId,securityContext);
    }
    @POST
    @Path("/{routeId}/disapprove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Disapprove Route", notes = "Disapprove a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response disapproveRoute( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.disapproveRoute(routeId,securityContext);
    }
    @GET
    @Path("/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route", notes = "Get an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response getRoute( @PathParam("routeId") Long routeId, @NotNull @QueryParam("showInheritedProperties") Boolean showInheritedProperties,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRoute(routeId,showInheritedProperties,securityContext);
    }
    @GET
    @Path("/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Directions", notes = "Get the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public Response getRouteDirections( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteDirections(routeId,securityContext);
    }
    @GET
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Setting", notes = "Get an existing route settings", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response getRouteSettings( @PathParam("routeSettingsId") Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteSettings(routeSettingsId,securityContext);
    }
    @GET
    @Path("/{routeId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Shipments", notes = "Get the shipments on the requested route", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response getRouteShipments( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteShipments(routeId,securityContext);
    }
    @GET
    @Path("/{routeId}/stop/{stopId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stop", notes = "Get the specific stop on a route", response = Stop.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response getRouteStop( @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteStop(routeId,stopId,securityContext);
    }
    @GET
    @Path("/{routeId}/stops")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stops", notes = "The stops of the route requested", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response getRouteStops( @PathParam("routeId") Long routeId, @NotNull @QueryParam("confirmedOnly") Boolean confirmedOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteStops(routeId,confirmedOnly,securityContext);
    }
    @GET
    @Path("/{routeId}/stop/{stopId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipments At Stop", notes = "Get the list of shipments on the requested route at a stop", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response getShipmentsAtStop( @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentsAtStop(routeId,stopId,securityContext);
    }
    @POST
    @Path("/{routeId}/optimize")
    
    
    @io.swagger.annotations.ApiOperation(value = "Optimize Route", notes = "Optimize a route. The optimization method based on how the server is configured.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response optimizeRoute( @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.optimizeRoute(routeId,securityContext);
    }
    @DELETE
    @Path("/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Stop", notes = "Delete a stop on a route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response removeStop( @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeStop(routeId,stopId,securityContext);
    }
    @PATCH
    @Path("/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response reorderRouteStopsPatch( @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reorderRouteStopsPatch(routeId,body,securityContext);
    }
    @POST
    @Path("/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response reorderRouteStopsPost( @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reorderRouteStopsPost(routeId,body,securityContext);
    }
    @GET
    @Path("/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Route Settings", notes = "Search for route settings", response = RouteSettings.class, responseContainer = "List", tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class, responseContainer = "List") })
    public Response searchRouteSettings( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRouteSettings(sortField,descending,start,limit,activeOnly,hubId,programId,keyword,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Routes", notes = "Search for routes.", response = Route.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class, responseContainer = "List") })
    public Response searchRoutes( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includesEmpty") Boolean includesEmpty, @NotNull @QueryParam("rootOnly") Boolean rootOnly, @NotNull @QueryParam("showInheritedProperties") Boolean showInheritedProperties, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("scheduledStart") Long scheduledStart, @QueryParam("scheduledEnd") Long scheduledEnd, @QueryParam("updatedStart") Long updatedStart, @QueryParam("updatedEnd") Long updatedEnd, @QueryParam("featured") Boolean featured, @QueryParam("seatCount") Integer seatCount, @QueryParam("approved") Boolean approved, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("valid") Boolean valid, @QueryParam("parentId") Long parentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRoutes(sortField,descending,start,limit,activeOnly,includesEmpty,rootOnly,showInheritedProperties,hubId,programId,scheduledStart,scheduledEnd,updatedStart,updatedEnd,featured,seatCount,approved,started,completed,valid,parentId,securityContext);
    }
    @POST
    @Path("/{id}/driver/{driverId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Driver", notes = "Update the driver of the route.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response setDriver( @PathParam("id") Long id, @PathParam("driverId") Long driverId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setDriver(id,driverId,securityContext);
    }
    @PUT
    @Path("/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route", notes = "Update an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response updateRoute( @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRoute(routeId,body,securityContext);
    }
    @PUT
    @Path("/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Setting", notes = "Update an existing route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response updateRouteSettings( @PathParam("routeSettingsId") Long routeSettingsId,@ApiParam(value = "" ) @Valid RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRouteSettings(routeSettingsId,body,securityContext);
    }
    @PUT
    @Path("/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Route Stop", notes = "Update a stop on a specified route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateRouteStop( @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@ApiParam(value = "" ) @Valid Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRouteStop(routeId,stopId,body,securityContext);
    }
}
