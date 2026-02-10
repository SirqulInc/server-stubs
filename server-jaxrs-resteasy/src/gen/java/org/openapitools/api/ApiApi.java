package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.AccountListResponse;
import org.openapitools.model.AccountLoginResponse;
import org.openapitools.model.AccountMiniResponse;
import org.openapitools.model.AccountResponse;
import org.openapitools.model.AchievementProgressResponse;
import org.openapitools.model.AchievementResponse;
import org.openapitools.model.AchievementShortResponse;
import org.openapitools.model.AchievementTierResponse;
import org.openapitools.model.ActivityResponse;
import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AlbumContestListResponse;
import org.openapitools.model.AlbumContestResponse;
import org.openapitools.model.AlbumFullResponse;
import org.openapitools.model.AlbumResponse;
import org.openapitools.model.AppResponse;
import org.openapitools.model.ApplicationConfigResponse;
import org.openapitools.model.ApplicationResponse;
import org.openapitools.model.ApplicationSettingsResponse;
import org.openapitools.model.ApplicationShortResponse;
import org.openapitools.model.ApplicationUsageResponse;
import org.openapitools.model.AssetFullResponse;
import org.openapitools.model.AssetListResponse;
import org.openapitools.model.AssetResponse;
import org.openapitools.model.AssetShortResponse;
import org.openapitools.model.AssignmentResponse;
import org.openapitools.model.AssignmentStatusResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.AvailabilityResponse;
import org.openapitools.model.BidResponse;
import java.math.BigDecimal;
import org.openapitools.model.BillableEntityResponse;
import org.openapitools.model.BlockedNotificationResponse;
import org.openapitools.model.CargoType;
import org.openapitools.model.CategoryResponse;
import org.openapitools.model.CategoryTreeResponse;
import org.openapitools.model.CellCarrierResponse;
import org.openapitools.model.ChartData;
import org.openapitools.model.ConnectionGroupResponse;
import org.openapitools.model.ConnectionInfoResponse;
import org.openapitools.model.ConnectionListResponse;
import org.openapitools.model.ConnectionResponse;
import org.openapitools.model.ConsumerInviteResponse;
import org.openapitools.model.CoordsResponse;
import org.openapitools.model.CountResponse;
import org.openapitools.model.CreativeResponse;
import org.openapitools.model.CsvImportResponse;
import org.openapitools.model.Direction;
import org.openapitools.model.DisbursementResponse;
import org.openapitools.model.EmployeeResponse;
import org.openapitools.model.EntityReference;
import org.openapitools.model.EventAttendanceResponse;
import java.io.File;
import org.openapitools.model.FilterResponse;
import org.openapitools.model.FilterTreeResponse;
import org.openapitools.model.FlagResponse;
import org.openapitools.model.GameLevelListResponse;
import org.openapitools.model.GameLevelResponse;
import org.openapitools.model.GameResponse;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.ImportStatuses;
import org.openapitools.model.InviteResponse;
import org.openapitools.model.LeaderboardResponse;
import org.openapitools.model.Leg;
import org.openapitools.model.LegResponse;
import org.openapitools.model.LikableResponse;
import org.openapitools.model.ListCountResponse;
import org.openapitools.model.ListingFullResponse;
import org.openapitools.model.ListingGroupResponse;
import org.openapitools.model.ListingResponse;
import org.openapitools.model.Location;
import org.openapitools.model.LocationSearchResponse;
import java.util.Map;
import org.openapitools.model.MediaOfferResponse;
import org.openapitools.model.MissionFormatResponse;
import org.openapitools.model.MissionResponse;
import org.openapitools.model.MissionShortResponse;
import org.openapitools.model.NoteResponse;
import org.openapitools.model.NotificationMessageListResponse;
import org.openapitools.model.NotificationRecipientResponse;
import org.openapitools.model.NotificationRecipientResponseListResponse;
import org.openapitools.model.NotificationTemplateResponse;
import org.openapitools.model.ObjectStoreResponse;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.OfferResponse;
import org.openapitools.model.OfferShortResponse;
import org.openapitools.model.OfferTransactionResponse;
import org.openapitools.model.OfferTransactionStatusResponse;
import org.openapitools.model.OrderResponse;
import org.openapitools.model.Orders;
import org.openapitools.model.OrsonAiAddMovieResponse;
import org.openapitools.model.OrsonAiBatchResponse;
import org.openapitools.model.OrsonAiEmotionsResponse;
import org.openapitools.model.OrsonAiProtoResponse;
import org.openapitools.model.OrsonAiSTTResponse;
import org.openapitools.model.OrsonAiTTSResponse;
import org.openapitools.model.OrsonAiTechTuneResponse;
import org.openapitools.model.OrsonAiTopicsResponse;
import org.openapitools.model.OrsonAiVoiceCanvasResponse;
import org.openapitools.model.OrsonEpisodeResponse;
import org.openapitools.model.OrsonRenderResponse;
import org.openapitools.model.PackResponse;
import org.openapitools.model.PathingResponse;
import org.openapitools.model.PaymentRequest;
import org.openapitools.model.PaymentTypesResponse;
import org.openapitools.model.PlacementResponse;
import org.openapitools.model.PostalCodeResponse;
import org.openapitools.model.PredictedLocationResponse;
import org.openapitools.model.PreferredLocationResponse;
import org.openapitools.model.PreviewPersonaResponse;
import org.openapitools.model.ProfileInfoResponse;
import org.openapitools.model.ProfileResponse;
import org.openapitools.model.Program;
import org.openapitools.model.PurchaseItemFullResponse;
import org.openapitools.model.PurchaseItemListResponse;
import org.openapitools.model.PurchaseItemResponse;
import org.openapitools.model.QuestionResponse;
import org.openapitools.model.QueueResponse;
import org.openapitools.model.RankFullResponse;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
import org.openapitools.model.RegionLegSummary;
import org.openapitools.model.RegionResponse;
import org.openapitools.model.ReportBatchResponse;
import org.openapitools.model.ReportRegionLegSummaryBatchResponse;
import org.openapitools.model.ReportResponse;
import org.openapitools.model.ReservationResponse;
import org.openapitools.model.RetailerFullResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.RetailerOfferResponse;
import org.openapitools.model.RetailerResponse;
import org.openapitools.model.Route;
import org.openapitools.model.RouteSettings;
import org.openapitools.model.RoutingListResponse;
import org.openapitools.model.ScheduledNotificationFullResponse;
import org.openapitools.model.ScoreResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.ServiceHub;
import org.openapitools.model.Shipment;
import org.openapitools.model.ShipmentBatch;
import org.openapitools.model.ShipmentImportStatus;
import org.openapitools.model.ShipmentOrder;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.StepResponse;
import org.openapitools.model.Stop;
import org.openapitools.model.SubscriptionPlanResponse;
import org.openapitools.model.SubscriptionResponse;
import org.openapitools.model.TaskResponse;
import org.openapitools.model.TerritoryResponse;
import org.openapitools.model.ThemeDescriptorResponse;
import org.openapitools.model.ThirdPartyCredentialResponse;
import org.openapitools.model.ThirdPartyNetworkResponse;
import org.openapitools.model.ThirdPartyNetworkShortResponse;
import org.openapitools.model.TicketListResponse;
import org.openapitools.model.TicketOfferResponse;
import org.openapitools.model.TimeSlotResponse;
import org.openapitools.model.TokenResponse;
import org.openapitools.model.TournamentResponse;
import org.openapitools.model.TriggerResponse;
import org.openapitools.model.TrilatCacheRequest;
import org.openapitools.model.Trip;
import org.openapitools.model.TwiMLResponse;
import org.openapitools.model.UserActivityResponse;
import org.openapitools.model.UserLocationSearchResponse;
import org.openapitools.model.UserPermissionsResponse;
import org.openapitools.model.UserSettingsResponse;
import org.openapitools.model.Vehicle;
import org.openapitools.model.VehicleType;
import org.openapitools.model.WeatherResponse;
import org.openapitools.model.WordzWordResponse;
import org.openapitools.model.WrappedProxyItemResponse;
import org.openapitools.model.WrappedResponse;

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

