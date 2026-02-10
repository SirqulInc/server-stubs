package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CategoryResponse  {
  
  @ApiModelProperty(value = "")

  private Long categoryId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String display;

  @ApiModelProperty(value = "")

  private Long subCategoryCount;

  @ApiModelProperty(value = "")

  private Long parentId;

  @ApiModelProperty(value = "")

  private String parentName;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse asset;

  @ApiModelProperty(value = "")

  private Long favoriteId;

  @ApiModelProperty(value = "")

  private Boolean favorite;

  @ApiModelProperty(value = "")

  private Long applicationId;

  @ApiModelProperty(value = "")

  private String type;

  @ApiModelProperty(value = "")

  private String externalId;

  @ApiModelProperty(value = "")

  private String externalType;
 /**
   * Get categoryId
   * @return categoryId
  **/
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryResponse categoryId(Long categoryId) {
    this.categoryId = categoryId;
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

  public CategoryResponse name(String name) {
    this.name = name;
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

  public CategoryResponse display(String display) {
    this.display = display;
    return this;
  }

 /**
   * Get subCategoryCount
   * @return subCategoryCount
  **/
  @JsonProperty("subCategoryCount")
  public Long getSubCategoryCount() {
    return subCategoryCount;
  }

  public void setSubCategoryCount(Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
  }

  public CategoryResponse subCategoryCount(Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
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

  public CategoryResponse parentId(Long parentId) {
    this.parentId = parentId;
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

  public CategoryResponse parentName(String parentName) {
    this.parentName = parentName;
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

  public CategoryResponse description(String description) {
    this.description = description;
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

  public CategoryResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get asset
   * @return asset
  **/
  @JsonProperty("asset")
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  public CategoryResponse asset(AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

 /**
   * Get favoriteId
   * @return favoriteId
  **/
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public CategoryResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

 /**
   * Get favorite
   * @return favorite
  **/
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public CategoryResponse favorite(Boolean favorite) {
    this.favorite = favorite;
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

  public CategoryResponse applicationId(Long applicationId) {
    this.applicationId = applicationId;
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

  public CategoryResponse type(String type) {
    this.type = type;
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

  public CategoryResponse externalId(String externalId) {
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

  public CategoryResponse externalType(String externalType) {
    this.externalType = externalType;
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
    CategoryResponse categoryResponse = (CategoryResponse) o;
    return Objects.equals(this.categoryId, categoryResponse.categoryId) &&
        Objects.equals(this.name, categoryResponse.name) &&
        Objects.equals(this.display, categoryResponse.display) &&
        Objects.equals(this.subCategoryCount, categoryResponse.subCategoryCount) &&
        Objects.equals(this.parentId, categoryResponse.parentId) &&
        Objects.equals(this.parentName, categoryResponse.parentName) &&
        Objects.equals(this.description, categoryResponse.description) &&
        Objects.equals(this.active, categoryResponse.active) &&
        Objects.equals(this.asset, categoryResponse.asset) &&
        Objects.equals(this.favoriteId, categoryResponse.favoriteId) &&
        Objects.equals(this.favorite, categoryResponse.favorite) &&
        Objects.equals(this.applicationId, categoryResponse.applicationId) &&
        Objects.equals(this.type, categoryResponse.type) &&
        Objects.equals(this.externalId, categoryResponse.externalId) &&
        Objects.equals(this.externalType, categoryResponse.externalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, name, display, subCategoryCount, parentId, parentName, description, active, asset, favoriteId, favorite, applicationId, type, externalId, externalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResponse {\n");
    
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

