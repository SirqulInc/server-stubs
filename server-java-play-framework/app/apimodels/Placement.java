package apimodels;

import apimodels.Application;
import apimodels.Asset;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Placement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Placement   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("application")
  @Valid

  private Application application;

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

  /**
   * Gets or Sets clickType
   */
  public enum ClickTypeEnum {
    CONFIG("CONFIG"),
    
    PURCHASE("PURCHASE"),
    
    BANNER("BANNER"),
    
    LEADERBOARD("LEADERBOARD"),
    
    SKYSCRAPER("SKYSCRAPER"),
    
    VIDEO("VIDEO"),
    
    ZIP("ZIP"),
    
    FULL("FULL"),
    
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

    ClickTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ClickTypeEnum fromValue(String value) {
      for (ClickTypeEnum b : ClickTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("clickType")
  
  private ClickTypeEnum clickType;

  @JsonProperty("height")
  
  private Integer height;

  @JsonProperty("width")
  
  private Integer width;

  @JsonProperty("refreshInterval")
  
  private Integer refreshInterval;

  @JsonProperty("defaultImage")
  @Valid

  private Asset defaultImage;

  public Placement id(Long id) {
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

  public Placement active(Boolean active) {
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

  public Placement valid(Boolean valid) {
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

  public Placement application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Placement name(String name) {
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

  public Placement description(String description) {
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

  public Placement size(SizeEnum size) {
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

  public Placement clickType(ClickTypeEnum clickType) {
    this.clickType = clickType;
    return this;
  }

   /**
   * Get clickType
   * @return clickType
  **/
  public ClickTypeEnum getClickType() {
    return clickType;
  }

  public void setClickType(ClickTypeEnum clickType) {
    this.clickType = clickType;
  }

  public Placement height(Integer height) {
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

  public Placement width(Integer width) {
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

  public Placement refreshInterval(Integer refreshInterval) {
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

  public Placement defaultImage(Asset defaultImage) {
    this.defaultImage = defaultImage;
    return this;
  }

   /**
   * Get defaultImage
   * @return defaultImage
  **/
  public Asset getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(Asset defaultImage) {
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
    Placement placement = (Placement) o;
    return Objects.equals(id, placement.id) &&
        Objects.equals(active, placement.active) &&
        Objects.equals(valid, placement.valid) &&
        Objects.equals(application, placement.application) &&
        Objects.equals(name, placement.name) &&
        Objects.equals(description, placement.description) &&
        Objects.equals(size, placement.size) &&
        Objects.equals(clickType, placement.clickType) &&
        Objects.equals(height, placement.height) &&
        Objects.equals(width, placement.width) &&
        Objects.equals(refreshInterval, placement.refreshInterval) &&
        Objects.equals(defaultImage, placement.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, application, name, description, size, clickType, height, width, refreshInterval, defaultImage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Placement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    clickType: ").append(toIndentedString(clickType)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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

