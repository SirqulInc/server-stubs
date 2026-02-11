package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Placement   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Application application;
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
    private String value;

    ClickTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ClickTypeEnum clickType;
  private Integer height;
  private Integer width;
  private Integer refreshInterval;
  private Asset defaultImage;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
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
  @JsonProperty("clickType")
  public ClickTypeEnum getClickType() {
    return clickType;
  }
  public void setClickType(ClickTypeEnum clickType) {
    this.clickType = clickType;
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
  @JsonProperty("defaultImage")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

