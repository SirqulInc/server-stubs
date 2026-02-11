package org.openapitools.api;

import org.openapitools.api.RatingApiService;
import org.openapitools.api.factories.RatingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
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

@Path("/rating")


@io.swagger.annotations.Api(description = "the rating API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RatingApi  {
   private final RatingApiService delegate;

   public RatingApi(@Context ServletConfig servletContext) {
      RatingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RatingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RatingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RatingApiServiceFactory.getRatingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Rating", notes = "This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class)
    })
    public Response createRating(@ApiParam(value = "The ratable object type {RETAILER_LOCATION}", required = true) @QueryParam("ratableType") @NotNull  String ratableType,@ApiParam(value = "The id of the ratable object", required = true) @QueryParam("ratableId") @NotNull  Long ratableId,@ApiParam(value = "The integer value of 0-100", required = true) @QueryParam("ratingValue") @NotNull  Integer ratingValue,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "") @QueryParam("categoryId")  Long categoryId,@ApiParam(value = "A subject title for the user rating (limited to 255 characters)") @QueryParam("display")  String display,@ApiParam(value = "The description of the rating") @QueryParam("description")  String description,@ApiParam(value = "The description of the location") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRating(ratableType, ratableId, ratingValue, deviceId, accountId, categoryId, display, description, locationDescription, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Rating", notes = "Sets a rating as deleted.", response = SirqulResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteRating(@ApiParam(value = "The ID of the rating to delete", required = true) @QueryParam("ratingId") @NotNull  Long ratingId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRating(ratingId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rating Indexes", notes = "Search for ratable items by averages.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List")
    })
    public Response searchRatingIndexes(@ApiParam(value = "Filter results by a ratable type {RETAILER_LOCATION}", required = true, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION") @QueryParam("ratableType") @NotNull  String ratableType,@ApiParam(value = "Comma separated list of ratable ids to filter the resuts by") @QueryParam("ratableIds")  String ratableIds,@ApiParam(value = "Comma separated list of category ids to filter the results by") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "") @QueryParam("secondaryType")  String secondaryType,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("latitude")  Double latitude,@ApiParam(value = "") @QueryParam("longitude")  Double longitude,@ApiParam(value = "Determines whether to return the ratable object in the response") @QueryParam("returnRatable")  Boolean returnRatable,@ApiParam(value = "Determines whether to return the overall rating record instead") @QueryParam("returnOverallRating")  Boolean returnOverallRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRatingIndexes(ratableType, ratableIds, categoryIds, secondaryType, keyword, sortField, descending, start, limit, latitude, longitude, returnRatable, returnOverallRating, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Ratings", notes = "Search for ratings on a ratable object.", response = RatingResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class, responseContainer = "List")
    })
    public Response searchRatings(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Filter results for a particular account") @QueryParam("filterAccountId")  Long filterAccountId,@ApiParam(value = "The ratable object type {RETAILER_LOCATION}") @QueryParam("ratableType")  String ratableType,@ApiParam(value = "The id of the ratable object") @QueryParam("ratableId")  Long ratableId,@ApiParam(value = "Comma separated list of category ids to filter the results by") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the search results") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The record to begin the return set on") @QueryParam("start")  Integer start,@ApiParam(value = "The number of records to return") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchRatings(deviceId, accountId, filterAccountId, ratableType, ratableId, categoryIds, keyword, sortField, descending, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Rating", notes = "Update an existing rating. Only the creator of the rating have permission to update.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class)
    })
    public Response updateRating(@ApiParam(value = "The id of the rating (Note: this is not the ratable object id)", required = true) @QueryParam("ratingId") @NotNull  Long ratingId,@ApiParam(value = "The unique device identifier that made the request (either deviceId or accountId must be used)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The unique accountId that made the request (either deviceId or accountId must be used)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The rating value to update") @QueryParam("ratingValue")  Integer ratingValue,@ApiParam(value = "") @QueryParam("categoryId")  Long categoryId,@ApiParam(value = "A subject title for the user rating (limited to 255 characters)") @QueryParam("display")  String display,@ApiParam(value = "The description of the rating") @QueryParam("description")  String description,@ApiParam(value = "The description of the location") @QueryParam("locationDescription")  String locationDescription,@ApiParam(value = "The current location of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current location of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRating(ratingId, deviceId, accountId, ratingValue, categoryId, display, description, locationDescription, latitude, longitude, securityContext);
    }
}
