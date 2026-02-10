package apimodels;

import apimodels.JsonObject;
import apimodels.NameStringValueResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ObjectStoreResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ObjectStoreResponse   {
  @JsonProperty("jsonObject")
  @Valid

  private JsonObject jsonObject;

  @JsonProperty("request")
  @Valid

  private List<@Valid NameStringValueResponse> request = null;

  public ObjectStoreResponse jsonObject(JsonObject jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

   /**
   * Get jsonObject
   * @return jsonObject
  **/
  public JsonObject getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(JsonObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  public ObjectStoreResponse request(List<@Valid NameStringValueResponse> request) {
    this.request = request;
    return this;
  }

  public ObjectStoreResponse addRequestItem(NameStringValueResponse requestItem) {
    if (this.request == null) {
      this.request = new ArrayList<>();
    }
    this.request.add(requestItem);
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public List<@Valid NameStringValueResponse> getRequest() {
    return request;
  }

  public void setRequest(List<@Valid NameStringValueResponse> request) {
    this.request = request;
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
    return Objects.equals(jsonObject, objectStoreResponse.jsonObject) &&
        Objects.equals(request, objectStoreResponse.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonObject, request);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

