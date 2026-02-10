package apimodels;

import apimodels.AccountShortResponse;
import apimodels.NameStringValueResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PaymentTypesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PaymentTypesResponse   {
  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("message")
  
  private String message;

  @JsonProperty("version")
  
  private Double version;

  @JsonProperty("serializeNulls")
  
  private Boolean serializeNulls;

  @JsonProperty("startTimeLog")
  
  private Long startTimeLog;

  @JsonProperty("errorCode")
  
  private String errorCode;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  @JsonProperty("creditCardOnFile")
  
  private Boolean creditCardOnFile;

  @JsonProperty("creditCardNumber")
  
  private String creditCardNumber;

  @JsonProperty("creditCardExpirationMonth")
  
  private String creditCardExpirationMonth;

  @JsonProperty("creditCardExpirationYear")
  
  private String creditCardExpirationYear;

  @JsonProperty("pointsOnFile")
  
  private Boolean pointsOnFile;

  @JsonProperty("pointsAmount")
  
  private Double pointsAmount;

  @JsonProperty("account")
  @Valid

  private AccountShortResponse account;

  @JsonProperty("firstName")
  
  private String firstName;

  @JsonProperty("lastName")
  
  private String lastName;

  @JsonProperty("address")
  
  private String address;

  @JsonProperty("city")
  
  private String city;

  @JsonProperty("state")
  
  private String state;

  @JsonProperty("postalCode")
  
  private String postalCode;

  @JsonProperty("phone")
  
  private String phone;

  @JsonProperty("provider")
  
  private String provider;

  @JsonProperty("paymentMethodId")
  
  private Long paymentMethodId;

  @JsonProperty("validated")
  
  private Boolean validated;

  @JsonProperty("accountNumber")
  
  private String accountNumber;

  @JsonProperty("bankName")
  
  private String bankName;

  @JsonProperty("routingNumber")
  
  private String routingNumber;

  @JsonProperty("isDefaultPaymentMethod")
  
  private Boolean isDefaultPaymentMethod;

  @JsonProperty("accountName")
  
  private String accountName;

  @JsonProperty("paymentMethodNickname")
  
  private String paymentMethodNickname;

  @JsonProperty("taxId")
  
  private String taxId;

  @JsonProperty("returning")
  
  private String returning;

  public PaymentTypesResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentTypesResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PaymentTypesResponse version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public PaymentTypesResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

   /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public PaymentTypesResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

   /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public PaymentTypesResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
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
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public PaymentTypesResponse creditCardOnFile(Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
    return this;
  }

   /**
   * Get creditCardOnFile
   * @return creditCardOnFile
  **/
  public Boolean getCreditCardOnFile() {
    return creditCardOnFile;
  }

  public void setCreditCardOnFile(Boolean creditCardOnFile) {
    this.creditCardOnFile = creditCardOnFile;
  }

  public PaymentTypesResponse creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

   /**
   * Get creditCardNumber
   * @return creditCardNumber
  **/
  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public PaymentTypesResponse creditCardExpirationMonth(String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
    return this;
  }

   /**
   * Get creditCardExpirationMonth
   * @return creditCardExpirationMonth
  **/
  public String getCreditCardExpirationMonth() {
    return creditCardExpirationMonth;
  }

  public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
    this.creditCardExpirationMonth = creditCardExpirationMonth;
  }

  public PaymentTypesResponse creditCardExpirationYear(String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
    return this;
  }

   /**
   * Get creditCardExpirationYear
   * @return creditCardExpirationYear
  **/
  public String getCreditCardExpirationYear() {
    return creditCardExpirationYear;
  }

  public void setCreditCardExpirationYear(String creditCardExpirationYear) {
    this.creditCardExpirationYear = creditCardExpirationYear;
  }

  public PaymentTypesResponse pointsOnFile(Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
    return this;
  }

   /**
   * Get pointsOnFile
   * @return pointsOnFile
  **/
  public Boolean getPointsOnFile() {
    return pointsOnFile;
  }

  public void setPointsOnFile(Boolean pointsOnFile) {
    this.pointsOnFile = pointsOnFile;
  }

  public PaymentTypesResponse pointsAmount(Double pointsAmount) {
    this.pointsAmount = pointsAmount;
    return this;
  }

   /**
   * Get pointsAmount
   * @return pointsAmount
  **/
  public Double getPointsAmount() {
    return pointsAmount;
  }

  public void setPointsAmount(Double pointsAmount) {
    this.pointsAmount = pointsAmount;
  }

  public PaymentTypesResponse account(AccountShortResponse account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public AccountShortResponse getAccount() {
    return account;
  }

  public void setAccount(AccountShortResponse account) {
    this.account = account;
  }

  public PaymentTypesResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentTypesResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaymentTypesResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PaymentTypesResponse city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PaymentTypesResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PaymentTypesResponse postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public PaymentTypesResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public PaymentTypesResponse provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public PaymentTypesResponse paymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  public Long getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Long paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public PaymentTypesResponse validated(Boolean validated) {
    this.validated = validated;
    return this;
  }

   /**
   * Get validated
   * @return validated
  **/
  public Boolean getValidated() {
    return validated;
  }

  public void setValidated(Boolean validated) {
    this.validated = validated;
  }

  public PaymentTypesResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PaymentTypesResponse bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public PaymentTypesResponse routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public PaymentTypesResponse isDefaultPaymentMethod(Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
    return this;
  }

   /**
   * Get isDefaultPaymentMethod
   * @return isDefaultPaymentMethod
  **/
  public Boolean getIsDefaultPaymentMethod() {
    return isDefaultPaymentMethod;
  }

  public void setIsDefaultPaymentMethod(Boolean isDefaultPaymentMethod) {
    this.isDefaultPaymentMethod = isDefaultPaymentMethod;
  }

  public PaymentTypesResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PaymentTypesResponse paymentMethodNickname(String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
    return this;
  }

   /**
   * Get paymentMethodNickname
   * @return paymentMethodNickname
  **/
  public String getPaymentMethodNickname() {
    return paymentMethodNickname;
  }

  public void setPaymentMethodNickname(String paymentMethodNickname) {
    this.paymentMethodNickname = paymentMethodNickname;
  }

  public PaymentTypesResponse taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public PaymentTypesResponse returning(String returning) {
    this.returning = returning;
    return this;
  }

   /**
   * Get returning
   * @return returning
  **/
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
    return Objects.equals(valid, paymentTypesResponse.valid) &&
        Objects.equals(message, paymentTypesResponse.message) &&
        Objects.equals(version, paymentTypesResponse.version) &&
        Objects.equals(serializeNulls, paymentTypesResponse.serializeNulls) &&
        Objects.equals(startTimeLog, paymentTypesResponse.startTimeLog) &&
        Objects.equals(errorCode, paymentTypesResponse.errorCode) &&
        Objects.equals(request, paymentTypesResponse.request) &&
        Objects.equals(creditCardOnFile, paymentTypesResponse.creditCardOnFile) &&
        Objects.equals(creditCardNumber, paymentTypesResponse.creditCardNumber) &&
        Objects.equals(creditCardExpirationMonth, paymentTypesResponse.creditCardExpirationMonth) &&
        Objects.equals(creditCardExpirationYear, paymentTypesResponse.creditCardExpirationYear) &&
        Objects.equals(pointsOnFile, paymentTypesResponse.pointsOnFile) &&
        Objects.equals(pointsAmount, paymentTypesResponse.pointsAmount) &&
        Objects.equals(account, paymentTypesResponse.account) &&
        Objects.equals(firstName, paymentTypesResponse.firstName) &&
        Objects.equals(lastName, paymentTypesResponse.lastName) &&
        Objects.equals(address, paymentTypesResponse.address) &&
        Objects.equals(city, paymentTypesResponse.city) &&
        Objects.equals(state, paymentTypesResponse.state) &&
        Objects.equals(postalCode, paymentTypesResponse.postalCode) &&
        Objects.equals(phone, paymentTypesResponse.phone) &&
        Objects.equals(provider, paymentTypesResponse.provider) &&
        Objects.equals(paymentMethodId, paymentTypesResponse.paymentMethodId) &&
        Objects.equals(validated, paymentTypesResponse.validated) &&
        Objects.equals(accountNumber, paymentTypesResponse.accountNumber) &&
        Objects.equals(bankName, paymentTypesResponse.bankName) &&
        Objects.equals(routingNumber, paymentTypesResponse.routingNumber) &&
        Objects.equals(isDefaultPaymentMethod, paymentTypesResponse.isDefaultPaymentMethod) &&
        Objects.equals(accountName, paymentTypesResponse.accountName) &&
        Objects.equals(paymentMethodNickname, paymentTypesResponse.paymentMethodNickname) &&
        Objects.equals(taxId, paymentTypesResponse.taxId) &&
        Objects.equals(returning, paymentTypesResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, creditCardOnFile, creditCardNumber, creditCardExpirationMonth, creditCardExpirationYear, pointsOnFile, pointsAmount, account, firstName, lastName, address, city, state, postalCode, phone, provider, paymentMethodId, validated, accountNumber, bankName, routingNumber, isDefaultPaymentMethod, accountName, paymentMethodNickname, taxId, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

