package controllers;

import apimodels.Account;
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
public abstract class DependentApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createHttp(Http.Request request, BigDecimal version, Long accountId, Account body) throws Exception {
        SirqulResponse obj = create(request, version, accountId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse create(Http.Request request, BigDecimal version, Long accountId, Account body) throws Exception;

    public Result getDependentsHttp(Http.Request request, BigDecimal version, Long accountId) throws Exception {
        SirqulResponse obj = getDependents(request, version, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getDependents(Http.Request request, BigDecimal version, Long accountId) throws Exception;

    public Result removeDependentHttp(Http.Request request, BigDecimal version, Long accountId, Long dependentId) throws Exception {
        removeDependent(request, version, accountId, dependentId);
        return ok();

    }

    public abstract void removeDependent(Http.Request request, BigDecimal version, Long accountId, Long dependentId) throws Exception;

}
