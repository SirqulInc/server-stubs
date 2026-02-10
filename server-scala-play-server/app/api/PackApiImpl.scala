package api

import model.BigDecimal
import model.PackResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[PackApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PackApiImpl extends PackApi {
  /**
    * @inheritdoc
    */
  override def createPack(version: BigDecimal, accountId: Long, title: String, packOrder: Long, price: Int, highest: Boolean, allocateTickets: Boolean, ticketCount: Long, description: Option[String], searchTags: Option[String], active: Option[Boolean], gameType: Option[String], appKey: Option[String], packType: Option[String], sequenceType: Option[String], backgroundId: Option[Long], imageId: Option[Long], startDate: Option[Long], endDate: Option[Long], authorOverride: Option[String], priceType: Option[String], gameLevelIds: Option[String], inGame: Option[Boolean], ticketType: Option[String], points: Option[Long]): PackResponse = {
    // TODO: Implement better logic

    PackResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deletePack(version: BigDecimal, accountId: Long, packId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPack(version: BigDecimal, accountId: Long, packId: Long, includeGameData: Boolean): PackResponse = {
    // TODO: Implement better logic

    PackResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPacks(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, keyword: Option[String], packType: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeInactive: Option[Boolean], appKey: Option[String]): List[PackResponse] = {
    // TODO: Implement better logic

    List.empty[PackResponse]
  }

  /**
    * @inheritdoc
    */
  override def updatePack(version: BigDecimal, accountId: Long, packId: Long, allocateTickets: Boolean, ticketCount: Long, title: Option[String], description: Option[String], searchTags: Option[String], active: Option[Boolean], gameType: Option[String], appKey: Option[String], packType: Option[String], packOrder: Option[Long], sequenceType: Option[String], backgroundId: Option[Long], imageId: Option[Long], startDate: Option[Long], endDate: Option[Long], authorOverride: Option[String], price: Option[Int], priceType: Option[String], gameLevelIds: Option[String], inGame: Option[Boolean], highest: Option[Boolean], ticketType: Option[String], points: Option[Long]): PackResponse = {
    // TODO: Implement better logic

    PackResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
