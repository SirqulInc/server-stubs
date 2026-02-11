package org.openapitools.api;

import org.openapitools.model.ChartData;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserActivityResponse;

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
@Path("/analytics")
@Api(value = "/", description = "")
public interface AnalyticsApi  {

    /**
     * Get User Activity
     *
     * Get an activity feed by user.
     *
     */
    @GET
    @Path("/useractivity")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get User Activity", tags={ "Analytics" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserActivityResponse.class, responseContainer = "List") })
    public List<UserActivityResponse> activities(@QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Aggregated Filtered Usage
     *
     * Query analytics to get data used for nested graphs and charts
     *
     */
    @GET
    @Path("/aggregatedFilteredUsage")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Aggregated Filtered Usage", tags={ "Analytics" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public ChartData aggregatedFilteredUsage(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername, @QueryParam("groupByRoot") String groupByRoot, @QueryParam("groupBy") String groupBy, @QueryParam("distinctCount") String distinctCount, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown, @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Get Filtered Usage
     *
     * Query analytics to get data used for graphs and charts
     *
     */
    @GET
    @Path("/filteredUsage")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Filtered Usage", tags={ "Analytics" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public ChartData filteredUsage(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2, @QueryParam("groupBy") String groupBy, @QueryParam("distinctCount") String distinctCount, @QueryParam("sumColumn") String sumColumn, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown, @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Create Usage Record
     *
     * Record an analytic record for a known state within the application.
     *
     */
    @POST
    @Path("/usage")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Usage Record", tags={ "Analytics" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse usage(@QueryParam("tag") @NotNull String tag, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("device") String device, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("achievementIncrement") Long achievementIncrement, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("country") String country, @QueryParam("zip") String zip, @QueryParam("locationDescription") String locationDescription, @QueryParam("clientTime") Long clientTime, @QueryParam("errorMessage") String errorMessage, @QueryParam("ip") String ip, @QueryParam("userAgent") String userAgent, @QueryParam("backgroundEvent") Boolean backgroundEvent, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2);

    /**
     * Create Multiple Usage Records
     *
     * Sends multiple analytics. Can be used to send in the user&#39;s stored usage when they did not have internet access. Should not include more than 100 items per batch.
     *
     */
    @POST
    @Path("/usage/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Multiple Usage Records", tags={ "Analytics" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse usageBatch(@QueryParam("appKey") @NotNull String appKey, @QueryParam("device") @NotNull String device, @QueryParam("data") @NotNull String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("updateRanking") Boolean updateRanking, @QueryParam("returnSummaryResponse") Boolean returnSummaryResponse);
}
