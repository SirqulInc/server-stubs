package controllers;

import java.math.BigDecimal;
import apimodels.PathingResponse;

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
public class PathingApiController extends Controller {
    private final PathingApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PathingApiController(Config configuration, PathingApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result computePath(Http.Request request, BigDecimal version) throws Exception {
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        String valueunits = request.getQueryString("units");
        String units;
        if (valueunits != null) {
            units = valueunits;
        } else {
            throw new IllegalArgumentException("'units' parameter is required");
        }
        String valuereducePath = request.getQueryString("reducePath");
        Boolean reducePath;
        if (valuereducePath != null) {
            reducePath = Boolean.valueOf(valuereducePath);
        } else {
            throw new IllegalArgumentException("'reducePath' parameter is required");
        }
        String valuedirections = request.getQueryString("directions");
        Boolean directions;
        if (valuedirections != null) {
            directions = Boolean.valueOf(valuedirections);
        } else {
            throw new IllegalArgumentException("'directions' parameter is required");
        }
        return imp.computePathHttp(request, version, data, units, reducePath, directions);
    }

}
