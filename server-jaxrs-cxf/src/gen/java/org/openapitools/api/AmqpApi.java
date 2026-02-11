package org.openapitools.api;

import org.openapitools.model.QueueResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/queue")
@Api(value = "/", description = "")
public interface AmqpApi  {

    /**
     * Create Consumer
     *
     * Create a connection to an existing amqp queue and register as a consumer.
     *
     */
    @POST
    @Path("/consumer/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Consumer", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse consumerCreate(@QueryParam("appKey") @NotNull String appKey, @QueryParam("name") @NotNull String name, @QueryParam("hostname") @NotNull String hostname, @QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password, @QueryParam("dataMapping") @NotNull String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("port") @DefaultValue("5672")Integer port, @QueryParam("virtualHost") String virtualHost, @QueryParam("exchanger") String exchanger, @QueryParam("exchangerType") String exchangerType, @QueryParam("workers") @DefaultValue("1")Integer workers, @QueryParam("useSSL") Boolean useSSL);

    /**
     * Update Consumer
     *
     * Update an existing amqp queue&#39;s data mapping.
     *
     */
    @POST
    @Path("/consumer/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Consumer", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse consumerUpdate(@QueryParam("appKey") @NotNull String appKey, @QueryParam("queueId") @NotNull Long queueId, @QueryParam("dataMapping") @NotNull String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("useSSL") Boolean useSSL);

    /**
     * Create Queue
     *
     * Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse queueCreate(@QueryParam("appKey") @NotNull String appKey, @QueryParam("name") @NotNull String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("workers") @DefaultValue("1")Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL);

    /**
     * Delete Queue
     *
     * Delete the stored queue record and close any active connections to the AMQP servers.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse queueDelete(@QueryParam("queueId") @NotNull Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId);

    /**
     * Get Queue
     *
     * Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse queueGet(@QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost);

    /**
     * Publish Queue
     *
     * Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
     *
     */
    @POST
    @Path("/publish")
    @Produces({ "*/*" })
    @ApiOperation(value = "Publish Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse queuePublish(@QueryParam("message") @NotNull String message, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost);

    /**
     * Search Queue
     *
     * Get the queues setup for the BillableEntity&#39;s applications.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse queueSearch(@QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("10")Integer limit);

    /**
     * Update Queue
     *
     * Update the basic AMQP queue.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Queue", tags={ "AMQP" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public QueueResponse queueUpdate(@QueryParam("queueId") @NotNull Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("workers") Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL);
}
