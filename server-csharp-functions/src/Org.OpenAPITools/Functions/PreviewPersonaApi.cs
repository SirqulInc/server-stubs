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
    public partial class PreviewPersonaApi
    { 
        [FunctionName("PreviewPersonaApi_CreatePersona")]
        public async Task<ActionResult<PreviewPersonaResponse>> _CreatePersona([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18persona/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreatePersona");
            return method != null
                ? (await ((Task<PreviewPersonaResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PreviewPersonaApi_DeletePersona")]
        public async Task<ActionResult<SirqulResponse>> _DeletePersona([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18persona/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeletePersona");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PreviewPersonaApi_GetPersonaList")]
        public async Task<ActionResult<PreviewPersonaResponse>> _GetPersonaList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18persona/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetPersonaList");
            return method != null
                ? (await ((Task<PreviewPersonaResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PreviewPersonaApi_SearchPersona")]
        public async Task<ActionResult<PreviewPersonaResponse>> _SearchPersona([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18persona/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchPersona");
            return method != null
                ? (await ((Task<PreviewPersonaResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PreviewPersonaApi_UpdatePersona")]
        public async Task<ActionResult<PreviewPersonaResponse>> _UpdatePersona([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18persona/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdatePersona");
            return method != null
                ? (await ((Task<PreviewPersonaResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
