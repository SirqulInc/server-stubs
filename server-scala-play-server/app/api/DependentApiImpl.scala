package api

import model.Account
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[DependentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class DependentApiImpl extends DependentApi {
  /**
    * @inheritdoc
    */
  override def create(version: BigDecimal, accountId: Long, body: Option[Account]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getDependents(version: BigDecimal, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeDependent(version: BigDecimal, accountId: Long, dependentId: Long): Unit = {
    // TODO: Implement better logic

    
  }
}
