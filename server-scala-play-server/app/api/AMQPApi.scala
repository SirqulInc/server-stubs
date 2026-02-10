package api

import play.api.libs.json._
import model.BigDecimal
import model.QueueResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AMQPApi {
  /**
    * Create Consumer
    * Create a connection to an existing amqp queue and register as a consumer.
    * @param appKey The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    * @param name The name of the queue to connect to
    * @param hostname The hostname of the server the queue is hosted on
    * @param username The username to access the server the queue is hosted on
    * @param password The password to access the queue to connect to
    * @param dataMapping The data mapping information in the format of AMQPRequest
    * @param deviceId The client deviceID
    * @param accountId The logged in user ID
    * @param port The port of the server the queue is hosted on
    * @param virtualHost The virtual host defined on the server the queue is associated on
    * @param exchanger The exchanger of the queue to connect to
    * @param exchangerType The exchanger type of the queue to connect to
    * @param workers The number of workers to generate 
    * @param useSSL Use SSL
    */
  def consumerCreate(version: BigDecimal, appKey: String, name: String, hostname: String, username: String, password: String, dataMapping: String, deviceId: Option[String], accountId: Option[Long], port: Option[Int], virtualHost: Option[String], exchanger: Option[String], exchangerType: Option[String], workers: Option[Int], useSSL: Option[Boolean]): QueueResponse

  /**
    * Update Consumer
    * Update an existing amqp queue&#39;s data mapping.
    * @param appKey The application key to use when creating an analytic or service request. The account needs to have permissions to the applicaton or it will be denied.
    * @param queueId The queue to update
    * @param dataMapping The data mapping information in the format of AMQPRequest
    * @param deviceId The client deviceID
    * @param accountId The logged in user ID
    * @param useSSL Use SSL
    */
  def consumerUpdate(version: BigDecimal, appKey: String, queueId: Long, dataMapping: String, deviceId: Option[String], accountId: Option[Long], useSSL: Option[Boolean]): QueueResponse

  /**
    * Create Queue
    * Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.
    * @param appKey The application key unique to each application.
    * @param name The name of the queue to create
    * @param deviceId The client deviceID
    * @param accountId The logged in user ID
    * @param workers The number of workers to generate 
    * @param analyticTags If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    * @param hostname The hostname of the server the queue is hosted on
    * @param port The port of the server the queue is hosted on
    * @param username The username to access the server that the queue is on
    * @param password The password to access the queue to connect to
    * @param virtualHost The virtual host defined on the server to queue
    * @param useSSL Use SSL
    */
  def queueCreate(version: BigDecimal, appKey: String, name: String, deviceId: Option[String], accountId: Option[Long], workers: Option[Int], analyticTags: Option[String], hostname: Option[String], port: Option[Int], username: Option[String], password: Option[String], virtualHost: Option[String], useSSL: Option[Boolean]): QueueResponse

  /**
    * Delete Queue
    * Delete the stored queue record and close any active connections to the AMQP servers.
    * @param queueId The id of the queue to find
    * @param deviceId The client device ID
    * @param accountId The logged in user ID
    */
  def queueDelete(version: BigDecimal, queueId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Get Queue
    * Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
    * @param deviceId The client device ID
    * @param accountId The logged in user ID
    * @param queueId The id of the queue to find
    * @param appKey The application key the queue was assigned to
    * @param name The name of the queue to find
    * @param hostname The hostname of the queue to find
    * @param virtualHost The virtual host of the queue to find
    */
  def queueGet(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], queueId: Option[Long], appKey: Option[String], name: Option[String], hostname: Option[String], virtualHost: Option[String]): QueueResponse

  /**
    * Publish Queue
    * Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.
    * @param message The payload to send to the queue
    * @param queueId The id of the queue to publish to
    * @param appKey The application key the queue was assigned to
    * @param name The name of the queue to publish to or the analytic tag to handle if the analytic param is true
    * @param hostname The hostname of the server the queue is hosted on
    * @param virtualHost The virtual host defined on the server to queue
    */
  def queuePublish(version: BigDecimal, message: String, queueId: Option[Long], appKey: Option[String], name: Option[String], hostname: Option[String], virtualHost: Option[String]): SirqulResponse

  /**
    * Search Queue
    * Get the queues setup for the BillableEntity&#39;s applications.
    * @param queueId The id of the queue to find
    * @param deviceId The client device ID
    * @param accountId The logged in user ID
    * @param name The name of the queue to find
    * @param start Start of the index
    * @param limit Limit of the index
    */
  def queueSearch(version: BigDecimal, queueId: Option[Long], deviceId: Option[String], accountId: Option[Long], name: Option[String], start: Option[Int], limit: Option[Int]): QueueResponse

  /**
    * Update Queue
    * Update the basic AMQP queue.
    * @param queueId The id of the queue to update
    * @param deviceId The client deviceID
    * @param accountId The logged in user ID
    * @param appKey The application key unique to each application.
    * @param workers The number of workers to generate
    * @param analyticTags If provided the analytic processing will publsih to this queue instead of the default one for the provided list of tags
    * @param hostname The hostname of the server the queue is hosted on
    * @param port The port of the server the queue is hosted on
    * @param username The username to access the server that the queue is on
    * @param password The password to access the queue to connect to
    * @param virtualHost The virtual host defined on the server to queue
    * @param useSSL the SSL to use
    */
  def queueUpdate(version: BigDecimal, queueId: Long, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], workers: Option[Int], analyticTags: Option[String], hostname: Option[String], port: Option[Int], username: Option[String], password: Option[String], virtualHost: Option[String], useSSL: Option[Boolean]): QueueResponse
}
