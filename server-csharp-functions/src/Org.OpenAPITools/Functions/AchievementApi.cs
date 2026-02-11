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
    public partial class AchievementApi
    { 
        [FunctionName("AchievementApi_AchievementTierSearchPost")]
        public async Task<ActionResult<AchievementTierResponse>> _AchievementTierSearchPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/tier/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AchievementTierSearchPost");
            return method != null
                ? (await ((Task<AchievementTierResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_CreateAchievement")]
        public async Task<ActionResult<AchievementResponse>> _CreateAchievement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAchievement");
            return method != null
                ? (await ((Task<AchievementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_CreateAchievementTier")]
        public async Task<ActionResult<AchievementTierResponse>> _CreateAchievementTier([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/tier/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAchievementTier");
            return method != null
                ? (await ((Task<AchievementTierResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_DeleteAchievement")]
        public async Task<ActionResult<SirqulResponse>> _DeleteAchievement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteAchievement");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_DeleteAchievementTier")]
        public async Task<ActionResult<SirqulResponse>> _DeleteAchievementTier([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/tier/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteAchievementTier");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_GetAchievement")]
        public async Task<ActionResult<AchievementTierResponse>> _GetAchievement([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18achievement/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAchievement");
            return method != null
                ? (await ((Task<AchievementTierResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_GetAchievementTier")]
        public async Task<ActionResult<AchievementTierResponse>> _GetAchievementTier([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/tier/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAchievementTier");
            return method != null
                ? (await ((Task<AchievementTierResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_GetUserAchievements")]
        public async Task<ActionResult<List<AchievementProgressResponse>>> _GetUserAchievements([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18achievement/progress/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUserAchievements");
            return method != null
                ? (await ((Task<List<AchievementProgressResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_ListAchievementTags")]
        public async Task<ActionResult<SirqulResponse>> _ListAchievementTags([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18achievement/tag/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListAchievementTags");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_ListAchievements")]
        public async Task<ActionResult<List<AchievementShortResponse>>> _ListAchievements([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18achievement/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListAchievements");
            return method != null
                ? (await ((Task<List<AchievementShortResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_SearchAchievements")]
        public async Task<ActionResult<List<AchievementShortResponse>>> _SearchAchievements([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18achievement/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchAchievements");
            return method != null
                ? (await ((Task<List<AchievementShortResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_UpdateAchievement")]
        public async Task<ActionResult<AchievementResponse>> _UpdateAchievement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateAchievement");
            return method != null
                ? (await ((Task<AchievementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_UpdateAchievementTier")]
        public async Task<ActionResult<AchievementTierResponse>> _UpdateAchievementTier([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/tier/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateAchievementTier");
            return method != null
                ? (await ((Task<AchievementTierResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AchievementApi_UpdateUserAchievement")]
        public async Task<ActionResult<SirqulResponse>> _UpdateUserAchievement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18achievement/progress/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateUserAchievement");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
