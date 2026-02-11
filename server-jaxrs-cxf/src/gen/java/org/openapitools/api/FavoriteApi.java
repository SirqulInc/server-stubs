package org.openapitools.api;

import org.openapitools.model.AccountResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WrappedResponse;

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
@Path("/favorite")
@Api(value = "/", description = "")
public interface FavoriteApi  {

    /**
     * Create Favorite
     *
     * Adds an offer, offer location, retailer location, or category to your favorites.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Favorite", tags={ "Favorite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public WrappedResponse addFavorite(@QueryParam("favoritableId") @NotNull Long favoritableId, @QueryParam("favoritableType") @NotNull String favoritableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Delete Favorite
     *
     * Removes a favorited item from the user&#39;s favorites list.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Favorite", tags={ "Favorite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteFavorite(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("favoriteId") Long favoriteId, @QueryParam("favoritableId") Long favoritableId, @QueryParam("favoritableType") String favoritableType);

    /**
     * Get Favorite
     *
     * Retrieves a single favorited item.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Favorite", tags={ "Favorite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public WrappedResponse getFavorite(@QueryParam("favoriteId") @NotNull Long favoriteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Search Favorites
     *
     * Searches on the user&#39;s favorites.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Favorites", tags={ "Favorite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public SearchResponse searchFavorites(@QueryParam("favoritableType") @NotNull String favoritableType, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("activeOnly") @NotNull Boolean activeOnly, @QueryParam("returnFullResponse") @NotNull Boolean returnFullResponse, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * Who has Favorited
     *
     * Searches for everyone that has favorited an item
     *
     */
    @GET
    @Path("/whois")
    @Produces({ "*/*" })
    @ApiOperation(value = "Who has Favorited", tags={ "Favorite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AccountResponse.class, responseContainer = "List") })
    public List<AccountResponse> whoHasFavorited(@QueryParam("favoritableId") @NotNull Long favoritableId, @QueryParam("favoritableType") @NotNull String favoritableType, @QueryParam("start") @NotNull Integer start, @QueryParam("limit") @NotNull Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword);
}
