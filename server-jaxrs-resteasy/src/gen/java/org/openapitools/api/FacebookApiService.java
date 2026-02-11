package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TokenResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface FacebookApiService {
      Response getToken(String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response graphInterface(String event,String deviceId,Long accountId,String permissionableType,Long permissionableId,Long assetId,String gameType,String appKey,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;


}
