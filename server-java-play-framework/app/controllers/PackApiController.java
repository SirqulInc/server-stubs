package controllers;

import java.math.BigDecimal;
import apimodels.PackResponse;
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
public class PackApiController extends Controller {
    private final PackApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PackApiController(Config configuration, PackApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createPack(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
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
        String valuepackType = request.getQueryString("packType");
        String packType;
        if (valuepackType != null) {
            packType = valuepackType;
        } else {
            packType = null;
        }
        String valuepackOrder = request.getQueryString("packOrder");
        Long packOrder;
        if (valuepackOrder != null) {
            packOrder = Long.parseLong(valuepackOrder);
        } else {
            throw new IllegalArgumentException("'packOrder' parameter is required");
        }
        String valuesequenceType = request.getQueryString("sequenceType");
        String sequenceType;
        if (valuesequenceType != null) {
            sequenceType = valuesequenceType;
        } else {
            sequenceType = null;
        }
        String valuebackgroundId = request.getQueryString("backgroundId");
        Long backgroundId;
        if (valuebackgroundId != null) {
            backgroundId = Long.parseLong(valuebackgroundId);
        } else {
            backgroundId = null;
        }
        String valueimageId = request.getQueryString("imageId");
        Long imageId;
        if (valueimageId != null) {
            imageId = Long.parseLong(valueimageId);
        } else {
            imageId = null;
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
        String valueauthorOverride = request.getQueryString("authorOverride");
        String authorOverride;
        if (valueauthorOverride != null) {
            authorOverride = valueauthorOverride;
        } else {
            authorOverride = null;
        }
        String valueprice = request.getQueryString("price");
        Integer price;
        if (valueprice != null) {
            price = Integer.parseInt(valueprice);
        } else {
            throw new IllegalArgumentException("'price' parameter is required");
        }
        String valuepriceType = request.getQueryString("priceType");
        String priceType;
        if (valuepriceType != null) {
            priceType = valuepriceType;
        } else {
            priceType = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valueinGame = request.getQueryString("inGame");
        Boolean inGame;
        if (valueinGame != null) {
            inGame = Boolean.valueOf(valueinGame);
        } else {
            inGame = null;
        }
        String valuehighest = request.getQueryString("highest");
        Boolean highest;
        if (valuehighest != null) {
            highest = Boolean.valueOf(valuehighest);
        } else {
            throw new IllegalArgumentException("'highest' parameter is required");
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            throw new IllegalArgumentException("'allocateTickets' parameter is required");
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            throw new IllegalArgumentException("'ticketCount' parameter is required");
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        return imp.createPackHttp(request, version, accountId, title, packOrder, price, highest, allocateTickets, ticketCount, description, searchTags, active, gameType, appKey, packType, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, priceType, gameLevelIds, inGame, ticketType, points);
    }

    @ApiAction
    public Result deletePack(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            throw new IllegalArgumentException("'packId' parameter is required");
        }
        return imp.deletePackHttp(request, version, accountId, packId);
    }

    @ApiAction
    public Result getPack(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            throw new IllegalArgumentException("'packId' parameter is required");
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            throw new IllegalArgumentException("'includeGameData' parameter is required");
        }
        return imp.getPackHttp(request, version, accountId, packId, includeGameData);
    }

    @ApiAction
    public Result searchPacks(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuepackType = request.getQueryString("packType");
        String packType;
        if (valuepackType != null) {
            packType = valuepackType;
        } else {
            packType = null;
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
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueincludeGameData = request.getQueryString("includeGameData");
        Boolean includeGameData;
        if (valueincludeGameData != null) {
            includeGameData = Boolean.valueOf(valueincludeGameData);
        } else {
            includeGameData = null;
        }
        String valueincludeInactive = request.getQueryString("includeInactive");
        Boolean includeInactive;
        if (valueincludeInactive != null) {
            includeInactive = Boolean.valueOf(valueincludeInactive);
        } else {
            includeInactive = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.searchPacksHttp(request, version, accountId, sortField, descending, keyword, packType, start, limit, includeGameData, includeInactive, appKey);
    }

    @ApiAction
    public Result updatePack(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepackId = request.getQueryString("packId");
        Long packId;
        if (valuepackId != null) {
            packId = Long.parseLong(valuepackId);
        } else {
            throw new IllegalArgumentException("'packId' parameter is required");
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
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
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
        String valuepackType = request.getQueryString("packType");
        String packType;
        if (valuepackType != null) {
            packType = valuepackType;
        } else {
            packType = null;
        }
        String valuepackOrder = request.getQueryString("packOrder");
        Long packOrder;
        if (valuepackOrder != null) {
            packOrder = Long.parseLong(valuepackOrder);
        } else {
            packOrder = null;
        }
        String valuesequenceType = request.getQueryString("sequenceType");
        String sequenceType;
        if (valuesequenceType != null) {
            sequenceType = valuesequenceType;
        } else {
            sequenceType = null;
        }
        String valuebackgroundId = request.getQueryString("backgroundId");
        Long backgroundId;
        if (valuebackgroundId != null) {
            backgroundId = Long.parseLong(valuebackgroundId);
        } else {
            backgroundId = null;
        }
        String valueimageId = request.getQueryString("imageId");
        Long imageId;
        if (valueimageId != null) {
            imageId = Long.parseLong(valueimageId);
        } else {
            imageId = null;
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
        String valueauthorOverride = request.getQueryString("authorOverride");
        String authorOverride;
        if (valueauthorOverride != null) {
            authorOverride = valueauthorOverride;
        } else {
            authorOverride = null;
        }
        String valueprice = request.getQueryString("price");
        Integer price;
        if (valueprice != null) {
            price = Integer.parseInt(valueprice);
        } else {
            price = null;
        }
        String valuepriceType = request.getQueryString("priceType");
        String priceType;
        if (valuepriceType != null) {
            priceType = valuepriceType;
        } else {
            priceType = null;
        }
        String valuegameLevelIds = request.getQueryString("gameLevelIds");
        String gameLevelIds;
        if (valuegameLevelIds != null) {
            gameLevelIds = valuegameLevelIds;
        } else {
            gameLevelIds = null;
        }
        String valueinGame = request.getQueryString("inGame");
        Boolean inGame;
        if (valueinGame != null) {
            inGame = Boolean.valueOf(valueinGame);
        } else {
            inGame = null;
        }
        String valuehighest = request.getQueryString("highest");
        Boolean highest;
        if (valuehighest != null) {
            highest = Boolean.valueOf(valuehighest);
        } else {
            highest = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            throw new IllegalArgumentException("'allocateTickets' parameter is required");
        }
        String valueticketCount = request.getQueryString("ticketCount");
        Long ticketCount;
        if (valueticketCount != null) {
            ticketCount = Long.parseLong(valueticketCount);
        } else {
            throw new IllegalArgumentException("'ticketCount' parameter is required");
        }
        String valueticketType = request.getQueryString("ticketType");
        String ticketType;
        if (valueticketType != null) {
            ticketType = valueticketType;
        } else {
            ticketType = null;
        }
        String valuepoints = request.getQueryString("points");
        Long points;
        if (valuepoints != null) {
            points = Long.parseLong(valuepoints);
        } else {
            points = null;
        }
        return imp.updatePackHttp(request, version, accountId, packId, allocateTickets, ticketCount, title, description, searchTags, active, gameType, appKey, packType, packOrder, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, price, priceType, gameLevelIds, inGame, highest, ticketType, points);
    }

}
