package api

import play.api.libs.json._
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait WorkflowApi {
  /**
    * Run Workflow
    * Runs a published executable workflow
    * @param accountId the account ID of the user
    * @param workflowId the workflow to run
    * @param skuId this runs a particular sku on the workflow
    * @param versionCode this runs a particular sku version on the workflow
    * @param parameters Override parameters in JSON format. Example: &#x60;&#x60;&#x60;json {   \&quot;arguments_81\&quot;: { \&quot;filter\&quot;: \&quot;PUBLIC\&quot; },   \&quot;arguments_87\&quot;: { \&quot;tag\&quot;: \&quot;custom_tag\&quot; } } &#x60;&#x60;&#x60; 
    */
  def runWorkflow(accountId: Long, workflowId: Long, skuId: Option[Long], versionCode: Option[Int], parameters: Option[String]): SirqulResponse
}
