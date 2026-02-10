package api

import play.api.libs.json._
import model.ApplicationUsageResponse
import model.BigDecimal
import model.SirqulResponse
import model.SubscriptionPlanResponse
import model.SubscriptionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait SubscriptionApi {
  /**
    * Create Subscription
    * Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.
    * @param accountId The account used to perform the create, must be the responsible manager
    * @param planId The plan to subscribe to, if null use default plan
    * @param promoCode Set a promo code for a discount.
    */
  def createSubscription(version: BigDecimal, accountId: Long, planId: Option[Long], promoCode: Option[String]): SubscriptionResponse

  /**
    * Delete Subscription
    * Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action
    * @param accountId The account used to perform the delete, must be the responsible manager
    */
  def deleteSubscription(version: BigDecimal, accountId: Long): SirqulResponse

  /**
    * Get Subscription
    * Use the accountId to determine the associated BillableEntity.  Then get the subscription.
    * @param accountId The account used to perform the lookup
    */
  def getSubscription(version: BigDecimal, accountId: Long): SubscriptionResponse

  /**
    * Get Subscription Plan
    * Get the matched subscription plan
    * @param planId The ID of the plan to get
    */
  def getSubscriptionPlan(version: BigDecimal, planId: Long): SubscriptionPlanResponse

  /**
    * List Subscription Plans
    * Get the matched subscription plan
    * @param visible Include visible only (true), hidden only (false), or all (null)
    * @param role The role the plan is targeted for, values are: DEVELOPER, RETAILER, ADVERTISER
    */
  def getSubscriptionPlans(version: BigDecimal, visible: Option[Boolean], role: Option[String]): List[SubscriptionPlanResponse]

  /**
    * Get Subscription Usage
    * Use the accountId to determine the associated BillableEntity.  Then get the application usage.
    * @param accountId The account used to perform the lookup
    * @param applicationId Get for just 1 application instead of the BillableEntity
    * @param start The start time frame
    * @param end The end time frame
    */
  def getSubscriptionUsage(version: BigDecimal, accountId: Long, applicationId: Option[Long], start: Option[Long], end: Option[Long]): ApplicationUsageResponse

  /**
    * Update Subscription
    * Updates the subscription for the billable entity for an account
    * @param accountId The account used to perform the update, must be the responsible manager
    * @param planId The plan to subscribe to
    * @param promoCode Set a promo code for a discount.
    * @param active Set active status
    */
  def updateSubscription(version: BigDecimal, accountId: Long, planId: Option[Long], promoCode: Option[String], active: Option[Boolean]): SubscriptionResponse
}
