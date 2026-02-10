package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CellCarrier  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String uid;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String emailFormat;

  @ApiModelProperty(value = "")

  private String apiUrl;

  @ApiModelProperty(value = "")

  private String authUrl;

  @ApiModelProperty(value = "")

  private String shortCode;

  @ApiModelProperty(value = "")

  private String clientId;

  @ApiModelProperty(value = "")

  private String clientSecret;
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

  public CellCarrier id(Long id) {
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

  public CellCarrier active(Boolean active) {
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

  public CellCarrier valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get uid
   * @return uid
  **/
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public CellCarrier uid(String uid) {
    this.uid = uid;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public CellCarrier display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get emailFormat
   * @return emailFormat
  **/
  @JsonProperty("emailFormat")
  public String getEmailFormat() {
    return emailFormat;
  }

  public void setEmailFormat(String emailFormat) {
    this.emailFormat = emailFormat;
  }

  public CellCarrier emailFormat(String emailFormat) {
    this.emailFormat = emailFormat;
    return this;
  }

 /**
   * Get apiUrl
   * @return apiUrl
  **/
  @JsonProperty("apiUrl")
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public CellCarrier apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

 /**
   * Get authUrl
   * @return authUrl
  **/
  @JsonProperty("authUrl")
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public CellCarrier authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

 /**
   * Get shortCode
   * @return shortCode
  **/
  @JsonProperty("shortCode")
  public String getShortCode() {
    return shortCode;
  }

  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  public CellCarrier shortCode(String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

 /**
   * Get clientId
   * @return clientId
  **/
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CellCarrier clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

 /**
   * Get clientSecret
   * @return clientSecret
  **/
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CellCarrier clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

