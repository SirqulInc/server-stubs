package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SimulationApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/simulation/routing")


@io.swagger.annotations.Api(description = "the simulation API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SimulationApi  {

    @Inject SimulationApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Routing Simulation", notes = "Simulates routing requests.", response = SirqulResponse.class, tags={ "Simulation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response simulation( @NotNull @QueryParam("data") String data, @NotNull @QueryParam("realTime") Boolean realTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.simulation(data,realTime,securityContext);
    }
}
