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
    public partial class SecureAppApi
    { 
        [FunctionName("SecureAppApi_CreateSecureApplication")]
        public async Task<ActionResult<SirqulResponse>> _CreateSecureApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/application/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateSecureApplication");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SecureAppApi_DeleteSecureApplication")]
        public async Task<ActionResult<SirqulResponse>> _DeleteSecureApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/application/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteSecureApplication");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SecureAppApi_LoginSecure")]
        public async Task<ActionResult<ProfileResponse>> _LoginSecure([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/login")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LoginSecure");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SecureAppApi_PurchaseSecure")]
        public async Task<ActionResult<ProfileResponse>> _PurchaseSecure([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/purchase")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PurchaseSecure");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SecureAppApi_ResetSecure")]
        public async Task<ActionResult<SirqulResponse>> _ResetSecure([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/application/reset")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ResetSecure");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SecureAppApi_UpdateSecureApplication")]
        public async Task<ActionResult<SirqulResponse>> _UpdateSecureApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18secure/application/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateSecureApplication");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
