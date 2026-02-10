package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WordzWordResponse;

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
public class WordApiServiceImpl implements WordApi {
    /**
     * Create Word
     *
     * Create a word by the given params.
     *
     */
    public WordzWordResponse createWord(BigDecimal version, Long accountId, String word, String definition, Boolean active, Boolean allocateTickets, Long ticketCount, Long assetId, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Word
     *
     * Delete a word by the given id. The accountId given needs to be the owner or executive to delete.
     *
     */
    public SirqulResponse deleteWord(BigDecimal version, Long wordId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Word
     *
     * Get a word by the given id.
     *
     */
    public WordzWordResponse getWord(BigDecimal version, Long wordId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Words
     *
     * Search for words by the given params.
     *
     */
    public List<WordzWordResponse> getWords(BigDecimal version, Long accountId, String sortField, Boolean descending, Boolean activeOnly, Integer start, Integer limit, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Word
     *
     * Update a word by the given params.
     *
     */
    public WordzWordResponse updateWord(BigDecimal version, Long wordId, Long accountId, Long ticketCount, String wordText, String definition, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

}
