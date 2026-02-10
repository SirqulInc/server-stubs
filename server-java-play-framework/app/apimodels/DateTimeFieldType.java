package apimodels;

import apimodels.DurationFieldType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DateTimeFieldType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DateTimeFieldType   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("rangeDurationType")
  @Valid

  private DurationFieldType rangeDurationType;

  @JsonProperty("durationType")
  @Valid

  private DurationFieldType durationType;

  public DateTimeFieldType name(String name) {
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

  public DateTimeFieldType rangeDurationType(DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
    return this;
  }

   /**
   * Get rangeDurationType
   * @return rangeDurationType
  **/
  public DurationFieldType getRangeDurationType() {
    return rangeDurationType;
  }

  public void setRangeDurationType(DurationFieldType rangeDurationType) {
    this.rangeDurationType = rangeDurationType;
  }

  public DateTimeFieldType durationType(DurationFieldType durationType) {
    this.durationType = durationType;
    return this;
  }

   /**
   * Get durationType
   * @return durationType
  **/
  public DurationFieldType getDurationType() {
    return durationType;
  }

  public void setDurationType(DurationFieldType durationType) {
    this.durationType = durationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeFieldType dateTimeFieldType = (DateTimeFieldType) o;
    return Objects.equals(name, dateTimeFieldType.name) &&
        Objects.equals(rangeDurationType, dateTimeFieldType.rangeDurationType) &&
        Objects.equals(durationType, dateTimeFieldType.durationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rangeDurationType, durationType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeFieldType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rangeDurationType: ").append(toIndentedString(rangeDurationType)).append("\n");
    sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
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

