package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PlacementResponse  {
  
  @ApiModelProperty(value = "")

  private Long placementId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

public enum SizeEnum {

CONFIG(String.valueOf("CONFIG")), BANNER(String.valueOf("BANNER")), LEADERBOARD(String.valueOf("LEADERBOARD")), SKYSCRAPER(String.valueOf("SKYSCRAPER")), VIDEO(String.valueOf("VIDEO")), ZIP(String.valueOf("ZIP")), INTERSTITIAL(String.valueOf("INTERSTITIAL")), CUSTOM1(String.valueOf("CUSTOM1")), CUSTOM2(String.valueOf("CUSTOM2")), CUSTOM3(String.valueOf("CUSTOM3")), CUSTOM4(String.valueOf("CUSTOM4")), CUSTOM5(String.valueOf("CUSTOM5")), CUSTOM6(String.valueOf("CUSTOM6")), CUSTOM7(String.valueOf("CUSTOM7")), CUSTOM8(String.valueOf("CUSTOM8")), CUSTOM9(String.valueOf("CUSTOM9")), CUSTOM10(String.valueOf("CUSTOM10"));


    private String value;

    SizeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SizeEnum fromValue(String value) {
        for (SizeEnum b : SizeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SizeEnum size;

  @ApiModelProperty(value = "")

  private Integer height;

  @ApiModelProperty(value = "")

  private Integer width;

  @ApiModelProperty(value = "")

  private Integer refreshInterval;

  @ApiModelProperty(value = "")

  private String appName;

  @ApiModelProperty(value = "")

  private String appKey;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse defaultImage;
 /**
   * Get placementId
   * @return placementId
  **/
  @JsonProperty("placementId")
  public Long getPlacementId() {
    return placementId;
  }

  public void setPlacementId(Long placementId) {
    this.placementId = placementId;
  }

  public PlacementResponse placementId(Long placementId) {
    this.placementId = placementId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlacementResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlacementResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    if (size == null) {
      return null;
    }
    return size.value();
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public PlacementResponse size(SizeEnum size) {
    this.size = size;
    return this;
  }

 /**
   * Get height
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PlacementResponse height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Get width
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PlacementResponse width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Get refreshInterval
   * @return refreshInterval
  **/
  @JsonProperty("refreshInterval")
  public Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
  }

  public PlacementResponse refreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
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

  public PlacementResponse appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Get appKey
   * @return appKey
  **/
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PlacementResponse appKey(String appKey) {
    this.appKey = appKey;
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

  public PlacementResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get defaultImage
   * @return defaultImage
  **/
  @JsonProperty("defaultImage")
  public AssetShortResponse getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
  }

  public PlacementResponse defaultImage(AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

