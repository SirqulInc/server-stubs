package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * QueueResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class QueueResponse   {
  @JsonProperty("queueId")
  
  private Long queueId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("host")
  
  private String host;

  @JsonProperty("port")
  
  private Integer port;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("password")
  
  private String password;

  @JsonProperty("virtualHost")
  
  private String virtualHost;

  @JsonProperty("workers")
  
  private Integer workers;

  @JsonProperty("exchanger")
  
  private String exchanger;

  @JsonProperty("exchangerType")
  
  private String exchangerType;

  @JsonProperty("handleDelivery")
  
  private Boolean handleDelivery;

  @JsonProperty("dataMapping")
  
  private String dataMapping;

  @JsonProperty("analyticTags")
  
  private String analyticTags;

  public QueueResponse queueId(Long queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * Get queueId
   * @return queueId
  **/
  public Long getQueueId() {
    return queueId;
  }

  public void setQueueId(Long queueId) {
    this.queueId = queueId;
  }

  public QueueResponse name(String name) {
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

  public QueueResponse host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueueResponse port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public QueueResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public QueueResponse password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public QueueResponse virtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
    return this;
  }

   /**
   * Get virtualHost
   * @return virtualHost
  **/
  public String getVirtualHost() {
    return virtualHost;
  }

  public void setVirtualHost(String virtualHost) {
    this.virtualHost = virtualHost;
  }

  public QueueResponse workers(Integer workers) {
    this.workers = workers;
    return this;
  }

   /**
   * Get workers
   * @return workers
  **/
  public Integer getWorkers() {
    return workers;
  }

  public void setWorkers(Integer workers) {
    this.workers = workers;
  }

  public QueueResponse exchanger(String exchanger) {
    this.exchanger = exchanger;
    return this;
  }

   /**
   * Get exchanger
   * @return exchanger
  **/
  public String getExchanger() {
    return exchanger;
  }

  public void setExchanger(String exchanger) {
    this.exchanger = exchanger;
  }

  public QueueResponse exchangerType(String exchangerType) {
    this.exchangerType = exchangerType;
    return this;
  }

   /**
   * Get exchangerType
   * @return exchangerType
  **/
  public String getExchangerType() {
    return exchangerType;
  }

  public void setExchangerType(String exchangerType) {
    this.exchangerType = exchangerType;
  }

  public QueueResponse handleDelivery(Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
    return this;
  }

   /**
   * Get handleDelivery
   * @return handleDelivery
  **/
  public Boolean getHandleDelivery() {
    return handleDelivery;
  }

  public void setHandleDelivery(Boolean handleDelivery) {
    this.handleDelivery = handleDelivery;
  }

  public QueueResponse dataMapping(String dataMapping) {
    this.dataMapping = dataMapping;
    return this;
  }

   /**
   * Get dataMapping
   * @return dataMapping
  **/
  public String getDataMapping() {
    return dataMapping;
  }

  public void setDataMapping(String dataMapping) {
    this.dataMapping = dataMapping;
  }

  public QueueResponse analyticTags(String analyticTags) {
    this.analyticTags = analyticTags;
    return this;
  }

   /**
   * Get analyticTags
   * @return analyticTags
  **/
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
    return Objects.equals(queueId, queueResponse.queueId) &&
        Objects.equals(name, queueResponse.name) &&
        Objects.equals(host, queueResponse.host) &&
        Objects.equals(port, queueResponse.port) &&
        Objects.equals(username, queueResponse.username) &&
        Objects.equals(password, queueResponse.password) &&
        Objects.equals(virtualHost, queueResponse.virtualHost) &&
        Objects.equals(workers, queueResponse.workers) &&
        Objects.equals(exchanger, queueResponse.exchanger) &&
        Objects.equals(exchangerType, queueResponse.exchangerType) &&
        Objects.equals(handleDelivery, queueResponse.handleDelivery) &&
        Objects.equals(dataMapping, queueResponse.dataMapping) &&
        Objects.equals(analyticTags, queueResponse.analyticTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, name, host, port, username, password, virtualHost, workers, exchanger, exchangerType, handleDelivery, dataMapping, analyticTags);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

