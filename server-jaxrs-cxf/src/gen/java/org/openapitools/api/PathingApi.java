package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.PathingResponse;

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
@Path("/api/{version}/pathing/compute")
@Api(value = "/", description = "")
public interface PathingApi  {

    /**
     * Calculate Path
     *
     * Calculates the shortest path from point to point on a grid
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Calculate Path", tags={ "Pathing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PathingResponse.class) })
    public PathingResponse computePath(@PathParam("version") BigDecimal version, @QueryParam("data") @NotNull String data, @QueryParam("units") @NotNull String units, @QueryParam("reducePath") @NotNull Boolean reducePath, @QueryParam("directions") @NotNull Boolean directions);
}
