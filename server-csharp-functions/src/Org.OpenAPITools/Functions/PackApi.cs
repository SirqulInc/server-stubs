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
    public partial class PackApi
    { 
        [FunctionName("PackApi_CreatePack")]
        public async Task<ActionResult<PackResponse>> _CreatePack([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18pack/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreatePack");
            return method != null
                ? (await ((Task<PackResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PackApi_DeletePack")]
        public async Task<ActionResult<SirqulResponse>> _DeletePack([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18pack/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeletePack");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PackApi_GetPack")]
        public async Task<ActionResult<PackResponse>> _GetPack([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18pack/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetPack");
            return method != null
                ? (await ((Task<PackResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PackApi_SearchPacks")]
        public async Task<ActionResult<List<PackResponse>>> _SearchPacks([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18pack/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchPacks");
            return method != null
                ? (await ((Task<List<PackResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PackApi_UpdatePack")]
        public async Task<ActionResult<PackResponse>> _UpdatePack([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18pack/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdatePack");
            return method != null
                ? (await ((Task<PackResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
