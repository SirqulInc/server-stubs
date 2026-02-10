package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PaymentRequest
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class SecureAppApiController @Inject()(cc: ControllerComponents, api: SecureAppApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/secure/application/create?accountId=[value]&appKey=[value]&active=[value]&keyCert=[value]&trustStore=[value]&username=[value]&password=[value]&biometricType=[value]&biometricPosition=[value]&biometricPosition2=[value]
    */
  def createSecureApplication(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val keyCert = request.getQueryString("keyCert")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("keyCert", "query string")
        }
        
      val trustStore = request.getQueryString("trustStore")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("trustStore", "query string")
        }
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val biometricType = request.getQueryString("biometricType")
        
      val biometricPosition = request.getQueryString("biometricPosition")
        
      val biometricPosition2 = request.getQueryString("biometricPosition2")
        
      api.createSecureApplication(version, accountId, appKey, keyCert, trustStore, username, password, active, biometricType, biometricPosition, biometricPosition2)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/secure/application/delete?accountId=[value]&appKey=[value]
    */
  def deleteSecureApplication(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.deleteSecureApplication(version, accountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/secure/login?deviceId=[value]&appKey=[value]&biometricFile=[value]&biometricFile2=[value]&ageRestriction=[value]&returnProfile=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]
    */
  def loginSecure(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val biometricFile = request.getQueryString("biometricFile")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("biometricFile", "query string")
        }
        
      val biometricFile2 = request.getQueryString("biometricFile2")
        
      val ageRestriction = request.getQueryString("ageRestriction")
        .map(value => value.toInt)
        
      val returnProfile = request.getQueryString("returnProfile")
        .map(value => value.toBoolean)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.loginSecure(version, appKey, biometricFile, deviceId, biometricFile2, ageRestriction, returnProfile, responseFilters, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/secure/purchase
    */
  def purchaseSecure(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val body = request.body.asJson.map(_.as[PaymentRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "body")
      }
      api.purchaseSecure(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/secure/application/reset?accountId=[value]&appKey=[value]
    */
  def resetSecure(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.resetSecure(version, accountId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/secure/application/update?accountId=[value]&appKey=[value]&active=[value]&keyCert=[value]&trustStore=[value]&username=[value]&password=[value]&biometricType=[value]&biometricPosition=[value]&biometricPosition2=[value]
    */
  def updateSecureApplication(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val keyCert = request.getQueryString("keyCert")
        
      val trustStore = request.getQueryString("trustStore")
        
      val username = request.getQueryString("username")
        
      val password = request.getQueryString("password")
        
      val biometricType = request.getQueryString("biometricType")
        
      val biometricPosition = request.getQueryString("biometricPosition")
        
      val biometricPosition2 = request.getQueryString("biometricPosition2")
        
      api.updateSecureApplication(version, accountId, appKey, active, keyCert, trustStore, username, password, biometricType, biometricPosition, biometricPosition2)
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
