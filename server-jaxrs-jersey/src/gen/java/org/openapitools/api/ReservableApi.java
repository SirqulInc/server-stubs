package org.openapitools.api;

import org.openapitools.api.ReservableApiService;
import org.openapitools.api.factories.ReservableApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.TimeSlotResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/reservable")


@io.swagger.annotations.Api(description = "the reservable API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservableApi  {
   private final ReservableApiService delegate;

   public ReservableApi(@Context ServletConfig servletContext) {
      ReservableApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReservableApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReservableApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ReservableApiServiceFactory.getReservableApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/availability/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List")
    })
    public Response reservableAvailability(@ApiParam(value = "the id of the reservation", required = true) @QueryParam("reservableId") @NotNull  Long reservableId,@ApiParam(value = "the type of reservation", required = true, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION") @QueryParam("reservableType") @NotNull  String reservableType,@ApiParam(value = "the device id of the reservation") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Availability") @QueryParam("availability")  String availability,@ApiParam(value = "Availability Summary") @QueryParam("availabilitySummary")  String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.reservableAvailability(reservableId, reservableType, deviceId, accountId, availability, availabilitySummary, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/availability/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List")
    })
    public Response searchAvailability(@ApiParam(value = "the id of the reservation", required = true) @QueryParam("reservableId") @NotNull  Long reservableId,@ApiParam(value = "the reservable type", required = true, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION") @QueryParam("reservableType") @NotNull  String reservableType,@ApiParam(value = "the device ID that the reservation is on") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the start date of the reservation") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date of the reservation") @QueryParam("endDate")  Long endDate,@ApiParam(value = "the start of the index and/or pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the index and/or pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchAvailability(reservableId, reservableType, deviceId, accountId, startDate, endDate, start, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Schedule", notes = "", response = TimeSlotResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TimeSlotResponse.class, responseContainer = "List")
    })
    public Response searchSchedule(@ApiParam(value = "the id of the reservation", required = true) @QueryParam("reservableId") @NotNull  Long reservableId,@ApiParam(value = "the reservation type", required = true, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION") @QueryParam("reservableType") @NotNull  String reservableType,@ApiParam(value = "the start date of the reservation", required = true) @QueryParam("startDate") @NotNull  Long startDate,@ApiParam(value = "the end date of the reservation", required = true) @QueryParam("endDate") @NotNull  Long endDate,@ApiParam(value = "the id of the device that the reservation is on") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "the length of time in minutes to search on for reservation", defaultValue = "30") @DefaultValue("30") @QueryParam("timeBucketMins")  Integer timeBucketMins,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchSchedule(reservableId, reservableType, startDate, endDate, deviceId, accountId, timeBucketMins, securityContext);
    }
}
