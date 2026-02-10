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
    public partial class ConnectionApi
    { 
        [FunctionName("ConnectionApi_AddConnectionToGroup")]
        public async Task<ActionResult<SirqulResponse>> _AddConnectionToGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group/addConnection")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddConnectionToGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_AddConnectionsToGroup")]
        public async Task<ActionResult<SirqulResponse>> _AddConnectionsToGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/connection/group/addConnections")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddConnectionsToGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_AddSubGroups")]
        public async Task<ActionResult<ConnectionGroupResponse>> _AddSubGroups([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group/addSubGroup")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("AddSubGroups");
            return method != null
                ? (await ((Task<ConnectionGroupResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_CreateOrUpdateConnection")]
        public async Task<ActionResult<ConnectionResponse>> _CreateOrUpdateConnection([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/add")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateOrUpdateConnection");
            return method != null
                ? (await ((Task<ConnectionResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_CreateOrUpdateGroup")]
        public async Task<ActionResult<SirqulResponse>> _CreateOrUpdateGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("CreateOrUpdateGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FollowAccept")]
        public async Task<ActionResult<SirqulResponse>> _FollowAccept([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/follow/accept")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FollowAccept");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FollowReject")]
        public async Task<ActionResult<SirqulResponse>> _FollowReject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/follow/reject")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FollowReject");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FollowRemove")]
        public async Task<ActionResult<SirqulResponse>> _FollowRemove([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/follow/remove")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FollowRemove");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FollowRequest")]
        public async Task<ActionResult<SirqulResponse>> _FollowRequest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/follow/request")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FollowRequest");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FriendAccept")]
        public async Task<ActionResult<SirqulResponse>> _FriendAccept([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/friend/accept")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FriendAccept");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FriendReject")]
        public async Task<ActionResult<SirqulResponse>> _FriendReject([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/friend/reject")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FriendReject");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FriendRemove")]
        public async Task<ActionResult<SirqulResponse>> _FriendRemove([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/friend/remove")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FriendRemove");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_FriendRequest")]
        public async Task<ActionResult<SirqulResponse>> _FriendRequest([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/friend/request")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("FriendRequest");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_GetConnectionSentFriendRequests")]
        public async Task<ActionResult<ConnectionListResponse>> _GetConnectionSentFriendRequests([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/consumer/connection/getRequested")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetConnectionSentFriendRequests");
            return method != null
                ? (await ((Task<ConnectionListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_GetConnections")]
        public async Task<ActionResult<ConnectionListResponse>> _GetConnections([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/consumer/connection/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetConnections");
            return method != null
                ? (await ((Task<ConnectionListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_GetGroupDetails")]
        public async Task<ActionResult<ConnectionGroupResponse>> _GetGroupDetails([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/consumer/connection/group/details/get")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GetGroupDetails");
            return method != null
                ? (await ((Task<ConnectionGroupResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_GroupSearch")]
        public async Task<ActionResult<List<ConnectionInfoResponse>>> _GroupSearch([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/connection/group/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("GroupSearch");
            return method != null
                ? (await ((Task<List<ConnectionInfoResponse>>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_RemoveConnectionFromGroup")]
        public async Task<ActionResult<SirqulResponse>> _RemoveConnectionFromGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group/removeConnection")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveConnectionFromGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_RemoveConnectionsFromGroup")]
        public async Task<ActionResult<SirqulResponse>> _RemoveConnectionsFromGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/connection/group/removeConnections")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveConnectionsFromGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_RemoveGroup")]
        public async Task<ActionResult<SirqulResponse>> _RemoveGroup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group/remove")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveGroup");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_RemoveSubGroups")]
        public async Task<ActionResult<SirqulResponse>> _RemoveSubGroups([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "api/{version}/consumer/connection/group/removeSubGroup")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("RemoveSubGroups");
            return method != null
                ? (await ((Task<SirqulResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConnectionApi_SearchConnections")]
        public async Task<ActionResult<ConnectionListResponse>> _SearchConnections([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/{version}/connection/search")]HttpRequest req, ExecutionContext context, decimal version)
        {
            var method = this.GetType().GetMethod("SearchConnections");
            return method != null
                ? (await ((Task<ConnectionListResponse>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
