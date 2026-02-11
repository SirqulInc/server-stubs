package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AnalyticsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ChartData;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserActivityResponse;

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

@Path("/analytics")


@io.swagger.annotations.Api(description = "the analytics API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AnalyticsApi  {

    @Inject AnalyticsApiService service;

    @GET
    @Path("/useractivity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get User Activity", notes = "Get an activity feed by user.", response = UserActivityResponse.class, responseContainer = "List", tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserActivityResponse.class, responseContainer = "List") })
    public Response activities( @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.activities(start,limit,accountId,securityContext);
    }
    @GET
    @Path("/aggregatedFilteredUsage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Aggregated Filtered Usage", notes = "Query analytics to get data used for nested graphs and charts", response = ChartData.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public Response aggregatedFilteredUsage( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupByRoot") String groupByRoot,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupBy") String groupBy,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("distinctCount") String distinctCount,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aggregatedFilteredUsage(deviceId,accountId,applicationId,appKey,startDate,endDate,deviceType,device,deviceOS,gender,ageGroup,country,state,city,zip,model,tag,userAccountId,userAccountDisplay,userAccountUsername,groupByRoot,groupBy,distinctCount,sortField,descending,hideUnknown,responseFormat,l,limit,latitude,longitude,securityContext);
    }
    @GET
    @Path("/filteredUsage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Filtered Usage", notes = "Query analytics to get data used for graphs and charts", response = ChartData.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public Response filteredUsage( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupBy") String groupBy,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("distinctCount") String distinctCount,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sumColumn") String sumColumn,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.filteredUsage(deviceId,accountId,applicationId,appKey,startDate,endDate,deviceType,device,deviceOS,gender,ageGroup,country,state,city,zip,model,tag,userAccountId,userAccountDisplay,userAccountUsername,customId,customType,customValue,customValue2,customLong,customLong2,customMessage,customMessage2,groupBy,distinctCount,sumColumn,sortField,descending,hideUnknown,responseFormat,l,limit,latitude,longitude,securityContext);
    }
    @POST
    @Path("/usage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Usage Record", notes = "Record an analytic record for a known state within the application.", response = SirqulResponse.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response usage( @NotNull @QueryParam("tag") String tag, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("device") String device, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("achievementIncrement") Long achievementIncrement, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("country") String country, @QueryParam("zip") String zip, @QueryParam("locationDescription") String locationDescription, @QueryParam("clientTime") Long clientTime, @QueryParam("errorMessage") String errorMessage, @QueryParam("ip") String ip, @QueryParam("userAgent") String userAgent, @QueryParam("backgroundEvent") Boolean backgroundEvent, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.usage(tag,deviceId,accountId,applicationId,appKey,appVersion,device,deviceType,deviceOS,model,latitude,longitude,customId,customType,achievementIncrement,city,state,country,zip,locationDescription,clientTime,errorMessage,ip,userAgent,backgroundEvent,customMessage,customMessage2,customValue,customValue2,customLong,customLong2,securityContext);
    }
    @POST
    @Path("/usage/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Multiple Usage Records", notes = "Sends multiple analytics. Can be used to send in the user's stored usage when they did not have internet access. Should not include more than 100 items per batch.", response = SirqulResponse.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response usageBatch( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("device") String device, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("updateRanking") Boolean updateRanking, @QueryParam("returnSummaryResponse") Boolean returnSummaryResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.usageBatch(appKey,device,data,deviceId,accountId,appVersion,deviceType,deviceOS,model,updateRanking,returnSummaryResponse,securityContext);
    }
}
