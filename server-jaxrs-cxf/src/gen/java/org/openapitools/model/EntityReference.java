package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EntityReference  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String entityType;

  @ApiModelProperty(value = "")

  private Long masterEntityId;

  @ApiModelProperty(value = "")

  private String slaveUID;

  @ApiModelProperty(value = "")

  private Long slaveEntityId;
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

  public EntityReference id(Long id) {
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

  public EntityReference active(Boolean active) {
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

  public EntityReference valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get entityType
   * @return entityType
  **/
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public EntityReference entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

 /**
   * Get masterEntityId
   * @return masterEntityId
  **/
  @JsonProperty("masterEntityId")
  public Long getMasterEntityId() {
    return masterEntityId;
  }

  public void setMasterEntityId(Long masterEntityId) {
    this.masterEntityId = masterEntityId;
  }

  public EntityReference masterEntityId(Long masterEntityId) {
    this.masterEntityId = masterEntityId;
    return this;
  }

 /**
   * Get slaveUID
   * @return slaveUID
  **/
  @JsonProperty("slaveUID")
  public String getSlaveUID() {
    return slaveUID;
  }

  public void setSlaveUID(String slaveUID) {
    this.slaveUID = slaveUID;
  }

  public EntityReference slaveUID(String slaveUID) {
    this.slaveUID = slaveUID;
    return this;
  }

 /**
   * Get slaveEntityId
   * @return slaveEntityId
  **/
  @JsonProperty("slaveEntityId")
  public Long getSlaveEntityId() {
    return slaveEntityId;
  }

  public void setSlaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
  }

  public EntityReference slaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

