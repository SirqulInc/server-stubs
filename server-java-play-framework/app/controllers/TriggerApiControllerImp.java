package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.TriggerResponse;

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
public class TriggerApiControllerImp extends TriggerApiControllerImpInterface {
    @Override
    public TriggerResponse createTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception {
        //Do your magic!!!
        return new TriggerResponse();
    }

    @Override
    public SirqulResponse deleteTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public TriggerResponse getTrigger(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long triggerId) throws Exception {
        //Do your magic!!!
        return new TriggerResponse();
    }

    @Override
    public List<TriggerResponse> searchTriggers(Http.Request request, BigDecimal version, @NotNull Long accountId, String groupingId, String filter, String statuses, String templateTypes, String appKey, String keyword, String sortField, Boolean descending, Integer start, Integer limit, Boolean activeOnly) throws Exception {
        //Do your magic!!!
        return new ArrayList<TriggerResponse>();
    }

    @Override
    public TriggerResponse updateTrigger(Http.Request request, BigDecimal version, @NotNull Long triggerId, @NotNull Long accountId, String name, String appKey, String groupingId, String endpointURL, String payload, Long scheduledDate, Long startDate, Long endDate, String cronExpression, String conditionalInput, String visibility, Boolean active) throws Exception {
        //Do your magic!!!
        return new TriggerResponse();
    }

}
