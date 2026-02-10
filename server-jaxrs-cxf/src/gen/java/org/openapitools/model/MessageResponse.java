package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageResponse  {
  
  @ApiModelProperty(value = "")

  private String message;

  @ApiModelProperty(value = "")

  private Integer code;

  @ApiModelProperty(value = "")

  private String ids;

  @ApiModelProperty(value = "")

  private String updateValue;
 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MessageResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public MessageResponse code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Get ids
   * @return ids
  **/
  @JsonProperty("ids")
  public String getIds() {
    return ids;
  }

  public void setIds(String ids) {
    this.ids = ids;
  }

  public MessageResponse ids(String ids) {
    this.ids = ids;
    return this;
  }

 /**
   * Get updateValue
   * @return updateValue
  **/
  @JsonProperty("updateValue")
  public String getUpdateValue() {
    return updateValue;
  }

  public void setUpdateValue(String updateValue) {
    this.updateValue = updateValue;
  }

  public MessageResponse updateValue(String updateValue) {
    this.updateValue = updateValue;
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
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.message, messageResponse.message) &&
        Objects.equals(this.code, messageResponse.code) &&
        Objects.equals(this.ids, messageResponse.ids) &&
        Objects.equals(this.updateValue, messageResponse.updateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, ids, updateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    updateValue: ").append(toIndentedString(updateValue)).append("\n");
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

