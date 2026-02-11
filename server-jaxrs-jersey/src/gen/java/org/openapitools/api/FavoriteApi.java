package org.openapitools.api;

import org.openapitools.api.FavoriteApiService;
import org.openapitools.api.factories.FavoriteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccountResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WrappedResponse;

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

@Path("/favorite")


@io.swagger.annotations.Api(description = "the favorite API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FavoriteApi  {
   private final FavoriteApiService delegate;

   public FavoriteApi(@Context ServletConfig servletContext) {
      FavoriteApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FavoriteApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FavoriteApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = FavoriteApiServiceFactory.getFavoriteApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Favorite", notes = "Adds an offer, offer location, retailer location, or category to your favorites.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class)
    })
    public Response addFavorite(@ApiParam(value = "The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}", required = true) @QueryParam("favoritableId") @NotNull  Long favoritableId,@ApiParam(value = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}", required = true) @QueryParam("favoritableType") @NotNull  String favoritableType,@ApiParam(value = "The unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addFavorite(favoritableId, favoritableType, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Favorite", notes = "Removes a favorited item from the user's favorites list.", response = SirqulResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteFavorite(@ApiParam(value = "The unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The ID of the favorite reference record (only optional if favoritableId & favoritableType is pass in instead)") @QueryParam("favoriteId")  Long favoriteId,@ApiParam(value = "The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)") @QueryParam("favoritableId")  Long favoritableId,@ApiParam(value = "The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)") @QueryParam("favoritableType")  String favoritableType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFavorite(deviceId, accountId, favoriteId, favoritableId, favoritableType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Favorite", notes = "Retrieves a single favorited item.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class)
    })
    public Response getFavorite(@ApiParam(value = "The ID of the favorite reference record", required = true) @QueryParam("favoriteId") @NotNull  Long favoriteId,@ApiParam(value = "The unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getFavorite(favoriteId, deviceId, accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Favorites", notes = "Searches on the user's favorites.", response = SearchResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class)
    })
    public Response searchFavorites(@ApiParam(value = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}", required = true) @QueryParam("favoritableType") @NotNull  String favoritableType,@ApiParam(value = "Determines what to sort the results by {CREATED, UPDATED, DISPLAY}", required = true, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, DISPLAY") @QueryParam("sortField") @NotNull  String sortField,@ApiParam(value = "Determines whether the results are in descending order", required = true) @QueryParam("descending") @NotNull  Boolean descending,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination (there is a hard limit of 1000)", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "Determines whether to only return active favorites", required = true) @QueryParam("activeOnly") @NotNull  Boolean activeOnly,@ApiParam(value = "Determines whether to return a detailed version of the response list", required = true) @QueryParam("returnFullResponse") @NotNull  Boolean returnFullResponse,@ApiParam(value = "The unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The ID of an account the user would like to view favorites for") @QueryParam("connectionAccountId")  Long connectionAccountId,@ApiParam(value = "") @QueryParam("secondaryType")  String secondaryType,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchFavorites(favoritableType, sortField, descending, start, limit, activeOnly, returnFullResponse, deviceId, accountId, connectionAccountId, secondaryType, keyword, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/whois")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Who has Favorited", notes = "Searches for everyone that has favorited an item", response = AccountResponse.class, responseContainer = "List", tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountResponse.class, responseContainer = "List")
    })
    public Response whoHasFavorited(@ApiParam(value = "The ID of the favoritableType to search on", required = true) @QueryParam("favoritableId") @NotNull  Long favoritableId,@ApiParam(value = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}", required = true) @QueryParam("favoritableType") @NotNull  String favoritableType,@ApiParam(value = "The start index for pagination", required = true) @QueryParam("start") @NotNull  Integer start,@ApiParam(value = "The limit for pagination", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "The unique ID given by the device (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account ID of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The current latitude of the user") @QueryParam("latitude")  Double latitude,@ApiParam(value = "The current longitude of the user") @QueryParam("longitude")  Double longitude,@ApiParam(value = "The keyword to limit that account list") @QueryParam("keyword")  String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.whoHasFavorited(favoritableId, favoritableType, start, limit, deviceId, accountId, latitude, longitude, keyword, securityContext);
    }
}
