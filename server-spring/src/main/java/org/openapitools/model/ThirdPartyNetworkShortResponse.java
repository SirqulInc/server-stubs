package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ThirdPartyNetworkShortResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyNetworkShortResponse {

  private @Nullable Long updated;

  private @Nullable Long created;

  private @Nullable Boolean active;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String networkUID;

  /**
   * Gets or Sets network
   */
  public enum NetworkEnum {
    FACEBOOK("FACEBOOK"),
    
    TWITTER("TWITTER"),
    
    CLEAR("CLEAR"),
    
    USERNAME("USERNAME"),
    
    PHONE("PHONE"),
    
    UNKNOWN("UNKNOWN"),
    
    CUSTOM("CUSTOM");

    private final String value;

    NetworkEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NetworkEnum fromValue(String value) {
      for (NetworkEnum b : NetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable NetworkEnum network;

  public ThirdPartyNetworkShortResponse updated(@Nullable Long updated) {
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

  public ThirdPartyNetworkShortResponse created(@Nullable Long created) {
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

  public ThirdPartyNetworkShortResponse active(@Nullable Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
   */
  
  @Schema(name = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public @Nullable Boolean getActive() {
    return active;
  }

  public void setActive(@Nullable Boolean active) {
    this.active = active;
  }

  public ThirdPartyNetworkShortResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ThirdPartyNetworkShortResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ThirdPartyNetworkShortResponse networkUID(@Nullable String networkUID) {
    this.networkUID = networkUID;
    return this;
  }

  /**
   * Get networkUID
   * @return networkUID
   */
  
  @Schema(name = "networkUID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("networkUID")
  public @Nullable String getNetworkUID() {
    return networkUID;
  }

  public void setNetworkUID(@Nullable String networkUID) {
    this.networkUID = networkUID;
  }

  public ThirdPartyNetworkShortResponse network(@Nullable NetworkEnum network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
   */
  
  @Schema(name = "network", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("network")
  public @Nullable NetworkEnum getNetwork() {
    return network;
  }

  public void setNetwork(@Nullable NetworkEnum network) {
    this.network = network;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyNetworkShortResponse thirdPartyNetworkShortResponse = (ThirdPartyNetworkShortResponse) o;
    return Objects.equals(this.updated, thirdPartyNetworkShortResponse.updated) &&
        Objects.equals(this.created, thirdPartyNetworkShortResponse.created) &&
        Objects.equals(this.active, thirdPartyNetworkShortResponse.active) &&
        Objects.equals(this.name, thirdPartyNetworkShortResponse.name) &&
        Objects.equals(this.description, thirdPartyNetworkShortResponse.description) &&
        Objects.equals(this.networkUID, thirdPartyNetworkShortResponse.networkUID) &&
        Objects.equals(this.network, thirdPartyNetworkShortResponse.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, created, active, name, description, networkUID, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyNetworkShortResponse {\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkUID: ").append(toIndentedString(networkUID)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

