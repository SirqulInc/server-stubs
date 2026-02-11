package org.openapitools.api;

import org.openapitools.api.OrderApiService;
import org.openapitools.api.factories.OrderApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.OrderResponse;
import org.openapitools.model.SirqulResponse;

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

@Path("/order")


@io.swagger.annotations.Api(description = "the order API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrderApi  {
   private final OrderApiService delegate;

   public OrderApi(@Context ServletConfig servletContext) {
      OrderApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrderApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrderApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OrderApiServiceFactory.getOrderApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Order", notes = "Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class)
    })
    public Response createOrder(@ApiParam(value = "The application requesting the purchase", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "```json [   { \"orderItemType\": \"OFFER\", \"orderItemId\": 234, \"orderCustomType\": \"OfferLocation\", \"orderCustomId\": 123, \"retailerLocationId\": 1234, \"quantity\": 2 },   { \"orderItemType\": \"OFFER\", \"orderItemId\": 235, \"quantity\": 2 },   { \"orderItemType\": \"CUSTOM\", \"amount\": 10.50, \"orderCustomType\": \"ServiceFee\" },   { \"orderItemType\": \"CUSTOM\", \"amount\": 25.10, \"quantity\": 2, \"orderCustomType\": \"Hat\", \"orderCustomId\": 123 } ] ``` ", required = true) @QueryParam("cart") @NotNull  String cart,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "A description of the purchase") @QueryParam("description")  String description,@ApiParam(value = "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ", allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Use a specific payment method (CASH), if not provided use default") @QueryParam("paymentMethodId")  Long paymentMethodId,@ApiParam(value = "Store identifier from external system") @QueryParam("externalOrderId")  String externalOrderId,@ApiParam(value = "Store identifier from external system") @QueryParam("externalPaymentId")  String externalPaymentId,@ApiParam(value = "Remote Reference type") @QueryParam("remoteRefType")  String remoteRefType,@ApiParam(value = "External Date") @QueryParam("externalDate")  Long externalDate,@ApiParam(value = "The Promo Code") @QueryParam("promoCode")  String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createOrder(appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Order", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteOrder(@ApiParam(value = "Order Id", required = true) @QueryParam("orderId") @NotNull  Long orderId,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteOrder(orderId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Order", notes = "Get an order record", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class)
    })
    public Response getOrder(@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The order id to get details of, either orderId or externalOrderId must be provided") @QueryParam("orderId")  Long orderId,@ApiParam(value = "The external order id to get details of, either orderId or externalOrderId must be provided") @QueryParam("externalOrderId")  String externalOrderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getOrder(deviceId, accountId, orderId, externalOrderId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Order", notes = "Previews a purchase to see the total cost before making it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class)
    })
    public Response previewOrder(@ApiParam(value = "The application requesting the purchase", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "A JSON list of items to purchase", required = true) @QueryParam("cart") @NotNull  String cart,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "A description of the purchase") @QueryParam("description")  String description,@ApiParam(value = "Determines the method of purchasing offer. ```json {   \"VOID\": \"used for when there is no payment involved (ie. for updating the status of a purchase order)\",   \"CASH\": \"use card on file\",   \"POINTS\": \"use account balance\",   \"TICKETS\": \"use tickets\",   \"REFUND\": \"not allowed for a create, requires a paymentTransactionId\",   \"CREDIT\": \"add to the account balance\",   \"RELOAD\": \"charge a credit card then add to the account balance\" } ``` ", allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Use a specific payment method (CASH), if not provided use default") @QueryParam("paymentMethodId")  Long paymentMethodId,@ApiParam(value = "Store identifier from external system") @QueryParam("externalOrderId")  String externalOrderId,@ApiParam(value = "Store identifier from external system") @QueryParam("externalPaymentId")  String externalPaymentId,@ApiParam(value = "Remote Reference type") @QueryParam("remoteRefType")  String remoteRefType,@ApiParam(value = "External Date") @QueryParam("externalDate")  Long externalDate,@ApiParam(value = "The Promo Code") @QueryParam("promoCode")  String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.previewOrder(appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Orders", notes = "Search on active orders by customer", response = OrderResponse.class, responseContainer = "List", tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class, responseContainer = "List")
    })
    public Response searchOrders(@ApiParam(value = "The application requesting the purchase", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The start index for pagination", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The limit for pagination", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Determines whether to return the resulting list in descending or ascending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "Only return active orders", defaultValue = "false") @DefaultValue("false") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Determines whether to ignore the customer filter (requires an Admin/Exec account)", defaultValue = "false") @DefaultValue("false") @QueryParam("ignoreCustomerFilter")  Boolean ignoreCustomerFilter,@ApiParam(value = "Filter results by orderItemTypes") @QueryParam("orderItemTypes")  String orderItemTypes,@ApiParam(value = "Filter results by orderItemIds") @QueryParam("orderItemIds")  String orderItemIds,@ApiParam(value = "Filter results by orderCustomTypes") @QueryParam("orderCustomTypes")  String orderCustomTypes,@ApiParam(value = "Filter results by orderCustomIds") @QueryParam("orderCustomIds")  String orderCustomIds,@ApiParam(value = "Determines what to sort the results by", defaultValue = "ID") @DefaultValue("ID") @QueryParam("sortField")  String sortField,@ApiParam(value = "Filter results by offer type") @QueryParam("offerTypes")  String offerTypes,@ApiParam(value = "Filter results by special offer type") @QueryParam("specialOfferTypes")  String specialOfferTypes,@ApiParam(value = "Filter results by category Ids") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "Filter results by filter Ids") @QueryParam("filterIds")  String filterIds,@ApiParam(value = "Filter results by offer audience Ids") @QueryParam("offerAudienceIds")  String offerAudienceIds,@ApiParam(value = "Filter results by transaction audience Ids") @QueryParam("transactionAudienceIds")  String transactionAudienceIds,@ApiParam(value = "Filter results by offer Ids") @QueryParam("offerIds")  String offerIds,@ApiParam(value = "Filter results by offer location Ids") @QueryParam("offerLocationIds")  String offerLocationIds,@ApiParam(value = "Filter results by retailer Ids") @QueryParam("retailerIds")  String retailerIds,@ApiParam(value = "Filter results by retailer location Ids") @QueryParam("retailerLocationIds")  String retailerLocationIds,@ApiParam(value = "Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)") @QueryParam("statuses")  String statuses,@ApiParam(value = "The keyword to search for") @QueryParam("keyword")  String keyword,@ApiParam(value = "Filter results by the offer redeemable date") @QueryParam("redeemableStartDate")  Long redeemableStartDate,@ApiParam(value = "Filter results by the offer redeemable date") @QueryParam("redeemableEndDate")  Long redeemableEndDate,@ApiParam(value = "Filter results by the offer start date") @QueryParam("startedSince")  Long startedSince,@ApiParam(value = "Filter results by the offer start date") @QueryParam("startedBefore")  Long startedBefore,@ApiParam(value = "Filter results by the offer end date") @QueryParam("endedSince")  Long endedSince,@ApiParam(value = "Filter results by the offer end date") @QueryParam("endedBefore")  Long endedBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchOrders(appKey, deviceId, accountId, start, limit, descending, activeOnly, ignoreCustomerFilter, orderItemTypes, orderItemIds, orderCustomTypes, orderCustomIds, sortField, offerTypes, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, offerIds, offerLocationIds, retailerIds, retailerLocationIds, statuses, keyword, redeemableStartDate, redeemableEndDate, startedSince, startedBefore, endedSince, endedBefore, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Order", notes = "Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class)
    })
    public Response updateOrder(@ApiParam(value = "The order to add the purchase to, leave null for new order.", required = true) @QueryParam("orderId") @NotNull  Long orderId,@ApiParam(value = "The application requesting the purchase", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "```json [   { \"orderItemType\": \"OFFER\", \"orderItemId\": 234, \"orderCustomType\": \"OfferLocation\", \"orderCustomId\": 123, \"retailerLocationId\": 1234, \"quantity\": 2 },   { \"orderItemType\": \"OFFER\", \"orderItemId\": 235, \"quantity\": 2 },   { \"orderItemType\": \"CUSTOM\", \"amount\": 10.50, \"orderCustomType\": \"ServiceFee\" },   { \"orderItemType\": \"CUSTOM\", \"amount\": 25.10, \"quantity\": 2, \"orderCustomType\": \"Hat\", \"orderCustomId\": 123 } ] ``` ", required = true) @QueryParam("cart") @NotNull  String cart,@ApiParam(value = "The device id (deviceId or accountId required)") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The account id of the user (deviceId or accountId required)") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The payment transaction to apply the refund to") @QueryParam("paymentTransactionId")  Long paymentTransactionId,@ApiParam(value = "A description of the purchase") @QueryParam("description")  String description,@ApiParam(value = "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ", allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD", defaultValue = "CASH") @DefaultValue("CASH") @QueryParam("currencyType")  String currencyType,@ApiParam(value = "Use a specific payment method (CASH), if not provided use default") @QueryParam("paymentMethodId")  Long paymentMethodId,@ApiParam(value = "Store identifier from external system") @QueryParam("externalPaymentId")  String externalPaymentId,@ApiParam(value = "External Date") @QueryParam("externalDate")  Long externalDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateOrder(orderId, appKey, cart, deviceId, accountId, paymentTransactionId, description, currencyType, paymentMethodId, externalPaymentId, externalDate, securityContext);
    }
}
