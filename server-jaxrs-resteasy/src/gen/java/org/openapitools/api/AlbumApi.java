package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AlbumApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import java.io.File;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/album")


@io.swagger.annotations.Api(description = "the album API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AlbumApi  {

    @Inject AlbumApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Album", notes = "Create an Album.", response = SearchResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response addAlbumCollection( @NotNull @QueryParam("title") String title, @NotNull @QueryParam("coverAssetNullable") Boolean coverAssetNullable, @NotNull @QueryParam("includeCoverInAssetList") Boolean includeCoverInAssetList, @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull @QueryParam("anonymous") Boolean anonymous, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("assetId") Long assetId, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaURL") String attachedMediaURL, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addAlbumCollection(title,coverAssetNullable,includeCoverInAssetList,publicRead,publicWrite,publicDelete,publicAdd,anonymous,deviceId,accountId,assetsToAdd,media,mediaURL,assetId,attachedMedia,attachedMediaURL,startDate,endDate,tags,description,albumType,albumTypeId,subType,latitude,longitude,locationDescription,visibility,gameType,appKey,cellPhone,streetAddress,streetAddress2,city,state,postalCode,fullAddress,metaData,categoryIds,categoryFilterIds,audienceIds,includeAllAppUsersAsMembers,includeAudiencesAsMembers,audienceOperator,approvalStatus,linkedObjectType,linkedObjectId,securityContext);
    }
    @POST
    @Path("/user/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Album Users", notes = "Add users to an album as participants.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addAlbumUsers( @NotNull @QueryParam("albumId") Long albumId, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("read") Boolean read, @QueryParam("write") Boolean write, @QueryParam("delete") Boolean delete, @QueryParam("add") Boolean add, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addAlbumUsers(albumId,includeFriendGroup,deviceId,accountId,read,write,delete,add,connections,connectionGroups,securityContext);
    }
    @POST
    @Path("/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Album", notes = "Sets the approval status of an Album.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approveAlbum( @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("verified") Boolean verified,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveAlbum(albumId,deviceId,accountId,approvalStatus,verified,securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = " Get Album", notes = "Get an Album.", response = AlbumFullResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class) })
    public Response getAlbumCollection( @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("likePreviewSize") Integer likePreviewSize, @QueryParam("assetPreviewSize") Integer assetPreviewSize, @QueryParam("notePreviewSize") Integer notePreviewSize, @QueryParam("connectionPreviewSize") Integer connectionPreviewSize, @QueryParam("audiencePreviewSize") Integer audiencePreviewSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumCollection(returnNulls,albumId,deviceId,accountId,likePreviewSize,assetPreviewSize,notePreviewSize,connectionPreviewSize,audiencePreviewSize,securityContext);
    }
    @POST
    @Path("/user/leave")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Leave Album", notes = " Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response leaveAlbum( @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.leaveAlbum(albumId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Album", notes = "Deletes an Album", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAlbum( @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAlbum(albumId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/user/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Album Users", notes = "Remove participants of an album.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAlbumUsers( @NotNull @QueryParam("albumId") Long albumId, @NotNull @QueryParam("removeFriendGroup") Boolean removeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAlbumUsers(albumId,removeFriendGroup,deviceId,accountId,connections,connectionGroups,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Albums", notes = "Searches on Albums.", response = AlbumFullResponse.class, responseContainer = "List", tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class, responseContainer = "List") })
    public Response searchAlbums( @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("albumTypeId") Long albumTypeId, @NotNull @QueryParam("subType") String subType, @NotNull @QueryParam("includeInactive") Boolean includeInactive, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("range") Double range, @NotNull @QueryParam("includeLiked") Boolean includeLiked, @NotNull @QueryParam("includeFavorited") Boolean includeFavorited, @NotNull @QueryParam("includePermissions") Boolean includePermissions, @NotNull @QueryParam("likePreviewSize") Integer likePreviewSize, @NotNull @QueryParam("assetPreviewSize") Integer assetPreviewSize, @NotNull @QueryParam("notePreviewSize") Integer notePreviewSize, @NotNull @QueryParam("connectionPreviewSize") Integer connectionPreviewSize, @NotNull @QueryParam("audiencePreviewSize") Integer audiencePreviewSize, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("ownerId") Long ownerId, @QueryParam("albumIds") String albumIds, @QueryParam("excludeAlbumIds") String excludeAlbumIds, @QueryParam("mediaId") Long mediaId, @QueryParam("keyword") String keyword, @QueryParam("albumType") String albumType, @QueryParam("limitPerAlbumType") Integer limitPerAlbumType, @QueryParam("dateCreated") Long dateCreated, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("createdSince") Long createdSince, @QueryParam("createdBefore") Long createdBefore, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("excludeAudienceIds") String excludeAudienceIds, @QueryParam("includeCompletable") Boolean includeCompletable, @QueryParam("includeRating") Boolean includeRating, @QueryParam("searchMode") String searchMode, @QueryParam("stackSearch") Boolean stackSearch, @QueryParam("stackWindowSize") Integer stackWindowSize, @QueryParam("minStackPerPage") Integer minStackPerPage, @QueryParam("stackPaginationIdentifier") String stackPaginationIdentifier, @QueryParam("stackDetails") Boolean stackDetails, @QueryParam("flagCountMinimum") Long flagCountMinimum, @DefaultValue("true") @QueryParam("removeFlaggedContent") Boolean removeFlaggedContent, @QueryParam("verifiedFilter") Boolean verifiedFilter, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("orderAudienceId") Long orderAudienceId, @QueryParam("ignoreDefaultAppFilter") Boolean ignoreDefaultAppFilter, @QueryParam("searchExpression") String searchExpression, @QueryParam("generateAlbums") Boolean generateAlbums,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAlbums(filter,albumTypeId,subType,includeInactive,sortField,descending,start,limit,range,includeLiked,includeFavorited,includePermissions,likePreviewSize,assetPreviewSize,notePreviewSize,connectionPreviewSize,audiencePreviewSize,deviceId,accountId,connectionAccountId,ownerId,albumIds,excludeAlbumIds,mediaId,keyword,albumType,limitPerAlbumType,dateCreated,updatedSince,updatedBefore,createdSince,createdBefore,startedSince,startedBefore,endedSince,endedBefore,latitude,longitude,appKey,categoryIds,categoryFilterIds,audienceIds,excludeAudienceIds,includeCompletable,includeRating,searchMode,stackSearch,stackWindowSize,minStackPerPage,stackPaginationIdentifier,stackDetails,flagCountMinimum,removeFlaggedContent,verifiedFilter,linkedObjectType,linkedObjectId,orderAudienceId,ignoreDefaultAppFilter,searchExpression,generateAlbums,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Album", notes = "Update an Album.", response = AlbumResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumResponse.class) })
    public Response updateAlbumCollection( @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("assetsToRemove") String assetsToRemove, @QueryParam("assetId") Long assetId, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("publicRead") Boolean publicRead, @QueryParam("publicWrite") Boolean publicWrite, @QueryParam("publicDelete") Boolean publicDelete, @QueryParam("publicAdd") Boolean publicAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("anonymous") Boolean anonymous, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("indexNow") Boolean indexNow,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAlbumCollection(albumId,deviceId,accountId,assetsToAdd,assetsToRemove,assetId,media,mediaURL,active,title,startDate,endDate,tags,description,albumType,albumTypeId,subType,publicRead,publicWrite,publicDelete,publicAdd,latitude,longitude,locationDescription,visibility,cellPhone,streetAddress,streetAddress2,city,state,postalCode,fullAddress,anonymous,metaData,categoryIds,categoryFilterIds,audienceIds,audienceIdsToAdd,audienceIdsToRemove,includeAllAppUsersAsMembers,includeAudiencesAsMembers,audienceOperator,linkedObjectType,linkedObjectId,indexNow,securityContext);
    }
}
