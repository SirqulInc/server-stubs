package apimodels;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Recurrence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Recurrence   {
  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY"),
    
    ANNUALLY("ANNUALLY"),
    
    WEEK_DAY_ONLY("WEEK_DAY_ONLY");

    private final String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("frequency")
  
  private FrequencyEnum frequency;

  @JsonProperty("daysOfWeek")
  
  private List<Integer> daysOfWeek = null;

  @JsonProperty("start")
  @Valid

  private LocalDate start;

  @JsonProperty("count")
  
  private Integer count;

  @JsonProperty("until")
  @Valid

  private LocalDate until;

  public Recurrence frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public Recurrence daysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Recurrence addDaysOfWeekItem(Integer daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Get daysOfWeek
   * @return daysOfWeek
  **/
  public List<Integer> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<Integer> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public Recurrence start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public LocalDate getStart() {
    return start;
  }

  public void setStart(LocalDate start) {
    this.start = start;
  }

  public Recurrence count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Recurrence until(LocalDate until) {
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  public LocalDate getUntil() {
    return until;
  }

  public void setUntil(LocalDate until) {
    this.until = until;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(frequency, recurrence.frequency) &&
        Objects.equals(daysOfWeek, recurrence.daysOfWeek) &&
        Objects.equals(start, recurrence.start) &&
        Objects.equals(count, recurrence.count) &&
        Objects.equals(until, recurrence.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, daysOfWeek, start, count, until);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

