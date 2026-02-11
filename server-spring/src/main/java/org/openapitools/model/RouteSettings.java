package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Program;
import org.openapitools.model.ServiceHub;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RouteSettings
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RouteSettings {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String setting;

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

    private final String value;

    SettingTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable SettingTypeEnum settingType;

  private @Nullable Program program;

  private @Nullable ServiceHub hub;

  public RouteSettings id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public RouteSettings active(@Nullable Boolean active) {
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

  public RouteSettings valid(@Nullable Boolean valid) {
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

  public RouteSettings name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RouteSettings description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public RouteSettings setting(@Nullable String setting) {
    this.setting = setting;
    return this;
  }

  /**
   * Get setting
   * @return setting
   */
  
  @Schema(name = "setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("setting")
  public @Nullable String getSetting() {
    return setting;
  }

  public void setSetting(@Nullable String setting) {
    this.setting = setting;
  }

  public RouteSettings settingType(@Nullable SettingTypeEnum settingType) {
    this.settingType = settingType;
    return this;
  }

  /**
   * Get settingType
   * @return settingType
   */
  
  @Schema(name = "settingType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settingType")
  public @Nullable SettingTypeEnum getSettingType() {
    return settingType;
  }

  public void setSettingType(@Nullable SettingTypeEnum settingType) {
    this.settingType = settingType;
  }

  public RouteSettings program(@Nullable Program program) {
    this.program = program;
    return this;
  }

  /**
   * Get program
   * @return program
   */
  @Valid 
  @Schema(name = "program", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("program")
  public @Nullable Program getProgram() {
    return program;
  }

  public void setProgram(@Nullable Program program) {
    this.program = program;
  }

  public RouteSettings hub(@Nullable ServiceHub hub) {
    this.hub = hub;
    return this;
  }

  /**
   * Get hub
   * @return hub
   */
  @Valid 
  @Schema(name = "hub", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hub")
  public @Nullable ServiceHub getHub() {
    return hub;
  }

  public void setHub(@Nullable ServiceHub hub) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

