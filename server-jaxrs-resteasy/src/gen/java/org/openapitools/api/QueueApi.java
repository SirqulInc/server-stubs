package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.QueueApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.QueueResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/queue")


@io.swagger.annotations.Api(description = "the queue API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QueueApi  {

    @Inject QueueApiService service;

    @POST
    @Path("/consumer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Consumer", notes = "Create a connection to an existing amqp queue and register as a consumer.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response consumerCreate( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("hostname") String hostname, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("dataMapping") String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("5672") @QueryParam("port") Integer port, @QueryParam("virtualHost") String virtualHost, @QueryParam("exchanger") String exchanger, @QueryParam("exchangerType") String exchangerType, @DefaultValue("1") @QueryParam("workers") Integer workers, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.consumerCreate(appKey,name,hostname,username,password,dataMapping,deviceId,accountId,port,virtualHost,exchanger,exchangerType,workers,useSSL,securityContext);
    }
    @POST
    @Path("/consumer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Consumer", notes = "Update an existing amqp queue's data mapping.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response consumerUpdate( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("queueId") Long queueId, @NotNull @QueryParam("dataMapping") String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.consumerUpdate(appKey,queueId,dataMapping,deviceId,accountId,useSSL,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Queue", notes = "Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueCreate( @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("1") @QueryParam("workers") Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueCreate(appKey,name,deviceId,accountId,workers,analyticTags,hostname,port,username,password,virtualHost,useSSL,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Queue", notes = "Delete the stored queue record and close any active connections to the AMQP servers.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response queueDelete( @NotNull @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueDelete(queueId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Queue", notes = "Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueGet( @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueGet(deviceId,accountId,queueId,appKey,name,hostname,virtualHost,securityContext);
    }
    @POST
    @Path("/publish")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Publish Queue", notes = "Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response queuePublish( @NotNull @QueryParam("message") String message, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queuePublish(message,queueId,appKey,name,hostname,virtualHost,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Queue", notes = "Get the queues setup for the BillableEntity's applications.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueSearch( @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("10") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueSearch(queueId,deviceId,accountId,name,start,limit,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Queue", notes = "Update the basic AMQP queue.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueUpdate( @NotNull @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("workers") Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueUpdate(queueId,deviceId,accountId,appKey,workers,analyticTags,hostname,port,username,password,virtualHost,useSSL,securityContext);
    }
}
