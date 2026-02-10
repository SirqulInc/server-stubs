package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FingerprintBiometricImage  {
  
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

  @ApiModelProperty(value = "")

  private String imageFormat;
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

  public FingerprintBiometricImage position(PositionEnum position) {
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

  public FingerprintBiometricImage data(String data) {
    this.data = data;
    return this;
  }

 /**
   * Get imageFormat
   * @return imageFormat
  **/
  @JsonProperty("imageFormat")
  public String getImageFormat() {
    return imageFormat;
  }

  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }

  public FingerprintBiometricImage imageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
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
    FingerprintBiometricImage fingerprintBiometricImage = (FingerprintBiometricImage) o;
    return Objects.equals(this.position, fingerprintBiometricImage.position) &&
        Objects.equals(this.data, fingerprintBiometricImage.data) &&
        Objects.equals(this.imageFormat, fingerprintBiometricImage.imageFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, data, imageFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerprintBiometricImage {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
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

