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
 * OrsonAiProtoResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiProtoResponse {

  private @Nullable String rawResponse;

  private @Nullable AssetShortResponse assetResponse;

  public OrsonAiProtoResponse rawResponse(@Nullable String rawResponse) {
    this.rawResponse = rawResponse;
    return this;
  }

  /**
   * Get rawResponse
   * @return rawResponse
   */
  
  @Schema(name = "rawResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rawResponse")
  public @Nullable String getRawResponse() {
    return rawResponse;
  }

  public void setRawResponse(@Nullable String rawResponse) {
    this.rawResponse = rawResponse;
  }

  public OrsonAiProtoResponse assetResponse(@Nullable AssetShortResponse assetResponse) {
    this.assetResponse = assetResponse;
    return this;
  }

  /**
   * Get assetResponse
   * @return assetResponse
   */
  @Valid 
  @Schema(name = "assetResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetResponse")
  public @Nullable AssetShortResponse getAssetResponse() {
    return assetResponse;
  }

  public void setAssetResponse(@Nullable AssetShortResponse assetResponse) {
    this.assetResponse = assetResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrsonAiProtoResponse orsonAiProtoResponse = (OrsonAiProtoResponse) o;
    return Objects.equals(this.rawResponse, orsonAiProtoResponse.rawResponse) &&
        Objects.equals(this.assetResponse, orsonAiProtoResponse.assetResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawResponse, assetResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiProtoResponse {\n");
    sb.append("    rawResponse: ").append(toIndentedString(rawResponse)).append("\n");
    sb.append("    assetResponse: ").append(toIndentedString(assetResponse)).append("\n");
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

