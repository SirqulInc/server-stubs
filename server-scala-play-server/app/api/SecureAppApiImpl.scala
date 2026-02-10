package api

import model.BigDecimal
import model.PaymentRequest
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[SecureAppApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class SecureAppApiImpl extends SecureAppApi {
  /**
    * @inheritdoc
    */
  override def createSecureApplication(version: BigDecimal, accountId: Long, appKey: String, keyCert: TemporaryFile, trustStore: TemporaryFile, username: String, password: String, active: Option[Boolean], biometricType: Option[String], biometricPosition: Option[String], biometricPosition2: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteSecureApplication(version: BigDecimal, accountId: Long, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginSecure(version: BigDecimal, appKey: String, biometricFile: TemporaryFile, deviceId: Option[String], biometricFile2: Option[TemporaryFile], ageRestriction: Option[Int], returnProfile: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def purchaseSecure(version: BigDecimal, body: PaymentRequest): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def resetSecure(version: BigDecimal, accountId: Long, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateSecureApplication(version: BigDecimal, accountId: Long, appKey: String, active: Option[Boolean], keyCert: Option[TemporaryFile], trustStore: Option[TemporaryFile], username: Option[String], password: Option[String], biometricType: Option[String], biometricPosition: Option[String], biometricPosition2: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
