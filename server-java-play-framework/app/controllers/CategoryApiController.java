package controllers;

import java.math.BigDecimal;
import apimodels.CategoryResponse;
import apimodels.CategoryTreeResponse;
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
public class CategoryApiController extends Controller {
    private final CategoryApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private CategoryApiController(Config configuration, CategoryApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result categoryDistanceSearch(Http.Request request, BigDecimal version) throws Exception {
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
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueparentCategoryIds = request.getQueryString("parentCategoryIds");
        String parentCategoryIds;
        if (valueparentCategoryIds != null) {
            parentCategoryIds = valueparentCategoryIds;
        } else {
            parentCategoryIds = null;
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
        String valueresponseGroup = request.getQueryString("responseGroup");
        String responseGroup;
        if (valueresponseGroup != null) {
            responseGroup = valueresponseGroup;
        } else {
            responseGroup = null;
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
        String valuereturnExternal = request.getQueryString("returnExternal");
        Boolean returnExternal;
        if (valuereturnExternal != null) {
            returnExternal = Boolean.valueOf(valuereturnExternal);
        } else {
            returnExternal = null;
        }
        String valueexactMatch = request.getQueryString("exactMatch");
        Boolean exactMatch;
        if (valueexactMatch != null) {
            exactMatch = Boolean.valueOf(valueexactMatch);
        } else {
            exactMatch = null;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueexternalType = request.getQueryString("externalType");
        String externalType;
        if (valueexternalType != null) {
            externalType = valueexternalType;
        } else {
            externalType = null;
        }
        String valueminOfferCount = request.getQueryString("minOfferCount");
        Integer minOfferCount;
        if (valueminOfferCount != null) {
            minOfferCount = Integer.parseInt(valueminOfferCount);
        } else {
            minOfferCount = null;
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
        String valuerange = request.getQueryString("range");
        Double range;
        if (valuerange != null) {
            range = Double.parseDouble(valuerange);
        } else {
            range = null;
        }
        return imp.categoryDistanceSearchHttp(request, version, accountId, keyword, appKey, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, minOfferCount, latitude, longitude, range);
    }

    @ApiAction
    public Result createCategory(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueparentCategoryId = request.getQueryString("parentCategoryId");
        Long parentCategoryId;
        if (valueparentCategoryId != null) {
            parentCategoryId = Long.parseLong(valueparentCategoryId);
        } else {
            parentCategoryId = null;
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
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
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
        String valueexternalCategorySlug = request.getQueryString("externalCategorySlug");
        String externalCategorySlug;
        if (valueexternalCategorySlug != null) {
            externalCategorySlug = valueexternalCategorySlug;
        } else {
            externalCategorySlug = null;
        }
        String valuesqootSlug = request.getQueryString("sqootSlug");
        String sqootSlug;
        if (valuesqootSlug != null) {
            sqootSlug = valuesqootSlug;
        } else {
            sqootSlug = null;
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
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        return imp.createCategoryHttp(request, version, accountId, name, appKey, parentCategoryId, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags);
    }

    @ApiAction
    public Result deleteCategory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            throw new IllegalArgumentException("'categoryId' parameter is required");
        }
        return imp.deleteCategoryHttp(request, version, accountId, categoryId);
    }

    @ApiAction
    public Result duplicateCategory(Http.Request request, BigDecimal version) throws Exception {
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            throw new IllegalArgumentException("'categoryId' parameter is required");
        }
        String valueparentCategoryId = request.getQueryString("parentCategoryId");
        Long parentCategoryId;
        if (valueparentCategoryId != null) {
            parentCategoryId = Long.parseLong(valueparentCategoryId);
        } else {
            parentCategoryId = null;
        }
        return imp.duplicateCategoryHttp(request, version, accountId, categoryId, appKey, parentCategoryId);
    }

    @ApiAction
    public Result getCategory(Http.Request request, BigDecimal version) throws Exception {
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            throw new IllegalArgumentException("'categoryId' parameter is required");
        }
        String valuereturnExternal = request.getQueryString("returnExternal");
        Boolean returnExternal;
        if (valuereturnExternal != null) {
            returnExternal = Boolean.valueOf(valuereturnExternal);
        } else {
            returnExternal = true;
        }
        return imp.getCategoryHttp(request, version, categoryId, returnExternal);
    }

    @ApiAction
    public Result searchCategories(Http.Request request, BigDecimal version) throws Exception {
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
        String valuecategoryId = request.getQueryString("categoryId");
        String categoryId;
        if (valuecategoryId != null) {
            categoryId = valuecategoryId;
        } else {
            categoryId = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valueparentCategoryIds = request.getQueryString("parentCategoryIds");
        String parentCategoryIds;
        if (valueparentCategoryIds != null) {
            parentCategoryIds = valueparentCategoryIds;
        } else {
            parentCategoryIds = null;
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
        String valueresponseGroup = request.getQueryString("responseGroup");
        String responseGroup;
        if (valueresponseGroup != null) {
            responseGroup = valueresponseGroup;
        } else {
            responseGroup = null;
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
        String valuereturnExternal = request.getQueryString("returnExternal");
        Boolean returnExternal;
        if (valuereturnExternal != null) {
            returnExternal = Boolean.valueOf(valuereturnExternal);
        } else {
            returnExternal = true;
        }
        String valueexactMatch = request.getQueryString("exactMatch");
        Boolean exactMatch;
        if (valueexactMatch != null) {
            exactMatch = Boolean.valueOf(valueexactMatch);
        } else {
            exactMatch = false;
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueexternalType = request.getQueryString("externalType");
        String externalType;
        if (valueexternalType != null) {
            externalType = valueexternalType;
        } else {
            externalType = null;
        }
        String valueexcludeExternalType = request.getQueryString("excludeExternalType");
        Boolean excludeExternalType;
        if (valueexcludeExternalType != null) {
            excludeExternalType = Boolean.valueOf(valueexcludeExternalType);
        } else {
            excludeExternalType = null;
        }
        String valueminOfferCount = request.getQueryString("minOfferCount");
        Integer minOfferCount;
        if (valueminOfferCount != null) {
            minOfferCount = Integer.parseInt(valueminOfferCount);
        } else {
            minOfferCount = null;
        }
        String valuesearchDepth = request.getQueryString("searchDepth");
        Integer searchDepth;
        if (valuesearchDepth != null) {
            searchDepth = Integer.parseInt(valuesearchDepth);
        } else {
            searchDepth = 4;
        }
        String valuesearchMode = request.getQueryString("searchMode");
        String searchMode;
        if (valuesearchMode != null) {
            searchMode = valuesearchMode;
        } else {
            searchMode = null;
        }
        return imp.searchCategoriesHttp(request, version, accountId, keyword, appKey, categoryId, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, type, externalType, excludeExternalType, minOfferCount, searchDepth, searchMode);
    }

    @ApiAction
    public Result updateCategory(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecategoryId = request.getQueryString("categoryId");
        Long categoryId;
        if (valuecategoryId != null) {
            categoryId = Long.parseLong(valuecategoryId);
        } else {
            throw new IllegalArgumentException("'categoryId' parameter is required");
        }
        String valueparentCategoryId = request.getQueryString("parentCategoryId");
        Long parentCategoryId;
        if (valueparentCategoryId != null) {
            parentCategoryId = Long.parseLong(valueparentCategoryId);
        } else {
            parentCategoryId = null;
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
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valueassetId = request.getQueryString("assetId");
        Long assetId;
        if (valueassetId != null) {
            assetId = Long.parseLong(valueassetId);
        } else {
            assetId = null;
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
        String valueexternalCategorySlug = request.getQueryString("externalCategorySlug");
        String externalCategorySlug;
        if (valueexternalCategorySlug != null) {
            externalCategorySlug = valueexternalCategorySlug;
        } else {
            externalCategorySlug = null;
        }
        String valuesqootSlug = request.getQueryString("sqootSlug");
        String sqootSlug;
        if (valuesqootSlug != null) {
            sqootSlug = valuesqootSlug;
        } else {
            sqootSlug = null;
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
        String valuesearchTags = request.getQueryString("searchTags");
        String searchTags;
        if (valuesearchTags != null) {
            searchTags = valuesearchTags;
        } else {
            searchTags = null;
        }
        return imp.updateCategoryHttp(request, version, accountId, categoryId, parentCategoryId, name, description, type, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags);
    }

}
