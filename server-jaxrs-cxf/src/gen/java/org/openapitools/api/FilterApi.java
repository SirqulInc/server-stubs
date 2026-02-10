package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/filter")
@Api(value = "/", description = "")
public interface FilterApi  {

    /**
     * Create Filter
     *
     * Create a filter
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Filter", tags={ "Filter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public FilterTreeResponse createFilter(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("appKey") String appKey, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData);

    /**
     * Delete Filter
     *
     * Delete a filter.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Filter", tags={ "Filter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteFilter(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("filterId") @NotNull Long filterId);

    /**
     * Get Filter
     *
     * Get the details of a specific filter. Recursively include all child filters and their children.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Filter", tags={ "Filter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public FilterTreeResponse getFilter(@PathParam("version") BigDecimal version, @QueryParam("filterId") @NotNull Long filterId);

    /**
     * Search Filters
     *
     * Search for filters.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Filters", tags={ "Filter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FilterResponse.class, responseContainer = "List") })
    public List<FilterResponse> searchFilters(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("responseGroup") String responseGroup, @QueryParam("rootOnly") Boolean rootOnly, @QueryParam("sortField") @DefaultValue("DISPLAY")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly);

    /**
     * Update Filter
     *
     * Update a filter.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Filter", tags={ "Filter" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public FilterTreeResponse updateFilter(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("filterId") @NotNull Long filterId, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData);
}
