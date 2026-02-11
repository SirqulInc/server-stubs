package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class DisbursementApiServiceImpl implements DisbursementApiService {
      public Response checkDisbursements(Long disbursementId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createDisbursement(Long accountId,Long receiverAccountId,Long originalSenderAccountId,BigDecimal amount,String provider,Long scheduledDate,String title,String comment,String externalId,String introspectionParams,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getDisbursement(Long accountId,Long disbursementId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchDisbursements(Long accountId,Long receiverAccountId,String statuses,String providers,Long beforeDate,Long afterDate,Integer start,Integer limit,Boolean activeOnly,String externalId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response updateDisbursement(Long accountId,Long disbursementId,BigDecimal amount,String provider,Long scheduledDate,String title,String comment,String externalId,Boolean retry,String introspectionParams,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
