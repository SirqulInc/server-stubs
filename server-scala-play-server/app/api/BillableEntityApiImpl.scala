package api

import model.BigDecimal
import model.BillableEntityResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[BillableEntityApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class BillableEntityApiImpl extends BillableEntityApi {
  /**
    * @inheritdoc
    */
  override def createBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String]): BillableEntityResponse = {
    // TODO: Implement better logic

    BillableEntityResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], includeCounts: Option[Boolean], includePayments: Option[Boolean]): BillableEntityResponse = {
    // TODO: Implement better logic

    BillableEntityResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateBillableEntity(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String]): BillableEntityResponse = {
    // TODO: Implement better logic

    BillableEntityResponse(None, None, None, None, None, None)
  }
}
