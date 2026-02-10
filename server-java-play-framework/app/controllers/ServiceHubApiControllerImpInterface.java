package controllers;

import java.math.BigDecimal;
import apimodels.ServiceHub;

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
public abstract class ServiceHubApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createServiceHubHttp(Http.Request request, BigDecimal version, ServiceHub body) throws Exception {
        ServiceHub obj = createServiceHub(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ServiceHub createServiceHub(Http.Request request, BigDecimal version, ServiceHub body) throws Exception;

    public Result deleteServiceHubHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        deleteServiceHub(request, version, id);
        return ok();

    }

    public abstract void deleteServiceHub(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result getServiceHubHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        Object obj = getServiceHub(request, version, id);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object getServiceHub(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result postServiceHubHttp(Http.Request request, BigDecimal version, Long id, ServiceHub body) throws Exception {
        ServiceHub obj = postServiceHub(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ServiceHub postServiceHub(Http.Request request, BigDecimal version, Long id, ServiceHub body) throws Exception;

    public Result putServiceHubHttp(Http.Request request, BigDecimal version, Long id, ServiceHub body) throws Exception {
        ServiceHub obj = putServiceHub(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ServiceHub putServiceHub(Http.Request request, BigDecimal version, Long id, ServiceHub body) throws Exception;

    public Result searchServiceHubsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword, Long retailerId) throws Exception {
        List<ServiceHub> obj = searchServiceHubs(request, version, sortField, descending, start, limit, activeOnly, keyword, retailerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (ServiceHub curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<ServiceHub> searchServiceHubs(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword, Long retailerId) throws Exception;

}
