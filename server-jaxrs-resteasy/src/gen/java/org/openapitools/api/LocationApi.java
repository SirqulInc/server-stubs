package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LocationApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CoordsResponse;
import java.io.File;
import org.openapitools.model.Location;
import org.openapitools.model.LocationSearchResponse;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TrilatCacheRequest;

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

@Path("/location")


@io.swagger.annotations.Api(description = "the location API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LocationApi  {

    @Inject LocationApiService service;

    @POST
    @Path("/trilaterate/cache")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with File", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response cacheTrilaterationData( @NotNull @QueryParam("udid") String udid, @QueryParam("sourceTime") Long sourceTime, @QueryParam("minimumSampleSize") Integer minimumSampleSize, @QueryParam("data") String data, @QueryParam("dataFile") File dataFile,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cacheTrilaterationData(udid,sourceTime,minimumSampleSize,data,dataFile,securityContext);
    }
    @POST
    @Path("/trilaterate/cache/submit")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with Rest", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response cacheTrilaterationDataGzip(@ApiParam(value = "" ) @Valid TrilatCacheRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cacheTrilaterationDataGzip(body,securityContext);
    }
    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create new location", notes = "Create a new location from a real object location.", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createLocationV2(@ApiParam(value = "" ) @Valid Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createLocationV2(body,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer Location (Consumer)", notes = "Creates a location record for an application that can support crowd sourced locations.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response createRetailerLocationConsumer( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("tags") String tags, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("metaData") String metaData, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("active") Boolean active, @QueryParam("locationType") String locationType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailerLocationConsumer(appKey,name,deviceId,accountId,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,detailsHeader,detailsBody,hours,tags,logoAssetId,picture1AssetId,picture2AssetId,categoryIds,filterIds,metaData,publicLocation,active,locationType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/ip")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by IP", notes = "Get location information based on an IP address.", response = CoordsResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CoordsResponse.class) })
    public Response getLocationByIp( @QueryParam("ip") String ip,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocationByIp(ip,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions or Postal Codes", notes = "Searches geographic locations by proximity via address or keyword.", response = LocationSearchResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LocationSearchResponse.class) })
    public Response getLocations( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("currentlatitude") Double currentlatitude, @QueryParam("currentlongitude") Double currentlongitude, @QueryParam("currentLatitude") Double currentLatitude, @QueryParam("currentLongitude") Double currentLongitude, @QueryParam("query") String query, @QueryParam("zipcode") String zipcode, @QueryParam("zipCode") String zipCode, @QueryParam("selectedMaplatitude") Double selectedMaplatitude, @QueryParam("selectedMaplongitude") Double selectedMaplongitude, @QueryParam("selectedMapLatitude") Double selectedMapLatitude, @QueryParam("selectedMapLongitude") Double selectedMapLongitude, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @DefaultValue("false") @QueryParam("useGeocode") Boolean useGeocode, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocations(deviceId,accountId,currentlatitude,currentlongitude,currentLatitude,currentLongitude,query,zipcode,zipCode,selectedMaplatitude,selectedMaplongitude,selectedMapLatitude,selectedMapLongitude,searchRange,useGeocode,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer Location (Consumer)", notes = "Gets the details of a retailer location as a consumer.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response getRetailerLocationConsumer( @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailerLocationConsumer(retailerLocationId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/rating/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Location Rating Indexes", notes = "Search for retailer locations by averages near you.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public Response searchLocationRatingIndexes( @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword, @QueryParam("locationType") String locationType,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchRange") Double searchRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnOverallRating") Boolean returnOverallRating,, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLocationRatingIndexes(categoryIds,keyword,locationType,sortField,descending,start,limit,searchRange,latitude,longitude,returnOverallRating,distanceUnit,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,securityContext);
    }
    @POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing location", notes = "Update an existing location", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateLocationV2( @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocationV2(id,body,securityContext);
    }
}
