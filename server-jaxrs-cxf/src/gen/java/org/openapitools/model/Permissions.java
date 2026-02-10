package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Permissions  {
  
  @ApiModelProperty(value = "")

  private Boolean read;

  @ApiModelProperty(value = "")

  private Boolean write;

  @ApiModelProperty(value = "")

  private Boolean delete;

  @ApiModelProperty(value = "")

  private Boolean add;
 /**
   * Get read
   * @return read
  **/
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Permissions read(Boolean read) {
    this.read = read;
    return this;
  }

 /**
   * Get write
   * @return write
  **/
  @JsonProperty("write")
  public Boolean getWrite() {
    return write;
  }

  public void setWrite(Boolean write) {
    this.write = write;
  }

  public Permissions write(Boolean write) {
    this.write = write;
    return this;
  }

 /**
   * Get delete
   * @return delete
  **/
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public Permissions delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

 /**
   * Get add
   * @return add
  **/
  @JsonProperty("add")
  public Boolean getAdd() {
    return add;
  }

  public void setAdd(Boolean add) {
    this.add = add;
  }

  public Permissions add(Boolean add) {
    this.add = add;
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
    Permissions permissions = (Permissions) o;
    return Objects.equals(this.read, permissions.read) &&
        Objects.equals(this.write, permissions.write) &&
        Objects.equals(this.delete, permissions.delete) &&
        Objects.equals(this.add, permissions.add);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, write, delete, add);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

