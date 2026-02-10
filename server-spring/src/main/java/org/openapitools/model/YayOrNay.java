package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Account;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * YayOrNay
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class YayOrNay {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable Account owner;

  private @Nullable Boolean yayOrNay;

  private @Nullable String likableObjectType;

  private @Nullable Long likableObjectId;

  public YayOrNay id(@Nullable Long id) {
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

  public YayOrNay active(@Nullable Boolean active) {
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

  public YayOrNay valid(@Nullable Boolean valid) {
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

  public YayOrNay owner(@Nullable Account owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable Account getOwner() {
    return owner;
  }

  public void setOwner(@Nullable Account owner) {
    this.owner = owner;
  }

  public YayOrNay yayOrNay(@Nullable Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
    return this;
  }

  /**
   * Get yayOrNay
   * @return yayOrNay
   */
  
  @Schema(name = "yayOrNay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yayOrNay")
  public @Nullable Boolean getYayOrNay() {
    return yayOrNay;
  }

  public void setYayOrNay(@Nullable Boolean yayOrNay) {
    this.yayOrNay = yayOrNay;
  }

  public YayOrNay likableObjectType(@Nullable String likableObjectType) {
    this.likableObjectType = likableObjectType;
    return this;
  }

  /**
   * Get likableObjectType
   * @return likableObjectType
   */
  
  @Schema(name = "likableObjectType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likableObjectType")
  public @Nullable String getLikableObjectType() {
    return likableObjectType;
  }

  public void setLikableObjectType(@Nullable String likableObjectType) {
    this.likableObjectType = likableObjectType;
  }

  public YayOrNay likableObjectId(@Nullable Long likableObjectId) {
    this.likableObjectId = likableObjectId;
    return this;
  }

  /**
   * Get likableObjectId
   * @return likableObjectId
   */
  
  @Schema(name = "likableObjectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likableObjectId")
  public @Nullable Long getLikableObjectId() {
    return likableObjectId;
  }

  public void setLikableObjectId(@Nullable Long likableObjectId) {
    this.likableObjectId = likableObjectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YayOrNay yayOrNay = (YayOrNay) o;
    return Objects.equals(this.id, yayOrNay.id) &&
        Objects.equals(this.active, yayOrNay.active) &&
        Objects.equals(this.valid, yayOrNay.valid) &&
        Objects.equals(this.owner, yayOrNay.owner) &&
        Objects.equals(this.yayOrNay, yayOrNay.yayOrNay) &&
        Objects.equals(this.likableObjectType, yayOrNay.likableObjectType) &&
        Objects.equals(this.likableObjectId, yayOrNay.likableObjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, owner, yayOrNay, likableObjectType, likableObjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YayOrNay {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    yayOrNay: ").append(toIndentedString(yayOrNay)).append("\n");
    sb.append("    likableObjectType: ").append(toIndentedString(likableObjectType)).append("\n");
    sb.append("    likableObjectId: ").append(toIndentedString(likableObjectId)).append("\n");
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

