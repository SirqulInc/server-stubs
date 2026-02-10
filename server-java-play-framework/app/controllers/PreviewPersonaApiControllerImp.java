package controllers;

import java.math.BigDecimal;
import apimodels.PreviewPersonaResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PreviewPersonaApiControllerImp extends PreviewPersonaApiControllerImpInterface {
    @Override
    public PreviewPersonaResponse createPersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String previewAccounts, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new PreviewPersonaResponse();
    }

    @Override
    public SirqulResponse deletePersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public PreviewPersonaResponse getPersonaList(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId) throws Exception {
        //Do your magic!!!
        return new PreviewPersonaResponse();
    }

    @Override
    public PreviewPersonaResponse searchPersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer start, @NotNull Integer limit) throws Exception {
        //Do your magic!!!
        return new PreviewPersonaResponse();
    }

    @Override
    public PreviewPersonaResponse updatePersona(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long personaId, String title, String previewAccounts, Boolean active, Long date, Integer age, String gender, String gameExperienceLevel, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new PreviewPersonaResponse();
    }

}
