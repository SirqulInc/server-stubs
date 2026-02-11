package controllers;

import apimodels.QueueResponse;
import apimodels.SirqulResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AmqpApiControllerImp extends AmqpApiControllerImpInterface {
    @Override
    public QueueResponse consumerCreate(Http.Request request, @NotNull String appKey, @NotNull String name, @NotNull String hostname, @NotNull String username, @NotNull String password, @NotNull String dataMapping, String deviceId, Long accountId, Integer port, String virtualHost, String exchanger, String exchangerType, Integer workers, Boolean useSSL) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

    @Override
    public QueueResponse consumerUpdate(Http.Request request, @NotNull String appKey, @NotNull Long queueId, @NotNull String dataMapping, String deviceId, Long accountId, Boolean useSSL) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

    @Override
    public QueueResponse queueCreate(Http.Request request, @NotNull String appKey, @NotNull String name, String deviceId, Long accountId, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

    @Override
    public SirqulResponse queueDelete(Http.Request request, @NotNull Long queueId, String deviceId, Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public QueueResponse queueGet(Http.Request request, String deviceId, Long accountId, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

    @Override
    public SirqulResponse queuePublish(Http.Request request, @NotNull String message, Long queueId, String appKey, String name, String hostname, String virtualHost) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public QueueResponse queueSearch(Http.Request request, Long queueId, String deviceId, Long accountId, String name, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

    @Override
    public QueueResponse queueUpdate(Http.Request request, @NotNull Long queueId, String deviceId, Long accountId, String appKey, Integer workers, String analyticTags, String hostname, Integer port, String username, String password, String virtualHost, Boolean useSSL) throws Exception {
        //Do your magic!!!
        return new QueueResponse();
    }

}
