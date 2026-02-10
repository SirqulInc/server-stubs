package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BillableEntity;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ThirdPartyNetwork
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyNetwork {

  private @Nullable Long id;

  private @Nullable Boolean active;

  private @Nullable Boolean valid;

  private @Nullable String networkUID;

  private @Nullable String name;

  private @Nullable String description;

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

  private @Nullable String introspectionURL;

  private @Nullable String introspectionParams;

  private @Nullable String requiredRootField;

  private @Nullable BillableEntity billableEntity;

  /**
   * Gets or Sets supportedNetwork
   */
  public enum SupportedNetworkEnum {
    FACEBOOK("FACEBOOK"),
    
    TWITTER("TWITTER"),
    
    CLEAR("CLEAR"),
    
    USERNAME("USERNAME"),
    
    PHONE("PHONE"),
    
    UNKNOWN("UNKNOWN"),
    
    CUSTOM("CUSTOM");

    private final String value;

    SupportedNetworkEnum(String value) {
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
    public static SupportedNetworkEnum fromValue(String value) {
      for (SupportedNetworkEnum b : SupportedNetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SupportedNetworkEnum supportedNetwork;

  private @Nullable Boolean enableIntrospection;

  public ThirdPartyNetwork id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public ThirdPartyNetwork active(@Nullable Boolean active) {
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

  public ThirdPartyNetwork valid(@Nullable Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   */
  
  @Schema(name = "valid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public @Nullable Boolean getValid() {
    return valid;
  }

  public void setValid(@Nullable Boolean valid) {
    this.valid = valid;
  }

  public ThirdPartyNetwork networkUID(@Nullable String networkUID) {
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

  public ThirdPartyNetwork name(@Nullable String name) {
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

  public ThirdPartyNetwork description(@Nullable String description) {
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

  public ThirdPartyNetwork introspectionMethod(@Nullable IntrospectionMethodEnum introspectionMethod) {
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

  public ThirdPartyNetwork introspectionURL(@Nullable String introspectionURL) {
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

  public ThirdPartyNetwork introspectionParams(@Nullable String introspectionParams) {
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

  public ThirdPartyNetwork requiredRootField(@Nullable String requiredRootField) {
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

  public ThirdPartyNetwork billableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

  /**
   * Get billableEntity
   * @return billableEntity
   */
  @Valid 
  @Schema(name = "billableEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billableEntity")
  public @Nullable BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(@Nullable BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ThirdPartyNetwork supportedNetwork(@Nullable SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
    return this;
  }

  /**
   * Get supportedNetwork
   * @return supportedNetwork
   */
  
  @Schema(name = "supportedNetwork", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportedNetwork")
  public @Nullable SupportedNetworkEnum getSupportedNetwork() {
    return supportedNetwork;
  }

  public void setSupportedNetwork(@Nullable SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
  }

  public ThirdPartyNetwork enableIntrospection(@Nullable Boolean enableIntrospection) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyNetwork thirdPartyNetwork = (ThirdPartyNetwork) o;
    return Objects.equals(this.id, thirdPartyNetwork.id) &&
        Objects.equals(this.active, thirdPartyNetwork.active) &&
        Objects.equals(this.valid, thirdPartyNetwork.valid) &&
        Objects.equals(this.networkUID, thirdPartyNetwork.networkUID) &&
        Objects.equals(this.name, thirdPartyNetwork.name) &&
        Objects.equals(this.description, thirdPartyNetwork.description) &&
        Objects.equals(this.introspectionMethod, thirdPartyNetwork.introspectionMethod) &&
        Objects.equals(this.introspectionURL, thirdPartyNetwork.introspectionURL) &&
        Objects.equals(this.introspectionParams, thirdPartyNetwork.introspectionParams) &&
        Objects.equals(this.requiredRootField, thirdPartyNetwork.requiredRootField) &&
        Objects.equals(this.billableEntity, thirdPartyNetwork.billableEntity) &&
        Objects.equals(this.supportedNetwork, thirdPartyNetwork.supportedNetwork) &&
        Objects.equals(this.enableIntrospection, thirdPartyNetwork.enableIntrospection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, networkUID, name, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, billableEntity, supportedNetwork, enableIntrospection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyNetwork {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    networkUID: ").append(toIndentedString(networkUID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    introspectionMethod: ").append(toIndentedString(introspectionMethod)).append("\n");
    sb.append("    introspectionURL: ").append(toIndentedString(introspectionURL)).append("\n");
    sb.append("    introspectionParams: ").append(toIndentedString(introspectionParams)).append("\n");
    sb.append("    requiredRootField: ").append(toIndentedString(requiredRootField)).append("\n");
    sb.append("    billableEntity: ").append(toIndentedString(billableEntity)).append("\n");
    sb.append("    supportedNetwork: ").append(toIndentedString(supportedNetwork)).append("\n");
    sb.append("    enableIntrospection: ").append(toIndentedString(enableIntrospection)).append("\n");
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

