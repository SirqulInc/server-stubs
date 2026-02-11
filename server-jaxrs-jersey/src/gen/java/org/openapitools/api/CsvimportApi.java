package org.openapitools.api;

import org.openapitools.api.CsvimportApiService;
import org.openapitools.api.factories.CsvimportApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CsvImportResponse;
import java.io.File;
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

@Path("/csvimport")


@io.swagger.annotations.Api(description = "the csvimport API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CsvimportApi  {
   private final CsvimportApiService delegate;

   public CsvimportApi(@Context ServletConfig servletContext) {
      CsvimportApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CsvimportApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CsvimportApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CsvimportApiServiceFactory.getCsvimportApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/batch/status/details")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detail Status", notes = "", response = SirqulResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getStatusCSV(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the batch", required = true) @QueryParam("batchId") @NotNull  Long batchId,@ApiParam(value = "The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL", required = true, allowableValues="SUMMARY, DETAILS, ERRORS, ALL") @QueryParam("responseGroup") @NotNull  String responseGroup,@ApiParam(value = "the start of the pagination", required = true) @QueryParam("start") @NotNull  Long start,@ApiParam(value = "the limit of the pagination", required = true) @QueryParam("limit") @NotNull  Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStatusCSV(accountId, batchId, responseGroup, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Status", notes = "Retrieves batches for a user.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class)
    })
    public Response listStatusCSV(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the start of the pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit of the pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listStatusCSV(accountId, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Status", notes = "Checks status of batch upload.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class)
    })
    public Response statusCSV(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the batch to get its status", required = true) @QueryParam("batchId") @NotNull  Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.statusCSV(accountId, batchId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/upload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Upload CSV", notes = "Uploads a CSV import file.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class)
    })
    public Response uploadCSV(@ApiParam(value = "the id of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS", required = true, allowableValues="OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, FILTERS") @QueryParam("uploadType") @NotNull  String uploadType,@ApiParam(value = "the import file to reference", required = true) @QueryParam("importFile") @NotNull  File importFile,@ApiParam(value = "the format of the file", required = true, allowableValues="EXCEL, MYSQL, RFC4180, TDF") @QueryParam("fileFormat") @NotNull  String fileFormat,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.uploadCSV(accountId, uploadType, importFile, fileFormat, appKey, securityContext);
    }
}
