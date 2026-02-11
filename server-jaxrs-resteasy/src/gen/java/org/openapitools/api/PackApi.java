package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PackApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PackResponse;
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

@Path("/pack")


@io.swagger.annotations.Api(description = "the pack API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PackApi  {

    @Inject PackApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Pack", notes = "Create a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response createPack( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("packOrder") Long packOrder, @NotNull @QueryParam("price") Integer price, @NotNull @QueryParam("highest") Boolean highest, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType,, allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE" @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPack(accountId,title,packOrder,price,highest,allocateTickets,ticketCount,description,searchTags,active,gameType,appKey,packType,sequenceType,backgroundId,imageId,startDate,endDate,authorOverride,priceType,gameLevelIds,inGame,ticketType,points,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Pack", notes = "Delete a pack.", response = SirqulResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePack( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePack(accountId,packId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Pack", notes = "Get a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response getPack( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPack(accountId,packId,includeGameData,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Packs", notes = "Search on packs.", response = PackResponse.class, responseContainer = "List", tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class, responseContainer = "List") })
    public Response searchPacks( @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="TITLE, DESCRIPTION, CREATED, UPDATED" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPacks(accountId,sortField,descending,keyword,packType,start,limit,includeGameData,includeInactive,appKey,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Pack", notes = "Update a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response updatePack( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType, @QueryParam("packOrder") Long packOrder,, allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE" @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("price") Integer price, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("highest") Boolean highest, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePack(accountId,packId,allocateTickets,ticketCount,title,description,searchTags,active,gameType,appKey,packType,packOrder,sequenceType,backgroundId,imageId,startDate,endDate,authorOverride,price,priceType,gameLevelIds,inGame,highest,ticketType,points,securityContext);
    }
}
