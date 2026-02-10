package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.WrappedProxyItemResponse;

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
@Path("/api/{version}/openai/v1/images/generations")
@Api(value = "/", description = "")
public interface OpenAiApi  {

    /**
     * Generate images with OpenAI
     *
     * Generate images with OpenAI.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Generate images with OpenAI", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WrappedProxyItemResponse.class) })
    public WrappedProxyItemResponse imageGeneration(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("postBody") @NotNull String postBody, @QueryParam("returnRawResponse") Boolean returnRawResponse);
}
