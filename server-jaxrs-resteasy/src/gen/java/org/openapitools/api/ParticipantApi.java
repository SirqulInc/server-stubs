package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ParticipantApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
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

@Path("/participant/process")


@io.swagger.annotations.Api(description = "the participant API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ParticipantApi  {

    @Inject ParticipantApiService service;

    @POST
    @Path("/all")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process All Participant Feeds", notes = "Processes all supported participant feeds.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response processAllParticipants( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processAllParticipants(accountId,appKey,useShortNameAsID,securityContext);
    }
    @POST
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Participants Feed", notes = "Processes a participant feed or uploaded file for a specific league.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response processParticipants( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("league") String league, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID, @QueryParam("file") File _file,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processParticipants(accountId,league,appKey,useShortNameAsID,_file,securityContext);
    }
}
