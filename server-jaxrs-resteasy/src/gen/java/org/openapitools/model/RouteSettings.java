package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Program;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RouteSettings   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String description;
  private String setting;

  /**
   * Gets or Sets settingType
   */
  public enum SettingTypeEnum {
    FLOAT("FLOAT"),

        DOUBLE("DOUBLE"),

        INTEGER("INTEGER"),

        LONG("LONG"),

        BOOLEAN("BOOLEAN"),

        STRING("STRING");
    private String value;

    SettingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SettingTypeEnum settingType;
  private Program program;
  private ServiceHub hub;

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
  @JsonProperty("setting")
  public String getSetting() {
    return setting;
  }
  public void setSetting(String setting) {
    this.setting = setting;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("settingType")
  public SettingTypeEnum getSettingType() {
    return settingType;
  }
  public void setSettingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("program")
  @Valid
  public Program getProgram() {
    return program;
  }
  public void setProgram(Program program) {
    this.program = program;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("hub")
  @Valid
  public ServiceHub getHub() {
    return hub;
  }
  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteSettings routeSettings = (RouteSettings) o;
    return Objects.equals(this.id, routeSettings.id) &&
        Objects.equals(this.active, routeSettings.active) &&
        Objects.equals(this.valid, routeSettings.valid) &&
        Objects.equals(this.name, routeSettings.name) &&
        Objects.equals(this.description, routeSettings.description) &&
        Objects.equals(this.setting, routeSettings.setting) &&
        Objects.equals(this.settingType, routeSettings.settingType) &&
        Objects.equals(this.program, routeSettings.program) &&
        Objects.equals(this.hub, routeSettings.hub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, setting, settingType, program, hub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
    sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    hub: ").append(toIndentedString(hub)).append("\n");
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

