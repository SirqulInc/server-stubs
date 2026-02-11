package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CategoryTreeResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CategoryTreeResponse {

  private @Nullable Long categoryId;

  private @Nullable String name;

  private @Nullable String display;

  private @Nullable Long subCategoryCount;

  private @Nullable Long parentId;

  private @Nullable String parentName;

  private @Nullable String description;

  private @Nullable Boolean active;

  private @Nullable AssetShortResponse asset;

  private @Nullable Long favoriteId;

  private @Nullable Boolean favorite;

  private @Nullable Long applicationId;

  private @Nullable String type;

  private @Nullable String externalId;

  private @Nullable String externalType;

  @Valid
  private List<@Valid CategoryTreeResponse> children = new ArrayList<>();

  public CategoryTreeResponse categoryId(@Nullable Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
   */
  
  @Schema(name = "categoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public @Nullable Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(@Nullable Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryTreeResponse name(@Nullable String name) {
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

  public CategoryTreeResponse display(@Nullable String display) {
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

  public CategoryTreeResponse subCategoryCount(@Nullable Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
    return this;
  }

  /**
   * Get subCategoryCount
   * @return subCategoryCount
   */
  
  @Schema(name = "subCategoryCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subCategoryCount")
  public @Nullable Long getSubCategoryCount() {
    return subCategoryCount;
  }

  public void setSubCategoryCount(@Nullable Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
  }

  public CategoryTreeResponse parentId(@Nullable Long parentId) {
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

  public CategoryTreeResponse parentName(@Nullable String parentName) {
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

  public CategoryTreeResponse description(@Nullable String description) {
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

  public CategoryTreeResponse active(@Nullable Boolean active) {
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

  public CategoryTreeResponse asset(@Nullable AssetShortResponse asset) {
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
  public @Nullable AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(@Nullable AssetShortResponse asset) {
    this.asset = asset;
  }

  public CategoryTreeResponse favoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

  /**
   * Get favoriteId
   * @return favoriteId
   */
  
  @Schema(name = "favoriteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favoriteId")
  public @Nullable Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(@Nullable Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public CategoryTreeResponse favorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
   */
  
  @Schema(name = "favorite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favorite")
  public @Nullable Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(@Nullable Boolean favorite) {
    this.favorite = favorite;
  }

  public CategoryTreeResponse applicationId(@Nullable Long applicationId) {
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

  public CategoryTreeResponse type(@Nullable String type) {
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

  public CategoryTreeResponse externalId(@Nullable String externalId) {
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

  public CategoryTreeResponse externalType(@Nullable String externalType) {
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

  public CategoryTreeResponse children(List<@Valid CategoryTreeResponse> children) {
    this.children = children;
    return this;
  }

  public CategoryTreeResponse addChildrenItem(CategoryTreeResponse childrenItem) {
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
  public List<@Valid CategoryTreeResponse> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid CategoryTreeResponse> children) {
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
    CategoryTreeResponse categoryTreeResponse = (CategoryTreeResponse) o;
    return Objects.equals(this.categoryId, categoryTreeResponse.categoryId) &&
        Objects.equals(this.name, categoryTreeResponse.name) &&
        Objects.equals(this.display, categoryTreeResponse.display) &&
        Objects.equals(this.subCategoryCount, categoryTreeResponse.subCategoryCount) &&
        Objects.equals(this.parentId, categoryTreeResponse.parentId) &&
        Objects.equals(this.parentName, categoryTreeResponse.parentName) &&
        Objects.equals(this.description, categoryTreeResponse.description) &&
        Objects.equals(this.active, categoryTreeResponse.active) &&
        Objects.equals(this.asset, categoryTreeResponse.asset) &&
        Objects.equals(this.favoriteId, categoryTreeResponse.favoriteId) &&
        Objects.equals(this.favorite, categoryTreeResponse.favorite) &&
        Objects.equals(this.applicationId, categoryTreeResponse.applicationId) &&
        Objects.equals(this.type, categoryTreeResponse.type) &&
        Objects.equals(this.externalId, categoryTreeResponse.externalId) &&
        Objects.equals(this.externalType, categoryTreeResponse.externalType) &&
        Objects.equals(this.children, categoryTreeResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, name, display, subCategoryCount, parentId, parentName, description, active, asset, favoriteId, favorite, applicationId, type, externalId, externalType, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryTreeResponse {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    subCategoryCount: ").append(toIndentedString(subCategoryCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

