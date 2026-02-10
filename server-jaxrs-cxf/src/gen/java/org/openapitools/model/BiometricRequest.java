package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricImage;
import org.openapitools.model.FingerprintBiometricImage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BiometricRequest  {
  
  @ApiModelProperty(value = "")

  @Valid

  private BiometricImage face;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid FingerprintBiometricImage> fingerprints = new ArrayList<>();
 /**
   * Get face
   * @return face
  **/
  @JsonProperty("face")
  public BiometricImage getFace() {
    return face;
  }

  public void setFace(BiometricImage face) {
    this.face = face;
  }

  public BiometricRequest face(BiometricImage face) {
    this.face = face;
    return this;
  }

 /**
   * Get fingerprints
   * @return fingerprints
  **/
  @JsonProperty("fingerprints")
  public List<@Valid FingerprintBiometricImage> getFingerprints() {
    return fingerprints;
  }

  public void setFingerprints(List<@Valid FingerprintBiometricImage> fingerprints) {
    this.fingerprints = fingerprints;
  }

  public BiometricRequest fingerprints(List<@Valid FingerprintBiometricImage> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public BiometricRequest addFingerprintsItem(FingerprintBiometricImage fingerprintsItem) {
    this.fingerprints.add(fingerprintsItem);
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
    BiometricRequest biometricRequest = (BiometricRequest) o;
    return Objects.equals(this.face, biometricRequest.face) &&
        Objects.equals(this.fingerprints, biometricRequest.fingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(face, fingerprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricRequest {\n");
    
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    fingerprints: ").append(toIndentedString(fingerprints)).append("\n");
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

