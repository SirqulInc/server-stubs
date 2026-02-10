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
public class FlagResponse   {
  
  private Long flagId;
  private Long flagableId;
  private String flagableType;
  private String flagDescription;
  private Long createdDate;
  private Long updatedDate;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagId")
  public Long getFlagId() {
    return flagId;
  }
  public void setFlagId(Long flagId) {
    this.flagId = flagId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagableId")
  public Long getFlagableId() {
    return flagableId;
  }
  public void setFlagableId(Long flagableId) {
    this.flagableId = flagableId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagableType")
  public String getFlagableType() {
    return flagableType;
  }
  public void setFlagableType(String flagableType) {
    this.flagableType = flagableType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("flagDescription")
  public String getFlagDescription() {
    return flagDescription;
  }
  public void setFlagDescription(String flagDescription) {
    this.flagDescription = flagDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("createdDate")
  public Long getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updatedDate")
  public Long getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Long updatedDate) {
    this.updatedDate = updatedDate;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

