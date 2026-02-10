package controllers;

import java.math.BigDecimal;
import apimodels.PostalCodeResponse;
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
public abstract class PostalCodeApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createPostalCodeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String code, @NotNull Double latitude, @NotNull Double longitude, String stateCode, String city, Boolean active) throws Exception {
        PostalCodeResponse obj = createPostalCode(request, version, accountId, code, latitude, longitude, stateCode, city, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PostalCodeResponse createPostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String code, @NotNull Double latitude, @NotNull Double longitude, String stateCode, String city, Boolean active) throws Exception;

    public Result deletePostalCodeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId) throws Exception {
        SirqulResponse obj = deletePostalCode(request, version, accountId, postalCodeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deletePostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId) throws Exception;

    public Result getPostalCodeHttp(Http.Request request, BigDecimal version, @NotNull Long postalCodeId) throws Exception {
        PostalCodeResponse obj = getPostalCode(request, version, postalCodeId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PostalCodeResponse getPostalCode(Http.Request request, BigDecimal version, @NotNull Long postalCodeId) throws Exception;

    public Result getPostalCodesHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, Double latitude, Double longitude, String keyword, Double miles, Integer start, Integer limit) throws Exception {
        List<PostalCodeResponse> obj = getPostalCodes(request, version, sortField, descending, latitude, longitude, keyword, miles, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PostalCodeResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PostalCodeResponse> getPostalCodes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, Double latitude, Double longitude, String keyword, Double miles, Integer start, Integer limit) throws Exception;

    public Result updatePostalCodeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId, String code, Double latitude, Double longitude, String stateCode, String city, Boolean active) throws Exception {
        PostalCodeResponse obj = updatePostalCode(request, version, accountId, postalCodeId, code, latitude, longitude, stateCode, city, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PostalCodeResponse updatePostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId, String code, Double latitude, Double longitude, String stateCode, String city, Boolean active) throws Exception;

}
