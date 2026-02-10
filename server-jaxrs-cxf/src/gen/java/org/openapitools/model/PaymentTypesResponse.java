package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentTypesResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Boolean creditCardOnFile;

  @ApiModelProperty(value = "")

  private String creditCardNumber;

  @ApiModelProperty(value = "")

  private String creditCardExpirationMonth;

  @ApiModelProperty(value = "")

  private String creditCardExpirationYear;

  @ApiModelProperty(value = "")

  private Boolean pointsOnFile;

  @ApiModelProperty(value = "")

  private Double pointsAmount;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse account;

  @ApiModelProperty(value = "")

  private String firstName;

  @ApiModelProperty(value = "")

  private String lastName;

  @ApiModelProperty(value = "")

  private String address;

  @ApiModelProperty(value = "")

  private String city;

  @ApiModelProperty(value = "")

  private String state;

  @ApiModelProperty(value = "")

  private String postalCode;

  @ApiModelProperty(value = "")

  private String phone;

  @ApiModelProperty(value = "")

  private String provider;

  @ApiModelProperty(value = "")

  private Long paymentMethodId;

  @ApiModelProperty(value = "")

  private Boolean validated;

  @ApiModelProperty(value = "")

  private String accountNumber;

  @ApiModelProperty(value = "")

  private String bankName;

  @ApiModelProperty(value = "")

  private String routingNumber;

  @ApiModelProperty(value = "")

  private Boolean isDefaultPaymentMethod;

  @ApiModelProperty(value = "")

  private String accountName;

  @ApiModelProperty(value = "")

  private String paymentMethodNickname;

  @ApiModelProperty(value = "")

  private String taxId;

  @ApiModelProperty(value = "")

  private String returning;
 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentTypesResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PaymentTypesResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PaymentTypesResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTypesResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTypesResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public PaymentTypesResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTypesResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public PaymentTypesResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get creditCardOnFile
   * @return creditCardOnFile
  **/
  @JsonProperty("creditCardOnFile")
  public Boolean getCreditCardOnFile() {
    return creditCardOnFile;
  }

  public void setCreditCardOnFile(Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
  }

  public PaymentTypesResponse creditCardOnFile(Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
    return this;
  }

 /**
   * Get creditCardNumber
   * @return creditCardNumber
  **/
  @JsonProperty("creditCardNumber")
  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public PaymentTypesResponse creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

 /**
   * Get creditCardExpirationMonth
   * @return creditCardExpirationMonth
  **/
  @JsonProperty("creditCardExpirationMonth")
  public String getCreditCardExpirationMonth() {
    return creditCardExpirationMonth;
  }

  public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
  }

  public PaymentTypesResponse creditCardExpirationMonth(String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
    return this;
  }

 /**
   * Get creditCardExpirationYear
   * @return creditCardExpirationYear
  **/
  @JsonProperty("creditCardExpirationYear")
  public String getCreditCardExpirationYear() {
    return creditCardExpirationYear;
  }

  public void setCreditCardExpirationYear(String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
  }

  public PaymentTypesResponse creditCardExpirationYear(String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
    return this;
  }

 /**
   * Get pointsOnFile
   * @return pointsOnFile
  **/
  @JsonProperty("pointsOnFile")
  public Boolean getPointsOnFile() {
    return pointsOnFile;
  }

  public void setPointsOnFile(Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
  }

  public PaymentTypesResponse pointsOnFile(Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
    return this;
  }

 /**
   * Get pointsAmount
   * @return pointsAmount
  **/
  @JsonProperty("pointsAmount")
  public Double getPointsAmount() {
    return pointsAmount;
  }

  public void setPointsAmount(Double pointsAmount) {
    this.pointsAmount = pointsAmount;
  }

  public PaymentTypesResponse pointsAmount(Double pointsAmount) {
    this.pointsAmount = pointsAmount;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  public PaymentTypesResponse account(AccountShortResponse account) {
    this.account = account;
    return this;
  }

 /**
   * Get firstName
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentTypesResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Get lastName
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaymentTypesResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PaymentTypesResponse address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Get city
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PaymentTypesResponse city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PaymentTypesResponse state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get postalCode
   * @return postalCode
  **/
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PaymentTypesResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Get phone
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public PaymentTypesResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

 /**
   * Get provider
   * @return provider
  **/
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public PaymentTypesResponse provider(String provider) {
    this.provider = provider;
    return this;
  }

 /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  @JsonProperty("paymentMethodId")
  public Long getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public PaymentTypesResponse paymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

 /**
   * Get validated
   * @return validated
  **/
  @JsonProperty("validated")
  public Boolean getValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public PaymentTypesResponse validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

 /**
   * Get accountNumber
   * @return accountNumber
  **/
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PaymentTypesResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

 /**
   * Get bankName
   * @return bankName
  **/
  @JsonProperty("bankName")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PaymentTypesResponse bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

 /**
   * Get routingNumber
   * @return routingNumber
  **/
  @JsonProperty("routingNumber")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public PaymentTypesResponse routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

 /**
   * Get isDefaultPaymentMethod
   * @return isDefaultPaymentMethod
  **/
  @JsonProperty("isDefaultPaymentMethod")
  public Boolean getIsDefaultPaymentMethod() {
    return isDefaultPaymentMethod;
  }

  public void setIsDefaultPaymentMethod(Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
  }

  public PaymentTypesResponse isDefaultPaymentMethod(Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
    return this;
  }

 /**
   * Get accountName
   * @return accountName
  **/
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PaymentTypesResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

 /**
   * Get paymentMethodNickname
   * @return paymentMethodNickname
  **/
  @JsonProperty("paymentMethodNickname")
  public String getPaymentMethodNickname() {
    return paymentMethodNickname;
  }

  public void setPaymentMethodNickname(String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
  }

  public PaymentTypesResponse paymentMethodNickname(String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
    return this;
  }

 /**
   * Get taxId
   * @return taxId
  **/
  @JsonProperty("taxId")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public PaymentTypesResponse taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public PaymentTypesResponse returning(String returning) {
    this.returning = returning;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

