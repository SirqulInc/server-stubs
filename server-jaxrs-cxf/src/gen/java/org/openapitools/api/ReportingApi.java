package org.openapitools.api;

import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.SirqulResponse;

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
@Path("/report")
@Api(value = "/", description = "")
public interface ReportingApi  {

    /**
     * Create Offline Report
     *
     * Create an entry for the batch for offline report
     *
     */
    @POST
    @Path("/batch/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Offline Report", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public ReportBatchResponse createBatch(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("status") @NotNull String status, @QueryParam("previewLimit") @NotNull Integer previewLimit, @QueryParam("appKey") String appKey, @QueryParam("endpoint") String endpoint, @QueryParam("parameters") String parameters, @QueryParam("name") String name, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("description") String description, @QueryParam("pageUrl") String pageUrl);

    /**
     * Create Offline Report
     *
     * Create an entry for the batch for offline report
     *
     */
    @POST
    @Path("/region/summary/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Offline Report", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReportRegionLegSummaryBatchResponse.class) })
    public ReportRegionLegSummaryBatchResponse createRegionLegSummaryBatch(@Valid List<@Valid RegionLegSummary> body);

    /**
     * Delete Offline Report
     *
     * Deletes a batch report.
     *
     */
    @POST
    @Path("/batch/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Offline Report", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteBatch(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("batchId") @NotNull Long batchId);

    /**
     * Get Offline Report
     *
     * Checks status of batch report.
     *
     */
    @GET
    @Path("/batch/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Offline Report", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public ReportBatchResponse getReportBatch(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("batchId") @NotNull Long batchId, @QueryParam("allResults") @NotNull Boolean allResults);

    /**
     * Run Report
     *
     *  This endpoint allows you to run a set of predefined reports that can be used to understand your users&#39; behavior as well as trends within your application.
     *
     */
    @POST
    @Path("/run")
    @Produces({ "*/*" })
    @ApiOperation(value = "Run Report", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReportResponse.class) })
    public ReportResponse runReport(@QueryParam("desc") @NotNull Boolean desc, @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("parameters") String parameters, @QueryParam("order") String order, @QueryParam("start") Long start, @QueryParam("limit") Long limit, @QueryParam("responseFormat") String responseFormat);

    /**
     * Search Offline Reports
     *
     * Retrieves batches for a user..
     *
     */
    @GET
    @Path("/batch/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Offline Reports", tags={ "Reporting" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class, responseContainer = "List") })
    public List<ReportBatchResponse> searchBatch(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("names") String names, @QueryParam("appKey") String appKey, @QueryParam("status") String status, @QueryParam("globalAppSearch") Boolean globalAppSearch, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate);
}
