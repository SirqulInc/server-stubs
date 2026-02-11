package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Node;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class NodeRequest   {
  
  private Integer x;
  private Integer y;
  private Integer z;
  private Double latitude;
  private Double longitude;
  private Double altitude;
  private Long date;
  private Boolean isWaypoint;
  private Long accountId;
  private Node node;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("x")
  public Integer getX() {
    return x;
  }
  public void setX(Integer x) {
    this.x = x;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("z")
  public Integer getZ() {
    return z;
  }
  public void setZ(Integer z) {
    this.z = z;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("altitude")
  public Double getAltitude() {
    return altitude;
  }
  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public Long getDate() {
    return date;
  }
  public void setDate(Long date) {
    this.date = date;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isWaypoint")
  public Boolean getIsWaypoint() {
    return isWaypoint;
  }
  public void setIsWaypoint(Boolean isWaypoint) {
    this.isWaypoint = isWaypoint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accountId")
  public Long getAccountId() {
    return accountId;
  }
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("node")
  @Valid
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

