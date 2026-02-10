package api

import model.BigDecimal
import model.ConnectionGroupResponse
import model.ConnectionInfoResponse
import model.ConnectionListResponse
import model.ConnectionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[ConnectionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ConnectionApiImpl extends ConnectionApi {
  /**
    * @inheritdoc
    */
  override def addConnectionToGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def addConnectionsToGroup(version: BigDecimal, connectionGroupId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def addSubGroups(version: BigDecimal, returnNulls: Boolean, groupId: Long, subGroupIds: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): ConnectionGroupResponse = {
    // TODO: Implement better logic

    ConnectionGroupResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createOrUpdateConnection(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], groupId: Option[Long], gameType: Option[String], appKey: Option[String], isTrusted: Option[Boolean], ignoreFriendRequest: Option[Boolean], isContact: Option[Boolean], isBlocked: Option[Boolean], isFollowing: Option[Boolean], connectionResponse: Option[Boolean]): ConnectionResponse = {
    // TODO: Implement better logic

    ConnectionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createOrUpdateGroup(version: BigDecimal, returnNulls: Boolean, deviceId: Option[String], accountId: Option[Long], name: Option[String], groupId: Option[Long], assetId: Option[Long], connections: Option[String], description: Option[String], canViewProfileInfo: Option[Boolean], canViewGameInfo: Option[Boolean], canViewFriendInfo: Option[Boolean], active: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def followAccept(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def followReject(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def followRemove(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def followRequest(version: BigDecimal, accountId: Long, connectionAccountId: Long, appKey: String, approvalNeeded: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def friendAccept(version: BigDecimal, friendAccountId: Long, notifyFriend: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notificationMessage: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def friendReject(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notifyFriend: Option[Boolean], notificationMessage: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def friendRemove(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], notifyFriend: Option[Boolean], removeFromGroups: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def friendRequest(version: BigDecimal, friendAccountId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], appKey: Option[String], notificationMessage: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getConnectionSentFriendRequests(version: BigDecimal, deviceId: Option[String], accountId: Option[Long]): ConnectionListResponse = {
    // TODO: Implement better logic

    ConnectionListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getConnections(version: BigDecimal, returnNulls: Boolean, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], latitude: Option[Double], longitude: Option[Double]): ConnectionListResponse = {
    // TODO: Implement better logic

    ConnectionListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getGroupDetails(version: BigDecimal, combineConnections: Boolean, deviceId: Option[String], accountId: Option[Long], groupId: Option[Long], latitude: Option[Double], longitude: Option[Double]): ConnectionGroupResponse = {
    // TODO: Implement better logic

    ConnectionGroupResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def groupSearch(version: BigDecimal, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], keyword: Option[String]): List[ConnectionInfoResponse] = {
    // TODO: Implement better logic

    List.empty[ConnectionInfoResponse]
  }

  /**
    * @inheritdoc
    */
  override def removeConnectionFromGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], connectionId: Option[Long], connectionAccountId: Option[Long], pendingId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeConnectionsFromGroup(version: BigDecimal, connectionGroupId: Long, deviceId: Option[String], accountId: Option[Long], connectionIds: Option[String], connectionAccountIds: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeGroup(version: BigDecimal, returnNulls: Boolean, groupId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeSubGroups(version: BigDecimal, returnNulls: Boolean, groupId: Long, subGroupIds: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchConnections(version: BigDecimal, returnNulls: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], latitude: Option[Double], longitude: Option[Double], gameType: Option[String], appKey: Option[String], i: Option[Int], l: Option[Int], sortField: Option[String], hasLocation: Option[Boolean]): ConnectionListResponse = {
    // TODO: Implement better logic

    ConnectionListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
