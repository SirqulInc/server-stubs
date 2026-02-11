package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TicketApiService;

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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ticket")


@io.swagger.annotations.Api(description = "the ticket API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TicketApi  {

    @Inject TicketApiService service;

    @GET
    @Path("/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Count", notes = "Gets the ticket count.", response = CountResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response getTicketCount( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("ticketType") String ticketType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTicketCount(deviceId,accountId,gameType,appKey,ticketType,securityContext);
    }
    @GET
    @Path("/getList")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket List", notes = "Gets the list of tickets.", response = TicketListResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketListResponse.class) })
    public Response getTicketList( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ticketObjectType") String ticketObjectType, @QueryParam("actionType") String actionType, @QueryParam("ticketIds") String ticketIds, @QueryParam("objectIds") String objectIds, @QueryParam("receiptTokens") String receiptTokens, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTicketList(deviceId,accountId,ticketObjectType,actionType,ticketIds,objectIds,receiptTokens,gameType,appKey,securityContext);
    }
    @POST
    @Path("/save")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket", notes = "Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response saveTicket( @NotNull @QueryParam("actionType") String actionType, @NotNull @QueryParam("ticketObjectType") String ticketObjectType, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("receiptData") String receiptData, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTicket(actionType,ticketObjectType,returnNulls,deviceId,accountId,gameType,appKey,objectId,purchaseCode,receiptToken,receiptData,count,ticketType,purchaseProvider,purchaseType,returnProfileResponse,includeProfileResponse,appVersion,securityContext);
    }
    @POST
    @Path("/save/fileUpload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket with Reciept", notes = "Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response saveTicketViaFileUpload( @NotNull @QueryParam("actionType") String actionType, @NotNull @QueryParam("ticketObjectType") String ticketObjectType, @NotNull @QueryParam("receiptData") File receiptData, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTicketViaFileUpload(actionType,ticketObjectType,receiptData,returnNulls,deviceId,accountId,gameType,appKey,objectId,purchaseCode,receiptToken,count,ticketType,purchaseProvider,purchaseType,returnProfileResponse,includeProfileResponse,appVersion,securityContext);
    }
    @GET
    @Path("/ticketoffers")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Offers", notes = "Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.", response = TicketOfferResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketOfferResponse.class) })
    public Response ticketOffers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.ticketOffers(securityContext);
    }
}
