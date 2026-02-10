package org.openapitools.model;

import org.openapitools.model.Account;
import org.openapitools.model.ThirdPartyNetwork;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThirdPartyCredentials  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account account;

  @ApiModelProperty(value = "")

  @Valid

  private ThirdPartyNetwork thirdPartyNetwork;

  @ApiModelProperty(value = "")

  private Long thirdPartyUID;

  @ApiModelProperty(value = "")

  private String thirdPartyId;

  @ApiModelProperty(value = "")

  private String thirdPartyToken;

  @ApiModelProperty(value = "")

  private String thirdPartySecret;

  @ApiModelProperty(value = "")

  private String thirdPartyName;

  @ApiModelProperty(value = "")

  private String thirdPartyUnencryptedToken;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ThirdPartyCredentials id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ThirdPartyCredentials active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public ThirdPartyCredentials valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public ThirdPartyCredentials account(Account account) {
    this.account = account;
    return this;
  }

 /**
   * Get thirdPartyNetwork
   * @return thirdPartyNetwork
  **/
  @JsonProperty("thirdPartyNetwork")
  public ThirdPartyNetwork getThirdPartyNetwork() {
    return thirdPartyNetwork;
  }

  public void setThirdPartyNetwork(ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
  }

  public ThirdPartyCredentials thirdPartyNetwork(ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
    return this;
  }

 /**
   * Get thirdPartyUID
   * @return thirdPartyUID
  **/
  @JsonProperty("thirdPartyUID")
  public Long getThirdPartyUID() {
    return thirdPartyUID;
  }

  public void setThirdPartyUID(Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
  }

  public ThirdPartyCredentials thirdPartyUID(Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
    return this;
  }

 /**
   * Get thirdPartyId
   * @return thirdPartyId
  **/
  @JsonProperty("thirdPartyId")
  public String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentials thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

 /**
   * Get thirdPartyToken
   * @return thirdPartyToken
  **/
  @JsonProperty("thirdPartyToken")
  public String getThirdPartyToken() {
    return thirdPartyToken;
  }

  public void setThirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
  }

  public ThirdPartyCredentials thirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
    return this;
  }

 /**
   * Get thirdPartySecret
   * @return thirdPartySecret
  **/
  @JsonProperty("thirdPartySecret")
  public String getThirdPartySecret() {
    return thirdPartySecret;
  }

  public void setThirdPartySecret(String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
  }

  public ThirdPartyCredentials thirdPartySecret(String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
    return this;
  }

 /**
   * Get thirdPartyName
   * @return thirdPartyName
  **/
  @JsonProperty("thirdPartyName")
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentials thirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

 /**
   * Get thirdPartyUnencryptedToken
   * @return thirdPartyUnencryptedToken
  **/
  @JsonProperty("thirdPartyUnencryptedToken")
  public String getThirdPartyUnencryptedToken() {
    return thirdPartyUnencryptedToken;
  }

  public void setThirdPartyUnencryptedToken(String thirdPartyUnencryptedToken) {
    this.thirdPartyUnencryptedToken = thirdPartyUnencryptedToken;
  }

  public ThirdPartyCredentials thirdPartyUnencryptedToken(String thirdPartyUnencryptedToken) {
    this.thirdPartyUnencryptedToken = thirdPartyUnencryptedToken;
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
    ThirdPartyCredentials thirdPartyCredentials = (ThirdPartyCredentials) o;
    return Objects.equals(this.id, thirdPartyCredentials.id) &&
        Objects.equals(this.active, thirdPartyCredentials.active) &&
        Objects.equals(this.valid, thirdPartyCredentials.valid) &&
        Objects.equals(this.account, thirdPartyCredentials.account) &&
        Objects.equals(this.thirdPartyNetwork, thirdPartyCredentials.thirdPartyNetwork) &&
        Objects.equals(this.thirdPartyUID, thirdPartyCredentials.thirdPartyUID) &&
        Objects.equals(this.thirdPartyId, thirdPartyCredentials.thirdPartyId) &&
        Objects.equals(this.thirdPartyToken, thirdPartyCredentials.thirdPartyToken) &&
        Objects.equals(this.thirdPartySecret, thirdPartyCredentials.thirdPartySecret) &&
        Objects.equals(this.thirdPartyName, thirdPartyCredentials.thirdPartyName) &&
        Objects.equals(this.thirdPartyUnencryptedToken, thirdPartyCredentials.thirdPartyUnencryptedToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, account, thirdPartyNetwork, thirdPartyUID, thirdPartyId, thirdPartyToken, thirdPartySecret, thirdPartyName, thirdPartyUnencryptedToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyCredentials {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    thirdPartyNetwork: ").append(toIndentedString(thirdPartyNetwork)).append("\n");
    sb.append("    thirdPartyUID: ").append(toIndentedString(thirdPartyUID)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    thirdPartyToken: ").append(toIndentedString(thirdPartyToken)).append("\n");
    sb.append("    thirdPartySecret: ").append(toIndentedString(thirdPartySecret)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
    sb.append("    thirdPartyUnencryptedToken: ").append(toIndentedString(thirdPartyUnencryptedToken)).append("\n");
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

