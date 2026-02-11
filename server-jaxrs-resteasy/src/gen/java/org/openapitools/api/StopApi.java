package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.StopApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Stop;

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

@Path("/stop/{id}")


@io.swagger.annotations.Api(description = "the stop API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StopApi  {

    @Inject StopApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Stop", notes = "Get an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response getStop( @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStop(id,securityContext);
    }
    @PUT
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Stop", notes = "Update an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response updateStop( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateStop(id,body,securityContext);
    }
}
