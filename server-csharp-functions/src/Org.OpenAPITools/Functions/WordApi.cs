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
    public partial class WordApi
    { 
        [FunctionName("WordApi_CreateWord")]
        public async Task<ActionResult<WordzWordResponse>> _CreateWord([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18game/word/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateWord");
            return method != null
                ? (await ((Task<WordzWordResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WordApi_DeleteWord")]
        public async Task<ActionResult<SirqulResponse>> _DeleteWord([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/3.18game/word/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteWord");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WordApi_GetWord")]
        public async Task<ActionResult<WordzWordResponse>> _GetWord([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18game/word/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetWord");
            return method != null
                ? (await ((Task<WordzWordResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WordApi_GetWords")]
        public async Task<ActionResult<List<WordzWordResponse>>> _GetWords([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18game/word/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetWords");
            return method != null
                ? (await ((Task<List<WordzWordResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("WordApi_UpdateWord")]
        public async Task<ActionResult<WordzWordResponse>> _UpdateWord([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18game/word/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateWord");
            return method != null
                ? (await ((Task<WordzWordResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
