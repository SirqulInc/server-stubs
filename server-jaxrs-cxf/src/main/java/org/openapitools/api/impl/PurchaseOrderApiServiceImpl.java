package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.OrderResponse;
import org.openapitools.model.SirqulResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class PurchaseOrderApiServiceImpl implements PurchaseOrderApi {
    /**
     * Create Order
     *
     * Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created
     *
     */
    public OrderResponse createOrder(BigDecimal version, String appKey, String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Order
     *
     * Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.
     *
     */
    public SirqulResponse deleteOrder(BigDecimal version, Long orderId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Order
     *
     * Get an order record
     *
     */
    public OrderResponse getOrder(BigDecimal version, String deviceId, Long accountId, Long orderId, String externalOrderId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Preview Order
     *
     * Previews a purchase to see the total cost before making it.
     *
     */
    public OrderResponse previewOrder(BigDecimal version, String appKey, String cart, String deviceId, Long accountId, String description, String currencyType, Long paymentMethodId, String externalOrderId, String externalPaymentId, String remoteRefType, Long externalDate, String promoCode) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Orders
     *
     * Search on active orders by customer
     *
     */
    public List<OrderResponse> searchOrders(BigDecimal version, String appKey, String deviceId, Long accountId, Integer start, Integer limit, Boolean descending, Boolean activeOnly, Boolean ignoreCustomerFilter, String orderItemTypes, String orderItemIds, String orderCustomTypes, String orderCustomIds, String sortField, String offerTypes, String specialOfferTypes, String categoryIds, String filterIds, String offerAudienceIds, String transactionAudienceIds, String offerIds, String offerLocationIds, String retailerIds, String retailerLocationIds, String statuses, String keyword, Long redeemableStartDate, Long redeemableEndDate, Long startedSince, Long startedBefore, Long endedSince, Long endedBefore) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Order
     *
     * Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.
     *
     */
    public OrderResponse updateOrder(BigDecimal version, Long orderId, String appKey, String cart, String deviceId, Long accountId, Long paymentTransactionId, String description, String currencyType, Long paymentMethodId, String externalPaymentId, Long externalDate) {
        // TODO: Implement...

        return null;
    }

}
