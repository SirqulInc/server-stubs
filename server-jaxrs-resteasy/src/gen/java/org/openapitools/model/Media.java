package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Album;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
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
    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private MediaTypeEnum mediaType;

  /**
   * Gets or Sets condition
   */
  public enum ConditionEnum {
    NEW("NEW"),

        USED("USED"),

        REFURBISHED("REFURBISHED"),

        OTHER("OTHER");
    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConditionEnum condition;
  private String isbn;
  private String asin;
  private List<String> catalogNumbers = new ArrayList<>();
  private Integer duration;
  private String author;
  private Long releaseDate;
  private Long availabilityDate;
  private String parentalRating;
  private List<@Valid Album> collections = new ArrayList<>();
  private Integer collectionCount;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("condition")
  public ConditionEnum getCondition() {
    return condition;
  }
  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isbn")
  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asin")
  public String getAsin() {
    return asin;
  }
  public void setAsin(String asin) {
    this.asin = asin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogNumbers")
  public List<String> getCatalogNumbers() {
    return catalogNumbers;
  }
  public void setCatalogNumbers(List<String> catalogNumbers) {
    this.catalogNumbers = catalogNumbers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("releaseDate")
  public Long getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("availabilityDate")
  public Long getAvailabilityDate() {
    return availabilityDate;
  }
  public void setAvailabilityDate(Long availabilityDate) {
    this.availabilityDate = availabilityDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("parentalRating")
  public String getParentalRating() {
    return parentalRating;
  }
  public void setParentalRating(String parentalRating) {
    this.parentalRating = parentalRating;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("collections")
  @Valid
  public List<@Valid Album> getCollections() {
    return collections;
  }
  public void setCollections(List<@Valid Album> collections) {
    this.collections = collections;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("collectionCount")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

