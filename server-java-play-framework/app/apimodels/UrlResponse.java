package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UrlResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UrlResponse   {
  @JsonProperty("url")
  
  private String url;

  @JsonProperty("asset")
  @Valid

  private AssetShortResponse asset;

  public UrlResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UrlResponse asset(AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  public AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(AssetShortResponse asset) {
    this.asset = asset;
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
    return Objects.equals(url, urlResponse.url) &&
        Objects.equals(asset, urlResponse.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, asset);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

