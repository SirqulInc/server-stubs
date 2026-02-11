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
import org.openapitools.model.Application;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Filter   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private Application application;
  private String name;
  private String description;
  private Filter parent;
  private List<@Valid Filter> children = new ArrayList<>();
  private String display;
  private String externalId;
  private String externalType;
  private String tree;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("application")
  @Valid
  public Application getApplication() {
    return application;
  }
  public void setApplication(Application application) {
    this.application = application;
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
  @JsonProperty("parent")
  @Valid
  public Filter getParent() {
    return parent;
  }
  public void setParent(Filter parent) {
    this.parent = parent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  @Valid
  public List<@Valid Filter> getChildren() {
    return children;
  }
  public void setChildren(List<@Valid Filter> children) {
    this.children = children;
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
  @JsonProperty("tree")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

