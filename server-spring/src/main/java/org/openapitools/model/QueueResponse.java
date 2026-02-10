package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QueueResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-09T20:58:37.853899731Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class QueueResponse {

  private @Nullable Long queueId;

  private @Nullable String name;

  private @Nullable String host;

  private @Nullable Integer port;

  private @Nullable String username;

  private @Nullable String password;

  private @Nullable String virtualHost;

  private @Nullable Integer workers;

  private @Nullable String exchanger;

  private @Nullable String exchangerType;

  private @Nullable Boolean handleDelivery;

  private @Nullable String dataMapping;

  private @Nullable String analyticTags;

  public QueueResponse queueId(@Nullable Long queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Get queueId
   * @return queueId
   */
  
  @Schema(name = "queueId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueId")
  public @Nullable Long getQueueId() {
    return queueId;
  }

  public void setQueueId(@Nullable Long queueId) {
    this.queueId = queueId;
  }

  public QueueResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public QueueResponse host(@Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  
  @Schema(name = "host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public @Nullable String getHost() {
    return host;
  }

  public void setHost(@Nullable String host) {
    this.host = host;
  }

  public QueueResponse port(@Nullable Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  
  @Schema(name = "port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public @Nullable Integer getPort() {
    return port;
  }

  public void setPort(@Nullable Integer port) {
    this.port = port;
  }

  public QueueResponse username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public QueueResponse password(@Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }

  public QueueResponse virtualHost(@Nullable String virtualHost) {
    this.virtualHost = virtualHost;
    return this;
  }

  /**
   * Get virtualHost
   * @return virtualHost
   */
  
  @Schema(name = "virtualHost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("virtualHost")
  public @Nullable String getVirtualHost() {
    return virtualHost;
  }

  public void setVirtualHost(@Nullable String virtualHost) {
    this.virtualHost = virtualHost;
  }

  public QueueResponse workers(@Nullable Integer workers) {
    this.workers = workers;
    return this;
  }

  /**
   * Get workers
   * @return workers
   */
  
  @Schema(name = "workers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workers")
  public @Nullable Integer getWorkers() {
    return workers;
  }

  public void setWorkers(@Nullable Integer workers) {
    this.workers = workers;
  }

  public QueueResponse exchanger(@Nullable String exchanger) {
    this.exchanger = exchanger;
    return this;
  }

  /**
   * Get exchanger
   * @return exchanger
   */
  
  @Schema(name = "exchanger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchanger")
  public @Nullable String getExchanger() {
    return exchanger;
  }

  public void setExchanger(@Nullable String exchanger) {
    this.exchanger = exchanger;
  }

  public QueueResponse exchangerType(@Nullable String exchangerType) {
    this.exchangerType = exchangerType;
    return this;
  }

  /**
   * Get exchangerType
   * @return exchangerType
   */
  
  @Schema(name = "exchangerType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exchangerType")
  public @Nullable String getExchangerType() {
    return exchangerType;
  }

  public void setExchangerType(@Nullable String exchangerType) {
    this.exchangerType = exchangerType;
  }

  public QueueResponse handleDelivery(@Nullable Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
    return this;
  }

  /**
   * Get handleDelivery
   * @return handleDelivery
   */
  
  @Schema(name = "handleDelivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handleDelivery")
  public @Nullable Boolean getHandleDelivery() {
    return handleDelivery;
  }

  public void setHandleDelivery(@Nullable Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
  }

  public QueueResponse dataMapping(@Nullable String dataMapping) {
    this.dataMapping = dataMapping;
    return this;
  }

  /**
   * Get dataMapping
   * @return dataMapping
   */
  
  @Schema(name = "dataMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataMapping")
  public @Nullable String getDataMapping() {
    return dataMapping;
  }

  public void setDataMapping(@Nullable String dataMapping) {
    this.dataMapping = dataMapping;
  }

  public QueueResponse analyticTags(@Nullable String analyticTags) {
    this.analyticTags = analyticTags;
    return this;
  }

  /**
   * Get analyticTags
   * @return analyticTags
   */
  
  @Schema(name = "analyticTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analyticTags")
  public @Nullable String getAnalyticTags() {
    return analyticTags;
  }

  public void setAnalyticTags(@Nullable String analyticTags) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

