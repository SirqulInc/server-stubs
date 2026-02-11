package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface SubscriptionApiService {
      Response createSubscription(Long accountId,Long planId,String promoCode,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteSubscription(Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscription(Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionPlan(Long planId,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionPlans(Boolean visible,String role,SecurityContext securityContext)
      throws NotFoundException;
      Response getSubscriptionUsage(Long accountId,Long applicationId,Long start,Long end,SecurityContext securityContext)
      throws NotFoundException;
      Response updateSubscription(Long accountId,Long planId,String promoCode,Boolean active,SecurityContext securityContext)
      throws NotFoundException;


}
