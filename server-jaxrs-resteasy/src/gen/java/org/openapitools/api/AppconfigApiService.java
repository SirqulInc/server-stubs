package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ApplicationConfigResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface AppconfigApiService {
      Response createApplicationConfig(Long accountId,String appKey,String configVersion,Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteApplicationConfig(Long accountId,Long configId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationConfig(Long accountId,Long configId,SecurityContext securityContext)
      throws NotFoundException;
      Response getApplicationConfigByConfigVersion(String appKey,String configVersion,Long retailerId,Long retailerLocationId,String udid,Boolean allowOlderVersions,SecurityContext securityContext)
      throws NotFoundException;
      Response searchApplicationConfig(Long accountId,String appKey,Long retailerId,Long retailerLocationId,String udid,String configVersion,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updateApplicationConfig(Long accountId,Long configId,String appKey,String configVersion,Long assetId,Long retailerId,Long retailerLocationId,String udid,SecurityContext securityContext)
      throws NotFoundException;


}
