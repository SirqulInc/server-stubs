package org.openapitools.api;

import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.ReservationResponse;
import org.openapitools.model.TimeSlotResponse;

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
@Path("")
@Api(value = "/", description = "")
public interface ReservationApi  {

    /**
     * Create Reservation
     *
     * Creates a reservation on an offer object
     *
     */
    @POST
    @Path("/reservation/create")
    @ApiOperation(value = "Create Reservation", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void createReservation(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("appKey") String appKey, @QueryParam("metaData") String metaData);

    /**
     * Delete Reservation
     *
     * Deleted a reservation on a reservation object
     *
     */
    @POST
    @Path("/reservation/delete")
    @ApiOperation(value = "Delete Reservation", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteReservation(@QueryParam("reservationId") @NotNull Long reservationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Update Availability
     *
     */
    @POST
    @Path("/reservable/availability/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Availability", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public List<AvailabilityResponse> reservableAvailability(@QueryParam("reservableId") @NotNull Long reservableId, @QueryParam("reservableType") @NotNull String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary);

    /**
     * Search Availability
     *
     */
    @GET
    @Path("/reservable/availability/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Availability", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public List<AvailabilityResponse> searchAvailability(@QueryParam("reservableId") @NotNull Long reservableId, @QueryParam("reservableType") @NotNull String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Search Reservations
     *
     */
    @GET
    @Path("/reservation/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Reservations", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReservationResponse.class, responseContainer = "List") })
    public List<ReservationResponse> searchReservations(@QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("reservableId") Long reservableId, @QueryParam("reservableType") String reservableType, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);

    /**
     * Search Schedule
     *
     */
    @GET
    @Path("/reservable/schedule/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Schedule", tags={ "Reservation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TimeSlotResponse.class, responseContainer = "List") })
    public List<TimeSlotResponse> searchSchedule(@QueryParam("reservableId") @NotNull Long reservableId, @QueryParam("reservableType") @NotNull String reservableType, @QueryParam("startDate") @NotNull Long startDate, @QueryParam("endDate") @NotNull Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("timeBucketMins") @DefaultValue("30")Integer timeBucketMins);
}
