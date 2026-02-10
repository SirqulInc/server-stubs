package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.PaymentRequest;
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
public class SecureAppApiControllerImp extends SecureAppApiControllerImpInterface {
    @Override
    public SirqulResponse createSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull InputStream keyCert, @NotNull InputStream trustStore, @NotNull String username, @NotNull String password, Boolean active, String biometricType, String biometricPosition, String biometricPosition2) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse deleteSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public ProfileResponse loginSecure(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull InputStream biometricFile, String deviceId, InputStream biometricFile2, Integer ageRestriction, Boolean returnProfile, String responseFilters, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public ProfileResponse purchaseSecure(Http.Request request, BigDecimal version, PaymentRequest body) throws Exception {
        //Do your magic!!!
        return new ProfileResponse();
    }

    @Override
    public SirqulResponse resetSecure(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse updateSecureApplication(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Boolean active, InputStream keyCert, InputStream trustStore, String username, String password, String biometricType, String biometricPosition, String biometricPosition2) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
