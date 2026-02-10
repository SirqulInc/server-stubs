package controllers;

import apimodels.AccountLoginResponse;
import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.RetailerFullResponse;
import apimodels.RetailerResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class RetailerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createRetailerHttp(Http.Request request, BigDecimal version, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String categoryIdsToAdd, String categoryIdsToRemove, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean createDefaultLocation, String responseFormat) throws Exception {
        RetailerFullResponse obj = createRetailer(request, version, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, categoryIdsToAdd, categoryIdsToRemove, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, createDefaultLocation, responseFormat);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerFullResponse createRetailer(Http.Request request, BigDecimal version, @NotNull String name, String deviceId, Long accountId, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String categoryIdsToAdd, String categoryIdsToRemove, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean createDefaultLocation, String responseFormat) throws Exception;

    public Result deleteRetailerHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerId) throws Exception {
        SirqulResponse obj = deleteRetailer(request, version, deviceId, accountId, retailerId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteRetailer(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long retailerId) throws Exception;

    public Result getRetailerHttp(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, Boolean includeCounts) throws Exception {
        RetailerFullResponse obj = getRetailer(request, version, retailerId, deviceId, accountId, includeCounts);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerFullResponse getRetailer(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, Boolean includeCounts) throws Exception;

    public Result getRetailersHttp(Http.Request request, BigDecimal version, @NotNull String visibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, String categoryIds, String filterIds, Integer i, Integer l) throws Exception {
        List<RetailerResponse> obj = getRetailers(request, version, visibility, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, categoryIds, filterIds, i, l);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RetailerResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RetailerResponse> getRetailers(Http.Request request, BigDecimal version, @NotNull String visibility, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, String deviceId, Long accountId, String q, String keyword, String categoryIds, String filterIds, Integer i, Integer l) throws Exception;

    public Result retailerLoginCheckHttp(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String appKey) throws Exception {
        AccountLoginResponse obj = retailerLoginCheck(request, version, username, password, deviceId, latitude, longitude, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AccountLoginResponse retailerLoginCheck(Http.Request request, BigDecimal version, @NotNull String username, @NotNull String password, String deviceId, Double latitude, Double longitude, String appKey) throws Exception;

    public Result updateRetailerHttp(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean active, String responseFormat) throws Exception {
        RetailerFullResponse obj = updateRetailer(request, version, retailerId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, active, responseFormat);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RetailerFullResponse updateRetailer(Http.Request request, BigDecimal version, @NotNull Long retailerId, String deviceId, Long accountId, String name, String streetAddress, String streetAddress2, String city, String state, String postalCode, String country, String businessPhone, String businessPhoneExt, String website, String email, String facebookUrl, String twitterUrl, InputStream logo, Long logoAssetId, InputStream picture1, Long picture1AssetId, InputStream picture2, Long picture2AssetId, String categoryIds, String filterIds, Double latitude, Double longitude, String metaData, String searchTags, String retailerType, String visibility, Boolean active, String responseFormat) throws Exception;

}
