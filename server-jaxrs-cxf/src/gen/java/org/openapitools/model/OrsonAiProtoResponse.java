package org.openapitools.model;

import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrsonAiProtoResponse  {
  
  @ApiModelProperty(value = "")

  private String rawResponse;

  @ApiModelProperty(value = "")

  @Valid

  private AssetShortResponse assetResponse;
 /**
   * Get rawResponse
   * @return rawResponse
  **/
  @JsonProperty("rawResponse")
  public String getRawResponse() {
    return rawResponse;
  }

  public void setRawResponse(String rawResponse) {
    this.rawResponse = rawResponse;
  }

  public OrsonAiProtoResponse rawResponse(String rawResponse) {
    this.rawResponse = rawResponse;
    return this;
  }

 /**
   * Get assetResponse
   * @return assetResponse
  **/
  @JsonProperty("assetResponse")
  public AssetShortResponse getAssetResponse() {
    return assetResponse;
  }

  public void setAssetResponse(AssetShortResponse assetResponse) {
    this.assetResponse = assetResponse;
  }

  public OrsonAiProtoResponse assetResponse(AssetShortResponse assetResponse) {
    this.assetResponse = assetResponse;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

