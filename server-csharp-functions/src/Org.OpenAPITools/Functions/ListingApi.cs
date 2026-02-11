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
    public partial class ListingApi
    { 
        [FunctionName("ListingApi_CreateListing")]
        public async Task<ActionResult<ListingFullResponse>> _CreateListing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18listing/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateListing");
            return method != null
                ? (await ((Task<ListingFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ListingApi_DeleteListing")]
        public async Task<ActionResult<SirqulResponse>> _DeleteListing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18listing/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteListing");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ListingApi_GetListing")]
        public async Task<ActionResult<ListingFullResponse>> _GetListing([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18listing/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetListing");
            return method != null
                ? (await ((Task<ListingFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ListingApi_SearchListing")]
        public async Task<ActionResult<List<ListingResponse>>> _SearchListing([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18listing/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchListing");
            return method != null
                ? (await ((Task<List<ListingResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ListingApi_SummaryListing")]
        public async Task<ActionResult<List<ListingGroupResponse>>> _SummaryListing([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18listing/summary")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SummaryListing");
            return method != null
                ? (await ((Task<List<ListingGroupResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ListingApi_UpdateListing")]
        public async Task<ActionResult<ListingFullResponse>> _UpdateListing([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18listing/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateListing");
            return method != null
                ? (await ((Task<ListingFullResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
