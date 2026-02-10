package api

import play.api.libs.json._
import model.AppResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AppDataApi {
  /**
    * Get App Data
    * Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.
    * @param start start the search results at a record.
    * @param limit limit the search results to some number.
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param gameType the game to retrieve the data for, use your application key.
    * @param includeGameData if true then include the game data blob, otherwise don&#39;t include.
    * @param q This parameter is deprecated.
    * @param keyword query string used to filter the search results when looking for community and saved levels.
    * @param sortField how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    * @param descending order the search results descending or ascending when looking for community and saved levels.
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param gameObjectCount if true then include the game object count, otherwise don&#39;t include.
    * @param filter restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    * @param dateCreated restrict the search to items created less then date
    * @param ownerId get levels owned by a particular account
    * @param missionIds get missions by specified id, comman seperated list of long ids
    * @param gameIds get games by specified id, comman seperated list of long ids
    * @param packIds get packs by specified id, comman seperated list of long ids
    * @param gameLevelIds get game levels by specified id, comman seperated list of long ids
    * @param appVersion the application version, used to versin the game level data
    * @param includeHigherVersionPacks default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    * @param includeHigherVersionLevels default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    * @param responseGroups use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    * @param purchaseType the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    */
  def getAppData(version: BigDecimal, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse

  /**
    * Create App Data
    * Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user&#39;s profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user&#39;s   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application
    * @param gameType the game to retrieve the data for, use your application key.
    * @param start start the search results at a record.
    * @param limit limit the search results to some number.
    * @param data The analytic data AnalyticListResponse
    * @param deviceId the device id (deviceId or accountId required).
    * @param accountId the account id of the user (deviceId or accountId required).
    * @param includeGameData if true then include the game data blob, otherwise don&#39;t include.
    * @param q This parameter is deprecated.
    * @param keyword query string used to filter the search results when looking for community and saved levels.
    * @param sortField how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    * @param descending order the search results descending or ascending when looking for community and saved levels.
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param gameObjectCount if true then include the game object count, otherwise don&#39;t include.
    * @param filter restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    * @param dateCreated restrict the search to items created less then date
    * @param ownerId get levels owned by a particular account
    * @param missionIds get missions by specified id, comman seperated list of long ids
    * @param gameIds get games by specified id, comman seperated list of long ids
    * @param packIds get packs by specified id, comman seperated list of long ids
    * @param gameLevelIds get game levels by specified id, comman seperated list of long ids
    * @param appVersion the application version, used to versin the game level data
    * @param includeHigherVersionPacks default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    * @param includeHigherVersionLevels default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    * @param responseGroups use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    * @param purchaseType the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    */
  def postAppData(version: BigDecimal, gameType: String, start: Int, limit: Int, data: String, deviceId: Option[String], accountId: Option[Long], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse

  /**
    * Regenerate App Data
    * Regenerate the app data cache for apps
    * @param accountId the account id of the user
    * @param appKey process a specific application, if null process all apps with caches
    * @param buildVersion create a specific version, if null use current version. Be careful if processing all
    * @param apiVersion create a specific version, if null use current version. Be careful if processing all
    */
  def regenAppData(version: BigDecimal, accountId: Option[Long], appKey: Option[String], buildVersion: Option[String], apiVersion: Option[String]): SirqulResponse
}
