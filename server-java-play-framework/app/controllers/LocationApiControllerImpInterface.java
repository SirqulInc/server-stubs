package controllers;

import java.math.BigDecimal;
import apimodels.CoordsResponse;
import apimodels.GeoPointResponse;
import java.io.InputStream;
import apimodels.LocationSearchResponse;
import apimodels.SirqulResponse;
import apimodels.TrilatCacheRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class LocationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cacheTrilaterationDataHttp(Http.Request request, BigDecimal version, @NotNull String udid, Long sourceTime, Integer minimumSampleSize, String data, InputStream dataFile) throws Exception {
        SirqulResponse obj = cacheTrilaterationData(request, version, udid, sourceTime, minimumSampleSize, data, dataFile);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse cacheTrilaterationData(Http.Request request, BigDecimal version, @NotNull String udid, Long sourceTime, Integer minimumSampleSize, String data, InputStream dataFile) throws Exception;

    public Result cacheTrilaterationDataGzipHttp(Http.Request request, BigDecimal version, TrilatCacheRequest body) throws Exception {
        SirqulResponse obj = cacheTrilaterationDataGzip(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse cacheTrilaterationDataGzip(Http.Request request, BigDecimal version, TrilatCacheRequest body) throws Exception;

    public Result getLocationByIpHttp(Http.Request request, BigDecimal version, String ip) throws Exception {
        CoordsResponse obj = getLocationByIp(request, version, ip);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CoordsResponse getLocationByIp(Http.Request request, BigDecimal version, String ip) throws Exception;

    public Result getLocationByTrilaterationHttp(Http.Request request, BigDecimal version, Long accountId, Double latitude, Double longitude, String data, String responseFilters) throws Exception {
        GeoPointResponse obj = getLocationByTrilateration(request, version, accountId, latitude, longitude, data, responseFilters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GeoPointResponse getLocationByTrilateration(Http.Request request, BigDecimal version, Long accountId, Double latitude, Double longitude, String data, String responseFilters) throws Exception;

    public Result getLocationsHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double currentlatitude, Double currentlongitude, Double currentLatitude, Double currentLongitude, String query, String zipcode, String zipCode, Double selectedMaplatitude, Double selectedMaplongitude, Double selectedMapLatitude, Double selectedMapLongitude, Double searchRange, Boolean useGeocode, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        LocationSearchResponse obj = getLocations(request, version, deviceId, accountId, currentlatitude, currentlongitude, currentLatitude, currentLongitude, query, zipcode, zipCode, selectedMaplatitude, selectedMaplongitude, selectedMapLatitude, selectedMapLongitude, searchRange, useGeocode, i, start, l, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LocationSearchResponse getLocations(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double currentlatitude, Double currentlongitude, Double currentLatitude, Double currentLongitude, String query, String zipcode, String zipCode, Double selectedMaplatitude, Double selectedMaplongitude, Double selectedMapLatitude, Double selectedMapLongitude, Double searchRange, Boolean useGeocode, Integer i, Integer start, Integer l, Integer limit) throws Exception;

}
