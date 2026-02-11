package org.openapitools.api;

import org.openapitools.model.OrderResponse;
import org.openapitools.model.SirqulResponse;

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
@Path("/order")
@Api(value = "/", description = "")
public interface PurchaseOrderApi  {

    /**
     * Create Order
     *
     * Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Order", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public OrderResponse createOrder(@QueryParam("appKey") @NotNull String appKey, @QueryParam("cart") @NotNull String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode);

    /**
     * Delete Order
     *
     * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Order", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteOrder(@QueryParam("orderId") @NotNull Long orderId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Order
     *
     * Get an order record
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Order", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public OrderResponse getOrder(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("orderId") Long orderId, @QueryParam("externalOrderId") String externalOrderId);

    /**
     * Preview Order
     *
     * Previews a purchase to see the total cost before making it.
     *
     */
    @POST
    @Path("/preview")
    @Produces({ "*/*" })
    @ApiOperation(value = "Preview Order", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public OrderResponse previewOrder(@QueryParam("appKey") @NotNull String appKey, @QueryParam("cart") @NotNull String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode);

    /**
     * Search Orders
     *
     * Search on active orders by customer
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Orders", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class, responseContainer = "List") })
    public List<OrderResponse> searchOrders(@QueryParam("appKey") @NotNull String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("activeOnly") @DefaultValue("false")Boolean activeOnly, @QueryParam("ignoreCustomerFilter") @DefaultValue("false")Boolean ignoreCustomerFilter, @QueryParam("orderItemTypes") String orderItemTypes, @QueryParam("orderItemIds") String orderItemIds, @QueryParam("orderCustomTypes") String orderCustomTypes, @QueryParam("orderCustomIds") String orderCustomIds, @QueryParam("sortField") @DefaultValue("ID")String sortField, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationIds") String offerLocationIds, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("statuses") String statuses, @QueryParam("keyword") String keyword, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore);

    /**
     * Update Order
     *
     * Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Order", tags={ "Purchase Order" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public OrderResponse updateOrder(@QueryParam("orderId") @NotNull Long orderId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("cart") @NotNull String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("paymentTransactionId") Long paymentTransactionId, @QueryParam("description") String description, @QueryParam("currencyType") @DefaultValue("CASH")String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("externalDate") Long externalDate);
}
