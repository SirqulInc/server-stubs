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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonAiTTSResponse   {
  
  private String requestId;
  private Integer responseCode;
  private String responseRaw;
  private AssetShortResponse asset;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseCode")
  public Integer getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("responseRaw")
  public String getResponseRaw() {
    return responseRaw;
  }
  public void setResponseRaw(String responseRaw) {
    this.responseRaw = responseRaw;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asset")
  @Valid
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
    OrsonAiTTSResponse orsonAiTTSResponse = (OrsonAiTTSResponse) o;
    return Objects.equals(this.requestId, orsonAiTTSResponse.requestId) &&
        Objects.equals(this.responseCode, orsonAiTTSResponse.responseCode) &&
        Objects.equals(this.responseRaw, orsonAiTTSResponse.responseRaw) &&
        Objects.equals(this.asset, orsonAiTTSResponse.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseCode, responseRaw, asset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrsonAiTTSResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseRaw: ").append(toIndentedString(responseRaw)).append("\n");
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

