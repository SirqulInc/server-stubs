package org.openapitools.api;

import org.openapitools.api.PathingApiService;
import org.openapitools.api.factories.PathingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PathingResponse;

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

@Path("/pathing/compute")


@io.swagger.annotations.Api(description = "the pathing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PathingApi  {
   private final PathingApiService delegate;

   public PathingApi(@Context ServletConfig servletContext) {
      PathingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PathingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PathingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = PathingApiServiceFactory.getPathingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Calculate Path", notes = "Calculates the shortest path from point to point on a grid", response = PathingResponse.class, tags={ "Pathing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PathingResponse.class)
    })
    public Response computePath(@ApiParam(value = "the data to with start, end point and exclusion points", required = true) @QueryParam("data") @NotNull  String data,@ApiParam(value = "the system of measurement for directions: {METRIC, IMPERIAL}", required = true, allowableValues="METRIC, IMPERIAL") @QueryParam("units") @NotNull  String units,@ApiParam(value = "determines whether to reduce the path to go in diagonal lines", required = true) @QueryParam("reducePath") @NotNull  Boolean reducePath,@ApiParam(value = "determines whether to return text directions", required = true) @QueryParam("directions") @NotNull  Boolean directions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computePath(data, units, reducePath, directions, securityContext);
    }
}
