package org.openapitools.api;

import org.openapitools.api.TerritoryApiService;
import org.openapitools.api.factories.TerritoryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TerritoryResponse;

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

@Path("/territory")


@io.swagger.annotations.Api(description = "the territory API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TerritoryApi  {
   private final TerritoryApiService delegate;

   public TerritoryApi(@Context ServletConfig servletContext) {
      TerritoryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TerritoryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TerritoryApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TerritoryApiServiceFactory.getTerritoryApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Territory", notes = "Creates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class)
    })
    public Response createTerritory(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the territory", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "If true set the game level as active. Default is true.") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTerritory(accountId, name, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Territory", notes = "Deletes a territory.", response = SirqulResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteTerritory(@ApiParam(value = "the id of the logged in user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the territory to delete", required = true) @QueryParam("territoryId") @NotNull  Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTerritory(accountId, territoryId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Territory", notes = "Get a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class)
    })
    public Response getTerritory(@ApiParam(value = "the id of the territory to get", required = true) @QueryParam("territoryId") @NotNull  Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTerritory(territoryId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Territories", notes = "Searches on territories.", response = TerritoryResponse.class, responseContainer = "List", tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class, responseContainer = "List")
    })
    public Response searchTerritories(@ApiParam(value = "the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME", required = true, allowableValues="ID, UPDATED, CREATED, NAME") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "determines whether the sorted list is in descending or ascending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "Return results that match this keyword.") @QueryParam("keyword")  String keyword,@ApiParam(value = "The start index for pagination") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchTerritories(sortField, descending, keyword, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Territory", notes = "Updates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class)
    })
    public Response updateTerritory(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the territory to update", required = true) @QueryParam("territoryId") @NotNull  Long territoryId,@ApiParam(value = "The name of the territory") @QueryParam("name")  String name,@ApiParam(value = "If true set the game level as active.") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateTerritory(accountId, territoryId, name, active, securityContext);
    }
}
