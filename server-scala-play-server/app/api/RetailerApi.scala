package api

import play.api.libs.json._
import model.AccountLoginResponse
import model.BigDecimal
import model.RetailerFullResponse
import model.RetailerResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RetailerApi {
  /**
    * Create Retailer
    * Create a retailer record. A billable entity must be created first before a retailer record can be made.
    * @param name The name of the retailer
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param streetAddress The street address of the retailer
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the retailer
    * @param state The state of the retailer
    * @param postalCode The postal code of the retailer
    * @param country the country of the retailer
    * @param businessPhone The business phone number of the retailer
    * @param businessPhoneExt The business phone extension of the retailer
    * @param website The website of the retailer
    * @param email The email of the retailer
    * @param facebookUrl The facebook URL of the retailer
    * @param twitterUrl The twitter URL of the retailer
    * @param logo The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    * @param logoAssetId The retailer logo asset id
    * @param picture1 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    * @param picture1AssetId An asset id
    * @param picture2 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    * @param picture2AssetId An asset id
    * @param categoryIds Comma separated list of category IDs used to filter retailers by categories
    * @param categoryIdsToAdd Comma separated list of category IDs to add to the retailer
    * @param categoryIdsToRemove Comma separated list of category IDs to remove from the retailer
    * @param filterIds Comma separated list of filter IDs used to filter retailers
    * @param latitude the latitude of the retailer
    * @param longitude the longitude of the retailer
    * @param metaData External custom client defined data
    * @param searchTags External custom search keywords
    * @param retailerType External custom type identifier
    * @param visibility 
    * @param createDefaultLocation Determines whether to create a default location using the retailer information
    * @param responseFormat The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    */
  def createRetailer(version: BigDecimal, name: String, deviceId: Option[String], accountId: Option[Long], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], facebookUrl: Option[String], twitterUrl: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], categoryIdsToAdd: Option[String], categoryIdsToRemove: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], searchTags: Option[String], retailerType: Option[String], visibility: Option[String], createDefaultLocation: Option[Boolean], responseFormat: Option[String]): RetailerFullResponse

  /**
    * Delete Retailer
    * Set the deleted timestamp to current time.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account used to perform the delete, must have rights to edit the retailer.
    * @param retailerId The ID of the retailer to be deleted
    */
  def deleteRetailer(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], retailerId: Option[Long]): SirqulResponse

  /**
    * Get Retailer
    * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
    * @param retailerId the ID of the retailer
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param includeCounts Determines whether to include counts in the response (default true)
    */
  def getRetailer(version: BigDecimal, retailerId: Long, deviceId: Option[String], accountId: Option[Long], includeCounts: Option[Boolean]): RetailerFullResponse

  /**
    * Search Retailers
    * earches on retailers that the account has access to.
    * @param visibility 
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param activeOnly Return only active results
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param q This parameter is deprecated.
    * @param keyword The keyword used to search
    * @param categoryIds the categories that the retailer is associated with
    * @param filterIds the filters that the retailer is associated with
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    */
  def getRetailers(version: BigDecimal, visibility: String, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], categoryIds: Option[String], filterIds: Option[String], i: Option[Int], l: Option[Int]): List[RetailerResponse]

  /**
    * Login Retailer
    * Retailer login check.
    * @param username the user&#39;s email address they used to sign-up
    * @param password the password
    * @param deviceId the device id (optional)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param appKey the application key
    */
  def retailerLoginCheck(version: BigDecimal, username: String, password: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double], appKey: Option[String]): AccountLoginResponse

  /**
    * Update Retailer
    * Update a retailer record. Only the owner and the employees of the retailer have access to update its information.
    * @param retailerId The ID of the retailer to update
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param name The name of the retailer
    * @param streetAddress The street address of the retailer
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the retailer
    * @param state The state of the retailer
    * @param postalCode The postal code of the retailer
    * @param country the country of the retailer
    * @param businessPhone The business phone of the retailer
    * @param businessPhoneExt The business phone extension of the retailer
    * @param website The website of the retailer
    * @param email The email of the retailer
    * @param facebookUrl The facebook URL of the retailer
    * @param twitterUrl The twitter URL of the retailer
    * @param logo The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    * @param logoAssetId The retailer logo asset id
    * @param picture1 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    * @param picture1AssetId An asset id
    * @param picture2 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    * @param picture2AssetId An asset id
    * @param categoryIds Comma separated list of category IDs used to filter retailers by categories
    * @param filterIds Comma separated list of filter IDs used to filter retailers
    * @param latitude the latitude of the retailer
    * @param longitude the longitude of the retailer
    * @param metaData External custom client defined data
    * @param searchTags External custom search keywords
    * @param retailerType External custom type identifier
    * @param visibility 
    * @param active Sets whether the retailer is active or inactive (hidden from consumers)
    * @param responseFormat The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    */
  def updateRetailer(version: BigDecimal, retailerId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], facebookUrl: Option[String], twitterUrl: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], searchTags: Option[String], retailerType: Option[String], visibility: Option[String], active: Option[Boolean], responseFormat: Option[String]): RetailerFullResponse
}
