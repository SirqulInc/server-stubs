package apimodels;

import apimodels.Application;
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
 * Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Filter   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("parent")
  @Valid

  private Filter parent;

  @JsonProperty("children")
  @Valid

  private List<@Valid Filter> children = null;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("externalType")
  
  private String externalType;

  @JsonProperty("tree")
  
  private String tree;

  public Filter id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Filter active(Boolean active) {
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

  public Filter valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Filter application(Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public Filter name(String name) {
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

  public Filter description(String description) {
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

  public Filter parent(Filter parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public Filter getParent() {
    return parent;
  }

  public void setParent(Filter parent) {
    this.parent = parent;
  }

  public Filter children(List<@Valid Filter> children) {
    this.children = children;
    return this;
  }

  public Filter addChildrenItem(Filter childrenItem) {
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
  public List<@Valid Filter> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Filter> children) {
    this.children = children;
  }

  public Filter display(String display) {
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

  public Filter externalId(String externalId) {
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

  public Filter externalType(String externalType) {
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

  public Filter tree(String tree) {
    this.tree = tree;
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  public String getTree() {
    return tree;
  }

  public void setTree(String tree) {
    this.tree = tree;
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
    return Objects.equals(id, filter.id) &&
        Objects.equals(active, filter.active) &&
        Objects.equals(valid, filter.valid) &&
        Objects.equals(application, filter.application) &&
        Objects.equals(name, filter.name) &&
        Objects.equals(description, filter.description) &&
        Objects.equals(parent, filter.parent) &&
        Objects.equals(children, filter.children) &&
        Objects.equals(display, filter.display) &&
        Objects.equals(externalId, filter.externalId) &&
        Objects.equals(externalType, filter.externalType) &&
        Objects.equals(tree, filter.tree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, application, name, description, parent, children, display, externalId, externalType, tree);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

