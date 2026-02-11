package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.PreviewPersonaResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PreviewPersonaApiController @Inject()(cc: ControllerComponents, api: PreviewPersonaApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/persona/create?accountId=[value]&title=[value]&previewAccounts=[value]&date=[value]&age=[value]&gender=[value]&gameExperienceLevel=[value]&latitude=[value]&longitude=[value]
    */
  def createPersona(): Action[AnyContent] = Action { request =>
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
        
      api.createPersona(accountId, title, previewAccounts, date, age, gender, gameExperienceLevel, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/persona/delete?accountId=[value]&personaId=[value]
    */
  def deletePersona(): Action[AnyContent] = Action { request =>
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
        
      api.deletePersona(accountId, personaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/persona/get?accountId=[value]&personaId=[value]
    */
  def getPersonaList(): Action[AnyContent] = Action { request =>
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
        
      api.getPersonaList(accountId, personaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/persona/search?accountId=[value]&start=[value]&limit=[value]
    */
  def searchPersona(): Action[AnyContent] = Action { request =>
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
        
      api.searchPersona(accountId, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/persona/update?accountId=[value]&personaId=[value]&title=[value]&previewAccounts=[value]&active=[value]&date=[value]&age=[value]&gender=[value]&gameExperienceLevel=[value]&latitude=[value]&longitude=[value]
    */
  def updatePersona(): Action[AnyContent] = Action { request =>
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
        
      api.updatePersona(accountId, personaId, title, previewAccounts, active, date, age, gender, gameExperienceLevel, latitude, longitude)
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
