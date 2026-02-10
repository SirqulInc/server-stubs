package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.PackResponse;
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
public class PackApiServiceImpl implements PackApi {
    /**
     * Create Pack
     *
     * Create a pack.
     *
     */
    public PackResponse createPack(BigDecimal version, Long accountId, String title, Long packOrder, Integer price, Boolean highest, Boolean allocateTickets, Long ticketCount, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, String priceType, String gameLevelIds, Boolean inGame, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Pack
     *
     * Delete a pack.
     *
     */
    public SirqulResponse deletePack(BigDecimal version, Long accountId, Long packId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Pack
     *
     * Get a pack.
     *
     */
    public PackResponse getPack(BigDecimal version, Long accountId, Long packId, Boolean includeGameData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Packs
     *
     * Search on packs.
     *
     */
    public List<PackResponse> searchPacks(BigDecimal version, Long accountId, String sortField, Boolean descending, String keyword, String packType, Integer start, Integer limit, Boolean includeGameData, Boolean includeInactive, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Pack
     *
     * Update a pack.
     *
     */
    public PackResponse updatePack(BigDecimal version, Long accountId, Long packId, Boolean allocateTickets, Long ticketCount, String title, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, Long packOrder, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, Integer price, String priceType, String gameLevelIds, Boolean inGame, Boolean highest, String ticketType, Long points) {
        // TODO: Implement...

        return null;
    }

}
