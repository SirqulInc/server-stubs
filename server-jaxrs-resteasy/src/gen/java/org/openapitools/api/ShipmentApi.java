package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ShipmentApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/shipment")


@io.swagger.annotations.Api(description = "the shipment API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ShipmentApi  {

    @Inject ShipmentApiService service;

    @POST
    @Path("/{id}/cancel")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cancel Shipment", notes = "Remove shipment from route", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response cancelShipment( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelShipment(id,securityContext);
    }
    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment", notes = "Create new shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response createShipment(@ApiParam(value = "" ) @Valid Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createShipment(body,securityContext);
    }
    @POST
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment Batch", notes = "Create a new shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public Response createShipmentBatch(@ApiParam(value = "" ) @Valid ShipmentBatch body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createShipmentBatch(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment", notes = "Delete an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteShipment( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteShipment(id,securityContext);
    }
    @DELETE
    @Path("/batch/{batchId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment Batch", notes = "Search for shipment batches", response = Void.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteShipmentBatch( @PathParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteShipmentBatch(batchId,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment", notes = "Get an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response getShipment( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipment(id,securityContext);
    }
    @GET
    @Path("/batch/{batchId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch", notes = "Get an existing shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public Response getShipmentBatch( @PathParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentBatch(batchId,securityContext);
    }
    @GET
    @Path("/batch/{batchId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch Status", notes = "Get the import status list of the import shipment batch", response = ShipmentImportStatus.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentImportStatus.class, responseContainer = "List") })
    public Response getShipmentBatchStatus( @PathParam("batchId") Long batchId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("valid") Boolean valid, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("hasShipment") Boolean hasShipment, @QueryParam("hasRoute") Boolean hasRoute, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentBatchStatus(batchId,accountId,sortField,descending,start,limit,valid,started,completed,hasShipment,hasRoute,keyword,securityContext);
    }
    @GET
    @Path("/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipment Batch", notes = "Search for shipment batches", response = ShipmentBatch.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class, responseContainer = "List") })
    public Response searchShipmentBatch( @NotNull @QueryParam("hubId") Long hubId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchShipmentBatch(hubId,sortField,descending,start,limit,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipments", notes = "Search for shipments", response = Shipment.class, responseContainer = "List", tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response searchShipments( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("ownerId") Long ownerId, @QueryParam("riderId") Long riderId, @QueryParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchShipments(sortField,descending,start,limit,activeOnly,ownerId,riderId,routeId,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Shipment", notes = "Update an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response updateShipment( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipment(id,body,securityContext);
    }
    @POST
    @Path("/{id}/status")
    
    
    @io.swagger.annotations.ApiOperation(value = "Uupdate Shipment Status", notes = "Update status of an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateShipmentStatus( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Map<String, Boolean> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipmentStatus(id,body,securityContext);
    }
}
