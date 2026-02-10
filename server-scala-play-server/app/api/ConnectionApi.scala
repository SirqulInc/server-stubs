package api

import play.api.libs.json._
import model.BigDecimal
import model.ConnectionGroupResponse
import model.ConnectionInfoResponse
import model.ConnectionListResponse
import model.ConnectionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ConnectionApi {
  /**
    * Add Connection
    * Adds a connection to a group.
    * @param returnNulls whether to return nulls or not
    * @param groupId the group id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionId the connection id
    * @param connectionAccountId the connection account id
    * @param pendingId the pending id
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def addConnectionToGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Add Connections
    * Adds a list of connections to a group.
    * @param connectionGroupId the connection group ID
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionIds comma separated list of connection ids
    * @param connectionAccountIds comma separated list of connection account ids
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def addConnectionsToGroup(version: BigDecimal, connectionGroupId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Add Connection Groups
    * Add sub groups to a group.
    * @param returnNulls whether to return nulls or not
    * @param groupId the parent group id
    * @param subGroupIds comma separated list of group IDs to add to the parent group
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def addSubGroups(version: BigDecimal, returnNulls: Boolean, groupId: Long, subGroupIds: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): ConnectionGroupResponse

  /**
    * Create or Update Connection
    * Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionId the connection id for editing
    * @param connectionAccountId the connection account id (i.e. the account id of another user)
    * @param pendingId the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)
    * @param groupId optional group id if the user wants to add this person into a group
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param isTrusted determines whether the user is trusting this account
    * @param ignoreFriendRequest determines whether the user has set to ignore the user&#39;s friend request
    * @param isContact determines whether the user is a contact of this account
    * @param isBlocked determines whether the user is blocking this account
    * @param isFollowing determines whether the user is following this account
    * @param connectionResponse whether to return the connection response or not
    */
  def createOrUpdateConnection(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], groupId: Option[Long], gameType: Option[String], appKey: Option[String], isTrusted: Option[Boolean], ignoreFriendRequest: Option[Boolean], isContact: Option[Boolean], isBlocked: Option[Boolean], isFollowing: Option[Boolean], connectionResponse: Option[Boolean]): ConnectionResponse

  /**
    * Create or Update Connection Group
    * Creates a new private group.
    * @param returnNulls whether to return nulls or not
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param name the name of the group
    * @param groupId the group id to update a group (don&#39;t pass anything in if you want to create a new group)
    * @param assetId the asset to attach to the group
    * @param connections comma separated list of connection IDs
    * @param description the description of the group
    * @param canViewProfileInfo determines whether the connections in the group can see the user&#39;s profile info
    * @param canViewGameInfo determines whether the connections in the group can see the user&#39;s game info
    * @param canViewFriendInfo determines whether the connections in the group can see the user&#39;s friends/connections
    * @param active Sets whether the connection group is active or inactive
    * @param latitude the latitude of the group
    * @param longitude the longitude of the group
    */
  def createOrUpdateGroup(version: BigDecimal, returnNulls: Boolean, deviceId: Option[String], accountId: Option[Long], name: Option[String], groupId: Option[Long], assetId: Option[Long], connections: Option[String], description: Option[String], canViewProfileInfo: Option[Boolean], canViewGameInfo: Option[Boolean], canViewFriendInfo: Option[Boolean], active: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Accept Follow Request
    * Accept someone&#39;s follow request.
    * @param accountId the account id of the user
    * @param connectionAccountId the account ID of the user who initiated the follow
    * @param appKey the application key for sending notifications
    */
  def followAccept(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse

  /**
    * Reject Follow Request
    * Reject someone&#39;s follow request or remove them as a follower.
    * @param accountId the account id of the user
    * @param connectionAccountId the account ID of the user who initiated the follow
    * @param appKey the application key for sending notifications
    */
  def followReject(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse

  /**
    * Remove Follower / Unfollow
    * Unfollow someone you are following or remove them as a follower.
    * @param accountId the account id of the user
    * @param connectionAccountId the account ID of the user who you want to unfollow
    * @param appKey the application key for sending notifications
    */
  def followRemove(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse

  /**
    * Send Follow Request
    * Send a request to follow someone.
    * @param accountId the account id of the user
    * @param connectionAccountId the account ID of the user who you want to follow
    * @param appKey the application key for sending notifications
    * @param approvalNeeded determines if the other user needs to confirm the follow request
    */
  def followRequest(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String, approvalNeeded: Option[Boolean]): SirqulResponse

  /**
    * Accept Friend
    * Accept a friend request and optionally sends a notification.
    * @param friendAccountId the friend&#39;s account id
    * @param notifyFriend determines whether to send a notification to the afflicting party
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param notificationMessage optional message to send in a notification
    */
  def friendAccept(version: BigDecimal, friendAccountId: Long, notifyFriend: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notificationMessage: Option[String]): SirqulResponse

  /**
    * Decline Friend
    * Request a friend request and optionally sends a notification.
    * @param friendAccountId the friend&#39;s account id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param notifyFriend determines whether to send a notification to the afflicting party
    * @param notificationMessage optional message to send in a notification
    */
  def friendReject(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notifyFriend: Option[Boolean], notificationMessage: Option[String]): SirqulResponse

  /**
    * Delete Friend
    * Removes a friend from the user&#39;s friends list.
    * @param friendAccountId the account ID of the friend to remove
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param notifyFriend optionally notifies the connection that they have been removed as a friend
    * @param removeFromGroups optionally removes the connection from the user&#39;s groups
    */
  def friendRemove(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], notifyFriend: Option[Boolean], removeFromGroups: Option[Boolean]): SirqulResponse

  /**
    * Request Friend
    * Sends a friend request notification to another user.
    * @param friendAccountId the friend&#39;s account id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType This parameter is deprecated.
    * @param appKey the application key
    * @param notificationMessage optional message to send in a notification
    */
  def friendRequest(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notificationMessage: Option[String]): SirqulResponse

  /**
    * Get Sent Friend Requests
    * Gets the connection sent friend requests.
    * @param deviceId the ID of the device
    * @param accountId the id of the account
    */
  def getConnectionSentFriendRequests(version: BigDecimal, deviceId: Option[String], accountId: Option[Long]): ConnectionListResponse

  /**
    * Search Connections
    * Gets the connections.
    * @param returnNulls whether to return nulls or not
    * @param filter a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)
    * @param sortField sorts the response list by ConnectionApiMap
    * @param descending sorts the response list by descending order if true
    * @param start start index of the pagination
    * @param limit limit of the pagination
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id (deviceId or accountId required)
    * @param connectionAccountId optional parameter to search on other account&#39;s connections
    * @param q This parameter is deprecated.
    * @param keyword an optional keyword to search on, this parameter is ignored if empty
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def getConnections(version: BigDecimal, returnNulls: Boolean, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], latitude: Option[Double], longitude: Option[Double]): ConnectionListResponse

  /**
    * Get Connection Group
    * @param combineConnections whether to combine connections or not
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param groupId the group id
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def getGroupDetails(version: BigDecimal, combineConnections: Boolean, deviceId: Option[String], accountId: Option[Long], groupId: Option[Long], latitude: Option[Double], longitude: Option[Double]): ConnectionGroupResponse

  /**
    * Search Connection Groups
    * Gets a user&#39;s private groups and default groups.
    * @param sortField the field to sort by
    * @param descending whether to return results in descending or ascending order
    * @param activeOnly to search on active only or not
    * @param start The start of the pagination
    * @param limit the limit of the pagination
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param keyword keyword search string
    */
  def groupSearch(version: BigDecimal, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String]): List[ConnectionInfoResponse]

  /**
    * Delete Connection
    * Removes the connection from group.
    * @param returnNulls whether to return nulls or not
    * @param groupId the group id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionId the connection id
    * @param connectionAccountId the connection account id
    * @param pendingId the pending id
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def removeConnectionFromGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Remove Connections
    * Remove a list of connections from a group.
    * @param connectionGroupId connection group id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionIds comma separated list of connection ids
    * @param connectionAccountIds comma separated list of connection account ids
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def removeConnectionsFromGroup(version: BigDecimal, connectionGroupId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Delete Connection Group
    * Remove a user&#39;s group.
    * @param returnNulls whether to return nulls or not
    * @param groupId the group id
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def removeGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Remove Connection Groups
    * Remove sub groups from a group
    * @param returnNulls whether to return nulls or not
    * @param groupId the parent group id
    * @param subGroupIds comma separated list of group IDs to remove from the parent group
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def removeSubGroups(version: BigDecimal, returnNulls: Boolean, groupId: Long, subGroupIds: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Search Possible Connections
    * Search for accounts that the user may not have a connection with.
    * @param returnNulls return all json attributes if true. defualt is true.
    * @param start start index of the pagination
    * @param limit limit of the pagination
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id (deviceId or accountId required)
    * @param q This parameter is deprecated.
    * @param keyword keyword to search on, optional and this parameter is ignored if empt
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param gameType This parameter is deprecated.
    * @param appKey the public application key, if provided only looks for users of that application
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param sortField the field to sort on
    * @param hasLocation whether the search has location or not
    */
  def searchConnections(version: BigDecimal, returnNulls: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double], gameType: Option[String], appKey: Option[String], i: Option[Int], l: Option[Int], sortField: Option[String], hasLocation: Option[Boolean]): ConnectionListResponse
}
