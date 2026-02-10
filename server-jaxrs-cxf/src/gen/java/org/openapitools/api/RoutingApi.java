package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.RoutingListResponse;

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
@Path("/api/{version}/routing/compute")
@Api(value = "/", description = "")
public interface RoutingApi  {

    /**
     * Compute Route
     *
     * This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. 
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Compute Route", tags={ "Routing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RoutingListResponse.class) })
    public RoutingListResponse computeRouting(@PathParam("version") BigDecimal version, @QueryParam("data") @NotNull String data);
}
