package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Album;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Media
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Media {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable MediaTypeEnum mediaType;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private @Nullable ConditionEnum condition;

  private @Nullable String isbn;

  private @Nullable String asin;

  @Valid
  private List<String> catalogNumbers = new ArrayList<>();

  private @Nullable Integer duration;

  private @Nullable String author;

  private @Nullable Long releaseDate;

  private @Nullable Long availabilityDate;

  private @Nullable String parentalRating;

  @Valid
  private List<@Valid Album> collections = new ArrayList<>();

  private @Nullable Integer collectionCount;

  public Media mediaType(@Nullable MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public @Nullable MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(@Nullable MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public Media condition(@Nullable ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public @Nullable ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(@Nullable ConditionEnum condition) {
    this.condition = condition;
  }

  public Media isbn(@Nullable String isbn) {
    this.isbn = isbn;
    return this;
  }

  /**
   * Get isbn
   * @return isbn
   */
  
  @Schema(name = "isbn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isbn")
  public @Nullable String getIsbn() {
    return isbn;
  }

  public void setIsbn(@Nullable String isbn) {
    this.isbn = isbn;
  }

  public Media asin(@Nullable String asin) {
    this.asin = asin;
    return this;
  }

  /**
   * Get asin
   * @return asin
   */
  
  @Schema(name = "asin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asin")
  public @Nullable String getAsin() {
    return asin;
  }

  public void setAsin(@Nullable String asin) {
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
   */
  
  @Schema(name = "catalogNumbers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }

  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  public Media duration(@Nullable Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   */
  
  @Schema(name = "duration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public @Nullable Integer getDuration() {
    return duration;
  }

  public void setDuration(@Nullable Integer duration) {
    this.duration = duration;
  }

  public Media author(@Nullable String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public @Nullable String getAuthor() {
    return author;
  }

  public void setAuthor(@Nullable String author) {
    this.author = author;
  }

  public Media releaseDate(@Nullable Long releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
   */
  
  @Schema(name = "releaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public @Nullable Long getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(@Nullable Long releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Media availabilityDate(@Nullable Long availabilityDate) {
    this.availabilityDate = availabilityDate;
    return this;
  }

  /**
   * Get availabilityDate
   * @return availabilityDate
   */
  
  @Schema(name = "availabilityDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availabilityDate")
  public @Nullable Long getAvailabilityDate() {
    return availabilityDate;
  }

  public void setAvailabilityDate(@Nullable Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  public Media parentalRating(@Nullable String parentalRating) {
    this.parentalRating = parentalRating;
    return this;
  }

  /**
   * Get parentalRating
   * @return parentalRating
   */
  
  @Schema(name = "parentalRating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentalRating")
  public @Nullable String getParentalRating() {
    return parentalRating;
  }

  public void setParentalRating(@Nullable String parentalRating) {
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
   */
  @Valid 
  @Schema(name = "collections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections")
  public List<@Valid Album> getCollections() {
    return collections;
  }

  public void setCollections(List<@Valid Album> collections) {
    this.collections = collections;
  }

  public Media collectionCount(@Nullable Integer collectionCount) {
    this.collectionCount = collectionCount;
    return this;
  }

  /**
   * Get collectionCount
   * @return collectionCount
   */
  
  @Schema(name = "collectionCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collectionCount")
  public @Nullable Integer getCollectionCount() {
    return collectionCount;
  }

  public void setCollectionCount(@Nullable Integer collectionCount) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

