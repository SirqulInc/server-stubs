package api

import model.AgeGroupResponse
import model.AudienceDeviceResponse
import model.AudienceResponse
import model.BigDecimal
import model.OfferListResponse
import model.SearchResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[AudienceApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AudienceApiImpl extends AudienceApi {
  /**
    * @inheritdoc
    */
  override def createAudience(version: BigDecimal, accountId: Long, name: String, description: Option[String], searchTags: Option[String], gender: Option[String], ageGroups: Option[String], categoryIds: Option[String], applicationIds: Option[String], gameExperienceLevel: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String], startTimeOffset: Option[Int], endTimeOffset: Option[Int], sendSuggestion: Option[Boolean], associateDescription: Option[String], associateType: Option[String], associateId: Option[Long], groupingId: Option[String], metaData: Option[String], visibility: Option[String], audienceType: Option[String], useOrder: Option[Boolean], cohortRegionsData: Option[String], appKey: Option[String], trilaterationTypes: Option[String], uniqueName: Option[Boolean]): AudienceResponse = {
    // TODO: Implement better logic

    AudienceResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteAudience(version: BigDecimal, accountId: Long, audienceId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAgeGroups(version: BigDecimal): List[AgeGroupResponse] = {
    // TODO: Implement better logic

    List.empty[AgeGroupResponse]
  }

  /**
    * @inheritdoc
    */
  override def getAudience(version: BigDecimal, accountId: Long, audienceId: Long, appKey: Option[String], returnAccountCount: Option[Boolean], returnAlbumCount: Option[Boolean], albumTypesForCount: Option[String]): AudienceResponse = {
    // TODO: Implement better logic

    AudienceResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAudienceList(version: BigDecimal, accountId: Option[Long], albumIds: Option[String], keyword: Option[String], keywordFields: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], sendSuggestion: Option[Boolean], activeOnly: Option[Boolean], groupByGroupingId: Option[Boolean], appKey: Option[String], returnGlobal: Option[Boolean], exactKeyword: Option[Boolean], audienceType: Option[String], audienceTypes: Option[String], returnAccountCount: Option[Boolean], returnAlbumCount: Option[Boolean], albumTypesForCount: Option[String]): List[SearchResponse] = {
    // TODO: Implement better logic

    List.empty[SearchResponse]
  }

  /**
    * @inheritdoc
    */
  override def getDevices(version: BigDecimal, includeInactive: Boolean): List[AudienceDeviceResponse] = {
    // TODO: Implement better logic

    List.empty[AudienceDeviceResponse]
  }

  /**
    * @inheritdoc
    */
  override def getExperiences(version: BigDecimal): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getGroupedAudiences(version: BigDecimal, accountId: Long, audienceGroupingId: String): AudienceResponse = {
    // TODO: Implement better logic

    AudienceResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listByAccount(version: BigDecimal, accountId: Long, limit: Int, suggestionType: String): OfferListResponse = {
    // TODO: Implement better logic

    OfferListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listByAudience(version: BigDecimal, limit: Int, gender: Option[String], age: Option[Int], categoryIds: Option[String], latitude: Option[Double], longitude: Option[Double]): OfferListResponse = {
    // TODO: Implement better logic

    OfferListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def listLastestByAccount(version: BigDecimal, accountId: Long, timeframe: Int, suggestionType: String): OfferListResponse = {
    // TODO: Implement better logic

    OfferListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def sendByAccount(version: BigDecimal, accountId: Long, latitude: Double, longitude: Double): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateAudience(version: BigDecimal, accountId: Long, audienceId: Long, name: Option[String], description: Option[String], searchTags: Option[String], gender: Option[String], ageGroups: Option[String], categoryIds: Option[String], applicationIds: Option[String], gameExperienceLevel: Option[String], devices: Option[String], deviceIds: Option[String], deviceVersions: Option[String], locations: Option[String], radius: Option[String], active: Option[Boolean], sendSuggestion: Option[Boolean], startTimeOffset: Option[Int], endTimeOffset: Option[Int], associateDescription: Option[String], associateType: Option[String], associateId: Option[Long], groupingId: Option[String], metaData: Option[String], visibility: Option[String], audienceType: Option[String], useOrder: Option[Boolean], cohortRegionsData: Option[String], appKey: Option[String], trilaterationTypes: Option[String], uniqueName: Option[Boolean]): AudienceResponse = {
    // TODO: Implement better logic

    AudienceResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
