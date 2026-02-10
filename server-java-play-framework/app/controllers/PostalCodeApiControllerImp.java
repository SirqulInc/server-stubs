package controllers;

import java.math.BigDecimal;
import apimodels.PostalCodeResponse;
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
public class PostalCodeApiControllerImp extends PostalCodeApiControllerImpInterface {
    @Override
    public PostalCodeResponse createPostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String code, @NotNull Double latitude, @NotNull Double longitude, String stateCode, String city, Boolean active) throws Exception {
        //Do your magic!!!
        return new PostalCodeResponse();
    }

    @Override
    public SirqulResponse deletePostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public PostalCodeResponse getPostalCode(Http.Request request, BigDecimal version, @NotNull Long postalCodeId) throws Exception {
        //Do your magic!!!
        return new PostalCodeResponse();
    }

    @Override
    public List<PostalCodeResponse> getPostalCodes(Http.Request request, BigDecimal version, @NotNull String sortField, @NotNull Boolean descending, Double latitude, Double longitude, String keyword, Double miles, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<PostalCodeResponse>();
    }

    @Override
    public PostalCodeResponse updatePostalCode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long postalCodeId, String code, Double latitude, Double longitude, String stateCode, String city, Boolean active) throws Exception {
        //Do your magic!!!
        return new PostalCodeResponse();
    }

}
