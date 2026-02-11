package org.openapitools.api;

import org.openapitools.api.PersonaApiService;
import org.openapitools.api.factories.PersonaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/persona")


@io.swagger.annotations.Api(description = "the persona API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PersonaApi  {
   private final PersonaApiService delegate;

   public PersonaApi(@Context ServletConfig servletContext) {
      PersonaApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PersonaApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PersonaApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PersonaApiServiceFactory.getPersonaApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Persona", notes = "Creates a new persona. If the given params are null those attributes will be override by null.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class)
    })
    public Response createPersona(@ApiParam(value = "the account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the title of the persona", required = true) @QueryParam("title") @NotNull  String title,@ApiParam(value = "the accounts that are able to preview from this persona") @QueryParam("previewAccounts")  String previewAccounts,@ApiParam(value = "the sepcified date that this persona is viewing the app") @QueryParam("date")  Long date,@ApiParam(value = "the specified age of this persona") @QueryParam("age")  Integer age,@ApiParam(value = "the specified gender of this persona") @QueryParam("gender")  String gender,@ApiParam(value = "the specified experience level of the persona") @QueryParam("gameExperienceLevel")  String gameExperienceLevel,@ApiParam(value = "the specified latitude of the persona") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the specified longitude of the persona") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPersona(accountId, title, previewAccounts, date, age, gender, gameExperienceLevel, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Persona", notes = "Mark the persona for deletion.", response = SirqulResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deletePersona(@ApiParam(value = "the account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the persona to delete", required = true) @QueryParam("personaId") @NotNull  Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePersona(accountId, personaId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Persona", notes = "Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class)
    })
    public Response getPersonaList(@ApiParam(value = "the account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the persona ID of the persona", required = true) @QueryParam("personaId") @NotNull  Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPersonaList(accountId, personaId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Personas", notes = "Search for persona that the account owns by the given account ID.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class)
    })
    public Response searchPersona(@ApiParam(value = "the account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "the limit for pagination (There is a hard limit of 100)", required = true) @QueryParam("limit") @NotNull  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPersona(accountId, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Persona", notes = "Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class)
    })
    public Response updatePersona(@ApiParam(value = "the account ID of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the persona ID of the persona to update", required = true) @QueryParam("personaId") @NotNull  Long personaId,@ApiParam(value = "the title of the persona") @QueryParam("title")  String title,@ApiParam(value = "the accounts that are able to preview from this persona") @QueryParam("previewAccounts")  String previewAccounts,@ApiParam(value = "the status of the persona, there can only be one active persona per account") @QueryParam("active")  Boolean active,@ApiParam(value = "the sepcified date that this persona is viewing the app") @QueryParam("date")  Long date,@ApiParam(value = "the specified age of this persona") @QueryParam("age")  Integer age,@ApiParam(value = "the specified gender of this persona") @QueryParam("gender")  String gender,@ApiParam(value = "the specified experience level of the persona") @QueryParam("gameExperienceLevel")  String gameExperienceLevel,@ApiParam(value = "the specified latitude of the persona") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the specified longitude of the persona") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePersona(accountId, personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude, securityContext);
    }
}
