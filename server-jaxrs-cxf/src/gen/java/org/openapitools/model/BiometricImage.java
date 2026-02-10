package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BiometricImage  {
  
public enum PositionEnum {

UNKNOWN(String.valueOf("UNKNOWN")), LEFT_INDEX(String.valueOf("LEFT_INDEX")), LEFT_MIDDLE(String.valueOf("LEFT_MIDDLE")), LEFT_RING(String.valueOf("LEFT_RING")), LEFT_LITTLE(String.valueOf("LEFT_LITTLE")), LEFT_THUMB(String.valueOf("LEFT_THUMB")), RIGHT_INDEX(String.valueOf("RIGHT_INDEX")), RIGHT_MIDDLE(String.valueOf("RIGHT_MIDDLE")), RIGHT_RING(String.valueOf("RIGHT_RING")), RIGHT_LITTLE(String.valueOf("RIGHT_LITTLE")), RIGHT_THUMB(String.valueOf("RIGHT_THUMB")), LEFT(String.valueOf("LEFT")), RIGHT(String.valueOf("RIGHT"));


    private String value;

    PositionEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String value) {
        for (PositionEnum b : PositionEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private PositionEnum position;

  @ApiModelProperty(value = "")

  private String data;
 /**
   * Get position
   * @return position
  **/
  @JsonProperty("position")
  public String getPosition() {
    if (position == null) {
      return null;
    }
    return position.value();
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public BiometricImage position(PositionEnum position) {
    this.position = position;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public BiometricImage data(String data) {
    this.data = data;
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
    BiometricImage biometricImage = (BiometricImage) o;
    return Objects.equals(this.position, biometricImage.position) &&
        Objects.equals(this.data, biometricImage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricImage {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

