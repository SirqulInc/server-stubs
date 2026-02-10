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
 * CellCarrier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CellCarrier {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String uid;

  private @Nullable String display;

  private @Nullable String emailFormat;

  private @Nullable String apiUrl;

  private @Nullable String authUrl;

  private @Nullable String shortCode;

  private @Nullable String clientId;

  private @Nullable String clientSecret;

  public CellCarrier id(@Nullable Long id) {
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

  public CellCarrier active(@Nullable Boolean active) {
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

  public CellCarrier valid(@Nullable Boolean valid) {
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

  public CellCarrier uid(@Nullable String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Get uid
   * @return uid
   */
  
  @Schema(name = "uid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uid")
  public @Nullable String getUid() {
    return uid;
  }

  public void setUid(@Nullable String uid) {
    this.uid = uid;
  }

  public CellCarrier display(@Nullable String display) {
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

  public CellCarrier emailFormat(@Nullable String emailFormat) {
    this.emailFormat = emailFormat;
    return this;
  }

  /**
   * Get emailFormat
   * @return emailFormat
   */
  
  @Schema(name = "emailFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailFormat")
  public @Nullable String getEmailFormat() {
    return emailFormat;
  }

  public void setEmailFormat(@Nullable String emailFormat) {
    this.emailFormat = emailFormat;
  }

  public CellCarrier apiUrl(@Nullable String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

  /**
   * Get apiUrl
   * @return apiUrl
   */
  
  @Schema(name = "apiUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiUrl")
  public @Nullable String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(@Nullable String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public CellCarrier authUrl(@Nullable String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

  /**
   * Get authUrl
   * @return authUrl
   */
  
  @Schema(name = "authUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authUrl")
  public @Nullable String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(@Nullable String authUrl) {
    this.authUrl = authUrl;
  }

  public CellCarrier shortCode(@Nullable String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

  /**
   * Get shortCode
   * @return shortCode
   */
  
  @Schema(name = "shortCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortCode")
  public @Nullable String getShortCode() {
    return shortCode;
  }

  public void setShortCode(@Nullable String shortCode) {
    this.shortCode = shortCode;
  }

  public CellCarrier clientId(@Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  
  @Schema(name = "clientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientId")
  public @Nullable String getClientId() {
    return clientId;
  }

  public void setClientId(@Nullable String clientId) {
    this.clientId = clientId;
  }

  public CellCarrier clientSecret(@Nullable String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
   */
  
  @Schema(name = "clientSecret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientSecret")
  public @Nullable String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(@Nullable String clientSecret) {
    this.clientSecret = clientSecret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellCarrier cellCarrier = (CellCarrier) o;
    return Objects.equals(this.id, cellCarrier.id) &&
        Objects.equals(this.active, cellCarrier.active) &&
        Objects.equals(this.valid, cellCarrier.valid) &&
        Objects.equals(this.uid, cellCarrier.uid) &&
        Objects.equals(this.display, cellCarrier.display) &&
        Objects.equals(this.emailFormat, cellCarrier.emailFormat) &&
        Objects.equals(this.apiUrl, cellCarrier.apiUrl) &&
        Objects.equals(this.authUrl, cellCarrier.authUrl) &&
        Objects.equals(this.shortCode, cellCarrier.shortCode) &&
        Objects.equals(this.clientId, cellCarrier.clientId) &&
        Objects.equals(this.clientSecret, cellCarrier.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, uid, display, emailFormat, apiUrl, authUrl, shortCode, clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellCarrier {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    emailFormat: ").append(toIndentedString(emailFormat)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

