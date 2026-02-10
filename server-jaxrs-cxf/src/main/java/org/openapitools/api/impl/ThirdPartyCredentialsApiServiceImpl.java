package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;

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
public class ThirdPartyCredentialsApiServiceImpl implements ThirdPartyCredentialsApi {
    /**
     * Create Credential
     *
     * This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user&#39;s third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. 
     *
     */
    public ProfileResponse createCredential(BigDecimal version, String thirdPartyId, String thirdPartyToken, String networkUID, String appKey, Long accountId, String deviceId, String sessionId, String thirdPartyName, String emailAddress, Boolean signinOnlyMode, String responseFilters, Double latitude, Double longitude, String metaData, String thirdPartyRefreshToken, String audienceIdsToAdd, String audienceIdsToRemove) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Network
     *
     * Creates a custom third party network.
     *
     */
    public ThirdPartyNetworkResponse createNetwork(BigDecimal version, Long accountId, String name, Boolean enableIntrospection, String description, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, File oauthPrivateKey, File oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Credential
     *
     * Delete a third party network on a Sirqul account.
     *
     */
    public SirqulResponse deleteCredential(BigDecimal version, Long accountId, String networkUID, String thirdPartyId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Network
     *
     * Marks a custom third party network as deleted. Only the network owners and managers have access to this.
     *
     */
    public SirqulResponse deleteNetwork(BigDecimal version, Long accountId, String networkUID) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Credential
     *
     * Gets the account information given a third party token.
     *
     */
    public ProfileResponse getCredential(BigDecimal version, String networkUID, String appKey, Long accountId, String deviceId, String sessionId, Long thirdPartyCredentialId, String thirdPartyToken, String thirdPartySecret, Boolean createNewAccount, String responseFilters, Double latitude, Double longitude, String audienceIdsToAdd, String audienceIdsToRemove, Long referralAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Network
     *
     * Get the details of a third party network. Only the network owners and managers have access to this.
     *
     */
    public ThirdPartyNetworkResponse getNetwork(BigDecimal version, Long accountId, String networkUID) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Credentials
     *
     * Search on a user&#39;s linked third party networks.
     *
     */
    public List<ThirdPartyCredentialResponse> searchCredentials(BigDecimal version, Long accountId, String keyword, String networkUID, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Networks
     *
     * Search on supported third party networks and custom networks from external users.
     *
     */
    public List<ThirdPartyNetworkShortResponse> searchNetworks(BigDecimal version, Long accountId, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, String keyword, Boolean filterBillable) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send MFA Challenge
     *
     * Sends an MFA challenge (SMS or Email) for networks with MFA enabled.
     *
     */
    public SirqulResponse sendMFAChallenge(BigDecimal version, String networkUID, String appKey, String thirdPartyToken, Long thirdPartyCredentialId, String deviceId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Credential
     *
     * Updates a third-party login for an account.
     *
     */
    public ProfileResponse updateCredential(BigDecimal version, String networkUID, String thirdPartyId, String appKey, String deviceId, String thirdPartyName, String thirdPartyToken, String responseFilters, String metaData, String thirdPartyRefreshToken) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Network
     *
     * Updates a custom third party network. Only the network owners and managers have access to this.
     *
     */
    public ThirdPartyNetworkResponse updateNetwork(BigDecimal version, Long accountId, String networkUID, String name, String description, Boolean enableIntrospection, String introspectionMethod, String introspectionURL, String introspectionParams, String requiredRootField, Boolean enableMFA, Integer sizeMFA, Integer shelfLifeMFA, String oauthTokenURL, File oauthPrivateKey, File oauthPublicKey, String oauthClientId, String oauthSecretKey, String body) {
        // TODO: Implement...

        return null;
    }

}
