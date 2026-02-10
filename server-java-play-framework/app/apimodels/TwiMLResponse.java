package apimodels;

import apimodels.Verb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TwiMLResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TwiMLResponse   {
  @JsonProperty("tag")
  
  private String tag;

  @JsonProperty("body")
  
  private String body;

  @JsonProperty("attributes")
  
  private Map<String, String> attributes = null;

  @JsonProperty("children")
  @Valid

  private List<@Valid Verb> children = null;

  public TwiMLResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public TwiMLResponse body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
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
  **/
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
  **/
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
    return Objects.equals(tag, twiMLResponse.tag) &&
        Objects.equals(body, twiMLResponse.body) &&
        Objects.equals(attributes, twiMLResponse.attributes) &&
        Objects.equals(children, twiMLResponse.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, body, attributes, children);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

