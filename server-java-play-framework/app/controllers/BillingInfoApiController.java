package controllers;

import java.math.BigDecimal;
import apimodels.PaymentTypesResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BillingInfoApiController extends Controller {
    private final BillingInfoApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BillingInfoApiController(Config configuration, BillingInfoApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addPaymentMethod(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valueaccountName = request.getQueryString("accountName");
        String accountName;
        if (valueaccountName != null) {
            accountName = valueaccountName;
        } else {
            accountName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valueaddress = request.getQueryString("address");
        String address;
        if (valueaddress != null) {
            address = valueaddress;
        } else {
            address = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuephone = request.getQueryString("phone");
        String phone;
        if (valuephone != null) {
            phone = valuephone;
        } else {
            phone = null;
        }
        String valuecreditCardNumber = request.getQueryString("creditCardNumber");
        String creditCardNumber;
        if (valuecreditCardNumber != null) {
            creditCardNumber = valuecreditCardNumber;
        } else {
            creditCardNumber = null;
        }
        String valueexpirationDate = request.getQueryString("expirationDate");
        String expirationDate;
        if (valueexpirationDate != null) {
            expirationDate = valueexpirationDate;
        } else {
            expirationDate = null;
        }
        String valueccv = request.getQueryString("ccv");
        String ccv;
        if (valueccv != null) {
            ccv = valueccv;
        } else {
            ccv = null;
        }
        String valueaccountNumber = request.getQueryString("accountNumber");
        String accountNumber;
        if (valueaccountNumber != null) {
            accountNumber = valueaccountNumber;
        } else {
            accountNumber = null;
        }
        String valuebankName = request.getQueryString("bankName");
        String bankName;
        if (valuebankName != null) {
            bankName = valuebankName;
        } else {
            bankName = null;
        }
        String valueroutingNumber = request.getQueryString("routingNumber");
        String routingNumber;
        if (valueroutingNumber != null) {
            routingNumber = valueroutingNumber;
        } else {
            routingNumber = null;
        }
        String valuedefaultPaymentMethod = request.getQueryString("defaultPaymentMethod");
        Boolean defaultPaymentMethod;
        if (valuedefaultPaymentMethod != null) {
            defaultPaymentMethod = Boolean.valueOf(valuedefaultPaymentMethod);
        } else {
            defaultPaymentMethod = null;
        }
        String valuepaymentMethodNickname = request.getQueryString("paymentMethodNickname");
        String paymentMethodNickname;
        if (valuepaymentMethodNickname != null) {
            paymentMethodNickname = valuepaymentMethodNickname;
        } else {
            paymentMethodNickname = null;
        }
        String valuetaxId = request.getQueryString("taxId");
        String taxId;
        if (valuetaxId != null) {
            taxId = valuetaxId;
        } else {
            taxId = null;
        }
        String valueproviderCustomerProfileId = request.getQueryString("providerCustomerProfileId");
        String providerCustomerProfileId;
        if (valueproviderCustomerProfileId != null) {
            providerCustomerProfileId = valueproviderCustomerProfileId;
        } else {
            providerCustomerProfileId = null;
        }
        String valueproviderPaymentProfileId = request.getQueryString("providerPaymentProfileId");
        String providerPaymentProfileId;
        if (valueproviderPaymentProfileId != null) {
            providerPaymentProfileId = valueproviderPaymentProfileId;
        } else {
            providerPaymentProfileId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        return imp.addPaymentMethodHttp(request, version, accountId, paymentMethodId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, defaultPaymentMethod, paymentMethodNickname, taxId, providerCustomerProfileId, providerPaymentProfileId, metaData);
    }

    @ApiAction
    public Result createPaymentMethod(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueaccountName = request.getQueryString("accountName");
        String accountName;
        if (valueaccountName != null) {
            accountName = valueaccountName;
        } else {
            accountName = null;
        }
        String valuefirstName = request.getQueryString("firstName");
        String firstName;
        if (valuefirstName != null) {
            firstName = valuefirstName;
        } else {
            firstName = null;
        }
        String valuelastName = request.getQueryString("lastName");
        String lastName;
        if (valuelastName != null) {
            lastName = valuelastName;
        } else {
            lastName = null;
        }
        String valueaddress = request.getQueryString("address");
        String address;
        if (valueaddress != null) {
            address = valueaddress;
        } else {
            address = null;
        }
        String valuecity = request.getQueryString("city");
        String city;
        if (valuecity != null) {
            city = valuecity;
        } else {
            city = null;
        }
        String valuestate = request.getQueryString("state");
        String state;
        if (valuestate != null) {
            state = valuestate;
        } else {
            state = null;
        }
        String valuepostalCode = request.getQueryString("postalCode");
        String postalCode;
        if (valuepostalCode != null) {
            postalCode = valuepostalCode;
        } else {
            postalCode = null;
        }
        String valuecountry = request.getQueryString("country");
        String country;
        if (valuecountry != null) {
            country = valuecountry;
        } else {
            country = null;
        }
        String valuephone = request.getQueryString("phone");
        String phone;
        if (valuephone != null) {
            phone = valuephone;
        } else {
            phone = null;
        }
        String valuecreditCardNumber = request.getQueryString("creditCardNumber");
        String creditCardNumber;
        if (valuecreditCardNumber != null) {
            creditCardNumber = valuecreditCardNumber;
        } else {
            creditCardNumber = null;
        }
        String valueexpirationDate = request.getQueryString("expirationDate");
        String expirationDate;
        if (valueexpirationDate != null) {
            expirationDate = valueexpirationDate;
        } else {
            expirationDate = null;
        }
        String valueccv = request.getQueryString("ccv");
        String ccv;
        if (valueccv != null) {
            ccv = valueccv;
        } else {
            ccv = null;
        }
        String valueaccountNumber = request.getQueryString("accountNumber");
        String accountNumber;
        if (valueaccountNumber != null) {
            accountNumber = valueaccountNumber;
        } else {
            accountNumber = null;
        }
        String valuebankName = request.getQueryString("bankName");
        String bankName;
        if (valuebankName != null) {
            bankName = valuebankName;
        } else {
            bankName = null;
        }
        String valueroutingNumber = request.getQueryString("routingNumber");
        String routingNumber;
        if (valueroutingNumber != null) {
            routingNumber = valueroutingNumber;
        } else {
            routingNumber = null;
        }
        String valuepaymentMethodNickname = request.getQueryString("paymentMethodNickname");
        String paymentMethodNickname;
        if (valuepaymentMethodNickname != null) {
            paymentMethodNickname = valuepaymentMethodNickname;
        } else {
            paymentMethodNickname = null;
        }
        String valuetaxId = request.getQueryString("taxId");
        String taxId;
        if (valuetaxId != null) {
            taxId = valuetaxId;
        } else {
            taxId = null;
        }
        String valuedefaultPaymentMethod = request.getQueryString("defaultPaymentMethod");
        Boolean defaultPaymentMethod;
        if (valuedefaultPaymentMethod != null) {
            defaultPaymentMethod = Boolean.valueOf(valuedefaultPaymentMethod);
        } else {
            defaultPaymentMethod = true;
        }
        String valueauthToken = request.getQueryString("authToken");
        String authToken;
        if (valueauthToken != null) {
            authToken = valueauthToken;
        } else {
            authToken = null;
        }
        String valueprovider = request.getQueryString("provider");
        String provider;
        if (valueprovider != null) {
            provider = valueprovider;
        } else {
            provider = "AUTHORIZE_NET";
        }
        String valueproviderCustomerProfileId = request.getQueryString("providerCustomerProfileId");
        String providerCustomerProfileId;
        if (valueproviderCustomerProfileId != null) {
            providerCustomerProfileId = valueproviderCustomerProfileId;
        } else {
            providerCustomerProfileId = null;
        }
        String valueproviderPaymentProfileId = request.getQueryString("providerPaymentProfileId");
        String providerPaymentProfileId;
        if (valueproviderPaymentProfileId != null) {
            providerPaymentProfileId = valueproviderPaymentProfileId;
        } else {
            providerPaymentProfileId = null;
        }
        String valuemetaData = request.getQueryString("metaData");
        String metaData;
        if (valuemetaData != null) {
            metaData = valuemetaData;
        } else {
            metaData = null;
        }
        String valueappKey = request.getQueryString("appKey");
        String appKey;
        if (valueappKey != null) {
            appKey = valueappKey;
        } else {
            appKey = null;
        }
        return imp.createPaymentMethodHttp(request, version, accountId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, paymentMethodNickname, taxId, defaultPaymentMethod, authToken, provider, providerCustomerProfileId, providerPaymentProfileId, metaData, appKey);
    }

    @ApiAction
    public Result createSmartContract(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valuetokenName = request.getQueryString("tokenName");
        String tokenName;
        if (valuetokenName != null) {
            tokenName = valuetokenName;
        } else {
            throw new IllegalArgumentException("'tokenName' parameter is required");
        }
        String valuetokenSymbol = request.getQueryString("tokenSymbol");
        String tokenSymbol;
        if (valuetokenSymbol != null) {
            tokenSymbol = valuetokenSymbol;
        } else {
            throw new IllegalArgumentException("'tokenSymbol' parameter is required");
        }
        return imp.createSmartContractHttp(request, version, accountId, tokenName, tokenSymbol, paymentMethodId);
    }

    @ApiAction
    public Result getCryptoBalance(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueownerAccountId = request.getQueryString("ownerAccountId");
        Long ownerAccountId;
        if (valueownerAccountId != null) {
            ownerAccountId = Long.parseLong(valueownerAccountId);
        } else {
            ownerAccountId = null;
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        return imp.getCryptoBalanceHttp(request, version, accountId, ownerAccountId, paymentMethodId);
    }

    @ApiAction
    public Result getPaymentMethod(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuepaymentMethodId = request.getQueryString("paymentMethodId");
        Long paymentMethodId;
        if (valuepaymentMethodId != null) {
            paymentMethodId = Long.parseLong(valuepaymentMethodId);
        } else {
            paymentMethodId = null;
        }
        String valuegetCurrentBalance = request.getQueryString("getCurrentBalance");
        Boolean getCurrentBalance;
        if (valuegetCurrentBalance != null) {
            getCurrentBalance = Boolean.valueOf(valuegetCurrentBalance);
        } else {
            getCurrentBalance = null;
        }
        return imp.getPaymentMethodHttp(request, version, accountId, paymentMethodId, getCurrentBalance);
    }

    @ApiAction
    public Result searchPaymentMethod(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueprovider = request.getQueryString("provider");
        String provider;
        if (valueprovider != null) {
            provider = valueprovider;
        } else {
            provider = "AUTHORIZE_NET";
        }
        String valuetype = request.getQueryString("type");
        String type;
        if (valuetype != null) {
            type = valuetype;
        } else {
            type = null;
        }
        String valuekeyword = request.getQueryString("keyword");
        String keyword;
        if (valuekeyword != null) {
            keyword = valuekeyword;
        } else {
            keyword = null;
        }
        String valuesortField = request.getQueryString("sortField");
        String sortField;
        if (valuesortField != null) {
            sortField = valuesortField;
        } else {
            sortField = "UPDATED";
        }
        String valuedescending = request.getQueryString("descending");
        Boolean descending;
        if (valuedescending != null) {
            descending = Boolean.valueOf(valuedescending);
        } else {
            descending = true;
        }
        String valuestart = request.getQueryString("start");
        Integer start;
        if (valuestart != null) {
            start = Integer.parseInt(valuestart);
        } else {
            start = 0;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 5;
        }
        return imp.searchPaymentMethodHttp(request, version, accountId, provider, type, keyword, sortField, descending, start, limit);
    }

}
