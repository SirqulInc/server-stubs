package org.openapitools.api;

import org.openapitools.api.RegionApiService;
import org.openapitools.api.factories.RegionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RegionResponse;

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

@Path("/region")


@io.swagger.annotations.Api(description = "the region API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionApi  {
   private final RegionApiService delegate;

   public RegionApi(@Context ServletConfig servletContext) {
      RegionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RegionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RegionApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RegionApiServiceFactory.getRegionApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Region", notes = "Create a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class)
    })
    public Response createRegion(@ApiParam(value = "The id of the account sending the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "RegionClass of this region", required = true) @QueryParam("regionClass") @NotNull  String regionClass,@ApiParam(value = "Short name of the region. This is optimized for search", required = true) @QueryParam("shortName") @NotNull  String shortName,@ApiParam(value = "Full name of the region") @QueryParam("fullName")  String fullName,@ApiParam(value = "Comma separated region ids that are parents of this region") @QueryParam("parentIds")  String parentIds,@ApiParam(value = "Comma separated region ids that are children of this region") @QueryParam("childrenIds")  String childrenIds,@ApiParam(value = "Comma separated postal code ids the region will include") @QueryParam("postalCodeIds")  String postalCodeIds,@ApiParam(value = "Sets of name,lat,long used to create new postal codes assigned to the region") @QueryParam("locations")  String locations,@ApiParam(value = "the id of the retailer location that the region is being created for") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "The Visibility of the region", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "the categories that the region is assigned to") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "the filters that the region is assigned to") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "") @QueryParam("start")  Long start,@ApiParam(value = "") @QueryParam("end")  Long end,@ApiParam(value = "the polygon generated for the region") @QueryParam("polygon")  String polygon,@ApiParam(value = "the meta data associated with the region") @QueryParam("metaData")  String metaData,@ApiParam(value = "the latitude of the region") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the region") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "If this is a root region or not. If true means this region has no parent regions") @QueryParam("root")  Boolean root,@ApiParam(value = "Active or inactive status of the region") @QueryParam("active")  Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRegion(accountId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Region", notes = "Delete a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class)
    })
    public Response deleteRegion(@ApiParam(value = "the id of the account logged in", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the id of the region", required = true) @QueryParam("regionId") @NotNull  Long regionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRegion(accountId, regionId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Region", notes = "Get a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class)
    })
    public Response getRegion(@ApiParam(value = "the id of the region to get", required = true) @QueryParam("regionId") @NotNull  Long regionId,@ApiParam(value = "the id of the logged in user") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRegion(regionId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions", notes = "Get the list of regions.", response = RegionResponse.class, responseContainer = "List", tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class, responseContainer = "List")
    })
    public Response searchRegions(@ApiParam(value = "the owner account id of the region to be created") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated. deprecated - use \"keyword\"") @QueryParam("query")  String query,@ApiParam(value = "the keyword to filter results on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the search radius") @QueryParam("range")  Double range,@ApiParam(value = "", allowableValues="NATIONAL, STATE, COUNTY, METRO_AREA, CITY, NEIGHBORHOOD, TERRITORY, CUSTOM, ZONE") @QueryParam("regionClass")  String regionClass,@ApiParam(value = "", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server", allowableValues="RDS, LUCENE, CLOUDINDEX") @QueryParam("searchMode")  String searchMode,@ApiParam(value = "the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.", allowableValues="ID, UPDATED, NAME, DISTANCE") @QueryParam("sortField")  String sortField,@ApiParam(value = "determines if the results get ordered in descending order") @QueryParam("descending")  Boolean descending,@ApiParam(value = "include the parent region or not") @QueryParam("includeParent")  Boolean includeParent,@ApiParam(value = "include the chidren regions or not") @QueryParam("includeChildren")  Boolean includeChildren,@ApiParam(value = "include the postal codes associated with the region or not") @QueryParam("includePostalCodes")  Boolean includePostalCodes,@ApiParam(value = "search on the categories associated with the region") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "search on the filters associated with the region") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "filter by a specific version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "filter to show only active results") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "If showDeleted is true and activeOnly is false, will return regions that have been deleted") @QueryParam("showDeleted")  Boolean showDeleted,@ApiParam(value = "only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)") @QueryParam("lastUpdatedSince")  Long lastUpdatedSince,@ApiParam(value = "the start index for pagination") @QueryParam("start")  Integer start,@ApiParam(value = "the limit for pagination") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRegions(accountId, query, keyword, latitude, longitude, range, regionClass, visibility, searchMode, sortField, descending, includeParent, includeChildren, includePostalCodes, categoryIds, filterIds, versionCode, activeOnly, showDeleted, lastUpdatedSince, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Region", notes = "Update a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class)
    })
    public Response updateRegion(@ApiParam(value = "The id of the account sending the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the region to be updated", required = true) @QueryParam("regionId") @NotNull  Long regionId,@ApiParam(value = "RegionClass of this region") @QueryParam("regionClass")  String regionClass,@ApiParam(value = "Short name of the region. This is optimized for search") @QueryParam("shortName")  String shortName,@ApiParam(value = "Full name of the region") @QueryParam("fullName")  String fullName,@ApiParam(value = "Comma separated region ids that are parents of this region") @QueryParam("parentIds")  String parentIds,@ApiParam(value = "Comma separated region ids that are children of this region") @QueryParam("childrenIds")  String childrenIds,@ApiParam(value = "Comma separated postal code ids the region will include") @QueryParam("postalCodeIds")  String postalCodeIds,@ApiParam(value = "Sets of name,lat,long used to create new postal codes assigned to the region") @QueryParam("locations")  String locations,@ApiParam(value = "the retailer location ID that the region is associated with") @QueryParam("retailerLocationId")  Long retailerLocationId,@ApiParam(value = "The Visibility of the region", allowableValues="PUBLIC, PRIVATE, FRIENDS") @QueryParam("visibility")  String visibility,@ApiParam(value = "the categories that the region is assigned to") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "the filters that the region is assigned to") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "") @QueryParam("start")  Long start,@ApiParam(value = "") @QueryParam("end")  Long end,@ApiParam(value = "the polygon of the region") @QueryParam("polygon")  String polygon,@ApiParam(value = "the meta data of the region") @QueryParam("metaData")  String metaData,@ApiParam(value = "the latitude of the region") @QueryParam("latitude")  Double latitude,@ApiParam(value = "the longitude of the region") @QueryParam("longitude")  Double longitude,@ApiParam(value = "the version code") @QueryParam("versionCode")  Integer versionCode,@ApiParam(value = "If this is a root region or not. If true means this region has no parent regions") @QueryParam("root")  Boolean root,@ApiParam(value = "Active or inactive status of the region") @QueryParam("active")  Boolean active,@ApiParam(value = "If true clear the children and postal code lists before add new ones, otherwise just append.") @QueryParam("clearLists")  Boolean clearLists,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRegion(accountId, regionId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active, clearLists, securityContext);
    }
}
