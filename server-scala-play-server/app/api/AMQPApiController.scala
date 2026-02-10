package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.QueueResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AMQPApiController @Inject()(cc: ControllerComponents, api: AMQPApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/queue/consumer/create?deviceId=[value]&accountId=[value]&appKey=[value]&name=[value]&hostname=[value]&port=[value]&username=[value]&password=[value]&virtualHost=[value]&exchanger=[value]&exchangerType=[value]&workers=[value]&dataMapping=[value]&useSSL=[value]
    */
  def consumerCreate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val hostname = request.getQueryString("hostname")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("hostname", "query string")
        }
        
      val port = request.getQueryString("port")
        .map(value => value.toInt)
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val virtualHost = request.getQueryString("virtualHost")
        
      val exchanger = request.getQueryString("exchanger")
        
      val exchangerType = request.getQueryString("exchangerType")
        
      val workers = request.getQueryString("workers")
        .map(value => value.toInt)
        
      val dataMapping = request.getQueryString("dataMapping")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("dataMapping", "query string")
        }
        
      val useSSL = request.getQueryString("useSSL")
        .map(value => value.toBoolean)
        
      api.consumerCreate(version, appKey, name, hostname, username, password, dataMapping, deviceId, accountId, port, virtualHost, exchanger, exchangerType, workers, useSSL)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/queue/consumer/update?deviceId=[value]&accountId=[value]&appKey=[value]&queueId=[value]&dataMapping=[value]&useSSL=[value]
    */
  def consumerUpdate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("queueId", "query string")
        }
        
      val dataMapping = request.getQueryString("dataMapping")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("dataMapping", "query string")
        }
        
      val useSSL = request.getQueryString("useSSL")
        .map(value => value.toBoolean)
        
      api.consumerUpdate(version, appKey, queueId, dataMapping, deviceId, accountId, useSSL)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/queue/create?deviceId=[value]&accountId=[value]&appKey=[value]&name=[value]&workers=[value]&analyticTags=[value]&hostname=[value]&port=[value]&username=[value]&password=[value]&virtualHost=[value]&useSSL=[value]
    */
  def queueCreate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val workers = request.getQueryString("workers")
        .map(value => value.toInt)
        
      val analyticTags = request.getQueryString("analyticTags")
        
      val hostname = request.getQueryString("hostname")
        
      val port = request.getQueryString("port")
        .map(value => value.toInt)
        
      val username = request.getQueryString("username")
        
      val password = request.getQueryString("password")
        
      val virtualHost = request.getQueryString("virtualHost")
        
      val useSSL = request.getQueryString("useSSL")
        .map(value => value.toBoolean)
        
      api.queueCreate(version, appKey, name, deviceId, accountId, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/queue/delete?deviceId=[value]&accountId=[value]&queueId=[value]
    */
  def queueDelete(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("queueId", "query string")
        }
        
      api.queueDelete(version, queueId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/queue/get?deviceId=[value]&accountId=[value]&queueId=[value]&appKey=[value]&name=[value]&hostname=[value]&virtualHost=[value]
    */
  def queueGet(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val name = request.getQueryString("name")
        
      val hostname = request.getQueryString("hostname")
        
      val virtualHost = request.getQueryString("virtualHost")
        
      api.queueGet(version, deviceId, accountId, queueId, appKey, name, hostname, virtualHost)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/queue/publish?queueId=[value]&appKey=[value]&name=[value]&hostname=[value]&virtualHost=[value]&message=[value]
    */
  def queuePublish(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val name = request.getQueryString("name")
        
      val hostname = request.getQueryString("hostname")
        
      val virtualHost = request.getQueryString("virtualHost")
        
      val message = request.getQueryString("message")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("message", "query string")
        }
        
      api.queuePublish(version, message, queueId, appKey, name, hostname, virtualHost)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/queue/search?queueId=[value]&deviceId=[value]&accountId=[value]&name=[value]&start=[value]&limit=[value]
    */
  def queueSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.queueSearch(version, queueId, deviceId, accountId, name, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/queue/update?deviceId=[value]&accountId=[value]&appKey=[value]&queueId=[value]&workers=[value]&analyticTags=[value]&hostname=[value]&port=[value]&username=[value]&password=[value]&virtualHost=[value]&useSSL=[value]
    */
  def queueUpdate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): QueueResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val queueId = request.getQueryString("queueId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("queueId", "query string")
        }
        
      val workers = request.getQueryString("workers")
        .map(value => value.toInt)
        
      val analyticTags = request.getQueryString("analyticTags")
        
      val hostname = request.getQueryString("hostname")
        
      val port = request.getQueryString("port")
        .map(value => value.toInt)
        
      val username = request.getQueryString("username")
        
      val password = request.getQueryString("password")
        
      val virtualHost = request.getQueryString("virtualHost")
        
      val useSSL = request.getQueryString("useSSL")
        .map(value => value.toBoolean)
        
      api.queueUpdate(version, queueId, deviceId, accountId, appKey, workers, analyticTags, hostname, port, username, password, virtualHost, useSSL)
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
