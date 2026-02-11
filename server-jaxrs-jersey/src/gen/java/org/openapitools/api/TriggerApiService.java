package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class TriggerApiService {
    public abstract Response createTrigger( @NotNull Long accountId, @NotNull String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTrigger( @NotNull Long accountId, @NotNull Long triggerId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTrigger( @NotNull Long accountId, @NotNull Long triggerId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchTriggers( @NotNull Long accountId,String groupingId,String filter,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTrigger( @NotNull Long triggerId, @NotNull Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext) throws NotFoundException;
}
