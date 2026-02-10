package controllers;

import java.math.BigDecimal;
import apimodels.QueueResponse;
import apimodels.SirqulResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AmqpApiController extends Controller {
    private final AmqpApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AmqpApiController(Config configuration, AmqpApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result consumerCreate(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valuehostname = request.getQueryString("hostname");
        String hostname;
        if (valuehostname != null) {
            hostname = valuehostname;
        } else {
            throw new IllegalArgumentException("'hostname' parameter is required");
        }
        String valueport = request.getQueryString("port");
        Integer port;
        if (valueport != null) {
            port = Integer.parseInt(valueport);
        } else {
            port = 5672;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            throw new IllegalArgumentException("'username' parameter is required");
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            throw new IllegalArgumentException("'password' parameter is required");
        }
        String valuevirtualHost = request.getQueryString("virtualHost");
        String virtualHost;
        if (valuevirtualHost != null) {
            virtualHost = valuevirtualHost;
        } else {
            virtualHost = null;
        }
        String valueexchanger = request.getQueryString("exchanger");
        String exchanger;
        if (valueexchanger != null) {
            exchanger = valueexchanger;
        } else {
            exchanger = null;
        }
        String valueexchangerType = request.getQueryString("exchangerType");
        String exchangerType;
        if (valueexchangerType != null) {
            exchangerType = valueexchangerType;
        } else {
            exchangerType = null;
        }
        String valueworkers = request.getQueryString("workers");
        Integer workers;
        if (valueworkers != null) {
            workers = Integer.parseInt(valueworkers);
        } else {
            workers = 1;
        }
        String valuedataMapping = request.getQueryString("dataMapping");
        String dataMapping;
        if (valuedataMapping != null) {
            dataMapping = valuedataMapping;
        } else {
            throw new IllegalArgumentException("'dataMapping' parameter is required");
        }
        String valueuseSSL = request.getQueryString("useSSL");
        Boolean useSSL;
        if (valueuseSSL != null) {
            useSSL = Boolean.valueOf(valueuseSSL);
        } else {
            useSSL = null;
        }
        return imp.consumerCreateHttp(request, version, appKey, name, hostname, username, password, dataMapping, deviceId, accountId, port, virtualHost, exchanger, exchangerType, workers, useSSL);
    }

    @ApiAction
    public Result consumerUpdate(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            throw new IllegalArgumentException("'queueId' parameter is required");
        }
        String valuedataMapping = request.getQueryString("dataMapping");
        String dataMapping;
        if (valuedataMapping != null) {
            dataMapping = valuedataMapping;
        } else {
            throw new IllegalArgumentException("'dataMapping' parameter is required");
        }
        String valueuseSSL = request.getQueryString("useSSL");
        Boolean useSSL;
        if (valueuseSSL != null) {
            useSSL = Boolean.valueOf(valueuseSSL);
        } else {
            useSSL = null;
        }
        return imp.consumerUpdateHttp(request, version, appKey, queueId, dataMapping, deviceId, accountId, useSSL);
    }

    @ApiAction
    public Result queueCreate(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valueworkers = request.getQueryString("workers");
        Integer workers;
        if (valueworkers != null) {
            workers = Integer.parseInt(valueworkers);
        } else {
            workers = 1;
        }
        String valueanalyticTags = request.getQueryString("analyticTags");
        String analyticTags;
        if (valueanalyticTags != null) {
            analyticTags = valueanalyticTags;
        } else {
            analyticTags = null;
        }
        String valuehostname = request.getQueryString("hostname");
        String hostname;
        if (valuehostname != null) {
            hostname = valuehostname;
        } else {
            hostname = null;
        }
        String valueport = request.getQueryString("port");
        Integer port;
        if (valueport != null) {
            port = Integer.parseInt(valueport);
        } else {
            port = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            username = null;
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            password = null;
        }
        String valuevirtualHost = request.getQueryString("virtualHost");
        String virtualHost;
        if (valuevirtualHost != null) {
            virtualHost = valuevirtualHost;
        } else {
            virtualHost = null;
        }
        String valueuseSSL = request.getQueryString("useSSL");
        Boolean useSSL;
        if (valueuseSSL != null) {
            useSSL = Boolean.valueOf(valueuseSSL);
        } else {
            useSSL = null;
        }
        return imp.queueCreateHttp(request, version, appKey, name, deviceId, accountId, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL);
    }

    @ApiAction
    public Result queueDelete(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            throw new IllegalArgumentException("'queueId' parameter is required");
        }
        return imp.queueDeleteHttp(request, version, queueId, deviceId, accountId);
    }

    @ApiAction
    public Result queueGet(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            queueId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuehostname = request.getQueryString("hostname");
        String hostname;
        if (valuehostname != null) {
            hostname = valuehostname;
        } else {
            hostname = null;
        }
        String valuevirtualHost = request.getQueryString("virtualHost");
        String virtualHost;
        if (valuevirtualHost != null) {
            virtualHost = valuevirtualHost;
        } else {
            virtualHost = null;
        }
        return imp.queueGetHttp(request, version, deviceId, accountId, queueId, appKey, name, hostname, virtualHost);
    }

    @ApiAction
    public Result queuePublish(Http.Request request, BigDecimal version) throws Exception {
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            queueId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuehostname = request.getQueryString("hostname");
        String hostname;
        if (valuehostname != null) {
            hostname = valuehostname;
        } else {
            hostname = null;
        }
        String valuevirtualHost = request.getQueryString("virtualHost");
        String virtualHost;
        if (valuevirtualHost != null) {
            virtualHost = valuevirtualHost;
        } else {
            virtualHost = null;
        }
        String valuemessage = request.getQueryString("message");
        String message;
        if (valuemessage != null) {
            message = valuemessage;
        } else {
            throw new IllegalArgumentException("'message' parameter is required");
        }
        return imp.queuePublishHttp(request, version, message, queueId, appKey, name, hostname, virtualHost);
    }

    @ApiAction
    public Result queueSearch(Http.Request request, BigDecimal version) throws Exception {
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            queueId = null;
        }
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 10;
        }
        return imp.queueSearchHttp(request, version, queueId, deviceId, accountId, name, start, limit);
    }

    @ApiAction
    public Result queueUpdate(Http.Request request, BigDecimal version) throws Exception {
        String valuedeviceId = request.getQueryString("deviceId");
        String deviceId;
        if (valuedeviceId != null) {
            deviceId = valuedeviceId;
        } else {
            deviceId = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuequeueId = request.getQueryString("queueId");
        Long queueId;
        if (valuequeueId != null) {
            queueId = Long.parseLong(valuequeueId);
        } else {
            throw new IllegalArgumentException("'queueId' parameter is required");
        }
        String valueworkers = request.getQueryString("workers");
        Integer workers;
        if (valueworkers != null) {
            workers = Integer.parseInt(valueworkers);
        } else {
            workers = null;
        }
        String valueanalyticTags = request.getQueryString("analyticTags");
        String analyticTags;
        if (valueanalyticTags != null) {
            analyticTags = valueanalyticTags;
        } else {
            analyticTags = null;
        }
        String valuehostname = request.getQueryString("hostname");
        String hostname;
        if (valuehostname != null) {
            hostname = valuehostname;
        } else {
            hostname = null;
        }
        String valueport = request.getQueryString("port");
        Integer port;
        if (valueport != null) {
            port = Integer.parseInt(valueport);
        } else {
            port = null;
        }
        String valueusername = request.getQueryString("username");
        String username;
        if (valueusername != null) {
            username = valueusername;
        } else {
            username = null;
        }
        String valuepassword = request.getQueryString("password");
        String password;
        if (valuepassword != null) {
            password = valuepassword;
        } else {
            password = null;
        }
        String valuevirtualHost = request.getQueryString("virtualHost");
        String virtualHost;
        if (valuevirtualHost != null) {
            virtualHost = valuevirtualHost;
        } else {
            virtualHost = null;
        }
        String valueuseSSL = request.getQueryString("useSSL");
        Boolean useSSL;
        if (valueuseSSL != null) {
            useSSL = Boolean.valueOf(valueuseSSL);
        } else {
            useSSL = null;
        }
        return imp.queueUpdateHttp(request, version, queueId, deviceId, accountId, appKey, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL);
    }

}
