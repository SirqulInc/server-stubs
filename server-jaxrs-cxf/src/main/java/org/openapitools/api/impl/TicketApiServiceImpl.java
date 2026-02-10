package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CountResponse;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;

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
public class TicketApiServiceImpl implements TicketApi {
    /**
     * Get Ticket Count
     *
     * Gets the ticket count.
     *
     */
    public CountResponse getTicketCount(BigDecimal version, String deviceId, Long accountId, String gameType, String appKey, String ticketType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Ticket List
     *
     * Gets the list of tickets.
     *
     */
    public TicketListResponse getTicketList(BigDecimal version, String deviceId, Long accountId, String ticketObjectType, String actionType, String ticketIds, String objectIds, String receiptTokens, String gameType, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Gift Tickets
     *
     * Gift tickets to another user.
     *
     */
    public SirqulResponse giftPurchase(BigDecimal version, Long receiverAccountId, Long ticketId, String deviceId, Long accountId, Long assetId, String customMessage, String gameType, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Save Ticket
     *
     * Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.
     *
     */
    public ProfileResponse saveTicket(BigDecimal version, String actionType, String ticketObjectType, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, String receiptData, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) {
        // TODO: Implement...

        return null;
    }

    /**
     * Save Ticket with Reciept
     *
     * Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post
     *
     */
    public ProfileResponse saveTicketViaFileUpload(BigDecimal version, String actionType, String ticketObjectType, File receiptData, Boolean returnNulls, String deviceId, Long accountId, String gameType, String appKey, Long objectId, String purchaseCode, String receiptToken, Long count, String ticketType, String purchaseProvider, String purchaseType, Boolean returnProfileResponse, Boolean includeProfileResponse, String appVersion) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Ticket Offers
     *
     * Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.
     *
     */
    public TicketOfferResponse ticketOffers(BigDecimal version) {
        // TODO: Implement...

        return null;
    }

}
