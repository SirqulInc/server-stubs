package org.openapitools.api;

import org.openapitools.model.ServiceHub;

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
@Path("/hub")
@Api(value = "/", description = "")
public interface ServiceHubApi  {

    /**
     * Create Service Hub
     *
     * Create new service hub
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Service Hub", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public ServiceHub createServiceHub(@Valid ServiceHub body);

    /**
     * Delete Service Hub
     *
     * Delete an existing service hub
     *
     */
    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "Delete Service Hub", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteServiceHub(@PathParam("id") Long id);

    /**
     * Get Service Hub
     *
     * Get an existing service hub
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Service Hub", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Object getServiceHub(@PathParam("id") Long id);

    /**
     * Update Service Hub
     *
     * Update an existing service hub
     *
     */
    @POST
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Service Hub", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public ServiceHub postServiceHub(@PathParam("id") Long id, @Valid ServiceHub body);

    /**
     * Update Service Hub
     *
     * Update an existing service hub
     *
     */
    @PUT
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Service Hub", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public ServiceHub putServiceHub(@PathParam("id") Long id, @Valid ServiceHub body);

    /**
     * Search Service Hubs
     *
     * Search for service hubs.
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Service Hubs", tags={ "Service Hub" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class, responseContainer = "List") })
    public List<ServiceHub> searchServiceHubs(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId);
}
