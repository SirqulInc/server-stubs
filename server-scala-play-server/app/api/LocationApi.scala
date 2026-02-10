package api

import play.api.libs.json._
import model.BigDecimal
import model.CoordsResponse
import model.GeoPointResponse
import model.LocationSearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TrilatCacheRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait LocationApi {
  /**
    * Create Trilateration Data with File
    * Creates trilateration samples for a source device (i.e. a router).
    * @param udid The unique identifier of the source device
    * @param sourceTime The current timestamp of the source device
    * @param minimumSampleSize the minimum number of Edysen devices that must be used to be able to trilaterate a device
    * @param data The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;:\&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;: \&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    * @param dataFile Binary file containing data (multipart upload)
    */
  def cacheTrilaterationData(version: BigDecimal, udid: String, sourceTime: Option[Long], minimumSampleSize: Option[Int], data: Option[String], dataFile: Option[TemporaryFile]): SirqulResponse

  /**
    * Create Trilateration Data with Rest
    * Creates trilateration samples for a source device (i.e. a router).
    */
  def cacheTrilaterationDataGzip(version: BigDecimal, body: Option[TrilatCacheRequest]): SirqulResponse

  /**
    * Get Location by IP
    * Get location information based on an IP address.
    * @param ip the ip address of the client device
    */
  def getLocationByIp(version: BigDecimal, ip: Option[String]): CoordsResponse

  /**
    * Get Location by Trilateration
    * Send in device data and calculate a position based on signal strengths.
    * @param accountId The account making the request, if provided the last know location will be updated
    * @param latitude The known GPS latitude to compare to the calculated version
    * @param longitude The known GPS longitude to compare to the calculated version
    * @param data The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; 
    * @param responseFilters Optional response filters (not used currently)
    */
  def getLocationByTrilateration(version: BigDecimal, accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], data: Option[String], responseFilters: Option[String]): GeoPointResponse

  /**
    * Search Regions or Postal Codes
    * Searches geographic locations by proximity via address or keyword.
    * @param deviceId the device id
    * @param accountId the account id
    * @param currentlatitude This parameter is deprecated.
    * @param currentlongitude This parameter is deprecated.
    * @param currentLatitude the current latitude of the user
    * @param currentLongitude the current longitude of the user
    * @param query the query results by keyword or address
    * @param zipcode This parameter is deprecated.
    * @param zipCode the zip code to filter results
    * @param selectedMaplatitude This parameter is deprecated.
    * @param selectedMaplongitude This parameter is deprecated.
    * @param selectedMapLatitude the latitude of where the search should originate from
    * @param selectedMapLongitude the longitude of where the search should originate from
    * @param searchRange the search range of the search in miles
    * @param useGeocode determines whether to allow searches via address
    * @param i This parameter is deprecated.
    * @param start the start index for pagination
    * @param l This parameter is deprecated.
    * @param limit the limit for pagination
    */
  def getLocations(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], currentlatitude: Option[Double], currentlongitude: Option[Double], currentLatitude: Option[Double], currentLongitude: Option[Double], query: Option[String], zipcode: Option[String], zipCode: Option[String], selectedMaplatitude: Option[Double], selectedMaplongitude: Option[Double], selectedMapLatitude: Option[Double], selectedMapLongitude: Option[Double], searchRange: Option[Double], useGeocode: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): LocationSearchResponse
}
