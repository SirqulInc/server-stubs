package org.openapitools.api;

import org.openapitools.api.BillingApiService;
import org.openapitools.api.factories.BillingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PaymentTypesResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/billing")


@io.swagger.annotations.Api(description = "the billing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillingApi  {
   private final BillingApiService delegate;

   public BillingApi(@Context ServletConfig servletContext) {
      BillingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BillingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BillingApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = BillingApiServiceFactory.getBillingApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Payment Method", notes = "Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response addPaymentMethod(@ApiParam(value = "The account used to perform the the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Payment Method Id") @QueryParam("paymentMethodId")  Long paymentMethodId,@ApiParam(value = "the name of the account") @QueryParam("accountName")  String accountName,@ApiParam(value = "First Name that the account is filed as") @QueryParam("firstName")  String firstName,@ApiParam(value = "Last Name that the account is filed as") @QueryParam("lastName")  String lastName,@ApiParam(value = "Address that the account is filed as") @QueryParam("address")  String address,@ApiParam(value = "City that the account is filed as") @QueryParam("city")  String city,@ApiParam(value = "State that the account is filed as") @QueryParam("state")  String state,@ApiParam(value = "Postal Code that the account is filed as") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "Country that the account is filed as") @QueryParam("country")  String country,@ApiParam(value = "Phone that the account is filed as") @QueryParam("phone")  String phone,@ApiParam(value = "The full credit card number to store on file") @QueryParam("creditCardNumber")  String creditCardNumber,@ApiParam(value = "The credit card expiration date YYYY-MM") @QueryParam("expirationDate")  String expirationDate,@ApiParam(value = "The 3 digit confirmation code") @QueryParam("ccv")  String ccv,@ApiParam(value = "The bank account number") @QueryParam("accountNumber")  String accountNumber,@ApiParam(value = "The bank name") @QueryParam("bankName")  String bankName,@ApiParam(value = "Routing Number") @QueryParam("routingNumber")  String routingNumber,@ApiParam(value = "Default Payment Method") @QueryParam("defaultPaymentMethod")  Boolean defaultPaymentMethod,@ApiParam(value = "Payment Method Nickname") @QueryParam("paymentMethodNickname")  String paymentMethodNickname,@ApiParam(value = "Tax Id") @QueryParam("taxId")  String taxId,@ApiParam(value = "Provider customer profile Id") @QueryParam("providerCustomerProfileId")  String providerCustomerProfileId,@ApiParam(value = "Provider customer payment profile Id") @QueryParam("providerPaymentProfileId")  String providerPaymentProfileId,@ApiParam(value = "Meta Data") @QueryParam("metaData")  String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPaymentMethod(accountId, paymentMethodId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, defaultPaymentMethod, paymentMethodNickname, taxId, providerCustomerProfileId, providerPaymentProfileId, metaData, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Payment Method", notes = "Add a new method of payment.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response createPaymentMethod(@ApiParam(value = "The account used to perform the the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Account Name of the credit card user") @QueryParam("accountName")  String accountName,@ApiParam(value = "The first name on the credit card") @QueryParam("firstName")  String firstName,@ApiParam(value = "The last name on the credit card") @QueryParam("lastName")  String lastName,@ApiParam(value = "The billing address of the credit card") @QueryParam("address")  String address,@ApiParam(value = "The billing city of the credit card") @QueryParam("city")  String city,@ApiParam(value = "The billing state of the credit card") @QueryParam("state")  String state,@ApiParam(value = "The billing zip code of the credit card") @QueryParam("postalCode")  String postalCode,@ApiParam(value = "Country of the credit card") @QueryParam("country")  String country,@ApiParam(value = "The billing phone of the credit card") @QueryParam("phone")  String phone,@ApiParam(value = "The full credit card number to store on file") @QueryParam("creditCardNumber")  String creditCardNumber,@ApiParam(value = "The credit card expiration date YYYY-MM") @QueryParam("expirationDate")  String expirationDate,@ApiParam(value = "The 3 digit confirmation code") @QueryParam("ccv")  String ccv,@ApiParam(value = "The bank account number") @QueryParam("accountNumber")  String accountNumber,@ApiParam(value = "The bank name") @QueryParam("bankName")  String bankName,@ApiParam(value = "The bank routing number") @QueryParam("routingNumber")  String routingNumber,@ApiParam(value = "The nickname to give the payment method") @QueryParam("paymentMethodNickname")  String paymentMethodNickname,@ApiParam(value = "Tax Id") @QueryParam("taxId")  String taxId,@ApiParam(value = "Whether this should be the default payment method", defaultValue = "true") @DefaultValue("true") @QueryParam("defaultPaymentMethod")  Boolean defaultPaymentMethod,@ApiParam(value = "An authorization token for providers that provide this (like Amazon Payments)") @QueryParam("authToken")  String authToken,@ApiParam(value = "The payment provider (see PaymentMethodProvider)", defaultValue = "AUTHORIZE_NET") @DefaultValue("AUTHORIZE_NET") @QueryParam("provider")  String provider,@ApiParam(value = "Provider customer profile Id") @QueryParam("providerCustomerProfileId")  String providerCustomerProfileId,@ApiParam(value = "Provider customer payment profile Id") @QueryParam("providerPaymentProfileId")  String providerPaymentProfileId,@ApiParam(value = "Meta Data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Application Key") @QueryParam("appKey")  String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPaymentMethod(accountId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, paymentMethodNickname, taxId, defaultPaymentMethod, authToken, provider, providerCustomerProfileId, providerPaymentProfileId, metaData, appKey, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/crypto/transfer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Smart Contract", notes = "Adds a smart contract.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response createSmartContract(@ApiParam(value = "The account used to perform the the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The token name", required = true) @QueryParam("tokenName") @NotNull  String tokenName,@ApiParam(value = "The token symbol", required = true) @QueryParam("tokenSymbol") @NotNull  String tokenSymbol,@ApiParam(value = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @QueryParam("paymentMethodId")  Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSmartContract(accountId, tokenName, tokenSymbol, paymentMethodId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/crypto/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Crypto Balances", notes = "Get the cypto balance details for a user", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response getCryptoBalance(@ApiParam(value = "The account used to perform the the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The account to retreive balances for") @QueryParam("ownerAccountId")  Long ownerAccountId,@ApiParam(value = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @QueryParam("paymentMethodId")  Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCryptoBalance(accountId, ownerAccountId, paymentMethodId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Payment Method", notes = "Get the details of the user's payment method or their current default method of payment", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response getPaymentMethod(@ApiParam(value = "The account used to perform the the request", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @QueryParam("paymentMethodId")  Long paymentMethodId,@ApiParam(value = "Determines whether to get the user's current balance for the requested payment method option (not all payment method options support this)") @QueryParam("getCurrentBalance")  Boolean getCurrentBalance,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPaymentMethod(accountId, paymentMethodId, getCurrentBalance, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Payment Methods", notes = "Search the payment methods of an account", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class)
    })
    public Response searchPaymentMethod(@ApiParam(value = "Account Id to search on", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Provider to search on", defaultValue = "AUTHORIZE_NET") @DefaultValue("AUTHORIZE_NET") @QueryParam("provider")  String provider,@ApiParam(value = "the type to search on") @QueryParam("type")  String type,@ApiParam(value = "the keyword to search on") @QueryParam("keyword")  String keyword,@ApiParam(value = "the sort field to use for the search", defaultValue = "UPDATED") @DefaultValue("UPDATED") @QueryParam("sortField")  String sortField,@ApiParam(value = "if the results should be in descending order", defaultValue = "true") @DefaultValue("true") @QueryParam("descending")  Boolean descending,@ApiParam(value = "the start of the search", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "the limit of the search", defaultValue = "5") @DefaultValue("5") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchPaymentMethod(accountId, provider, type, keyword, sortField, descending, start, limit, securityContext);
    }
}
