package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
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
public interface RatingApi  {

    /**
     * Create Rating
     *
     * This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.
     *
     */
    @POST
    @Path("/rating/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Rating", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public RatingResponse createRating(@PathParam("version") BigDecimal version, @QueryParam("ratableType") @NotNull String ratableType, @QueryParam("ratableId") @NotNull Long ratableId, @QueryParam("ratingValue") @NotNull Integer ratingValue, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Rating
     *
     * Sets a rating as deleted.
     *
     */
    @POST
    @Path("/rating/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Rating", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteRating(@PathParam("version") BigDecimal version, @QueryParam("ratingId") @NotNull Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Search Location Rating Indexes
     *
     * Search for retailer locations by averages near you.
     *
     */
    @GET
    @Path("/location/rating/index/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Location Rating Indexes", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public List<RatingIndexResponse> searchLocationRatingIndexes(@PathParam("version") BigDecimal version, @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchRange") Double searchRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnOverallRating") Boolean returnOverallRating, @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters);

    /**
     * Search Rating Indexes
     *
     * Search for ratable items by averages.
     *
     */
    @GET
    @Path("/rating/index/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Rating Indexes", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public List<RatingIndexResponse> searchRatingIndexes(@PathParam("version") BigDecimal version, @QueryParam("ratableType") @NotNull String ratableType, @QueryParam("ratableIds") String ratableIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnRatable") Boolean returnRatable, @QueryParam("returnOverallRating") Boolean returnOverallRating);

    /**
     * Search Ratings
     *
     * Search for ratings on a ratable object.
     *
     */
    @GET
    @Path("/rating/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Ratings", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class, responseContainer = "List") })
    public List<RatingResponse> searchRatings(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("ratableType") String ratableType, @QueryParam("ratableId") Long ratableId, @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit);

    /**
     * Update Rating
     *
     * Update an existing rating. Only the creator of the rating have permission to update.
     *
     */
    @POST
    @Path("/rating/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Rating", tags={ "Rating" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public RatingResponse updateRating(@PathParam("version") BigDecimal version, @QueryParam("ratingId") @NotNull Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ratingValue") Integer ratingValue, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);
}
