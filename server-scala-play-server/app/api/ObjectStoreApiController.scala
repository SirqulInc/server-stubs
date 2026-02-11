package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ObjectStoreResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ObjectStoreApiController @Inject()(cc: ControllerComponents, api: ObjectStoreApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/object/field/add?accountId=[value]&appKey=[value]&objectName=[value]&fieldName=[value]&fieldType=[value]
    */
  def addField(): Action[AnyContent] = Action { request =>
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
        
      api.addField(accountId, appKey, objectName, fieldName, fieldType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/object/data/:objectName?accountId=[value]
    * @param objectName the name of the object to create data for
    */
  def createData(objectName: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.createData(objectName, accountId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/object/create?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def createObject(): Action[AnyContent] = Action { request =>
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
        
      api.createObject(accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/object/data/:objectName/:objectId?accountId=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def deleteData(objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.deleteData(objectName, objectId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/object/field/delete?accountId=[value]&appKey=[value]&objectName=[value]&fieldName=[value]
    */
  def deleteField(): Action[AnyContent] = Action { request =>
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
        
      api.deleteField(accountId, appKey, objectName, fieldName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/object/delete?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def deleteObject(): Action[AnyContent] = Action { request =>
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
        
      api.deleteObject(accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/object/data/:objectName/:objectId?accountId=[value]&include=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def getData(objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val include = request.getQueryString("include")
        
      api.getData(objectName, objectId, accountId, include)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/object/get?accountId=[value]&appKey=[value]&objectName=[value]
    */
  def getObject(): Action[AnyContent] = Action { request =>
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
        
      api.getObject(accountId, appKey, objectName)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/object/data/:objectName?accountId=[value]&criteria=[value]&count=[value]&start=[value]&limit=[value]&order=[value]&include=[value]
    * @param objectName The name of the object to search upon
    */
  def searchData(objectName: String): Action[AnyContent] = Action { request =>
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
        
      api.searchData(objectName, count, start, limit, accountId, criteria, order, include)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/object/search?accountId=[value]&appKey=[value]&keyword=[value]&start=[value]&limit=[value]
    */
  def searchObject(): Action[AnyContent] = Action { request =>
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
        
      api.searchObject(accountId, appKey, start, limit, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/object/data/:objectName/:objectId?accountId=[value]
    * @param objectName The name of the object to search upon
    * @param objectId objectId The id of the record to return
    */
  def updateData(objectName: String, objectId: String): Action[AnyContent] = Action { request =>
    def executeApi(): ObjectStoreResponse = {
      val body = request.body.asJson.map(_.as[String])
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      api.updateData(objectName, objectId, accountId, body)
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
