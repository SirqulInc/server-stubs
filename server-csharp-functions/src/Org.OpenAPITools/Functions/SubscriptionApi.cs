using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class SubscriptionApi
    { 
        [FunctionName("SubscriptionApi_CreateSubscription")]
        public async Task<ActionResult<SubscriptionResponse>> _CreateSubscription([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18subscription/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateSubscription");
            return method != null
                ? (await ((Task<SubscriptionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_DeleteSubscription")]
        public async Task<ActionResult<SirqulResponse>> _DeleteSubscription([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18subscription/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteSubscription");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_GetSubscription")]
        public async Task<ActionResult<SubscriptionResponse>> _GetSubscription([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18subscription/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSubscription");
            return method != null
                ? (await ((Task<SubscriptionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_GetSubscriptionPlan")]
        public async Task<ActionResult<SubscriptionPlanResponse>> _GetSubscriptionPlan([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18subscription/plan/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSubscriptionPlan");
            return method != null
                ? (await ((Task<SubscriptionPlanResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_GetSubscriptionPlans")]
        public async Task<ActionResult<List<SubscriptionPlanResponse>>> _GetSubscriptionPlans([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18subscription/plan/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSubscriptionPlans");
            return method != null
                ? (await ((Task<List<SubscriptionPlanResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_GetSubscriptionUsage")]
        public async Task<ActionResult<ApplicationUsageResponse>> _GetSubscriptionUsage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18subscription/usage/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetSubscriptionUsage");
            return method != null
                ? (await ((Task<ApplicationUsageResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SubscriptionApi_UpdateSubscription")]
        public async Task<ActionResult<SubscriptionResponse>> _UpdateSubscription([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18subscription/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateSubscription");
            return method != null
                ? (await ((Task<SubscriptionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
