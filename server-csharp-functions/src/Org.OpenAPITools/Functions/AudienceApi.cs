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
    public partial class AudienceApi
    { 
        [FunctionName("AudienceApi_CreateAudience")]
        public async Task<ActionResult<AudienceResponse>> _CreateAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18audience/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateAudience");
            return method != null
                ? (await ((Task<AudienceResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_DeleteAudience")]
        public async Task<ActionResult<SirqulResponse>> _DeleteAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18audience/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteAudience");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetAgeGroups")]
        public async Task<ActionResult<List<AgeGroupResponse>>> _GetAgeGroups([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/ageGroups")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAgeGroups");
            return method != null
                ? (await ((Task<List<AgeGroupResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetAudience")]
        public async Task<ActionResult<AudienceResponse>> _GetAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAudience");
            return method != null
                ? (await ((Task<AudienceResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetAudienceList")]
        public async Task<ActionResult<List<SearchResponse>>> _GetAudienceList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetAudienceList");
            return method != null
                ? (await ((Task<List<SearchResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetDevices")]
        public async Task<ActionResult<List<AudienceDeviceResponse>>> _GetDevices([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/devices")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetDevices");
            return method != null
                ? (await ((Task<List<AudienceDeviceResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetExperiences")]
        public async Task<ActionResult<SirqulResponse>> _GetExperiences([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/experiences")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetExperiences");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_GetGroupedAudiences")]
        public async Task<ActionResult<AudienceResponse>> _GetGroupedAudiences([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/grouped/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetGroupedAudiences");
            return method != null
                ? (await ((Task<AudienceResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_ListByAccount")]
        public async Task<ActionResult<OfferListResponse>> _ListByAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18audience/suggestion/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListByAccount");
            return method != null
                ? (await ((Task<OfferListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_ListByAudience")]
        public async Task<ActionResult<OfferListResponse>> _ListByAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/suggestion/offersByAudience")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListByAudience");
            return method != null
                ? (await ((Task<OfferListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_ListLastestByAccount")]
        public async Task<ActionResult<OfferListResponse>> _ListLastestByAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18audience/suggestion/latest")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListLastestByAccount");
            return method != null
                ? (await ((Task<OfferListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_SendByAccount")]
        public async Task<ActionResult<SirqulResponse>> _SendByAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18audience/suggestion/send")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SendByAccount");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudienceApi_UpdateAudience")]
        public async Task<ActionResult<AudienceResponse>> _UpdateAudience([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18audience/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateAudience");
            return method != null
                ? (await ((Task<AudienceResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
