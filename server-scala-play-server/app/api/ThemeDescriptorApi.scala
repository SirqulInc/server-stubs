package api

import play.api.libs.json._
import model.BigDecimal
import model.PurchaseItemListResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThemeDescriptorResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ThemeDescriptorApi {
  /**
    * Create/Update Theme
    * Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.
    * @param publicRead determines whether the theme&#39;s participants have read permissions
    * @param publicWrite determines whether the theme&#39;s participants have write permissions
    * @param publicDelete determines whether the theme&#39;s participants have delete permissions
    * @param publicAdd 
    * @param visibility the determines the theme&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    * @param includeFriendGroup flag to determine whether to share to the user&#39;s \&quot;friends\&quot; group
    * @param completeWithDefaultValues determines whether to use default values to complete the theme
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param gameType the application key
    * @param themeDescriptorId the theme descriptor id used to update an existing theme, leave empty for creating a new theme
    * @param title the title of the theme
    * @param description the description of the theme
    * @param connectionIdsToAdd a comma separated list of connection IDs to share to users
    * @param connectionGroupIdsToAdd a comma separated list of connection group IDs to share to groups
    * @param appVersion the application version the theme was created for
    * @param colorValueJson a json array used to replace colors within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;sceneAtlas\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   },   {     \&quot;name\&quot;: \&quot;bg\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   } ] &#x60;&#x60;&#x60; 
    * @param stringReplacerJson a json array used to replace strings within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;coins\&quot;,     \&quot;valueString\&quot;: \&quot;Gems\&quot;   },   {     \&quot;name\&quot;: \&quot;lives\&quot;,     \&quot;valueString\&quot;: \&quot;lives\&quot;   } ] &#x60;&#x60;&#x60; 
    * @param customJsonObjects a json object used by the scene atlas to position sprites. Example: &#x60;&#x60;&#x60;json {   \&quot;pShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;2.2\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;-0.3\&quot;     }   ],   \&quot;e1ShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;0.25\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;0.5\&quot;     }   ] } &#x60;&#x60;&#x60; 
    * @param iconImage a MultipartFile containing the image used as the theme icon
    * @param sceneAtlasImage a MultipartFile containing the scene atlas
    * @param bgImage a MultipartFile containing the background image
    * @param bgSound a MultipartFile containing the background sound file (preferably in MP3 format)
    * @param musicSelection used to select a default sound file that already exists in the application
    * @param locationDescription the description of the user&#39;s current location
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    */
  def addOrUpdateThemeDescriptor(version: BigDecimal, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, visibility: String, includeFriendGroup: Boolean, completeWithDefaultValues: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], themeDescriptorId: Option[Long], title: Option[String], description: Option[String], connectionIdsToAdd: Option[String], connectionGroupIdsToAdd: Option[String], appVersion: Option[String], colorValueJson: Option[String], stringReplacerJson: Option[String], customJsonObjects: Option[String], iconImage: Option[TemporaryFile], sceneAtlasImage: Option[TemporaryFile], bgImage: Option[TemporaryFile], bgSound: Option[TemporaryFile], musicSelection: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): ThemeDescriptorResponse

  /**
    * Get Theme
    * Gets a theme.
    * @param themeDescriptorId the theme id
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param gameType the application key
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def getThemeDescriptor(version: BigDecimal, themeDescriptorId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], latitude: Option[Double], longitude: Option[Double]): PurchaseItemListResponse

  /**
    * Search Themes
    * Searches for themes.
    * @param filter a comma separated list of Ownership
    * @param sortField the field to sort by. See ThemeDescriptorApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param start the start parameter for pagination
    * @param limit the limit parameter for pagination
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType the unique title of an application given from the admin tool
    * @param contestType contest type
    * @param ownerId search on contests that an account has access to
    * @param q This parameter is deprecated.
    * @param keyword a keyword to search on
    * @param i This parameter is deprecated.
    * @param l This parameter is deprecated.
    * @param dateCreated filter on items that have been created before this date
    * @param appVersion application version of the theme to filter by
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def getThemeDescriptors(version: BigDecimal, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], contestType: Option[String], ownerId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], dateCreated: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double]): PurchaseItemListResponse

  /**
    * Delete Theme
    * Removes a theme.
    * @param themeDescriptorId the theme id to remove
    * @param deviceId a unique id given by the device (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param gameType the unique title of an application given from the admin tool
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def removeThemeDescriptor(version: BigDecimal, themeDescriptorId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse
}
