package controllers;

import apimodels.ApplicationUsageResponse;
import apimodels.SirqulResponse;
import apimodels.SubscriptionPlanResponse;
import apimodels.SubscriptionResponse;

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
public abstract class SubscriptionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createSubscriptionHttp(Http.Request request, @NotNull Long accountId, Long planId, String promoCode) throws Exception {
        SubscriptionResponse obj = createSubscription(request, accountId, planId, promoCode);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SubscriptionResponse createSubscription(Http.Request request, @NotNull Long accountId, Long planId, String promoCode) throws Exception;

    public Result deleteSubscriptionHttp(Http.Request request, @NotNull Long accountId) throws Exception {
        SirqulResponse obj = deleteSubscription(request, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteSubscription(Http.Request request, @NotNull Long accountId) throws Exception;

    public Result getSubscriptionHttp(Http.Request request, @NotNull Long accountId) throws Exception {
        SubscriptionResponse obj = getSubscription(request, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SubscriptionResponse getSubscription(Http.Request request, @NotNull Long accountId) throws Exception;

    public Result getSubscriptionPlanHttp(Http.Request request, @NotNull Long planId) throws Exception {
        SubscriptionPlanResponse obj = getSubscriptionPlan(request, planId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SubscriptionPlanResponse getSubscriptionPlan(Http.Request request, @NotNull Long planId) throws Exception;

    public Result getSubscriptionPlansHttp(Http.Request request, Boolean visible, String role) throws Exception {
        List<SubscriptionPlanResponse> obj = getSubscriptionPlans(request, visible, role);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (SubscriptionPlanResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<SubscriptionPlanResponse> getSubscriptionPlans(Http.Request request, Boolean visible, String role) throws Exception;

    public Result getSubscriptionUsageHttp(Http.Request request, @NotNull Long accountId, Long applicationId, Long start, Long end) throws Exception {
        ApplicationUsageResponse obj = getSubscriptionUsage(request, accountId, applicationId, start, end);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ApplicationUsageResponse getSubscriptionUsage(Http.Request request, @NotNull Long accountId, Long applicationId, Long start, Long end) throws Exception;

    public Result updateSubscriptionHttp(Http.Request request, @NotNull Long accountId, Long planId, String promoCode, Boolean active) throws Exception {
        SubscriptionResponse obj = updateSubscription(request, accountId, planId, promoCode, active);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SubscriptionResponse updateSubscription(Http.Request request, @NotNull Long accountId, Long planId, String promoCode, Boolean active) throws Exception;

}
