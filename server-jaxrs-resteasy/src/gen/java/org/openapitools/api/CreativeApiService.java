package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CreativeResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface CreativeApiService {
      Response addPreview(Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response createCreative(Long accountId,String name,Boolean active,Boolean waitForAsset,String description,Long assetImageId,String action,String data,String suffix,String type,Double balance,Long referenceId,String appVersion,Long missionId,Long offerId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteCreative(Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCreative(Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response getCreativesByApplication(Long accountId,String appKey,Integer start,Integer limit,Long missionId,String keyword,SecurityContext securityContext)
      throws NotFoundException;
      Response removePreview(Long accountId,Long creativeId,SecurityContext securityContext)
      throws NotFoundException;
      Response updateCreative(Long accountId,Long creativeId,String name,String description,Long assetImageId,String action,String data,String suffix,String type,Double balance,Boolean active,Long referenceId,String appVersion,Long missionId,SecurityContext securityContext)
      throws NotFoundException;


}
