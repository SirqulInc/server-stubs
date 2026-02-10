package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.WordzWordResponse;

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
public class WordApiController extends Controller {
    private final WordApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private WordApiController(Config configuration, WordApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createWord(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueword = request.getQueryString("word");
        String word;
        if (valueword != null) {
            word = valueword;
        } else {
            throw new IllegalArgumentException("'word' parameter is required");
        }
        String valuedefinition = request.getQueryString("definition");
        String definition;
        if (valuedefinition != null) {
            definition = valuedefinition;
        } else {
            throw new IllegalArgumentException("'definition' parameter is required");
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            throw new IllegalArgumentException("'active' parameter is required");
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
        return imp.createWordHttp(request, version, accountId, word, definition, active, allocateTickets, ticketCount, assetId, ticketType, points);
    }

    @ApiAction
    public Result deleteWord(Http.Request request, BigDecimal version) throws Exception {
        String valuewordId = request.getQueryString("wordId");
        Long wordId;
        if (valuewordId != null) {
            wordId = Long.parseLong(valuewordId);
        } else {
            throw new IllegalArgumentException("'wordId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.deleteWordHttp(request, version, wordId, accountId);
    }

    @ApiAction
    public Result getWord(Http.Request request, BigDecimal version) throws Exception {
        String valuewordId = request.getQueryString("wordId");
        Long wordId;
        if (valuewordId != null) {
            wordId = Long.parseLong(valuewordId);
        } else {
            throw new IllegalArgumentException("'wordId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getWordHttp(request, version, wordId, accountId);
    }

    @ApiAction
    public Result getWords(Http.Request request, BigDecimal version) throws Exception {
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.getWordsHttp(request, version, accountId, sortField, descending, activeOnly, start, limit, keyword);
    }

    @ApiAction
    public Result updateWord(Http.Request request, BigDecimal version) throws Exception {
        String valuewordId = request.getQueryString("wordId");
        Long wordId;
        if (valuewordId != null) {
            wordId = Long.parseLong(valuewordId);
        } else {
            throw new IllegalArgumentException("'wordId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuewordText = request.getQueryString("wordText");
        String wordText;
        if (valuewordText != null) {
            wordText = valuewordText;
        } else {
            wordText = null;
        }
        String valuedefinition = request.getQueryString("definition");
        String definition;
        if (valuedefinition != null) {
            definition = valuedefinition;
        } else {
            definition = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueallocateTickets = request.getQueryString("allocateTickets");
        Boolean allocateTickets;
        if (valueallocateTickets != null) {
            allocateTickets = Boolean.valueOf(valueallocateTickets);
        } else {
            allocateTickets = null;
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
        return imp.updateWordHttp(request, version, wordId, accountId, ticketCount, wordText, definition, assetId, active, allocateTickets, ticketType, points);
    }

}
