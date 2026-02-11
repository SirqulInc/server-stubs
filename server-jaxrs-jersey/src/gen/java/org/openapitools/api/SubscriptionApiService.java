package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class SubscriptionApiService {
    public abstract Response createSubscription( @NotNull Long accountId,Long planId,String promoCode,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteSubscription( @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscription( @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscriptionPlan( @NotNull Long planId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscriptionPlans(Boolean visible,String role,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSubscriptionUsage( @NotNull Long accountId,Long applicationId,Long start,Long end,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateSubscription( @NotNull Long accountId,Long planId,String promoCode,Boolean active,SecurityContext securityContext) throws NotFoundException;
}
