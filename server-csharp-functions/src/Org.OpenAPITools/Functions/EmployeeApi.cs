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
    public partial class EmployeeApi
    { 
        [FunctionName("EmployeeApi_AssignEmployee")]
        public async Task<ActionResult<EmployeeResponse>> _AssignEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/assign")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AssignEmployee");
            return method != null
                ? (await ((Task<EmployeeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_AssignToLocationEmployee")]
        public async Task<ActionResult<SirqulResponse>> _AssignToLocationEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/assignToLocation")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AssignToLocationEmployee");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_CreateEmployee")]
        public async Task<ActionResult<EmployeeResponse>> _CreateEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/create")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateEmployee");
            return method != null
                ? (await ((Task<EmployeeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_DeleteEmployee")]
        public async Task<ActionResult<SirqulResponse>> _DeleteEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/delete")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("DeleteEmployee");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_GetEmployee")]
        public async Task<ActionResult<EmployeeResponse>> _GetEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetEmployee");
            return method != null
                ? (await ((Task<EmployeeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_SearchEmployees")]
        public async Task<ActionResult<List<EmployeeResponse>>> _SearchEmployees([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchEmployees");
            return method != null
                ? (await ((Task<List<EmployeeResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_UnassignEmployee")]
        public async Task<ActionResult<EmployeeResponse>> _UnassignEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/unassign")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UnassignEmployee");
            return method != null
                ? (await ((Task<EmployeeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EmployeeApi_UpdateEmployee")]
        public async Task<ActionResult<EmployeeResponse>> _UpdateEmployee([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/employee/update")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("UpdateEmployee");
            return method != null
                ? (await ((Task<EmployeeResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
