package controllers;

import apimodels.AccountLoginResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerFullResponse;
import apimodels.RetailerResponse;
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
public class RetailerApiControllerImp extends RetailerApiControllerImpInterface {
    @Override
    public RetailerFullResponse createRetailer(Http.Request request, BigDecimal version, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String categoryIdsToAdd, String categoryIdsToRemove, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean createDefaultLocation, String responseFormat) throws Exception {
        //Do your magic!!!
        return new RetailerFullResponse();
    }

    @Override
    public SirqulResponse deleteRetailer(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public RetailerFullResponse getRetailer(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, Boolean includeCounts) throws Exception {
        //Do your magic!!!
        return new RetailerFullResponse();
    }

    @Override
    public List<RetailerResponse> getRetailers(Http.Request request, BigDecimal version, @NotNull String visibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, String categoryIds, String filterIds, Integer i, Integer l) throws Exception {
        //Do your magic!!!
        return new ArrayList<RetailerResponse>();
    }

    @Override
    public AccountLoginResponse retailerLoginCheck(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String appKey) throws Exception {
        //Do your magic!!!
        return new AccountLoginResponse();
    }

    @Override
    public RetailerFullResponse updateRetailer(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean active, String responseFormat) throws Exception {
        //Do your magic!!!
        return new RetailerFullResponse();
    }

}
