package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CsvimportApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CsvImportResponse;
import java.io.File;
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

@Path("/csvimport")


@io.swagger.annotations.Api(description = "the csvimport API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CsvimportApi  {

    @Inject CsvimportApiService service;

    @GET
    @Path("/batch/status/details")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detail Status", notes = "", response = SirqulResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getStatusCSV( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId, @NotNull, allowableValues="SUMMARY, DETAILS, ERRORS, ALL" @QueryParam("responseGroup") String responseGroup, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStatusCSV(accountId,batchId,responseGroup,start,limit,securityContext);
    }
    @GET
    @Path("/batch/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Status", notes = "Retrieves batches for a user.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response listStatusCSV( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listStatusCSV(accountId,start,limit,securityContext);
    }
    @GET
    @Path("/batch/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Status", notes = "Checks status of batch upload.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response statusCSV( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.statusCSV(accountId,batchId,securityContext);
    }
    @POST
    @Path("/upload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Upload CSV", notes = "Uploads a CSV import file.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response uploadCSV( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, FILTERS" @QueryParam("uploadType") String uploadType, @NotNull @QueryParam("importFile") File importFile, @NotNull, allowableValues="EXCEL, MYSQL, RFC4180, TDF" @QueryParam("fileFormat") String fileFormat, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadCSV(accountId,uploadType,importFile,fileFormat,appKey,securityContext);
    }
}
