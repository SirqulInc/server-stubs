package org.openapitools.api;

import org.openapitools.model.WeatherResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/weather/search")
@Api(value = "/", description = "")
public interface WeatherApi  {

    /**
     * Search Weather
     *
     * Search the weather forcast for the next 5 days
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Weather", tags={ "Weather" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WeatherResponse.class) })
    public WeatherResponse searchWeather(@QueryParam("regionId") Long regionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("timezoneOffset") @DefaultValue("-6")Long timezoneOffset);
}
