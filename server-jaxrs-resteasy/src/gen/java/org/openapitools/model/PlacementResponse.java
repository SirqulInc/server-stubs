package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class PlacementResponse   {
  
  private Long placementId;
  private String name;
  private String description;

  /**
   * Gets or Sets size
   */
  public enum SizeEnum {
    CONFIG("CONFIG"),

        BANNER("BANNER"),

        LEADERBOARD("LEADERBOARD"),

        SKYSCRAPER("SKYSCRAPER"),

        VIDEO("VIDEO"),

        ZIP("ZIP"),

        INTERSTITIAL("INTERSTITIAL"),

        CUSTOM1("CUSTOM1"),

        CUSTOM2("CUSTOM2"),

        CUSTOM3("CUSTOM3"),

        CUSTOM4("CUSTOM4"),

        CUSTOM5("CUSTOM5"),

        CUSTOM6("CUSTOM6"),

        CUSTOM7("CUSTOM7"),

        CUSTOM8("CUSTOM8"),

        CUSTOM9("CUSTOM9"),

        CUSTOM10("CUSTOM10");
    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SizeEnum size;
  private Integer height;
  private Integer width;
  private Integer refreshInterval;
  private String appName;
  private String appKey;
  private Boolean active;
  private AssetShortResponse defaultImage;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placementId")
  public Long getPlacementId() {
    return placementId;
  }
  public void setPlacementId(Long placementId) {
    this.placementId = placementId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public SizeEnum getSize() {
    return size;
  }
  public void setSize(SizeEnum size) {
    this.size = size;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("refreshInterval")
  public Integer getRefreshInterval() {
    return refreshInterval;
  }
  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
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
  @JsonProperty("defaultImage")
  @Valid
  public AssetShortResponse getDefaultImage() {
    return defaultImage;
  }
  public void setDefaultImage(AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementResponse placementResponse = (PlacementResponse) o;
    return Objects.equals(this.placementId, placementResponse.placementId) &&
        Objects.equals(this.name, placementResponse.name) &&
        Objects.equals(this.description, placementResponse.description) &&
        Objects.equals(this.size, placementResponse.size) &&
        Objects.equals(this.height, placementResponse.height) &&
        Objects.equals(this.width, placementResponse.width) &&
        Objects.equals(this.refreshInterval, placementResponse.refreshInterval) &&
        Objects.equals(this.appName, placementResponse.appName) &&
        Objects.equals(this.appKey, placementResponse.appKey) &&
        Objects.equals(this.active, placementResponse.active) &&
        Objects.equals(this.defaultImage, placementResponse.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, name, description, size, height, width, refreshInterval, appName, appKey, active, defaultImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementResponse {\n");
    
    sb.append("    placementId: ").append(toIndentedString(placementId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    defaultImage: ").append(toIndentedString(defaultImage)).append("\n");
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

