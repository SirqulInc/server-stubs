package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UrlResponse  {
  
  @ApiModelProperty(value = "")

  private String url;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse asset;
 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UrlResponse url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get asset
   * @return asset
  **/
  @JsonProperty("asset")
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
  }

  public UrlResponse asset(AssetShortResponse asset) {
    this.asset = asset;
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
    UrlResponse urlResponse = (UrlResponse) o;
    return Objects.equals(this.url, urlResponse.url) &&
        Objects.equals(this.asset, urlResponse.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, asset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

