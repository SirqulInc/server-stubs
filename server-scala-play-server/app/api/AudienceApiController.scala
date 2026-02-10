package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AgeGroupResponse
import model.AudienceDeviceResponse
import model.AudienceResponse
import model.BigDecimal
import model.OfferListResponse
import model.SearchResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AudienceApiController @Inject()(cc: ControllerComponents, api: AudienceApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/audience/create?accountId=[value]&name=[value]&description=[value]&searchTags=[value]&gender=[value]&ageGroups=[value]&categoryIds=[value]&applicationIds=[value]&gameExperienceLevel=[value]&devices=[value]&deviceIds=[value]&deviceVersions=[value]&locations=[value]&radius=[value]&startTimeOffset=[value]&endTimeOffset=[value]&sendSuggestion=[value]&associateDescription=[value]&associateType=[value]&associateId=[value]&groupingId=[value]&metaData=[value]&visibility=[value]&audienceType=[value]&useOrder=[value]&cohortRegionsData=[value]&appKey=[value]&trilaterationTypes=[value]&uniqueName=[value]
    */
  def createAudience(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val searchTags = request.getQueryString("searchTags")
        
      val gender = request.getQueryString("gender")
        
      val ageGroups = request.getQueryString("ageGroups")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val applicationIds = request.getQueryString("applicationIds")
        
      val gameExperienceLevel = request.getQueryString("gameExperienceLevel")
        
      val devices = request.getQueryString("devices")
        
      val deviceIds = request.getQueryString("deviceIds")
        
      val deviceVersions = request.getQueryString("deviceVersions")
        
      val locations = request.getQueryString("locations")
        
      val radius = request.getQueryString("radius")
        
      val startTimeOffset = request.getQueryString("startTimeOffset")
        .map(value => value.toInt)
        
      val endTimeOffset = request.getQueryString("endTimeOffset")
        .map(value => value.toInt)
        
      val sendSuggestion = request.getQueryString("sendSuggestion")
        .map(value => value.toBoolean)
        
      val associateDescription = request.getQueryString("associateDescription")
        
      val associateType = request.getQueryString("associateType")
        
      val associateId = request.getQueryString("associateId")
        .map(value => value.toLong)
        
      val groupingId = request.getQueryString("groupingId")
        
      val metaData = request.getQueryString("metaData")
        
      val visibility = request.getQueryString("visibility")
        
      val audienceType = request.getQueryString("audienceType")
        
      val useOrder = request.getQueryString("useOrder")
        .map(value => value.toBoolean)
        
      val cohortRegionsData = request.getQueryString("cohortRegionsData")
        
      val appKey = request.getQueryString("appKey")
        
      val trilaterationTypes = request.getQueryString("trilaterationTypes")
        
      val uniqueName = request.getQueryString("uniqueName")
        .map(value => value.toBoolean)
        
      api.createAudience(version, accountId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, startTimeOffset, endTimeOffset, sendSuggestion, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/audience/delete?accountId=[value]&audienceId=[value]
    */
  def deleteAudience(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audienceId", "query string")
        }
        
      api.deleteAudience(version, accountId, audienceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/ageGroups
    */
  def getAgeGroups(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AgeGroupResponse] = {
      api.getAgeGroups(version)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/get?accountId=[value]&audienceId=[value]&appKey=[value]&returnAccountCount=[value]&returnAlbumCount=[value]&albumTypesForCount=[value]
    */
  def getAudience(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audienceId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val returnAccountCount = request.getQueryString("returnAccountCount")
        .map(value => value.toBoolean)
        
      val returnAlbumCount = request.getQueryString("returnAlbumCount")
        .map(value => value.toBoolean)
        
      val albumTypesForCount = request.getQueryString("albumTypesForCount")
        
      api.getAudience(version, accountId, audienceId, appKey, returnAccountCount, returnAlbumCount, albumTypesForCount)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/search?accountId=[value]&albumIds=[value]&keyword=[value]&keywordFields=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&sendSuggestion=[value]&activeOnly=[value]&groupByGroupingId=[value]&appKey=[value]&returnGlobal=[value]&exactKeyword=[value]&audienceType=[value]&audienceTypes=[value]&returnAccountCount=[value]&returnAlbumCount=[value]&albumTypesForCount=[value]
    */
  def getAudienceList(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[SearchResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumIds = request.getQueryString("albumIds")
        
      val keyword = request.getQueryString("keyword")
        
      val keywordFields = request.getQueryString("keywordFields")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val sendSuggestion = request.getQueryString("sendSuggestion")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val groupByGroupingId = request.getQueryString("groupByGroupingId")
        .map(value => value.toBoolean)
        
      val appKey = request.getQueryString("appKey")
        
      val returnGlobal = request.getQueryString("returnGlobal")
        .map(value => value.toBoolean)
        
      val exactKeyword = request.getQueryString("exactKeyword")
        .map(value => value.toBoolean)
        
      val audienceType = request.getQueryString("audienceType")
        
      val audienceTypes = request.getQueryString("audienceTypes")
        
      val returnAccountCount = request.getQueryString("returnAccountCount")
        .map(value => value.toBoolean)
        
      val returnAlbumCount = request.getQueryString("returnAlbumCount")
        .map(value => value.toBoolean)
        
      val albumTypesForCount = request.getQueryString("albumTypesForCount")
        
      api.getAudienceList(version, accountId, albumIds, keyword, keywordFields, sortField, descending, start, limit, sendSuggestion, activeOnly, groupByGroupingId, appKey, returnGlobal, exactKeyword, audienceType, audienceTypes, returnAccountCount, returnAlbumCount, albumTypesForCount)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/devices?includeInactive=[value]
    */
  def getDevices(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AudienceDeviceResponse] = {
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeInactive", "query string")
        }
        
      api.getDevices(version, includeInactive)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/experiences
    */
  def getExperiences(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      api.getExperiences(version)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/grouped/get?accountId=[value]&audienceGroupingId=[value]
    */
  def getGroupedAudiences(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val audienceGroupingId = request.getQueryString("audienceGroupingId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audienceGroupingId", "query string")
        }
        
      api.getGroupedAudiences(version, accountId, audienceGroupingId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/audience/suggestion/list?accountId=[value]&limit=[value]&suggestionType=[value]
    */
  def listByAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferListResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val suggestionType = request.getQueryString("suggestionType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("suggestionType", "query string")
        }
        
      api.listByAccount(version, accountId, limit, suggestionType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/suggestion/offersByAudience?gender=[value]&age=[value]&categoryIds=[value]&latitude=[value]&longitude=[value]&limit=[value]
    */
  def listByAudience(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferListResponse = {
      val gender = request.getQueryString("gender")
        
      val age = request.getQueryString("age")
        .map(value => value.toInt)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.listByAudience(version, limit, gender, age, categoryIds, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/audience/suggestion/latest?accountId=[value]&timeframe=[value]&suggestionType=[value]
    */
  def listLastestByAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferListResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val timeframe = request.getQueryString("timeframe")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("timeframe", "query string")
        }
        
      val suggestionType = request.getQueryString("suggestionType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("suggestionType", "query string")
        }
        
      api.listLastestByAccount(version, accountId, timeframe, suggestionType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/audience/suggestion/send?accountId=[value]&latitude=[value]&longitude=[value]
    */
  def sendByAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      api.sendByAccount(version, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/audience/update?accountId=[value]&audienceId=[value]&name=[value]&description=[value]&searchTags=[value]&gender=[value]&ageGroups=[value]&categoryIds=[value]&applicationIds=[value]&gameExperienceLevel=[value]&devices=[value]&deviceIds=[value]&deviceVersions=[value]&locations=[value]&radius=[value]&active=[value]&sendSuggestion=[value]&startTimeOffset=[value]&endTimeOffset=[value]&associateDescription=[value]&associateType=[value]&associateId=[value]&groupingId=[value]&metaData=[value]&visibility=[value]&audienceType=[value]&useOrder=[value]&cohortRegionsData=[value]&appKey=[value]&trilaterationTypes=[value]&uniqueName=[value]
    */
  def updateAudience(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AudienceResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("audienceId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val searchTags = request.getQueryString("searchTags")
        
      val gender = request.getQueryString("gender")
        
      val ageGroups = request.getQueryString("ageGroups")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val applicationIds = request.getQueryString("applicationIds")
        
      val gameExperienceLevel = request.getQueryString("gameExperienceLevel")
        
      val devices = request.getQueryString("devices")
        
      val deviceIds = request.getQueryString("deviceIds")
        
      val deviceVersions = request.getQueryString("deviceVersions")
        
      val locations = request.getQueryString("locations")
        
      val radius = request.getQueryString("radius")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val sendSuggestion = request.getQueryString("sendSuggestion")
        .map(value => value.toBoolean)
        
      val startTimeOffset = request.getQueryString("startTimeOffset")
        .map(value => value.toInt)
        
      val endTimeOffset = request.getQueryString("endTimeOffset")
        .map(value => value.toInt)
        
      val associateDescription = request.getQueryString("associateDescription")
        
      val associateType = request.getQueryString("associateType")
        
      val associateId = request.getQueryString("associateId")
        .map(value => value.toLong)
        
      val groupingId = request.getQueryString("groupingId")
        
      val metaData = request.getQueryString("metaData")
        
      val visibility = request.getQueryString("visibility")
        
      val audienceType = request.getQueryString("audienceType")
        
      val useOrder = request.getQueryString("useOrder")
        .map(value => value.toBoolean)
        
      val cohortRegionsData = request.getQueryString("cohortRegionsData")
        
      val appKey = request.getQueryString("appKey")
        
      val trilaterationTypes = request.getQueryString("trilaterationTypes")
        
      val uniqueName = request.getQueryString("uniqueName")
        .map(value => value.toBoolean)
        
      api.updateAudience(version, accountId, audienceId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, active, sendSuggestion, startTimeOffset, endTimeOffset, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName)
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
