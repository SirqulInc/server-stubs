package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.QueueResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QueueApiServiceImpl extends QueueApiService {
    @Override
    public Response consumerCreate( @NotNull String appKey,  @NotNull String name,  @NotNull String hostname,  @NotNull String username,  @NotNull String password,  @NotNull String dataMapping, String deviceId, Long accountId, Integer port, String virtualHost, String exchanger, String exchangerType, Integer workers, Boolean useSSL, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response consumerUpdate( @NotNull String appKey,  @NotNull Long queueId,  @NotNull String dataMapping, String deviceId, Long accountId, Boolean useSSL, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queueCreate( @NotNull String appKey,  @NotNull String name, String deviceId, Long accountId, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queueDelete( @NotNull Long queueId, String deviceId, Long accountId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queueGet(String deviceId, Long accountId, Long queueId, String appKey, String name, String hostname, String virtualHost, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queuePublish( @NotNull String message, Long queueId, String appKey, String name, String hostname, String virtualHost, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queueSearch(Long queueId, String deviceId, Long accountId, String name, Integer start, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queueUpdate( @NotNull Long queueId, String deviceId, Long accountId, String appKey, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
