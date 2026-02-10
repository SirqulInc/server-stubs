package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MessageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MessageResponse   {
  @JsonProperty("message")
  
  private String message;

  @JsonProperty("code")
  
  private Integer code;

  @JsonProperty("ids")
  
  private String ids;

  @JsonProperty("updateValue")
  
  private String updateValue;

  public MessageResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MessageResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public MessageResponse ids(String ids) {
    this.ids = ids;
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  public String getIds() {
    return ids;
  }

  public void setIds(String ids) {
    this.ids = ids;
  }

  public MessageResponse updateValue(String updateValue) {
    this.updateValue = updateValue;
    return this;
  }

   /**
   * Get updateValue
   * @return updateValue
  **/
  public String getUpdateValue() {
    return updateValue;
  }

  public void setUpdateValue(String updateValue) {
    this.updateValue = updateValue;
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
    return Objects.equals(message, messageResponse.message) &&
        Objects.equals(code, messageResponse.code) &&
        Objects.equals(ids, messageResponse.ids) &&
        Objects.equals(updateValue, messageResponse.updateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, ids, updateValue);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

