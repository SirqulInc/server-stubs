package api

import play.api.libs.json._
import model.AchievementProgressResponse
import model.AchievementResponse
import model.AchievementShortResponse
import model.AchievementTierResponse
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AchievementApi {
  /**
    * Searches an Achievement Tier
    * Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param appKey the application key
    * @param keyword the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)
    * @param achievementType filter results by achievementType (these are exact case sensitive matches)
    * @param rankType filter results by the rankType (these are the exact case sensitive matches)
    * @param sortField the field to sort by. See {@link AchievementApiMap}
    * @param descending determines whether the sort list is in descending or ascending order (of the achievement)
    * @param descendingGoal determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)
    * @param start The start of the index for pagination
    * @param limit the limit for pagination (has a hard limit of 1000)
    */
  def apiVersionAchievementTierSearchPost(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], achievementType: Option[Long], rankType: Option[String], sortField: Option[String], descending: Option[Boolean], descendingGoal: Option[Boolean], start: Option[Long], limit: Option[Long]): AchievementTierResponse

  /**
    * Create Achievement
    * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param appKey the application key the achievement is for
    * @param title the title of the achievement (255 character limit)
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param analyticsTag the analytics tag that will trigger when a user&#39;s achievement count gets updated
    * @param description the description of the achievement
    * @param rankType the rank type for updating leader boards
    * @param rankIncrement determines how much the rank count is incremented
    * @param minIncrement restrict scores to be above or equal to this minimum value
    * @param maxIncrement restrict scores to be below or equal to this maximum value
    * @param validate determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    * @param active achievement is active or inactive
    * @param triggerDefinition if provided will define what triggers to run after a tier is completed
    */
  def createAchievement(version: BigDecimal, appKey: String, title: String, deviceId: Option[String], accountId: Option[Long], analyticsTag: Option[String], description: Option[String], rankType: Option[String], rankIncrement: Option[Int], minIncrement: Option[Int], maxIncrement: Option[Int], validate: Option[Boolean], active: Option[Boolean], triggerDefinition: Option[String]): AchievementResponse

  /**
    * Create Achievement Tier
    * Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param achievementId the achievement id for adding a new tier
    * @param scoreAllInstances score all instances
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param icon achievement tier icon image file
    * @param iconAssetId the icon assetId, if icon is provided, icon will overrule
    * @param title the title of the achievement tier
    * @param description the description of the achievement tier
    * @param goalCount the count requirement for completing the achievement tier
    * @param missionId The ID of the mission to associate with the achievement
    * @param gameId The ID of the game to associate with the achievement
    * @param packId The ID of the pack to associate with the achievement
    * @param gameLevelId The ID of the game level to associate with the achievement
    * @param gameObjectId The ID of the game object to associate with the achievement
    */
  def createAchievementTier(version: BigDecimal, achievementId: Long, scoreAllInstances: Boolean, deviceId: Option[String], accountId: Option[Long], icon: Option[TemporaryFile], iconAssetId: Option[Long], title: Option[String], description: Option[String], goalCount: Option[Long], missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Int]): AchievementTierResponse

  /**
    * Delete Achievement
    * Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.
    * @param achievementId The ID of the achievement
    * @param accountId the account id of the user (deviceId or accountId required)
    */
  def deleteAchievement(version: BigDecimal, achievementId: Long, accountId: Option[Long]): SirqulResponse

  /**
    * Delete Achievement Tier
    * Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.
    * @param achievementTierId the achievement id for deletion
    * @param accountId the account id of the user (deviceId or accountId required).
    */
  def deleteAchievementTier(version: BigDecimal, achievementTierId: Long, accountId: Option[Long]): SirqulResponse

  /**
    * Get Achievement
    * Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param achievementId The ID of the achievement
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param achievementType achievementType
    */
  def getAchievement(version: BigDecimal, achievementId: Long, deviceId: Option[String], accountId: Option[Long], achievementType: Option[String]): AchievementTierResponse

  /**
    * Gets an achievement tier
    * Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param achievementTierId the achievement tier id that is being retrieved
    */
  def getAchievementTier(version: BigDecimal, accountId: Long, achievementTierId: Long): AchievementTierResponse

  /**
    * Get Achievement Progress
    * Gets a list of user achievements.
    * @param returnNulls determines whether to return null fields in the response
    * @param appKey the application key for filtering results by application
    * @param includeUndiscovered determines whether to return achievements that the user has not discovered yet
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionAccountEmail the email of the account to view achievements
    * @param connectionAccountId the id of the account to view achievements
    * @param rankType filter results by achievement rankType
    * @param achievementType filter results by achievement type
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def getUserAchievements(version: BigDecimal, returnNulls: Boolean, appKey: String, includeUndiscovered: Boolean, deviceId: Option[String], accountId: Option[Long], connectionAccountEmail: Option[String], connectionAccountId: Option[Long], rankType: Option[String], achievementType: Option[String], latitude: Option[Double], longitude: Option[Double]): List[AchievementProgressResponse]

  /**
    * List Achievement Tags
    * List achievement tags by application
    * @param appKey filter results by application key
    */
  def listAchievementTags(version: BigDecimal, appKey: Option[String]): SirqulResponse

  /**
    * List Achievements
    * List achievements by billable.
    * @param sortField the field to sort by. See AchievementApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param start the start index for pagination
    * @param limit the limit for pagination (has a hard limit of 1000)
    * @param activeOnly Filter results to only return active achievements
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param appKey the application key
    * @param keyword the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    * @param achievementType filter results by the achievementType (these are exact case sensitive matches)
    * @param rankType filter results by the rankType (these are exact case sensitive matches)
    */
  def listAchievements(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], achievementType: Option[String], rankType: Option[String]): List[AchievementShortResponse]

  /**
    * Search Achievements
    * Searches achievements by application for consumers.
    * @param appKey the application key
    * @param sortField the field to sort by. See AchievementApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param includeTiers return tiers, only applicable for version &gt;3.18
    * @param includeInactiveTiers return inactive tiers, only applicable when includeTiers is true, only applicable for version &gt;3.18
    * @param start the start index for pagination
    * @param limit the limit for pagination (has a hard limit of 1000)
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param keyword the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    * @param achievementType filter results by the achievementType (these are exact case sensitive matches)
    * @param rankType filter results by the rankType (these are exact case sensitive matches)
    */
  def searchAchievements(version: BigDecimal, appKey: String, sortField: String, descending: Boolean, includeTiers: Boolean, includeInactiveTiers: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], achievementType: Option[String], rankType: Option[String]): List[AchievementShortResponse]

  /**
    * Update Achievement
    * Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param achievementId the achievement ID for updating an existing achievement
    * @param analyticsTag the analytics tag that will trigger when a user&#39;s achievement count gets updated
    * @param title the title of the achievement (255 character limit)
    * @param description the description of the achievement
    * @param rankType the rank type for updating leader boards
    * @param rankIncrement determines how much the rank count is incremented
    * @param minIncrement restrict scores to be above or equal to this minimum value
    * @param nullMinIncrement enable to ignore usage of minIncrement
    * @param maxIncrement restrict scores to be below or equal to this maximum value
    * @param nullMaxIncrement enable to ignore usage of maxIncrement
    * @param validate determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    * @param active if it&#39;s active or inactive
    * @param triggerDefinition if provided will define what triggers to run after a tier is completed
    */
  def updateAchievement(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], achievementId: Option[Long], analyticsTag: Option[String], title: Option[String], description: Option[String], rankType: Option[String], rankIncrement: Option[Int], minIncrement: Option[Int], nullMinIncrement: Option[Boolean], maxIncrement: Option[Int], nullMaxIncrement: Option[Boolean], validate: Option[Boolean], active: Option[Boolean], triggerDefinition: Option[String]): AchievementResponse

  /**
    * Update Achievement Tier
    * Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.
    * @param achievementTierId the achievement tier id for updating
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param icon achievement tier icon image file
    * @param iconAssetId the icon assetId, if icon is provided, icon will overrule
    * @param title the title of the achievement tier
    * @param description the description of the achievement tier
    * @param goalCount the count requirement for completing the achievement tier
    * @param missionId The ID of the mission to associate with the achievement
    * @param gameId The ID of the game to associate with the achievement
    * @param packId The ID of the pack to associate with the achievement
    * @param gameLevelId The ID of the game level to associate with the achievement
    * @param gameObjectId The ID of the game object to associate with the achievement
    * @param scoreAllInstances score all instances
    */
  def updateAchievementTier(version: BigDecimal, achievementTierId: Long, deviceId: Option[String], accountId: Option[Long], icon: Option[TemporaryFile], iconAssetId: Option[Long], title: Option[String], description: Option[String], goalCount: Option[Long], missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], scoreAllInstances: Option[Boolean]): AchievementTierResponse

  /**
    * Update Achievement Progress
    * Update user achievement progress.
    * @param accountId the account id of the user
    * @param achievementId the achievement id (achievementId or tag required)
    * @param tag the analytic tag to identify an achievement (achievementId or tag required)
    * @param customId a custom identifier used for validation
    * @param increment the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement&#39;s rankIncrement value)
    * @param startDate a custom start date that the client can set (not yet used in server logic)
    * @param endDate a custom end date that the client can set (not yet used in server logic)
    * @param returnProgress determines whether to return the achievement progress response
    */
  def updateUserAchievement(version: BigDecimal, accountId: Long, achievementId: Option[Long], tag: Option[String], customId: Option[Long], increment: Option[Long], startDate: Option[Long], endDate: Option[Long], returnProgress: Option[Boolean]): SirqulResponse
}
