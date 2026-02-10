package controllers;

import java.math.BigDecimal;
import apimodels.OfferTransactionStatusResponse;
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
public class OfferStatusApiControllerImp extends OfferStatusApiControllerImpInterface {
    @Override
    public OfferTransactionStatusResponse createOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull String name, @NotNull Integer code, String deviceId, Long accountId, Double latitude, Double longitude, String description, String role, Boolean active, String applicationIds) throws Exception {
        //Do your magic!!!
        return new OfferTransactionStatusResponse();
    }

    @Override
    public SirqulResponse deleteOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public OfferTransactionStatusResponse getOfferTransactionStatus(Http.Request request, BigDecimal version, @NotNull Long statusId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new OfferTransactionStatusResponse();
    }

    @Override
    public List<OfferTransactionStatusResponse> searchOfferTransactionStatuses(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, String keyword, String role, String appKey, String sortField, Boolean descending, Integer start, Integer limit, Boolean includeInactive) throws Exception {
        //Do your magic!!!
        return new ArrayList<OfferTransactionStatusResponse>();
    }

    @Override
    public OfferTransactionStatusResponse updateOfferTransactionStatus(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double latitude, Double longitude, Long statusId, String name, String description, Integer code, String role, Boolean active, String applicationIds) throws Exception {
        //Do your magic!!!
        return new OfferTransactionStatusResponse();
    }

}
