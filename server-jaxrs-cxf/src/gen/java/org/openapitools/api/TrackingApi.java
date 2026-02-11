package org.openapitools.api;

import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;

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
@Path("/tracking")
@Api(value = "/", description = "")
public interface TrackingApi  {

    /**
     * Create Batch Tracking
     *
     * Batch create tracking legs
     *
     */
    @POST
    @Path("/batch/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Batch Tracking", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Leg.class, responseContainer = "List") })
    public List<Leg> batchSaveTracking(@QueryParam("data") @NotNull String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("generateAccounts") Boolean generateAccounts, @QueryParam("updateAccountLocations") Boolean updateAccountLocations, @QueryParam("defaultTag") @DefaultValue("PASSIVE")String defaultTag, @QueryParam("slaveUID") String slaveUID);

    /**
     * Get Predicted Locations
     *
     * Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.
     *
     */
    @GET
    @Path("/predicted/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Predicted Locations", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PredictedLocationResponse.class) })
    public PredictedLocationResponse getPredictedLocations(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @QueryParam("threshold") @DefaultValue("1")Long threshold, @QueryParam("distanceUnit") @DefaultValue("MILES")String distanceUnit, @QueryParam("searchRange") @DefaultValue("0")Double searchRange, @QueryParam("sortOrder") @DefaultValue("MATCHES")String sortOrder);

    /**
     * Get Tracking Path
     *
     * Get the path (lat/long coordinates) between 2 steps previously logged for a customer.
     *
     */
    @GET
    @Path("/path/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Tracking Path", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = StepResponse.class, responseContainer = "List") })
    public List<StepResponse> getPredictedPath(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("startStepId") @NotNull Long startStepId, @QueryParam("endStepId") @NotNull Long endStepId);

    /**
     * Search Preferred Locations
     *
     * Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.
     *
     */
    @GET
    @Path("/preferred/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Preferred Locations", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PreferredLocationResponse.class, responseContainer = "List") })
    public List<PreferredLocationResponse> getPreferredLocations(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @QueryParam("sortField") @DefaultValue("PREFERRED_DATE")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("searchRange") @DefaultValue("0")Double searchRange, @QueryParam("distanceUnit") @DefaultValue("MILES")String distanceUnit);

    /**
     * Search Tracking
     *
     * Retrieve tracking data to be able to show where a user has been.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tracking", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public List<LegResponse> getTrackingLegs(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("getLastPoint") @DefaultValue("false")Boolean getLastPoint);

    /**
     * Create Tracking Leg
     *
     * Send tracking points to be able to generate pathing data
     *
     */
    @POST
    @Path("/leg/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Tracking Leg", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse saveTrackingLeg(@QueryParam("startLat") @NotNull Double startLat, @QueryParam("startLng") @NotNull Double startLng, @QueryParam("startDate") @NotNull Long startDate, @QueryParam("endLat") @NotNull Double endLat, @QueryParam("endLng") @NotNull Double endLng, @QueryParam("endDate") @NotNull Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration, @QueryParam("steps") String steps, @QueryParam("tags") String tags);

    /**
     * Create Tracking Step
     *
     * Send tracking points to be able to generate pathing data
     *
     */
    @POST
    @Path("/step/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Tracking Step", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse saveTrackingStep(@QueryParam("legId") @NotNull Long legId, @QueryParam("startLat") @NotNull Double startLat, @QueryParam("startLng") @NotNull Double startLng, @QueryParam("startDate") @NotNull Long startDate, @QueryParam("endLat") @NotNull Double endLat, @QueryParam("endLng") @NotNull Double endLng, @QueryParam("endDate") @NotNull Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration);

    /**
     * List Tracking
     *
     * Search for all accounts that have tracking legs data by the given constraints.
     *
     */
    @GET
    @Path("/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Tracking", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public List<AccountMiniResponse> searchAccountsWithTrackingLegs(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("audienceIds") String audienceIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") @DefaultValue("5")Double range, @QueryParam("sortField") @DefaultValue("LEG_START_DATE")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly);

    /**
     * Search Tracking (Billable)
     *
     * Retrieve tracking data for billable/account scoped queries.
     *
     */
    @GET
    @Path("/searchByBillable")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tracking (Billable)", tags={ "Tracking" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public List<LegResponse> searchTrackingLegs(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("100")Integer limit);
}
