package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Chronology;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Interval   {
  
  private Date end;
  private Date start;
  private Chronology chronology;
  private Long startMillis;
  private Long endMillis;
  private Boolean beforeNow;
  private Boolean afterNow;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("start")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chronology")
  @Valid
  public Chronology getChronology() {
    return chronology;
  }
  public void setChronology(Chronology chronology) {
    this.chronology = chronology;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("startMillis")
  public Long getStartMillis() {
    return startMillis;
  }
  public void setStartMillis(Long startMillis) {
    this.startMillis = startMillis;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endMillis")
  public Long getEndMillis() {
    return endMillis;
  }
  public void setEndMillis(Long endMillis) {
    this.endMillis = endMillis;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("beforeNow")
  public Boolean getBeforeNow() {
    return beforeNow;
  }
  public void setBeforeNow(Boolean beforeNow) {
    this.beforeNow = beforeNow;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("afterNow")
  public Boolean getAfterNow() {
    return afterNow;
  }
  public void setAfterNow(Boolean afterNow) {
    this.afterNow = afterNow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interval interval = (Interval) o;
    return Objects.equals(this.end, interval.end) &&
        Objects.equals(this.start, interval.start) &&
        Objects.equals(this.chronology, interval.chronology) &&
        Objects.equals(this.startMillis, interval.startMillis) &&
        Objects.equals(this.endMillis, interval.endMillis) &&
        Objects.equals(this.beforeNow, interval.beforeNow) &&
        Objects.equals(this.afterNow, interval.afterNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, chronology, startMillis, endMillis, beforeNow, afterNow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interval {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
    sb.append("    startMillis: ").append(toIndentedString(startMillis)).append("\n");
    sb.append("    endMillis: ").append(toIndentedString(endMillis)).append("\n");
    sb.append("    beforeNow: ").append(toIndentedString(beforeNow)).append("\n");
    sb.append("    afterNow: ").append(toIndentedString(afterNow)).append("\n");
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

