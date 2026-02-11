package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.PaymentTypesResponse;

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
public class BillingApiServiceImpl implements BillingApiService {
      public Response addPaymentMethod(Long accountId,Long paymentMethodId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,Boolean defaultPaymentMethod,String paymentMethodNickname,String taxId,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createPaymentMethod(Long accountId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,String paymentMethodNickname,String taxId,Boolean defaultPaymentMethod,String authToken,String provider,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,String appKey,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response createSmartContract(Long accountId,String tokenName,String tokenSymbol,Long paymentMethodId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getCryptoBalance(Long accountId,Long ownerAccountId,Long paymentMethodId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getPaymentMethod(Long accountId,Long paymentMethodId,Boolean getCurrentBalance,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchPaymentMethod(Long accountId,String provider,String type,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
