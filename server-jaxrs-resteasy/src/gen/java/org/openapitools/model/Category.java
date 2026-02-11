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
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Category   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String name;
  private String shortName;
  private String description;
  private String type;
  private Application application;
  private Category parent;
  private List<@Valid Category> children = new ArrayList<>();
  private Long childrenCount;
  private String display;
  private String sqootSlug;
  private Asset asset;
  private String externalId;
  private String externalType;
  private Long favoriteCount;
  private Category root;
  private String tree;
  private String parentName;
  private Long parentId;
  private Long applicationId;
  private String secondaryType;

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
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
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
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
  @JsonProperty("parent")
  @Valid
  public Category getParent() {
    return parent;
  }
  public void setParent(Category parent) {
    this.parent = parent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("children")
  @Valid
  public List<@Valid Category> getChildren() {
    return children;
  }
  public void setChildren(List<@Valid Category> children) {
    this.children = children;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("childrenCount")
  public Long getChildrenCount() {
    return childrenCount;
  }
  public void setChildrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
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
  @JsonProperty("sqootSlug")
  public String getSqootSlug() {
    return sqootSlug;
  }
  public void setSqootSlug(String sqootSlug) {
    this.sqootSlug = sqootSlug;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asset")
  @Valid
  public Asset getAsset() {
    return asset;
  }
  public void setAsset(Asset asset) {
    this.asset = asset;
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
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }
  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("root")
  @Valid
  public Category getRoot() {
    return root;
  }
  public void setRoot(Category root) {
    this.root = root;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentName")
  public String getParentName() {
    return parentName;
  }
  public void setParentName(String parentName) {
    this.parentName = parentName;
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
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }
  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.active, category.active) &&
        Objects.equals(this.valid, category.valid) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.shortName, category.shortName) &&
        Objects.equals(this.description, category.description) &&
        Objects.equals(this.type, category.type) &&
        Objects.equals(this.application, category.application) &&
        Objects.equals(this.parent, category.parent) &&
        Objects.equals(this.children, category.children) &&
        Objects.equals(this.childrenCount, category.childrenCount) &&
        Objects.equals(this.display, category.display) &&
        Objects.equals(this.sqootSlug, category.sqootSlug) &&
        Objects.equals(this.asset, category.asset) &&
        Objects.equals(this.externalId, category.externalId) &&
        Objects.equals(this.externalType, category.externalType) &&
        Objects.equals(this.favoriteCount, category.favoriteCount) &&
        Objects.equals(this.root, category.root) &&
        Objects.equals(this.tree, category.tree) &&
        Objects.equals(this.parentName, category.parentName) &&
        Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.applicationId, category.applicationId) &&
        Objects.equals(this.secondaryType, category.secondaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, shortName, description, type, application, parent, children, childrenCount, display, sqootSlug, asset, externalId, externalType, favoriteCount, root, tree, parentName, parentId, applicationId, secondaryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    sqootSlug: ").append(toIndentedString(sqootSlug)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
    sb.append("    favoriteCount: ").append(toIndentedString(favoriteCount)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    secondaryType: ").append(toIndentedString(secondaryType)).append("\n");
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

