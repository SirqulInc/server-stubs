package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.ChartData;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.UserActivityResponse;

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
public class AnalyticsApiServiceImpl implements AnalyticsApi {
    /**
     * Get User Activity
     *
     * Get an activity feed by user.
     *
     */
    public List<UserActivityResponse> activities(BigDecimal version, Integer start, Integer limit, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Aggregated Filtered Usage
     *
     * Query analytics to get data used for nested graphs and charts
     *
     */
    public ChartData aggregatedFilteredUsage(BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, String groupByRoot, String groupBy, String distinctCount, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Filtered Usage
     *
     * Query analytics to get data used for graphs and charts
     *
     */
    public ChartData filteredUsage(BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, Long customId, String customType, Double customValue, Double customValue2, Long customLong, Long customLong2, String customMessage, String customMessage2, String groupBy, String distinctCount, String sumColumn, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Usage Record
     *
     * Record an analytic record for a known state within the application.
     *
     */
    public SirqulResponse usage(BigDecimal version, String tag, String deviceId, Long accountId, Long applicationId, String appKey, String appVersion, String device, String deviceType, String deviceOS, String model, Double latitude, Double longitude, Long customId, String customType, Long achievementIncrement, String city, String state, String country, String zip, String locationDescription, Long clientTime, String errorMessage, String ip, String userAgent, Boolean backgroundEvent, String customMessage, String customMessage2, Double customValue, Double customValue2, Long customLong, Long customLong2) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Multiple Usage Records
     *
     * Sends multiple analytics. Can be used to send in the user&#39;s stored usage when they did not have internet access. Should not include more than 100 items per batch.
     *
     */
    public SirqulResponse usageBatch(BigDecimal version, String appKey, String device, String data, String deviceId, Long accountId, String appVersion, String deviceType, String deviceOS, String model, Boolean updateRanking, Boolean returnSummaryResponse) {
        // TODO: Implement...

        return null;
    }

}
