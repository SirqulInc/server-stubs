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
    public partial class RegionApi
    { 
        [FunctionName("RegionApi_CreateRegion")]
        public async Task<ActionResult<RegionResponse>> _CreateRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/region/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateRegion");
            return method != null
                ? (await ((Task<RegionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionApi_DeleteRegion")]
        public async Task<ActionResult<RegionResponse>> _DeleteRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/region/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteRegion");
            return method != null
                ? (await ((Task<RegionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionApi_GetRegion")]
        public async Task<ActionResult<RegionResponse>> _GetRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/region/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetRegion");
            return method != null
                ? (await ((Task<RegionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionApi_SearchRegions")]
        public async Task<ActionResult<List<RegionResponse>>> _SearchRegions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/region/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchRegions");
            return method != null
                ? (await ((Task<List<RegionResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RegionApi_UpdateRegion")]
        public async Task<ActionResult<RegionResponse>> _UpdateRegion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/region/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateRegion");
            return method != null
                ? (await ((Task<RegionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
