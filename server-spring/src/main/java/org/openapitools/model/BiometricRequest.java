package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BiometricImage;
import org.openapitools.model.FingerprintBiometricImage;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BiometricRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class BiometricRequest {

  private @Nullable BiometricImage face;

  @Valid
  private List<@Valid FingerprintBiometricImage> fingerprints = new ArrayList<>();

  public BiometricRequest face(@Nullable BiometricImage face) {
    this.face = face;
    return this;
  }

  /**
   * Get face
   * @return face
   */
  @Valid 
  @Schema(name = "face", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("face")
  public @Nullable BiometricImage getFace() {
    return face;
  }

  public void setFace(@Nullable BiometricImage face) {
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
   */
  @Valid 
  @Schema(name = "fingerprints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fingerprints")
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

