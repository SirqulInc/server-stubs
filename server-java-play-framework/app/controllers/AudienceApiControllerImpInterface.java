package controllers;

import apimodels.AgeGroupResponse;
import apimodels.AudienceDeviceResponse;
import apimodels.AudienceResponse;
import java.math.BigDecimal;
import apimodels.OfferListResponse;
import apimodels.SearchResponse;
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
public abstract class AudienceApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createAudienceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Integer startTimeOffset, Integer endTimeOffset, Boolean sendSuggestion, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception {
        AudienceResponse obj = createAudience(request, version, accountId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, startTimeOffset, endTimeOffset, sendSuggestion, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudienceResponse createAudience(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Integer startTimeOffset, Integer endTimeOffset, Boolean sendSuggestion, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception;

    public Result deleteAudienceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId) throws Exception {
        SirqulResponse obj = deleteAudience(request, version, accountId, audienceId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteAudience(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId) throws Exception;

    public Result getAgeGroupsHttp(Http.Request request, BigDecimal version) throws Exception {
        List<AgeGroupResponse> obj = getAgeGroups(request, version);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AgeGroupResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AgeGroupResponse> getAgeGroups(Http.Request request, BigDecimal version) throws Exception;

    public Result getAudienceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId, String appKey, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception {
        AudienceResponse obj = getAudience(request, version, accountId, audienceId, appKey, returnAccountCount, returnAlbumCount, albumTypesForCount);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudienceResponse getAudience(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId, String appKey, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception;

    public Result getAudienceListHttp(Http.Request request, BigDecimal version, Long accountId, String albumIds, String keyword, String keywordFields, String sortField, Boolean descending, Integer start, Integer limit, Boolean sendSuggestion, Boolean activeOnly, Boolean groupByGroupingId, String appKey, Boolean returnGlobal, Boolean exactKeyword, String audienceType, String audienceTypes, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception {
        List<SearchResponse> obj = getAudienceList(request, version, accountId, albumIds, keyword, keywordFields, sortField, descending, start, limit, sendSuggestion, activeOnly, groupByGroupingId, appKey, returnGlobal, exactKeyword, audienceType, audienceTypes, returnAccountCount, returnAlbumCount, albumTypesForCount);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (SearchResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<SearchResponse> getAudienceList(Http.Request request, BigDecimal version, Long accountId, String albumIds, String keyword, String keywordFields, String sortField, Boolean descending, Integer start, Integer limit, Boolean sendSuggestion, Boolean activeOnly, Boolean groupByGroupingId, String appKey, Boolean returnGlobal, Boolean exactKeyword, String audienceType, String audienceTypes, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception;

    public Result getDevicesHttp(Http.Request request, BigDecimal version, @NotNull Boolean includeInactive) throws Exception {
        List<AudienceDeviceResponse> obj = getDevices(request, version, includeInactive);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (AudienceDeviceResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<AudienceDeviceResponse> getDevices(Http.Request request, BigDecimal version, @NotNull Boolean includeInactive) throws Exception;

    public Result getExperiencesHttp(Http.Request request, BigDecimal version) throws Exception {
        SirqulResponse obj = getExperiences(request, version);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse getExperiences(Http.Request request, BigDecimal version) throws Exception;

    public Result getGroupedAudiencesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String audienceGroupingId) throws Exception {
        AudienceResponse obj = getGroupedAudiences(request, version, accountId, audienceGroupingId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudienceResponse getGroupedAudiences(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String audienceGroupingId) throws Exception;

    public Result listByAccountHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer limit, @NotNull String suggestionType) throws Exception {
        OfferListResponse obj = listByAccount(request, version, accountId, limit, suggestionType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferListResponse listByAccount(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer limit, @NotNull String suggestionType) throws Exception;

    public Result listByAudienceHttp(Http.Request request, BigDecimal version, @NotNull Integer limit, String gender, Integer age, String categoryIds, Double latitude, Double longitude) throws Exception {
        OfferListResponse obj = listByAudience(request, version, limit, gender, age, categoryIds, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferListResponse listByAudience(Http.Request request, BigDecimal version, @NotNull Integer limit, String gender, Integer age, String categoryIds, Double latitude, Double longitude) throws Exception;

    public Result listLastestByAccountHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer timeframe, @NotNull String suggestionType) throws Exception {
        OfferListResponse obj = listLastestByAccount(request, version, accountId, timeframe, suggestionType);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OfferListResponse listLastestByAccount(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer timeframe, @NotNull String suggestionType) throws Exception;

    public Result sendByAccountHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude) throws Exception {
        SirqulResponse obj = sendByAccount(request, version, accountId, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse sendByAccount(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude) throws Exception;

    public Result updateAudienceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId, String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Boolean active, Boolean sendSuggestion, Integer startTimeOffset, Integer endTimeOffset, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception {
        AudienceResponse obj = updateAudience(request, version, accountId, audienceId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, active, sendSuggestion, startTimeOffset, endTimeOffset, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AudienceResponse updateAudience(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long audienceId, String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Boolean active, Boolean sendSuggestion, Integer startTimeOffset, Integer endTimeOffset, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception;

}
