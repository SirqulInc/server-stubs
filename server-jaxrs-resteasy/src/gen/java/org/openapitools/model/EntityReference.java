package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EntityReference   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String entityType;
  private Long masterEntityId;
  private String slaveUID;
  private Long slaveEntityId;

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
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("masterEntityId")
  public Long getMasterEntityId() {
    return masterEntityId;
  }
  public void setMasterEntityId(Long masterEntityId) {
    this.masterEntityId = masterEntityId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("slaveUID")
  public String getSlaveUID() {
    return slaveUID;
  }
  public void setSlaveUID(String slaveUID) {
    this.slaveUID = slaveUID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("slaveEntityId")
  public Long getSlaveEntityId() {
    return slaveEntityId;
  }
  public void setSlaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityReference entityReference = (EntityReference) o;
    return Objects.equals(this.id, entityReference.id) &&
        Objects.equals(this.active, entityReference.active) &&
        Objects.equals(this.valid, entityReference.valid) &&
        Objects.equals(this.entityType, entityReference.entityType) &&
        Objects.equals(this.masterEntityId, entityReference.masterEntityId) &&
        Objects.equals(this.slaveUID, entityReference.slaveUID) &&
        Objects.equals(this.slaveEntityId, entityReference.slaveEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, entityType, masterEntityId, slaveUID, slaveEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    masterEntityId: ").append(toIndentedString(masterEntityId)).append("\n");
    sb.append("    slaveUID: ").append(toIndentedString(slaveUID)).append("\n");
    sb.append("    slaveEntityId: ").append(toIndentedString(slaveEntityId)).append("\n");
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

