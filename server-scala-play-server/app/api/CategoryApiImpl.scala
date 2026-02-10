package api

import model.BigDecimal
import model.CategoryResponse
import model.CategoryTreeResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[CategoryApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CategoryApiImpl extends CategoryApi {
  /**
    * @inheritdoc
    */
  override def categoryDistanceSearch(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], categoryIds: Option[String], parentCategoryIds: Option[String], rootOnly: Option[Boolean], sortField: Option[String], responseGroup: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], returnExternal: Option[Boolean], exactMatch: Option[Boolean], `type`: Option[String], externalType: Option[String], minOfferCount: Option[Int], latitude: Option[Double], longitude: Option[Double], range: Option[Double]): List[CategoryResponse] = {
    // TODO: Implement better logic

    List.empty[CategoryResponse]
  }

  /**
    * @inheritdoc
    */
  override def createCategory(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], parentCategoryId: Option[Long], description: Option[String], `type`: Option[String], assetId: Option[Long], externalId: Option[String], externalType: Option[String], externalCategorySlug: Option[String], sqootSlug: Option[String], active: Option[Boolean], metaData: Option[String], searchTags: Option[String]): CategoryTreeResponse = {
    // TODO: Implement better logic

    CategoryTreeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteCategory(version: BigDecimal, accountId: Long, categoryId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def duplicateCategory(version: BigDecimal, accountId: Long, categoryId: Long, appKey: Option[String], parentCategoryId: Option[Long]): CategoryTreeResponse = {
    // TODO: Implement better logic

    CategoryTreeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getCategory(version: BigDecimal, categoryId: Long, returnExternal: Option[Boolean]): CategoryTreeResponse = {
    // TODO: Implement better logic

    CategoryTreeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchCategories(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], categoryId: Option[String], categoryIds: Option[String], parentCategoryIds: Option[String], rootOnly: Option[Boolean], sortField: Option[String], responseGroup: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], returnExternal: Option[Boolean], exactMatch: Option[Boolean], `type`: Option[String], externalType: Option[String], excludeExternalType: Option[Boolean], minOfferCount: Option[Int], searchDepth: Option[Int], searchMode: Option[String]): List[CategoryResponse] = {
    // TODO: Implement better logic

    List.empty[CategoryResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateCategory(version: BigDecimal, accountId: Long, categoryId: Long, parentCategoryId: Option[Long], name: Option[String], description: Option[String], `type`: Option[String], assetId: Option[Long], externalId: Option[String], externalType: Option[String], externalCategorySlug: Option[String], sqootSlug: Option[String], active: Option[Boolean], metaData: Option[String], searchTags: Option[String]): CategoryTreeResponse = {
    // TODO: Implement better logic

    CategoryTreeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
