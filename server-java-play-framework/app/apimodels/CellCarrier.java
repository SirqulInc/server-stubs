package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CellCarrier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CellCarrier   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("uid")
  
  private String uid;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("emailFormat")
  
  private String emailFormat;

  @JsonProperty("apiUrl")
  
  private String apiUrl;

  @JsonProperty("authUrl")
  
  private String authUrl;

  @JsonProperty("shortCode")
  
  private String shortCode;

  @JsonProperty("clientId")
  
  private String clientId;

  @JsonProperty("clientSecret")
  
  private String clientSecret;

  public CellCarrier id(Long id) {
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

  public CellCarrier active(Boolean active) {
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

  public CellCarrier valid(Boolean valid) {
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

  public CellCarrier uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public CellCarrier display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public CellCarrier emailFormat(String emailFormat) {
    this.emailFormat = emailFormat;
    return this;
  }

   /**
   * Get emailFormat
   * @return emailFormat
  **/
  public String getEmailFormat() {
    return emailFormat;
  }

  public void setEmailFormat(String emailFormat) {
    this.emailFormat = emailFormat;
  }

  public CellCarrier apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public CellCarrier authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public CellCarrier shortCode(String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  public String getShortCode() {
    return shortCode;
  }

  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  public CellCarrier clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CellCarrier clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
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
    return Objects.equals(id, cellCarrier.id) &&
        Objects.equals(active, cellCarrier.active) &&
        Objects.equals(valid, cellCarrier.valid) &&
        Objects.equals(uid, cellCarrier.uid) &&
        Objects.equals(display, cellCarrier.display) &&
        Objects.equals(emailFormat, cellCarrier.emailFormat) &&
        Objects.equals(apiUrl, cellCarrier.apiUrl) &&
        Objects.equals(authUrl, cellCarrier.authUrl) &&
        Objects.equals(shortCode, cellCarrier.shortCode) &&
        Objects.equals(clientId, cellCarrier.clientId) &&
        Objects.equals(clientSecret, cellCarrier.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, uid, display, emailFormat, apiUrl, authUrl, shortCode, clientId, clientSecret);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

