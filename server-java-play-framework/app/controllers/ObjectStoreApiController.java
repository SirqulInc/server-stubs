package controllers;

import apimodels.ObjectStoreResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ObjectStoreApiController extends Controller {
    private final ObjectStoreApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ObjectStoreApiController(Config configuration, ObjectStoreApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addField(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueobjectName = request.getQueryString("objectName");
        String objectName;
        if (valueobjectName != null) {
            objectName = valueobjectName;
        } else {
            throw new IllegalArgumentException("'objectName' parameter is required");
        }
        String valuefieldName = request.getQueryString("fieldName");
        String fieldName;
        if (valuefieldName != null) {
            fieldName = valuefieldName;
        } else {
            throw new IllegalArgumentException("'fieldName' parameter is required");
        }
        String valuefieldType = request.getQueryString("fieldType");
        String fieldType;
        if (valuefieldType != null) {
            fieldType = valuefieldType;
        } else {
            throw new IllegalArgumentException("'fieldType' parameter is required");
        }
        return imp.addFieldHttp(request, accountId, appKey, objectName, fieldName, fieldType);
    }

    @ApiAction
    public Result createData(Http.Request request, String objectName) throws Exception {
        JsonNode nodebody = request.body().asJson();
        String body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), String.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        return imp.createDataHttp(request, objectName, accountId, body);
    }

    @ApiAction
    public Result createObject(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueobjectName = request.getQueryString("objectName");
        String objectName;
        if (valueobjectName != null) {
            objectName = valueobjectName;
        } else {
            throw new IllegalArgumentException("'objectName' parameter is required");
        }
        return imp.createObjectHttp(request, accountId, appKey, objectName);
    }

    @ApiAction
    public Result deleteData(Http.Request request, String objectName,String objectId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        return imp.deleteDataHttp(request, objectName, objectId, accountId);
    }

    @ApiAction
    public Result deleteField(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueobjectName = request.getQueryString("objectName");
        String objectName;
        if (valueobjectName != null) {
            objectName = valueobjectName;
        } else {
            throw new IllegalArgumentException("'objectName' parameter is required");
        }
        String valuefieldName = request.getQueryString("fieldName");
        String fieldName;
        if (valuefieldName != null) {
            fieldName = valuefieldName;
        } else {
            throw new IllegalArgumentException("'fieldName' parameter is required");
        }
        return imp.deleteFieldHttp(request, accountId, appKey, objectName, fieldName);
    }

    @ApiAction
    public Result deleteObject(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueobjectName = request.getQueryString("objectName");
        String objectName;
        if (valueobjectName != null) {
            objectName = valueobjectName;
        } else {
            throw new IllegalArgumentException("'objectName' parameter is required");
        }
        return imp.deleteObjectHttp(request, accountId, appKey, objectName);
    }

    @ApiAction
    public Result getData(Http.Request request, String objectName,String objectId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valueinclude = request.getQueryString("include");
        String include;
        if (valueinclude != null) {
            include = valueinclude;
        } else {
            include = null;
        }
        return imp.getDataHttp(request, objectName, objectId, accountId, include);
    }

    @ApiAction
    public Result getObject(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valueobjectName = request.getQueryString("objectName");
        String objectName;
        if (valueobjectName != null) {
            objectName = valueobjectName;
        } else {
            throw new IllegalArgumentException("'objectName' parameter is required");
        }
        return imp.getObjectHttp(request, accountId, appKey, objectName);
    }

    @ApiAction
    public Result searchData(Http.Request request, String objectName) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        String valuecriteria = request.getQueryString("criteria");
        String criteria;
        if (valuecriteria != null) {
            criteria = valuecriteria;
        } else {
            criteria = null;
        }
        String valuecount = request.getQueryString("count");
        Boolean count;
        if (valuecount != null) {
            count = Boolean.valueOf(valuecount);
        } else {
            throw new IllegalArgumentException("'count' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = null;
        }
        String valueinclude = request.getQueryString("include");
        String include;
        if (valueinclude != null) {
            include = valueinclude;
        } else {
            include = null;
        }
        return imp.searchDataHttp(request, objectName, count, start, limit, accountId, criteria, order, include);
    }

    @ApiAction
    public Result searchObject(Http.Request request) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            throw new IllegalArgumentException("'appKey' parameter is required");
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuestart = request.getQueryString("start");
        Long start;
        if (valuestart != null) {
            start = Long.parseLong(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Long limit;
        if (valuelimit != null) {
            limit = Long.parseLong(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.searchObjectHttp(request, accountId, appKey, start, limit, keyword);
    }

    @ApiAction
    public Result updateData(Http.Request request, String objectName,String objectId) throws Exception {
        JsonNode nodebody = request.body().asJson();
        String body;
        if (nodebody != null) {
            body = mapper.readValue(nodebody.toString(), String.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(body);
            }
        } else {
            body = null;
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            accountId = null;
        }
        return imp.updateDataHttp(request, objectName, objectId, accountId, body);
    }

}
