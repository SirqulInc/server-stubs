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
    public partial class QuestionApi
    { 
        [FunctionName("QuestionApi_CreateQuestion")]
        public async Task<ActionResult<QuestionResponse>> _CreateQuestion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18game/question/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateQuestion");
            return method != null
                ? (await ((Task<QuestionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("QuestionApi_DeleteQuestion")]
        public async Task<ActionResult<SirqulResponse>> _DeleteQuestion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18game/question/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteQuestion");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("QuestionApi_GetQuestion")]
        public async Task<ActionResult<QuestionResponse>> _GetQuestion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18game/question/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetQuestion");
            return method != null
                ? (await ((Task<QuestionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("QuestionApi_SearchQuestions")]
        public async Task<ActionResult<List<QuestionResponse>>> _SearchQuestions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18game/question/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchQuestions");
            return method != null
                ? (await ((Task<List<QuestionResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("QuestionApi_UpdateQuestion")]
        public async Task<ActionResult<QuestionResponse>> _UpdateQuestion([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18game/question/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateQuestion");
            return method != null
                ? (await ((Task<QuestionResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
