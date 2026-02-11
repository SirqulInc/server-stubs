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
    public partial class AnalyticsApi
    { 
        [FunctionName("AnalyticsApi_Activities")]
        public async Task<ActionResult<List<UserActivityResponse>>> _Activities([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18analytics/useractivity")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Activities");
            return method != null
                ? (await ((Task<List<UserActivityResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AnalyticsApi_AggregatedFilteredUsage")]
        public async Task<ActionResult<ChartData>> _AggregatedFilteredUsage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18analytics/aggregatedFilteredUsage")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AggregatedFilteredUsage");
            return method != null
                ? (await ((Task<ChartData>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AnalyticsApi_FilteredUsage")]
        public async Task<ActionResult<ChartData>> _FilteredUsage([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18analytics/filteredUsage")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("FilteredUsage");
            return method != null
                ? (await ((Task<ChartData>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AnalyticsApi_Usage")]
        public async Task<ActionResult<SirqulResponse>> _Usage([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18analytics/usage")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("Usage");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AnalyticsApi_UsageBatch")]
        public async Task<ActionResult<SirqulResponse>> _UsageBatch([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18analytics/usage/batch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UsageBatch");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
