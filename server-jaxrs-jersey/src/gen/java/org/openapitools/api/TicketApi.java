package org.openapitools.api;

import org.openapitools.api.TicketApiService;
import org.openapitools.api.factories.TicketApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CountResponse;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;

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

@Path("/ticket")


@io.swagger.annotations.Api(description = "the ticket API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TicketApi  {
   private final TicketApiService delegate;

   public TicketApi(@Context ServletConfig servletContext) {
      TicketApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TicketApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TicketApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TicketApiServiceFactory.getTicketApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Count", notes = "Gets the ticket count.", response = CountResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class)
    })
    public Response getTicketCount(@ApiParam(value = "the id of the device that owns the tickets") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the account that owns the tickets") @QueryParam("accountId")  Long accountId,@ApiParam(value = "this is deprecated.") @QueryParam("gameType")  String gameType,@ApiParam(value = "the applicationkey") @QueryParam("appKey")  String appKey,@ApiParam(value = "the type of ticket") @QueryParam("ticketType")  String ticketType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTicketCount(deviceId, accountId, gameType, appKey, ticketType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/getList")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket List", notes = "Gets the list of tickets.", response = TicketListResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketListResponse.class)
    })
    public Response getTicketList(@ApiParam(value = "the id of the device that owns the tickets") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the id of the account that owns the tickets") @QueryParam("accountId")  Long accountId,@ApiParam(value = "comma separated list of TicketObjectType") @QueryParam("ticketObjectType")  String ticketObjectType,@ApiParam(value = "comma separated list of TicketActionType") @QueryParam("actionType")  String actionType,@ApiParam(value = "the ids of the tickets to get") @QueryParam("ticketIds")  String ticketIds,@ApiParam(value = "the ids of the objects to get") @QueryParam("objectIds")  String objectIds,@ApiParam(value = "") @QueryParam("receiptTokens")  String receiptTokens,@ApiParam(value = "") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTicketList(deviceId, accountId, ticketObjectType, actionType, ticketIds, objectIds, receiptTokens, gameType, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/save")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket", notes = "Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response saveTicket(@ApiParam(value = "the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER", required = true) @QueryParam("actionType") @NotNull  String actionType,@ApiParam(value = "the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM", required = true) @QueryParam("ticketObjectType") @NotNull  String ticketObjectType,@ApiParam(value = "whether to return nulls or not") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "the device id that owns the tickets") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id that owns the tickets") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated. deprecated, use the appKey") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the ID of the item being purchased") @QueryParam("objectId")  Long objectId,@ApiParam(value = "a unique string identifier defined by the application owner or Executive") @QueryParam("purchaseCode")  String purchaseCode,@ApiParam(value = "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)") @QueryParam("receiptToken")  String receiptToken,@ApiParam(value = "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.") @QueryParam("receiptData")  String receiptData,@ApiParam(value = "the count of tickets") @QueryParam("count")  Long count,@ApiParam(value = "the ticket type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}") @QueryParam("purchaseProvider")  String purchaseProvider,@ApiParam(value = "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "returns a ProfileResponse if true, otherwise will return an AppResponse") @QueryParam("returnProfileResponse")  Boolean returnProfileResponse,@ApiParam(value = "if returnProfileResponse is false, will return an AppResponse with profile data if true") @QueryParam("includeProfileResponse")  Boolean includeProfileResponse,@ApiParam(value = "the application version") @QueryParam("appVersion")  String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveTicket(actionType, ticketObjectType, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, receiptData, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/save/fileUpload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket with Reciept", notes = "Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class)
    })
    public Response saveTicketViaFileUpload(@ApiParam(value = "the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }", required = true) @QueryParam("actionType") @NotNull  String actionType,@ApiParam(value = "the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}", required = true) @QueryParam("ticketObjectType") @NotNull  String ticketObjectType,@ApiParam(value = "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.", required = true) @QueryParam("receiptData") @NotNull  File receiptData,@ApiParam(value = "whether to return nulls or not") @QueryParam("returnNulls")  Boolean returnNulls,@ApiParam(value = "the device id") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "the account id") @QueryParam("accountId")  Long accountId,@ApiParam(value = "This parameter is deprecated. deprecated, use the appKey") @QueryParam("gameType")  String gameType,@ApiParam(value = "the application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "the ID of the item being purchased") @QueryParam("objectId")  Long objectId,@ApiParam(value = "a unique string identifier defined by the application owner or Executive") @QueryParam("purchaseCode")  String purchaseCode,@ApiParam(value = "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)") @QueryParam("receiptToken")  String receiptToken,@ApiParam(value = "the count of tickets") @QueryParam("count")  Long count,@ApiParam(value = "the ticket type") @QueryParam("ticketType")  String ticketType,@ApiParam(value = "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}") @QueryParam("purchaseProvider")  String purchaseProvider,@ApiParam(value = "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }") @QueryParam("purchaseType")  String purchaseType,@ApiParam(value = "returns a ProfileResponse if true, otherwise will return an AppResponse") @QueryParam("returnProfileResponse")  Boolean returnProfileResponse,@ApiParam(value = "if returnProfileResponse is false, will return an AppResponse with profile data if true") @QueryParam("includeProfileResponse")  Boolean includeProfileResponse,@ApiParam(value = "the application version") @QueryParam("appVersion")  String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.saveTicketViaFileUpload(actionType, ticketObjectType, receiptData, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ticketoffers")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Offers", notes = "Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.", response = TicketOfferResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketOfferResponse.class)
    })
    public Response ticketOffers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ticketOffers(securityContext);
    }
}
