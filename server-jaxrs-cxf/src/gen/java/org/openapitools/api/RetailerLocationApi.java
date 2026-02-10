package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.RetailerLocationResponse;
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
@Path("/api/{version}")
@Api(value = "/", description = "")
public interface RetailerLocationApi  {

    /**
     * Create Retailer Location (Consumer)
     *
     * Creates a location record for an application that can support crowd sourced locations.
     *
     */
    @POST
    @Path("/location/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Retailer Location (Consumer)", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public RetailerLocationResponse createRetailerLocationConsumer(@PathParam("version") BigDecimal version, @QueryParam("appKey") @NotNull String appKey, @QueryParam("name") @NotNull String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("tags") String tags, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("metaData") String metaData, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("active") Boolean active, @QueryParam("locationType") String locationType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Create Retailer Location
     *
     * Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
     *
     */
    @POST
    @Path("/retailer/location/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Retailer Location", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public RetailerLocationResponse createRetailerLocations(@PathParam("version") BigDecimal version, @QueryParam("retailerId") @NotNull Long retailerId, @QueryParam("name") @NotNull String name, @QueryParam("streetAddress") @NotNull String streetAddress, @QueryParam("city") @NotNull String city, @QueryParam("state") @NotNull String state, @QueryParam("postalCode") @NotNull String postalCode, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("responseFormat") String responseFormat, @QueryParam("responseIncludes") String responseIncludes);

    /**
     * Delete Retailer Location
     *
     * Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.
     *
     */
    @POST
    @Path("/retailer/location/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Retailer Location", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteRetailerLocation(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationId") Long retailerLocationId);

    /**
     * Get Retailer Location
     *
     * Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.
     *
     */
    @GET
    @Path("/retailer/location/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Retailer Location", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public RetailerLocationResponse getRetailerLocation(@PathParam("version") BigDecimal version, @QueryParam("retailerLocationId") @NotNull Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationToken") String retailerLocationToken);

    /**
     * Get Retailer Location (Consumer)
     *
     * Gets the details of a retailer location as a consumer.
     *
     */
    @GET
    @Path("/location/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Retailer Location (Consumer)", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public RetailerLocationResponse getRetailerLocationConsumer(@PathParam("version") BigDecimal version, @QueryParam("retailerLocationId") @NotNull Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Distance Search Retailer Locations (Indexed)
     *
     * Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.
     *
     */
    @GET
    @Path("/retailer/location/idistancesearch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Distance Search Retailer Locations (Indexed)", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public List<RetailerLocationResponse> indexedRetailerLocationDistanceSearch(@PathParam("version") BigDecimal version, @QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude, @QueryParam("searchRange") @NotNull Double searchRange, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("accountId") Long accountId, @QueryParam("address") String address, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression, @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnFavorited") Boolean returnFavorited, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating);

    /**
     * Keyword Search Retailer Locations (Indexed)
     *
     * Retailer location (faster) indexed search. This searches all retailer locations.
     *
     */
    @GET
    @Path("/retailer/location/isearch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Keyword Search Retailer Locations (Indexed)", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public List<RetailerLocationResponse> indexedRetailerLocationSearch(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating);

    /**
     * Search Retailer Locations (Owned)
     *
     * Searches on retailer locations that the account has access to.
     *
     */
    @GET
    @Path("/retailer/location/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Retailer Locations (Owned)", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public List<RetailerLocationResponse> searchRetailerLocations(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("showPublicLocations") Boolean showPublicLocations, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating);

    /**
     * Update Retailer Location
     *
     * Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
     *
     */
    @POST
    @Path("/retailer/location/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Retailer Location", tags={ "Retailer Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public RetailerLocationResponse updateRetailerLocations(@PathParam("version") BigDecimal version, @QueryParam("retailerLocationId") @NotNull Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("metaData") String metaData, @QueryParam("paymentProvider") String paymentProvider, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("responseFormat") String responseFormat, @QueryParam("tags") String tags);
}
