package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

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
@Path("/api/{version}/trigger")
@Api(value = "/", description = "")
public interface TriggerApi  {

    /**
     * Create Trigger
     *
     * Create a trigger
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Trigger", tags={ "Trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public TriggerResponse createTrigger(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("visibility") String visibility, @QueryParam("active") @DefaultValue("true")Boolean active);

    /**
     * Delete Trigger
     *
     * Mark a trigger as deleted.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Trigger", tags={ "Trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteTrigger(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("triggerId") @NotNull Long triggerId);

    /**
     * Get Trigger
     *
     * Get a trigger
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Trigger", tags={ "Trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public TriggerResponse getTrigger(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("triggerId") @NotNull Long triggerId);

    /**
     * Search Triggers
     *
     * Search for triggers
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Triggers", tags={ "Trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class, responseContainer = "List") })
    public List<TriggerResponse> searchTriggers(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("groupingId") String groupingId, @QueryParam("filter") @DefaultValue("MINE")String filter, @QueryParam("statuses") @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING")String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("CREATED")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly);

    /**
     * Update Trigger
     *
     * Update a trigger
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Trigger", tags={ "Trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public TriggerResponse updateTrigger(@PathParam("version") BigDecimal version, @QueryParam("triggerId") @NotNull Long triggerId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active);
}
