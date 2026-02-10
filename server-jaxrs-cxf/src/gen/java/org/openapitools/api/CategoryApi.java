package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
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
@Path("/api/{version}/category")
@Api(value = "/", description = "")
public interface CategoryApi  {

    /**
     * Search Categories by Distance
     *
     * Search for categories by distance.
     *
     */
    @GET
    @Path("/distancesearch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Categories by Distance", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public List<CategoryResponse> categoryDistanceSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly, @QueryParam("sortField") @DefaultValue("DISPLAY")String sortField, @QueryParam("responseGroup") String responseGroup, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly, @QueryParam("returnExternal") Boolean returnExternal, @QueryParam("exactMatch") Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("minOfferCount") Integer minOfferCount, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range);

    /**
     * Create Category
     *
     * Create a new category.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Category", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public CategoryTreeResponse createCategory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags);

    /**
     * Delete Category
     *
     * Delete a category.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Category", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteCategory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("categoryId") @NotNull Long categoryId);

    /**
     * Duplicate Category
     *
     * Duplicate a category, including all its children.
     *
     */
    @POST
    @Path("/duplicate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Duplicate Category", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public CategoryTreeResponse duplicateCategory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("categoryId") @NotNull Long categoryId, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId);

    /**
     * Get Category
     *
     * Get the details of a specific category. Recursively include all child categories and their children.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Category", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public CategoryTreeResponse getCategory(@PathParam("version") BigDecimal version, @QueryParam("categoryId") @NotNull Long categoryId, @QueryParam("returnExternal") @DefaultValue("true")Boolean returnExternal);

    /**
     * Search Categories
     *
     * Search for categories.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Categories", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public List<CategoryResponse> searchCategories(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryId") String categoryId, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly, @QueryParam("sortField") @DefaultValue("DISPLAY")String sortField, @QueryParam("responseGroup") String responseGroup, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("activeOnly") @DefaultValue("true")Boolean activeOnly, @QueryParam("returnExternal") @DefaultValue("true")Boolean returnExternal, @QueryParam("exactMatch") @DefaultValue("false")Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("excludeExternalType") Boolean excludeExternalType, @QueryParam("minOfferCount") Integer minOfferCount, @QueryParam("searchDepth") @DefaultValue("4")Integer searchDepth, @QueryParam("searchMode") String searchMode);

    /**
     * Update Category
     *
     * Update a category.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Category", tags={ "Category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public CategoryTreeResponse updateCategory(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("categoryId") @NotNull Long categoryId, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags);
}
