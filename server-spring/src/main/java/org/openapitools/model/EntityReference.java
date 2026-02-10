package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EntityReference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class EntityReference {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String entityType;

  private @Nullable Long masterEntityId;

  private @Nullable String slaveUID;

  private @Nullable Long slaveEntityId;

  public EntityReference id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public EntityReference active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public EntityReference valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public EntityReference entityType(@Nullable String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
   */
  
  @Schema(name = "entityType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityType")
  public @Nullable String getEntityType() {
    return entityType;
  }

  public void setEntityType(@Nullable String entityType) {
    this.entityType = entityType;
  }

  public EntityReference masterEntityId(@Nullable Long masterEntityId) {
    this.masterEntityId = masterEntityId;
    return this;
  }

  /**
   * Get masterEntityId
   * @return masterEntityId
   */
  
  @Schema(name = "masterEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("masterEntityId")
  public @Nullable Long getMasterEntityId() {
    return masterEntityId;
  }

  public void setMasterEntityId(@Nullable Long masterEntityId) {
    this.masterEntityId = masterEntityId;
  }

  public EntityReference slaveUID(@Nullable String slaveUID) {
    this.slaveUID = slaveUID;
    return this;
  }

  /**
   * Get slaveUID
   * @return slaveUID
   */
  
  @Schema(name = "slaveUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaveUID")
  public @Nullable String getSlaveUID() {
    return slaveUID;
  }

  public void setSlaveUID(@Nullable String slaveUID) {
    this.slaveUID = slaveUID;
  }

  public EntityReference slaveEntityId(@Nullable Long slaveEntityId) {
    this.slaveEntityId = slaveEntityId;
    return this;
  }

  /**
   * Get slaveEntityId
   * @return slaveEntityId
   */
  
  @Schema(name = "slaveEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaveEntityId")
  public @Nullable Long getSlaveEntityId() {
    return slaveEntityId;
  }

  public void setSlaveEntityId(@Nullable Long slaveEntityId) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

