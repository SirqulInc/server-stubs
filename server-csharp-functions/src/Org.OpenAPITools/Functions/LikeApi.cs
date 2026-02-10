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
    public partial class LikeApi
    { 
        [FunctionName("LikeApi_RegisterLike")]
        public async Task<ActionResult<LikableResponse>> _RegisterLike([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/like")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RegisterLike");
            return method != null
                ? (await ((Task<LikableResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LikeApi_RemoveLike")]
        public async Task<ActionResult<LikableResponse>> _RemoveLike([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/like/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveLike");
            return method != null
                ? (await ((Task<LikableResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LikeApi_SearchLikes")]
        public async Task<ActionResult<SearchResponse>> _SearchLikes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/like/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchLikes");
            return method != null
                ? (await ((Task<SearchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
