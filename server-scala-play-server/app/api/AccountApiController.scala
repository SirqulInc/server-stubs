package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountLoginResponse
import model.AssetListResponse
import model.BigDecimal
import model.ProfileInfoResponse
import model.ProfileResponse
import model.SirqulResponse
import model.UserLocationSearchResponse
import model.UserSettingsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AccountApiController @Inject()(cc: ControllerComponents, api: AccountApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/account/search?deviceId=[value]&accountId=[value]&q=[value]&keyword=[value]&postalCode=[value]&latitude=[value]&longitude=[value]&appKey=[value]&range=[value]&locationLastUpdated=[value]&gender=[value]&minAge=[value]&maxAge=[value]&companionshipIndex=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&searchMode=[value]&sortField=[value]&descending=[value]&roles=[value]&tags=[value]&experience=[value]&categoryIds=[value]&audienceIds=[value]&audienceOperator=[value]&updateCurrentLocation=[value]&updatePreferredSettings=[value]&showExactLocations=[value]&showConnectionToSearcher=[value]&flagCountMinimum=[value]&verifiedUserOnly=[value]&contentAdminOnly=[value]
    */
  def accountLocationSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): UserLocationSearchResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val postalCode = request.getQueryString("postalCode")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val appKey = request.getQueryString("appKey")
        
      val range = request.getQueryString("range")
        .map(value => value.toDouble)
        
      val locationLastUpdated = request.getQueryString("locationLastUpdated")
        .map(value => value.toLong)
        
      val gender = request.getQueryString("gender")
        
      val minAge = request.getQueryString("minAge")
        .map(value => value.toInt)
        
      val maxAge = request.getQueryString("maxAge")
        .map(value => value.toInt)
        
      val companionshipIndex = request.getQueryString("companionshipIndex")
        .map(value => value.toInt)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val searchMode = request.getQueryString("searchMode")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val roles = request.getQueryString("roles")
        
      val tags = request.getQueryString("tags")
        
      val experience = request.getQueryString("experience")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val audienceOperator = request.getQueryString("audienceOperator")
        
      val updateCurrentLocation = request.getQueryString("updateCurrentLocation")
        .map(value => value.toBoolean)
        
      val updatePreferredSettings = request.getQueryString("updatePreferredSettings")
        .map(value => value.toBoolean)
        
      val showExactLocations = request.getQueryString("showExactLocations")
        .map(value => value.toBoolean)
        
      val showConnectionToSearcher = request.getQueryString("showConnectionToSearcher")
        .map(value => value.toBoolean)
        
      val flagCountMinimum = request.getQueryString("flagCountMinimum")
        .map(value => value.toLong)
        
      val verifiedUserOnly = request.getQueryString("verifiedUserOnly")
        .map(value => value.toBoolean)
        
      val contentAdminOnly = request.getQueryString("contentAdminOnly")
        .map(value => value.toBoolean)
        
      api.accountLocationSearch(version, deviceId, accountId, q, keyword, postalCode, latitude, longitude, appKey, range, locationLastUpdated, gender, minAge, maxAge, companionshipIndex, i, start, l, limit, searchMode, sortField, descending, roles, tags, experience, categoryIds, audienceIds, audienceOperator, updateCurrentLocation, updatePreferredSettings, showExactLocations, showConnectionToSearcher, flagCountMinimum, verifiedUserOnly, contentAdminOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/block?deviceId=[value]&accountId=[value]&accountIdBeingBlocked=[value]&blockFlagValue=[value]&removeFromGroupsIfBlocked=[value]&latitude=[value]&longitude=[value]
    */
  def blockAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val accountIdBeingBlocked = request.getQueryString("accountIdBeingBlocked")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountIdBeingBlocked", "query string")
        }
        
      val blockFlagValue = request.getQueryString("blockFlagValue")
        .map(value => value.toBoolean)
        
      val removeFromGroupsIfBlocked = request.getQueryString("removeFromGroupsIfBlocked")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.blockAccount(version, accountIdBeingBlocked, deviceId, accountId, blockFlagValue, removeFromGroupsIfBlocked, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/create?name=[value]&prefixName=[value]&firstName=[value]&middleName=[value]&lastName=[value]&suffixName=[value]&title=[value]&deviceId=[value]&deviceIdType=[value]&username=[value]&password=[value]&emailAddress=[value]&assetId=[value]&streetAddress=[value]&zipcode=[value]&gender=[value]&birthday=[value]&homePhone=[value]&cellPhone=[value]&cellPhoneCarrier=[value]&businessPhone=[value]&role=[value]&platforms=[value]&tags=[value]&aboutUs=[value]&gameExperience=[value]&categoryIds=[value]&hometown=[value]&height=[value]&heightIndex=[value]&ethnicity=[value]&bodyType=[value]&maritalStatus=[value]&children=[value]&religion=[value]&education=[value]&educationIndex=[value]&smoke=[value]&drink=[value]&companionship=[value]&companionshipIndex=[value]&preferredMinAge=[value]&preferredMaxAge=[value]&preferredMinHeight=[value]&preferredMaxHeight=[value]&preferredGender=[value]&preferredEducation=[value]&preferredEducationIndex=[value]&preferredBodyType=[value]&preferredEthnicity=[value]&preferredLocation=[value]&preferredLocationRange=[value]&latitude=[value]&longitude=[value]&acceptedTerms=[value]&inviteToken=[value]&referralAccountId=[value]&sendValidation=[value]&gameType=[value]&appKey=[value]&appVersion=[value]&responseType=[value]&audienceIdsToAdd=[value]&appBlob=[value]&appEnablePush=[value]&appEnableSMS=[value]&appEnableEmail=[value]&locationVisibility=[value]&homeLatitude=[value]&homeLongitude=[value]&appNickname=[value]&personalAudienceId=[value]
    */
  def createAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AccountLoginResponse = {
      val name = request.getQueryString("name")
        
      val prefixName = request.getQueryString("prefixName")
        
      val firstName = request.getQueryString("firstName")
        
      val middleName = request.getQueryString("middleName")
        
      val lastName = request.getQueryString("lastName")
        
      val suffixName = request.getQueryString("suffixName")
        
      val title = request.getQueryString("title")
        
      val deviceId = request.getQueryString("deviceId")
        
      val deviceIdType = request.getQueryString("deviceIdType")
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val zipcode = request.getQueryString("zipcode")
        
      val gender = request.getQueryString("gender")
        
      val birthday = request.getQueryString("birthday")
        .map(value => value.toLong)
        
      val homePhone = request.getQueryString("homePhone")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val cellPhoneCarrier = request.getQueryString("cellPhoneCarrier")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val role = request.getQueryString("role")
        
      val platforms = request.getQueryString("platforms")
        
      val tags = request.getQueryString("tags")
        
      val aboutUs = request.getQueryString("aboutUs")
        
      val gameExperience = request.getQueryString("gameExperience")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val hometown = request.getQueryString("hometown")
        
      val height = request.getQueryString("height")
        
      val heightIndex = request.getQueryString("heightIndex")
        .map(value => value.toInt)
        
      val ethnicity = request.getQueryString("ethnicity")
        
      val bodyType = request.getQueryString("bodyType")
        
      val maritalStatus = request.getQueryString("maritalStatus")
        
      val children = request.getQueryString("children")
        
      val religion = request.getQueryString("religion")
        
      val education = request.getQueryString("education")
        
      val educationIndex = request.getQueryString("educationIndex")
        .map(value => value.toInt)
        
      val smoke = request.getQueryString("smoke")
        
      val drink = request.getQueryString("drink")
        
      val companionship = request.getQueryString("companionship")
        
      val companionshipIndex = request.getQueryString("companionshipIndex")
        .map(value => value.toInt)
        
      val preferredMinAge = request.getQueryString("preferredMinAge")
        .map(value => value.toInt)
        
      val preferredMaxAge = request.getQueryString("preferredMaxAge")
        .map(value => value.toInt)
        
      val preferredMinHeight = request.getQueryString("preferredMinHeight")
        .map(value => value.toInt)
        
      val preferredMaxHeight = request.getQueryString("preferredMaxHeight")
        .map(value => value.toInt)
        
      val preferredGender = request.getQueryString("preferredGender")
        
      val preferredEducation = request.getQueryString("preferredEducation")
        
      val preferredEducationIndex = request.getQueryString("preferredEducationIndex")
        .map(value => value.toInt)
        
      val preferredBodyType = request.getQueryString("preferredBodyType")
        
      val preferredEthnicity = request.getQueryString("preferredEthnicity")
        
      val preferredLocation = request.getQueryString("preferredLocation")
        
      val preferredLocationRange = request.getQueryString("preferredLocationRange")
        .map(value => value.toDouble)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val acceptedTerms = request.getQueryString("acceptedTerms")
        .map(value => value.toBoolean)
        
      val inviteToken = request.getQueryString("inviteToken")
        
      val referralAccountId = request.getQueryString("referralAccountId")
        .map(value => value.toLong)
        
      val sendValidation = request.getQueryString("sendValidation")
        .map(value => value.toBoolean)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val appVersion = request.getQueryString("appVersion")
        
      val responseType = request.getQueryString("responseType")
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val appBlob = request.getQueryString("appBlob")
        
      val appEnablePush = request.getQueryString("appEnablePush")
        .map(value => value.toBoolean)
        
      val appEnableSMS = request.getQueryString("appEnableSMS")
        .map(value => value.toBoolean)
        
      val appEnableEmail = request.getQueryString("appEnableEmail")
        .map(value => value.toBoolean)
        
      val locationVisibility = request.getQueryString("locationVisibility")
        
      val homeLatitude = request.getQueryString("homeLatitude")
        .map(value => value.toDouble)
        
      val homeLongitude = request.getQueryString("homeLongitude")
        .map(value => value.toDouble)
        
      val appNickname = request.getQueryString("appNickname")
        
      val personalAudienceId = request.getQueryString("personalAudienceId")
        .map(value => value.toLong)
        
      api.createAccount(version, username, password, name, prefixName, firstName, middleName, lastName, suffixName, title, deviceId, deviceIdType, emailAddress, assetId, streetAddress, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, inviteToken, referralAccountId, sendValidation, gameType, appKey, appVersion, responseType, audienceIdsToAdd, appBlob, appEnablePush, appEnableSMS, appEnableEmail, locationVisibility, homeLatitude, homeLongitude, appNickname, personalAudienceId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/profile/update?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&role=[value]&assetId=[value]&name=[value]&prefixName=[value]&firstName=[value]&middleName=[value]&lastName=[value]&suffixName=[value]&title=[value]&gender=[value]&age=[value]&birthday=[value]&homePhone=[value]&cellPhone=[value]&cellPhoneCarrier=[value]&businessPhone=[value]&emailAddress=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&zipcode=[value]&country=[value]&makeProfileInfoPublic=[value]&makeGameInfoPublic=[value]&makeFriendsInfoPublic=[value]&hometown=[value]&height=[value]&heightIndex=[value]&ethnicity=[value]&bodyType=[value]&maritalStatus=[value]&children=[value]&religion=[value]&education=[value]&educationIndex=[value]&smoke=[value]&drink=[value]&companionship=[value]&companionshipIndex=[value]&preferredMinAge=[value]&preferredMaxAge=[value]&preferredMinHeight=[value]&preferredMaxHeight=[value]&preferredGender=[value]&preferredEducation=[value]&preferredEducationIndex=[value]&preferredBodyType=[value]&preferredEthnicity=[value]&preferredLocation=[value]&preferredLocationRange=[value]&platforms=[value]&tags=[value]&aboutUs=[value]&matchToken=[value]&gameExperience=[value]&categories=[value]&categoryIds=[value]&responseFilters=[value]&showAsZipcode=[value]&showExactLocation=[value]&showOthersExactLocation=[value]&acceptedTerms=[value]&locationVisibility=[value]&appBlob=[value]&appEnablePush=[value]&appEnableSMS=[value]&appEnableEmail=[value]&gameType=[value]&appKey=[value]&latitude=[value]&longitude=[value]&returnProfile=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]&referralAccountId=[value]&appNickname=[value]&personalAudienceId=[value]&nonGuestUsername=[value]
    */
  def editAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileInfoResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val role = request.getQueryString("role")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val prefixName = request.getQueryString("prefixName")
        
      val firstName = request.getQueryString("firstName")
        
      val middleName = request.getQueryString("middleName")
        
      val lastName = request.getQueryString("lastName")
        
      val suffixName = request.getQueryString("suffixName")
        
      val title = request.getQueryString("title")
        
      val gender = request.getQueryString("gender")
        
      val age = request.getQueryString("age")
        .map(value => value.toInt)
        
      val birthday = request.getQueryString("birthday")
        .map(value => value.toLong)
        
      val homePhone = request.getQueryString("homePhone")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val cellPhoneCarrier = request.getQueryString("cellPhoneCarrier")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val zipcode = request.getQueryString("zipcode")
        
      val country = request.getQueryString("country")
        
      val makeProfileInfoPublic = request.getQueryString("makeProfileInfoPublic")
        .map(value => value.toBoolean)
        
      val makeGameInfoPublic = request.getQueryString("makeGameInfoPublic")
        .map(value => value.toBoolean)
        
      val makeFriendsInfoPublic = request.getQueryString("makeFriendsInfoPublic")
        .map(value => value.toBoolean)
        
      val hometown = request.getQueryString("hometown")
        
      val height = request.getQueryString("height")
        
      val heightIndex = request.getQueryString("heightIndex")
        .map(value => value.toInt)
        
      val ethnicity = request.getQueryString("ethnicity")
        
      val bodyType = request.getQueryString("bodyType")
        
      val maritalStatus = request.getQueryString("maritalStatus")
        
      val children = request.getQueryString("children")
        
      val religion = request.getQueryString("religion")
        
      val education = request.getQueryString("education")
        
      val educationIndex = request.getQueryString("educationIndex")
        .map(value => value.toInt)
        
      val smoke = request.getQueryString("smoke")
        
      val drink = request.getQueryString("drink")
        
      val companionship = request.getQueryString("companionship")
        
      val companionshipIndex = request.getQueryString("companionshipIndex")
        .map(value => value.toInt)
        
      val preferredMinAge = request.getQueryString("preferredMinAge")
        .map(value => value.toInt)
        
      val preferredMaxAge = request.getQueryString("preferredMaxAge")
        .map(value => value.toInt)
        
      val preferredMinHeight = request.getQueryString("preferredMinHeight")
        .map(value => value.toInt)
        
      val preferredMaxHeight = request.getQueryString("preferredMaxHeight")
        .map(value => value.toInt)
        
      val preferredGender = request.getQueryString("preferredGender")
        
      val preferredEducation = request.getQueryString("preferredEducation")
        
      val preferredEducationIndex = request.getQueryString("preferredEducationIndex")
        .map(value => value.toInt)
        
      val preferredBodyType = request.getQueryString("preferredBodyType")
        
      val preferredEthnicity = request.getQueryString("preferredEthnicity")
        
      val preferredLocation = request.getQueryString("preferredLocation")
        
      val preferredLocationRange = request.getQueryString("preferredLocationRange")
        .map(value => value.toDouble)
        
      val platforms = request.getQueryString("platforms")
        
      val tags = request.getQueryString("tags")
        
      val aboutUs = request.getQueryString("aboutUs")
        
      val matchToken = request.getQueryString("matchToken")
        
      val gameExperience = request.getQueryString("gameExperience")
        
      val categories = request.getQueryString("categories")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val showAsZipcode = request.getQueryString("showAsZipcode")
        .map(value => value.toBoolean)
        
      val showExactLocation = request.getQueryString("showExactLocation")
        .map(value => value.toBoolean)
        
      val showOthersExactLocation = request.getQueryString("showOthersExactLocation")
        .map(value => value.toBoolean)
        
      val acceptedTerms = request.getQueryString("acceptedTerms")
        .map(value => value.toBoolean)
        
      val locationVisibility = request.getQueryString("locationVisibility")
        
      val appBlob = request.getQueryString("appBlob")
        
      val appEnablePush = request.getQueryString("appEnablePush")
        .map(value => value.toBoolean)
        
      val appEnableSMS = request.getQueryString("appEnableSMS")
        .map(value => value.toBoolean)
        
      val appEnableEmail = request.getQueryString("appEnableEmail")
        .map(value => value.toBoolean)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnProfile = request.getQueryString("returnProfile")
        .map(value => value.toBoolean)
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      val referralAccountId = request.getQueryString("referralAccountId")
        .map(value => value.toLong)
        
      val appNickname = request.getQueryString("appNickname")
        
      val personalAudienceId = request.getQueryString("personalAudienceId")
        .map(value => value.toLong)
        
      val nonGuestUsername = request.getQueryString("nonGuestUsername")
        
      api.editAccount(version, deviceId, accountId, connectionAccountId, role, assetId, name, prefixName, firstName, middleName, lastName, suffixName, title, gender, age, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, emailAddress, streetAddress, streetAddress2, city, state, zipcode, country, makeProfileInfoPublic, makeGameInfoPublic, makeFriendsInfoPublic, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, platforms, tags, aboutUs, matchToken, gameExperience, categories, categoryIds, responseFilters, showAsZipcode, showExactLocation, showOthersExactLocation, acceptedTerms, locationVisibility, appBlob, appEnablePush, appEnableSMS, appEnableEmail, gameType, appKey, latitude, longitude, returnProfile, audienceIdsToAdd, audienceIdsToRemove, referralAccountId, appNickname, personalAudienceId, nonGuestUsername)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/username/update?deviceId=[value]&accountId=[value]&emailAddress=[value]&username=[value]
    */
  def editUsername(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val username = request.getQueryString("username")
        
      api.editUsername(version, deviceId, accountId, emailAddress, username)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/account/profile/get?returnNulls=[value]&deviceId=[value]&accountId=[value]&connectionAccountEmail=[value]&connectionAccountId=[value]&responseFilters=[value]&gameType=[value]&appKey=[value]&purchaseType=[value]&updateViewedDate=[value]&latitude=[value]&longitude=[value]
    */
  def getAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountEmail = request.getQueryString("connectionAccountEmail")
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val updateViewedDate = request.getQueryString("updateViewedDate")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getAccount(version, returnNulls, deviceId, accountId, connectionAccountEmail, connectionAccountId, responseFilters, gameType, appKey, purchaseType, updateViewedDate, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/account/profile/assets?returnNulls=[value]&deviceId=[value]&accountId=[value]&ownerId=[value]&mediaTypes=[value]&mimeTypes=[value]&sortField=[value]&descending=[value]&latitude=[value]&longitude=[value]&i=[value]&start=[value]&l=[value]&limit=[value]
    */
  def getProfileAssets(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AssetListResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val mediaTypes = request.getQueryString("mediaTypes")
        
      val mimeTypes = request.getQueryString("mimeTypes")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getProfileAssets(version, returnNulls, deviceId, accountId, ownerId, mediaTypes, mimeTypes, sortField, descending, latitude, longitude, i, start, l, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/account/referral/list?accountId=[value]&appKey=[value]&retrieveType=[value]&levelLimit=[value]&ancestorLevelLimit=[value]&childrenLevelLimit=[value]&ancestorListStart=[value]&ancestorListLimit=[value]&childrenListStart=[value]&childrenListLimit=[value]&childrenChildren=[value]
    */
  def getReferralList(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val retrieveType = request.getQueryString("retrieveType")
        
      val levelLimit = request.getQueryString("levelLimit")
        .map(value => BigDecimal(value))
        
      val ancestorLevelLimit = request.getQueryString("ancestorLevelLimit")
        .map(value => BigDecimal(value))
        
      val childrenLevelLimit = request.getQueryString("childrenLevelLimit")
        .map(value => BigDecimal(value))
        
      val ancestorListStart = request.getQueryString("ancestorListStart")
        .map(value => BigDecimal(value))
        
      val ancestorListLimit = request.getQueryString("ancestorListLimit")
        .map(value => BigDecimal(value))
        
      val childrenListStart = request.getQueryString("childrenListStart")
        .map(value => BigDecimal(value))
        
      val childrenListLimit = request.getQueryString("childrenListLimit")
        .map(value => BigDecimal(value))
        
      val childrenChildren = request.getQueryString("childrenChildren")
        .map(value => value.toBoolean)
        
      api.getReferralList(version, accountId, appKey, retrieveType, levelLimit, ancestorLevelLimit, childrenLevelLimit, ancestorListStart, ancestorListLimit, childrenListStart, childrenListLimit, childrenChildren)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/account/settings/get?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]
    */
  def getSettings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): UserSettingsResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getSettings(version, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/login/delegate?deviceId=[value]&accessToken=[value]&accessTokenSecret=[value]&delegatedAccountId=[value]&delegatedUsername=[value]&networkUID=[value]&appKey=[value]&ageRestriction=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]
    */
  def loginDelegate(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accessToken = request.getQueryString("accessToken")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accessToken", "query string")
        }
        
      val accessTokenSecret = request.getQueryString("accessTokenSecret")
        
      val delegatedAccountId = request.getQueryString("delegatedAccountId")
        .map(value => value.toLong)
        
      val delegatedUsername = request.getQueryString("delegatedUsername")
        
      val networkUID = request.getQueryString("networkUID")
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val ageRestriction = request.getQueryString("ageRestriction")
        .map(value => value.toInt)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.loginDelegate(version, accessToken, appKey, deviceId, accessTokenSecret, delegatedAccountId, delegatedUsername, networkUID, ageRestriction, responseFilters, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/login?deviceId=[value]&deviceIdType=[value]&accessToken=[value]&accessTokenSecret=[value]&networkUID=[value]&appKey=[value]&ageRestriction=[value]&responseFilters=[value]&latitude=[value]&longitude=[value]&emailMatch=[value]&chosenAccountId=[value]&thirdPartyCredentialId=[value]
    */
  def loginGeneral(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val deviceIdType = request.getQueryString("deviceIdType")
        
      val accessToken = request.getQueryString("accessToken")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accessToken", "query string")
        }
        
      val accessTokenSecret = request.getQueryString("accessTokenSecret")
        
      val networkUID = request.getQueryString("networkUID")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("networkUID", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val ageRestriction = request.getQueryString("ageRestriction")
        .map(value => value.toInt)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val emailMatch = request.getQueryString("emailMatch")
        .map(value => value.toBoolean)
        
      val chosenAccountId = request.getQueryString("chosenAccountId")
        .map(value => value.toLong)
        
      val thirdPartyCredentialId = request.getQueryString("thirdPartyCredentialId")
        .map(value => value.toLong)
        
      api.loginGeneral(version, accessToken, networkUID, appKey, deviceId, deviceIdType, accessTokenSecret, ageRestriction, responseFilters, latitude, longitude, emailMatch, chosenAccountId, thirdPartyCredentialId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/get?deviceId=[value]&username=[value]&password=[value]&latitude=[value]&longitude=[value]&app=[value]&gameType=[value]&appKey=[value]&returnProfile=[value]&responseFilters=[value]
    */
  def loginUsername(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val app = request.getQueryString("app")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val returnProfile = request.getQueryString("returnProfile")
        .map(value => value.toBoolean)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      api.loginUsername(version, username, password, deviceId, latitude, longitude, app, gameType, appKey, returnProfile, responseFilters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/logout?deviceId=[value]&deviceIdType=[value]&accountId=[value]&latitude=[value]&longitude=[value]
    */
  def logout(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val deviceIdType = request.getQueryString("deviceIdType")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.logout(version, deviceId, deviceIdType, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/merge?deviceId=[value]&accountId=[value]&mergeAccountId=[value]&appKey=[value]
    */
  def mergeAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val mergeAccountId = request.getQueryString("mergeAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("mergeAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      api.mergeAccount(version, mergeAccountId, appKey, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/passwordchange?accountId=[value]&oldPassword=[value]&newPassword=[value]&confirmPassword=[value]
    */
  def passwordChange(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val oldPassword = request.getQueryString("oldPassword")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("oldPassword", "query string")
        }
        
      val newPassword = request.getQueryString("newPassword")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("newPassword", "query string")
        }
        
      val confirmPassword = request.getQueryString("confirmPassword")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("confirmPassword", "query string")
        }
        
      api.passwordChange(version, accountId, oldPassword, newPassword, confirmPassword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/passwordreset?token=[value]&password=[value]&confirm=[value]
    */
  def passwordReset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val confirm = request.getQueryString("confirm")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("confirm", "query string")
        }
        
      api.passwordReset(version, token, password, confirm)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/requestpasswordreset?email=[value]&from=[value]&domain=[value]&subUrl=[value]&referer=[value]
    */
  def requestPasswordReset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val email = request.getQueryString("email")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("email", "query string")
        }
        
      val from = request.getQueryString("from")
        
      val domain = request.getQueryString("domain")
        
      val subUrl = request.getQueryString("subUrl")
        
      val referer = request.getQueryString("referer")
        
      api.requestPasswordReset(version, email, from, domain, subUrl, referer)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/requestValidateAccount?accountId=[value]
    */
  def requestValidateAccount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.requestValidateAccount(version, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/account/profile/search?accountId=[value]&appKey=[value]&keyword=[value]&latitude=[value]&longitude=[value]&radius=[value]&gender=[value]&gameExperience=[value]&age=[value]&categoryIds=[value]&returnNulls=[value]&responseFilters=[value]&purchaseType=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchAccounts(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ProfileResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val radius = request.getQueryString("radius")
        .map(value => value.toDouble)
        
      val gender = request.getQueryString("gender")
        
      val gameExperience = request.getQueryString("gameExperience")
        
      val age = request.getQueryString("age")
        .map(value => value.toInt)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchAccounts(version, accountId, appKey, keyword, latitude, longitude, radius, gender, gameExperience, age, categoryIds, returnNulls, responseFilters, purchaseType, sortField, descending, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/login/validate?deviceId=[value]&username=[value]&password=[value]&gameType=[value]&charsetName=[value]&latitude=[value]&longitude=[value]&returnProfile=[value]&responseFilters=[value]
    */
  def secureLogin(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val gameType = request.getQueryString("gameType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameType", "query string")
        }
        
      val charsetName = request.getQueryString("charsetName")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnProfile = request.getQueryString("returnProfile")
        .map(value => value.toBoolean)
        
      val responseFilters = request.getQueryString("responseFilters")
        
      api.secureLogin(version, username, password, gameType, deviceId, charsetName, latitude, longitude, returnProfile, responseFilters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/create/validate?name=[value]&inviteToken=[value]&prefixName=[value]&firstName=[value]&middleName=[value]&lastName=[value]&suffixName=[value]&title=[value]&deviceId=[value]&deviceIdType=[value]&username=[value]&password=[value]&emailAddress=[value]&assetId=[value]&address=[value]&zipcode=[value]&gender=[value]&birthday=[value]&homePhone=[value]&cellPhone=[value]&cellPhoneCarrier=[value]&businessPhone=[value]&role=[value]&platforms=[value]&tags=[value]&aboutUs=[value]&gameExperience=[value]&categoryIds=[value]&hometown=[value]&height=[value]&heightIndex=[value]&ethnicity=[value]&bodyType=[value]&maritalStatus=[value]&children=[value]&religion=[value]&education=[value]&educationIndex=[value]&smoke=[value]&drink=[value]&companionship=[value]&companionshipIndex=[value]&preferredMinAge=[value]&preferredMaxAge=[value]&preferredMinHeight=[value]&preferredMaxHeight=[value]&preferredGender=[value]&preferredEducation=[value]&preferredEducationIndex=[value]&preferredBodyType=[value]&preferredEthnicity=[value]&preferredLocation=[value]&preferredLocationRange=[value]&latitude=[value]&longitude=[value]&acceptedTerms=[value]&charsetName=[value]&gameType=[value]&appKey=[value]&appVersion=[value]&responseType=[value]
    */
  def secureSignup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileInfoResponse = {
      val name = request.getQueryString("name")
        
      val inviteToken = request.getQueryString("inviteToken")
        
      val prefixName = request.getQueryString("prefixName")
        
      val firstName = request.getQueryString("firstName")
        
      val middleName = request.getQueryString("middleName")
        
      val lastName = request.getQueryString("lastName")
        
      val suffixName = request.getQueryString("suffixName")
        
      val title = request.getQueryString("title")
        
      val deviceId = request.getQueryString("deviceId")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("deviceId", "query string")
        }
        
      val deviceIdType = request.getQueryString("deviceIdType")
        
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val emailAddress = request.getQueryString("emailAddress")
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val address = request.getQueryString("address")
        
      val zipcode = request.getQueryString("zipcode")
        
      val gender = request.getQueryString("gender")
        
      val birthday = request.getQueryString("birthday")
        .map(value => value.toLong)
        
      val homePhone = request.getQueryString("homePhone")
        
      val cellPhone = request.getQueryString("cellPhone")
        
      val cellPhoneCarrier = request.getQueryString("cellPhoneCarrier")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val role = request.getQueryString("role")
        
      val platforms = request.getQueryString("platforms")
        
      val tags = request.getQueryString("tags")
        
      val aboutUs = request.getQueryString("aboutUs")
        
      val gameExperience = request.getQueryString("gameExperience")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val hometown = request.getQueryString("hometown")
        
      val height = request.getQueryString("height")
        
      val heightIndex = request.getQueryString("heightIndex")
        .map(value => value.toInt)
        
      val ethnicity = request.getQueryString("ethnicity")
        
      val bodyType = request.getQueryString("bodyType")
        
      val maritalStatus = request.getQueryString("maritalStatus")
        
      val children = request.getQueryString("children")
        
      val religion = request.getQueryString("religion")
        
      val education = request.getQueryString("education")
        
      val educationIndex = request.getQueryString("educationIndex")
        .map(value => value.toInt)
        
      val smoke = request.getQueryString("smoke")
        
      val drink = request.getQueryString("drink")
        
      val companionship = request.getQueryString("companionship")
        
      val companionshipIndex = request.getQueryString("companionshipIndex")
        .map(value => value.toInt)
        
      val preferredMinAge = request.getQueryString("preferredMinAge")
        .map(value => value.toInt)
        
      val preferredMaxAge = request.getQueryString("preferredMaxAge")
        .map(value => value.toInt)
        
      val preferredMinHeight = request.getQueryString("preferredMinHeight")
        .map(value => value.toInt)
        
      val preferredMaxHeight = request.getQueryString("preferredMaxHeight")
        .map(value => value.toInt)
        
      val preferredGender = request.getQueryString("preferredGender")
        
      val preferredEducation = request.getQueryString("preferredEducation")
        
      val preferredEducationIndex = request.getQueryString("preferredEducationIndex")
        .map(value => value.toInt)
        
      val preferredBodyType = request.getQueryString("preferredBodyType")
        
      val preferredEthnicity = request.getQueryString("preferredEthnicity")
        
      val preferredLocation = request.getQueryString("preferredLocation")
        
      val preferredLocationRange = request.getQueryString("preferredLocationRange")
        .map(value => value.toDouble)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val acceptedTerms = request.getQueryString("acceptedTerms")
        .map(value => value.toBoolean)
        
      val charsetName = request.getQueryString("charsetName")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val appVersion = request.getQueryString("appVersion")
        
      val responseType = request.getQueryString("responseType")
        
      api.secureSignup(version, deviceId, username, password, name, inviteToken, prefixName, firstName, middleName, lastName, suffixName, title, deviceIdType, emailAddress, assetId, address, zipcode, gender, birthday, homePhone, cellPhone, cellPhoneCarrier, businessPhone, role, platforms, tags, aboutUs, gameExperience, categoryIds, hometown, height, heightIndex, ethnicity, bodyType, maritalStatus, children, religion, education, educationIndex, smoke, drink, companionship, companionshipIndex, preferredMinAge, preferredMaxAge, preferredMinHeight, preferredMaxHeight, preferredGender, preferredEducation, preferredEducationIndex, preferredBodyType, preferredEthnicity, preferredLocation, preferredLocationRange, latitude, longitude, acceptedTerms, charsetName, gameType, appKey, appVersion, responseType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/profile/matchToken?deviceId=[value]&accountId=[value]&matchToken=[value]&gameType=[value]&appKey=[value]&latitude=[value]&longitude=[value]
    */
  def setMatchToken(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val matchToken = request.getQueryString("matchToken")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.setMatchToken(version, deviceId, accountId, matchToken, gameType, appKey, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/active/update?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&appKey=[value]&active=[value]
    */
  def updateActveStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("connectionAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      api.updateActveStatus(version, accountId, connectionAccountId, active, deviceId, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/location/update?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&clientTime=[value]
    */
  def updateLocation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val clientTime = request.getQueryString("clientTime")
        .map(value => value.toLong)
        
      api.updateLocation(version, deviceId, accountId, latitude, longitude, clientTime)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/settings/update?deviceId=[value]&accountId=[value]&blockedNotifications=[value]&suggestionMethod=[value]&suggestionCount=[value]&suggestionTimeFrame=[value]&showOthersExactLocation=[value]&showAsZipcode=[value]&showExactLocation=[value]&favoriteVisibility=[value]&latitude=[value]&longitude=[value]
    */
  def updateSettings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): UserSettingsResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val blockedNotifications = request.getQueryString("blockedNotifications")
        
      val suggestionMethod = request.getQueryString("suggestionMethod")
        
      val suggestionCount = request.getQueryString("suggestionCount")
        .map(value => value.toInt)
        
      val suggestionTimeFrame = request.getQueryString("suggestionTimeFrame")
        .map(value => value.toInt)
        
      val showOthersExactLocation = request.getQueryString("showOthersExactLocation")
        .map(value => value.toBoolean)
        
      val showAsZipcode = request.getQueryString("showAsZipcode")
        .map(value => value.toBoolean)
        
      val showExactLocation = request.getQueryString("showExactLocation")
        .map(value => value.toBoolean)
        
      val favoriteVisibility = request.getQueryString("favoriteVisibility")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.updateSettings(version, deviceId, accountId, blockedNotifications, suggestionMethod, suggestionCount, suggestionTimeFrame, showOthersExactLocation, showAsZipcode, showExactLocation, favoriteVisibility, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/validateAccountSignup?token=[value]
    */
  def validateAccountSignup(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AccountLoginResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      api.validateAccountSignup(version, token)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/account/validatepasswordreset?token=[value]
    */
  def validatePasswordReset(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      api.validatePasswordReset(version, token)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
