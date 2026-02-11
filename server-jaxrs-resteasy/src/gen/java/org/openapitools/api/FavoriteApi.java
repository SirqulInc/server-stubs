package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FavoriteApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/favorite")


@io.swagger.annotations.Api(description = "the favorite API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FavoriteApi  {

    @Inject FavoriteApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Favorite", notes = "Adds an offer, offer location, retailer location, or category to your favorites.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public Response addFavorite( @NotNull @QueryParam("favoritableId") Long favoritableId, @NotNull @QueryParam("favoritableType") String favoritableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addFavorite(favoritableId,favoritableType,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Favorite", notes = "Removes a favorited item from the user's favorites list.", response = SirqulResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFavorite( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("favoriteId") Long favoriteId, @QueryParam("favoritableId") Long favoritableId, @QueryParam("favoritableType") String favoritableType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFavorite(deviceId,accountId,favoriteId,favoritableId,favoritableType,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Favorite", notes = "Retrieves a single favorited item.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public Response getFavorite( @NotNull @QueryParam("favoriteId") Long favoriteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFavorite(favoriteId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Favorites", notes = "Searches on the user's favorites.", response = SearchResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response searchFavorites( @NotNull @QueryParam("favoritableType") String favoritableType, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchFavorites(favoritableType,sortField,descending,start,limit,activeOnly,returnFullResponse,deviceId,accountId,connectionAccountId,secondaryType,keyword,latitude,longitude,securityContext);
    }
    @GET
    @Path("/whois")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Who has Favorited", notes = "Searches for everyone that has favorited an item", response = AccountResponse.class, responseContainer = "List", tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountResponse.class, responseContainer = "List") })
    public Response whoHasFavorited( @NotNull @QueryParam("favoritableId") Long favoritableId, @NotNull @QueryParam("favoritableType") String favoritableType, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.whoHasFavorited(favoritableId,favoritableType,start,limit,deviceId,accountId,latitude,longitude,keyword,securityContext);
    }
}
