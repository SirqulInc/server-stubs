package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Trip

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TripApiController @Inject()(cc: ControllerComponents, api: TripApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/trip
    */
  def createTrip(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.createTrip(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/trip/:id
    * @param id the id of the trip to delete
    */
  def delete(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.delete(version, id)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/trip/:id/drive?recurrence=[value]
    * @param id the id of the trip
    */
  def driveTrip(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.driveTrip(version, id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/flexible?recurrence=[value]
    * @param id the id of the trip
    */
  def flexibleTrip(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.flexibleTrip(version, id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trip/:id
    * @param id the id of the trip to get
    */
  def getTrip(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      api.getTrip(version, id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trip/:id/match?matchedHasRoute=[value]&matchedHasDriver=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    * @param id The id The id of the trip to search for matches for
    */
  def getTripMatches(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val matchedHasRoute = request.getQueryString("matchedHasRoute")
        .map(value => value.toBoolean)
        
      val matchedHasDriver = request.getQueryString("matchedHasDriver")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.getTripMatches(version, id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/match/process?startDate=[value]&endDate=[value]&tripId=[value]
    */
  def processTripMatches(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tripId = request.getQueryString("tripId")
        .map(value => value.toLong)
        
      api.processTripMatches(version, startDate, endDate, tripId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/ride?recurrence=[value]
    * @param id the id of the trip
    */
  def ride(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.ride(version, id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trip?accountId=[value]&startDate=[value]&endDate=[value]&hasNotifications=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def search(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val hasNotifications = request.getQueryString("hasNotifications")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.search(version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/trip/match?accountId=[value]&startDate=[value]&endDate=[value]&matchedHasRoute=[value]&matchedHasDriver=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchTrips(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val matchedHasRoute = request.getQueryString("matchedHasRoute")
        .map(value => value.toBoolean)
        
      val matchedHasDriver = request.getQueryString("matchedHasDriver")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.searchTrips(version, accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/locations
    * @param id the id of the trip to update locations for
    */
  def updateLocations(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateLocations(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/locations/recurrence
    * @param id the id of the trip
    */
  def updateRecurrenceLocations(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateRecurrenceLocations(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/shipments/recurrence
    * @param id the id of the trip
    */
  def updateRecurrenceShipments(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateRecurrenceShipments(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/:id/shipments
    * @param id the id of the trip shipments to update
    */
  def updateShipments(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateShipments(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/trip/:id
    * @param id the id of the trip to update
    */
  def updateTrip(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateTrip(version, id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/trip/notifications?id=[value]&notifications=[value]
    */
  def updateTripNotifications(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val id = request.getQueryString("id")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("id", "query string")
        }
        
      val notifications = request.getQueryString("notifications")
        
      api.updateTripNotifications(version, id, notifications)
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
