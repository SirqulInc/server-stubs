package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ThirdPartyNetworkShortResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ThirdPartyCredentialResponse   {
  
  private Long thirdPartyCredentialId;
  private String thirdPartyId;
  private String thirdPartyName;
  private ThirdPartyNetworkShortResponse network;
  private Long updated;
  private Long created;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyCredentialId")
  public Long getThirdPartyCredentialId() {
    return thirdPartyCredentialId;
  }
  public void setThirdPartyCredentialId(Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyId")
  public String getThirdPartyId() {
    return thirdPartyId;
  }
  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("thirdPartyName")
  public String getThirdPartyName() {
    return thirdPartyName;
  }
  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("network")
  @Valid
  public ThirdPartyNetworkShortResponse getNetwork() {
    return network;
  }
  public void setNetwork(ThirdPartyNetworkShortResponse network) {
    this.network = network;
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

