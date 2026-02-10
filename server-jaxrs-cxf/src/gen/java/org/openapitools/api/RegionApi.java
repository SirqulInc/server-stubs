package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.RegionResponse;

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
@Path("/api/{version}/region")
@Api(value = "/", description = "")
public interface RegionApi  {

    /**
     * Create Region
     *
     * Create a region.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Region", tags={ "Region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public RegionResponse createRegion(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("regionClass") @NotNull String regionClass, @QueryParam("shortName") @NotNull String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active);

    /**
     * Delete Region
     *
     * Delete a region.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Region", tags={ "Region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public RegionResponse deleteRegion(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("regionId") @NotNull Long regionId);

    /**
     * Get Region
     *
     * Get a region.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Region", tags={ "Region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public RegionResponse getRegion(@PathParam("version") BigDecimal version, @QueryParam("regionId") @NotNull Long regionId, @QueryParam("accountId") Long accountId);

    /**
     * Search Regions
     *
     * Get the list of regions.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Regions", tags={ "Region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class, responseContainer = "List") })
    public List<RegionResponse> searchRegions(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range, @QueryParam("regionClass") String regionClass, @QueryParam("visibility") String visibility, @QueryParam("searchMode") String searchMode, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeParent") Boolean includeParent, @QueryParam("includeChildren") Boolean includeChildren, @QueryParam("includePostalCodes") Boolean includePostalCodes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("versionCode") Integer versionCode, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("showDeleted") Boolean showDeleted, @QueryParam("lastUpdatedSince") Long lastUpdatedSince, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Region
     *
     * Update a region.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Region", tags={ "Region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public RegionResponse updateRegion(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("regionId") @NotNull Long regionId, @QueryParam("regionClass") String regionClass, @QueryParam("shortName") String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active, @QueryParam("clearLists") Boolean clearLists);
}
