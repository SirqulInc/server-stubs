package api

import model.BigDecimal
import model.PostalCodeResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[PostalCodeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PostalCodeApiImpl extends PostalCodeApi {
  /**
    * @inheritdoc
    */
  override def createPostalCode(version: BigDecimal, accountId: Long, code: String, latitude: Double, longitude: Double, stateCode: Option[String], city: Option[String], active: Option[Boolean]): PostalCodeResponse = {
    // TODO: Implement better logic

    PostalCodeResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deletePostalCode(version: BigDecimal, accountId: Long, postalCodeId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPostalCode(version: BigDecimal, postalCodeId: Long): PostalCodeResponse = {
    // TODO: Implement better logic

    PostalCodeResponse(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPostalCodes(version: BigDecimal, sortField: String, descending: Boolean, latitude: Option[Double], longitude: Option[Double], keyword: Option[String], miles: Option[Double], start: Option[Int], limit: Option[Int]): List[PostalCodeResponse] = {
    // TODO: Implement better logic

    List.empty[PostalCodeResponse]
  }

  /**
    * @inheritdoc
    */
  override def updatePostalCode(version: BigDecimal, accountId: Long, postalCodeId: Long, code: Option[String], latitude: Option[Double], longitude: Option[Double], stateCode: Option[String], city: Option[String], active: Option[Boolean]): PostalCodeResponse = {
    // TODO: Implement better logic

    PostalCodeResponse(None, None, None, None, None, None, None)
  }
}
