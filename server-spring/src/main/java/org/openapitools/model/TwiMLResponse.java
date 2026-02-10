package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Verb;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TwiMLResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class TwiMLResponse {

  private @Nullable String tag;

  private @Nullable String body;

  @Valid
  private Map<String, String> attributes = new HashMap<>();

  @Valid
  private List<@Valid Verb> children = new ArrayList<>();

  public TwiMLResponse tag(@Nullable String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public @Nullable String getTag() {
    return tag;
  }

  public void setTag(@Nullable String tag) {
    this.tag = tag;
  }

  public TwiMLResponse body(@Nullable String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  
  @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public @Nullable String getBody() {
    return body;
  }

  public void setBody(@Nullable String body) {
    this.body = body;
  }

  public TwiMLResponse attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TwiMLResponse putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public TwiMLResponse children(List<@Valid Verb> children) {
    this.children = children;
    return this;
  }

  public TwiMLResponse addChildrenItem(Verb childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
   */
  @Valid 
  @Schema(name = "children", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("children")
  public List<@Valid Verb> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Verb> children) {
    this.children = children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwiMLResponse twiMLResponse = (TwiMLResponse) o;
    return Objects.equals(this.tag, twiMLResponse.tag) &&
        Objects.equals(this.body, twiMLResponse.body) &&
        Objects.equals(this.attributes, twiMLResponse.attributes) &&
        Objects.equals(this.children, twiMLResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, body, attributes, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwiMLResponse {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

