package api

import model.AccountLoginResponse
import model.AssetListResponse
import model.BigDecimal
import model.ProfileInfoResponse
import model.ProfileResponse
import model.SirqulResponse
import model.UserLocationSearchResponse
import model.UserSettingsResponse

/**
  * Provides a default implementation for [[AccountApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AccountApiImpl extends AccountApi {
  /**
    * @inheritdoc
    */
  override def accountLocationSearch(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], postalCode: Option[String], latitude: Option[Double], longitude: Option[Double], appKey: Option[String], range: Option[Double], locationLastUpdated: Option[Long], gender: Option[String], minAge: Option[Int], maxAge: Option[Int], companionshipIndex: Option[Int], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], searchMode: Option[String], sortField: Option[String], descending: Option[Boolean], roles: Option[String], tags: Option[String], experience: Option[String], categoryIds: Option[String], audienceIds: Option[String], audienceOperator: Option[String], updateCurrentLocation: Option[Boolean], updatePreferredSettings: Option[Boolean], showExactLocations: Option[Boolean], showConnectionToSearcher: Option[Boolean], flagCountMinimum: Option[Long], verifiedUserOnly: Option[Boolean], contentAdminOnly: Option[Boolean]): UserLocationSearchResponse = {
    // TODO: Implement better logic

    UserLocationSearchResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def blockAccount(version: BigDecimal, accountIdBeingBlocked: Long, deviceId: Option[String], accountId: Option[Long], blockFlagValue: Option[Boolean], removeFromGroupsIfBlocked: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createAccount(version: BigDecimal, username: String, password: String, name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], deviceId: Option[String], deviceIdType: Option[String], emailAddress: Option[String], assetId: Option[Long], streetAddress: Option[String], zipcode: Option[String], gender: Option[String], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], role: Option[String], platforms: Option[String], tags: Option[String], aboutUs: Option[String], gameExperience: Option[String], categoryIds: Option[String], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], latitude: Option[Double], longitude: Option[Double], acceptedTerms: Option[Boolean], inviteToken: Option[String], referralAccountId: Option[Long], sendValidation: Option[Boolean], gameType: Option[String], appKey: Option[String], appVersion: Option[String], responseType: Option[String], audienceIdsToAdd: Option[String], appBlob: Option[String], appEnablePush: Option[Boolean], appEnableSMS: Option[Boolean], appEnableEmail: Option[Boolean], locationVisibility: Option[String], homeLatitude: Option[Double], homeLongitude: Option[Double], appNickname: Option[String], personalAudienceId: Option[Long]): AccountLoginResponse = {
    // TODO: Implement better logic

    AccountLoginResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def editAccount(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], role: Option[String], assetId: Option[Long], name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], gender: Option[String], age: Option[Int], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], makeProfileInfoPublic: Option[Boolean], makeGameInfoPublic: Option[Boolean], makeFriendsInfoPublic: Option[Boolean], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], platforms: Option[String], tags: Option[String], aboutUs: Option[String], matchToken: Option[String], gameExperience: Option[String], categories: Option[String], categoryIds: Option[String], responseFilters: Option[String], showAsZipcode: Option[Boolean], showExactLocation: Option[Boolean], showOthersExactLocation: Option[Boolean], acceptedTerms: Option[Boolean], locationVisibility: Option[String], appBlob: Option[String], appEnablePush: Option[Boolean], appEnableSMS: Option[Boolean], appEnableEmail: Option[Boolean], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double], returnProfile: Option[Boolean], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], referralAccountId: Option[Long], appNickname: Option[String], personalAudienceId: Option[Long], nonGuestUsername: Option[String]): ProfileInfoResponse = {
    // TODO: Implement better logic

    ProfileInfoResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def editUsername(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], emailAddress: Option[String], username: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAccount(version: BigDecimal, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], connectionAccountEmail: Option[String], connectionAccountId: Option[Long], responseFilters: Option[String], gameType: Option[String], appKey: Option[String], purchaseType: Option[String], updateViewedDate: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getProfileAssets(version: BigDecimal, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], ownerId: Option[Long], mediaTypes: Option[String], mimeTypes: Option[String], sortField: Option[String], descending: Option[Boolean], latitude: Option[Double], longitude: Option[Double], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): AssetListResponse = {
    // TODO: Implement better logic

    AssetListResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getReferralList(version: BigDecimal, accountId: Option[Long], appKey: Option[String], retrieveType: Option[String], levelLimit: Option[BigDecimal], ancestorLevelLimit: Option[BigDecimal], childrenLevelLimit: Option[BigDecimal], ancestorListStart: Option[BigDecimal], ancestorListLimit: Option[BigDecimal], childrenListStart: Option[BigDecimal], childrenListLimit: Option[BigDecimal], childrenChildren: Option[Boolean]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): UserSettingsResponse = {
    // TODO: Implement better logic

    UserSettingsResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginDelegate(version: BigDecimal, accessToken: String, appKey: String, deviceId: Option[String], accessTokenSecret: Option[String], delegatedAccountId: Option[Long], delegatedUsername: Option[String], networkUID: Option[String], ageRestriction: Option[Int], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginGeneral(version: BigDecimal, accessToken: String, networkUID: String, appKey: String, deviceId: Option[String], deviceIdType: Option[String], accessTokenSecret: Option[String], ageRestriction: Option[Int], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], emailMatch: Option[Boolean], chosenAccountId: Option[Long], thirdPartyCredentialId: Option[Long]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginUsername(version: BigDecimal, username: String, password: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double], app: Option[String], gameType: Option[String], appKey: Option[String], returnProfile: Option[Boolean], responseFilters: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def logout(version: BigDecimal, deviceId: Option[String], deviceIdType: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def mergeAccount(version: BigDecimal, mergeAccountId: Long, appKey: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def passwordChange(version: BigDecimal, accountId: Long, oldPassword: String, newPassword: String, confirmPassword: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def passwordReset(version: BigDecimal, token: String, password: String, confirm: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def requestPasswordReset(version: BigDecimal, email: String, from: Option[String], domain: Option[String], subUrl: Option[String], referer: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def requestValidateAccount(version: BigDecimal, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchAccounts(version: BigDecimal, accountId: Long, appKey: String, keyword: Option[String], latitude: Option[Double], longitude: Option[Double], radius: Option[Double], gender: Option[String], gameExperience: Option[String], age: Option[Int], categoryIds: Option[String], returnNulls: Option[Boolean], responseFilters: Option[String], purchaseType: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[ProfileResponse] = {
    // TODO: Implement better logic

    List.empty[ProfileResponse]
  }

  /**
    * @inheritdoc
    */
  override def secureLogin(version: BigDecimal, username: String, password: String, gameType: String, deviceId: Option[String], charsetName: Option[String], latitude: Option[Double], longitude: Option[Double], returnProfile: Option[Boolean], responseFilters: Option[String]): ProfileResponse = {
    // TODO: Implement better logic

    ProfileResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def secureSignup(version: BigDecimal, deviceId: String, username: String, password: String, name: Option[String], inviteToken: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], deviceIdType: Option[String], emailAddress: Option[String], assetId: Option[Long], address: Option[String], zipcode: Option[String], gender: Option[String], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], role: Option[String], platforms: Option[String], tags: Option[String], aboutUs: Option[String], gameExperience: Option[String], categoryIds: Option[String], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], latitude: Option[Double], longitude: Option[Double], acceptedTerms: Option[Boolean], charsetName: Option[String], gameType: Option[String], appKey: Option[String], appVersion: Option[String], responseType: Option[String]): ProfileInfoResponse = {
    // TODO: Implement better logic

    ProfileInfoResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def setMatchToken(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], matchToken: Option[String], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateActveStatus(version: BigDecimal, accountId: Long, connectionAccountId: Long, active: Boolean, deviceId: Option[String], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateLocation(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], clientTime: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], blockedNotifications: Option[String], suggestionMethod: Option[String], suggestionCount: Option[Int], suggestionTimeFrame: Option[Int], showOthersExactLocation: Option[Boolean], showAsZipcode: Option[Boolean], showExactLocation: Option[Boolean], favoriteVisibility: Option[String], latitude: Option[Double], longitude: Option[Double]): UserSettingsResponse = {
    // TODO: Implement better logic

    UserSettingsResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def validateAccountSignup(version: BigDecimal, token: String): AccountLoginResponse = {
    // TODO: Implement better logic

    AccountLoginResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def validatePasswordReset(version: BigDecimal, token: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
