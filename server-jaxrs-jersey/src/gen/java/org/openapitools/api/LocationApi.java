package org.openapitools.api;

import org.openapitools.api.LocationApiService;
import org.openapitools.api.factories.LocationApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/location")


@io.swagger.annotations.Api(description = "the location API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LocationApi  {
   private final LocationApiService delegate;

   public LocationApi(@Context ServletConfig servletContext) {
      LocationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LocationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LocationApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = LocationApiServiceFactory.getLocationApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/trilaterate/cache")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with File", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response cacheTrilaterationData(@ApiParam(value = "The unique identifier of the source device", required = true) @QueryParam("udid") @NotNull  String udid,@ApiParam(value = "The current timestamp of the source device") @QueryParam("sourceTime")  Long sourceTime,@ApiParam(value = "the minimum number of Edysen devices that must be used to be able to trilaterate a device") @QueryParam("minimumSampleSize")  Integer minimumSampleSize,@ApiParam(value = "The json formated sample data:  ```json {    \"count\": 2,   \"timespan\": 10,    \"samples\": [     {       \"deviceId\": \"device1\",       \"randomizedId\": true,        \"deviceSignature\": \"probe:xyz...\",        \"alternativeId\":\"adc123\",        \"rssi\": [-63, -75]     },      {       \"deviceId\": \"device2\",       \"randomizedId\": true,        \"deviceSignature\": \"probe:xyz...\",        \"alternativeId\": \"adc123\",        \"rssi\": [-83, -79]     }   ] } ``` ") @QueryParam("data")  String data,@ApiParam(value = "Binary file containing data (multipart upload)") @QueryParam("dataFile")  File dataFile,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cacheTrilaterationData(udid, sourceTime, minimumSampleSize, data, dataFile, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/trilaterate/cache/submit")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with Rest", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response cacheTrilaterationDataGzip(@ApiParam(value = "") @Valid  TrilatCacheRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cacheTrilaterationDataGzip(body, securityContext);
    }
    @javax.ws.rs.POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create new location", notes = "Create a new location from a real object location.", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response createLocationV2(@ApiParam(value = "") @Valid  Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createLocationV2(body, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer Location (Consumer)", notes = "Creates a location record for an application that can support crowd sourced locations.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class)
    })
    public Response createRetailerLocationConsumer(@ApiParam(value = "the application key", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the retailer location", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The street address of the retailer location") @QueryParam("streetAddress")  String streetAddress,@ApiParam(value = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @QueryParam("streetAddress2")  String streetAddress2,@ApiParam(value = "The city of the retailer location") @QueryParam("city")  String city,@ApiParam(value = "The state of the retailer location") @QueryParam("state")  String state,@ApiParam(value = "The postal code of the retailer location") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "the country of the retailer location") @QueryParam("country")  String country,@ApiParam(value = "The business phone") @QueryParam("businessPhone")  String businessPhone,@ApiParam(value = "The business phone extension") @QueryParam("businessPhoneExt")  String businessPhoneExt,@ApiParam(value = "The website of the retailer location") @QueryParam("website")  String website,@ApiParam(value = "The email of the retailer location") @QueryParam("email")  String email,@ApiParam(value = "A brief description about the retailer location (255 character limit)") @QueryParam("detailsHeader")  String detailsHeader,@ApiParam(value = "A detailed description about the retailer location") @QueryParam("detailsBody")  String detailsBody,@ApiParam(value = "The hours of operation") @QueryParam("hours")  String hours,@ApiParam(value = "Custom string field for doing full-text searches") @QueryParam("tags")  String tags,@ApiParam(value = "The retailer location logo asset id") @QueryParam("logoAssetId")  Long logoAssetId,@ApiParam(value = "An asset id") @QueryParam("picture1AssetId")  Long picture1AssetId,@ApiParam(value = "An asset id") @QueryParam("picture2AssetId")  Long picture2AssetId,@ApiParam(value = "Comma separated list of category IDs used to filter retailer locations by categories") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Comma separated list of filter IDs used to filter retailer locations") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Whether the location is public") @QueryParam("publicLocation")  Boolean publicLocation,@ApiParam(value = "whether the retailer location created should be active or not") @QueryParam("active")  Boolean active,@ApiParam(value = "External custom type identifier") @QueryParam("locationType")  String locationType,@ApiParam(value = "The latitude to center the search on") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The longitude to center the search on") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRetailerLocationConsumer(appKey, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, detailsHeader, detailsBody, hours, tags, logoAssetId, picture1AssetId, picture2AssetId, categoryIds, filterIds, metaData, publicLocation, active, locationType, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ip")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by IP", notes = "Get location information based on an IP address.", response = CoordsResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CoordsResponse.class)
    })
    public Response getLocationByIp(@ApiParam(value = "the ip address of the client device") @QueryParam("ip")  String ip,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLocationByIp(ip, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions or Postal Codes", notes = "Searches geographic locations by proximity via address or keyword.", response = LocationSearchResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LocationSearchResponse.class)
    })
    public Response getLocations(@ApiParam(value = "the device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated.") @QueryParam("currentlatitude")  Double currentlatitude,@ApiParam(value = "This parameter is deprecated.") @QueryParam("currentlongitude")  Double currentlongitude,@ApiParam(value = "the current latitude of the user") @QueryParam("currentLatitude")  Double currentLatitude,@ApiParam(value = "the current longitude of the user") @QueryParam("currentLongitude")  Double currentLongitude,@ApiParam(value = "the query results by keyword or address") @QueryParam("query")  String query,@ApiParam(value = "This parameter is deprecated.") @QueryParam("zipcode")  String zipcode,@ApiParam(value = "the zip code to filter results") @QueryParam("zipCode")  String zipCode,@ApiParam(value = "This parameter is deprecated.") @QueryParam("selectedMaplatitude")  Double selectedMaplatitude,@ApiParam(value = "This parameter is deprecated.") @QueryParam("selectedMaplongitude")  Double selectedMaplongitude,@ApiParam(value = "the latitude of where the search should originate from") @QueryParam("selectedMapLatitude")  Double selectedMapLatitude,@ApiParam(value = "the longitude of where the search should originate from") @QueryParam("selectedMapLongitude")  Double selectedMapLongitude,@ApiParam(value = "the search range of the search in miles", defaultValue = "5") @DefaultValue("5") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "determines whether to allow searches via address", defaultValue = "false") @DefaultValue("false") @QueryParam("useGeocode")  Boolean useGeocode,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_i")  Integer i,@ApiParam(value = "the start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "This parameter is deprecated.") @QueryParam("_l")  Integer l,@ApiParam(value = "the limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLocations(deviceId, accountId, currentlatitude, currentlongitude, currentLatitude, currentLongitude, query, zipcode, zipCode, selectedMaplatitude, selectedMaplongitude, selectedMapLatitude, selectedMapLongitude, searchRange, useGeocode, i, start, l, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer Location (Consumer)", notes = "Gets the details of a retailer location as a consumer.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class)
    })
    public Response getRetailerLocationConsumer(@ApiParam(value = "The retailer location id", required = true) @QueryParam("retailerLocationId") @NotNull  Long retailerLocationId,@ApiParam(value = "The device id for returning account information (i.e. favorites)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id for returning account information (i.e. favorites)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRetailerLocationConsumer(retailerLocationId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/rating/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Location Rating Indexes", notes = "Search for retailer locations by averages near you.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List")
    })
    public Response searchLocationRatingIndexes(@ApiParam(value = "Comma separated list of category ids to filter the results by") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The type of location to filter the results by") @QueryParam("locationType")  String locationType,@ApiParam(value = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@ApiParam(value = "The search radius in kilometers to filter results") @QueryParam("searchRange")  Double searchRange,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Determines whether to return the overall rating record instead") @QueryParam("returnOverallRating")  Boolean returnOverallRating,@ApiParam(value = "", allowableValues="MILES, KILOMETERS") @QueryParam("distanceUnit")  String distanceUnit,@ApiParam(value = "whether to return the retailer or not") @QueryParam("returnRetailer")  Boolean returnRetailer,@ApiParam(value = "whether to return the assets or not") @QueryParam("returnAssets")  Boolean returnAssets,@ApiParam(value = "whether to return the offers or not") @QueryParam("returnOffers")  Boolean returnOffers,@ApiParam(value = "whether to return the categories or not") @QueryParam("returnCategories")  Boolean returnCategories,@ApiParam(value = "whether to return the filters or not") @QueryParam("returnFilters")  Boolean returnFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchLocationRatingIndexes(categoryIds, keyword, locationType, sortField, descending, start, limit, searchRange, latitude, longitude, returnOverallRating, distanceUnit, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing location", notes = "Update an existing location", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response updateLocationV2(@ApiParam(value = "the id of the location to update", required = true) @PathParam("id") @NotNull  Long id,@ApiParam(value = "") @Valid  Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateLocationV2(id, body, securityContext);
    }
}
