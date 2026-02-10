package controllers;

import java.math.BigDecimal;
import apimodels.FilterResponse;
import apimodels.FilterTreeResponse;
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
public class FilterApiController extends Controller {
    private final FilterApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FilterApiController(Config configuration, FilterApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createFilter(Http.Request request, BigDecimal version) throws Exception {
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
        String valueparentFilterId = request.getQueryString("parentFilterId");
        Long parentFilterId;
        if (valueparentFilterId != null) {
            parentFilterId = Long.parseLong(valueparentFilterId);
        } else {
            parentFilterId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueexternalType = request.getQueryString("externalType");
        String externalType;
        if (valueexternalType != null) {
            externalType = valueexternalType;
        } else {
            externalType = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.createFilterHttp(request, version, accountId, name, appKey, parentFilterId, description, externalId, externalType, active, metaData);
    }

    @ApiAction
    public Result deleteFilter(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuefilterId = request.getQueryString("filterId");
        Long filterId;
        if (valuefilterId != null) {
            filterId = Long.parseLong(valuefilterId);
        } else {
            throw new IllegalArgumentException("'filterId' parameter is required");
        }
        return imp.deleteFilterHttp(request, version, accountId, filterId);
    }

    @ApiAction
    public Result getFilter(Http.Request request, BigDecimal version) throws Exception {
        String valuefilterId = request.getQueryString("filterId");
        Long filterId;
        if (valuefilterId != null) {
            filterId = Long.parseLong(valuefilterId);
        } else {
            throw new IllegalArgumentException("'filterId' parameter is required");
        }
        return imp.getFilterHttp(request, version, filterId);
    }

    @ApiAction
    public Result searchFilters(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueresponseGroup = request.getQueryString("responseGroup");
        String responseGroup;
        if (valueresponseGroup != null) {
            responseGroup = valueresponseGroup;
        } else {
            responseGroup = null;
        }
        String valuerootOnly = request.getQueryString("rootOnly");
        Boolean rootOnly;
        if (valuerootOnly != null) {
            rootOnly = Boolean.valueOf(valuerootOnly);
        } else {
            rootOnly = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "DISPLAY";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = false;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = true;
        }
        return imp.searchFiltersHttp(request, version, accountId, keyword, appKey, responseGroup, rootOnly, sortField, descending, start, limit, activeOnly);
    }

    @ApiAction
    public Result updateFilter(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuefilterId = request.getQueryString("filterId");
        Long filterId;
        if (valuefilterId != null) {
            filterId = Long.parseLong(valuefilterId);
        } else {
            throw new IllegalArgumentException("'filterId' parameter is required");
        }
        String valueparentFilterId = request.getQueryString("parentFilterId");
        Long parentFilterId;
        if (valueparentFilterId != null) {
            parentFilterId = Long.parseLong(valueparentFilterId);
        } else {
            parentFilterId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuedescription = request.getQueryString("description");
        String description;
        if (valuedescription != null) {
            description = valuedescription;
        } else {
            description = null;
        }
        String valueexternalId = request.getQueryString("externalId");
        String externalId;
        if (valueexternalId != null) {
            externalId = valueexternalId;
        } else {
            externalId = null;
        }
        String valueexternalType = request.getQueryString("externalType");
        String externalType;
        if (valueexternalType != null) {
            externalType = valueexternalType;
        } else {
            externalType = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.updateFilterHttp(request, version, accountId, filterId, parentFilterId, name, description, externalId, externalType, active, metaData);
    }

}
