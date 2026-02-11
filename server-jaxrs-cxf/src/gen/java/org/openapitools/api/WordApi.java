package org.openapitools.api;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

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
@Path("/game/word")
@Api(value = "/", description = "")
public interface WordApi  {

    /**
     * Create Word
     *
     * Create a word by the given params.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Word", tags={ "Word" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public WordzWordResponse createWord(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("word") @NotNull String word, @QueryParam("definition") @NotNull String definition, @QueryParam("active") @NotNull @DefaultValue("false")Boolean active, @QueryParam("allocateTickets") @NotNull @DefaultValue("false")Boolean allocateTickets, @QueryParam("ticketCount") @NotNull @DefaultValue("0")Long ticketCount, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);

    /**
     * Delete Word
     *
     * Delete a word by the given id. The accountId given needs to be the owner or executive to delete.
     *
     */
    @DELETE
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Word", tags={ "Word" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteWord(@QueryParam("wordId") @NotNull Long wordId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Word
     *
     * Get a word by the given id.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Word", tags={ "Word" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public WordzWordResponse getWord(@QueryParam("wordId") @NotNull Long wordId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Search Words
     *
     * Search for words by the given params.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Words", tags={ "Word" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class, responseContainer = "List") })
    public List<WordzWordResponse> getWords(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("sortField") @NotNull @DefaultValue("id")String sortField, @QueryParam("descending") @NotNull @DefaultValue("false")Boolean descending, @QueryParam("activeOnly") @NotNull @DefaultValue("false")Boolean activeOnly, @QueryParam("start") @NotNull @DefaultValue("0")Integer start, @QueryParam("limit") @NotNull @DefaultValue("20")Integer limit, @QueryParam("keyword") String keyword);

    /**
     * Update Word
     *
     * Update a word by the given params.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Word", tags={ "Word" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public WordzWordResponse updateWord(@QueryParam("wordId") @NotNull Long wordId, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("ticketCount") @NotNull @DefaultValue("0")Long ticketCount, @QueryParam("wordText") String wordText, @QueryParam("definition") String definition, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points);
}
