package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonVideoResponse  {
  
  @ApiModelProperty(value = "")

  private String uri;

  @ApiModelProperty(value = "")

  private String expires;
 /**
   * Get uri
   * @return uri
  **/
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public OrsonVideoResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

 /**
   * Get expires
   * @return expires
  **/
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public OrsonVideoResponse expires(String expires) {
    this.expires = expires;
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
    OrsonVideoResponse orsonVideoResponse = (OrsonVideoResponse) o;
    return Objects.equals(this.uri, orsonVideoResponse.uri) &&
        Objects.equals(this.expires, orsonVideoResponse.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonVideoResponse {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

