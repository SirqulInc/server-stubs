package controllers;

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

    public Result addFieldHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName, @NotNull String fieldType) throws Exception {
        ObjectStoreResponse obj = addField(request, accountId, appKey, objectName, fieldName, fieldType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse addField(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName, @NotNull String fieldType) throws Exception;

    public Result createDataHttp(Http.Request request, String objectName, Long accountId, String body) throws Exception {
        ObjectStoreResponse obj = createData(request, objectName, accountId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse createData(Http.Request request, String objectName, Long accountId, String body) throws Exception;

    public Result createObjectHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = createObject(request, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse createObject(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result deleteDataHttp(Http.Request request, String objectName, String objectId, Long accountId) throws Exception {
        ObjectStoreResponse obj = deleteData(request, objectName, objectId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteData(Http.Request request, String objectName, String objectId, Long accountId) throws Exception;

    public Result deleteFieldHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName) throws Exception {
        ObjectStoreResponse obj = deleteField(request, accountId, appKey, objectName, fieldName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteField(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName, @NotNull String fieldName) throws Exception;

    public Result deleteObjectHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = deleteObject(request, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse deleteObject(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result getDataHttp(Http.Request request, String objectName, String objectId, Long accountId, String include) throws Exception {
        ObjectStoreResponse obj = getData(request, objectName, objectId, accountId, include);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse getData(Http.Request request, String objectName, String objectId, Long accountId, String include) throws Exception;

    public Result getObjectHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception {
        ObjectStoreResponse obj = getObject(request, accountId, appKey, objectName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse getObject(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull String objectName) throws Exception;

    public Result searchDataHttp(Http.Request request, String objectName, @NotNull Boolean count, @NotNull Long start, @NotNull Long limit, Long accountId, String criteria, String order, String include) throws Exception {
        ObjectStoreResponse obj = searchData(request, objectName, count, start, limit, accountId, criteria, order, include);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse searchData(Http.Request request, String objectName, @NotNull Boolean count, @NotNull Long start, @NotNull Long limit, Long accountId, String criteria, String order, String include) throws Exception;

    public Result searchObjectHttp(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull Long start, @NotNull Long limit, String keyword) throws Exception {
        ObjectStoreResponse obj = searchObject(request, accountId, appKey, start, limit, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse searchObject(Http.Request request, @NotNull Long accountId, @NotNull String appKey, @NotNull Long start, @NotNull Long limit, String keyword) throws Exception;

    public Result updateDataHttp(Http.Request request, String objectName, String objectId, Long accountId, String body) throws Exception {
        ObjectStoreResponse obj = updateData(request, objectName, objectId, accountId, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ObjectStoreResponse updateData(Http.Request request, String objectName, String objectId, Long accountId, String body) throws Exception;

}
