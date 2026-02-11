package controllers;

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

    public Result createProgramHttp(Http.Request request, Program body) throws Exception {
        Program obj = createProgram(request, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program createProgram(Http.Request request, Program body) throws Exception;

    public Result deleteProgramHttp(Http.Request request, Long id) throws Exception {
        deleteProgram(request, id);
        return ok();

    }

    public abstract void deleteProgram(Http.Request request, Long id) throws Exception;

    public Result getProgramHttp(Http.Request request, Long id) throws Exception {
        Program obj = getProgram(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program getProgram(Http.Request request, Long id) throws Exception;

    public Result postProgramHttp(Http.Request request, Long id, Program body) throws Exception {
        Program obj = postProgram(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program postProgram(Http.Request request, Long id, Program body) throws Exception;

    public Result putProgramHttp(Http.Request request, Long id, Program body) throws Exception {
        Program obj = putProgram(request, id, body);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Program putProgram(Http.Request request, Long id, Program body) throws Exception;

    public Result searchProgramsHttp(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        List<Program> obj = searchPrograms(request, sortField, descending, start, limit, activeOnly, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Program curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Program> searchPrograms(Http.Request request, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception;

}
