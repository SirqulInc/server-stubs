package controllers;

import java.math.BigDecimal;
import apimodels.PaymentTypesResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillingInfoApiControllerImp extends BillingInfoApiControllerImpInterface {
    @Override
    public PaymentTypesResponse addPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, Boolean defaultPaymentMethod, String paymentMethodNickname, String taxId, String providerCustomerProfileId, String providerPaymentProfileId, String metaData) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

    @Override
    public PaymentTypesResponse createPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, String paymentMethodNickname, String taxId, Boolean defaultPaymentMethod, String authToken, String provider, String providerCustomerProfileId, String providerPaymentProfileId, String metaData, String appKey) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

    @Override
    public PaymentTypesResponse createSmartContract(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String tokenName, @NotNull String tokenSymbol, Long paymentMethodId) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

    @Override
    public PaymentTypesResponse getCryptoBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, Long ownerAccountId, Long paymentMethodId) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

    @Override
    public PaymentTypesResponse getPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, Boolean getCurrentBalance) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

    @Override
    public PaymentTypesResponse searchPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, String provider, String type, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new PaymentTypesResponse();
    }

}
