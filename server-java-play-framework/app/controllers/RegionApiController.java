package controllers;

import java.math.BigDecimal;
import apimodels.RegionResponse;

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
public class RegionApiController extends Controller {
    private final RegionApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RegionApiController(Config configuration, RegionApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createRegion(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueregionClass = request.getQueryString("regionClass");
        String regionClass;
        if (valueregionClass != null) {
            regionClass = valueregionClass;
        } else {
            throw new IllegalArgumentException("'regionClass' parameter is required");
        }
        String valueshortName = request.getQueryString("shortName");
        String shortName;
        if (valueshortName != null) {
            shortName = valueshortName;
        } else {
            throw new IllegalArgumentException("'shortName' parameter is required");
        }
        String valuefullName = request.getQueryString("fullName");
        String fullName;
        if (valuefullName != null) {
            fullName = valuefullName;
        } else {
            fullName = null;
        }
        String valueparentIds = request.getQueryString("parentIds");
        String parentIds;
        if (valueparentIds != null) {
            parentIds = valueparentIds;
        } else {
            parentIds = null;
        }
        String valuechildrenIds = request.getQueryString("childrenIds");
        String childrenIds;
        if (valuechildrenIds != null) {
            childrenIds = valuechildrenIds;
        } else {
            childrenIds = null;
        }
        String valuepostalCodeIds = request.getQueryString("postalCodeIds");
        String postalCodeIds;
        if (valuepostalCodeIds != null) {
            postalCodeIds = valuepostalCodeIds;
        } else {
            postalCodeIds = null;
        }
        String valuelocations = request.getQueryString("locations");
        String locations;
        if (valuelocations != null) {
            locations = valuelocations;
        } else {
            locations = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valueend = request.getQueryString("end");
        Long end;
        if (valueend != null) {
            end = Long.parseLong(valueend);
        } else {
            end = null;
        }
        String valuepolygon = request.getQueryString("polygon");
        String polygon;
        if (valuepolygon != null) {
            polygon = valuepolygon;
        } else {
            polygon = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
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
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueroot = request.getQueryString("root");
        Boolean root;
        if (valueroot != null) {
            root = Boolean.valueOf(valueroot);
        } else {
            root = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.createRegionHttp(request, version, accountId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active);
    }

    @ApiAction
    public Result deleteRegion(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        return imp.deleteRegionHttp(request, version, accountId, regionId);
    }

    @ApiAction
    public Result getRegion(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        return imp.getRegionHttp(request, version, regionId, accountId);
    }

    @ApiAction
    public Result searchRegions(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
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
        String valueregionClass = request.getQueryString("regionClass");
        String regionClass;
        if (valueregionClass != null) {
            regionClass = valueregionClass;
        } else {
            regionClass = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuesearchMode = request.getQueryString("searchMode");
        String searchMode;
        if (valuesearchMode != null) {
            searchMode = valuesearchMode;
        } else {
            searchMode = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = null;
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = null;
        }
        String valueincludeParent = request.getQueryString("includeParent");
        Boolean includeParent;
        if (valueincludeParent != null) {
            includeParent = Boolean.valueOf(valueincludeParent);
        } else {
            includeParent = null;
        }
        String valueincludeChildren = request.getQueryString("includeChildren");
        Boolean includeChildren;
        if (valueincludeChildren != null) {
            includeChildren = Boolean.valueOf(valueincludeChildren);
        } else {
            includeChildren = null;
        }
        String valueincludePostalCodes = request.getQueryString("includePostalCodes");
        Boolean includePostalCodes;
        if (valueincludePostalCodes != null) {
            includePostalCodes = Boolean.valueOf(valueincludePostalCodes);
        } else {
            includePostalCodes = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = null;
        }
        String valueshowDeleted = request.getQueryString("showDeleted");
        Boolean showDeleted;
        if (valueshowDeleted != null) {
            showDeleted = Boolean.valueOf(valueshowDeleted);
        } else {
            showDeleted = null;
        }
        String valuelastUpdatedSince = request.getQueryString("lastUpdatedSince");
        Long lastUpdatedSince;
        if (valuelastUpdatedSince != null) {
            lastUpdatedSince = Long.parseLong(valuelastUpdatedSince);
        } else {
            lastUpdatedSince = null;
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
        return imp.searchRegionsHttp(request, version, accountId, query, keyword, latitude, longitude, range, regionClass, visibility, searchMode, sortField, descending, includeParent, includeChildren, includePostalCodes, categoryIds, filterIds, versionCode, activeOnly, showDeleted, lastUpdatedSince, start, limit);
    }

    @ApiAction
    public Result updateRegion(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            throw new IllegalArgumentException("'regionId' parameter is required");
        }
        String valueregionClass = request.getQueryString("regionClass");
        String regionClass;
        if (valueregionClass != null) {
            regionClass = valueregionClass;
        } else {
            regionClass = null;
        }
        String valueshortName = request.getQueryString("shortName");
        String shortName;
        if (valueshortName != null) {
            shortName = valueshortName;
        } else {
            shortName = null;
        }
        String valuefullName = request.getQueryString("fullName");
        String fullName;
        if (valuefullName != null) {
            fullName = valuefullName;
        } else {
            fullName = null;
        }
        String valueparentIds = request.getQueryString("parentIds");
        String parentIds;
        if (valueparentIds != null) {
            parentIds = valueparentIds;
        } else {
            parentIds = null;
        }
        String valuechildrenIds = request.getQueryString("childrenIds");
        String childrenIds;
        if (valuechildrenIds != null) {
            childrenIds = valuechildrenIds;
        } else {
            childrenIds = null;
        }
        String valuepostalCodeIds = request.getQueryString("postalCodeIds");
        String postalCodeIds;
        if (valuepostalCodeIds != null) {
            postalCodeIds = valuepostalCodeIds;
        } else {
            postalCodeIds = null;
        }
        String valuelocations = request.getQueryString("locations");
        String locations;
        if (valuelocations != null) {
            locations = valuelocations;
        } else {
            locations = null;
        }
        String valueretailerLocationId = request.getQueryString("retailerLocationId");
        Long retailerLocationId;
        if (valueretailerLocationId != null) {
            retailerLocationId = Long.parseLong(valueretailerLocationId);
        } else {
            retailerLocationId = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            start = null;
        }
        String valueend = request.getQueryString("end");
        Long end;
        if (valueend != null) {
            end = Long.parseLong(valueend);
        } else {
            end = null;
        }
        String valuepolygon = request.getQueryString("polygon");
        String polygon;
        if (valuepolygon != null) {
            polygon = valuepolygon;
        } else {
            polygon = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
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
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueroot = request.getQueryString("root");
        Boolean root;
        if (valueroot != null) {
            root = Boolean.valueOf(valueroot);
        } else {
            root = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueclearLists = request.getQueryString("clearLists");
        Boolean clearLists;
        if (valueclearLists != null) {
            clearLists = Boolean.valueOf(valueclearLists);
        } else {
            clearLists = null;
        }
        return imp.updateRegionHttp(request, version, accountId, regionId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active, clearLists);
    }

}
