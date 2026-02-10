package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThemeDescriptorResponse;

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
public class ThemeDescriptorApiServiceImpl implements ThemeDescriptorApi {
    /**
     * Create/Update Theme
     *
     * Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.
     *
     */
    public ThemeDescriptorResponse addOrUpdateThemeDescriptor(BigDecimal version, Boolean publicRead, Boolean publicWrite, Boolean publicDelete, Boolean publicAdd, String visibility, Boolean includeFriendGroup, Boolean completeWithDefaultValues, String deviceId, Long accountId, String gameType, Long themeDescriptorId, String title, String description, String connectionIdsToAdd, String connectionGroupIdsToAdd, String appVersion, String colorValueJson, String stringReplacerJson, String customJsonObjects, File iconImage, File sceneAtlasImage, File bgImage, File bgSound, String musicSelection, String locationDescription, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Theme
     *
     * Gets a theme.
     *
     */
    public PurchaseItemListResponse getThemeDescriptor(BigDecimal version, Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Themes
     *
     * Searches for themes.
     *
     */
    public PurchaseItemListResponse getThemeDescriptors(BigDecimal version, String filter, String sortField, Boolean descending, Integer start, Integer limit, String deviceId, Long accountId, String gameType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, String appVersion, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Theme
     *
     * Removes a theme.
     *
     */
    public SirqulResponse removeThemeDescriptor(BigDecimal version, Long themeDescriptorId, String deviceId, Long accountId, String gameType, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
