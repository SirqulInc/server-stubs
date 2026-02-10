package api

import model.ApplicationUsageResponse
import model.BigDecimal
import model.SirqulResponse
import model.SubscriptionPlanResponse
import model.SubscriptionResponse

/**
  * Provides a default implementation for [[SubscriptionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class SubscriptionApiImpl extends SubscriptionApi {
  /**
    * @inheritdoc
    */
  override def createSubscription(version: BigDecimal, accountId: Long, planId: Option[Long], promoCode: Option[String]): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteSubscription(version: BigDecimal, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscription(version: BigDecimal, accountId: Long): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionPlan(version: BigDecimal, planId: Long): SubscriptionPlanResponse = {
    // TODO: Implement better logic

    SubscriptionPlanResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionPlans(version: BigDecimal, visible: Option[Boolean], role: Option[String]): List[SubscriptionPlanResponse] = {
    // TODO: Implement better logic

    List.empty[SubscriptionPlanResponse]
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionUsage(version: BigDecimal, accountId: Long, applicationId: Option[Long], start: Option[Long], end: Option[Long]): ApplicationUsageResponse = {
    // TODO: Implement better logic

    ApplicationUsageResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateSubscription(version: BigDecimal, accountId: Long, planId: Option[Long], promoCode: Option[String], active: Option[Boolean]): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }
}
