package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.PaymentTypesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class BillingApiService {
    public abstract Response addPaymentMethod( @NotNull Long accountId,Long paymentMethodId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,Boolean defaultPaymentMethod,String paymentMethodNickname,String taxId,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createPaymentMethod( @NotNull Long accountId,String accountName,String firstName,String lastName,String address,String city,String state,String postalCode,String country,String phone,String creditCardNumber,String expirationDate,String ccv,String accountNumber,String bankName,String routingNumber,String paymentMethodNickname,String taxId,Boolean defaultPaymentMethod,String authToken,String provider,String providerCustomerProfileId,String providerPaymentProfileId,String metaData,String appKey,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createSmartContract( @NotNull Long accountId, @NotNull String tokenName, @NotNull String tokenSymbol,Long paymentMethodId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCryptoBalance( @NotNull Long accountId,Long ownerAccountId,Long paymentMethodId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPaymentMethod( @NotNull Long accountId,Long paymentMethodId,Boolean getCurrentBalance,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchPaymentMethod( @NotNull Long accountId,String provider,String type,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
}
