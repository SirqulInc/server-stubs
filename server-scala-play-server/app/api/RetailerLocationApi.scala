package api

import play.api.libs.json._
import model.BigDecimal
import model.RetailerLocationResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RetailerLocationApi {
  /**
    * Create Retailer Location (Consumer)
    * Creates a location record for an application that can support crowd sourced locations.
    * @param appKey the application key
    * @param name The name of the retailer location
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param streetAddress The street address of the retailer location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the retailer location
    * @param state The state of the retailer location
    * @param postalCode The postal code of the retailer location
    * @param country the country of the retailer location
    * @param businessPhone The business phone
    * @param businessPhoneExt The business phone extension
    * @param website The website of the retailer location
    * @param email The email of the retailer location
    * @param detailsHeader A brief description about the retailer location (255 character limit)
    * @param detailsBody A detailed description about the retailer location
    * @param hours The hours of operation
    * @param tags Custom string field for doing full-text searches
    * @param logoAssetId The retailer location logo asset id
    * @param picture1AssetId An asset id
    * @param picture2AssetId An asset id
    * @param categoryIds Comma separated list of category IDs used to filter retailer locations by categories
    * @param filterIds Comma separated list of filter IDs used to filter retailer locations
    * @param metaData External custom client defined data
    * @param publicLocation Whether the location is public
    * @param active whether the retailer location created should be active or not
    * @param locationType External custom type identifier
    * @param latitude The latitude to center the search on
    * @param longitude The longitude to center the search on
    */
  def createRetailerLocationConsumer(version: BigDecimal, appKey: String, name: String, deviceId: Option[String], accountId: Option[Long], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], tags: Option[String], logoAssetId: Option[Long], picture1AssetId: Option[Long], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], metaData: Option[String], publicLocation: Option[Boolean], active: Option[Boolean], locationType: Option[String], latitude: Option[Double], longitude: Option[Double]): RetailerLocationResponse

  /**
    * Create Retailer Location
    * Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
    * @param retailerId The ID of the retailer
    * @param name The name of the retailer location
    * @param streetAddress The street address of the retailer location
    * @param city The city of the retailer location
    * @param state The state of the retailer location
    * @param postalCode The postal code of the retailer location
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param country the country of the retailer location
    * @param businessPhone The business phone number of the retailer location
    * @param businessPhoneExt The business phone extension
    * @param website The website of the retailer location
    * @param email The email of the retailer location
    * @param internalId An internal identifier used by the retailer
    * @param detailsHeader A brief description about the retailer location (255 character limit)
    * @param detailsBody A detailed description about the retailer location
    * @param hours The hours of operation
    * @param logo The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    * @param logoAssetId The retailer location logo asset id
    * @param picture1 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    * @param picture1AssetId An asset id
    * @param picture2 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    * @param picture2AssetId An asset id
    * @param categoryIds Comma separated list of category IDs used to filter retailer locations by categories
    * @param filterIds Comma separated list of filter IDs used to filter retailer locations
    * @param latitude the latitude of the retailer location
    * @param longitude the longitude of the retailer location
    * @param building 
    * @param googlePlaceId the ID of the Google Place that this retailer location is assigned to
    * @param yelpId the Yelp ID that this retailer location is assigned to
    * @param active whether the retailer location should be active or inactive
    * @param publicLocation Sets whether the location is public or not
    * @param locationType External custom type identifier
    * @param audienceIds Comma separated list of audience IDs used to assign audiences to the retailer location
    * @param audienceIdsToAdd Comma separated list of audience IDs to add to the retailer location
    * @param audienceIdsToRemove Comma separated list of audience IDs to remove from the retailer location
    * @param responseFormat The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    * @param responseIncludes Comma separated list of response includes (e.g. RETAILER,ASSETS,OFFERS,CATEGORIES,FILTERS,AUDIENCES,QRCODE)
    */
  def createRetailerLocations(version: BigDecimal, retailerId: Long, name: String, streetAddress: String, city: String, state: String, postalCode: String, deviceId: Option[String], accountId: Option[Long], streetAddress2: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], internalId: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], building: Option[String], googlePlaceId: Option[String], yelpId: Option[String], active: Option[Boolean], publicLocation: Option[Boolean], locationType: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], responseFormat: Option[String], responseIncludes: Option[String]): RetailerLocationResponse

  /**
    * Delete Retailer Location
    * Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.
    * @param deviceId the device id
    * @param accountId the id of the logged in user
    * @param retailerLocationId the id of the retailer location to delete
    */
  def deleteRetailerLocation(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], retailerLocationId: Option[Long]): SirqulResponse

  /**
    * Get Retailer Location
    * Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.
    * @param retailerLocationId The ID of the retailer location
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param retailerLocationToken the unique token of the retailer location
    */
  def getRetailerLocation(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long], retailerLocationToken: Option[String]): RetailerLocationResponse

  /**
    * Get Retailer Location (Consumer)
    * Gets the details of a retailer location as a consumer.
    * @param retailerLocationId The retailer location id
    * @param deviceId The device id for returning account information (i.e. favorites)
    * @param accountId The account id for returning account information (i.e. favorites)
    */
  def getRetailerLocationConsumer(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long]): RetailerLocationResponse

  /**
    * Distance Search Retailer Locations (Indexed)
    * Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.
    * @param latitude The latitude to center the search on
    * @param longitude The longitude to center the search on
    * @param searchRange The search range in the distanceUnit specified; default is MILES.
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param accountId The account id of the user
    * @param address Used to return results using this address as the center
    * @param hasOffers boolean to indicate whether to include retailer locations that have no offers
    * @param categories Comma separate list of category ids
    * @param filters Comma separated list of filter ids
    * @param audiences Comma separated list of audience ids
    * @param retailerIds Comma separated list of retailer ids
    * @param retailerLocationIds Comma separated list of retailer location ids
    * @param tags Does a full-text search on tags
    * @param locationType Location type filter
    * @param sortField The field to sort the result set on. Possible values include: DISTANCE, RETAILER_NAME, RETAILER_LOCATION_NAME
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param q This parameter is deprecated.
    * @param keyword Search by keyword
    * @param keywordOperator Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    * @param searchExpression Search expression to further refine results
    * @param distanceUnit Unit of distance
    * @param returnFavorited (deprecated) return favorited flag
    * @param returnRetailer Return retailer info
    * @param returnAssets Return assets
    * @param returnOffers Return offers
    * @param returnCategories Return categories
    * @param returnFilters Return filters
    * @param returnAudiences Return audiences
    * @param returnQrCode Return QR code info
    * @param returnExternalCategoryData Return external category data
    * @param includeFavorite Include favorites in response
    * @param includeLiked Include liked flag in response
    * @param includeRating Include rating info in response
    */
  def indexedRetailerLocationDistanceSearch(version: BigDecimal, latitude: Double, longitude: Double, searchRange: Double, start: Int, limit: Int, accountId: Option[Long], address: Option[String], hasOffers: Option[Boolean], categories: Option[String], filters: Option[String], audiences: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], tags: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], q: Option[String], keyword: Option[String], keywordOperator: Option[String], searchExpression: Option[String], distanceUnit: Option[String], returnFavorited: Option[Boolean], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], returnExternalCategoryData: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse]

  /**
    * Keyword Search Retailer Locations (Indexed)
    * Retailer location (faster) indexed search. This searches all retailer locations.
    * @param accountId The account id of the user
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param hasOffers boolean to indicate whether to include retailer locations that have no offers
    * @param categories Comma separate list of category ids
    * @param filters Comma separated list of filter ids
    * @param audiences Comma separated list of audience ids
    * @param retailerIds Comma separated list of retailer ids
    * @param retailerLocationIds Comma separated list of retailer location ids
    * @param tags Does a full-text search on tags
    * @param locationType Location type filter
    * @param sortField The field to sort the result set on. Possible values include: RETAILER_NAME, RETAILER_LOCATION_NAME
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param q This parameter is deprecated.
    * @param keyword Search by keyword
    * @param keywordOperator Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    * @param searchExpression Search expression to further refine results
    * @param returnRetailer Return retailer info
    * @param returnAssets Return assets
    * @param returnOffers Return offers
    * @param returnCategories Return categories
    * @param returnFilters Return filters
    * @param returnAudiences Return audiences
    * @param returnQrCode Return QR code info
    * @param returnExternalCategoryData Return external category data
    * @param includeFavorite Include favorites in response
    * @param includeLiked Include liked flag in response
    * @param includeRating Include rating info in response
    */
  def indexedRetailerLocationSearch(version: BigDecimal, accountId: Option[Long], start: Option[Int], limit: Option[Int], hasOffers: Option[Boolean], categories: Option[String], filters: Option[String], audiences: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], tags: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], q: Option[String], keyword: Option[String], keywordOperator: Option[String], searchExpression: Option[String], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], returnExternalCategoryData: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse]

  /**
    * Search Retailer Locations (Owned)
    * Searches on retailer locations that the account has access to.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param q This parameter is deprecated.
    * @param keyword The keyword used to search
    * @param retailerIds Comma separated list of retailer IDs which when passed in will filter the results to only return these retailers.
    * @param retailerLocationIds Comma separated list of retailer location IDs
    * @param locationType Location type filter
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param i This parameter is deprecated.
    * @param start The record to begin the return set on
    * @param l This parameter is deprecated.
    * @param limit The number of records to return
    * @param showPublicLocations Whether to include public locations in the results
    * @param activeOnly Return only active results
    * @param returnRetailer Return retailer info
    * @param returnAssets Return assets
    * @param returnOffers Return offers
    * @param returnCategories Return categories
    * @param returnFilters Return filters
    * @param returnAudiences Return audiences
    * @param returnQrCode Return QR code info
    * @param includeFavorite Include favorites in response
    * @param includeLiked Include liked flag in response
    * @param includeRating Include rating info in response
    */
  def searchRetailerLocations(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], retailerIds: Option[String], retailerLocationIds: Option[String], locationType: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], showPublicLocations: Option[Boolean], activeOnly: Option[Boolean], returnRetailer: Option[Boolean], returnAssets: Option[Boolean], returnOffers: Option[Boolean], returnCategories: Option[Boolean], returnFilters: Option[Boolean], returnAudiences: Option[Boolean], returnQrCode: Option[Boolean], includeFavorite: Option[Boolean], includeLiked: Option[Boolean], includeRating: Option[Boolean]): List[RetailerLocationResponse]

  /**
    * Update Retailer Location
    * Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.
    * @param retailerLocationId The ID of the retailer location
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param name The name of the retailer location
    * @param streetAddress The street address of the retailer location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the retailer location
    * @param state The state of the retailer location
    * @param postalCode The postal code of the retailer location
    * @param country the country of the retailer location
    * @param businessPhone The business phone number of the retailer location
    * @param businessPhoneExt The business phone extension of the retailer location
    * @param website The website of the retailer location
    * @param email The email of the retailer location
    * @param internalId An internal identifier used by the retailer
    * @param detailsHeader A brief description about the retailer location (255 character limit)
    * @param detailsBody A detailed description about the retailer location
    * @param hours The hours of operation
    * @param logo The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    * @param logoAssetId The retailer location logo asset id
    * @param picture1 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    * @param picture1AssetId An asset id
    * @param picture2 Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    * @param picture2AssetId An asset id
    * @param categoryIds Comma separated list of category IDs used to filter retailer locations by categories
    * @param filterIds Comma separated list of filter IDs used to filter retailer locations
    * @param latitude the latituede of the retailer location
    * @param longitude the longitude of the retailer location
    * @param building 
    * @param googlePlaceId the Google Place ID that the retailer location is associated with
    * @param yelpId the Yelp ID that the retailer location is associated with
    * @param metaData External custom client defined data
    * @param paymentProvider Specifies which payment provider Sirqul will use when making payments
    * @param active Sets whether the retailer is active or inactive (hidden from consumers)
    * @param publicLocation Sets whether the location is public or not
    * @param locationType External custom type identifier
    * @param audienceIds Comma separated list of audience IDs used to assign audiences to the retailer location
    * @param audienceIdsToAdd Comma separated list of audience IDs to add to the retailer location
    * @param audienceIdsToRemove Comma separated list of audience IDs to remove from the retailer location
    * @param responseFormat The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    * @param tags Custom string field for doing full-text searches
    */
  def updateRetailerLocations(version: BigDecimal, retailerLocationId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], postalCode: Option[String], country: Option[String], businessPhone: Option[String], businessPhoneExt: Option[String], website: Option[String], email: Option[String], internalId: Option[String], detailsHeader: Option[String], detailsBody: Option[String], hours: Option[String], logo: Option[TemporaryFile], logoAssetId: Option[Long], picture1: Option[TemporaryFile], picture1AssetId: Option[Long], picture2: Option[TemporaryFile], picture2AssetId: Option[Long], categoryIds: Option[String], filterIds: Option[String], latitude: Option[Double], longitude: Option[Double], building: Option[String], googlePlaceId: Option[String], yelpId: Option[String], metaData: Option[String], paymentProvider: Option[String], active: Option[Boolean], publicLocation: Option[Boolean], locationType: Option[String], audienceIds: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], responseFormat: Option[String], tags: Option[String]): RetailerLocationResponse
}
