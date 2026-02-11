package api

import model.QueueResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[AMQPApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AMQPApiImpl extends AMQPApi {
  /**
    * @inheritdoc
    */
  override def consumerCreate(appKey: String, name: String, hostname: String, username: String, password: String, dataMapping: String, deviceId: Option[String], accountId: Option[Long], port: Option[Int], virtualHost: Option[String], exchanger: Option[String], exchangerType: Option[String], workers: Option[Int], useSSL: Option[Boolean]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def consumerUpdate(appKey: String, queueId: Long, dataMapping: String, deviceId: Option[String], accountId: Option[Long], useSSL: Option[Boolean]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queueCreate(appKey: String, name: String, deviceId: Option[String], accountId: Option[Long], workers: Option[Int], analyticTags: Option[String], hostname: Option[String], port: Option[Int], username: Option[String], password: Option[String], virtualHost: Option[String], useSSL: Option[Boolean]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queueDelete(queueId: Long, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queueGet(deviceId: Option[String], accountId: Option[Long], queueId: Option[Long], appKey: Option[String], name: Option[String], hostname: Option[String], virtualHost: Option[String]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queuePublish(message: String, queueId: Option[Long], appKey: Option[String], name: Option[String], hostname: Option[String], virtualHost: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queueSearch(queueId: Option[Long], deviceId: Option[String], accountId: Option[Long], name: Option[String], start: Option[Int], limit: Option[Int]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def queueUpdate(queueId: Long, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], workers: Option[Int], analyticTags: Option[String], hostname: Option[String], port: Option[Int], username: Option[String], password: Option[String], virtualHost: Option[String], useSSL: Option[Boolean]): QueueResponse = {
    // TODO: Implement better logic

    QueueResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
