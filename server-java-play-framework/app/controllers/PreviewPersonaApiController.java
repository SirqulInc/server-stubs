package controllers;

import java.math.BigDecimal;
import apimodels.PreviewPersonaResponse;
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
public class PreviewPersonaApiController extends Controller {
    private final PreviewPersonaApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PreviewPersonaApiController(Config configuration, PreviewPersonaApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createPersona(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            throw new IllegalArgumentException("'title' parameter is required");
        }
        String valuepreviewAccounts = request.getQueryString("previewAccounts");
        String previewAccounts;
        if (valuepreviewAccounts != null) {
            previewAccounts = valuepreviewAccounts;
        } else {
            previewAccounts = null;
        }
        String valuedate = request.getQueryString("date");
        Long date;
        if (valuedate != null) {
            date = Long.parseLong(valuedate);
        } else {
            date = null;
        }
        String valueage = request.getQueryString("age");
        Integer age;
        if (valueage != null) {
            age = Integer.parseInt(valueage);
        } else {
            age = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuegameExperienceLevel = request.getQueryString("gameExperienceLevel");
        String gameExperienceLevel;
        if (valuegameExperienceLevel != null) {
            gameExperienceLevel = valuegameExperienceLevel;
        } else {
            gameExperienceLevel = null;
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
        return imp.createPersonaHttp(request, version, accountId, title, previewAccounts, date, age, gender, gameExperienceLevel, latitude, longitude);
    }

    @ApiAction
    public Result deletePersona(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepersonaId = request.getQueryString("personaId");
        Long personaId;
        if (valuepersonaId != null) {
            personaId = Long.parseLong(valuepersonaId);
        } else {
            throw new IllegalArgumentException("'personaId' parameter is required");
        }
        return imp.deletePersonaHttp(request, version, accountId, personaId);
    }

    @ApiAction
    public Result getPersonaList(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepersonaId = request.getQueryString("personaId");
        Long personaId;
        if (valuepersonaId != null) {
            personaId = Long.parseLong(valuepersonaId);
        } else {
            throw new IllegalArgumentException("'personaId' parameter is required");
        }
        return imp.getPersonaListHttp(request, version, accountId, personaId);
    }

    @ApiAction
    public Result searchPersona(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            throw new IllegalArgumentException("'start' parameter is required");
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            throw new IllegalArgumentException("'limit' parameter is required");
        }
        return imp.searchPersonaHttp(request, version, accountId, start, limit);
    }

    @ApiAction
    public Result updatePersona(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepersonaId = request.getQueryString("personaId");
        Long personaId;
        if (valuepersonaId != null) {
            personaId = Long.parseLong(valuepersonaId);
        } else {
            throw new IllegalArgumentException("'personaId' parameter is required");
        }
        String valuetitle = request.getQueryString("title");
        String title;
        if (valuetitle != null) {
            title = valuetitle;
        } else {
            title = null;
        }
        String valuepreviewAccounts = request.getQueryString("previewAccounts");
        String previewAccounts;
        if (valuepreviewAccounts != null) {
            previewAccounts = valuepreviewAccounts;
        } else {
            previewAccounts = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        String valuedate = request.getQueryString("date");
        Long date;
        if (valuedate != null) {
            date = Long.parseLong(valuedate);
        } else {
            date = null;
        }
        String valueage = request.getQueryString("age");
        Integer age;
        if (valueage != null) {
            age = Integer.parseInt(valueage);
        } else {
            age = null;
        }
        String valuegender = request.getQueryString("gender");
        String gender;
        if (valuegender != null) {
            gender = valuegender;
        } else {
            gender = null;
        }
        String valuegameExperienceLevel = request.getQueryString("gameExperienceLevel");
        String gameExperienceLevel;
        if (valuegameExperienceLevel != null) {
            gameExperienceLevel = valuegameExperienceLevel;
        } else {
            gameExperienceLevel = null;
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
        return imp.updatePersonaHttp(request, version, accountId, personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude);
    }

}
