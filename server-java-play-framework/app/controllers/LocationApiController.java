package controllers;

import java.math.BigDecimal;
import apimodels.CoordsResponse;
import apimodels.GeoPointResponse;
import java.io.InputStream;
import apimodels.LocationSearchResponse;
import apimodels.SirqulResponse;
import apimodels.TrilatCacheRequest;

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
public class LocationApiController extends Controller {
    private final LocationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LocationApiController(Config configuration, LocationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cacheTrilaterationData(Http.Request request, BigDecimal version) throws Exception {
        String valueudid = request.getQueryString("udid");
        String udid;
        if (valueudid != null) {
            udid = valueudid;
        } else {
            throw new IllegalArgumentException("'udid' parameter is required");
        }
        String valuesourceTime = request.getQueryString("sourceTime");
        Long sourceTime;
        if (valuesourceTime != null) {
            sourceTime = Long.parseLong(valuesourceTime);
        } else {
            sourceTime = null;
        }
        String valueminimumSampleSize = request.getQueryString("minimumSampleSize");
        Integer minimumSampleSize;
        if (valueminimumSampleSize != null) {
            minimumSampleSize = Integer.parseInt(valueminimumSampleSize);
        } else {
            minimumSampleSize = null;
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            data = null;
        }
        String valuedataFile = request.getQueryString("dataFile");
        InputStream dataFile;
        if (valuedataFile != null) {
            dataFile = valuedataFile;
        } else {
            dataFile = null;
        }
        return imp.cacheTrilaterationDataHttp(request, version, udid, sourceTime, minimumSampleSize, data, dataFile);
    }

    @ApiAction
    public Result cacheTrilaterationDataGzip(Http.Request request, BigDecimal version) throws Exception {
        JsonNode nodebody = request.body().asJson();
        TrilatCacheRequest body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), TrilatCacheRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.cacheTrilaterationDataGzipHttp(request, version, body);
    }

    @ApiAction
    public Result getLocationByIp(Http.Request request, BigDecimal version) throws Exception {
        String valueip = request.getQueryString("ip");
        String ip;
        if (valueip != null) {
            ip = valueip;
        } else {
            ip = null;
        }
        return imp.getLocationByIpHttp(request, version, ip);
    }

    @ApiAction
    public Result getLocationByTrilateration(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
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
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            data = null;
        }
        String valueresponseFilters = request.getQueryString("responseFilters");
        String responseFilters;
        if (valueresponseFilters != null) {
            responseFilters = valueresponseFilters;
        } else {
            responseFilters = null;
        }
        return imp.getLocationByTrilaterationHttp(request, version, accountId, latitude, longitude, data, responseFilters);
    }

    @ApiAction
    public Result getLocations(Http.Request request, BigDecimal version) throws Exception {
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
        String valuecurrentlatitude = request.getQueryString("currentlatitude");
        Double currentlatitude;
        if (valuecurrentlatitude != null) {
            currentlatitude = Double.parseDouble(valuecurrentlatitude);
        } else {
            currentlatitude = null;
        }
        String valuecurrentlongitude = request.getQueryString("currentlongitude");
        Double currentlongitude;
        if (valuecurrentlongitude != null) {
            currentlongitude = Double.parseDouble(valuecurrentlongitude);
        } else {
            currentlongitude = null;
        }
        String valuecurrentLatitude = request.getQueryString("currentLatitude");
        Double currentLatitude;
        if (valuecurrentLatitude != null) {
            currentLatitude = Double.parseDouble(valuecurrentLatitude);
        } else {
            currentLatitude = null;
        }
        String valuecurrentLongitude = request.getQueryString("currentLongitude");
        Double currentLongitude;
        if (valuecurrentLongitude != null) {
            currentLongitude = Double.parseDouble(valuecurrentLongitude);
        } else {
            currentLongitude = null;
        }
        String valuequery = request.getQueryString("query");
        String query;
        if (valuequery != null) {
            query = valuequery;
        } else {
            query = null;
        }
        String valuezipcode = request.getQueryString("zipcode");
        String zipcode;
        if (valuezipcode != null) {
            zipcode = valuezipcode;
        } else {
            zipcode = null;
        }
        String valuezipCode = request.getQueryString("zipCode");
        String zipCode;
        if (valuezipCode != null) {
            zipCode = valuezipCode;
        } else {
            zipCode = null;
        }
        String valueselectedMaplatitude = request.getQueryString("selectedMaplatitude");
        Double selectedMaplatitude;
        if (valueselectedMaplatitude != null) {
            selectedMaplatitude = Double.parseDouble(valueselectedMaplatitude);
        } else {
            selectedMaplatitude = null;
        }
        String valueselectedMaplongitude = request.getQueryString("selectedMaplongitude");
        Double selectedMaplongitude;
        if (valueselectedMaplongitude != null) {
            selectedMaplongitude = Double.parseDouble(valueselectedMaplongitude);
        } else {
            selectedMaplongitude = null;
        }
        String valueselectedMapLatitude = request.getQueryString("selectedMapLatitude");
        Double selectedMapLatitude;
        if (valueselectedMapLatitude != null) {
            selectedMapLatitude = Double.parseDouble(valueselectedMapLatitude);
        } else {
            selectedMapLatitude = null;
        }
        String valueselectedMapLongitude = request.getQueryString("selectedMapLongitude");
        Double selectedMapLongitude;
        if (valueselectedMapLongitude != null) {
            selectedMapLongitude = Double.parseDouble(valueselectedMapLongitude);
        } else {
            selectedMapLongitude = null;
        }
        String valuesearchRange = request.getQueryString("searchRange");
        Double searchRange;
        if (valuesearchRange != null) {
            searchRange = Double.parseDouble(valuesearchRange);
        } else {
            searchRange = 5;
        }
        String valueuseGeocode = request.getQueryString("useGeocode");
        Boolean useGeocode;
        if (valueuseGeocode != null) {
            useGeocode = Boolean.valueOf(valueuseGeocode);
        } else {
            useGeocode = false;
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
            start = 0;
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
            limit = 20;
        }
        return imp.getLocationsHttp(request, version, deviceId, accountId, currentlatitude, currentlongitude, currentLatitude, currentLongitude, query, zipcode, zipCode, selectedMaplatitude, selectedMaplongitude, selectedMapLatitude, selectedMapLongitude, searchRange, useGeocode, i, start, l, limit);
    }

}
