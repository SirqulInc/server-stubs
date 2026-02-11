package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CategoryResponse
import model.CategoryTreeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class CategoryApiController @Inject()(cc: ControllerComponents, api: CategoryApi) extends AbstractController(cc) {
  /**
    * GET /api/3.18/category/distancesearch?accountId=[value]&keyword=[value]&appKey=[value]&categoryIds=[value]&parentCategoryIds=[value]&rootOnly=[value]&sortField=[value]&responseGroup=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&returnExternal=[value]&exactMatch=[value]&`type`=[value]&externalType=[value]&minOfferCount=[value]&latitude=[value]&longitude=[value]&range=[value]
    */
  def categoryDistanceSearch(): Action[AnyContent] = Action { request =>
    def executeApi(): List[CategoryResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val appKey = request.getQueryString("appKey")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val parentCategoryIds = request.getQueryString("parentCategoryIds")
        
      val rootOnly = request.getQueryString("rootOnly")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        
      val responseGroup = request.getQueryString("responseGroup")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val returnExternal = request.getQueryString("returnExternal")
        .map(value => value.toBoolean)
        
      val exactMatch = request.getQueryString("exactMatch")
        .map(value => value.toBoolean)
        
      val `type` = request.getQueryString("type")
        
      val externalType = request.getQueryString("externalType")
        
      val minOfferCount = request.getQueryString("minOfferCount")
        .map(value => value.toInt)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val range = request.getQueryString("range")
        .map(value => value.toDouble)
        
      api.categoryDistanceSearch(accountId, keyword, appKey, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, `type`, externalType, minOfferCount, latitude, longitude, range)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/category/create?appKey=[value]&accountId=[value]&parentCategoryId=[value]&name=[value]&description=[value]&`type`=[value]&assetId=[value]&externalId=[value]&externalType=[value]&externalCategorySlug=[value]&sqootSlug=[value]&active=[value]&metaData=[value]&searchTags=[value]
    */
  def createCategory(): Action[AnyContent] = Action { request =>
    def executeApi(): CategoryTreeResponse = {
      val appKey = request.getQueryString("appKey")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val parentCategoryId = request.getQueryString("parentCategoryId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val `type` = request.getQueryString("type")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val externalId = request.getQueryString("externalId")
        
      val externalType = request.getQueryString("externalType")
        
      val externalCategorySlug = request.getQueryString("externalCategorySlug")
        
      val sqootSlug = request.getQueryString("sqootSlug")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      val searchTags = request.getQueryString("searchTags")
        
      api.createCategory(accountId, name, appKey, parentCategoryId, description, `type`, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/category/delete?accountId=[value]&categoryId=[value]
    */
  def deleteCategory(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("categoryId", "query string")
        }
        
      api.deleteCategory(accountId, categoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/category/duplicate?appKey=[value]&accountId=[value]&categoryId=[value]&parentCategoryId=[value]
    */
  def duplicateCategory(): Action[AnyContent] = Action { request =>
    def executeApi(): CategoryTreeResponse = {
      val appKey = request.getQueryString("appKey")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("categoryId", "query string")
        }
        
      val parentCategoryId = request.getQueryString("parentCategoryId")
        .map(value => value.toLong)
        
      api.duplicateCategory(accountId, categoryId, appKey, parentCategoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/category/get?categoryId=[value]&returnExternal=[value]
    */
  def getCategory(): Action[AnyContent] = Action { request =>
    def executeApi(): CategoryTreeResponse = {
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("categoryId", "query string")
        }
        
      val returnExternal = request.getQueryString("returnExternal")
        .map(value => value.toBoolean)
        
      api.getCategory(categoryId, returnExternal)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/category/search?accountId=[value]&keyword=[value]&appKey=[value]&categoryId=[value]&categoryIds=[value]&parentCategoryIds=[value]&rootOnly=[value]&sortField=[value]&responseGroup=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&returnExternal=[value]&exactMatch=[value]&`type`=[value]&externalType=[value]&excludeExternalType=[value]&minOfferCount=[value]&searchDepth=[value]&searchMode=[value]
    */
  def searchCategories(): Action[AnyContent] = Action { request =>
    def executeApi(): List[CategoryResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val appKey = request.getQueryString("appKey")
        
      val categoryId = request.getQueryString("categoryId")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val parentCategoryIds = request.getQueryString("parentCategoryIds")
        
      val rootOnly = request.getQueryString("rootOnly")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        
      val responseGroup = request.getQueryString("responseGroup")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val returnExternal = request.getQueryString("returnExternal")
        .map(value => value.toBoolean)
        
      val exactMatch = request.getQueryString("exactMatch")
        .map(value => value.toBoolean)
        
      val `type` = request.getQueryString("type")
        
      val externalType = request.getQueryString("externalType")
        
      val excludeExternalType = request.getQueryString("excludeExternalType")
        .map(value => value.toBoolean)
        
      val minOfferCount = request.getQueryString("minOfferCount")
        .map(value => value.toInt)
        
      val searchDepth = request.getQueryString("searchDepth")
        .map(value => value.toInt)
        
      val searchMode = request.getQueryString("searchMode")
        
      api.searchCategories(accountId, keyword, appKey, categoryId, categoryIds, parentCategoryIds, rootOnly, sortField, responseGroup, descending, start, limit, activeOnly, returnExternal, exactMatch, `type`, externalType, excludeExternalType, minOfferCount, searchDepth, searchMode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/category/update?accountId=[value]&categoryId=[value]&parentCategoryId=[value]&name=[value]&description=[value]&`type`=[value]&assetId=[value]&externalId=[value]&externalType=[value]&externalCategorySlug=[value]&sqootSlug=[value]&active=[value]&metaData=[value]&searchTags=[value]
    */
  def updateCategory(): Action[AnyContent] = Action { request =>
    def executeApi(): CategoryTreeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("categoryId", "query string")
        }
        
      val parentCategoryId = request.getQueryString("parentCategoryId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val `type` = request.getQueryString("type")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val externalId = request.getQueryString("externalId")
        
      val externalType = request.getQueryString("externalType")
        
      val externalCategorySlug = request.getQueryString("externalCategorySlug")
        
      val sqootSlug = request.getQueryString("sqootSlug")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      val searchTags = request.getQueryString("searchTags")
        
      api.updateCategory(accountId, categoryId, parentCategoryId, name, description, `type`, assetId, externalId, externalType, externalCategorySlug, sqootSlug, active, metaData, searchTags)
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
