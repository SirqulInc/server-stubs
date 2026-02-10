package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EntityReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EntityReference   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("entityType")
  
  private String entityType;

  @JsonProperty("masterEntityId")
  
  private Long masterEntityId;

  @JsonProperty("slaveUID")
  
  private String slaveUID;

  @JsonProperty("slaveEntityId")
  
  private Long slaveEntityId;

  public EntityReference id(Long id) {
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

  public EntityReference active(Boolean active) {
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

  public EntityReference valid(Boolean valid) {
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

  public EntityReference entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public EntityReference masterEntityId(Long masterEntityId) {
    this.masterEntityId = masterEntityId;
    return this;
  }

   /**
   * Get masterEntityId
   * @return masterEntityId
  **/
  public Long getMasterEntityId() {
    return masterEntityId;
  }

  public void setMasterEntityId(Long masterEntityId) {
    this.masterEntityId = masterEntityId;
  }

  public EntityReference slaveUID(String slaveUID) {
    this.slaveUID = slaveUID;
    return this;
  }

   /**
   * Get slaveUID
   * @return slaveUID
  **/
  public String getSlaveUID() {
    return slaveUID;
  }

  public void setSlaveUID(String slaveUID) {
    this.slaveUID = slaveUID;
  }

  public EntityReference slaveEntityId(Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
    return this;
  }

   /**
   * Get slaveEntityId
   * @return slaveEntityId
  **/
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
    return Objects.equals(id, entityReference.id) &&
        Objects.equals(active, entityReference.active) &&
        Objects.equals(valid, entityReference.valid) &&
        Objects.equals(entityType, entityReference.entityType) &&
        Objects.equals(masterEntityId, entityReference.masterEntityId) &&
        Objects.equals(slaveUID, entityReference.slaveUID) &&
        Objects.equals(slaveEntityId, entityReference.slaveEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, entityType, masterEntityId, slaveUID, slaveEntityId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

