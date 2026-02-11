package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.MissionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface AdsApiService {
      Response adsFind(String appKey,Boolean randomize,Boolean targetedAdsOnly,String type,Long accountId,String appVersion,Double latitude,Double longitude,String device,Long deviceIdentifier,String deviceVersion,Integer start,Integer limit,Boolean includeAudiences,Boolean allocatesTickets,String missionIds,SecurityContext securityContext)
      throws NotFoundException;


}
