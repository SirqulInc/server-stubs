package controllers;

import apimodels.AgeGroupResponse;
import apimodels.AudienceDeviceResponse;
import apimodels.AudienceResponse;
import apimodels.OfferListResponse;
import apimodels.SearchResponse;
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
public class AudienceApiControllerImp extends AudienceApiControllerImpInterface {
    @Override
    public AudienceResponse createAudience(Http.Request request, @NotNull Long accountId, @NotNull String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Integer startTimeOffset, Integer endTimeOffset, Boolean sendSuggestion, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception {
        //Do your magic!!!
        return new AudienceResponse();
    }

    @Override
    public SirqulResponse deleteAudience(Http.Request request, @NotNull Long accountId, @NotNull Long audienceId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<AgeGroupResponse> getAgeGroups(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<AgeGroupResponse>();
    }

    @Override
    public AudienceResponse getAudience(Http.Request request, @NotNull Long accountId, @NotNull Long audienceId, String appKey, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception {
        //Do your magic!!!
        return new AudienceResponse();
    }

    @Override
    public List<SearchResponse> getAudienceList(Http.Request request, Long accountId, String albumIds, String keyword, String keywordFields, String sortField, Boolean descending, Integer start, Integer limit, Boolean sendSuggestion, Boolean activeOnly, Boolean groupByGroupingId, String appKey, Boolean returnGlobal, Boolean exactKeyword, String audienceType, String audienceTypes, Boolean returnAccountCount, Boolean returnAlbumCount, String albumTypesForCount) throws Exception {
        //Do your magic!!!
        return new ArrayList<SearchResponse>();
    }

    @Override
    public List<AudienceDeviceResponse> getDevices(Http.Request request, @NotNull Boolean includeInactive) throws Exception {
        //Do your magic!!!
        return new ArrayList<AudienceDeviceResponse>();
    }

    @Override
    public SirqulResponse getExperiences(Http.Request request) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AudienceResponse getGroupedAudiences(Http.Request request, @NotNull Long accountId, @NotNull String audienceGroupingId) throws Exception {
        //Do your magic!!!
        return new AudienceResponse();
    }

    @Override
    public OfferListResponse listByAccount(Http.Request request, @NotNull Long accountId, @NotNull Integer limit, @NotNull String suggestionType) throws Exception {
        //Do your magic!!!
        return new OfferListResponse();
    }

    @Override
    public OfferListResponse listByAudience(Http.Request request, @NotNull Integer limit, String gender, Integer age, String categoryIds, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new OfferListResponse();
    }

    @Override
    public OfferListResponse listLastestByAccount(Http.Request request, @NotNull Long accountId, @NotNull Integer timeframe, @NotNull String suggestionType) throws Exception {
        //Do your magic!!!
        return new OfferListResponse();
    }

    @Override
    public SirqulResponse sendByAccount(Http.Request request, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public AudienceResponse updateAudience(Http.Request request, @NotNull Long accountId, @NotNull Long audienceId, String name, String description, String searchTags, String gender, String ageGroups, String categoryIds, String applicationIds, String gameExperienceLevel, String devices, String deviceIds, String deviceVersions, String locations, String radius, Boolean active, Boolean sendSuggestion, Integer startTimeOffset, Integer endTimeOffset, String associateDescription, String associateType, Long associateId, String groupingId, String metaData, String visibility, String audienceType, Boolean useOrder, String cohortRegionsData, String appKey, String trilaterationTypes, Boolean uniqueName) throws Exception {
        //Do your magic!!!
        return new AudienceResponse();
    }

}
