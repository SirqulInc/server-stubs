package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ChartData
import model.SirqulResponse
import model.UserActivityResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AnalyticsApiController @Inject()(cc: ControllerComponents, api: AnalyticsApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/analytics/useractivity?start=[value]&limit=[value]&accountId=[value]
    */
  def activities(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[UserActivityResponse] = {
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
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.activities(version, start, limit, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/analytics/aggregatedFilteredUsage?deviceId=[value]&accountId=[value]&applicationId=[value]&appKey=[value]&startDate=[value]&endDate=[value]&deviceType=[value]&device=[value]&deviceOS=[value]&gender=[value]&ageGroup=[value]&country=[value]&state=[value]&city=[value]&zip=[value]&model=[value]&tag=[value]&userAccountId=[value]&userAccountDisplay=[value]&userAccountUsername=[value]&groupByRoot=[value]&groupBy=[value]&distinctCount=[value]&sortField=[value]&descending=[value]&hideUnknown=[value]&responseFormat=[value]&l=[value]&limit=[value]&latitude=[value]&longitude=[value]
    */
  def aggregatedFilteredUsage(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ChartData = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val applicationId = request.getQueryString("applicationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val deviceType = request.getQueryString("deviceType")
        
      val device = request.getQueryString("device")
        
      val deviceOS = request.getQueryString("deviceOS")
        
      val gender = request.getQueryString("gender")
        
      val ageGroup = request.getQueryString("ageGroup")
        
      val country = request.getQueryString("country")
        
      val state = request.getQueryString("state")
        
      val city = request.getQueryString("city")
        
      val zip = request.getQueryString("zip")
        
      val model = request.getQueryString("model")
        
      val tag = request.getQueryString("tag")
        
      val userAccountId = request.getQueryString("userAccountId")
        .map(value => value.toLong)
        
      val userAccountDisplay = request.getQueryString("userAccountDisplay")
        
      val userAccountUsername = request.getQueryString("userAccountUsername")
        
      val groupByRoot = request.getQueryString("groupByRoot")
        
      val groupBy = request.getQueryString("groupBy")
        
      val distinctCount = request.getQueryString("distinctCount")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val hideUnknown = request.getQueryString("hideUnknown")
        .map(value => value.toBoolean)
        
      val responseFormat = request.getQueryString("responseFormat")
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.aggregatedFilteredUsage(version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, groupByRoot, groupBy, distinctCount, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/analytics/filteredUsage?deviceId=[value]&accountId=[value]&applicationId=[value]&appKey=[value]&startDate=[value]&endDate=[value]&deviceType=[value]&device=[value]&deviceOS=[value]&gender=[value]&ageGroup=[value]&country=[value]&state=[value]&city=[value]&zip=[value]&model=[value]&tag=[value]&userAccountId=[value]&userAccountDisplay=[value]&userAccountUsername=[value]&customId=[value]&customType=[value]&customValue=[value]&customValue2=[value]&customLong=[value]&customLong2=[value]&customMessage=[value]&customMessage2=[value]&groupBy=[value]&distinctCount=[value]&sumColumn=[value]&sortField=[value]&descending=[value]&hideUnknown=[value]&responseFormat=[value]&l=[value]&limit=[value]&latitude=[value]&longitude=[value]
    */
  def filteredUsage(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ChartData = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val applicationId = request.getQueryString("applicationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val deviceType = request.getQueryString("deviceType")
        
      val device = request.getQueryString("device")
        
      val deviceOS = request.getQueryString("deviceOS")
        
      val gender = request.getQueryString("gender")
        
      val ageGroup = request.getQueryString("ageGroup")
        
      val country = request.getQueryString("country")
        
      val state = request.getQueryString("state")
        
      val city = request.getQueryString("city")
        
      val zip = request.getQueryString("zip")
        
      val model = request.getQueryString("model")
        
      val tag = request.getQueryString("tag")
        
      val userAccountId = request.getQueryString("userAccountId")
        .map(value => value.toLong)
        
      val userAccountDisplay = request.getQueryString("userAccountDisplay")
        
      val userAccountUsername = request.getQueryString("userAccountUsername")
        
      val customId = request.getQueryString("customId")
        .map(value => value.toLong)
        
      val customType = request.getQueryString("customType")
        
      val customValue = request.getQueryString("customValue")
        .map(value => value.toDouble)
        
      val customValue2 = request.getQueryString("customValue2")
        .map(value => value.toDouble)
        
      val customLong = request.getQueryString("customLong")
        .map(value => value.toLong)
        
      val customLong2 = request.getQueryString("customLong2")
        .map(value => value.toLong)
        
      val customMessage = request.getQueryString("customMessage")
        
      val customMessage2 = request.getQueryString("customMessage2")
        
      val groupBy = request.getQueryString("groupBy")
        
      val distinctCount = request.getQueryString("distinctCount")
        
      val sumColumn = request.getQueryString("sumColumn")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val hideUnknown = request.getQueryString("hideUnknown")
        .map(value => value.toBoolean)
        
      val responseFormat = request.getQueryString("responseFormat")
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.filteredUsage(version, deviceId, accountId, applicationId, appKey, startDate, endDate, deviceType, device, deviceOS, gender, ageGroup, country, state, city, zip, model, tag, userAccountId, userAccountDisplay, userAccountUsername, customId, customType, customValue, customValue2, customLong, customLong2, customMessage, customMessage2, groupBy, distinctCount, sumColumn, sortField, descending, hideUnknown, responseFormat, l, limit, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/analytics/usage?tag=[value]&deviceId=[value]&accountId=[value]&applicationId=[value]&appKey=[value]&appVersion=[value]&device=[value]&deviceType=[value]&deviceOS=[value]&model=[value]&latitude=[value]&longitude=[value]&customId=[value]&customType=[value]&achievementIncrement=[value]&city=[value]&state=[value]&country=[value]&zip=[value]&locationDescription=[value]&clientTime=[value]&errorMessage=[value]&ip=[value]&userAgent=[value]&backgroundEvent=[value]&customMessage=[value]&customMessage2=[value]&customValue=[value]&customValue2=[value]&customLong=[value]&customLong2=[value]
    */
  def usage(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val tag = request.getQueryString("tag")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("tag", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val applicationId = request.getQueryString("applicationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val appVersion = request.getQueryString("appVersion")
        
      val device = request.getQueryString("device")
        
      val deviceType = request.getQueryString("deviceType")
        
      val deviceOS = request.getQueryString("deviceOS")
        
      val model = request.getQueryString("model")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val customId = request.getQueryString("customId")
        .map(value => value.toLong)
        
      val customType = request.getQueryString("customType")
        
      val achievementIncrement = request.getQueryString("achievementIncrement")
        .map(value => value.toLong)
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val country = request.getQueryString("country")
        
      val zip = request.getQueryString("zip")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val clientTime = request.getQueryString("clientTime")
        .map(value => value.toLong)
        
      val errorMessage = request.getQueryString("errorMessage")
        
      val ip = request.getQueryString("ip")
        
      val userAgent = request.getQueryString("userAgent")
        
      val backgroundEvent = request.getQueryString("backgroundEvent")
        .map(value => value.toBoolean)
        
      val customMessage = request.getQueryString("customMessage")
        
      val customMessage2 = request.getQueryString("customMessage2")
        
      val customValue = request.getQueryString("customValue")
        .map(value => value.toDouble)
        
      val customValue2 = request.getQueryString("customValue2")
        .map(value => value.toDouble)
        
      val customLong = request.getQueryString("customLong")
        .map(value => value.toLong)
        
      val customLong2 = request.getQueryString("customLong2")
        .map(value => value.toLong)
        
      api.usage(version, tag, deviceId, accountId, applicationId, appKey, appVersion, device, deviceType, deviceOS, model, latitude, longitude, customId, customType, achievementIncrement, city, state, country, zip, locationDescription, clientTime, errorMessage, ip, userAgent, backgroundEvent, customMessage, customMessage2, customValue, customValue2, customLong, customLong2)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/analytics/usage/batch?deviceId=[value]&accountId=[value]&appKey=[value]&appVersion=[value]&device=[value]&deviceType=[value]&deviceOS=[value]&model=[value]&data=[value]&updateRanking=[value]&returnSummaryResponse=[value]
    */
  def usageBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val appVersion = request.getQueryString("appVersion")
        
      val device = request.getQueryString("device")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("device", "query string")
        }
        
      val deviceType = request.getQueryString("deviceType")
        
      val deviceOS = request.getQueryString("deviceOS")
        
      val model = request.getQueryString("model")
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      val updateRanking = request.getQueryString("updateRanking")
        .map(value => value.toBoolean)
        
      val returnSummaryResponse = request.getQueryString("returnSummaryResponse")
        .map(value => value.toBoolean)
        
      api.usageBatch(version, appKey, device, data, deviceId, accountId, appVersion, deviceType, deviceOS, model, updateRanking, returnSummaryResponse)
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
