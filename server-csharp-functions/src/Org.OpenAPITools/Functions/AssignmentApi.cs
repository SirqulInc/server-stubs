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
    public partial class AssignmentApi
    { 
        [FunctionName("AssignmentApi_AssigmentAssigneeAccountSearch")]
        public async Task<ActionResult<List<AccountMiniResponse>>> _AssigmentAssigneeAccountSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18assignment/assignee/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssigmentAssigneeAccountSearch");
            return method != null
                ? (await ((Task<List<AccountMiniResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentCreate")]
        public async Task<ActionResult<AssignmentResponse>> _AssignmentCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentCreate");
            return method != null
                ? (await ((Task<AssignmentResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentDelete")]
        public async Task<ActionResult<SirqulResponse>> _AssignmentDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentDelete");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentGet")]
        public async Task<ActionResult<AssignmentResponse>> _AssignmentGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18assignment/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentGet");
            return method != null
                ? (await ((Task<AssignmentResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentSearch")]
        public async Task<ActionResult<List<AssignmentResponse>>> _AssignmentSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18assignment/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentSearch");
            return method != null
                ? (await ((Task<List<AssignmentResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentStatusCreate")]
        public async Task<ActionResult<AssignmentStatusResponse>> _AssignmentStatusCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/status/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentStatusCreate");
            return method != null
                ? (await ((Task<AssignmentStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentStatusDelete")]
        public async Task<ActionResult<SirqulResponse>> _AssignmentStatusDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/status/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentStatusDelete");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentStatusGet")]
        public async Task<ActionResult<AssignmentStatusResponse>> _AssignmentStatusGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18assignment/status/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentStatusGet");
            return method != null
                ? (await ((Task<AssignmentStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentStatusSearch")]
        public async Task<ActionResult<List<AssignmentStatusResponse>>> _AssignmentStatusSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18assignment/status/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentStatusSearch");
            return method != null
                ? (await ((Task<List<AssignmentStatusResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentStatusUpdate")]
        public async Task<ActionResult<AssignmentStatusResponse>> _AssignmentStatusUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/status/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentStatusUpdate");
            return method != null
                ? (await ((Task<AssignmentStatusResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AssignmentApi_AssignmentUpdate")]
        public async Task<ActionResult<AssignmentResponse>> _AssignmentUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18assignment/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AssignmentUpdate");
            return method != null
                ? (await ((Task<AssignmentResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
