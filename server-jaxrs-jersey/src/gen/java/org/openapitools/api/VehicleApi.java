package org.openapitools.api;

import org.openapitools.api.VehicleApiService;
import org.openapitools.api.factories.VehicleApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;

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

@Path("/vehicle")


@io.swagger.annotations.Api(description = "the vehicle API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class VehicleApi  {
   private final VehicleApiService delegate;

   public VehicleApi(@Context ServletConfig servletContext) {
      VehicleApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VehicleApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VehicleApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = VehicleApiServiceFactory.getVehicleApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle", notes = "Create new vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class)
    })
    public Response createVehicle(@ApiParam(value = "A JSON representation of cargo type. ```json {   \"name\": \"Truck\",   \"vehicleType\": { \"id\": 1 },   \"hub\": { \"id\": 1 } } ``` ", required = true) @QueryParam("vehicle") @NotNull  String vehicle,@ApiParam(value = "") @Valid  Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVehicle(vehicle, body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle Type", notes = "Create a new vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class)
    })
    public Response createVehicleType(@ApiParam(value = "A JSON representation of cargo type. ```json {   \"name\": \"Truck\",   \"width\": 100,   \"height\": 200,   \"depth\": 200,   \"maxWeight\": 5000,   \"hub\": { \"id\": 1 } } ``` ", required = true) @QueryParam("vehicleType") @NotNull  String vehicleType,@ApiParam(value = "") @Valid  VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVehicleType(vehicleType, body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle", notes = "Delete an existing vehicle", response = Void.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteVehicle(@ApiParam(value = "The id of the vehicle to delete", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVehicle(id, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/type/{vehicleTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle Type", notes = "Delete a vehicle type", response = Void.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteVehicleType(@ApiParam(value = "The id of the requested vehicle type", required = true) @PathParam("vehicleTypeId") @NotNull  Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVehicleType(vehicleTypeId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle", notes = "Get an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class)
    })
    public Response getVehicle(@ApiParam(value = "The id of the vehicle requested", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicle(id, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle Type", notes = "Get a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class)
    })
    public Response getVehicleType(@ApiParam(value = "The id of the requested vehicle type", required = true) @PathParam("vehicleTypeId") @NotNull  Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVehicleType(vehicleTypeId, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle", notes = "Search for vehicles", response = Vehicle.class, responseContainer = "List", tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class, responseContainer = "List")
    })
    public Response searchVehicle(@ApiParam(value = "Filter by service hub", required = true) @QueryParam("hubId") @NotNull  Long hubId,@ApiParam(value = "The field to sort by", required = true, defaultValue = "id") @DefaultValue("id") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true, defaultValue = "20") @DefaultValue("20") @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true, defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchVehicle(hubId, sortField, descending, start, limit, activeOnly, keyword, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle Type", notes = "Search for types of vehicles", response = VehicleType.class, responseContainer = "List", tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class, responseContainer = "List")
    })
    public Response searchVehicleTypes(@ApiParam(value = "The field to sort by", required = true, defaultValue = "id") @DefaultValue("id") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true, defaultValue = "false") @DefaultValue("false") @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true, defaultValue = "0") @DefaultValue("0") @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true, defaultValue = "20") @DefaultValue("20") @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true, defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "Filter by retailer") @QueryParam("retailerId")  Long retailerId,@ApiParam(value = "Filter by service hub") @QueryParam("hubId")  Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchVehicleTypes(sortField, descending, start, limit, activeOnly, retailerId, hubId, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle", notes = "Update an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class)
    })
    public Response updateVehicle(@ApiParam(value = "The id of the vehicle to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "A JSON representation of cargo type, for example: ```json {   \"name\": \"Truck\",   \"vehicleType\": { \"id\": 1 },   \"hub\": { \"id\": 1 } } ``` ", required = true) @QueryParam("vehicle") @NotNull  String vehicle,@ApiParam(value = "") @Valid  Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVehicle(id, vehicle, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle Type", notes = "Update a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class)
    })
    public Response updateVehicleType(@ApiParam(value = "The id of the vehicle type to update", required = true) @PathParam("vehicleTypeId") @NotNull  Long vehicleTypeId,@ApiParam(value = "The new data for the vehicle type to update to. A JSON representation of cargo type, for example: ```json {   \"name\": \"Truck\",   \"width\": 100,   \"height\": 200,   \"depth\": 200,   \"maxWeight\": 5000,   \"hub\": { \"id\": 1 } } ``` ", required = true) @QueryParam("vehicleType") @NotNull  String vehicleType,@ApiParam(value = "") @Valid  VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVehicleType(vehicleTypeId, vehicleType, body, securityContext);
    }
}
