package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TriggerResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface TriggerApiService {
      Response createTrigger(Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTrigger(Long accountId,Long triggerId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTrigger(Long accountId,Long triggerId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchTriggers(Long accountId,String groupingId,String filter,String statuses,String templateTypes,String appKey,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTrigger(Long triggerId,Long accountId,String name,String appKey,String groupingId,String endpointURL,String payload,Long scheduledDate,Long startDate,Long endDate,String cronExpression,String conditionalInput,String visibility,Boolean active,SecurityContext securityContext)
      throws NotFoundException;


}
