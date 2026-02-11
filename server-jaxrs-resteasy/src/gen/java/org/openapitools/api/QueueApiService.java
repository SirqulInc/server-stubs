package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.QueueResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface QueueApiService {
      Response consumerCreate(String appKey,String name,String hostname,String username,String password,String dataMapping,String deviceId,Long accountId,Integer port,String virtualHost,String exchanger,String exchangerType,Integer workers,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response consumerUpdate(String appKey,Long queueId,String dataMapping,String deviceId,Long accountId,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response queueCreate(String appKey,String name,String deviceId,Long accountId,Integer workers,String analyticTags,String hostname,Integer port,String username,String password,String virtualHost,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;
      Response queueDelete(Long queueId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response queueGet(String deviceId,Long accountId,Long queueId,String appKey,String name,String hostname,String virtualHost,SecurityContext securityContext)
      throws NotFoundException;
      Response queuePublish(String message,Long queueId,String appKey,String name,String hostname,String virtualHost,SecurityContext securityContext)
      throws NotFoundException;
      Response queueSearch(Long queueId,String deviceId,Long accountId,String name,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response queueUpdate(Long queueId,String deviceId,Long accountId,String appKey,Integer workers,String analyticTags,String hostname,Integer port,String username,String password,String virtualHost,Boolean useSSL,SecurityContext securityContext)
      throws NotFoundException;


}
