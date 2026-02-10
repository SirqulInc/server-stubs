package controllers;

import java.math.BigDecimal;
import apimodels.RegionResponse;

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
public class RegionApiControllerImp extends RegionApiControllerImpInterface {
    @Override
    public RegionResponse createRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String regionClass, @NotNull String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active) throws Exception {
        //Do your magic!!!
        return new RegionResponse();
    }

    @Override
    public RegionResponse deleteRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId) throws Exception {
        //Do your magic!!!
        return new RegionResponse();
    }

    @Override
    public RegionResponse getRegion(Http.Request request, BigDecimal version, @NotNull Long regionId, Long accountId) throws Exception {
        //Do your magic!!!
        return new RegionResponse();
    }

    @Override
    public List<RegionResponse> searchRegions(Http.Request request, BigDecimal version, Long accountId, String query, String keyword, Double latitude, Double longitude, Double range, String regionClass, String visibility, String searchMode, String sortField, Boolean descending, Boolean includeParent, Boolean includeChildren, Boolean includePostalCodes, String categoryIds, String filterIds, Integer versionCode, Boolean activeOnly, Boolean showDeleted, Long lastUpdatedSince, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new ArrayList<RegionResponse>();
    }

    @Override
    public RegionResponse updateRegion(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long regionId, String regionClass, String shortName, String fullName, String parentIds, String childrenIds, String postalCodeIds, String locations, Long retailerLocationId, String visibility, String categoryIds, String filterIds, Long start, Long end, String polygon, String metaData, Double latitude, Double longitude, Integer versionCode, Boolean root, Boolean active, Boolean clearLists) throws Exception {
        //Do your magic!!!
        return new RegionResponse();
    }

}
