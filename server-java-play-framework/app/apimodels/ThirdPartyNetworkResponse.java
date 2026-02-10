package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ThirdPartyNetworkResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ThirdPartyNetworkResponse   {
  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("networkUID")
  
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

    private final String value;

    NetworkEnum(String value) {
      this.value = value;
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

  @JsonProperty("network")
  
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

    private final String value;

    IntrospectionMethodEnum(String value) {
      this.value = value;
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

  @JsonProperty("introspectionMethod")
  
  private IntrospectionMethodEnum introspectionMethod;

  @JsonProperty("enableIntrospection")
  
  private Boolean enableIntrospection;

  @JsonProperty("introspectionURL")
  
  private String introspectionURL;

  @JsonProperty("introspectionParams")
  
  private String introspectionParams;

  @JsonProperty("requiredRootField")
  
  private String requiredRootField;

  public ThirdPartyNetworkResponse updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }

  public ThirdPartyNetworkResponse created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ThirdPartyNetworkResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ThirdPartyNetworkResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThirdPartyNetworkResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ThirdPartyNetworkResponse networkUID(String networkUID) {
    this.networkUID = networkUID;
    return this;
  }

   /**
   * Get networkUID
   * @return networkUID
  **/
  public String getNetworkUID() {
    return networkUID;
  }

  public void setNetworkUID(String networkUID) {
    this.networkUID = networkUID;
  }

  public ThirdPartyNetworkResponse network(NetworkEnum network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  public NetworkEnum getNetwork() {
    return network;
  }

  public void setNetwork(NetworkEnum network) {
    this.network = network;
  }

  public ThirdPartyNetworkResponse introspectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
    return this;
  }

   /**
   * Get introspectionMethod
   * @return introspectionMethod
  **/
  public IntrospectionMethodEnum getIntrospectionMethod() {
    return introspectionMethod;
  }

  public void setIntrospectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
  }

  public ThirdPartyNetworkResponse enableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
    return this;
  }

   /**
   * Get enableIntrospection
   * @return enableIntrospection
  **/
  public Boolean getEnableIntrospection() {
    return enableIntrospection;
  }

  public void setEnableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
  }

  public ThirdPartyNetworkResponse introspectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
    return this;
  }

   /**
   * Get introspectionURL
   * @return introspectionURL
  **/
  public String getIntrospectionURL() {
    return introspectionURL;
  }

  public void setIntrospectionURL(String introspectionURL) {
    this.introspectionURL = introspectionURL;
  }

  public ThirdPartyNetworkResponse introspectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
    return this;
  }

   /**
   * Get introspectionParams
   * @return introspectionParams
  **/
  public String getIntrospectionParams() {
    return introspectionParams;
  }

  public void setIntrospectionParams(String introspectionParams) {
    this.introspectionParams = introspectionParams;
  }

  public ThirdPartyNetworkResponse requiredRootField(String requiredRootField) {
    this.requiredRootField = requiredRootField;
    return this;
  }

   /**
   * Get requiredRootField
   * @return requiredRootField
  **/
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
    return Objects.equals(updated, thirdPartyNetworkResponse.updated) &&
        Objects.equals(created, thirdPartyNetworkResponse.created) &&
        Objects.equals(active, thirdPartyNetworkResponse.active) &&
        Objects.equals(name, thirdPartyNetworkResponse.name) &&
        Objects.equals(description, thirdPartyNetworkResponse.description) &&
        Objects.equals(networkUID, thirdPartyNetworkResponse.networkUID) &&
        Objects.equals(network, thirdPartyNetworkResponse.network) &&
        Objects.equals(introspectionMethod, thirdPartyNetworkResponse.introspectionMethod) &&
        Objects.equals(enableIntrospection, thirdPartyNetworkResponse.enableIntrospection) &&
        Objects.equals(introspectionURL, thirdPartyNetworkResponse.introspectionURL) &&
        Objects.equals(introspectionParams, thirdPartyNetworkResponse.introspectionParams) &&
        Objects.equals(requiredRootField, thirdPartyNetworkResponse.requiredRootField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, created, active, name, description, networkUID, network, introspectionMethod, enableIntrospection, introspectionURL, introspectionParams, requiredRootField);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

