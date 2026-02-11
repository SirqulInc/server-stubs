package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AudienceApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import org.openapitools.model.OfferListResponse;
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

@Path("/audience")


@io.swagger.annotations.Api(description = "the audience API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceApi  {

    @Inject AudienceApiService service;

    @POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Audience", notes = "Create a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response createAudience( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @DefaultValue("true") @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createAudience(accountId,name,description,searchTags,gender,ageGroups,categoryIds,applicationIds,gameExperienceLevel,devices,deviceIds,deviceVersions,locations,radius,startTimeOffset,endTimeOffset,sendSuggestion,associateDescription,associateType,associateId,groupingId,metaData,visibility,audienceType,useOrder,cohortRegionsData,appKey,trilaterationTypes,uniqueName,securityContext);
    }
    @POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Audience", notes = "Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response deleteAudience( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAudience(accountId,audienceId,securityContext);
    }
    @GET
    @Path("/ageGroups")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Age Groups", notes = "Gets the list of available age groups that can be selected by consumers and retailers targeting offers.", response = AgeGroupResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AgeGroupResponse.class, responseContainer = "List") })
    public Response getAgeGroups(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAgeGroups(securityContext);
    }
    @GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Audience", notes = "Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response getAudience( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId, @QueryParam("appKey") String appKey, @DefaultValue("false") @QueryParam("returnAccountCount") Boolean returnAccountCount, @DefaultValue("false") @QueryParam("returnAlbumCount") Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAudience(accountId,audienceId,appKey,returnAccountCount,returnAlbumCount,albumTypesForCount,securityContext);
    }
    @GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Audiences", notes = "Get the list audiences owned by the account", response = SearchResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class, responseContainer = "List") })
    public Response getAudienceList( @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("keyword") String keyword, @DefaultValue("SEARCH_TAGS,NAME,DESCRIPTION") @QueryParam("keywordFields") String keywordFields,, allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, SEND_SUGGESTION, OWNER_ID, OWNER_DISPLAY, GENDER" @DefaultValue("NAME") @QueryParam("sortField") String sortField, @DefaultValue("false") @QueryParam("descending") Boolean descending, @DefaultValue("0") @QueryParam("start") Integer start, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("appKey") String appKey, @QueryParam("returnGlobal") Boolean returnGlobal, @QueryParam("exactKeyword") Boolean exactKeyword, @QueryParam("audienceType") String audienceType, @QueryParam("audienceTypes") String audienceTypes, @DefaultValue("false") @QueryParam("returnAccountCount") Boolean returnAccountCount, @DefaultValue("false") @QueryParam("returnAlbumCount") Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAudienceList(accountId,albumIds,keyword,keywordFields,sortField,descending,start,limit,sendSuggestion,activeOnly,groupByGroupingId,appKey,returnGlobal,exactKeyword,audienceType,audienceTypes,returnAccountCount,returnAlbumCount,albumTypesForCount,securityContext);
    }
    @GET
    @Path("/devices")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Devices", notes = "Gets the list of available devices that can be selected by consumers and retailers.", response = AudienceDeviceResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceDeviceResponse.class, responseContainer = "List") })
    public Response getDevices( @NotNull @QueryParam("includeInactive") Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getDevices(includeInactive,securityContext);
    }
    @GET
    @Path("/experiences")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Experiences", notes = "Gets the list of available experiences that can be selected by consumers and retailers.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response getExperiences(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getExperiences(securityContext);
    }
    @GET
    @Path("/grouped/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get GroupedAudiences", notes = "Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response getGroupedAudiences( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceGroupingId") String audienceGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getGroupedAudiences(accountId,audienceGroupingId,securityContext);
    }
    @POST
    @Path("/suggestion/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Suggestions by Audience", notes = "List either Missions or Offers that the user matches the assigned audience.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listByAccount( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("limit") Integer limit, @NotNull @QueryParam("suggestionType") String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listByAccount(accountId,limit,suggestionType,securityContext);
    }
    @GET
    @Path("/suggestion/offersByAudience")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Offers by Audience", notes = "Get a list of offer locations based on audience information provided.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listByAudience( @NotNull @QueryParam("limit") Integer limit, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listByAudience(limit,gender,age,categoryIds,latitude,longitude,securityContext);
    }
    @GET
    @Path("/suggestion/latest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Sent Suggestions ", notes = "Return list of recent trigger suggestions that have been sent to the user.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public Response listLastestByAccount( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("timeframe") Integer timeframe, @NotNull @QueryParam("suggestionType") String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listLastestByAccount(accountId,timeframe,suggestionType,securityContext);
    }
    @POST
    @Path("/suggestion/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Suggestions", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public Response sendByAccount( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("latitude") Double latitude, @NotNull @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendByAccount(accountId,latitude,longitude,securityContext);
    }
    @POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Audience", notes = "Update a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public Response updateAudience( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("audienceId") Long audienceId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("active") Boolean active, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.updateAudience(accountId,audienceId,name,description,searchTags,gender,ageGroups,categoryIds,applicationIds,gameExperienceLevel,devices,deviceIds,deviceVersions,locations,radius,active,sendSuggestion,startTimeOffset,endTimeOffset,associateDescription,associateType,associateId,groupingId,metaData,visibility,audienceType,useOrder,cohortRegionsData,appKey,trilaterationTypes,uniqueName,securityContext);
    }
}
