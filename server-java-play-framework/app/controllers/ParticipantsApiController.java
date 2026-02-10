package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
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
public class ParticipantsApiController extends Controller {
    private final ParticipantsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ParticipantsApiController(Config configuration, ParticipantsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result processAllParticipants(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueuseShortNameAsID = request.getQueryString("useShortNameAsID");
        Boolean useShortNameAsID;
        if (valueuseShortNameAsID != null) {
            useShortNameAsID = Boolean.valueOf(valueuseShortNameAsID);
        } else {
            useShortNameAsID = null;
        }
        return imp.processAllParticipantsHttp(request, version, accountId, appKey, useShortNameAsID);
    }

    @ApiAction
    public Result processParticipants(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueleague = request.getQueryString("league");
        String league;
        if (valueleague != null) {
            league = valueleague;
        } else {
            throw new IllegalArgumentException("'league' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueuseShortNameAsID = request.getQueryString("useShortNameAsID");
        Boolean useShortNameAsID;
        if (valueuseShortNameAsID != null) {
            useShortNameAsID = Boolean.valueOf(valueuseShortNameAsID);
        } else {
            useShortNameAsID = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        return imp.processParticipantsHttp(request, version, accountId, league, appKey, useShortNameAsID, _file);
    }

}
