package org.openapitools.api;

import org.openapitools.api.TrackingApiService;
import org.openapitools.api.factories.TrackingApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/tracking")


@io.swagger.annotations.Api(description = "the tracking API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TrackingApi  {
   private final TrackingApiService delegate;

   public TrackingApi(@Context ServletConfig servletContext) {
      TrackingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TrackingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TrackingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TrackingApiServiceFactory.getTrackingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Batch Tracking", notes = "Batch create tracking legs", response = Leg.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Leg.class, responseContainer = "List")
    })
    public Response batchSaveTracking(@ApiParam(value = "JSON array of tracking legs ```json [   \"distance\": \"0.08\",   \"duration\": \"10000\",   \"startLatitude\": \"47.614603\",   \"startLongitude\": \"-122.350518\",   \"endLatitude\": \"47.614384\",   \"endLongitude\": \"-122.349161\",   \"startDate\": \"1361924010000\",   \"endDate\": \"1361924020000\",   \"steps\": [     {       \"distance\": \"0.03\",       \"duration\": \"5000\",       \"startLat\": \"47.614603\",       \"startLng\": \"-122.350518\",       \"startDate\": \"1361924010000\",       \"endLat\": \"47.614941\",       \"endLng\": \"-122.350062\",       \"endDate\": \"1361924015000\"     },{       \"distance\": \"0.05\",       \"duration\": \"5000\",       \"startLat\": \"47.614941\",       \"startLng\": \"-122.350062\",       \"startDate\": \"1361924015000\",       \"endLat\": \"47.614384\",       \"endLng\": \"-122.349161\",       \"endDate\": \"1361924020000\"     }   ] ] ``` ", required = true) @QueryParam("data") @NotNull  String data,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Whether to generate accounts for tracking entries when the owner does not exist") @QueryParam("generateAccounts")  Boolean generateAccounts,@ApiParam(value = "Whether to update the account's current location from the incoming tracking data") @QueryParam("updateAccountLocations")  Boolean updateAccountLocations,@ApiParam(value = "The default tag to apply to incoming legs when no tag is provided", defaultValue = "PASSIVE") @DefaultValue("PASSIVE") @QueryParam("defaultTag")  String defaultTag,@ApiParam(value = "") @QueryParam("slaveUID")  String slaveUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batchSaveTracking(data, deviceId, accountId, generateAccounts, updateAccountLocations, defaultTag, slaveUID, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/predicted/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Predicted Locations", notes = "Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.", response = PredictedLocationResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PredictedLocationResponse.class)
    })
    public Response getPredictedLocations(@ApiParam(value = "The account id of the customer", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "latitude to return a more likely result set based on the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude to return a more likely result set based on the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow's date (timestamp in milliseconds). If no value is passed in, the current date will be used.") @QueryParam("dateCheck")  Long dateCheck,@ApiParam(value = "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \"8,9,10,11,17,18,19,20\".") @QueryParam("hourCheck")  String hourCheck,@ApiParam(value = "The minimum number matches in 1 hour to be considered a likely location.", defaultValue = "1") @DefaultValue("1") @QueryParam("threshold")  Long threshold,@ApiParam(value = "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}", allowableValues="MILES, KILOMETERS", defaultValue = "MILES") @DefaultValue("MILES") @QueryParam("distanceUnit")  String distanceUnit,@ApiParam(value = "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \"0\" (zero) will ignore the radius restriction.", defaultValue = "0") @DefaultValue("0") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}", allowableValues="MATCHES, DISTANCE, WEIGHTED", defaultValue = "MATCHES") @DefaultValue("MATCHES") @QueryParam("sortOrder")  String sortOrder,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPredictedLocations(accountId, latitude, longitude, dateCheck, hourCheck, threshold, distanceUnit, searchRange, sortOrder, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/path/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tracking Path", notes = "Get the path (lat/long coordinates) between 2 steps previously logged for a customer.", response = StepResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = StepResponse.class, responseContainer = "List")
    })
    public Response getPredictedPath(@ApiParam(value = "The account id of the customer", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The stepId to begin from", required = true) @QueryParam("startStepId") @NotNull  Long startStepId,@ApiParam(value = "The stepId to end with", required = true) @QueryParam("endStepId") @NotNull  Long endStepId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPredictedPath(accountId, startStepId, endStepId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/preferred/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Preferred Locations", notes = "Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.", response = PreferredLocationResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreferredLocationResponse.class, responseContainer = "List")
    })
    public Response getPreferredLocations(@ApiParam(value = "The account id of the customer", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "latitude to return a more likely result set based on the user's current location") @QueryParam("latitude")  Double latitude,@ApiParam(value = "longitude to return a more likely result set based on the user's current location") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow's date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.") @QueryParam("dateCheck")  Long dateCheck,@ApiParam(value = "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \"8,9,10,11,17,18,19,20\".") @QueryParam("hourCheck")  String hourCheck,@ApiParam(value = "Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location", defaultValue = "PREFERRED_DATE") @DefaultValue("PREFERRED_DATE") @QueryParam("sortField")  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \"0\" (zero) will ignore the radius restriction.", defaultValue = "0") @DefaultValue("0") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}", allowableValues="MILES, KILOMETERS", defaultValue = "MILES") @DefaultValue("MILES") @QueryParam("distanceUnit")  String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPreferredLocations(accountId, latitude, longitude, dateCheck, hourCheck, sortField, descending, start, limit, searchRange, distanceUnit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking", notes = "Retrieve tracking data to be able to show where a user has been.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List")
    })
    public Response getTrackingLegs(@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the account id of the person the user wants to tracking data for") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "the id of the tracking device") @QueryParam("trackingDeviceId")  String trackingDeviceId,@ApiParam(value = "the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date in (UTC milliseconds) to filter the tracking results") @QueryParam("endDate")  Long endDate,@ApiParam(value = "filter results by tag") @QueryParam("tags")  String tags,@ApiParam(value = "gets the last known location of the user", defaultValue = "false") @DefaultValue("false") @QueryParam("getLastPoint")  Boolean getLastPoint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTrackingLegs(deviceId, accountId, ownerId, trackingDeviceId, startDate, endDate, tags, getLastPoint, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/leg/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Leg", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response saveTrackingLeg(@ApiParam(value = "the latitude of the first point", required = true) @QueryParam("startLat") @NotNull  Double startLat,@ApiParam(value = "the longitude of the first point", required = true) @QueryParam("startLng") @NotNull  Double startLng,@ApiParam(value = "the start date (in UTC milliseconds) of the first point", required = true) @QueryParam("startDate") @NotNull  Long startDate,@ApiParam(value = "the latitude of the last point", required = true) @QueryParam("endLat") @NotNull  Double endLat,@ApiParam(value = "the longitude of the last point", required = true) @QueryParam("endLng") @NotNull  Double endLng,@ApiParam(value = "the end date (in UTC milliseconds) of the last point", required = true) @QueryParam("endDate") @NotNull  Long endDate,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the total distance") @QueryParam("distance")  Double distance,@ApiParam(value = "the total duration") @QueryParam("duration")  Long duration,@ApiParam(value = "JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. ```json [{   \"distance\": \"0.03\",   \"duration\": \"5000\",   \"startLat\": \"47.614603\",   \"startLng\": \"-122.350518\",   \"startDate\": \"1361924010000\",   \"endLat\": \"47.614941\",   \"endLng\": \"-122.350062\",   \"endDate\": \"1361924015000\" }] ``` ") @QueryParam("steps")  String steps,@ApiParam(value = "name the leg for searching") @QueryParam("tags")  String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveTrackingLeg(startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration, steps, tags, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/step/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Step", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response saveTrackingStep(@ApiParam(value = "the leg to add the step to", required = true) @QueryParam("legId") @NotNull  Long legId,@ApiParam(value = "the latitude of the first point", required = true) @QueryParam("startLat") @NotNull  Double startLat,@ApiParam(value = "the longitude of the first point", required = true) @QueryParam("startLng") @NotNull  Double startLng,@ApiParam(value = "the start date (in UTC milliseconds) of the first point", required = true) @QueryParam("startDate") @NotNull  Long startDate,@ApiParam(value = "the latitude of the last point", required = true) @QueryParam("endLat") @NotNull  Double endLat,@ApiParam(value = "the longitude of the last point", required = true) @QueryParam("endLng") @NotNull  Double endLng,@ApiParam(value = "the end date (in UTC milliseconds) of the last point", required = true) @QueryParam("endDate") @NotNull  Long endDate,@ApiParam(value = "the device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the total distance") @QueryParam("distance")  Double distance,@ApiParam(value = "the total duration") @QueryParam("duration")  Long duration,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveTrackingStep(legId, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Tracking", notes = "Search for all accounts that have tracking legs data by the given constraints.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List")
    })
    public Response searchAccountsWithTrackingLegs(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Used for LIKE search of first or last name on the acocunt") @QueryParam("keyword")  String keyword,@ApiParam(value = "Range to begin in UTC milliseconds") @QueryParam("startDate")  Long startDate,@ApiParam(value = "Range to end in UTC milliseconds") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Exact match on tag field of Legs's searchTag") @QueryParam("tags")  String tags,@ApiParam(value = "") @QueryParam("audienceIds")  String audienceIds,@ApiParam(value = "Origin latitude to perform searching constraints with given range") @QueryParam("latitude")  Double latitude,@ApiParam(value = "Origin longitude to perform searching constraints with given range") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The radius, in miles, to perform the search for", defaultValue = "5") @DefaultValue("5") @QueryParam("range")  Double range,@ApiParam(value = "The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}", defaultValue = "LEG_START_DATE") @DefaultValue("LEG_START_DATE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the results. Default is false, which will return the results in ascending order.", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The index into the record set to start with. Default is 0.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of records to return. Default is 20.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active results. Default is false.", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchAccountsWithTrackingLegs(accountId, keyword, startDate, endDate, tags, audienceIds, latitude, longitude, range, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/searchByBillable")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking (Billable)", notes = "Retrieve tracking data for billable/account scoped queries.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List")
    })
    public Response searchTrackingLegs(@ApiParam(value = "The account id to search tracking for", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The id of the tracking device") @QueryParam("trackingDeviceId")  String trackingDeviceId,@ApiParam(value = "The start date in (UTC milliseconds) to filter the tracking results") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The end date in (UTC milliseconds) to filter the tracking results") @QueryParam("endDate")  Long endDate,@ApiParam(value = "Filter results by tag") @QueryParam("tags")  String tags,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTrackingLegs(accountId, appKey, trackingDeviceId, startDate, endDate, tags, start, limit, securityContext);
    }
}
