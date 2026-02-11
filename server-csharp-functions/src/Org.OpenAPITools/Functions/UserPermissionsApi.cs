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
    public partial class UserPermissionsApi
    { 
        [FunctionName("UserPermissionsApi_AddUsersToPermissionable")]
        public async Task<ActionResult<SirqulResponse>> _AddUsersToPermissionable([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/permissions/add")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AddUsersToPermissionable");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserPermissionsApi_ApprovePermissionable")]
        public async Task<ActionResult<SirqulResponse>> _ApprovePermissionable([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18permissionable/approve")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ApprovePermissionable");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserPermissionsApi_LeaveFromPermissionable")]
        public async Task<ActionResult<SirqulResponse>> _LeaveFromPermissionable([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/permissions/leave")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LeaveFromPermissionable");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserPermissionsApi_RemoveUsersFromPermissionable")]
        public async Task<ActionResult<SirqulResponse>> _RemoveUsersFromPermissionable([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/3.18consumer/permissions/remove")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RemoveUsersFromPermissionable");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserPermissionsApi_SearchPermissionables")]
        public async Task<ActionResult<List<UserPermissionsResponse>>> _SearchPermissionables([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18permissions/search")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchPermissionables");
            return method != null
                ? (await ((Task<List<UserPermissionsResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserPermissionsApi_SearchPermissionablesFollowingDistance")]
        public async Task<ActionResult<List<UserPermissionsResponse>>> _SearchPermissionablesFollowingDistance([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/3.18permissions/distancesearch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchPermissionablesFollowingDistance");
            return method != null
                ? (await ((Task<List<UserPermissionsResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
