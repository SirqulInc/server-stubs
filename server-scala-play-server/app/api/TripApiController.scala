package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Trip

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TripApiController @Inject()(cc: ControllerComponents, api: TripApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/trip
    */
  def createTrip(): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.createTrip(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/trip/:id
    * @param id the id of the trip to delete
    */
  def delete(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.delete(id)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/trip/:id/drive?recurrence=[value]
    * @param id the id of the trip
    */
  def driveTrip(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.driveTrip(id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/flexible?recurrence=[value]
    * @param id the id of the trip
    */
  def flexibleTrip(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.flexibleTrip(id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/trip/:id
    * @param id the id of the trip to get
    */
  def getTrip(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      api.getTrip(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/trip/:id/match?matchedHasRoute=[value]&matchedHasDriver=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    * @param id The id The id of the trip to search for matches for
    */
  def getTripMatches(id: Long): Action[AnyContent] = Action { request =>
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
        
      api.getTripMatches(id, sortField, descending, start, limit, activeOnly, matchedHasRoute, matchedHasDriver)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/match/process?startDate=[value]&endDate=[value]&tripId=[value]
    */
  def processTripMatches(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tripId = request.getQueryString("tripId")
        .map(value => value.toLong)
        
      api.processTripMatches(startDate, endDate, tripId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/ride?recurrence=[value]
    * @param id the id of the trip
    */
  def ride(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val recurrence = request.getQueryString("recurrence")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recurrence", "query string")
        }
        
      api.ride(id, recurrence)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/trip?accountId=[value]&startDate=[value]&endDate=[value]&hasNotifications=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def search(): Action[AnyContent] = Action { request =>
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
        
      api.search(accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, hasNotifications)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/trip/match?accountId=[value]&startDate=[value]&endDate=[value]&matchedHasRoute=[value]&matchedHasDriver=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchTrips(): Action[AnyContent] = Action { request =>
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
        
      api.searchTrips(accountId, sortField, descending, start, limit, activeOnly, startDate, endDate, matchedHasRoute, matchedHasDriver)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/locations
    * @param id the id of the trip to update locations for
    */
  def updateLocations(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateLocations(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/locations/recurrence
    * @param id the id of the trip
    */
  def updateRecurrenceLocations(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateRecurrenceLocations(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/shipments/recurrence
    * @param id the id of the trip
    */
  def updateRecurrenceShipments(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Trip] = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateRecurrenceShipments(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/:id/shipments
    * @param id the id of the trip shipments to update
    */
  def updateShipments(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateShipments(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/trip/:id
    * @param id the id of the trip to update
    */
  def updateTrip(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val body = request.body.asJson.map(_.as[Trip])
      api.updateTrip(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/trip/notifications?id=[value]&notifications=[value]
    */
  def updateTripNotifications(): Action[AnyContent] = Action { request =>
    def executeApi(): Trip = {
      val id = request.getQueryString("id")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("id", "query string")
        }
        
      val notifications = request.getQueryString("notifications")
        
      api.updateTripNotifications(id, notifications)
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
