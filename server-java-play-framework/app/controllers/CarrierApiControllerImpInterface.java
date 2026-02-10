package controllers;

import java.math.BigDecimal;
import apimodels.CellCarrierResponse;

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
public abstract class CarrierApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result searchCarriersHttp(Http.Request request, BigDecimal version, String keyword, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<CellCarrierResponse> obj = searchCarriers(request, version, keyword, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CellCarrierResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<CellCarrierResponse> searchCarriers(Http.Request request, BigDecimal version, String keyword, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

}
