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
    public partial class CategoryApi
    { 
        [FunctionName("CategoryApi_CategoryDistanceSearch")]
        public async Task<ActionResult<List<CategoryResponse>>> _CategoryDistanceSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18category/distancesearch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CategoryDistanceSearch");
            return method != null
                ? (await ((Task<List<CategoryResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_CreateCategory")]
        public async Task<ActionResult<CategoryTreeResponse>> _CreateCategory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18category/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateCategory");
            return method != null
                ? (await ((Task<CategoryTreeResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_DeleteCategory")]
        public async Task<ActionResult<SirqulResponse>> _DeleteCategory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18category/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteCategory");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_DuplicateCategory")]
        public async Task<ActionResult<CategoryTreeResponse>> _DuplicateCategory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18category/duplicate")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DuplicateCategory");
            return method != null
                ? (await ((Task<CategoryTreeResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_GetCategory")]
        public async Task<ActionResult<CategoryTreeResponse>> _GetCategory([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18category/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCategory");
            return method != null
                ? (await ((Task<CategoryTreeResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_SearchCategories")]
        public async Task<ActionResult<List<CategoryResponse>>> _SearchCategories([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18category/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchCategories");
            return method != null
                ? (await ((Task<List<CategoryResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CategoryApi_UpdateCategory")]
        public async Task<ActionResult<CategoryTreeResponse>> _UpdateCategory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18category/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateCategory");
            return method != null
                ? (await ((Task<CategoryTreeResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
