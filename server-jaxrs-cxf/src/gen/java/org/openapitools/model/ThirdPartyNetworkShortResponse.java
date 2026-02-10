package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThirdPartyNetworkShortResponse  {
  
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

  public ThirdPartyNetworkShortResponse updated(Long updated) {
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

  public ThirdPartyNetworkShortResponse created(Long created) {
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

  public ThirdPartyNetworkShortResponse active(Boolean active) {
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

  public ThirdPartyNetworkShortResponse name(String name) {
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

  public ThirdPartyNetworkShortResponse description(String description) {
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

  public ThirdPartyNetworkShortResponse networkUID(String networkUID) {
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

  public ThirdPartyNetworkShortResponse network(NetworkEnum network) {
    this.network = network;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

