package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ProgramApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Program;

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

@Path("/program")


@io.swagger.annotations.Api(description = "the program API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProgramApi  {

    @Inject ProgramApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Program", notes = "Create a new program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response createProgram(@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createProgram(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Program", notes = "Delete an existing program", response = Void.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteProgram( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteProgram(id,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Program", notes = "Get an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response getProgram( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getProgram(id,securityContext);
    }
    @POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response postProgram( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postProgram(id,body,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response putProgram( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putProgram(id,body,securityContext);
    }
    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Programs", notes = "Search for programs", response = Program.class, responseContainer = "List", tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class, responseContainer = "List") })
    public Response searchPrograms( @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPrograms(sortField,descending,start,limit,activeOnly,keyword,securityContext);
    }
}
