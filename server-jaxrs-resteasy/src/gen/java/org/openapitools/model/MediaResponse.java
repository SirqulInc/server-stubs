package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class MediaResponse   {
  
  private String mediaType;
  private Integer duration;
  private String author;
  private Long releaseDate;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

