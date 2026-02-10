package api

import model.BigDecimal
import model.PaymentTypesResponse

/**
  * Provides a default implementation for [[BillingInfoApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class BillingInfoApiImpl extends BillingInfoApi {
  /**
    * @inheritdoc
    */
  override def addPaymentMethod(version: BigDecimal, accountId: Long, paymentMethodId: Option[Long], accountName: Option[String], firstName: Option[String], lastName: Option[String], address: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], phone: Option[String], creditCardNumber: Option[String], expirationDate: Option[String], ccv: Option[String], accountNumber: Option[String], bankName: Option[String], routingNumber: Option[String], defaultPaymentMethod: Option[Boolean], paymentMethodNickname: Option[String], taxId: Option[String], providerCustomerProfileId: Option[String], providerPaymentProfileId: Option[String], metaData: Option[String]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createPaymentMethod(version: BigDecimal, accountId: Long, accountName: Option[String], firstName: Option[String], lastName: Option[String], address: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], phone: Option[String], creditCardNumber: Option[String], expirationDate: Option[String], ccv: Option[String], accountNumber: Option[String], bankName: Option[String], routingNumber: Option[String], paymentMethodNickname: Option[String], taxId: Option[String], defaultPaymentMethod: Option[Boolean], authToken: Option[String], provider: Option[String], providerCustomerProfileId: Option[String], providerPaymentProfileId: Option[String], metaData: Option[String], appKey: Option[String]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createSmartContract(version: BigDecimal, accountId: Long, tokenName: String, tokenSymbol: String, paymentMethodId: Option[Long]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getCryptoBalance(version: BigDecimal, accountId: Long, ownerAccountId: Option[Long], paymentMethodId: Option[Long]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPaymentMethod(version: BigDecimal, accountId: Long, paymentMethodId: Option[Long], getCurrentBalance: Option[Boolean]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPaymentMethod(version: BigDecimal, accountId: Long, provider: Option[String], `type`: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): PaymentTypesResponse = {
    // TODO: Implement better logic

    PaymentTypesResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
