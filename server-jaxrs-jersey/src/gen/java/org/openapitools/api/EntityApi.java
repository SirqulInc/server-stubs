package org.openapitools.api;

import org.openapitools.api.EntityApiService;
import org.openapitools.api.factories.EntityApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ActivityResponse;
import org.openapitools.model.EntityReference;

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

@Path("/entity/reference")


@io.swagger.annotations.Api(description = "the entity API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EntityApi  {
   private final EntityApiService delegate;

   public EntityApi(@Context ServletConfig servletContext) {
      EntityApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EntityApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EntityApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = EntityApiServiceFactory.getEntityApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an entity reference.", notes = "Creates a reference for an entity for syncing data between servers.", response = ActivityResponse.class, tags={ "Activity", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ActivityResponse.class)
    })
    public Response createEntityReference(@ApiParam(value = "The entity reference object", required = true) @NotNull @Valid  EntityReference body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createEntityReference(body, securityContext);
    }
}
