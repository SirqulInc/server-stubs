package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PaymentTypesResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class BillingInfoApiController @Inject()(cc: ControllerComponents, api: BillingInfoApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/billing/update?accountId=[value]&paymentMethodId=[value]&accountName=[value]&firstName=[value]&lastName=[value]&address=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&phone=[value]&creditCardNumber=[value]&expirationDate=[value]&ccv=[value]&accountNumber=[value]&bankName=[value]&routingNumber=[value]&defaultPaymentMethod=[value]&paymentMethodNickname=[value]&taxId=[value]&providerCustomerProfileId=[value]&providerPaymentProfileId=[value]&metaData=[value]
    */
  def addPaymentMethod(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val accountName = request.getQueryString("accountName")
        
      val firstName = request.getQueryString("firstName")
        
      val lastName = request.getQueryString("lastName")
        
      val address = request.getQueryString("address")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val country = request.getQueryString("country")
        
      val phone = request.getQueryString("phone")
        
      val creditCardNumber = request.getQueryString("creditCardNumber")
        
      val expirationDate = request.getQueryString("expirationDate")
        
      val ccv = request.getQueryString("ccv")
        
      val accountNumber = request.getQueryString("accountNumber")
        
      val bankName = request.getQueryString("bankName")
        
      val routingNumber = request.getQueryString("routingNumber")
        
      val defaultPaymentMethod = request.getQueryString("defaultPaymentMethod")
        .map(value => value.toBoolean)
        
      val paymentMethodNickname = request.getQueryString("paymentMethodNickname")
        
      val taxId = request.getQueryString("taxId")
        
      val providerCustomerProfileId = request.getQueryString("providerCustomerProfileId")
        
      val providerPaymentProfileId = request.getQueryString("providerPaymentProfileId")
        
      val metaData = request.getQueryString("metaData")
        
      api.addPaymentMethod(version, accountId, paymentMethodId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, defaultPaymentMethod, paymentMethodNickname, taxId, providerCustomerProfileId, providerPaymentProfileId, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/billing/create?accountId=[value]&accountName=[value]&firstName=[value]&lastName=[value]&address=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&phone=[value]&creditCardNumber=[value]&expirationDate=[value]&ccv=[value]&accountNumber=[value]&bankName=[value]&routingNumber=[value]&paymentMethodNickname=[value]&taxId=[value]&defaultPaymentMethod=[value]&authToken=[value]&provider=[value]&providerCustomerProfileId=[value]&providerPaymentProfileId=[value]&metaData=[value]&appKey=[value]
    */
  def createPaymentMethod(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val accountName = request.getQueryString("accountName")
        
      val firstName = request.getQueryString("firstName")
        
      val lastName = request.getQueryString("lastName")
        
      val address = request.getQueryString("address")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val country = request.getQueryString("country")
        
      val phone = request.getQueryString("phone")
        
      val creditCardNumber = request.getQueryString("creditCardNumber")
        
      val expirationDate = request.getQueryString("expirationDate")
        
      val ccv = request.getQueryString("ccv")
        
      val accountNumber = request.getQueryString("accountNumber")
        
      val bankName = request.getQueryString("bankName")
        
      val routingNumber = request.getQueryString("routingNumber")
        
      val paymentMethodNickname = request.getQueryString("paymentMethodNickname")
        
      val taxId = request.getQueryString("taxId")
        
      val defaultPaymentMethod = request.getQueryString("defaultPaymentMethod")
        .map(value => value.toBoolean)
        
      val authToken = request.getQueryString("authToken")
        
      val provider = request.getQueryString("provider")
        
      val providerCustomerProfileId = request.getQueryString("providerCustomerProfileId")
        
      val providerPaymentProfileId = request.getQueryString("providerPaymentProfileId")
        
      val metaData = request.getQueryString("metaData")
        
      val appKey = request.getQueryString("appKey")
        
      api.createPaymentMethod(version, accountId, accountName, firstName, lastName, address, city, state, postalCode, country, phone, creditCardNumber, expirationDate, ccv, accountNumber, bankName, routingNumber, paymentMethodNickname, taxId, defaultPaymentMethod, authToken, provider, providerCustomerProfileId, providerPaymentProfileId, metaData, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/billing/crypto/transfer?accountId=[value]&paymentMethodId=[value]&tokenName=[value]&tokenSymbol=[value]
    */
  def createSmartContract(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val tokenName = request.getQueryString("tokenName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("tokenName", "query string")
        }
        
      val tokenSymbol = request.getQueryString("tokenSymbol")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("tokenSymbol", "query string")
        }
        
      api.createSmartContract(version, accountId, tokenName, tokenSymbol, paymentMethodId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/billing/crypto/get?accountId=[value]&ownerAccountId=[value]&paymentMethodId=[value]
    */
  def getCryptoBalance(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val ownerAccountId = request.getQueryString("ownerAccountId")
        .map(value => value.toLong)
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      api.getCryptoBalance(version, accountId, ownerAccountId, paymentMethodId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/billing/get?accountId=[value]&paymentMethodId=[value]&getCurrentBalance=[value]
    */
  def getPaymentMethod(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val getCurrentBalance = request.getQueryString("getCurrentBalance")
        .map(value => value.toBoolean)
        
      api.getPaymentMethod(version, accountId, paymentMethodId, getCurrentBalance)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/billing/search?accountId=[value]&provider=[value]&`type`=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchPaymentMethod(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PaymentTypesResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val provider = request.getQueryString("provider")
        
      val `type` = request.getQueryString("type")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchPaymentMethod(version, accountId, provider, `type`, keyword, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
