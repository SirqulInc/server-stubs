package org.openapitools.model;

import org.openapitools.model.Node;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NodeRequest  {
  
  @ApiModelProperty(value = "")

  private Integer x;

  @ApiModelProperty(value = "")

  private Integer y;

  @ApiModelProperty(value = "")

  private Integer z;

  @ApiModelProperty(value = "")

  private Double latitude;

  @ApiModelProperty(value = "")

  private Double longitude;

  @ApiModelProperty(value = "")

  private Double altitude;

  @ApiModelProperty(value = "")

  private Long date;

  @ApiModelProperty(value = "")

  private Boolean isWaypoint;

  @ApiModelProperty(value = "")

  private Long accountId;

  @ApiModelProperty(value = "")

  @Valid

  private Node node;
 /**
   * Get x
   * @return x
  **/
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public NodeRequest x(Integer x) {
    this.x = x;
    return this;
  }

 /**
   * Get y
   * @return y
  **/
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public NodeRequest y(Integer y) {
    this.y = y;
    return this;
  }

 /**
   * Get z
   * @return z
  **/
  @JsonProperty("z")
  public Integer getZ() {
    return z;
  }

  public void setZ(Integer z) {
    this.z = z;
  }

  public NodeRequest z(Integer z) {
    this.z = z;
    return this;
  }

 /**
   * Get latitude
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public NodeRequest latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Get longitude
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public NodeRequest longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Get altitude
   * @return altitude
  **/
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public NodeRequest altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public NodeRequest date(Long date) {
    this.date = date;
    return this;
  }

 /**
   * Get isWaypoint
   * @return isWaypoint
  **/
  @JsonProperty("isWaypoint")
  public Boolean getIsWaypoint() {
    return isWaypoint;
  }

  public void setIsWaypoint(Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
  }

  public NodeRequest isWaypoint(Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
    return this;
  }

 /**
   * Get accountId
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public NodeRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Get node
   * @return node
  **/
  @JsonProperty("node")
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  public NodeRequest node(Node node) {
    this.node = node;
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
    NodeRequest nodeRequest = (NodeRequest) o;
    return Objects.equals(this.x, nodeRequest.x) &&
        Objects.equals(this.y, nodeRequest.y) &&
        Objects.equals(this.z, nodeRequest.z) &&
        Objects.equals(this.latitude, nodeRequest.latitude) &&
        Objects.equals(this.longitude, nodeRequest.longitude) &&
        Objects.equals(this.altitude, nodeRequest.altitude) &&
        Objects.equals(this.date, nodeRequest.date) &&
        Objects.equals(this.isWaypoint, nodeRequest.isWaypoint) &&
        Objects.equals(this.accountId, nodeRequest.accountId) &&
        Objects.equals(this.node, nodeRequest.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, latitude, longitude, altitude, date, isWaypoint, accountId, node);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

