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
    public partial class DisbursementApi
    { 
        [FunctionName("DisbursementApi_CheckDisbursements")]
        public async Task<ActionResult<DisbursementResponse>> _CheckDisbursements([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/disbursement/check")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CheckDisbursements");
            return method != null
                ? (await ((Task<DisbursementResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DisbursementApi_CreateDisbursement")]
        public async Task<ActionResult<DisbursementResponse>> _CreateDisbursement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/disbursement/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateDisbursement");
            return method != null
                ? (await ((Task<DisbursementResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DisbursementApi_GetDisbursement")]
        public async Task<ActionResult<DisbursementResponse>> _GetDisbursement([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/disbursement/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetDisbursement");
            return method != null
                ? (await ((Task<DisbursementResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DisbursementApi_SearchDisbursements")]
        public async Task<ActionResult<List<DisbursementResponse>>> _SearchDisbursements([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/disbursement/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchDisbursements");
            return method != null
                ? (await ((Task<List<DisbursementResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DisbursementApi_UpdateDisbursement")]
        public async Task<ActionResult<DisbursementResponse>> _UpdateDisbursement([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/disbursement/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateDisbursement");
            return method != null
                ? (await ((Task<DisbursementResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
