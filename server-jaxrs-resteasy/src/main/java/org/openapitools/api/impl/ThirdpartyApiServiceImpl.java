package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.io.File;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;

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
public class ThirdpartyApiServiceImpl implements ThirdpartyApiService {
      public Response createCredential(String thirdPartyId,String thirdPartyToken,String networkUID,String appKey,Long accountId,String deviceId,String sessionId,String thirdPartyName,String emailAddress,Boolean signinOnlyMode,String responseFilters,Double latitude,Double longitude,String metaData,String thirdPartyRefreshToken,String audienceIdsToAdd,String audienceIdsToRemove,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createNetwork(Long accountId,String name,Boolean enableIntrospection,String description,String introspectionMethod,String introspectionURL,String introspectionParams,String requiredRootField,Boolean enableMFA,Integer sizeMFA,Integer shelfLifeMFA,String oauthTokenURL,File oauthPrivateKey,File oauthPublicKey,String oauthClientId,String oauthSecretKey,String body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteCredential(Long accountId,String networkUID,String thirdPartyId,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteNetwork(Long accountId,String networkUID,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getCredential(String networkUID,String appKey,Long accountId,String deviceId,String sessionId,Long thirdPartyCredentialId,String thirdPartyToken,String thirdPartySecret,Boolean createNewAccount,String responseFilters,Double latitude,Double longitude,String audienceIdsToAdd,String audienceIdsToRemove,Long referralAccountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getNetwork(Long accountId,String networkUID,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchCredentials(Long accountId,String keyword,String networkUID,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchNetworks(Long accountId,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,String keyword,Boolean filterBillable,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response sendMFAChallenge(String networkUID,String appKey,String thirdPartyToken,Long thirdPartyCredentialId,String deviceId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateCredential(String networkUID,String thirdPartyId,String appKey,String deviceId,String thirdPartyName,String thirdPartyToken,String responseFilters,String metaData,String thirdPartyRefreshToken,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateNetwork(Long accountId,String networkUID,String name,String description,Boolean enableIntrospection,String introspectionMethod,String introspectionURL,String introspectionParams,String requiredRootField,Boolean enableMFA,Integer sizeMFA,Integer shelfLifeMFA,String oauthTokenURL,File oauthPrivateKey,File oauthPublicKey,String oauthClientId,String oauthSecretKey,String body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
