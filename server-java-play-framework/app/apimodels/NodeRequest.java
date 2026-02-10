package apimodels;

import apimodels.Node;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NodeRequest   {
  @JsonProperty("x")
  
  private Integer x;

  @JsonProperty("y")
  
  private Integer y;

  @JsonProperty("z")
  
  private Integer z;

  @JsonProperty("latitude")
  
  private Double latitude;

  @JsonProperty("longitude")
  
  private Double longitude;

  @JsonProperty("altitude")
  
  private Double altitude;

  @JsonProperty("date")
  
  private Long date;

  @JsonProperty("isWaypoint")
  
  private Boolean isWaypoint;

  @JsonProperty("accountId")
  
  private Long accountId;

  @JsonProperty("node")
  @Valid

  private Node node;

  public NodeRequest x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public NodeRequest y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public NodeRequest z(Integer z) {
    this.z = z;
    return this;
  }

   /**
   * Get z
   * @return z
  **/
  public Integer getZ() {
    return z;
  }

  public void setZ(Integer z) {
    this.z = z;
  }

  public NodeRequest latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public NodeRequest longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public NodeRequest altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public NodeRequest date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public NodeRequest isWaypoint(Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
    return this;
  }

   /**
   * Get isWaypoint
   * @return isWaypoint
  **/
  public Boolean getIsWaypoint() {
    return isWaypoint;
  }

  public void setIsWaypoint(Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
  }

  public NodeRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public NodeRequest node(Node node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeRequest nodeRequest = (NodeRequest) o;
    return Objects.equals(x, nodeRequest.x) &&
        Objects.equals(y, nodeRequest.y) &&
        Objects.equals(z, nodeRequest.z) &&
        Objects.equals(latitude, nodeRequest.latitude) &&
        Objects.equals(longitude, nodeRequest.longitude) &&
        Objects.equals(altitude, nodeRequest.altitude) &&
        Objects.equals(date, nodeRequest.date) &&
        Objects.equals(isWaypoint, nodeRequest.isWaypoint) &&
        Objects.equals(accountId, nodeRequest.accountId) &&
        Objects.equals(node, nodeRequest.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, latitude, longitude, altitude, date, isWaypoint, accountId, node);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeRequest {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isWaypoint: ").append(toIndentedString(isWaypoint)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

