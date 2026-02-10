package api

import play.api.libs.json._
import model.BigDecimal
import model.CategoryResponse
import model.CategoryTreeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CategoryApi {
  /**
    * Search Categories by Distance
    * Search for categories by distance.
    * @param accountId The account id of the user
    * @param keyword The keyword string to search on
    * @param appKey the appKey of the application to retrieve categories for, if not specified then search on the global application.
    * @param categoryIds Restrict the search by specific categories
    * @param parentCategoryIds Restrict the search by specific parent categories so that only its sub children are searched.
    * @param rootOnly Restrict the search to only those categories with no parent category assigned.
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    * @param responseGroup The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param activeOnly Determines whether to return only active categories
    * @param returnExternal Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    * @param exactMatch If true search categories using the exact keyword, if false then do a partial match (like) search.
    * @param `type` Filters results by the Category&#39;s type
    * @param externalType Filters results by externalType
    * @param minOfferCount Filters results to only return Categories that have been referenced by a minimum number of Offers
    * @param latitude the latitude of where the search is centered on
    * @param longitude the longitude of where the search is centered on
    * @param range the maximum range the category can be from the center
    */
  def categoryDistanceSearch(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], categoryIds: Option[String], parentCategoryIds: Option[String], rootOnly: Option[Boolean], sortField: Option[String], responseGroup: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], returnExternal: Option[Boolean], exactMatch: Option[Boolean], `type`: Option[String], externalType: Option[String], minOfferCount: Option[Int], latitude: Option[Double], longitude: Option[Double], range: Option[Double]): List[CategoryResponse]

  /**
    * Create Category
    * Create a new category.
    * @param accountId The account id of the user (must have permissions to the target application)
    * @param name The name of the category
    * @param appKey The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)
    * @param parentCategoryId The ID of the parent category, if not provided then the parent category will be null
    * @param description The description of the category
    * @param `type` The type of the category
    * @param assetId The ID of the image asset previously uploaded using the media service
    * @param externalId A string identifier used by client applications to store external information
    * @param externalType A string type used by client applications to store external information
    * @param externalCategorySlug external category slug
    * @param sqootSlug sqoot slug
    * @param active Sets whether the category is active or inactive (hidden from consumers)
    * @param metaData external custom client defined data
    * @param searchTags user defined strings for searching
    */
  def createCategory(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], parentCategoryId: Option[Long], description: Option[String], `type`: Option[String], assetId: Option[Long], externalId: Option[String], externalType: Option[String], externalCategorySlug: Option[String], sqootSlug: Option[String], active: Option[Boolean], metaData: Option[String], searchTags: Option[String]): CategoryTreeResponse

  /**
    * Delete Category
    * Delete a category.
    * @param accountId the ID of the account
    * @param categoryId the ID of the category
    */
  def deleteCategory(version: BigDecimal, accountId: Long, categoryId: Long): SirqulResponse

  /**
    * Duplicate Category
    * Duplicate a category, including all its children.
    * @param accountId The account id of the user (must have permissions to the target application)
    * @param categoryId The category ID to duplicate (includes all children)
    * @param appKey The application to assign the new category to, may be different then the application the source category is assigned to
    * @param parentCategoryId The parent category ID to add the target category to.
    */
  def duplicateCategory(version: BigDecimal, accountId: Long, categoryId: Long, appKey: Option[String], parentCategoryId: Option[Long]): CategoryTreeResponse

  /**
    * Get Category
    * Get the details of a specific category. Recursively include all child categories and their children.
    * @param categoryId the ID of the category
    * @param returnExternal Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    */
  def getCategory(version: BigDecimal, categoryId: Long, returnExternal: Option[Boolean]): CategoryTreeResponse

  /**
    * Search Categories
    * Search for categories.
    * @param accountId The account id of the user
    * @param keyword The string to search on
    * @param appKey the appKey of the application to retrieve categories for, if not specified then search on the global application.
    * @param categoryId @Deprecated, use parentCategoryIds instead
    * @param categoryIds Restrict the search by specific categories
    * @param parentCategoryIds Restrict the search by specific parent categories so that only its sub children are searched.
    * @param rootOnly Restrict the search to only those categories with no parent category assigned.
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    * @param responseGroup The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    * @param descending The order to return the search results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    * @param activeOnly Determines whether to return only active categories
    * @param returnExternal Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    * @param exactMatch If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.
    * @param `type` Filters results by the Category&#39;s type
    * @param externalType Filters results by externalType
    * @param excludeExternalType Determines whether the \&quot;externalType\&quot; param is excluded from the search results
    * @param minOfferCount Filters results to only return Categories that have been referenced by a minimum number of Offers
    * @param searchDepth When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.
    * @param searchMode The search index mode to use (e.g. OPENSEARCH or RDS)
    */
  def searchCategories(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], categoryId: Option[String], categoryIds: Option[String], parentCategoryIds: Option[String], rootOnly: Option[Boolean], sortField: Option[String], responseGroup: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], returnExternal: Option[Boolean], exactMatch: Option[Boolean], `type`: Option[String], externalType: Option[String], excludeExternalType: Option[Boolean], minOfferCount: Option[Int], searchDepth: Option[Int], searchMode: Option[String]): List[CategoryResponse]

  /**
    * Update Category
    * Update a category.
    * @param accountId The account id of the user
    * @param categoryId The ID of the category to edit
    * @param parentCategoryId The ID of the parent category, if not provided then the parent category will be null
    * @param name The name of the category
    * @param description The description of the category
    * @param `type` The type of the category
    * @param assetId The ID of the image asset previously uploaded using the media service
    * @param externalId A string identifier used by client applications to store external information
    * @param externalType A string type used by client applications to store external information
    * @param externalCategorySlug external category slug
    * @param sqootSlug sqoot slug
    * @param active Sets whether the category is active or inactive (hidden from consumers)
    * @param metaData external custom client defined data
    * @param searchTags user defined strings for searching
    */
  def updateCategory(version: BigDecimal, accountId: Long, categoryId: Long, parentCategoryId: Option[Long], name: Option[String], description: Option[String], `type`: Option[String], assetId: Option[Long], externalId: Option[String], externalType: Option[String], externalCategorySlug: Option[String], sqootSlug: Option[String], active: Option[Boolean], metaData: Option[String], searchTags: Option[String]): CategoryTreeResponse
}
