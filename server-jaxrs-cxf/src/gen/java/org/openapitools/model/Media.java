package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Album;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Media  {
  
public enum MediaTypeEnum {

APK(String.valueOf("APK")), APPLICATION(String.valueOf("APPLICATION")), IMAGE(String.valueOf("IMAGE")), AUDIO(String.valueOf("AUDIO")), VIDEO(String.valueOf("VIDEO")), MULTIPART(String.valueOf("MULTIPART")), BAR_CODE(String.valueOf("BAR_CODE")), TEXT(String.valueOf("TEXT")), OTHER(String.valueOf("OTHER"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private MediaTypeEnum mediaType;

public enum ConditionEnum {

NEW(String.valueOf("NEW")), USED(String.valueOf("USED")), REFURBISHED(String.valueOf("REFURBISHED")), OTHER(String.valueOf("OTHER"));


    private String value;

    ConditionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ConditionEnum fromValue(String value) {
        for (ConditionEnum b : ConditionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private ConditionEnum condition;

  @ApiModelProperty(value = "")

  private String isbn;

  @ApiModelProperty(value = "")

  private String asin;

  @ApiModelProperty(value = "")

  private List<String> catalogNumbers = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer duration;

  @ApiModelProperty(value = "")

  private String author;

  @ApiModelProperty(value = "")

  private Long releaseDate;

  @ApiModelProperty(value = "")

  private Long availabilityDate;

  @ApiModelProperty(value = "")

  private String parentalRating;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Album> collections = new ArrayList<>();

  @ApiModelProperty(value = "")

  private Integer collectionCount;
 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    if (mediaType == null) {
      return null;
    }
    return mediaType.value();
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Media mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * Get condition
   * @return condition
  **/
  @JsonProperty("condition")
  public String getCondition() {
    if (condition == null) {
      return null;
    }
    return condition.value();
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public Media condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

 /**
   * Get isbn
   * @return isbn
  **/
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Media isbn(String isbn) {
    this.isbn = isbn;
    return this;
  }

 /**
   * Get asin
   * @return asin
  **/
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Media asin(String asin) {
    this.asin = asin;
    return this;
  }

 /**
   * Get catalogNumbers
   * @return catalogNumbers
  **/
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public Media catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public Media addCatalogNumbersItem(String catalogNumbersItem) {
    this.catalogNumbers.add(catalogNumbersItem);
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Media duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Media author(String author) {
    this.author = author;
    return this;
  }

 /**
   * Get releaseDate
   * @return releaseDate
  **/
  @JsonProperty("releaseDate")
  public Long getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Media releaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

 /**
   * Get availabilityDate
   * @return availabilityDate
  **/
  @JsonProperty("availabilityDate")
  public Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public Media availabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

 /**
   * Get parentalRating
   * @return parentalRating
  **/
  @JsonProperty("parentalRating")
  public String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  public Media parentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

 /**
   * Get collections
   * @return collections
  **/
  @JsonProperty("collections")
  public List<@Valid Album> getCollections() {
    return collections;
  }

  public void setCollections(List<@Valid Album> collections) {
    this.collections = collections;
  }

  public Media collections(List<@Valid Album> collections) {
    this.collections = collections;
    return this;
  }

  public Media addCollectionsItem(Album collectionsItem) {
    this.collections.add(collectionsItem);
    return this;
  }

 /**
   * Get collectionCount
   * @return collectionCount
  **/
  @JsonProperty("collectionCount")
  public Integer getCollectionCount() {
    return collectionCount;
  }

  public void setCollectionCount(Integer collectionCount) {
    this.collectionCount = collectionCount;
  }

  public Media collectionCount(Integer collectionCount) {
    this.collectionCount = collectionCount;
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
    Media media = (Media) o;
    return Objects.equals(this.mediaType, media.mediaType) &&
        Objects.equals(this.condition, media.condition) &&
        Objects.equals(this.isbn, media.isbn) &&
        Objects.equals(this.asin, media.asin) &&
        Objects.equals(this.catalogNumbers, media.catalogNumbers) &&
        Objects.equals(this.duration, media.duration) &&
        Objects.equals(this.author, media.author) &&
        Objects.equals(this.releaseDate, media.releaseDate) &&
        Objects.equals(this.availabilityDate, media.availabilityDate) &&
        Objects.equals(this.parentalRating, media.parentalRating) &&
        Objects.equals(this.collections, media.collections) &&
        Objects.equals(this.collectionCount, media.collectionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, condition, isbn, asin, catalogNumbers, duration, author, releaseDate, availabilityDate, parentalRating, collections, collectionCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isbn: ").append(toIndentedString(isbn)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    catalogNumbers: ").append(toIndentedString(catalogNumbers)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
    sb.append("    parentalRating: ").append(toIndentedString(parentalRating)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    collectionCount: ").append(toIndentedString(collectionCount)).append("\n");
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

