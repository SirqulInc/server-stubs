package controllers;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TwitterApiControllerImp extends TwitterApiControllerImpInterface {
    @Override
    public SirqulResponse authorizeTwitter(Http.Request request, @NotNull String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse loginTwitter(Http.Request request, @NotNull String accessToken, @NotNull String accessTokenSecret, @NotNull String appKey, @NotNull String responseFilters, String deviceId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

}
