package org.openapitools.api;

import org.openapitools.model.Location;
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
@Path("/location")
@Api(value = "/", description = "")
public interface LocationApiV2Api  {

    /**
     * Create new location
     *
     * Create a new location from a real object location.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create new location", tags={ "LocationApiV2" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse createLocationV2(@Valid Location body);

    /**
     * Update an existing location
     *
     * Update an existing location
     *
     */
    @POST
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update an existing location", tags={ "LocationApiV2" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse updateLocationV2(@PathParam("id") Long id, @Valid Location body);
}
