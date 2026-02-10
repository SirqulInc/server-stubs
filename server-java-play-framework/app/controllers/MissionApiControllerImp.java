package controllers;

import java.math.BigDecimal;
import apimodels.MissionFormatResponse;
import apimodels.MissionResponse;
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
public class MissionApiControllerImp extends MissionApiControllerImpInterface {
    @Override
    public MissionResponse createMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, String description, String subType, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, String missionTask, String formatType, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String metaData, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception {
        //Do your magic!!!
        return new MissionResponse();
    }

    @Override
    public SirqulResponse deleteMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public MissionResponse findMissions(Http.Request request, BigDecimal version, @NotNull String appKey, String suffix, String type, Long accountId, String appVersion, Double latitude, Double longitude, String device, Long deviceIdentifier, String deviceVersion, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean allocatesTickets, Boolean randomize, Boolean targetedAdsOnly, String missionIds, String audienceOperator) throws Exception {
        //Do your magic!!!
        return new MissionResponse();
    }

    @Override
    public MissionResponse getMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, Boolean returnCreative) throws Exception {
        //Do your magic!!!
        return new MissionResponse();
    }

    @Override
    public SirqulResponse importMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Double latitude, @NotNull Double longitude, @NotNull String appKey, String keyword, Integer start, Integer limit, String adSize) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public List<MissionFormatResponse> searchMissionFormats(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<MissionFormatResponse>();
    }

    @Override
    public List<MissionResponse> searchMissions(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, String subType, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception {
        //Do your magic!!!
        return new ArrayList<MissionResponse>();
    }

    @Override
    public List<MissionResponse> searchMissionsByBillableEntity(Http.Request request, BigDecimal version, @NotNull Long accountId, String keyword, Integer start, Integer limit, Boolean includeGameData, Boolean includeAudiences, Boolean includeInactive, String suffix, String sortField, Boolean descending) throws Exception {
        //Do your magic!!!
        return new ArrayList<MissionResponse>();
    }

    @Override
    public MissionResponse updateMission(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long missionId, String title, String description, String subType, String metaData, Long startDate, Long endDate, Boolean active, String gameLevelIds, String creativeIds, String audienceIds, Long offerId, Double balance, Boolean advancedReporting, Boolean allocateTickets, Long ticketCount, String ticketType, Long points, String applicationIds, String devices, String deviceIds, String deviceVersions, String locations, String radius) throws Exception {
        //Do your magic!!!
        return new MissionResponse();
    }

}
