package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RuleResponse   {
  @JsonProperty("ruleId")
  
  private Long ruleId;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("ruleTypeId")
  
  private Long ruleTypeId;

  @JsonProperty("ruleTypeTitle")
  
  private String ruleTypeTitle;

  @JsonProperty("ruleTypeDescription")
  
  private String ruleTypeDescription;

  @JsonProperty("ruleValueType")
  
  private String ruleValueType;

  @JsonProperty("ruleValue")
  
  private String ruleValue;

  public RuleResponse ruleId(Long ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  public Long getRuleId() {
    return ruleId;
  }

  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }

  public RuleResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RuleResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RuleResponse ruleTypeId(Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
    return this;
  }

   /**
   * Get ruleTypeId
   * @return ruleTypeId
  **/
  public Long getRuleTypeId() {
    return ruleTypeId;
  }

  public void setRuleTypeId(Long ruleTypeId) {
    this.ruleTypeId = ruleTypeId;
  }

  public RuleResponse ruleTypeTitle(String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
    return this;
  }

   /**
   * Get ruleTypeTitle
   * @return ruleTypeTitle
  **/
  public String getRuleTypeTitle() {
    return ruleTypeTitle;
  }

  public void setRuleTypeTitle(String ruleTypeTitle) {
    this.ruleTypeTitle = ruleTypeTitle;
  }

  public RuleResponse ruleTypeDescription(String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
    return this;
  }

   /**
   * Get ruleTypeDescription
   * @return ruleTypeDescription
  **/
  public String getRuleTypeDescription() {
    return ruleTypeDescription;
  }

  public void setRuleTypeDescription(String ruleTypeDescription) {
    this.ruleTypeDescription = ruleTypeDescription;
  }

  public RuleResponse ruleValueType(String ruleValueType) {
    this.ruleValueType = ruleValueType;
    return this;
  }

   /**
   * Get ruleValueType
   * @return ruleValueType
  **/
  public String getRuleValueType() {
    return ruleValueType;
  }

  public void setRuleValueType(String ruleValueType) {
    this.ruleValueType = ruleValueType;
  }

  public RuleResponse ruleValue(String ruleValue) {
    this.ruleValue = ruleValue;
    return this;
  }

   /**
   * Get ruleValue
   * @return ruleValue
  **/
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
    return Objects.equals(ruleId, ruleResponse.ruleId) &&
        Objects.equals(title, ruleResponse.title) &&
        Objects.equals(description, ruleResponse.description) &&
        Objects.equals(ruleTypeId, ruleResponse.ruleTypeId) &&
        Objects.equals(ruleTypeTitle, ruleResponse.ruleTypeTitle) &&
        Objects.equals(ruleTypeDescription, ruleResponse.ruleTypeDescription) &&
        Objects.equals(ruleValueType, ruleResponse.ruleValueType) &&
        Objects.equals(ruleValue, ruleResponse.ruleValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, title, description, ruleTypeId, ruleTypeTitle, ruleTypeDescription, ruleValueType, ruleValue);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

