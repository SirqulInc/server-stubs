package api

import play.api.libs.json._
import model.AccountMiniResponse
import model.BigDecimal
import model.Leg
import model.LegResponse
import model.PredictedLocationResponse
import model.PreferredLocationResponse
import model.SirqulResponse
import model.StepResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TrackingApi {
  /**
    * Create Batch Tracking
    * Batch create tracking legs
    * @param data JSON array of tracking legs &#x60;&#x60;&#x60;json [   \&quot;distance\&quot;: \&quot;0.08\&quot;,   \&quot;duration\&quot;: \&quot;10000\&quot;,   \&quot;startLatitude\&quot;: \&quot;47.614603\&quot;,   \&quot;startLongitude\&quot;: \&quot;-122.350518\&quot;,   \&quot;endLatitude\&quot;: \&quot;47.614384\&quot;,   \&quot;endLongitude\&quot;: \&quot;-122.349161\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endDate\&quot;: \&quot;1361924020000\&quot;,   \&quot;steps\&quot;: [     {       \&quot;distance\&quot;: \&quot;0.03\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614603\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,       \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614941\&quot;,       \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;endDate\&quot;: \&quot;1361924015000\&quot;     },{       \&quot;distance\&quot;: \&quot;0.05\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614941\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;startDate\&quot;: \&quot;1361924015000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614384\&quot;,       \&quot;endLng\&quot;: \&quot;-122.349161\&quot;,       \&quot;endDate\&quot;: \&quot;1361924020000\&quot;     }   ] ] &#x60;&#x60;&#x60; 
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param generateAccounts Whether to generate accounts for tracking entries when the owner does not exist
    * @param updateAccountLocations Whether to update the account&#39;s current location from the incoming tracking data
    * @param defaultTag The default tag to apply to incoming legs when no tag is provided
    * @param slaveUID 
    */
  def batchSaveTracking(version: BigDecimal, data: String, deviceId: Option[String], accountId: Option[Long], generateAccounts: Option[Boolean], updateAccountLocations: Option[Boolean], defaultTag: Option[String], slaveUID: Option[String]): List[Leg]

  /**
    * Get Predicted Locations
    * Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.
    * @param accountId The account id of the customer
    * @param latitude latitude to return a more likely result set based on the user&#39;s current location
    * @param longitude longitude to return a more likely result set based on the user&#39;s current location
    * @param dateCheck Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, the current date will be used.
    * @param hourCheck Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    * @param threshold The minimum number matches in 1 hour to be considered a likely location.
    * @param distanceUnit Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    * @param searchRange Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    * @param sortOrder The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}
    */
  def getPredictedLocations(version: BigDecimal, accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], threshold: Option[Long], distanceUnit: Option[String], searchRange: Option[Double], sortOrder: Option[String]): PredictedLocationResponse

  /**
    * Get Tracking Path
    * Get the path (lat/long coordinates) between 2 steps previously logged for a customer.
    * @param accountId The account id of the customer
    * @param startStepId The stepId to begin from
    * @param endStepId The stepId to end with
    */
  def getPredictedPath(version: BigDecimal, accountId: Long, startStepId: Long, endStepId: Long): List[StepResponse]

  /**
    * Search Preferred Locations
    * Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.
    * @param accountId The account id of the customer
    * @param latitude latitude to return a more likely result set based on the user&#39;s current location
    * @param longitude longitude to return a more likely result set based on the user&#39;s current location
    * @param dateCheck Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.
    * @param hourCheck Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    * @param sortField Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param searchRange Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    * @param distanceUnit Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    */
  def getPreferredLocations(version: BigDecimal, accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], searchRange: Option[Double], distanceUnit: Option[String]): List[PreferredLocationResponse]

  /**
    * Search Tracking
    * Retrieve tracking data to be able to show where a user has been.
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param ownerId the account id of the person the user wants to tracking data for
    * @param trackingDeviceId the id of the tracking device
    * @param startDate the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.
    * @param endDate the end date in (UTC milliseconds) to filter the tracking results
    * @param tags filter results by tag
    * @param getLastPoint gets the last known location of the user
    */
  def getTrackingLegs(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], ownerId: Option[Long], trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], getLastPoint: Option[Boolean]): List[LegResponse]

  /**
    * Create Tracking Leg
    * Send tracking points to be able to generate pathing data
    * @param startLat the latitude of the first point
    * @param startLng the longitude of the first point
    * @param startDate the start date (in UTC milliseconds) of the first point
    * @param endLat the latitude of the last point
    * @param endLng the longitude of the last point
    * @param endDate the end date (in UTC milliseconds) of the last point
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param distance the total distance
    * @param duration the total duration
    * @param steps JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. &#x60;&#x60;&#x60;json [{   \&quot;distance\&quot;: \&quot;0.03\&quot;,   \&quot;duration\&quot;: \&quot;5000\&quot;,   \&quot;startLat\&quot;: \&quot;47.614603\&quot;,   \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endLat\&quot;: \&quot;47.614941\&quot;,   \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,   \&quot;endDate\&quot;: \&quot;1361924015000\&quot; }] &#x60;&#x60;&#x60; 
    * @param tags name the leg for searching
    */
  def saveTrackingLeg(version: BigDecimal, startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long], steps: Option[String], tags: Option[String]): SirqulResponse

  /**
    * Create Tracking Step
    * Send tracking points to be able to generate pathing data
    * @param legId the leg to add the step to
    * @param startLat the latitude of the first point
    * @param startLng the longitude of the first point
    * @param startDate the start date (in UTC milliseconds) of the first point
    * @param endLat the latitude of the last point
    * @param endLng the longitude of the last point
    * @param endDate the end date (in UTC milliseconds) of the last point
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param distance the total distance
    * @param duration the total duration
    */
  def saveTrackingStep(version: BigDecimal, legId: Long, startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long]): SirqulResponse

  /**
    * List Tracking
    * Search for all accounts that have tracking legs data by the given constraints.
    * @param accountId The account id of the user
    * @param keyword Used for LIKE search of first or last name on the acocunt
    * @param startDate Range to begin in UTC milliseconds
    * @param endDate Range to end in UTC milliseconds
    * @param tags Exact match on tag field of Legs&#39;s searchTag
    * @param audienceIds 
    * @param latitude Origin latitude to perform searching constraints with given range
    * @param longitude Origin longitude to perform searching constraints with given range
    * @param range The radius, in miles, to perform the search for
    * @param sortField The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}
    * @param descending The order to return the results. Default is false, which will return the results in ascending order.
    * @param start The index into the record set to start with. Default is 0.
    * @param limit The total number of records to return. Default is 20.
    * @param activeOnly Determines whether to return only active results. Default is false.
    */
  def searchAccountsWithTrackingLegs(version: BigDecimal, accountId: Long, keyword: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], audienceIds: Option[String], latitude: Option[Double], longitude: Option[Double], range: Option[Double], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[AccountMiniResponse]

  /**
    * Search Tracking (Billable)
    * Retrieve tracking data for billable/account scoped queries.
    * @param accountId The account id to search tracking for
    * @param appKey The application key
    * @param trackingDeviceId The id of the tracking device
    * @param startDate The start date in (UTC milliseconds) to filter the tracking results
    * @param endDate The end date in (UTC milliseconds) to filter the tracking results
    * @param tags Filter results by tag
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def searchTrackingLegs(version: BigDecimal, accountId: Long, appKey: String, trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], start: Option[Int], limit: Option[Int]): List[LegResponse]
}
