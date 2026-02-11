package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PathingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PathingResponse;

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

@Path("/pathing/compute")


@io.swagger.annotations.Api(description = "the pathing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PathingApi  {

    @Inject PathingApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Calculate Path", notes = "Calculates the shortest path from point to point on a grid", response = PathingResponse.class, tags={ "Pathing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PathingResponse.class) })
    public Response computePath( @NotNull @QueryParam("data") String data, @NotNull, allowableValues="METRIC, IMPERIAL" @QueryParam("units") String units, @NotNull @QueryParam("reducePath") Boolean reducePath, @NotNull @QueryParam("directions") Boolean directions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computePath(data,units,reducePath,directions,securityContext);
    }
}
