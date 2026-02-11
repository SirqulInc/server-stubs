package org.openapitools.api;

import org.openapitools.api.QueueApiService;
import org.openapitools.api.factories.QueueApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.QueueResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/queue")


@io.swagger.annotations.Api(description = "the queue API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QueueApi  {
   private final QueueApiService delegate;

   public QueueApi(@Context ServletConfig servletContext) {
      QueueApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("QueueApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (QueueApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = QueueApiServiceFactory.getQueueApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/consumer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Consumer", notes = "Create a connection to an existing amqp queue and register as a consumer.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response consumerCreate(@ApiParam(value = "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the queue to connect to", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The hostname of the server the queue is hosted on", required = true) @QueryParam("hostname") @NotNull  String hostname,@ApiParam(value = "The username to access the server the queue is hosted on", required = true) @QueryParam("username") @NotNull  String username,@ApiParam(value = "The password to access the queue to connect to", required = true) @QueryParam("password") @NotNull  String password,@ApiParam(value = "The data mapping information in the format of AMQPRequest", required = true) @QueryParam("dataMapping") @NotNull  String dataMapping,@ApiParam(value = "The client deviceID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The port of the server the queue is hosted on", defaultValue = "5672") @DefaultValue("5672") @QueryParam("port")  Integer port,@ApiParam(value = "The virtual host defined on the server the queue is associated on") @QueryParam("virtualHost")  String virtualHost,@ApiParam(value = "The exchanger of the queue to connect to") @QueryParam("exchanger")  String exchanger,@ApiParam(value = "The exchanger type of the queue to connect to") @QueryParam("exchangerType")  String exchangerType,@ApiParam(value = "The number of workers to generate ", defaultValue = "1") @DefaultValue("1") @QueryParam("workers")  Integer workers,@ApiParam(value = "Use SSL") @QueryParam("useSSL")  Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.consumerCreate(appKey, name, hostname, username, password, dataMapping, deviceId, accountId, port, virtualHost, exchanger, exchangerType, workers, useSSL, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/consumer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Consumer", notes = "Update an existing amqp queue's data mapping.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response consumerUpdate(@ApiParam(value = "The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The queue to update", required = true) @QueryParam("queueId") @NotNull  Long queueId,@ApiParam(value = "The data mapping information in the format of AMQPRequest", required = true) @QueryParam("dataMapping") @NotNull  String dataMapping,@ApiParam(value = "The client deviceID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Use SSL") @QueryParam("useSSL")  Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.consumerUpdate(appKey, queueId, dataMapping, deviceId, accountId, useSSL, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Queue", notes = "Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response queueCreate(@ApiParam(value = "The application key unique to each application.", required = true) @QueryParam("appKey") @NotNull  String appKey,@ApiParam(value = "The name of the queue to create", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The client deviceID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The number of workers to generate ", defaultValue = "1") @DefaultValue("1") @QueryParam("workers")  Integer workers,@ApiParam(value = "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags") @QueryParam("analyticTags")  String analyticTags,@ApiParam(value = "The hostname of the server the queue is hosted on") @QueryParam("hostname")  String hostname,@ApiParam(value = "The port of the server the queue is hosted on") @QueryParam("port")  Integer port,@ApiParam(value = "The username to access the server that the queue is on") @QueryParam("username")  String username,@ApiParam(value = "The password to access the queue to connect to") @QueryParam("password")  String password,@ApiParam(value = "The virtual host defined on the server to queue") @QueryParam("virtualHost")  String virtualHost,@ApiParam(value = "Use SSL") @QueryParam("useSSL")  Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queueCreate(appKey, name, deviceId, accountId, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Queue", notes = "Delete the stored queue record and close any active connections to the AMQP servers.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response queueDelete(@ApiParam(value = "The id of the queue to find", required = true) @QueryParam("queueId") @NotNull  Long queueId,@ApiParam(value = "The client device ID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queueDelete(queueId, deviceId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Queue", notes = "Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response queueGet(@ApiParam(value = "The client device ID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The id of the queue to find") @QueryParam("queueId")  Long queueId,@ApiParam(value = "The application key the queue was assigned to") @QueryParam("appKey")  String appKey,@ApiParam(value = "The name of the queue to find") @QueryParam("name")  String name,@ApiParam(value = "The hostname of the queue to find") @QueryParam("hostname")  String hostname,@ApiParam(value = "The virtual host of the queue to find") @QueryParam("virtualHost")  String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queueGet(deviceId, accountId, queueId, appKey, name, hostname, virtualHost, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/publish")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Publish Queue", notes = "Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response queuePublish(@ApiParam(value = "The payload to send to the queue", required = true) @QueryParam("message") @NotNull  String message,@ApiParam(value = "The id of the queue to publish to") @QueryParam("queueId")  Long queueId,@ApiParam(value = "The application key the queue was assigned to") @QueryParam("appKey")  String appKey,@ApiParam(value = "The name of the queue to publish to or the analytic tag to handle if the analytic param is true") @QueryParam("name")  String name,@ApiParam(value = "The hostname of the server the queue is hosted on") @QueryParam("hostname")  String hostname,@ApiParam(value = "The virtual host defined on the server to queue") @QueryParam("virtualHost")  String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queuePublish(message, queueId, appKey, name, hostname, virtualHost, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Queue", notes = "Get the queues setup for the BillableEntity's applications.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response queueSearch(@ApiParam(value = "The id of the queue to find") @QueryParam("queueId")  Long queueId,@ApiParam(value = "The client device ID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The name of the queue to find") @QueryParam("name")  String name,@ApiParam(value = "Start of the index", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "Limit of the index", defaultValue = "10") @DefaultValue("10") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queueSearch(queueId, deviceId, accountId, name, start, limit, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Queue", notes = "Update the basic AMQP queue.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class)
    })
    public Response queueUpdate(@ApiParam(value = "The id of the queue to update", required = true) @QueryParam("queueId") @NotNull  Long queueId,@ApiParam(value = "The client deviceID") @QueryParam("deviceId")  String deviceId,@ApiParam(value = "The logged in user ID") @QueryParam("accountId")  Long accountId,@ApiParam(value = "The application key unique to each application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "The number of workers to generate") @QueryParam("workers")  Integer workers,@ApiParam(value = "If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags") @QueryParam("analyticTags")  String analyticTags,@ApiParam(value = "The hostname of the server the queue is hosted on") @QueryParam("hostname")  String hostname,@ApiParam(value = "The port of the server the queue is hosted on") @QueryParam("port")  Integer port,@ApiParam(value = "The username to access the server that the queue is on") @QueryParam("username")  String username,@ApiParam(value = "The password to access the queue to connect to") @QueryParam("password")  String password,@ApiParam(value = "The virtual host defined on the server to queue") @QueryParam("virtualHost")  String virtualHost,@ApiParam(value = "the SSL to use") @QueryParam("useSSL")  Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.queueUpdate(queueId, deviceId, accountId, appKey, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL, securityContext);
    }
}
