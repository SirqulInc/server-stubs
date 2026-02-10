package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BillableEntity;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThirdPartyNetwork  {
  
  @ApiModelProperty(value = "")

  private Long id;

  @ApiModelProperty(value = "")

  private Boolean active;

  @ApiModelProperty(value = "")

  private Boolean valid;

  @ApiModelProperty(value = "")

  private String networkUID;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String description;

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

  private String introspectionURL;

  @ApiModelProperty(value = "")

  private String introspectionParams;

  @ApiModelProperty(value = "")

  private String requiredRootField;

  @ApiModelProperty(value = "")

  @Valid

  private BillableEntity billableEntity;

public enum SupportedNetworkEnum {

FACEBOOK(String.valueOf("FACEBOOK")), TWITTER(String.valueOf("TWITTER")), CLEAR(String.valueOf("CLEAR")), USERNAME(String.valueOf("USERNAME")), PHONE(String.valueOf("PHONE")), UNKNOWN(String.valueOf("UNKNOWN")), CUSTOM(String.valueOf("CUSTOM"));


    private String value;

    SupportedNetworkEnum (String v) {
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
    public static SupportedNetworkEnum fromValue(String value) {
        for (SupportedNetworkEnum b : SupportedNetworkEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")

  private SupportedNetworkEnum supportedNetwork;

  @ApiModelProperty(value = "")

  private Boolean enableIntrospection;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ThirdPartyNetwork id(Long id) {
    this.id = id;
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

  public ThirdPartyNetwork active(Boolean active) {
    this.active = active;
    return this;
  }

 /**
   * Get valid
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public ThirdPartyNetwork valid(Boolean valid) {
    this.valid = valid;
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

  public ThirdPartyNetwork networkUID(String networkUID) {
    this.networkUID = networkUID;
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

  public ThirdPartyNetwork name(String name) {
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

  public ThirdPartyNetwork description(String description) {
    this.description = description;
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

  public ThirdPartyNetwork introspectionMethod(IntrospectionMethodEnum introspectionMethod) {
    this.introspectionMethod = introspectionMethod;
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

  public ThirdPartyNetwork introspectionURL(String introspectionURL) {
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

  public ThirdPartyNetwork introspectionParams(String introspectionParams) {
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

  public ThirdPartyNetwork requiredRootField(String requiredRootField) {
    this.requiredRootField = requiredRootField;
    return this;
  }

 /**
   * Get billableEntity
   * @return billableEntity
  **/
  @JsonProperty("billableEntity")
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }

  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  public ThirdPartyNetwork billableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
    return this;
  }

 /**
   * Get supportedNetwork
   * @return supportedNetwork
  **/
  @JsonProperty("supportedNetwork")
  public String getSupportedNetwork() {
    if (supportedNetwork == null) {
      return null;
    }
    return supportedNetwork.value();
  }

  public void setSupportedNetwork(SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
  }

  public ThirdPartyNetwork supportedNetwork(SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
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

  public ThirdPartyNetwork enableIntrospection(Boolean enableIntrospection) {
    this.enableIntrospection = enableIntrospection;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

