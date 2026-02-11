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
public class ThirdPartyNetworkResponse   {
  
  private Long updated;
  private Long created;
  private Boolean active;
  private String name;
  private String description;
  private String networkUID;

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
    private String value;

    NetworkEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private NetworkEnum network;

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
    private String value;

    IntrospectionMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private IntrospectionMethodEnum introspectionMethod;
  private Boolean enableIntrospection;
  private String introspectionURL;
  private String introspectionParams;
  private String requiredRootField;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }
  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("networkUID")
  public String getNetworkUID() {
    return networkUID;
  }
  public void setNetworkUID(String networkUID) {
    this.networkUID = networkUID;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("network")
  public NetworkEnum getNetwork() {
    return network;
  }
  public void setNetwork(NetworkEnum network) {
    this.network = network;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("introspectionMethod")
  public IntrospectionMethodEnum getIntrospectionMethod() {
    return introspectionMethod;
  }
  public void setIntrospectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enableIntrospection")
  public Boolean getEnableIntrospection() {
    return enableIntrospection;
  }
  public void setEnableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("introspectionURL")
  public String getIntrospectionURL() {
    return introspectionURL;
  }
  public void setIntrospectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("introspectionParams")
  public String getIntrospectionParams() {
    return introspectionParams;
  }
  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requiredRootField")
  public String getRequiredRootField() {
    return requiredRootField;
  }
  public void setRequiredRootField(String requiredRootField) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

