package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CargoApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.CargoType;
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

@Path("/cargo")


@io.swagger.annotations.Api(description = "the cargo API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CargoApi  {

    @Inject CargoApiService service;

    @PUT
    @Path("/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Dependent", notes = "Create dependent of the account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response create( @PathParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid Account body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.create(accountId,body,securityContext);
    }
    @POST
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Cargo Type", notes = "Create new cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response createCargoType(@ApiParam(value = "" ) @Valid CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCargoType(body,securityContext);
    }
    @DELETE
    @Path("/type/{cargoTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Cargo Type", notes = "Delete a type of cargo", response = Void.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteCargoType( @PathParam("cargoTypeId") Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCargoType(cargoTypeId,securityContext);
    }
    @GET
    @Path("/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Cargo Type", notes = "Get an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response getCargoType( @PathParam("cargoTypeId") Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCargoType(cargoTypeId,securityContext);
    }
    @GET
    @Path("/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get dependent list of an account", notes = "Get the dependent list of an account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getDependents( @PathParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDependents(accountId,securityContext);
    }
    @DELETE
    @Path("/dependent/{accountId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Dependent", notes = "Delete the Dependent", response = Void.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response removeDependent( @PathParam("accountId") Long accountId, @PathParam("dependentId") Long dependentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeDependent(accountId,dependentId,securityContext);
    }
    @GET
    @Path("/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Cargo Type", notes = "Search for types of cargo", response = CargoType.class, responseContainer = "List", tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class, responseContainer = "List") })
    public Response searchCargoTypes( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCargoTypes(sortField,descending,start,limit,activeOnly,retailerId,hubId,securityContext);
    }
    @PUT
    @Path("/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Cargo Type", notes = "Update an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response updateCargoType( @PathParam("cargoTypeId") Long cargoTypeId,@ApiParam(value = "" ) @Valid CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCargoType(cargoTypeId,body,securityContext);
    }
}
