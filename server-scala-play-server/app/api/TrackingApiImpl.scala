package api

import model.AccountMiniResponse
import model.BigDecimal
import model.Leg
import model.LegResponse
import model.PredictedLocationResponse
import model.PreferredLocationResponse
import model.SirqulResponse
import model.StepResponse

/**
  * Provides a default implementation for [[TrackingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TrackingApiImpl extends TrackingApi {
  /**
    * @inheritdoc
    */
  override def batchSaveTracking(version: BigDecimal, data: String, deviceId: Option[String], accountId: Option[Long], generateAccounts: Option[Boolean], updateAccountLocations: Option[Boolean], defaultTag: Option[String], slaveUID: Option[String]): List[Leg] = {
    // TODO: Implement better logic

    List.empty[Leg]
  }

  /**
    * @inheritdoc
    */
  override def getPredictedLocations(version: BigDecimal, accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], threshold: Option[Long], distanceUnit: Option[String], searchRange: Option[Double], sortOrder: Option[String]): PredictedLocationResponse = {
    // TODO: Implement better logic

    PredictedLocationResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPredictedPath(version: BigDecimal, accountId: Long, startStepId: Long, endStepId: Long): List[StepResponse] = {
    // TODO: Implement better logic

    List.empty[StepResponse]
  }

  /**
    * @inheritdoc
    */
  override def getPreferredLocations(version: BigDecimal, accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], searchRange: Option[Double], distanceUnit: Option[String]): List[PreferredLocationResponse] = {
    // TODO: Implement better logic

    List.empty[PreferredLocationResponse]
  }

  /**
    * @inheritdoc
    */
  override def getTrackingLegs(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], ownerId: Option[Long], trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], getLastPoint: Option[Boolean]): List[LegResponse] = {
    // TODO: Implement better logic

    List.empty[LegResponse]
  }

  /**
    * @inheritdoc
    */
  override def saveTrackingLeg(version: BigDecimal, startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long], steps: Option[String], tags: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def saveTrackingStep(version: BigDecimal, legId: Long, startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchAccountsWithTrackingLegs(version: BigDecimal, accountId: Long, keyword: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], audienceIds: Option[String], latitude: Option[Double], longitude: Option[Double], range: Option[Double], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[AccountMiniResponse] = {
    // TODO: Implement better logic

    List.empty[AccountMiniResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchTrackingLegs(version: BigDecimal, accountId: Long, appKey: String, trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], start: Option[Int], limit: Option[Int]): List[LegResponse] = {
    // TODO: Implement better logic

    List.empty[LegResponse]
  }
}
