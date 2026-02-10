package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class QueueResponse  {
  
  @ApiModelProperty(value = "")

  private Long queueId;

  @ApiModelProperty(value = "")

  private String name;

  @ApiModelProperty(value = "")

  private String host;

  @ApiModelProperty(value = "")

  private Integer port;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String password;

  @ApiModelProperty(value = "")

  private String virtualHost;

  @ApiModelProperty(value = "")

  private Integer workers;

  @ApiModelProperty(value = "")

  private String exchanger;

  @ApiModelProperty(value = "")

  private String exchangerType;

  @ApiModelProperty(value = "")

  private Boolean handleDelivery;

  @ApiModelProperty(value = "")

  private String dataMapping;

  @ApiModelProperty(value = "")

  private String analyticTags;
 /**
   * Get queueId
   * @return queueId
  **/
  @JsonProperty("queueId")
  public Long getQueueId() {
    return queueId;
  }

  public void setQueueId(Long queueId) {
    this.queueId = queueId;
  }

  public QueueResponse queueId(Long queueId) {
    this.queueId = queueId;
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

  public QueueResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get host
   * @return host
  **/
  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueueResponse host(String host) {
    this.host = host;
    return this;
  }

 /**
   * Get port
   * @return port
  **/
  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public QueueResponse port(Integer port) {
    this.port = port;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public QueueResponse username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get password
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public QueueResponse password(String password) {
    this.password = password;
    return this;
  }

 /**
   * Get virtualHost
   * @return virtualHost
  **/
  @JsonProperty("virtualHost")
  public String getVirtualHost() {
    return virtualHost;
  }

  public void setVirtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
  }

  public QueueResponse virtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
    return this;
  }

 /**
   * Get workers
   * @return workers
  **/
  @JsonProperty("workers")
  public Integer getWorkers() {
    return workers;
  }

  public void setWorkers(Integer workers) {
    this.workers = workers;
  }

  public QueueResponse workers(Integer workers) {
    this.workers = workers;
    return this;
  }

 /**
   * Get exchanger
   * @return exchanger
  **/
  @JsonProperty("exchanger")
  public String getExchanger() {
    return exchanger;
  }

  public void setExchanger(String exchanger) {
    this.exchanger = exchanger;
  }

  public QueueResponse exchanger(String exchanger) {
    this.exchanger = exchanger;
    return this;
  }

 /**
   * Get exchangerType
   * @return exchangerType
  **/
  @JsonProperty("exchangerType")
  public String getExchangerType() {
    return exchangerType;
  }

  public void setExchangerType(String exchangerType) {
    this.exchangerType = exchangerType;
  }

  public QueueResponse exchangerType(String exchangerType) {
    this.exchangerType = exchangerType;
    return this;
  }

 /**
   * Get handleDelivery
   * @return handleDelivery
  **/
  @JsonProperty("handleDelivery")
  public Boolean getHandleDelivery() {
    return handleDelivery;
  }

  public void setHandleDelivery(Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
  }

  public QueueResponse handleDelivery(Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
    return this;
  }

 /**
   * Get dataMapping
   * @return dataMapping
  **/
  @JsonProperty("dataMapping")
  public String getDataMapping() {
    return dataMapping;
  }

  public void setDataMapping(String dataMapping) {
    this.dataMapping = dataMapping;
  }

  public QueueResponse dataMapping(String dataMapping) {
    this.dataMapping = dataMapping;
    return this;
  }

 /**
   * Get analyticTags
   * @return analyticTags
  **/
  @JsonProperty("analyticTags")
  public String getAnalyticTags() {
    return analyticTags;
  }

  public void setAnalyticTags(String analyticTags) {
    this.analyticTags = analyticTags;
  }

  public QueueResponse analyticTags(String analyticTags) {
    this.analyticTags = analyticTags;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

