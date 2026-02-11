package org.openapitools.api;

import org.openapitools.model.ActivityResponse;
import org.openapitools.model.EntityReference;

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
@Path("/entity/reference")
@Api(value = "/", description = "")
public interface ActivityApi  {

    /**
     * Create an entity reference.
     *
     * Creates a reference for an entity for syncing data between servers.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an entity reference.", tags={ "Activity" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ActivityResponse.class) })
    public ActivityResponse createEntityReference(@Valid @NotNull EntityReference body);
}
