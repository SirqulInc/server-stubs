package org.openapitools.api;

import org.openapitools.api.ReservationApiService;
import org.openapitools.api.factories.ReservationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ReservationResponse;

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

@Path("/reservation")


@io.swagger.annotations.Api(description = "the reservation API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ReservationApi  {
   private final ReservationApiService delegate;

   public ReservationApi(@Context ServletConfig servletContext) {
      ReservationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ReservationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ReservationApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ReservationApiServiceFactory.getReservationApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Reservation", notes = "Creates a reservation on an offer object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response createReservation(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The start date") @QueryParam("startDate")  Long startDate,@ApiParam(value = "The end date") @QueryParam("endDate")  Long endDate,@ApiParam(value = "The id of the offer being added (offerId or offeLocationId required)") @QueryParam("offerId")  Long offerId,@ApiParam(value = "The id of the offer location being added (offerId or offeLocationId required)") @QueryParam("offerLocationId")  Long offerLocationId,@ApiParam(value = "The application requesting the reservation") @QueryParam("appKey")  String appKey,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createReservation(deviceId, accountId, startDate, endDate, offerId, offerLocationId, appKey, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Reservation", notes = "Deleted a reservation on a reservation object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class)
    })
    public Response deleteReservation(@ApiParam(value = "The reservation id", required = true) @QueryParam("reservationId") @NotNull  Long reservationId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteReservation(reservationId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Reservations", notes = "", response = ReservationResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReservationResponse.class, responseContainer = "List")
    })
    public Response searchReservations(@ApiParam(value = "Device Id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "Appilcation Key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the id of the logged in user") @QueryParam("accountId")  Long accountId,@ApiParam(value = "filter reservations by account ID") @QueryParam("filterAccountId")  Long filterAccountId,@ApiParam(value = "the reservation ID") @QueryParam("reservableId")  Long reservableId,@ApiParam(value = "the type of reservation", allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION") @QueryParam("reservableType")  String reservableType,@ApiParam(value = "the keyword to search the reservation on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the start date of the reservation search") @QueryParam("startDate")  Long startDate,@ApiParam(value = "the end date of the reservation search") @QueryParam("endDate")  Long endDate,@ApiParam(value = "the start of the index and/or pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the index and/or pagination", defaultValue = "100") @DefaultValue("100") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchReservations(deviceId, appKey, accountId, filterAccountId, reservableId, reservableType, keyword, startDate, endDate, start, limit, securityContext);
    }
}
