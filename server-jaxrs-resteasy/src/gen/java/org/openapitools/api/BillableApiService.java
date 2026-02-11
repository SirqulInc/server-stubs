package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface BillableApiService {
      Response createBillableEntity(String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteBillableEntity(String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response getBillableEntity(String deviceId,Long accountId,Boolean includeCounts,Boolean includePayments,SecurityContext securityContext)
      throws NotFoundException;
      Response updateBillableEntity(String deviceId,Long accountId,String name,String streetAddress,String streetAddress2,String city,String state,String postalCode,String businessPhone,String businessPhoneExt,String authorizeNetApiKey,String authorizeNetTransactionKey,SecurityContext securityContext)
      throws NotFoundException;


}
