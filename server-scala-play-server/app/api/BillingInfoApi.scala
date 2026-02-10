package api

import play.api.libs.json._
import model.BigDecimal
import model.PaymentTypesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait BillingInfoApi {
  /**
    * Update Payment Method
    * Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.
    * @param accountId The account used to perform the the request
    * @param paymentMethodId Payment Method Id
    * @param accountName the name of the account
    * @param firstName First Name that the account is filed as
    * @param lastName Last Name that the account is filed as
    * @param address Address that the account is filed as
    * @param city City that the account is filed as
    * @param state State that the account is filed as
    * @param postalCode Postal Code that the account is filed as
    * @param country Country that the account is filed as
    * @param phone Phone that the account is filed as
    * @param creditCardNumber The full credit card number to store on file
    * @param expirationDate The credit card expiration date YYYY-MM
    * @param ccv The 3 digit confirmation code
    * @param accountNumber The bank account number
    * @param bankName The bank name
    * @param routingNumber Routing Number
    * @param defaultPaymentMethod Default Payment Method
    * @param paymentMethodNickname Payment Method Nickname
    * @param taxId Tax Id
    * @param providerCustomerProfileId Provider customer profile Id
    * @param providerPaymentProfileId Provider customer payment profile Id
    * @param metaData Meta Data
    */
  def addPaymentMethod(version: BigDecimal, accountId: Long, paymentMethodId: Option[Long], accountName: Option[String], firstName: Option[String], lastName: Option[String], address: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], phone: Option[String], creditCardNumber: Option[String], expirationDate: Option[String], ccv: Option[String], accountNumber: Option[String], bankName: Option[String], routingNumber: Option[String], defaultPaymentMethod: Option[Boolean], paymentMethodNickname: Option[String], taxId: Option[String], providerCustomerProfileId: Option[String], providerPaymentProfileId: Option[String], metaData: Option[String]): PaymentTypesResponse

  /**
    * Create Payment Method
    * Add a new method of payment.
    * @param accountId The account used to perform the the request
    * @param accountName Account Name of the credit card user
    * @param firstName The first name on the credit card
    * @param lastName The last name on the credit card
    * @param address The billing address of the credit card
    * @param city The billing city of the credit card
    * @param state The billing state of the credit card
    * @param postalCode The billing zip code of the credit card
    * @param country Country of the credit card
    * @param phone The billing phone of the credit card
    * @param creditCardNumber The full credit card number to store on file
    * @param expirationDate The credit card expiration date YYYY-MM
    * @param ccv The 3 digit confirmation code
    * @param accountNumber The bank account number
    * @param bankName The bank name
    * @param routingNumber The bank routing number
    * @param paymentMethodNickname The nickname to give the payment method
    * @param taxId Tax Id
    * @param defaultPaymentMethod Whether this should be the default payment method
    * @param authToken An authorization token for providers that provide this (like Amazon Payments)
    * @param provider The payment provider (see PaymentMethodProvider)
    * @param providerCustomerProfileId Provider customer profile Id
    * @param providerPaymentProfileId Provider customer payment profile Id
    * @param metaData Meta Data
    * @param appKey Application Key
    */
  def createPaymentMethod(version: BigDecimal, accountId: Long, accountName: Option[String], firstName: Option[String], lastName: Option[String], address: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], phone: Option[String], creditCardNumber: Option[String], expirationDate: Option[String], ccv: Option[String], accountNumber: Option[String], bankName: Option[String], routingNumber: Option[String], paymentMethodNickname: Option[String], taxId: Option[String], defaultPaymentMethod: Option[Boolean], authToken: Option[String], provider: Option[String], providerCustomerProfileId: Option[String], providerPaymentProfileId: Option[String], metaData: Option[String], appKey: Option[String]): PaymentTypesResponse

  /**
    * Create Smart Contract
    * Adds a smart contract.
    * @param accountId The account used to perform the the request
    * @param tokenName The token name
    * @param tokenSymbol The token symbol
    * @param paymentMethodId The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    */
  def createSmartContract(version: BigDecimal, accountId: Long, tokenName: String, tokenSymbol: String, paymentMethodId: Option[Long]): PaymentTypesResponse

  /**
    * Get Crypto Balances
    * Get the cypto balance details for a user
    * @param accountId The account used to perform the the request
    * @param ownerAccountId The account to retreive balances for
    * @param paymentMethodId The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    */
  def getCryptoBalance(version: BigDecimal, accountId: Long, ownerAccountId: Option[Long], paymentMethodId: Option[Long]): PaymentTypesResponse

  /**
    * Get Payment Method
    * Get the details of the user&#39;s payment method or their current default method of payment
    * @param accountId The account used to perform the the request
    * @param paymentMethodId The payment method to return details on. If this is not set, then the user&#39;s default payment method will be returned.
    * @param getCurrentBalance Determines whether to get the user&#39;s current balance for the requested payment method option (not all payment method options support this)
    */
  def getPaymentMethod(version: BigDecimal, accountId: Long, paymentMethodId: Option[Long], getCurrentBalance: Option[Boolean]): PaymentTypesResponse

  /**
    * Search Payment Methods
    * Search the payment methods of an account
    * @param accountId Account Id to search on
    * @param provider Provider to search on
    * @param `type` the type to search on
    * @param keyword the keyword to search on
    * @param sortField the sort field to use for the search
    * @param descending if the results should be in descending order
    * @param start the start of the search
    * @param limit the limit of the search
    */
  def searchPaymentMethod(version: BigDecimal, accountId: Long, provider: Option[String], `type`: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): PaymentTypesResponse
}
