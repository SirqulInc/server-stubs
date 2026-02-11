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
    public partial class InviteApi
    { 
        [FunctionName("InviteApi_AcceptInvite")]
        public async Task<ActionResult<ConsumerInviteResponse>> _AcceptInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/accept")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AcceptInvite");
            return method != null
                ? (await ((Task<ConsumerInviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_AlbumContestInvite")]
        public async Task<ActionResult<InviteResponse>> _AlbumContestInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/albumContest")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AlbumContestInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_AlbumInvite")]
        public async Task<ActionResult<InviteResponse>> _AlbumInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/album")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AlbumInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_EventInvite")]
        public async Task<ActionResult<InviteResponse>> _EventInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/event")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EventInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_GameInvite")]
        public async Task<ActionResult<InviteResponse>> _GameInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/gameLevel")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GameInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_GetInvite")]
        public async Task<ActionResult<SirqulResponse>> _GetInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18invite/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetInvite");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_MissionInvite")]
        public async Task<ActionResult<InviteResponse>> _MissionInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/mission")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MissionInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_OfferInvite")]
        public async Task<ActionResult<InviteResponse>> _OfferInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/offer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OfferInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_OfferLocationInvite")]
        public async Task<ActionResult<InviteResponse>> _OfferLocationInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/offerLocation")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OfferLocationInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("InviteApi_RetailerLocationInvite")]
        public async Task<ActionResult<InviteResponse>> _RetailerLocationInvite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18invite/retailerLocation")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RetailerLocationInvite");
            return method != null
                ? (await ((Task<InviteResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
