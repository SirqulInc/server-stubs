package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TerritoryResponse;

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
public class TerritoryApiController extends Controller {
    private final TerritoryApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TerritoryApiController(Config configuration, TerritoryApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createTerritory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.createTerritoryHttp(request, version, accountId, name, active);
    }

    @ApiAction
    public Result deleteTerritory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueterritoryId = request.getQueryString("territoryId");
        Long territoryId;
        if (valueterritoryId != null) {
            territoryId = Long.parseLong(valueterritoryId);
        } else {
            throw new IllegalArgumentException("'territoryId' parameter is required");
        }
        return imp.deleteTerritoryHttp(request, version, accountId, territoryId);
    }

    @ApiAction
    public Result getTerritory(Http.Request request, BigDecimal version) throws Exception {
        String valueterritoryId = request.getQueryString("territoryId");
        Long territoryId;
        if (valueterritoryId != null) {
            territoryId = Long.parseLong(valueterritoryId);
        } else {
            throw new IllegalArgumentException("'territoryId' parameter is required");
        }
        return imp.getTerritoryHttp(request, version, territoryId);
    }

    @ApiAction
    public Result searchTerritories(Http.Request request, BigDecimal version) throws Exception {
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        return imp.searchTerritoriesHttp(request, version, sortField, descending, keyword, start, limit);
    }

    @ApiAction
    public Result updateTerritory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueterritoryId = request.getQueryString("territoryId");
        Long territoryId;
        if (valueterritoryId != null) {
            territoryId = Long.parseLong(valueterritoryId);
        } else {
            throw new IllegalArgumentException("'territoryId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.updateTerritoryHttp(request, version, accountId, territoryId, name, active);
    }

}
