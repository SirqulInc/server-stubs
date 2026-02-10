package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApplicationUsageResponse;
import java.math.BigDecimal;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;

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
public class SubscriptionApiServiceImpl implements SubscriptionApi {
    /**
     * Create Subscription
     *
     * Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.
     *
     */
    public SubscriptionResponse createSubscription(BigDecimal version, Long accountId, Long planId, String promoCode) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Subscription
     *
     * Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action
     *
     */
    public SirqulResponse deleteSubscription(BigDecimal version, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Subscription
     *
     * Use the accountId to determine the associated BillableEntity.  Then get the subscription.
     *
     */
    public SubscriptionResponse getSubscription(BigDecimal version, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Subscription Plan
     *
     * Get the matched subscription plan
     *
     */
    public SubscriptionPlanResponse getSubscriptionPlan(BigDecimal version, Long planId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List Subscription Plans
     *
     * Get the matched subscription plan
     *
     */
    public List<SubscriptionPlanResponse> getSubscriptionPlans(BigDecimal version, Boolean visible, String role) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Subscription Usage
     *
     * Use the accountId to determine the associated BillableEntity.  Then get the application usage.
     *
     */
    public ApplicationUsageResponse getSubscriptionUsage(BigDecimal version, Long accountId, Long applicationId, Long start, Long end) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Subscription
     *
     * Updates the subscription for the billable entity for an account
     *
     */
    public SubscriptionResponse updateSubscription(BigDecimal version, Long accountId, Long planId, String promoCode, Boolean active) {
        // TODO: Implement...

        return null;
    }

}
