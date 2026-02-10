package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Program;
import org.openapitools.model.ServiceHub;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RouteSettings  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String setting;

public enum SettingTypeEnum {

FLOAT(String.valueOf("FLOAT")), DOUBLE(String.valueOf("DOUBLE")), INTEGER(String.valueOf("INTEGER")), LONG(String.valueOf("LONG")), BOOLEAN(String.valueOf("BOOLEAN")), STRING(String.valueOf("STRING"));


    private String value;

    SettingTypeEnum (String v) {
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
    public static SettingTypeEnum fromValue(String value) {
        for (SettingTypeEnum b : SettingTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SettingTypeEnum settingType;

  @ApiModelProperty(value = "")

  @Valid

  private Program program;

  @ApiModelProperty(value = "")

  @Valid

  private ServiceHub hub;
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

  public RouteSettings id(Long id) {
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

  public RouteSettings active(Boolean active) {
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

  public RouteSettings valid(Boolean valid) {
    this.valid = valid;
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

  public RouteSettings name(String name) {
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

  public RouteSettings description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get setting
   * @return setting
  **/
  @JsonProperty("setting")
  public String getSetting() {
    return setting;
  }

  public void setSetting(String setting) {
    this.setting = setting;
  }

  public RouteSettings setting(String setting) {
    this.setting = setting;
    return this;
  }

 /**
   * Get settingType
   * @return settingType
  **/
  @JsonProperty("settingType")
  public String getSettingType() {
    if (settingType == null) {
      return null;
    }
    return settingType.value();
  }

  public void setSettingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
  }

  public RouteSettings settingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
    return this;
  }

 /**
   * Get program
   * @return program
  **/
  @JsonProperty("program")
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public RouteSettings program(Program program) {
    this.program = program;
    return this;
  }

 /**
   * Get hub
   * @return hub
  **/
  @JsonProperty("hub")
  public ServiceHub getHub() {
    return hub;
  }

  public void setHub(ServiceHub hub) {
    this.hub = hub;
  }

  public RouteSettings hub(ServiceHub hub) {
    this.hub = hub;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

