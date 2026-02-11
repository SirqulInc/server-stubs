package org.openapitools.api;

import org.openapitools.model.Account;
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
@Path("/cargo/dependent/{accountId}")
@Api(value = "/", description = "")
public interface DependentApi  {

    /**
     * Create Dependent
     *
     * Create dependent of the account
     *
     */
    @PUT
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Dependent", tags={ "Dependent" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse create(@PathParam("accountId") Long accountId, @Valid Account body);

    /**
     * Get dependent list of an account
     *
     * Get the dependent list of an account
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Get dependent list of an account", tags={ "Dependent" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getDependents(@PathParam("accountId") Long accountId);

    /**
     * Delete Dependent
     *
     * Delete the Dependent
     *
     */
    @DELETE
    
    @ApiOperation(value = "Delete Dependent", tags={ "Dependent" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void removeDependent(@PathParam("accountId") Long accountId, @PathParam("dependentId") Long dependentId);
}
