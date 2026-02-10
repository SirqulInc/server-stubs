package apimodels;

import apimodels.AssetShortResponse;
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
 * CategoryTreeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CategoryTreeResponse   {
  @JsonProperty("categoryId")
  
  private Long categoryId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("display")
  
  private String display;

  @JsonProperty("subCategoryCount")
  
  private Long subCategoryCount;

  @JsonProperty("parentId")
  
  private Long parentId;

  @JsonProperty("parentName")
  
  private String parentName;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("asset")
  @Valid

  private AssetShortResponse asset;

  @JsonProperty("favoriteId")
  
  private Long favoriteId;

  @JsonProperty("favorite")
  
  private Boolean favorite;

  @JsonProperty("applicationId")
  
  private Long applicationId;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("externalType")
  
  private String externalType;

  @JsonProperty("children")
  @Valid

  private List<@Valid CategoryTreeResponse> children = null;

  public CategoryTreeResponse categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryTreeResponse name(String name) {
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

  public CategoryTreeResponse display(String display) {
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

  public CategoryTreeResponse subCategoryCount(Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
    return this;
  }

   /**
   * Get subCategoryCount
   * @return subCategoryCount
  **/
  public Long getSubCategoryCount() {
    return subCategoryCount;
  }

  public void setSubCategoryCount(Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
  }

  public CategoryTreeResponse parentId(Long parentId) {
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

  public CategoryTreeResponse parentName(String parentName) {
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

  public CategoryTreeResponse description(String description) {
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

  public CategoryTreeResponse active(Boolean active) {
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

  public CategoryTreeResponse asset(AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  public CategoryTreeResponse favoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Get favoriteId
   * @return favoriteId
  **/
  public Long getFavoriteId() {
    return favoriteId;
  }

  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  public CategoryTreeResponse favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  public Boolean getFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public CategoryTreeResponse applicationId(Long applicationId) {
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

  public CategoryTreeResponse type(String type) {
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

  public CategoryTreeResponse externalId(String externalId) {
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

  public CategoryTreeResponse externalType(String externalType) {
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
  **/
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
    return Objects.equals(categoryId, categoryTreeResponse.categoryId) &&
        Objects.equals(name, categoryTreeResponse.name) &&
        Objects.equals(display, categoryTreeResponse.display) &&
        Objects.equals(subCategoryCount, categoryTreeResponse.subCategoryCount) &&
        Objects.equals(parentId, categoryTreeResponse.parentId) &&
        Objects.equals(parentName, categoryTreeResponse.parentName) &&
        Objects.equals(description, categoryTreeResponse.description) &&
        Objects.equals(active, categoryTreeResponse.active) &&
        Objects.equals(asset, categoryTreeResponse.asset) &&
        Objects.equals(favoriteId, categoryTreeResponse.favoriteId) &&
        Objects.equals(favorite, categoryTreeResponse.favorite) &&
        Objects.equals(applicationId, categoryTreeResponse.applicationId) &&
        Objects.equals(type, categoryTreeResponse.type) &&
        Objects.equals(externalId, categoryTreeResponse.externalId) &&
        Objects.equals(externalType, categoryTreeResponse.externalType) &&
        Objects.equals(children, categoryTreeResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, name, display, subCategoryCount, parentId, parentName, description, active, asset, favoriteId, favorite, applicationId, type, externalId, externalType, children);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

