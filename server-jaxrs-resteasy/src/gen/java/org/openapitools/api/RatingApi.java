package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RatingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
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

@Path("/rating")


@io.swagger.annotations.Api(description = "the rating API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingApi  {

    @Inject RatingApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Rating", notes = "This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public Response createRating( @NotNull @QueryParam("ratableType") String ratableType, @NotNull @QueryParam("ratableId") Long ratableId, @NotNull @QueryParam("ratingValue") Integer ratingValue, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRating(ratableType,ratableId,ratingValue,deviceId,accountId,categoryId,display,description,locationDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Rating", notes = "Sets a rating as deleted.", response = SirqulResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRating( @NotNull @QueryParam("ratingId") Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRating(ratingId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rating Indexes", notes = "Search for ratable items by averages.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public Response searchRatingIndexes( @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("ratableType") String ratableType, @QueryParam("ratableIds") String ratableIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnRatable") Boolean returnRatable, @QueryParam("returnOverallRating") Boolean returnOverallRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRatingIndexes(ratableType,ratableIds,categoryIds,secondaryType,keyword,sortField,descending,start,limit,latitude,longitude,returnRatable,returnOverallRating,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Ratings", notes = "Search for ratings on a ratable object.", response = RatingResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class, responseContainer = "List") })
    public Response searchRatings( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("ratableType") String ratableType, @QueryParam("ratableId") Long ratableId, @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRatings(deviceId,accountId,filterAccountId,ratableType,ratableId,categoryIds,keyword,sortField,descending,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Rating", notes = "Update an existing rating. Only the creator of the rating have permission to update.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public Response updateRating( @NotNull @QueryParam("ratingId") Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ratingValue") Integer ratingValue, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRating(ratingId,deviceId,accountId,ratingValue,categoryId,display,description,locationDescription,latitude,longitude,securityContext);
    }
}
