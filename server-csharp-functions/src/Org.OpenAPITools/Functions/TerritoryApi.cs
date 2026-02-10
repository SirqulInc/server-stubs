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
    public partial class TerritoryApi
    { 
        [FunctionName("TerritoryApi_CreateTerritory")]
        public async Task<ActionResult<TerritoryResponse>> _CreateTerritory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/territory/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateTerritory");
            return method != null
                ? (await ((Task<TerritoryResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TerritoryApi_DeleteTerritory")]
        public async Task<ActionResult<SirqulResponse>> _DeleteTerritory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/territory/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteTerritory");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TerritoryApi_GetTerritory")]
        public async Task<ActionResult<TerritoryResponse>> _GetTerritory([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/territory/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTerritory");
            return method != null
                ? (await ((Task<TerritoryResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TerritoryApi_SearchTerritories")]
        public async Task<ActionResult<List<TerritoryResponse>>> _SearchTerritories([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/territory/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchTerritories");
            return method != null
                ? (await ((Task<List<TerritoryResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TerritoryApi_UpdateTerritory")]
        public async Task<ActionResult<TerritoryResponse>> _UpdateTerritory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/territory/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateTerritory");
            return method != null
                ? (await ((Task<TerritoryResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
