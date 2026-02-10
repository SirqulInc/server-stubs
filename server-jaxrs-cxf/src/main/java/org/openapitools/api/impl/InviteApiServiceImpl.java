package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
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
public class InviteApiServiceImpl implements InviteApi {
    /**
     * Accept Invite
     *
     * Allows a user to accept an invite. The user could also become the inviter&#39;s friend.
     *
     */
    public ConsumerInviteResponse acceptInvite(BigDecimal version, String token, Long accountId, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey, Boolean autoFriend, Boolean autoAttendEvent, Boolean autoFavoriteOffer, Boolean autoFavoriteOfferLocation, Boolean autoFavoriteRetailerLocation) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Contest
     *
     * Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    public InviteResponse albumContestInvite(BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumContestId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Collection
     *
     * Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    public InviteResponse albumInvite(BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long albumId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Event
     *
     * Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.
     *
     */
    public InviteResponse eventInvite(BigDecimal version, Long accountId, String appKey, Long listingId, String receiverAccountIds, Long retailerLocationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Game Level
     *
     * Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    public InviteResponse gameInvite(BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long gameLevelId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Invite
     *
     * This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.
     *
     */
    public SirqulResponse getInvite(BigDecimal version, Long accountId, String token, Long albumId, Long missionId, Long albumContestId, Long offerId, Long offerLocationId, Long retailerLocationId, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Mission
     *
     * Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user&#39;s friend when the invitation is accepted.
     *
     */
    public InviteResponse missionInvite(BigDecimal version, String deviceId, Long accountId, Long appId, String appKey, Long missionId, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Offer
     *
     * Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite&#39;s list.
     *
     */
    public InviteResponse offerInvite(BigDecimal version, Long accountId, String appKey, Long offerId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Offer Location
     *
     * Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite&#39;s list.
     *
     */
    public InviteResponse offerLocationInvite(BigDecimal version, Long accountId, String appKey, Long offerLocationId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Invite to Retailer Location
     *
     * Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite&#39;s list.
     *
     */
    public InviteResponse retailerLocationInvite(BigDecimal version, Long accountId, String appKey, Long retailerLocationId, Long albumId) {
        // TODO: Implement...

        return null;
    }

}
