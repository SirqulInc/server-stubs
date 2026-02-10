package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Node   {
  @JsonProperty("x")
  
  private Integer x;

  @JsonProperty("y")
  
  private Integer y;

  @JsonProperty("z")
  
  private Integer z;

  public Node x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Node y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public Node z(Integer z) {
    this.z = z;
    return this;
  }

   /**
   * Get z
   * @return z
  **/
  public Integer getZ() {
    return z;
  }

  public void setZ(Integer z) {
    this.z = z;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(x, node.x) &&
        Objects.equals(y, node.y) &&
        Objects.equals(z, node.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

