package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface ConnectionApiService {
      Response addConnectionsToGroup(Long connectionGroupId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response groupSearch(String sortField,Boolean descending,Boolean activeOnly,Integer start,Integer limit,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response removeConnectionsFromGroup(Long connectionGroupId,String deviceId,Long accountId,String connectionIds,String connectionAccountIds,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response searchConnections(Boolean returnNulls,Integer start,Integer limit,String deviceId,Long accountId,String q,String keyword,Double latitude,Double longitude,String gameType,String appKey,Integer i,Integer l,String sortField,Boolean hasLocation,SecurityContext securityContext)
      throws NotFoundException;


}
