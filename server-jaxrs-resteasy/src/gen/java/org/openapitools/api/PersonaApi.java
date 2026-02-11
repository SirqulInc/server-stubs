package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PersonaApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/persona")


@io.swagger.annotations.Api(description = "the persona API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PersonaApi  {

    @Inject PersonaApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Persona", notes = "Creates a new persona. If the given params are null those attributes will be override by null.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response createPersona( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPersona(accountId,title,previewAccounts,date,age,gender,gameExperienceLevel,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Persona", notes = "Mark the persona for deletion.", response = SirqulResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePersona( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePersona(accountId,personaId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Persona", notes = "Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response getPersonaList( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPersonaList(accountId,personaId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Personas", notes = "Search for persona that the account owns by the given account ID.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response searchPersona( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPersona(accountId,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Persona", notes = "Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response updatePersona( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId, @QueryParam("title") String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("active") Boolean active, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePersona(accountId,personaId,title,previewAccounts,active,date,age,gender,gameExperienceLevel,latitude,longitude,securityContext);
    }
}
