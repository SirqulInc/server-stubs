package org.openapitools.api;

import org.openapitools.model.PaymentTypesResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/billing")
@Api(value = "/", description = "")
public interface BillingInfoApi  {

    /**
     * Update Payment Method
     *
     * Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Payment Method", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse addPaymentMethod(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("defaultPaymentMethod") Boolean defaultPaymentMethod, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData);

    /**
     * Create Payment Method
     *
     * Add a new method of payment.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Payment Method", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse createPaymentMethod(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @QueryParam("defaultPaymentMethod") @DefaultValue("true")Boolean defaultPaymentMethod, @QueryParam("authToken") String authToken, @QueryParam("provider") @DefaultValue("AUTHORIZE_NET")String provider, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey);

    /**
     * Create Smart Contract
     *
     * Adds a smart contract.
     *
     */
    @POST
    @Path("/crypto/transfer")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Smart Contract", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse createSmartContract(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("tokenName") @NotNull String tokenName, @QueryParam("tokenSymbol") @NotNull String tokenSymbol, @QueryParam("paymentMethodId") Long paymentMethodId);

    /**
     * Get Crypto Balances
     *
     * Get the cypto balance details for a user
     *
     */
    @GET
    @Path("/crypto/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Crypto Balances", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse getCryptoBalance(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("ownerAccountId") Long ownerAccountId, @QueryParam("paymentMethodId") Long paymentMethodId);

    /**
     * Get Payment Method
     *
     * Get the details of the user&#39;s payment method or their current default method of payment
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Payment Method", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse getPaymentMethod(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("getCurrentBalance") Boolean getCurrentBalance);

    /**
     * Search Payment Methods
     *
     * Search the payment methods of an account
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Payment Methods", tags={ "Billing Info" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public PaymentTypesResponse searchPaymentMethod(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("provider") @DefaultValue("AUTHORIZE_NET")String provider, @QueryParam("type") String type, @QueryParam("keyword") String keyword, @QueryParam("sortField") @DefaultValue("UPDATED")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("5")Integer limit);
}
