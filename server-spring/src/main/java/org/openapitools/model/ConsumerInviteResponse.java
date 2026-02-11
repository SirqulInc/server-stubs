package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConsumerInviteResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerInviteResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long inviterId;

  private @Nullable AccountShortResponse inviter;

  private @Nullable ConnectionResponse connection;

  private @Nullable String inviteText;

  private @Nullable String token;

  private @Nullable String albumCoverUrl;

  private @Nullable String albumTitle;

  private @Nullable String appName;

  private @Nullable String welcomeText;

  private @Nullable ApplicationShortResponse application;

  private @Nullable RetailerLocationResponse retailerLocation;

  private @Nullable OfferShortResponse offer;

  private @Nullable AlbumResponse album;

  private @Nullable String returning;

  public ConsumerInviteResponse valid(@Nullable Boolean valid) {
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

  public ConsumerInviteResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ConsumerInviteResponse version(@Nullable Double version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable Double getVersion() {
    return version;
  }

  public void setVersion(@Nullable Double version) {
    this.version = version;
  }

  public ConsumerInviteResponse serializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
    return this;
  }

  /**
   * Get serializeNulls
   * @return serializeNulls
   */
  
  @Schema(name = "serializeNulls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serializeNulls")
  public @Nullable Boolean getSerializeNulls() {
    return serializeNulls;
  }

  public void setSerializeNulls(@Nullable Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  public ConsumerInviteResponse startTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
    return this;
  }

  /**
   * Get startTimeLog
   * @return startTimeLog
   */
  
  @Schema(name = "startTimeLog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeLog")
  public @Nullable Long getStartTimeLog() {
    return startTimeLog;
  }

  public void setStartTimeLog(@Nullable Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  public ConsumerInviteResponse errorCode(@Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  
  @Schema(name = "errorCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable String errorCode) {
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
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ConsumerInviteResponse inviterId(@Nullable Long inviterId) {
    this.inviterId = inviterId;
    return this;
  }

  /**
   * Get inviterId
   * @return inviterId
   */
  
  @Schema(name = "inviterId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviterId")
  public @Nullable Long getInviterId() {
    return inviterId;
  }

  public void setInviterId(@Nullable Long inviterId) {
    this.inviterId = inviterId;
  }

  public ConsumerInviteResponse inviter(@Nullable AccountShortResponse inviter) {
    this.inviter = inviter;
    return this;
  }

  /**
   * Get inviter
   * @return inviter
   */
  @Valid 
  @Schema(name = "inviter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviter")
  public @Nullable AccountShortResponse getInviter() {
    return inviter;
  }

  public void setInviter(@Nullable AccountShortResponse inviter) {
    this.inviter = inviter;
  }

  public ConsumerInviteResponse connection(@Nullable ConnectionResponse connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
   */
  @Valid 
  @Schema(name = "connection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection")
  public @Nullable ConnectionResponse getConnection() {
    return connection;
  }

  public void setConnection(@Nullable ConnectionResponse connection) {
    this.connection = connection;
  }

  public ConsumerInviteResponse inviteText(@Nullable String inviteText) {
    this.inviteText = inviteText;
    return this;
  }

  /**
   * Get inviteText
   * @return inviteText
   */
  
  @Schema(name = "inviteText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inviteText")
  public @Nullable String getInviteText() {
    return inviteText;
  }

  public void setInviteText(@Nullable String inviteText) {
    this.inviteText = inviteText;
  }

  public ConsumerInviteResponse token(@Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  
  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public @Nullable String getToken() {
    return token;
  }

  public void setToken(@Nullable String token) {
    this.token = token;
  }

  public ConsumerInviteResponse albumCoverUrl(@Nullable String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
    return this;
  }

  /**
   * Get albumCoverUrl
   * @return albumCoverUrl
   */
  
  @Schema(name = "albumCoverUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("albumCoverUrl")
  public @Nullable String getAlbumCoverUrl() {
    return albumCoverUrl;
  }

  public void setAlbumCoverUrl(@Nullable String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
  }

  public ConsumerInviteResponse albumTitle(@Nullable String albumTitle) {
    this.albumTitle = albumTitle;
    return this;
  }

  /**
   * Get albumTitle
   * @return albumTitle
   */
  
  @Schema(name = "albumTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("albumTitle")
  public @Nullable String getAlbumTitle() {
    return albumTitle;
  }

  public void setAlbumTitle(@Nullable String albumTitle) {
    this.albumTitle = albumTitle;
  }

  public ConsumerInviteResponse appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   */
  
  @Schema(name = "appName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appName")
  public @Nullable String getAppName() {
    return appName;
  }

  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public ConsumerInviteResponse welcomeText(@Nullable String welcomeText) {
    this.welcomeText = welcomeText;
    return this;
  }

  /**
   * Get welcomeText
   * @return welcomeText
   */
  
  @Schema(name = "welcomeText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("welcomeText")
  public @Nullable String getWelcomeText() {
    return welcomeText;
  }

  public void setWelcomeText(@Nullable String welcomeText) {
    this.welcomeText = welcomeText;
  }

  public ConsumerInviteResponse application(@Nullable ApplicationShortResponse application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable ApplicationShortResponse getApplication() {
    return application;
  }

  public void setApplication(@Nullable ApplicationShortResponse application) {
    this.application = application;
  }

  public ConsumerInviteResponse retailerLocation(@Nullable RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
    return this;
  }

  /**
   * Get retailerLocation
   * @return retailerLocation
   */
  @Valid 
  @Schema(name = "retailerLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retailerLocation")
  public @Nullable RetailerLocationResponse getRetailerLocation() {
    return retailerLocation;
  }

  public void setRetailerLocation(@Nullable RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  public ConsumerInviteResponse offer(@Nullable OfferShortResponse offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @Valid 
  @Schema(name = "offer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offer")
  public @Nullable OfferShortResponse getOffer() {
    return offer;
  }

  public void setOffer(@Nullable OfferShortResponse offer) {
    this.offer = offer;
  }

  public ConsumerInviteResponse album(@Nullable AlbumResponse album) {
    this.album = album;
    return this;
  }

  /**
   * Get album
   * @return album
   */
  @Valid 
  @Schema(name = "album", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("album")
  public @Nullable AlbumResponse getAlbum() {
    return album;
  }

  public void setAlbum(@Nullable AlbumResponse album) {
    this.album = album;
  }

  public ConsumerInviteResponse returning(@Nullable String returning) {
    this.returning = returning;
    return this;
  }

  /**
   * Get returning
   * @return returning
   */
  
  @Schema(name = "returning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returning")
  public @Nullable String getReturning() {
    return returning;
  }

  public void setReturning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

