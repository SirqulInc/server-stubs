package apimodels;

import apimodels.BillableEntity;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ThirdPartyNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ThirdPartyNetwork   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("active")
  
  private Boolean active;

  @JsonProperty("valid")
  
  private Boolean valid;

  @JsonProperty("networkUID")
  
  private String networkUID;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("description")
  
  private String description;

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

  @JsonProperty("introspectionURL")
  
  private String introspectionURL;

  @JsonProperty("introspectionParams")
  
  private String introspectionParams;

  @JsonProperty("requiredRootField")
  
  private String requiredRootField;

  @JsonProperty("billableEntity")
  @Valid

  private BillableEntity billableEntity;

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

    @Override
    @JsonValue
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

  @JsonProperty("supportedNetwork")
  
  private SupportedNetworkEnum supportedNetwork;

  @JsonProperty("enableIntrospection")
  
  private Boolean enableIntrospection;

  public ThirdPartyNetwork id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ThirdPartyNetwork active(Boolean active) {
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

  public ThirdPartyNetwork valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ThirdPartyNetwork networkUID(String networkUID) {
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

  public ThirdPartyNetwork name(String name) {
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

  public ThirdPartyNetwork description(String description) {
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

  public ThirdPartyNetwork introspectionMethod(IntrospectionMethodEnum introspectionMethod) {
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

  public ThirdPartyNetwork introspectionURL(String introspectionURL) {
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

  public ThirdPartyNetwork introspectionParams(String introspectionParams) {
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

  public ThirdPartyNetwork requiredRootField(String requiredRootField) {
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

  public ThirdPartyNetwork billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

   /**
   * Get billableEntity
   * @return billableEntity
  **/
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ThirdPartyNetwork supportedNetwork(SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
    return this;
  }

   /**
   * Get supportedNetwork
   * @return supportedNetwork
  **/
  public SupportedNetworkEnum getSupportedNetwork() {
    return supportedNetwork;
  }

  public void setSupportedNetwork(SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
  }

  public ThirdPartyNetwork enableIntrospection(Boolean enableIntrospection) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyNetwork thirdPartyNetwork = (ThirdPartyNetwork) o;
    return Objects.equals(id, thirdPartyNetwork.id) &&
        Objects.equals(active, thirdPartyNetwork.active) &&
        Objects.equals(valid, thirdPartyNetwork.valid) &&
        Objects.equals(networkUID, thirdPartyNetwork.networkUID) &&
        Objects.equals(name, thirdPartyNetwork.name) &&
        Objects.equals(description, thirdPartyNetwork.description) &&
        Objects.equals(introspectionMethod, thirdPartyNetwork.introspectionMethod) &&
        Objects.equals(introspectionURL, thirdPartyNetwork.introspectionURL) &&
        Objects.equals(introspectionParams, thirdPartyNetwork.introspectionParams) &&
        Objects.equals(requiredRootField, thirdPartyNetwork.requiredRootField) &&
        Objects.equals(billableEntity, thirdPartyNetwork.billableEntity) &&
        Objects.equals(supportedNetwork, thirdPartyNetwork.supportedNetwork) &&
        Objects.equals(enableIntrospection, thirdPartyNetwork.enableIntrospection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, valid, networkUID, name, description, introspectionMethod, introspectionURL, introspectionParams, requiredRootField, billableEntity, supportedNetwork, enableIntrospection);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

