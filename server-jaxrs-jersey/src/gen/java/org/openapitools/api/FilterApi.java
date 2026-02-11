package org.openapitools.api;

import org.openapitools.api.FilterApiService;
import org.openapitools.api.factories.FilterApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
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

@Path("/filter")


@io.swagger.annotations.Api(description = "the filter API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FilterApi  {
   private final FilterApiService delegate;

   public FilterApi(@Context ServletConfig servletContext) {
      FilterApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FilterApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FilterApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = FilterApiServiceFactory.getFilterApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Filter", notes = "Create a filter", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class)
    })
    public Response createFilter(@ApiParam(value = "The account id of the user (must have permissions to the target application)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the filter", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)") @QueryParam("appKey")  String appKey,@ApiParam(value = "The ID of the parent filter, if not provided then the parent filter will be null") @QueryParam("parentFilterId")  Long parentFilterId,@ApiParam(value = "The description of the filter") @QueryParam("description")  String description,@ApiParam(value = "A string identifier used by client applications to store external information") @QueryParam("externalId")  String externalId,@ApiParam(value = "A string type used by client applications to store external information") @QueryParam("externalType")  String externalType,@ApiParam(value = "Sets whether the filter is active or inactive (hidden from consumers)") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createFilter(accountId, name, appKey, parentFilterId, description, externalId, externalType, active, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Filter", notes = "Delete a filter.", response = SirqulResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteFilter(@ApiParam(value = "The account id of the user (must have permissions to the filter's assigned application)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The ID of the filter to delete", required = true) @QueryParam("filterId") @NotNull  Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFilter(accountId, filterId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Filter", notes = "Get the details of a specific filter. Recursively include all child filters and their children.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class)
    })
    public Response getFilter(@ApiParam(value = "the id of the filter to get", required = true) @QueryParam("filterId") @NotNull  Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFilter(filterId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Filters", notes = "Search for filters.", response = FilterResponse.class, responseContainer = "List", tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterResponse.class, responseContainer = "List")
    })
    public Response searchFilters(@ApiParam(value = "The account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The string to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the appKey of the application to retrieve filters for") @QueryParam("appKey")  String appKey,@ApiParam(value = "The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", allowableValues="ALL, GLOBAL, MINE") @QueryParam("responseGroup")  String responseGroup,@ApiParam(value = "Restrict the search to only those filters with no parent filter assigned.") @QueryParam("rootOnly")  Boolean rootOnly,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY", defaultValue = "DISPLAY") @DefaultValue("DISPLAY") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active categories", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchFilters(accountId, keyword, appKey, responseGroup, rootOnly, sortField, descending, start, limit, activeOnly, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Filter", notes = "Update a filter.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class)
    })
    public Response updateFilter(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The ID of the filter to edit", required = true) @QueryParam("filterId") @NotNull  Long filterId,@ApiParam(value = "The ID of the parent filter, if not provided then the parent filter will be null") @QueryParam("parentFilterId")  Long parentFilterId,@ApiParam(value = "The name of the filter") @QueryParam("name")  String name,@ApiParam(value = "The description of the filter") @QueryParam("description")  String description,@ApiParam(value = "A string identifier used by client applications to store external information") @QueryParam("externalId")  String externalId,@ApiParam(value = "A string type used by client applications to store external information") @QueryParam("externalType")  String externalType,@ApiParam(value = "Sets whether the filter is active or inactive (hidden from consumers)") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateFilter(accountId, filterId, parentFilterId, name, description, externalId, externalType, active, metaData, securityContext);
    }
}
