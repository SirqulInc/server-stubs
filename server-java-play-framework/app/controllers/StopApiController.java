package controllers;

import java.math.BigDecimal;
import apimodels.Stop;

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
public class StopApiController extends Controller {
    private final StopApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private StopApiController(Config configuration, StopApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getStop(Http.Request request, BigDecimal version,Long id) throws Exception {
        return imp.getStopHttp(request, version, id);
    }

    @ApiAction
    public Result updateStop(Http.Request request, BigDecimal version,Long id) throws Exception {
        JsonNode nodebody = request.body().asJson();
        Stop body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), Stop.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        return imp.updateStopHttp(request, version, id, body);
    }

}
