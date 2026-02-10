package apimodels;

import apimodels.SizeGroupResponse;
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
 * ProductResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductResponse   {
  @JsonProperty("brand")
  
  private String brand;

  @JsonProperty("productType")
  
  private String productType;

  @JsonProperty("condition")
  
  private String condition;

  @JsonProperty("isbn")
  
  private String isbn;

  @JsonProperty("asin")
  
  private String asin;

  @JsonProperty("catalogNumbers")
  
  private List<String> catalogNumbers = null;

  @JsonProperty("department")
  
  private String department;

  @JsonProperty("features")
  
  private List<String> features = null;

  @JsonProperty("minimumPrice")
  
  private Double minimumPrice;

  @JsonProperty("width")
  
  private Double width;

  @JsonProperty("height")
  
  private Double height;

  @JsonProperty("depth")
  
  private Double depth;

  @JsonProperty("weight")
  
  private Double weight;

  @JsonProperty("unit")
  
  private String unit;

  @JsonProperty("studio")
  
  private String studio;

  @JsonProperty("parentalRating")
  
  private String parentalRating;

  @JsonProperty("publishDate")
  
  private Long publishDate;

  @JsonProperty("availabilityDate")
  
  private Long availabilityDate;

  @JsonProperty("size")
  @Valid

  private SizeGroupResponse size;

  public ProductResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ProductResponse productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ProductResponse condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public ProductResponse isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

   /**
   * Get isbn
   * @return isbn
  **/
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public ProductResponse asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * Get asin
   * @return asin
  **/
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public ProductResponse catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public ProductResponse addCatalogNumbersItem(String catalogNumbersItem) {
    if (this.catalogNumbers == null) {
      this.catalogNumbers = new ArrayList<>();
    }
    this.catalogNumbers.add(catalogNumbersItem);
    return this;
  }

   /**
   * Get catalogNumbers
   * @return catalogNumbers
  **/
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public ProductResponse department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public ProductResponse features(List<String> features) {
    this.features = features;
    return this;
  }

  public ProductResponse addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public ProductResponse minimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
    return this;
  }

   /**
   * Get minimumPrice
   * @return minimumPrice
  **/
  public Double getMinimumPrice() {
    return minimumPrice;
  }

  public void setMinimumPrice(Double minimumPrice) {
    this.minimumPrice = minimumPrice;
  }

  public ProductResponse width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ProductResponse height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ProductResponse depth(Double depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  public Double getDepth() {
    return depth;
  }

  public void setDepth(Double depth) {
    this.depth = depth;
  }

  public ProductResponse weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public ProductResponse unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ProductResponse studio(String studio) {
    this.studio = studio;
    return this;
  }

   /**
   * Get studio
   * @return studio
  **/
  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public ProductResponse parentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

   /**
   * Get parentalRating
   * @return parentalRating
  **/
  public String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  public ProductResponse publishDate(Long publishDate) {
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  public Long getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Long publishDate) {
    this.publishDate = publishDate;
  }

  public ProductResponse availabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

   /**
   * Get availabilityDate
   * @return availabilityDate
  **/
  public Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public ProductResponse size(SizeGroupResponse size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  public SizeGroupResponse getSize() {
    return size;
  }

  public void setSize(SizeGroupResponse size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductResponse productResponse = (ProductResponse) o;
    return Objects.equals(brand, productResponse.brand) &&
        Objects.equals(productType, productResponse.productType) &&
        Objects.equals(condition, productResponse.condition) &&
        Objects.equals(isbn, productResponse.isbn) &&
        Objects.equals(asin, productResponse.asin) &&
        Objects.equals(catalogNumbers, productResponse.catalogNumbers) &&
        Objects.equals(department, productResponse.department) &&
        Objects.equals(features, productResponse.features) &&
        Objects.equals(minimumPrice, productResponse.minimumPrice) &&
        Objects.equals(width, productResponse.width) &&
        Objects.equals(height, productResponse.height) &&
        Objects.equals(depth, productResponse.depth) &&
        Objects.equals(weight, productResponse.weight) &&
        Objects.equals(unit, productResponse.unit) &&
        Objects.equals(studio, productResponse.studio) &&
        Objects.equals(parentalRating, productResponse.parentalRating) &&
        Objects.equals(publishDate, productResponse.publishDate) &&
        Objects.equals(availabilityDate, productResponse.availabilityDate) &&
        Objects.equals(size, productResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, productType, condition, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, size);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductResponse {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    catalogNumbers: ").append(toIndentedString(catalogNumbers)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    minimumPrice: ").append(toIndentedString(minimumPrice)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    studio: ").append(toIndentedString(studio)).append("\n");
    sb.append("    parentalRating: ").append(toIndentedString(parentalRating)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

