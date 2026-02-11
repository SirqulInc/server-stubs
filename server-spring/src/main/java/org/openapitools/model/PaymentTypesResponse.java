package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentTypesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentTypesResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Boolean creditCardOnFile;

  private @Nullable String creditCardNumber;

  private @Nullable String creditCardExpirationMonth;

  private @Nullable String creditCardExpirationYear;

  private @Nullable Boolean pointsOnFile;

  private @Nullable Double pointsAmount;

  private @Nullable AccountShortResponse account;

  private @Nullable String firstName;

  private @Nullable String lastName;

  private @Nullable String address;

  private @Nullable String city;

  private @Nullable String state;

  private @Nullable String postalCode;

  private @Nullable String phone;

  private @Nullable String provider;

  private @Nullable Long paymentMethodId;

  private @Nullable Boolean validated;

  private @Nullable String accountNumber;

  private @Nullable String bankName;

  private @Nullable String routingNumber;

  private @Nullable Boolean isDefaultPaymentMethod;

  private @Nullable String accountName;

  private @Nullable String paymentMethodNickname;

  private @Nullable String taxId;

  private @Nullable String returning;

  public PaymentTypesResponse valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public PaymentTypesResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public PaymentTypesResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public PaymentTypesResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTypesResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTypesResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
  }

  public PaymentTypesResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PaymentTypesResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

  /**
   * Get request
   * @return request
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTypesResponse creditCardOnFile(@Nullable Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
    return this;
  }

  /**
   * Get creditCardOnFile
   * @return creditCardOnFile
   */
  
  @Schema(name = "creditCardOnFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCardOnFile")
  public @Nullable Boolean getCreditCardOnFile() {
    return creditCardOnFile;
  }

  public void setCreditCardOnFile(@Nullable Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
  }

  public PaymentTypesResponse creditCardNumber(@Nullable String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  /**
   * Get creditCardNumber
   * @return creditCardNumber
   */
  
  @Schema(name = "creditCardNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCardNumber")
  public @Nullable String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(@Nullable String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public PaymentTypesResponse creditCardExpirationMonth(@Nullable String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
    return this;
  }

  /**
   * Get creditCardExpirationMonth
   * @return creditCardExpirationMonth
   */
  
  @Schema(name = "creditCardExpirationMonth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCardExpirationMonth")
  public @Nullable String getCreditCardExpirationMonth() {
    return creditCardExpirationMonth;
  }

  public void setCreditCardExpirationMonth(@Nullable String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
  }

  public PaymentTypesResponse creditCardExpirationYear(@Nullable String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
    return this;
  }

  /**
   * Get creditCardExpirationYear
   * @return creditCardExpirationYear
   */
  
  @Schema(name = "creditCardExpirationYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditCardExpirationYear")
  public @Nullable String getCreditCardExpirationYear() {
    return creditCardExpirationYear;
  }

  public void setCreditCardExpirationYear(@Nullable String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
  }

  public PaymentTypesResponse pointsOnFile(@Nullable Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
    return this;
  }

  /**
   * Get pointsOnFile
   * @return pointsOnFile
   */
  
  @Schema(name = "pointsOnFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsOnFile")
  public @Nullable Boolean getPointsOnFile() {
    return pointsOnFile;
  }

  public void setPointsOnFile(@Nullable Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
  }

  public PaymentTypesResponse pointsAmount(@Nullable Double pointsAmount) {
    this.pointsAmount = pointsAmount;
    return this;
  }

  /**
   * Get pointsAmount
   * @return pointsAmount
   */
  
  @Schema(name = "pointsAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsAmount")
  public @Nullable Double getPointsAmount() {
    return pointsAmount;
  }

  public void setPointsAmount(@Nullable Double pointsAmount) {
    this.pointsAmount = pointsAmount;
  }

  public PaymentTypesResponse account(@Nullable AccountShortResponse account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public @Nullable AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(@Nullable AccountShortResponse account) {
    this.account = account;
  }

  public PaymentTypesResponse firstName(@Nullable String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public @Nullable String getFirstName() {
    return firstName;
  }

  public void setFirstName(@Nullable String firstName) {
    this.firstName = firstName;
  }

  public PaymentTypesResponse lastName(@Nullable String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public @Nullable String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  public PaymentTypesResponse address(@Nullable String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable String getAddress() {
    return address;
  }

  public void setAddress(@Nullable String address) {
    this.address = address;
  }

  public PaymentTypesResponse city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public PaymentTypesResponse state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable String getState() {
    return state;
  }

  public void setState(@Nullable String state) {
    this.state = state;
  }

  public PaymentTypesResponse postalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */
  
  @Schema(name = "postalCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public @Nullable String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@Nullable String postalCode) {
    this.postalCode = postalCode;
  }

  public PaymentTypesResponse phone(@Nullable String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public @Nullable String getPhone() {
    return phone;
  }

  public void setPhone(@Nullable String phone) {
    this.phone = phone;
  }

  public PaymentTypesResponse provider(@Nullable String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  
  @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public @Nullable String getProvider() {
    return provider;
  }

  public void setProvider(@Nullable String provider) {
    this.provider = provider;
  }

  public PaymentTypesResponse paymentMethodId(@Nullable Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * Get paymentMethodId
   * @return paymentMethodId
   */
  
  @Schema(name = "paymentMethodId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethodId")
  public @Nullable Long getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(@Nullable Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public PaymentTypesResponse validated(@Nullable Boolean validated) {
    this.validated = validated;
    return this;
  }

  /**
   * Get validated
   * @return validated
   */
  
  @Schema(name = "validated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validated")
  public @Nullable Boolean getValidated() {
    return validated;
  }

  public void setValidated(@Nullable Boolean validated) {
    this.validated = validated;
  }

  public PaymentTypesResponse accountNumber(@Nullable String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   */
  
  @Schema(name = "accountNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountNumber")
  public @Nullable String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(@Nullable String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PaymentTypesResponse bankName(@Nullable String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
   */
  
  @Schema(name = "bankName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankName")
  public @Nullable String getBankName() {
    return bankName;
  }

  public void setBankName(@Nullable String bankName) {
    this.bankName = bankName;
  }

  public PaymentTypesResponse routingNumber(@Nullable String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  /**
   * Get routingNumber
   * @return routingNumber
   */
  
  @Schema(name = "routingNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("routingNumber")
  public @Nullable String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(@Nullable String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public PaymentTypesResponse isDefaultPaymentMethod(@Nullable Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
    return this;
  }

  /**
   * Get isDefaultPaymentMethod
   * @return isDefaultPaymentMethod
   */
  
  @Schema(name = "isDefaultPaymentMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefaultPaymentMethod")
  public @Nullable Boolean getIsDefaultPaymentMethod() {
    return isDefaultPaymentMethod;
  }

  public void setIsDefaultPaymentMethod(@Nullable Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
  }

  public PaymentTypesResponse accountName(@Nullable String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   */
  
  @Schema(name = "accountName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountName")
  public @Nullable String getAccountName() {
    return accountName;
  }

  public void setAccountName(@Nullable String accountName) {
    this.accountName = accountName;
  }

  public PaymentTypesResponse paymentMethodNickname(@Nullable String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
    return this;
  }

  /**
   * Get paymentMethodNickname
   * @return paymentMethodNickname
   */
  
  @Schema(name = "paymentMethodNickname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentMethodNickname")
  public @Nullable String getPaymentMethodNickname() {
    return paymentMethodNickname;
  }

  public void setPaymentMethodNickname(@Nullable String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
  }

  public PaymentTypesResponse taxId(@Nullable String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
   */
  
  @Schema(name = "taxId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxId")
  public @Nullable String getTaxId() {
    return taxId;
  }

  public void setTaxId(@Nullable String taxId) {
    this.taxId = taxId;
  }

  public PaymentTypesResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
    this.returning = returning;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTypesResponse paymentTypesResponse = (PaymentTypesResponse) o;
    return Objects.equals(this.valid, paymentTypesResponse.valid) &&
        Objects.equals(this.message, paymentTypesResponse.message) &&
        Objects.equals(this.version, paymentTypesResponse.version) &&
        Objects.equals(this.serializeNulls, paymentTypesResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, paymentTypesResponse.startTimeLog) &&
        Objects.equals(this.errorCode, paymentTypesResponse.errorCode) &&
        Objects.equals(this.request, paymentTypesResponse.request) &&
        Objects.equals(this.creditCardOnFile, paymentTypesResponse.creditCardOnFile) &&
        Objects.equals(this.creditCardNumber, paymentTypesResponse.creditCardNumber) &&
        Objects.equals(this.creditCardExpirationMonth, paymentTypesResponse.creditCardExpirationMonth) &&
        Objects.equals(this.creditCardExpirationYear, paymentTypesResponse.creditCardExpirationYear) &&
        Objects.equals(this.pointsOnFile, paymentTypesResponse.pointsOnFile) &&
        Objects.equals(this.pointsAmount, paymentTypesResponse.pointsAmount) &&
        Objects.equals(this.account, paymentTypesResponse.account) &&
        Objects.equals(this.firstName, paymentTypesResponse.firstName) &&
        Objects.equals(this.lastName, paymentTypesResponse.lastName) &&
        Objects.equals(this.address, paymentTypesResponse.address) &&
        Objects.equals(this.city, paymentTypesResponse.city) &&
        Objects.equals(this.state, paymentTypesResponse.state) &&
        Objects.equals(this.postalCode, paymentTypesResponse.postalCode) &&
        Objects.equals(this.phone, paymentTypesResponse.phone) &&
        Objects.equals(this.provider, paymentTypesResponse.provider) &&
        Objects.equals(this.paymentMethodId, paymentTypesResponse.paymentMethodId) &&
        Objects.equals(this.validated, paymentTypesResponse.validated) &&
        Objects.equals(this.accountNumber, paymentTypesResponse.accountNumber) &&
        Objects.equals(this.bankName, paymentTypesResponse.bankName) &&
        Objects.equals(this.routingNumber, paymentTypesResponse.routingNumber) &&
        Objects.equals(this.isDefaultPaymentMethod, paymentTypesResponse.isDefaultPaymentMethod) &&
        Objects.equals(this.accountName, paymentTypesResponse.accountName) &&
        Objects.equals(this.paymentMethodNickname, paymentTypesResponse.paymentMethodNickname) &&
        Objects.equals(this.taxId, paymentTypesResponse.taxId) &&
        Objects.equals(this.returning, paymentTypesResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, creditCardOnFile, creditCardNumber, creditCardExpirationMonth, creditCardExpirationYear, pointsOnFile, pointsAmount, account, firstName, lastName, address, city, state, postalCode, phone, provider, paymentMethodId, validated, accountNumber, bankName, routingNumber, isDefaultPaymentMethod, accountName, paymentMethodNickname, taxId, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTypesResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    creditCardOnFile: ").append(toIndentedString(creditCardOnFile)).append("\n");
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    creditCardExpirationMonth: ").append(toIndentedString(creditCardExpirationMonth)).append("\n");
    sb.append("    creditCardExpirationYear: ").append(toIndentedString(creditCardExpirationYear)).append("\n");
    sb.append("    pointsOnFile: ").append(toIndentedString(pointsOnFile)).append("\n");
    sb.append("    pointsAmount: ").append(toIndentedString(pointsAmount)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    isDefaultPaymentMethod: ").append(toIndentedString(isDefaultPaymentMethod)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    paymentMethodNickname: ").append(toIndentedString(paymentMethodNickname)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    returning: ").append(toIndentedString(returning)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

