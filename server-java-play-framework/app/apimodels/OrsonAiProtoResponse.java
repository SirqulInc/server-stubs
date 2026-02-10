package apimodels;

import apimodels.AssetShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrsonAiProtoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrsonAiProtoResponse   {
  @JsonProperty("rawResponse")
  
  private String rawResponse;

  @JsonProperty("assetResponse")
  @Valid

  private AssetShortResponse assetResponse;

  public OrsonAiProtoResponse rawResponse(String rawResponse) {
    this.rawResponse = rawResponse;
    return this;
  }

   /**
   * Get rawResponse
   * @return rawResponse
  **/
  public String getRawResponse() {
    return rawResponse;
  }

  public void setRawResponse(String rawResponse) {
    this.rawResponse = rawResponse;
  }

  public OrsonAiProtoResponse assetResponse(AssetShortResponse assetResponse) {
    this.assetResponse = assetResponse;
    return this;
  }

   /**
   * Get assetResponse
   * @return assetResponse
  **/
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
    return Objects.equals(rawResponse, orsonAiProtoResponse.rawResponse) &&
        Objects.equals(assetResponse, orsonAiProtoResponse.assetResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawResponse, assetResponse);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

