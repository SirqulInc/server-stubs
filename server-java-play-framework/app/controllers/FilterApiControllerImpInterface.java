package controllers;

import java.math.BigDecimal;
import apimodels.FilterResponse;
import apimodels.FilterTreeResponse;
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
public abstract class FilterApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createFilterHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentFilterId, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception {
        FilterTreeResponse obj = createFilter(request, version, accountId, name, appKey, parentFilterId, description, externalId, externalType, active, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FilterTreeResponse createFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, Long parentFilterId, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception;

    public Result deleteFilterHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId) throws Exception {
        SirqulResponse obj = deleteFilter(request, version, accountId, filterId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId) throws Exception;

    public Result getFilterHttp(Http.Request request, BigDecimal version, @NotNull Long filterId) throws Exception {
        FilterTreeResponse obj = getFilter(request, version, filterId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FilterTreeResponse getFilter(Http.Request request, BigDecimal version, @NotNull Long filterId) throws Exception;

    public Result searchFiltersHttp(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String responseGroup, Boolean rootOnly, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        List<FilterResponse> obj = searchFilters(request, version, accountId, keyword, appKey, responseGroup, rootOnly, sortField, descending, start, limit, activeOnly);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (FilterResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<FilterResponse> searchFilters(Http.Request request, BigDecimal version, Long accountId, String keyword, String appKey, String responseGroup, Boolean rootOnly, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception;

    public Result updateFilterHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId, Long parentFilterId, String name, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception {
        FilterTreeResponse obj = updateFilter(request, version, accountId, filterId, parentFilterId, name, description, externalId, externalType, active, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FilterTreeResponse updateFilter(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long filterId, Long parentFilterId, String name, String description, String externalId, String externalType, Boolean active, String metaData) throws Exception;

}
