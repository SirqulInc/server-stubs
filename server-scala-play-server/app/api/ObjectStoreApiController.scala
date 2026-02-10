package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ObjectStoreResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ObjectStoreApiController @Inject()(cc: ControllerComponents, api: ObjectStoreApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/object/field/add?accountId=[value]&appKey=[value]&objectName=[value]&fieldName=[value]&fieldType=[value]
    */
  def addField(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val objectName = request.getQueryString("objectName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("objectName", "query string")
        }
        
      val fieldName = request.getQueryString("fieldName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("fieldName", "query string")
        }
        
      val fieldType = request.getQueryString("fieldType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("fieldType", "query string")
        }
        
      api.addField(version, accountId, appKey, objectName, fieldName, fieldType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/object/data/:objectName?accountId=[value]
    * @param objectName the name of the object to create data for
    */
  def createData(version: BigDecimal, objectName: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.createData(version, objectName, accountId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/object/create?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def createObject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val objectName = request.getQueryString("objectName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("objectName", "query string")
        }
        
      api.createObject(version, accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/object/data/:objectName/:objectId?accountId=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def deleteData(version: BigDecimal, objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.deleteData(version, objectName, objectId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/object/field/delete?accountId=[value]&appKey=[value]&objectName=[value]&fieldName=[value]
    */
  def deleteField(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val objectName = request.getQueryString("objectName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("objectName", "query string")
        }
        
      val fieldName = request.getQueryString("fieldName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("fieldName", "query string")
        }
        
      api.deleteField(version, accountId, appKey, objectName, fieldName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/object/delete?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def deleteObject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val objectName = request.getQueryString("objectName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("objectName", "query string")
        }
        
      api.deleteObject(version, accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/object/data/:objectName/:objectId?accountId=[value]&include=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def getData(version: BigDecimal, objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val include = request.getQueryString("include")
        
      api.getData(version, objectName, objectId, accountId, include)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/object/get?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def getObject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val objectName = request.getQueryString("objectName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("objectName", "query string")
        }
        
      api.getObject(version, accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/object/data/:objectName?accountId=[value]&criteria=[value]&count=[value]&start=[value]&limit=[value]&order=[value]&include=[value]
    * @param objectName The name of the object to search upon
    */
  def searchData(version: BigDecimal, objectName: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val criteria = request.getQueryString("criteria")
        
      val count = request.getQueryString("count")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("count", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val order = request.getQueryString("order")
        
      val include = request.getQueryString("include")
        
      api.searchData(version, objectName, count, start, limit, accountId, criteria, order, include)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/object/search?accountId=[value]&appKey=[value]&keyword=[value]&start=[value]&limit=[value]
    */
  def searchObject(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.searchObject(version, accountId, appKey, start, limit, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/object/data/:objectName/:objectId?accountId=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def updateData(version: BigDecimal, objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.updateData(version, objectName, objectId, accountId, body)
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
