package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountShortResponse;
import org.openapitools.model.AlbumResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.RetailerLocationResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConsumerInviteResponse  {
  
  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Double version;

  @ApiModelProperty(value = "")

  private Boolean serializeNulls;

  @ApiModelProperty(value = "")

  private Long startTimeLog;

  @ApiModelProperty(value = "")

  private String errorCode;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long inviterId;

  @ApiModelProperty(value = "")

  @Valid

  private AccountShortResponse inviter;

  @ApiModelProperty(value = "")

  @Valid

  private ConnectionResponse connection;

  @ApiModelProperty(value = "")

  private String inviteText;

  @ApiModelProperty(value = "")

  private String token;

  @ApiModelProperty(value = "")

  private String albumCoverUrl;

  @ApiModelProperty(value = "")

  private String albumTitle;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private String welcomeText;

  @ApiModelProperty(value = "")

  @Valid

  private ApplicationShortResponse application;

  @ApiModelProperty(value = "")

  @Valid

  private RetailerLocationResponse retailerLocation;

  @ApiModelProperty(value = "")

  @Valid

  private OfferShortResponse offer;

  @ApiModelProperty(value = "")

  @Valid

  private AlbumResponse album;

  @ApiModelProperty(value = "")

  private String returning;
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

  public ConsumerInviteResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ConsumerInviteResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get version
   * @return version
  **/
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
    this.version = version;
  }

  public ConsumerInviteResponse version(Double version) {
    this.version = version;
    return this;
  }

 /**
   * Get serializeNulls
   * @return serializeNulls
  **/
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ConsumerInviteResponse serializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

 /**
   * Get startTimeLog
   * @return startTimeLog
  **/
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ConsumerInviteResponse startTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

 /**
   * Get errorCode
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ConsumerInviteResponse errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ConsumerInviteResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ConsumerInviteResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
    return this;
  }

 /**
   * Get inviterId
   * @return inviterId
  **/
  @JsonProperty("inviterId")
  public Long getInviterId() {
    return inviterId;
  }

  public void setInviterId(Long inviterId) {
    this.inviterId = inviterId;
  }

  public ConsumerInviteResponse inviterId(Long inviterId) {
    this.inviterId = inviterId;
    return this;
  }

 /**
   * Get inviter
   * @return inviter
  **/
  @JsonProperty("inviter")
  public AccountShortResponse getInviter() {
    return inviter;
  }

  public void setInviter(AccountShortResponse inviter) {
    this.inviter = inviter;
  }

  public ConsumerInviteResponse inviter(AccountShortResponse inviter) {
    this.inviter = inviter;
    return this;
  }

 /**
   * Get connection
   * @return connection
  **/
  @JsonProperty("connection")
  public ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  public ConsumerInviteResponse connection(ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Get inviteText
   * @return inviteText
  **/
  @JsonProperty("inviteText")
  public String getInviteText() {
    return inviteText;
  }

  public void setInviteText(String inviteText) {
    this.inviteText = inviteText;
  }

  public ConsumerInviteResponse inviteText(String inviteText) {
    this.inviteText = inviteText;
    return this;
  }

 /**
   * Get token
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ConsumerInviteResponse token(String token) {
    this.token = token;
    return this;
  }

 /**
   * Get albumCoverUrl
   * @return albumCoverUrl
  **/
  @JsonProperty("albumCoverUrl")
  public String getAlbumCoverUrl() {
    return albumCoverUrl;
  }

  public void setAlbumCoverUrl(String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
  }

  public ConsumerInviteResponse albumCoverUrl(String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
    return this;
  }

 /**
   * Get albumTitle
   * @return albumTitle
  **/
  @JsonProperty("albumTitle")
  public String getAlbumTitle() {
    return albumTitle;
  }

  public void setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public ConsumerInviteResponse albumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
    return this;
  }

 /**
   * Get appName
   * @return appName
  **/
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConsumerInviteResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get welcomeText
   * @return welcomeText
  **/
  @JsonProperty("welcomeText")
  public String getWelcomeText() {
    return welcomeText;
  }

  public void setWelcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
  }

  public ConsumerInviteResponse welcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  public ConsumerInviteResponse application(ApplicationShortResponse application) {
    this.application = application;
    return this;
  }

 /**
   * Get retailerLocation
   * @return retailerLocation
  **/
  @JsonProperty("retailerLocation")
  public RetailerLocationResponse getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public ConsumerInviteResponse retailerLocation(RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public OfferShortResponse getOffer() {
    return offer;
  }

  public void setOffer(OfferShortResponse offer) {
    this.offer = offer;
  }

  public ConsumerInviteResponse offer(OfferShortResponse offer) {
    this.offer = offer;
    return this;
  }

 /**
   * Get album
   * @return album
  **/
  @JsonProperty("album")
  public AlbumResponse getAlbum() {
    return album;
  }

  public void setAlbum(AlbumResponse album) {
    this.album = album;
  }

  public ConsumerInviteResponse album(AlbumResponse album) {
    this.album = album;
    return this;
  }

 /**
   * Get returning
   * @return returning
  **/
  @JsonProperty("returning")
  public String getReturning() {
    return returning;
  }

  public void setReturning(String returning) {
    this.returning = returning;
  }

  public ConsumerInviteResponse returning(String returning) {
    this.returning = returning;
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
    ConsumerInviteResponse consumerInviteResponse = (ConsumerInviteResponse) o;
    return Objects.equals(this.valid, consumerInviteResponse.valid) &&
        Objects.equals(this.message, consumerInviteResponse.message) &&
        Objects.equals(this.version, consumerInviteResponse.version) &&
        Objects.equals(this.serializeNulls, consumerInviteResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, consumerInviteResponse.startTimeLog) &&
        Objects.equals(this.errorCode, consumerInviteResponse.errorCode) &&
        Objects.equals(this.request, consumerInviteResponse.request) &&
        Objects.equals(this.inviterId, consumerInviteResponse.inviterId) &&
        Objects.equals(this.inviter, consumerInviteResponse.inviter) &&
        Objects.equals(this.connection, consumerInviteResponse.connection) &&
        Objects.equals(this.inviteText, consumerInviteResponse.inviteText) &&
        Objects.equals(this.token, consumerInviteResponse.token) &&
        Objects.equals(this.albumCoverUrl, consumerInviteResponse.albumCoverUrl) &&
        Objects.equals(this.albumTitle, consumerInviteResponse.albumTitle) &&
        Objects.equals(this.appName, consumerInviteResponse.appName) &&
        Objects.equals(this.welcomeText, consumerInviteResponse.welcomeText) &&
        Objects.equals(this.application, consumerInviteResponse.application) &&
        Objects.equals(this.retailerLocation, consumerInviteResponse.retailerLocation) &&
        Objects.equals(this.offer, consumerInviteResponse.offer) &&
        Objects.equals(this.album, consumerInviteResponse.album) &&
        Objects.equals(this.returning, consumerInviteResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, inviterId, inviter, connection, inviteText, token, albumCoverUrl, albumTitle, appName, welcomeText, application, retailerLocation, offer, album, returning);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

