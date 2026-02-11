package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FilterTreeResponse   {
  
  private Long filterId;
  private String name;
  private String display;
  private Integer subFilterCount;
  private Long parentId;
  private String description;
  private Boolean active;
  private String externalId;
  private String externalType;
  private List<@Valid FilterTreeResponse> children = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filterId")
  public Long getFilterId() {
    return filterId;
  }
  public void setFilterId(Long filterId) {
    this.filterId = filterId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("subFilterCount")
  public Integer getSubFilterCount() {
    return subFilterCount;
  }
  public void setSubFilterCount(Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
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
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalType")
  public String getExternalType() {
    return externalType;
  }
  public void setExternalType(String externalType) {
    this.externalType = externalType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  @Valid
  public List<@Valid FilterTreeResponse> getChildren() {
    return children;
  }
  public void setChildren(List<@Valid FilterTreeResponse> children) {
    this.children = children;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterTreeResponse filterTreeResponse = (FilterTreeResponse) o;
    return Objects.equals(this.filterId, filterTreeResponse.filterId) &&
        Objects.equals(this.name, filterTreeResponse.name) &&
        Objects.equals(this.display, filterTreeResponse.display) &&
        Objects.equals(this.subFilterCount, filterTreeResponse.subFilterCount) &&
        Objects.equals(this.parentId, filterTreeResponse.parentId) &&
        Objects.equals(this.description, filterTreeResponse.description) &&
        Objects.equals(this.active, filterTreeResponse.active) &&
        Objects.equals(this.externalId, filterTreeResponse.externalId) &&
        Objects.equals(this.externalType, filterTreeResponse.externalType) &&
        Objects.equals(this.children, filterTreeResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId, name, display, subFilterCount, parentId, description, active, externalId, externalType, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterTreeResponse {\n");
    
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    subFilterCount: ").append(toIndentedString(subFilterCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

