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
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class CategoryTreeResponse   {
  
  private Long categoryId;
  private String name;
  private String display;
  private Long subCategoryCount;
  private Long parentId;
  private String parentName;
  private String description;
  private Boolean active;
  private AssetShortResponse asset;
  private Long favoriteId;
  private Boolean favorite;
  private Long applicationId;
  private String type;
  private String externalId;
  private String externalType;
  private List<@Valid CategoryTreeResponse> children = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
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
  @JsonProperty("subCategoryCount")
  public Long getSubCategoryCount() {
    return subCategoryCount;
  }
  public void setSubCategoryCount(Long subCategoryCount) {
    this.subCategoryCount = subCategoryCount;
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
  @JsonProperty("asset")
  @Valid
  public AssetShortResponse getAsset() {
    return asset;
  }
  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favoriteId")
  public Long getFavoriteId() {
    return favoriteId;
  }
  public void setFavoriteId(Long favoriteId) {
    this.favoriteId = favoriteId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
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
  @JsonProperty("children")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

