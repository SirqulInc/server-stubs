package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;

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
public abstract class WorkflowApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result runWorkflowHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long workflowId, Long skuId, Integer versionCode, String parameters) throws Exception {
        SirqulResponse obj = runWorkflow(request, version, accountId, workflowId, skuId, versionCode, parameters);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse runWorkflow(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long workflowId, Long skuId, Integer versionCode, String parameters) throws Exception;

}
