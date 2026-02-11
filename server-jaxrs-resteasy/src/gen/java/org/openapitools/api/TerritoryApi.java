package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TerritoryApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TerritoryResponse;

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

@Path("/territory")


@io.swagger.annotations.Api(description = "the territory API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TerritoryApi  {

    @Inject TerritoryApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Territory", notes = "Creates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response createTerritory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTerritory(accountId,name,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Territory", notes = "Deletes a territory.", response = SirqulResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTerritory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("territoryId") Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTerritory(accountId,territoryId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Territory", notes = "Get a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response getTerritory( @NotNull @QueryParam("territoryId") Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTerritory(territoryId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Territories", notes = "Searches on territories.", response = TerritoryResponse.class, responseContainer = "List", tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class, responseContainer = "List") })
    public Response searchTerritories( @NotNull, allowableValues="ID, UPDATED, CREATED, NAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTerritories(sortField,descending,keyword,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Territory", notes = "Updates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response updateTerritory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("territoryId") Long territoryId, @QueryParam("name") String name, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTerritory(accountId,territoryId,name,active,securityContext);
    }
}
