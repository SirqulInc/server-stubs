package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.BillableEntityShortResponse;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.NameStringValueResponse;
import org.openapitools.model.PlatformResponse;
import org.openapitools.model.TrilatAppSettings;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApplicationShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApplicationShortResponse {

  private @Nullable Boolean valid;

  private @Nullable String message;

  private @Nullable Double version;

  private @Nullable Boolean serializeNulls;

  private @Nullable Long startTimeLog;

  private @Nullable String errorCode;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  private @Nullable Long applicationId;

  private @Nullable String appKey;

  private @Nullable String title;

  private @Nullable String currentBuildVersion;

  private @Nullable String currentApiVersion;

  private @Nullable AssetShortResponse appIcon;

  private @Nullable AssetShortResponse appLogo;

  private @Nullable Boolean active;

  private @Nullable String about;

  private @Nullable String landingPageUrl;

  private @Nullable String landingPageFullUrl;

  private @Nullable String defaultImageFullUrl;

  private @Nullable String activityDescription;

  @Valid
  private List<@Valid PlatformResponse> platforms = new ArrayList<>();

  @Valid
  private List<@Valid CategoryResponse> categories = new ArrayList<>();

  private @Nullable Integer placementCount;

  private @Nullable BillableEntityShortResponse billable;

  private @Nullable Boolean hasAds;

  private @Nullable Boolean publicNotifications;

  private @Nullable String urlScheme;

  private @Nullable Boolean global;

  private @Nullable String downloadUrls;

  private @Nullable Boolean localAdsEnabled;

  private @Nullable TrilatAppSettings trilatSettings;

  private @Nullable String returning;

  public ApplicationShortResponse valid(@Nullable Boolean valid) {
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

  public ApplicationShortResponse message(@Nullable String message) {
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

  public ApplicationShortResponse version(@Nullable Double version) {
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

  public ApplicationShortResponse serializeNulls(@Nullable Boolean serializeNulls) {
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

  public ApplicationShortResponse startTimeLog(@Nullable Long startTimeLog) {
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

  public ApplicationShortResponse errorCode(@Nullable String errorCode) {
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

  public ApplicationShortResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ApplicationShortResponse addRequestItem(NameStringValueResponse requestItem) {
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

  public ApplicationShortResponse applicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  
  @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationId")
  public @Nullable Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationShortResponse appKey(@Nullable String appKey) {
    this.appKey = appKey;
    return this;
  }

  /**
   * Get appKey
   * @return appKey
   */
  
  @Schema(name = "appKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appKey")
  public @Nullable String getAppKey() {
    return appKey;
  }

  public void setAppKey(@Nullable String appKey) {
    this.appKey = appKey;
  }

  public ApplicationShortResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ApplicationShortResponse currentBuildVersion(@Nullable String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
    return this;
  }

  /**
   * Get currentBuildVersion
   * @return currentBuildVersion
   */
  
  @Schema(name = "currentBuildVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentBuildVersion")
  public @Nullable String getCurrentBuildVersion() {
    return currentBuildVersion;
  }

  public void setCurrentBuildVersion(@Nullable String currentBuildVersion) {
    this.currentBuildVersion = currentBuildVersion;
  }

  public ApplicationShortResponse currentApiVersion(@Nullable String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
    return this;
  }

  /**
   * Get currentApiVersion
   * @return currentApiVersion
   */
  
  @Schema(name = "currentApiVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentApiVersion")
  public @Nullable String getCurrentApiVersion() {
    return currentApiVersion;
  }

  public void setCurrentApiVersion(@Nullable String currentApiVersion) {
    this.currentApiVersion = currentApiVersion;
  }

  public ApplicationShortResponse appIcon(@Nullable AssetShortResponse appIcon) {
    this.appIcon = appIcon;
    return this;
  }

  /**
   * Get appIcon
   * @return appIcon
   */
  @Valid 
  @Schema(name = "appIcon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appIcon")
  public @Nullable AssetShortResponse getAppIcon() {
    return appIcon;
  }

  public void setAppIcon(@Nullable AssetShortResponse appIcon) {
    this.appIcon = appIcon;
  }

  public ApplicationShortResponse appLogo(@Nullable AssetShortResponse appLogo) {
    this.appLogo = appLogo;
    return this;
  }

  /**
   * Get appLogo
   * @return appLogo
   */
  @Valid 
  @Schema(name = "appLogo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appLogo")
  public @Nullable AssetShortResponse getAppLogo() {
    return appLogo;
  }

  public void setAppLogo(@Nullable AssetShortResponse appLogo) {
    this.appLogo = appLogo;
  }

  public ApplicationShortResponse active(@Nullable Boolean active) {
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

  public ApplicationShortResponse about(@Nullable String about) {
    this.about = about;
    return this;
  }

  /**
   * Get about
   * @return about
   */
  
  @Schema(name = "about", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("about")
  public @Nullable String getAbout() {
    return about;
  }

  public void setAbout(@Nullable String about) {
    this.about = about;
  }

  public ApplicationShortResponse landingPageUrl(@Nullable String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

  /**
   * Get landingPageUrl
   * @return landingPageUrl
   */
  
  @Schema(name = "landingPageUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("landingPageUrl")
  public @Nullable String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(@Nullable String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public ApplicationShortResponse landingPageFullUrl(@Nullable String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
    return this;
  }

  /**
   * Get landingPageFullUrl
   * @return landingPageFullUrl
   */
  
  @Schema(name = "landingPageFullUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("landingPageFullUrl")
  public @Nullable String getLandingPageFullUrl() {
    return landingPageFullUrl;
  }

  public void setLandingPageFullUrl(@Nullable String landingPageFullUrl) {
    this.landingPageFullUrl = landingPageFullUrl;
  }

  public ApplicationShortResponse defaultImageFullUrl(@Nullable String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
    return this;
  }

  /**
   * Get defaultImageFullUrl
   * @return defaultImageFullUrl
   */
  
  @Schema(name = "defaultImageFullUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultImageFullUrl")
  public @Nullable String getDefaultImageFullUrl() {
    return defaultImageFullUrl;
  }

  public void setDefaultImageFullUrl(@Nullable String defaultImageFullUrl) {
    this.defaultImageFullUrl = defaultImageFullUrl;
  }

  public ApplicationShortResponse activityDescription(@Nullable String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * Get activityDescription
   * @return activityDescription
   */
  
  @Schema(name = "activityDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityDescription")
  public @Nullable String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(@Nullable String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public ApplicationShortResponse platforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
    return this;
  }

  public ApplicationShortResponse addPlatformsItem(PlatformResponse platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * Get platforms
   * @return platforms
   */
  @Valid 
  @Schema(name = "platforms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platforms")
  public List<@Valid PlatformResponse> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid PlatformResponse> platforms) {
    this.platforms = platforms;
  }

  public ApplicationShortResponse categories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
    return this;
  }

  public ApplicationShortResponse addCategoriesItem(CategoryResponse categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @Valid 
  @Schema(name = "categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid CategoryResponse> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid CategoryResponse> categories) {
    this.categories = categories;
  }

  public ApplicationShortResponse placementCount(@Nullable Integer placementCount) {
    this.placementCount = placementCount;
    return this;
  }

  /**
   * Get placementCount
   * @return placementCount
   */
  
  @Schema(name = "placementCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placementCount")
  public @Nullable Integer getPlacementCount() {
    return placementCount;
  }

  public void setPlacementCount(@Nullable Integer placementCount) {
    this.placementCount = placementCount;
  }

  public ApplicationShortResponse billable(@Nullable BillableEntityShortResponse billable) {
    this.billable = billable;
    return this;
  }

  /**
   * Get billable
   * @return billable
   */
  @Valid 
  @Schema(name = "billable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable")
  public @Nullable BillableEntityShortResponse getBillable() {
    return billable;
  }

  public void setBillable(@Nullable BillableEntityShortResponse billable) {
    this.billable = billable;
  }

  public ApplicationShortResponse hasAds(@Nullable Boolean hasAds) {
    this.hasAds = hasAds;
    return this;
  }

  /**
   * Get hasAds
   * @return hasAds
   */
  
  @Schema(name = "hasAds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasAds")
  public @Nullable Boolean getHasAds() {
    return hasAds;
  }

  public void setHasAds(@Nullable Boolean hasAds) {
    this.hasAds = hasAds;
  }

  public ApplicationShortResponse publicNotifications(@Nullable Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
    return this;
  }

  /**
   * Get publicNotifications
   * @return publicNotifications
   */
  
  @Schema(name = "publicNotifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publicNotifications")
  public @Nullable Boolean getPublicNotifications() {
    return publicNotifications;
  }

  public void setPublicNotifications(@Nullable Boolean publicNotifications) {
    this.publicNotifications = publicNotifications;
  }

  public ApplicationShortResponse urlScheme(@Nullable String urlScheme) {
    this.urlScheme = urlScheme;
    return this;
  }

  /**
   * Get urlScheme
   * @return urlScheme
   */
  
  @Schema(name = "urlScheme", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urlScheme")
  public @Nullable String getUrlScheme() {
    return urlScheme;
  }

  public void setUrlScheme(@Nullable String urlScheme) {
    this.urlScheme = urlScheme;
  }

  public ApplicationShortResponse global(@Nullable Boolean global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
   */
  
  @Schema(name = "global", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("global")
  public @Nullable Boolean getGlobal() {
    return global;
  }

  public void setGlobal(@Nullable Boolean global) {
    this.global = global;
  }

  public ApplicationShortResponse downloadUrls(@Nullable String downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }

  /**
   * Get downloadUrls
   * @return downloadUrls
   */
  
  @Schema(name = "downloadUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downloadUrls")
  public @Nullable String getDownloadUrls() {
    return downloadUrls;
  }

  public void setDownloadUrls(@Nullable String downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  public ApplicationShortResponse localAdsEnabled(@Nullable Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
    return this;
  }

  /**
   * Get localAdsEnabled
   * @return localAdsEnabled
   */
  
  @Schema(name = "localAdsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localAdsEnabled")
  public @Nullable Boolean getLocalAdsEnabled() {
    return localAdsEnabled;
  }

  public void setLocalAdsEnabled(@Nullable Boolean localAdsEnabled) {
    this.localAdsEnabled = localAdsEnabled;
  }

  public ApplicationShortResponse trilatSettings(@Nullable TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
    return this;
  }

  /**
   * Get trilatSettings
   * @return trilatSettings
   */
  @Valid 
  @Schema(name = "trilatSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trilatSettings")
  public @Nullable TrilatAppSettings getTrilatSettings() {
    return trilatSettings;
  }

  public void setTrilatSettings(@Nullable TrilatAppSettings trilatSettings) {
    this.trilatSettings = trilatSettings;
  }

  public ApplicationShortResponse returning(@Nullable String returning) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

