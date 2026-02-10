package controllers;

import java.math.BigDecimal;
import apimodels.RouteSettings;

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
public abstract class RouteSettingApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createRouteSettingsHttp(Http.Request request, BigDecimal version, RouteSettings body) throws Exception {
        RouteSettings obj = createRouteSettings(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings createRouteSettings(Http.Request request, BigDecimal version, RouteSettings body) throws Exception;

    public Result deleteRouteSettingsHttp(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception {
        Object obj = deleteRouteSettings(request, version, routeSettingsId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object deleteRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception;

    public Result getRouteSettingsHttp(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception {
        RouteSettings obj = getRouteSettings(request, version, routeSettingsId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings getRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception;

    public Result searchRouteSettingsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long hubId, Long programId, String keyword) throws Exception {
        List<RouteSettings> obj = searchRouteSettings(request, version, sortField, descending, start, limit, activeOnly, hubId, programId, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RouteSettings curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RouteSettings> searchRouteSettings(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long hubId, Long programId, String keyword) throws Exception;

    public Result updateRouteSettingsHttp(Http.Request request, BigDecimal version, Long routeSettingsId, RouteSettings body) throws Exception {
        RouteSettings obj = updateRouteSettings(request, version, routeSettingsId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings updateRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId, RouteSettings body) throws Exception;

}
