package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.HubApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ServiceHub;

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

@Path("/hub")


@io.swagger.annotations.Api(description = "the hub API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class HubApi  {

    @Inject HubApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Service Hub", notes = "Create new service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response createServiceHub(@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createServiceHub(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Service Hub", notes = "Delete an existing service hub", response = Void.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteServiceHub( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteServiceHub(id,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Service Hub", notes = "Get an existing service hub", response = Object.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response getServiceHub( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getServiceHub(id,securityContext);
    }
    @POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response postServiceHub( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postServiceHub(id,body,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response putServiceHub( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putServiceHub(id,body,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Service Hubs", notes = "Search for service hubs.", response = ServiceHub.class, responseContainer = "List", tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class, responseContainer = "List") })
    public Response searchServiceHubs( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchServiceHubs(sortField,descending,start,limit,activeOnly,keyword,retailerId,securityContext);
    }
}
