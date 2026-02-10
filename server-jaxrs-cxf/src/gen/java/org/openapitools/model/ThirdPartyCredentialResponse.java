package org.openapitools.model;

import org.openapitools.model.ThirdPartyNetworkShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ThirdPartyCredentialResponse  {
  
  @ApiModelProperty(value = "")

  private Long thirdPartyCredentialId;

  @ApiModelProperty(value = "")

  private String thirdPartyId;

  @ApiModelProperty(value = "")

  private String thirdPartyName;

  @ApiModelProperty(value = "")

  @Valid

  private ThirdPartyNetworkShortResponse network;

  @ApiModelProperty(value = "")

  private Long updated;

  @ApiModelProperty(value = "")

  private Long created;
 /**
   * Get thirdPartyCredentialId
   * @return thirdPartyCredentialId
  **/
  @JsonProperty("thirdPartyCredentialId")
  public Long getThirdPartyCredentialId() {
    return thirdPartyCredentialId;
  }

  public void setThirdPartyCredentialId(Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
  }

  public ThirdPartyCredentialResponse thirdPartyCredentialId(Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
    return this;
  }

 /**
   * Get thirdPartyId
   * @return thirdPartyId
  **/
  @JsonProperty("thirdPartyId")
  public String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentialResponse thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

 /**
   * Get thirdPartyName
   * @return thirdPartyName
  **/
  @JsonProperty("thirdPartyName")
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentialResponse thirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

 /**
   * Get network
   * @return network
  **/
  @JsonProperty("network")
  public ThirdPartyNetworkShortResponse getNetwork() {
    return network;
  }

  public void setNetwork(ThirdPartyNetworkShortResponse network) {
    this.network = network;
  }

  public ThirdPartyCredentialResponse network(ThirdPartyNetworkShortResponse network) {
    this.network = network;
    return this;
  }

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

  public ThirdPartyCredentialResponse updated(Long updated) {
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

  public ThirdPartyCredentialResponse created(Long created) {
    this.created = created;
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
    ThirdPartyCredentialResponse thirdPartyCredentialResponse = (ThirdPartyCredentialResponse) o;
    return Objects.equals(this.thirdPartyCredentialId, thirdPartyCredentialResponse.thirdPartyCredentialId) &&
        Objects.equals(this.thirdPartyId, thirdPartyCredentialResponse.thirdPartyId) &&
        Objects.equals(this.thirdPartyName, thirdPartyCredentialResponse.thirdPartyName) &&
        Objects.equals(this.network, thirdPartyCredentialResponse.network) &&
        Objects.equals(this.updated, thirdPartyCredentialResponse.updated) &&
        Objects.equals(this.created, thirdPartyCredentialResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyCredentialId, thirdPartyId, thirdPartyName, network, updated, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyCredentialResponse {\n");
    
    sb.append("    thirdPartyCredentialId: ").append(toIndentedString(thirdPartyCredentialId)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    thirdPartyName: ").append(toIndentedString(thirdPartyName)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

