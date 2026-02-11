package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.VehicleApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;

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

@Path("/vehicle")


@io.swagger.annotations.Api(description = "the vehicle API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleApi  {

    @Inject VehicleApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle", notes = "Create new vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response createVehicle( @NotNull @QueryParam("vehicle") String vehicle,@ApiParam(value = "" ) @Valid Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVehicle(vehicle,body,securityContext);
    }
    @POST
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle Type", notes = "Create a new vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response createVehicleType( @NotNull @QueryParam("vehicleType") String vehicleType,@ApiParam(value = "" ) @Valid VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVehicleType(vehicleType,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle", notes = "Delete an existing vehicle", response = Void.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVehicle( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVehicle(id,securityContext);
    }
    @DELETE
    @Path("/type/{vehicleTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle Type", notes = "Delete a vehicle type", response = Void.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVehicleType( @PathParam("vehicleTypeId") Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVehicleType(vehicleTypeId,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle", notes = "Get an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response getVehicle( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVehicle(id,securityContext);
    }
    @GET
    @Path("/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle Type", notes = "Get a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response getVehicleType( @PathParam("vehicleTypeId") Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVehicleType(vehicleTypeId,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle", notes = "Search for vehicles", response = Vehicle.class, responseContainer = "List", tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class, responseContainer = "List") })
    public Response searchVehicle( @NotNull @QueryParam("hubId") Long hubId, @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchVehicle(hubId,sortField,descending,start,limit,activeOnly,keyword,securityContext);
    }
    @GET
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle Type", notes = "Search for types of vehicles", response = VehicleType.class, responseContainer = "List", tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class, responseContainer = "List") })
    public Response searchVehicleTypes( @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchVehicleTypes(sortField,descending,start,limit,activeOnly,retailerId,hubId,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle", notes = "Update an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response updateVehicle( @PathParam("id") Long id, @NotNull @QueryParam("vehicle") String vehicle,@ApiParam(value = "" ) @Valid Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVehicle(id,vehicle,body,securityContext);
    }
    @PUT
    @Path("/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle Type", notes = "Update a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response updateVehicleType( @PathParam("vehicleTypeId") Long vehicleTypeId, @NotNull @QueryParam("vehicleType") String vehicleType,@ApiParam(value = "" ) @Valid VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVehicleType(vehicleTypeId,vehicleType,body,securityContext);
    }
}
