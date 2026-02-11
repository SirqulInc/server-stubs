package api

import model.ApplicationUsageResponse
import model.SirqulResponse
import model.SubscriptionPlanResponse
import model.SubscriptionResponse

/**
  * Provides a default implementation for [[SubscriptionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class SubscriptionApiImpl extends SubscriptionApi {
  /**
    * @inheritdoc
    */
  override def createSubscription(accountId: Long, planId: Option[Long], promoCode: Option[String]): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteSubscription(accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscription(accountId: Long): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionPlan(planId: Long): SubscriptionPlanResponse = {
    // TODO: Implement better logic

    SubscriptionPlanResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionPlans(visible: Option[Boolean], role: Option[String]): List[SubscriptionPlanResponse] = {
    // TODO: Implement better logic

    List.empty[SubscriptionPlanResponse]
  }

  /**
    * @inheritdoc
    */
  override def getSubscriptionUsage(accountId: Long, applicationId: Option[Long], start: Option[Long], end: Option[Long]): ApplicationUsageResponse = {
    // TODO: Implement better logic

    ApplicationUsageResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateSubscription(accountId: Long, planId: Option[Long], promoCode: Option[String], active: Option[Boolean]): SubscriptionResponse = {
    // TODO: Implement better logic

    SubscriptionResponse(None, None, None, None)
  }
}
