package api

import model.AccountLoginResponse
import model.BigDecimal
import model.RetailerFullResponse
import model.RetailerResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[RetailerApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RetailerApiImpl extends RetailerApi {
  /**
    * @inheritdoc
    */
  override def createRetailer(version: BigDecimal, name: String, deviceId: Option[String], accountId: Option[Long], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], facebookUrl: Option[String], twitterUrl: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], categoryIdsToAdd: Option[String], categoryIdsToRemove: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], searchTags: Option[String], retailerType: Option[String], visibility: Option[String], createDefaultLocation: Option[Boolean], responseFormat: Option[String]): RetailerFullResponse = {
    // TODO: Implement better logic

    RetailerFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRetailer(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], retailerId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRetailer(version: BigDecimal, retailerId: Long, deviceId: Option[String], accountId: Option[Long], includeCounts: Option[Boolean]): RetailerFullResponse = {
    // TODO: Implement better logic

    RetailerFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRetailers(version: BigDecimal, visibility: String, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], categoryIds: Option[String], filterIds: Option[String], i: Option[Int], l: Option[Int]): List[RetailerResponse] = {
    // TODO: Implement better logic

    List.empty[RetailerResponse]
  }

  /**
    * @inheritdoc
    */
  override def retailerLoginCheck(version: BigDecimal, username: String, password: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double], appKey: Option[String]): AccountLoginResponse = {
    // TODO: Implement better logic

    AccountLoginResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRetailer(version: BigDecimal, retailerId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], facebookUrl: Option[String], twitterUrl: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], searchTags: Option[String], retailerType: Option[String], visibility: Option[String], active: Option[Boolean], responseFormat: Option[String]): RetailerFullResponse = {
    // TODO: Implement better logic

    RetailerFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
