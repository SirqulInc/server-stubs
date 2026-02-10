package apimodels;

import apimodels.Account;
import apimodels.ThirdPartyNetwork;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ThirdPartyCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ThirdPartyCredentials   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("account")
  @Valid

  private Account account;

  @JsonProperty("thirdPartyNetwork")
  @Valid

  private ThirdPartyNetwork thirdPartyNetwork;

  @JsonProperty("thirdPartyUID")
  
  private Long thirdPartyUID;

  @JsonProperty("thirdPartyId")
  
  private String thirdPartyId;

  @JsonProperty("thirdPartyToken")
  
  private String thirdPartyToken;

  @JsonProperty("thirdPartySecret")
  
  private String thirdPartySecret;

  @JsonProperty("thirdPartyName")
  
  private String thirdPartyName;

  @JsonProperty("thirdPartyUnencryptedToken")
  
  private String thirdPartyUnencryptedToken;

  public ThirdPartyCredentials id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ThirdPartyCredentials active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ThirdPartyCredentials valid(Boolean valid) {
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

  public ThirdPartyCredentials account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public ThirdPartyCredentials thirdPartyNetwork(ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
    return this;
  }

   /**
   * Get thirdPartyNetwork
   * @return thirdPartyNetwork
  **/
  public ThirdPartyNetwork getThirdPartyNetwork() {
    return thirdPartyNetwork;
  }

  public void setThirdPartyNetwork(ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
  }

  public ThirdPartyCredentials thirdPartyUID(Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
    return this;
  }

   /**
   * Get thirdPartyUID
   * @return thirdPartyUID
  **/
  public Long getThirdPartyUID() {
    return thirdPartyUID;
  }

  public void setThirdPartyUID(Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
  }

  public ThirdPartyCredentials thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

   /**
   * Get thirdPartyId
   * @return thirdPartyId
  **/
  public String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentials thirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
    return this;
  }

   /**
   * Get thirdPartyToken
   * @return thirdPartyToken
  **/
  public String getThirdPartyToken() {
    return thirdPartyToken;
  }

  public void setThirdPartyToken(String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
  }

  public ThirdPartyCredentials thirdPartySecret(String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
    return this;
  }

   /**
   * Get thirdPartySecret
   * @return thirdPartySecret
  **/
  public String getThirdPartySecret() {
    return thirdPartySecret;
  }

  public void setThirdPartySecret(String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
  }

  public ThirdPartyCredentials thirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

   /**
   * Get thirdPartyName
   * @return thirdPartyName
  **/
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentials thirdPartyUnencryptedToken(String thirdPartyUnencryptedToken) {
    this.thirdPartyUnencryptedToken = thirdPartyUnencryptedToken;
    return this;
  }

   /**
   * Get thirdPartyUnencryptedToken
   * @return thirdPartyUnencryptedToken
  **/
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
    return Objects.equals(id, thirdPartyCredentials.id) &&
        Objects.equals(active, thirdPartyCredentials.active) &&
        Objects.equals(valid, thirdPartyCredentials.valid) &&
        Objects.equals(account, thirdPartyCredentials.account) &&
        Objects.equals(thirdPartyNetwork, thirdPartyCredentials.thirdPartyNetwork) &&
        Objects.equals(thirdPartyUID, thirdPartyCredentials.thirdPartyUID) &&
        Objects.equals(thirdPartyId, thirdPartyCredentials.thirdPartyId) &&
        Objects.equals(thirdPartyToken, thirdPartyCredentials.thirdPartyToken) &&
        Objects.equals(thirdPartySecret, thirdPartyCredentials.thirdPartySecret) &&
        Objects.equals(thirdPartyName, thirdPartyCredentials.thirdPartyName) &&
        Objects.equals(thirdPartyUnencryptedToken, thirdPartyCredentials.thirdPartyUnencryptedToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, account, thirdPartyNetwork, thirdPartyUID, thirdPartyId, thirdPartyToken, thirdPartySecret, thirdPartyName, thirdPartyUnencryptedToken);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

