package api

import model.Account
import model.SirqulResponse

/**
  * Provides a default implementation for [[DependentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class DependentApiImpl extends DependentApi {
  /**
    * @inheritdoc
    */
  override def create(accountId: Long, body: Option[Account]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getDependents(accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeDependent(accountId: Long, dependentId: Long): Unit = {
    // TODO: Implement better logic

    
  }
}
