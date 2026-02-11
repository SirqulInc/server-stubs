package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.UserPermissionsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface PermissionsApiService {
      Response searchPermissionables(String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,String keyword,String sortField,Boolean descending,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchPermissionablesFollowingDistance(Double latitude,Double longitude,String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,Double searchRange,String keyword,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;


}
