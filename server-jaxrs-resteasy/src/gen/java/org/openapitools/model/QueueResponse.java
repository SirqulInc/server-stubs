package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QueueResponse   {
  
  private Long queueId;
  private String name;
  private String host;
  private Integer port;
  private String username;
  private String password;
  private String virtualHost;
  private Integer workers;
  private String exchanger;
  private String exchangerType;
  private Boolean handleDelivery;
  private String dataMapping;
  private String analyticTags;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queueId")
  public Long getQueueId() {
    return queueId;
  }
  public void setQueueId(Long queueId) {
    this.queueId = queueId;
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
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("virtualHost")
  public String getVirtualHost() {
    return virtualHost;
  }
  public void setVirtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("workers")
  public Integer getWorkers() {
    return workers;
  }
  public void setWorkers(Integer workers) {
    this.workers = workers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exchanger")
  public String getExchanger() {
    return exchanger;
  }
  public void setExchanger(String exchanger) {
    this.exchanger = exchanger;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exchangerType")
  public String getExchangerType() {
    return exchangerType;
  }
  public void setExchangerType(String exchangerType) {
    this.exchangerType = exchangerType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("handleDelivery")
  public Boolean getHandleDelivery() {
    return handleDelivery;
  }
  public void setHandleDelivery(Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dataMapping")
  public String getDataMapping() {
    return dataMapping;
  }
  public void setDataMapping(String dataMapping) {
    this.dataMapping = dataMapping;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("analyticTags")
  public String getAnalyticTags() {
    return analyticTags;
  }
  public void setAnalyticTags(String analyticTags) {
    this.analyticTags = analyticTags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueResponse queueResponse = (QueueResponse) o;
    return Objects.equals(this.queueId, queueResponse.queueId) &&
        Objects.equals(this.name, queueResponse.name) &&
        Objects.equals(this.host, queueResponse.host) &&
        Objects.equals(this.port, queueResponse.port) &&
        Objects.equals(this.username, queueResponse.username) &&
        Objects.equals(this.password, queueResponse.password) &&
        Objects.equals(this.virtualHost, queueResponse.virtualHost) &&
        Objects.equals(this.workers, queueResponse.workers) &&
        Objects.equals(this.exchanger, queueResponse.exchanger) &&
        Objects.equals(this.exchangerType, queueResponse.exchangerType) &&
        Objects.equals(this.handleDelivery, queueResponse.handleDelivery) &&
        Objects.equals(this.dataMapping, queueResponse.dataMapping) &&
        Objects.equals(this.analyticTags, queueResponse.analyticTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, name, host, port, username, password, virtualHost, workers, exchanger, exchangerType, handleDelivery, dataMapping, analyticTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueResponse {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    virtualHost: ").append(toIndentedString(virtualHost)).append("\n");
    sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
    sb.append("    exchanger: ").append(toIndentedString(exchanger)).append("\n");
    sb.append("    exchangerType: ").append(toIndentedString(exchangerType)).append("\n");
    sb.append("    handleDelivery: ").append(toIndentedString(handleDelivery)).append("\n");
    sb.append("    dataMapping: ").append(toIndentedString(dataMapping)).append("\n");
    sb.append("    analyticTags: ").append(toIndentedString(analyticTags)).append("\n");
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

