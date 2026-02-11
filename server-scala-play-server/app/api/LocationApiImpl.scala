package api

import model.CoordsResponse
import model.GeoPointResponse
import model.LocationSearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TrilatCacheRequest

/**
  * Provides a default implementation for [[LocationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class LocationApiImpl extends LocationApi {
  /**
    * @inheritdoc
    */
  override def cacheTrilaterationData(udid: String, sourceTime: Option[Long], minimumSampleSize: Option[Int], data: Option[String], dataFile: Option[TemporaryFile]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def cacheTrilaterationDataGzip(body: Option[TrilatCacheRequest]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getLocationByIp(ip: Option[String]): CoordsResponse = {
    // TODO: Implement better logic

    CoordsResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getLocationByTrilateration(accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], data: Option[String], responseFilters: Option[String]): GeoPointResponse = {
    // TODO: Implement better logic

    GeoPointResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getLocations(deviceId: Option[String], accountId: Option[Long], currentlatitude: Option[Double], currentlongitude: Option[Double], currentLatitude: Option[Double], currentLongitude: Option[Double], query: Option[String], zipcode: Option[String], zipCode: Option[String], selectedMaplatitude: Option[Double], selectedMaplongitude: Option[Double], selectedMapLatitude: Option[Double], selectedMapLongitude: Option[Double], searchRange: Option[Double], useGeocode: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): LocationSearchResponse = {
    // TODO: Implement better logic

    LocationSearchResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
