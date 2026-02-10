package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TokenResponse;

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
public class FacebookApiControllerImp extends FacebookApiControllerImpInterface {
    @Override
    public TokenResponse getToken(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new TokenResponse();
    }

    @Override
    public SirqulResponse graphInterface(Http.Request request, BigDecimal version, @NotNull String event, String deviceId, Long accountId, String permissionableType, Long permissionableId, Long assetId, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
