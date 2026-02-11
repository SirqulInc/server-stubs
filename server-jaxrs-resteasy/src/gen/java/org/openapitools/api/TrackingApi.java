package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TrackingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;

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

@Path("/tracking")


@io.swagger.annotations.Api(description = "the tracking API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrackingApi  {

    @Inject TrackingApiService service;

    @POST
    @Path("/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Batch Tracking", notes = "Batch create tracking legs", response = Leg.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Leg.class, responseContainer = "List") })
    public Response batchSaveTracking( @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("generateAccounts") Boolean generateAccounts, @QueryParam("updateAccountLocations") Boolean updateAccountLocations, @DefaultValue("PASSIVE") @QueryParam("defaultTag") String defaultTag, @QueryParam("slaveUID") String slaveUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchSaveTracking(data,deviceId,accountId,generateAccounts,updateAccountLocations,defaultTag,slaveUID,securityContext);
    }
    @GET
    @Path("/predicted/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Predicted Locations", notes = "Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.", response = PredictedLocationResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PredictedLocationResponse.class) })
    public Response getPredictedLocations( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @DefaultValue("1") @QueryParam("threshold") Long threshold,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit, @DefaultValue("0") @QueryParam("searchRange") Double searchRange,, allowableValues="MATCHES, DISTANCE, WEIGHTED" @DefaultValue("MATCHES") @QueryParam("sortOrder") String sortOrder,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPredictedLocations(accountId,latitude,longitude,dateCheck,hourCheck,threshold,distanceUnit,searchRange,sortOrder,securityContext);
    }
    @GET
    @Path("/path/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tracking Path", notes = "Get the path (lat/long coordinates) between 2 steps previously logged for a customer.", response = StepResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = StepResponse.class, responseContainer = "List") })
    public Response getPredictedPath( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("startStepId") Long startStepId, @NotNull @QueryParam("endStepId") Long endStepId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPredictedPath(accountId,startStepId,endStepId,securityContext);
    }
    @GET
    @Path("/preferred/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Preferred Locations", notes = "Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.", response = PreferredLocationResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreferredLocationResponse.class, responseContainer = "List") })
    public Response getPreferredLocations( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @DefaultValue("PREFERRED_DATE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("0") @QueryParam("searchRange") Double searchRange,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPreferredLocations(accountId,latitude,longitude,dateCheck,hourCheck,sortField,descending,start,limit,searchRange,distanceUnit,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking", notes = "Retrieve tracking data to be able to show where a user has been.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public Response getTrackingLegs( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @DefaultValue("false") @QueryParam("getLastPoint") Boolean getLastPoint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrackingLegs(deviceId,accountId,ownerId,trackingDeviceId,startDate,endDate,tags,getLastPoint,securityContext);
    }
    @POST
    @Path("/leg/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Leg", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response saveTrackingLeg( @NotNull @QueryParam("startLat") Double startLat, @NotNull @QueryParam("startLng") Double startLng, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endLat") Double endLat, @NotNull @QueryParam("endLng") Double endLng, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration, @QueryParam("steps") String steps, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTrackingLeg(startLat,startLng,startDate,endLat,endLng,endDate,deviceId,accountId,distance,duration,steps,tags,securityContext);
    }
    @POST
    @Path("/step/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Step", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response saveTrackingStep( @NotNull @QueryParam("legId") Long legId, @NotNull @QueryParam("startLat") Double startLat, @NotNull @QueryParam("startLng") Double startLng, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endLat") Double endLat, @NotNull @QueryParam("endLng") Double endLng, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTrackingStep(legId,startLat,startLng,startDate,endLat,endLng,endDate,deviceId,accountId,distance,duration,securityContext);
    }
    @GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Tracking", notes = "Search for all accounts that have tracking legs data by the given constraints.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public Response searchAccountsWithTrackingLegs( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("audienceIds") String audienceIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("range") Double range, @DefaultValue("LEG_START_DATE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAccountsWithTrackingLegs(accountId,keyword,startDate,endDate,tags,audienceIds,latitude,longitude,range,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/searchByBillable")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking (Billable)", notes = "Retrieve tracking data for billable/account scoped queries.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public Response searchTrackingLegs( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTrackingLegs(accountId,appKey,trackingDeviceId,startDate,endDate,tags,start,limit,securityContext);
    }
}
