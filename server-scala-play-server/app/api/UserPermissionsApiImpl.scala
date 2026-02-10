package api

import model.BigDecimal
import model.SirqulResponse
import model.UserPermissionsResponse

/**
  * Provides a default implementation for [[UserPermissionsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class UserPermissionsApiImpl extends UserPermissionsApi {
  /**
    * @inheritdoc
    */
  override def addUsersToPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], read: Option[Boolean], write: Option[Boolean], delete: Option[Boolean], add: Option[Boolean], connectionIds: Option[String], connectionAccountIds: Option[String], connectionGroupIds: Option[String], pending: Option[Boolean], admin: Option[Boolean], includeFriendGroup: Option[Boolean], latitude: Option[Double], longitude: Option[Double], audienceIds: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def approvePermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], approvalStatus: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def leaveFromPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeUsersFromPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], connectionGroupIds: Option[String], removeFriendGroup: Option[Boolean], latitude: Option[Double], longitude: Option[Double], audienceIds: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchPermissionables(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], connectionAccountIds: Option[String], permissionableType: Option[String], permissionableId: Option[Long], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], pending: Option[Boolean], admin: Option[Boolean], start: Option[Int], limit: Option[Int]): List[UserPermissionsResponse] = {
    // TODO: Implement better logic

    List.empty[UserPermissionsResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchPermissionablesFollowingDistance(version: BigDecimal, latitude: Double, longitude: Double, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], connectionAccountIds: Option[String], permissionableType: Option[String], permissionableId: Option[Long], searchRange: Option[Double], keyword: Option[String], pending: Option[Boolean], admin: Option[Boolean], start: Option[Int], limit: Option[Int]): List[UserPermissionsResponse] = {
    // TODO: Implement better logic

    List.empty[UserPermissionsResponse]
  }
}
