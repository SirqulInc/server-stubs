package api

import play.api.libs.json._
import model.ApplicationConfigResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ApplicationConfigApi {
  /**
    * Create AppConfig
    * Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created.
    * @param accountId The account ID of the user
    * @param appKey The application key that the newly created applicationConfig will be associated to
    * @param configVersion The application configuration, has to be unique within the application
    * @param assetId The json assetId that stores the configuration detail.
    * @param retailerId The retailer id for retailer specific configurations
    * @param retailerLocationId The retailer location id for retailer location specific configurations
    * @param udid The device udid for device specific configurations
    */
  def createApplicationConfig(version: BigDecimal, accountId: Long, appKey: String, configVersion: String, assetId: Long, retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String]): ApplicationConfigResponse

  /**
    * Delete AppConfig
    * Mark the application configuration for deletion.
    * @param accountId The account ID of the user
    * @param configId The config ID of the application configuration to delete
    */
  def deleteApplicationConfig(version: BigDecimal, accountId: Long, configId: Long): SirqulResponse

  /**
    * Get AppConfig
    * Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.
    * @param accountId The account ID of the user
    * @param configId The config ID of the application configuration
    */
  def getApplicationConfig(version: BigDecimal, accountId: Long, configId: Long): ApplicationConfigResponse

  /**
    * Get AppConfig by Version
    * Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. 
    * @param appKey The application key
    * @param configVersion The version of the application configuration
    * @param retailerId Only returns the config that matches the given retailer
    * @param retailerLocationId Only returns the config that matches the given retailer location
    * @param udid Only returns only returns the config that matches the given device udid
    * @param allowOlderVersions Determines whether to return older config versions if the exact version is not found. If this happens, will try to return the latest version.
    */
  def getApplicationConfigByConfigVersion(version: BigDecimal, appKey: String, configVersion: String, retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String], allowOlderVersions: Option[Boolean]): ApplicationConfigResponse

  /**
    * Search AppConfigs
    * Gets all versions of application configurations in a particular app by the given appKey.
    * @param accountId The account ID of the user
    * @param appKey The application key to filter results by application Leaving this empty will return all application configurations for all applications (executive user only)
    * @param retailerId Only returns the configs that matches the given retailer
    * @param retailerLocationId Only returns the configs that matches the given retailer location
    * @param udid Only returns only returns the configs that matches the given device udid
    * @param configVersion Config Version
    * @param sortField Orders the results by: CREATED, UPDATED, ACTIVE, APPLICATION_ID,  APPLICATION_KEY, APPLICATION_NAME, RETAILER_NAME, RETAILER_ID, RETAILER_LOCATION_NAME,  RETAILER_LOCATION_ID, OFFER_TITLE, OFFER_ID, OFFER_LOCATION_ID, CONFIG_VERSION_MINOR,  CONFIG_VERSION_MAJOR, CONFIG_VERSION_INDEX 
    * @param descending Determines whether the results are in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination (There is a hard limit of 100)
    */
  def searchApplicationConfig(version: BigDecimal, accountId: Long, appKey: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String], configVersion: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[ApplicationConfigResponse]

  /**
    * Update AppConfig
    * pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated.
    * @param accountId The account ID of the user
    * @param configId The config ID of the application configuration to update
    * @param appKey The application key that the updated applicationConfig will be associated to
    * @param configVersion The application configuration, has to be unique within the application
    * @param assetId The json assetId that stores the configuration detail.
    * @param retailerId The retailer id for retailer specific configurations
    * @param retailerLocationId The retailer location id for retailer location specific configurations
    * @param udid The device udid for device specific configurations
    */
  def updateApplicationConfig(version: BigDecimal, accountId: Long, configId: Long, appKey: Option[String], configVersion: Option[String], assetId: Option[Long], retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String]): ApplicationConfigResponse
}
