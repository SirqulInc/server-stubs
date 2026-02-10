package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.QueueResponse;
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
public class AmqpApiServiceImpl implements AmqpApi {
    /**
     * Create Consumer
     *
     * Create a connection to an existing amqp queue and register as a consumer.
     *
     */
    public QueueResponse consumerCreate(BigDecimal version, String appKey, String name, String hostname, String username, String password, String dataMapping, String deviceId, Long accountId, Integer port, String virtualHost, String exchanger, String exchangerType, Integer workers, Boolean useSSL) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Consumer
     *
     * Update an existing amqp queue&#39;s data mapping.
     *
     */
    public QueueResponse consumerUpdate(BigDecimal version, String appKey, Long queueId, String dataMapping, String deviceId, Long accountId, Boolean useSSL) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Queue
     *
     * Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.
     *
     */
    public QueueResponse queueCreate(BigDecimal version, String appKey, String name, String deviceId, Long accountId, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete Queue
     *
     * Delete the stored queue record and close any active connections to the AMQP servers.
     *
     */
    public SirqulResponse queueDelete(BigDecimal version, Long queueId, String deviceId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Queue
     *
     * Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
     *
     */
    public QueueResponse queueGet(BigDecimal version, String deviceId, Long accountId, Long queueId, String appKey, String name, String hostname, String virtualHost) {
        // TODO: Implement...

        return null;
    }

    /**
     * Publish Queue
     *
     * Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
     *
     */
    public SirqulResponse queuePublish(BigDecimal version, String message, Long queueId, String appKey, String name, String hostname, String virtualHost) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Queue
     *
     * Get the queues setup for the BillableEntity&#39;s applications.
     *
     */
    public QueueResponse queueSearch(BigDecimal version, Long queueId, String deviceId, Long accountId, String name, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

    /**
     * Update Queue
     *
     * Update the basic AMQP queue.
     *
     */
    public QueueResponse queueUpdate(BigDecimal version, Long queueId, String deviceId, Long accountId, String appKey, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) {
        // TODO: Implement...

        return null;
    }

}
