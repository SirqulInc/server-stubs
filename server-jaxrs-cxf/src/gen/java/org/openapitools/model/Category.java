package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Category  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String shortName;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  @Valid

  private Application application;

  @ApiModelProperty(value = "")

  @Valid

  private Category parent;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Category> children = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Long childrenCount;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private String sqootSlug;

  @ApiModelProperty(value = "")

  @Valid

  private Asset asset;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalType;

  @ApiModelProperty(value = "")

  private Long favoriteCount;

  @ApiModelProperty(value = "")

  @Valid

  private Category root;

  @ApiModelProperty(value = "")

  private String tree;

  @ApiModelProperty(value = "")

  private String parentName;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private Long applicationId;

  @ApiModelProperty(value = "")

  private String secondaryType;
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

  public Category id(Long id) {
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

  public Category active(Boolean active) {
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

  public Category valid(Boolean valid) {
    this.valid = valid;
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

  public Category name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get shortName
   * @return shortName
  **/
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Category shortName(String shortName) {
    this.shortName = shortName;
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

  public Category description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Category type(String type) {
    this.type = type;
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

  public Category application(Application application) {
    this.application = application;
    return this;
  }

 /**
   * Get parent
   * @return parent
  **/
  @JsonProperty("parent")
  public Category getParent() {
    return parent;
  }

  public void setParent(Category parent) {
    this.parent = parent;
  }

  public Category parent(Category parent) {
    this.parent = parent;
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid Category> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Category> children) {
    this.children = children;
  }

  public Category children(List<@Valid Category> children) {
    this.children = children;
    return this;
  }

  public Category addChildrenItem(Category childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

 /**
   * Get childrenCount
   * @return childrenCount
  **/
  @JsonProperty("childrenCount")
  public Long getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
  }

  public Category childrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
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

  public Category display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get sqootSlug
   * @return sqootSlug
  **/
  @JsonProperty("sqootSlug")
  public String getSqootSlug() {
    return sqootSlug;
  }

  public void setSqootSlug(String sqootSlug) {
    this.sqootSlug = sqootSlug;
  }

  public Category sqootSlug(String sqootSlug) {
    this.sqootSlug = sqootSlug;
    return this;
  }

 /**
   * Get asset
   * @return asset
  **/
  @JsonProperty("asset")
  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }

  public Category asset(Asset asset) {
    this.asset = asset;
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

  public Category externalId(String externalId) {
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

  public Category externalType(String externalType) {
    this.externalType = externalType;
    return this;
  }

 /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  @JsonProperty("favoriteCount")
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public Category favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

 /**
   * Get root
   * @return root
  **/
  @JsonProperty("root")
  public Category getRoot() {
    return root;
  }

  public void setRoot(Category root) {
    this.root = root;
  }

  public Category root(Category root) {
    this.root = root;
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

  public Category tree(String tree) {
    this.tree = tree;
    return this;
  }

 /**
   * Get parentName
   * @return parentName
  **/
  @JsonProperty("parentName")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public Category parentName(String parentName) {
    this.parentName = parentName;
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

  public Category parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Get applicationId
   * @return applicationId
  **/
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public Category applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

 /**
   * Get secondaryType
   * @return secondaryType
  **/
  @JsonProperty("secondaryType")
  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

  public Category secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

