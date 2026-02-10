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
    public partial class MediaApi
    { 
        [FunctionName("MediaApi_CreateMedia")]
        public async Task<ActionResult<MediaOfferResponse>> _CreateMedia([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/media/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateMedia");
            return method != null
                ? (await ((Task<MediaOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_DeleteMedia")]
        public async Task<ActionResult<SirqulResponse>> _DeleteMedia([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/media/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteMedia");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_GetMedia")]
        public async Task<ActionResult<MediaOfferResponse>> _GetMedia([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/media/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetMedia");
            return method != null
                ? (await ((Task<MediaOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_SearchMedia")]
        public async Task<ActionResult<List<MediaOfferResponse>>> _SearchMedia([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/media/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchMedia");
            return method != null
                ? (await ((Task<List<MediaOfferResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_UpdateMedia")]
        public async Task<ActionResult<MediaOfferResponse>> _UpdateMedia([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/media/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateMedia");
            return method != null
                ? (await ((Task<MediaOfferResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
