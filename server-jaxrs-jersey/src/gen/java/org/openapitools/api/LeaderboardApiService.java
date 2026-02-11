package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.LeaderboardResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class LeaderboardApiService {
    public abstract Response createLeaderboard(Long accountId,String appKey,String rankType,String leaderboardMode,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,String sortField,String title,String description,String metaData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteLeaderboard( @NotNull Long leaderboardId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getLeaderboard( @NotNull Long leaderboardId,Long accountId,Boolean includeFullRankingList,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchLeaderboards(Long accountId,String appKey,Boolean globalOnly,String keyword,String leaderboardIds,String rankTypes,String sortField,Boolean descending,Boolean includeInactive,Boolean includeAppResponse,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateLeaderboard( @NotNull Long leaderboardId,Long accountId,String appKey,String rankType,String leaderboardMode,String sortField,File iconMedia,Long iconAssetId,File bannerMedia,Long bannerAssetId,Integer limitation,Boolean active,String title,String description,String metaData,SecurityContext securityContext) throws NotFoundException;
}
