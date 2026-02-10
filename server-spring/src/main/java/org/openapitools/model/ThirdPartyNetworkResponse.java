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
 * ThirdPartyNetworkResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyNetworkResponse {

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

  /**
   * Gets or Sets introspectionMethod
   */
  public enum IntrospectionMethodEnum {
    GET("GET"),
    
    HEAD("HEAD"),
    
    POST("POST"),
    
    PUT("PUT"),
    
    PATCH("PATCH"),
    
    DELETE("DELETE"),
    
    OPTIONS("OPTIONS"),
    
    TRACE("TRACE");

    private final String value;

    IntrospectionMethodEnum(String value) {
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
    public static IntrospectionMethodEnum fromValue(String value) {
      for (IntrospectionMethodEnum b : IntrospectionMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable IntrospectionMethodEnum introspectionMethod;

  private @Nullable Boolean enableIntrospection;

  private @Nullable String introspectionURL;

  private @Nullable String introspectionParams;

  private @Nullable String requiredRootField;

  public ThirdPartyNetworkResponse updated(@Nullable Long updated) {
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

  public ThirdPartyNetworkResponse created(@Nullable Long created) {
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

  public ThirdPartyNetworkResponse active(@Nullable Boolean active) {
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

  public ThirdPartyNetworkResponse name(@Nullable String name) {
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

  public ThirdPartyNetworkResponse description(@Nullable String description) {
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

  public ThirdPartyNetworkResponse networkUID(@Nullable String networkUID) {
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

  public ThirdPartyNetworkResponse network(@Nullable NetworkEnum network) {
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

  public ThirdPartyNetworkResponse introspectionMethod(@Nullable IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
    return this;
  }

  /**
   * Get introspectionMethod
   * @return introspectionMethod
   */
  
  @Schema(name = "introspectionMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("introspectionMethod")
  public @Nullable IntrospectionMethodEnum getIntrospectionMethod() {
    return introspectionMethod;
  }

  public void setIntrospectionMethod(@Nullable IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
  }

  public ThirdPartyNetworkResponse enableIntrospection(@Nullable Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
    return this;
  }

  /**
   * Get enableIntrospection
   * @return enableIntrospection
   */
  
  @Schema(name = "enableIntrospection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableIntrospection")
  public @Nullable Boolean getEnableIntrospection() {
    return enableIntrospection;
  }

  public void setEnableIntrospection(@Nullable Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
  }

  public ThirdPartyNetworkResponse introspectionURL(@Nullable String introspectionURL) {
    this.introspectionURL = introspectionURL;
    return this;
  }

  /**
   * Get introspectionURL
   * @return introspectionURL
   */
  
  @Schema(name = "introspectionURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("introspectionURL")
  public @Nullable String getIntrospectionURL() {
    return introspectionURL;
  }

  public void setIntrospectionURL(@Nullable String introspectionURL) {
    this.introspectionURL = introspectionURL;
  }

  public ThirdPartyNetworkResponse introspectionParams(@Nullable String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

  /**
   * Get introspectionParams
   * @return introspectionParams
   */
  
  @Schema(name = "introspectionParams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("introspectionParams")
  public @Nullable String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(@Nullable String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public ThirdPartyNetworkResponse requiredRootField(@Nullable String requiredRootField) {
    this.requiredRootField = requiredRootField;
    return this;
  }

  /**
   * Get requiredRootField
   * @return requiredRootField
   */
  
  @Schema(name = "requiredRootField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredRootField")
  public @Nullable String getRequiredRootField() {
    return requiredRootField;
  }

  public void setRequiredRootField(@Nullable String requiredRootField) {
    this.requiredRootField = requiredRootField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyNetworkResponse thirdPartyNetworkResponse = (ThirdPartyNetworkResponse) o;
    return Objects.equals(this.updated, thirdPartyNetworkResponse.updated) &&
        Objects.equals(this.created, thirdPartyNetworkResponse.created) &&
        Objects.equals(this.active, thirdPartyNetworkResponse.active) &&
        Objects.equals(this.name, thirdPartyNetworkResponse.name) &&
        Objects.equals(this.description, thirdPartyNetworkResponse.description) &&
        Objects.equals(this.networkUID, thirdPartyNetworkResponse.networkUID) &&
        Objects.equals(this.network, thirdPartyNetworkResponse.network) &&
        Objects.equals(this.introspectionMethod, thirdPartyNetworkResponse.introspectionMethod) &&
        Objects.equals(this.enableIntrospection, thirdPartyNetworkResponse.enableIntrospection) &&
        Objects.equals(this.introspectionURL, thirdPartyNetworkResponse.introspectionURL) &&
        Objects.equals(this.introspectionParams, thirdPartyNetworkResponse.introspectionParams) &&
        Objects.equals(this.requiredRootField, thirdPartyNetworkResponse.requiredRootField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, created, active, name, description, networkUID, network, introspectionMethod, enableIntrospection, introspectionURL, introspectionParams, requiredRootField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyNetworkResponse {\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkUID: ").append(toIndentedString(networkUID)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    introspectionMethod: ").append(toIndentedString(introspectionMethod)).append("\n");
    sb.append("    enableIntrospection: ").append(toIndentedString(enableIntrospection)).append("\n");
    sb.append("    introspectionURL: ").append(toIndentedString(introspectionURL)).append("\n");
    sb.append("    introspectionParams: ").append(toIndentedString(introspectionParams)).append("\n");
    sb.append("    requiredRootField: ").append(toIndentedString(requiredRootField)).append("\n");
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

