package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FingerprintBiometricImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

    private final String value;

    PositionEnum(String value) {
      this.value = value;
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

  @JsonProperty("position")
  
  private PositionEnum position;

  @JsonProperty("data")
  
  private String data;

  @JsonProperty("imageFormat")
  
  private String imageFormat;

  public FingerprintBiometricImage position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public FingerprintBiometricImage data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public FingerprintBiometricImage imageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Get imageFormat
   * @return imageFormat
  **/
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
    return Objects.equals(position, fingerprintBiometricImage.position) &&
        Objects.equals(data, fingerprintBiometricImage.data) &&
        Objects.equals(imageFormat, fingerprintBiometricImage.imageFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, data, imageFormat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

