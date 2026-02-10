package api

import model.BigDecimal
import model.RegionResponse

/**
  * Provides a default implementation for [[RegionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RegionApiImpl extends RegionApi {
  /**
    * @inheritdoc
    */
  override def createRegion(version: BigDecimal, accountId: Long, regionClass: String, shortName: String, fullName: Option[String], parentIds: Option[String], childrenIds: Option[String], postalCodeIds: Option[String], locations: Option[String], retailerLocationId: Option[Long], visibility: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Long], end: Option[Long], polygon: Option[String], metaData: Option[String], latitude: Option[Double], longitude: Option[Double], versionCode: Option[Int], root: Option[Boolean], active: Option[Boolean]): RegionResponse = {
    // TODO: Implement better logic

    RegionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRegion(version: BigDecimal, accountId: Long, regionId: Long): RegionResponse = {
    // TODO: Implement better logic

    RegionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRegion(version: BigDecimal, regionId: Long, accountId: Option[Long]): RegionResponse = {
    // TODO: Implement better logic

    RegionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchRegions(version: BigDecimal, accountId: Option[Long], query: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double], range: Option[Double], regionClass: Option[String], visibility: Option[String], searchMode: Option[String], sortField: Option[String], descending: Option[Boolean], includeParent: Option[Boolean], includeChildren: Option[Boolean], includePostalCodes: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], versionCode: Option[Int], activeOnly: Option[Boolean], showDeleted: Option[Boolean], lastUpdatedSince: Option[Long], start: Option[Int], limit: Option[Int]): List[RegionResponse] = {
    // TODO: Implement better logic

    List.empty[RegionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateRegion(version: BigDecimal, accountId: Long, regionId: Long, regionClass: Option[String], shortName: Option[String], fullName: Option[String], parentIds: Option[String], childrenIds: Option[String], postalCodeIds: Option[String], locations: Option[String], retailerLocationId: Option[Long], visibility: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Long], end: Option[Long], polygon: Option[String], metaData: Option[String], latitude: Option[Double], longitude: Option[Double], versionCode: Option[Int], root: Option[Boolean], active: Option[Boolean], clearLists: Option[Boolean]): RegionResponse = {
    // TODO: Implement better logic

    RegionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
