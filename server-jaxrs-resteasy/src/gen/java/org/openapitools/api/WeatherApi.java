package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.WeatherApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.WeatherResponse;

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

@Path("/weather/search")


@io.swagger.annotations.Api(description = "the weather API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WeatherApi  {

    @Inject WeatherApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Weather", notes = "Search the weather forcast for the next 5 days", response = WeatherResponse.class, tags={ "Weather", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WeatherResponse.class) })
    public Response searchWeather( @QueryParam("regionId") Long regionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("-6") @QueryParam("timezoneOffset") Long timezoneOffset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchWeather(regionId,latitude,longitude,timezoneOffset,securityContext);
    }
}
