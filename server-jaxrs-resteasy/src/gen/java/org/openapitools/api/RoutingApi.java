package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RoutingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RoutingListResponse;

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

@Path("/routing/compute")


@io.swagger.annotations.Api(description = "the routing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RoutingApi  {

    @Inject RoutingApiService service;

    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Compute Route", notes = "This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. ", response = RoutingListResponse.class, tags={ "Routing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RoutingListResponse.class) })
    public Response computeRouting( @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computeRouting(data,securityContext);
    }
}
