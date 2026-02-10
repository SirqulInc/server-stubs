package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Permissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Permissions   {
  @JsonProperty("read")
  
  private Boolean read;

  @JsonProperty("write")
  
  private Boolean write;

  @JsonProperty("delete")
  
  private Boolean delete;

  @JsonProperty("add")
  
  private Boolean add;

  public Permissions read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Permissions write(Boolean write) {
    this.write = write;
    return this;
  }

   /**
   * Get write
   * @return write
  **/
  public Boolean getWrite() {
    return write;
  }

  public void setWrite(Boolean write) {
    this.write = write;
  }

  public Permissions delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  public Boolean getDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public Permissions add(Boolean add) {
    this.add = add;
    return this;
  }

   /**
   * Get add
   * @return add
  **/
  public Boolean getAdd() {
    return add;
  }

  public void setAdd(Boolean add) {
    this.add = add;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permissions permissions = (Permissions) o;
    return Objects.equals(read, permissions.read) &&
        Objects.equals(write, permissions.write) &&
        Objects.equals(delete, permissions.delete) &&
        Objects.equals(add, permissions.add);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write, delete, add);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permissions {\n");
    
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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

