package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AgeGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AgeGroupResponse   {
  @JsonProperty("key")
  
  private String key;

  @JsonProperty("toString")
  
  private String toString;

  public AgeGroupResponse key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public AgeGroupResponse toString(String toString) {
    this.toString = toString;
    return this;
  }

   /**
   * Get toString
   * @return toString
  **/
  public String getToString() {
    return toString;
  }

  public void setToString(String toString) {
    this.toString = toString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeGroupResponse ageGroupResponse = (AgeGroupResponse) o;
    return Objects.equals(key, ageGroupResponse.key) &&
        Objects.equals(toString, ageGroupResponse.toString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, toString);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeGroupResponse {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    toString: ").append(toIndentedString(toString)).append("\n");
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

