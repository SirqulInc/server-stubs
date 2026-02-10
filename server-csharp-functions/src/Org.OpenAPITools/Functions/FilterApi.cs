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
    public partial class FilterApi
    { 
        [FunctionName("FilterApi_CreateFilter")]
        public async Task<ActionResult<FilterTreeResponse>> _CreateFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/filter/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateFilter");
            return method != null
                ? (await ((Task<FilterTreeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilterApi_DeleteFilter")]
        public async Task<ActionResult<SirqulResponse>> _DeleteFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/filter/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteFilter");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilterApi_GetFilter")]
        public async Task<ActionResult<FilterTreeResponse>> _GetFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/filter/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetFilter");
            return method != null
                ? (await ((Task<FilterTreeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilterApi_SearchFilters")]
        public async Task<ActionResult<List<FilterResponse>>> _SearchFilters([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/filter/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchFilters");
            return method != null
                ? (await ((Task<List<FilterResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FilterApi_UpdateFilter")]
        public async Task<ActionResult<FilterTreeResponse>> _UpdateFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/filter/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateFilter");
            return method != null
                ? (await ((Task<FilterTreeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
