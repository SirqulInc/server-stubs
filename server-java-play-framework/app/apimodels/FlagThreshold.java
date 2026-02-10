package apimodels;

import apimodels.Application;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FlagThreshold
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FlagThreshold   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("threshold")
  
  private Long threshold;

  @JsonProperty("flagableObjectType")
  
  private String flagableObjectType;

  @JsonProperty("application")
  @Valid

  private Application application;

  public FlagThreshold id(Long id) {
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

  public FlagThreshold active(Boolean active) {
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

  public FlagThreshold valid(Boolean valid) {
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

  public FlagThreshold threshold(Long threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  public Long getThreshold() {
    return threshold;
  }

  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  public FlagThreshold flagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
    return this;
  }

   /**
   * Get flagableObjectType
   * @return flagableObjectType
  **/
  public String getFlagableObjectType() {
    return flagableObjectType;
  }

  public void setFlagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
  }

  public FlagThreshold application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
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
    return Objects.equals(id, flagThreshold.id) &&
        Objects.equals(active, flagThreshold.active) &&
        Objects.equals(valid, flagThreshold.valid) &&
        Objects.equals(threshold, flagThreshold.threshold) &&
        Objects.equals(flagableObjectType, flagThreshold.flagableObjectType) &&
        Objects.equals(application, flagThreshold.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, threshold, flagableObjectType, application);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

