package api

import play.api.libs.json._
import model.BigDecimal
import model.ProfileResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TwitterApi {
  /**
    * Authorize Twitter
    * Makes an authorization call to twitter for a user to login and allow any app permissions.
    * @param appKey the application key
    */
  def authorizeTwitter(version: BigDecimal, appKey: String): SirqulResponse

  /**
    * Login Twitter
    * Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.
    * @param accessToken The access token
    * @param accessTokenSecret The secret access token
    * @param appKey The application key
    * @param responseFilters a comma separated list of ProfileFilters for filtering the returned response data
    * @param deviceId The device id
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def loginTwitter(version: BigDecimal, accessToken: String, accessTokenSecret: String, appKey: String, responseFilters: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse
}
