package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterTreeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FilterTreeResponse   {
  @JsonProperty("filterId")
  
  private Long filterId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("subFilterCount")
  
  private Integer subFilterCount;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("externalType")
  
  private String externalType;

  @JsonProperty("children")
  @Valid

  private List<@Valid FilterTreeResponse> children = null;

  public FilterTreeResponse filterId(Long filterId) {
    this.filterId = filterId;
    return this;
  }

   /**
   * Get filterId
   * @return filterId
  **/
  public Long getFilterId() {
    return filterId;
  }

  public void setFilterId(Long filterId) {
    this.filterId = filterId;
  }

  public FilterTreeResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterTreeResponse display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public FilterTreeResponse subFilterCount(Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
    return this;
  }

   /**
   * Get subFilterCount
   * @return subFilterCount
  **/
  public Integer getSubFilterCount() {
    return subFilterCount;
  }

  public void setSubFilterCount(Integer subFilterCount) {
    this.subFilterCount = subFilterCount;
  }

  public FilterTreeResponse parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public FilterTreeResponse description(String description) {
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

  public FilterTreeResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public FilterTreeResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FilterTreeResponse externalType(String externalType) {
    this.externalType = externalType;
    return this;
  }

   /**
   * Get externalType
   * @return externalType
  **/
  public String getExternalType() {
    return externalType;
  }

  public void setExternalType(String externalType) {
    this.externalType = externalType;
  }

  public FilterTreeResponse children(List<@Valid FilterTreeResponse> children) {
    this.children = children;
    return this;
  }

  public FilterTreeResponse addChildrenItem(FilterTreeResponse childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
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
    return Objects.equals(filterId, filterTreeResponse.filterId) &&
        Objects.equals(name, filterTreeResponse.name) &&
        Objects.equals(display, filterTreeResponse.display) &&
        Objects.equals(subFilterCount, filterTreeResponse.subFilterCount) &&
        Objects.equals(parentId, filterTreeResponse.parentId) &&
        Objects.equals(description, filterTreeResponse.description) &&
        Objects.equals(active, filterTreeResponse.active) &&
        Objects.equals(externalId, filterTreeResponse.externalId) &&
        Objects.equals(externalType, filterTreeResponse.externalType) &&
        Objects.equals(children, filterTreeResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId, name, display, subFilterCount, parentId, description, active, externalId, externalType, children);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

