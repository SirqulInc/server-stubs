package org.openapitools.api;

import org.openapitools.model.PackResponse;
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
@Path("/pack")
@Api(value = "/", description = "")
public interface PackApi  {

    /**
     * Create Pack
     *
     * Create a pack.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Pack", tags={ "Pack" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public PackResponse createPack(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("title") @NotNull String title, @QueryParam("packOrder") @NotNull Long packOrder, @QueryParam("price") @NotNull Integer price, @QueryParam("highest") @NotNull Boolean highest, @QueryParam("allocateTickets") @NotNull Boolean allocateTickets, @QueryParam("ticketCount") @NotNull Long ticketCount, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("packType") String packType, @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);

    /**
     * Delete Pack
     *
     * Delete a pack.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Pack", tags={ "Pack" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deletePack(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("packId") @NotNull Long packId);

    /**
     * Get Pack
     *
     * Get a pack.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Pack", tags={ "Pack" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public PackResponse getPack(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("packId") @NotNull Long packId, @QueryParam("includeGameData") @NotNull Boolean includeGameData);

    /**
     * Search Packs
     *
     * Search on packs.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Packs", tags={ "Pack" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PackResponse.class, responseContainer = "List") })
    public List<PackResponse> searchPacks(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull String sortField, @QueryParam("descending") @NotNull Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("packType") String packType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("appKey") String appKey);

    /**
     * Update Pack
     *
     * Update a pack.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Pack", tags={ "Pack" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public PackResponse updatePack(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("packId") @NotNull Long packId, @QueryParam("allocateTickets") @NotNull Boolean allocateTickets, @QueryParam("ticketCount") @NotNull Long ticketCount, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("packType") String packType, @QueryParam("packOrder") Long packOrder, @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("price") Integer price, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("highest") Boolean highest, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);
}
