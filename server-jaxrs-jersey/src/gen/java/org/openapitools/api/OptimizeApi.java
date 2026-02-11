package org.openapitools.api;

import org.openapitools.api.OptimizeApiService;
import org.openapitools.api.factories.OptimizeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ImportStatuses;
import java.util.Map;
import org.openapitools.model.Orders;
import org.openapitools.model.ShipmentOrder;

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

@Path("/optimize")


@io.swagger.annotations.Api(description = "the optimize API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OptimizeApi  {
   private final OptimizeApiService delegate;

   public OptimizeApi(@Context ServletConfig servletContext) {
      OptimizeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OptimizeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OptimizeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OptimizeApiServiceFactory.getOptimizeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/result/{batchID}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Optimization Result", notes = "Get the results of the import batch.", response = ShipmentOrder.class, responseContainer = "Map", tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentOrder.class, responseContainer = "Map")
    })
    public Response getOptimizationResult(@ApiParam(value = "The batchID for getting the import status of.", required = true) @PathParam("batchID") @NotNull  String batchID,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOptimizationResult(batchID, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Optimization", notes = "Request and upload of shipment orders and create ShipmentImportBatch for optimization.", response = ImportStatuses.class, tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ImportStatuses.class)
    })
    public Response requestOptimization(@ApiParam(value = "") @Valid  Orders body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.requestOptimization(body, securityContext);
    }
}
