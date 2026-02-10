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
    public partial class AlbumApi
    { 
        [FunctionName("AlbumApi_AddAlbumCollection")]
        public async Task<ActionResult<SearchResponse>> _AddAlbumCollection([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddAlbumCollection");
            return method != null
                ? (await ((Task<SearchResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_AddAlbumUsers")]
        public async Task<ActionResult<SirqulResponse>> _AddAlbumUsers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/user/add")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddAlbumUsers");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_ApproveAlbum")]
        public async Task<ActionResult<SirqulResponse>> _ApproveAlbum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/approve")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("ApproveAlbum");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_GetAlbumCollection")]
        public async Task<ActionResult<AlbumFullResponse>> _GetAlbumCollection([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/album/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetAlbumCollection");
            return method != null
                ? (await ((Task<AlbumFullResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_LeaveAlbum")]
        public async Task<ActionResult<SirqulResponse>> _LeaveAlbum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/user/leave")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("LeaveAlbum");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_RemoveAlbum")]
        public async Task<ActionResult<SirqulResponse>> _RemoveAlbum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveAlbum");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_RemoveAlbumUsers")]
        public async Task<ActionResult<SirqulResponse>> _RemoveAlbumUsers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/user/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveAlbumUsers");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_SearchAlbums")]
        public async Task<ActionResult<List<AlbumFullResponse>>> _SearchAlbums([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/album/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchAlbums");
            return method != null
                ? (await ((Task<List<AlbumFullResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AlbumApi_UpdateAlbumCollection")]
        public async Task<ActionResult<AlbumResponse>> _UpdateAlbumCollection([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/album/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateAlbumCollection");
            return method != null
                ? (await ((Task<AlbumResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
