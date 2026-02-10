package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Direction;
import org.openapitools.model.Route;
import org.openapitools.model.Shipment;
import org.openapitools.model.Stop;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/route")
@Api(value = "/", description = "")
public interface RouteApi  {

    /**
     * Approve Route
     *
     * Approve a route
     *
     */
    @POST
    @Path("/{routeId}/approve")
    @Produces({ "*/*" })
    @ApiOperation(value = "Approve Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route approveRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Copy Route
     *
     * Make an copy of the given route with optional overriding properties
     *
     */
    @POST
    @Path("/{routeId}/copy")
    @Produces({ "*/*" })
    @ApiOperation(value = "Copy Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route copyRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @Valid Route body);

    /**
     * Create Route
     *
     * Create new route
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route createRoute(@PathParam("version") BigDecimal version, @Valid Route body);

    /**
     * Update Route Directions
     *
     * Regenerate the directions of a route
     *
     */
    @PUT
    @Path("/{routeId}/directions")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Route Directions", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public List<Direction> createRouteDirections(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Create Route Polyline
     *
     * Update the polyline of the requested route
     *
     */
    @PUT
    @Path("/{routeId}/polyline")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Route Polyline", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route createRoutePolyline(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Delete Route
     *
     * Delete an existing route
     *
     */
    @DELETE
    @Path("/{routeId}")
    @ApiOperation(value = "Delete Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Disapprove Route
     *
     * Disapprove a route
     *
     */
    @POST
    @Path("/{routeId}/disapprove")
    @Produces({ "*/*" })
    @ApiOperation(value = "Disapprove Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route disapproveRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Get Route
     *
     * Get an existing route
     *
     */
    @GET
    @Path("/{routeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route getRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @QueryParam("showInheritedProperties") @NotNull Boolean showInheritedProperties);

    /**
     * Get Route Directions
     *
     * Get the directions of a route
     *
     */
    @GET
    @Path("/{routeId}/directions")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route Directions", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public List<Direction> getRouteDirections(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Get Route Shipments
     *
     * Get the shipments on the requested route
     *
     */
    @GET
    @Path("/{routeId}/shipments")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route Shipments", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public List<Shipment> getRouteShipments(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Get Route Stop
     *
     * Get the specific stop on a route
     *
     */
    @GET
    @Path("/{routeId}/stop/{stopId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route Stop", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Stop getRouteStop(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId);

    /**
     * Get Route Stops
     *
     * The stops of the route requested
     *
     */
    @GET
    @Path("/{routeId}/stops")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Route Stops", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public List<Stop> getRouteStops(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @QueryParam("confirmedOnly") @NotNull Boolean confirmedOnly);

    /**
     * Get Shipments At Stop
     *
     * Get the list of shipments on the requested route at a stop
     *
     */
    @GET
    @Path("/{routeId}/stop/{stopId}/shipments")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Shipments At Stop", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public List<Shipment> getShipmentsAtStop(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId);

    /**
     * Optimize Route
     *
     * Optimize a route. The optimization method based on how the server is configured.
     *
     */
    @POST
    @Path("/{routeId}/optimize")
    @ApiOperation(value = "Optimize Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void optimizeRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId);

    /**
     * Delete Stop
     *
     * Delete a stop on a route
     *
     */
    @DELETE
    @Path("/{routeId}/stop/{stopId}")
    @ApiOperation(value = "Delete Stop", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void removeStop(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId);

    /**
     * Reorder Route Stops
     *
     * Reordering the stops on the route with and update route distance, time, direction, and polyline
     *
     */
    @PATCH
    @Path("/{routeId}/stops/reorder")
    @Produces({ "*/*" })
    @ApiOperation(value = "Reorder Route Stops", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public List<Stop> reorderRouteStopsPatch(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @Valid List<@Valid Stop> body);

    /**
     * Reorder Route Stops
     *
     * Reordering the stops on the route with and update route distance, time, direction, and polyline
     *
     */
    @POST
    @Path("/{routeId}/stops/reorder")
    @Produces({ "*/*" })
    @ApiOperation(value = "Reorder Route Stops", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public List<Stop> reorderRouteStopsPost(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @Valid List<@Valid Stop> body);

    /**
     * Search Routes
     *
     * Search for routes.
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Routes", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class, responseContainer = "List") })
    public List<Route> searchRoutes(@PathParam("version") BigDecimal version, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("includesEmpty") @NotNull Boolean includesEmpty, @QueryParam("rootOnly") @NotNull Boolean rootOnly, @QueryParam("showInheritedProperties") @NotNull Boolean showInheritedProperties, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("scheduledStart") Long scheduledStart, @QueryParam("scheduledEnd") Long scheduledEnd, @QueryParam("updatedStart") Long updatedStart, @QueryParam("updatedEnd") Long updatedEnd, @QueryParam("featured") Boolean featured, @QueryParam("seatCount") Integer seatCount, @QueryParam("approved") Boolean approved, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("valid") Boolean valid, @QueryParam("parentId") Long parentId);

    /**
     * Set Driver
     *
     * Update the driver of the route.
     *
     */
    @POST
    @Path("/{id}/driver/{driverId}")
    @ApiOperation(value = "Set Driver", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void setDriver(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @PathParam("driverId") Long driverId);

    /**
     * Update Route
     *
     * Update an existing route
     *
     */
    @PUT
    @Path("/{routeId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Route", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Route updateRoute(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @Valid Route body);

    /**
     * Update Route Stop
     *
     * Update a stop on a specified route
     *
     */
    @PUT
    @Path("/{routeId}/stop/{stopId}")
    @ApiOperation(value = "Update Route Stop", tags={ "Route" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void updateRouteStop(@PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId, @Valid Stop body);
}
