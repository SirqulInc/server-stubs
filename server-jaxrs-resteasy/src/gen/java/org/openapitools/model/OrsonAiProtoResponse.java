package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiProtoResponse   {
  
  private String rawResponse;
  private AssetShortResponse assetResponse;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rawResponse")
  public String getRawResponse() {
    return rawResponse;
  }
  public void setRawResponse(String rawResponse) {
    this.rawResponse = rawResponse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("assetResponse")
  @Valid
  public AssetShortResponse getAssetResponse() {
    return assetResponse;
  }
  public void setAssetResponse(AssetShortResponse assetResponse) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

