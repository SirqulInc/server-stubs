package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserPermissionsResponse;

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
public class UserPermissionsApiServiceImpl implements UserPermissionsApi {
    /**
     * Add User
     *
     * Adds a user to a permissionable object.
     *
     */
    public SirqulResponse addUsersToPermissionable(BigDecimal version, String permissionableType, Long permissionableId, String deviceId, Long accountId, Boolean read, Boolean write, Boolean delete, Boolean add, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean pending, Boolean admin, Boolean includeFriendGroup, Double latitude, Double longitude, String audienceIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Approve Permissionable
     *
     * Sets the approval status of a permissionable object.
     *
     */
    public SirqulResponse approvePermissionable(BigDecimal version, String permissionableType, Long permissionableId, String deviceId, Long accountId, String approvalStatus) {
        // TODO: Implement...

        return null;
    }

    /**
     * Leave
     *
     * Used when the user wants to leave from someone else&#39;s permissionable object
     *
     */
    public SirqulResponse leaveFromPermissionable(BigDecimal version, String permissionableType, Long permissionableId, String deviceId, Long accountId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Remove User
     *
     * Used to remove someone (assuming they have permission) from a permissionable object
     *
     */
    public SirqulResponse removeUsersFromPermissionable(BigDecimal version, String permissionableType, Long permissionableId, String deviceId, Long accountId, String connectionIds, String connectionAccountIds, String connectionGroupIds, Boolean removeFriendGroup, Double latitude, Double longitude, String audienceIds) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Permissionables
     *
     * Search on UserPermissions
     *
     */
    public List<UserPermissionsResponse> searchPermissionables(BigDecimal version, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, String keyword, String sortField, Boolean descending, Boolean pending, Boolean admin, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Permissionables by Distnace
     *
     * Search on UserPermissions by distance
     *
     */
    public List<UserPermissionsResponse> searchPermissionablesFollowingDistance(BigDecimal version, Double latitude, Double longitude, String deviceId, Long accountId, Long connectionAccountId, String connectionAccountIds, String permissionableType, Long permissionableId, Double searchRange, String keyword, Boolean pending, Boolean admin, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
