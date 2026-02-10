package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PlacementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PlacementResponse   {
  @JsonProperty("placementId")
  
  private Long placementId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
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

    private final String value;

    SizeEnum(String value) {
      this.value = value;
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

  @JsonProperty("size")
  
  private SizeEnum size;

  @JsonProperty("height")
  
  private Integer height;

  @JsonProperty("width")
  
  private Integer width;

  @JsonProperty("refreshInterval")
  
  private Integer refreshInterval;

  @JsonProperty("appName")
  
  private String appName;

  @JsonProperty("appKey")
  
  private String appKey;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("defaultImage")
  @Valid

  private AssetShortResponse defaultImage;

  public PlacementResponse placementId(Long placementId) {
    this.placementId = placementId;
    return this;
  }

   /**
   * Get placementId
   * @return placementId
  **/
  public Long getPlacementId() {
    return placementId;
  }

  public void setPlacementId(Long placementId) {
    this.placementId = placementId;
  }

  public PlacementResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlacementResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlacementResponse size(SizeEnum size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  public SizeEnum getSize() {
    return size;
  }

  public void setSize(SizeEnum size) {
    this.size = size;
  }

  public PlacementResponse height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PlacementResponse width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PlacementResponse refreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

   /**
   * Get refreshInterval
   * @return refreshInterval
  **/
  public Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
  }

  public PlacementResponse appName(String appName) {
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

  public PlacementResponse appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  public PlacementResponse active(Boolean active) {
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

  public PlacementResponse defaultImage(AssetShortResponse defaultImage) {
    this.defaultImage = defaultImage;
    return this;
  }

   /**
   * Get defaultImage
   * @return defaultImage
  **/
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
    return Objects.equals(placementId, placementResponse.placementId) &&
        Objects.equals(name, placementResponse.name) &&
        Objects.equals(description, placementResponse.description) &&
        Objects.equals(size, placementResponse.size) &&
        Objects.equals(height, placementResponse.height) &&
        Objects.equals(width, placementResponse.width) &&
        Objects.equals(refreshInterval, placementResponse.refreshInterval) &&
        Objects.equals(appName, placementResponse.appName) &&
        Objects.equals(appKey, placementResponse.appKey) &&
        Objects.equals(active, placementResponse.active) &&
        Objects.equals(defaultImage, placementResponse.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placementId, name, description, size, height, width, refreshInterval, appName, appKey, active, defaultImage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