@Path("/api/{version}")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-09T20:51:23.077809933Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class ApiApi  {

    @Inject ApiApiService service;

    @POST
    @Path("/invite/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Invite", notes = "Allows a user to accept an invite. The user could also become the inviter's friend.", response = ConsumerInviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConsumerInviteResponse.class) })
    public Response acceptInvite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("token") String token, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey, @DefaultValue("true") @QueryParam("autoFriend") Boolean autoFriend, @DefaultValue("false") @QueryParam("autoAttendEvent") Boolean autoAttendEvent, @DefaultValue("false") @QueryParam("autoFavoriteOffer") Boolean autoFavoriteOffer, @DefaultValue("false") @QueryParam("autoFavoriteOfferLocation") Boolean autoFavoriteOfferLocation, @DefaultValue("false") @QueryParam("autoFavoriteRetailerLocation") Boolean autoFavoriteRetailerLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.acceptInvite(version,token,accountId,albumId,missionId,albumContestId,offerId,offerLocationId,retailerLocationId,appKey,autoFriend,autoAttendEvent,autoFavoriteOffer,autoFavoriteOfferLocation,autoFavoriteRetailerLocation,securityContext);
    }
    @GET
    @Path("/account/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts by Location", notes = "Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.", response = UserLocationSearchResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserLocationSearchResponse.class) })
    public Response accountLocationSearch( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("postalCode") String postalCode, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @DefaultValue("10") @QueryParam("range") Double range, @QueryParam("locationLastUpdated") Long locationLastUpdated, @QueryParam("gender") String gender, @QueryParam("minAge") Integer minAge, @QueryParam("maxAge") Integer maxAge, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("roles") String roles, @QueryParam("tags") String tags, @QueryParam("experience") String experience, @QueryParam("categoryIds") String categoryIds, @QueryParam("audienceIds") String audienceIds, @DefaultValue("AND") @QueryParam("audienceOperator") String audienceOperator, @DefaultValue("false") @QueryParam("updateCurrentLocation") Boolean updateCurrentLocation, @DefaultValue("false") @QueryParam("updatePreferredSettings") Boolean updatePreferredSettings, @DefaultValue("true") @QueryParam("showExactLocations") Boolean showExactLocations, @DefaultValue("false") @QueryParam("showConnectionToSearcher") Boolean showConnectionToSearcher, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("verifiedUserOnly") Boolean verifiedUserOnly, @QueryParam("contentAdminOnly") Boolean contentAdminOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.accountLocationSearch(version,deviceId,accountId,q,keyword,postalCode,latitude,longitude,appKey,range,locationLastUpdated,gender,minAge,maxAge,companionshipIndex,i,start,l,limit,searchMode,sortField,descending,roles,tags,experience,categoryIds,audienceIds,audienceOperator,updateCurrentLocation,updatePreferredSettings,showExactLocations,showConnectionToSearcher,flagCountMinimum,verifiedUserOnly,contentAdminOnly,securityContext);
    }
    @GET
    @Path("/analytics/useractivity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get User Activity", notes = "Get an activity feed by user.", response = UserActivityResponse.class, responseContainer = "List", tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserActivityResponse.class, responseContainer = "List") })
    public Response activities( @PathParam("version") BigDecimal version, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.activities(version,start,limit,accountId,securityContext);
    }
    @POST
    @Path("/album/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Album", notes = "Create an Album.", response = SearchResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response addAlbumCollection( @PathParam("version") BigDecimal version, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("coverAssetNullable") Boolean coverAssetNullable, @NotNull @QueryParam("includeCoverInAssetList") Boolean includeCoverInAssetList, @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull @QueryParam("anonymous") Boolean anonymous, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("assetId") Long assetId, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaURL") String attachedMediaURL, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addAlbumCollection(version,title,coverAssetNullable,includeCoverInAssetList,publicRead,publicWrite,publicDelete,publicAdd,anonymous,deviceId,accountId,assetsToAdd,media,mediaURL,assetId,attachedMedia,attachedMediaURL,startDate,endDate,tags,description,albumType,albumTypeId,subType,latitude,longitude,locationDescription,visibility,gameType,appKey,cellPhone,streetAddress,streetAddress2,city,state,postalCode,fullAddress,metaData,categoryIds,categoryFilterIds,audienceIds,includeAllAppUsersAsMembers,includeAudiencesAsMembers,audienceOperator,approvalStatus,linkedObjectType,linkedObjectId,securityContext);
    }
    @POST
    @Path("/album/user/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Album Users", notes = "Add users to an album as participants.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addAlbumUsers( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("read") Boolean read, @QueryParam("write") Boolean write, @QueryParam("delete") Boolean delete, @QueryParam("add") Boolean add, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addAlbumUsers(version,albumId,includeFriendGroup,deviceId,accountId,read,write,delete,add,connections,connectionGroups,securityContext);
    }
    @POST
    @Path("/consumer/connection/group/addConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection", notes = "Adds a connection to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addConnectionToGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addConnectionToGroup(version,returnNulls,groupId,deviceId,accountId,connectionId,connectionAccountId,pendingId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/addConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connections", notes = "Adds a list of connections to a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addConnectionsToGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("connectionGroupId") Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addConnectionsToGroup(version,connectionGroupId,deviceId,accountId,connectionIds,connectionAccountIds,latitude,longitude,securityContext);
    }
    @POST
    @Path("/favorite/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Favorite", notes = "Adds an offer, offer location, retailer location, or category to your favorites.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public Response addFavorite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("favoritableId") Long favoritableId, @NotNull @QueryParam("favoritableType") String favoritableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addFavorite(version,favoritableId,favoritableType,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/object/field/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Field", notes = "Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.  Duplicate   field names are not allowed.   The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.     The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response addField( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName, @NotNull @QueryParam("fieldName") String fieldName, @NotNull @QueryParam("fieldType") String fieldType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addField(version,accountId,appKey,objectName,fieldName,fieldType,securityContext);
    }
    @POST
    @Path("/orson/ai/addMovie")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Movie", notes = "Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public Response addMovie( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("movieName") String movieName, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("tags") String tags, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addMovie(version,accountId,movieName,thirdPartyAccountId,tags,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/consumer/album/contest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Contest", notes = "Creates or updates a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response addOrUpdateAlbumContest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("contestType") String contestType, @QueryParam("albumContestId") Long albumContestId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("albumId1") Long albumId1, @QueryParam("removeAlbum1") Boolean removeAlbum1, @QueryParam("albumId2") Long albumId2, @QueryParam("removeAlbum2") Boolean removeAlbum2, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("locationDescription") String locationDescription, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addOrUpdateAlbumContest(version,publicRead,publicWrite,publicDelete,publicAdd,visibility,includeFriendGroup,deviceId,accountId,gameType,appKey,contestType,albumContestId,title,description,albumId1,removeAlbum1,albumId2,removeAlbum2,startDate,endDate,locationDescription,connectionIdsToAdd,connectionGroupIdsToAdd,latitude,longitude,securityContext);
    }
    @POST
    @Path("/consumer/theme")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create/Update Theme", notes = "Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme.", response = ThemeDescriptorResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThemeDescriptorResponse.class) })
    public Response addOrUpdateThemeDescriptor( @PathParam("version") BigDecimal version, @NotNull @QueryParam("publicRead") Boolean publicRead, @NotNull @QueryParam("publicWrite") Boolean publicWrite, @NotNull @QueryParam("publicDelete") Boolean publicDelete, @NotNull @QueryParam("publicAdd") Boolean publicAdd, @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @NotNull @QueryParam("completeWithDefaultValues") Boolean completeWithDefaultValues, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("connectionIdsToAdd") String connectionIdsToAdd, @QueryParam("connectionGroupIdsToAdd") String connectionGroupIdsToAdd, @QueryParam("appVersion") String appVersion, @QueryParam("colorValueJson") String colorValueJson, @QueryParam("stringReplacerJson") String stringReplacerJson, @QueryParam("customJsonObjects") String customJsonObjects, @QueryParam("iconImage") File iconImage, @QueryParam("sceneAtlasImage") File sceneAtlasImage, @QueryParam("bgImage") File bgImage, @QueryParam("bgSound") File bgSound, @QueryParam("musicSelection") String musicSelection, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addOrUpdateThemeDescriptor(version,publicRead,publicWrite,publicDelete,publicAdd,visibility,includeFriendGroup,completeWithDefaultValues,deviceId,accountId,gameType,themeDescriptorId,title,description,connectionIdsToAdd,connectionGroupIdsToAdd,appVersion,colorValueJson,stringReplacerJson,customJsonObjects,iconImage,sceneAtlasImage,bgImage,bgSound,musicSelection,locationDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/billing/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Payment Method", notes = "Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response addPaymentMethod( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("defaultPaymentMethod") Boolean defaultPaymentMethod, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPaymentMethod(version,accountId,paymentMethodId,accountName,firstName,lastName,address,city,state,postalCode,country,phone,creditCardNumber,expirationDate,ccv,accountNumber,bankName,routingNumber,defaultPaymentMethod,paymentMethodNickname,taxId,providerCustomerProfileId,providerPaymentProfileId,metaData,securityContext);
    }
    @POST
    @Path("/creative/addpreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Preview", notes = "Enable this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addPreview( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addPreview(version,accountId,creativeId,securityContext);
    }
    @POST
    @Path("/consumer/connection/group/addSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Connection Groups", notes = "Add sub groups to a group.", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public Response addSubGroups( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @NotNull @QueryParam("subGroupIds") String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addSubGroups(version,returnNulls,groupId,subGroupIds,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/consumer/permissions/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add User", notes = "Adds a user to a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response addUsersToPermissionable( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("true") @QueryParam("read") Boolean read, @DefaultValue("false") @QueryParam("write") Boolean write, @DefaultValue("false") @QueryParam("delete") Boolean delete, @DefaultValue("false") @QueryParam("add") Boolean add, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @DefaultValue("false") @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("false") @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addUsersToPermissionable(version,permissionableType,permissionableId,deviceId,accountId,read,write,delete,add,connectionIds,connectionAccountIds,connectionGroupIds,pending,admin,includeFriendGroup,latitude,longitude,audienceIds,securityContext);
    }
    @GET
    @Path("/ads/find")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response adsFind( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("randomize") Boolean randomize, @NotNull @QueryParam("targetedAdsOnly") Boolean targetedAdsOnly, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("missionIds") String missionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.adsFind(version,appKey,randomize,targetedAdsOnly,type,accountId,appVersion,latitude,longitude,device,deviceIdentifier,deviceVersion,start,limit,includeAudiences,allocatesTickets,missionIds,securityContext);
    }
    @GET
    @Path("/analytics/aggregatedFilteredUsage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Aggregated Filtered Usage", notes = "Query analytics to get data used for nested graphs and charts", response = ChartData.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public Response aggregatedFilteredUsage( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupByRoot") String groupByRoot,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupBy") String groupBy,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("distinctCount") String distinctCount,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aggregatedFilteredUsage(version,deviceId,accountId,applicationId,appKey,startDate,endDate,deviceType,device,deviceOS,gender,ageGroup,country,state,city,zip,model,tag,userAccountId,userAccountDisplay,userAccountUsername,groupByRoot,groupBy,distinctCount,sortField,descending,hideUnknown,responseFormat,l,limit,latitude,longitude,securityContext);
    }
    @GET
    @Path("/orson/ai/docs")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Docs", notes = "Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiDocs( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("doc") String doc, @QueryParam("return_topics") Boolean returnTopics, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiDocs(version,accountId,doc,returnTopics,limit,offset,securityContext);
    }
    @GET
    @Path("/orson/ai/img")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find images", notes = "Returns a list of URIs of images that match the text.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiFindImages( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("text") String text, @QueryParam("parse_flag") String parseFlag, @QueryParam("fetch_flag") String fetchFlag, @QueryParam("size") String size,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiFindImages(version,accountId,text,parseFlag,fetchFlag,size,securityContext);
    }
    @GET
    @Path("/orson/ai/tags")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tags", notes = "Search the tags column of user provided tags using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiTags( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("tags") String tags, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiTags(version,accountId,tags,conditional,limit,offset,securityContext);
    }
    @GET
    @Path("/orson/ai/text")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Text", notes = "Search the movie text column of movie text using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiText( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("terms") String terms, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiText(version,accountId,terms,conditional,limit,offset,securityContext);
    }
    @POST
    @Path("/invite/albumContest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Contest", notes = "Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response albumContestInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumContestId") Long albumContestId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.albumContestInvite(version,deviceId,accountId,appId,appKey,albumContestId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/invite/album")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Collection", notes = "Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response albumInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("albumId") Long albumId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.albumInvite(version,deviceId,accountId,appId,appKey,albumId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/achievement/tier/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Searches an Achievement Tier", notes = "Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response apiVersionAchievementTierSearchPost( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") Long achievementType, @QueryParam("rankType") String rankType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("descendingGoal") Boolean descendingGoal, @QueryParam("start") Long start, @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.apiVersionAchievementTierSearchPost(version,deviceId,accountId,appKey,keyword,achievementType,rankType,sortField,descending,descendingGoal,start,limit,securityContext);
    }
    @POST
    @Path("/album/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Album", notes = "Sets the approval status of an Album.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approveAlbum( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("verified") Boolean verified,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveAlbum(version,albumId,deviceId,accountId,approvalStatus,verified,securityContext);
    }
    @POST
    @Path("/consumer/album/contest/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Contest", notes = "Sets the approval status of a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approveAlbumContest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumContestId") Long albumContestId, @NotNull, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @QueryParam("approvalStatus") String approvalStatus, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveAlbumContest(version,albumContestId,approvalStatus,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/permissionable/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Permissionable", notes = "Sets the approval status of a permissionable object.", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response approvePermissionable( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,, allowableValues="PENDING, REJECTED, APPROVED, FEATURED" @DefaultValue("APPROVED") @QueryParam("approvalStatus") String approvalStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approvePermissionable(version,permissionableType,permissionableId,deviceId,accountId,approvalStatus,securityContext);
    }
    @POST
    @Path("/route/{routeId}/approve")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Approve Route", notes = "Approve a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response approveRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.approveRoute(version,routeId,securityContext);
    }
    @GET
    @Path("/asset/download/{filename}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Download Asset", notes = "Downloads an asset from the server for assets that have been uploaded to the server.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assetDownload( @PathParam("version") BigDecimal version, @Pattern(regexp=".+") @PathParam("filename") String filename,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetDownload(version,filename,securityContext);
    }
    @POST
    @Path("/asset/morph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Convert Offer to Creative", notes = "Converts an offer image + text into a creative image.", response = AssetShortResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetShortResponse.class) })
    public Response assetMorph( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerId") Long offerId, @NotNull, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("adSize") String adSize, @QueryParam("creativeId") Long creativeId, @QueryParam("width") Integer width, @QueryParam("height") Integer height, @QueryParam("backgroundSize") String backgroundSize, @QueryParam("template") String template,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assetMorph(version,offerId,adSize,creativeId,width,height,backgroundSize,template,securityContext);
    }
    @GET
    @Path("/assignment/assignee/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Assignees", notes = "Search for avaiable users for creating or updating assignment.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public Response assigmentAssigneeAccountSearch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assigmentAssigneeAccountSearch(version,accountId,keyword,securityContext);
    }
    @POST
    @Path("/employee/assign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee", notes = "Assign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response assignEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("managerAccountId") Long managerAccountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("role") String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignEmployee(version,accountId,managerAccountId,employeeAccountId,role,securityContext);
    }
    @POST
    @Path("/employee/assignToLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Assign Employee to Location", notes = "Assign or unassign the account to a retailer location.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignToLocationEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("employeeAccountId") Long employeeAccountId, @DefaultValue("true") @QueryParam("assign") Boolean assign,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignToLocationEmployee(version,accountId,retailerLocationId,employeeAccountId,assign,securityContext);
    }
    @POST
    @Path("/assignment/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment", notes = "Create an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentCreate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("description") String description, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentCreate(version,accountId,name,assigneeAccountId,description,retailerLocationId,tags,active,securityContext);
    }
    @POST
    @Path("/assignment/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Assignment", notes = "Delete an assignment.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignmentDelete( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentDelete(version,accountId,assignmentId,securityContext);
    }
    @GET
    @Path("/assignment/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment", notes = "Get the details of an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentGet( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentGet(version,accountId,assignmentId,securityContext);
    }
    @GET
    @Path("/assignment/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignments", notes = "Search for assignments by the given parameters.", response = AssignmentResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class, responseContainer = "List") })
    public Response assignmentSearch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, STATUSES" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountIds") String assigneeAccountIds, @QueryParam("retailerLocationIds") String retailerLocationIds,, allowableValues="NEW, IN_PROGRESS, SUBSCRIBED, ARCHIVED" @QueryParam("currentStatusType") String currentStatusType, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentSearch(version,accountId,sortField,descending,activeOnly,start,limit,creatorAccountId,assigneeAccountIds,retailerLocationIds,currentStatusType,keyword,securityContext);
    }
    @POST
    @Path("/assignment/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Assignment Status", notes = "Create an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusCreate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId,, allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT" @QueryParam("toDo") String toDo,, allowableValues="INITIAL, FOLLOW_UP, DECLINED" @QueryParam("connection") String connection,, allowableValues="PHONE, SITE_VISIT, EMAIL" @QueryParam("method") String method,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("status") String status,, allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB" @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusCreate(version,accountId,assignmentId,scheduledNotificationId,toDo,connection,method,status,closure,message,followUp,active,securityContext);
    }
    @POST
    @Path("/assignment/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Deletes Assignment Status", notes = "Deletes an assignment status.", response = SirqulResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response assignmentStatusDelete( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusDelete(version,accountId,assignmentStatusId,securityContext);
    }
    @GET
    @Path("/assignment/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Assignment Status", notes = "Get an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusGet( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusGet(version,accountId,assignmentStatusId,securityContext);
    }
    @GET
    @Path("/assignment/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assignment Statuses", notes = "Search on assignment statuses.", response = AssignmentStatusResponse.class, responseContainer = "List", tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class, responseContainer = "List") })
    public Response assignmentStatusSearch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ASSIGNEE_ID, CREATOR_ID, LOCATION_ID, LOCATION_NAME, CURRENT_STATUS, CURRENT_STATUS_TYPE, TODO, CONNECTION, METHOD, STATUS, CLOSURE, MESSAGE, FOLLOW_UP" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("assignmentId") Long assignmentId, @QueryParam("creatorAccountId") Long creatorAccountId, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("statusType") String statusType, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusSearch(version,accountId,sortField,descending,activeOnly,start,limit,assignmentId,creatorAccountId,assigneeAccountId,retailerLocationId,statusType,keyword,securityContext);
    }
    @POST
    @Path("/assignment/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment Status", notes = "Updates an assignment status.", response = AssignmentStatusResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentStatusResponse.class) })
    public Response assignmentStatusUpdate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentStatusId") Long assignmentStatusId, @QueryParam("scheduledNotificationId") Long scheduledNotificationId,, allowableValues="SITE_VISIT, PHONE, RECONTACT, RENEWAL, CREDIT" @QueryParam("toDo") String toDo,, allowableValues="INITIAL, FOLLOW_UP, DECLINED" @QueryParam("connection") String connection,, allowableValues="PHONE, SITE_VISIT, EMAIL" @QueryParam("method") String method,, allowableValues="ARCHIVED, SUBSCRIBED, UNSUBSCRIBED, CONTACTED, DECLINED, NOT_CONTACTED" @QueryParam("status") String status,, allowableValues="PHONE, SITE_VISIT, PHONE_SITE, WEB" @QueryParam("closure") String closure, @QueryParam("message") String message, @QueryParam("followUp") Long followUp, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentStatusUpdate(version,accountId,assignmentStatusId,scheduledNotificationId,toDo,connection,method,status,closure,message,followUp,active,securityContext);
    }
    @POST
    @Path("/assignment/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Assignment", notes = "Updates an assignment.", response = AssignmentResponse.class, tags={ "Assignment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssignmentResponse.class) })
    public Response assignmentUpdate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("assignmentId") Long assignmentId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assigneeAccountId") Long assigneeAccountId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("tags") String tags, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.assignmentUpdate(version,accountId,assignmentId,name,description,assigneeAccountId,retailerLocationId,tags,active,securityContext);
    }
    @POST
    @Path("/event/attend")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Attend Event", notes = " Specify whether the user is attending an event at a particular location. This can also be used as a \"check-in\" action.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response attendEvent( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("listingId") Long listingId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("transactionId") Long transactionId, @QueryParam("status") Integer status, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.attendEvent(version,deviceId,accountId,appKey,listingId,retailerLocationId,offerLocationId,transactionId,status,latitude,longitude,securityContext);
    }
    @POST
    @Path("/twitter/authorize")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Authorize Twitter", notes = "Makes an authorization call to twitter for a user to login and allow any app permissions.", response = SirqulResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response authorizeTwitter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.authorizeTwitter(version,appKey,securityContext);
    }
    @POST
    @Path("/orson/ai/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Analysis", notes = "Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public Response batch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("limit") Integer limit, @QueryParam("operations") String operations, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batch(version,accountId,thirdPartyAccountId,limit,operations,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/note/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Note Operation", notes = "Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). ", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response batchOperation( @PathParam("version") BigDecimal version, @NotNull @QueryParam("notableId") Long notableId, @NotNull @QueryParam("notableType") String notableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("batchOperation") String batchOperation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchOperation(version,notableId,notableType,deviceId,accountId,batchOperation,securityContext);
    }
    @POST
    @Path("/tracking/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Batch Tracking", notes = "Batch create tracking legs", response = Leg.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Leg.class, responseContainer = "List") })
    public Response batchSaveTracking( @PathParam("version") BigDecimal version, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("generateAccounts") Boolean generateAccounts, @QueryParam("updateAccountLocations") Boolean updateAccountLocations, @DefaultValue("PASSIVE") @QueryParam("defaultTag") String defaultTag, @QueryParam("slaveUID") String slaveUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchSaveTracking(version,data,deviceId,accountId,generateAccounts,updateAccountLocations,defaultTag,slaveUID,securityContext);
    }
    @POST
    @Path("/retailer/offer/location/batchUpdate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Locations", notes = "Batch update offer locations.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response batchUpdateOfferLocations( @PathParam("version") BigDecimal version, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batchUpdateOfferLocations(version,data,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/account/block")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Block Account", notes = "Moves or removes an account into the user's blocked group.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response blockAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountIdBeingBlocked") Long accountIdBeingBlocked, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("true") @QueryParam("blockFlagValue") Boolean blockFlagValue, @DefaultValue("false") @QueryParam("removeFromGroupsIfBlocked") Boolean removeFromGroupsIfBlocked, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.blockAccount(version,accountIdBeingBlocked,deviceId,accountId,blockFlagValue,removeFromGroupsIfBlocked,latitude,longitude,securityContext);
    }
    @POST
    @Path("/location/trilaterate/cache")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with File", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response cacheTrilaterationData( @PathParam("version") BigDecimal version, @NotNull @QueryParam("udid") String udid, @QueryParam("sourceTime") Long sourceTime, @QueryParam("minimumSampleSize") Integer minimumSampleSize, @QueryParam("data") String data, @QueryParam("dataFile") File dataFile,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cacheTrilaterationData(version,udid,sourceTime,minimumSampleSize,data,dataFile,securityContext);
    }
    @POST
    @Path("/location/trilaterate/cache/submit")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trilateration Data with Rest", notes = "Creates trilateration samples for a source device (i.e. a router).", response = SirqulResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response cacheTrilaterationDataGzip( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid TrilatCacheRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cacheTrilaterationDataGzip(version,body,securityContext);
    }
    @POST
    @Path("/shipment/{id}/cancel")
    
    
    @io.swagger.annotations.ApiOperation(value = "Cancel Shipment", notes = "Remove shipment from route", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response cancelShipment( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelShipment(version,id,securityContext);
    }
    @GET
    @Path("/category/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories by Distance", notes = "Search for categories by distance.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public Response categoryDistanceSearch( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnExternal") Boolean returnExternal, @QueryParam("exactMatch") Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("minOfferCount") Integer minOfferCount, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.categoryDistanceSearch(version,accountId,keyword,appKey,categoryIds,parentCategoryIds,rootOnly,sortField,responseGroup,descending,start,limit,activeOnly,returnExternal,exactMatch,type,externalType,minOfferCount,latitude,longitude,range,securityContext);
    }
    @GET
    @Path("/disbursement/check")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check Disbursements", notes = "Checks the status of a captured disbrusement to see if it has been settled.", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response checkDisbursements( @PathParam("version") BigDecimal version, @NotNull @QueryParam("disbursementId") Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.checkDisbursements(version,disbursementId,securityContext);
    }
    @GET
    @Path("/pathing/compute")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Calculate Path", notes = "Calculates the shortest path from point to point on a grid", response = PathingResponse.class, tags={ "Pathing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PathingResponse.class) })
    public Response computePath( @PathParam("version") BigDecimal version, @NotNull @QueryParam("data") String data, @NotNull, allowableValues="METRIC, IMPERIAL" @QueryParam("units") String units, @NotNull @QueryParam("reducePath") Boolean reducePath, @NotNull @QueryParam("directions") Boolean directions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computePath(version,data,units,reducePath,directions,securityContext);
    }
    @POST
    @Path("/routing/compute")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Compute Route", notes = "This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. ", response = RoutingListResponse.class, tags={ "Routing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RoutingListResponse.class) })
    public Response computeRouting( @PathParam("version") BigDecimal version, @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.computeRouting(version,data,securityContext);
    }
    @POST
    @Path("/queue/consumer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Consumer", notes = "Create a connection to an existing amqp queue and register as a consumer.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response consumerCreate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("hostname") String hostname, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("dataMapping") String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("5672") @QueryParam("port") Integer port, @QueryParam("virtualHost") String virtualHost, @QueryParam("exchanger") String exchanger, @QueryParam("exchangerType") String exchangerType, @DefaultValue("1") @QueryParam("workers") Integer workers, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.consumerCreate(version,appKey,name,hostname,username,password,dataMapping,deviceId,accountId,port,virtualHost,exchanger,exchangerType,workers,useSSL,securityContext);
    }
    @POST
    @Path("/queue/consumer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Consumer", notes = "Update an existing amqp queue's data mapping.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response consumerUpdate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("queueId") Long queueId, @NotNull @QueryParam("dataMapping") String dataMapping, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.consumerUpdate(version,appKey,queueId,dataMapping,deviceId,accountId,useSSL,securityContext);
    }
    @POST
    @Path("/route/{routeId}/copy")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Copy Route", notes = "Make an copy of the given route with optional overriding properties", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response copyRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.copyRoute(version,routeId,body,securityContext);
    }
    @PUT
    @Path("/cargo/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Dependent", notes = "Create dependent of the account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response create( @PathParam("version") BigDecimal version, @PathParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid Account body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.create(version,accountId,body,securityContext);
    }
    @POST
    @Path("/account/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account", notes = "Create a new account by role.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response createAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("streetAddress") String streetAddress, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("role") String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("inviteToken") String inviteToken, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("sendValidation") Boolean sendValidation, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("homeLatitude") Double homeLatitude, @QueryParam("homeLongitude") Double homeLongitude, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAccount(version,username,password,name,prefixName,firstName,middleName,lastName,suffixName,title,deviceId,deviceIdType,emailAddress,assetId,streetAddress,zipcode,gender,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,role,platforms,tags,aboutUs,gameExperience,categoryIds,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,latitude,longitude,acceptedTerms,inviteToken,referralAccountId,sendValidation,gameType,appKey,appVersion,responseType,audienceIdsToAdd,appBlob,appEnablePush,appEnableSMS,appEnableEmail,locationVisibility,homeLatitude,homeLongitude,appNickname,personalAudienceId,securityContext);
    }
    @POST
    @Path("/achievement/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public Response createAchievement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("title") String title, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAchievement(version,appKey,title,deviceId,accountId,analyticsTag,description,rankType,rankIncrement,minIncrement,maxIncrement,validate,active,triggerDefinition,securityContext);
    }
    @POST
    @Path("/achievement/tier/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Achievement Tier", notes = "Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response createAchievementTier( @PathParam("version") BigDecimal version, @NotNull @QueryParam("achievementId") Long achievementId, @NotNull @QueryParam("scoreAllInstances") Boolean scoreAllInstances, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Integer gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAchievementTier(version,achievementId,scoreAllInstances,deviceId,accountId,icon,iconAssetId,title,description,goalCount,missionId,gameId,packId,gameLevelId,gameObjectId,securityContext);
    }
    @POST
    @Path("/application/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application", notes = "Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response createApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appName") String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds,, allowableValues="GAME_LEVEL, GAME_OBJECT" @DefaultValue("GAME_LEVEL") @QueryParam("scoringType") String scoringType, @DefaultValue("11") @QueryParam("hintCost") Integer hintCost, @DefaultValue("125") @QueryParam("maxScore") Integer maxScore, @DefaultValue("0.037") @QueryParam("ticketsPerPoint") Float ticketsPerPoint, @DefaultValue("true") @QueryParam("hasGameData") Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @DefaultValue("false") @QueryParam("globalTickets") Boolean globalTickets, @DefaultValue("1") @QueryParam("buildVersion") Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @DefaultValue("true") @QueryParam("createObjectStore") Boolean createObjectStore, @DefaultValue("false") @QueryParam("publicContentApproval") Boolean publicContentApproval, @DefaultValue("false") @QueryParam("productionMode") Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @DefaultValue("false") @QueryParam("localAdsEnabled") Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey,, allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2" @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType") String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @DefaultValue("ALL") @QueryParam("modules") String modules, @DefaultValue("1") @QueryParam("authorizedCount") Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @DefaultValue("false") @QueryParam("ipsFloor") Boolean ipsFloor, @DefaultValue("true") @QueryParam("enableAPNSBadge") Boolean enableAPNSBadge, @DefaultValue("true") @QueryParam("includeInReport") Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplication(version,appName,deviceId,accountId,about,bundleId,appIconAssetId,appLogoAssetId,facebookAppId,facebookAppSecret,googleApiKey,updateEULADate,eulaVersion,landingPageUrl,showInActivities,activityDescription,inviteWelcomeText,invitePageUrl,urlScheme,platforms,downloadUrls,categoryIds,scoringType,hintCost,maxScore,ticketsPerPoint,hasGameData,publicNotifications,useMatchingAlgorithm,globalTickets,buildVersion,apiVersion,placementName,placementDescription,placementSize,placementHeight,placementWidth,placementRefreshInterval,createObjectStore,publicContentApproval,productionMode,minimumSessionLength,sessionGapLength,localAdsEnabled,sqootApiKey,trilatProcessingType,maxSampleSize,minRSSI,modules,authorizedCount,authorizedServers,defaultTimezone,smtpPass,metaData,placementMetaData,ipsFloor,enableAPNSBadge,includeInReport,defaultAppFilterId,enableWelcomeEmail,appleAppId,appleTeamId,appleAuthKeyId,appleAuthKey,appleIssuerId,appStoreKeyId,appStoreKey,googlePrivateKeyFile,authorizeNetApiKey,authorizeNetTransactionKey,emailSender,smtpUser,smtpHost,vatomBusinessId,vatomRestClientId,vatomRestSecretKey,twilioAccountSID,twilioAuthToken,twilioSenderPhoneNumber,openAISecretKey,securityContext);
    }
    @POST
    @Path("/appconfig/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create AppConfig", notes = "Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response createApplicationConfig( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("configVersion") String configVersion, @NotNull @QueryParam("assetId") Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplicationConfig(version,accountId,appKey,configVersion,assetId,retailerId,retailerLocationId,udid,securityContext);
    }
    @POST
    @Path("/application/placement/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Ad Placement", notes = "Creates a new ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response createApplicationPlacement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("size") String size, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createApplicationPlacement(version,appKey,size,deviceId,accountId,name,description,height,width,refreshInterval,defaultImageId,active,securityContext);
    }
    @POST
    @Path("/asset/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Asset", notes = "Uploads an asset to server and returns an asset id which can be used to assign to various objects.", response = AssetResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class) })
    public Response createAsset( @PathParam("version") BigDecimal version, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("addToDefaultAlbum") String addToDefaultAlbum, @QueryParam("addToMediaLibrary") Boolean addToMediaLibrary, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("app") String app, @QueryParam("appKey") String appKey, @QueryParam("searchTags") String searchTags, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAsset(version,returnNulls,deviceId,accountId,albumId,collectionId,addToDefaultAlbum,addToMediaLibrary,versionCode,versionName,metaData,caption,assetType,approvalStatus,assignedAccountId,media,mediaUrl,mediaString,mediaStringFileName,mediaStringContentType,mediaHeight,mediaWidth,attachedMedia,attachedMediaUrl,attachedMediaString,attachedMediaStringFileName,attachedMediaStringContentType,attachedMediaHeight,attachedMediaWidth,locationDescription,app,appKey,searchTags,latitude,longitude,securityContext);
    }
    @POST
    @Path("/audience/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Audience", notes = "Create a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response createAudience( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @DefaultValue("true") @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAudience(version,accountId,name,description,searchTags,gender,ageGroups,categoryIds,applicationIds,gameExperienceLevel,devices,deviceIds,deviceVersions,locations,radius,startTimeOffset,endTimeOffset,sendSuggestion,associateDescription,associateType,associateId,groupingId,metaData,visibility,audienceType,useOrder,cohortRegionsData,appKey,trilaterationTypes,uniqueName,securityContext);
    }
    @POST
    @Path("/report/batch/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public Response createBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY" @QueryParam("status") String status, @NotNull @QueryParam("previewLimit") Integer previewLimit, @QueryParam("appKey") String appKey, @QueryParam("endpoint") String endpoint, @QueryParam("parameters") String parameters, @QueryParam("name") String name, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("description") String description, @QueryParam("pageUrl") String pageUrl,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBatch(version,accountId,status,previewLimit,appKey,endpoint,parameters,name,startDate,endDate,description,pageUrl,securityContext);
    }
    @POST
    @Path("/bid/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Bid", notes = "Creates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response createBid( @PathParam("version") BigDecimal version, @NotNull @QueryParam("biddableType") String biddableType, @NotNull @QueryParam("biddableId") Long biddableId, @NotNull @QueryParam("amountPerView") Double amountPerView, @NotNull @QueryParam("amountPerAction") Double amountPerAction, @NotNull @QueryParam("budgetAmount") Double budgetAmount, @NotNull @QueryParam("budgetSchedule") String budgetSchedule, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBid(version,biddableType,biddableId,amountPerView,amountPerAction,budgetAmount,budgetSchedule,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/billable/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Billable", notes = "reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response createBillableEntity( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBillableEntity(version,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,businessPhone,businessPhoneExt,authorizeNetApiKey,authorizeNetTransactionKey,securityContext);
    }
    @POST
    @Path("/cargo/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Cargo Type", notes = "Create new cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response createCargoType( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCargoType(version,body,securityContext);
    }
    @POST
    @Path("/category/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Category", notes = "Create a new category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response createCategory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCategory(version,accountId,name,appKey,parentCategoryId,description,type,assetId,externalId,externalType,externalCategorySlug,sqootSlug,active,metaData,searchTags,securityContext);
    }
    @POST
    @Path("/creative/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Creative", notes = "Create a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response createCreative( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("active") Boolean active, @NotNull @QueryParam("waitForAsset") Boolean waitForAsset, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("offerId") Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCreative(version,accountId,name,active,waitForAsset,description,assetImageId,action,data,suffix,type,balance,referenceId,appVersion,missionId,offerId,securityContext);
    }
    @POST
    @Path("/thirdparty/credential/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Credential", notes = "This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password. ", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response createCredential( @PathParam("version") BigDecimal version, @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("thirdPartyToken") String thirdPartyToken, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("emailAddress") String emailAddress, @DefaultValue("false") @QueryParam("signinOnlyMode") Boolean signinOnlyMode, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createCredential(version,thirdPartyId,thirdPartyToken,networkUID,appKey,accountId,deviceId,sessionId,thirdPartyName,emailAddress,signinOnlyMode,responseFilters,latitude,longitude,metaData,thirdPartyRefreshToken,audienceIdsToAdd,audienceIdsToRemove,securityContext);
    }
    @POST
    @Path("/object/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Data", notes = "Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response createData( @PathParam("version") BigDecimal version, @PathParam("objectName") String objectName, @QueryParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createData(version,objectName,accountId,body,securityContext);
    }
    @POST
    @Path("/disbursement/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Disbursement", notes = "Creates a Disbursement for sending money to a retailer", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response createDisbursement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("receiverAccountId") Long receiverAccountId, @NotNull @QueryParam("originalSenderAccountId") Long originalSenderAccountId, @NotNull @QueryParam("amount") BigDecimal amount, @NotNull, allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM" @QueryParam("provider") String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("introspectionParams") String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createDisbursement(version,accountId,receiverAccountId,originalSenderAccountId,amount,provider,scheduledDate,title,comment,externalId,introspectionParams,securityContext);
    }
    @POST
    @Path("/employee/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Employee", notes = "Create a new account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response createEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("managerAccountId") Long managerAccountId, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("aboutUs") String aboutUs, @QueryParam("assetId") Long assetId,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEmployee(version,accountId,managerAccountId,username,password,name,prefixName,firstName,middleName,lastName,suffixName,title,aboutUs,assetId,gender,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,role,retailerLocationIds,settingsAppKey,appBlob,assignedDeviceId,securityContext);
    }
    @POST
    @Path("/entity/reference")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an entity reference.", notes = "Creates a reference for an entity for syncing data between servers.", response = ActivityResponse.class, tags={ "Activity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ActivityResponse.class) })
    public Response createEntityReference( @PathParam("version") BigDecimal version,@ApiParam(value = "The entity reference object" ,required=true) @NotNull @Valid EntityReference body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEntityReference(version,body,securityContext);
    }
    @POST
    @Path("/event/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Event", notes = "Create a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response createEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEvent(version,accountId,title,retailerLocationIds,subTitle,details,categoryIds,filterIds,active,imageAssetId,redeemableStart,redeemableEnd,metaData,securityContext);
    }
    @POST
    @Path("/filter/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Filter", notes = "Create a filter", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response createFilter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFilter(version,accountId,name,appKey,parentFilterId,description,externalId,externalType,active,metaData,securityContext);
    }
    @POST
    @Path("/flag/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Flag", notes = "Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createFlag( @PathParam("version") BigDecimal version, @NotNull @QueryParam("flagableType") String flagableType, @NotNull @QueryParam("flagableId") Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("flagDescription") String flagDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFlag(version,flagableType,flagableId,deviceId,accountId,flagDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/vatom/me/rels/following/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create following", notes = "Create following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createFollowing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFollowing(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/game/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a Game", notes = "Create a Game.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response createGame( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createGame(version,accountId,appKey,title,description,metaData,packIds,includeGameData,securityContext);
    }
    @POST
    @Path("/level/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Game Level", notes = "Create a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response createGameLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("gameData") String gameData, @NotNull @QueryParam("gameDataSuffix") String gameDataSuffix, @QueryParam("appKey") String appKey, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createGameLevel(version,accountId,name,gameData,gameDataSuffix,appKey,description,difficulty,appVersion,assetImageId,assetIconId,visibility,friendGroup,connectionIds,connectionGroupIds,balance,active,allocateTickets,ticketCount,ticketType,points,tutorialTitle,tutorialMessage,tutorialAlignment,tutorialImageAssetId,offerId,metaData,securityContext);
    }
    @POST
    @Path("/orson/stories/episodes/instant")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Creates an instant episode", notes = "Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public Response createInstantEpisode( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createInstantEpisode(version,accountId,data,securityContext);
    }
    @POST
    @Path("/leaderboard/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response createLeaderboard( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("sortField") String sortField, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createLeaderboard(version,accountId,appKey,rankType,leaderboardMode,iconMedia,iconAssetId,bannerMedia,bannerAssetId,limitation,sortField,title,description,metaData,securityContext);
    }
    @POST
    @Path("/listing/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Listing", notes = "Creates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response createListing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("filterIds") String filterIds, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @DefaultValue("false") @QueryParam("isPrivate") Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createListing(version,accountId,name,filterIds,description,start,end,locationName,locationDescription,isPrivate,externalId,externalId2,externalGroupId,active,metaData,securityContext);
    }
    @POST
    @Path("/location")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create new location", notes = "Create a new location from a real object location.", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createLocationV2( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createLocationV2(version,body,securityContext);
    }
    @POST
    @Path("/media/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Media", notes = "Create a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response createMedia( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @NotNull, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @NotNull @QueryParam("noExpiration") Boolean noExpiration, @NotNull @QueryParam("availableLimit") Integer availableLimit, @NotNull @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @NotNull @QueryParam("addedLimit") Integer addedLimit, @NotNull @QueryParam("viewLimit") Integer viewLimit, @NotNull @QueryParam("maxPrints") Integer maxPrints, @NotNull @QueryParam("ticketPrice") Long ticketPrice, @NotNull @QueryParam("fullPrice") Double fullPrice, @NotNull @QueryParam("discountPrice") Double discountPrice, @NotNull, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull @QueryParam("active") Boolean active, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("parentalRating") String parentalRating, @QueryParam("availabilityDate") Long availabilityDate,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMedia(version,accountId,title,barcodeType,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPrice,fullPrice,discountPrice,specialOfferType,offerVisibility,active,retailerLocationIds,subTitle,details,subDetails,finePrint,barcodeEntry,externalRedeemOptions,externalUrl,ticketsRewardType,ticketsReward,activated,expires,ticketPriceType,showRemaining,showRedeemed,replaced,featured,categoryIds,filterIds,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,conditionType,isbn,asin,catalogNumbers,parentalRating,availabilityDate,mediaType,duration,author,releaseDate,collectionIds,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/mission/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission", notes = "Create a user defined mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response createMission( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("missionTask") String missionTask, @QueryParam("formatType") String formatType, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("metaData") String metaData, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMission(version,accountId,title,description,subType,startDate,endDate,active,gameLevelIds,creativeIds,audienceIds,missionTask,formatType,offerId,balance,advancedReporting,allocateTickets,ticketCount,ticketType,points,metaData,applicationIds,devices,deviceIds,deviceVersions,locations,radius,securityContext);
    }
    @POST
    @Path("/mission/invite/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Mission Invite", notes = "Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response createMissionInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMissionInvite(version,deviceId,accountId,missionId,joinCode,includeGameData,securityContext);
    }
    @POST
    @Path("/thirdparty/network/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Network", notes = "Creates a custom third party network.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response createNetwork( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("enableIntrospection") Boolean enableIntrospection, @QueryParam("description") String description, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNetwork(version,accountId,name,enableIntrospection,description,introspectionMethod,introspectionURL,introspectionParams,requiredRootField,enableMFA,sizeMFA,shelfLifeMFA,oauthTokenURL,oauthPrivateKey,oauthPublicKey,oauthClientId,oauthSecretKey,body,securityContext);
    }
    @POST
    @Path("/note/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Note", notes = "This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public Response createNote( @PathParam("version") BigDecimal version, @NotNull @QueryParam("comment") String comment, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("initializeAsset") Boolean initializeAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") BigDecimal assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNote(version,comment,deviceId,accountId,notableType,notableId,noteType,assetIds,tags,permissionableType,permissionableId,appKey,locationDescription,latitude,longitude,metaData,receiverAccountIds,returnFullResponse,initializeAsset,assetReturnNulls,assetAlbumId,assetCollectionId,assetAddToDefaultAlbum,assetAddToMediaLibrary,assetVersionCode,assetVersionName,assetMetaData,assetCaption,assetMedia,assetMediaUrl,assetMediaString,assetMediaStringFileName,assetMediaStringContentType,assetAttachedMedia,assetAttachedMediaUrl,assetAttachedMediaString,assetAttachedMediaStringFileName,assetAttachedMediaStringContentType,assetLocationDescription,assetApp,assetSearchTags,assetLatitude,assetLongitude,securityContext);
    }
    @POST
    @Path("/notification/template/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Notification Template", notes = "Create a notification template. Developers will only be able to create notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response createNotificationTemplate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("conduit") String conduit, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("body") String body, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createNotificationTemplate(version,accountId,conduit,title,body,appKey,event,tags,securityContext);
    }
    @POST
    @Path("/object/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Object", notes = "Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName.   Duplicate object names are not allowed.   The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW. ", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response createObject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createObject(version,accountId,appKey,objectName,securityContext);
    }
    @POST
    @Path("/retailer/offer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offer", notes = "Create an offer and assign it to the provided retailer locations.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response createOffer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @NotNull @QueryParam("title") String title, @NotNull, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @NotNull @QueryParam("noExpiration") Boolean noExpiration, @NotNull @QueryParam("availableLimit") Integer availableLimit, @NotNull @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @NotNull @QueryParam("addedLimit") Integer addedLimit, @NotNull @QueryParam("viewLimit") Integer viewLimit, @NotNull @QueryParam("maxPrints") Integer maxPrints, @NotNull @QueryParam("ticketPrice") Long ticketPrice, @NotNull @QueryParam("fullPrice") Double fullPrice, @NotNull @QueryParam("discountPrice") Double discountPrice, @NotNull, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @NotNull, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("tags") String tags, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand,, allowableValues="APPAREL, APPLIANCES, APPS, ARTS_CRAFTS, AUTOMOTIVE, BABY, BEAUTY, BOOKS, CLASSICAL, COLLECTIBLES, DVD, ELECTRONICS, GIFT_CARDS, GOURMET_FOOD, GROCERY, HEALTH_PERSONAL_CARE, HOME_GARDEN, INDUSTRIAL, JEWELRY, KITCHEN, LAWN_GARDEN, MAGAZINES, MISCELLANEOUS, MUSICAL_INSTRUMENTS, OFFICE_PRODUCTS, OTHER, OUTDOOR_LIVING, PC_HARDWARE, PET_SUPPLIES, SHOES, SOFTWARE, SPORTING_GOODS, TOOLS, TOYS, VIDEO_GAMES, WATCHES, WIRELESS, WIRELESS_ACCESSORIES" @QueryParam("productType") String productType,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight,, allowableValues="MILIMETER, CENTIMETER, METER, INCH, FOOT, YARD" @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOffer(version,includeOfferLocations,title,barcodeType,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPrice,fullPrice,discountPrice,offerType,specialOfferType,offerVisibility,active,deviceId,accountId,tags,parentOfferId,retailerLocationIds,offerLocations,subTitle,details,subDetails,finePrint,barcodeEntry,externalRedeemOptions,externalUrl,externalId,ticketsRewardType,ticketsReward,activated,expires,ticketPriceType,showRemaining,showRedeemed,replaced,featured,categoryIds,filterIds,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,brand,productType,conditionType,isbn,asin,catalogNumbers,department,features,minimumPrice,width,height,depth,weight,unit,studio,parentalRating,publishDate,availabilityDate,sizeId,listingId,mediaType,duration,author,releaseDate,collectionIds,rebootTimeHour,rebootTimeMinute,idleTimeoutInSecond,serialNumber,udid,deviceType,devicePower,deviceInterference,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/wallet/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Wallet Offers", notes = "Adds offers to the wallet", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response createOfferTransaction( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey, @QueryParam("status") Integer status,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOfferTransaction(version,deviceId,accountId,offerId,offerLocationId,offerCart,promoCode,currencyType,usePoints,metaData,appKey,status,securityContext);
    }
    @POST
    @Path("/offer/status/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offer Status", notes = "Create an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response createOfferTransactionStatus( @PathParam("version") BigDecimal version, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("code") Integer code, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("description") String description, @DefaultValue("ANY") @QueryParam("role") String role, @DefaultValue("true") @QueryParam("active") Boolean active, @QueryParam("applicationIds") String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOfferTransactionStatus(version,name,code,deviceId,accountId,latitude,longitude,description,role,active,applicationIds,securityContext);
    }
    @POST
    @Path("/notification/blocked/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or update blocked notification settings", notes = "Create or update blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public Response createOrUpdateBlockedNotifications( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("data") String data, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateBlockedNotifications(version,appKey,data,accountId,securityContext);
    }
    @POST
    @Path("/consumer/connection/add")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection", notes = "Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group.", response = ConnectionResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionResponse.class) })
    public Response createOrUpdateConnection( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("groupId") Long groupId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("isTrusted") Boolean isTrusted, @QueryParam("ignoreFriendRequest") Boolean ignoreFriendRequest, @QueryParam("isContact") Boolean isContact, @QueryParam("isBlocked") Boolean isBlocked, @QueryParam("isFollowing") Boolean isFollowing, @QueryParam("connectionResponse") Boolean connectionResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateConnection(version,deviceId,accountId,connectionId,connectionAccountId,pendingId,groupId,gameType,appKey,isTrusted,ignoreFriendRequest,isContact,isBlocked,isFollowing,connectionResponse,securityContext);
    }
    @POST
    @Path("/consumer/connection/group")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create or Update Connection Group", notes = "Creates a new private group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createOrUpdateGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("groupId") Long groupId, @QueryParam("assetId") Long assetId, @QueryParam("connections") String connections, @QueryParam("description") String description, @QueryParam("canViewProfileInfo") Boolean canViewProfileInfo, @QueryParam("canViewGameInfo") Boolean canViewGameInfo, @QueryParam("canViewFriendInfo") Boolean canViewFriendInfo, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrUpdateGroup(version,returnNulls,deviceId,accountId,name,groupId,assetId,connections,description,canViewProfileInfo,canViewGameInfo,canViewFriendInfo,active,latitude,longitude,securityContext);
    }
    @POST
    @Path("/order/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Order", notes = "Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response createOrder( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createOrder(version,appKey,cart,deviceId,accountId,description,currencyType,paymentMethodId,externalOrderId,externalPaymentId,remoteRefType,externalDate,promoCode,securityContext);
    }
    @POST
    @Path("/pack/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Pack", notes = "Create a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response createPack( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("packOrder") Long packOrder, @NotNull @QueryParam("price") Integer price, @NotNull @QueryParam("highest") Boolean highest, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType,, allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE" @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPack(version,accountId,title,packOrder,price,highest,allocateTickets,ticketCount,description,searchTags,active,gameType,appKey,packType,sequenceType,backgroundId,imageId,startDate,endDate,authorOverride,priceType,gameLevelIds,inGame,ticketType,points,securityContext);
    }
    @POST
    @Path("/billing/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Payment Method", notes = "Add a new method of payment.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response createPaymentMethod( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("accountName") String accountName, @QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName, @QueryParam("address") String address, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("phone") String phone, @QueryParam("creditCardNumber") String creditCardNumber, @QueryParam("expirationDate") String expirationDate, @QueryParam("ccv") String ccv, @QueryParam("accountNumber") String accountNumber, @QueryParam("bankName") String bankName, @QueryParam("routingNumber") String routingNumber, @QueryParam("paymentMethodNickname") String paymentMethodNickname, @QueryParam("taxId") String taxId, @DefaultValue("true") @QueryParam("defaultPaymentMethod") Boolean defaultPaymentMethod, @QueryParam("authToken") String authToken, @DefaultValue("AUTHORIZE_NET") @QueryParam("provider") String provider, @QueryParam("providerCustomerProfileId") String providerCustomerProfileId, @QueryParam("providerPaymentProfileId") String providerPaymentProfileId, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPaymentMethod(version,accountId,accountName,firstName,lastName,address,city,state,postalCode,country,phone,creditCardNumber,expirationDate,ccv,accountNumber,bankName,routingNumber,paymentMethodNickname,taxId,defaultPaymentMethod,authToken,provider,providerCustomerProfileId,providerPaymentProfileId,metaData,appKey,securityContext);
    }
    @POST
    @Path("/persona/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Persona", notes = "Creates a new persona. If the given params are null those attributes will be override by null.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response createPersona( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("title") String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPersona(version,accountId,title,previewAccounts,date,age,gender,gameExperienceLevel,latitude,longitude,securityContext);
    }
    @POST
    @Path("/postalCode/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Postal Code", notes = "Create a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response createPostalCode( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("code") String code, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPostalCode(version,accountId,code,latitude,longitude,stateCode,city,active,securityContext);
    }
    @POST
    @Path("/program")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Program", notes = "Create a new program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response createProgram( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createProgram(version,body,securityContext);
    }
    @POST
    @Path("/purchase/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Purchase", notes = "Creates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response createPurchaseItem( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @NotNull, allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE" @QueryParam("purchaseType") String purchaseType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @DefaultValue("0") @QueryParam("purchaseLimit") Integer purchaseLimit,, allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS" @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createPurchaseItem(version,appKey,name,purchaseType,deviceId,accountId,description,tickets,price,purchaseCode,secretKey,purchaseLimit,serviceAction,coverAssetId,promoAssetId,giftable,assetable,allocateTickets,ticketType,points,offerLocationId,securityContext);
    }
    @POST
    @Path("/game/question/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Question", notes = "Create a question and related answers by the given params.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response createQuestion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("question") String question, @NotNull @QueryParam("answers") String answers, @NotNull @QueryParam("active") Boolean active, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createQuestion(version,accountId,question,answers,active,allocateTickets,ticketCount,tags,videoURL,assetId,ticketType,points,securityContext);
    }
    @POST
    @Path("/rating/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Rating", notes = "This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public Response createRating( @PathParam("version") BigDecimal version, @NotNull @QueryParam("ratableType") String ratableType, @NotNull @QueryParam("ratableId") Long ratableId, @NotNull @QueryParam("ratingValue") Integer ratingValue, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRating(version,ratableType,ratableId,ratingValue,deviceId,accountId,categoryId,display,description,locationDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/region/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Region", notes = "Create a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response createRegion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionClass") String regionClass, @NotNull @QueryParam("shortName") String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRegion(version,accountId,regionClass,shortName,fullName,parentIds,childrenIds,postalCodeIds,locations,retailerLocationId,visibility,categoryIds,filterIds,start,end,polygon,metaData,latitude,longitude,versionCode,root,active,securityContext);
    }
    @POST
    @Path("/report/region/summary/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Offline Report", notes = "Create an entry for the batch for offline report", response = ReportRegionLegSummaryBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportRegionLegSummaryBatchResponse.class) })
    public Response createRegionLegSummaryBatch( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid List<@Valid RegionLegSummary> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRegionLegSummaryBatch(version,body,securityContext);
    }
    @POST
    @Path("/reservation/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Reservation", notes = "Creates a reservation on an offer object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createReservation( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("appKey") String appKey, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createReservation(version,deviceId,accountId,startDate,endDate,offerId,offerLocationId,appKey,metaData,securityContext);
    }
    @POST
    @Path("/retailer/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer", notes = "Create a retailer record. A billable entity must be created first before a retailer record can be made.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response createRetailer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryIdsToAdd") String categoryIdsToAdd, @QueryParam("categoryIdsToRemove") String categoryIdsToRemove, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("createDefaultLocation") Boolean createDefaultLocation,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailer(version,name,deviceId,accountId,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,facebookUrl,twitterUrl,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,categoryIdsToAdd,categoryIdsToRemove,filterIds,latitude,longitude,metaData,searchTags,retailerType,visibility,createDefaultLocation,responseFormat,securityContext);
    }
    @POST
    @Path("/location/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer Location (Consumer)", notes = "Creates a location record for an application that can support crowd sourced locations.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response createRetailerLocationConsumer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("tags") String tags, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("metaData") String metaData, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("active") Boolean active, @QueryParam("locationType") String locationType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailerLocationConsumer(version,appKey,name,deviceId,accountId,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,detailsHeader,detailsBody,hours,tags,logoAssetId,picture1AssetId,picture2AssetId,categoryIds,filterIds,metaData,publicLocation,active,locationType,latitude,longitude,securityContext);
    }
    @POST
    @Path("/retailer/location/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Retailer Location", notes = "Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response createRetailerLocations( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerId") Long retailerId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("streetAddress") String streetAddress, @NotNull @QueryParam("city") String city, @NotNull @QueryParam("state") String state, @NotNull @QueryParam("postalCode") String postalCode, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("responseIncludes") String responseIncludes,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRetailerLocations(version,retailerId,name,streetAddress,city,state,postalCode,deviceId,accountId,streetAddress2,country,businessPhone,businessPhoneExt,website,email,internalId,detailsHeader,detailsBody,hours,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,building,googlePlaceId,yelpId,active,publicLocation,locationType,audienceIds,audienceIdsToAdd,audienceIdsToRemove,responseFormat,responseIncludes,securityContext);
    }
    @POST
    @Path("/route")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route", notes = "Create new route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response createRoute( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRoute(version,body,securityContext);
    }
    @PUT
    @Path("/route/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Directions", notes = "Regenerate the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public Response createRouteDirections( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRouteDirections(version,routeId,securityContext);
    }
    @PUT
    @Path("/route/{routeId}/polyline")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Polyline", notes = "Update the polyline of the requested route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response createRoutePolyline( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRoutePolyline(version,routeId,securityContext);
    }
    @POST
    @Path("/route/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Route Setting", notes = "Create a new route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response createRouteSettings( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRouteSettings(version,body,securityContext);
    }
    @POST
    @Path("/notification/schedule/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Scheduled Notification", notes = "This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response createScheduledNotification( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @NotNull @QueryParam("type") String type, @NotNull @QueryParam("message") String message, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("sendNow") Boolean sendNow, @DefaultValue("CUSTOM") @QueryParam("eventType") String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createScheduledNotification(version,accountId,name,type,message,contentId,contentName,contentType,parentId,parentType,appKey,groupingId,connectionGroupIds,connectionAccountIds,audienceId,audienceIds,albumIds,reportId,reportParams,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,cronType,metaData,conditionalInput,templateType,visibility,active,sendNow,eventType,deepLinkURI,sendToAll,securityContext);
    }
    @POST
    @Path("/score/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Score", notes = "Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public Response createScore( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("points") Integer points, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("timeTaken") Integer timeTaken, @QueryParam("highest") Boolean highest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createScore(version,accountId,appKey,points,missionId,gameId,packId,gameLevelId,gameObjectId,timeTaken,highest,securityContext);
    }
    @POST
    @Path("/secure/application/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Secure Application", notes = "Create a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createSecureApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("keyCert") File keyCert, @NotNull @QueryParam("trustStore") File trustStore, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @DefaultValue("true") @QueryParam("active") Boolean active,, allowableValues="FINGERPRINT, IRIS, FACIAL" @DefaultValue("FACIAL") @QueryParam("biometricType") String biometricType,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @DefaultValue("UNKNOWN") @QueryParam("biometricPosition") String biometricPosition,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @DefaultValue("UNKNOWN") @QueryParam("biometricPosition2") String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSecureApplication(version,accountId,appKey,keyCert,trustStore,username,password,active,biometricType,biometricPosition,biometricPosition2,securityContext);
    }
    @POST
    @Path("/hub")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Service Hub", notes = "Create new service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response createServiceHub( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createServiceHub(version,body,securityContext);
    }
    @POST
    @Path("/shipment")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment", notes = "Create new shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response createShipment( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createShipment(version,body,securityContext);
    }
    @POST
    @Path("/shipment/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Shipment Batch", notes = "Create a new shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public Response createShipmentBatch( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid ShipmentBatch body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createShipmentBatch(version,body,securityContext);
    }
    @POST
    @Path("/billing/crypto/transfer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Smart Contract", notes = "Adds a smart contract.", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response createSmartContract( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("tokenName") String tokenName, @NotNull @QueryParam("tokenSymbol") String tokenSymbol, @QueryParam("paymentMethodId") Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSmartContract(version,accountId,tokenName,tokenSymbol,paymentMethodId,securityContext);
    }
    @POST
    @Path("/vatom/b/spaces/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Space", notes = "Create a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createSpace( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSpace(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/stripe/checkout/session/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Stripe Checkout Session", notes = "Create a Stripe checkout session", response = SirqulResponse.class, tags={ "Stripe", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response createStripeCheckoutSession( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("stripeParameters") String stripeParameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createStripeCheckoutSession(version,appKey,stripeParameters,securityContext);
    }
    @POST
    @Path("/subscription/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Subscription", notes = "Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response createSubscription( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createSubscription(version,accountId,planId,promoCode,securityContext);
    }
    @POST
    @Path("/task/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Task", notes = "Create a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response createTask( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @DefaultValue("true") @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTask(version,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,visibility,active,securityContext);
    }
    @POST
    @Path("/territory/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Territory", notes = "Creates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response createTerritory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTerritory(version,accountId,name,active,securityContext);
    }
    @POST
    @Path("/tournament/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tournament", notes = "Create a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response createTournament( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("title") String title, @NotNull @QueryParam("costToPlay") Integer costToPlay, @NotNull @QueryParam("startDate") Long startDate, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @DefaultValue("600") @QueryParam("secondsBetweenLevels") Integer secondsBetweenLevels, @DefaultValue("600") @QueryParam("secondsForTieBreaker") Integer secondsForTieBreaker, @DefaultValue("86400") @QueryParam("secondsBetweenPacks") Integer secondsBetweenPacks, @DefaultValue("1800") @QueryParam("maximumLevelLength") Integer maximumLevelLength, @QueryParam("costToPlayType") String costToPlayType, @DefaultValue("1") @QueryParam("minimumToPlay") Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @DefaultValue("false") @QueryParam("enableBuyBack") Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @DefaultValue("false") @QueryParam("fixedReward") Boolean fixedReward,, allowableValues="EVEN, ALL, FIRST, RANDOM" @DefaultValue("ALL") @QueryParam("splitReward") String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData,, allowableValues="TOURNAMENT, POOLPLAY, MULTISTAGE" @DefaultValue("MULTISTAGE") @QueryParam("missionType") String missionType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @DefaultValue("PUBLIC") @QueryParam("visibility") String visibility, @DefaultValue("1") @QueryParam("preliminaryGroups") Integer preliminaryGroups, @DefaultValue("1") @QueryParam("preliminaryGroupAdvancements") String preliminaryGroupAdvancements, @DefaultValue("false") @QueryParam("enableMultipleEntries") Boolean enableMultipleEntries, @DefaultValue("false") @QueryParam("enableMultipleVotes") Boolean enableMultipleVotes, @DefaultValue("false") @QueryParam("featured") Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTournament(version,accountId,appKey,title,costToPlay,startDate,subType,imageAssetId,secondsBetweenLevels,secondsForTieBreaker,secondsBetweenPacks,maximumLevelLength,costToPlayType,minimumToPlay,startingLimit,availableLimit,description,metaData,audienceIds,active,enableBuyBack,offerIds,offerAssetId,fixedReward,splitReward,allocateTickets,tournamentData,missionType,visibility,preliminaryGroups,preliminaryGroupAdvancements,enableMultipleEntries,enableMultipleVotes,featured,winnerTag,tieTag,securityContext);
    }
    @POST
    @Path("/trigger/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trigger", notes = "Create a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response createTrigger( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @DefaultValue("true") @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTrigger(version,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,conditionalInput,visibility,active,securityContext);
    }
    @POST
    @Path("/trip")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Trip", notes = "Create a new trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response createTrip( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createTrip(version,body,securityContext);
    }
    @POST
    @Path("/vatom/b/events/create")
    
    
    @io.swagger.annotations.ApiOperation(value = "Create Vatom Event", notes = "Create a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response createVatomEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVatomEvent(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vehicle")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle", notes = "Create new vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response createVehicle( @PathParam("version") BigDecimal version, @NotNull @QueryParam("vehicle") String vehicle,@ApiParam(value = "" ) @Valid Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVehicle(version,vehicle,body,securityContext);
    }
    @POST
    @Path("/vehicle/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Vehicle Type", notes = "Create a new vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response createVehicleType( @PathParam("version") BigDecimal version, @NotNull @QueryParam("vehicleType") String vehicleType,@ApiParam(value = "" ) @Valid VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVehicleType(version,vehicleType,body,securityContext);
    }
    @POST
    @Path("/orson/ai/voiceCanvas")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create VoiceCanvas images", notes = "Create VoiceCanvas images for provided text, file upload, or file URL", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public Response createVoiceCanvas( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("dimensions") String dimensions, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("text") String text, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("parseFlag") Boolean parseFlag, @QueryParam("fetchFlag") Boolean fetchFlag, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVoiceCanvas(version,accountId,dimensions,thirdPartyAccountId,text,_file,url,parseFlag,fetchFlag,paramCallback,securityContext);
    }
    @POST
    @Path("/game/word/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Word", notes = "Create a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response createWord( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("word") String word, @NotNull @QueryParam("definition") String definition, @NotNull @DefaultValue("false") @QueryParam("active") Boolean active, @NotNull @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @DefaultValue("0") @QueryParam("ticketCount") Long ticketCount, @QueryParam("assetId") Long assetId, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createWord(version,accountId,word,definition,active,allocateTickets,ticketCount,assetId,ticketType,points,securityContext);
    }
    @DELETE
    @Path("/trip/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Trip", notes = "Delete an existing trip", response = Void.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response delete( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.delete(version,id,securityContext);
    }
    @POST
    @Path("/achievement/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement", notes = "Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAchievement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("achievementId") Long achievementId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAchievement(version,achievementId,accountId,securityContext);
    }
    @POST
    @Path("/achievement/tier/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Achievement Tier", notes = "Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAchievementTier( @PathParam("version") BigDecimal version, @NotNull @QueryParam("achievementTierId") Long achievementTierId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAchievementTier(version,achievementTierId,accountId,securityContext);
    }
    @POST
    @Path("/application/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Application", notes = "Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteApplication( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplication(version,accountId,appKey,securityContext);
    }
    @POST
    @Path("/appconfig/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete AppConfig", notes = "Mark the application configuration for deletion.", response = SirqulResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteApplicationConfig( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplicationConfig(version,accountId,configId,securityContext);
    }
    @POST
    @Path("/application/placement/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Ad Placement", notes = "Deletes an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response deleteApplicationPlacement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteApplicationPlacement(version,placementId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/asset/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Asset", notes = "Delete an asset.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAsset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("assetId") String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAsset(version,assetId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/audience/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Audience", notes = "Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAudience( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAudience(version,accountId,audienceId,securityContext);
    }
    @POST
    @Path("/report/batch/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offline Report", notes = "Deletes a batch report.", response = SirqulResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBatch(version,accountId,batchId,securityContext);
    }
    @POST
    @Path("/bid/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Bid", notes = "Deleted a bid on a biddable object", response = SirqulResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBid( @PathParam("version") BigDecimal version, @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBid(version,bidId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/billable/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Billable", notes = "Mark the billable as deleted", response = SirqulResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteBillableEntity( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteBillableEntity(version,deviceId,accountId,securityContext);
    }
    @DELETE
    @Path("/cargo/type/{cargoTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Cargo Type", notes = "Delete a type of cargo", response = Void.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteCargoType( @PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCargoType(version,cargoTypeId,securityContext);
    }
    @POST
    @Path("/category/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Category", notes = "Delete a category.", response = SirqulResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCategory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCategory(version,accountId,categoryId,securityContext);
    }
    @POST
    @Path("/consumer/album/contest/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Contest", notes = "Deletes a contest.", response = SirqulResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteContest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumContestId") Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteContest(version,albumContestId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/creative/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Creative", notes = "Delete a creative", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCreative( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCreative(version,accountId,creativeId,securityContext);
    }
    @POST
    @Path("/thirdparty/credential/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Credential", notes = "Delete a third party network on a Sirqul account.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteCredential( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteCredential(version,accountId,networkUID,thirdPartyId,appKey,securityContext);
    }
    @DELETE
    @Path("/object/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Data", notes = "Delete a record for the specified object. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteData( @PathParam("version") BigDecimal version, @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteData(version,objectName,objectId,accountId,securityContext);
    }
    @POST
    @Path("/employee/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Employee", notes = "Set the deleted date field which marks the record as deleted.", response = SirqulResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteEmployee(version,accountId,employeeAccountId,securityContext);
    }
    @POST
    @Path("/event/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Event", notes = "Delete an event that the user has permissions to.", response = SirqulResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteEvent(version,accountId,eventId,securityContext);
    }
    @POST
    @Path("/favorite/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Favorite", notes = "Removes a favorited item from the user's favorites list.", response = SirqulResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFavorite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("favoriteId") Long favoriteId, @QueryParam("favoritableId") Long favoritableId, @QueryParam("favoritableType") String favoritableType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFavorite(version,deviceId,accountId,favoriteId,favoritableId,favoritableType,securityContext);
    }
    @POST
    @Path("/object/field/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Field", notes = "Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field.   The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteField( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName, @NotNull @QueryParam("fieldName") String fieldName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteField(version,accountId,appKey,objectName,fieldName,securityContext);
    }
    @POST
    @Path("/filter/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Filter", notes = "Delete a filter.", response = SirqulResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFilter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("filterId") Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFilter(version,accountId,filterId,securityContext);
    }
    @POST
    @Path("/flag/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Flag", notes = "Deletes a flag.", response = SirqulResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteFlag( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @QueryParam("itemBeingFlaggedId") Long itemBeingFlaggedId, @QueryParam("flagableType") String flagableType, @QueryParam("flagableId") Long flagableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFlag(version,deviceId,accountId,itemBeingFlaggedType,itemBeingFlaggedId,flagableType,flagableId,securityContext);
    }
    @POST
    @Path("/vatom/me/rels/following/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete following", notes = "Delete following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteFollowing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomRelsKey") String vatomRelsKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteFollowing(version,accountId,vatomRelsKey,returnRawResponse,securityContext);
    }
    @POST
    @Path("/game/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete a Game", notes = "Delete a game.", response = SirqulResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteGame( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameId") Long gameId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteGame(version,accountId,gameId,securityContext);
    }
    @POST
    @Path("/level/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Game Level", notes = "Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteGameLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteGameLevel(version,accountId,levelId,securityContext);
    }
    @POST
    @Path("/leaderboard/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete the Leader Board", notes = "Removes a leader board id.", response = SirqulResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteLeaderboard( @PathParam("version") BigDecimal version, @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteLeaderboard(version,leaderboardId,accountId,securityContext);
    }
    @POST
    @Path("/listing/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Listing", notes = "Delete a listing.", response = SirqulResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteListing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("listingId") Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteListing(version,accountId,listingId,securityContext);
    }
    @POST
    @Path("/media/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Media", notes = "Delete a media offering that the user has permissions to.", response = SirqulResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMedia( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMedia(version,accountId,mediaId,securityContext);
    }
    @POST
    @Path("/mission/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission", notes = "Delete a mission.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMission( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMission(version,accountId,missionId,securityContext);
    }
    @POST
    @Path("/mission/invite/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Mission Invite", notes = "Update the mission invite status to quit.", response = SirqulResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteMissionInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteMissionInvite(version,deviceId,accountId,missionId,missionInviteId,includeGameData,securityContext);
    }
    @POST
    @Path("/thirdparty/network/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Network", notes = "Marks a custom third party network as deleted. Only the network owners and managers have access to this.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteNetwork( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNetwork(version,accountId,networkUID,securityContext);
    }
    @POST
    @Path("/note/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Note", notes = "Sets a comment (note) as deleted.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteNote( @PathParam("version") BigDecimal version, @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNote(version,noteId,deviceId,accountId,latitude,longitude,appKey,securityContext);
    }
    @POST
    @Path("/notification/template/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Notification Template", notes = "Deletes a notification template. Developers will only be able to delete notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response deleteNotificationTemplate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNotificationTemplate(version,accountId,notificationTemplateId,securityContext);
    }
    @POST
    @Path("/object/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Object", notes = "Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response deleteObject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteObject(version,accountId,appKey,objectName,securityContext);
    }
    @POST
    @Path("/retailer/offer/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer", notes = "Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOffer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerId") Long offerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOffer(version,offerId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/retailer/offer/location/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer Location", notes = "Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferLocation( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferLocation(version,offerLocationId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/wallet/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Wallet Offer", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferTransaction( @PathParam("version") BigDecimal version, @NotNull @QueryParam("transactionId") Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferTransaction(version,transactionId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/offer/status/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Offer Status", notes = "Mark an offer status record as deleted", response = SirqulResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOfferTransactionStatus( @PathParam("version") BigDecimal version, @NotNull @QueryParam("statusId") Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOfferTransactionStatus(version,statusId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/order/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Order", notes = "Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.", response = SirqulResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteOrder( @PathParam("version") BigDecimal version, @NotNull @QueryParam("orderId") Long orderId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteOrder(version,orderId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/pack/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Pack", notes = "Delete a pack.", response = SirqulResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePack( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePack(version,accountId,packId,securityContext);
    }
    @POST
    @Path("/persona/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Persona", notes = "Mark the persona for deletion.", response = SirqulResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePersona( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePersona(version,accountId,personaId,securityContext);
    }
    @POST
    @Path("/vatom/b/campaign/points/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Reset All Points Balance", notes = "Reset All Points Balance.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deletePointsBalance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePointsBalance(version,accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/postalCode/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Postal Code", notes = "Delete a Postal Code", response = SirqulResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePostalCode( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postalCodeId") Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePostalCode(version,accountId,postalCodeId,securityContext);
    }
    @DELETE
    @Path("/program/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Program", notes = "Delete an existing program", response = Void.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteProgram( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteProgram(version,id,securityContext);
    }
    @POST
    @Path("/purchase/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Purchase", notes = "Marks the purchase item as deleted", response = SirqulResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deletePurchaseItem( @PathParam("version") BigDecimal version, @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deletePurchaseItem(version,purchaseItemId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/game/question/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Question", notes = "Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteQuestion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteQuestion(version,questionId,accountId,securityContext);
    }
    @POST
    @Path("/rating/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Rating", notes = "Sets a rating as deleted.", response = SirqulResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRating( @PathParam("version") BigDecimal version, @NotNull @QueryParam("ratingId") Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRating(version,ratingId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/region/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Region", notes = "Delete a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response deleteRegion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionId") Long regionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRegion(version,accountId,regionId,securityContext);
    }
    @POST
    @Path("/reservation/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Reservation", notes = "Deleted a reservation on a reservation object", response = Void.class, tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteReservation( @PathParam("version") BigDecimal version, @NotNull @QueryParam("reservationId") Long reservationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteReservation(version,reservationId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/retailer/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Retailer", notes = "Set the deleted timestamp to current time.", response = SirqulResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRetailer( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerId") Long retailerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRetailer(version,deviceId,accountId,retailerId,securityContext);
    }
    @POST
    @Path("/retailer/location/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Retailer Location", notes = "Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.", response = SirqulResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteRetailerLocation( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationId") Long retailerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRetailerLocation(version,deviceId,accountId,retailerLocationId,securityContext);
    }
    @DELETE
    @Path("/route/{routeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Route", notes = "Delete an existing route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRoute(version,routeId,securityContext);
    }
    @DELETE
    @Path("/route/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Route Setting", notes = "Delete an existing route setting", response = Object.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response deleteRouteSettings( @PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteRouteSettings(version,routeSettingsId,securityContext);
    }
    @POST
    @Path("/notification/schedule/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Scheduled Notification", notes = "This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response deleteScheduledNotification( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @QueryParam("deleteByGroupingId") Boolean deleteByGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteScheduledNotification(version,accountId,scheduledNotificationId,deleteByGroupingId,securityContext);
    }
    @POST
    @Path("/secure/application/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Secure Application", notes = "Delete a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteSecureApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSecureApplication(version,accountId,appKey,securityContext);
    }
    @DELETE
    @Path("/hub/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Service Hub", notes = "Delete an existing service hub", response = Void.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteServiceHub( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteServiceHub(version,id,securityContext);
    }
    @DELETE
    @Path("/shipment/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment", notes = "Delete an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteShipment( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteShipment(version,id,securityContext);
    }
    @DELETE
    @Path("/shipment/batch/{batchId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Shipment Batch", notes = "Search for shipment batches", response = Void.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteShipmentBatch( @PathParam("version") BigDecimal version, @PathParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteShipmentBatch(version,batchId,securityContext);
    }
    @POST
    @Path("/vatom/b/spaces/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Space", notes = "Delete a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteSpace( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSpace(version,accountId,appKey,vatomSpaceId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/subscription/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Subscription", notes = "Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action", response = SirqulResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteSubscription( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteSubscription(version,accountId,securityContext);
    }
    @POST
    @Path("/task/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Task", notes = "Delete a Task", response = SirqulResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTask( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("taskId") Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTask(version,accountId,taskId,securityContext);
    }
    @POST
    @Path("/territory/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Territory", notes = "Deletes a territory.", response = SirqulResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTerritory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("territoryId") Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTerritory(version,accountId,territoryId,securityContext);
    }
    @POST
    @Path("/tournament/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Tournament", notes = "Delete a tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTournament( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTournament(version,accountId,missionId,securityContext);
    }
    @POST
    @Path("/trigger/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Trigger", notes = "Mark a trigger as deleted.", response = SirqulResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteTrigger( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("triggerId") Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteTrigger(version,accountId,triggerId,securityContext);
    }
    @POST
    @Path("/vatom/b/events/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom Event", notes = "Delete a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVatomEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVatomEvent(version,accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vatom/vatoms/delete")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vatom NFT", notes = "Delete Vatom NFT", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVatomNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVatomNFT(version,accountId,vatomId,returnRawResponse,securityContext);
    }
    @DELETE
    @Path("/vehicle/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle", notes = "Delete an existing vehicle", response = Void.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVehicle( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVehicle(version,id,securityContext);
    }
    @DELETE
    @Path("/vehicle/type/{vehicleTypeId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Vehicle Type", notes = "Delete a vehicle type", response = Void.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response deleteVehicleType( @PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVehicleType(version,vehicleTypeId,securityContext);
    }
    @DELETE
    @Path("/game/word/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Word", notes = "Delete a word by the given id. The accountId given needs to be the owner or executive to delete.", response = SirqulResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteWord( @PathParam("version") BigDecimal version, @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteWord(version,wordId,accountId,securityContext);
    }
    @POST
    @Path("/route/{routeId}/disapprove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Disapprove Route", notes = "Disapprove a route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response disapproveRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.disapproveRoute(version,routeId,securityContext);
    }
    @POST
    @Path("/trip/{id}/drive")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Driver", notes = "Update trip preference to drive, also create a route and assign the trip to the route", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response driveTrip( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.driveTrip(version,id,recurrence,securityContext);
    }
    @POST
    @Path("/category/duplicate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Duplicate Category", notes = "Duplicate a category, including all its children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response duplicateCategory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId, @QueryParam("appKey") String appKey, @QueryParam("parentCategoryId") Long parentCategoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.duplicateCategory(version,accountId,categoryId,appKey,parentCategoryId,securityContext);
    }
    @POST
    @Path("/account/profile/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account", notes = "Edit the user's profile information", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public Response editAccount( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("role") String role, @QueryParam("assetId") Long assetId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("makeProfileInfoPublic") Boolean makeProfileInfoPublic, @QueryParam("makeGameInfoPublic") Boolean makeGameInfoPublic, @QueryParam("makeFriendsInfoPublic") Boolean makeFriendsInfoPublic, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("matchToken") String matchToken, @QueryParam("gameExperience") String gameExperience, @QueryParam("categories") String categories, @QueryParam("categoryIds") String categoryIds, @DefaultValue("PROFILE,PROFILE_CONTACT") @QueryParam("responseFilters") String responseFilters, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("acceptedTerms") Boolean acceptedTerms, @QueryParam("locationVisibility") String locationVisibility, @QueryParam("appBlob") String appBlob, @QueryParam("appEnablePush") Boolean appEnablePush, @QueryParam("appEnableSMS") Boolean appEnableSMS, @QueryParam("appEnableEmail") Boolean appEnableEmail, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId, @QueryParam("appNickname") String appNickname, @QueryParam("personalAudienceId") Long personalAudienceId, @QueryParam("nonGuestUsername") String nonGuestUsername,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.editAccount(version,deviceId,accountId,connectionAccountId,role,assetId,name,prefixName,firstName,middleName,lastName,suffixName,title,gender,age,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,makeProfileInfoPublic,makeGameInfoPublic,makeFriendsInfoPublic,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,platforms,tags,aboutUs,matchToken,gameExperience,categories,categoryIds,responseFilters,showAsZipcode,showExactLocation,showOthersExactLocation,acceptedTerms,locationVisibility,appBlob,appEnablePush,appEnableSMS,appEnableEmail,gameType,appKey,latitude,longitude,returnProfile,audienceIdsToAdd,audienceIdsToRemove,referralAccountId,appNickname,personalAudienceId,nonGuestUsername,securityContext);
    }
    @POST
    @Path("/account/username/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Username and Email", notes = "Update account's own username and/or emailAddress", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response editUsername( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("emailAddress") String emailAddress, @QueryParam("username") String username,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.editUsername(version,deviceId,accountId,emailAddress,username,securityContext);
    }
    @POST
    @Path("/orson/ai/emotion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect emotions", notes = "Detects emotions in an audio or video recording.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public Response emotion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.emotion(version,accountId,thirdPartyAccountId,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/invite/event")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Event", notes = "Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response eventInvite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("listingId") Long listingId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("retailerLocationId") Long retailerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.eventInvite(version,accountId,appKey,listingId,receiverAccountIds,retailerLocationId,securityContext);
    }
    @POST
    @Path("/vatom/vatoms/execute-action")
    
    
    @io.swagger.annotations.ApiOperation(value = "Execute Action on NFT", notes = "Execute Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response executeActionOnNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.executeActionOnNFT(version,accountId,vatomId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/analytics/filteredUsage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Filtered Usage", notes = "Query analytics to get data used for graphs and charts", response = ChartData.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ChartData.class) })
    public Response filteredUsage( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("deviceType") String deviceType, @QueryParam("device") String device, @QueryParam("deviceOS") String deviceOS, @QueryParam("gender") String gender, @QueryParam("ageGroup") String ageGroup, @QueryParam("country") String country, @QueryParam("state") String state, @QueryParam("city") String city, @QueryParam("zip") String zip, @QueryParam("model") String model, @QueryParam("tag") String tag, @QueryParam("userAccountId") Long userAccountId, @QueryParam("userAccountDisplay") String userAccountDisplay, @QueryParam("userAccountUsername") String userAccountUsername, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("groupBy") String groupBy,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("distinctCount") String distinctCount,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sumColumn") String sumColumn,, allowableValues="TAG_COUNT, TAG, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, CREATED, UPDATED, LAST_UPDATED, CLIENT_TIME, ACTIVE, CUSTOM_ID, CUSTOM_TYPE, CUSTOM_VALUE, CUSTOM_VALUE2, CUSTOM_LONG, CUSTOM_LONG2, CUSTOM_MESSAGE, CUSTOM_MESSAGE2, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_CREATED, ACCOUNT_GENDER, ACCOUNT_AGE_GROUP, APPLICATION_ID, APPLICATION_KEY, APPLICATION_NAME" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("hideUnknown") Boolean hideUnknown,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.filteredUsage(version,deviceId,accountId,applicationId,appKey,startDate,endDate,deviceType,device,deviceOS,gender,ageGroup,country,state,city,zip,model,tag,userAccountId,userAccountDisplay,userAccountUsername,customId,customType,customValue,customValue2,customLong,customLong2,customMessage,customMessage2,groupBy,distinctCount,sumColumn,sortField,descending,hideUnknown,responseFormat,l,limit,latitude,longitude,securityContext);
    }
    @GET
    @Path("/mission/find")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find Missions", notes = "Get a set of ad filtered by the parameters provided.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response findMissions( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("device") String device, @QueryParam("deviceIdentifier") Long deviceIdentifier, @QueryParam("deviceVersion") String deviceVersion, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("allocatesTickets") Boolean allocatesTickets, @QueryParam("randomize") Boolean randomize, @QueryParam("targetedAdsOnly") Boolean targetedAdsOnly, @QueryParam("missionIds") String missionIds, @QueryParam("audienceOperator") String audienceOperator,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.findMissions(version,appKey,suffix,type,accountId,appVersion,latitude,longitude,device,deviceIdentifier,deviceVersion,start,limit,includeGameData,includeAudiences,allocatesTickets,randomize,targetedAdsOnly,missionIds,audienceOperator,securityContext);
    }
    @POST
    @Path("/trip/{id}/flexible")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Flexible", notes = "Update trip preference to flexible.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response flexibleTrip( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.flexibleTrip(version,id,recurrence,securityContext);
    }
    @POST
    @Path("/consumer/follow/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Follow Request", notes = "Accept someone's follow request.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followAccept( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followAccept(version,accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/consumer/follow/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reject Follow Request", notes = "Reject someone's follow request or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followReject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followReject(version,accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/consumer/follow/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Follower / Unfollow", notes = "Unfollow someone you are following or remove them as a follower.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followRemove( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followRemove(version,accountId,connectionAccountId,appKey,securityContext);
    }
    @POST
    @Path("/consumer/follow/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Follow Request", notes = "Send a request to follow someone.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response followRequest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("appKey") String appKey, @DefaultValue("true") @QueryParam("approvalNeeded") Boolean approvalNeeded,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.followRequest(version,accountId,connectionAccountId,appKey,approvalNeeded,securityContext);
    }
    @POST
    @Path("/consumer/friend/accept")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Accept Friend", notes = "Accept a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendAccept( @PathParam("version") BigDecimal version, @NotNull @QueryParam("friendAccountId") Long friendAccountId, @NotNull @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendAccept(version,friendAccountId,notifyFriend,deviceId,accountId,gameType,appKey,notificationMessage,securityContext);
    }
    @POST
    @Path("/consumer/friend/reject")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Decline Friend", notes = "Request a friend request and optionally sends a notification.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendReject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendReject(version,friendAccountId,deviceId,accountId,gameType,appKey,notifyFriend,notificationMessage,securityContext);
    }
    @POST
    @Path("/consumer/friend/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Friend", notes = "Removes a friend from the user's friends list.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendRemove( @PathParam("version") BigDecimal version, @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notifyFriend") Boolean notifyFriend, @QueryParam("removeFromGroups") Boolean removeFromGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendRemove(version,friendAccountId,deviceId,accountId,notifyFriend,removeFromGroups,securityContext);
    }
    @POST
    @Path("/consumer/friend/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Friend", notes = "Sends a friend request notification to another user.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response friendRequest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("friendAccountId") Long friendAccountId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("notificationMessage") String notificationMessage,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.friendRequest(version,friendAccountId,deviceId,accountId,gameType,appKey,notificationMessage,securityContext);
    }
    @POST
    @Path("/invite/gameLevel")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Game Level", notes = "Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response gameInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.gameInvite(version,deviceId,accountId,appId,appKey,gameLevelId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/vatom/vatoms/geo-map/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom Geo Map", notes = "Search Vatom Geo Map", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response geomapSearch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.geomapSearch(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/account/profile/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account", notes = "Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response getAccount( @PathParam("version") BigDecimal version, @DefaultValue("false") @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @DefaultValue("0") @QueryParam("connectionAccountId") Long connectionAccountId, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @DefaultValue("SIRQUL") @QueryParam("purchaseType") String purchaseType, @DefaultValue("false") @QueryParam("updateViewedDate") Boolean updateViewedDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAccount(version,returnNulls,deviceId,accountId,connectionAccountEmail,connectionAccountId,responseFilters,gameType,appKey,purchaseType,updateViewedDate,latitude,longitude,securityContext);
    }
    @GET
    @Path("/achievement/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement", notes = "Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response getAchievement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("achievementId") Long achievementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementType") String achievementType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAchievement(version,achievementId,deviceId,accountId,achievementType,securityContext);
    }
    @POST
    @Path("/achievement/tier/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gets an achievement tier", notes = "Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response getAchievementTier( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("achievementTierId") Long achievementTierId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAchievementTier(version,accountId,achievementTierId,securityContext);
    }
    @GET
    @Path("/orson/ai/addMovie/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Add Movie Result", notes = "Get the result of an in progress Add Movie request from an earlier POST.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public Response getAddMovieResult( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAddMovieResult(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/audience/ageGroups")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Age Groups", notes = "Gets the list of available age groups that can be selected by consumers and retailers targeting offers.", response = AgeGroupResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AgeGroupResponse.class, responseContainer = "List") })
    public Response getAgeGroups( @PathParam("version") BigDecimal version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAgeGroups(version,securityContext);
    }
    @GET
    @Path("/album/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = " Get Album", notes = "Get an Album.", response = AlbumFullResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class) })
    public Response getAlbumCollection( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("likePreviewSize") Integer likePreviewSize, @QueryParam("assetPreviewSize") Integer assetPreviewSize, @QueryParam("notePreviewSize") Integer notePreviewSize, @QueryParam("connectionPreviewSize") Integer connectionPreviewSize, @QueryParam("audiencePreviewSize") Integer audiencePreviewSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumCollection(version,returnNulls,albumId,deviceId,accountId,likePreviewSize,assetPreviewSize,notePreviewSize,connectionPreviewSize,audiencePreviewSize,securityContext);
    }
    @GET
    @Path("/consumer/album/contest/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Contest", notes = "Gets the contest object including the likes and notes", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response getAlbumContest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumContestId") Long albumContestId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumContest(version,albumContestId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/consumer/album/contest/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Contests", notes = "Searches on contests.", response = AlbumContestListResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestListResponse.class) })
    public Response getAlbumContests( @PathParam("version") BigDecimal version, @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appType") String appType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAlbumContests(version,filter,sortField,descending,start,limit,deviceId,accountId,gameType,appKey,appType,contestType,ownerId,q,keyword,i,l,dateCreated,latitude,longitude,securityContext);
    }
    @GET
    @Path("/app/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get App Data", notes = "Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application.", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public Response getAppData( @PathParam("version") BigDecimal version, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAppData(version,start,limit,deviceId,accountId,gameType,includeGameData,q,keyword,sortField,descending,i,l,gameObjectCount,filter,dateCreated,ownerId,missionIds,gameIds,packIds,gameLevelIds,appVersion,includeHigherVersionPacks,includeHigherVersionLevels,responseGroups,purchaseType,securityContext);
    }
    @GET
    @Path("/application/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Application", notes = "Get a specific application by appKey", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response getApplication( @PathParam("version") BigDecimal version, @QueryParam("appKey") String appKey, @QueryParam("applicationId") Long applicationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplication(version,appKey,applicationId,securityContext);
    }
    @GET
    @Path("/appconfig/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig", notes = "Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response getApplicationConfig( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationConfig(version,accountId,configId,securityContext);
    }
    @GET
    @Path("/appconfig/getbyversion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get AppConfig by Version", notes = "Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. ", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response getApplicationConfigByConfigVersion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("configVersion") String configVersion, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @DefaultValue("false") @QueryParam("allowOlderVersions") Boolean allowOlderVersions,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationConfigByConfigVersion(version,appKey,configVersion,retailerId,retailerLocationId,udid,allowOlderVersions,securityContext);
    }
    @GET
    @Path("/application/placement/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ad Placement", notes = "Get details of an ad placement", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response getApplicationPlacement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationPlacement(version,placementId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/application/versions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get API versions", notes = "Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getApplicationVersions( @PathParam("version") BigDecimal version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApplicationVersions(version,securityContext);
    }
    @GET
    @Path("/asset/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Asset", notes = "Gets the full asset response including attached likes and notes.", response = AssetFullResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetFullResponse.class) })
    public Response getAsset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("assetId") Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("noteDescending") Boolean noteDescending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAsset(version,assetId,deviceId,accountId,noteDescending,securityContext);
    }
    @GET
    @Path("/audience/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Audience", notes = "Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response getAudience( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId, @QueryParam("appKey") String appKey, @DefaultValue("false") @QueryParam("returnAccountCount") Boolean returnAccountCount, @DefaultValue("false") @QueryParam("returnAlbumCount") Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAudience(version,accountId,audienceId,appKey,returnAccountCount,returnAlbumCount,albumTypesForCount,securityContext);
    }
    @GET
    @Path("/audience/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Audiences", notes = "Get the list audiences owned by the account", response = SearchResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class, responseContainer = "List") })
    public Response getAudienceList( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("keyword") String keyword, @DefaultValue("SEARCH_TAGS,NAME,DESCRIPTION") @QueryParam("keywordFields") String keywordFields,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, SEND_SUGGESTION, OWNER_ID, OWNER_DISPLAY, GENDER" @DefaultValue("NAME") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("appKey") String appKey, @QueryParam("returnGlobal") Boolean returnGlobal, @QueryParam("exactKeyword") Boolean exactKeyword, @QueryParam("audienceType") String audienceType, @QueryParam("audienceTypes") String audienceTypes, @DefaultValue("false") @QueryParam("returnAccountCount") Boolean returnAccountCount, @DefaultValue("false") @QueryParam("returnAlbumCount") Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAudienceList(version,accountId,albumIds,keyword,keywordFields,sortField,descending,start,limit,sendSuggestion,activeOnly,groupByGroupingId,appKey,returnGlobal,exactKeyword,audienceType,audienceTypes,returnAccountCount,returnAlbumCount,albumTypesForCount,securityContext);
    }
    @GET
    @Path("/orson/ai/batch/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Batch Analysis Results", notes = "Gets the completed Video Batch results, if done, or an error or status update if not.", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public Response getBatch( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBatch(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/bid/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Bid", notes = "Get the bid details of a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response getBid( @PathParam("version") BigDecimal version, @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBid(version,bidId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/billable/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Billable", notes = "Used to determine the associated BillableEntity of an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response getBillableEntity( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("includeCounts") Boolean includeCounts, @DefaultValue("true") @QueryParam("includePayments") Boolean includePayments,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBillableEntity(version,deviceId,accountId,includeCounts,includePayments,securityContext);
    }
    @GET
    @Path("/vatom/b/behaviors")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Behaviors", notes = "Gets the behaviors of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessBehaviors( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessBehaviors(version,accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a Business", notes = "Get the coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessCoinsBalance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessCoinsBalance(version,accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/me/businesses")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the user business ids", notes = "Get the business ids the logged in user has access to.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessIds( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessIds(version,accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Info", notes = "Gets the business info tied to this account.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessInfo( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessInfo(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/users")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Business Users", notes = "Gets the users of a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getBusinessUsers( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBusinessUsers(version,accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign-groups/entities")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Entities", notes = "Get campaign group entities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupEntities( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupEntities(version,accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign-groups/rules")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Rules", notes = "Get campaign group rules.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupRules( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupRules(version,accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign-groups/stats")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Group Stats", notes = "Get campaign group stats.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignGroupStats( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignGroupStats(version,accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign-groups/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Campaign Info", notes = "Gets the info on a campaign.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getCampaignInfo( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCampaignInfo(version,accountId,appKey,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/cargo/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Cargo Type", notes = "Get an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response getCargoType( @PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCargoType(version,cargoTypeId,securityContext);
    }
    @GET
    @Path("/category/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Category", notes = "Get the details of a specific category. Recursively include all child categories and their children.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response getCategory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("categoryId") Long categoryId, @DefaultValue("true") @QueryParam("returnExternal") Boolean returnExternal,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCategory(version,categoryId,returnExternal,securityContext);
    }
    @GET
    @Path("/consumer/connection/getRequested")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Sent Friend Requests", notes = "Gets the connection sent friend requests.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response getConnectionSentFriendRequests( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getConnectionSentFriendRequests(version,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/consumer/connection/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connections", notes = "Gets the connections.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response getConnections( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getConnections(version,returnNulls,filter,sortField,descending,start,limit,deviceId,accountId,connectionAccountId,q,keyword,i,l,latitude,longitude,securityContext);
    }
    @GET
    @Path("/creative/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Creative", notes = "Get a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response getCreative( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCreative(version,accountId,creativeId,securityContext);
    }
    @GET
    @Path("/creative/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Creatives", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = CreativeResponse.class, responseContainer = "List", tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class, responseContainer = "List") })
    public Response getCreativesByApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("missionId") Long missionId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCreativesByApplication(version,accountId,appKey,start,limit,missionId,keyword,securityContext);
    }
    @POST
    @Path("/thirdparty/credential/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Credential", notes = "Gets the account information given a third party token.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response getCredential( @PathParam("version") BigDecimal version, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("deviceId") String deviceId, @QueryParam("sessionId") String sessionId, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartySecret") String thirdPartySecret, @DefaultValue("false") @QueryParam("createNewAccount") Boolean createNewAccount, @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("referralAccountId") Long referralAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCredential(version,networkUID,appKey,accountId,deviceId,sessionId,thirdPartyCredentialId,thirdPartyToken,thirdPartySecret,createNewAccount,responseFilters,latitude,longitude,audienceIdsToAdd,audienceIdsToRemove,referralAccountId,securityContext);
    }
    @GET
    @Path("/billing/crypto/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Crypto Balances", notes = "Get the cypto balance details for a user", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response getCryptoBalance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("ownerAccountId") Long ownerAccountId, @QueryParam("paymentMethodId") Long paymentMethodId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getCryptoBalance(version,accountId,ownerAccountId,paymentMethodId,securityContext);
    }
    @GET
    @Path("/object/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Data", notes = "Get a specific record from a specified object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response getData( @PathParam("version") BigDecimal version, @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId, @QueryParam("include") String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getData(version,objectName,objectId,accountId,include,securityContext);
    }
    @GET
    @Path("/cargo/dependent/{accountId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get dependent list of an account", notes = "Get the dependent list of an account", response = SirqulResponse.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getDependents( @PathParam("version") BigDecimal version, @PathParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDependents(version,accountId,securityContext);
    }
    @GET
    @Path("/audience/devices")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Devices", notes = "Gets the list of available devices that can be selected by consumers and retailers.", response = AudienceDeviceResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceDeviceResponse.class, responseContainer = "List") })
    public Response getDevices( @PathParam("version") BigDecimal version, @NotNull @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDevices(version,includeInactive,securityContext);
    }
    @GET
    @Path("/disbursement/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Disbursement", notes = "Get Disbursement details", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response getDisbursement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("disbursementId") Long disbursementId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDisbursement(version,accountId,disbursementId,securityContext);
    }
    @GET
    @Path("/orson/ai/emotion/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Emotion Results", notes = "Checks the Emotion analysis and returns in progress, results, or error.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public Response getEmotion( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEmotion(version,requestId,accountId,securityContext);
    }
    @POST
    @Path("/employee/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Employee", notes = "Get the account record for the account id provided.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response getEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("settingsAppKey") String settingsAppKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEmployee(version,accountId,employeeAccountId,settingsAppKey,securityContext);
    }
    @GET
    @Path("/orson/stories/episodes/{episodeId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public Response getEpisodeStatus( @PathParam("version") BigDecimal version, @PathParam("episodeId") Long episodeId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEpisodeStatus(version,episodeId,accountId,securityContext);
    }
    @GET
    @Path("/event/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Event", notes = "Get an event.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response getEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEvent(version,accountId,eventId,securityContext);
    }
    @GET
    @Path("/vatom/b/events/guests/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event Guest List", notes = "Gets the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getEventGuestList( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEventGuestList(version,accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/audience/experiences")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Experiences", notes = "Gets the list of available experiences that can be selected by consumers and retailers.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getExperiences( @PathParam("version") BigDecimal version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getExperiences(version,securityContext);
    }
    @GET
    @Path("/favorite/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Favorite", notes = "Retrieves a single favorited item.", response = WrappedResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedResponse.class) })
    public Response getFavorite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("favoriteId") Long favoriteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFavorite(version,favoriteId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/filter/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Filter", notes = "Get the details of a specific filter. Recursively include all child filters and their children.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response getFilter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("filterId") Long filterId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFilter(version,filterId,securityContext);
    }
    @GET
    @Path("/flag/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag", notes = "Gets the details on whether the user has flagged a particular flagable object.", response = FlagResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FlagResponse.class) })
    public Response getFlag( @PathParam("version") BigDecimal version, @NotNull @QueryParam("flagableType") String flagableType, @NotNull @QueryParam("flagableId") Long flagableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFlag(version,flagableType,flagableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/flag/threshold/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Flag Threshold", notes = "Get the flag threshold value on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response getFlagThreshold( @PathParam("version") BigDecimal version, @NotNull @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getFlagThreshold(version,itemBeingFlaggedType,appKey,securityContext);
    }
    @GET
    @Path("/game/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get a Game by id", notes = "Get a Game by id.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response getGame( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameId") Long gameId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGame(version,accountId,gameId,includeGameData,securityContext);
    }
    @GET
    @Path("/level/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Game Level", notes = "Get a game level. The level and account must be valid and have the appropirate permissions to view the content.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response getGameLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevel(version,accountId,levelId,includeGameData,securityContext);
    }
    @GET
    @Path("/level/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Levels", notes = "Get a list of levels for an application, just those the account has permissions to view.", response = GameLevelListResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelListResponse.class) })
    public Response getGameLevelsByApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("filters") String filters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevelsByApplication(version,accountId,appKey,keyword,sortField,descending,start,limit,appVersion,includeGameData,filters,securityContext);
    }
    @GET
    @Path("/level/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Game Level by Billable Entity", notes = "Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response getGameLevelsByBillableEntity( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword,, allowableValues="LEVEL_ACTIVE, LEVEL_NAME, LEVEL_DESCRIPTION, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS, LEVEL_DOWNLOADS, LEVEL_QUITS, LEVEL_COMPLETES, LEVEL_VERSION, LEVEL_MISSION_TYPE, LEVEL_OWNER_DISPLAY, GAME_OWNER_DISPLAY, GAME_TITLE, GAME_DESCRIPTION, GAME_LIKES, GAME_DISLIKES, APP_NAME, APP_SCORING_TYPE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("start") Long start, @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGameLevelsByBillableEntity(version,accountId,appKey,keyword,sortField,descending,activeOnly,start,limit,securityContext);
    }
    @GET
    @Path("/consumer/connection/group/details/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Connection Group", notes = "", response = ConnectionGroupResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionGroupResponse.class) })
    public Response getGroupDetails( @PathParam("version") BigDecimal version, @NotNull @QueryParam("combineConnections") Boolean combineConnections, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("groupId") Long groupId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGroupDetails(version,combineConnections,deviceId,accountId,groupId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/audience/grouped/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get GroupedAudiences", notes = "Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response getGroupedAudiences( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceGroupingId") String audienceGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGroupedAudiences(version,accountId,audienceGroupingId,securityContext);
    }
    @GET
    @Path("/ranking/historical/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Historical Rankings", notes = "Get historical leaderboard rankings by time-frame.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public Response getHistoricalRankings( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getHistoricalRankings(version,appKey,rankType,startDate,endDate,deviceId,accountId,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/vatom/me/inventory")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User's Inventory", notes = "Gets the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getInventory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInventory(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/invite/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Invite", notes = "This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to.", response = SirqulResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getInvite( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("token") String token, @QueryParam("albumId") Long albumId, @QueryParam("missionId") Long missionId, @QueryParam("albumContestId") Long albumContestId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getInvite(version,accountId,token,albumId,missionId,albumContestId,offerId,offerLocationId,retailerLocationId,appKey,securityContext);
    }
    @GET
    @Path("/leaderboard/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Read a leaderboard by id and retrieve the matching ranking list", notes = "Read a leaderboard by id and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response getLeaderboard( @PathParam("version") BigDecimal version, @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("includeFullRankingList") Boolean includeFullRankingList,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLeaderboard(version,leaderboardId,accountId,includeFullRankingList,securityContext);
    }
    @GET
    @Path("/listing/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Listing", notes = "Get a listing by id.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response getListing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("listingId") Long listingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getListing(version,listingId,securityContext);
    }
    @GET
    @Path("/location/ip")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by IP", notes = "Get location information based on an IP address.", response = CoordsResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CoordsResponse.class) })
    public Response getLocationByIp( @PathParam("version") BigDecimal version, @QueryParam("ip") String ip,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocationByIp(version,ip,securityContext);
    }
    @GET
    @Path("/account/location/trilaterate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Location by Trilateration", notes = "Send in device data and calculate a position based on signal strengths.", response = GeoPointResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GeoPointResponse.class) })
    public Response getLocationByTrilateration( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("data") String data, @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocationByTrilateration(version,accountId,latitude,longitude,data,responseFilters,securityContext);
    }
    @GET
    @Path("/location/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions or Postal Codes", notes = "Searches geographic locations by proximity via address or keyword.", response = LocationSearchResponse.class, tags={ "Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LocationSearchResponse.class) })
    public Response getLocations( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("currentlatitude") Double currentlatitude, @QueryParam("currentlongitude") Double currentlongitude, @QueryParam("currentLatitude") Double currentLatitude, @QueryParam("currentLongitude") Double currentLongitude, @QueryParam("query") String query, @QueryParam("zipcode") String zipcode, @QueryParam("zipCode") String zipCode, @QueryParam("selectedMaplatitude") Double selectedMaplatitude, @QueryParam("selectedMaplongitude") Double selectedMaplongitude, @QueryParam("selectedMapLatitude") Double selectedMapLatitude, @QueryParam("selectedMapLongitude") Double selectedMapLongitude, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @DefaultValue("false") @QueryParam("useGeocode") Boolean useGeocode, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLocations(version,deviceId,accountId,currentlatitude,currentlongitude,currentLatitude,currentLongitude,query,zipcode,zipCode,selectedMaplatitude,selectedMaplongitude,selectedMapLatitude,selectedMapLongitude,searchRange,useGeocode,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/media/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Media Get", notes = "Get a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response getMedia( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMedia(version,accountId,mediaId,securityContext);
    }
    @GET
    @Path("/mission/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission", notes = "Get a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response getMission( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("returnCreative") Boolean returnCreative,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMission(version,accountId,missionId,returnCreative,securityContext);
    }
    @GET
    @Path("/mission/invite/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Mission Invite", notes = "Get the mission invite. An account can only be invited to a mission one time.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response getMissionInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeScores") String includeScores,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMissionInvite(version,deviceId,accountId,missionId,missionInviteId,includeGameData,includeScores,securityContext);
    }
    @GET
    @Path("/vatom/me/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get following", notes = "Get following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getMyFollowing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMyFollowing(version,accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/thirdparty/network/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Network", notes = "Get the details of a third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response getNetwork( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNetwork(version,accountId,networkUID,securityContext);
    }
    @POST
    @Path("/note/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Note", notes = "Get for a note based on its Id.", response = SirqulResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getNote( @PathParam("version") BigDecimal version, @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("returnFullResponse") Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNote(version,noteId,deviceId,accountId,returnFullResponse,securityContext);
    }
    @GET
    @Path("/notification/template/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notification Template", notes = "Get the details of a notification template. Developers will only be able to see notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response getNotificationTemplate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNotificationTemplate(version,accountId,notificationTemplateId,securityContext);
    }
    @GET
    @Path("/notification/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Notifications", notes = "Get a list of notifications for a user. If the \"markAsRead\" parameter is set to true, the returned notifications will be marked as \"read\" after the response has been sent. By default, read messages will not be returned, so to see read messages, set \"returnReadMessages\" to true.", response = NotificationMessageListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationMessageListResponse.class) })
    public Response getNotifications( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("appKey") String appKey, @QueryParam("eventType") String eventType, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("actionCategory") String actionCategory, @QueryParam("conduits") String conduits, @QueryParam("keyword") String keyword, @QueryParam("returnReadMessages") Boolean returnReadMessages, @QueryParam("markAsRead") Boolean markAsRead, @QueryParam("fromDate") Long fromDate, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnSent") Boolean returnSent, @QueryParam("ignoreFlagged") Boolean ignoreFlagged, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNotifications(version,deviceId,accountId,connectionAccountId,appKey,eventType,contentIds,contentTypes,parentIds,parentTypes,actionCategory,conduits,keyword,returnReadMessages,markAsRead,fromDate,latitude,longitude,returnSent,ignoreFlagged,start,limit,securityContext);
    }
    @GET
    @Path("/object/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Object", notes = "Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response getObject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("objectName") String objectName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getObject(version,accountId,appKey,objectName,securityContext);
    }
    @GET
    @Path("/retailer/offer/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer", notes = "Gets the details of an offer that the user has access to.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response getOffer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerId") Long offerId, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOffer(version,offerId,includeOfferLocations,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/offer/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer", notes = "Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.", response = OfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response getOfferDetails( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("distance") Double distance, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @DefaultValue("false") @QueryParam("includeRetailerLocations") Boolean includeRetailerLocations, @DefaultValue("false") @QueryParam("includeChildOffers") Boolean includeChildOffers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferDetails(version,deviceId,accountId,offerId,offerLocationId,distance,latitude,longitude,includeOfferLocations,includeRetailerLocations,includeChildOffers,securityContext);
    }
    @GET
    @Path("/offer/lists/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Counts)", notes = "Gets the offer list counts.", response = ListCountResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListCountResponse.class) })
    public Response getOfferListCounts( @PathParam("version") BigDecimal version, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("searchRange") BigDecimal searchRange,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferListCounts(version,latitude,longitude,searchRange,distanceUnit,securityContext);
    }
    @GET
    @Path("/offer/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Location", notes = "Gets the offer location by offer location id or udid (of a device)", response = OfferShortResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class) })
    public Response getOfferLocation( @PathParam("version") BigDecimal version, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferLocation(version,offerLocationId,udid,securityContext);
    }
    @GET
    @Path("/retailer/offer/location/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Locations", notes = "Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.", response = OfferShortResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public Response getOfferLocationsForRetailers( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OFFER_ID, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, RETAILER_ID, RETAILER_LOCATION_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includeRetailerLocation") Boolean includeRetailerLocation, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin,, allowableValues="RUNNING, WARNING, DOWN" @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferLocationsForRetailers(version,sortField,descending,start,limit,activeOnly,includeRetailerLocation,deviceId,accountId,keyword,retailerId,retailerLocationId,offerType,specialOfferType,barcodeType,barcodeEntry,isbn,asin,deviceStatus,needsNotificationSent,lastNotificationSent,securityContext);
    }
    @GET
    @Path("/wallet/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Wallet Offer", notes = "", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public Response getOfferTransaction( @PathParam("version") BigDecimal version, @NotNull @QueryParam("transactionId") Long transactionId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("false") @QueryParam("includeMission") Boolean includeMission, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("true") @QueryParam("returnFullResponse") Boolean returnFullResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferTransaction(version,transactionId,deviceId,accountId,includeMission,latitude,longitude,returnFullResponse,securityContext);
    }
    @GET
    @Path("/offer/status/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offer Status", notes = "Get an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response getOfferTransactionStatus( @PathParam("version") BigDecimal version, @NotNull @QueryParam("statusId") Long statusId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOfferTransactionStatus(version,statusId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/retailer/offer/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offers", notes = "Searches on offers that the account has access to.", response = OfferResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class, responseContainer = "List") })
    public Response getOffersForRetailers( @PathParam("version") BigDecimal version, @NotNull, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("availableOnly") Boolean availableOnly, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includeCategories") Boolean includeCategories, @NotNull @QueryParam("includeFilters") Boolean includeFilters, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("couponType") String couponType,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin,, allowableValues="RUNNING, WARNING, DOWN" @QueryParam("deviceStatus") String deviceStatus, @QueryParam("needsNotificationSent") Boolean needsNotificationSent, @QueryParam("lastNotificationSent") Long lastNotificationSent,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOffersForRetailers(version,offerVisibility,sortField,descending,start,limit,availableOnly,activeOnly,includeCategories,includeFilters,includeOfferLocations,deviceId,accountId,categoryIds,filterIds,q,keyword,retailerId,retailerLocationId,couponType,offerType,offerTypes,specialOfferType,i,l,barcodeType,barcodeEntry,isbn,asin,deviceStatus,needsNotificationSent,lastNotificationSent,securityContext);
    }
    @GET
    @Path("/optimize/result/{batchID}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Optimization Result", notes = "Get the results of the import batch.", response = ShipmentOrder.class, responseContainer = "Map", tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentOrder.class, responseContainer = "Map") })
    public Response getOptimizationResult( @PathParam("version") BigDecimal version, @PathParam("batchID") String batchID, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOptimizationResult(version,batchID,start,limit,securityContext);
    }
    @GET
    @Path("/order/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Order", notes = "Get an order record", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response getOrder( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("orderId") Long orderId, @QueryParam("externalOrderId") String externalOrderId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getOrder(version,deviceId,accountId,orderId,externalOrderId,securityContext);
    }
    @GET
    @Path("/pack/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Pack", notes = "Get a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response getPack( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPack(version,accountId,packId,includeGameData,securityContext);
    }
    @GET
    @Path("/billing/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Payment Method", notes = "Get the details of the user's payment method or their current default method of payment", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response getPaymentMethod( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("getCurrentBalance") Boolean getCurrentBalance,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPaymentMethod(version,accountId,paymentMethodId,getCurrentBalance,securityContext);
    }
    @GET
    @Path("/persona/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Persona", notes = "Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response getPersonaList( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPersonaList(version,accountId,personaId,securityContext);
    }
    @GET
    @Path("/vatom/u/campaign/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getPointsBalance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPointsBalance(version,accountId,vatomUserId,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign/u/points/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Points Balance as Business", notes = "Gets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getPointsBalanceAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPointsBalanceAsBusiness(version,accountId,appKey,vatomUserId,vatomCampaignId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/postalCode/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Postal Code", notes = "Get a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response getPostalCode( @PathParam("version") BigDecimal version, @NotNull @QueryParam("postalCodeId") Long postalCodeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPostalCode(version,postalCodeId,securityContext);
    }
    @GET
    @Path("/postalCode/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Postal Codes", notes = "Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response.", response = PostalCodeResponse.class, responseContainer = "List", tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class, responseContainer = "List") })
    public Response getPostalCodes( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("miles") Double miles, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPostalCodes(version,sortField,descending,latitude,longitude,keyword,miles,start,limit,securityContext);
    }
    @GET
    @Path("/tracking/predicted/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Predicted Locations", notes = "Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks.", response = PredictedLocationResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PredictedLocationResponse.class) })
    public Response getPredictedLocations( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @DefaultValue("1") @QueryParam("threshold") Long threshold,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit, @DefaultValue("0") @QueryParam("searchRange") Double searchRange,, allowableValues="MATCHES, DISTANCE, WEIGHTED" @DefaultValue("MATCHES") @QueryParam("sortOrder") String sortOrder,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPredictedLocations(version,accountId,latitude,longitude,dateCheck,hourCheck,threshold,distanceUnit,searchRange,sortOrder,securityContext);
    }
    @GET
    @Path("/tracking/path/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tracking Path", notes = "Get the path (lat/long coordinates) between 2 steps previously logged for a customer.", response = StepResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = StepResponse.class, responseContainer = "List") })
    public Response getPredictedPath( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("startStepId") Long startStepId, @NotNull @QueryParam("endStepId") Long endStepId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPredictedPath(version,accountId,startStepId,endStepId,securityContext);
    }
    @GET
    @Path("/tracking/preferred/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Preferred Locations", notes = "Search on preferred locations for a user, which is created when a customer resides in a place for a period of time.", response = PreferredLocationResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreferredLocationResponse.class, responseContainer = "List") })
    public Response getPreferredLocations( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("dateCheck") Long dateCheck, @QueryParam("hourCheck") String hourCheck, @DefaultValue("PREFERRED_DATE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("0") @QueryParam("searchRange") Double searchRange,, allowableValues="MILES, KILOMETERS" @DefaultValue("MILES") @QueryParam("distanceUnit") String distanceUnit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPreferredLocations(version,accountId,latitude,longitude,dateCheck,hourCheck,sortField,descending,start,limit,searchRange,distanceUnit,securityContext);
    }
    @GET
    @Path("/account/profile/assets")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Profile Assets", notes = "Get a list of assets a person has ever uploaded. Filters the list based on parameters.", response = AssetListResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetListResponse.class) })
    public Response getProfileAssets( @PathParam("version") BigDecimal version, @DefaultValue("false") @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("mediaTypes") String mediaTypes, @QueryParam("mimeTypes") String mimeTypes, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("0") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getProfileAssets(version,returnNulls,deviceId,accountId,ownerId,mediaTypes,mimeTypes,sortField,descending,latitude,longitude,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/program/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Program", notes = "Get an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response getProgram( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getProgram(version,id,securityContext);
    }
    @GET
    @Path("/purchase/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Purchase", notes = "Get detailed information about a purchase item", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response getPurchaseItem( @PathParam("version") BigDecimal version, @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPurchaseItem(version,purchaseItemId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/game/question/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Question", notes = "Get a question by the given id.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response getQuestion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getQuestion(version,questionId,accountId,securityContext);
    }
    @GET
    @Path("/level/questions/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Questions", notes = "Get questions within a level.", response = QuestionResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response getQuestionsInLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getQuestionsInLevel(version,levelId,accountId,securityContext);
    }
    @GET
    @Path("/ranking/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rankings", notes = "Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.", response = RankFullResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RankFullResponse.class) })
    public Response getRankings( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @DefaultValue("POINTS,DOWNLOADS,INVITATIONS") @QueryParam("rankType") String rankType, @DefaultValue("GLOBAL") @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("withinAccountIds") String withinAccountIds, @DefaultValue("true") @QueryParam("returnUserRank") Boolean returnUserRank, @QueryParam("albumId") Long albumId, @QueryParam("audienceId") Long audienceId, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRankings(version,deviceId,accountId,gameType,appKey,q,keyword,rankType,leaderboardMode,withinAccountIds,returnUserRank,albumId,audienceId,sortField,descending,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/account/referral/list")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Gets a user's account profile and their referral List.", response = Void.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getReferralList( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retrieveType") String retrieveType, @QueryParam("levelLimit") BigDecimal levelLimit, @QueryParam("ancestorLevelLimit") BigDecimal ancestorLevelLimit, @QueryParam("childrenLevelLimit") BigDecimal childrenLevelLimit, @QueryParam("ancestorListStart") BigDecimal ancestorListStart, @QueryParam("ancestorListLimit") BigDecimal ancestorListLimit, @QueryParam("childrenListStart") BigDecimal childrenListStart, @QueryParam("childrenListLimit") BigDecimal childrenListLimit, @DefaultValue("true") @QueryParam("childrenChildren") Boolean childrenChildren,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getReferralList(version,accountId,appKey,retrieveType,levelLimit,ancestorLevelLimit,childrenLevelLimit,ancestorListStart,ancestorListLimit,childrenListStart,childrenListLimit,childrenChildren,securityContext);
    }
    @GET
    @Path("/region/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Region", notes = "Get a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response getRegion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("regionId") Long regionId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRegion(version,regionId,accountId,securityContext);
    }
    @GET
    @Path("/orson/stories/renders/{renderId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public Response getRenderStatus( @PathParam("version") BigDecimal version, @PathParam("renderId") String renderId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRenderStatus(version,renderId,accountId,securityContext);
    }
    @GET
    @Path("/report/batch/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offline Report", notes = "Checks status of batch report.", response = ReportBatchResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class) })
    public Response getReportBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId, @NotNull @QueryParam("allResults") Boolean allResults,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getReportBatch(version,accountId,batchId,allResults,securityContext);
    }
    @GET
    @Path("/retailer/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer", notes = "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response getRetailer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerId") Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeCounts") Boolean includeCounts,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailer(version,retailerId,deviceId,accountId,includeCounts,securityContext);
    }
    @GET
    @Path("/retailer/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer Location", notes = "Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response getRetailerLocation( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("retailerLocationToken") String retailerLocationToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailerLocation(version,retailerLocationId,deviceId,accountId,retailerLocationToken,securityContext);
    }
    @GET
    @Path("/location/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer Location (Consumer)", notes = "Gets the details of a retailer location as a consumer.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response getRetailerLocationConsumer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailerLocationConsumer(version,retailerLocationId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/retailer/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Retailers", notes = "earches on retailers that the account has access to.", response = RetailerResponse.class, responseContainer = "List", tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerResponse.class, responseContainer = "List") })
    public Response getRetailers( @PathParam("version") BigDecimal version, @NotNull, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, FILTERS, CATEGORIES, VISIBILITY, NAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetailers(version,visibility,sortField,descending,start,limit,activeOnly,deviceId,accountId,q,keyword,categoryIds,filterIds,i,l,securityContext);
    }
    @GET
    @Path("/retailer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Retailer", notes = "Gets a retailer. Only the owner and the employees of a retailer have access to view its information.", response = SirqulResponse.class, tags={ "Retailer V2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getRetaokiler( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerId") Long retailerId, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @DefaultValue("id") @QueryParam("sortField") String sortField, @DefaultValue("0") @QueryParam("start") Long start, @DefaultValue("20") @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRetaokiler(version,retailerId,activeOnly,keyword,sortField,start,limit,securityContext);
    }
    @GET
    @Path("/route/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route", notes = "Get an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response getRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @NotNull @QueryParam("showInheritedProperties") Boolean showInheritedProperties,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRoute(version,routeId,showInheritedProperties,securityContext);
    }
    @GET
    @Path("/route/{routeId}/directions")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Directions", notes = "Get the directions of a route", response = Direction.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Direction.class, responseContainer = "List") })
    public Response getRouteDirections( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteDirections(version,routeId,securityContext);
    }
    @GET
    @Path("/route/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Setting", notes = "Get an existing route settings", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response getRouteSettings( @PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteSettings(version,routeSettingsId,securityContext);
    }
    @GET
    @Path("/route/{routeId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Shipments", notes = "Get the shipments on the requested route", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response getRouteShipments( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteShipments(version,routeId,securityContext);
    }
    @GET
    @Path("/route/{routeId}/stop/{stopId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stop", notes = "Get the specific stop on a route", response = Stop.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response getRouteStop( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteStop(version,routeId,stopId,securityContext);
    }
    @GET
    @Path("/route/{routeId}/stops")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Route Stops", notes = "The stops of the route requested", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response getRouteStops( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @NotNull @QueryParam("confirmedOnly") Boolean confirmedOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRouteStops(version,routeId,confirmedOnly,securityContext);
    }
    @GET
    @Path("/orson/ai/stt/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Speach to Text Result", notes = "The results of the video transcription and optional translation.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public Response getSTT( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSTT(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/notification/schedule/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Scheduled Notification", notes = "Get a ScheduledNotification", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response getScheduledNotification( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getScheduledNotification(version,accountId,scheduledNotificationId,securityContext);
    }
    @GET
    @Path("/score/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Score", notes = "Get the high score for an item.  Pass in the full path IDs for the score.", response = ScoreResponse.class, tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class) })
    public Response getScore( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreObjectType") String scoreObjectType, @QueryParam("scoreStatus") String scoreStatus,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getScore(version,accountId,appKey,missionId,gameId,packId,gameLevelId,gameObjectId,scoreObjectType,scoreStatus,securityContext);
    }
    @GET
    @Path("/hub/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Service Hub", notes = "Get an existing service hub", response = Object.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response getServiceHub( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getServiceHub(version,id,securityContext);
    }
    @GET
    @Path("/account/settings/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Settings", notes = "Get the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public Response getSettings( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSettings(version,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/shipment/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment", notes = "Get an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response getShipment( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipment(version,id,securityContext);
    }
    @GET
    @Path("/shipment/batch/{batchId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch", notes = "Get an existing shipment batch", response = ShipmentBatch.class, tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class) })
    public Response getShipmentBatch( @PathParam("version") BigDecimal version, @PathParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentBatch(version,batchId,securityContext);
    }
    @GET
    @Path("/shipment/batch/{batchId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipment Batch Status", notes = "Get the import status list of the import shipment batch", response = ShipmentImportStatus.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentImportStatus.class, responseContainer = "List") })
    public Response getShipmentBatchStatus( @PathParam("version") BigDecimal version, @PathParam("batchId") Long batchId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("valid") Boolean valid, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("hasShipment") Boolean hasShipment, @QueryParam("hasRoute") Boolean hasRoute, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentBatchStatus(version,batchId,accountId,sortField,descending,start,limit,valid,started,completed,hasShipment,hasRoute,keyword,securityContext);
    }
    @GET
    @Path("/route/{routeId}/stop/{stopId}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Shipments At Stop", notes = "Get the list of shipments on the requested route at a stop", response = Shipment.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response getShipmentsAtStop( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getShipmentsAtStop(version,routeId,stopId,securityContext);
    }
    @GET
    @Path("/vatom/b/spaces/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Space", notes = "Gets the details of a space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getSpace( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSpace(version,accountId,appKey,vatomSpaceId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/csvimport/batch/status/details")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detail Status", notes = "", response = SirqulResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getStatusCSV( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId, @NotNull, allowableValues="SUMMARY, DETAILS, ERRORS, ALL" @QueryParam("responseGroup") String responseGroup, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStatusCSV(version,accountId,batchId,responseGroup,start,limit,securityContext);
    }
    @GET
    @Path("/stop/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Stop", notes = "Get an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response getStop( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getStop(version,id,securityContext);
    }
    @GET
    @Path("/subscription/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription", notes = "Use the accountId to determine the associated BillableEntity.  Then get the subscription.", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response getSubscription( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscription(version,accountId,securityContext);
    }
    @GET
    @Path("/subscription/plan/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Plan", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class) })
    public Response getSubscriptionPlan( @PathParam("version") BigDecimal version, @NotNull @QueryParam("planId") Long planId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionPlan(version,planId,securityContext);
    }
    @GET
    @Path("/subscription/plan/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Subscription Plans", notes = "Get the matched subscription plan", response = SubscriptionPlanResponse.class, responseContainer = "List", tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionPlanResponse.class, responseContainer = "List") })
    public Response getSubscriptionPlans( @PathParam("version") BigDecimal version, @QueryParam("visible") Boolean visible, @QueryParam("role") String role,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionPlans(version,visible,role,securityContext);
    }
    @GET
    @Path("/subscription/usage/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Subscription Usage", notes = "Use the accountId to determine the associated BillableEntity.  Then get the application usage.", response = ApplicationUsageResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationUsageResponse.class) })
    public Response getSubscriptionUsage( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("start") Long start, @QueryParam("end") Long end,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSubscriptionUsage(version,accountId,applicationId,start,end,securityContext);
    }
    @GET
    @Path("/orson/ai/tts/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Text to Speach Result", notes = "Check the status of an in progress Text-to-Speech call or download the result.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public Response getTTS( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTTS(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/task/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Task", notes = "Get a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response getTask( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("taskId") Long taskId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTask(version,accountId,taskId,securityContext);
    }
    @GET
    @Path("/orson/ai/techTune/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get TechTune Results", notes = "Get a result or continue waiting for a pending request for TechTune analysis.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public Response getTechTune( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTechTune(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/territory/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Territory", notes = "Get a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response getTerritory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("territoryId") Long territoryId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTerritory(version,territoryId,securityContext);
    }
    @GET
    @Path("/consumer/theme/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Theme", notes = "Gets a theme.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public Response getThemeDescriptor( @PathParam("version") BigDecimal version, @NotNull @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getThemeDescriptor(version,themeDescriptorId,deviceId,accountId,gameType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/consumer/theme/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Themes", notes = "Searches for themes.", response = PurchaseItemListResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemListResponse.class) })
    public Response getThemeDescriptors( @PathParam("version") BigDecimal version, @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("contestType") String contestType, @QueryParam("ownerId") Long ownerId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("dateCreated") Long dateCreated, @QueryParam("appVersion") String appVersion, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getThemeDescriptors(version,filter,sortField,descending,start,limit,deviceId,accountId,gameType,contestType,ownerId,q,keyword,i,l,dateCreated,appVersion,latitude,longitude,securityContext);
    }
    @GET
    @Path("/ticket/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Count", notes = "Gets the ticket count.", response = CountResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response getTicketCount( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("ticketType") String ticketType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTicketCount(version,deviceId,accountId,gameType,appKey,ticketType,securityContext);
    }
    @GET
    @Path("/ticket/getList")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket List", notes = "Gets the list of tickets.", response = TicketListResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketListResponse.class) })
    public Response getTicketList( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ticketObjectType") String ticketObjectType, @QueryParam("actionType") String actionType, @QueryParam("ticketIds") String ticketIds, @QueryParam("objectIds") String objectIds, @QueryParam("receiptTokens") String receiptTokens, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTicketList(version,deviceId,accountId,ticketObjectType,actionType,ticketIds,objectIds,receiptTokens,gameType,appKey,securityContext);
    }
    @GET
    @Path("/facebook/getfbtoken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Facebook Token", notes = "Gets a user's Facebook token.", response = TokenResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TokenResponse.class) })
    public Response getToken( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getToken(version,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/orson/ai/topics/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Topics", notes = "Get the result of an in progress Topics Analysis from an earlier POST.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public Response getTopics( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTopics(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/tournament/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Tournament", notes = "Get a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response getTournament( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("missionId") Long missionId, @QueryParam("joinCode") String joinCode,, allowableValues="ALL, MINE" @QueryParam("includeScores") String includeScores, @DefaultValue("50") @QueryParam("objectPreviewSize") Integer objectPreviewSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTournament(version,accountId,missionId,joinCode,includeScores,objectPreviewSize,securityContext);
    }
    @GET
    @Path("/tracking/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking", notes = "Retrieve tracking data to be able to show where a user has been.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public Response getTrackingLegs( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ownerId") Long ownerId, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @DefaultValue("false") @QueryParam("getLastPoint") Boolean getLastPoint,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrackingLegs(version,deviceId,accountId,ownerId,trackingDeviceId,startDate,endDate,tags,getLastPoint,securityContext);
    }
    @GET
    @Path("/trigger/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trigger", notes = "Get a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response getTrigger( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("triggerId") Long triggerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrigger(version,accountId,triggerId,securityContext);
    }
    @GET
    @Path("/trip/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip", notes = "Get an existing trip", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response getTrip( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTrip(version,id,securityContext);
    }
    @GET
    @Path("/trip/{id}/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Trip Matches", notes = "Get matching trips of specific trip", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response getTripMatches( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTripMatches(version,id,sortField,descending,start,limit,activeOnly,matchedHasRoute,matchedHasDriver,securityContext);
    }
    @GET
    @Path("/application/users")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Application Users", notes = "Get a list of users per application", response = AccountListResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountListResponse.class) })
    public Response getUniqueUsersByApp( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("since") Long since, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUniqueUsersByApp(version,appKey,q,keyword,since,i,start,l,limit,securityContext);
    }
    @GET
    @Path("/achievement/progress/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Achievement Progress", notes = "Gets a list of user achievements.", response = AchievementProgressResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementProgressResponse.class, responseContainer = "List") })
    public Response getUserAchievements( @PathParam("version") BigDecimal version, @NotNull @DefaultValue("true") @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("appKey") String appKey, @NotNull @DefaultValue("true") @QueryParam("includeUndiscovered") Boolean includeUndiscovered, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountEmail") String connectionAccountEmail, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("rankType") String rankType, @QueryParam("achievementType") String achievementType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserAchievements(version,returnNulls,appKey,includeUndiscovered,deviceId,accountId,connectionAccountEmail,connectionAccountId,rankType,achievementType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/vatom/b/users/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get the coins for a user (as a Business)", notes = "Get the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserCoinsAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserCoinsAsBusiness(version,accountId,vatomUserId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/u/coins/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Gets the coins balance for a Vatom User", notes = "Gets the coins balance for a Vatom User.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserCoinsBalance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserCoinsBalance(version,accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/users/rels/followers")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user followers", notes = "Get user followers.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserFollowers( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserFollowers(version,accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/users/rels/following")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get user following", notes = "Get user following.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserFollowing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserFollowing(version,accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/user/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get User Info", notes = "Get a User's Info.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserInfo( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserInfo(version,accountId,vatomUserId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/me/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getUserProfile( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserProfile(version,accountId,returnRawResponse,securityContext);
    }
    @POST
    @Path("/ranking/personal/ranks")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Personal Rankings", notes = "Returns the user's ranks for one or more rank types and modes.", response = Object.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    public Response getUserRank( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @DefaultValue("false") @QueryParam("returnUserRank") Boolean returnUserRank, @DefaultValue("GLOBAL") @QueryParam("leaderboardMode") String leaderboardMode, @DefaultValue("TOTAL") @QueryParam("sortField") String sortField, @QueryParam("keyword") String keyword, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUserRank(version,deviceId,accountId,appKey,rankType,returnUserRank,leaderboardMode,sortField,keyword,descending,start,limit,securityContext);
    }
    @GET
    @Path("/vatom/b/events/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom Event", notes = "Gets the details of a event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getVatomEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVatomEvent(version,accountId,appKey,vatomEventId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/vatoms/get")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Vatom NFT Details", notes = "Get Vatom NFT Details", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response getVatomNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVatomNFT(version,accountId,vatomId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vehicle/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle", notes = "Get an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response getVehicle( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVehicle(version,id,securityContext);
    }
    @GET
    @Path("/vehicle/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Vehicle Type", notes = "Get a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response getVehicleType( @PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVehicleType(version,vehicleTypeId,securityContext);
    }
    @GET
    @Path("/orson/ai/voiceCanvas/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get VoiceCanvas images", notes = "Get a result or continue waiting for a pending request for VoiceCanvas Images.", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public Response getVoiceCanvas( @PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVoiceCanvas(version,requestId,accountId,securityContext);
    }
    @GET
    @Path("/game/word/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Word", notes = "Get a word by the given id.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response getWord( @PathParam("version") BigDecimal version, @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWord(version,wordId,accountId,securityContext);
    }
    @GET
    @Path("/game/word/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Words", notes = "Search for words by the given params.", response = WordzWordResponse.class, responseContainer = "List", tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class, responseContainer = "List") })
    public Response getWords( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWords(version,accountId,sortField,descending,activeOnly,start,limit,keyword,securityContext);
    }
    @GET
    @Path("/level/words/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Level Words", notes = "Get words within a level.", response = WordzWordResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response getWordsInLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getWordsInLevel(version,levelId,accountId,securityContext);
    }
    @POST
    @Path("/purchase/gift")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Gift Tickets", notes = "Gift tickets to another user.", response = SirqulResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response giftPurchase( @PathParam("version") BigDecimal version, @NotNull @QueryParam("receiverAccountId") Long receiverAccountId, @NotNull @QueryParam("ticketId") Long ticketId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetId") Long assetId, @QueryParam("customMessage") String customMessage, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.giftPurchase(version,receiverAccountId,ticketId,deviceId,accountId,assetId,customMessage,gameType,appKey,securityContext);
    }
    @POST
    @Path("/facebook/graph")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Post to Facebook", notes = "Make Facebook posts on behalf of the user.", response = SirqulResponse.class, tags={ "Facebook", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response graphInterface( @PathParam("version") BigDecimal version, @NotNull @QueryParam("event") String event, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("assetId") Long assetId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.graphInterface(version,event,deviceId,accountId,permissionableType,permissionableId,assetId,gameType,appKey,latitude,longitude,securityContext);
    }
    @GET
    @Path("/connection/group/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Connection Groups", notes = "Gets a user's private groups and default groups.", response = ConnectionInfoResponse.class, responseContainer = "List", tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionInfoResponse.class, responseContainer = "List") })
    public Response groupSearch( @PathParam("version") BigDecimal version, @NotNull, allowableValues="CREATED, UPDATED, ACTIVE, NAME, DESCRIPTION, CAN_VIEW_PROFILE_INFO, CAN_VIEW_GAME_INFO, CAN_VIEW_FRIEND_INFO, INVITE_CODE, OWNER_DISPLAY, OWNER_USERNAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.groupSearch(version,sortField,descending,activeOnly,start,limit,deviceId,accountId,latitude,longitude,keyword,securityContext);
    }
    @POST
    @Path("/openai/v1/images/generations")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate images with OpenAI", notes = "Generate images with OpenAI.", response = WrappedProxyItemResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WrappedProxyItemResponse.class) })
    public Response imageGeneration( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postBody") String postBody, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.imageGeneration(version,accountId,postBody,returnRawResponse,securityContext);
    }
    @POST
    @Path("/mission/import")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Import Mission", notes = "Create a mission using a source item such as an offer location.", response = SirqulResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response importMission( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("adSize") String adSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.importMission(version,accountId,latitude,longitude,appKey,keyword,start,limit,adSize,securityContext);
    }
    @GET
    @Path("/retailer/location/idistancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Distance Search Retailer Locations (Indexed)", notes = "Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response indexedRetailerLocationDistanceSearch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull @QueryParam("searchRange") Double searchRange, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("accountId") Long accountId, @QueryParam("address") String address, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression,, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnFavorited") Boolean returnFavorited, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.indexedRetailerLocationDistanceSearch(version,latitude,longitude,searchRange,start,limit,accountId,address,hasOffers,categories,filters,audiences,retailerIds,retailerLocationIds,tags,locationType,sortField,descending,q,keyword,keywordOperator,searchExpression,distanceUnit,returnFavorited,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,returnExternalCategoryData,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @GET
    @Path("/retailer/location/isearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Keyword Search Retailer Locations (Indexed)", notes = "Retailer location (faster) indexed search. This searches all retailer locations.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response indexedRetailerLocationSearch( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("hasOffers") Boolean hasOffers, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @QueryParam("audiences") String audiences, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("tags") String tags, @QueryParam("locationType") String locationType, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("keywordOperator") String keywordOperator, @QueryParam("searchExpression") String searchExpression, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("returnExternalCategoryData") Boolean returnExternalCategoryData, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.indexedRetailerLocationSearch(version,accountId,start,limit,hasOffers,categories,filters,audiences,retailerIds,retailerLocationIds,tags,locationType,sortField,descending,q,keyword,keywordOperator,searchExpression,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,returnExternalCategoryData,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @POST
    @Path("/album/user/leave")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Leave Album", notes = " Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response leaveAlbum( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.leaveAlbum(version,albumId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/consumer/permissions/leave")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Leave", notes = "Used when the user wants to leave from someone else's permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response leaveFromPermissionable( @PathParam("version") BigDecimal version, @NotNull @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.leaveFromPermissionable(version,permissionableType,permissionableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @GET
    @Path("/achievement/tag/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievement Tags", notes = "List achievement tags by application", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response listAchievementTags( @PathParam("version") BigDecimal version, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAchievementTags(version,appKey,securityContext);
    }
    @GET
    @Path("/achievement/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Achievements", notes = "List achievements by billable.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public Response listAchievements( @PathParam("version") BigDecimal version, @NotNull, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAchievements(version,sortField,descending,start,limit,activeOnly,deviceId,accountId,appKey,keyword,achievementType,rankType,securityContext);
    }
    @GET
    @Path("/application/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Applications", notes = "List active applications matching the criteria (as a consumer)", response = ApplicationShortResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationShortResponse.class, responseContainer = "List") })
    public Response listApplications( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("platforms") String platforms, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("categoryIds") String categoryIds,, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION" @DefaultValue("UPDATED") @QueryParam("sortField") String sortField, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("filterBillable") Boolean filterBillable, @QueryParam("filterContentAdmin") Boolean filterContentAdmin, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("applicationIds") String applicationIds, @DefaultValue("false") @QueryParam("hasObjectStore") Boolean hasObjectStore, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listApplications(version,accountId,q,keyword,platforms,deviceIds,deviceVersions,categoryIds,sortField,hasAds,publicNotifications,filterBillable,filterContentAdmin,descending,i,start,l,limit,applicationIds,hasObjectStore,activeOnly,securityContext);
    }
    @POST
    @Path("/audience/suggestion/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Suggestions by Audience", notes = "List either Missions or Offers that the user matches the assigned audience.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listByAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("suggestionType") String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listByAccount(version,accountId,limit,suggestionType,securityContext);
    }
    @GET
    @Path("/audience/suggestion/offersByAudience")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Offers by Audience", notes = "Get a list of offer locations based on audience information provided.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listByAudience( @PathParam("version") BigDecimal version, @NotNull @QueryParam("limit") Integer limit, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listByAudience(version,limit,gender,age,categoryIds,latitude,longitude,securityContext);
    }
    @GET
    @Path("/vatom/b/communities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Communities", notes = "Gets the communities tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listCommunities( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listCommunities(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/events/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Events", notes = "Gets the events tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listEvents( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listEvents(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/audience/suggestion/latest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Sent Suggestions ", notes = "Return list of recent trigger suggestions that have been sent to the user.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listLastestByAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("timeframe") Integer timeframe, @NotNull @QueryParam("suggestionType") String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listLastestByAccount(version,accountId,timeframe,suggestionType,securityContext);
    }
    @GET
    @Path("/vatom/b/spaces/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Vatom Spaces", notes = "Gets the spaces tied to a business.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listSpaces( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listSpaces(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/csvimport/batch/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Status", notes = "Retrieves batches for a user.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response listStatusCSV( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listStatusCSV(version,accountId,start,limit,securityContext);
    }
    @GET
    @Path("/vatom/u/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List Coin Transactions for a Vatom User", notes = "Gets the logged in user's Vatom coin transactions.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listUserCoinTransactions( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listUserCoinTransactions(version,accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/users/coins/txns/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "List coin transactions for a user (as a Business)", notes = "List coin transactions for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response listUserCoinTransactionsAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listUserCoinTransactionsAsBusiness(version,accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/account/login/delegate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login as Account", notes = "A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginDelegate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accessToken") String accessToken, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accessTokenSecret") String accessTokenSecret, @QueryParam("delegatedAccountId") Long delegatedAccountId, @QueryParam("delegatedUsername") String delegatedUsername, @DefaultValue("USERNAME") @QueryParam("networkUID") String networkUID, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginDelegate(version,accessToken,appKey,deviceId,accessTokenSecret,delegatedAccountId,delegatedUsername,networkUID,ageRestriction,responseFilters,latitude,longitude,securityContext);
    }
    @POST
    @Path("/account/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account", notes = "General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginGeneral( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accessToken") String accessToken, @NotNull @DefaultValue("USERNAME") @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accessTokenSecret") String accessTokenSecret, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("emailMatch") Boolean emailMatch, @DefaultValue("0") @QueryParam("chosenAccountId") Long chosenAccountId, @DefaultValue("0") @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginGeneral(version,accessToken,networkUID,appKey,deviceId,deviceIdType,accessTokenSecret,ageRestriction,responseFilters,latitude,longitude,emailMatch,chosenAccountId,thirdPartyCredentialId,securityContext);
    }
    @POST
    @Path("/secure/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Clear", notes = "Login via Clear.me. Creates a new account if logging in for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginSecure( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("biometricFile") File biometricFile, @QueryParam("deviceId") String deviceId, @QueryParam("biometricFile2") File biometricFile2, @DefaultValue("0") @QueryParam("ageRestriction") Integer ageRestriction, @DefaultValue("false") @QueryParam("returnProfile") Boolean returnProfile, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginSecure(version,appKey,biometricFile,deviceId,biometricFile2,ageRestriction,returnProfile,responseFilters,latitude,longitude,securityContext);
    }
    @POST
    @Path("/twitter/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Twitter", notes = "Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in.", response = ProfileResponse.class, tags={ "Twitter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginTwitter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accessToken") String accessToken, @NotNull @QueryParam("accessTokenSecret") String accessTokenSecret, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("responseFilters") String responseFilters, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginTwitter(version,accessToken,accessTokenSecret,appKey,responseFilters,deviceId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/account/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Username)", notes = "Login to system with an account", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response loginUsername( @PathParam("version") BigDecimal version, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("returnProfile") Boolean returnProfile, @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.loginUsername(version,username,password,deviceId,latitude,longitude,app,gameType,appKey,returnProfile,responseFilters,securityContext);
    }
    @POST
    @Path("/account/logout")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Logout Account", notes = "Cleans up the users data for logging out.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response logout( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.logout(version,deviceId,deviceIdType,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/account/merge")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Merge Account", notes = "Merges the analytics, achievements, leaderboards of two accounts.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response mergeAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("mergeAccountId") Long mergeAccountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.mergeAccount(version,mergeAccountId,appKey,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/invite/mission")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Mission", notes = "Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response missionInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appId") Long appId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.missionInvite(version,deviceId,accountId,appId,appKey,missionId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/invite/offer")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer", notes = "Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response offerInvite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("offerId") Long offerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.offerInvite(version,accountId,appKey,offerId,securityContext);
    }
    @POST
    @Path("/invite/offerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Offer Location", notes = "Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response offerLocationInvite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.offerLocationInvite(version,accountId,appKey,offerLocationId,securityContext);
    }
    @POST
    @Path("/route/{routeId}/optimize")
    
    
    @io.swagger.annotations.ApiOperation(value = "Optimize Route", notes = "Optimize a route. The optimization method based on how the server is configured.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response optimizeRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.optimizeRoute(version,routeId,securityContext);
    }
    @POST
    @Path("/ranking/override")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Override User Rank", notes = "Allows an admin of an application to override a user's scores for a leaderboard.", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response overrideUserRank( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("ownerAccountId") Long ownerAccountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @QueryParam("totalScore") Long totalScore, @QueryParam("totalCount") Long totalCount, @QueryParam("totalTime") Long totalTime, @QueryParam("dailyScore") Long dailyScore, @QueryParam("dailyCount") Long dailyCount, @QueryParam("dailyTime") Long dailyTime, @QueryParam("weeklyScore") Long weeklyScore, @QueryParam("weeklyCount") Long weeklyCount, @QueryParam("weeklyTime") Long weeklyTime, @QueryParam("monthlyScore") Long monthlyScore, @QueryParam("monthlyCount") Long monthlyCount, @QueryParam("monthlyTime") Long monthlyTime, @QueryParam("topScore") Long topScore, @QueryParam("lowestScore") Long lowestScore, @QueryParam("streakCount") Long streakCount, @QueryParam("streakBestCount") Long streakBestCount, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.overrideUserRank(version,accountId,ownerAccountId,appKey,rankType,totalScore,totalCount,totalTime,dailyScore,dailyCount,dailyTime,weeklyScore,weeklyCount,weeklyTime,monthlyScore,monthlyCount,monthlyTime,topScore,lowestScore,streakCount,streakBestCount,startDate,endDate,securityContext);
    }
    @POST
    @Path("/account/passwordchange")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Password", notes = "Update the account password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response passwordChange( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("oldPassword") String oldPassword, @NotNull @QueryParam("newPassword") String newPassword, @NotNull @QueryParam("confirmPassword") String confirmPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.passwordChange(version,accountId,oldPassword,newPassword,confirmPassword,securityContext);
    }
    @POST
    @Path("/account/passwordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reset Password", notes = "Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response passwordReset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("token") String token, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("confirm") String confirm,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.passwordReset(version,token,password,confirm,securityContext);
    }
    @POST
    @Path("/vatom/me/vatoms/actions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Perform Action on NFT", notes = "Perform Action on NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response performActionOnNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomId") String vatomId, @NotNull @QueryParam("vatomAction") String vatomAction, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.performActionOnNFT(version,accountId,vatomId,vatomAction,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/app/post")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create App Data", notes = "Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application", response = AppResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AppResponse.class) })
    public Response postAppData( @PathParam("version") BigDecimal version, @NotNull @QueryParam("gameType") String gameType, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("gameObjectCount") Boolean gameObjectCount, @QueryParam("filter") String filter, @QueryParam("dateCreated") Long dateCreated, @QueryParam("ownerId") Long ownerId, @QueryParam("missionIds") String missionIds, @QueryParam("gameIds") String gameIds, @QueryParam("packIds") String packIds, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("appVersion") String appVersion, @QueryParam("includeHigherVersionPacks") Boolean includeHigherVersionPacks, @QueryParam("includeHigherVersionLevels") Boolean includeHigherVersionLevels, @QueryParam("responseGroups") String responseGroups, @QueryParam("purchaseType") String purchaseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAppData(version,gameType,start,limit,data,deviceId,accountId,includeGameData,q,keyword,sortField,descending,i,l,gameObjectCount,filter,dateCreated,ownerId,missionIds,gameIds,packIds,gameLevelIds,appVersion,includeHigherVersionPacks,includeHigherVersionLevels,responseGroups,purchaseType,securityContext);
    }
    @POST
    @Path("/program/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response postProgram( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postProgram(version,id,body,securityContext);
    }
    @POST
    @Path("/hub/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response postServiceHub( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postServiceHub(version,id,body,securityContext);
    }
    @POST
    @Path("/wallet/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Wallet Offers", notes = "Preview the final cost of a transaction without charging the user", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response previewOfferTransaction( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerCart") String offerCart, @QueryParam("promoCode") String promoCode, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("metaData") String metaData, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.previewOfferTransaction(version,deviceId,accountId,offerId,offerLocationId,offerCart,promoCode,currencyType,usePoints,metaData,appKey,securityContext);
    }
    @POST
    @Path("/order/preview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Preview Order", notes = "Previews a purchase to see the total cost before making it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response previewOrder( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalOrderId") String externalOrderId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("remoteRefType") String remoteRefType, @QueryParam("externalDate") Long externalDate, @QueryParam("promoCode") String promoCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.previewOrder(version,appKey,cart,deviceId,accountId,description,currencyType,paymentMethodId,externalOrderId,externalPaymentId,remoteRefType,externalDate,promoCode,securityContext);
    }
    @POST
    @Path("/participant/process/all")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process All Participant Feeds", notes = "Processes all supported participant feeds.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response processAllParticipants( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processAllParticipants(version,accountId,appKey,useShortNameAsID,securityContext);
    }
    @POST
    @Path("/participant/process")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Participants Feed", notes = "Processes a participant feed or uploaded file for a specific league.", response = SirqulResponse.class, tags={ "Participants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response processParticipants( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("league") String league, @QueryParam("appKey") String appKey, @QueryParam("useShortNameAsID") Boolean useShortNameAsID, @QueryParam("file") File _file,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processParticipants(version,accountId,league,appKey,useShortNameAsID,_file,securityContext);
    }
    @POST
    @Path("/trip/match/process")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Process Trip Matches", notes = "Process trip matching, assign trips with no route to matched trips with route.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response processTripMatches( @PathParam("version") BigDecimal version, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tripId") Long tripId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.processTripMatches(version,startDate,endDate,tripId,securityContext);
    }
    @POST
    @Path("/secure/purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Purchase Clear", notes = "Purchase via Clear.me. Creates a new account if purchasing for the first time.", response = ProfileResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response purchaseSecure( @PathParam("version") BigDecimal version,@ApiParam(value = "The payment request object" ,required=true) @NotNull @Valid PaymentRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.purchaseSecure(version,body,securityContext);
    }
    @PUT
    @Path("/program/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Program", notes = "Update an existing program", response = Program.class, tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class) })
    public Response putProgram( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Program body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putProgram(version,id,body,securityContext);
    }
    @PUT
    @Path("/hub/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Service Hub", notes = "Update an existing service hub", response = ServiceHub.class, tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class) })
    public Response putServiceHub( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid ServiceHub body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.putServiceHub(version,id,body,securityContext);
    }
    @POST
    @Path("/queue/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Queue", notes = "Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueCreate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("name") String name, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("1") @QueryParam("workers") Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueCreate(version,appKey,name,deviceId,accountId,workers,analyticTags,hostname,port,username,password,virtualHost,useSSL,securityContext);
    }
    @POST
    @Path("/queue/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Queue", notes = "Delete the stored queue record and close any active connections to the AMQP servers.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response queueDelete( @PathParam("version") BigDecimal version, @NotNull @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueDelete(version,queueId,deviceId,accountId,securityContext);
    }
    @GET
    @Path("/queue/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Queue", notes = "Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueGet( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueGet(version,deviceId,accountId,queueId,appKey,name,hostname,virtualHost,securityContext);
    }
    @POST
    @Path("/queue/publish")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Publish Queue", notes = "Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record.", response = SirqulResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response queuePublish( @PathParam("version") BigDecimal version, @NotNull @QueryParam("message") String message, @QueryParam("queueId") Long queueId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("hostname") String hostname, @QueryParam("virtualHost") String virtualHost,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queuePublish(version,message,queueId,appKey,name,hostname,virtualHost,securityContext);
    }
    @GET
    @Path("/queue/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Queue", notes = "Get the queues setup for the BillableEntity's applications.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueSearch( @PathParam("version") BigDecimal version, @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("10") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueSearch(version,queueId,deviceId,accountId,name,start,limit,securityContext);
    }
    @POST
    @Path("/queue/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Queue", notes = "Update the basic AMQP queue.", response = QueueResponse.class, tags={ "AMQP", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QueueResponse.class) })
    public Response queueUpdate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("queueId") Long queueId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("workers") Integer workers, @QueryParam("analyticTags") String analyticTags, @QueryParam("hostname") String hostname, @QueryParam("port") Integer port, @QueryParam("username") String username, @QueryParam("password") String password, @QueryParam("virtualHost") String virtualHost, @QueryParam("useSSL") Boolean useSSL,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.queueUpdate(version,queueId,deviceId,accountId,appKey,workers,analyticTags,hostname,port,username,password,virtualHost,useSSL,securityContext);
    }
    @POST
    @Path("/vatom/b/redemptions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem NFT", notes = "Redeem an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response redeemNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemNFT(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/retailer/offer/transaction/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Transaction", notes = "Redeems an offer.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response redeemOfferTransaction( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerTransactionId") Long offerTransactionId, @NotNull @QueryParam("status") Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemOfferTransaction(version,offerTransactionId,status,deviceId,accountId,offerLocationId,securityContext);
    }
    @POST
    @Path("/vatom/b/users/coins/redeem")
    
    
    @io.swagger.annotations.ApiOperation(value = "Redeem the coins for a user (as a Business)", notes = "Redeem the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response redeemUserCoinsAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.redeemUserCoinsAsBusiness(version,accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/app/regen")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Regenerate App Data", notes = "Regenerate the app data cache for apps", response = SirqulResponse.class, tags={ "AppData", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response regenAppData( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("buildVersion") String buildVersion, @QueryParam("apiVersion") String apiVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.regenAppData(version,accountId,appKey,buildVersion,apiVersion,securityContext);
    }
    @POST
    @Path("/like")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Like", notes = "Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one.", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public Response registerLike( @PathParam("version") BigDecimal version, @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("like") Boolean like, @QueryParam("app") String app, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.registerLike(version,likableType,likableId,deviceId,accountId,permissionableType,permissionableId,like,app,gameType,appKey,latitude,longitude,securityContext);
    }
    @POST
    @Path("/notification/token")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Register Notification Token", notes = "Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response registerNotificationToken( @PathParam("version") BigDecimal version, @NotNull @QueryParam("token") String token, @NotNull, allowableValues="APNS, GCM, BAIDU, XGPUSH, JPUSH" @QueryParam("pushType") String pushType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("environment") String environment, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("active") Boolean active, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.registerNotificationToken(version,token,pushType,deviceId,accountId,environment,appKey,gameType,active,latitude,longitude,securityContext);
    }
    @POST
    @Path("/album/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Album", notes = "Deletes an Album", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAlbum( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAlbum(version,albumId,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/album/user/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Album Users", notes = "Remove participants of an album.", response = SirqulResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAlbumUsers( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @NotNull @QueryParam("removeFriendGroup") Boolean removeFriendGroup, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connections") String connections, @QueryParam("connectionGroups") String connectionGroups,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAlbumUsers(version,albumId,removeFriendGroup,deviceId,accountId,connections,connectionGroups,securityContext);
    }
    @POST
    @Path("/asset/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Asset from Collection", notes = "Remove assets from collections", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeAsset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("assetId") String assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("collectionId") Long collectionId, @QueryParam("removeFromDefaultAlbums") Boolean removeFromDefaultAlbums, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeAsset(version,assetId,deviceId,accountId,albumId,collectionId,removeFromDefaultAlbums,latitude,longitude,securityContext);
    }
    @POST
    @Path("/consumer/connection/group/removeConnection")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection", notes = "Removes the connection from group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeConnectionFromGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionId") Long connectionId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("pendingId") Long pendingId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeConnectionFromGroup(version,returnNulls,groupId,deviceId,accountId,connectionId,connectionAccountId,pendingId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/connection/group/removeConnections")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connections", notes = "Remove a list of connections from a group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeConnectionsFromGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("connectionGroupId") Long connectionGroupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeConnectionsFromGroup(version,connectionGroupId,deviceId,accountId,connectionIds,connectionAccountIds,latitude,longitude,securityContext);
    }
    @DELETE
    @Path("/cargo/dependent/{accountId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Dependent", notes = "Delete the Dependent", response = Void.class, tags={ "Dependent", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response removeDependent( @PathParam("version") BigDecimal version, @PathParam("accountId") Long accountId, @PathParam("dependentId") Long dependentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeDependent(version,accountId,dependentId,securityContext);
    }
    @POST
    @Path("/consumer/connection/group/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Connection Group", notes = "Remove a user's group.", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeGroup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeGroup(version,returnNulls,groupId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/like/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Like", notes = "Removes a like. This will make the user \"neutral\".", response = LikableResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LikableResponse.class) })
    public Response removeLike( @PathParam("version") BigDecimal version, @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeLike(version,likableType,likableId,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/creative/removepreview")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Preview", notes = "Remove this ad for preview for this account.", response = SirqulResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removePreview( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removePreview(version,accountId,creativeId,securityContext);
    }
    @DELETE
    @Path("/route/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Delete Stop", notes = "Delete a stop on a route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response removeStop( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeStop(version,routeId,stopId,securityContext);
    }
    @POST
    @Path("/consumer/connection/group/removeSubGroup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove Connection Groups", notes = "Remove sub groups from a group", response = SirqulResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeSubGroups( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("groupId") Long groupId, @NotNull @QueryParam("subGroupIds") String subGroupIds, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeSubGroups(version,returnNulls,groupId,subGroupIds,deviceId,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/consumer/theme/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Theme", notes = "Removes a theme.", response = SirqulResponse.class, tags={ "Theme Descriptor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeThemeDescriptor( @PathParam("version") BigDecimal version, @NotNull @QueryParam("themeDescriptorId") Long themeDescriptorId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeThemeDescriptor(version,themeDescriptorId,deviceId,accountId,gameType,latitude,longitude,securityContext);
    }
    @POST
    @Path("/consumer/permissions/remove")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Remove User", notes = "Used to remove someone (assuming they have permission) from a permissionable object", response = SirqulResponse.class, tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response removeUsersFromPermissionable( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @NotNull @QueryParam("permissionableId") Long permissionableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @DefaultValue("false") @QueryParam("removeFriendGroup") Boolean removeFriendGroup, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("audienceIds") String audienceIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.removeUsersFromPermissionable(version,permissionableType,permissionableId,deviceId,accountId,connectionIds,connectionAccountIds,connectionGroupIds,removeFriendGroup,latitude,longitude,audienceIds,securityContext);
    }
    @PATCH
    @Path("/route/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response reorderRouteStopsPatch( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reorderRouteStopsPatch(version,routeId,body,securityContext);
    }
    @POST
    @Path("/route/{routeId}/stops/reorder")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Reorder Route Stops", notes = "Reordering the stops on the route with and update route distance, time, direction, and polyline", response = Stop.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class, responseContainer = "List") })
    public Response reorderRouteStopsPost( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid List<@Valid Stop> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reorderRouteStopsPost(version,routeId,body,securityContext);
    }
    @POST
    @Path("/optimize/request")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Optimization", notes = "Request and upload of shipment orders and create ShipmentImportBatch for optimization.", response = ImportStatuses.class, tags={ "Optimize", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ImportStatuses.class) })
    public Response requestOptimization( @PathParam("version") BigDecimal version,@ApiParam(value = "" ) @Valid Orders body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestOptimization(version,body,securityContext);
    }
    @POST
    @Path("/account/requestpasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Request Password Reset", notes = "Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response requestPasswordReset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("email") String email, @DefaultValue("Sirqul") @QueryParam("from") String from, @QueryParam("domain") String domain, @QueryParam("subUrl") String subUrl, @DefaultValue("http://dev.sirqul.com/resetpassword") @QueryParam("referer") String referer,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestPasswordReset(version,email,from,domain,subUrl,referer,securityContext);
    }
    @POST
    @Path("/account/requestValidateAccount")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Validation Request", notes = "Send an email to validate a user's account.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response requestValidateAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.requestValidateAccount(version,accountId,securityContext);
    }
    @POST
    @Path("/reservable/availability/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public Response reservableAvailability( @PathParam("version") BigDecimal version, @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.reservableAvailability(version,reservableId,reservableType,deviceId,accountId,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/secure/application/reset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Rest Secure Application", notes = "Reset a secure application client.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response resetSecure( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.resetSecure(version,accountId,appKey,securityContext);
    }
    @POST
    @Path("/invite/retailerLocation")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Invite to Retailer Location", notes = "Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite's list.", response = InviteResponse.class, tags={ "Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = InviteResponse.class) })
    public Response retailerLocationInvite( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("albumId") Long albumId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retailerLocationInvite(version,accountId,appKey,retailerLocationId,albumId,securityContext);
    }
    @POST
    @Path("/retailer/login")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Retailer", notes = "Retailer login check.", response = AccountLoginResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response retailerLoginCheck( @PathParam("version") BigDecimal version, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("deviceId") String deviceId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retailerLoginCheck(version,username,password,deviceId,latitude,longitude,appKey,securityContext);
    }
    @POST
    @Path("/trip/{id}/ride")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Set Trip Preference Rider", notes = "Update trip preference to ride.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response ride( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @NotNull @QueryParam("recurrence") Boolean recurrence,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.ride(version,id,recurrence,securityContext);
    }
    @POST
    @Path("/report/run")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Report", notes = " This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application.", response = ReportResponse.class, tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportResponse.class) })
    public Response runReport( @PathParam("version") BigDecimal version, @NotNull @QueryParam("desc") Boolean desc, @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("parameters") String parameters, @QueryParam("order") String order, @QueryParam("start") Long start, @QueryParam("limit") Long limit,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.runReport(version,desc,accountId,query,parameters,order,start,limit,responseFormat,securityContext);
    }
    @POST
    @Path("/workflow/run")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Run Workflow", notes = "Runs a published executable workflow", response = SirqulResponse.class, tags={ "Workflow", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response runWorkflow( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("workflowId") Long workflowId, @QueryParam("skuId") Long skuId, @QueryParam("versionCode") Integer versionCode, @QueryParam("parameters") String parameters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.runWorkflow(version,accountId,workflowId,skuId,versionCode,parameters,securityContext);
    }
    @POST
    @Path("/ticket/save")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket", notes = "Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response saveTicket( @PathParam("version") BigDecimal version, @NotNull @QueryParam("actionType") String actionType, @NotNull @QueryParam("ticketObjectType") String ticketObjectType, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("receiptData") String receiptData, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTicket(version,actionType,ticketObjectType,returnNulls,deviceId,accountId,gameType,appKey,objectId,purchaseCode,receiptToken,receiptData,count,ticketType,purchaseProvider,purchaseType,returnProfileResponse,includeProfileResponse,appVersion,securityContext);
    }
    @POST
    @Path("/ticket/save/fileUpload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Ticket with Reciept", notes = "Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post", response = ProfileResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response saveTicketViaFileUpload( @PathParam("version") BigDecimal version, @NotNull @QueryParam("actionType") String actionType, @NotNull @QueryParam("ticketObjectType") String ticketObjectType, @NotNull @QueryParam("receiptData") File receiptData, @QueryParam("returnNulls") Boolean returnNulls, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("objectId") Long objectId, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("receiptToken") String receiptToken, @QueryParam("count") Long count, @QueryParam("ticketType") String ticketType, @QueryParam("purchaseProvider") String purchaseProvider, @QueryParam("purchaseType") String purchaseType, @QueryParam("returnProfileResponse") Boolean returnProfileResponse, @QueryParam("includeProfileResponse") Boolean includeProfileResponse, @QueryParam("appVersion") String appVersion,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTicketViaFileUpload(version,actionType,ticketObjectType,receiptData,returnNulls,deviceId,accountId,gameType,appKey,objectId,purchaseCode,receiptToken,count,ticketType,purchaseProvider,purchaseType,returnProfileResponse,includeProfileResponse,appVersion,securityContext);
    }
    @POST
    @Path("/tracking/leg/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Leg", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response saveTrackingLeg( @PathParam("version") BigDecimal version, @NotNull @QueryParam("startLat") Double startLat, @NotNull @QueryParam("startLng") Double startLng, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endLat") Double endLat, @NotNull @QueryParam("endLng") Double endLng, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration, @QueryParam("steps") String steps, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTrackingLeg(version,startLat,startLng,startDate,endLat,endLng,endDate,deviceId,accountId,distance,duration,steps,tags,securityContext);
    }
    @POST
    @Path("/tracking/step/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Tracking Step", notes = "Send tracking points to be able to generate pathing data", response = SirqulResponse.class, tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response saveTrackingStep( @PathParam("version") BigDecimal version, @NotNull @QueryParam("legId") Long legId, @NotNull @QueryParam("startLat") Double startLat, @NotNull @QueryParam("startLng") Double startLng, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endLat") Double endLat, @NotNull @QueryParam("endLng") Double endLng, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("distance") Double distance, @QueryParam("duration") Long duration,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.saveTrackingStep(version,legId,startLat,startLng,startDate,endLat,endLng,endDate,deviceId,accountId,distance,duration,securityContext);
    }
    @POST
    @Path("/notification/schedule/generate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Generate Schedule Notifications", notes = "Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users.", response = SirqulResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response scheduleNotificationListings( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("reportName") String reportName, @NotNull @QueryParam("message") String message, @NotNull @QueryParam("offset") Integer offset, @NotNull @QueryParam("recipientReportId") Long recipientReportId, @QueryParam("reportParams") String reportParams, @QueryParam("type") String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.scheduleNotificationListings(version,accountId,appKey,reportName,message,offset,recipientReportId,reportParams,type,securityContext);
    }
    @GET
    @Path("/trip")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response search( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("hasNotifications") Boolean hasNotifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.search(version,accountId,sortField,descending,start,limit,activeOnly,startDate,endDate,hasNotifications,securityContext);
    }
    @GET
    @Path("/account/profile/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Accounts", notes = "Search for account profiles.", response = ProfileResponse.class, responseContainer = "List", tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class, responseContainer = "List") })
    public Response searchAccounts( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("radius") Double radius,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender,, allowableValues="ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT" @QueryParam("gameExperience") String gameExperience, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @DefaultValue("true") @QueryParam("returnNulls") Boolean returnNulls, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters, @DefaultValue("SIRQUL") @QueryParam("purchaseType") String purchaseType, @DefaultValue("id") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAccounts(version,accountId,appKey,keyword,latitude,longitude,radius,gender,gameExperience,age,categoryIds,returnNulls,responseFilters,purchaseType,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/tracking/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Tracking", notes = "Search for all accounts that have tracking legs data by the given constraints.", response = AccountMiniResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountMiniResponse.class, responseContainer = "List") })
    public Response searchAccountsWithTrackingLegs( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("audienceIds") String audienceIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("5") @QueryParam("range") Double range, @DefaultValue("LEG_START_DATE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAccountsWithTrackingLegs(version,accountId,keyword,startDate,endDate,tags,audienceIds,latitude,longitude,range,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/achievement/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Achievements", notes = "Searches achievements by application for consumers.", response = AchievementShortResponse.class, responseContainer = "List", tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementShortResponse.class, responseContainer = "List") })
    public Response searchAchievements( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, TITLE, DESCRIPTION, RANK_TYPE, APPLICATION_ID, APPLICATION_NAME, BILLABLE_ID" @DefaultValue("TITLE") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("false") @QueryParam("includeTiers") Boolean includeTiers, @NotNull @DefaultValue("false") @QueryParam("includeInactiveTiers") Boolean includeInactiveTiers, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("achievementType") String achievementType, @QueryParam("rankType") String rankType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAchievements(version,appKey,sortField,descending,includeTiers,includeInactiveTiers,start,limit,deviceId,accountId,keyword,achievementType,rankType,securityContext);
    }
    @GET
    @Path("/album/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Albums", notes = "Searches on Albums.", response = AlbumFullResponse.class, responseContainer = "List", tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumFullResponse.class, responseContainer = "List") })
    public Response searchAlbums( @PathParam("version") BigDecimal version, @NotNull @QueryParam("filter") String filter, @NotNull @QueryParam("albumTypeId") Long albumTypeId, @NotNull @QueryParam("subType") String subType, @NotNull @QueryParam("includeInactive") Boolean includeInactive, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("range") Double range, @NotNull @QueryParam("includeLiked") Boolean includeLiked, @NotNull @QueryParam("includeFavorited") Boolean includeFavorited, @NotNull @QueryParam("includePermissions") Boolean includePermissions, @NotNull @QueryParam("likePreviewSize") Integer likePreviewSize, @NotNull @QueryParam("assetPreviewSize") Integer assetPreviewSize, @NotNull @QueryParam("notePreviewSize") Integer notePreviewSize, @NotNull @QueryParam("connectionPreviewSize") Integer connectionPreviewSize, @NotNull @QueryParam("audiencePreviewSize") Integer audiencePreviewSize, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("ownerId") Long ownerId, @QueryParam("albumIds") String albumIds, @QueryParam("excludeAlbumIds") String excludeAlbumIds, @QueryParam("mediaId") Long mediaId, @QueryParam("keyword") String keyword, @QueryParam("albumType") String albumType, @QueryParam("limitPerAlbumType") Integer limitPerAlbumType, @QueryParam("dateCreated") Long dateCreated, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("createdSince") Long createdSince, @QueryParam("createdBefore") Long createdBefore, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("appKey") String appKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("excludeAudienceIds") String excludeAudienceIds, @QueryParam("includeCompletable") Boolean includeCompletable, @QueryParam("includeRating") Boolean includeRating, @QueryParam("searchMode") String searchMode, @QueryParam("stackSearch") Boolean stackSearch, @QueryParam("stackWindowSize") Integer stackWindowSize, @QueryParam("minStackPerPage") Integer minStackPerPage, @QueryParam("stackPaginationIdentifier") String stackPaginationIdentifier, @QueryParam("stackDetails") Boolean stackDetails, @QueryParam("flagCountMinimum") Long flagCountMinimum, @DefaultValue("true") @QueryParam("removeFlaggedContent") Boolean removeFlaggedContent, @QueryParam("verifiedFilter") Boolean verifiedFilter, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("orderAudienceId") Long orderAudienceId, @QueryParam("ignoreDefaultAppFilter") Boolean ignoreDefaultAppFilter, @QueryParam("searchExpression") String searchExpression, @QueryParam("generateAlbums") Boolean generateAlbums,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAlbums(version,filter,albumTypeId,subType,includeInactive,sortField,descending,start,limit,range,includeLiked,includeFavorited,includePermissions,likePreviewSize,assetPreviewSize,notePreviewSize,connectionPreviewSize,audiencePreviewSize,deviceId,accountId,connectionAccountId,ownerId,albumIds,excludeAlbumIds,mediaId,keyword,albumType,limitPerAlbumType,dateCreated,updatedSince,updatedBefore,createdSince,createdBefore,startedSince,startedBefore,endedSince,endedBefore,latitude,longitude,appKey,categoryIds,categoryFilterIds,audienceIds,excludeAudienceIds,includeCompletable,includeRating,searchMode,stackSearch,stackWindowSize,minStackPerPage,stackPaginationIdentifier,stackDetails,flagCountMinimum,removeFlaggedContent,verifiedFilter,linkedObjectType,linkedObjectId,orderAudienceId,ignoreDefaultAppFilter,searchExpression,generateAlbums,securityContext);
    }
    @GET
    @Path("/appconfig/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search AppConfigs", notes = "Gets all versions of application configurations in a particular app by the given appKey.", response = ApplicationConfigResponse.class, responseContainer = "List", tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class, responseContainer = "List") })
    public Response searchApplicationConfig( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @QueryParam("configVersion") String configVersion, @DefaultValue("CONFIG_VERSION_INDEX") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationConfig(version,accountId,appKey,retailerId,retailerLocationId,udid,configVersion,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/application/placement/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Ad Placements", notes = "Searches placements for an application.", response = PlacementResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class, responseContainer = "List") })
    public Response searchApplicationPlacement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationPlacement(version,appKey,deviceId,accountId,start,limit,securityContext);
    }
    @GET
    @Path("/application/settings/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Application Settings", notes = "Returns a list of applications that the user has logged into before, and returns specific settings for that application and user", response = ApplicationSettingsResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationSettingsResponse.class) })
    public Response searchApplicationSettings( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("keyword") String keyword, @DefaultValue("APPLICATION_TITLE") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplicationSettings(version,deviceId,accountId,connectionAccountId,keyword,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/application/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Applications", notes = "Search for applications matching the criteria that the logged in user has access to", response = ApplicationResponse.class, responseContainer = "List", tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class, responseContainer = "List") })
    public Response searchApplications( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @DefaultValue("NAME,ABOUT,BILLABLE_ENTITY_NAME") @QueryParam("qSearchFields") String qSearchFields,, allowableValues="CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, HAS_ADVERTISEMENTS, PUBLIC_NOTIFICATIONS, PLACEMENTS, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, TITLE, NAME, ABOUT, DESCRIPTION, APPLICATION_ID, APP_TYPE, GAME_TYPE, BUNDLE_ID, SCORING_TYPE, LANDING_PAGE_URL, EULA_VERSION, BUILD_VERSION, API_VERSION" @DefaultValue("APPLICATION_ID") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("hasAds") Boolean hasAds, @QueryParam("publicNotifications") Boolean publicNotifications, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchApplications(version,deviceId,accountId,latitude,longitude,q,keyword,qSearchFields,sortField,descending,i,start,l,limit,hasAds,publicNotifications,activeOnly,securityContext);
    }
    @GET
    @Path("/asset/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Assets", notes = "Searches for assets", response = AssetResponse.class, responseContainer = "List", tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AssetResponse.class, responseContainer = "List") })
    public Response searchAssets( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("assetIds") String assetIds, @QueryParam("appKey") String appKey, @QueryParam("mediaType") String mediaType, @QueryParam("mimeType") String mimeType, @QueryParam("keyword") String keyword, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("searchMediaLibrary") Boolean searchMediaLibrary, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnApp") Boolean returnApp, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchMode") String searchMode, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAssets(version,deviceId,accountId,albumIds,assetIds,appKey,mediaType,mimeType,keyword,versionCode,versionName,updatedSince,updatedBefore,sortField,descending,searchMediaLibrary,filterByBillable,activeOnly,returnApp,start,limit,searchMode,assetType,approvalStatus,assignedAccountId,securityContext);
    }
    @GET
    @Path("/reservable/availability/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Availability", notes = "", response = AvailabilityResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AvailabilityResponse.class, responseContainer = "List") })
    public Response searchAvailability( @PathParam("version") BigDecimal version, @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchAvailability(version,reservableId,reservableType,deviceId,accountId,startDate,endDate,start,limit,securityContext);
    }
    @GET
    @Path("/report/batch/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offline Reports", notes = "Retrieves batches for a user..", response = ReportBatchResponse.class, responseContainer = "List", tags={ "Reporting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReportBatchResponse.class, responseContainer = "List") })
    public Response searchBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("names") String names, @QueryParam("appKey") String appKey,, allowableValues="NEW, ERROR, COMPLETE, PARSE_ERROR, PROCESSING, DUPLICATE, SAVEONLY" @QueryParam("status") String status, @QueryParam("globalAppSearch") Boolean globalAppSearch, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBatch(version,accountId,start,limit,names,appKey,status,globalAppSearch,startDate,endDate,securityContext);
    }
    @GET
    @Path("/notification/blocked/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search on the user's blocked notification settings", notes = "Search on the user's blocked notification settings", response = BlockedNotificationResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BlockedNotificationResponse.class) })
    public Response searchBlockedNotifications( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("searchTags") String searchTags, @QueryParam("events") String events, @QueryParam("conduits") String conduits, @QueryParam("customTypes") String customTypes, @QueryParam("contentTypes") String contentTypes, @QueryParam("contentIds") String contentIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBlockedNotifications(version,appKey,accountId,searchTags,events,conduits,customTypes,contentTypes,contentIds,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/vatom/b/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search for Vatom Businesses", notes = "Searches for Vatom businesses.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchBusinesses( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchBusinesses(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/b/campaign-groups/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Campaign Groups", notes = "Search campaign groups.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchCampaignGroups( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCampaignGroups(version,accountId,appKey,returnRawResponse,securityContext);
    }
    @GET
    @Path("/cargo/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Cargo Type", notes = "Search for types of cargo", response = CargoType.class, responseContainer = "List", tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class, responseContainer = "List") })
    public Response searchCargoTypes( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCargoTypes(version,sortField,descending,start,limit,activeOnly,retailerId,hubId,securityContext);
    }
    @GET
    @Path("/carrier/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Carriers", notes = "Search on supported mobile telephone carriers that can be used to send SMS notifications via email.", response = CellCarrierResponse.class, responseContainer = "List", tags={ "Carrier", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CellCarrierResponse.class, responseContainer = "List") })
    public Response searchCarriers( @PathParam("version") BigDecimal version, @QueryParam("keyword") String keyword, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCarriers(version,keyword,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/category/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Categories", notes = "Search for categories.", response = CategoryResponse.class, responseContainer = "List", tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryResponse.class, responseContainer = "List") })
    public Response searchCategories( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey, @QueryParam("categoryId") String categoryId, @QueryParam("categoryIds") String categoryIds, @QueryParam("parentCategoryIds") String parentCategoryIds, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("true") @QueryParam("returnExternal") Boolean returnExternal, @DefaultValue("false") @QueryParam("exactMatch") Boolean exactMatch, @QueryParam("type") String type, @QueryParam("externalType") String externalType, @QueryParam("excludeExternalType") Boolean excludeExternalType, @QueryParam("minOfferCount") Integer minOfferCount, @DefaultValue("4") @QueryParam("searchDepth") Integer searchDepth, @QueryParam("searchMode") String searchMode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCategories(version,accountId,keyword,appKey,categoryId,categoryIds,parentCategoryIds,rootOnly,sortField,responseGroup,descending,start,limit,activeOnly,returnExternal,exactMatch,type,externalType,excludeExternalType,minOfferCount,searchDepth,searchMode,securityContext);
    }
    @GET
    @Path("/connection/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Possible Connections", notes = "Search for accounts that the user may not have a connection with.", response = ConnectionListResponse.class, tags={ "Connection", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ConnectionListResponse.class) })
    public Response searchConnections( @PathParam("version") BigDecimal version, @NotNull @QueryParam("returnNulls") Boolean returnNulls, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l, @QueryParam("sortField") String sortField, @QueryParam("hasLocation") Boolean hasLocation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchConnections(version,returnNulls,start,limit,deviceId,accountId,q,keyword,latitude,longitude,gameType,appKey,i,l,sortField,hasLocation,securityContext);
    }
    @GET
    @Path("/thirdparty/credential/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Credentials", notes = "Search on a user's linked third party networks.", response = ThirdPartyCredentialResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyCredentialResponse.class, responseContainer = "List") })
    public Response searchCredentials( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("networkUID") String networkUID, @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchCredentials(version,accountId,keyword,networkUID,descending,start,limit,securityContext);
    }
    @GET
    @Path("/object/data/{objectName}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Data", notes = "Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response searchData( @PathParam("version") BigDecimal version, @PathParam("objectName") String objectName, @NotNull @QueryParam("count") Boolean count, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit, @QueryParam("accountId") Long accountId, @QueryParam("criteria") String criteria, @QueryParam("order") String order, @QueryParam("include") String include,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchData(version,objectName,count,start,limit,accountId,criteria,order,include,securityContext);
    }
    @GET
    @Path("/disbursement/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Disbursements", notes = "Search Disbursements", response = DisbursementResponse.class, responseContainer = "List", tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class, responseContainer = "List") })
    public Response searchDisbursements( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("receiverAccountId") Long receiverAccountId, @QueryParam("statuses") String statuses, @QueryParam("providers") String providers, @QueryParam("beforeDate") Long beforeDate, @QueryParam("afterDate") Long afterDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("externalId") String externalId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchDisbursements(version,accountId,receiverAccountId,statuses,providers,beforeDate,afterDate,start,limit,activeOnly,externalId,securityContext);
    }
    @POST
    @Path("/employee/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Employees", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees.", response = EmployeeResponse.class, responseContainer = "List", tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class, responseContainer = "List") })
    public Response searchEmployees( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("role") String role, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("q") String q, @QueryParam("keyword") String keyword,, allowableValues="ID, DISPLAY, CREATED, UPDATED, ACTIVE, DELETED, LAST_LOGGED_IN, CONTACT_EMAIL, ACCOUNT_TYPE, RETAILER_LOCATION_NAME, RETAILER_NAME" @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @DefaultValue("0") @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("managedOnly") Boolean managedOnly, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("categoryIds") String categoryIds, @QueryParam("query") String query,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEmployees(version,accountId,role,retailerId,retailerLocationId,q,keyword,sortField,descending,i,start,l,limit,activeOnly,managedOnly,settingsAppKey,categoryIds,query,securityContext);
    }
    @GET
    @Path("/event/attendance/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Event Attendance", notes = "Searches on event type transactions. This can be used to see who is attending an event.", response = EventAttendanceResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EventAttendanceResponse.class, responseContainer = "List") })
    public Response searchEventTransactions( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("excludeRetailerLocationId") Long excludeRetailerLocationId, @QueryParam("listingId") Long listingId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("affiliatedCategoryIds") String affiliatedCategoryIds, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("statuses") String statuses,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEventTransactions(version,deviceId,accountId,appKey,keyword,retailerId,retailerLocationId,excludeRetailerLocationId,listingId,offerId,offerLocationId,customerAccountIds,affiliatedCategoryIds,startDate,endDate,statuses,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/event/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Events", notes = "Searches on events that the account has access to.", response = OfferShortResponse.class, responseContainer = "List", tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferShortResponse.class, responseContainer = "List") })
    public Response searchEvents( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchEvents(version,accountId,keyword,activeOnly,categoryIds,filterIds,offerAudienceIds,transactionAudienceIds,sortField,descending,startDate,endDate,start,limit,securityContext);
    }
    @GET
    @Path("/favorite/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Favorites", notes = "Searches on the user's favorites.", response = SearchResponse.class, tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response searchFavorites( @PathParam("version") BigDecimal version, @NotNull @QueryParam("favoritableType") String favoritableType, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchFavorites(version,favoritableType,sortField,descending,start,limit,activeOnly,returnFullResponse,deviceId,accountId,connectionAccountId,secondaryType,keyword,latitude,longitude,securityContext);
    }
    @GET
    @Path("/filter/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Filters", notes = "Search for filters.", response = FilterResponse.class, responseContainer = "List", tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterResponse.class, responseContainer = "List") })
    public Response searchFilters( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("appKey") String appKey,, allowableValues="ALL, GLOBAL, MINE" @QueryParam("responseGroup") String responseGroup, @QueryParam("rootOnly") Boolean rootOnly,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DISPLAY" @DefaultValue("DISPLAY") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchFilters(version,accountId,keyword,appKey,responseGroup,rootOnly,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/game/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search a Game", notes = "Get a list of games for an application, just those the account has permissions to view.", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response searchGames( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword, @QueryParam("appVersion") String appVersion, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchGames(version,accountId,appKey,start,limit,keyword,appVersion,includeGameData,includeInactive,securityContext);
    }
    @GET
    @Path("/vatom/me/identities/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search User Identities", notes = "Search User Identities.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchIdentities( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchIdentities(version,accountId,returnRawResponse,securityContext);
    }
    @GET
    @Path("/vatom/user-inventory/search")
    
    
    @io.swagger.annotations.ApiOperation(value = "Search Vatom User's Inventory", notes = "Searches the logged in user's Vatom Inventory.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response searchInventory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchInventory(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @GET
    @Path("/leaderboard/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search leaderboard and retrieve the matching ranking list", notes = "Search leaderboard and retrieve the matching ranking list", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response searchLeaderboards( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("keyword") String keyword, @QueryParam("leaderboardIds") String leaderboardIds, @QueryParam("rankTypes") String rankTypes, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("includeAppResponse") Boolean includeAppResponse, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLeaderboards(version,accountId,appKey,globalOnly,keyword,leaderboardIds,rankTypes,sortField,descending,includeInactive,includeAppResponse,start,limit,securityContext);
    }
    @GET
    @Path("/like/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Likes", notes = "Search for likes on a likable object.", response = SearchResponse.class, tags={ "Like", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class) })
    public Response searchLikes( @PathParam("version") BigDecimal version, @NotNull @QueryParam("likableType") String likableType, @NotNull @QueryParam("likableId") Long likableId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountIds") String connectionAccountIds, @DefaultValue("ID") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLikes(version,likableType,likableId,deviceId,accountId,connectionAccountIds,sortField,descending,updatedSince,updatedBefore,start,limit,securityContext);
    }
    @GET
    @Path("/listing/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Listings", notes = "Search for event listings from the start time to end time", response = ListingResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingResponse.class, responseContainer = "List") })
    public Response searchListing( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @DefaultValue("true") @QueryParam("useListingOrderIds") Boolean useListingOrderIds, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchListing(version,accountId,keyword,start,limit,activeOnly,latitude,longitude,startDate,endDate,categoryIds,filterIds,useListingOrderIds,externalId,externalId2,externalGroupId,securityContext);
    }
    @GET
    @Path("/location/rating/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Location Rating Indexes", notes = "Search for retailer locations by averages near you.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public Response searchLocationRatingIndexes( @PathParam("version") BigDecimal version, @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword, @QueryParam("locationType") String locationType,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("searchRange") Double searchRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnOverallRating") Boolean returnOverallRating,, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchLocationRatingIndexes(version,categoryIds,keyword,locationType,sortField,descending,start,limit,searchRange,latitude,longitude,returnOverallRating,distanceUnit,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,securityContext);
    }
    @GET
    @Path("/media/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Media", notes = "Searches on events that the account has access to.", response = MediaOfferResponse.class, responseContainer = "List", tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class, responseContainer = "List") })
    public Response searchMedia( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, REDEEMABLE_START, REDEEMABLE_END, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, VOUCHER_DISCOUNT_PRICE, FULL_PRICE, DICOUNT_PRICE, TICKETS_REWARD, AVAILABILITY_DATE, RELEASE_DATE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMedia(version,accountId,activeOnly,sortField,descending,keyword,categoryIds,filterIds,start,limit,securityContext);
    }
    @GET
    @Path("/mission/format/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Formats", notes = "Searches on pre-defined mission formats", response = MissionFormatResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionFormatResponse.class, responseContainer = "List") })
    public Response searchMissionFormats( @PathParam("version") BigDecimal version, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionFormats(version,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/mission/invite/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Mission Invites", notes = "Get a list of mission invites that the account has.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissionInvites( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId, @QueryParam("status") String status, @QueryParam("lastUpdated") Long lastUpdated, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword, @QueryParam("missionTypes") String missionTypes, @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionInvites(version,deviceId,accountId,appKey,appVersion,missionId,status,lastUpdated,start,limit,keyword,missionTypes,filterByBillable,includeGameData,securityContext);
    }
    @GET
    @Path("/mission/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions", notes = "Get the list missions available to the account.  ", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissions( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissions(version,accountId,keyword,subType,start,limit,includeGameData,includeAudiences,includeInactive,suffix,sortField,descending,securityContext);
    }
    @GET
    @Path("/mission/searchByBillableEntity")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Missions by Billable Entity", notes = "Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.", response = MissionResponse.class, responseContainer = "List", tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class, responseContainer = "List") })
    public Response searchMissionsByBillableEntity( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeAudiences") Boolean includeAudiences, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("suffix") String suffix, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchMissionsByBillableEntity(version,accountId,keyword,start,limit,includeGameData,includeAudiences,includeInactive,suffix,sortField,descending,securityContext);
    }
    @GET
    @Path("/thirdparty/network/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Networks", notes = "Search on supported third party networks and custom networks from external users.", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List", tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkShortResponse.class, responseContainer = "List") })
    public Response searchNetworks( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, NAME, DESCRIPTION" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("filterBillable") Boolean filterBillable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNetworks(version,accountId,sortField,descending,start,limit,activeOnly,keyword,filterBillable,securityContext);
    }
    @POST
    @Path("/note/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notes", notes = "Search for notes on a notable object.", response = NoteResponse.class, responseContainer = "List", tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class, responseContainer = "List") })
    public Response searchNotes( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("notableType") String notableType, @QueryParam("notableId") Long notableId, @QueryParam("noteTypes") String noteTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("flagCountMinimum") Long flagCountMinimum, @QueryParam("flagsExceedThreshold") Boolean flagsExceedThreshold, @QueryParam("includeInactive") Boolean includeInactive,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, NOTABLE_TYPE, NOTE_TAG, NOTE_COUNT, LIKES, DISLIKES" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("updatedSince") Long updatedSince, @QueryParam("updatedBefore") Long updatedBefore, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNotes(version,deviceId,accountId,notableType,notableId,noteTypes,appKey,keyword,flagCountMinimum,flagsExceedThreshold,includeInactive,sortField,descending,returnFullResponse,updatedSince,updatedBefore,start,limit,securityContext);
    }
    @GET
    @Path("/notification/template/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Notification Templates", notes = "Search for notification templates on owned applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response searchNotificationTemplate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("appKey") String appKey, @QueryParam("event") String event, @QueryParam("conduit") String conduit, @QueryParam("globalOnly") Boolean globalOnly, @QueryParam("reservedOnly") Boolean reservedOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchNotificationTemplate(version,accountId,sortField,descending,start,limit,appKey,event,conduit,globalOnly,reservedOnly,keyword,securityContext);
    }
    @GET
    @Path("/object/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Objects", notes = "Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response searchObject( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("start") Long start, @NotNull @QueryParam("limit") Long limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchObject(version,accountId,appKey,start,limit,keyword,securityContext);
    }
    @GET
    @Path("/tournament/object/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Objects", notes = "Search on game objects of tournaments", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response searchObjects( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("gameLevelId") Long gameLevelId,, allowableValues="ID, PLAYER_SCORE_COUNT" @DefaultValue("PLAYER_SCORE_COUNT") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchObjects(version,accountId,gameLevelId,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/offer/status/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Status", notes = "Search for the available offer statuses", response = OfferTransactionStatusResponse.class, responseContainer = "List", tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class, responseContainer = "List") })
    public Response searchOfferTransactionStatuses( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword, @QueryParam("role") String role, @QueryParam("appKey") String appKey,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE" @DefaultValue("CODE") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactionStatuses(version,deviceId,accountId,latitude,longitude,keyword,role,appKey,sortField,descending,start,limit,includeInactive,securityContext);
    }
    @GET
    @Path("/wallet/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Wallet Offers", notes = "Search on active offers currently in the user's wallet, or past offers the user has already redeemed.", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response searchOfferTransactions( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("excludeRetailerLocationIds") String excludeRetailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("offerLocationIds") String offerLocationIds,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferType") String specialOfferType, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @DefaultValue("false") @QueryParam("filterByParentOffer") Boolean filterByParentOffer, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore, @DefaultValue("false") @QueryParam("redeemed") Boolean redeemed, @QueryParam("statuses") String statuses, @DefaultValue("false") @QueryParam("reservationsOnly") Boolean reservationsOnly, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("false") @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("recurringStartedSince") Long recurringStartedSince, @QueryParam("recurringStartedBefore") Long recurringStartedBefore, @QueryParam("recurringExpirationSince") Long recurringExpirationSince, @QueryParam("recurringExpirationBefore") Long recurringExpirationBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactions(version,deviceId,accountId,keyword,retailerId,retailerIds,retailerLocationId,retailerLocationIds,excludeRetailerLocationIds,offerId,offerIds,offerLocationId,offerLocationIds,offerType,offerTypes,specialOfferType,specialOfferTypes,categoryIds,filterIds,offerAudienceIds,sortField,descending,start,limit,latitude,longitude,redeemableStartDate,redeemableEndDate,filterByParentOffer,startedSince,startedBefore,endedSince,endedBefore,redeemed,statuses,reservationsOnly,activeOnly,returnFullResponse,recurringStartedSince,recurringStartedBefore,recurringExpirationSince,recurringExpirationBefore,securityContext);
    }
    @GET
    @Path("/retailer/offer/transaction/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offer Transactions", notes = "Searches on offer transactions for offers that the account has access to.", response = OfferTransactionResponse.class, responseContainer = "List", tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class, responseContainer = "List") })
    public Response searchOfferTransactionsForRetailers( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, REDEEMABLE_START, REDEEMABLE_END, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("offerId") Long offerId, @QueryParam("offerLocationId") Long offerLocationId, @QueryParam("redeemed") Boolean redeemed, @QueryParam("reservationsOnly") Boolean reservationsOnly,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("couponType") String couponType,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType, @QueryParam("customerAccountIds") String customerAccountIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("_i") Integer i, @QueryParam("_l") Integer l,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOfferTransactionsForRetailers(version,sortField,descending,start,limit,activeOnly,deviceId,accountId,q,keyword,retailerId,retailerLocationId,offerId,offerLocationId,redeemed,reservationsOnly,couponType,offerType,specialOfferType,customerAccountIds,categoryIds,redeemableStartDate,redeemableEndDate,i,l,securityContext);
    }
    @GET
    @Path("/offer/lists")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Offers", notes = "Searches for offers as a consumer.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response searchOffersForConsumer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @NotNull, allowableValues="WALLET, CLICKS, BLENDED" @QueryParam("recommendationType") String recommendationType, @NotNull @QueryParam("locationId") Long locationId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("maxRecommendations") Integer maxRecommendations, @NotNull, allowableValues="MILES, KILOMETERS" @QueryParam("distanceUnit") String distanceUnit, @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @QueryParam("tags") String tags, @QueryParam("supportedPostalCodes") String supportedPostalCodes, @QueryParam("keyword") String keyword, @QueryParam("categories") String categories, @QueryParam("filters") String filters, @DefaultValue("COUPON, VOUCHER") @QueryParam("offerTypes") String offerTypes, @QueryParam("type") String type, @QueryParam("sortField") String sortField, @QueryParam("recommendOfferIds") String recommendOfferIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerId") Long offerId, @QueryParam("includeMission") Boolean includeMission, @QueryParam("includeCategories") Boolean includeCategories, @QueryParam("includeFilters") Boolean includeFilters, @QueryParam("includeExpired") Boolean includeExpired, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("closestOfferOnly") Boolean closestOfferOnly, @QueryParam("searchExpression") String searchExpression,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OFFER_ID, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, RETAILER_ID, RETAILER_LOCATION_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY" @QueryParam("groupBy") String groupBy,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOffersForConsumer(version,latitude,longitude,recommendationType,locationId,start,limit,maxRecommendations,distanceUnit,appKey,deviceId,accountId,searchRange,tags,supportedPostalCodes,keyword,categories,filters,offerTypes,type,sortField,recommendOfferIds,retailerLocationIds,offerId,includeMission,includeCategories,includeFilters,includeExpired,includeFavorite,closestOfferOnly,searchExpression,groupBy,securityContext);
    }
    @GET
    @Path("/order/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Orders", notes = "Search on active orders by customer", response = OrderResponse.class, responseContainer = "List", tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class, responseContainer = "List") })
    public Response searchOrders( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly, @DefaultValue("false") @QueryParam("ignoreCustomerFilter") Boolean ignoreCustomerFilter, @QueryParam("orderItemTypes") String orderItemTypes, @QueryParam("orderItemIds") String orderItemIds, @QueryParam("orderCustomTypes") String orderCustomTypes, @QueryParam("orderCustomIds") String orderCustomIds, @DefaultValue("ID") @QueryParam("sortField") String sortField, @QueryParam("offerTypes") String offerTypes, @QueryParam("specialOfferTypes") String specialOfferTypes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("offerAudienceIds") String offerAudienceIds, @QueryParam("transactionAudienceIds") String transactionAudienceIds, @QueryParam("offerIds") String offerIds, @QueryParam("offerLocationIds") String offerLocationIds, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("statuses") String statuses, @QueryParam("keyword") String keyword, @QueryParam("redeemableStartDate") Long redeemableStartDate, @QueryParam("redeemableEndDate") Long redeemableEndDate, @QueryParam("startedSince") Long startedSince, @QueryParam("startedBefore") Long startedBefore, @QueryParam("endedSince") Long endedSince, @QueryParam("endedBefore") Long endedBefore,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchOrders(version,appKey,deviceId,accountId,start,limit,descending,activeOnly,ignoreCustomerFilter,orderItemTypes,orderItemIds,orderCustomTypes,orderCustomIds,sortField,offerTypes,specialOfferTypes,categoryIds,filterIds,offerAudienceIds,transactionAudienceIds,offerIds,offerLocationIds,retailerIds,retailerLocationIds,statuses,keyword,redeemableStartDate,redeemableEndDate,startedSince,startedBefore,endedSince,endedBefore,securityContext);
    }
    @GET
    @Path("/pack/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Packs", notes = "Search on packs.", response = PackResponse.class, responseContainer = "List", tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class, responseContainer = "List") })
    public Response searchPacks( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="TITLE, DESCRIPTION, CREATED, UPDATED" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("includeGameData") Boolean includeGameData, @QueryParam("includeInactive") Boolean includeInactive, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPacks(version,accountId,sortField,descending,keyword,packType,start,limit,includeGameData,includeInactive,appKey,securityContext);
    }
    @GET
    @Path("/billing/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Payment Methods", notes = "Search the payment methods of an account", response = PaymentTypesResponse.class, tags={ "Billing Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PaymentTypesResponse.class) })
    public Response searchPaymentMethod( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @DefaultValue("AUTHORIZE_NET") @QueryParam("provider") String provider, @QueryParam("type") String type, @QueryParam("keyword") String keyword, @DefaultValue("UPDATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("5") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPaymentMethod(version,accountId,provider,type,keyword,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/permissions/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables", notes = "Search on UserPermissions", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public Response searchPermissionables( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds,, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPermissionables(version,deviceId,accountId,connectionAccountId,connectionAccountIds,permissionableType,permissionableId,keyword,sortField,descending,pending,admin,start,limit,securityContext);
    }
    @GET
    @Path("/permissions/distancesearch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Permissionables by Distnace", notes = "Search on UserPermissions by distance", response = UserPermissionsResponse.class, responseContainer = "List", tags={ "User Permissions", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserPermissionsResponse.class, responseContainer = "List") })
    public Response searchPermissionablesFollowingDistance( @PathParam("version") BigDecimal version, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("connectionAccountId") Long connectionAccountId, @QueryParam("connectionAccountIds") String connectionAccountIds,, allowableValues="ACCOUNT, GAMELEVEL, ALBUM_CONTEST, THEME_DESCRIPTOR, SCHEDULED_NOTIFICATION, TASK, TRIGGER" @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @DefaultValue("5") @QueryParam("searchRange") Double searchRange, @QueryParam("keyword") String keyword, @QueryParam("pending") Boolean pending, @QueryParam("admin") Boolean admin, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPermissionablesFollowingDistance(version,latitude,longitude,deviceId,accountId,connectionAccountId,connectionAccountIds,permissionableType,permissionableId,searchRange,keyword,pending,admin,start,limit,securityContext);
    }
    @GET
    @Path("/persona/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Personas", notes = "Search for persona that the account owns by the given account ID.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response searchPersona( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPersona(version,accountId,start,limit,securityContext);
    }
    @GET
    @Path("/program")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Programs", notes = "Search for programs", response = Program.class, responseContainer = "List", tags={ "Program", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Program.class, responseContainer = "List") })
    public Response searchPrograms( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPrograms(version,sortField,descending,start,limit,activeOnly,keyword,securityContext);
    }
    @GET
    @Path("/purchase/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Purchases", notes = "Search for purchasable items from the system", response = PurchaseItemResponse.class, responseContainer = "List", tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemResponse.class, responseContainer = "List") })
    public Response searchPurchaseItems( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @DefaultValue("false") @QueryParam("filterByBillable") Boolean filterByBillable, @QueryParam("purchaseType") String purchaseType, @QueryParam("serviceAction") String serviceAction, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, TICKETS, PRICE, PURCHASE_TYPE, PURCHASE_CODE, PURCHASE_LIMIT, SERIVCE_ACTION, GIFTABLE, ASSETABLE, APPLICATION_ID, APPLICATION_NAME" @DefaultValue("NAME") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("false") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchPurchaseItems(version,deviceId,accountId,appKey,filterByBillable,purchaseType,serviceAction,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/game/question/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Questions", notes = "Search for questions by the given params.", response = QuestionResponse.class, responseContainer = "List", tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class, responseContainer = "List") })
    public Response searchQuestions( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchQuestions(version,accountId,sortField,descending,activeOnly,start,limit,keyword,securityContext);
    }
    @GET
    @Path("/rating/index/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Rating Indexes", notes = "Search for ratable items by averages.", response = RatingIndexResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingIndexResponse.class, responseContainer = "List") })
    public Response searchRatingIndexes( @PathParam("version") BigDecimal version, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("ratableType") String ratableType, @QueryParam("ratableIds") String ratableIds, @QueryParam("categoryIds") String categoryIds, @QueryParam("secondaryType") String secondaryType, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("returnRatable") Boolean returnRatable, @QueryParam("returnOverallRating") Boolean returnOverallRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRatingIndexes(version,ratableType,ratableIds,categoryIds,secondaryType,keyword,sortField,descending,start,limit,latitude,longitude,returnRatable,returnOverallRating,securityContext);
    }
    @GET
    @Path("/rating/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Ratings", notes = "Search for ratings on a ratable object.", response = RatingResponse.class, responseContainer = "List", tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class, responseContainer = "List") })
    public Response searchRatings( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("ratableType") String ratableType, @QueryParam("ratableId") Long ratableId, @QueryParam("categoryIds") String categoryIds, @QueryParam("keyword") String keyword,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRatings(version,deviceId,accountId,filterAccountId,ratableType,ratableId,categoryIds,keyword,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/notification/recipient/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients", notes = "Search for application users to send notifications.", response = NotificationRecipientResponse.class, responseContainer = "List", tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponse.class, responseContainer = "List") })
    public Response searchRecipients( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ID, HAS_SMS, HAS_EMAIL, HAS_APNS, HAS_GCM, APPLICATION_ID, APPLICATION_NAME, ACCOUNT_ID, ACCOUNT_USERNAME, ACCOUNT_DISPLAY, ACCOUNT_TYPE" @QueryParam("sortField") String sortField, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("recipientAccountIds") String recipientAccountIds, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRecipients(version,sortField,deviceId,accountId,appKey,conduit,keyword,audienceId,audienceIds,connectionGroupIds,recipientAccountIds,descending,start,limit,securityContext);
    }
    @GET
    @Path("/notification/recipient/search/count")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search for Recipients (Counts/Grouped)", notes = "Search for application users to send notifications (count/grouped variant).", response = NotificationRecipientResponseListResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationRecipientResponseListResponse.class) })
    public Response searchRecipientsCount( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("conduit") String conduit, @QueryParam("keyword") String keyword, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRecipientsCount(version,deviceId,accountId,appKey,conduit,keyword,audienceId,audienceIds,connectionGroupIds,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/region/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Regions", notes = "Get the list of regions.", response = RegionResponse.class, responseContainer = "List", tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class, responseContainer = "List") })
    public Response searchRegions( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("query") String query, @QueryParam("keyword") String keyword, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("range") Double range,, allowableValues="NATIONAL, STATE, COUNTY, METRO_AREA, CITY, NEIGHBORHOOD, TERRITORY, CUSTOM, ZONE" @QueryParam("regionClass") String regionClass,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility,, allowableValues="RDS, LUCENE, CLOUDINDEX" @QueryParam("searchMode") String searchMode,, allowableValues="ID, UPDATED, NAME, DISTANCE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("includeParent") Boolean includeParent, @QueryParam("includeChildren") Boolean includeChildren, @QueryParam("includePostalCodes") Boolean includePostalCodes, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("versionCode") Integer versionCode, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("showDeleted") Boolean showDeleted, @QueryParam("lastUpdatedSince") Long lastUpdatedSince, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRegions(version,accountId,query,keyword,latitude,longitude,range,regionClass,visibility,searchMode,sortField,descending,includeParent,includeChildren,includePostalCodes,categoryIds,filterIds,versionCode,activeOnly,showDeleted,lastUpdatedSince,start,limit,securityContext);
    }
    @GET
    @Path("/reservation/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Reservations", notes = "", response = ReservationResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ReservationResponse.class, responseContainer = "List") })
    public Response searchReservations( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey, @QueryParam("accountId") Long accountId, @QueryParam("filterAccountId") Long filterAccountId, @QueryParam("reservableId") Long reservableId,, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @QueryParam("keyword") String keyword, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchReservations(version,deviceId,appKey,accountId,filterAccountId,reservableId,reservableType,keyword,startDate,endDate,start,limit,securityContext);
    }
    @GET
    @Path("/retailer/location/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Retailer Locations (Owned)", notes = "Searches on retailer locations that the account has access to.", response = RetailerLocationResponse.class, responseContainer = "List", tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class, responseContainer = "List") })
    public Response searchRetailerLocations( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("q") String q, @QueryParam("keyword") String keyword, @QueryParam("retailerIds") String retailerIds, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("locationType") String locationType,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, RETAILER_ID, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, NAME, CODE" @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("_i") Integer i, @QueryParam("start") Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") Integer limit, @QueryParam("showPublicLocations") Boolean showPublicLocations, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("returnRetailer") Boolean returnRetailer, @QueryParam("returnAssets") Boolean returnAssets, @QueryParam("returnOffers") Boolean returnOffers, @QueryParam("returnCategories") Boolean returnCategories, @QueryParam("returnFilters") Boolean returnFilters, @QueryParam("returnAudiences") Boolean returnAudiences, @QueryParam("returnQrCode") Boolean returnQrCode, @QueryParam("includeFavorite") Boolean includeFavorite, @QueryParam("includeLiked") Boolean includeLiked, @QueryParam("includeRating") Boolean includeRating,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRetailerLocations(version,deviceId,accountId,q,keyword,retailerIds,retailerLocationIds,locationType,sortField,descending,i,start,l,limit,showPublicLocations,activeOnly,returnRetailer,returnAssets,returnOffers,returnCategories,returnFilters,returnAudiences,returnQrCode,includeFavorite,includeLiked,includeRating,securityContext);
    }
    @GET
    @Path("/tournament/round/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournament Rounds", notes = "Search for the user's tournament games.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response searchRounds( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @DefaultValue("ACCEPTED,ACTIVE") @QueryParam("status") String status,, allowableValues="TOURNAMENT, POOLPLAY" @QueryParam("missionType") String missionType, @DefaultValue("true") @QueryParam("currentOnly") Boolean currentOnly, @DefaultValue("PUBLIC") @QueryParam("visibilities") String visibilities, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRounds(version,accountId,appKey,status,missionType,currentOnly,visibilities,start,limit,securityContext);
    }
    @GET
    @Path("/route/setting")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Route Settings", notes = "Search for route settings", response = RouteSettings.class, responseContainer = "List", tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class, responseContainer = "List") })
    public Response searchRouteSettings( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRouteSettings(version,sortField,descending,start,limit,activeOnly,hubId,programId,keyword,securityContext);
    }
    @GET
    @Path("/route")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Routes", notes = "Search for routes.", response = Route.class, responseContainer = "List", tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class, responseContainer = "List") })
    public Response searchRoutes( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @NotNull @QueryParam("includesEmpty") Boolean includesEmpty, @NotNull @QueryParam("rootOnly") Boolean rootOnly, @NotNull @QueryParam("showInheritedProperties") Boolean showInheritedProperties, @QueryParam("hubId") Long hubId, @QueryParam("programId") Long programId, @QueryParam("scheduledStart") Long scheduledStart, @QueryParam("scheduledEnd") Long scheduledEnd, @QueryParam("updatedStart") Long updatedStart, @QueryParam("updatedEnd") Long updatedEnd, @QueryParam("featured") Boolean featured, @QueryParam("seatCount") Integer seatCount, @QueryParam("approved") Boolean approved, @QueryParam("started") Boolean started, @QueryParam("completed") Boolean completed, @QueryParam("valid") Boolean valid, @QueryParam("parentId") Long parentId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchRoutes(version,sortField,descending,start,limit,activeOnly,includesEmpty,rootOnly,showInheritedProperties,hubId,programId,scheduledStart,scheduledEnd,updatedStart,updatedEnd,featured,seatCount,approved,started,completed,valid,parentId,securityContext);
    }
    @GET
    @Path("/reservable/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Schedule", notes = "", response = TimeSlotResponse.class, responseContainer = "List", tags={ "Reservation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TimeSlotResponse.class, responseContainer = "List") })
    public Response searchSchedule( @PathParam("version") BigDecimal version, @NotNull @QueryParam("reservableId") Long reservableId, @NotNull, allowableValues="LOCATABLE, RESERVABLE, PERMISSIONABLE, NOTABLE, ASSETABLE, LIKABLE, FLAGABLE, FAVORITABLE, RATABLE, ALBUM, COLLECTION, APPLICATION, APPLICATION_SETTING, APPLICATION_CERT, APPLICATION_PLACEMENT, ACCOUNT, ACCOUNT_SETTING, GAME_LEVEL, PACK, MISSION, TOURNAMENT, ASSET, ALBUM_CONTEST, THEME_DESCRIPTOR, OFFER, OFFER_LOCATION, EVENT, RETAILER, RETAILER_LOCATION, NOTE, CREATIVE, FAVORITE, LIKE, RATING, ANALYTIC, THIRD_PARTY_CREDENTIAL, THIRD_PARTY_NETWORK, REGION" @QueryParam("reservableType") String reservableType, @NotNull @QueryParam("startDate") Long startDate, @NotNull @QueryParam("endDate") Long endDate, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @DefaultValue("30") @QueryParam("timeBucketMins") Integer timeBucketMins,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchSchedule(version,reservableId,reservableType,startDate,endDate,deviceId,accountId,timeBucketMins,securityContext);
    }
    @GET
    @Path("/notification/schedule/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Scheduled Notifications", notes = "This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response searchScheduledNotifications( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @QueryParam("audienceId") Long audienceId, @QueryParam("filter") String filter, @QueryParam("types") String types, @QueryParam("contentIds") String contentIds, @QueryParam("contentTypes") String contentTypes, @QueryParam("parentIds") String parentIds, @QueryParam("parentTypes") String parentTypes, @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("returnAudienceAccountCount") Boolean returnAudienceAccountCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchScheduledNotifications(version,accountId,groupingId,audienceId,filter,types,contentIds,contentTypes,parentIds,parentTypes,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,groupByGroupingId,returnAudienceAccountCount,securityContext);
    }
    @GET
    @Path("/score/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Score", notes = "Search the scores for an item.  Pass in the full path IDs for the scores.", response = ScoreResponse.class, responseContainer = "List", tags={ "Score", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScoreResponse.class, responseContainer = "List") })
    public Response searchScores( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchScores(version,accountId,appKey,missionId,gameId,packId,gameLevelId,gameObjectId,securityContext);
    }
    @GET
    @Path("/hub")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Service Hubs", notes = "Search for service hubs.", response = ServiceHub.class, responseContainer = "List", tags={ "Service Hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ServiceHub.class, responseContainer = "List") })
    public Response searchServiceHubs( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword, @QueryParam("retailerId") Long retailerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchServiceHubs(version,sortField,descending,start,limit,activeOnly,keyword,retailerId,securityContext);
    }
    @GET
    @Path("/shipment/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipment Batch", notes = "Search for shipment batches", response = ShipmentBatch.class, responseContainer = "List", tags={ "Shipment Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ShipmentBatch.class, responseContainer = "List") })
    public Response searchShipmentBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("hubId") Long hubId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchShipmentBatch(version,hubId,sortField,descending,start,limit,securityContext);
    }
    @GET
    @Path("/shipment")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Shipments", notes = "Search for shipments", response = Shipment.class, responseContainer = "List", tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class, responseContainer = "List") })
    public Response searchShipments( @PathParam("version") BigDecimal version, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("ownerId") Long ownerId, @QueryParam("riderId") Long riderId, @QueryParam("routeId") Long routeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchShipments(version,sortField,descending,start,limit,activeOnly,ownerId,riderId,routeId,securityContext);
    }
    @GET
    @Path("/task/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tasks", notes = "Search on Tasks", response = TaskResponse.class, responseContainer = "List", tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class, responseContainer = "List") })
    public Response searchTasks( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @DefaultValue("MINE") @QueryParam("filter") String filter, @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTasks(version,accountId,groupingId,filter,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/territory/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Territories", notes = "Searches on territories.", response = TerritoryResponse.class, responseContainer = "List", tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class, responseContainer = "List") })
    public Response searchTerritories( @PathParam("version") BigDecimal version, @NotNull, allowableValues="ID, UPDATED, CREATED, NAME" @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @QueryParam("keyword") String keyword, @QueryParam("start") Integer start, @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTerritories(version,sortField,descending,keyword,start,limit,securityContext);
    }
    @GET
    @Path("/tournament/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tournaments", notes = "Search for tournaments", response = MissionShortResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionShortResponse.class) })
    public Response searchTournaments( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @QueryParam("subType") String subType, @DefaultValue("false") @QueryParam("includeInactive") Boolean includeInactive, @DefaultValue("MULTISTAGE,TOURNAMENT,POOLPLAY") @QueryParam("missionTypes") String missionTypes,, allowableValues="ALL, UPCOMING, PAST, PRESENT, ACTIVE" @DefaultValue("UPCOMING") @QueryParam("filter") String filter,, allowableValues="ACTIVE, TITLE, DESCRIPTION, CREATED, UPDATED, MISSION_TYPE, OWNER_DISPLAY, START_DATE, END_DATE, STARTING_LIMIT, AVAILABLE_LIMIT, INVITE_COUNT, ACCEPTED_COUNT" @DefaultValue("START_DATE") @QueryParam("sortField") String sortField, @QueryParam("descending") Boolean descending, @DefaultValue("PUBLIC") @QueryParam("visibility") String visibility, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTournaments(version,accountId,appKey,keyword,subType,includeInactive,missionTypes,filter,sortField,descending,visibility,start,limit,securityContext);
    }
    @GET
    @Path("/tracking/searchByBillable")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tracking (Billable)", notes = "Retrieve tracking data for billable/account scoped queries.", response = LegResponse.class, responseContainer = "List", tags={ "Tracking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LegResponse.class, responseContainer = "List") })
    public Response searchTrackingLegs( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("trackingDeviceId") String trackingDeviceId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("100") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTrackingLegs(version,accountId,appKey,trackingDeviceId,startDate,endDate,tags,start,limit,securityContext);
    }
    @GET
    @Path("/trigger/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Triggers", notes = "Search for triggers", response = TriggerResponse.class, responseContainer = "List", tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class, responseContainer = "List") })
    public Response searchTriggers( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("groupingId") String groupingId, @DefaultValue("MINE") @QueryParam("filter") String filter, @DefaultValue("NEW,ERROR,COMPLETE,PROCESSING") @QueryParam("statuses") String statuses, @QueryParam("templateTypes") String templateTypes, @QueryParam("appKey") String appKey, @QueryParam("keyword") String keyword, @DefaultValue("CREATED") @QueryParam("sortField") String sortField, @DefaultValue("true") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTriggers(version,accountId,groupingId,filter,statuses,templateTypes,appKey,keyword,sortField,descending,start,limit,activeOnly,securityContext);
    }
    @GET
    @Path("/trip/match")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Trips", notes = "Search for trips with matching information.", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response searchTrips( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("sortField") String sortField, @NotNull @QueryParam("descending") Boolean descending, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("matchedHasRoute") Boolean matchedHasRoute, @QueryParam("matchedHasDriver") Boolean matchedHasDriver,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchTrips(version,accountId,sortField,descending,start,limit,activeOnly,startDate,endDate,matchedHasRoute,matchedHasDriver,securityContext);
    }
    @GET
    @Path("/vehicle")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle", notes = "Search for vehicles", response = Vehicle.class, responseContainer = "List", tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class, responseContainer = "List") })
    public Response searchVehicle( @PathParam("version") BigDecimal version, @NotNull @QueryParam("hubId") Long hubId, @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchVehicle(version,hubId,sortField,descending,start,limit,activeOnly,keyword,securityContext);
    }
    @GET
    @Path("/vehicle/type")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Vehicle Type", notes = "Search for types of vehicles", response = VehicleType.class, responseContainer = "List", tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class, responseContainer = "List") })
    public Response searchVehicleTypes( @PathParam("version") BigDecimal version, @NotNull @DefaultValue("id") @QueryParam("sortField") String sortField, @NotNull @DefaultValue("false") @QueryParam("descending") Boolean descending, @NotNull @DefaultValue("0") @QueryParam("start") Integer start, @NotNull @DefaultValue("20") @QueryParam("limit") Integer limit, @NotNull @DefaultValue("true") @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("retailerId") Long retailerId, @QueryParam("hubId") Long hubId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchVehicleTypes(version,sortField,descending,start,limit,activeOnly,retailerId,hubId,securityContext);
    }
    @GET
    @Path("/weather/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Weather", notes = "Search the weather forcast for the next 5 days", response = WeatherResponse.class, tags={ "Weather", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WeatherResponse.class) })
    public Response searchWeather( @PathParam("version") BigDecimal version, @QueryParam("regionId") Long regionId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("-6") @QueryParam("timezoneOffset") Long timezoneOffset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.searchWeather(version,regionId,latitude,longitude,timezoneOffset,securityContext);
    }
    @POST
    @Path("/account/login/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Login Account (Encrypted Username)", notes = "ogin with encrypted user-name and password.", response = ProfileResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response secureLogin( @PathParam("version") BigDecimal version, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @NotNull @QueryParam("gameType") String gameType, @QueryParam("deviceId") String deviceId, @DefaultValue("UTF-8") @QueryParam("charsetName") String charsetName, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("false") @QueryParam("returnProfile") Boolean returnProfile, @DefaultValue("PROFILE") @QueryParam("responseFilters") String responseFilters,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.secureLogin(version,username,password,gameType,deviceId,charsetName,latitude,longitude,returnProfile,responseFilters,securityContext);
    }
    @POST
    @Path("/account/create/validate")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Account (Encrypted Username)", notes = "Create a new account by role (with encrypted user-name and password)", response = ProfileInfoResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileInfoResponse.class) })
    public Response secureSignup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("deviceId") String deviceId, @NotNull @QueryParam("username") String username, @NotNull @QueryParam("password") String password, @QueryParam("name") String name, @QueryParam("inviteToken") String inviteToken, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("deviceIdType") String deviceIdType, @QueryParam("emailAddress") String emailAddress, @QueryParam("assetId") Long assetId, @QueryParam("address") String address, @QueryParam("zipcode") String zipcode, @QueryParam("gender") String gender, @QueryParam("birthday") Long birthday, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @DefaultValue("MEMBER") @QueryParam("role") String role, @QueryParam("platforms") String platforms, @QueryParam("tags") String tags, @QueryParam("aboutUs") String aboutUs, @QueryParam("gameExperience") String gameExperience, @QueryParam("categoryIds") String categoryIds, @QueryParam("hometown") String hometown, @QueryParam("height") String height, @QueryParam("heightIndex") Integer heightIndex, @QueryParam("ethnicity") String ethnicity, @QueryParam("bodyType") String bodyType, @QueryParam("maritalStatus") String maritalStatus, @QueryParam("children") String children, @QueryParam("religion") String religion, @QueryParam("education") String education, @QueryParam("educationIndex") Integer educationIndex, @QueryParam("smoke") String smoke, @QueryParam("drink") String drink, @QueryParam("companionship") String companionship, @QueryParam("companionshipIndex") Integer companionshipIndex, @QueryParam("preferredMinAge") Integer preferredMinAge, @QueryParam("preferredMaxAge") Integer preferredMaxAge, @QueryParam("preferredMinHeight") Integer preferredMinHeight, @QueryParam("preferredMaxHeight") Integer preferredMaxHeight, @QueryParam("preferredGender") String preferredGender, @QueryParam("preferredEducation") String preferredEducation, @QueryParam("preferredEducationIndex") Integer preferredEducationIndex, @QueryParam("preferredBodyType") String preferredBodyType, @QueryParam("preferredEthnicity") String preferredEthnicity, @QueryParam("preferredLocation") String preferredLocation, @QueryParam("preferredLocationRange") Double preferredLocationRange, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @DefaultValue("true") @QueryParam("acceptedTerms") Boolean acceptedTerms, @DefaultValue("UTF-8") @QueryParam("charsetName") String charsetName, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("responseType") String responseType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.secureSignup(version,deviceId,username,password,name,inviteToken,prefixName,firstName,middleName,lastName,suffixName,title,deviceIdType,emailAddress,assetId,address,zipcode,gender,birthday,homePhone,cellPhone,cellPhoneCarrier,businessPhone,role,platforms,tags,aboutUs,gameExperience,categoryIds,hometown,height,heightIndex,ethnicity,bodyType,maritalStatus,children,religion,education,educationIndex,smoke,drink,companionship,companionshipIndex,preferredMinAge,preferredMaxAge,preferredMinHeight,preferredMaxHeight,preferredGender,preferredEducation,preferredEducationIndex,preferredBodyType,preferredEthnicity,preferredLocation,preferredLocationRange,latitude,longitude,acceptedTerms,charsetName,gameType,appKey,appVersion,responseType,securityContext);
    }
    @POST
    @Path("/notification/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Batch Notifications", notes = "Send notifications to all users of an application. Only someone with permissions to the application can do this.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendBatchNotifications( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("customMessage") String customMessage, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendBatchNotifications(version,accountId,appKey,customMessage,conduit,contentId,contentName,contentType,parentId,parentType,securityContext);
    }
    @POST
    @Path("/audience/suggestion/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Suggestions", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendByAccount( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendByAccount(version,accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/notification/custom")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Custom Notifications", notes = "Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored.", response = SirqulResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendCustomNotifications( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("receiverAccountIds") String receiverAccountIds, @QueryParam("includeFriendGroup") Boolean includeFriendGroup, @QueryParam("appKey") String appKey, @QueryParam("gameType") String gameType, @QueryParam("conduit") String conduit, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("actionCategory") String actionCategory, @QueryParam("subject") String subject, @QueryParam("customMessage") String customMessage, @QueryParam("friendOnlyAPNS") Boolean friendOnlyAPNS, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendCustomNotifications(version,deviceId,accountId,receiverAccountIds,includeFriendGroup,appKey,gameType,conduit,contentId,contentName,contentType,parentId,parentType,actionCategory,subject,customMessage,friendOnlyAPNS,latitude,longitude,securityContext);
    }
    @POST
    @Path("/thirdparty/credential/mfa/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send MFA Challenge", notes = "Sends an MFA challenge (SMS or Email) for networks with MFA enabled.", response = SirqulResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendMFAChallenge( @PathParam("version") BigDecimal version, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("appKey") String appKey, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("thirdPartyCredentialId") Long thirdPartyCredentialId, @QueryParam("deviceId") String deviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendMFAChallenge(version,networkUID,appKey,thirdPartyToken,thirdPartyCredentialId,deviceId,securityContext);
    }
    @POST
    @Path("/vatom/b/campaigns/send")
    
    
    @io.swagger.annotations.ApiOperation(value = "Send NFT", notes = "Send an NFT.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response sendNFT( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendNFT(version,accountId,appKey,vatomCampaignId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/route/{id}/driver/{driverId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Driver", notes = "Update the driver of the route.", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response setDriver( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @PathParam("driverId") Long driverId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setDriver(version,id,driverId,securityContext);
    }
    @POST
    @Path("/consumer/profile/matchToken")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Match Token", notes = "Save user's match token to be used for profile match making", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response setMatchToken( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("matchToken") String matchToken, @DefaultValue("BOOPY") @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setMatchToken(version,deviceId,accountId,matchToken,gameType,appKey,latitude,longitude,securityContext);
    }
    @POST
    @Path("/vatom/b/campaign/u/points/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Set Points Balance as Business", notes = "Sets the points balance of a Vatom user.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response setPointsBalanceAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomCampaignId") String vatomCampaignId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.setPointsBalanceAsBusiness(version,accountId,appKey,vatomUserId,vatomCampaignId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/simulation/routing")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Routing Simulation", notes = "Simulates routing requests.", response = SirqulResponse.class, tags={ "Simulation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response simulation( @PathParam("version") BigDecimal version, @NotNull @QueryParam("data") String data, @NotNull @QueryParam("realTime") Boolean realTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.simulation(version,data,realTime,securityContext);
    }
    @POST
    @Path("/sms/buyoffer/{appKey}")
    
    @Produces({ "application/xml" })
    @io.swagger.annotations.ApiOperation(value = "Buy Offer by SMS", notes = "Recieve an SMS payload from Twillio to purchase an offer.", response = TwiMLResponse.class, tags={ "Twilio", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TwiMLResponse.class) })
    public Response smsBuyOffer( @PathParam("version") BigDecimal version, @PathParam("appKey") String appKey, @NotNull @QueryParam("Body") String body, @NotNull @QueryParam("From") String from, @NotNull @QueryParam("currencyType") String currencyType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.smsBuyOffer(version,appKey,body,from,currencyType,securityContext);
    }
    @POST
    @Path("/orson/stories/renders")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Starts a StoryStitch video render", notes = "Starts a StoryStitch video render to produce your final video, returning the status details.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public Response startVideoRender( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.startVideoRender(version,accountId,data,securityContext);
    }
    @GET
    @Path("/csvimport/batch/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Status", notes = "Checks status of batch upload.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response statusCSV( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("batchId") Long batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.statusCSV(version,accountId,batchId,securityContext);
    }
    @POST
    @Path("/orson/ai/stt")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Speach to Text", notes = "Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public Response stt( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("sourceLanguage") String sourceLanguage, @QueryParam("targetLanguage") String targetLanguage, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.stt(version,accountId,thirdPartyAccountId,sourceLanguage,targetLanguage,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/tournament/score")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit Tournament Score", notes = "Submit an array of scores for a tournament match. ", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response submitTournamentScore( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("gameId") Long gameId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("scores") String scores, @QueryParam("gameLevelId") Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.submitTournamentScore(version,accountId,appKey,missionId,gameId,packId,scores,gameLevelId,securityContext);
    }
    @POST
    @Path("/tournament/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Submit a vote for a multi-stage album tournament.", notes = "Submit a vote for a multi-stage album tournament.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response submitTournamentVote( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("deviceId") String deviceId, @DefaultValue("false") @QueryParam("checkIfDeviceAlreadyVoted") Boolean checkIfDeviceAlreadyVoted,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.submitTournamentVote(version,accountId,appKey,missionId,gameObjectId,deviceId,checkIfDeviceAlreadyVoted,securityContext);
    }
    @POST
    @Path("/tournament/substitute")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Substitute Tournament Player", notes = "Service to replace the user's opponent in the current level - pack - mission with an AI account.", response = SirqulResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response substituteTournamentPlayer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("gameLevelId") Long gameLevelId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.substituteTournamentPlayer(version,accountId,missionId,packId,gameLevelId,securityContext);
    }
    @POST
    @Path("/orson/ai/topics")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summarize Topics", notes = "Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public Response summarizeTopics( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("doc") String doc, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.summarizeTopics(version,accountId,thirdPartyAccountId,doc,_file,url,limit,offset,paramCallback,securityContext);
    }
    @GET
    @Path("/listing/summary")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summary Listing", notes = "Search for a list of summary listings from the start time up to 8 days out.", response = ListingGroupResponse.class, responseContainer = "List", tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingGroupResponse.class, responseContainer = "List") })
    public Response summaryListing( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("startDate") Long startDate, @QueryParam("categoryIds") String categoryIds, @DefaultValue("15") @QueryParam("daysToInclude") Integer daysToInclude, @DefaultValue("true") @QueryParam("useListingOrderIds") Boolean useListingOrderIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.summaryListing(version,accountId,startDate,categoryIds,daysToInclude,useListingOrderIds,securityContext);
    }
    @POST
    @Path("/orson/ai/techTune")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect Technical Issues", notes = "Analyses a movie file to detect technical issues, such as too few people in frame.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public Response techTune( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("numFacesExpected") Integer numFacesExpected, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.techTune(version,accountId,numFacesExpected,thirdPartyAccountId,_file,url,paramCallback,securityContext);
    }
    @GET
    @Path("/ticket/ticketoffers")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Ticket Offers", notes = "Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.", response = TicketOfferResponse.class, tags={ "Ticket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TicketOfferResponse.class) })
    public Response ticketOffers( @PathParam("version") BigDecimal version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.ticketOffers(version,securityContext);
    }
    @GET
    @Path("/offer/top")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Offers (Top)", notes = "Gets the top active offers.", response = OfferListResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response topOfferTransactions( @PathParam("version") BigDecimal version, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.topOfferTransactions(version,start,limit,securityContext);
    }
    @POST
    @Path("/vatom/u/coins/transfer")
    
    
    @io.swagger.annotations.ApiOperation(value = "Transfer coins from Vatom Users", notes = "Transfer coins from Vatom Users.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response transferUserCoins( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.transferUserCoins(version,accountId,vatomUserId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/orson/ai/tts")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Text to Speach", notes = "Creates an audio file for the given text, with the option of language and voice selection.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public Response tts( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("text") String text, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("language") String language, @QueryParam("voice") String voice, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.tts(version,accountId,text,thirdPartyAccountId,language,voice,paramCallback,securityContext);
    }
    @POST
    @Path("/employee/unassign")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Unassign Employee", notes = "Unassign An existing account to be an employee", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response unassignEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.unassignEmployee(version,accountId,employeeAccountId,securityContext);
    }
    @POST
    @Path("/achievement/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement", notes = "Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementResponse.class) })
    public Response updateAchievement( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("analyticsTag") String analyticsTag, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("rankType") String rankType, @QueryParam("rankIncrement") Integer rankIncrement, @QueryParam("minIncrement") Integer minIncrement, @QueryParam("nullMinIncrement") Boolean nullMinIncrement, @QueryParam("maxIncrement") Integer maxIncrement, @QueryParam("nullMaxIncrement") Boolean nullMaxIncrement, @QueryParam("validate") Boolean validate, @QueryParam("active") Boolean active, @QueryParam("triggerDefinition") String triggerDefinition,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAchievement(version,deviceId,accountId,achievementId,analyticsTag,title,description,rankType,rankIncrement,minIncrement,nullMinIncrement,maxIncrement,nullMaxIncrement,validate,active,triggerDefinition,securityContext);
    }
    @POST
    @Path("/achievement/tier/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Tier", notes = "Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for.", response = AchievementTierResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AchievementTierResponse.class) })
    public Response updateAchievementTier( @PathParam("version") BigDecimal version, @NotNull @QueryParam("achievementTierId") Long achievementTierId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("icon") File icon, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("goalCount") Long goalCount, @QueryParam("missionId") Long missionId, @QueryParam("gameId") Long gameId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("gameObjectId") Long gameObjectId, @QueryParam("scoreAllInstances") Boolean scoreAllInstances,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAchievementTier(version,achievementTierId,deviceId,accountId,icon,iconAssetId,title,description,goalCount,missionId,gameId,packId,gameLevelId,gameObjectId,scoreAllInstances,securityContext);
    }
    @POST
    @Path("/account/active/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Active Status", notes = "Activate or deactivate an account (requires appropriate permissions).", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateActveStatus( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("connectionAccountId") Long connectionAccountId, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateActveStatus(version,accountId,connectionAccountId,active,deviceId,appKey,securityContext);
    }
    @POST
    @Path("/album/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Album", notes = "Update an Album.", response = AlbumResponse.class, tags={ "Album", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumResponse.class) })
    public Response updateAlbumCollection( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("assetsToAdd") String assetsToAdd, @QueryParam("assetsToRemove") String assetsToRemove, @QueryParam("assetId") Long assetId, @QueryParam("media") File media, @QueryParam("mediaURL") String mediaURL, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("tags") String tags, @QueryParam("description") String description, @QueryParam("albumType") String albumType, @QueryParam("albumTypeId") Long albumTypeId, @QueryParam("subType") String subType, @QueryParam("publicRead") Boolean publicRead, @QueryParam("publicWrite") Boolean publicWrite, @QueryParam("publicDelete") Boolean publicDelete, @QueryParam("publicAdd") Boolean publicAdd, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("locationDescription") String locationDescription,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("cellPhone") String cellPhone, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("fullAddress") String fullAddress, @QueryParam("anonymous") Boolean anonymous, @QueryParam("metaData") String metaData, @QueryParam("categoryIds") String categoryIds, @QueryParam("categoryFilterIds") String categoryFilterIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove, @QueryParam("includeAllAppUsersAsMembers") Boolean includeAllAppUsersAsMembers, @QueryParam("includeAudiencesAsMembers") Boolean includeAudiencesAsMembers, @QueryParam("audienceOperator") String audienceOperator, @QueryParam("linkedObjectType") String linkedObjectType, @QueryParam("linkedObjectId") Long linkedObjectId, @QueryParam("indexNow") Boolean indexNow,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAlbumCollection(version,albumId,deviceId,accountId,assetsToAdd,assetsToRemove,assetId,media,mediaURL,active,title,startDate,endDate,tags,description,albumType,albumTypeId,subType,publicRead,publicWrite,publicDelete,publicAdd,latitude,longitude,locationDescription,visibility,cellPhone,streetAddress,streetAddress2,city,state,postalCode,fullAddress,anonymous,metaData,categoryIds,categoryFilterIds,audienceIds,audienceIdsToAdd,audienceIdsToRemove,includeAllAppUsersAsMembers,includeAudiencesAsMembers,audienceOperator,linkedObjectType,linkedObjectId,indexNow,securityContext);
    }
    @POST
    @Path("/application/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Application", notes = "Update an application record", response = ApplicationResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationResponse.class) })
    public Response updateApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("appName") String appName, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("about") String about, @QueryParam("bundleId") String bundleId, @QueryParam("appIconAssetId") Long appIconAssetId, @QueryParam("appLogoAssetId") Long appLogoAssetId, @QueryParam("facebookAppId") String facebookAppId, @QueryParam("facebookAppSecret") String facebookAppSecret, @QueryParam("googleApiKey") String googleApiKey, @QueryParam("updateEULADate") Boolean updateEULADate, @QueryParam("eulaVersion") String eulaVersion, @QueryParam("landingPageUrl") String landingPageUrl, @QueryParam("showInActivities") Boolean showInActivities, @QueryParam("activityDescription") String activityDescription, @QueryParam("inviteWelcomeText") String inviteWelcomeText, @QueryParam("invitePageUrl") String invitePageUrl, @QueryParam("urlScheme") String urlScheme, @QueryParam("platforms") String platforms, @QueryParam("downloadUrls") String downloadUrls, @QueryParam("categoryIds") String categoryIds,, allowableValues="GAME_LEVEL, GAME_OBJECT" @DefaultValue("GAME_LEVEL") @QueryParam("scoringType") String scoringType, @DefaultValue("11") @QueryParam("hintCost") Integer hintCost, @DefaultValue("125") @QueryParam("maxScore") Integer maxScore, @DefaultValue("0.037") @QueryParam("ticketsPerPoint") Float ticketsPerPoint, @DefaultValue("true") @QueryParam("hasGameData") Boolean hasGameData, @QueryParam("publicNotifications") Boolean publicNotifications, @QueryParam("useMatchingAlgorithm") Boolean useMatchingAlgorithm, @DefaultValue("false") @QueryParam("globalTickets") Boolean globalTickets, @DefaultValue("1") @QueryParam("buildVersion") Float buildVersion, @QueryParam("apiVersion") Float apiVersion, @QueryParam("placementName") String placementName, @QueryParam("placementDescription") String placementDescription,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("placementSize") String placementSize, @QueryParam("placementHeight") Integer placementHeight, @QueryParam("placementWidth") Integer placementWidth, @QueryParam("placementRefreshInterval") Integer placementRefreshInterval, @DefaultValue("true") @QueryParam("createObjectStore") Boolean createObjectStore, @DefaultValue("false") @QueryParam("publicContentApproval") Boolean publicContentApproval, @DefaultValue("false") @QueryParam("productionMode") Boolean productionMode, @QueryParam("minimumSessionLength") Integer minimumSessionLength, @QueryParam("sessionGapLength") Integer sessionGapLength, @DefaultValue("false") @QueryParam("localAdsEnabled") Boolean localAdsEnabled, @QueryParam("sqootApiKey") String sqootApiKey,, allowableValues="DEFAULT, FINGERPRINT, FINGERPRINT_V2" @DefaultValue("FINGERPRINT") @QueryParam("trilatProcessingType") String trilatProcessingType, @QueryParam("maxSampleSize") Integer maxSampleSize, @QueryParam("minRSSI") Double minRSSI, @DefaultValue("ALL") @QueryParam("modules") String modules, @DefaultValue("1") @QueryParam("authorizedCount") Integer authorizedCount, @QueryParam("authorizedServers") String authorizedServers, @QueryParam("defaultTimezone") String defaultTimezone, @QueryParam("smtpPass") String smtpPass, @QueryParam("metaData") String metaData, @QueryParam("placementMetaData") String placementMetaData, @DefaultValue("false") @QueryParam("ipsFloor") Boolean ipsFloor, @DefaultValue("true") @QueryParam("enableAPNSBadge") Boolean enableAPNSBadge, @DefaultValue("true") @QueryParam("includeInReport") Boolean includeInReport, @QueryParam("defaultAppFilterId") Long defaultAppFilterId, @QueryParam("enableWelcomeEmail") Boolean enableWelcomeEmail, @QueryParam("appleAppId") String appleAppId, @QueryParam("appleTeamId") String appleTeamId, @QueryParam("appleAuthKeyId") String appleAuthKeyId, @QueryParam("appleAuthKey") File appleAuthKey, @QueryParam("appleIssuerId") String appleIssuerId, @QueryParam("appStoreKeyId") String appStoreKeyId, @QueryParam("appStoreKey") File appStoreKey, @QueryParam("googlePrivateKeyFile") File googlePrivateKeyFile, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey, @QueryParam("emailSender") String emailSender, @QueryParam("smtpUser") String smtpUser, @QueryParam("smtpHost") String smtpHost, @QueryParam("vatomBusinessId") String vatomBusinessId, @QueryParam("vatomRestClientId") String vatomRestClientId, @QueryParam("vatomRestSecretKey") String vatomRestSecretKey, @QueryParam("twilioAccountSID") String twilioAccountSID, @QueryParam("twilioAuthToken") String twilioAuthToken, @QueryParam("twilioSenderPhoneNumber") String twilioSenderPhoneNumber, @QueryParam("openAISecretKey") String openAISecretKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplication(version,appKey,appName,deviceId,accountId,about,bundleId,appIconAssetId,appLogoAssetId,facebookAppId,facebookAppSecret,googleApiKey,updateEULADate,eulaVersion,landingPageUrl,showInActivities,activityDescription,inviteWelcomeText,invitePageUrl,urlScheme,platforms,downloadUrls,categoryIds,scoringType,hintCost,maxScore,ticketsPerPoint,hasGameData,publicNotifications,useMatchingAlgorithm,globalTickets,buildVersion,apiVersion,placementName,placementDescription,placementSize,placementHeight,placementWidth,placementRefreshInterval,createObjectStore,publicContentApproval,productionMode,minimumSessionLength,sessionGapLength,localAdsEnabled,sqootApiKey,trilatProcessingType,maxSampleSize,minRSSI,modules,authorizedCount,authorizedServers,defaultTimezone,smtpPass,metaData,placementMetaData,ipsFloor,enableAPNSBadge,includeInReport,defaultAppFilterId,enableWelcomeEmail,appleAppId,appleTeamId,appleAuthKeyId,appleAuthKey,appleIssuerId,appStoreKeyId,appStoreKey,googlePrivateKeyFile,authorizeNetApiKey,authorizeNetTransactionKey,emailSender,smtpUser,smtpHost,vatomBusinessId,vatomRestClientId,vatomRestSecretKey,twilioAccountSID,twilioAuthToken,twilioSenderPhoneNumber,openAISecretKey,securityContext);
    }
    @POST
    @Path("/application/active")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Change Appliation Status", notes = "Set the application's active flag to true/false. This effectively activates or deactivates the application.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateApplicationActive( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationActive(version,accountId,appKey,active,securityContext);
    }
    @POST
    @Path("/appconfig/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update AppConfig", notes = "pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated.", response = ApplicationConfigResponse.class, tags={ "Application Config", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public Response updateApplicationConfig( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("configId") Long configId, @QueryParam("appKey") String appKey, @QueryParam("configVersion") String configVersion, @QueryParam("assetId") Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationConfig(version,accountId,configId,appKey,configVersion,assetId,retailerId,retailerLocationId,udid,securityContext);
    }
    @POST
    @Path("/application/placement/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ad Placement", notes = "Updates an ad placement for an application.", response = PlacementResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PlacementResponse.class) })
    public Response updateApplicationPlacement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("placementId") Long placementId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description,, allowableValues="CONFIG, BANNER, LEADERBOARD, SKYSCRAPER, VIDEO, ZIP, INTERSTITIAL, CUSTOM1, CUSTOM2, CUSTOM3, CUSTOM4, CUSTOM5, CUSTOM6, CUSTOM7, CUSTOM8, CUSTOM9, CUSTOM10" @QueryParam("size") String size, @QueryParam("height") Integer height, @QueryParam("width") Integer width, @QueryParam("refreshInterval") Integer refreshInterval, @QueryParam("defaultImageId") Long defaultImageId, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateApplicationPlacement(version,placementId,deviceId,accountId,name,description,size,height,width,refreshInterval,defaultImageId,active,securityContext);
    }
    @POST
    @Path("/asset/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Asset", notes = "Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.", response = SirqulResponse.class, tags={ "Asset", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateAsset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("assetId") Long assetId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("albumId") Long albumId, @QueryParam("attachedAssetId") Long attachedAssetId, @QueryParam("versionCode") Integer versionCode, @QueryParam("versionName") String versionName, @QueryParam("metaData") String metaData, @QueryParam("caption") String caption, @QueryParam("assetType") String assetType, @QueryParam("approvalStatus") String approvalStatus, @QueryParam("assignedAccountId") Long assignedAccountId, @QueryParam("media") File media, @QueryParam("mediaUrl") String mediaUrl, @QueryParam("mediaString") String mediaString, @QueryParam("mediaStringFileName") String mediaStringFileName, @QueryParam("mediaStringContentType") String mediaStringContentType, @QueryParam("mediaHeight") Integer mediaHeight, @QueryParam("mediaWidth") Integer mediaWidth, @QueryParam("attachedMedia") File attachedMedia, @QueryParam("attachedMediaUrl") String attachedMediaUrl, @QueryParam("attachedMediaString") String attachedMediaString, @QueryParam("attachedMediaStringFileName") String attachedMediaStringFileName, @QueryParam("attachedMediaStringContentType") String attachedMediaStringContentType, @QueryParam("attachedMediaHeight") Integer attachedMediaHeight, @QueryParam("attachedMediaWidth") Integer attachedMediaWidth, @QueryParam("locationDescription") String locationDescription, @QueryParam("searchTags") String searchTags, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAsset(version,assetId,deviceId,accountId,albumId,attachedAssetId,versionCode,versionName,metaData,caption,assetType,approvalStatus,assignedAccountId,media,mediaUrl,mediaString,mediaStringFileName,mediaStringContentType,mediaHeight,mediaWidth,attachedMedia,attachedMediaUrl,attachedMediaString,attachedMediaStringFileName,attachedMediaStringContentType,attachedMediaHeight,attachedMediaWidth,locationDescription,searchTags,appKey,latitude,longitude,securityContext);
    }
    @POST
    @Path("/audience/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Audience", notes = "Update a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response updateAudience( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("active") Boolean active, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAudience(version,accountId,audienceId,name,description,searchTags,gender,ageGroups,categoryIds,applicationIds,gameExperienceLevel,devices,deviceIds,deviceVersions,locations,radius,active,sendSuggestion,startTimeOffset,endTimeOffset,associateDescription,associateType,associateId,groupingId,metaData,visibility,audienceType,useOrder,cohortRegionsData,appKey,trilaterationTypes,uniqueName,securityContext);
    }
    @POST
    @Path("/bid/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Bid", notes = "Updates a bid on a biddable object", response = BidResponse.class, tags={ "Bid", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BidResponse.class) })
    public Response updateBid( @PathParam("version") BigDecimal version, @NotNull @QueryParam("bidId") Long bidId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("amountPerView") Double amountPerView, @QueryParam("amountPerAction") Double amountPerAction, @QueryParam("budgetAmount") Double budgetAmount, @QueryParam("budgetSchedule") String budgetSchedule,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBid(version,bidId,deviceId,accountId,amountPerView,amountPerAction,budgetAmount,budgetSchedule,securityContext);
    }
    @POST
    @Path("/billable/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Billable", notes = "Updates the billable record for an account", response = BillableEntityResponse.class, tags={ "Billable Entity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = BillableEntityResponse.class) })
    public Response updateBillableEntity( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("authorizeNetApiKey") String authorizeNetApiKey, @QueryParam("authorizeNetTransactionKey") String authorizeNetTransactionKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBillableEntity(version,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,businessPhone,businessPhoneExt,authorizeNetApiKey,authorizeNetTransactionKey,securityContext);
    }
    @POST
    @Path("/vatom/b/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Fund coins for a Business", notes = "Fund/update coins for a Businesss.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateBusinessCoins( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateBusinessCoins(version,accountId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @PUT
    @Path("/cargo/type/{cargoTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Cargo Type", notes = "Update an existing cargo type", response = CargoType.class, tags={ "Cargo Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CargoType.class) })
    public Response updateCargoType( @PathParam("version") BigDecimal version, @PathParam("cargoTypeId") Long cargoTypeId,@ApiParam(value = "" ) @Valid CargoType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCargoType(version,cargoTypeId,body,securityContext);
    }
    @POST
    @Path("/category/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Category", notes = "Update a category.", response = CategoryTreeResponse.class, tags={ "Category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CategoryTreeResponse.class) })
    public Response updateCategory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("categoryId") Long categoryId, @QueryParam("parentCategoryId") Long parentCategoryId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("type") String type, @QueryParam("assetId") Long assetId, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("externalCategorySlug") String externalCategorySlug, @QueryParam("sqootSlug") String sqootSlug, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCategory(version,accountId,categoryId,parentCategoryId,name,description,type,assetId,externalId,externalType,externalCategorySlug,sqootSlug,active,metaData,searchTags,securityContext);
    }
    @POST
    @Path("/creative/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Creative", notes = "Update a creative", response = CreativeResponse.class, tags={ "Creative", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CreativeResponse.class) })
    public Response updateCreative( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("creativeId") Long creativeId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("assetImageId") Long assetImageId, @QueryParam("action") String action, @QueryParam("data") String data, @QueryParam("suffix") String suffix, @QueryParam("type") String type, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("referenceId") Long referenceId, @QueryParam("appVersion") String appVersion, @QueryParam("missionId") Long missionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCreative(version,accountId,creativeId,name,description,assetImageId,action,data,suffix,type,balance,active,referenceId,appVersion,missionId,securityContext);
    }
    @POST
    @Path("/thirdparty/credential/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Credential", notes = "Updates a third-party login for an account.", response = ProfileResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ProfileResponse.class) })
    public Response updateCredential( @PathParam("version") BigDecimal version, @NotNull @QueryParam("networkUID") String networkUID, @NotNull @QueryParam("thirdPartyId") String thirdPartyId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("thirdPartyName") String thirdPartyName, @QueryParam("thirdPartyToken") String thirdPartyToken, @QueryParam("responseFilters") String responseFilters, @QueryParam("metaData") String metaData, @QueryParam("thirdPartyRefreshToken") String thirdPartyRefreshToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateCredential(version,networkUID,thirdPartyId,appKey,deviceId,thirdPartyName,thirdPartyToken,responseFilters,metaData,thirdPartyRefreshToken,securityContext);
    }
    @PUT
    @Path("/object/data/{objectName}/{objectId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Data", notes = "Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object.", response = ObjectStoreResponse.class, tags={ "Object Store", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ObjectStoreResponse.class) })
    public Response updateData( @PathParam("version") BigDecimal version, @PathParam("objectName") String objectName, @PathParam("objectId") String objectId, @QueryParam("accountId") Long accountId,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateData(version,objectName,objectId,accountId,body,securityContext);
    }
    @POST
    @Path("/disbursement/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Disbursement", notes = "Update Disbursement", response = DisbursementResponse.class, tags={ "Disbursement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DisbursementResponse.class) })
    public Response updateDisbursement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("disbursementId") Long disbursementId, @QueryParam("amount") BigDecimal amount,, allowableValues="AUTHORIZE_NET, AMAZON_FPS, BILL_COM" @QueryParam("provider") String provider, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("title") String title, @QueryParam("comment") String comment, @QueryParam("externalId") String externalId, @QueryParam("retry") Boolean retry, @QueryParam("introspectionParams") String introspectionParams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateDisbursement(version,accountId,disbursementId,amount,provider,scheduledDate,title,comment,externalId,retry,introspectionParams,securityContext);
    }
    @POST
    @Path("/employee/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Employee", notes = "Update the account record with the provided information.", response = EmployeeResponse.class, tags={ "Employee", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = EmployeeResponse.class) })
    public Response updateEmployee( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("employeeAccountId") Long employeeAccountId, @QueryParam("managerAccountId") Long managerAccountId, @QueryParam("name") String name, @QueryParam("prefixName") String prefixName, @QueryParam("firstName") String firstName, @QueryParam("middleName") String middleName, @QueryParam("lastName") String lastName, @QueryParam("suffixName") String suffixName, @QueryParam("title") String title, @QueryParam("assetId") Long assetId,, allowableValues="MALE, FEMALE, ANY" @QueryParam("gender") String gender, @QueryParam("homePhone") String homePhone, @QueryParam("cellPhone") String cellPhone, @QueryParam("cellPhoneCarrier") String cellPhoneCarrier, @QueryParam("businessPhone") String businessPhone, @QueryParam("emailAddress") String emailAddress, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("zipcode") String zipcode, @QueryParam("country") String country, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("password") String password, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("settingsAppKey") String settingsAppKey, @QueryParam("appBlob") String appBlob, @QueryParam("assignedDeviceId") String assignedDeviceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEmployee(version,accountId,employeeAccountId,managerAccountId,name,prefixName,firstName,middleName,lastName,suffixName,title,assetId,gender,homePhone,cellPhone,cellPhoneCarrier,businessPhone,emailAddress,streetAddress,streetAddress2,city,state,zipcode,country,role,active,password,retailerLocationIds,settingsAppKey,appBlob,assignedDeviceId,securityContext);
    }
    @POST
    @Path("/event/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Event", notes = "Update a private event to share with associates.", response = OfferResponse.class, tags={ "Event", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferResponse.class) })
    public Response updateEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("eventId") Long eventId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEvent(version,accountId,eventId,retailerLocationIds,title,subTitle,details,categoryIds,filterIds,active,imageAssetId,redeemableStart,redeemableEnd,securityContext);
    }
    @POST
    @Path("/vatom/b/events/guests/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event Guest List", notes = "Update the guest list of an event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateEventGuestList( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateEventGuestList(version,accountId,appKey,vatomEventId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/filter/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Filter", notes = "Update a filter.", response = FilterTreeResponse.class, tags={ "Filter", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = FilterTreeResponse.class) })
    public Response updateFilter( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("filterId") Long filterId, @QueryParam("parentFilterId") Long parentFilterId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("externalId") String externalId, @QueryParam("externalType") String externalType, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateFilter(version,accountId,filterId,parentFilterId,name,description,externalId,externalType,active,metaData,securityContext);
    }
    @POST
    @Path("/flag/threshold/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Flag Threshold", notes = "Update the flag threshold on an object type for a particular application.", response = CountResponse.class, tags={ "Flag", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CountResponse.class) })
    public Response updateFlagThreshold( @PathParam("version") BigDecimal version, @NotNull @QueryParam("itemBeingFlaggedType") String itemBeingFlaggedType, @NotNull @QueryParam("threshold") Long threshold, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateFlagThreshold(version,itemBeingFlaggedType,threshold,appKey,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/game/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a Game", notes = "Update a Game", response = GameResponse.class, tags={ "Game", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameResponse.class) })
    public Response updateGame( @PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("gameId") Long gameId, @QueryParam("appKey") String appKey, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("packIds") String packIds, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateGame(version,accountId,gameId,appKey,title,description,metaData,packIds,includeGameData,securityContext);
    }
    @POST
    @Path("/level/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Game Level", notes = "Update a game level. Currently does NOT support game objects.", response = GameLevelResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = GameLevelResponse.class) })
    public Response updateGameLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("levelId") Long levelId, @QueryParam("appKey") String appKey, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("difficulty") String difficulty, @QueryParam("appVersion") String appVersion, @QueryParam("assetImageId") Long assetImageId, @QueryParam("assetIconId") Long assetIconId, @QueryParam("gameData") String gameData, @QueryParam("gameDataSuffix") String gameDataSuffix, @QueryParam("visibility") String visibility, @QueryParam("friendGroup") Boolean friendGroup, @QueryParam("connectionIds") String connectionIds, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("balance") Double balance, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("tutorialTitle") String tutorialTitle, @QueryParam("tutorialMessage") String tutorialMessage, @QueryParam("tutorialAlignment") String tutorialAlignment, @QueryParam("tutorialImageAssetId") Long tutorialImageAssetId, @QueryParam("offerId") Long offerId, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateGameLevel(version,accountId,levelId,appKey,name,description,difficulty,appVersion,assetImageId,assetIconId,gameData,gameDataSuffix,visibility,friendGroup,connectionIds,connectionGroupIds,balance,active,allocateTickets,ticketCount,ticketType,points,tutorialTitle,tutorialMessage,tutorialAlignment,tutorialImageAssetId,offerId,metaData,securityContext);
    }
    @POST
    @Path("/leaderboard/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", notes = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation", response = LeaderboardResponse.class, tags={ "Leaderboard", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = LeaderboardResponse.class) })
    public Response updateLeaderboard( @PathParam("version") BigDecimal version, @NotNull @QueryParam("leaderboardId") Long leaderboardId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("rankType") String rankType, @QueryParam("leaderboardMode") String leaderboardMode, @QueryParam("sortField") String sortField, @QueryParam("iconMedia") File iconMedia, @QueryParam("iconAssetId") Long iconAssetId, @QueryParam("bannerMedia") File bannerMedia, @QueryParam("bannerAssetId") Long bannerAssetId, @QueryParam("limitation") Integer limitation, @QueryParam("active") Boolean active, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLeaderboard(version,leaderboardId,accountId,appKey,rankType,leaderboardMode,sortField,iconMedia,iconAssetId,bannerMedia,bannerAssetId,limitation,active,title,description,metaData,securityContext);
    }
    @POST
    @Path("/listing/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Listing", notes = "Updates a listing.", response = ListingFullResponse.class, tags={ "Listing", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ListingFullResponse.class) })
    public Response updateListing( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("listingId") Long listingId, @QueryParam("filterIds") String filterIds, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("locationName") String locationName, @QueryParam("locationDescription") String locationDescription, @QueryParam("isPrivate") Boolean isPrivate, @QueryParam("externalId") String externalId, @QueryParam("externalId2") String externalId2, @QueryParam("externalGroupId") String externalGroupId, @QueryParam("active") Boolean active, @QueryParam("metaData") String metaData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateListing(version,accountId,listingId,filterIds,name,description,start,end,locationName,locationDescription,isPrivate,externalId,externalId2,externalGroupId,active,metaData,securityContext);
    }
    @POST
    @Path("/account/location/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Location", notes = "Update the account location", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateLocation( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("clientTime") Long clientTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocation(version,deviceId,accountId,latitude,longitude,clientTime,securityContext);
    }
    @POST
    @Path("/location/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing location", notes = "Update an existing location", response = SirqulResponse.class, tags={ "LocationApiV2", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateLocationV2( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Location body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocationV2(version,id,body,securityContext);
    }
    @POST
    @Path("/trip/{id}/locations")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Locations", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateLocations( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateLocations(version,id,body,securityContext);
    }
    @POST
    @Path("/media/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Media", notes = "Update a media offering.", response = MediaOfferResponse.class, tags={ "Media", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MediaOfferResponse.class) })
    public Response updateMedia( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("mediaId") Long mediaId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint,, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("parentalRating") String parentalRating,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMedia(version,accountId,mediaId,retailerLocationIds,offerLocations,title,subTitle,details,subDetails,finePrint,barcodeType,barcodeEntry,externalRedeemOptions,externalUrl,ticketsRewardType,ticketsReward,activated,expires,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPriceType,ticketPrice,fullPrice,discountPrice,showRemaining,showRedeemed,replaced,featured,specialOfferType,offerVisibility,categoryIds,filterIds,active,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,conditionType,isbn,asin,catalogNumbers,availabilityDate,parentalRating,mediaType,duration,author,releaseDate,collectionIds,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/mission/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission", notes = "Update a mission.", response = MissionResponse.class, tags={ "Mission", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response updateMission( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("subType") String subType, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("active") Boolean active, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("creativeIds") String creativeIds, @QueryParam("audienceIds") String audienceIds, @QueryParam("offerId") Long offerId, @QueryParam("balance") Double balance, @QueryParam("advancedReporting") Boolean advancedReporting, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketCount") Long ticketCount, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("applicationIds") String applicationIds, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMission(version,accountId,missionId,title,description,subType,metaData,startDate,endDate,active,gameLevelIds,creativeIds,audienceIds,offerId,balance,advancedReporting,allocateTickets,ticketCount,ticketType,points,applicationIds,devices,deviceIds,deviceVersions,locations,radius,securityContext);
    }
    @POST
    @Path("/mission/invite/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Mission Invite", notes = "Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.", response = MissionResponse.class, tags={ "Mission Invite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = MissionResponse.class) })
    public Response updateMissionInvite( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appKey") String appKey, @QueryParam("missionId") Long missionId, @QueryParam("missionInviteId") Long missionInviteId, @QueryParam("packId") Long packId, @QueryParam("gameLevelId") Long gameLevelId, @QueryParam("status") String status, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("includeGameData") Boolean includeGameData,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateMissionInvite(version,deviceId,accountId,appKey,missionId,missionInviteId,packId,gameLevelId,status,permissionableType,permissionableId,includeGameData,securityContext);
    }
    @POST
    @Path("/thirdparty/network/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Network", notes = "Updates a custom third party network. Only the network owners and managers have access to this.", response = ThirdPartyNetworkResponse.class, tags={ "ThirdParty Credentials", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ThirdPartyNetworkResponse.class) })
    public Response updateNetwork( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("networkUID") String networkUID, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("enableIntrospection") Boolean enableIntrospection, @QueryParam("introspectionMethod") String introspectionMethod, @QueryParam("introspectionURL") String introspectionURL, @QueryParam("introspectionParams") String introspectionParams, @QueryParam("requiredRootField") String requiredRootField, @QueryParam("enableMFA") Boolean enableMFA, @QueryParam("sizeMFA") Integer sizeMFA, @QueryParam("shelfLifeMFA") Integer shelfLifeMFA, @QueryParam("oauthTokenURL") String oauthTokenURL, @QueryParam("oauthPrivateKey") File oauthPrivateKey, @QueryParam("oauthPublicKey") File oauthPublicKey, @QueryParam("oauthClientId") String oauthClientId, @QueryParam("oauthSecretKey") String oauthSecretKey,@ApiParam(value = "" ) @Valid String body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNetwork(version,accountId,networkUID,name,description,enableIntrospection,introspectionMethod,introspectionURL,introspectionParams,requiredRootField,enableMFA,sizeMFA,shelfLifeMFA,oauthTokenURL,oauthPrivateKey,oauthPublicKey,oauthClientId,oauthSecretKey,body,securityContext);
    }
    @POST
    @Path("/note/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Note", notes = "Update an existing comment (note). Only the creator of the note have permission to update.", response = NoteResponse.class, tags={ "Note", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NoteResponse.class) })
    public Response updateNote( @PathParam("version") BigDecimal version, @NotNull @QueryParam("noteId") Long noteId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("comment") String comment, @QueryParam("noteType") String noteType, @QueryParam("assetIds") String assetIds, @QueryParam("tags") String tags, @QueryParam("permissionableType") String permissionableType, @QueryParam("permissionableId") Long permissionableId, @QueryParam("appKey") String appKey, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("active") Boolean active, @QueryParam("updateAsset") Boolean updateAsset, @QueryParam("assetReturnNulls") Boolean assetReturnNulls, @QueryParam("assetAlbumId") Long assetAlbumId, @QueryParam("assetCollectionId") Long assetCollectionId, @QueryParam("assetAddToDefaultAlbum") String assetAddToDefaultAlbum, @QueryParam("assetAddToMediaLibrary") Boolean assetAddToMediaLibrary, @QueryParam("assetVersionCode") Integer assetVersionCode, @QueryParam("assetVersionName") String assetVersionName, @QueryParam("assetMetaData") String assetMetaData, @QueryParam("assetCaption") String assetCaption, @QueryParam("assetMedia") File assetMedia, @QueryParam("assetMediaUrl") String assetMediaUrl, @QueryParam("assetMediaString") String assetMediaString, @QueryParam("assetMediaStringFileName") String assetMediaStringFileName, @QueryParam("assetMediaStringContentType") String assetMediaStringContentType, @QueryParam("assetAttachedMedia") File assetAttachedMedia, @QueryParam("assetAttachedMediaUrl") String assetAttachedMediaUrl, @QueryParam("assetAttachedMediaString") String assetAttachedMediaString, @QueryParam("assetAttachedMediaStringFileName") String assetAttachedMediaStringFileName, @QueryParam("assetAttachedMediaStringContentType") String assetAttachedMediaStringContentType, @QueryParam("assetLocationDescription") String assetLocationDescription, @QueryParam("assetApp") String assetApp, @QueryParam("assetSearchTags") String assetSearchTags, @QueryParam("assetLatitude") Double assetLatitude, @QueryParam("assetLongitude") Double assetLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNote(version,noteId,deviceId,accountId,comment,noteType,assetIds,tags,permissionableType,permissionableId,appKey,locationDescription,latitude,longitude,metaData,returnFullResponse,active,updateAsset,assetReturnNulls,assetAlbumId,assetCollectionId,assetAddToDefaultAlbum,assetAddToMediaLibrary,assetVersionCode,assetVersionName,assetMetaData,assetCaption,assetMedia,assetMediaUrl,assetMediaString,assetMediaStringFileName,assetMediaStringContentType,assetAttachedMedia,assetAttachedMediaUrl,assetAttachedMediaString,assetAttachedMediaStringFileName,assetAttachedMediaStringContentType,assetLocationDescription,assetApp,assetSearchTags,assetLatitude,assetLongitude,securityContext);
    }
    @POST
    @Path("/notification/template/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Notification Template", notes = "Update a notification template. Developers will only be able to update notification templates for their own applications.", response = NotificationTemplateResponse.class, tags={ "Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = NotificationTemplateResponse.class) })
    public Response updateNotificationTemplate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("notificationTemplateId") Long notificationTemplateId, @QueryParam("title") String title, @QueryParam("body") String body, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateNotificationTemplate(version,accountId,notificationTemplateId,title,body,tags,securityContext);
    }
    @POST
    @Path("/retailer/offer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer", notes = "Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.", response = RetailerOfferResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerOfferResponse.class) })
    public Response updateOffer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerId") Long offerId, @NotNull @QueryParam("includeOfferLocations") Boolean includeOfferLocations, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("parentOfferId") Long parentOfferId, @QueryParam("retailerLocationIds") String retailerLocationIds, @QueryParam("offerLocations") String offerLocations, @QueryParam("tags") String tags, @QueryParam("title") String title, @QueryParam("subTitle") String subTitle, @QueryParam("details") String details, @QueryParam("subDetails") String subDetails, @QueryParam("finePrint") String finePrint,, allowableValues="NONE, UPC, CODE_128, QR, CUSTOM_MEDIA" @QueryParam("barcodeType") String barcodeType, @QueryParam("barcodeEntry") String barcodeEntry, @QueryParam("externalRedeemOptions") String externalRedeemOptions, @QueryParam("externalUrl") String externalUrl, @QueryParam("externalId") String externalId, @QueryParam("ticketsRewardType") String ticketsRewardType, @QueryParam("ticketsReward") Long ticketsReward, @QueryParam("activated") Long activated, @QueryParam("expires") Long expires, @QueryParam("noExpiration") Boolean noExpiration, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("availableLimitPerUser") Integer availableLimitPerUser, @QueryParam("addedLimit") Integer addedLimit, @QueryParam("viewLimit") Integer viewLimit, @QueryParam("maxPrints") Integer maxPrints, @QueryParam("ticketPriceType") String ticketPriceType, @QueryParam("ticketPrice") Long ticketPrice, @QueryParam("fullPrice") Double fullPrice, @QueryParam("discountPrice") Double discountPrice, @QueryParam("showRemaining") Boolean showRemaining, @QueryParam("showRedeemed") Boolean showRedeemed, @QueryParam("replaced") Boolean replaced, @QueryParam("featured") Boolean featured,, allowableValues="VOUCHER, COUPON, PRODUCT, MEDIA, EVENT, DEVICE" @QueryParam("offerType") String offerType,, allowableValues="ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW, SQOOT, TICKETS, YIPIT" @QueryParam("specialOfferType") String specialOfferType,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("offerVisibility") String offerVisibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("active") Boolean active, @QueryParam("barcodeAssetId") Long barcodeAssetId, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("imageAssetId1") Long imageAssetId1, @QueryParam("imageAssetId2") Long imageAssetId2, @QueryParam("imageAssetId3") Long imageAssetId3, @QueryParam("imageAssetId4") Long imageAssetId4, @QueryParam("imageAssetId5") Long imageAssetId5, @QueryParam("publisher") String publisher, @QueryParam("redeemableStart") Long redeemableStart, @QueryParam("redeemableEnd") Long redeemableEnd, @QueryParam("brand") String brand,, allowableValues="APPAREL, APPLIANCES, APPS, ARTS_CRAFTS, AUTOMOTIVE, BABY, BEAUTY, BOOKS, CLASSICAL, COLLECTIBLES, DVD, ELECTRONICS, GIFT_CARDS, GOURMET_FOOD, GROCERY, HEALTH_PERSONAL_CARE, HOME_GARDEN, INDUSTRIAL, JEWELRY, KITCHEN, LAWN_GARDEN, MAGAZINES, MISCELLANEOUS, MUSICAL_INSTRUMENTS, OFFICE_PRODUCTS, OTHER, OUTDOOR_LIVING, PC_HARDWARE, PET_SUPPLIES, SHOES, SOFTWARE, SPORTING_GOODS, TOOLS, TOYS, VIDEO_GAMES, WATCHES, WIRELESS, WIRELESS_ACCESSORIES" @QueryParam("productType") String productType,, allowableValues="NEW, USED, REFURBISHED, OTHER" @QueryParam("conditionType") String conditionType, @QueryParam("isbn") String isbn, @QueryParam("asin") String asin, @QueryParam("catalogNumbers") String catalogNumbers, @QueryParam("department") String department, @QueryParam("features") String features, @QueryParam("minimumPrice") Double minimumPrice, @QueryParam("width") Double width, @QueryParam("height") Double height, @QueryParam("depth") Double depth, @QueryParam("weight") Double weight,, allowableValues="MILIMETER, CENTIMETER, METER, INCH, FOOT, YARD" @QueryParam("unit") String unit, @QueryParam("studio") String studio, @QueryParam("parentalRating") String parentalRating, @QueryParam("publishDate") Long publishDate, @QueryParam("availabilityDate") Long availabilityDate, @QueryParam("sizeId") Long sizeId, @QueryParam("listingId") Long listingId,, allowableValues="APK, APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, BAR_CODE, TEXT, OTHER" @QueryParam("mediaType") String mediaType, @QueryParam("duration") Integer duration, @QueryParam("author") String author, @QueryParam("releaseDate") Long releaseDate, @QueryParam("collectionIds") String collectionIds, @QueryParam("rebootTimeHour") Integer rebootTimeHour, @QueryParam("rebootTimeMinute") Integer rebootTimeMinute, @QueryParam("idleTimeoutInSecond") Integer idleTimeoutInSecond, @QueryParam("serialNumber") String serialNumber, @QueryParam("udid") String udid, @QueryParam("deviceType") String deviceType, @QueryParam("devicePower") Double devicePower, @QueryParam("deviceInterference") Double deviceInterference, @QueryParam("availability") String availability, @QueryParam("availabilitySummary") String availabilitySummary,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOffer(version,offerId,includeOfferLocations,deviceId,accountId,parentOfferId,retailerLocationIds,offerLocations,tags,title,subTitle,details,subDetails,finePrint,barcodeType,barcodeEntry,externalRedeemOptions,externalUrl,externalId,ticketsRewardType,ticketsReward,activated,expires,noExpiration,availableLimit,availableLimitPerUser,addedLimit,viewLimit,maxPrints,ticketPriceType,ticketPrice,fullPrice,discountPrice,showRemaining,showRedeemed,replaced,featured,offerType,specialOfferType,offerVisibility,categoryIds,filterIds,active,barcodeAssetId,imageAssetId,imageAssetId1,imageAssetId2,imageAssetId3,imageAssetId4,imageAssetId5,publisher,redeemableStart,redeemableEnd,brand,productType,conditionType,isbn,asin,catalogNumbers,department,features,minimumPrice,width,height,depth,weight,unit,studio,parentalRating,publishDate,availabilityDate,sizeId,listingId,mediaType,duration,author,releaseDate,collectionIds,rebootTimeHour,rebootTimeMinute,idleTimeoutInSecond,serialNumber,udid,deviceType,devicePower,deviceInterference,availability,availabilitySummary,securityContext);
    }
    @POST
    @Path("/retailer/offer/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Activate Offer", notes = "Sets the activated date on offers. This will make offers visible for consumers.", response = SirqulResponse.class, tags={ "Offer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateOfferStatus( @PathParam("version") BigDecimal version, @NotNull @QueryParam("offerIds") String offerIds, @NotNull @QueryParam("active") Boolean active, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferStatus(version,offerIds,active,deviceId,accountId,securityContext);
    }
    @POST
    @Path("/wallet/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Wallet Offer", notes = "Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.", response = OfferTransactionResponse.class, tags={ "Wallet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionResponse.class) })
    public Response updateOfferTransaction( @PathParam("version") BigDecimal version, @NotNull @QueryParam("transactionId") Long transactionId, @NotNull @QueryParam("status") Integer status, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("offerLocationId") Long offerLocationId, @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("usePoints") Boolean usePoints, @QueryParam("appKey") String appKey, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @DefaultValue("false") @QueryParam("returnFullResponse") Boolean returnFullResponse, @QueryParam("exceptionMembershipOfferIds") String exceptionMembershipOfferIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferTransaction(version,transactionId,status,deviceId,accountId,offerLocationId,currencyType,usePoints,appKey,latitude,longitude,metaData,returnFullResponse,exceptionMembershipOfferIds,securityContext);
    }
    @POST
    @Path("/offer/status/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Offer Status", notes = "Update an offer status record", response = OfferTransactionStatusResponse.class, tags={ "Offer Status", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferTransactionStatusResponse.class) })
    public Response updateOfferTransactionStatus( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("statusId") Long statusId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("code") Integer code, @QueryParam("role") String role, @QueryParam("active") Boolean active, @QueryParam("applicationIds") String applicationIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOfferTransactionStatus(version,deviceId,accountId,latitude,longitude,statusId,name,description,code,role,active,applicationIds,securityContext);
    }
    @POST
    @Path("/order/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Order", notes = "Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.", response = OrderResponse.class, tags={ "Purchase Order", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrderResponse.class) })
    public Response updateOrder( @PathParam("version") BigDecimal version, @NotNull @QueryParam("orderId") Long orderId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("cart") String cart, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("paymentTransactionId") Long paymentTransactionId, @QueryParam("description") String description,, allowableValues="VOID, CASH, POINTS, TICKETS, REFUND, CREDIT, RELOAD" @DefaultValue("CASH") @QueryParam("currencyType") String currencyType, @QueryParam("paymentMethodId") Long paymentMethodId, @QueryParam("externalPaymentId") String externalPaymentId, @QueryParam("externalDate") Long externalDate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateOrder(version,orderId,appKey,cart,deviceId,accountId,paymentTransactionId,description,currencyType,paymentMethodId,externalPaymentId,externalDate,securityContext);
    }
    @POST
    @Path("/pack/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Pack", notes = "Update a pack.", response = PackResponse.class, tags={ "Pack", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PackResponse.class) })
    public Response updatePack( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("packId") Long packId, @NotNull @QueryParam("allocateTickets") Boolean allocateTickets, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("title") String title, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("active") Boolean active, @QueryParam("gameType") String gameType, @QueryParam("appKey") String appKey,, allowableValues="TUTORIAL, BUILTIN, DOWNLOAD, THRESHOLD, THEME, TOURNAMENT" @QueryParam("packType") String packType, @QueryParam("packOrder") Long packOrder,, allowableValues="FIRST_AVAILABLE, ALL_AVAILABLE" @QueryParam("sequenceType") String sequenceType, @QueryParam("backgroundId") Long backgroundId, @QueryParam("imageId") Long imageId, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("authorOverride") String authorOverride, @QueryParam("price") Integer price, @QueryParam("priceType") String priceType, @QueryParam("gameLevelIds") String gameLevelIds, @QueryParam("inGame") Boolean inGame, @QueryParam("highest") Boolean highest, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePack(version,accountId,packId,allocateTickets,ticketCount,title,description,searchTags,active,gameType,appKey,packType,packOrder,sequenceType,backgroundId,imageId,startDate,endDate,authorOverride,price,priceType,gameLevelIds,inGame,highest,ticketType,points,securityContext);
    }
    @POST
    @Path("/persona/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Persona", notes = "Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.", response = PreviewPersonaResponse.class, tags={ "Preview Persona", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PreviewPersonaResponse.class) })
    public Response updatePersona( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("personaId") Long personaId, @QueryParam("title") String title, @QueryParam("previewAccounts") String previewAccounts, @QueryParam("active") Boolean active, @QueryParam("date") Long date, @QueryParam("age") Integer age, @QueryParam("gender") String gender, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePersona(version,accountId,personaId,title,previewAccounts,active,date,age,gender,gameExperienceLevel,latitude,longitude,securityContext);
    }
    @POST
    @Path("/postalCode/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Postal Code", notes = "Update a Postal Code", response = PostalCodeResponse.class, tags={ "Postal Code", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PostalCodeResponse.class) })
    public Response updatePostalCode( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("postalCodeId") Long postalCodeId, @QueryParam("code") String code, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("stateCode") String stateCode, @QueryParam("city") String city, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePostalCode(version,accountId,postalCodeId,code,latitude,longitude,stateCode,city,active,securityContext);
    }
    @POST
    @Path("/purchase/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Purchase", notes = "Updates a purchase item for in app purchases", response = PurchaseItemFullResponse.class, tags={ "Purchase Item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = PurchaseItemFullResponse.class) })
    public Response updatePurchaseItem( @PathParam("version") BigDecimal version, @NotNull @QueryParam("purchaseItemId") Long purchaseItemId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("tickets") Integer tickets, @QueryParam("price") Float price,, allowableValues="SIRQUL, IOS, GOOGLE, AMAZON, MAC, WP8, FREE" @QueryParam("purchaseType") String purchaseType, @QueryParam("purchaseCode") String purchaseCode, @QueryParam("secretKey") String secretKey, @QueryParam("purchaseLimit") Integer purchaseLimit,, allowableValues="DAY_PREMIUM, WEEK_PREMIUM, MONTH_PREMIUM, YEAR_PREMIUM, LIFETIME_PREMIUM, ADD_TICKET, ADD_GIFT, ADD_POINTS" @QueryParam("serviceAction") String serviceAction, @QueryParam("coverAssetId") Long coverAssetId, @QueryParam("promoAssetId") Long promoAssetId, @QueryParam("giftable") Boolean giftable, @QueryParam("assetable") Boolean assetable, @QueryParam("active") Boolean active, @DefaultValue("false") @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points, @QueryParam("offerLocationId") Long offerLocationId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updatePurchaseItem(version,purchaseItemId,deviceId,accountId,name,description,tickets,price,purchaseType,purchaseCode,secretKey,purchaseLimit,serviceAction,coverAssetId,promoAssetId,giftable,assetable,active,allocateTickets,ticketType,points,offerLocationId,securityContext);
    }
    @POST
    @Path("/game/question/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Question", notes = "Update a question and related answers.", response = QuestionResponse.class, tags={ "Question", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = QuestionResponse.class) })
    public Response updateQuestion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("questionId") Long questionId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("ticketCount") Long ticketCount, @QueryParam("question") String question, @QueryParam("answers") String answers, @QueryParam("tags") String tags, @QueryParam("videoURL") String videoURL, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateQuestion(version,questionId,accountId,ticketCount,question,answers,tags,videoURL,assetId,active,allocateTickets,ticketType,points,securityContext);
    }
    @POST
    @Path("/level/questions/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Questions", notes = "Updates a level with question game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateQuestionsInLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("questionIds") String questionIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateQuestionsInLevel(version,levelId,accountId,questionIds,securityContext);
    }
    @POST
    @Path("/ranking/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Ranking", notes = "Update the rank value ", response = SirqulResponse.class, tags={ "Ranking", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateRankings( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("rankType") String rankType, @DefaultValue("1") @QueryParam("increment") Long increment, @QueryParam("timeIncrement") Long timeIncrement, @QueryParam("tag") String tag, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("updateGlobal") Boolean updateGlobal, @DefaultValue("false") @QueryParam("createLeaderboard") Boolean createLeaderboard,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRankings(version,accountId,appKey,rankType,increment,timeIncrement,tag,startDate,endDate,updateGlobal,createLeaderboard,securityContext);
    }
    @POST
    @Path("/rating/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Rating", notes = "Update an existing rating. Only the creator of the rating have permission to update.", response = RatingResponse.class, tags={ "Rating", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RatingResponse.class) })
    public Response updateRating( @PathParam("version") BigDecimal version, @NotNull @QueryParam("ratingId") Long ratingId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("ratingValue") Integer ratingValue, @QueryParam("categoryId") Long categoryId, @QueryParam("display") String display, @QueryParam("description") String description, @QueryParam("locationDescription") String locationDescription, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRating(version,ratingId,deviceId,accountId,ratingValue,categoryId,display,description,locationDescription,latitude,longitude,securityContext);
    }
    @POST
    @Path("/trip/{id}/locations/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Locations", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response updateRecurrenceLocations( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRecurrenceLocations(version,id,body,securityContext);
    }
    @POST
    @Path("/trip/{id}/shipments/recurrence")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Recurrence Shipments", notes = "", response = Trip.class, responseContainer = "List", tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class, responseContainer = "List") })
    public Response updateRecurrenceShipments( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRecurrenceShipments(version,id,body,securityContext);
    }
    @POST
    @Path("/region/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Region", notes = "Update a region.", response = RegionResponse.class, tags={ "Region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RegionResponse.class) })
    public Response updateRegion( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("regionId") Long regionId, @QueryParam("regionClass") String regionClass, @QueryParam("shortName") String shortName, @QueryParam("fullName") String fullName, @QueryParam("parentIds") String parentIds, @QueryParam("childrenIds") String childrenIds, @QueryParam("postalCodeIds") String postalCodeIds, @QueryParam("locations") String locations, @QueryParam("retailerLocationId") Long retailerLocationId,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("start") Long start, @QueryParam("end") Long end, @QueryParam("polygon") String polygon, @QueryParam("metaData") String metaData, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("versionCode") Integer versionCode, @QueryParam("root") Boolean root, @QueryParam("active") Boolean active, @QueryParam("clearLists") Boolean clearLists,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRegion(version,accountId,regionId,regionClass,shortName,fullName,parentIds,childrenIds,postalCodeIds,locations,retailerLocationId,visibility,categoryIds,filterIds,start,end,polygon,metaData,latitude,longitude,versionCode,root,active,clearLists,securityContext);
    }
    @POST
    @Path("/retailer/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Retailer", notes = "Update a retailer record. Only the owner and the employees of the retailer have access to update its information.", response = RetailerFullResponse.class, tags={ "Retailer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerFullResponse.class) })
    public Response updateRetailer( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerId") Long retailerId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("facebookUrl") String facebookUrl, @QueryParam("twitterUrl") String twitterUrl, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("metaData") String metaData, @QueryParam("searchTags") String searchTags, @QueryParam("retailerType") String retailerType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRetailer(version,retailerId,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,facebookUrl,twitterUrl,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,metaData,searchTags,retailerType,visibility,active,responseFormat,securityContext);
    }
    @POST
    @Path("/retailer/location/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Retailer Location", notes = "Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.", response = RetailerLocationResponse.class, tags={ "Retailer Location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RetailerLocationResponse.class) })
    public Response updateRetailerLocations( @PathParam("version") BigDecimal version, @NotNull @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("streetAddress") String streetAddress, @QueryParam("streetAddress2") String streetAddress2, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country, @QueryParam("businessPhone") String businessPhone, @QueryParam("businessPhoneExt") String businessPhoneExt, @QueryParam("website") String website, @QueryParam("email") String email, @QueryParam("internalId") String internalId, @QueryParam("detailsHeader") String detailsHeader, @QueryParam("detailsBody") String detailsBody, @QueryParam("hours") String hours, @QueryParam("logo") File logo, @QueryParam("logoAssetId") Long logoAssetId, @QueryParam("picture1") File picture1, @QueryParam("picture1AssetId") Long picture1AssetId, @QueryParam("picture2") File picture2, @QueryParam("picture2AssetId") Long picture2AssetId, @QueryParam("categoryIds") String categoryIds, @QueryParam("filterIds") String filterIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("building") String building, @QueryParam("googlePlaceId") String googlePlaceId, @QueryParam("yelpId") String yelpId, @QueryParam("metaData") String metaData, @QueryParam("paymentProvider") String paymentProvider, @QueryParam("active") Boolean active, @QueryParam("publicLocation") Boolean publicLocation, @QueryParam("locationType") String locationType, @QueryParam("audienceIds") String audienceIds, @QueryParam("audienceIdsToAdd") String audienceIdsToAdd, @QueryParam("audienceIdsToRemove") String audienceIdsToRemove,, allowableValues="HTML, XML, JSON, CSV" @QueryParam("responseFormat") String responseFormat, @QueryParam("tags") String tags,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRetailerLocations(version,retailerLocationId,deviceId,accountId,name,streetAddress,streetAddress2,city,state,postalCode,country,businessPhone,businessPhoneExt,website,email,internalId,detailsHeader,detailsBody,hours,logo,logoAssetId,picture1,picture1AssetId,picture2,picture2AssetId,categoryIds,filterIds,latitude,longitude,building,googlePlaceId,yelpId,metaData,paymentProvider,active,publicLocation,locationType,audienceIds,audienceIdsToAdd,audienceIdsToRemove,responseFormat,tags,securityContext);
    }
    @PUT
    @Path("/route/{routeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route", notes = "Update an existing route", response = Route.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Route.class) })
    public Response updateRoute( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId,@ApiParam(value = "" ) @Valid Route body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRoute(version,routeId,body,securityContext);
    }
    @PUT
    @Path("/route/setting/{routeSettingsId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Route Setting", notes = "Update an existing route setting", response = RouteSettings.class, tags={ "Route Setting", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RouteSettings.class) })
    public Response updateRouteSettings( @PathParam("version") BigDecimal version, @PathParam("routeSettingsId") Long routeSettingsId,@ApiParam(value = "" ) @Valid RouteSettings body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRouteSettings(version,routeSettingsId,body,securityContext);
    }
    @PUT
    @Path("/route/{routeId}/stop/{stopId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Route Stop", notes = "Update a stop on a specified route", response = Void.class, tags={ "Route", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateRouteStop( @PathParam("version") BigDecimal version, @PathParam("routeId") Long routeId, @PathParam("stopId") Long stopId,@ApiParam(value = "" ) @Valid Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateRouteStop(version,routeId,stopId,body,securityContext);
    }
    @POST
    @Path("/notification/schedule/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Scheduled Notification", notes = "This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi.", response = ScheduledNotificationFullResponse.class, tags={ "Scheduled Notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = ScheduledNotificationFullResponse.class) })
    public Response updateScheduledNotification( @PathParam("version") BigDecimal version, @NotNull @QueryParam("scheduledNotificationId") Long scheduledNotificationId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("type") String type, @QueryParam("message") String message, @QueryParam("payload") String payload, @QueryParam("contentId") Long contentId, @QueryParam("contentName") String contentName, @QueryParam("contentType") String contentType, @QueryParam("parentId") Long parentId, @QueryParam("parentType") String parentType, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("connectionGroupIds") String connectionGroupIds, @QueryParam("connectionAccountIds") String connectionAccountIds, @QueryParam("audienceId") Long audienceId, @QueryParam("audienceIds") String audienceIds, @QueryParam("albumIds") String albumIds, @QueryParam("reportId") Long reportId, @QueryParam("reportParams") String reportParams, @QueryParam("endpointURL") String endpointURL, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("cronType") String cronType, @QueryParam("metaData") String metaData, @QueryParam("conditionalInput") String conditionalInput, @QueryParam("templateType") String templateType,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active, @QueryParam("errorMessage") String errorMessage, @QueryParam("status") String status, @QueryParam("updateByGroupingId") Boolean updateByGroupingId, @QueryParam("sendNow") Boolean sendNow, @DefaultValue("CUSTOM") @QueryParam("eventType") String eventType, @QueryParam("deepLinkURI") String deepLinkURI, @QueryParam("sendToAll") Boolean sendToAll,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateScheduledNotification(version,scheduledNotificationId,accountId,name,type,message,payload,contentId,contentName,contentType,parentId,parentType,appKey,groupingId,connectionGroupIds,connectionAccountIds,audienceId,audienceIds,albumIds,reportId,reportParams,endpointURL,scheduledDate,startDate,endDate,cronExpression,cronType,metaData,conditionalInput,templateType,visibility,active,errorMessage,status,updateByGroupingId,sendNow,eventType,deepLinkURI,sendToAll,securityContext);
    }
    @POST
    @Path("/secure/application/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Secure Application", notes = "Update a secure application record.", response = SirqulResponse.class, tags={ "SecureApp", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateSecureApplication( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @QueryParam("active") Boolean active, @QueryParam("keyCert") File keyCert, @QueryParam("trustStore") File trustStore, @QueryParam("username") String username, @QueryParam("password") String password,, allowableValues="FINGERPRINT, IRIS, FACIAL" @QueryParam("biometricType") String biometricType,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @QueryParam("biometricPosition") String biometricPosition,, allowableValues="UNKNOWN, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE, LEFT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, RIGHT_THUMB, LEFT, RIGHT" @QueryParam("biometricPosition2") String biometricPosition2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSecureApplication(version,accountId,appKey,active,keyCert,trustStore,username,password,biometricType,biometricPosition,biometricPosition2,securityContext);
    }
    @POST
    @Path("/account/settings/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Account Settings", notes = "Update the account settings for a user", response = UserSettingsResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserSettingsResponse.class) })
    public Response updateSettings( @PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("blockedNotifications") String blockedNotifications, @QueryParam("suggestionMethod") String suggestionMethod, @QueryParam("suggestionCount") Integer suggestionCount, @QueryParam("suggestionTimeFrame") Integer suggestionTimeFrame, @QueryParam("showOthersExactLocation") Boolean showOthersExactLocation, @QueryParam("showAsZipcode") Boolean showAsZipcode, @QueryParam("showExactLocation") Boolean showExactLocation, @QueryParam("favoriteVisibility") String favoriteVisibility, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSettings(version,deviceId,accountId,blockedNotifications,suggestionMethod,suggestionCount,suggestionTimeFrame,showOthersExactLocation,showAsZipcode,showExactLocation,favoriteVisibility,latitude,longitude,securityContext);
    }
    @PUT
    @Path("/shipment/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Shipment", notes = "Update an existing shipment", response = Shipment.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Shipment.class) })
    public Response updateShipment( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Shipment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipment(version,id,body,securityContext);
    }
    @POST
    @Path("/shipment/{id}/status")
    
    
    @io.swagger.annotations.ApiOperation(value = "Uupdate Shipment Status", notes = "Update status of an existing shipment", response = Void.class, tags={ "Shipment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateShipmentStatus( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Map<String, Boolean> body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipmentStatus(version,id,body,securityContext);
    }
    @POST
    @Path("/trip/{id}/shipments")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip Shipments", notes = "", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateShipments( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateShipments(version,id,body,securityContext);
    }
    @POST
    @Path("/vatom/b/spaces/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Space", notes = "Update a Vatom space.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateSpace( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomSpaceId") String vatomSpaceId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSpace(version,accountId,appKey,vatomSpaceId,vatomParameters,returnRawResponse,securityContext);
    }
    @PUT
    @Path("/stop/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Stop", notes = "Update an existing stop", response = Stop.class, tags={ "Stop", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Stop.class) })
    public Response updateStop( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Stop body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateStop(version,id,body,securityContext);
    }
    @POST
    @Path("/subscription/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Subscription", notes = "Updates the subscription for the billable entity for an account", response = SubscriptionResponse.class, tags={ "Subscription", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SubscriptionResponse.class) })
    public Response updateSubscription( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("planId") Long planId, @QueryParam("promoCode") String promoCode, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateSubscription(version,accountId,planId,promoCode,active,securityContext);
    }
    @POST
    @Path("/task/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Task", notes = "Update a Task", response = TaskResponse.class, tags={ "Task", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TaskResponse.class) })
    public Response updateTask( @PathParam("version") BigDecimal version, @NotNull @QueryParam("taskId") Long taskId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTask(version,taskId,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,visibility,active,securityContext);
    }
    @POST
    @Path("/territory/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Territory", notes = "Updates a territory.", response = TerritoryResponse.class, tags={ "Territory", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TerritoryResponse.class) })
    public Response updateTerritory( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("territoryId") Long territoryId, @QueryParam("name") String name, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTerritory(version,accountId,territoryId,name,active,securityContext);
    }
    @POST
    @Path("/tournament/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Tournament", notes = "Update a tournament.", response = TournamentResponse.class, tags={ "Tournament", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TournamentResponse.class) })
    public Response updateTournament( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("missionId") Long missionId, @QueryParam("title") String title, @QueryParam("subType") String subType, @QueryParam("imageAssetId") Long imageAssetId, @QueryParam("secondsBetweenLevels") Integer secondsBetweenLevels, @QueryParam("secondsForTieBreaker") Integer secondsForTieBreaker, @QueryParam("secondsBetweenPacks") Integer secondsBetweenPacks, @QueryParam("maximumLevelLength") Integer maximumLevelLength, @QueryParam("costToPlay") Integer costToPlay, @QueryParam("costToPlayType") String costToPlayType, @QueryParam("minimumToPlay") Integer minimumToPlay, @QueryParam("startingLimit") Integer startingLimit, @QueryParam("availableLimit") Integer availableLimit, @QueryParam("description") String description, @QueryParam("metaData") String metaData, @QueryParam("startDate") Long startDate, @QueryParam("audienceIds") String audienceIds, @QueryParam("active") Boolean active, @QueryParam("enableBuyBack") Boolean enableBuyBack, @QueryParam("offerIds") String offerIds, @QueryParam("offerAssetId") Long offerAssetId, @QueryParam("fixedReward") Boolean fixedReward,, allowableValues="EVEN, ALL, FIRST, RANDOM" @QueryParam("splitReward") String splitReward, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("tournamentData") String tournamentData,, allowableValues="PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE" @QueryParam("visibility") String visibility, @QueryParam("preliminaryGroups") Integer preliminaryGroups, @QueryParam("preliminaryGroupAdvancements") String preliminaryGroupAdvancements, @QueryParam("enableMultipleEntries") Boolean enableMultipleEntries, @QueryParam("enableMultipleVotes") Boolean enableMultipleVotes, @QueryParam("featured") Boolean featured, @QueryParam("winnerTag") String winnerTag, @QueryParam("tieTag") String tieTag,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTournament(version,accountId,missionId,title,subType,imageAssetId,secondsBetweenLevels,secondsForTieBreaker,secondsBetweenPacks,maximumLevelLength,costToPlay,costToPlayType,minimumToPlay,startingLimit,availableLimit,description,metaData,startDate,audienceIds,active,enableBuyBack,offerIds,offerAssetId,fixedReward,splitReward,allocateTickets,tournamentData,visibility,preliminaryGroups,preliminaryGroupAdvancements,enableMultipleEntries,enableMultipleVotes,featured,winnerTag,tieTag,securityContext);
    }
    @POST
    @Path("/trigger/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trigger", notes = "Update a trigger", response = TriggerResponse.class, tags={ "Trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TriggerResponse.class) })
    public Response updateTrigger( @PathParam("version") BigDecimal version, @NotNull @QueryParam("triggerId") Long triggerId, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("name") String name, @QueryParam("appKey") String appKey, @QueryParam("groupingId") String groupingId, @QueryParam("endpointURL") String endpointURL, @QueryParam("payload") String payload, @QueryParam("scheduledDate") Long scheduledDate, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("cronExpression") String cronExpression, @QueryParam("conditionalInput") String conditionalInput,, allowableValues="PUBLIC, PRIVATE, FRIENDS" @QueryParam("visibility") String visibility, @QueryParam("active") Boolean active,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTrigger(version,triggerId,accountId,name,appKey,groupingId,endpointURL,payload,scheduledDate,startDate,endDate,cronExpression,conditionalInput,visibility,active,securityContext);
    }
    @PUT
    @Path("/trip/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Trip", notes = "Update an existing trip. Does not support recurring trip update.", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateTrip( @PathParam("version") BigDecimal version, @PathParam("id") Long id,@ApiParam(value = "" ) @Valid Trip body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTrip(version,id,body,securityContext);
    }
    @POST
    @Path("/trip/notifications")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Trip Notifications", notes = "Update the trip notifications", response = Trip.class, tags={ "Trip", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Trip.class) })
    public Response updateTripNotifications( @PathParam("version") BigDecimal version, @NotNull @QueryParam("id") Long id, @QueryParam("notifications") String notifications,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateTripNotifications(version,id,notifications,securityContext);
    }
    @POST
    @Path("/achievement/progress/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Achievement Progress", notes = "Update user achievement progress.", response = SirqulResponse.class, tags={ "Achievement", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateUserAchievement( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @QueryParam("achievementId") Long achievementId, @QueryParam("tag") String tag, @QueryParam("customId") Long customId, @QueryParam("increment") Long increment, @QueryParam("startDate") Long startDate, @QueryParam("endDate") Long endDate, @QueryParam("returnProgress") Boolean returnProgress,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserAchievement(version,accountId,achievementId,tag,customId,increment,startDate,endDate,returnProgress,securityContext);
    }
    @POST
    @Path("/vatom/b/users/coins/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update the coins for a user (as a Business)", notes = "Update the coins for a user (as a Business).", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateUserCoinsAsBusiness( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomUserId") String vatomUserId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserCoinsAsBusiness(version,accountId,vatomUserId,appKey,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vatom/me/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom User Profile", notes = "Gets the logged in user's profile in Vatom.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateUserProfile( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateUserProfile(version,accountId,vatomParameters,returnRawResponse,securityContext);
    }
    @POST
    @Path("/vatom/b/events/update")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update Vatom Event", notes = "Update a Vatom event.", response = Void.class, tags={ "Vatom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class) })
    public Response updateVatomEvent( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("vatomEventId") String vatomEventId, @NotNull @QueryParam("vatomParameters") String vatomParameters, @QueryParam("returnRawResponse") Boolean returnRawResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVatomEvent(version,accountId,appKey,vatomEventId,vatomParameters,returnRawResponse,securityContext);
    }
    @PUT
    @Path("/vehicle/{id}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle", notes = "Update an existing vehicle", response = Vehicle.class, tags={ "Vehicle", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Vehicle.class) })
    public Response updateVehicle( @PathParam("version") BigDecimal version, @PathParam("id") Long id, @NotNull @QueryParam("vehicle") String vehicle,@ApiParam(value = "" ) @Valid Vehicle body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVehicle(version,id,vehicle,body,securityContext);
    }
    @PUT
    @Path("/vehicle/type/{vehicleTypeId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Vehicle Type", notes = "Update a vehicle type", response = VehicleType.class, tags={ "Vehicle Type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = VehicleType.class) })
    public Response updateVehicleType( @PathParam("version") BigDecimal version, @PathParam("vehicleTypeId") Long vehicleTypeId, @NotNull @QueryParam("vehicleType") String vehicleType,@ApiParam(value = "" ) @Valid VehicleType body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateVehicleType(version,vehicleTypeId,vehicleType,body,securityContext);
    }
    @POST
    @Path("/game/word/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Word", notes = "Update a word by the given params.", response = WordzWordResponse.class, tags={ "Word", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = WordzWordResponse.class) })
    public Response updateWord( @PathParam("version") BigDecimal version, @NotNull @QueryParam("wordId") Long wordId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @DefaultValue("0") @QueryParam("ticketCount") Long ticketCount, @QueryParam("wordText") String wordText, @QueryParam("definition") String definition, @QueryParam("assetId") Long assetId, @QueryParam("active") Boolean active, @QueryParam("allocateTickets") Boolean allocateTickets, @QueryParam("ticketType") String ticketType, @QueryParam("points") Long points,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateWord(version,wordId,accountId,ticketCount,wordText,definition,assetId,active,allocateTickets,ticketType,points,securityContext);
    }
    @POST
    @Path("/level/words/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Level Words", notes = "Updates a level with word game objects.", response = SirqulResponse.class, tags={ "Game Level", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response updateWordsInLevel( @PathParam("version") BigDecimal version, @NotNull @QueryParam("levelId") Long levelId, @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("wordIds") String wordIds,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateWordsInLevel(version,levelId,accountId,wordIds,securityContext);
    }
    @POST
    @Path("/application/certificate/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Application Certificate", notes = "Uploads a certificate for an application that the user has access to.", response = SirqulResponse.class, tags={ "Application", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response uploadApplicationCertificate( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("certificate") File certificate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadApplicationCertificate(version,appKey,deviceId,accountId,certificate,securityContext);
    }
    @POST
    @Path("/csvimport/upload")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Upload CSV", notes = "Uploads a CSV import file.", response = CsvImportResponse.class, tags={ "CSV Import", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = CsvImportResponse.class) })
    public Response uploadCSV( @PathParam("version") BigDecimal version, @NotNull @QueryParam("accountId") Long accountId, @NotNull, allowableValues="OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, FILTERS" @QueryParam("uploadType") String uploadType, @NotNull @QueryParam("importFile") File importFile, @NotNull, allowableValues="EXCEL, MYSQL, RFC4180, TDF" @QueryParam("fileFormat") String fileFormat, @QueryParam("appKey") String appKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadCSV(version,accountId,uploadType,importFile,fileFormat,appKey,securityContext);
    }
    @POST
    @Path("/analytics/usage")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Usage Record", notes = "Record an analytic record for a known state within the application.", response = SirqulResponse.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response usage( @PathParam("version") BigDecimal version, @NotNull @QueryParam("tag") String tag, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("applicationId") Long applicationId, @QueryParam("appKey") String appKey, @QueryParam("appVersion") String appVersion, @QueryParam("device") String device, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("customId") Long customId, @QueryParam("customType") String customType, @QueryParam("achievementIncrement") Long achievementIncrement, @QueryParam("city") String city, @QueryParam("state") String state, @QueryParam("country") String country, @QueryParam("zip") String zip, @QueryParam("locationDescription") String locationDescription, @QueryParam("clientTime") Long clientTime, @QueryParam("errorMessage") String errorMessage, @QueryParam("ip") String ip, @QueryParam("userAgent") String userAgent, @QueryParam("backgroundEvent") Boolean backgroundEvent, @QueryParam("customMessage") String customMessage, @QueryParam("customMessage2") String customMessage2, @QueryParam("customValue") Double customValue, @QueryParam("customValue2") Double customValue2, @QueryParam("customLong") Long customLong, @QueryParam("customLong2") Long customLong2,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.usage(version,tag,deviceId,accountId,applicationId,appKey,appVersion,device,deviceType,deviceOS,model,latitude,longitude,customId,customType,achievementIncrement,city,state,country,zip,locationDescription,clientTime,errorMessage,ip,userAgent,backgroundEvent,customMessage,customMessage2,customValue,customValue2,customLong,customLong2,securityContext);
    }
    @POST
    @Path("/analytics/usage/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Multiple Usage Records", notes = "Sends multiple analytics. Can be used to send in the user's stored usage when they did not have internet access. Should not include more than 100 items per batch.", response = SirqulResponse.class, tags={ "Analytics", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response usageBatch( @PathParam("version") BigDecimal version, @NotNull @QueryParam("appKey") String appKey, @NotNull @QueryParam("device") String device, @NotNull @QueryParam("data") String data, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("appVersion") String appVersion, @QueryParam("deviceType") String deviceType, @QueryParam("deviceOS") String deviceOS, @QueryParam("model") String model, @QueryParam("updateRanking") Boolean updateRanking, @QueryParam("returnSummaryResponse") Boolean returnSummaryResponse,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.usageBatch(version,appKey,device,data,deviceId,accountId,appVersion,deviceType,deviceOS,model,updateRanking,returnSummaryResponse,securityContext);
    }
    @POST
    @Path("/account/validateAccountSignup")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Save Validation Status", notes = "Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.", response = AccountLoginResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountLoginResponse.class) })
    public Response validateAccountSignup( @PathParam("version") BigDecimal version, @NotNull @QueryParam("token") String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.validateAccountSignup(version,token,securityContext);
    }
    @POST
    @Path("/account/validatepasswordreset")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Validate Password Reset Token", notes = "Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.", response = SirqulResponse.class, tags={ "Account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response validatePasswordReset( @PathParam("version") BigDecimal version, @NotNull @QueryParam("token") String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.validatePasswordReset(version,token,securityContext);
    }
    @POST
    @Path("/consumer/album/contest/vote")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Vote on Contest", notes = "Vote on a collection in a contest.", response = AlbumContestResponse.class, tags={ "Contest", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AlbumContestResponse.class) })
    public Response voteOnAlbumContest( @PathParam("version") BigDecimal version, @NotNull @QueryParam("albumContestId") Long albumContestId, @NotNull @QueryParam("albumId") Long albumId, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("contestType") String contestType, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.voteOnAlbumContest(version,albumContestId,albumId,deviceId,accountId,contestType,latitude,longitude,securityContext);
    }
    @GET
    @Path("/favorite/whois")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Who has Favorited", notes = "Searches for everyone that has favorited an item", response = AccountResponse.class, responseContainer = "List", tags={ "Favorite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AccountResponse.class, responseContainer = "List") })
    public Response whoHasFavorited( @PathParam("version") BigDecimal version, @NotNull @QueryParam("favoritableId") Long favoritableId, @NotNull @QueryParam("favoritableType") String favoritableType, @NotNull @QueryParam("start") Integer start, @NotNull @QueryParam("limit") Integer limit, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("keyword") String keyword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.whoHasFavorited(version,favoritableId,favoritableType,start,limit,deviceId,accountId,latitude,longitude,keyword,securityContext);
    }
}
