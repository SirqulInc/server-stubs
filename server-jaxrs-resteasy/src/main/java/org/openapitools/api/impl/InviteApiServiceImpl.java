package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.SirqulResponse;

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
public class InviteApiServiceImpl implements InviteApiService {
      public Response acceptInvite(String token,Long accountId,Long albumId,Long missionId,Long albumContestId,Long offerId,Long offerLocationId,Long retailerLocationId,String appKey,Boolean autoFriend,Boolean autoAttendEvent,Boolean autoFavoriteOffer,Boolean autoFavoriteOfferLocation,Boolean autoFavoriteRetailerLocation,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response albumContestInvite(String deviceId,Long accountId,Long appId,String appKey,Long albumContestId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response albumInvite(String deviceId,Long accountId,Long appId,String appKey,Long albumId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response eventInvite(Long accountId,String appKey,Long listingId,String receiverAccountIds,Long retailerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response gameInvite(String deviceId,Long accountId,Long appId,String appKey,Long gameLevelId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getInvite(Long accountId,String token,Long albumId,Long missionId,Long albumContestId,Long offerId,Long offerLocationId,Long retailerLocationId,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response missionInvite(String deviceId,Long accountId,Long appId,String appKey,Long missionId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response offerInvite(Long accountId,String appKey,Long offerId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response offerLocationInvite(Long accountId,String appKey,Long offerLocationId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response retailerLocationInvite(Long accountId,String appKey,Long retailerLocationId,Long albumId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
