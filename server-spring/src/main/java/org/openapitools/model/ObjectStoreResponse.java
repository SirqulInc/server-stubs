package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JsonObject;
import org.openapitools.model.NameStringValueResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ObjectStoreResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ObjectStoreResponse {

  private @Nullable JsonObject jsonObject;

  @Valid
  private List<@Valid NameStringValueResponse> request = new ArrayList<>();

  public ObjectStoreResponse jsonObject(@Nullable JsonObject jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

  /**
   * Get jsonObject
   * @return jsonObject
   */
  @Valid 
  @Schema(name = "jsonObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jsonObject")
  public @Nullable JsonObject getJsonObject() {
    return jsonObject;
  }

  public void setJsonObject(@Nullable JsonObject jsonObject) {
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
   */
  @Valid 
  @Schema(name = "request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

