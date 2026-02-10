package api

import play.api.libs.json._
import model.BigDecimal
import model.RegionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RegionApi {
  /**
    * Create Region
    * Create a region.
    * @param accountId The id of the account sending the request
    * @param regionClass RegionClass of this region
    * @param shortName Short name of the region. This is optimized for search
    * @param fullName Full name of the region
    * @param parentIds Comma separated region ids that are parents of this region
    * @param childrenIds Comma separated region ids that are children of this region
    * @param postalCodeIds Comma separated postal code ids the region will include
    * @param locations Sets of name,lat,long used to create new postal codes assigned to the region
    * @param retailerLocationId the id of the retailer location that the region is being created for
    * @param visibility The Visibility of the region
    * @param categoryIds the categories that the region is assigned to
    * @param filterIds the filters that the region is assigned to
    * @param start 
    * @param end 
    * @param polygon the polygon generated for the region
    * @param metaData the meta data associated with the region
    * @param latitude the latitude of the region
    * @param longitude the longitude of the region
    * @param versionCode the version code
    * @param root If this is a root region or not. If true means this region has no parent regions
    * @param active Active or inactive status of the region
    */
  def createRegion(version: BigDecimal, accountId: Long, regionClass: String, shortName: String, fullName: Option[String], parentIds: Option[String], childrenIds: Option[String], postalCodeIds: Option[String], locations: Option[String], retailerLocationId: Option[Long], visibility: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Long], end: Option[Long], polygon: Option[String], metaData: Option[String], latitude: Option[Double], longitude: Option[Double], versionCode: Option[Int], root: Option[Boolean], active: Option[Boolean]): RegionResponse

  /**
    * Delete Region
    * Delete a region.
    * @param accountId the id of the account logged in
    * @param regionId the id of the region
    */
  def deleteRegion(version: BigDecimal, accountId: Long, regionId: Long): RegionResponse

  /**
    * Get Region
    * Get a region.
    * @param regionId the id of the region to get
    * @param accountId the id of the logged in user
    */
  def getRegion(version: BigDecimal, regionId: Long, accountId: Option[Long]): RegionResponse

  /**
    * Search Regions
    * Get the list of regions.
    * @param accountId the owner account id of the region to be created
    * @param query This parameter is deprecated. deprecated - use \&quot;keyword\&quot;
    * @param keyword the keyword to filter results on
    * @param latitude the latitude of the user
    * @param longitude the longitude of the user
    * @param range the search radius
    * @param regionClass 
    * @param visibility 
    * @param searchMode the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server
    * @param sortField the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.
    * @param descending determines if the results get ordered in descending order
    * @param includeParent include the parent region or not
    * @param includeChildren include the chidren regions or not
    * @param includePostalCodes include the postal codes associated with the region or not
    * @param categoryIds search on the categories associated with the region
    * @param filterIds search on the filters associated with the region
    * @param versionCode filter by a specific version code
    * @param activeOnly filter to show only active results
    * @param showDeleted If showDeleted is true and activeOnly is false, will return regions that have been deleted
    * @param lastUpdatedSince only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def searchRegions(version: BigDecimal, accountId: Option[Long], query: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double], range: Option[Double], regionClass: Option[String], visibility: Option[String], searchMode: Option[String], sortField: Option[String], descending: Option[Boolean], includeParent: Option[Boolean], includeChildren: Option[Boolean], includePostalCodes: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], versionCode: Option[Int], activeOnly: Option[Boolean], showDeleted: Option[Boolean], lastUpdatedSince: Option[Long], start: Option[Int], limit: Option[Int]): List[RegionResponse]

  /**
    * Update Region
    * Update a region.
    * @param accountId The id of the account sending the request
    * @param regionId The id of the region to be updated
    * @param regionClass RegionClass of this region
    * @param shortName Short name of the region. This is optimized for search
    * @param fullName Full name of the region
    * @param parentIds Comma separated region ids that are parents of this region
    * @param childrenIds Comma separated region ids that are children of this region
    * @param postalCodeIds Comma separated postal code ids the region will include
    * @param locations Sets of name,lat,long used to create new postal codes assigned to the region
    * @param retailerLocationId the retailer location ID that the region is associated with
    * @param visibility The Visibility of the region
    * @param categoryIds the categories that the region is assigned to
    * @param filterIds the filters that the region is assigned to
    * @param start 
    * @param end 
    * @param polygon the polygon of the region
    * @param metaData the meta data of the region
    * @param latitude the latitude of the region
    * @param longitude the longitude of the region
    * @param versionCode the version code
    * @param root If this is a root region or not. If true means this region has no parent regions
    * @param active Active or inactive status of the region
    * @param clearLists If true clear the children and postal code lists before add new ones, otherwise just append.
    */
  def updateRegion(version: BigDecimal, accountId: Long, regionId: Long, regionClass: Option[String], shortName: Option[String], fullName: Option[String], parentIds: Option[String], childrenIds: Option[String], postalCodeIds: Option[String], locations: Option[String], retailerLocationId: Option[Long], visibility: Option[String], categoryIds: Option[String], filterIds: Option[String], start: Option[Long], end: Option[Long], polygon: Option[String], metaData: Option[String], latitude: Option[Double], longitude: Option[Double], versionCode: Option[Int], root: Option[Boolean], active: Option[Boolean], clearLists: Option[Boolean]): RegionResponse
}
