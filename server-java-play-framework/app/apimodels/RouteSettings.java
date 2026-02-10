package apimodels;

import apimodels.Program;
import apimodels.ServiceHub;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RouteSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RouteSettings   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("setting")
  
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

    private final String value;

    SettingTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("settingType")
  
  private SettingTypeEnum settingType;

  @JsonProperty("program")
  @Valid

  private Program program;

  @JsonProperty("hub")
  @Valid

  private ServiceHub hub;

  public RouteSettings id(Long id) {
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

  public RouteSettings active(Boolean active) {
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

  public RouteSettings valid(Boolean valid) {
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

  public RouteSettings name(String name) {
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

  public RouteSettings description(String description) {
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

  public RouteSettings setting(String setting) {
    this.setting = setting;
    return this;
  }

   /**
   * Get setting
   * @return setting
  **/
  public String getSetting() {
    return setting;
  }

  public void setSetting(String setting) {
    this.setting = setting;
  }

  public RouteSettings settingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
    return this;
  }

   /**
   * Get settingType
   * @return settingType
  **/
  public SettingTypeEnum getSettingType() {
    return settingType;
  }

  public void setSettingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
  }

  public RouteSettings program(Program program) {
    this.program = program;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public RouteSettings hub(ServiceHub hub) {
    this.hub = hub;
    return this;
  }

   /**
   * Get hub
   * @return hub
  **/
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
    return Objects.equals(id, routeSettings.id) &&
        Objects.equals(active, routeSettings.active) &&
        Objects.equals(valid, routeSettings.valid) &&
        Objects.equals(name, routeSettings.name) &&
        Objects.equals(description, routeSettings.description) &&
        Objects.equals(setting, routeSettings.setting) &&
        Objects.equals(settingType, routeSettings.settingType) &&
        Objects.equals(program, routeSettings.program) &&
        Objects.equals(hub, routeSettings.hub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, description, setting, settingType, program, hub);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

