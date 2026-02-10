package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.LikableResponse;
import org.openapitools.model.SearchResponse;

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
public class LikeApiServiceImpl implements LikeApi {
    /**
     * Create Like
     *
     * Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.
     *
     */
    public LikableResponse registerLike(BigDecimal version, String likableType, Long likableId, String deviceId, Long accountId, String permissionableType, Long permissionableId, Boolean like, String app, String gameType, String appKey, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Like
     *
     * Removes a like. This will make the user \&quot;neutral\&quot;.
     *
     */
    public LikableResponse removeLike(BigDecimal version, String likableType, Long likableId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Likes
     *
     * Search for likes on a likable object.
     *
     */
    public SearchResponse searchLikes(BigDecimal version, String likableType, Long likableId, String deviceId, Long accountId, String connectionAccountIds, String sortField, Boolean descending, Long updatedSince, Long updatedBefore, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
