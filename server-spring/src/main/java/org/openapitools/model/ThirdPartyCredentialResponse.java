package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ThirdPartyNetworkShortResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ThirdPartyCredentialResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-11T19:32:41.765375324Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyCredentialResponse {

  private @Nullable Long thirdPartyCredentialId;

  private @Nullable String thirdPartyId;

  private @Nullable String thirdPartyName;

  private @Nullable ThirdPartyNetworkShortResponse network;

  private @Nullable Long updated;

  private @Nullable Long created;

  public ThirdPartyCredentialResponse thirdPartyCredentialId(@Nullable Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
    return this;
  }

  /**
   * Get thirdPartyCredentialId
   * @return thirdPartyCredentialId
   */
  
  @Schema(name = "thirdPartyCredentialId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyCredentialId")
  public @Nullable Long getThirdPartyCredentialId() {
    return thirdPartyCredentialId;
  }

  public void setThirdPartyCredentialId(@Nullable Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
  }

  public ThirdPartyCredentialResponse thirdPartyId(@Nullable String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

  /**
   * Get thirdPartyId
   * @return thirdPartyId
   */
  
  @Schema(name = "thirdPartyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyId")
  public @Nullable String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(@Nullable String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentialResponse thirdPartyName(@Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

  /**
   * Get thirdPartyName
   * @return thirdPartyName
   */
  
  @Schema(name = "thirdPartyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdPartyName")
  public @Nullable String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(@Nullable String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentialResponse network(@Nullable ThirdPartyNetworkShortResponse network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
   */
  @Valid 
  @Schema(name = "network", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("network")
  public @Nullable ThirdPartyNetworkShortResponse getNetwork() {
    return network;
  }

  public void setNetwork(@Nullable ThirdPartyNetworkShortResponse network) {
    this.network = network;
  }

  public ThirdPartyCredentialResponse updated(@Nullable Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
   */
  
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public @Nullable Long getUpdated() {
    return updated;
  }

  public void setUpdated(@Nullable Long updated) {
    this.updated = updated;
  }

  public ThirdPartyCredentialResponse created(@Nullable Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  
  @Schema(name = "created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public @Nullable Long getCreated() {
    return created;
  }

  public void setCreated(@Nullable Long created) {
    this.created = created;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyCredentialResponse thirdPartyCredentialResponse = (ThirdPartyCredentialResponse) o;
    return Objects.equals(this.thirdPartyCredentialId, thirdPartyCredentialResponse.thirdPartyCredentialId) &&
        Objects.equals(this.thirdPartyId, thirdPartyCredentialResponse.thirdPartyId) &&
        Objects.equals(this.thirdPartyName, thirdPartyCredentialResponse.thirdPartyName) &&
        Objects.equals(this.network, thirdPartyCredentialResponse.network) &&
        Objects.equals(this.updated, thirdPartyCredentialResponse.updated) &&
        Objects.equals(this.created, thirdPartyCredentialResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyCredentialId, thirdPartyId, thirdPartyName, network, updated, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyCredentialResponse {\n");
    sb.append("    thirdPartyCredentialId: ").append(toIndentedString(thirdPartyCredentialId)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

