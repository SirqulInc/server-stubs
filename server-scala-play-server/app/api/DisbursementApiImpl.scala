package api

import model.BigDecimal
import model.DisbursementResponse

/**
  * Provides a default implementation for [[DisbursementApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class DisbursementApiImpl extends DisbursementApi {
  /**
    * @inheritdoc
    */
  override def checkDisbursements(version: BigDecimal, disbursementId: Long): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createDisbursement(version: BigDecimal, accountId: Long, receiverAccountId: Long, originalSenderAccountId: Long, amount: BigDecimal, provider: String, scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], introspectionParams: Option[String]): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getDisbursement(version: BigDecimal, accountId: Long, disbursementId: Long): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchDisbursements(version: BigDecimal, accountId: Long, receiverAccountId: Option[Long], statuses: Option[String], providers: Option[String], beforeDate: Option[Long], afterDate: Option[Long], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], externalId: Option[String]): List[DisbursementResponse] = {
    // TODO: Implement better logic

    List.empty[DisbursementResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateDisbursement(version: BigDecimal, accountId: Long, disbursementId: Long, amount: Option[BigDecimal], provider: Option[String], scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], retry: Option[Boolean], introspectionParams: Option[String]): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
