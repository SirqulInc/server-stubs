package controllers;

import apimodels.AccountLoginResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerFullResponse;
import apimodels.RetailerResponse;
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
public class RetailerApiController extends Controller {
    private final RetailerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private RetailerApiController(Config configuration, RetailerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createRetailer(Http.Request request, BigDecimal version) throws Exception {
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
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            website = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valuefacebookUrl = request.getQueryString("facebookUrl");
        String facebookUrl;
        if (valuefacebookUrl != null) {
            facebookUrl = valuefacebookUrl;
        } else {
            facebookUrl = null;
        }
        String valuetwitterUrl = request.getQueryString("twitterUrl");
        String twitterUrl;
        if (valuetwitterUrl != null) {
            twitterUrl = valuetwitterUrl;
        } else {
            twitterUrl = null;
        }
        String valuelogo = request.getQueryString("logo");
        InputStream logo;
        if (valuelogo != null) {
            logo = valuelogo;
        } else {
            logo = null;
        }
        String valuelogoAssetId = request.getQueryString("logoAssetId");
        Long logoAssetId;
        if (valuelogoAssetId != null) {
            logoAssetId = Long.parseLong(valuelogoAssetId);
        } else {
            logoAssetId = null;
        }
        String valuepicture1 = request.getQueryString("picture1");
        InputStream picture1;
        if (valuepicture1 != null) {
            picture1 = valuepicture1;
        } else {
            picture1 = null;
        }
        String valuepicture1AssetId = request.getQueryString("picture1AssetId");
        Long picture1AssetId;
        if (valuepicture1AssetId != null) {
            picture1AssetId = Long.parseLong(valuepicture1AssetId);
        } else {
            picture1AssetId = null;
        }
        String valuepicture2 = request.getQueryString("picture2");
        InputStream picture2;
        if (valuepicture2 != null) {
            picture2 = valuepicture2;
        } else {
            picture2 = null;
        }
        String valuepicture2AssetId = request.getQueryString("picture2AssetId");
        Long picture2AssetId;
        if (valuepicture2AssetId != null) {
            picture2AssetId = Long.parseLong(valuepicture2AssetId);
        } else {
            picture2AssetId = null;
        }
        String valuecategoryIds = request.getQueryString("categoryIds");
        String categoryIds;
        if (valuecategoryIds != null) {
            categoryIds = valuecategoryIds;
        } else {
            categoryIds = null;
        }
        String valuecategoryIdsToAdd = request.getQueryString("categoryIdsToAdd");
        String categoryIdsToAdd;
        if (valuecategoryIdsToAdd != null) {
            categoryIdsToAdd = valuecategoryIdsToAdd;
        } else {
            categoryIdsToAdd = null;
        }
        String valuecategoryIdsToRemove = request.getQueryString("categoryIdsToRemove");
        String categoryIdsToRemove;
        if (valuecategoryIdsToRemove != null) {
            categoryIdsToRemove = valuecategoryIdsToRemove;
        } else {
            categoryIdsToRemove = null;
        }
        String valuefilterIds = request.getQueryString("filterIds");
        String filterIds;
        if (valuefilterIds != null) {
            filterIds = valuefilterIds;
        } else {
            filterIds = null;
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
        String valueretailerType = request.getQueryString("retailerType");
        String retailerType;
        if (valueretailerType != null) {
            retailerType = valueretailerType;
        } else {
            retailerType = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valuecreateDefaultLocation = request.getQueryString("createDefaultLocation");
        Boolean createDefaultLocation;
        if (valuecreateDefaultLocation != null) {
            createDefaultLocation = Boolean.valueOf(valuecreateDefaultLocation);
        } else {
            createDefaultLocation = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        return imp.createRetailerHttp(request, version, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, categoryIdsToAdd, categoryIdsToRemove, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, createDefaultLocation, responseFormat);
    }

    @ApiAction
    public Result deleteRetailer(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            retailerId = null;
        }
        return imp.deleteRetailerHttp(request, version, deviceId, accountId, retailerId);
    }

    @ApiAction
    public Result getRetailer(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            throw new IllegalArgumentException("'retailerId' parameter is required");
        }
        String valueincludeCounts = request.getQueryString("includeCounts");
        Boolean includeCounts;
        if (valueincludeCounts != null) {
            includeCounts = Boolean.valueOf(valueincludeCounts);
        } else {
            includeCounts = null;
        }
        return imp.getRetailerHttp(request, version, retailerId, deviceId, accountId, includeCounts);
    }

    @ApiAction
    public Result getRetailers(Http.Request request, BigDecimal version) throws Exception {
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
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            throw new IllegalArgumentException("'visibility' parameter is required");
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
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            throw new IllegalArgumentException("'activeOnly' parameter is required");
        }
        return imp.getRetailersHttp(request, version, visibility, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, categoryIds, filterIds, i, l);
    }

    @ApiAction
    public Result retailerLoginCheck(Http.Request request, BigDecimal version) throws Exception {
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
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
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.retailerLoginCheckHttp(request, version, username, password, deviceId, latitude, longitude, appKey);
    }

    @ApiAction
    public Result updateRetailer(Http.Request request, BigDecimal version) throws Exception {
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
        String valueretailerId = request.getQueryString("retailerId");
        Long retailerId;
        if (valueretailerId != null) {
            retailerId = Long.parseLong(valueretailerId);
        } else {
            throw new IllegalArgumentException("'retailerId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestreetAddress = request.getQueryString("streetAddress");
        String streetAddress;
        if (valuestreetAddress != null) {
            streetAddress = valuestreetAddress;
        } else {
            streetAddress = null;
        }
        String valuestreetAddress2 = request.getQueryString("streetAddress2");
        String streetAddress2;
        if (valuestreetAddress2 != null) {
            streetAddress2 = valuestreetAddress2;
        } else {
            streetAddress2 = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuebusinessPhone = request.getQueryString("businessPhone");
        String businessPhone;
        if (valuebusinessPhone != null) {
            businessPhone = valuebusinessPhone;
        } else {
            businessPhone = null;
        }
        String valuebusinessPhoneExt = request.getQueryString("businessPhoneExt");
        String businessPhoneExt;
        if (valuebusinessPhoneExt != null) {
            businessPhoneExt = valuebusinessPhoneExt;
        } else {
            businessPhoneExt = null;
        }
        String valuewebsite = request.getQueryString("website");
        String website;
        if (valuewebsite != null) {
            website = valuewebsite;
        } else {
            website = null;
        }
        String valueemail = request.getQueryString("email");
        String email;
        if (valueemail != null) {
            email = valueemail;
        } else {
            email = null;
        }
        String valuefacebookUrl = request.getQueryString("facebookUrl");
        String facebookUrl;
        if (valuefacebookUrl != null) {
            facebookUrl = valuefacebookUrl;
        } else {
            facebookUrl = null;
        }
        String valuetwitterUrl = request.getQueryString("twitterUrl");
        String twitterUrl;
        if (valuetwitterUrl != null) {
            twitterUrl = valuetwitterUrl;
        } else {
            twitterUrl = null;
        }
        String valuelogo = request.getQueryString("logo");
        InputStream logo;
        if (valuelogo != null) {
            logo = valuelogo;
        } else {
            logo = null;
        }
        String valuelogoAssetId = request.getQueryString("logoAssetId");
        Long logoAssetId;
        if (valuelogoAssetId != null) {
            logoAssetId = Long.parseLong(valuelogoAssetId);
        } else {
            logoAssetId = null;
        }
        String valuepicture1 = request.getQueryString("picture1");
        InputStream picture1;
        if (valuepicture1 != null) {
            picture1 = valuepicture1;
        } else {
            picture1 = null;
        }
        String valuepicture1AssetId = request.getQueryString("picture1AssetId");
        Long picture1AssetId;
        if (valuepicture1AssetId != null) {
            picture1AssetId = Long.parseLong(valuepicture1AssetId);
        } else {
            picture1AssetId = null;
        }
        String valuepicture2 = request.getQueryString("picture2");
        InputStream picture2;
        if (valuepicture2 != null) {
            picture2 = valuepicture2;
        } else {
            picture2 = null;
        }
        String valuepicture2AssetId = request.getQueryString("picture2AssetId");
        Long picture2AssetId;
        if (valuepicture2AssetId != null) {
            picture2AssetId = Long.parseLong(valuepicture2AssetId);
        } else {
            picture2AssetId = null;
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
        String valueretailerType = request.getQueryString("retailerType");
        String retailerType;
        if (valueretailerType != null) {
            retailerType = valueretailerType;
        } else {
            retailerType = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valueresponseFormat = request.getQueryString("responseFormat");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat;
        } else {
            responseFormat = null;
        }
        return imp.updateRetailerHttp(request, version, retailerId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, active, responseFormat);
    }

}
