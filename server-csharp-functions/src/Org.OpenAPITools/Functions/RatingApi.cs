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
    public partial class RatingApi
    { 
        [FunctionName("RatingApi_CreateRating")]
        public async Task<ActionResult<RatingResponse>> _CreateRating([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18rating/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateRating");
            return method != null
                ? (await ((Task<RatingResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingApi_DeleteRating")]
        public async Task<ActionResult<SirqulResponse>> _DeleteRating([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18rating/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteRating");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingApi_SearchLocationRatingIndexes")]
        public async Task<ActionResult<List<RatingIndexResponse>>> _SearchLocationRatingIndexes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18location/rating/index/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchLocationRatingIndexes");
            return method != null
                ? (await ((Task<List<RatingIndexResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingApi_SearchRatingIndexes")]
        public async Task<ActionResult<List<RatingIndexResponse>>> _SearchRatingIndexes([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18rating/index/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRatingIndexes");
            return method != null
                ? (await ((Task<List<RatingIndexResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingApi_SearchRatings")]
        public async Task<ActionResult<List<RatingResponse>>> _SearchRatings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18rating/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchRatings");
            return method != null
                ? (await ((Task<List<RatingResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("RatingApi_UpdateRating")]
        public async Task<ActionResult<RatingResponse>> _UpdateRating([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18rating/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateRating");
            return method != null
                ? (await ((Task<RatingResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
