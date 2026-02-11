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
    public partial class ApplicationApi
    { 
        [FunctionName("ApplicationApi_CreateApplication")]
        public async Task<ActionResult<ApplicationResponse>> _CreateApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateApplication");
            return method != null
                ? (await ((Task<ApplicationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_CreateApplicationPlacement")]
        public async Task<ActionResult<PlacementResponse>> _CreateApplicationPlacement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/placement/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateApplicationPlacement");
            return method != null
                ? (await ((Task<PlacementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_DeleteApplication")]
        public async Task<ActionResult<SirqulResponse>> _DeleteApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteApplication");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_DeleteApplicationPlacement")]
        public async Task<ActionResult<PlacementResponse>> _DeleteApplicationPlacement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/placement/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteApplicationPlacement");
            return method != null
                ? (await ((Task<PlacementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_GetApplication")]
        public async Task<ActionResult<ApplicationResponse>> _GetApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApplication");
            return method != null
                ? (await ((Task<ApplicationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_GetApplicationPlacement")]
        public async Task<ActionResult<PlacementResponse>> _GetApplicationPlacement([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/placement/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApplicationPlacement");
            return method != null
                ? (await ((Task<PlacementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_GetApplicationVersions")]
        public async Task<ActionResult<SirqulResponse>> _GetApplicationVersions([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/versions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetApplicationVersions");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_GetUniqueUsersByApp")]
        public async Task<ActionResult<AccountListResponse>> _GetUniqueUsersByApp([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/users")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetUniqueUsersByApp");
            return method != null
                ? (await ((Task<AccountListResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_ListApplications")]
        public async Task<ActionResult<List<ApplicationShortResponse>>> _ListApplications([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/list")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ListApplications");
            return method != null
                ? (await ((Task<List<ApplicationShortResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_SearchApplicationPlacement")]
        public async Task<ActionResult<List<PlacementResponse>>> _SearchApplicationPlacement([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/placement/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchApplicationPlacement");
            return method != null
                ? (await ((Task<List<PlacementResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_SearchApplicationSettings")]
        public async Task<ActionResult<ApplicationSettingsResponse>> _SearchApplicationSettings([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/settings/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchApplicationSettings");
            return method != null
                ? (await ((Task<ApplicationSettingsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_SearchApplications")]
        public async Task<ActionResult<List<ApplicationResponse>>> _SearchApplications([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18application/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchApplications");
            return method != null
                ? (await ((Task<List<ApplicationResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_UpdateApplication")]
        public async Task<ActionResult<ApplicationResponse>> _UpdateApplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateApplication");
            return method != null
                ? (await ((Task<ApplicationResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_UpdateApplicationActive")]
        public async Task<ActionResult<SirqulResponse>> _UpdateApplicationActive([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/active")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateApplicationActive");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_UpdateApplicationPlacement")]
        public async Task<ActionResult<PlacementResponse>> _UpdateApplicationPlacement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/placement/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateApplicationPlacement");
            return method != null
                ? (await ((Task<PlacementResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ApplicationApi_UploadApplicationCertificate")]
        public async Task<ActionResult<SirqulResponse>> _UploadApplicationCertificate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18application/certificate/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UploadApplicationCertificate");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
