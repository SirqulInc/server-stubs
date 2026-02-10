package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TerritoryResponse;

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
public abstract class TerritoryApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createTerritoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, Boolean active) throws Exception {
        TerritoryResponse obj = createTerritory(request, version, accountId, name, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TerritoryResponse createTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, Boolean active) throws Exception;

    public Result deleteTerritoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId) throws Exception {
        SirqulResponse obj = deleteTerritory(request, version, accountId, territoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId) throws Exception;

    public Result getTerritoryHttp(Http.Request request, BigDecimal version, @NotNull Long territoryId) throws Exception {
        TerritoryResponse obj = getTerritory(request, version, territoryId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TerritoryResponse getTerritory(Http.Request request, BigDecimal version, @NotNull Long territoryId) throws Exception;

    public Result searchTerritoriesHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, String keyword, Integer start, Integer limit) throws Exception {
        List<TerritoryResponse> obj = searchTerritories(request, version, sortField, descending, keyword, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (TerritoryResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<TerritoryResponse> searchTerritories(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, String keyword, Integer start, Integer limit) throws Exception;

    public Result updateTerritoryHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId, String name, Boolean active) throws Exception {
        TerritoryResponse obj = updateTerritory(request, version, accountId, territoryId, name, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TerritoryResponse updateTerritory(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long territoryId, String name, Boolean active) throws Exception;

}
