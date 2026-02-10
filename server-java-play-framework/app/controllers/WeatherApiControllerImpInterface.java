package controllers;

import java.math.BigDecimal;
import apimodels.WeatherResponse;

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
public abstract class WeatherApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result searchWeatherHttp(Http.Request request, BigDecimal version, Long regionId, Double latitude, Double longitude, Long timezoneOffset) throws Exception {
        WeatherResponse obj = searchWeather(request, version, regionId, latitude, longitude, timezoneOffset);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WeatherResponse searchWeather(Http.Request request, BigDecimal version, Long regionId, Double latitude, Double longitude, Long timezoneOffset) throws Exception;

}
