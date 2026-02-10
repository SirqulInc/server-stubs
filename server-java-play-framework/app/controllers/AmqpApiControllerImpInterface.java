package controllers;

import java.math.BigDecimal;
import apimodels.QueueResponse;
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
public abstract class AmqpApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result consumerCreateHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, @NotNull String hostname, @NotNull String username, @NotNull String password, @NotNull String dataMapping, String deviceId, Long accountId, Integer port, String virtualHost, String exchanger, String exchangerType, Integer workers, Boolean useSSL) throws Exception {
        QueueResponse obj = consumerCreate(request, version, appKey, name, hostname, username, password, dataMapping, deviceId, accountId, port, virtualHost, exchanger, exchangerType, workers, useSSL);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse consumerCreate(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, @NotNull String hostname, @NotNull String username, @NotNull String password, @NotNull String dataMapping, String deviceId, Long accountId, Integer port, String virtualHost, String exchanger, String exchangerType, Integer workers, Boolean useSSL) throws Exception;

    public Result consumerUpdateHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull Long queueId, @NotNull String dataMapping, String deviceId, Long accountId, Boolean useSSL) throws Exception {
        QueueResponse obj = consumerUpdate(request, version, appKey, queueId, dataMapping, deviceId, accountId, useSSL);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse consumerUpdate(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull Long queueId, @NotNull String dataMapping, String deviceId, Long accountId, Boolean useSSL) throws Exception;

    public Result queueCreateHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception {
        QueueResponse obj = queueCreate(request, version, appKey, name, deviceId, accountId, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse queueCreate(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception;

    public Result queueDeleteHttp(Http.Request request, BigDecimal version, @NotNull Long queueId, String deviceId, Long accountId) throws Exception {
        SirqulResponse obj = queueDelete(request, version, queueId, deviceId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse queueDelete(Http.Request request, BigDecimal version, @NotNull Long queueId, String deviceId, Long accountId) throws Exception;

    public Result queueGetHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception {
        QueueResponse obj = queueGet(request, version, deviceId, accountId, queueId, appKey, name, hostname, virtualHost);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse queueGet(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception;

    public Result queuePublishHttp(Http.Request request, BigDecimal version, @NotNull String message, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception {
        SirqulResponse obj = queuePublish(request, version, message, queueId, appKey, name, hostname, virtualHost);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse queuePublish(Http.Request request, BigDecimal version, @NotNull String message, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception;

    public Result queueSearchHttp(Http.Request request, BigDecimal version, Long queueId, String deviceId, Long accountId, String name, Integer start, Integer limit) throws Exception {
        QueueResponse obj = queueSearch(request, version, queueId, deviceId, accountId, name, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse queueSearch(Http.Request request, BigDecimal version, Long queueId, String deviceId, Long accountId, String name, Integer start, Integer limit) throws Exception;

    public Result queueUpdateHttp(Http.Request request, BigDecimal version, @NotNull Long queueId, String deviceId, Long accountId, String appKey, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception {
        QueueResponse obj = queueUpdate(request, version, queueId, deviceId, accountId, appKey, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract QueueResponse queueUpdate(Http.Request request, BigDecimal version, @NotNull Long queueId, String deviceId, Long accountId, String appKey, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception;

}
