package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Verb;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TwiMLResponse  {
  
  @ApiModelProperty(value = "")

  private String tag;

  @ApiModelProperty(value = "")

  private String body;

  @ApiModelProperty(value = "")

  private Map<String, String> attributes = new HashMap<>();

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid Verb> children = new ArrayList<>();
 /**
   * Get tag
   * @return tag
  **/
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TwiMLResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

 /**
   * Get body
   * @return body
  **/
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public TwiMLResponse body(String body) {
    this.body = body;
    return this;
  }

 /**
   * Get attributes
   * @return attributes
  **/
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public TwiMLResponse attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public TwiMLResponse putAttributesItem(String key, String attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

 /**
   * Get children
   * @return children
  **/
  @JsonProperty("children")
  public List<@Valid Verb> getChildren() {
    return children;
  }

  public void setChildren(List<@Valid Verb> children) {
    this.children = children;
  }

  public TwiMLResponse children(List<@Valid Verb> children) {
    this.children = children;
    return this;
  }

  public TwiMLResponse addChildrenItem(Verb childrenItem) {
    this.children.add(childrenItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

