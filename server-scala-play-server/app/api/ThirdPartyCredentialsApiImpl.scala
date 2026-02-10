package api

import model.BigDecimal
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThirdPartyCredentialResponse
import model.ThirdPartyNetworkResponse
import model.ThirdPartyNetworkShortResponse

/**
  * Provides a default implementation for [[ThirdPartyCredentialsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ThirdPartyCredentialsApiImpl extends ThirdPartyCredentialsApi {
  /**
    * @inheritdoc
    */
  override def createCredential(version: BigDecimal, thirdPartyId: String, thirdPartyToken: String, networkUID: String, appKey: String, accountId: Option[Long], deviceId: Option[String], sessionId: Option[String], thirdPartyName: Option[String], emailAddress: Option[String], signinOnlyMode: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], thirdPartyRefreshToken: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createNetwork(version: BigDecimal, accountId: Long, name: String, enableIntrospection: Boolean, description: Option[String], introspectionMethod: Option[String], introspectionURL: Option[String], introspectionParams: Option[String], requiredRootField: Option[String], enableMFA: Option[Boolean], sizeMFA: Option[Int], shelfLifeMFA: Option[Int], oauthTokenURL: Option[String], oauthPrivateKey: Option[TemporaryFile], oauthPublicKey: Option[TemporaryFile], oauthClientId: Option[String], oauthSecretKey: Option[String], body: Option[String]): ThirdPartyNetworkResponse = {
    // TODO: Implement better logic

    ThirdPartyNetworkResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteCredential(version: BigDecimal, accountId: Long, networkUID: String, thirdPartyId: String, appKey: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteNetwork(version: BigDecimal, accountId: Long, networkUID: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getCredential(version: BigDecimal, networkUID: String, appKey: String, accountId: Option[Long], deviceId: Option[String], sessionId: Option[String], thirdPartyCredentialId: Option[Long], thirdPartyToken: Option[String], thirdPartySecret: Option[String], createNewAccount: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], referralAccountId: Option[Long]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getNetwork(version: BigDecimal, accountId: Long, networkUID: String): ThirdPartyNetworkResponse = {
    // TODO: Implement better logic

    ThirdPartyNetworkResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchCredentials(version: BigDecimal, accountId: Long, keyword: Option[String], networkUID: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[ThirdPartyCredentialResponse] = {
    // TODO: Implement better logic

    List.empty[ThirdPartyCredentialResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchNetworks(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], filterBillable: Option[Boolean]): List[ThirdPartyNetworkShortResponse] = {
    // TODO: Implement better logic

    List.empty[ThirdPartyNetworkShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def sendMFAChallenge(version: BigDecimal, networkUID: String, appKey: String, thirdPartyToken: Option[String], thirdPartyCredentialId: Option[Long], deviceId: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateCredential(version: BigDecimal, networkUID: String, thirdPartyId: String, appKey: String, deviceId: Option[String], thirdPartyName: Option[String], thirdPartyToken: Option[String], responseFilters: Option[String], metaData: Option[String], thirdPartyRefreshToken: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateNetwork(version: BigDecimal, accountId: Long, networkUID: String, name: Option[String], description: Option[String], enableIntrospection: Option[Boolean], introspectionMethod: Option[String], introspectionURL: Option[String], introspectionParams: Option[String], requiredRootField: Option[String], enableMFA: Option[Boolean], sizeMFA: Option[Int], shelfLifeMFA: Option[Int], oauthTokenURL: Option[String], oauthPrivateKey: Option[TemporaryFile], oauthPublicKey: Option[TemporaryFile], oauthClientId: Option[String], oauthSecretKey: Option[String], body: Option[String]): ThirdPartyNetworkResponse = {
    // TODO: Implement better logic

    ThirdPartyNetworkResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
