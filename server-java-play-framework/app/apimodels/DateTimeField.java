package apimodels;

import apimodels.DateTimeFieldType;
import apimodels.DurationField;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DateTimeField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DateTimeField   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("type")
  @Valid

  private DateTimeFieldType type;

  @JsonProperty("supported")
  
  private Boolean supported;

  @JsonProperty("minimumValue")
  
  private Integer minimumValue;

  @JsonProperty("maximumValue")
  
  private Integer maximumValue;

  @JsonProperty("durationField")
  @Valid

  private DurationField durationField;

  @JsonProperty("leapDurationField")
  @Valid

  private DurationField leapDurationField;

  @JsonProperty("rangeDurationField")
  @Valid

  private DurationField rangeDurationField;

  @JsonProperty("lenient")
  
  private Boolean lenient;

  public DateTimeField name(String name) {
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

  public DateTimeField type(DateTimeFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public DateTimeFieldType getType() {
    return type;
  }

  public void setType(DateTimeFieldType type) {
    this.type = type;
  }

  public DateTimeField supported(Boolean supported) {
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

  public DateTimeField minimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

   /**
   * Get minimumValue
   * @return minimumValue
  **/
  public Integer getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  public DateTimeField maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Get maximumValue
   * @return maximumValue
  **/
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DateTimeField durationField(DurationField durationField) {
    this.durationField = durationField;
    return this;
  }

   /**
   * Get durationField
   * @return durationField
  **/
  public DurationField getDurationField() {
    return durationField;
  }

  public void setDurationField(DurationField durationField) {
    this.durationField = durationField;
  }

  public DateTimeField leapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
    return this;
  }

   /**
   * Get leapDurationField
   * @return leapDurationField
  **/
  public DurationField getLeapDurationField() {
    return leapDurationField;
  }

  public void setLeapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
  }

  public DateTimeField rangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
    return this;
  }

   /**
   * Get rangeDurationField
   * @return rangeDurationField
  **/
  public DurationField getRangeDurationField() {
    return rangeDurationField;
  }

  public void setRangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
  }

  public DateTimeField lenient(Boolean lenient) {
    this.lenient = lenient;
    return this;
  }

   /**
   * Get lenient
   * @return lenient
  **/
  public Boolean getLenient() {
    return lenient;
  }

  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeField dateTimeField = (DateTimeField) o;
    return Objects.equals(name, dateTimeField.name) &&
        Objects.equals(type, dateTimeField.type) &&
        Objects.equals(supported, dateTimeField.supported) &&
        Objects.equals(minimumValue, dateTimeField.minimumValue) &&
        Objects.equals(maximumValue, dateTimeField.maximumValue) &&
        Objects.equals(durationField, dateTimeField.durationField) &&
        Objects.equals(leapDurationField, dateTimeField.leapDurationField) &&
        Objects.equals(rangeDurationField, dateTimeField.rangeDurationField) &&
        Objects.equals(lenient, dateTimeField.lenient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, minimumValue, maximumValue, durationField, leapDurationField, rangeDurationField, lenient);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    durationField: ").append(toIndentedString(durationField)).append("\n");
    sb.append("    leapDurationField: ").append(toIndentedString(leapDurationField)).append("\n");
    sb.append("    rangeDurationField: ").append(toIndentedString(rangeDurationField)).append("\n");
    sb.append("    lenient: ").append(toIndentedString(lenient)).append("\n");
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

