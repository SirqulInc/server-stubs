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
    public partial class AssetApi
    { 
        [FunctionName("AssetApi_AssetDownload")]
        public async Task<ActionResult<SirqulResponse>> _AssetDownload([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18asset/download/{filename}")]HttpRequest req, ExecutionContext context, [RegularExpression(".+")]string filename)
        {
            var method = this.GetType().GetMethod("AssetDownload");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, filename })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_AssetMorph")]
        public async Task<ActionResult<AssetShortResponse>> _AssetMorph([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18asset/morph")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssetMorph");
            return method != null
                ? (await ((Task<AssetShortResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_CreateAsset")]
        public async Task<ActionResult<AssetResponse>> _CreateAsset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18asset/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAsset");
            return method != null
                ? (await ((Task<AssetResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_DeleteAsset")]
        public async Task<ActionResult<SirqulResponse>> _DeleteAsset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18asset/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteAsset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_GetAsset")]
        public async Task<ActionResult<AssetFullResponse>> _GetAsset([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18asset/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAsset");
            return method != null
                ? (await ((Task<AssetFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_RemoveAsset")]
        public async Task<ActionResult<SirqulResponse>> _RemoveAsset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18asset/remove")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RemoveAsset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_SearchAssets")]
        public async Task<ActionResult<List<AssetResponse>>> _SearchAssets([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18asset/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchAssets");
            return method != null
                ? (await ((Task<List<AssetResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssetApi_UpdateAsset")]
        public async Task<ActionResult<SirqulResponse>> _UpdateAsset([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18asset/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateAsset");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
