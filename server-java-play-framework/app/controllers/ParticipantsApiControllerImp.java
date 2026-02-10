package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
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
public class ParticipantsApiControllerImp extends ParticipantsApiControllerImpInterface {
    @Override
    public SirqulResponse processAllParticipants(Http.Request request, BigDecimal version, @NotNull Long accountId, String appKey, Boolean useShortNameAsID) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse processParticipants(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String league, String appKey, Boolean useShortNameAsID, InputStream _file) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
