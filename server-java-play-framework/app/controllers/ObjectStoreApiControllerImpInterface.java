package controllers;

import java.math.BigDecimal;
import apimodels.ObjectStoreResponse;

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
public abstract class ObjectStoreApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addFieldHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName, @NotNull String fieldType) throws Exception {
        ObjectStoreResponse obj = addField(request, version, accountId, appKey, objectName, fieldName, fieldType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse addField(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName, @NotNull String fieldType) throws Exception;

    public Result createDataHttp(Http.Request request, BigDecimal version, String objectName, Long accountId, String body) throws Exception {
        ObjectStoreResponse obj = createData(request, version, objectName, accountId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse createData(Http.Request request, BigDecimal version, String objectName, Long accountId, String body) throws Exception;

    public Result createObjectHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = createObject(request, version, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse createObject(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result deleteDataHttp(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId) throws Exception {
        ObjectStoreResponse obj = deleteData(request, version, objectName, objectId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteData(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId) throws Exception;

    public Result deleteFieldHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName) throws Exception {
        ObjectStoreResponse obj = deleteField(request, version, accountId, appKey, objectName, fieldName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteField(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName) throws Exception;

    public Result deleteObjectHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = deleteObject(request, version, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteObject(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result getDataHttp(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId, String include) throws Exception {
        ObjectStoreResponse obj = getData(request, version, objectName, objectId, accountId, include);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse getData(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId, String include) throws Exception;

    public Result getObjectHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = getObject(request, version, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse getObject(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result searchDataHttp(Http.Request request, BigDecimal version, String objectName, @NotNull Boolean count, @NotNull Long start, @NotNull Long limit, Long accountId, String criteria, String order, String include) throws Exception {
        ObjectStoreResponse obj = searchData(request, version, objectName, count, start, limit, accountId, criteria, order, include);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse searchData(Http.Request request, BigDecimal version, String objectName, @NotNull Boolean count, @NotNull Long start, @NotNull Long limit, Long accountId, String criteria, String order, String include) throws Exception;

    public Result searchObjectHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long start, @NotNull Long limit, String keyword) throws Exception {
        ObjectStoreResponse obj = searchObject(request, version, accountId, appKey, start, limit, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse searchObject(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Long start, @NotNull Long limit, String keyword) throws Exception;

    public Result updateDataHttp(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId, String body) throws Exception {
        ObjectStoreResponse obj = updateData(request, version, objectName, objectId, accountId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse updateData(Http.Request request, BigDecimal version, String objectName, String objectId, Long accountId, String body) throws Exception;

}
