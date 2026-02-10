package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemResponse;
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
public class PurchaseItemApiServiceImpl implements PurchaseItemApi {
    /**
     * Create Purchase
     *
     * Creates a purchase item for in app purchases
     *
     */
    public PurchaseItemFullResponse createPurchaseItem(BigDecimal version, String appKey, String name, String purchaseType, String deviceId, Long accountId, String description, Integer tickets, Float price, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Purchase
     *
     * Marks the purchase item as deleted
     *
     */
    public SirqulResponse deletePurchaseItem(BigDecimal version, Long purchaseItemId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Purchase
     *
     * Get detailed information about a purchase item
     *
     */
    public PurchaseItemFullResponse getPurchaseItem(BigDecimal version, Long purchaseItemId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Purchases
     *
     * Search for purchasable items from the system
     *
     */
    public List<PurchaseItemResponse> searchPurchaseItems(BigDecimal version, String deviceId, Long accountId, String appKey, Boolean filterByBillable, String purchaseType, String serviceAction, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Purchase
     *
     * Updates a purchase item for in app purchases
     *
     */
    public PurchaseItemFullResponse updatePurchaseItem(BigDecimal version, Long purchaseItemId, String deviceId, Long accountId, String name, String description, Integer tickets, Float price, String purchaseType, String purchaseCode, String secretKey, Integer purchaseLimit, String serviceAction, Long coverAssetId, Long promoAssetId, Boolean giftable, Boolean assetable, Boolean active, Boolean allocateTickets, String ticketType, Long points, Long offerLocationId) {
        // TODO: Implement...

        return null;
    }

}
