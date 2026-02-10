package api

import play.api.libs.json._
import model.AgeGroupResponse
import model.AudienceDeviceResponse
import model.AudienceResponse
import model.BigDecimal
import model.OfferListResponse
import model.SearchResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AudienceApi {
  /**
    * Create Audience
    * Create a user defined audience.
    * @param accountId The logged in user.
    * @param name The name of the audience
    * @param description The description of the audience
    * @param searchTags The search tags
    * @param gender The gender; possible values are: MALE, FEMALE, ANY
    * @param ageGroups The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    * @param categoryIds The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    * @param applicationIds The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    * @param gameExperienceLevel The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    * @param devices (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    * @param deviceIds The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    * @param deviceVersions The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    * @param locations The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    * @param radius The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    * @param startTimeOffset Seconds from the start time of an event
    * @param endTimeOffset Seconds from the end time of an event
    * @param sendSuggestion If true, then notify matching users when they are inside the radius
    * @param associateDescription The description of the associated object
    * @param associateType The type of the object to center the audience geofence
    * @param associateId The ID of the object to center the audience geofence
    * @param groupingId Optional grouping id for the audience
    * @param metaData External custom client defined data
    * @param visibility Visibility of the audience
    * @param audienceType Type of audience
    * @param useOrder Use order for cohort
    * @param cohortRegionsData Cohort data for \&quot;cohort\&quot; audience type
    * @param appKey Filter results by application key
    * @param trilaterationTypes Trilateration types
    * @param uniqueName If true, makes sure the audience name is unique
    */
  def createAudience(version: BigDecimal, accountId: Long, name: String, description: Option[String], searchTags: Option[String], gender: Option[String], ageGroups: Option[String], categoryIds: Option[String], applicationIds: Option[String], gameExperienceLevel: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String], startTimeOffset: Option[Int], endTimeOffset: Option[Int], sendSuggestion: Option[Boolean], associateDescription: Option[String], associateType: Option[String], associateId: Option[Long], groupingId: Option[String], metaData: Option[String], visibility: Option[String], audienceType: Option[String], useOrder: Option[Boolean], cohortRegionsData: Option[String], appKey: Option[String], trilaterationTypes: Option[String], uniqueName: Option[Boolean]): AudienceResponse

  /**
    * Delete Audience
    * Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.
    * @param accountId The logged in user.
    * @param audienceId The id of the audience to delete.
    */
  def deleteAudience(version: BigDecimal, accountId: Long, audienceId: Long): SirqulResponse

  /**
    * Get Age Groups
    * Gets the list of available age groups that can be selected by consumers and retailers targeting offers.
    */
  def getAgeGroups(version: BigDecimal): List[AgeGroupResponse]

  /**
    * Get Audience
    * Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.
    * @param accountId The logged in user.
    * @param audienceId The id of the audience to return.
    * @param appKey The application key (optional). If provided, results may be scoped to this application.
    * @param returnAccountCount (boolean) set to true to include the accountCount associated with current audience of the current app
    * @param returnAlbumCount (boolean) set to true to include the albumCount associated with current audience of the current app
    * @param albumTypesForCount (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    */
  def getAudience(version: BigDecimal, accountId: Long, audienceId: Long, appKey: Option[String], returnAccountCount: Option[Boolean], returnAlbumCount: Option[Boolean], albumTypesForCount: Option[String]): AudienceResponse

  /**
    * Search Audiences
    * Get the list audiences owned by the account
    * @param accountId The logged in user.
    * @param albumIds Comma separated list of album IDs to filter results with
    * @param keyword The keyword used to search
    * @param keywordFields Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY
    * @param sortField The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}
    * @param descending The order to return the results. Default is false, which will return the results in ascending order.
    * @param start The index into the record set to start with.
    * @param limit The total number of record to return (there is a hard limit of 100).
    * @param sendSuggestion Filter results based on whether or not the audience is set to send suggestions
    * @param activeOnly Determines whether to return only active results. Default is false.
    * @param groupByGroupingId Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)
    * @param appKey Filter results by application key
    * @param returnGlobal If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well
    * @param exactKeyword If true, match keyword exactly
    * @param audienceType (Deprecated) Filter results by audience type
    * @param audienceTypes comma separated string with the different audience types you want to filter for
    * @param returnAccountCount (boolean) set to true to include the accountCount associated with current audience of the current app
    * @param returnAlbumCount (boolean) set to true to include the albumCount associated with current audience of the current app
    * @param albumTypesForCount (String) comma separated list, return an array with each item is the count of each album type. If not provided, \&quot;all_types\&quot; count is returned.
    */
  def getAudienceList(version: BigDecimal, accountId: Option[Long], albumIds: Option[String], keyword: Option[String], keywordFields: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], sendSuggestion: Option[Boolean], activeOnly: Option[Boolean], groupByGroupingId: Option[Boolean], appKey: Option[String], returnGlobal: Option[Boolean], exactKeyword: Option[Boolean], audienceType: Option[String], audienceTypes: Option[String], returnAccountCount: Option[Boolean], returnAlbumCount: Option[Boolean], albumTypesForCount: Option[String]): List[SearchResponse]

  /**
    * Get Devices
    * Gets the list of available devices that can be selected by consumers and retailers.
    * @param includeInactive If true return inactive record as well. default is false.
    */
  def getDevices(version: BigDecimal, includeInactive: Boolean): List[AudienceDeviceResponse]

  /**
    * Get Experiences
    * Gets the list of available experiences that can be selected by consumers and retailers.
    */
  def getExperiences(version: BigDecimal): SirqulResponse

  /**
    * Get GroupedAudiences
    * Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.
    * @param accountId The logged in user.
    * @param audienceGroupingId The audience grouping id to return.
    */
  def getGroupedAudiences(version: BigDecimal, accountId: Long, audienceGroupingId: String): AudienceResponse

  /**
    * List Suggestions by Audience
    * List either Missions or Offers that the user matches the assigned audience.
    * @param accountId The account to match offers for.
    * @param limit the limit of the index
    * @param suggestionType the type of suggestion
    */
  def listByAccount(version: BigDecimal, accountId: Long, limit: Int, suggestionType: String): OfferListResponse

  /**
    * List Offers by Audience
    * Get a list of offer locations based on audience information provided.
    * @param limit this is the limit of the index
    * @param gender this is the gender to list offers by
    * @param age this is the age to list offers by
    * @param categoryIds this is the category IDs to list offers by
    * @param latitude this is the latitude to list offers by
    * @param longitude this is the longitude to list offers by
    */
  def listByAudience(version: BigDecimal, limit: Int, gender: Option[String], age: Option[Int], categoryIds: Option[String], latitude: Option[Double], longitude: Option[Double]): OfferListResponse

  /**
    * List Sent Suggestions 
    * Return list of recent trigger suggestions that have been sent to the user.
    * @param accountId The account to match offers for.
    * @param timeframe The timeframe in seconds of the latest suggestions
    * @param suggestionType The type of trigger suggestions to return
    */
  def listLastestByAccount(version: BigDecimal, accountId: Long, timeframe: Int, suggestionType: String): OfferListResponse

  /**
    * Send Suggestions
    * Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.
    * @param accountId The account to match offers for.
    * @param latitude the latitude
    * @param longitude the longitude
    */
  def sendByAccount(version: BigDecimal, accountId: Long, latitude: Double, longitude: Double): SirqulResponse

  /**
    * Update Audience
    * Update a user defined audience.
    * @param accountId The logged in user.
    * @param audienceId The id of the audience to update.
    * @param name The name of the audience
    * @param description The description of the audience
    * @param searchTags The search tags
    * @param gender The gender; possible values are: MALE, FEMALE, ANY
    * @param ageGroups The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)
    * @param categoryIds The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)
    * @param applicationIds The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)
    * @param gameExperienceLevel The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    * @param devices (Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)
    * @param deviceIds The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)
    * @param deviceVersions The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)
    * @param locations The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)
    * @param radius The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.
    * @param active if audience is active
    * @param sendSuggestion If true, then notify matching users when they are inside the radius
    * @param startTimeOffset Seconds from the start time of an event
    * @param endTimeOffset Seconds from the end time of an event
    * @param associateDescription the associate description
    * @param associateType The type of the object to center the audience geofence
    * @param associateId The ID of the object to center the audience geofence
    * @param groupingId Optional grouping id for the audience
    * @param metaData External custom client defined data
    * @param visibility Visibility of the audience
    * @param audienceType Type of audience
    * @param useOrder Use order for cohort
    * @param cohortRegionsData Cohort data for \&quot;cohort\&quot; audience type
    * @param appKey Filter results by application key
    * @param trilaterationTypes Trilateration types
    * @param uniqueName If true, makes sure the audience name is unique
    */
  def updateAudience(version: BigDecimal, accountId: Long, audienceId: Long, name: Option[String], description: Option[String], searchTags: Option[String], gender: Option[String], ageGroups: Option[String], categoryIds: Option[String], applicationIds: Option[String], gameExperienceLevel: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String], active: Option[Boolean], sendSuggestion: Option[Boolean], startTimeOffset: Option[Int], endTimeOffset: Option[Int], associateDescription: Option[String], associateType: Option[String], associateId: Option[Long], groupingId: Option[String], metaData: Option[String], visibility: Option[String], audienceType: Option[String], useOrder: Option[Boolean], cohortRegionsData: Option[String], appKey: Option[String], trilaterationTypes: Option[String], uniqueName: Option[Boolean]): AudienceResponse
}
