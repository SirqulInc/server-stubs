package controllers;

import java.math.BigDecimal;
import apimodels.PostalCodeResponse;
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
public class PostalCodeApiController extends Controller {
    private final PostalCodeApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PostalCodeApiController(Config configuration, PostalCodeApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createPostalCode(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuecode = request.getQueryString("code");
        String code;
        if (valuecode != null) {
            code = valuecode;
        } else {
            throw new IllegalArgumentException("'code' parameter is required");
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            throw new IllegalArgumentException("'latitude' parameter is required");
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            throw new IllegalArgumentException("'longitude' parameter is required");
        }
        String valuestateCode = request.getQueryString("stateCode");
        String stateCode;
        if (valuestateCode != null) {
            stateCode = valuestateCode;
        } else {
            stateCode = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.createPostalCodeHttp(request, version, accountId, code, latitude, longitude, stateCode, city, active);
    }

    @ApiAction
    public Result deletePostalCode(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepostalCodeId = request.getQueryString("postalCodeId");
        Long postalCodeId;
        if (valuepostalCodeId != null) {
            postalCodeId = Long.parseLong(valuepostalCodeId);
        } else {
            throw new IllegalArgumentException("'postalCodeId' parameter is required");
        }
        return imp.deletePostalCodeHttp(request, version, accountId, postalCodeId);
    }

    @ApiAction
    public Result getPostalCode(Http.Request request, BigDecimal version) throws Exception {
        String valuepostalCodeId = request.getQueryString("postalCodeId");
        Long postalCodeId;
        if (valuepostalCodeId != null) {
            postalCodeId = Long.parseLong(valuepostalCodeId);
        } else {
            throw new IllegalArgumentException("'postalCodeId' parameter is required");
        }
        return imp.getPostalCodeHttp(request, version, postalCodeId);
    }

    @ApiAction
    public Result getPostalCodes(Http.Request request, BigDecimal version) throws Exception {
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuemiles = request.getQueryString("miles");
        Double miles;
        if (valuemiles != null) {
            miles = Double.parseDouble(valuemiles);
        } else {
            miles = null;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            throw new IllegalArgumentException("'sortField' parameter is required");
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            throw new IllegalArgumentException("'descending' parameter is required");
        }
        return imp.getPostalCodesHttp(request, version, sortField, descending, latitude, longitude, keyword, miles, start, limit);
    }

    @ApiAction
    public Result updatePostalCode(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepostalCodeId = request.getQueryString("postalCodeId");
        Long postalCodeId;
        if (valuepostalCodeId != null) {
            postalCodeId = Long.parseLong(valuepostalCodeId);
        } else {
            throw new IllegalArgumentException("'postalCodeId' parameter is required");
        }
        String valuecode = request.getQueryString("code");
        String code;
        if (valuecode != null) {
            code = valuecode;
        } else {
            code = null;
        }
        String valuelatitude = request.getQueryString("latitude");
        Double latitude;
        if (valuelatitude != null) {
            latitude = Double.parseDouble(valuelatitude);
        } else {
            latitude = null;
        }
        String valuelongitude = request.getQueryString("longitude");
        Double longitude;
        if (valuelongitude != null) {
            longitude = Double.parseDouble(valuelongitude);
        } else {
            longitude = null;
        }
        String valuestateCode = request.getQueryString("stateCode");
        String stateCode;
        if (valuestateCode != null) {
            stateCode = valuestateCode;
        } else {
            stateCode = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.updatePostalCodeHttp(request, version, accountId, postalCodeId, code, latitude, longitude, stateCode, city, active);
    }

}
