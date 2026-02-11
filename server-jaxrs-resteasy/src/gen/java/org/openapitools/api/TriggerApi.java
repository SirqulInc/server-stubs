package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TriggerApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

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

@Path("/trigger")


@io.swagger.annotations.Api(description = "the trigger API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TriggerApi  {

    @Inject TriggerApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trigger", notes = "Create a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response createTrigger( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @DefaultValue("true") @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTrigger(accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,conditionalInput,visibility,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Trigger", notes = "Mark a trigger as deleted.", response = SirqulResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTrigger( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("triggerId") Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTrigger(accountId,triggerId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trigger", notes = "Get a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response getTrigger( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("triggerId") Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrigger(accountId,triggerId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Triggers", notes = "Search for triggers", response = TriggerResponse.class, responseContainer = "List", tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class, responseContainer = "List") })
    public Response searchTriggers( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @DefaultValue("MINE") @QueryParam("filter") String filter, @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTriggers(accountId,groupingId,filter,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trigger", notes = "Update a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response updateTrigger( @NotNull @QueryParam("triggerId") Long triggerId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTrigger(triggerId,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,conditionalInput,visibility,active,securityContext);
    }
}
