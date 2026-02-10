package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UrlResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class UrlResponse {

  private @Nullable String url;

  private @Nullable AssetShortResponse asset;

  public UrlResponse url(@Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable String getUrl() {
    return url;
  }

  public void setUrl(@Nullable String url) {
    this.url = url;
  }

  public UrlResponse asset(@Nullable AssetShortResponse asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   * @return asset
   */
  @Valid 
  @Schema(name = "asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset")
  public @Nullable AssetShortResponse getAsset() {
    return asset;
  }

  public void setAsset(@Nullable AssetShortResponse asset) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

