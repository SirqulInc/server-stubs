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
@Path("/workflow/run")
@Api(value = "/", description = "")
public interface WorkflowApi  {

    /**
     * Run Workflow
     *
     * Runs a published executable workflow
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Run Workflow", tags={ "Workflow" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse runWorkflow(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("workflowId") @NotNull Long workflowId, @QueryParam("skuId") Long skuId, @QueryParam("versionCode") Integer versionCode, @QueryParam("parameters") String parameters);
}
