package controllers;

import java.io.InputStream;
import apimodels.LeaderboardResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LeaderboardApiControllerImp extends LeaderboardApiControllerImpInterface {
    @Override
    public LeaderboardResponse createLeaderboard(Http.Request request, Long accountId, String appKey, String rankType, String leaderboardMode, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, String sortField, String title, String description, String metaData) throws Exception {
        //Do your magic!!!
        return new LeaderboardResponse();
    }

    @Override
    public SirqulResponse deleteLeaderboard(Http.Request request, @NotNull Long leaderboardId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public LeaderboardResponse getLeaderboard(Http.Request request, @NotNull Long leaderboardId, Long accountId, Boolean includeFullRankingList) throws Exception {
        //Do your magic!!!
        return new LeaderboardResponse();
    }

    @Override
    public LeaderboardResponse searchLeaderboards(Http.Request request, Long accountId, String appKey, Boolean globalOnly, String keyword, String leaderboardIds, String rankTypes, String sortField, Boolean descending, Boolean includeInactive, Boolean includeAppResponse, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new LeaderboardResponse();
    }

    @Override
    public LeaderboardResponse updateLeaderboard(Http.Request request, @NotNull Long leaderboardId, Long accountId, String appKey, String rankType, String leaderboardMode, String sortField, InputStream iconMedia, Long iconAssetId, InputStream bannerMedia, Long bannerAssetId, Integer limitation, Boolean active, String title, String description, String metaData) throws Exception {
        //Do your magic!!!
        return new LeaderboardResponse();
    }

}
