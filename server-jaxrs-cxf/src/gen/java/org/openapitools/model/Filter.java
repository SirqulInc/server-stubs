package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Application;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Filter  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  @Valid

  private Filter parent;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Filter> children = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalType;

  @ApiModelProperty(value = "")

  private String tree;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Filter id(Long id) {
    this.id = id;
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

  public Filter active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Filter valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

 /**
   * Get application
   * @return application
  **/
  @JsonProperty("application")
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Filter application(Application application) {
    this.application = application;
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

  public Filter name(String name) {
    this.name = name;
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

  public Filter description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public Filter getParent() {
    return parent;
  }

  public void setParent(Filter parent) {
    this.parent = parent;
  }

  public Filter parent(Filter parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid Filter> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Filter> children) {
    this.children = children;
  }

  public Filter children(List<@Valid Filter> children) {
    this.children = children;
    return this;
  }

  public Filter addChildrenItem(Filter childrenItem) {
    this.children.add(childrenItem);
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

  public Filter display(String display) {
    this.display = display;
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

  public Filter externalId(String externalId) {
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

  public Filter externalType(String externalType) {
    this.externalType = externalType;
    return this;
  }

 /**
   * Get tree
   * @return tree
  **/
  @JsonProperty("tree")
  public String getTree() {
    return tree;
  }

  public void setTree(String tree) {
    this.tree = tree;
  }

  public Filter tree(String tree) {
    this.tree = tree;
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
    Filter filter = (Filter) o;
    return Objects.equals(this.id, filter.id) &&
        Objects.equals(this.active, filter.active) &&
        Objects.equals(this.valid, filter.valid) &&
        Objects.equals(this.application, filter.application) &&
        Objects.equals(this.name, filter.name) &&
        Objects.equals(this.description, filter.description) &&
        Objects.equals(this.parent, filter.parent) &&
        Objects.equals(this.children, filter.children) &&
        Objects.equals(this.display, filter.display) &&
        Objects.equals(this.externalId, filter.externalId) &&
        Objects.equals(this.externalType, filter.externalType) &&
        Objects.equals(this.tree, filter.tree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, application, name, description, parent, children, display, externalId, externalType, tree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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

