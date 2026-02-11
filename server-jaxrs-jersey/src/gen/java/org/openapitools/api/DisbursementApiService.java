package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.math.BigDecimal;
import org.openapitools.model.DisbursementResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class DisbursementApiService {
    public abstract Response checkDisbursements( @NotNull Long disbursementId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createDisbursement( @NotNull Long accountId, @NotNull Long receiverAccountId, @NotNull Long originalSenderAccountId, @NotNull BigDecimal amount, @NotNull String provider,Long scheduledDate,String title,String comment,String externalId,String introspectionParams,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDisbursement( @NotNull Long accountId, @NotNull Long disbursementId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchDisbursements( @NotNull Long accountId,Long receiverAccountId,String statuses,String providers,Long beforeDate,Long afterDate,Integer start,Integer limit,Boolean activeOnly,String externalId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateDisbursement( @NotNull Long accountId, @NotNull Long disbursementId,BigDecimal amount,String provider,Long scheduledDate,String title,String comment,String externalId,Boolean retry,String introspectionParams,SecurityContext securityContext) throws NotFoundException;
}
