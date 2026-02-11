package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TwitterApiService {
      Response authorizeTwitter(String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response loginTwitter(String accessToken,String accessTokenSecret,String appKey,String responseFilters,String deviceId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;


}
