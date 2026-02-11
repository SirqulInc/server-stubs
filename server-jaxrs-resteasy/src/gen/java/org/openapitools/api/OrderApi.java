package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OrderApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OrderResponse;
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

@Path("/order")


@io.swagger.annotations.Api(description = "the order API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderApi  {

    @Inject OrderApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Order", notes = "Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response createOrder( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrder(appKey,cart,deviceId,accountId,description,currencyType,paymentMethodId,externalOrderId,externalPaymentId,remoteRefType,externalDate,promoCode,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Order", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOrder( @NotNull @QueryParam("orderId") Long orderId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOrder(orderId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Order", notes = "Get an order record", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response getOrder( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("orderId") Long orderId, @QueryParam("externalOrderId") String externalOrderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOrder(deviceId,accountId,orderId,externalOrderId,securityContext);
    }
    @POST
    @Path("/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Order", notes = "Previews a purchase to see the total cost before making it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response previewOrder( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.previewOrder(appKey,cart,deviceId,accountId,description,currencyType,paymentMethodId,externalOrderId,externalPaymentId,remoteRefType,externalDate,promoCode,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Orders", notes = "Search on active orders by customer", response = OrderResponse.class, responseContainer = "List", tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class, responseContainer = "List") })
    public Response searchOrders( @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("false") @QueryParam("ignoreCustomerFilter") Boolean ignoreCustomerFilter, @QueryParam("orderItemTypes") String orderItemTypes, @QueryParam("orderItemIds") String orderItemIds, @QueryParam("orderCustomTypes") String orderCustomTypes, @QueryParam("orderCustomIds") String orderCustomIds, @DefaultValue("ID") @QueryParam("sortField") String sortField, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationIds") String offerLocationIds, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("statuses") String statuses, @QueryParam("keyword") String keyword, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOrders(appKey,deviceId,accountId,start,limit,descending,activeOnly,ignoreCustomerFilter,orderItemTypes,orderItemIds,orderCustomTypes,orderCustomIds,sortField,offerTypes,specialOfferTypes,categoryIds,filterIds,offerAudienceIds,transactionAudienceIds,offerIds,offerLocationIds,retailerIds,retailerLocationIds,statuses,keyword,redeemableStartDate,redeemableEndDate,startedSince,startedBefore,endedSince,endedBefore,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Order", notes = "Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response updateOrder( @NotNull @QueryParam("orderId") Long orderId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("paymentTransactionId") Long paymentTransactionId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("externalDate") Long externalDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOrder(orderId,appKey,cart,deviceId,accountId,paymentTransactionId,description,currencyType,paymentMethodId,externalPaymentId,externalDate,securityContext);
    }
}
