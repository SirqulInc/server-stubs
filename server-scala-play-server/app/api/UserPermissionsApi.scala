package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.UserPermissionsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait UserPermissionsApi {
  /**
    * Add User
    * Adds a user to a permissionable object.
    * @param permissionableType the permissionable type of the object
    * @param permissionableId the id of the permissionable object
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param read the read permission of the users/groups
    * @param write the write permission of the users/groups
    * @param delete the delete permission of the users/groups
    * @param add the add permission of the users/groups
    * @param connectionIds a comma separated list of connection ids (NOT the account ids)
    * @param connectionAccountIds a comma separated list of account ids
    * @param connectionGroupIds a comma separated list of connection group ids (these are groups made by the user)
    * @param pending sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)
    * @param admin sets whether the added users will become admins or not
    * @param includeFriendGroup flag to determine whether to include the built-in \&quot;friends\&quot; group
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param audienceIds comma separated list of audience ids. This is a feature only available to the permissionable&#39;s application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.
    */
  def addUsersToPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], read: Option[Boolean], write: Option[Boolean], delete: Option[Boolean], add: Option[Boolean], connectionIds: Option[String], connectionAccountIds: Option[String], connectionGroupIds: Option[String], pending: Option[Boolean], admin: Option[Boolean], includeFriendGroup: Option[Boolean], latitude: Option[Double], longitude: Option[Double], audienceIds: Option[String]): SirqulResponse

  /**
    * Approve Permissionable
    * Sets the approval status of a permissionable object.
    * @param permissionableType The permissionable type of the object
    * @param permissionableId The id of the permissionable object
    * @param deviceId A unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param approvalStatus The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    */
  def approvePermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], approvalStatus: Option[String]): SirqulResponse

  /**
    * Leave
    * Used when the user wants to leave from someone else&#39;s permissionable object
    * @param permissionableType the permissionable type PermissionableType
    * @param permissionableId the id of the permissionable object
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def leaveFromPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Remove User
    * Used to remove someone (assuming they have permission) from a permissionable object
    * @param permissionableType the permissionable type of the object
    * @param permissionableId the id of the permissionable object
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionIds a comma separated list of connection ids (NOT the account ids)
    * @param connectionAccountIds a comma separated list of account ids
    * @param connectionGroupIds a comma separated list of connection group ids (these are groups made by the user)
    * @param removeFriendGroup flag to determine whether to remove the built-in \&quot;friends\&quot; group
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param audienceIds comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.
    */
  def removeUsersFromPermissionable(version: BigDecimal, permissionableType: String, permissionableId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], connectionGroupIds: Option[String], removeFriendGroup: Option[Boolean], latitude: Option[Double], longitude: Option[Double], audienceIds: Option[String]): SirqulResponse

  /**
    * Search Permissionables
    * Search on UserPermissions
    * @param deviceId A unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param connectionAccountId Filter results for a specific user account
    * @param connectionAccountIds Comma separated list of account IDs to filter results with
    * @param permissionableType Filter user permissions by the permissionable object type
    * @param permissionableId The id of the permissionable object to filter by
    * @param keyword Keyword to search within permissionable records
    * @param sortField Field to sort results on
    * @param descending Sort descending when true
    * @param pending Return user permissions that are pending
    * @param admin Return user permissions that are admins
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def searchPermissionables(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], connectionAccountIds: Option[String], permissionableType: Option[String], permissionableId: Option[Long], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], pending: Option[Boolean], admin: Option[Boolean], start: Option[Int], limit: Option[Int]): List[UserPermissionsResponse]

  /**
    * Search Permissionables by Distnace
    * Search on UserPermissions by distance
    * @param latitude The latitude of the current account
    * @param longitude The longitude of the current account
    * @param deviceId A unique ID given by the device (deviceId or accountId required)
    * @param accountId The account ID of the user (deviceId or accountId required)
    * @param connectionAccountId Filter results for a specific user account
    * @param connectionAccountIds Comma separated list of account IDs to filter results with
    * @param permissionableType Filter user permissions by the permissionable object type
    * @param permissionableId The id of the permissionable object to filter by
    * @param searchRange The search range in miles
    * @param keyword Keyword to search within permissionable records
    * @param pending Return user permissions that are pending
    * @param admin Return user permissions that are admins
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def searchPermissionablesFollowingDistance(version: BigDecimal, latitude: Double, longitude: Double, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], connectionAccountIds: Option[String], permissionableType: Option[String], permissionableId: Option[Long], searchRange: Option[Double], keyword: Option[String], pending: Option[Boolean], admin: Option[Boolean], start: Option[Int], limit: Option[Int]): List[UserPermissionsResponse]
}
