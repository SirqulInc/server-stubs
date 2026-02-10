package controllers;

import java.math.BigDecimal;
import apimodels.ChartData;
import apimodels.SirqulResponse;
import apimodels.UserActivityResponse;

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
public abstract class AnalyticsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result activitiesHttp(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Long accountId) throws Exception {
        List<UserActivityResponse> obj = activities(request, version, start, limit, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (UserActivityResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<UserActivityResponse> activities(Http.Request request, BigDecimal version, @NotNull Integer start, @NotNull Integer limit, @NotNull Long accountId) throws Exception;

    public Result aggregatedFilteredUsageHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, String groupByRoot, String groupBy, String distinctCount, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception {
        ChartData obj = aggregatedFilteredUsage(request, version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, groupByRoot, groupBy, distinctCount, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ChartData aggregatedFilteredUsage(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, String groupByRoot, String groupBy, String distinctCount, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception;

    public Result filteredUsageHttp(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, Long customId, String customType, Double customValue, Double customValue2, Long customLong, Long customLong2, String customMessage, String customMessage2, String groupBy, String distinctCount, String sumColumn, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception {
        ChartData obj = filteredUsage(request, version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, customId, customType, customValue, customValue2, customLong, customLong2, customMessage, customMessage2, groupBy, distinctCount, sumColumn, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ChartData filteredUsage(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long applicationId, String appKey, Long startDate, Long endDate, String deviceType, String device, String deviceOS, String gender, String ageGroup, String country, String state, String city, String zip, String model, String tag, Long userAccountId, String userAccountDisplay, String userAccountUsername, Long customId, String customType, Double customValue, Double customValue2, Long customLong, Long customLong2, String customMessage, String customMessage2, String groupBy, String distinctCount, String sumColumn, String sortField, Boolean descending, Boolean hideUnknown, String responseFormat, Integer l, Integer limit, Double latitude, Double longitude) throws Exception;

    public Result usageHttp(Http.Request request, BigDecimal version, @NotNull String tag, String deviceId, Long accountId, Long applicationId, String appKey, String appVersion, String device, String deviceType, String deviceOS, String model, Double latitude, Double longitude, Long customId, String customType, Long achievementIncrement, String city, String state, String country, String zip, String locationDescription, Long clientTime, String errorMessage, String ip, String userAgent, Boolean backgroundEvent, String customMessage, String customMessage2, Double customValue, Double customValue2, Long customLong, Long customLong2) throws Exception {
        SirqulResponse obj = usage(request, version, tag, deviceId, accountId, applicationId, appKey, appVersion, device, deviceType, deviceOS, model, latitude, longitude, customId, customType, achievementIncrement, city, state, country, zip, locationDescription, clientTime, errorMessage, ip, userAgent, backgroundEvent, customMessage, customMessage2, customValue, customValue2, customLong, customLong2);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse usage(Http.Request request, BigDecimal version, @NotNull String tag, String deviceId, Long accountId, Long applicationId, String appKey, String appVersion, String device, String deviceType, String deviceOS, String model, Double latitude, Double longitude, Long customId, String customType, Long achievementIncrement, String city, String state, String country, String zip, String locationDescription, Long clientTime, String errorMessage, String ip, String userAgent, Boolean backgroundEvent, String customMessage, String customMessage2, Double customValue, Double customValue2, Long customLong, Long customLong2) throws Exception;

    public Result usageBatchHttp(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String device, @NotNull String data, String deviceId, Long accountId, String appVersion, String deviceType, String deviceOS, String model, Boolean updateRanking, Boolean returnSummaryResponse) throws Exception {
        SirqulResponse obj = usageBatch(request, version, appKey, device, data, deviceId, accountId, appVersion, deviceType, deviceOS, model, updateRanking, returnSummaryResponse);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse usageBatch(Http.Request request, BigDecimal version, @NotNull String appKey, @NotNull String device, @NotNull String data, String deviceId, Long accountId, String appVersion, String deviceType, String deviceOS, String model, Boolean updateRanking, Boolean returnSummaryResponse) throws Exception;

}
