package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BillableEntity;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyNetwork   {
  
  private Long id;
  private Boolean active;
  private Boolean valid;
  private String networkUID;
  private String name;
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
  private String introspectionURL;
  private String introspectionParams;
  private String requiredRootField;
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
    private String value;

    SupportedNetworkEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SupportedNetworkEnum supportedNetwork;
  private Boolean enableIntrospection;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("billableEntity")
  @Valid
  public BillableEntity getBillableEntity() {
    return billableEntity;
  }
  public void setBillableEntity(BillableEntity billableEntity) {
    this.billableEntity = billableEntity;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("supportedNetwork")
  public SupportedNetworkEnum getSupportedNetwork() {
    return supportedNetwork;
  }
  public void setSupportedNetwork(SupportedNetworkEnum supportedNetwork) {
    this.supportedNetwork = supportedNetwork;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

