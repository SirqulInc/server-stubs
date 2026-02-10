package controllers;

import apimodels.ApplicationUsageResponse;
import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.SubscriptionPlanResponse;
import apimodels.SubscriptionResponse;

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
public class SubscriptionApiControllerImp extends SubscriptionApiControllerImpInterface {
    @Override
    public SubscriptionResponse createSubscription(Http.Request request, BigDecimal version, @NotNull Long accountId, Long planId, String promoCode) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

    @Override
    public SirqulResponse deleteSubscription(Http.Request request, BigDecimal version, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SubscriptionResponse getSubscription(Http.Request request, BigDecimal version, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

    @Override
    public SubscriptionPlanResponse getSubscriptionPlan(Http.Request request, BigDecimal version, @NotNull Long planId) throws Exception {
        //Do your magic!!!
        return new SubscriptionPlanResponse();
    }

    @Override
    public List<SubscriptionPlanResponse> getSubscriptionPlans(Http.Request request, BigDecimal version, Boolean visible, String role) throws Exception {
        //Do your magic!!!
        return new ArrayList<SubscriptionPlanResponse>();
    }

    @Override
    public ApplicationUsageResponse getSubscriptionUsage(Http.Request request, BigDecimal version, @NotNull Long accountId, Long applicationId, Long start, Long end) throws Exception {
        //Do your magic!!!
        return new ApplicationUsageResponse();
    }

    @Override
    public SubscriptionResponse updateSubscription(Http.Request request, BigDecimal version, @NotNull Long accountId, Long planId, String promoCode, Boolean active) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

}
