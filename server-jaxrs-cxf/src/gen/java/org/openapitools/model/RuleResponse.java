package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RuleResponse  {
  
  @ApiModelProperty(value = "")

  private Long ruleId;

  @ApiModelProperty(value = "")

  private String title;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Long ruleTypeId;

  @ApiModelProperty(value = "")

  private String ruleTypeTitle;

  @ApiModelProperty(value = "")

  private String ruleTypeDescription;

  @ApiModelProperty(value = "")

  private String ruleValueType;

  @ApiModelProperty(value = "")

  private String ruleValue;
 /**
   * Get ruleId
   * @return ruleId
  **/
  @JsonProperty("ruleId")
  public Long getRuleId() {
    return ruleId;
  }

  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }

  public RuleResponse ruleId(Long ruleId) {
    this.ruleId = ruleId;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RuleResponse title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RuleResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get ruleTypeId
   * @return ruleTypeId
  **/
  @JsonProperty("ruleTypeId")
  public Long getRuleTypeId() {
    return ruleTypeId;
  }

  public void setRuleTypeId(Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
  }

  public RuleResponse ruleTypeId(Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
    return this;
  }

 /**
   * Get ruleTypeTitle
   * @return ruleTypeTitle
  **/
  @JsonProperty("ruleTypeTitle")
  public String getRuleTypeTitle() {
    return ruleTypeTitle;
  }

  public void setRuleTypeTitle(String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
  }

  public RuleResponse ruleTypeTitle(String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
    return this;
  }

 /**
   * Get ruleTypeDescription
   * @return ruleTypeDescription
  **/
  @JsonProperty("ruleTypeDescription")
  public String getRuleTypeDescription() {
    return ruleTypeDescription;
  }

  public void setRuleTypeDescription(String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
  }

  public RuleResponse ruleTypeDescription(String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
    return this;
  }

 /**
   * Get ruleValueType
   * @return ruleValueType
  **/
  @JsonProperty("ruleValueType")
  public String getRuleValueType() {
    return ruleValueType;
  }

  public void setRuleValueType(String ruleValueType) {
    this.ruleValueType = ruleValueType;
  }

  public RuleResponse ruleValueType(String ruleValueType) {
    this.ruleValueType = ruleValueType;
    return this;
  }

 /**
   * Get ruleValue
   * @return ruleValue
  **/
  @JsonProperty("ruleValue")
  public String getRuleValue() {
    return ruleValue;
  }

  public void setRuleValue(String ruleValue) {
    this.ruleValue = ruleValue;
  }

  public RuleResponse ruleValue(String ruleValue) {
    this.ruleValue = ruleValue;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

