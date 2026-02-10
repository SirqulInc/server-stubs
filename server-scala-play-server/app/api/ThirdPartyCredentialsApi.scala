package api

import play.api.libs.json._
import model.BigDecimal
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThirdPartyCredentialResponse
import model.ThirdPartyNetworkResponse
import model.ThirdPartyNetworkShortResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ThirdPartyCredentialsApi {
  /**
    * Create Credential
    * This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user&#39;s third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. 
    * @param thirdPartyId the third party user account id
    * @param thirdPartyToken the access token to authenticate with (ex: username or fb token or phone number)
    * @param networkUID the access provider to authenticate against
    * @param appKey the application key
    * @param accountId the unique id of the account that needs authenticating (optional for PHONE_V2)
    * @param deviceId the unique id of the device making the request
    * @param sessionId the session id for the request
    * @param thirdPartyName the third party user&#39;s display name
    * @param emailAddress optional email address associated with the third party account
    * @param signinOnlyMode when true will error out if can&#39;t find any accounts matching (signin only)
    * @param responseFilters this determines how much of the profile should be returned, see ProfileFilters
    * @param latitude the latitude of the user
    * @param longitude the longitude of the user
    * @param metaData External custom client defined data
    * @param thirdPartyRefreshToken optional refresh token for the third party
    * @param audienceIdsToAdd audience ids to add to the account
    * @param audienceIdsToRemove audience ids to remove from the account
    */
  def createCredential(version: BigDecimal, thirdPartyId: String, thirdPartyToken: String, networkUID: String, appKey: String, accountId: Option[Long], deviceId: Option[String], sessionId: Option[String], thirdPartyName: Option[String], emailAddress: Option[String], signinOnlyMode: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], thirdPartyRefreshToken: Option[String], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String]): ProfileResponse

  /**
    * Create Network
    * Creates a custom third party network.
    * @param accountId The account id making the request
    * @param name The name of the network
    * @param enableIntrospection Whether the network uses introspection calls
    * @param description The description of the network
    * @param introspectionMethod HTTP method to use for introspection calls (e.g., GET, POST)
    * @param introspectionURL The HTTP URL of the introspection call
    * @param introspectionParams The parameters of the introspection call
    * @param requiredRootField Required response params
    * @param enableMFA Whether this network uses MFA
    * @param sizeMFA Size of the MFA token
    * @param shelfLifeMFA Shelf life (seconds) of the MFA token
    * @param oauthTokenURL OAuth token endpoint URL
    * @param oauthPrivateKey OAuth private key file (multipart)
    * @param oauthPublicKey OAuth public key file (multipart)
    * @param oauthClientId OAuth client id
    * @param oauthSecretKey OAuth secret key
    */
  def createNetwork(version: BigDecimal, accountId: Long, name: String, enableIntrospection: Boolean, description: Option[String], introspectionMethod: Option[String], introspectionURL: Option[String], introspectionParams: Option[String], requiredRootField: Option[String], enableMFA: Option[Boolean], sizeMFA: Option[Int], shelfLifeMFA: Option[Int], oauthTokenURL: Option[String], oauthPrivateKey: Option[TemporaryFile], oauthPublicKey: Option[TemporaryFile], oauthClientId: Option[String], oauthSecretKey: Option[String], body: Option[String]): ThirdPartyNetworkResponse

  /**
    * Delete Credential
    * Delete a third party network on a Sirqul account.
    * @param accountId The account id of the user
    * @param networkUID The third party network identifier
    * @param thirdPartyId The third party user id
    * @param appKey the application key
    */
  def deleteCredential(version: BigDecimal, accountId: Long, networkUID: String, thirdPartyId: String, appKey: String): SirqulResponse

  /**
    * Delete Network
    * Marks a custom third party network as deleted. Only the network owners and managers have access to this.
    * @param accountId the id of the logged in user
    * @param networkUID The unique identifier for the third party network defined by Sirqul
    */
  def deleteNetwork(version: BigDecimal, accountId: Long, networkUID: String): SirqulResponse

  /**
    * Get Credential
    * Gets the account information given a third party token.
    * @param networkUID the access provider to authenticate against
    * @param appKey the application key
    * @param accountId the unique account id of a specific account that will be bound to the third-party credentials
    * @param deviceId the unique id of the device making the request
    * @param sessionId the session id for the request
    * @param thirdPartyCredentialId the third-party credentials id from the response of the credential/create step
    * @param thirdPartyToken the access token to authenticate with
    * @param thirdPartySecret the secret code to authenticate with (used for MFA)
    * @param createNewAccount flag to force creation of a new account when no accountId is passed and user chooses not to use listed accounts
    * @param responseFilters this determines how much of the profile should be returned, see ProfileFilters
    * @param latitude the latitude of the user
    * @param longitude the longitude of the user
    * @param audienceIdsToAdd audience ids to add to the account
    * @param audienceIdsToRemove audience ids to remove from the account
    * @param referralAccountId account id of the referrer (inviter-invitee relationship)
    */
  def getCredential(version: BigDecimal, networkUID: String, appKey: String, accountId: Option[Long], deviceId: Option[String], sessionId: Option[String], thirdPartyCredentialId: Option[Long], thirdPartyToken: Option[String], thirdPartySecret: Option[String], createNewAccount: Option[Boolean], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], referralAccountId: Option[Long]): ProfileResponse

  /**
    * Get Network
    * Get the details of a third party network. Only the network owners and managers have access to this.
    * @param accountId The account id making the request
    * @param networkUID The unique identifier for the third party network defined by Sirqul
    */
  def getNetwork(version: BigDecimal, accountId: Long, networkUID: String): ThirdPartyNetworkResponse

  /**
    * Search Credentials
    * Search on a user&#39;s linked third party networks.
    * @param accountId The account id of the user
    * @param keyword The keyword used to search on the third party name and network string
    * @param networkUID The network UID to filter results with
    * @param descending The order to return the search results
    * @param start The start of the pagination
    * @param limit The limit of the pagination
    */
  def searchCredentials(version: BigDecimal, accountId: Long, keyword: Option[String], networkUID: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[ThirdPartyCredentialResponse]

  /**
    * Search Networks
    * Search on supported third party networks and custom networks from external users.
    * @param accountId The account id making the request
    * @param sortField The column to sort the search on, possible values include: UPDATED (default), CREATED, NAME
    * @param descending The order to return the search results
    * @param start The start of the pagination
    * @param limit The limit of the pagination
    * @param activeOnly Return only active results
    * @param keyword The keyword used to search on the network name and description fields
    * @param filterBillable Determines whether to only return applications that the user has access to
    */
  def searchNetworks(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, keyword: Option[String], filterBillable: Option[Boolean]): List[ThirdPartyNetworkShortResponse]

  /**
    * Send MFA Challenge
    * Sends an MFA challenge (SMS or Email) for networks with MFA enabled.
    * @param networkUID the third party network provider that has MFA enabled
    * @param appKey the application key
    * @param thirdPartyToken the access token to authenticate with
    * @param thirdPartyCredentialId optional id of the existing third party credential
    * @param deviceId the unique id of the device making the request
    */
  def sendMFAChallenge(version: BigDecimal, networkUID: String, appKey: String, thirdPartyToken: Option[String], thirdPartyCredentialId: Option[Long], deviceId: Option[String]): SirqulResponse

  /**
    * Update Credential
    * Updates a third-party login for an account.
    * @param networkUID the access provider to authenticate against
    * @param thirdPartyId the third party user account id
    * @param appKey the application key
    * @param deviceId the unique id of the device making the request
    * @param thirdPartyName the third party user name
    * @param thirdPartyToken the access token to authenticate with (ex: username or fb token)
    * @param responseFilters this determines how much of the profile should be returned, see ProfileFilters
    * @param metaData External custom client defined data
    * @param thirdPartyRefreshToken optional refresh token for the third party
    */
  def updateCredential(version: BigDecimal, networkUID: String, thirdPartyId: String, appKey: String, deviceId: Option[String], thirdPartyName: Option[String], thirdPartyToken: Option[String], responseFilters: Option[String], metaData: Option[String], thirdPartyRefreshToken: Option[String]): ProfileResponse

  /**
    * Update Network
    * Updates a custom third party network. Only the network owners and managers have access to this.
    * @param accountId The account id making the request
    * @param networkUID The unique identifier for the third party network defined by Sirqul
    * @param name The name of the network
    * @param description The description of the network
    * @param enableIntrospection Whether the network uses introspection calls
    * @param introspectionMethod HTTP method to use for introspection calls (e.g., GET, POST)
    * @param introspectionURL The HTTP URL of the introspection call
    * @param introspectionParams The parameters of the introspection call
    * @param requiredRootField Required response params
    * @param enableMFA Whether this network uses MFA
    * @param sizeMFA Size of the MFA token
    * @param shelfLifeMFA Shelf life (seconds) of the MFA token
    * @param oauthTokenURL OAuth token endpoint URL
    * @param oauthPrivateKey OAuth private key file (multipart)
    * @param oauthPublicKey OAuth public key file (multipart)
    * @param oauthClientId OAuth client id
    * @param oauthSecretKey OAuth secret key
    */
  def updateNetwork(version: BigDecimal, accountId: Long, networkUID: String, name: Option[String], description: Option[String], enableIntrospection: Option[Boolean], introspectionMethod: Option[String], introspectionURL: Option[String], introspectionParams: Option[String], requiredRootField: Option[String], enableMFA: Option[Boolean], sizeMFA: Option[Int], shelfLifeMFA: Option[Int], oauthTokenURL: Option[String], oauthPrivateKey: Option[TemporaryFile], oauthPublicKey: Option[TemporaryFile], oauthClientId: Option[String], oauthSecretKey: Option[String], body: Option[String]): ThirdPartyNetworkResponse
}
