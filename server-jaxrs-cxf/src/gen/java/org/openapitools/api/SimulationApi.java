package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;

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
@Path("/api/{version}/simulation/routing")
@Api(value = "/", description = "")
public interface SimulationApi  {

    /**
     * Routing Simulation
     *
     * Simulates routing requests.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Routing Simulation", tags={ "Simulation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse simulation(@PathParam("version") BigDecimal version, @QueryParam("data") @NotNull String data, @QueryParam("realTime") @NotNull Boolean realTime);
}
