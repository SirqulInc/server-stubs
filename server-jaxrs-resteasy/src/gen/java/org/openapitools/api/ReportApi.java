package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ReportApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/report")


@io.swagger.annotations.Api(description = "the report API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportApi  {

    @Inject ReportApiService service;

    @POST
    @Path("/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public Response createBatch( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY" @QueryParam("status") String status, @NotNull @QueryParam("previewLimit") Integer previewLimit, @QueryParam("appKey") String appKey, @QueryParam("endpoint") String endpoint, @QueryParam("parameters") String parameters, @QueryParam("name") String name, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("description") String description, @QueryParam("pageUrl") String pageUrl,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBatch(accountId,status,previewLimit,appKey,endpoint,parameters,name,startDate,endDate,description,pageUrl,securityContext);
    }
    @POST
    @Path("/region/summary/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportRegionLegSummaryBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportRegionLegSummaryBatchResponse.class) })
    public Response createRegionLegSummaryBatch(@ApiParam(value = "" ) @Valid List<@Valid RegionLegSummary> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRegionLegSummaryBatch(body,securityContext);
    }
    @POST
    @Path("/batch/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offline Report", notes = "Deletes a batch report.", response = SirqulResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBatch( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBatch(accountId,batchId,securityContext);
    }
    @GET
    @Path("/batch/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offline Report", notes = "Checks status of batch report.", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public Response getReportBatch( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId, @NotNull @QueryParam("allResults") Boolean allResults,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getReportBatch(accountId,batchId,allResults,securityContext);
    }
    @POST
    @Path("/run")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Report", notes = " This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application.", response = ReportResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportResponse.class) })
    public Response runReport( @NotNull @QueryParam("desc") Boolean desc, @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("parameters") String parameters, @QueryParam("order") String order, @QueryParam("start") Long start, @QueryParam("limit") Long limit,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.runReport(desc,accountId,query,parameters,order,start,limit,responseFormat,securityContext);
    }
    @GET
    @Path("/batch/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offline Reports", notes = "Retrieves batches for a user..", response = ReportBatchResponse.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class, responseContainer = "List") })
    public Response searchBatch( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("names") String names, @QueryParam("appKey") String appKey,, allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY" @QueryParam("status") String status, @QueryParam("globalAppSearch") Boolean globalAppSearch, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBatch(accountId,start,limit,names,appKey,status,globalAppSearch,startDate,endDate,securityContext);
    }
}
