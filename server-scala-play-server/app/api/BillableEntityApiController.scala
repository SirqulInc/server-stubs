package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BillableEntityResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class BillableEntityApiController @Inject()(cc: ControllerComponents, api: BillableEntityApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/billable/create?deviceId=[value]&accountId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&businessPhone=[value]&businessPhoneExt=[value]&authorizeNetApiKey=[value]&authorizeNetTransactionKey=[value]
    */
  def createBillableEntity(): Action[AnyContent] = Action { request =>
    def executeApi(): BillableEntityResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val businessPhoneExt = request.getQueryString("businessPhoneExt")
        
      val authorizeNetApiKey = request.getQueryString("authorizeNetApiKey")
        
      val authorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey")
        
      api.createBillableEntity(deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/billable/delete?deviceId=[value]&accountId=[value]
    */
  def deleteBillableEntity(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.deleteBillableEntity(deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/billable/get?deviceId=[value]&accountId=[value]&includeCounts=[value]&includePayments=[value]
    */
  def getBillableEntity(): Action[AnyContent] = Action { request =>
    def executeApi(): BillableEntityResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val includeCounts = request.getQueryString("includeCounts")
        .map(value => value.toBoolean)
        
      val includePayments = request.getQueryString("includePayments")
        .map(value => value.toBoolean)
        
      api.getBillableEntity(deviceId, accountId, includeCounts, includePayments)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/billable/update?deviceId=[value]&accountId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&businessPhone=[value]&businessPhoneExt=[value]&authorizeNetApiKey=[value]&authorizeNetTransactionKey=[value]
    */
  def updateBillableEntity(): Action[AnyContent] = Action { request =>
    def executeApi(): BillableEntityResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val businessPhoneExt = request.getQueryString("businessPhoneExt")
        
      val authorizeNetApiKey = request.getQueryString("authorizeNetApiKey")
        
      val authorizeNetTransactionKey = request.getQueryString("authorizeNetTransactionKey")
        
      api.updateBillableEntity(deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, businessPhone, businessPhoneExt, authorizeNetApiKey, authorizeNetTransactionKey)
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
