package org.openapitools.api;

import org.openapitools.api.ParticipantApiService;
import org.openapitools.api.factories.ParticipantApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
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

@Path("/participant/process")


@io.swagger.annotations.Api(description = "the participant API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ParticipantApi  {
   private final ParticipantApiService delegate;

   public ParticipantApi(@Context ServletConfig servletContext) {
      ParticipantApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ParticipantApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ParticipantApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ParticipantApiServiceFactory.getParticipantApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/all")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process All Participant Feeds", notes = "Processes all supported participant feeds.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response processAllParticipants(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Whether to use short name as the participant ID") @QueryParam("useShortNameAsID")  Boolean useShortNameAsID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.processAllParticipants(accountId, appKey, useShortNameAsID, securityContext);
    }
    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Participants Feed", notes = "Processes a participant feed or uploaded file for a specific league.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response processParticipants(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The league identifier to process", required = true) @QueryParam("league") @NotNull  String league,@ApiParam(value = "The application key used to identify the application") @QueryParam("appKey")  String appKey,@ApiParam(value = "Whether to use short name as the participant ID") @QueryParam("useShortNameAsID")  Boolean useShortNameAsID,@ApiParam(value = "Multipart file containing participant feed contents") @QueryParam("file")  File _file,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.processParticipants(accountId, league, appKey, useShortNameAsID, _file, securityContext);
    }
}
