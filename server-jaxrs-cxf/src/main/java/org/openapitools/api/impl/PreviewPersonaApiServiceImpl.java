package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.PreviewPersonaResponse;
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
public class PreviewPersonaApiServiceImpl implements PreviewPersonaApi {
    /**
     * Create Persona
     *
     * Creates a new persona. If the given params are null those attributes will be override by null.
     *
     */
    public PreviewPersonaResponse createPersona(BigDecimal version, Long accountId, String title, String previewAccounts, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Persona
     *
     * Mark the persona for deletion.
     *
     */
    public SirqulResponse deletePersona(BigDecimal version, Long accountId, Long personaId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Persona
     *
     * Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.
     *
     */
    public PreviewPersonaResponse getPersonaList(BigDecimal version, Long accountId, Long personaId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Personas
     *
     * Search for persona that the account owns by the given account ID.
     *
     */
    public PreviewPersonaResponse searchPersona(BigDecimal version, Long accountId, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Persona
     *
     * Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.
     *
     */
    public PreviewPersonaResponse updatePersona(BigDecimal version, Long accountId, Long personaId, String title, String previewAccounts, Boolean active, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

}
