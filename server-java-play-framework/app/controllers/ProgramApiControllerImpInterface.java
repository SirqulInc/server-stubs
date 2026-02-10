package controllers;

import java.math.BigDecimal;
import apimodels.Program;

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
public abstract class ProgramApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createProgramHttp(Http.Request request, BigDecimal version, Program body) throws Exception {
        Program obj = createProgram(request, version, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program createProgram(Http.Request request, BigDecimal version, Program body) throws Exception;

    public Result deleteProgramHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        deleteProgram(request, version, id);
        return ok();

    }

    public abstract void deleteProgram(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result getProgramHttp(Http.Request request, BigDecimal version, Long id) throws Exception {
        Program obj = getProgram(request, version, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program getProgram(Http.Request request, BigDecimal version, Long id) throws Exception;

    public Result postProgramHttp(Http.Request request, BigDecimal version, Long id, Program body) throws Exception {
        Program obj = postProgram(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program postProgram(Http.Request request, BigDecimal version, Long id, Program body) throws Exception;

    public Result putProgramHttp(Http.Request request, BigDecimal version, Long id, Program body) throws Exception {
        Program obj = putProgram(request, version, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program putProgram(Http.Request request, BigDecimal version, Long id, Program body) throws Exception;

    public Result searchProgramsHttp(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        List<Program> obj = searchPrograms(request, version, sortField, descending, start, limit, activeOnly, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Program curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Program> searchPrograms(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception;

}
