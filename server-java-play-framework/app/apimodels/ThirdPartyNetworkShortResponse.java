package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ThirdPartyNetworkShortResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ThirdPartyNetworkShortResponse   {
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

  public ThirdPartyNetworkShortResponse updated(Long updated) {
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

  public ThirdPartyNetworkShortResponse created(Long created) {
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

  public ThirdPartyNetworkShortResponse active(Boolean active) {
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

  public ThirdPartyNetworkShortResponse name(String name) {
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

  public ThirdPartyNetworkShortResponse description(String description) {
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

  public ThirdPartyNetworkShortResponse networkUID(String networkUID) {
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

  public ThirdPartyNetworkShortResponse network(NetworkEnum network) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyNetworkShortResponse thirdPartyNetworkShortResponse = (ThirdPartyNetworkShortResponse) o;
    return Objects.equals(updated, thirdPartyNetworkShortResponse.updated) &&
        Objects.equals(created, thirdPartyNetworkShortResponse.created) &&
        Objects.equals(active, thirdPartyNetworkShortResponse.active) &&
        Objects.equals(name, thirdPartyNetworkShortResponse.name) &&
        Objects.equals(description, thirdPartyNetworkShortResponse.description) &&
        Objects.equals(networkUID, thirdPartyNetworkShortResponse.networkUID) &&
        Objects.equals(network, thirdPartyNetworkShortResponse.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updated, created, active, name, description, networkUID, network);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

