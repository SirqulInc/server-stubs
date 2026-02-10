package api

import play.api.libs.json._
import model.BigDecimal
import model.PreviewPersonaResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PreviewPersonaApi {
  /**
    * Create Persona
    * Creates a new persona. If the given params are null those attributes will be override by null.
    * @param accountId the account ID of the user
    * @param title the title of the persona
    * @param previewAccounts the accounts that are able to preview from this persona
    * @param date the sepcified date that this persona is viewing the app
    * @param age the specified age of this persona
    * @param gender the specified gender of this persona
    * @param gameExperienceLevel the specified experience level of the persona
    * @param latitude the specified latitude of the persona
    * @param longitude the specified longitude of the persona
    */
  def createPersona(version: BigDecimal, accountId: Long, title: String, previewAccounts: Option[String], date: Option[Long], age: Option[Int], gender: Option[String], gameExperienceLevel: Option[String], latitude: Option[Double], longitude: Option[Double]): PreviewPersonaResponse

  /**
    * Delete Persona
    * Mark the persona for deletion.
    * @param accountId the account id of the user
    * @param personaId the id of the persona to delete
    */
  def deletePersona(version: BigDecimal, accountId: Long, personaId: Long): SirqulResponse

  /**
    * Get Persona
    * Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.
    * @param accountId the account ID of the user
    * @param personaId the persona ID of the persona
    */
  def getPersonaList(version: BigDecimal, accountId: Long, personaId: Long): PreviewPersonaResponse

  /**
    * Search Personas
    * Search for persona that the account owns by the given account ID.
    * @param accountId the account ID of the user
    * @param start the start index for pagination
    * @param limit the limit for pagination (There is a hard limit of 100)
    */
  def searchPersona(version: BigDecimal, accountId: Long, start: Int, limit: Int): PreviewPersonaResponse

  /**
    * Update Persona
    * Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.
    * @param accountId the account ID of the user
    * @param personaId the persona ID of the persona to update
    * @param title the title of the persona
    * @param previewAccounts the accounts that are able to preview from this persona
    * @param active the status of the persona, there can only be one active persona per account
    * @param date the sepcified date that this persona is viewing the app
    * @param age the specified age of this persona
    * @param gender the specified gender of this persona
    * @param gameExperienceLevel the specified experience level of the persona
    * @param latitude the specified latitude of the persona
    * @param longitude the specified longitude of the persona
    */
  def updatePersona(version: BigDecimal, accountId: Long, personaId: Long, title: Option[String], previewAccounts: Option[String], active: Option[Boolean], date: Option[Long], age: Option[Int], gender: Option[String], gameExperienceLevel: Option[String], latitude: Option[Double], longitude: Option[Double]): PreviewPersonaResponse
}
