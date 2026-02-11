package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PaymentTypesResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Boolean creditCardOnFile;
  private String creditCardNumber;
  private String creditCardExpirationMonth;
  private String creditCardExpirationYear;
  private Boolean pointsOnFile;
  private Double pointsAmount;
  private AccountShortResponse account;
  private String firstName;
  private String lastName;
  private String address;
  private String city;
  private String state;
  private String postalCode;
  private String phone;
  private String provider;
  private Long paymentMethodId;
  private Boolean validated;
  private String accountNumber;
  private String bankName;
  private String routingNumber;
  private Boolean isDefaultPaymentMethod;
  private String accountName;
  private String paymentMethodNickname;
  private String taxId;
  private String returning;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardOnFile")
  public Boolean getCreditCardOnFile() {
    return creditCardOnFile;
  }
  public void setCreditCardOnFile(Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardNumber")
  public String getCreditCardNumber() {
    return creditCardNumber;
  }
  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardExpirationMonth")
  public String getCreditCardExpirationMonth() {
    return creditCardExpirationMonth;
  }
  public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("creditCardExpirationYear")
  public String getCreditCardExpirationYear() {
    return creditCardExpirationYear;
  }
  public void setCreditCardExpirationYear(String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pointsOnFile")
  public Boolean getPointsOnFile() {
    return pointsOnFile;
  }
  public void setPointsOnFile(Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pointsAmount")
  public Double getPointsAmount() {
    return pointsAmount;
  }
  public void setPointsAmount(Double pointsAmount) {
    this.pointsAmount = pointsAmount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  @Valid
  public AccountShortResponse getAccount() {
    return account;
  }
  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethodId")
  public Long getPaymentMethodId() {
    return paymentMethodId;
  }
  public void setPaymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("validated")
  public Boolean getValidated() {
    return validated;
  }
  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bankName")
  public String getBankName() {
    return bankName;
  }
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("routingNumber")
  public String getRoutingNumber() {
    return routingNumber;
  }
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isDefaultPaymentMethod")
  public Boolean getIsDefaultPaymentMethod() {
    return isDefaultPaymentMethod;
  }
  public void setIsDefaultPaymentMethod(Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("paymentMethodNickname")
  public String getPaymentMethodNickname() {
    return paymentMethodNickname;
  }
  public void setPaymentMethodNickname(String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("taxId")
  public String getTaxId() {
    return taxId;
  }
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }
  public void setReturning(String returning) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

