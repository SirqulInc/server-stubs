package org.openapitools.model;

import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Flag  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Account owner;

  @ApiModelProperty(value = "")

  private String flagableObjectType;

  @ApiModelProperty(value = "")

  private Long flagableObjectId;

  @ApiModelProperty(value = "")

  private String flagDescription;

  @ApiModelProperty(value = "")

  private String app;
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

  public Flag id(Long id) {
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

  public Flag active(Boolean active) {
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

  public Flag valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public Account getOwner() {
    return owner;
  }

  public void setOwner(Account owner) {
    this.owner = owner;
  }

  public Flag owner(Account owner) {
    this.owner = owner;
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

  public Flag flagableObjectType(String flagableObjectType) {
    this.flagableObjectType = flagableObjectType;
    return this;
  }

 /**
   * Get flagableObjectId
   * @return flagableObjectId
  **/
  @JsonProperty("flagableObjectId")
  public Long getFlagableObjectId() {
    return flagableObjectId;
  }

  public void setFlagableObjectId(Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
  }

  public Flag flagableObjectId(Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
    return this;
  }

 /**
   * Get flagDescription
   * @return flagDescription
  **/
  @JsonProperty("flagDescription")
  public String getFlagDescription() {
    return flagDescription;
  }

  public void setFlagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
  }

  public Flag flagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
    return this;
  }

 /**
   * Get app
   * @return app
  **/
  @JsonProperty("app")
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }

  public Flag app(String app) {
    this.app = app;
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
    Flag flag = (Flag) o;
    return Objects.equals(this.id, flag.id) &&
        Objects.equals(this.active, flag.active) &&
        Objects.equals(this.valid, flag.valid) &&
        Objects.equals(this.owner, flag.owner) &&
        Objects.equals(this.flagableObjectType, flag.flagableObjectType) &&
        Objects.equals(this.flagableObjectId, flag.flagableObjectId) &&
        Objects.equals(this.flagDescription, flag.flagDescription) &&
        Objects.equals(this.app, flag.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, flagableObjectType, flagableObjectId, flagDescription, app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    flagableObjectType: ").append(toIndentedString(flagableObjectType)).append("\n");
    sb.append("    flagableObjectId: ").append(toIndentedString(flagableObjectId)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

