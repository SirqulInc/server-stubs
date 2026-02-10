package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MediaResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MediaResponse   {
  @JsonProperty("mediaType")
  
  private String mediaType;

  @JsonProperty("duration")
  
  private Integer duration;

  @JsonProperty("author")
  
  private String author;

  @JsonProperty("releaseDate")
  
  private Long releaseDate;

  public MediaResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public MediaResponse duration(Integer duration) {
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

  public MediaResponse author(String author) {
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

  public MediaResponse releaseDate(Long releaseDate) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaResponse mediaResponse = (MediaResponse) o;
    return Objects.equals(mediaType, mediaResponse.mediaType) &&
        Objects.equals(duration, mediaResponse.duration) &&
        Objects.equals(author, mediaResponse.author) &&
        Objects.equals(releaseDate, mediaResponse.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, duration, author, releaseDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

