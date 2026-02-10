package controllers;

import apimodels.AlbumContestListResponse;
import apimodels.AlbumContestResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ContestApiController extends Controller {
    private final ContestApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ContestApiController(Config configuration, ContestApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addOrUpdateAlbumContest(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuecontestType = request.getQueryString("contestType");
        String contestType;
        if (valuecontestType != null) {
            contestType = valuecontestType;
        } else {
            contestType = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            albumContestId = null;
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuealbumId1 = request.getQueryString("albumId1");
        Long albumId1;
        if (valuealbumId1 != null) {
            albumId1 = Long.parseLong(valuealbumId1);
        } else {
            albumId1 = null;
        }
        String valueremoveAlbum1 = request.getQueryString("removeAlbum1");
        Boolean removeAlbum1;
        if (valueremoveAlbum1 != null) {
            removeAlbum1 = Boolean.valueOf(valueremoveAlbum1);
        } else {
            removeAlbum1 = null;
        }
        String valuealbumId2 = request.getQueryString("albumId2");
        Long albumId2;
        if (valuealbumId2 != null) {
            albumId2 = Long.parseLong(valuealbumId2);
        } else {
            albumId2 = null;
        }
        String valueremoveAlbum2 = request.getQueryString("removeAlbum2");
        Boolean removeAlbum2;
        if (valueremoveAlbum2 != null) {
            removeAlbum2 = Boolean.valueOf(valueremoveAlbum2);
        } else {
            removeAlbum2 = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuepublicRead = request.getQueryString("publicRead");
        Boolean publicRead;
        if (valuepublicRead != null) {
            publicRead = Boolean.valueOf(valuepublicRead);
        } else {
            throw new IllegalArgumentException("'publicRead' parameter is required");
        }
        String valuepublicWrite = request.getQueryString("publicWrite");
        Boolean publicWrite;
        if (valuepublicWrite != null) {
            publicWrite = Boolean.valueOf(valuepublicWrite);
        } else {
            throw new IllegalArgumentException("'publicWrite' parameter is required");
        }
        String valuepublicDelete = request.getQueryString("publicDelete");
        Boolean publicDelete;
        if (valuepublicDelete != null) {
            publicDelete = Boolean.valueOf(valuepublicDelete);
        } else {
            throw new IllegalArgumentException("'publicDelete' parameter is required");
        }
        String valuepublicAdd = request.getQueryString("publicAdd");
        Boolean publicAdd;
        if (valuepublicAdd != null) {
            publicAdd = Boolean.valueOf(valuepublicAdd);
        } else {
            throw new IllegalArgumentException("'publicAdd' parameter is required");
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            throw new IllegalArgumentException("'visibility' parameter is required");
        }
        String valueconnectionIdsToAdd = request.getQueryString("connectionIdsToAdd");
        String connectionIdsToAdd;
        if (valueconnectionIdsToAdd != null) {
            connectionIdsToAdd = valueconnectionIdsToAdd;
        } else {
            connectionIdsToAdd = null;
        }
        String valueconnectionGroupIdsToAdd = request.getQueryString("connectionGroupIdsToAdd");
        String connectionGroupIdsToAdd;
        if (valueconnectionGroupIdsToAdd != null) {
            connectionGroupIdsToAdd = valueconnectionGroupIdsToAdd;
        } else {
            connectionGroupIdsToAdd = null;
        }
        String valueincludeFriendGroup = request.getQueryString("includeFriendGroup");
        Boolean includeFriendGroup;
        if (valueincludeFriendGroup != null) {
            includeFriendGroup = Boolean.valueOf(valueincludeFriendGroup);
        } else {
            throw new IllegalArgumentException("'includeFriendGroup' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.addOrUpdateAlbumContestHttp(request, version, publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, deviceId, accountId, gameType, appKey, contestType, albumContestId, title, description, albumId1, removeAlbum1, albumId2, removeAlbum2, startDate, endDate, locationDescription, connectionIdsToAdd, connectionGroupIdsToAdd, latitude, longitude);
    }

    @ApiAction
    public Result approveAlbumContest(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            throw new IllegalArgumentException("'albumContestId' parameter is required");
        }
        String valueapprovalStatus = request.getQueryString("approvalStatus");
        String approvalStatus;
        if (valueapprovalStatus != null) {
            approvalStatus = valueapprovalStatus;
        } else {
            throw new IllegalArgumentException("'approvalStatus' parameter is required");
        }
        return imp.approveAlbumContestHttp(request, version, albumContestId, approvalStatus, deviceId, accountId);
    }

    @ApiAction
    public Result deleteContest(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            throw new IllegalArgumentException("'albumContestId' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.deleteContestHttp(request, version, albumContestId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result getAlbumContest(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            throw new IllegalArgumentException("'albumContestId' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.getAlbumContestHttp(request, version, albumContestId, deviceId, accountId, latitude, longitude);
    }

    @ApiAction
    public Result getAlbumContests(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuegameType = request.getQueryString("gameType");
        String gameType;
        if (valuegameType != null) {
            gameType = valuegameType;
        } else {
            gameType = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueappType = request.getQueryString("appType");
        String appType;
        if (valueappType != null) {
            appType = valueappType;
        } else {
            appType = null;
        }
        String valuecontestType = request.getQueryString("contestType");
        String contestType;
        if (valuecontestType != null) {
            contestType = valuecontestType;
        } else {
            contestType = null;
        }
        String valueownerId = request.getQueryString("ownerId");
        Long ownerId;
        if (valueownerId != null) {
            ownerId = Long.parseLong(valueownerId);
        } else {
            ownerId = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            throw new IllegalArgumentException("'filter' parameter is required");
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        String valuei = request.getQueryString("_i");
        Integer i;
        if (valuei != null) {
            i = Integer.parseInt(valuei);
        } else {
            i = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuel = request.getQueryString("_l");
        Integer l;
        if (valuel != null) {
            l = Integer.parseInt(valuel);
        } else {
            l = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valuedateCreated = request.getQueryString("dateCreated");
        Long dateCreated;
        if (valuedateCreated != null) {
            dateCreated = Long.parseLong(valuedateCreated);
        } else {
            dateCreated = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.getAlbumContestsHttp(request, version, filter, sortField, descending, start, limit, deviceId, accountId, gameType, appKey, appType, contestType, ownerId, q, keyword, i, l, dateCreated, latitude, longitude);
    }

    @ApiAction
    public Result voteOnAlbumContest(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuealbumContestId = request.getQueryString("albumContestId");
        Long albumContestId;
        if (valuealbumContestId != null) {
            albumContestId = Long.parseLong(valuealbumContestId);
        } else {
            throw new IllegalArgumentException("'albumContestId' parameter is required");
        }
        String valuealbumId = request.getQueryString("albumId");
        Long albumId;
        if (valuealbumId != null) {
            albumId = Long.parseLong(valuealbumId);
        } else {
            throw new IllegalArgumentException("'albumId' parameter is required");
        }
        String valuecontestType = request.getQueryString("contestType");
        String contestType;
        if (valuecontestType != null) {
            contestType = valuecontestType;
        } else {
            contestType = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        return imp.voteOnAlbumContestHttp(request, version, albumContestId, albumId, deviceId, accountId, contestType, latitude, longitude);
    }

}
