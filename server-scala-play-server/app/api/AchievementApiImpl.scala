package api

import model.AchievementProgressResponse
import model.AchievementResponse
import model.AchievementShortResponse
import model.AchievementTierResponse
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[AchievementApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AchievementApiImpl extends AchievementApi {
  /**
    * @inheritdoc
    */
  override def apiVersionAchievementTierSearchPost(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], achievementType: Option[Long], rankType: Option[String], sortField: Option[String], descending: Option[Boolean], descendingGoal: Option[Boolean], start: Option[Long], limit: Option[Long]): AchievementTierResponse = {
    // TODO: Implement better logic

    AchievementTierResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createAchievement(version: BigDecimal, appKey: String, title: String, deviceId: Option[String], accountId: Option[Long], analyticsTag: Option[String], description: Option[String], rankType: Option[String], rankIncrement: Option[Int], minIncrement: Option[Int], maxIncrement: Option[Int], validate: Option[Boolean], active: Option[Boolean], triggerDefinition: Option[String]): AchievementResponse = {
    // TODO: Implement better logic

    AchievementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createAchievementTier(version: BigDecimal, achievementId: Long, scoreAllInstances: Boolean, deviceId: Option[String], accountId: Option[Long], icon: Option[TemporaryFile], iconAssetId: Option[Long], title: Option[String], description: Option[String], goalCount: Option[Long], missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Int]): AchievementTierResponse = {
    // TODO: Implement better logic

    AchievementTierResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteAchievement(version: BigDecimal, achievementId: Long, accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteAchievementTier(version: BigDecimal, achievementTierId: Long, accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAchievement(version: BigDecimal, achievementId: Long, deviceId: Option[String], accountId: Option[Long], achievementType: Option[String]): AchievementTierResponse = {
    // TODO: Implement better logic

    AchievementTierResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAchievementTier(version: BigDecimal, accountId: Long, achievementTierId: Long): AchievementTierResponse = {
    // TODO: Implement better logic

    AchievementTierResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getUserAchievements(version: BigDecimal, returnNulls: Boolean, appKey: String, includeUndiscovered: Boolean, deviceId: Option[String], accountId: Option[Long], connectionAccountEmail: Option[String], connectionAccountId: Option[Long], rankType: Option[String], achievementType: Option[String], latitude: Option[Double], longitude: Option[Double]): List[AchievementProgressResponse] = {
    // TODO: Implement better logic

    List.empty[AchievementProgressResponse]
  }

  /**
    * @inheritdoc
    */
  override def listAchievementTags(version: BigDecimal, appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listAchievements(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], achievementType: Option[String], rankType: Option[String]): List[AchievementShortResponse] = {
    // TODO: Implement better logic

    List.empty[AchievementShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchAchievements(version: BigDecimal, appKey: String, sortField: String, descending: Boolean, includeTiers: Boolean, includeInactiveTiers: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], keyword: Option[String], achievementType: Option[String], rankType: Option[String]): List[AchievementShortResponse] = {
    // TODO: Implement better logic

    List.empty[AchievementShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateAchievement(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], achievementId: Option[Long], analyticsTag: Option[String], title: Option[String], description: Option[String], rankType: Option[String], rankIncrement: Option[Int], minIncrement: Option[Int], nullMinIncrement: Option[Boolean], maxIncrement: Option[Int], nullMaxIncrement: Option[Boolean], validate: Option[Boolean], active: Option[Boolean], triggerDefinition: Option[String]): AchievementResponse = {
    // TODO: Implement better logic

    AchievementResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateAchievementTier(version: BigDecimal, achievementTierId: Long, deviceId: Option[String], accountId: Option[Long], icon: Option[TemporaryFile], iconAssetId: Option[Long], title: Option[String], description: Option[String], goalCount: Option[Long], missionId: Option[Long], gameId: Option[Long], packId: Option[Long], gameLevelId: Option[Long], gameObjectId: Option[Long], scoreAllInstances: Option[Boolean]): AchievementTierResponse = {
    // TODO: Implement better logic

    AchievementTierResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateUserAchievement(version: BigDecimal, accountId: Long, achievementId: Option[Long], tag: Option[String], customId: Option[Long], increment: Option[Long], startDate: Option[Long], endDate: Option[Long], returnProgress: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
