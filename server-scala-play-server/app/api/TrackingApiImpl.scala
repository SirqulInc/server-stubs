package api

import model.AccountMiniResponse
import model.Leg
import model.LegResponse
import model.PredictedLocationResponse
import model.PreferredLocationResponse
import model.SirqulResponse
import model.StepResponse

/**
  * Provides a default implementation for [[TrackingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TrackingApiImpl extends TrackingApi {
  /**
    * @inheritdoc
    */
  override def batchSaveTracking(data: String, deviceId: Option[String], accountId: Option[Long], generateAccounts: Option[Boolean], updateAccountLocations: Option[Boolean], defaultTag: Option[String], slaveUID: Option[String]): List[Leg] = {
    // TODO: Implement better logic

    List.empty[Leg]
  }

  /**
    * @inheritdoc
    */
  override def getPredictedLocations(accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], threshold: Option[Long], distanceUnit: Option[String], searchRange: Option[Double], sortOrder: Option[String]): PredictedLocationResponse = {
    // TODO: Implement better logic

    PredictedLocationResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getPredictedPath(accountId: Long, startStepId: Long, endStepId: Long): List[StepResponse] = {
    // TODO: Implement better logic

    List.empty[StepResponse]
  }

  /**
    * @inheritdoc
    */
  override def getPreferredLocations(accountId: Long, latitude: Option[Double], longitude: Option[Double], dateCheck: Option[Long], hourCheck: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], searchRange: Option[Double], distanceUnit: Option[String]): List[PreferredLocationResponse] = {
    // TODO: Implement better logic

    List.empty[PreferredLocationResponse]
  }

  /**
    * @inheritdoc
    */
  override def getTrackingLegs(deviceId: Option[String], accountId: Option[Long], ownerId: Option[Long], trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], getLastPoint: Option[Boolean]): List[LegResponse] = {
    // TODO: Implement better logic

    List.empty[LegResponse]
  }

  /**
    * @inheritdoc
    */
  override def saveTrackingLeg(startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long], steps: Option[String], tags: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def saveTrackingStep(legId: Long, startLat: Double, startLng: Double, startDate: Long, endLat: Double, endLng: Double, endDate: Long, deviceId: Option[String], accountId: Option[Long], distance: Option[Double], duration: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchAccountsWithTrackingLegs(accountId: Long, keyword: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], audienceIds: Option[String], latitude: Option[Double], longitude: Option[Double], range: Option[Double], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[AccountMiniResponse] = {
    // TODO: Implement better logic

    List.empty[AccountMiniResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchTrackingLegs(accountId: Long, appKey: String, trackingDeviceId: Option[String], startDate: Option[Long], endDate: Option[Long], tags: Option[String], start: Option[Int], limit: Option[Int]): List[LegResponse] = {
    // TODO: Implement better logic

    List.empty[LegResponse]
  }
}
