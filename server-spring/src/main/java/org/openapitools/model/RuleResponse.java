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
 * RuleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RuleResponse {

  private @Nullable Long ruleId;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable Long ruleTypeId;

  private @Nullable String ruleTypeTitle;

  private @Nullable String ruleTypeDescription;

  private @Nullable String ruleValueType;

  private @Nullable String ruleValue;

  public RuleResponse ruleId(@Nullable Long ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Get ruleId
   * @return ruleId
   */
  
  @Schema(name = "ruleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleId")
  public @Nullable Long getRuleId() {
    return ruleId;
  }

  public void setRuleId(@Nullable Long ruleId) {
    this.ruleId = ruleId;
  }

  public RuleResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public RuleResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public RuleResponse ruleTypeId(@Nullable Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
    return this;
  }

  /**
   * Get ruleTypeId
   * @return ruleTypeId
   */
  
  @Schema(name = "ruleTypeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleTypeId")
  public @Nullable Long getRuleTypeId() {
    return ruleTypeId;
  }

  public void setRuleTypeId(@Nullable Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
  }

  public RuleResponse ruleTypeTitle(@Nullable String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
    return this;
  }

  /**
   * Get ruleTypeTitle
   * @return ruleTypeTitle
   */
  
  @Schema(name = "ruleTypeTitle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleTypeTitle")
  public @Nullable String getRuleTypeTitle() {
    return ruleTypeTitle;
  }

  public void setRuleTypeTitle(@Nullable String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
  }

  public RuleResponse ruleTypeDescription(@Nullable String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
    return this;
  }

  /**
   * Get ruleTypeDescription
   * @return ruleTypeDescription
   */
  
  @Schema(name = "ruleTypeDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleTypeDescription")
  public @Nullable String getRuleTypeDescription() {
    return ruleTypeDescription;
  }

  public void setRuleTypeDescription(@Nullable String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
  }

  public RuleResponse ruleValueType(@Nullable String ruleValueType) {
    this.ruleValueType = ruleValueType;
    return this;
  }

  /**
   * Get ruleValueType
   * @return ruleValueType
   */
  
  @Schema(name = "ruleValueType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleValueType")
  public @Nullable String getRuleValueType() {
    return ruleValueType;
  }

  public void setRuleValueType(@Nullable String ruleValueType) {
    this.ruleValueType = ruleValueType;
  }

  public RuleResponse ruleValue(@Nullable String ruleValue) {
    this.ruleValue = ruleValue;
    return this;
  }

  /**
   * Get ruleValue
   * @return ruleValue
   */
  
  @Schema(name = "ruleValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ruleValue")
  public @Nullable String getRuleValue() {
    return ruleValue;
  }

  public void setRuleValue(@Nullable String ruleValue) {
    this.ruleValue = ruleValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleResponse ruleResponse = (RuleResponse) o;
    return Objects.equals(this.ruleId, ruleResponse.ruleId) &&
        Objects.equals(this.title, ruleResponse.title) &&
        Objects.equals(this.description, ruleResponse.description) &&
        Objects.equals(this.ruleTypeId, ruleResponse.ruleTypeId) &&
        Objects.equals(this.ruleTypeTitle, ruleResponse.ruleTypeTitle) &&
        Objects.equals(this.ruleTypeDescription, ruleResponse.ruleTypeDescription) &&
        Objects.equals(this.ruleValueType, ruleResponse.ruleValueType) &&
        Objects.equals(this.ruleValue, ruleResponse.ruleValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, title, description, ruleTypeId, ruleTypeTitle, ruleTypeDescription, ruleValueType, ruleValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleResponse {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ruleTypeId: ").append(toIndentedString(ruleTypeId)).append("\n");
    sb.append("    ruleTypeTitle: ").append(toIndentedString(ruleTypeTitle)).append("\n");
    sb.append("    ruleTypeDescription: ").append(toIndentedString(ruleTypeDescription)).append("\n");
    sb.append("    ruleValueType: ").append(toIndentedString(ruleValueType)).append("\n");
    sb.append("    ruleValue: ").append(toIndentedString(ruleValue)).append("\n");
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

