package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountMiniResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AccountMiniResponse {

  private @Nullable Long accountId;

  private @Nullable String locationDisplay;

  private @Nullable String display;

  private @Nullable String username;

  private @Nullable String accountType;

  public AccountMiniResponse accountId(@Nullable Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  
  @Schema(name = "accountId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public @Nullable Long getAccountId() {
    return accountId;
  }

  public void setAccountId(@Nullable Long accountId) {
    this.accountId = accountId;
  }

  public AccountMiniResponse locationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
    return this;
  }

  /**
   * Get locationDisplay
   * @return locationDisplay
   */
  
  @Schema(name = "locationDisplay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationDisplay")
  public @Nullable String getLocationDisplay() {
    return locationDisplay;
  }

  public void setLocationDisplay(@Nullable String locationDisplay) {
    this.locationDisplay = locationDisplay;
  }

  public AccountMiniResponse display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public AccountMiniResponse username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public AccountMiniResponse accountType(@Nullable String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  
  @Schema(name = "accountType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountType")
  public @Nullable String getAccountType() {
    return accountType;
  }

  public void setAccountType(@Nullable String accountType) {
    this.accountType = accountType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMiniResponse accountMiniResponse = (AccountMiniResponse) o;
    return Objects.equals(this.accountId, accountMiniResponse.accountId) &&
        Objects.equals(this.locationDisplay, accountMiniResponse.locationDisplay) &&
        Objects.equals(this.display, accountMiniResponse.display) &&
        Objects.equals(this.username, accountMiniResponse.username) &&
        Objects.equals(this.accountType, accountMiniResponse.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, locationDisplay, display, username, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMiniResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    locationDisplay: ").append(toIndentedString(locationDisplay)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

