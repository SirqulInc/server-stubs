package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TripApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Trip;

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

@Path("/trip")


@io.swagger.annotations.Api(description = "the trip API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TripApi  {

    @Inject TripApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trip", notes = "Create a new trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response createTrip(@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTrip(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Trip", notes = "Delete an existing trip", response = Void.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response delete( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.delete(id,securityContext);
    }
    @POST
    @Path("/{id}/drive")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Driver", notes = "Update trip preference to drive, also create a route and assign the trip to the route", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response driveTrip( @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.driveTrip(id,recurrence,securityContext);
    }
    @POST
    @Path("/{id}/flexible")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Flexible", notes = "Update trip preference to flexible.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response flexibleTrip( @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.flexibleTrip(id,recurrence,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip", notes = "Get an existing trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response getTrip( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrip(id,securityContext);
    }
    @GET
    @Path("/{id}/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip Matches", notes = "Get matching trips of specific trip", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response getTripMatches( @PathParam("id") Long id, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTripMatches(id,sortField,descending,start,limit,activeOnly,matchedHasRoute,matchedHasDriver,securityContext);
    }
    @POST
    @Path("/match/process")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Trip Matches", notes = "Process trip matching, assign trips with no route to matched trips with route.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response processTripMatches( @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tripId") Long tripId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processTripMatches(startDate,endDate,tripId,securityContext);
    }
    @POST
    @Path("/{id}/ride")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Rider", notes = "Update trip preference to ride.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response ride( @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.ride(id,recurrence,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response search( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("hasNotifications") Boolean hasNotifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.search(accountId,sortField,descending,start,limit,activeOnly,startDate,endDate,hasNotifications,securityContext);
    }
    @GET
    @Path("/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips with matching information.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response searchTrips( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTrips(accountId,sortField,descending,start,limit,activeOnly,startDate,endDate,matchedHasRoute,matchedHasDriver,securityContext);
    }
    @POST
    @Path("/{id}/locations")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Locations", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateLocations( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocations(id,body,securityContext);
    }
    @POST
    @Path("/{id}/locations/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Locations", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response updateRecurrenceLocations( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRecurrenceLocations(id,body,securityContext);
    }
    @POST
    @Path("/{id}/shipments/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Shipments", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response updateRecurrenceShipments( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRecurrenceShipments(id,body,securityContext);
    }
    @POST
    @Path("/{id}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Shipments", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateShipments( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipments(id,body,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip", notes = "Update an existing trip. Does not support recurring trip update.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateTrip( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTrip(id,body,securityContext);
    }
    @POST
    @Path("/notifications")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Trip Notifications", notes = "Update the trip notifications", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateTripNotifications( @NotNull @QueryParam("id") Long id, @QueryParam("notifications") String notifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTripNotifications(id,notifications,securityContext);
    }
}
