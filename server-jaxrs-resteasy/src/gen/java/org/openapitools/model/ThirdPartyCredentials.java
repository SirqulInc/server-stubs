package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Account;
import org.openapitools.model.ThirdPartyNetwork;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyCredentials   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account account;
  private ThirdPartyNetwork thirdPartyNetwork;
  private Long thirdPartyUID;
  private String thirdPartyId;
  private String thirdPartyToken;
  private String thirdPartySecret;
  private String thirdPartyName;
  private String thirdPartyUnencryptedToken;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

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
  @JsonProperty("account")
  @Valid
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyNetwork")
  @Valid
  public ThirdPartyNetwork getThirdPartyNetwork() {
    return thirdPartyNetwork;
  }
  public void setThirdPartyNetwork(ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyUID")
  public Long getThirdPartyUID() {
    return thirdPartyUID;
  }
  public void setThirdPartyUID(Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyId")
  public String getThirdPartyId() {
    return thirdPartyId;
  }
  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyToken")
  public String getThirdPartyToken() {
    return thirdPartyToken;
  }
  public void setThirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartySecret")
  public String getThirdPartySecret() {
    return thirdPartySecret;
  }
  public void setThirdPartySecret(String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyName")
  public String getThirdPartyName() {
    return thirdPartyName;
  }
  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyUnencryptedToken")
  public String getThirdPartyUnencryptedToken() {
    return thirdPartyUnencryptedToken;
  }
  public void setThirdPartyUnencryptedToken(String thirdPartyUnencryptedToken) {
    this.thirdPartyUnencryptedToken = thirdPartyUnencryptedToken;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

