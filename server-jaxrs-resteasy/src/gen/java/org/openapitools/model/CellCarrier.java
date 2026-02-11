package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CellCarrier   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String uid;
  private String display;
  private String emailFormat;
  private String apiUrl;
  private String authUrl;
  private String shortCode;
  private String clientId;
  private String clientSecret;

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
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailFormat")
  public String getEmailFormat() {
    return emailFormat;
  }
  public void setEmailFormat(String emailFormat) {
    this.emailFormat = emailFormat;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("apiUrl")
  public String getApiUrl() {
    return apiUrl;
  }
  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("authUrl")
  public String getAuthUrl() {
    return authUrl;
  }
  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shortCode")
  public String getShortCode() {
    return shortCode;
  }
  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

