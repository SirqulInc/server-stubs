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
    public partial class AMQPApi
    { 
        [FunctionName("AMQPApi_ConsumerCreate")]
        public async Task<ActionResult<QueueResponse>> _ConsumerCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/consumer/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ConsumerCreate");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_ConsumerUpdate")]
        public async Task<ActionResult<QueueResponse>> _ConsumerUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/consumer/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ConsumerUpdate");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueueCreate")]
        public async Task<ActionResult<QueueResponse>> _QueueCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueueCreate");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueueDelete")]
        public async Task<ActionResult<SirqulResponse>> _QueueDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueueDelete");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueueGet")]
        public async Task<ActionResult<QueueResponse>> _QueueGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18queue/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueueGet");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueuePublish")]
        public async Task<ActionResult<SirqulResponse>> _QueuePublish([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/publish")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueuePublish");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueueSearch")]
        public async Task<ActionResult<QueueResponse>> _QueueSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18queue/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueueSearch");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AMQPApi_QueueUpdate")]
        public async Task<ActionResult<QueueResponse>> _QueueUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18queue/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("QueueUpdate");
            return method != null
                ? (await ((Task<QueueResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
