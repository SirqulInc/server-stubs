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
    public partial class BillableEntityApi
    { 
        [FunctionName("BillableEntityApi_CreateBillableEntity")]
        public async Task<ActionResult<BillableEntityResponse>> _CreateBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18billable/create")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CreateBillableEntity");
            return method != null
                ? (await ((Task<BillableEntityResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillableEntityApi_DeleteBillableEntity")]
        public async Task<ActionResult<SirqulResponse>> _DeleteBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18billable/delete")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeleteBillableEntity");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillableEntityApi_GetBillableEntity")]
        public async Task<ActionResult<BillableEntityResponse>> _GetBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18billable/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetBillableEntity");
            return method != null
                ? (await ((Task<BillableEntityResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillableEntityApi_UpdateBillableEntity")]
        public async Task<ActionResult<BillableEntityResponse>> _UpdateBillableEntity([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18billable/update")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UpdateBillableEntity");
            return method != null
                ? (await ((Task<BillableEntityResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
