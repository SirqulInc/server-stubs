package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.AppResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface AppApiService {
      Response getAppData(Integer start,Integer limit,String deviceId,Long accountId,String gameType,Boolean includeGameData,String q,String keyword,String sortField,Boolean descending,Integer i,Integer l,Boolean gameObjectCount,String filter,Long dateCreated,Long ownerId,String missionIds,String gameIds,String packIds,String gameLevelIds,String appVersion,Boolean includeHigherVersionPacks,Boolean includeHigherVersionLevels,String responseGroups,String purchaseType,SecurityContext securityContext)
      throws NotFoundException;
      Response postAppData(String gameType,Integer start,Integer limit,String data,String deviceId,Long accountId,Boolean includeGameData,String q,String keyword,String sortField,Boolean descending,Integer i,Integer l,Boolean gameObjectCount,String filter,Long dateCreated,Long ownerId,String missionIds,String gameIds,String packIds,String gameLevelIds,String appVersion,Boolean includeHigherVersionPacks,Boolean includeHigherVersionLevels,String responseGroups,String purchaseType,SecurityContext securityContext)
      throws NotFoundException;
      Response regenAppData(Long accountId,String appKey,String buildVersion,String apiVersion,SecurityContext securityContext)
      throws NotFoundException;


}
