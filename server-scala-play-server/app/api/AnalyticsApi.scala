package api

import play.api.libs.json._
import model.BigDecimal
import model.ChartData
import model.SirqulResponse
import model.UserActivityResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AnalyticsApi {
  /**
    * Get User Activity
    * Get an activity feed by user.
    * @param start The start of the pagination
    * @param limit The limit of the pagination
    * @param accountId the account id of the user
    */
  def activities(version: BigDecimal, start: Int, limit: Int, accountId: Long): List[UserActivityResponse]

  /**
    * Get Aggregated Filtered Usage
    * Query analytics to get data used for nested graphs and charts
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param applicationId This parameter is deprecated.
    * @param appKey The application key used to filter results by application
    * @param startDate Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    * @param endDate Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    * @param deviceType The device type to filter results by (performs a LIKE search)
    * @param device The device to filter results by (performs a LIKE search)
    * @param deviceOS The device OS to filter results by (performs a LIKE search)
    * @param gender The gender to filter results by {MALE, FEMALE}
    * @param ageGroup Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    * @param country The country to filter results by (performs a wild-card search)
    * @param state The state to filter results by (performs a wild-card search)
    * @param city The city to filter results by (performs a wild-card search)
    * @param zip The zip to filter results by (performs a wild-card search)
    * @param model The model to filter results by (performs a wild-card search)
    * @param tag The tag to filter results by (performs a wild-card search)
    * @param userAccountId The account id to filter results for a particular user
    * @param userAccountDisplay The user display to filter results by (performs a wild-card search)
    * @param userAccountUsername The username to filter results by (performs a wild-card search)
    * @param groupByRoot Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    * @param groupBy Determines how to group the nested data. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    * @param distinctCount Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, NEW_ACCOUNT}
    * @param sortField Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    * @param descending Determines whether to return results in descending order
    * @param hideUnknown Determines whether to return data that has empty or unknown values
    * @param responseFormat Determines whether to return a JOSN or XML representation of the graph results
    * @param l This parameter is deprecated.
    * @param limit Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def aggregatedFilteredUsage(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], startDate: Option[Long], endDate: Option[Long], deviceType: Option[String], device: Option[String], deviceOS: Option[String], gender: Option[String], ageGroup: Option[String], country: Option[String], state: Option[String], city: Option[String], zip: Option[String], model: Option[String], tag: Option[String], userAccountId: Option[Long], userAccountDisplay: Option[String], userAccountUsername: Option[String], groupByRoot: Option[String], groupBy: Option[String], distinctCount: Option[String], sortField: Option[String], descending: Option[Boolean], hideUnknown: Option[Boolean], responseFormat: Option[String], l: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double]): ChartData

  /**
    * Get Filtered Usage
    * Query analytics to get data used for graphs and charts
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param applicationId This parameter is deprecated.
    * @param appKey The application key used to filter results by application
    * @param startDate Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    * @param endDate Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    * @param deviceType The device type to filter results by (performs a LIKE search)
    * @param device The device to filter results by (performs a LIKE search)
    * @param deviceOS The device OS to filter results by (performs a LIKE search)
    * @param gender The gender to filter results by {MALE, FEMALE}
    * @param ageGroup Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    * @param country The country to filter results by (performs a wild-card search)
    * @param state The state to filter results by (performs a wild-card search)
    * @param city The city to filter results by (performs a wild-card search)
    * @param zip The zip to filter results by (performs a wild-card search)
    * @param model The model to filter results by (performs a wild-card search)
    * @param tag The tag to filter results by (performs a wild-card search)
    * @param userAccountId The account id to filter results for a particular user
    * @param userAccountDisplay The user display to filter results by (performs a wild-card search)
    * @param userAccountUsername The username to filter results by (performs a wild-card search)
    * @param customId The ID for the custom table column
    * @param customType The type defined for the custom table column
    * @param customValue The value for the custom table column
    * @param customValue2 The value for another custom table column
    * @param customLong The value that supports Longs for custom table column
    * @param customLong2 The value that supports Longs for custom table column
    * @param customMessage The message for the custom table column
    * @param customMessage2 The message for the custom table column
    * @param groupBy Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    * @param distinctCount Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    * @param sumColumn sum of the column values
    * @param sortField Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    * @param descending Determines whether to return results in descending order
    * @param hideUnknown Determines whether to return data that has empty or unknown values
    * @param responseFormat Determines whether to return a JOSN or XML representation of the graph results
    * @param l This parameter is deprecated.
    * @param limit Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def filteredUsage(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], startDate: Option[Long], endDate: Option[Long], deviceType: Option[String], device: Option[String], deviceOS: Option[String], gender: Option[String], ageGroup: Option[String], country: Option[String], state: Option[String], city: Option[String], zip: Option[String], model: Option[String], tag: Option[String], userAccountId: Option[Long], userAccountDisplay: Option[String], userAccountUsername: Option[String], customId: Option[Long], customType: Option[String], customValue: Option[Double], customValue2: Option[Double], customLong: Option[Long], customLong2: Option[Long], customMessage: Option[String], customMessage2: Option[String], groupBy: Option[String], distinctCount: Option[String], sumColumn: Option[String], sortField: Option[String], descending: Option[Boolean], hideUnknown: Option[Boolean], responseFormat: Option[String], l: Option[Int], limit: Option[Int], latitude: Option[Double], longitude: Option[Double]): ChartData

  /**
    * Create Usage Record
    * Record an analytic record for a known state within the application.
    * @param tag The tag to apply: the name of the action or thing being logged.
    * @param deviceId The client deviceID
    * @param accountId The logged in user ID
    * @param applicationId This parameter is deprecated. This is deprecated, use appKey.
    * @param appKey The application key unique to each application.
    * @param appVersion The current build version of the application
    * @param device The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    * @param deviceType The type of device (Handheld or Desktop)
    * @param deviceOS The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc)
    * @param model The model of the device (iPhone5,1 , Nexus One, etc.)
    * @param latitude The current position of the user
    * @param longitude The current position of the user
    * @param customId A customId used to associate the usage record with some other record in the system
    * @param customType The type of record the customId is recorded for
    * @param achievementIncrement This parameter is deprecated. This is deprecated, use \&quot;customValue\&quot;. Determines how many achievement points and/or ranking points the user gets if this analytic is associated with an achievement
    * @param city The current city of the user
    * @param state The current state of the user
    * @param country The current country of the user
    * @param zip The current zip of the user
    * @param locationDescription The general description of the user&#39;s location
    * @param clientTime Timestamp sent from device
    * @param errorMessage This parameter is deprecated.
    * @param ip the ip address of the client device
    * @param userAgent this is a description of the client (might contain the device&#39;s OS, browser version etc - its a common term)
    * @param backgroundEvent This is deprecated.
    * @param customMessage a custom message for the usage record
    * @param customMessage2 a custom message for the usage record
    * @param customValue a custom value for the usage record
    * @param customValue2 a custom value for the usage record
    * @param customLong a custom long value for the usage record
    * @param customLong2 a custom long value for the usage record
    */
  def usage(version: BigDecimal, tag: String, deviceId: Option[String], accountId: Option[Long], applicationId: Option[Long], appKey: Option[String], appVersion: Option[String], device: Option[String], deviceType: Option[String], deviceOS: Option[String], model: Option[String], latitude: Option[Double], longitude: Option[Double], customId: Option[Long], customType: Option[String], achievementIncrement: Option[Long], city: Option[String], state: Option[String], country: Option[String], zip: Option[String], locationDescription: Option[String], clientTime: Option[Long], errorMessage: Option[String], ip: Option[String], userAgent: Option[String], backgroundEvent: Option[Boolean], customMessage: Option[String], customMessage2: Option[String], customValue: Option[Double], customValue2: Option[Double], customLong: Option[Long], customLong2: Option[Long]): SirqulResponse

  /**
    * Create Multiple Usage Records
    * Sends multiple analytics. Can be used to send in the user&#39;s stored usage when they did not have internet access. Should not include more than 100 items per batch.
    * @param appKey The application key unique to each application.
    * @param device The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    * @param data The analytic data AnalyticListResponse
    * @param deviceId The unique id of the device making the request
    * @param accountId The account ID of the logged in user making the request
    * @param appVersion The current build version of the application
    * @param deviceType The type of device (Handheld or Desktop)
    * @param deviceOS The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc.)
    * @param model The model of the device (iPhone5,1 , Nexus One, etc.)
    * @param updateRanking Will create a leaderboard if one does not exist for the \&quot;tag\&quot; yet
    * @param returnSummaryResponse Returns a summary response of the achievements that have been completed due to the analytics
    */
  def usageBatch(version: BigDecimal, appKey: String, device: String, data: String, deviceId: Option[String], accountId: Option[Long], appVersion: Option[String], deviceType: Option[String], deviceOS: Option[String], model: Option[String], updateRanking: Option[Boolean], returnSummaryResponse: Option[Boolean]): SirqulResponse
}
