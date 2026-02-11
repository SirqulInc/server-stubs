package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CategoryApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
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

@Path("/category")


@io.swagger.annotations.Api(description = "the category API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CategoryApi  {

    @Inject CategoryApiService service;

    @GET
    @Path("/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories by Distance", notes = "Search for categories by distance.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public Response categoryDistanceSearch( @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnExternal") Boolean returnExternal, @QueryParam("exactMatch") Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("minOfferCount") Integer minOfferCount, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.categoryDistanceSearch(accountId,keyword,appKey,categoryIds,parentCategoryIds,rootOnly,sortField,responseGroup,descending,start,limit,activeOnly,returnExternal,exactMatch,type,externalType,minOfferCount,latitude,longitude,range,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Category", notes = "Create a new category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response createCategory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCategory(accountId,name,appKey,parentCategoryId,description,type,assetId,externalId,externalType,externalCategorySlug,sqootSlug,active,metaData,searchTags,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Category", notes = "Delete a category.", response = SirqulResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCategory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCategory(accountId,categoryId,securityContext);
    }
    @POST
    @Path("/duplicate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Duplicate Category", notes = "Duplicate a category, including all its children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response duplicateCategory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.duplicateCategory(accountId,categoryId,appKey,parentCategoryId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Category", notes = "Get the details of a specific category. Recursively include all child categories and their children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response getCategory( @NotNull @QueryParam("categoryId") Long categoryId, @DefaultValue("true") @QueryParam("returnExternal") Boolean returnExternal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCategory(categoryId,returnExternal,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories", notes = "Search for categories.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public Response searchCategories( @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryId") String categoryId, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("true") @QueryParam("returnExternal") Boolean returnExternal, @DefaultValue("false") @QueryParam("exactMatch") Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("excludeExternalType") Boolean excludeExternalType, @QueryParam("minOfferCount") Integer minOfferCount, @DefaultValue("4") @QueryParam("searchDepth") Integer searchDepth, @QueryParam("searchMode") String searchMode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCategories(accountId,keyword,appKey,categoryId,categoryIds,parentCategoryIds,rootOnly,sortField,responseGroup,descending,start,limit,activeOnly,returnExternal,exactMatch,type,externalType,excludeExternalType,minOfferCount,searchDepth,searchMode,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Category", notes = "Update a category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response updateCategory( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCategory(accountId,categoryId,parentCategoryId,name,description,type,assetId,externalId,externalType,externalCategorySlug,sqootSlug,active,metaData,searchTags,securityContext);
    }
}
