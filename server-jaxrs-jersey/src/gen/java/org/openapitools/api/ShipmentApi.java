package org.openapitools.api;

import org.openapitools.api.ShipmentApiService;
import org.openapitools.api.factories.ShipmentApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.Map;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;

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

@Path("/shipment")


@io.swagger.annotations.Api(description = "the shipment API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentApi  {
   private final ShipmentApiService delegate;

   public ShipmentApi(@Context ServletConfig servletContext) {
      ShipmentApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ShipmentApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ShipmentApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ShipmentApiServiceFactory.getShipmentApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{id}/cancel")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cancel Shipment", notes = "Remove shipment from route", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response cancelShipment(@ApiParam(value = "the id of the shipment to cancel", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelShipment(id, securityContext);
    }
    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment", notes = "Create new shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class)
    })
    public Response createShipment(@ApiParam(value = "") @Valid  Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createShipment(body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment Batch", notes = "Create a new shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class)
    })
    public Response createShipmentBatch(@ApiParam(value = "") @Valid  ShipmentBatch body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createShipmentBatch(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment", notes = "Delete an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteShipment(@ApiParam(value = "the id of the shipment to delete", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteShipment(id, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/batch/{batchId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment Batch", notes = "Search for shipment batches", response = Void.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteShipmentBatch(@ApiParam(value = "the id of the shipment batch to delete", required = true) @PathParam("batchId") @NotNull  Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteShipmentBatch(batchId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment", notes = "Get an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class)
    })
    public Response getShipment(@ApiParam(value = "the id of the shipment to get", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getShipment(id, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/{batchId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch", notes = "Get an existing shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class)
    })
    public Response getShipmentBatch(@ApiParam(value = "the id of the shipment batch to get", required = true) @PathParam("batchId") @NotNull  Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getShipmentBatch(batchId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch/{batchId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch Status", notes = "Get the import status list of the import shipment batch", response = ShipmentImportStatus.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentImportStatus.class, responseContainer = "List")
    })
    public Response getShipmentBatchStatus(@ApiParam(value = "The id of the requested shipment batch", required = true) @PathParam("batchId") @NotNull  Long batchId,@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Valid import status only or not") @QueryParam("valid")  Boolean valid,@ApiParam(value = "Started import status only") @QueryParam("started")  Boolean started,@ApiParam(value = "Completed import status only") @QueryParam("completed")  Boolean completed,@ApiParam(value = "Has shipment associate to the status") @QueryParam("hasShipment")  Boolean hasShipment,@ApiParam(value = "Has route associate to the status") @QueryParam("hasRoute")  Boolean hasRoute,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getShipmentBatchStatus(batchId, accountId, sortField, descending, start, limit, valid, started, completed, hasShipment, hasRoute, keyword, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipment Batch", notes = "Search for shipment batches", response = ShipmentBatch.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class, responseContainer = "List")
    })
    public Response searchShipmentBatch(@ApiParam(value = "The associated service hub", required = true) @QueryParam("hubId") @NotNull  Long hubId,@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchShipmentBatch(hubId, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipments", notes = "Search for shipments", response = Shipment.class, responseContainer = "List", tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List")
    })
    public Response searchShipments(@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The owner of the shipment") @QueryParam("ownerId")  Long ownerId,@ApiParam(value = "The rider associate to this shipment") @QueryParam("riderId")  Long riderId,@ApiParam(value = "The route associate to this shipment") @QueryParam("routeId")  Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchShipments(sortField, descending, start, limit, activeOnly, ownerId, riderId, routeId, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Shipment", notes = "Update an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class)
    })
    public Response updateShipment(@ApiParam(value = "the id of the shipment to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateShipment(id, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}/status")
    
    
    @io.swagger.annotations.ApiOperation(value = "Uupdate Shipment Status", notes = "Update status of an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response updateShipmentStatus(@ApiParam(value = "the id of the shipment to update status", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "")  Map<String, Boolean> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateShipmentStatus(id, body, securityContext);
    }
}
