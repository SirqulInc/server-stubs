package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import java.io.File;
import org.openapitools.model.PaymentRequest;
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
public interface SecureApiService {
      Response createSecureApplication(Long accountId,String appKey,File keyCert,File trustStore,String username,String password,Boolean active,String biometricType,String biometricPosition,String biometricPosition2,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSecureApplication(Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response loginSecure(String appKey,File biometricFile,String deviceId,File biometricFile2,Integer ageRestriction,Boolean returnProfile,String responseFilters,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response purchaseSecure(PaymentRequest body,SecurityContext securityContext)
      throws NotFoundException;
      Response resetSecure(Long accountId,String appKey,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSecureApplication(Long accountId,String appKey,Boolean active,File keyCert,File trustStore,String username,String password,String biometricType,String biometricPosition,String biometricPosition2,SecurityContext securityContext)
      throws NotFoundException;


}
