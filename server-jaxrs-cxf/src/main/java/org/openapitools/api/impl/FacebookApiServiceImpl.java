package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TokenResponse;

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
public class FacebookApiServiceImpl implements FacebookApi {
    /**
     * Get Facebook Token
     *
     * Gets a user&#39;s Facebook token.
     *
     */
    public TokenResponse getToken(BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Post to Facebook
     *
     * Make Facebook posts on behalf of the user.
     *
     */
    public SirqulResponse graphInterface(BigDecimal version, String event, String deviceId, Long accountId, String permissionableType, Long permissionableId, Long assetId, String gameType, String appKey, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
