package controllers;

import apimodels.AlbumContestListResponse;
import apimodels.AlbumContestResponse;
import java.math.BigDecimal;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ContestApiControllerImp extends ContestApiControllerImpInterface {
    @Override
    public AlbumContestResponse addOrUpdateAlbumContest(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, String gameType, String appKey, String contestType, Long albumContestId, String title, String description, Long albumId1, Boolean removeAlbum1, Long albumId2, Boolean removeAlbum2, Long startDate, Long endDate, String locationDescription, String connectionIdsToAdd, String connectionGroupIdsToAdd, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new AlbumContestResponse();
    }

    @Override
    public SirqulResponse approveAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull String approvalStatus, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse deleteContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AlbumContestResponse getAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new AlbumContestResponse();
    }

    @Override
    public AlbumContestListResponse getAlbumContests(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String appKey, String appType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new AlbumContestListResponse();
    }

    @Override
    public AlbumContestResponse voteOnAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull Long albumId, String deviceId, Long accountId, String contestType, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new AlbumContestResponse();
    }

}
