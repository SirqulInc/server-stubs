package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricImage;
import org.openapitools.model.FingerprintBiometricImage;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BiometricRequest   {
  
  private BiometricImage face;
  private List<@Valid FingerprintBiometricImage> fingerprints = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("face")
  @Valid
  public BiometricImage getFace() {
    return face;
  }
  public void setFace(BiometricImage face) {
    this.face = face;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fingerprints")
  @Valid
  public List<@Valid FingerprintBiometricImage> getFingerprints() {
    return fingerprints;
  }
  public void setFingerprints(List<@Valid FingerprintBiometricImage> fingerprints) {
    this.fingerprints = fingerprints;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

