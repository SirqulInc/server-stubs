package org.openapitools.api;

import org.openapitools.api.CategoryApiService;
import org.openapitools.api.factories.CategoryApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
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

@Path("/category")


@io.swagger.annotations.Api(description = "the category API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CategoryApi  {
   private final CategoryApiService delegate;

   public CategoryApi(@Context ServletConfig servletContext) {
      CategoryApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CategoryApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CategoryApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CategoryApiServiceFactory.getCategoryApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories by Distance", notes = "Search for categories by distance.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List")
    })
    public Response categoryDistanceSearch(@ApiParam(value = "The account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The keyword string to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the appKey of the application to retrieve categories for, if not specified then search on the global application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "Restrict the search by specific categories") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Restrict the search by specific parent categories so that only its sub children are searched.") @QueryParam("parentCategoryIds")  String parentCategoryIds,@ApiParam(value = "Restrict the search to only those categories with no parent category assigned.") @QueryParam("rootOnly")  Boolean rootOnly,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY", defaultValue = "DISPLAY") @DefaultValue("DISPLAY") @QueryParam("sortField")  String sortField,@ApiParam(value = "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", allowableValues="ALL, GLOBAL, MINE") @QueryParam("responseGroup")  String responseGroup,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active categories", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Determines whether to return extra info about the category's \"Participant\" reference") @QueryParam("returnExternal")  Boolean returnExternal,@ApiParam(value = "If true search categories using the exact keyword, if false then do a partial match (like) search.") @QueryParam("exactMatch")  Boolean exactMatch,@ApiParam(value = "Filters results by the Category's type") @QueryParam("type")  String type,@ApiParam(value = "Filters results by externalType") @QueryParam("externalType")  String externalType,@ApiParam(value = "Filters results to only return Categories that have been referenced by a minimum number of Offers") @QueryParam("minOfferCount")  Integer minOfferCount,@ApiParam(value = "the latitude of where the search is centered on") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of where the search is centered on") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the maximum range the category can be from the center") @QueryParam("range")  Double range,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.categoryDistanceSearch(accountId, keyword, appKey, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, minOfferCount, latitude, longitude, range, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Category", notes = "Create a new category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class)
    })
    public Response createCategory(@ApiParam(value = "The account id of the user (must have permissions to the target application)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the category", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)") @QueryParam("appKey")  String appKey,@ApiParam(value = "The ID of the parent category, if not provided then the parent category will be null") @QueryParam("parentCategoryId")  Long parentCategoryId,@ApiParam(value = "The description of the category") @QueryParam("description")  String description,@ApiParam(value = "The type of the category") @QueryParam("type")  String type,@ApiParam(value = "The ID of the image asset previously uploaded using the media service") @QueryParam("assetId")  Long assetId,@ApiParam(value = "A string identifier used by client applications to store external information") @QueryParam("externalId")  String externalId,@ApiParam(value = "A string type used by client applications to store external information") @QueryParam("externalType")  String externalType,@ApiParam(value = "external category slug") @QueryParam("externalCategorySlug")  String externalCategorySlug,@ApiParam(value = "sqoot slug") @QueryParam("sqootSlug")  String sqootSlug,@ApiParam(value = "Sets whether the category is active or inactive (hidden from consumers)") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "user defined strings for searching") @QueryParam("searchTags")  String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCategory(accountId, name, appKey, parentCategoryId, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Category", notes = "Delete a category.", response = SirqulResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteCategory(@ApiParam(value = "the ID of the account", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the ID of the category", required = true) @QueryParam("categoryId") @NotNull  Long categoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCategory(accountId, categoryId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/duplicate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Duplicate Category", notes = "Duplicate a category, including all its children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class)
    })
    public Response duplicateCategory(@ApiParam(value = "The account id of the user (must have permissions to the target application)", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The category ID to duplicate (includes all children)", required = true) @QueryParam("categoryId") @NotNull  Long categoryId,@ApiParam(value = "The application to assign the new category to, may be different then the application the source category is assigned to") @QueryParam("appKey")  String appKey,@ApiParam(value = "The parent category ID to add the target category to.") @QueryParam("parentCategoryId")  Long parentCategoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.duplicateCategory(accountId, categoryId, appKey, parentCategoryId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Category", notes = "Get the details of a specific category. Recursively include all child categories and their children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class)
    })
    public Response getCategory(@ApiParam(value = "the ID of the category", required = true) @QueryParam("categoryId") @NotNull  Long categoryId,@ApiParam(value = "Determines whether to return extra info about the category's \"Participant\" reference", defaultValue = "true") @DefaultValue("true") @QueryParam("returnExternal")  Boolean returnExternal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCategory(categoryId, returnExternal, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories", notes = "Search for categories.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List")
    })
    public Response searchCategories(@ApiParam(value = "The account id of the user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The string to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the appKey of the application to retrieve categories for, if not specified then search on the global application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "@Deprecated, use parentCategoryIds instead") @QueryParam("categoryId")  String categoryId,@ApiParam(value = "Restrict the search by specific categories") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Restrict the search by specific parent categories so that only its sub children are searched.") @QueryParam("parentCategoryIds")  String parentCategoryIds,@ApiParam(value = "Restrict the search to only those categories with no parent category assigned.") @QueryParam("rootOnly")  Boolean rootOnly,@ApiParam(value = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY", defaultValue = "DISPLAY") @DefaultValue("DISPLAY") @QueryParam("sortField")  String sortField,@ApiParam(value = "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", allowableValues="ALL, GLOBAL, MINE") @QueryParam("responseGroup")  String responseGroup,@ApiParam(value = "The order to return the search results", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return only active categories", defaultValue = "true") @DefaultValue("true") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Determines whether to return extra info about the category's \"Participant\" reference", defaultValue = "true") @DefaultValue("true") @QueryParam("returnExternal")  Boolean returnExternal,@ApiParam(value = "If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.", defaultValue = "false") @DefaultValue("false") @QueryParam("exactMatch")  Boolean exactMatch,@ApiParam(value = "Filters results by the Category's type") @QueryParam("type")  String type,@ApiParam(value = "Filters results by externalType") @QueryParam("externalType")  String externalType,@ApiParam(value = "Determines whether the \"externalType\" param is excluded from the search results") @QueryParam("excludeExternalType")  Boolean excludeExternalType,@ApiParam(value = "Filters results to only return Categories that have been referenced by a minimum number of Offers") @QueryParam("minOfferCount")  Integer minOfferCount,@ApiParam(value = "When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.", defaultValue = "4") @DefaultValue("4") @QueryParam("searchDepth")  Integer searchDepth,@ApiParam(value = "The search index mode to use (e.g. OPENSEARCH or RDS)") @QueryParam("searchMode")  String searchMode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchCategories(accountId, keyword, appKey, categoryId, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, excludeExternalType, minOfferCount, searchDepth, searchMode, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Category", notes = "Update a category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class)
    })
    public Response updateCategory(@ApiParam(value = "The account id of the user", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The ID of the category to edit", required = true) @QueryParam("categoryId") @NotNull  Long categoryId,@ApiParam(value = "The ID of the parent category, if not provided then the parent category will be null") @QueryParam("parentCategoryId")  Long parentCategoryId,@ApiParam(value = "The name of the category") @QueryParam("name")  String name,@ApiParam(value = "The description of the category") @QueryParam("description")  String description,@ApiParam(value = "The type of the category") @QueryParam("type")  String type,@ApiParam(value = "The ID of the image asset previously uploaded using the media service") @QueryParam("assetId")  Long assetId,@ApiParam(value = "A string identifier used by client applications to store external information") @QueryParam("externalId")  String externalId,@ApiParam(value = "A string type used by client applications to store external information") @QueryParam("externalType")  String externalType,@ApiParam(value = "external category slug") @QueryParam("externalCategorySlug")  String externalCategorySlug,@ApiParam(value = "sqoot slug") @QueryParam("sqootSlug")  String sqootSlug,@ApiParam(value = "Sets whether the category is active or inactive (hidden from consumers)") @QueryParam("active")  Boolean active,@ApiParam(value = "external custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "user defined strings for searching") @QueryParam("searchTags")  String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCategory(accountId, categoryId, parentCategoryId, name, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags, securityContext);
    }
}
