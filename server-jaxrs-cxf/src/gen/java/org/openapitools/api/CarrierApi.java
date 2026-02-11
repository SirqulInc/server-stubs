package org.openapitools.api;

import org.openapitools.model.CellCarrierResponse;

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
@Path("/carrier/search")
@Api(value = "/", description = "")
public interface CarrierApi  {

    /**
     * Search Carriers
     *
     * Search on supported mobile telephone carriers that can be used to send SMS notifications via email.
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Carriers", tags={ "Carrier" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CellCarrierResponse.class, responseContainer = "List") })
    public List<CellCarrierResponse> searchCarriers(@QueryParam("keyword") String keyword, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly);
}
