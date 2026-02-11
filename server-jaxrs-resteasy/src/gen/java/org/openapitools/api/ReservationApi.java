package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ReservationApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ReservationResponse;

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

@Path("/reservation")


@io.swagger.annotations.Api(description = "the reservation API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservationApi  {

    @Inject ReservationApiService service;

    @POST
    @Path("/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Reservation", notes = "Creates a reservation on an offer object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createReservation( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("appKey") String appKey, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createReservation(deviceId,accountId,startDate,endDate,offerId,offerLocationId,appKey,metaData,securityContext);
    }
    @POST
    @Path("/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Reservation", notes = "Deleted a reservation on a reservation object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteReservation( @NotNull @QueryParam("reservationId") Long reservationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteReservation(reservationId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Reservations", notes = "", response = ReservationResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReservationResponse.class, responseContainer = "List") })
    public Response searchReservations( @QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("reservableId") Long reservableId,, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchReservations(deviceId,appKey,accountId,filterAccountId,reservableId,reservableType,keyword,startDate,endDate,start,limit,securityContext);
    }
}
