package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Placement  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

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

public enum ClickTypeEnum {

CONFIG(String.valueOf("CONFIG")), PURCHASE(String.valueOf("PURCHASE")), BANNER(String.valueOf("BANNER")), LEADERBOARD(String.valueOf("LEADERBOARD")), SKYSCRAPER(String.valueOf("SKYSCRAPER")), VIDEO(String.valueOf("VIDEO")), ZIP(String.valueOf("ZIP")), FULL(String.valueOf("FULL")), CUSTOM1(String.valueOf("CUSTOM1")), CUSTOM2(String.valueOf("CUSTOM2")), CUSTOM3(String.valueOf("CUSTOM3")), CUSTOM4(String.valueOf("CUSTOM4")), CUSTOM5(String.valueOf("CUSTOM5")), CUSTOM6(String.valueOf("CUSTOM6")), CUSTOM7(String.valueOf("CUSTOM7")), CUSTOM8(String.valueOf("CUSTOM8")), CUSTOM9(String.valueOf("CUSTOM9")), CUSTOM10(String.valueOf("CUSTOM10"));


    private String value;

    ClickTypeEnum (String v) {
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
    public static ClickTypeEnum fromValue(String value) {
        for (ClickTypeEnum b : ClickTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ClickTypeEnum clickType;

  @ApiModelProperty(value = "")

  private Integer height;

  @ApiModelProperty(value = "")

  private Integer width;

  @ApiModelProperty(value = "")

  private Integer refreshInterval;

  @ApiModelProperty(value = "")

  @Valid

  private Asset defaultImage;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Placement id(Long id) {
    this.id = id;
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

  public Placement active(Boolean active) {
    this.active = active;
    return this;
  }

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

  public Placement valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Placement application(Application application) {
    this.application = application;
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

  public Placement name(String name) {
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

  public Placement description(String description) {
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

  public Placement size(SizeEnum size) {
    this.size = size;
    return this;
  }

 /**
   * Get clickType
   * @return clickType
  **/
  @JsonProperty("clickType")
  public String getClickType() {
    if (clickType == null) {
      return null;
    }
    return clickType.value();
  }

  public void setClickType(ClickTypeEnum clickType) {
    this.clickType = clickType;
  }

  public Placement clickType(ClickTypeEnum clickType) {
    this.clickType = clickType;
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

  public Placement height(Integer height) {
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

  public Placement width(Integer width) {
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

  public Placement refreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

 /**
   * Get defaultImage
   * @return defaultImage
  **/
  @JsonProperty("defaultImage")
  public Asset getDefaultImage() {
    return defaultImage;
  }

  public void setDefaultImage(Asset defaultImage) {
    this.defaultImage = defaultImage;
  }

  public Placement defaultImage(Asset defaultImage) {
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
    Placement placement = (Placement) o;
    return Objects.equals(this.id, placement.id) &&
        Objects.equals(this.active, placement.active) &&
        Objects.equals(this.valid, placement.valid) &&
        Objects.equals(this.application, placement.application) &&
        Objects.equals(this.name, placement.name) &&
        Objects.equals(this.description, placement.description) &&
        Objects.equals(this.size, placement.size) &&
        Objects.equals(this.clickType, placement.clickType) &&
        Objects.equals(this.height, placement.height) &&
        Objects.equals(this.width, placement.width) &&
        Objects.equals(this.refreshInterval, placement.refreshInterval) &&
        Objects.equals(this.defaultImage, placement.defaultImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, application, name, description, size, clickType, height, width, refreshInterval, defaultImage);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

