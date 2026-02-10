package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FilterTreeResponse  {
  
  @ApiModelProperty(value = "")

  private Long filterId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private Integer subFilterCount;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalType;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid FilterTreeResponse> children = new ArrayList<>();
 /**
   * Get filterId
   * @return filterId
  **/
  @JsonProperty("filterId")
  public Long getFilterId() {
    return filterId;
  }

  public void setFilterId(Long filterId) {
    this.filterId = filterId;
  }

  public FilterTreeResponse filterId(Long filterId) {
    this.filterId = filterId;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterTreeResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get display
   * @return display
  **/
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public FilterTreeResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get subFilterCount
   * @return subFilterCount
  **/
  @JsonProperty("subFilterCount")
  public Integer getSubFilterCount() {
    return subFilterCount;
  }

  public void setSubFilterCount(Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
  }

  public FilterTreeResponse subFilterCount(Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
    return this;
  }

 /**
   * Get parentId
   * @return parentId
  **/
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public FilterTreeResponse parentId(Long parentId) {
    this.parentId = parentId;
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

  public FilterTreeResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public FilterTreeResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get externalId
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FilterTreeResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get externalType
   * @return externalType
  **/
  @JsonProperty("externalType")
  public String getExternalType() {
    return externalType;
  }

  public void setExternalType(String externalType) {
    this.externalType = externalType;
  }

  public FilterTreeResponse externalType(String externalType) {
    this.externalType = externalType;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid FilterTreeResponse> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid FilterTreeResponse> children) {
    this.children = children;
  }

  public FilterTreeResponse children(List<@Valid FilterTreeResponse> children) {
    this.children = children;
    return this;
  }

  public FilterTreeResponse addChildrenItem(FilterTreeResponse childrenItem) {
    this.children.add(childrenItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

