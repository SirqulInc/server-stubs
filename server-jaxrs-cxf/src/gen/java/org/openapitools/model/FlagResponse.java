package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FlagResponse  {
  
  @ApiModelProperty(value = "")

  private Long flagId;

  @ApiModelProperty(value = "")

  private Long flagableId;

  @ApiModelProperty(value = "")

  private String flagableType;

  @ApiModelProperty(value = "")

  private String flagDescription;

  @ApiModelProperty(value = "")

  private Long createdDate;

  @ApiModelProperty(value = "")

  private Long updatedDate;
 /**
   * Get flagId
   * @return flagId
  **/
  @JsonProperty("flagId")
  public Long getFlagId() {
    return flagId;
  }

  public void setFlagId(Long flagId) {
    this.flagId = flagId;
  }

  public FlagResponse flagId(Long flagId) {
    this.flagId = flagId;
    return this;
  }

 /**
   * Get flagableId
   * @return flagableId
  **/
  @JsonProperty("flagableId")
  public Long getFlagableId() {
    return flagableId;
  }

  public void setFlagableId(Long flagableId) {
    this.flagableId = flagableId;
  }

  public FlagResponse flagableId(Long flagableId) {
    this.flagableId = flagableId;
    return this;
  }

 /**
   * Get flagableType
   * @return flagableType
  **/
  @JsonProperty("flagableType")
  public String getFlagableType() {
    return flagableType;
  }

  public void setFlagableType(String flagableType) {
    this.flagableType = flagableType;
  }

  public FlagResponse flagableType(String flagableType) {
    this.flagableType = flagableType;
    return this;
  }

 /**
   * Get flagDescription
   * @return flagDescription
  **/
  @JsonProperty("flagDescription")
  public String getFlagDescription() {
    return flagDescription;
  }

  public void setFlagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
  }

  public FlagResponse flagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
    return this;
  }

 /**
   * Get createdDate
   * @return createdDate
  **/
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public FlagResponse createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

 /**
   * Get updatedDate
   * @return updatedDate
  **/
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
  }

  public FlagResponse updatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
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
    FlagResponse flagResponse = (FlagResponse) o;
    return Objects.equals(this.flagId, flagResponse.flagId) &&
        Objects.equals(this.flagableId, flagResponse.flagableId) &&
        Objects.equals(this.flagableType, flagResponse.flagableType) &&
        Objects.equals(this.flagDescription, flagResponse.flagDescription) &&
        Objects.equals(this.createdDate, flagResponse.createdDate) &&
        Objects.equals(this.updatedDate, flagResponse.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flagId, flagableId, flagableType, flagDescription, createdDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlagResponse {\n");
    
    sb.append("    flagId: ").append(toIndentedString(flagId)).append("\n");
    sb.append("    flagableId: ").append(toIndentedString(flagableId)).append("\n");
    sb.append("    flagableType: ").append(toIndentedString(flagableType)).append("\n");
    sb.append("    flagDescription: ").append(toIndentedString(flagDescription)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

