package org.openapitools.api;

import org.openapitools.api.ReportApiService;
import org.openapitools.api.factories.ReportApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/report")


@io.swagger.annotations.Api(description = "the report API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReportApi  {
   private final ReportApiService delegate;

   public ReportApi(@Context ServletConfig servletContext) {
      ReportApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReportApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReportApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ReportApiServiceFactory.getReportApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class)
    })
    public Response createBatch(@ApiParam(value = "The account id of the user for passing account related params", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the status of the report", required = true, allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY") @QueryParam("status") @NotNull  String status,@ApiParam(value = "the limit on how much you can preview of the batch report", required = true) @QueryParam("previewLimit") @NotNull  Integer previewLimit,@ApiParam(value = "The application key for passing application related params") @QueryParam("appKey")  String appKey,@ApiParam(value = "") @QueryParam("endpoint")  String endpoint,@ApiParam(value = "a json structure list of the parameter values, example: ```json {   \"string\":\"value\",    \"number\":3.345,   \"date\":\"2014-05-01 00:00:00\" } ``` ") @QueryParam("parameters")  String parameters,@ApiParam(value = "name of the batch report") @QueryParam("name")  String name,@ApiParam(value = "the start date of the batch report") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date of the batch report") @QueryParam("endDate")  Long endDate,@ApiParam(value = "the description of the batch report") @QueryParam("description")  String description,@ApiParam(value = "") @QueryParam("pageUrl")  String pageUrl,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createBatch(accountId, status, previewLimit, appKey, endpoint, parameters, name, startDate, endDate, description, pageUrl, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/region/summary/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportRegionLegSummaryBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportRegionLegSummaryBatchResponse.class)
    })
    public Response createRegionLegSummaryBatch(@ApiParam(value = "") @Valid  List<@Valid RegionLegSummary> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRegionLegSummaryBatch(body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/batch/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offline Report", notes = "Deletes a batch report.", response = SirqulResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteBatch(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the batch to delete", required = true) @QueryParam("batchId") @NotNull  Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBatch(accountId, batchId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offline Report", notes = "Checks status of batch report.", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class)
    })
    public Response getReportBatch(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "returned by /report/batch/create", required = true) @QueryParam("batchId") @NotNull  Long batchId,@ApiParam(value = "whether to return all batch results or not", required = true) @QueryParam("allResults") @NotNull  Boolean allResults,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getReportBatch(accountId, batchId, allResults, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/run")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Report", notes = " This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application.", response = ReportResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportResponse.class)
    })
    public Response runReport(@ApiParam(value = "If true then descending order, false is ascending", required = true) @QueryParam("desc") @NotNull  Boolean desc,@ApiParam(value = "The account id of the user for passing account related params") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The named identifier of the query") @QueryParam("query")  String query,@ApiParam(value = "Parameter values used in the query in JSON format, example: ```json {   \"string\":\"value\",    \"number\":3.345,   \"date\":\"2014-05-01 00:00:00\" } ``` ") @QueryParam("parameters")  String parameters,@ApiParam(value = "The order to use, must be a column name (see response results for list of column names)") @QueryParam("order")  String order,@ApiParam(value = "The start of the pagination") @QueryParam("start")  Long start,@ApiParam(value = "The limit of the pagination") @QueryParam("limit")  Long limit,@ApiParam(value = "Determines what response format to return. Options are: JSON or CSV", allowableValues="HTML, XML, JSON, CSV") @QueryParam("responseFormat")  String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.runReport(desc, accountId, query, parameters, order, start, limit, responseFormat, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offline Reports", notes = "Retrieves batches for a user..", response = ReportBatchResponse.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class, responseContainer = "List")
    })
    public Response searchBatch(@ApiParam(value = "the id of the account logged in", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the start of the index and/or pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit of the index and/or pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the names of the report batch to search on") @QueryParam("names")  String names,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the report batch status", allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY") @QueryParam("status")  String status,@ApiParam(value = "the global app to search on") @QueryParam("globalAppSearch")  Boolean globalAppSearch,@ApiParam(value = "the start date of the report batch to search on") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date of the report batch to search on") @QueryParam("endDate")  Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchBatch(accountId, start, limit, names, appKey, status, globalAppSearch, startDate, endDate, securityContext);
    }
}
