package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FilterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FilterResponse   {
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

  public FilterResponse filterId(Long filterId) {
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

  public FilterResponse name(String name) {
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

  public FilterResponse display(String display) {
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

  public FilterResponse subFilterCount(Integer subFilterCount) {
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

  public FilterResponse parentId(Long parentId) {
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

  public FilterResponse description(String description) {
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

  public FilterResponse active(Boolean active) {
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

  public FilterResponse externalId(String externalId) {
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

  public FilterResponse externalType(String externalType) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterResponse filterResponse = (FilterResponse) o;
    return Objects.equals(filterId, filterResponse.filterId) &&
        Objects.equals(name, filterResponse.name) &&
        Objects.equals(display, filterResponse.display) &&
        Objects.equals(subFilterCount, filterResponse.subFilterCount) &&
        Objects.equals(parentId, filterResponse.parentId) &&
        Objects.equals(description, filterResponse.description) &&
        Objects.equals(active, filterResponse.active) &&
        Objects.equals(externalId, filterResponse.externalId) &&
        Objects.equals(externalType, filterResponse.externalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterId, name, display, subFilterCount, parentId, description, active, externalId, externalType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterResponse {\n");
    
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    subFilterCount: ").append(toIndentedString(subFilterCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
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

