package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FingerprintBiometricImage   {
  

  /**
   * Gets or Sets position
   */
  public enum PositionEnum {
    UNKNOWN("UNKNOWN"),

        LEFT_INDEX("LEFT_INDEX"),

        LEFT_MIDDLE("LEFT_MIDDLE"),

        LEFT_RING("LEFT_RING"),

        LEFT_LITTLE("LEFT_LITTLE"),

        LEFT_THUMB("LEFT_THUMB"),

        RIGHT_INDEX("RIGHT_INDEX"),

        RIGHT_MIDDLE("RIGHT_MIDDLE"),

        RIGHT_RING("RIGHT_RING"),

        RIGHT_LITTLE("RIGHT_LITTLE"),

        RIGHT_THUMB("RIGHT_THUMB"),

        LEFT("LEFT"),

        RIGHT("RIGHT");
    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PositionEnum position;
  private String data;
  private String imageFormat;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("position")
  public PositionEnum getPosition() {
    return position;
  }
  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("imageFormat")
  public String getImageFormat() {
    return imageFormat;
  }
  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

