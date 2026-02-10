package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Trip;

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
@Path("/api/{version}/trip")
@Api(value = "/", description = "")
public interface TripApi  {

    /**
     * Create Trip
     *
     * Create a new trip
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Trip", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip createTrip(@PathParam("version") BigDecimal version, @Valid Trip body);

    /**
     * Delete Trip
     *
     * Delete an existing trip
     *
     */
    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "Delete Trip", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void delete(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Set Trip Preference Driver
     *
     * Update trip preference to drive, also create a route and assign the trip to the route
     *
     */
    @POST
    @Path("/{id}/drive")
    @Produces({ "*/*" })
    @ApiOperation(value = "Set Trip Preference Driver", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip driveTrip(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @QueryParam("recurrence") @NotNull Boolean recurrence);

    /**
     * Set Trip Preference Flexible
     *
     * Update trip preference to flexible.
     *
     */
    @POST
    @Path("/{id}/flexible")
    @Produces({ "*/*" })
    @ApiOperation(value = "Set Trip Preference Flexible", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip flexibleTrip(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @QueryParam("recurrence") @NotNull Boolean recurrence);

    /**
     * Get Trip
     *
     * Get an existing trip
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Trip", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip getTrip(@PathParam("version") BigDecimal version, @PathParam("id") Long id);

    /**
     * Get Trip Matches
     *
     * Get matching trips of specific trip
     *
     */
    @GET
    @Path("/{id}/match")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Trip Matches", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> getTripMatches(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver);

    /**
     * Process Trip Matches
     *
     * Process trip matching, assign trips with no route to matched trips with route.
     *
     */
    @POST
    @Path("/match/process")
    @Produces({ "*/*" })
    @ApiOperation(value = "Process Trip Matches", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> processTripMatches(@PathParam("version") BigDecimal version, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tripId") Long tripId);

    /**
     * Set Trip Preference Rider
     *
     * Update trip preference to ride.
     *
     */
    @POST
    @Path("/{id}/ride")
    @Produces({ "*/*" })
    @ApiOperation(value = "Set Trip Preference Rider", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip ride(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @QueryParam("recurrence") @NotNull Boolean recurrence);

    /**
     * Search Trips
     *
     * Search for trips
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Trips", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> search(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("hasNotifications") Boolean hasNotifications);

    /**
     * Search Trips
     *
     * Search for trips with matching information.
     *
     */
    @GET
    @Path("/match")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Trips", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> searchTrips(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver);

    /**
     * Update Trip Locations
     *
     */
    @POST
    @Path("/{id}/locations")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Trip Locations", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip updateLocations(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Trip body);

    /**
     * Update Recurrence Locations
     *
     */
    @POST
    @Path("/{id}/locations/recurrence")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Recurrence Locations", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> updateRecurrenceLocations(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Trip body);

    /**
     * Update Recurrence Shipments
     *
     */
    @POST
    @Path("/{id}/shipments/recurrence")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Recurrence Shipments", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public List<Trip> updateRecurrenceShipments(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Trip body);

    /**
     * Update Trip Shipments
     *
     */
    @POST
    @Path("/{id}/shipments")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Trip Shipments", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip updateShipments(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Trip body);

    /**
     * Update Trip
     *
     * Update an existing trip. Does not support recurring trip update.
     *
     */
    @PUT
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Trip", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip updateTrip(@PathParam("version") BigDecimal version, @PathParam("id") Long id, @Valid Trip body);

    /**
     * Trip Notifications
     *
     * Update the trip notifications
     *
     */
    @POST
    @Path("/notifications")
    @Produces({ "*/*" })
    @ApiOperation(value = "Trip Notifications", tags={ "Trip" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Trip updateTripNotifications(@PathParam("version") BigDecimal version, @QueryParam("id") @NotNull Long id, @QueryParam("notifications") String notifications);
}
