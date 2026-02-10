package controllers;

import java.math.BigDecimal;
import apimodels.RegionResponse;

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
public abstract class RegionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createRegionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String regionClass, @NotNull String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active) throws Exception {
        RegionResponse obj = createRegion(request, version, accountId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RegionResponse createRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String regionClass, @NotNull String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active) throws Exception;

    public Result deleteRegionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId) throws Exception {
        RegionResponse obj = deleteRegion(request, version, accountId, regionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RegionResponse deleteRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId) throws Exception;

    public Result getRegionHttp(Http.Request request, BigDecimal version, @NotNull Long regionId, Long accountId) throws Exception {
        RegionResponse obj = getRegion(request, version, regionId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RegionResponse getRegion(Http.Request request, BigDecimal version, @NotNull Long regionId, Long accountId) throws Exception;

    public Result searchRegionsHttp(Http.Request request, BigDecimal version, Long accountId, String query, String keyword, Double latitude, Double longitude, Double range, String regionClass, String visibility, String searchMode, String sortField, Boolean descending, Boolean includeParent, Boolean includeChildren, Boolean includePostalCodes, String categoryIds, String filterIds, Integer versionCode, Boolean activeOnly, Boolean showDeleted, Long lastUpdatedSince, Integer start, Integer limit) throws Exception {
        List<RegionResponse> obj = searchRegions(request, version, accountId, query, keyword, latitude, longitude, range, regionClass, visibility, searchMode, sortField, descending, includeParent, includeChildren, includePostalCodes, categoryIds, filterIds, versionCode, activeOnly, showDeleted, lastUpdatedSince, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (RegionResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<RegionResponse> searchRegions(Http.Request request, BigDecimal version, Long accountId, String query, String keyword, Double latitude, Double longitude, Double range, String regionClass, String visibility, String searchMode, String sortField, Boolean descending, Boolean includeParent, Boolean includeChildren, Boolean includePostalCodes, String categoryIds, String filterIds, Integer versionCode, Boolean activeOnly, Boolean showDeleted, Long lastUpdatedSince, Integer start, Integer limit) throws Exception;

    public Result updateRegionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, Boolean clearLists) throws Exception {
        RegionResponse obj = updateRegion(request, version, accountId, regionId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active, clearLists);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RegionResponse updateRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, Boolean clearLists) throws Exception;

}
