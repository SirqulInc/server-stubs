package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class BillableApiService {
    public abstract Response createBillableEntity(String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteBillableEntity(String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBillableEntity(String deviceId,Long accountId,Boolean includeCounts,Boolean includePayments,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateBillableEntity(String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext) throws NotFoundException;
}
