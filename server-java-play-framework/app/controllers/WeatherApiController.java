package controllers;

import java.math.BigDecimal;
import apimodels.WeatherResponse;

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
public class WeatherApiController extends Controller {
    private final WeatherApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private WeatherApiController(Config configuration, WeatherApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result searchWeather(Http.Request request, BigDecimal version) throws Exception {
        String valueregionId = request.getQueryString("regionId");
        Long regionId;
        if (valueregionId != null) {
            regionId = Long.parseLong(valueregionId);
        } else {
            regionId = null;
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
        String valuetimezoneOffset = request.getQueryString("timezoneOffset");
        Long timezoneOffset;
        if (valuetimezoneOffset != null) {
            timezoneOffset = Long.parseLong(valuetimezoneOffset);
        } else {
            timezoneOffset = -6;
        }
        return imp.searchWeatherHttp(request, version, regionId, latitude, longitude, timezoneOffset);
    }

}
