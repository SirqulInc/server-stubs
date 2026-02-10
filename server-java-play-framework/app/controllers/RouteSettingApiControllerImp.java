package controllers;

import java.math.BigDecimal;
import apimodels.RouteSettings;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RouteSettingApiControllerImp extends RouteSettingApiControllerImpInterface {
    @Override
    public RouteSettings createRouteSettings(Http.Request request, BigDecimal version, RouteSettings body) throws Exception {
        //Do your magic!!!
        return new RouteSettings();
    }

    @Override
    public Object deleteRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception {
        //Do your magic!!!
        return new Object();
    }

    @Override
    public RouteSettings getRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId) throws Exception {
        //Do your magic!!!
        return new RouteSettings();
    }

    @Override
    public List<RouteSettings> searchRouteSettings(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, Long hubId, Long programId, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<RouteSettings>();
    }

    @Override
    public RouteSettings updateRouteSettings(Http.Request request, BigDecimal version, Long routeSettingsId, RouteSettings body) throws Exception {
        //Do your magic!!!
        return new RouteSettings();
    }

}
