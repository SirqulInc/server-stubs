package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
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
public class FlagApiServiceImpl implements FlagApi {
    /**
     * Create Flag
     *
     * Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors
     *
     */
    public SirqulResponse createFlag(BigDecimal version, String flagableType, Long flagableId, String deviceId, Long accountId, String flagDescription, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Flag
     *
     * Deletes a flag.
     *
     */
    public SirqulResponse deleteFlag(BigDecimal version, String deviceId, Long accountId, String itemBeingFlaggedType, Long itemBeingFlaggedId, String flagableType, Long flagableId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Flag
     *
     * Gets the details on whether the user has flagged a particular flagable object.
     *
     */
    public FlagResponse getFlag(BigDecimal version, String flagableType, Long flagableId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Flag Threshold
     *
     * Get the flag threshold value on an object type for a particular application.
     *
     */
    public CountResponse getFlagThreshold(BigDecimal version, String itemBeingFlaggedType, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Flag Threshold
     *
     * Update the flag threshold on an object type for a particular application.
     *
     */
    public CountResponse updateFlagThreshold(BigDecimal version, String itemBeingFlaggedType, Long threshold, String appKey, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

}
