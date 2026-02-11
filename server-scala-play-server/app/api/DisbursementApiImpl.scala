package api

import model.BigDecimal
import model.DisbursementResponse

/**
  * Provides a default implementation for [[DisbursementApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class DisbursementApiImpl extends DisbursementApi {
  /**
    * @inheritdoc
    */
  override def checkDisbursements(disbursementId: Long): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createDisbursement(accountId: Long, receiverAccountId: Long, originalSenderAccountId: Long, amount: BigDecimal, provider: String, scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], introspectionParams: Option[String]): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getDisbursement(accountId: Long, disbursementId: Long): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchDisbursements(accountId: Long, receiverAccountId: Option[Long], statuses: Option[String], providers: Option[String], beforeDate: Option[Long], afterDate: Option[Long], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], externalId: Option[String]): List[DisbursementResponse] = {
    // TODO: Implement better logic

    List.empty[DisbursementResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateDisbursement(accountId: Long, disbursementId: Long, amount: Option[BigDecimal], provider: Option[String], scheduledDate: Option[Long], title: Option[String], comment: Option[String], externalId: Option[String], retry: Option[Boolean], introspectionParams: Option[String]): DisbursementResponse = {
    // TODO: Implement better logic

    DisbursementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
