package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FilterApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
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

@Path("/filter")


@io.swagger.annotations.Api(description = "the filter API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FilterApi  {

    @Inject FilterApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Filter", notes = "Create a filter", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response createFilter( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFilter(accountId,name,appKey,parentFilterId,description,externalId,externalType,active,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Filter", notes = "Delete a filter.", response = SirqulResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFilter( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("filterId") Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFilter(accountId,filterId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Filter", notes = "Get the details of a specific filter. Recursively include all child filters and their children.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response getFilter( @NotNull @QueryParam("filterId") Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFilter(filterId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Filters", notes = "Search for filters.", response = FilterResponse.class, responseContainer = "List", tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterResponse.class, responseContainer = "List") })
    public Response searchFilters( @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchFilters(accountId,keyword,appKey,responseGroup,rootOnly,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Filter", notes = "Update a filter.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response updateFilter( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("filterId") Long filterId, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateFilter(accountId,filterId,parentFilterId,name,description,externalId,externalType,active,metaData,securityContext);
    }
}
