package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CarrierApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CellCarrierResponse;

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

@Path("/carrier/search")


@io.swagger.annotations.Api(description = "the carrier API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CarrierApi  {

    @Inject CarrierApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Carriers", notes = "Search on supported mobile telephone carriers that can be used to send SMS notifications via email.", response = CellCarrierResponse.class, responseContainer = "List", tags={ "Carrier", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CellCarrierResponse.class, responseContainer = "List") })
    public Response searchCarriers( @QueryParam("keyword") String keyword, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCarriers(keyword,descending,start,limit,activeOnly,securityContext);
    }
}
