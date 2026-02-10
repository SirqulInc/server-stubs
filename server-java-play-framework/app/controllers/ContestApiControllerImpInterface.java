package controllers;

import apimodels.AlbumContestListResponse;
import apimodels.AlbumContestResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ContestApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addOrUpdateAlbumContestHttp(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, String gameType, String appKey, String contestType, Long albumContestId, String title, String description, Long albumId1, Boolean removeAlbum1, Long albumId2, Boolean removeAlbum2, Long startDate, Long endDate, String locationDescription, String connectionIdsToAdd, String connectionGroupIdsToAdd, Double latitude, Double longitude) throws Exception {
        AlbumContestResponse obj = addOrUpdateAlbumContest(request, version, publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, deviceId, accountId, gameType, appKey, contestType, albumContestId, title, description, albumId1, removeAlbum1, albumId2, removeAlbum2, startDate, endDate, locationDescription, connectionIdsToAdd, connectionGroupIdsToAdd, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumContestResponse addOrUpdateAlbumContest(Http.Request request, BigDecimal version, @NotNull Boolean publicRead, @NotNull Boolean publicWrite, @NotNull Boolean publicDelete, @NotNull Boolean publicAdd, @NotNull String visibility, @NotNull Boolean includeFriendGroup, String deviceId, Long accountId, String gameType, String appKey, String contestType, Long albumContestId, String title, String description, Long albumId1, Boolean removeAlbum1, Long albumId2, Boolean removeAlbum2, Long startDate, Long endDate, String locationDescription, String connectionIdsToAdd, String connectionGroupIdsToAdd, Double latitude, Double longitude) throws Exception;

    public Result approveAlbumContestHttp(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull String approvalStatus, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = approveAlbumContest(request, version, albumContestId, approvalStatus, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse approveAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull String approvalStatus, String deviceId, Long accountId) throws Exception;

    public Result deleteContestHttp(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        SirqulResponse obj = deleteContest(request, version, albumContestId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result getAlbumContestHttp(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        AlbumContestResponse obj = getAlbumContest(request, version, albumContestId, deviceId, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumContestResponse getAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception;

    public Result getAlbumContestsHttp(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String appKey, String appType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, Double latitude, Double longitude) throws Exception {
        AlbumContestListResponse obj = getAlbumContests(request, version, filter, sortField, descending, start, limit, deviceId, accountId, gameType, appKey, appType, contestType, ownerId, q, keyword, i, l, dateCreated, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumContestListResponse getAlbumContests(Http.Request request, BigDecimal version, @NotNull String filter, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, String gameType, String appKey, String appType, String contestType, Long ownerId, String q, String keyword, Integer i, Integer l, Long dateCreated, Double latitude, Double longitude) throws Exception;

    public Result voteOnAlbumContestHttp(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull Long albumId, String deviceId, Long accountId, String contestType, Double latitude, Double longitude) throws Exception {
        AlbumContestResponse obj = voteOnAlbumContest(request, version, albumContestId, albumId, deviceId, accountId, contestType, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AlbumContestResponse voteOnAlbumContest(Http.Request request, BigDecimal version, @NotNull Long albumContestId, @NotNull Long albumId, String deviceId, Long accountId, String contestType, Double latitude, Double longitude) throws Exception;

}
