package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThirdPartyNetworkResponse  {
  
  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String networkUID;

public enum NetworkEnum {

FACEBOOK(String.valueOf("FACEBOOK")), TWITTER(String.valueOf("TWITTER")), CLEAR(String.valueOf("CLEAR")), USERNAME(String.valueOf("USERNAME")), PHONE(String.valueOf("PHONE")), UNKNOWN(String.valueOf("UNKNOWN")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    NetworkEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private NetworkEnum network;

public enum IntrospectionMethodEnum {

GET(String.valueOf("GET")), HEAD(String.valueOf("HEAD")), POST(String.valueOf("POST")), PUT(String.valueOf("PUT")), PATCH(String.valueOf("PATCH")), DELETE(String.valueOf("DELETE")), OPTIONS(String.valueOf("OPTIONS")), TRACE(String.valueOf("TRACE"));


    private String value;

    IntrospectionMethodEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

  @ApiModelProperty(value = "")

  private IntrospectionMethodEnum introspectionMethod;

  @ApiModelProperty(value = "")

  private Boolean enableIntrospection;

  @ApiModelProperty(value = "")

  private String introspectionURL;

  @ApiModelProperty(value = "")

  private String introspectionParams;

  @ApiModelProperty(value = "")

  private String requiredRootField;
 /**
   * Get updated
   * @return updated
  **/
  @JsonProperty("updated")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ThirdPartyNetworkResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

 /**
   * Get created
   * @return created
  **/
  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ThirdPartyNetworkResponse created(Long created) {
    this.created = created;
    return this;
  }

 /**
   * Get active
   * @return active
  **/
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ThirdPartyNetworkResponse active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThirdPartyNetworkResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThirdPartyNetworkResponse description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get networkUID
   * @return networkUID
  **/
  @JsonProperty("networkUID")
  public String getNetworkUID() {
    return networkUID;
  }

  public void setNetworkUID(String networkUID) {
    this.networkUID = networkUID;
  }

  public ThirdPartyNetworkResponse networkUID(String networkUID) {
    this.networkUID = networkUID;
    return this;
  }

 /**
   * Get network
   * @return network
  **/
  @JsonProperty("network")
  public String getNetwork() {
    if (network == null) {
      return null;
    }
    return network.value();
  }

  public void setNetwork(NetworkEnum network) {
    this.network = network;
  }

  public ThirdPartyNetworkResponse network(NetworkEnum network) {
    this.network = network;
    return this;
  }

 /**
   * Get introspectionMethod
   * @return introspectionMethod
  **/
  @JsonProperty("introspectionMethod")
  public String getIntrospectionMethod() {
    if (introspectionMethod == null) {
      return null;
    }
    return introspectionMethod.value();
  }

  public void setIntrospectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
  }

  public ThirdPartyNetworkResponse introspectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
    return this;
  }

 /**
   * Get enableIntrospection
   * @return enableIntrospection
  **/
  @JsonProperty("enableIntrospection")
  public Boolean getEnableIntrospection() {
    return enableIntrospection;
  }

  public void setEnableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
  }

  public ThirdPartyNetworkResponse enableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
    return this;
  }

 /**
   * Get introspectionURL
   * @return introspectionURL
  **/
  @JsonProperty("introspectionURL")
  public String getIntrospectionURL() {
    return introspectionURL;
  }

  public void setIntrospectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
  }

  public ThirdPartyNetworkResponse introspectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
    return this;
  }

 /**
   * Get introspectionParams
   * @return introspectionParams
  **/
  @JsonProperty("introspectionParams")
  public String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public ThirdPartyNetworkResponse introspectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

 /**
   * Get requiredRootField
   * @return requiredRootField
  **/
  @JsonProperty("requiredRootField")
  public String getRequiredRootField() {
    return requiredRootField;
  }

  public void setRequiredRootField(String requiredRootField) {
    this.requiredRootField = requiredRootField;
  }

  public ThirdPartyNetworkResponse requiredRootField(String requiredRootField) {
    this.requiredRootField = requiredRootField;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

