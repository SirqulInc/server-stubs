package org.openapitools.api;

import org.openapitools.model.CountResponse;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;

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
@Path("")
@Api(value = "/", description = "")
public interface TicketApi  {

    /**
     * Get Ticket Count
     *
     * Gets the ticket count.
     *
     */
    @GET
    @Path("/ticket/count")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Ticket Count", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public CountResponse getTicketCount(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("ticketType") String ticketType);

    /**
     * Get Ticket List
     *
     * Gets the list of tickets.
     *
     */
    @GET
    @Path("/ticket/getList")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Ticket List", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TicketListResponse.class) })
    public TicketListResponse getTicketList(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ticketObjectType") String ticketObjectType, @QueryParam("actionType") String actionType, @QueryParam("ticketIds") String ticketIds, @QueryParam("objectIds") String objectIds, @QueryParam("receiptTokens") String receiptTokens, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey);

    /**
     * Gift Tickets
     *
     * Gift tickets to another user.
     *
     */
    @POST
    @Path("/purchase/gift")
    @Produces({ "*/*" })
    @ApiOperation(value = "Gift Tickets", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse giftPurchase(@QueryParam("receiverAccountId") @NotNull Long receiverAccountId, @QueryParam("ticketId") @NotNull Long ticketId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetId") Long assetId, @QueryParam("customMessage") String customMessage, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey);

    /**
     * Save Ticket
     *
     * Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.
     *
     */
    @POST
    @Path("/ticket/save")
    @Produces({ "*/*" })
    @ApiOperation(value = "Save Ticket", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse saveTicket(@QueryParam("actionType") @NotNull String actionType, @QueryParam("ticketObjectType") @NotNull String ticketObjectType, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("receiptData") String receiptData, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion);

    /**
     * Save Ticket with Reciept
     *
     * Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post
     *
     */
    @POST
    @Path("/ticket/save/fileUpload")
    @Produces({ "*/*" })
    @ApiOperation(value = "Save Ticket with Reciept", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public ProfileResponse saveTicketViaFileUpload(@QueryParam("actionType") @NotNull String actionType, @QueryParam("ticketObjectType") @NotNull String ticketObjectType, @QueryParam("receiptData") @NotNull File receiptData, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion);

    /**
     * Get Ticket Offers
     *
     * Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.
     *
     */
    @GET
    @Path("/ticket/ticketoffers")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Ticket Offers", tags={ "Ticket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = TicketOfferResponse.class) })
    public TicketOfferResponse ticketOffers();
}
