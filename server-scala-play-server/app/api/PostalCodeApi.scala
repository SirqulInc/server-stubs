package api

import play.api.libs.json._
import model.BigDecimal
import model.PostalCodeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PostalCodeApi {
  /**
    * Create Postal Code
    * Create a Postal Code
    * @param accountId the id of the logged in user
    * @param code the postal code
    * @param latitude the latitude of the postal code
    * @param longitude the longitude of the postal code
    * @param stateCode the state code (e.g WA, WV, WI) that the postal code is located
    * @param city the city that the postal code is located
    * @param active whether the postal code created should be active or inactive
    */
  def createPostalCode(version: BigDecimal, accountId: Long, code: String, latitude: Double, longitude: Double, stateCode: Option[String], city: Option[String], active: Option[Boolean]): PostalCodeResponse

  /**
    * Delete Postal Code
    * Delete a Postal Code
    * @param accountId the id of the logged in user
    * @param postalCodeId the id of the postal code to delete
    */
  def deletePostalCode(version: BigDecimal, accountId: Long, postalCodeId: Long): SirqulResponse

  /**
    * Get Postal Code
    * Get a Postal Code
    * @param postalCodeId the id of the postal code to get
    */
  def getPostalCode(version: BigDecimal, postalCodeId: Long): PostalCodeResponse

  /**
    * Search Postal Codes
    * Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.
    * @param sortField the field to sort the results on
    * @param descending whether to order results in ascending or descending order
    * @param latitude the latitude of the postal code to search on
    * @param longitude the longitude of the postal code to search on
    * @param keyword the keyword of the postal code to search on
    * @param miles how far (in miles) to search on for the postal code
    * @param start the start of the index and/or pagination
    * @param limit the limit of the index and/or pagination
    */
  def getPostalCodes(version: BigDecimal, sortField: String, descending: Boolean, latitude: Option[Double], longitude: Option[Double], keyword: Option[String], miles: Option[Double], start: Option[Int], limit: Option[Int]): List[PostalCodeResponse]

  /**
    * Update Postal Code
    * Update a Postal Code
    * @param accountId the id of the logged in user
    * @param postalCodeId the id of the postal code to update
    * @param code the postal code to update
    * @param latitude the latitude of the postal code
    * @param longitude the longitude of the postal code
    * @param stateCode the state code (e.g. WA, WI, WY) where the postal code is located
    * @param city the city where the postal code is located
    * @param active whether the postal code is active or inactive
    */
  def updatePostalCode(version: BigDecimal, accountId: Long, postalCodeId: Long, code: Option[String], latitude: Option[Double], longitude: Option[Double], stateCode: Option[String], city: Option[String], active: Option[Boolean]): PostalCodeResponse
}
