package org.openapitools.model;

import org.openapitools.model.Application;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FlagThreshold  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private Long threshold;

  @ApiModelProperty(value = "")

  private String flagableObjectType;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;
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

  public FlagThreshold id(Long id) {
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

  public FlagThreshold active(Boolean active) {
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

  public FlagThreshold valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get threshold
   * @return threshold
  **/
  @JsonProperty("threshold")
  public Long getThreshold() {
    return threshold;
  }

  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  public FlagThreshold threshold(Long threshold) {
    this.threshold = threshold;
    return this;
  }

 /**
   * Get flagableObjectType
   * @return flagableObjectType
  **/
  @JsonProperty("flagableObjectType")
  public String getFlagableObjectType() {
    return flagableObjectType;
  }

  public void setFlagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
  }

  public FlagThreshold flagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public FlagThreshold application(Application application) {
    this.application = application;
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
    FlagThreshold flagThreshold = (FlagThreshold) o;
    return Objects.equals(this.id, flagThreshold.id) &&
        Objects.equals(this.active, flagThreshold.active) &&
        Objects.equals(this.valid, flagThreshold.valid) &&
        Objects.equals(this.threshold, flagThreshold.threshold) &&
        Objects.equals(this.flagableObjectType, flagThreshold.flagableObjectType) &&
        Objects.equals(this.application, flagThreshold.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, threshold, flagableObjectType, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagThreshold {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    flagableObjectType: ").append(toIndentedString(flagableObjectType)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

