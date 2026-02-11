package api

import play.api.libs.json._
import model.Account
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait DependentApi {
  /**
    * Create Dependent
    * Create dependent of the account
    * @param accountId the id of the parent account to create a dependent for
    */
  def create(accountId: Long, body: Option[Account]): SirqulResponse

  /**
    * Get dependent list of an account
    * Get the dependent list of an account
    * @param accountId the id of the parent account to get a list of dependents
    */
  def getDependents(accountId: Long): SirqulResponse

  /**
    * Delete Dependent
    * Delete the Dependent
    * @param accountId the id of the parent account tied to the dependent
    * @param dependentId the id of the dependent to delete
    */
  def removeDependent(accountId: Long, dependentId: Long): Unit
}
