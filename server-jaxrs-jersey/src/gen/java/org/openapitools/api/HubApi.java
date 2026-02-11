package org.openapitools.api;

import org.openapitools.api.HubApiService;
import org.openapitools.api.factories.HubApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ServiceHub;

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

@Path("/hub")


@io.swagger.annotations.Api(description = "the hub API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class HubApi  {
   private final HubApiService delegate;

   public HubApi(@Context ServletConfig servletContext) {
      HubApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("HubApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (HubApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = HubApiServiceFactory.getHubApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Service Hub", notes = "Create new service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class)
    })
    public Response createServiceHub(@ApiParam(value = "") @Valid  ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createServiceHub(body, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Service Hub", notes = "Delete an existing service hub", response = Void.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteServiceHub(@ApiParam(value = "the id of the service hub to delete", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteServiceHub(id, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Service Hub", notes = "Get an existing service hub", response = Object.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class)
    })
    public Response getServiceHub(@ApiParam(value = "the id of the service hub to get", required = true) @PathParam("id") @NotNull  Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getServiceHub(id, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class)
    })
    public Response postServiceHub(@ApiParam(value = "the id of the service hub", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postServiceHub(id, body, securityContext);
    }
    @javax.ws.rs.PUT
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class)
    })
    public Response putServiceHub(@ApiParam(value = "the id of the service hub", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putServiceHub(id, body, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Service Hubs", notes = "Search for service hubs.", response = ServiceHub.class, responseContainer = "List", tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class, responseContainer = "List")
    })
    public Response searchServiceHubs(@ApiParam(value = "The field to sort by", required = true) @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Return only active results", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "The retailer belongs to") @QueryParam("retailerId")  Long retailerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchServiceHubs(sortField, descending, start, limit, activeOnly, keyword, retailerId, securityContext);
    }
}
