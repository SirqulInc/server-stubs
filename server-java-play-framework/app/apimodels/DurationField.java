package apimodels;

import apimodels.DurationFieldType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DurationField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DurationField   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("type")
  @Valid

  private DurationFieldType type;

  @JsonProperty("supported")
  
  private Boolean supported;

  @JsonProperty("precise")
  
  private Boolean precise;

  @JsonProperty("unitMillis")
  
  private Long unitMillis;

  public DurationField name(String name) {
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

  public DurationField type(DurationFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public DurationFieldType getType() {
    return type;
  }

  public void setType(DurationFieldType type) {
    this.type = type;
  }

  public DurationField supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * Get supported
   * @return supported
  **/
  public Boolean getSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  public DurationField precise(Boolean precise) {
    this.precise = precise;
    return this;
  }

   /**
   * Get precise
   * @return precise
  **/
  public Boolean getPrecise() {
    return precise;
  }

  public void setPrecise(Boolean precise) {
    this.precise = precise;
  }

  public DurationField unitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
    return this;
  }

   /**
   * Get unitMillis
   * @return unitMillis
  **/
  public Long getUnitMillis() {
    return unitMillis;
  }

  public void setUnitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationField durationField = (DurationField) o;
    return Objects.equals(name, durationField.name) &&
        Objects.equals(type, durationField.type) &&
        Objects.equals(supported, durationField.supported) &&
        Objects.equals(precise, durationField.precise) &&
        Objects.equals(unitMillis, durationField.unitMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, precise, unitMillis);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    precise: ").append(toIndentedString(precise)).append("\n");
    sb.append("    unitMillis: ").append(toIndentedString(unitMillis)).append("\n");
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

