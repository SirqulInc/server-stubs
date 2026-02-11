package org.openapitools.api;

import org.openapitools.model.Stop;

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
@Path("/stop/{id}")
@Api(value = "/", description = "")
public interface StopApi  {

    /**
     * Get Stop
     *
     * Get an existing stop
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Stop", tags={ "Stop" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Stop getStop(@PathParam("id") Long id);

    /**
     * Update Stop
     *
     * Update an existing stop
     *
     */
    @PUT
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Stop", tags={ "Stop" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Stop updateStop(@PathParam("id") Long id, @Valid Stop body);
}
