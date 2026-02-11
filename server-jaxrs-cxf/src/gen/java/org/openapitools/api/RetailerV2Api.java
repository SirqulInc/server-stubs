package org.openapitools.api;

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
@Path("/retailer")
@Api(value = "/", description = "")
public interface RetailerV2Api  {

    /**
     * Get Retailer
     *
     * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Retailer", tags={ "Retailer V2" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getRetaokiler(@QueryParam("retailerId") @NotNull Long retailerId, @QueryParam("activeOnly") @NotNull @DefaultValue("true")Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("id")String sortField, @QueryParam("start") @DefaultValue("0")Long start, @QueryParam("limit") @DefaultValue("20")Long limit);
}
