package controllers;

import apimodels.SirqulResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class WorkflowApiController extends Controller {
    private final WorkflowApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private WorkflowApiController(Config configuration, WorkflowApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result runWorkflow(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueworkflowId = request.getQueryString("workflowId");
        Long workflowId;
        if (valueworkflowId != null) {
            workflowId = Long.parseLong(valueworkflowId);
        } else {
            throw new IllegalArgumentException("'workflowId' parameter is required");
        }
        String valueskuId = request.getQueryString("skuId");
        Long skuId;
        if (valueskuId != null) {
            skuId = Long.parseLong(valueskuId);
        } else {
            skuId = null;
        }
        String valueversionCode = request.getQueryString("versionCode");
        Integer versionCode;
        if (valueversionCode != null) {
            versionCode = Integer.parseInt(valueversionCode);
        } else {
            versionCode = null;
        }
        String valueparameters = request.getQueryString("parameters");
        String parameters;
        if (valueparameters != null) {
            parameters = valueparameters;
        } else {
            parameters = null;
        }
        return imp.runWorkflowHttp(request, accountId, workflowId, skuId, versionCode, parameters);
    }

}
