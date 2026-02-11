package org.openapitools.api;

import org.openapitools.model.CsvImportResponse;
import java.io.File;
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
@Path("/csvimport")
@Api(value = "/", description = "")
public interface CsvImportApi  {

    /**
     * Detail Status
     *
     */
    @GET
    @Path("/batch/status/details")
    @Produces({ "*/*" })
    @ApiOperation(value = "Detail Status", tags={ "CSV Import" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getStatusCSV(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("batchId") @NotNull Long batchId, @QueryParam("responseGroup") @NotNull String responseGroup, @QueryParam("start") @NotNull Long start, @QueryParam("limit") @NotNull Long limit);

    /**
     * Search Status
     *
     * Retrieves batches for a user.
     *
     */
    @GET
    @Path("/batch/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Status", tags={ "CSV Import" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public CsvImportResponse listStatusCSV(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit);

    /**
     * Batch Status
     *
     * Checks status of batch upload.
     *
     */
    @GET
    @Path("/batch/status")
    @Produces({ "*/*" })
    @ApiOperation(value = "Batch Status", tags={ "CSV Import" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public CsvImportResponse statusCSV(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("batchId") @NotNull Long batchId);

    /**
     * Upload CSV
     *
     * Uploads a CSV import file.
     *
     */
    @POST
    @Path("/upload")
    @Produces({ "*/*" })
    @ApiOperation(value = "Upload CSV", tags={ "CSV Import" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public CsvImportResponse uploadCSV(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("uploadType") @NotNull String uploadType, @QueryParam("importFile") @NotNull File importFile, @QueryParam("fileFormat") @NotNull String fileFormat, @QueryParam("appKey") String appKey);
}
