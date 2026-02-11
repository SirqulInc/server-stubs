package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Application;
import org.openapitools.model.Asset;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Category
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Category {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String name;

  private @Nullable String shortName;

  private @Nullable String description;

  private @Nullable String type;

  private @Nullable Application application;

  private @Nullable Category parent;

  @Valid
  private List<@Valid Category> children = new ArrayList<>();

  private @Nullable Long childrenCount;

  private @Nullable String display;

  private @Nullable String sqootSlug;

  private @Nullable Asset asset;

  private @Nullable String externalId;

  private @Nullable String externalType;

  private @Nullable Long favoriteCount;

  private @Nullable Category root;

  private @Nullable String tree;

  private @Nullable String parentName;

  private @Nullable Long parentId;

  private @Nullable Long applicationId;

  private @Nullable String secondaryType;

  public Category id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public Category active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public Category valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public Category name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Category shortName(@Nullable String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
   */
  
  @Schema(name = "shortName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shortName")
  public @Nullable String getShortName() {
    return shortName;
  }

  public void setShortName(@Nullable String shortName) {
    this.shortName = shortName;
  }

  public Category description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Category type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public Category application(@Nullable Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
   */
  @Valid 
  @Schema(name = "application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application")
  public @Nullable Application getApplication() {
    return application;
  }

  public void setApplication(@Nullable Application application) {
    this.application = application;
  }

  public Category parent(@Nullable Category parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable Category getParent() {
    return parent;
  }

  public void setParent(@Nullable Category parent) {
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
   */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public List<@Valid Category> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Category> children) {
    this.children = children;
  }

  public Category childrenCount(@Nullable Long childrenCount) {
    this.childrenCount = childrenCount;
    return this;
  }

  /**
   * Get childrenCount
   * @return childrenCount
   */
  
  @Schema(name = "childrenCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("childrenCount")
  public @Nullable Long getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(@Nullable Long childrenCount) {
    this.childrenCount = childrenCount;
  }

  public Category display(@Nullable String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
   */
  
  @Schema(name = "display", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display")
  public @Nullable String getDisplay() {
    return display;
  }

  public void setDisplay(@Nullable String display) {
    this.display = display;
  }

  public Category sqootSlug(@Nullable String sqootSlug) {
    this.sqootSlug = sqootSlug;
    return this;
  }

  /**
   * Get sqootSlug
   * @return sqootSlug
   */
  
  @Schema(name = "sqootSlug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sqootSlug")
  public @Nullable String getSqootSlug() {
    return sqootSlug;
  }

  public void setSqootSlug(@Nullable String sqootSlug) {
    this.sqootSlug = sqootSlug;
  }

  public Category asset(@Nullable Asset asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   * @return asset
   */
  @Valid 
  @Schema(name = "asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset")
  public @Nullable Asset getAsset() {
    return asset;
  }

  public void setAsset(@Nullable Asset asset) {
    this.asset = asset;
  }

  public Category externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  
  @Schema(name = "externalId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public Category externalType(@Nullable String externalType) {
    this.externalType = externalType;
    return this;
  }

  /**
   * Get externalType
   * @return externalType
   */
  
  @Schema(name = "externalType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalType")
  public @Nullable String getExternalType() {
    return externalType;
  }

  public void setExternalType(@Nullable String externalType) {
    this.externalType = externalType;
  }

  public Category favoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
    return this;
  }

  /**
   * Get favoriteCount
   * @return favoriteCount
   */
  
  @Schema(name = "favoriteCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteCount")
  public @Nullable Long getFavoriteCount() {
    return favoriteCount;
  }

  public void setFavoriteCount(@Nullable Long favoriteCount) {
    this.favoriteCount = favoriteCount;
  }

  public Category root(@Nullable Category root) {
    this.root = root;
    return this;
  }

  /**
   * Get root
   * @return root
   */
  @Valid 
  @Schema(name = "root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root")
  public @Nullable Category getRoot() {
    return root;
  }

  public void setRoot(@Nullable Category root) {
    this.root = root;
  }

  public Category tree(@Nullable String tree) {
    this.tree = tree;
    return this;
  }

  /**
   * Get tree
   * @return tree
   */
  
  @Schema(name = "tree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tree")
  public @Nullable String getTree() {
    return tree;
  }

  public void setTree(@Nullable String tree) {
    this.tree = tree;
  }

  public Category parentName(@Nullable String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * Get parentName
   * @return parentName
   */
  
  @Schema(name = "parentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentName")
  public @Nullable String getParentName() {
    return parentName;
  }

  public void setParentName(@Nullable String parentName) {
    this.parentName = parentName;
  }

  public Category parentId(@Nullable Long parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
   */
  
  @Schema(name = "parentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public @Nullable Long getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable Long parentId) {
    this.parentId = parentId;
  }

  public Category applicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
   */
  
  @Schema(name = "applicationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationId")
  public @Nullable Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(@Nullable Long applicationId) {
    this.applicationId = applicationId;
  }

  public Category secondaryType(@Nullable String secondaryType) {
    this.secondaryType = secondaryType;
    return this;
  }

  /**
   * Get secondaryType
   * @return secondaryType
   */
  
  @Schema(name = "secondaryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondaryType")
  public @Nullable String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(@Nullable String secondaryType) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

