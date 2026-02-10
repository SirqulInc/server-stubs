package controllers;

import java.math.BigDecimal;
import apimodels.PaymentTypesResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class BillingInfoApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addPaymentMethodHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, Boolean defaultPaymentMethod, String paymentMethodNickname, String taxId, String providerCustomerProfileId, String providerPaymentProfileId, String metaData) throws Exception {
        PaymentTypesResponse obj = addPaymentMethod(request, version, accountId, paymentMethodId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, defaultPaymentMethod, paymentMethodNickname, taxId, providerCustomerProfileId, providerPaymentProfileId, metaData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse addPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, Boolean defaultPaymentMethod, String paymentMethodNickname, String taxId, String providerCustomerProfileId, String providerPaymentProfileId, String metaData) throws Exception;

    public Result createPaymentMethodHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, String paymentMethodNickname, String taxId, Boolean defaultPaymentMethod, String authToken, String provider, String providerCustomerProfileId, String providerPaymentProfileId, String metaData, String appKey) throws Exception {
        PaymentTypesResponse obj = createPaymentMethod(request, version, accountId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, paymentMethodNickname, taxId, defaultPaymentMethod, authToken, provider, providerCustomerProfileId, providerPaymentProfileId, metaData, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse createPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, String paymentMethodNickname, String taxId, Boolean defaultPaymentMethod, String authToken, String provider, String providerCustomerProfileId, String providerPaymentProfileId, String metaData, String appKey) throws Exception;

    public Result createSmartContractHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String tokenName, @NotNull String tokenSymbol, Long paymentMethodId) throws Exception {
        PaymentTypesResponse obj = createSmartContract(request, version, accountId, tokenName, tokenSymbol, paymentMethodId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse createSmartContract(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String tokenName, @NotNull String tokenSymbol, Long paymentMethodId) throws Exception;

    public Result getCryptoBalanceHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long ownerAccountId, Long paymentMethodId) throws Exception {
        PaymentTypesResponse obj = getCryptoBalance(request, version, accountId, ownerAccountId, paymentMethodId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse getCryptoBalance(Http.Request request, BigDecimal version, @NotNull Long accountId, Long ownerAccountId, Long paymentMethodId) throws Exception;

    public Result getPaymentMethodHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, Boolean getCurrentBalance) throws Exception {
        PaymentTypesResponse obj = getPaymentMethod(request, version, accountId, paymentMethodId, getCurrentBalance);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse getPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, Long paymentMethodId, Boolean getCurrentBalance) throws Exception;

    public Result searchPaymentMethodHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String provider, String type, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception {
        PaymentTypesResponse obj = searchPaymentMethod(request, version, accountId, provider, type, keyword, sortField, descending, start, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaymentTypesResponse searchPaymentMethod(Http.Request request, BigDecimal version, @NotNull Long accountId, String provider, String type, String keyword, String sortField, Boolean descending, Integer start, Integer limit) throws Exception;

}
