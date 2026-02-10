package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PreviewPersonaResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PreviewPersonaApiController @Inject()(cc: ControllerComponents, api: PreviewPersonaApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/persona/create?accountId=[value]&title=[value]&previewAccounts=[value]&date=[value]&age=[value]&gender=[value]&gameExperienceLevel=[value]&latitude=[value]&longitude=[value]
    */
  def createPersona(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PreviewPersonaResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val previewAccounts = request.getQueryString("previewAccounts")
        
      val date = request.getQueryString("date")
        .map(value => value.toLong)
        
      val age = request.getQueryString("age")
        .map(value => value.toInt)
        
      val gender = request.getQueryString("gender")
        
      val gameExperienceLevel = request.getQueryString("gameExperienceLevel")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createPersona(version, accountId, title, previewAccounts, date, age, gender, gameExperienceLevel, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/persona/delete?accountId=[value]&personaId=[value]
    */
  def deletePersona(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val personaId = request.getQueryString("personaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("personaId", "query string")
        }
        
      api.deletePersona(version, accountId, personaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/persona/get?accountId=[value]&personaId=[value]
    */
  def getPersonaList(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PreviewPersonaResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val personaId = request.getQueryString("personaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("personaId", "query string")
        }
        
      api.getPersonaList(version, accountId, personaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/persona/search?accountId=[value]&start=[value]&limit=[value]
    */
  def searchPersona(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PreviewPersonaResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.searchPersona(version, accountId, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/persona/update?accountId=[value]&personaId=[value]&title=[value]&previewAccounts=[value]&active=[value]&date=[value]&age=[value]&gender=[value]&gameExperienceLevel=[value]&latitude=[value]&longitude=[value]
    */
  def updatePersona(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PreviewPersonaResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val personaId = request.getQueryString("personaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("personaId", "query string")
        }
        
      val title = request.getQueryString("title")
        
      val previewAccounts = request.getQueryString("previewAccounts")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val date = request.getQueryString("date")
        .map(value => value.toLong)
        
      val age = request.getQueryString("age")
        .map(value => value.toInt)
        
      val gender = request.getQueryString("gender")
        
      val gameExperienceLevel = request.getQueryString("gameExperienceLevel")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.updatePersona(version, accountId, personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude)
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
