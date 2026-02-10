package apimodels;

import apimodels.BiometricImage;
import apimodels.FingerprintBiometricImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BiometricRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BiometricRequest   {
  @JsonProperty("face")
  @Valid

  private BiometricImage face;

  @JsonProperty("fingerprints")
  @Valid

  private List<@Valid FingerprintBiometricImage> fingerprints = null;

  public BiometricRequest face(BiometricImage face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  public BiometricImage getFace() {
    return face;
  }

  public void setFace(BiometricImage face) {
    this.face = face;
  }

  public BiometricRequest fingerprints(List<@Valid FingerprintBiometricImage> fingerprints) {
    this.fingerprints = fingerprints;
    return this;
  }

  public BiometricRequest addFingerprintsItem(FingerprintBiometricImage fingerprintsItem) {
    if (this.fingerprints == null) {
      this.fingerprints = new ArrayList<>();
    }
    this.fingerprints.add(fingerprintsItem);
    return this;
  }

   /**
   * Get fingerprints
   * @return fingerprints
  **/
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
    return Objects.equals(face, biometricRequest.face) &&
        Objects.equals(fingerprints, biometricRequest.fingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(face, fingerprints);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

