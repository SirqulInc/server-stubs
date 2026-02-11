package org.openapitools.api;

import org.openapitools.model.Program;

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
@Path("/program")
@Api(value = "/", description = "")
public interface ProgramApi  {

    /**
     * Create Program
     *
     * Create a new program
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Program", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Program createProgram(@Valid Program body);

    /**
     * Delete Program
     *
     * Delete an existing program
     *
     */
    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "Delete Program", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteProgram(@PathParam("id") Long id);

    /**
     * Get Program
     *
     * Get an existing program
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Program", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Program getProgram(@PathParam("id") Long id);

    /**
     * Update Program
     *
     * Update an existing program
     *
     */
    @POST
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Program", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Program postProgram(@PathParam("id") Long id, @Valid Program body);

    /**
     * Update Program
     *
     * Update an existing program
     *
     */
    @PUT
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Program", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Program putProgram(@PathParam("id") Long id, @Valid Program body);

    /**
     * Search Programs
     *
     * Search for programs
     *
     */
    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Programs", tags={ "Program" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Program.class, responseContainer = "List") })
    public List<Program> searchPrograms(@QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("keyword") String keyword);
}
