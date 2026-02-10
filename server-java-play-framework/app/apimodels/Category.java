package apimodels;

import apimodels.Application;
import apimodels.Asset;
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
 * Category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Category   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("shortName")
  
  private String shortName;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("application")
  @Valid

  private Application application;

  @JsonProperty("parent")
  @Valid

  private Category parent;

  @JsonProperty("children")
  @Valid

  private List<@Valid Category> children = null;

  @JsonProperty("childrenCount")
  
  private Long childrenCount;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("sqootSlug")
  
  private String sqootSlug;

  @JsonProperty("asset")
  @Valid

  private Asset asset;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("externalType")
  
  private String externalType;

  @JsonProperty("favoriteCount")
  
  private Long favoriteCount;

  @JsonProperty("root")
  @Valid

  private Category root;

  @JsonProperty("tree")
  
  private String tree;

  @JsonProperty("parentName")
  
  private String parentName;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("secondaryType")
  
  private String secondaryType;

  public Category id(Long id) {
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

  public Category active(Boolean active) {
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

  public Category valid(Boolean valid) {
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

  public Category name(String name) {
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

  public Category shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Category description(String description) {
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

  public Category type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Category application(Application application) {
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

  public Category parent(Category parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public Category getParent() {
    return parent;
  }

  public void setParent(Category parent) {
    this.parent = parent;
  }

  public Category children(List<@Valid Category> children) {
    this.children = children;
    return this;
  }

  public Category addChildrenItem(Category childrenItem) {
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
  public List<@Valid Category> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Category> children) {
    this.children = children;
  }

  public Category childrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
    return this;
  }

   /**
   * Get childrenCount
   * @return childrenCount
  **/
  public Long getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(Long childrenCount) {
    this.childrenCount = childrenCount;
  }

  public Category display(String display) {
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

  public Category sqootSlug(String sqootSlug) {
    this.sqootSlug = sqootSlug;
    return this;
  }

   /**
   * Get sqootSlug
   * @return sqootSlug
  **/
  public String getSqootSlug() {
    return sqootSlug;
  }

  public void setSqootSlug(String sqootSlug) {
    this.sqootSlug = sqootSlug;
  }

  public Category asset(Asset asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  public Asset getAsset() {
    return asset;
  }

  public void setAsset(Asset asset) {
    this.asset = asset;
  }

  public Category externalId(String externalId) {
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

  public Category externalType(String externalType) {
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

  public Category favoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

   /**
   * Get favoriteCount
   * @return favoriteCount
  **/
  public Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public Category root(Category root) {
    this.root = root;
    return this;
  }

   /**
   * Get root
   * @return root
  **/
  public Category getRoot() {
    return root;
  }

  public void setRoot(Category root) {
    this.root = root;
  }

  public Category tree(String tree) {
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

  public Category parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Get parentName
   * @return parentName
  **/
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public Category parentId(Long parentId) {
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

  public Category applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public Category secondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

   /**
   * Get secondaryType
   * @return secondaryType
  **/
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
    return Objects.equals(id, category.id) &&
        Objects.equals(active, category.active) &&
        Objects.equals(valid, category.valid) &&
        Objects.equals(name, category.name) &&
        Objects.equals(shortName, category.shortName) &&
        Objects.equals(description, category.description) &&
        Objects.equals(type, category.type) &&
        Objects.equals(application, category.application) &&
        Objects.equals(parent, category.parent) &&
        Objects.equals(children, category.children) &&
        Objects.equals(childrenCount, category.childrenCount) &&
        Objects.equals(display, category.display) &&
        Objects.equals(sqootSlug, category.sqootSlug) &&
        Objects.equals(asset, category.asset) &&
        Objects.equals(externalId, category.externalId) &&
        Objects.equals(externalType, category.externalType) &&
        Objects.equals(favoriteCount, category.favoriteCount) &&
        Objects.equals(root, category.root) &&
        Objects.equals(tree, category.tree) &&
        Objects.equals(parentName, category.parentName) &&
        Objects.equals(parentId, category.parentId) &&
        Objects.equals(applicationId, category.applicationId) &&
        Objects.equals(secondaryType, category.secondaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, name, shortName, description, type, application, parent, children, childrenCount, display, sqootSlug, asset, externalId, externalType, favoriteCount, root, tree, parentName, parentId, applicationId, secondaryType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

