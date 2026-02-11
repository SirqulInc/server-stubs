package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AdsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.MissionResponse;

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

@Path("/ads/find")


@io.swagger.annotations.Api(description = "the ads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AdsApi  {

    @Inject AdsApiService service;

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response adsFind( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("randomize") Boolean randomize, @NotNull @QueryParam("targetedAdsOnly") Boolean targetedAdsOnly, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("missionIds") String missionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adsFind(appKey,randomize,targetedAdsOnly,type,accountId,appVersion,latitude,longitude,device,deviceIdentifier,deviceVersion,start,limit,includeAudiences,allocatesTickets,missionIds,securityContext);
    }
}
