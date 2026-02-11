package org.openapitools.api;

import org.openapitools.api.StopApiService;
import org.openapitools.api.factories.StopApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Stop;

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

@Path("/stop/{id}")


@io.swagger.annotations.Api(description = "the stop API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class StopApi  {
   private final StopApiService delegate;

   public StopApi(@Context ServletConfig servletContext) {
      StopApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StopApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StopApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = StopApiServiceFactory.getStopApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Stop", notes = "Get an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class)
    })
    public Response getStop(@ApiParam(value = "the id of the stop to get", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStop(id, securityContext);
    }
    @javax.ws.rs.PUT
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Stop", notes = "Update an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class)
    })
    public Response updateStop(@ApiParam(value = "the id of the stop to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateStop(id, body, securityContext);
    }
}
