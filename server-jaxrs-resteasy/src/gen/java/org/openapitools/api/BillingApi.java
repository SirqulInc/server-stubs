package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BillingApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PaymentTypesResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/billing")


@io.swagger.annotations.Api(description = "the billing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillingApi  {

    @Inject BillingApiService service;

    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Payment Method", notes = "Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response addPaymentMethod( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("defaultPaymentMethod") Boolean defaultPaymentMethod, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPaymentMethod(accountId,paymentMethodId,accountName,firstName,lastName,address,city,state,postalCode,country,phone,creditCardNumber,expirationDate,ccv,accountNumber,bankName,routingNumber,defaultPaymentMethod,paymentMethodNickname,taxId,providerCustomerProfileId,providerPaymentProfileId,metaData,securityContext);
    }
    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Payment Method", notes = "Add a new method of payment.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response createPaymentMethod( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @DefaultValue("true") @QueryParam("defaultPaymentMethod") Boolean defaultPaymentMethod, @QueryParam("authToken") String authToken, @DefaultValue("AUTHORIZE_NET") @QueryParam("provider") String provider, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPaymentMethod(accountId,accountName,firstName,lastName,address,city,state,postalCode,country,phone,creditCardNumber,expirationDate,ccv,accountNumber,bankName,routingNumber,paymentMethodNickname,taxId,defaultPaymentMethod,authToken,provider,providerCustomerProfileId,providerPaymentProfileId,metaData,appKey,securityContext);
    }
    @POST
    @Path("/crypto/transfer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Smart Contract", notes = "Adds a smart contract.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response createSmartContract( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("tokenName") String tokenName, @NotNull @QueryParam("tokenSymbol") String tokenSymbol, @QueryParam("paymentMethodId") Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSmartContract(accountId,tokenName,tokenSymbol,paymentMethodId,securityContext);
    }
    @GET
    @Path("/crypto/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Crypto Balances", notes = "Get the cypto balance details for a user", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response getCryptoBalance( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("ownerAccountId") Long ownerAccountId, @QueryParam("paymentMethodId") Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCryptoBalance(accountId,ownerAccountId,paymentMethodId,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Payment Method", notes = "Get the details of the user's payment method or their current default method of payment", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response getPaymentMethod( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("getCurrentBalance") Boolean getCurrentBalance,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPaymentMethod(accountId,paymentMethodId,getCurrentBalance,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Payment Methods", notes = "Search the payment methods of an account", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response searchPaymentMethod( @NotNull @QueryParam("accountId") Long accountId, @DefaultValue("AUTHORIZE_NET") @QueryParam("provider") String provider, @QueryParam("type") String type, @QueryParam("keyword") String keyword, @DefaultValue("UPDATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("5") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPaymentMethod(accountId,provider,type,keyword,sortField,descending,start,limit,securityContext);
    }
}
