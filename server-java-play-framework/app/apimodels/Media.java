package apimodels;

import apimodels.Album;
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
 * Media
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Media   {
  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    APK("APK"),
    
    APPLICATION("APPLICATION"),
    
    IMAGE("IMAGE"),
    
    AUDIO("AUDIO"),
    
    VIDEO("VIDEO"),
    
    MULTIPART("MULTIPART"),
    
    BAR_CODE("BAR_CODE"),
    
    TEXT("TEXT"),
    
    OTHER("OTHER");

    private final String value;

    MediaTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("mediaType")
  
  private MediaTypeEnum mediaType;

  /**
   * Gets or Sets condition
   */
  public enum ConditionEnum {
    NEW("NEW"),
    
    USED("USED"),
    
    REFURBISHED("REFURBISHED"),
    
    OTHER("OTHER");

    private final String value;

    ConditionEnum(String value) {
      this.value = value;
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

  @JsonProperty("condition")
  
  private ConditionEnum condition;

  @JsonProperty("isbn")
  
  private String isbn;

  @JsonProperty("asin")
  
  private String asin;

  @JsonProperty("catalogNumbers")
  
  private List<String> catalogNumbers = null;

  @JsonProperty("duration")
  
  private Integer duration;

  @JsonProperty("author")
  
  private String author;

  @JsonProperty("releaseDate")
  
  private Long releaseDate;

  @JsonProperty("availabilityDate")
  
  private Long availabilityDate;

  @JsonProperty("parentalRating")
  
  private String parentalRating;

  @JsonProperty("collections")
  @Valid

  private List<@Valid Album> collections = null;

  @JsonProperty("collectionCount")
  
  private Integer collectionCount;

  public Media mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Media condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public Media isbn(String isbn) {
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

  public Media asin(String asin) {
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

  public Media catalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
    return this;
  }

  public Media addCatalogNumbersItem(String catalogNumbersItem) {
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

  public Media duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Media author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Media releaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  public Long getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Media availabilityDate(Long availabilityDate) {
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

  public Media parentalRating(String parentalRating) {
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

  public Media collections(List<@Valid Album> collections) {
    this.collections = collections;
    return this;
  }

  public Media addCollectionsItem(Album collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  public List<@Valid Album> getCollections() {
    return collections;
  }

  public void setCollections(List<@Valid Album> collections) {
    this.collections = collections;
  }

  public Media collectionCount(Integer collectionCount) {
    this.collectionCount = collectionCount;
    return this;
  }

   /**
   * Get collectionCount
   * @return collectionCount
  **/
  public Integer getCollectionCount() {
    return collectionCount;
  }

  public void setCollectionCount(Integer collectionCount) {
    this.collectionCount = collectionCount;
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
    return Objects.equals(mediaType, media.mediaType) &&
        Objects.equals(condition, media.condition) &&
        Objects.equals(isbn, media.isbn) &&
        Objects.equals(asin, media.asin) &&
        Objects.equals(catalogNumbers, media.catalogNumbers) &&
        Objects.equals(duration, media.duration) &&
        Objects.equals(author, media.author) &&
        Objects.equals(releaseDate, media.releaseDate) &&
        Objects.equals(availabilityDate, media.availabilityDate) &&
        Objects.equals(parentalRating, media.parentalRating) &&
        Objects.equals(collections, media.collections) &&
        Objects.equals(collectionCount, media.collectionCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, condition, isbn, asin, catalogNumbers, duration, author, releaseDate, availabilityDate, parentalRating, collections, collectionCount);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

