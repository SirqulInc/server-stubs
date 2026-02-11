package org.openapitools.api;

import java.io.File;
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
@Path("/participant/process")
@Api(value = "/", description = "")
public interface ParticipantsApi  {

    /**
     * Process All Participant Feeds
     *
     * Processes all supported participant feeds.
     *
     */
    @POST
    @Path("/all")
    @Produces({ "*/*" })
    @ApiOperation(value = "Process All Participant Feeds", tags={ "Participants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse processAllParticipants(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID);

    /**
     * Process Participants Feed
     *
     * Processes a participant feed or uploaded file for a specific league.
     *
     */
    @POST
    
    @Produces({ "*/*" })
    @ApiOperation(value = "Process Participants Feed", tags={ "Participants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse processParticipants(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("league") @NotNull String league, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID, @QueryParam("file") File _file);
}
