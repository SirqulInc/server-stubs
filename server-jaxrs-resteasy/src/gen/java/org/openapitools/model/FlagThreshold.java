package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Application;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FlagThreshold   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Long threshold;
  private String flagableObjectType;
  private Application application;

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
  @JsonProperty("threshold")
  public Long getThreshold() {
    return threshold;
  }
  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagableObjectType")
  public String getFlagableObjectType() {
    return flagableObjectType;
  }
  public void setFlagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

