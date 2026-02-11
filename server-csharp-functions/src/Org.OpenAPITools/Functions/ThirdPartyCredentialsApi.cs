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
    public partial class ThirdPartyCredentialsApi
    { 
        [FunctionName("ThirdPartyCredentialsApi_CreateCredential")]
        public async Task<ActionResult<ProfileResponse>> _CreateCredential([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/credential/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateCredential");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_CreateNetwork")]
        public async Task<ActionResult<ThirdPartyNetworkResponse>> _CreateNetwork([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/network/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateNetwork");
            return method != null
                ? (await ((Task<ThirdPartyNetworkResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_DeleteCredential")]
        public async Task<ActionResult<SirqulResponse>> _DeleteCredential([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/credential/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteCredential");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_DeleteNetwork")]
        public async Task<ActionResult<SirqulResponse>> _DeleteNetwork([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/network/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteNetwork");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_GetCredential")]
        public async Task<ActionResult<ProfileResponse>> _GetCredential([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/credential/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetCredential");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_GetNetwork")]
        public async Task<ActionResult<ThirdPartyNetworkResponse>> _GetNetwork([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18thirdparty/network/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetNetwork");
            return method != null
                ? (await ((Task<ThirdPartyNetworkResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_SearchCredentials")]
        public async Task<ActionResult<List<ThirdPartyCredentialResponse>>> _SearchCredentials([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18thirdparty/credential/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchCredentials");
            return method != null
                ? (await ((Task<List<ThirdPartyCredentialResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_SearchNetworks")]
        public async Task<ActionResult<List<ThirdPartyNetworkShortResponse>>> _SearchNetworks([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18thirdparty/network/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchNetworks");
            return method != null
                ? (await ((Task<List<ThirdPartyNetworkShortResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_SendMFAChallenge")]
        public async Task<ActionResult<SirqulResponse>> _SendMFAChallenge([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/credential/mfa/send")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SendMFAChallenge");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_UpdateCredential")]
        public async Task<ActionResult<ProfileResponse>> _UpdateCredential([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/credential/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateCredential");
            return method != null
                ? (await ((Task<ProfileResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ThirdPartyCredentialsApi_UpdateNetwork")]
        public async Task<ActionResult<ThirdPartyNetworkResponse>> _UpdateNetwork([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18thirdparty/network/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateNetwork");
            return method != null
                ? (await ((Task<ThirdPartyNetworkResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
