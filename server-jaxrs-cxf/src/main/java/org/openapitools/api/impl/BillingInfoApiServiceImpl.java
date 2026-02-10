package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.PaymentTypesResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class BillingInfoApiServiceImpl implements BillingInfoApi {
    /**
     * Update Payment Method
     *
     * Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.
     *
     */
    public PaymentTypesResponse addPaymentMethod(BigDecimal version, Long accountId, Long paymentMethodId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, Boolean defaultPaymentMethod, String paymentMethodNickname, String taxId, String providerCustomerProfileId, String providerPaymentProfileId, String metaData) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Payment Method
     *
     * Add a new method of payment.
     *
     */
    public PaymentTypesResponse createPaymentMethod(BigDecimal version, Long accountId, String accountName, String firstName, String lastName, String address, String city, String state, String postalCode, String country, String phone, String creditCardNumber, String expirationDate, String ccv, String accountNumber, String bankName, String routingNumber, String paymentMethodNickname, String taxId, Boolean defaultPaymentMethod, String authToken, String provider, String providerCustomerProfileId, String providerPaymentProfileId, String metaData, String appKey) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Smart Contract
     *
     * Adds a smart contract.
     *
     */
    public PaymentTypesResponse createSmartContract(BigDecimal version, Long accountId, String tokenName, String tokenSymbol, Long paymentMethodId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Crypto Balances
     *
     * Get the cypto balance details for a user
     *
     */
    public PaymentTypesResponse getCryptoBalance(BigDecimal version, Long accountId, Long ownerAccountId, Long paymentMethodId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Payment Method
     *
     * Get the details of the user&#39;s payment method or their current default method of payment
     *
     */
    public PaymentTypesResponse getPaymentMethod(BigDecimal version, Long accountId, Long paymentMethodId, Boolean getCurrentBalance) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Payment Methods
     *
     * Search the payment methods of an account
     *
     */
    public PaymentTypesResponse searchPaymentMethod(BigDecimal version, Long accountId, String provider, String type, String keyword, String sortField, Boolean descending, Integer start, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
