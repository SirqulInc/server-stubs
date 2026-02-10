package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BidResponse;
import java.math.BigDecimal;
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
public class BidApiServiceImpl implements BidApi {
    /**
     * Create Bid
     *
     * Creates a bid on a biddable object
     *
     */
    public BidResponse createBid(BigDecimal version, String biddableType, Long biddableId, Double amountPerView, Double amountPerAction, Double budgetAmount, String budgetSchedule, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Bid
     *
     * Deleted a bid on a biddable object
     *
     */
    public SirqulResponse deleteBid(BigDecimal version, Long bidId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Bid
     *
     * Get the bid details of a biddable object
     *
     */
    public BidResponse getBid(BigDecimal version, Long bidId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Bid
     *
     * Updates a bid on a biddable object
     *
     */
    public BidResponse updateBid(BigDecimal version, Long bidId, String deviceId, Long accountId, Double amountPerView, Double amountPerAction, Double budgetAmount, String budgetSchedule) {
        // TODO: Implement...

        return null;
    }

}
