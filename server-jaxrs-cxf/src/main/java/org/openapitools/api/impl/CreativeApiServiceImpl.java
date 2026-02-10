package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.MissionResponse;
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
public class CreativeApiServiceImpl implements CreativeApi {
    /**
     * Add Preview
     *
     * Enable this ad for preview for this account.
     *
     */
    public SirqulResponse addPreview(BigDecimal version, Long accountId, Long creativeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Find Missions
     *
     * Get a set of ad filtered by the parameters provided.
     *
     */
    public List<MissionResponse> adsFind(BigDecimal version, String appKey, Boolean randomize, Boolean targetedAdsOnly, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeAudiences, Boolean allocatesTickets, String missionIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Creative
     *
     * Create a creative
     *
     */
    public CreativeResponse createCreative(BigDecimal version, Long accountId, String name, Boolean active, Boolean waitForAsset, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Long referenceId, String appVersion, Long missionId, Long offerId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Creative
     *
     * Delete a creative
     *
     */
    public SirqulResponse deleteCreative(BigDecimal version, Long accountId, Long creativeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Creative
     *
     * Get a creative
     *
     */
    public CreativeResponse getCreative(BigDecimal version, Long accountId, Long creativeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Creatives
     *
     * Get a list of levels for an application, just those the account has permissions to view.
     *
     */
    public List<CreativeResponse> getCreativesByApplication(BigDecimal version, Long accountId, String appKey, Integer start, Integer limit, Long missionId, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Preview
     *
     * Remove this ad for preview for this account.
     *
     */
    public SirqulResponse removePreview(BigDecimal version, Long accountId, Long creativeId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Creative
     *
     * Update a creative
     *
     */
    public CreativeResponse updateCreative(BigDecimal version, Long accountId, Long creativeId, String name, String description, Long assetImageId, String action, String data, String suffix, String type, Double balance, Boolean active, Long referenceId, String appVersion, Long missionId) {
        // TODO: Implement...

        return null;
    }

}
