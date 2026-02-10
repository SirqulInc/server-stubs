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
    public partial class TournamentApi
    { 
        [FunctionName("TournamentApi_CreateTournament")]
        public async Task<ActionResult<TournamentResponse>> _CreateTournament([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateTournament");
            return method != null
                ? (await ((Task<TournamentResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_DeleteTournament")]
        public async Task<ActionResult<SirqulResponse>> _DeleteTournament([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteTournament");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_GetTournament")]
        public async Task<ActionResult<TournamentResponse>> _GetTournament([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tournament/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetTournament");
            return method != null
                ? (await ((Task<TournamentResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SearchObjects")]
        public async Task<ActionResult<SirqulResponse>> _SearchObjects([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tournament/object/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchObjects");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SearchRounds")]
        public async Task<ActionResult<SirqulResponse>> _SearchRounds([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tournament/round/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchRounds");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SearchTournaments")]
        public async Task<ActionResult<MissionShortResponse>> _SearchTournaments([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/tournament/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchTournaments");
            return method != null
                ? (await ((Task<MissionShortResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SubmitTournamentScore")]
        public async Task<ActionResult<SirqulResponse>> _SubmitTournamentScore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/score")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SubmitTournamentScore");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SubmitTournamentVote")]
        public async Task<ActionResult<SirqulResponse>> _SubmitTournamentVote([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/vote")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SubmitTournamentVote");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_SubstituteTournamentPlayer")]
        public async Task<ActionResult<SirqulResponse>> _SubstituteTournamentPlayer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/substitute")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SubstituteTournamentPlayer");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TournamentApi_UpdateTournament")]
        public async Task<ActionResult<TournamentResponse>> _UpdateTournament([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/tournament/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateTournament");
            return method != null
                ? (await ((Task<TournamentResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
