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
    public partial class ApplicationConfigApi
    { 
        [FunctionName("ApplicationConfigApi_CreateApplicationConfig")]
        public async Task<ActionResult<ApplicationConfigResponse>> _CreateApplicationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18appconfig/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateApplicationConfig");
            return method != null
                ? (await ((Task<ApplicationConfigResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationConfigApi_DeleteApplicationConfig")]
        public async Task<ActionResult<SirqulResponse>> _DeleteApplicationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18appconfig/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteApplicationConfig");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationConfigApi_GetApplicationConfig")]
        public async Task<ActionResult<ApplicationConfigResponse>> _GetApplicationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18appconfig/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApplicationConfig");
            return method != null
                ? (await ((Task<ApplicationConfigResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationConfigApi_GetApplicationConfigByConfigVersion")]
        public async Task<ActionResult<ApplicationConfigResponse>> _GetApplicationConfigByConfigVersion([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18appconfig/getbyversion")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApplicationConfigByConfigVersion");
            return method != null
                ? (await ((Task<ApplicationConfigResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationConfigApi_SearchApplicationConfig")]
        public async Task<ActionResult<List<ApplicationConfigResponse>>> _SearchApplicationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18appconfig/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchApplicationConfig");
            return method != null
                ? (await ((Task<List<ApplicationConfigResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationConfigApi_UpdateApplicationConfig")]
        public async Task<ActionResult<ApplicationConfigResponse>> _UpdateApplicationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18appconfig/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateApplicationConfig");
            return method != null
                ? (await ((Task<ApplicationConfigResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
