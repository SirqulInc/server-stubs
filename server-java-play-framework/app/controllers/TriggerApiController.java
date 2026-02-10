package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TriggerResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TriggerApiController extends Controller {
    private final TriggerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private TriggerApiController(Config configuration, TriggerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createTrigger(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            throw new IllegalArgumentException("'name' parameter is required");
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valueendpointURL = request.getQueryString("endpointURL");
        String endpointURL;
        if (valueendpointURL != null) {
            endpointURL = valueendpointURL;
        } else {
            endpointURL = null;
        }
        String valuepayload = request.getQueryString("payload");
        String payload;
        if (valuepayload != null) {
            payload = valuepayload;
        } else {
            payload = null;
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuecronExpression = request.getQueryString("cronExpression");
        String cronExpression;
        if (valuecronExpression != null) {
            cronExpression = valuecronExpression;
        } else {
            cronExpression = null;
        }
        String valueconditionalInput = request.getQueryString("conditionalInput");
        String conditionalInput;
        if (valueconditionalInput != null) {
            conditionalInput = valueconditionalInput;
        } else {
            conditionalInput = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = true;
        }
        return imp.createTriggerHttp(request, version, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active);
    }

    @ApiAction
    public Result deleteTrigger(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetriggerId = request.getQueryString("triggerId");
        Long triggerId;
        if (valuetriggerId != null) {
            triggerId = Long.parseLong(valuetriggerId);
        } else {
            throw new IllegalArgumentException("'triggerId' parameter is required");
        }
        return imp.deleteTriggerHttp(request, version, accountId, triggerId);
    }

    @ApiAction
    public Result getTrigger(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetriggerId = request.getQueryString("triggerId");
        Long triggerId;
        if (valuetriggerId != null) {
            triggerId = Long.parseLong(valuetriggerId);
        } else {
            throw new IllegalArgumentException("'triggerId' parameter is required");
        }
        return imp.getTriggerHttp(request, version, accountId, triggerId);
    }

    @ApiAction
    public Result searchTriggers(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = "MINE";
        }
        String valuestatuses = request.getQueryString("statuses");
        String statuses;
        if (valuestatuses != null) {
            statuses = valuestatuses;
        } else {
            statuses = "NEW,ERROR,COMPLETE,PROCESSING";
        }
        String valuetemplateTypes = request.getQueryString("templateTypes");
        String templateTypes;
        if (valuetemplateTypes != null) {
            templateTypes = valuetemplateTypes;
        } else {
            templateTypes = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "CREATED";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueactiveOnly = request.getQueryString("activeOnly");
        Boolean activeOnly;
        if (valueactiveOnly != null) {
            activeOnly = Boolean.valueOf(valueactiveOnly);
        } else {
            activeOnly = true;
        }
        return imp.searchTriggersHttp(request, version, accountId, groupingId, filter, statuses, templateTypes, appKey, keyword, sortField, descending, start, limit, activeOnly);
    }

    @ApiAction
    public Result updateTrigger(Http.Request request, BigDecimal version) throws Exception {
        String valuetriggerId = request.getQueryString("triggerId");
        Long triggerId;
        if (valuetriggerId != null) {
            triggerId = Long.parseLong(valuetriggerId);
        } else {
            throw new IllegalArgumentException("'triggerId' parameter is required");
        }
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuename = request.getQueryString("name");
        String name;
        if (valuename != null) {
            name = valuename;
        } else {
            name = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        String valuegroupingId = request.getQueryString("groupingId");
        String groupingId;
        if (valuegroupingId != null) {
            groupingId = valuegroupingId;
        } else {
            groupingId = null;
        }
        String valueendpointURL = request.getQueryString("endpointURL");
        String endpointURL;
        if (valueendpointURL != null) {
            endpointURL = valueendpointURL;
        } else {
            endpointURL = null;
        }
        String valuepayload = request.getQueryString("payload");
        String payload;
        if (valuepayload != null) {
            payload = valuepayload;
        } else {
            payload = null;
        }
        String valuescheduledDate = request.getQueryString("scheduledDate");
        Long scheduledDate;
        if (valuescheduledDate != null) {
            scheduledDate = Long.parseLong(valuescheduledDate);
        } else {
            scheduledDate = null;
        }
        String valuestartDate = request.getQueryString("startDate");
        Long startDate;
        if (valuestartDate != null) {
            startDate = Long.parseLong(valuestartDate);
        } else {
            startDate = null;
        }
        String valueendDate = request.getQueryString("endDate");
        Long endDate;
        if (valueendDate != null) {
            endDate = Long.parseLong(valueendDate);
        } else {
            endDate = null;
        }
        String valuecronExpression = request.getQueryString("cronExpression");
        String cronExpression;
        if (valuecronExpression != null) {
            cronExpression = valuecronExpression;
        } else {
            cronExpression = null;
        }
        String valueconditionalInput = request.getQueryString("conditionalInput");
        String conditionalInput;
        if (valueconditionalInput != null) {
            conditionalInput = valueconditionalInput;
        } else {
            conditionalInput = null;
        }
        String valuevisibility = request.getQueryString("visibility");
        String visibility;
        if (valuevisibility != null) {
            visibility = valuevisibility;
        } else {
            visibility = null;
        }
        String valueactive = request.getQueryString("active");
        Boolean active;
        if (valueactive != null) {
            active = Boolean.valueOf(valueactive);
        } else {
            active = null;
        }
        return imp.updateTriggerHttp(request, version, triggerId, accountId, name, appKey, groupingId, endpointURL, payload, scheduledDate, startDate, endDate, cronExpression, conditionalInput, visibility, active);
    }

}
