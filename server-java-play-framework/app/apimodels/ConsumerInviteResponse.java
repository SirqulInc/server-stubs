package apimodels;

import apimodels.AccountShortResponse;
import apimodels.AlbumResponse;
import apimodels.ApplicationShortResponse;
import apimodels.ConnectionResponse;
import apimodels.NameStringValueResponse;
import apimodels.OfferShortResponse;
import apimodels.RetailerLocationResponse;
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
 * ConsumerInviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConsumerInviteResponse   {
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

  @JsonProperty("inviterId")
  
  private Long inviterId;

  @JsonProperty("inviter")
  @Valid

  private AccountShortResponse inviter;

  @JsonProperty("connection")
  @Valid

  private ConnectionResponse connection;

  @JsonProperty("inviteText")
  
  private String inviteText;

  @JsonProperty("token")
  
  private String token;

  @JsonProperty("albumCoverUrl")
  
  private String albumCoverUrl;

  @JsonProperty("albumTitle")
  
  private String albumTitle;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("welcomeText")
  
  private String welcomeText;

  @JsonProperty("application")
  @Valid

  private ApplicationShortResponse application;

  @JsonProperty("retailerLocation")
  @Valid

  private RetailerLocationResponse retailerLocation;

  @JsonProperty("offer")
  @Valid

  private OfferShortResponse offer;

  @JsonProperty("album")
  @Valid

  private AlbumResponse album;

  @JsonProperty("returning")
  
  private String returning;

  public ConsumerInviteResponse valid(Boolean valid) {
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

  public ConsumerInviteResponse message(String message) {
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

  public ConsumerInviteResponse version(Double version) {
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

  public ConsumerInviteResponse serializeNulls(Boolean serializeNulls) {
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

  public ConsumerInviteResponse startTimeLog(Long startTimeLog) {
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

  public ConsumerInviteResponse errorCode(String errorCode) {
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

  public ConsumerInviteResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConsumerInviteResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ConsumerInviteResponse inviterId(Long inviterId) {
    this.inviterId = inviterId;
    return this;
  }

   /**
   * Get inviterId
   * @return inviterId
  **/
  public Long getInviterId() {
    return inviterId;
  }

  public void setInviterId(Long inviterId) {
    this.inviterId = inviterId;
  }

  public ConsumerInviteResponse inviter(AccountShortResponse inviter) {
    this.inviter = inviter;
    return this;
  }

   /**
   * Get inviter
   * @return inviter
  **/
  public AccountShortResponse getInviter() {
    return inviter;
  }

  public void setInviter(AccountShortResponse inviter) {
    this.inviter = inviter;
  }

  public ConsumerInviteResponse connection(ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  public ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  public ConsumerInviteResponse inviteText(String inviteText) {
    this.inviteText = inviteText;
    return this;
  }

   /**
   * Get inviteText
   * @return inviteText
  **/
  public String getInviteText() {
    return inviteText;
  }

  public void setInviteText(String inviteText) {
    this.inviteText = inviteText;
  }

  public ConsumerInviteResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ConsumerInviteResponse albumCoverUrl(String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
    return this;
  }

   /**
   * Get albumCoverUrl
   * @return albumCoverUrl
  **/
  public String getAlbumCoverUrl() {
    return albumCoverUrl;
  }

  public void setAlbumCoverUrl(String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
  }

  public ConsumerInviteResponse albumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
    return this;
  }

   /**
   * Get albumTitle
   * @return albumTitle
  **/
  public String getAlbumTitle() {
    return albumTitle;
  }

  public void setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public ConsumerInviteResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConsumerInviteResponse welcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
    return this;
  }

   /**
   * Get welcomeText
   * @return welcomeText
  **/
  public String getWelcomeText() {
    return welcomeText;
  }

  public void setWelcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
  }

  public ConsumerInviteResponse application(ApplicationShortResponse application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  public ConsumerInviteResponse retailerLocation(RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

   /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  public RetailerLocationResponse getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public ConsumerInviteResponse offer(OfferShortResponse offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  public OfferShortResponse getOffer() {
    return offer;
  }

  public void setOffer(OfferShortResponse offer) {
    this.offer = offer;
  }

  public ConsumerInviteResponse album(AlbumResponse album) {
    this.album = album;
    return this;
  }

   /**
   * Get album
   * @return album
  **/
  public AlbumResponse getAlbum() {
    return album;
  }

  public void setAlbum(AlbumResponse album) {
    this.album = album;
  }

  public ConsumerInviteResponse returning(String returning) {
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
    ConsumerInviteResponse consumerInviteResponse = (ConsumerInviteResponse) o;
    return Objects.equals(valid, consumerInviteResponse.valid) &&
        Objects.equals(message, consumerInviteResponse.message) &&
        Objects.equals(version, consumerInviteResponse.version) &&
        Objects.equals(serializeNulls, consumerInviteResponse.serializeNulls) &&
        Objects.equals(startTimeLog, consumerInviteResponse.startTimeLog) &&
        Objects.equals(errorCode, consumerInviteResponse.errorCode) &&
        Objects.equals(request, consumerInviteResponse.request) &&
        Objects.equals(inviterId, consumerInviteResponse.inviterId) &&
        Objects.equals(inviter, consumerInviteResponse.inviter) &&
        Objects.equals(connection, consumerInviteResponse.connection) &&
        Objects.equals(inviteText, consumerInviteResponse.inviteText) &&
        Objects.equals(token, consumerInviteResponse.token) &&
        Objects.equals(albumCoverUrl, consumerInviteResponse.albumCoverUrl) &&
        Objects.equals(albumTitle, consumerInviteResponse.albumTitle) &&
        Objects.equals(appName, consumerInviteResponse.appName) &&
        Objects.equals(welcomeText, consumerInviteResponse.welcomeText) &&
        Objects.equals(application, consumerInviteResponse.application) &&
        Objects.equals(retailerLocation, consumerInviteResponse.retailerLocation) &&
        Objects.equals(offer, consumerInviteResponse.offer) &&
        Objects.equals(album, consumerInviteResponse.album) &&
        Objects.equals(returning, consumerInviteResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, inviterId, inviter, connection, inviteText, token, albumCoverUrl, albumTitle, appName, welcomeText, application, retailerLocation, offer, album, returning);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerInviteResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    inviterId: ").append(toIndentedString(inviterId)).append("\n");
    sb.append("    inviter: ").append(toIndentedString(inviter)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    inviteText: ").append(toIndentedString(inviteText)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    albumCoverUrl: ").append(toIndentedString(albumCoverUrl)).append("\n");
    sb.append("    albumTitle: ").append(toIndentedString(albumTitle)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    welcomeText: ").append(toIndentedString(welcomeText)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    retailerLocation: ").append(toIndentedString(retailerLocation)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    album: ").append(toIndentedString(album)).append("\n");
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

