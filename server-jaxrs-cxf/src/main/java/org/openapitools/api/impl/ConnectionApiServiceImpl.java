package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
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
public class ConnectionApiServiceImpl implements ConnectionApi {
    /**
     * Add Connection
     *
     * Adds a connection to a group.
     *
     */
    public SirqulResponse addConnectionToGroup(BigDecimal version, Boolean returnNulls, Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Add Connections
     *
     * Adds a list of connections to a group.
     *
     */
    public SirqulResponse addConnectionsToGroup(BigDecimal version, Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Add Connection Groups
     *
     * Add sub groups to a group.
     *
     */
    public ConnectionGroupResponse addSubGroups(BigDecimal version, Boolean returnNulls, Long groupId, String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create or Update Connection
     *
     * Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.
     *
     */
    public ConnectionResponse createOrUpdateConnection(BigDecimal version, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Long groupId, String gameType, String appKey, Boolean isTrusted, Boolean ignoreFriendRequest, Boolean isContact, Boolean isBlocked, Boolean isFollowing, Boolean connectionResponse) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create or Update Connection Group
     *
     * Creates a new private group.
     *
     */
    public SirqulResponse createOrUpdateGroup(BigDecimal version, Boolean returnNulls, String deviceId, Long accountId, String name, Long groupId, Long assetId, String connections, String description, Boolean canViewProfileInfo, Boolean canViewGameInfo, Boolean canViewFriendInfo, Boolean active, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Accept Follow Request
     *
     * Accept someone&#39;s follow request.
     *
     */
    public SirqulResponse followAccept(BigDecimal version, Long accountId, Long connectionAccountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Reject Follow Request
     *
     * Reject someone&#39;s follow request or remove them as a follower.
     *
     */
    public SirqulResponse followReject(BigDecimal version, Long accountId, Long connectionAccountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Follower / Unfollow
     *
     * Unfollow someone you are following or remove them as a follower.
     *
     */
    public SirqulResponse followRemove(BigDecimal version, Long accountId, Long connectionAccountId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Send Follow Request
     *
     * Send a request to follow someone.
     *
     */
    public SirqulResponse followRequest(BigDecimal version, Long accountId, Long connectionAccountId, String appKey, Boolean approvalNeeded) {
        // TODO: Implement...

        return null;
    }

    /**
     * Accept Friend
     *
     * Accept a friend request and optionally sends a notification.
     *
     */
    public SirqulResponse friendAccept(BigDecimal version, Long friendAccountId, Boolean notifyFriend, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) {
        // TODO: Implement...

        return null;
    }

    /**
     * Decline Friend
     *
     * Request a friend request and optionally sends a notification.
     *
     */
    public SirqulResponse friendReject(BigDecimal version, Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, Boolean notifyFriend, String notificationMessage) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Friend
     *
     * Removes a friend from the user&#39;s friends list.
     *
     */
    public SirqulResponse friendRemove(BigDecimal version, Long friendAccountId, String deviceId, Long accountId, Boolean notifyFriend, Boolean removeFromGroups) {
        // TODO: Implement...

        return null;
    }

    /**
     * Request Friend
     *
     * Sends a friend request notification to another user.
     *
     */
    public SirqulResponse friendRequest(BigDecimal version, Long friendAccountId, String deviceId, Long accountId, String gameType, String appKey, String notificationMessage) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Sent Friend Requests
     *
     * Gets the connection sent friend requests.
     *
     */
    public ConnectionListResponse getConnectionSentFriendRequests(BigDecimal version, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Connections
     *
     * Gets the connections.
     *
     */
    public ConnectionListResponse getConnections(BigDecimal version, Boolean returnNulls, String filter, String sortField, Boolean descending, Integer start, Integer limit, String deviceId, Long accountId, Long connectionAccountId, String q, String keyword, Integer i, Integer l, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Connection Group
     *
     */
    public ConnectionGroupResponse getGroupDetails(BigDecimal version, Boolean combineConnections, String deviceId, Long accountId, Long groupId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Connection Groups
     *
     * Gets a user&#39;s private groups and default groups.
     *
     */
    public List<ConnectionInfoResponse> groupSearch(BigDecimal version, String sortField, Boolean descending, Boolean activeOnly, Integer start, Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Connection
     *
     * Removes the connection from group.
     *
     */
    public SirqulResponse removeConnectionFromGroup(BigDecimal version, Boolean returnNulls, Long groupId, String deviceId, Long accountId, Long connectionId, Long connectionAccountId, Long pendingId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Connections
     *
     * Remove a list of connections from a group.
     *
     */
    public SirqulResponse removeConnectionsFromGroup(BigDecimal version, Long connectionGroupId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Connection Group
     *
     * Remove a user&#39;s group.
     *
     */
    public SirqulResponse removeGroup(BigDecimal version, Boolean returnNulls, Long groupId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove Connection Groups
     *
     * Remove sub groups from a group
     *
     */
    public SirqulResponse removeSubGroups(BigDecimal version, Boolean returnNulls, Long groupId, String subGroupIds, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Possible Connections
     *
     * Search for accounts that the user may not have a connection with.
     *
     */
    public ConnectionListResponse searchConnections(BigDecimal version, Boolean returnNulls, Integer start, Integer limit, String deviceId, Long accountId, String q, String keyword, Double latitude, Double longitude, String gameType, String appKey, Integer i, Integer l, String sortField, Boolean hasLocation) {
        // TODO: Implement...

        return null;
    }

}
