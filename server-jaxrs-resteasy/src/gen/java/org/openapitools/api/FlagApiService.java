package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CountResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface FlagApiService {
      Response createFlag(String flagableType,Long flagableId,String deviceId,Long accountId,String flagDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteFlag(String deviceId,Long accountId,String itemBeingFlaggedType,Long itemBeingFlaggedId,String flagableType,Long flagableId,SecurityContext securityContext)
      throws NotFoundException;
      Response getFlag(String flagableType,Long flagableId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response getFlagThreshold(String itemBeingFlaggedType,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateFlagThreshold(String itemBeingFlaggedType,Long threshold,String appKey,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;


}
