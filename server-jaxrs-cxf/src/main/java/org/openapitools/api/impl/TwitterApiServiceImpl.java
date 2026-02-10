package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ProfileResponse;
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
public class TwitterApiServiceImpl implements TwitterApi {
    /**
     * Authorize Twitter
     *
     * Makes an authorization call to twitter for a user to login and allow any app permissions.
     *
     */
    public SirqulResponse authorizeTwitter(BigDecimal version, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Login Twitter
     *
     * Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.
     *
     */
    public ProfileResponse loginTwitter(BigDecimal version, String accessToken, String accessTokenSecret, String appKey, String responseFilters, String deviceId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
