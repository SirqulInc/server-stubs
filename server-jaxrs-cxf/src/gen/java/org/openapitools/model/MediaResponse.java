package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MediaResponse  {
  
  @ApiModelProperty(value = "")

  private String mediaType;

  @ApiModelProperty(value = "")

  private Integer duration;

  @ApiModelProperty(value = "")

  private String author;

  @ApiModelProperty(value = "")

  private Long releaseDate;
 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public MediaResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
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

  public MediaResponse duration(Integer duration) {
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

  public MediaResponse author(String author) {
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

  public MediaResponse releaseDate(Long releaseDate) {
    this.releaseDate = releaseDate;
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
    MediaResponse mediaResponse = (MediaResponse) o;
    return Objects.equals(this.mediaType, mediaResponse.mediaType) &&
        Objects.equals(this.duration, mediaResponse.duration) &&
        Objects.equals(this.author, mediaResponse.author) &&
        Objects.equals(this.releaseDate, mediaResponse.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, duration, author, releaseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaResponse {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
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

