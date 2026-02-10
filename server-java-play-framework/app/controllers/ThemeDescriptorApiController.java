package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PurchaseItemListResponse;
import apimodels.SirqulResponse;
import apimodels.ThemeDescriptorResponse;

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
public class ThemeDescriptorApiController extends Controller {
    private final ThemeDescriptorApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ThemeDescriptorApiController(Config configuration, ThemeDescriptorApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addOrUpdateThemeDescriptor(Http.Request request, BigDecimal version) throws Exception {
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
        String valuethemeDescriptorId = request.getQueryString("themeDescriptorId");
        Long themeDescriptorId;
        if (valuethemeDescriptorId != null) {
            themeDescriptorId = Long.parseLong(valuethemeDescriptorId);
        } else {
            themeDescriptorId = null;
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
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
        }
        String valuecolorValueJson = request.getQueryString("colorValueJson");
        String colorValueJson;
        if (valuecolorValueJson != null) {
            colorValueJson = valuecolorValueJson;
        } else {
            colorValueJson = null;
        }
        String valuestringReplacerJson = request.getQueryString("stringReplacerJson");
        String stringReplacerJson;
        if (valuestringReplacerJson != null) {
            stringReplacerJson = valuestringReplacerJson;
        } else {
            stringReplacerJson = null;
        }
        String valuecustomJsonObjects = request.getQueryString("customJsonObjects");
        String customJsonObjects;
        if (valuecustomJsonObjects != null) {
            customJsonObjects = valuecustomJsonObjects;
        } else {
            customJsonObjects = null;
        }
        String valueiconImage = request.getQueryString("iconImage");
        InputStream iconImage;
        if (valueiconImage != null) {
            iconImage = valueiconImage;
        } else {
            iconImage = null;
        }
        String valuesceneAtlasImage = request.getQueryString("sceneAtlasImage");
        InputStream sceneAtlasImage;
        if (valuesceneAtlasImage != null) {
            sceneAtlasImage = valuesceneAtlasImage;
        } else {
            sceneAtlasImage = null;
        }
        String valuebgImage = request.getQueryString("bgImage");
        InputStream bgImage;
        if (valuebgImage != null) {
            bgImage = valuebgImage;
        } else {
            bgImage = null;
        }
        String valuebgSound = request.getQueryString("bgSound");
        InputStream bgSound;
        if (valuebgSound != null) {
            bgSound = valuebgSound;
        } else {
            bgSound = null;
        }
        String valuemusicSelection = request.getQueryString("musicSelection");
        String musicSelection;
        if (valuemusicSelection != null) {
            musicSelection = valuemusicSelection;
        } else {
            musicSelection = null;
        }
        String valuecompleteWithDefaultValues = request.getQueryString("completeWithDefaultValues");
        Boolean completeWithDefaultValues;
        if (valuecompleteWithDefaultValues != null) {
            completeWithDefaultValues = Boolean.valueOf(valuecompleteWithDefaultValues);
        } else {
            throw new IllegalArgumentException("'completeWithDefaultValues' parameter is required");
        }
        String valuelocationDescription = request.getQueryString("locationDescription");
        String locationDescription;
        if (valuelocationDescription != null) {
            locationDescription = valuelocationDescription;
        } else {
            locationDescription = null;
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
        return imp.addOrUpdateThemeDescriptorHttp(request, version, publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, completeWithDefaultValues, deviceId, accountId, gameType, themeDescriptorId, title, description, connectionIdsToAdd, connectionGroupIdsToAdd, appVersion, colorValueJson, stringReplacerJson, customJsonObjects, iconImage, sceneAtlasImage, bgImage, bgSound, musicSelection, locationDescription, latitude, longitude);
    }

    @ApiAction
    public Result getThemeDescriptor(Http.Request request, BigDecimal version) throws Exception {
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
        String valuethemeDescriptorId = request.getQueryString("themeDescriptorId");
        Long themeDescriptorId;
        if (valuethemeDescriptorId != null) {
            themeDescriptorId = Long.parseLong(valuethemeDescriptorId);
        } else {
            throw new IllegalArgumentException("'themeDescriptorId' parameter is required");
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
        return imp.getThemeDescriptorHttp(request, version, themeDescriptorId, deviceId, accountId, gameType, latitude, longitude);
    }

    @ApiAction
    public Result getThemeDescriptors(Http.Request request, BigDecimal version) throws Exception {
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
        String valueappVersion = request.getQueryString("appVersion");
        String appVersion;
        if (valueappVersion != null) {
            appVersion = valueappVersion;
        } else {
            appVersion = null;
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
        return imp.getThemeDescriptorsHttp(request, version, filter, sortField, descending, start, limit, deviceId, accountId, gameType, contestType, ownerId, q, keyword, i, l, dateCreated, appVersion, latitude, longitude);
    }

    @ApiAction
    public Result removeThemeDescriptor(Http.Request request, BigDecimal version) throws Exception {
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
        String valuethemeDescriptorId = request.getQueryString("themeDescriptorId");
        Long themeDescriptorId;
        if (valuethemeDescriptorId != null) {
            themeDescriptorId = Long.parseLong(valuethemeDescriptorId);
        } else {
            throw new IllegalArgumentException("'themeDescriptorId' parameter is required");
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
        return imp.removeThemeDescriptorHttp(request, version, themeDescriptorId, deviceId, accountId, gameType, latitude, longitude);
    }

}
