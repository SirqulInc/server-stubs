package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ListingFullResponse
import model.ListingGroupResponse
import model.ListingResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ListingApiController @Inject()(cc: ControllerComponents, api: ListingApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/listing/create?accountId=[value]&name=[value]&filterIds=[value]&description=[value]&start=[value]&end=[value]&locationName=[value]&locationDescription=[value]&isPrivate=[value]&externalId=[value]&externalId2=[value]&externalGroupId=[value]&active=[value]&metaData=[value]
    */
  def createListing(): Action[AnyContent] = Action { request =>
    def executeApi(): ListingFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val filterIds = request.getQueryString("filterIds")
        
      val description = request.getQueryString("description")
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val end = request.getQueryString("end")
        .map(value => value.toLong)
        
      val locationName = request.getQueryString("locationName")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val isPrivate = request.getQueryString("isPrivate")
        .map(value => value.toBoolean)
        
      val externalId = request.getQueryString("externalId")
        
      val externalId2 = request.getQueryString("externalId2")
        
      val externalGroupId = request.getQueryString("externalGroupId")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      api.createListing(accountId, name, filterIds, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/listing/delete?accountId=[value]&listingId=[value]
    */
  def deleteListing(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("listingId", "query string")
        }
        
      api.deleteListing(accountId, listingId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/listing/get?listingId=[value]
    */
  def getListing(): Action[AnyContent] = Action { request =>
    def executeApi(): ListingFullResponse = {
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("listingId", "query string")
        }
        
      api.getListing(listingId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/listing/search?accountId=[value]&keyword=[value]&start=[value]&limit=[value]&activeOnly=[value]&latitude=[value]&longitude=[value]&startDate=[value]&endDate=[value]&categoryIds=[value]&filterIds=[value]&useListingOrderIds=[value]&externalId=[value]&externalId2=[value]&externalGroupId=[value]
    */
  def searchListing(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ListingResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val useListingOrderIds = request.getQueryString("useListingOrderIds")
        .map(value => value.toBoolean)
        
      val externalId = request.getQueryString("externalId")
        
      val externalId2 = request.getQueryString("externalId2")
        
      val externalGroupId = request.getQueryString("externalGroupId")
        
      api.searchListing(accountId, keyword, start, limit, activeOnly, latitude, longitude, startDate, endDate, categoryIds, filterIds, useListingOrderIds, externalId, externalId2, externalGroupId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/listing/summary?accountId=[value]&startDate=[value]&categoryIds=[value]&daysToInclude=[value]&useListingOrderIds=[value]
    */
  def summaryListing(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ListingGroupResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val daysToInclude = request.getQueryString("daysToInclude")
        .map(value => value.toInt)
        
      val useListingOrderIds = request.getQueryString("useListingOrderIds")
        .map(value => value.toBoolean)
        
      api.summaryListing(accountId, startDate, categoryIds, daysToInclude, useListingOrderIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/listing/update?accountId=[value]&listingId=[value]&filterIds=[value]&name=[value]&description=[value]&start=[value]&end=[value]&locationName=[value]&locationDescription=[value]&isPrivate=[value]&externalId=[value]&externalId2=[value]&externalGroupId=[value]&active=[value]&metaData=[value]
    */
  def updateListing(): Action[AnyContent] = Action { request =>
    def executeApi(): ListingFullResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("listingId", "query string")
        }
        
      val filterIds = request.getQueryString("filterIds")
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val end = request.getQueryString("end")
        .map(value => value.toLong)
        
      val locationName = request.getQueryString("locationName")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val isPrivate = request.getQueryString("isPrivate")
        .map(value => value.toBoolean)
        
      val externalId = request.getQueryString("externalId")
        
      val externalId2 = request.getQueryString("externalId2")
        
      val externalGroupId = request.getQueryString("externalGroupId")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      api.updateListing(accountId, listingId, filterIds, name, description, start, end, locationName, locationDescription, isPrivate, externalId, externalId2, externalGroupId, active, metaData)
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
