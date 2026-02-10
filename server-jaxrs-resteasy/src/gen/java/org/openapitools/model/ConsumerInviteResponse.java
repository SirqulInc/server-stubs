package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ConsumerInviteResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long inviterId;
  private AccountShortResponse inviter;
  private ConnectionResponse connection;
  private String inviteText;
  private String token;
  private String albumCoverUrl;
  private String albumTitle;
  private String appName;
  private String welcomeText;
  private ApplicationShortResponse application;
  private RetailerLocationResponse retailerLocation;
  private OfferShortResponse offer;
  private AlbumResponse album;
  private String returning;

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
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public Double getVersion() {
    return version;
  }
  public void setVersion(Double version) {
    this.version = version;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serializeNulls")
  public Boolean getSerializeNulls() {
    return serializeNulls;
  }
  public void setSerializeNulls(Boolean serializeNulls) {
    this.serializeNulls = serializeNulls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startTimeLog")
  public Long getStartTimeLog() {
    return startTimeLog;
  }
  public void setStartTimeLog(Long startTimeLog) {
    this.startTimeLog = startTimeLog;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request")
  @Valid
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }
  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviterId")
  public Long getInviterId() {
    return inviterId;
  }
  public void setInviterId(Long inviterId) {
    this.inviterId = inviterId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviter")
  @Valid
  public AccountShortResponse getInviter() {
    return inviter;
  }
  public void setInviter(AccountShortResponse inviter) {
    this.inviter = inviter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connection")
  @Valid
  public ConnectionResponse getConnection() {
    return connection;
  }
  public void setConnection(ConnectionResponse connection) {
    this.connection = connection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("inviteText")
  public String getInviteText() {
    return inviteText;
  }
  public void setInviteText(String inviteText) {
    this.inviteText = inviteText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("albumCoverUrl")
  public String getAlbumCoverUrl() {
    return albumCoverUrl;
  }
  public void setAlbumCoverUrl(String albumCoverUrl) {
    this.albumCoverUrl = albumCoverUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("albumTitle")
  public String getAlbumTitle() {
    return albumTitle;
  }
  public void setAlbumTitle(String albumTitle) {
    this.albumTitle = albumTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appName")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("welcomeText")
  public String getWelcomeText() {
    return welcomeText;
  }
  public void setWelcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public ApplicationShortResponse getApplication() {
    return application;
  }
  public void setApplication(ApplicationShortResponse application) {
    this.application = application;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("retailerLocation")
  @Valid
  public RetailerLocationResponse getRetailerLocation() {
    return retailerLocation;
  }
  public void setRetailerLocation(RetailerLocationResponse retailerLocation) {
    this.retailerLocation = retailerLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("offer")
  @Valid
  public OfferShortResponse getOffer() {
    return offer;
  }
  public void setOffer(OfferShortResponse offer) {
    this.offer = offer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("album")
  @Valid
  public AlbumResponse getAlbum() {
    return album;
  }
  public void setAlbum(AlbumResponse album) {
    this.album = album;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("returning")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

