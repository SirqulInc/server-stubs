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
    public partial class ServiceHubApi
    { 
        [FunctionName("ServiceHubApi_CreateServiceHub")]
        public async Task<ActionResult<ServiceHub>> _CreateServiceHub([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18hub")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateServiceHub");
            return method != null
                ? (await ((Task<ServiceHub>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ServiceHubApi_DeleteServiceHub")]
        public async Task<ActionResult<>> _DeleteServiceHub([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "api/3.18hub/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("DeleteServiceHub");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ServiceHubApi_GetServiceHub")]
        public async Task<ActionResult<Object>> _GetServiceHub([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18hub/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("GetServiceHub");
            return method != null
                ? (await ((Task<Object>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ServiceHubApi_PostServiceHub")]
        public async Task<ActionResult<ServiceHub>> _PostServiceHub([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18hub/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("PostServiceHub");
            return method != null
                ? (await ((Task<ServiceHub>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ServiceHubApi_PutServiceHub")]
        public async Task<ActionResult<ServiceHub>> _PutServiceHub([HttpTrigger(AuthorizationLevel.Anonymous, "Put", Route = "api/3.18hub/{id}")]HttpRequest req, ExecutionContext context, long id)
        {
            var method = this.GetType().GetMethod("PutServiceHub");
            return method != null
                ? (await ((Task<ServiceHub>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ServiceHubApi_SearchServiceHubs")]
        public async Task<ActionResult<List<ServiceHub>>> _SearchServiceHubs([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18hub")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchServiceHubs");
            return method != null
                ? (await ((Task<List<ServiceHub>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
