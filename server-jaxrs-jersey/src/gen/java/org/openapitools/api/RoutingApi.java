package org.openapitools.api;

import org.openapitools.api.RoutingApiService;
import org.openapitools.api.factories.RoutingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RoutingListResponse;

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

@Path("/routing/compute")


@io.swagger.annotations.Api(description = "the routing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RoutingApi  {
   private final RoutingApiService delegate;

   public RoutingApi(@Context ServletConfig servletContext) {
      RoutingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RoutingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RoutingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RoutingApiServiceFactory.getRoutingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Compute Route", notes = "This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. ", response = RoutingListResponse.class, tags={ "Routing", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RoutingListResponse.class)
    })
    public Response computeRouting(@ApiParam(value = "Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest", required = true) @QueryParam("data") @NotNull  String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.computeRouting(data, securityContext);
    }
}
