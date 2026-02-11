package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ReservableApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.TimeSlotResponse;

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

@Path("/reservable")


@io.swagger.annotations.Api(description = "the reservable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservableApi  {

    @Inject ReservableApiService service;

    @POST
    @Path("/availability/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public Response reservableAvailability( @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reservableAvailability(reservableId,reservableType,deviceId,accountId,availability,availabilitySummary,securityContext);
    }
    @GET
    @Path("/availability/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public Response searchAvailability( @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAvailability(reservableId,reservableType,deviceId,accountId,startDate,endDate,start,limit,securityContext);
    }
    @GET
    @Path("/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Schedule", notes = "", response = TimeSlotResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TimeSlotResponse.class, responseContainer = "List") })
    public Response searchSchedule( @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("30") @QueryParam("timeBucketMins") Integer timeBucketMins,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchSchedule(reservableId,reservableType,startDate,endDate,deviceId,accountId,timeBucketMins,securityContext);
    }
}
