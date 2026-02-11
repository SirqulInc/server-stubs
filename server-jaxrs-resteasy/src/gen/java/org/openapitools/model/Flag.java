package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Account;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Flag   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Account owner;
  private String flagableObjectType;
  private Long flagableObjectId;
  private String flagDescription;
  private String app;

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
  @JsonProperty("owner")
  @Valid
  public Account getOwner() {
    return owner;
  }
  public void setOwner(Account owner) {
    this.owner = owner;
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
  @JsonProperty("flagableObjectId")
  public Long getFlagableObjectId() {
    return flagableObjectId;
  }
  public void setFlagableObjectId(Long flagableObjectId) {
    this.flagableObjectId = flagableObjectId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagDescription")
  public String getFlagDescription() {
    return flagDescription;
  }
  public void setFlagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("app")
  public String getApp() {
    return app;
  }
  public void setApp(String app) {
    this.app = app;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

