package controllers;

import apimodels.ApplicationUsageResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class SubscriptionApiControllerImp extends SubscriptionApiControllerImpInterface {
    @Override
    public SubscriptionResponse createSubscription(Http.Request request, @NotNull Long accountId, Long planId, String promoCode) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

    @Override
    public SirqulResponse deleteSubscription(Http.Request request, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SubscriptionResponse getSubscription(Http.Request request, @NotNull Long accountId) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

    @Override
    public SubscriptionPlanResponse getSubscriptionPlan(Http.Request request, @NotNull Long planId) throws Exception {
        //Do your magic!!!
        return new SubscriptionPlanResponse();
    }

    @Override
    public List<SubscriptionPlanResponse> getSubscriptionPlans(Http.Request request, Boolean visible, String role) throws Exception {
        //Do your magic!!!
        return new ArrayList<SubscriptionPlanResponse>();
    }

    @Override
    public ApplicationUsageResponse getSubscriptionUsage(Http.Request request, @NotNull Long accountId, Long applicationId, Long start, Long end) throws Exception {
        //Do your magic!!!
        return new ApplicationUsageResponse();
    }

    @Override
    public SubscriptionResponse updateSubscription(Http.Request request, @NotNull Long accountId, Long planId, String promoCode, Boolean active) throws Exception {
        //Do your magic!!!
        return new SubscriptionResponse();
    }

}
