package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UrlResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageGenerationResponse  {
  
  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid UrlResponse> data = new ArrayList<>();
 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ImageGenerationResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public List<@Valid UrlResponse> getData() {
    return data;
  }

  public void setData(List<@Valid UrlResponse> data) {
    this.data = data;
  }

  public ImageGenerationResponse data(List<@Valid UrlResponse> data) {
    this.data = data;
    return this;
  }

  public ImageGenerationResponse addDataItem(UrlResponse dataItem) {
    this.data.add(dataItem);
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
    ImageGenerationResponse imageGenerationResponse = (ImageGenerationResponse) o;
    return Objects.equals(this.created, imageGenerationResponse.created) &&
        Objects.equals(this.data, imageGenerationResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageGenerationResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

