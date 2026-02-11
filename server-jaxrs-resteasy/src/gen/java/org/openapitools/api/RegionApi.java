package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RegionApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RegionResponse;

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

@Path("/region")


@io.swagger.annotations.Api(description = "the region API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RegionApi  {

    @Inject RegionApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Region", notes = "Create a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response createRegion( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionClass") String regionClass, @NotNull @QueryParam("shortName") String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRegion(accountId,regionClass,shortName,fullName,parentIds,childrenIds,postalCodeIds,locations,retailerLocationId,visibility,categoryIds,filterIds,start,end,polygon,metaData,latitude,longitude,versionCode,root,active,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Region", notes = "Delete a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response deleteRegion( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionId") Long regionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRegion(accountId,regionId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Region", notes = "Get a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response getRegion( @NotNull @QueryParam("regionId") Long regionId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRegion(regionId,accountId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions", notes = "Get the list of regions.", response = RegionResponse.class, responseContainer = "List", tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class, responseContainer = "List") })
    public Response searchRegions( @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range,, allowableValues="NATIONAL, STATE, COUNTY, METRO_AREA, CITY, NEIGHBORHOOD, TERRITORY, CUSTOM, ZONE" @QueryParam("regionClass") String regionClass,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility,, allowableValues="RDS, LUCENE, CLOUDINDEX" @QueryParam("searchMode") String searchMode,, allowableValues="ID, UPDATED, NAME, DISTANCE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeParent") Boolean includeParent, @QueryParam("includeChildren") Boolean includeChildren, @QueryParam("includePostalCodes") Boolean includePostalCodes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("versionCode") Integer versionCode, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("showDeleted") Boolean showDeleted, @QueryParam("lastUpdatedSince") Long lastUpdatedSince, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRegions(accountId,query,keyword,latitude,longitude,range,regionClass,visibility,searchMode,sortField,descending,includeParent,includeChildren,includePostalCodes,categoryIds,filterIds,versionCode,activeOnly,showDeleted,lastUpdatedSince,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Region", notes = "Update a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response updateRegion( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionId") Long regionId, @QueryParam("regionClass") String regionClass, @QueryParam("shortName") String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active, @QueryParam("clearLists") Boolean clearLists,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRegion(accountId,regionId,regionClass,shortName,fullName,parentIds,childrenIds,postalCodeIds,locations,retailerLocationId,visibility,categoryIds,filterIds,start,end,polygon,metaData,latitude,longitude,versionCode,root,active,clearLists,securityContext);
    }
}
