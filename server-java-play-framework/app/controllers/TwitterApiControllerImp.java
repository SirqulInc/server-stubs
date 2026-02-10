package controllers;

import java.math.BigDecimal;
import apimodels.ProfileResponse;
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
public class TwitterApiControllerImp extends TwitterApiControllerImpInterface {
    @Override
    public SirqulResponse authorizeTwitter(Http.Request request, BigDecimal version, @NotNull String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse loginTwitter(Http.Request request, BigDecimal version, @NotNull String accessToken, @NotNull String accessTokenSecret, @NotNull String appKey, @NotNull String responseFilters, String deviceId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

}
