package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JsonObject;
import org.openapitools.model.NameStringValueResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ObjectStoreResponse  {
  
  @ApiModelProperty(value = "")

  @Valid

  private JsonObject jsonObject;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid NameStringValueResponse> request = new ArrayList<>();
 /**
   * Get jsonObject
   * @return jsonObject
  **/
  @JsonProperty("jsonObject")
  public JsonObject getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(JsonObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public ObjectStoreResponse jsonObject(JsonObject jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
  }

  public ObjectStoreResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ObjectStoreResponse addRequestItem(NameStringValueResponse requestItem) {
    this.request.add(requestItem);
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
    ObjectStoreResponse objectStoreResponse = (ObjectStoreResponse) o;
    return Objects.equals(this.jsonObject, objectStoreResponse.jsonObject) &&
        Objects.equals(this.request, objectStoreResponse.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonObject, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStoreResponse {\n");
    
    sb.append("    jsonObject: ").append(toIndentedString(jsonObject)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

