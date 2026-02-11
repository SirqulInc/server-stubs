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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class RuleResponse   {
  
  private Long ruleId;
  private String title;
  private String description;
  private Long ruleTypeId;
  private String ruleTypeTitle;
  private String ruleTypeDescription;
  private String ruleValueType;
  private String ruleValue;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleId")
  public Long getRuleId() {
    return ruleId;
  }
  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleTypeId")
  public Long getRuleTypeId() {
    return ruleTypeId;
  }
  public void setRuleTypeId(Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleTypeTitle")
  public String getRuleTypeTitle() {
    return ruleTypeTitle;
  }
  public void setRuleTypeTitle(String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleTypeDescription")
  public String getRuleTypeDescription() {
    return ruleTypeDescription;
  }
  public void setRuleTypeDescription(String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleValueType")
  public String getRuleValueType() {
    return ruleValueType;
  }
  public void setRuleValueType(String ruleValueType) {
    this.ruleValueType = ruleValueType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ruleValue")
  public String getRuleValue() {
    return ruleValue;
  }
  public void setRuleValue(String ruleValue) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

