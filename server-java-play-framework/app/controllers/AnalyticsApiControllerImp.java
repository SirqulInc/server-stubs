package controllers;

import java.math.BigDecimal;
import apimodels.ChartData;
import apimodels.SirqulResponse;
import apimodels.UserActivityResponse;

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
public class AnalyticsApiControllerImp extends AnalyticsApiControllerImpInterface {
    @Override
    public List<UserActivityResponse> activities(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new ArrayList<UserActivityResponse>();
    }

    @Override
    public ChartData aggregatedFilteredUsage(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, String groupByRoot, String groupBy, String distinctCount, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ChartData();
    }

    @Override
    public ChartData filteredUsage(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, Long customId, String customType, Double customValue, Double customValue2, Long customLong, Long customLong2, String customMessage, String customMessage2, String groupBy, String distinctCount, String sumColumn, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new ChartData();
    }

    @Override
    public SirqulResponse usage(Http.Request request, BigDecimal version, @NotNull String tag, String deviceId, Long accountId, Long applicationId, String appKey, String appVersion, String device, String deviceType, String deviceOS, String model, Double latitude, Double longitude, Long customId, String customType, Long achievementIncrement, String city, String state, String country, String zip, String locationDescription, Long clientTime, String errorMessage, String ip, String userAgent, Boolean backgroundEvent, String customMessage, String customMessage2, Double customValue, Double customValue2, Long customLong, Long customLong2) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse usageBatch(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String device, @NotNull String data, String deviceId, Long accountId, String appVersion, String deviceType, String deviceOS, String model, Boolean updateRanking, Boolean returnSummaryResponse) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

}
