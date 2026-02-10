package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DisbursementResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DisbursementResponse(
  disbursementId: Option[Long],
  title: Option[String],
  comment: Option[String],
  externalId: Option[String],
  introspectionParams: Option[String],
  amount: Option[BigDecimal],
  scheduledDate: Option[Long],
  captureDate: Option[Long],
  estimatedDate: Option[Long],
  settledDate: Option[Long],
  status: Option[DisbursementResponse.Status.Value],
  provider: Option[DisbursementResponse.Provider.Value],
  senderBillable: Option[BillableEntityShortResponse],
  receiverBillable: Option[BillableEntityShortResponse],
  errorCode: Option[String],
  errorMessage: Option[String]
)

object DisbursementResponse {
  implicit lazy val disbursementResponseJsonFormat: Format[DisbursementResponse] = Json.format[DisbursementResponse]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val NEW = Value("NEW")
    val APPROVED = Value("APPROVED")
    val VALIDATING = Value("VALIDATING")
    val ERROR = Value("ERROR")
    val AUTHORIZED = Value("AUTHORIZED")
    val CAPTURED = Value("CAPTURED")
    val SETTLED = Value("SETTLED")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Provider extends Enumeration {
    val AUTHORIZENET = Value("AUTHORIZE_NET")
    val AMAZONFPS = Value("AMAZON_FPS")
    val BILLCOM = Value("BILL_COM")

    type Provider = Value
    implicit lazy val ProviderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

