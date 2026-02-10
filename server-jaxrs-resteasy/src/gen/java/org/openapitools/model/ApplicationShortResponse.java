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
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PlatformResponse;
import org.openapitools.model.TrilatAppSettings;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationShortResponse   {
  
  private Boolean valid;
  private String message;
  private Double version;
  private Boolean serializeNulls;
  private Long startTimeLog;
  private String errorCode;
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
  private Long applicationId;
  private String appKey;
  private String title;
  private String currentBuildVersion;
  private String currentApiVersion;
  private AssetShortResponse appIcon;
  private AssetShortResponse appLogo;
  private Boolean active;
  private String about;
  private String landingPageUrl;
  private String landingPageFullUrl;
  private String defaultImageFullUrl;
  private String activityDescription;
  private List<@Valid PlatformResponse> platforms = new ArrayList<>();
  private List<@Valid CategoryResponse> categories = new ArrayList<>();
  private Integer placementCount;
  private BillableEntityShortResponse billable;
  private Boolean hasAds;
  private Boolean publicNotifications;
  private String urlScheme;
  private Boolean global;
  private String downloadUrls;
  private Boolean localAdsEnabled;
  private TrilatAppSettings trilatSettings;
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
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentBuildVersion")
  public String getCurrentBuildVersion() {
    return currentBuildVersion;
  }
  public void setCurrentBuildVersion(String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currentApiVersion")
  public String getCurrentApiVersion() {
    return currentApiVersion;
  }
  public void setCurrentApiVersion(String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appIcon")
  @Valid
  public AssetShortResponse getAppIcon() {
    return appIcon;
  }
  public void setAppIcon(AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("appLogo")
  @Valid
  public AssetShortResponse getAppLogo() {
    return appLogo;
  }
  public void setAppLogo(AssetShortResponse appLogo) {
    this.appLogo = appLogo;
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
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("landingPageUrl")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }
  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("landingPageFullUrl")
  public String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }
  public void setLandingPageFullUrl(String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultImageFullUrl")
  public String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }
  public void setDefaultImageFullUrl(String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("activityDescription")
  public String getActivityDescription() {
    return activityDescription;
  }
  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("platforms")
  @Valid
  public List<@Valid PlatformResponse> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  @Valid
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placementCount")
  public Integer getPlacementCount() {
    return placementCount;
  }
  public void setPlacementCount(Integer placementCount) {
    this.placementCount = placementCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billable")
  @Valid
  public BillableEntityShortResponse getBillable() {
    return billable;
  }
  public void setBillable(BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hasAds")
  public Boolean getHasAds() {
    return hasAds;
  }
  public void setHasAds(Boolean hasAds) {
    this.hasAds = hasAds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("publicNotifications")
  public Boolean getPublicNotifications() {
    return publicNotifications;
  }
  public void setPublicNotifications(Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("urlScheme")
  public String getUrlScheme() {
    return urlScheme;
  }
  public void setUrlScheme(String urlScheme) {
    this.urlScheme = urlScheme;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("global")
  public Boolean getGlobal() {
    return global;
  }
  public void setGlobal(Boolean global) {
    this.global = global;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("downloadUrls")
  public String getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("localAdsEnabled")
  public Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }
  public void setLocalAdsEnabled(Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trilatSettings")
  @Valid
  public TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }
  public void setTrilatSettings(TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
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
    ApplicationShortResponse applicationShortResponse = (ApplicationShortResponse) o;
    return Objects.equals(this.valid, applicationShortResponse.valid) &&
        Objects.equals(this.message, applicationShortResponse.message) &&
        Objects.equals(this.version, applicationShortResponse.version) &&
        Objects.equals(this.serializeNulls, applicationShortResponse.serializeNulls) &&
        Objects.equals(this.startTimeLog, applicationShortResponse.startTimeLog) &&
        Objects.equals(this.errorCode, applicationShortResponse.errorCode) &&
        Objects.equals(this.request, applicationShortResponse.request) &&
        Objects.equals(this.applicationId, applicationShortResponse.applicationId) &&
        Objects.equals(this.appKey, applicationShortResponse.appKey) &&
        Objects.equals(this.title, applicationShortResponse.title) &&
        Objects.equals(this.currentBuildVersion, applicationShortResponse.currentBuildVersion) &&
        Objects.equals(this.currentApiVersion, applicationShortResponse.currentApiVersion) &&
        Objects.equals(this.appIcon, applicationShortResponse.appIcon) &&
        Objects.equals(this.appLogo, applicationShortResponse.appLogo) &&
        Objects.equals(this.active, applicationShortResponse.active) &&
        Objects.equals(this.about, applicationShortResponse.about) &&
        Objects.equals(this.landingPageUrl, applicationShortResponse.landingPageUrl) &&
        Objects.equals(this.landingPageFullUrl, applicationShortResponse.landingPageFullUrl) &&
        Objects.equals(this.defaultImageFullUrl, applicationShortResponse.defaultImageFullUrl) &&
        Objects.equals(this.activityDescription, applicationShortResponse.activityDescription) &&
        Objects.equals(this.platforms, applicationShortResponse.platforms) &&
        Objects.equals(this.categories, applicationShortResponse.categories) &&
        Objects.equals(this.placementCount, applicationShortResponse.placementCount) &&
        Objects.equals(this.billable, applicationShortResponse.billable) &&
        Objects.equals(this.hasAds, applicationShortResponse.hasAds) &&
        Objects.equals(this.publicNotifications, applicationShortResponse.publicNotifications) &&
        Objects.equals(this.urlScheme, applicationShortResponse.urlScheme) &&
        Objects.equals(this.global, applicationShortResponse.global) &&
        Objects.equals(this.downloadUrls, applicationShortResponse.downloadUrls) &&
        Objects.equals(this.localAdsEnabled, applicationShortResponse.localAdsEnabled) &&
        Objects.equals(this.trilatSettings, applicationShortResponse.trilatSettings) &&
        Objects.equals(this.returning, applicationShortResponse.returning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, message, version, serializeNulls, startTimeLog, errorCode, request, applicationId, appKey, title, currentBuildVersion, currentApiVersion, appIcon, appLogo, active, about, landingPageUrl, landingPageFullUrl, defaultImageFullUrl, activityDescription, platforms, categories, placementCount, billable, hasAds, publicNotifications, urlScheme, global, downloadUrls, localAdsEnabled, trilatSettings, returning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationShortResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    serializeNulls: ").append(toIndentedString(serializeNulls)).append("\n");
    sb.append("    startTimeLog: ").append(toIndentedString(startTimeLog)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    currentBuildVersion: ").append(toIndentedString(currentBuildVersion)).append("\n");
    sb.append("    currentApiVersion: ").append(toIndentedString(currentApiVersion)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appLogo: ").append(toIndentedString(appLogo)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    landingPageFullUrl: ").append(toIndentedString(landingPageFullUrl)).append("\n");
    sb.append("    defaultImageFullUrl: ").append(toIndentedString(defaultImageFullUrl)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    placementCount: ").append(toIndentedString(placementCount)).append("\n");
    sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
    sb.append("    hasAds: ").append(toIndentedString(hasAds)).append("\n");
    sb.append("    publicNotifications: ").append(toIndentedString(publicNotifications)).append("\n");
    sb.append("    urlScheme: ").append(toIndentedString(urlScheme)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    localAdsEnabled: ").append(toIndentedString(localAdsEnabled)).append("\n");
    sb.append("    trilatSettings: ").append(toIndentedString(trilatSettings)).append("\n");
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

