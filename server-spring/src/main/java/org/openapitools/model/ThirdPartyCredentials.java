package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Account;
import org.openapitools.model.ThirdPartyNetwork;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ThirdPartyCredentials
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyCredentials {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account account;

  private @Nullable ThirdPartyNetwork thirdPartyNetwork;

  private @Nullable Long thirdPartyUID;

  private @Nullable String thirdPartyId;

  private @Nullable String thirdPartyToken;

  private @Nullable String thirdPartySecret;

  private @Nullable String thirdPartyName;

  private @Nullable String thirdPartyUnencryptedToken;

  public ThirdPartyCredentials id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ThirdPartyCredentials active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ThirdPartyCredentials valid(@Nullable Boolean valid) {
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

  public ThirdPartyCredentials account(@Nullable Account account) {
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
  public @Nullable Account getAccount() {
    return account;
  }

  public void setAccount(@Nullable Account account) {
    this.account = account;
  }

  public ThirdPartyCredentials thirdPartyNetwork(@Nullable ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
    return this;
  }

  /**
   * Get thirdPartyNetwork
   * @return thirdPartyNetwork
   */
  @Valid 
  @Schema(name = "thirdPartyNetwork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyNetwork")
  public @Nullable ThirdPartyNetwork getThirdPartyNetwork() {
    return thirdPartyNetwork;
  }

  public void setThirdPartyNetwork(@Nullable ThirdPartyNetwork thirdPartyNetwork) {
    this.thirdPartyNetwork = thirdPartyNetwork;
  }

  public ThirdPartyCredentials thirdPartyUID(@Nullable Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
    return this;
  }

  /**
   * Get thirdPartyUID
   * @return thirdPartyUID
   */
  
  @Schema(name = "thirdPartyUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyUID")
  public @Nullable Long getThirdPartyUID() {
    return thirdPartyUID;
  }

  public void setThirdPartyUID(@Nullable Long thirdPartyUID) {
    this.thirdPartyUID = thirdPartyUID;
  }

  public ThirdPartyCredentials thirdPartyId(@Nullable String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  /**
   * Get thirdPartyId
   * @return thirdPartyId
   */
  
  @Schema(name = "thirdPartyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyId")
  public @Nullable String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(@Nullable String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentials thirdPartyToken(@Nullable String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
    return this;
  }

  /**
   * Get thirdPartyToken
   * @return thirdPartyToken
   */
  
  @Schema(name = "thirdPartyToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyToken")
  public @Nullable String getThirdPartyToken() {
    return thirdPartyToken;
  }

  public void setThirdPartyToken(@Nullable String thirdPartyToken) {
    this.thirdPartyToken = thirdPartyToken;
  }

  public ThirdPartyCredentials thirdPartySecret(@Nullable String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
    return this;
  }

  /**
   * Get thirdPartySecret
   * @return thirdPartySecret
   */
  
  @Schema(name = "thirdPartySecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartySecret")
  public @Nullable String getThirdPartySecret() {
    return thirdPartySecret;
  }

  public void setThirdPartySecret(@Nullable String thirdPartySecret) {
    this.thirdPartySecret = thirdPartySecret;
  }

  public ThirdPartyCredentials thirdPartyName(@Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

  /**
   * Get thirdPartyName
   * @return thirdPartyName
   */
  
  @Schema(name = "thirdPartyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyName")
  public @Nullable String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(@Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentials thirdPartyUnencryptedToken(@Nullable String thirdPartyUnencryptedToken) {
    this.thirdPartyUnencryptedToken = thirdPartyUnencryptedToken;
    return this;
  }

  /**
   * Get thirdPartyUnencryptedToken
   * @return thirdPartyUnencryptedToken
   */
  
  @Schema(name = "thirdPartyUnencryptedToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyUnencryptedToken")
  public @Nullable String getThirdPartyUnencryptedToken() {
    return thirdPartyUnencryptedToken;
  }

  public void setThirdPartyUnencryptedToken(@Nullable String thirdPartyUnencryptedToken) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

