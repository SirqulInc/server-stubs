package controllers;

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

    public Result createRouteSettingsHttp(Http.Request request, RouteSettings body) throws Exception {
        RouteSettings obj = createRouteSettings(request, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings createRouteSettings(Http.Request request, RouteSettings body) throws Exception;

    public Result deleteRouteSettingsHttp(Http.Request request, Long routeSettingsId) throws Exception {
        Object obj = deleteRouteSettings(request, routeSettingsId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object deleteRouteSettings(Http.Request request, Long routeSettingsId) throws Exception;

    public Result getRouteSettingsHttp(Http.Request request, Long routeSettingsId) throws Exception {
        RouteSettings obj = getRouteSettings(request, routeSettingsId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings getRouteSettings(Http.Request request, Long routeSettingsId) throws Exception;

    public Result searchRouteSettingsHttp(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long hubId, Long programId, String keyword) throws Exception {
        List<RouteSettings> obj = searchRouteSettings(request, sortField, descending, start, limit, activeOnly, hubId, programId, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RouteSettings curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RouteSettings> searchRouteSettings(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long hubId, Long programId, String keyword) throws Exception;

    public Result updateRouteSettingsHttp(Http.Request request, Long routeSettingsId, RouteSettings body) throws Exception {
        RouteSettings obj = updateRouteSettings(request, routeSettingsId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RouteSettings updateRouteSettings(Http.Request request, Long routeSettingsId, RouteSettings body) throws Exception;

}
