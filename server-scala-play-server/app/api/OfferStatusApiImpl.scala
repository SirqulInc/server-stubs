package api

import model.OfferTransactionStatusResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[OfferStatusApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class OfferStatusApiImpl extends OfferStatusApi {
  /**
    * @inheritdoc
    */
  override def createOfferTransactionStatus(name: String, code: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], description: Option[String], role: Option[String], active: Option[Boolean], applicationIds: Option[String]): OfferTransactionStatusResponse = {
    // TODO: Implement better logic

    OfferTransactionStatusResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteOfferTransactionStatus(statusId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getOfferTransactionStatus(statusId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): OfferTransactionStatusResponse = {
    // TODO: Implement better logic

    OfferTransactionStatusResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchOfferTransactionStatuses(deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String], role: Option[String], appKey: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], includeInactive: Option[Boolean]): List[OfferTransactionStatusResponse] = {
    // TODO: Implement better logic

    List.empty[OfferTransactionStatusResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateOfferTransactionStatus(deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], statusId: Option[Long], name: Option[String], description: Option[String], code: Option[Int], role: Option[String], active: Option[Boolean], applicationIds: Option[String]): OfferTransactionStatusResponse = {
    // TODO: Implement better logic

    OfferTransactionStatusResponse(None, None, None, None, None, None, None)
  }
}
