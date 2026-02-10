package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AccountResponse;
import java.math.BigDecimal;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WrappedResponse;

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
public class FavoriteApiServiceImpl implements FavoriteApi {
    /**
     * Create Favorite
     *
     * Adds an offer, offer location, retailer location, or category to your favorites.
     *
     */
    public WrappedResponse addFavorite(BigDecimal version, Long favoritableId, String favoritableType, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Favorite
     *
     * Removes a favorited item from the user&#39;s favorites list.
     *
     */
    public SirqulResponse deleteFavorite(BigDecimal version, String deviceId, Long accountId, Long favoriteId, Long favoritableId, String favoritableType) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Favorite
     *
     * Retrieves a single favorited item.
     *
     */
    public WrappedResponse getFavorite(BigDecimal version, Long favoriteId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Favorites
     *
     * Searches on the user&#39;s favorites.
     *
     */
    public SearchResponse searchFavorites(BigDecimal version, String favoritableType, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly, Boolean returnFullResponse, String deviceId, Long accountId, Long connectionAccountId, String secondaryType, String keyword, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Who has Favorited
     *
     * Searches for everyone that has favorited an item
     *
     */
    public List<AccountResponse> whoHasFavorited(BigDecimal version, Long favoritableId, String favoritableType, Integer start, Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) {
        // TODO: Implement...

        return null;
    }

}
