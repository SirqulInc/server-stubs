package org.openapitools.api;

import org.openapitools.model.PreviewPersonaResponse;
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
@Path("/persona")
@Api(value = "/", description = "")
public interface PreviewPersonaApi  {

    /**
     * Create Persona
     *
     * Creates a new persona. If the given params are null those attributes will be override by null.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Persona", tags={ "Preview Persona" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public PreviewPersonaResponse createPersona(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("title") @NotNull String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Persona
     *
     * Mark the persona for deletion.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Persona", tags={ "Preview Persona" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deletePersona(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("personaId") @NotNull Long personaId);

    /**
     * Get Persona
     *
     * Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Persona", tags={ "Preview Persona" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public PreviewPersonaResponse getPersonaList(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("personaId") @NotNull Long personaId);

    /**
     * Search Personas
     *
     * Search for persona that the account owns by the given account ID.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Personas", tags={ "Preview Persona" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public PreviewPersonaResponse searchPersona(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit);

    /**
     * Update Persona
     *
     * Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Persona", tags={ "Preview Persona" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public PreviewPersonaResponse updatePersona(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("personaId") @NotNull Long personaId, @QueryParam("title") String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("active") Boolean active, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
