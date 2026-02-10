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
    public partial class FavoriteApi
    { 
        [FunctionName("FavoriteApi_AddFavorite")]
        public async Task<ActionResult<WrappedResponse>> _AddFavorite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/favorite/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddFavorite");
            return method != null
                ? (await ((Task<WrappedResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FavoriteApi_DeleteFavorite")]
        public async Task<ActionResult<SirqulResponse>> _DeleteFavorite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/favorite/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteFavorite");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FavoriteApi_GetFavorite")]
        public async Task<ActionResult<WrappedResponse>> _GetFavorite([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/favorite/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetFavorite");
            return method != null
                ? (await ((Task<WrappedResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FavoriteApi_SearchFavorites")]
        public async Task<ActionResult<SearchResponse>> _SearchFavorites([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/favorite/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchFavorites");
            return method != null
                ? (await ((Task<SearchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("FavoriteApi_WhoHasFavorited")]
        public async Task<ActionResult<List<AccountResponse>>> _WhoHasFavorited([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/favorite/whois")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("WhoHasFavorited");
            return method != null
                ? (await ((Task<List<AccountResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
