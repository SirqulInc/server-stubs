package api

import play.api.libs.json._
import model.BigDecimal
import model.PaymentRequest
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait SecureAppApi {
  /**
    * Create Secure Application
    * Create a secure application record.
    * @param accountId The unique id of the user making the request
    * @param appKey The application to secure
    * @param keyCert 
    * @param trustStore 
    * @param username 
    * @param password 
    * @param active 
    * @param biometricType The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    * @param biometricPosition The position for the biometric file uploaded
    * @param biometricPosition2 The position for each the biometric2 file uploaded
    */
  def createSecureApplication(version: BigDecimal, accountId: Long, appKey: String, keyCert: TemporaryFile, trustStore: TemporaryFile, username: String, password: String, active: Option[Boolean], biometricType: Option[String], biometricPosition: Option[String], biometricPosition2: Option[String]): SirqulResponse

  /**
    * Delete Secure Application
    * Delete a secure application record.
    * @param accountId The unique id of the user making the request
    * @param appKey The application to secure
    */
  def deleteSecureApplication(version: BigDecimal, accountId: Long, appKey: String): SirqulResponse

  /**
    * Login Clear
    * Login via Clear.me. Creates a new account if logging in for the first time.
    * @param appKey The application making the request, defines what type and position is required to make a secure login the request.
    * @param biometricFile The data file used to perform authentication
    * @param deviceId The unique id of the device making the request
    * @param biometricFile2 The data file used to perform authentication
    * @param ageRestriction Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    * @param returnProfile Determines whether to return a ProfileResponse on success, or a PaymentTypesResponse
    * @param responseFilters If returnProfile is set to true, this determines how much of the profile should be returned, see ProfileFilters
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    */
  def loginSecure(version: BigDecimal, appKey: String, biometricFile: TemporaryFile, deviceId: Option[String], biometricFile2: Option[TemporaryFile], ageRestriction: Option[Int], returnProfile: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse

  /**
    * Purchase Clear
    * Purchase via Clear.me. Creates a new account if purchasing for the first time.
    * @param body The payment request object
    */
  def purchaseSecure(version: BigDecimal, body: PaymentRequest): ProfileResponse

  /**
    * Rest Secure Application
    * Reset a secure application client.
    * @param accountId The unique id of the user making the request
    * @param appKey The application to secure
    */
  def resetSecure(version: BigDecimal, accountId: Long, appKey: String): SirqulResponse

  /**
    * Update Secure Application
    * Update a secure application record.
    * @param accountId The unique id of the user making the request
    * @param appKey The application to secure
    * @param active 
    * @param keyCert 
    * @param trustStore 
    * @param username 
    * @param password 
    * @param biometricType The type of biometric, options are: - FINGERPRINT - IRIS - FACIAL
    * @param biometricPosition The position for the biometric file uploaded
    * @param biometricPosition2 The position for each the biometric2 file uploaded
    */
  def updateSecureApplication(version: BigDecimal, accountId: Long, appKey: String, active: Option[Boolean], keyCert: Option[TemporaryFile], trustStore: Option[TemporaryFile], username: Option[String], password: Option[String], biometricType: Option[String], biometricPosition: Option[String], biometricPosition2: Option[String]): SirqulResponse
}
