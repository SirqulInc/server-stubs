package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.io.File;
import org.openapitools.model.LeaderboardResponse;
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
public class LeaderboardApiServiceImpl implements LeaderboardApiService {
      public Response createLeaderboard(Long accountId,String appKey,String rankType,String leaderboardMode,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,String sortField,String title,String description,String metaData,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteLeaderboard(Long leaderboardId,Long accountId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getLeaderboard(Long leaderboardId,Long accountId,Boolean includeFullRankingList,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchLeaderboards(Long accountId,String appKey,Boolean globalOnly,String keyword,String leaderboardIds,String rankTypes,String sortField,Boolean descending,Boolean includeInactive,Boolean includeAppResponse,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateLeaderboard(Long leaderboardId,Long accountId,String appKey,String rankType,String leaderboardMode,String sortField,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,Boolean active,String title,String description,String metaData,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
