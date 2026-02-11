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
    public partial class TaskApi
    { 
        [FunctionName("TaskApi_CreateTask")]
        public async Task<ActionResult<TaskResponse>> _CreateTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18task/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateTask");
            return method != null
                ? (await ((Task<TaskResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TaskApi_DeleteTask")]
        public async Task<ActionResult<SirqulResponse>> _DeleteTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18task/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteTask");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TaskApi_GetTask")]
        public async Task<ActionResult<TaskResponse>> _GetTask([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18task/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetTask");
            return method != null
                ? (await ((Task<TaskResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TaskApi_SearchTasks")]
        public async Task<ActionResult<List<TaskResponse>>> _SearchTasks([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18task/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchTasks");
            return method != null
                ? (await ((Task<List<TaskResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TaskApi_UpdateTask")]
        public async Task<ActionResult<TaskResponse>> _UpdateTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18task/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateTask");
            return method != null
                ? (await ((Task<TaskResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
