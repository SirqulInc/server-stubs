package apimodels;

import apimodels.ThirdPartyNetworkShortResponse;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ThirdPartyCredentialResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ThirdPartyCredentialResponse   {
  @JsonProperty("thirdPartyCredentialId")
  
  private Long thirdPartyCredentialId;

  @JsonProperty("thirdPartyId")
  
  private String thirdPartyId;

  @JsonProperty("thirdPartyName")
  
  private String thirdPartyName;

  @JsonProperty("network")
  @Valid

  private ThirdPartyNetworkShortResponse network;

  @JsonProperty("updated")
  
  private Long updated;

  @JsonProperty("created")
  
  private Long created;

  public ThirdPartyCredentialResponse thirdPartyCredentialId(Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
    return this;
  }

   /**
   * Get thirdPartyCredentialId
   * @return thirdPartyCredentialId
  **/
  public Long getThirdPartyCredentialId() {
    return thirdPartyCredentialId;
  }

  public void setThirdPartyCredentialId(Long thirdPartyCredentialId) {
    this.thirdPartyCredentialId = thirdPartyCredentialId;
  }

  public ThirdPartyCredentialResponse thirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
    return this;
  }

   /**
   * Get thirdPartyId
   * @return thirdPartyId
  **/
  public String getThirdPartyId() {
    return thirdPartyId;
  }

  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }

  public ThirdPartyCredentialResponse thirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
    return this;
  }

   /**
   * Get thirdPartyName
   * @return thirdPartyName
  **/
  public String getThirdPartyName() {
    return thirdPartyName;
  }

  public void setThirdPartyName(String thirdPartyName) {
    this.thirdPartyName = thirdPartyName;
  }

  public ThirdPartyCredentialResponse network(ThirdPartyNetworkShortResponse network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  public ThirdPartyNetworkShortResponse getNetwork() {
    return network;
  }

  public void setNetwork(ThirdPartyNetworkShortResponse network) {
    this.network = network;
  }

  public ThirdPartyCredentialResponse updated(Long updated) {
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

  public ThirdPartyCredentialResponse created(Long created) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyCredentialResponse thirdPartyCredentialResponse = (ThirdPartyCredentialResponse) o;
    return Objects.equals(thirdPartyCredentialId, thirdPartyCredentialResponse.thirdPartyCredentialId) &&
        Objects.equals(thirdPartyId, thirdPartyCredentialResponse.thirdPartyId) &&
        Objects.equals(thirdPartyName, thirdPartyCredentialResponse.thirdPartyName) &&
        Objects.equals(network, thirdPartyCredentialResponse.network) &&
        Objects.equals(updated, thirdPartyCredentialResponse.updated) &&
        Objects.equals(created, thirdPartyCredentialResponse.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thirdPartyCredentialId, thirdPartyId, thirdPartyName, network, updated, created);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

