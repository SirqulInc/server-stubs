package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;
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
public class ParticipantsApiServiceImpl implements ParticipantsApi {
    /**
     * Process All Participant Feeds
     *
     * Processes all supported participant feeds.
     *
     */
    public SirqulResponse processAllParticipants(BigDecimal version, Long accountId, String appKey, Boolean useShortNameAsID) {
        // TODO: Implement...

        return null;
    }

    /**
     * Process Participants Feed
     *
     * Processes a participant feed or uploaded file for a specific league.
     *
     */
    public SirqulResponse processParticipants(BigDecimal version, Long accountId, String league, String appKey, Boolean useShortNameAsID, File _file) {
        // TODO: Implement...

        return null;
    }

}
