package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class Permissions   {
  
  private Boolean read;
  private Boolean write;
  private Boolean delete;
  private Boolean add;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("write")
  public Boolean getWrite() {
    return write;
  }
  public void setWrite(Boolean write) {
    this.write = write;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("add")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

