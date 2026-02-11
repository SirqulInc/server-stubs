package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.UserPermissionsResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PermissionsApiServiceImpl implements PermissionsApiService {
      public Response searchPermissionables(String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,String keyword,String sortField,Boolean descending,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchPermissionablesFollowingDistance(Double latitude,Double longitude,String deviceId,Long accountId,Long connectionAccountId,String connectionAccountIds,String permissionableType,Long permissionableId,Double searchRange,String keyword,Boolean pending,Boolean admin,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
