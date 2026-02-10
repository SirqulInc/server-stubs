package controllers;

import java.math.BigDecimal;
import apimodels.Program;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ProgramApiControllerImp extends ProgramApiControllerImpInterface {
    @Override
    public Program createProgram(Http.Request request, BigDecimal version, Program body) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public void deleteProgram(Http.Request request, BigDecimal version, Long id) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Program getProgram(Http.Request request, BigDecimal version, Long id) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public Program postProgram(Http.Request request, BigDecimal version, Long id, Program body) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public Program putProgram(Http.Request request, BigDecimal version, Long id, Program body) throws Exception {
        //Do your magic!!!
        return new Program();
    }

    @Override
    public List<Program> searchPrograms(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<Program>();
    }

}
