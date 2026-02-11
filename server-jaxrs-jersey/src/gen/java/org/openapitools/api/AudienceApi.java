package org.openapitools.api;

import org.openapitools.api.AudienceApiService;
import org.openapitools.api.factories.AudienceApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/audience")


@io.swagger.annotations.Api(description = "the audience API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class AudienceApi  {
   private final AudienceApiService delegate;

   public AudienceApi(@Context ServletConfig servletContext) {
      AudienceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AudienceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AudienceApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = AudienceApiServiceFactory.getAudienceApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/create")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create Audience", notes = "Create a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class)
    })
    public Response createAudience(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The name of the audience", required = true) @QueryParam("name") @NotNull  String name,@ApiParam(value = "The description of the audience") @QueryParam("description")  String description,@ApiParam(value = "The search tags") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "The gender; possible values are: MALE, FEMALE, ANY") @QueryParam("gender")  String gender,@ApiParam(value = "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)") @QueryParam("ageGroups")  String ageGroups,@ApiParam(value = "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)") @QueryParam("applicationIds")  String applicationIds,@ApiParam(value = "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @QueryParam("gameExperienceLevel")  String gameExperienceLevel,@ApiParam(value = "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)") @QueryParam("devices")  String devices,@ApiParam(value = "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)") @QueryParam("deviceIds")  String deviceIds,@ApiParam(value = "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)") @QueryParam("deviceVersions")  String deviceVersions,@ApiParam(value = "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)") @QueryParam("locations")  String locations,@ApiParam(value = "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.") @QueryParam("radius")  String radius,@ApiParam(value = "Seconds from the start time of an event") @QueryParam("startTimeOffset")  Integer startTimeOffset,@ApiParam(value = "Seconds from the end time of an event") @QueryParam("endTimeOffset")  Integer endTimeOffset,@ApiParam(value = "If true, then notify matching users when they are inside the radius", defaultValue = "true") @DefaultValue("true") @QueryParam("sendSuggestion")  Boolean sendSuggestion,@ApiParam(value = "The description of the associated object") @QueryParam("associateDescription")  String associateDescription,@ApiParam(value = "The type of the object to center the audience geofence") @QueryParam("associateType")  String associateType,@ApiParam(value = "The ID of the object to center the audience geofence") @QueryParam("associateId")  Long associateId,@ApiParam(value = "Optional grouping id for the audience") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Visibility of the audience") @QueryParam("visibility")  String visibility,@ApiParam(value = "Type of audience") @QueryParam("audienceType")  String audienceType,@ApiParam(value = "Use order for cohort") @QueryParam("useOrder")  Boolean useOrder,@ApiParam(value = "Cohort data for \"cohort\" audience type") @QueryParam("cohortRegionsData")  String cohortRegionsData,@ApiParam(value = "Filter results by application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "Trilateration types") @QueryParam("trilaterationTypes")  String trilaterationTypes,@ApiParam(value = "If true, makes sure the audience name is unique") @QueryParam("uniqueName")  Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAudience(accountId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, startTimeOffset, endTimeOffset, sendSuggestion, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/delete")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Delete Audience", notes = "Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response deleteAudience(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the audience to delete.", required = true) @QueryParam("audienceId") @NotNull  Long audienceId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAudience(accountId, audienceId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ageGroups")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Age Groups", notes = "Gets the list of available age groups that can be selected by consumers and retailers targeting offers.", response = AgeGroupResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AgeGroupResponse.class, responseContainer = "List")
    })
    public Response getAgeGroups(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAgeGroups(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Audience", notes = "Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class)
    })
    public Response getAudience(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the audience to return.", required = true) @QueryParam("audienceId") @NotNull  Long audienceId,@ApiParam(value = "The application key (optional). If provided, results may be scoped to this application.") @QueryParam("appKey")  String appKey,@ApiParam(value = "(boolean) set to true to include the accountCount associated with current audience of the current app", defaultValue = "false") @DefaultValue("false") @QueryParam("returnAccountCount")  Boolean returnAccountCount,@ApiParam(value = "(boolean) set to true to include the albumCount associated with current audience of the current app", defaultValue = "false") @DefaultValue("false") @QueryParam("returnAlbumCount")  Boolean returnAlbumCount,@ApiParam(value = "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \"all_types\" count is returned.") @QueryParam("albumTypesForCount")  String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAudience(accountId, audienceId, appKey, returnAccountCount, returnAlbumCount, albumTypesForCount, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/search")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Audiences", notes = "Get the list audiences owned by the account", response = SearchResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class, responseContainer = "List")
    })
    public Response getAudienceList(@ApiParam(value = "The logged in user.") @QueryParam("accountId")  Long accountId,@ApiParam(value = "Comma separated list of album IDs to filter results with") @QueryParam("albumIds")  String albumIds,@ApiParam(value = "The keyword used to search") @QueryParam("keyword")  String keyword,@ApiParam(value = "Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY", defaultValue = "SEARCH_TAGS,NAME,DESCRIPTION") @DefaultValue("SEARCH_TAGS,NAME,DESCRIPTION") @QueryParam("keywordFields")  String keywordFields,@ApiParam(value = "The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}", allowableValues="ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, SEND_SUGGESTION, OWNER_ID, OWNER_DISPLAY, GENDER", defaultValue = "NAME") @DefaultValue("NAME") @QueryParam("sortField")  String sortField,@ApiParam(value = "The order to return the results. Default is false, which will return the results in ascending order.", defaultValue = "false") @DefaultValue("false") @QueryParam("descending")  Boolean descending,@ApiParam(value = "The index into the record set to start with.", defaultValue = "0") @DefaultValue("0") @QueryParam("start")  Integer start,@ApiParam(value = "The total number of record to return (there is a hard limit of 100).", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Filter results based on whether or not the audience is set to send suggestions") @QueryParam("sendSuggestion")  Boolean sendSuggestion,@ApiParam(value = "Determines whether to return only active results. Default is false.") @QueryParam("activeOnly")  Boolean activeOnly,@ApiParam(value = "Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)") @QueryParam("groupByGroupingId")  Boolean groupByGroupingId,@ApiParam(value = "Filter results by application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well") @QueryParam("returnGlobal")  Boolean returnGlobal,@ApiParam(value = "If true, match keyword exactly") @QueryParam("exactKeyword")  Boolean exactKeyword,@ApiParam(value = "(Deprecated) Filter results by audience type") @QueryParam("audienceType")  String audienceType,@ApiParam(value = "comma separated string with the different audience types you want to filter for") @QueryParam("audienceTypes")  String audienceTypes,@ApiParam(value = "(boolean) set to true to include the accountCount associated with current audience of the current app", defaultValue = "false") @DefaultValue("false") @QueryParam("returnAccountCount")  Boolean returnAccountCount,@ApiParam(value = "(boolean) set to true to include the albumCount associated with current audience of the current app", defaultValue = "false") @DefaultValue("false") @QueryParam("returnAlbumCount")  Boolean returnAlbumCount,@ApiParam(value = "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \"all_types\" count is returned.") @QueryParam("albumTypesForCount")  String albumTypesForCount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAudienceList(accountId, albumIds, keyword, keywordFields, sortField, descending, start, limit, sendSuggestion, activeOnly, groupByGroupingId, appKey, returnGlobal, exactKeyword, audienceType, audienceTypes, returnAccountCount, returnAlbumCount, albumTypesForCount, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/devices")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Devices", notes = "Gets the list of available devices that can be selected by consumers and retailers.", response = AudienceDeviceResponse.class, responseContainer = "List", tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceDeviceResponse.class, responseContainer = "List")
    })
    public Response getDevices(@ApiParam(value = "If true return inactive record as well. default is false.", required = true) @QueryParam("includeInactive") @NotNull  Boolean includeInactive,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDevices(includeInactive, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/experiences")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Experiences", notes = "Gets the list of available experiences that can be selected by consumers and retailers.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response getExperiences(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getExperiences(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/grouped/get")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get GroupedAudiences", notes = "Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class)
    })
    public Response getGroupedAudiences(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The audience grouping id to return.", required = true) @QueryParam("audienceGroupingId") @NotNull  String audienceGroupingId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGroupedAudiences(accountId, audienceGroupingId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/suggestion/list")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Suggestions by Audience", notes = "List either Missions or Offers that the user matches the assigned audience.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class)
    })
    public Response listByAccount(@ApiParam(value = "The account to match offers for.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the limit of the index", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "the type of suggestion", required = true) @QueryParam("suggestionType") @NotNull  String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listByAccount(accountId, limit, suggestionType, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/suggestion/offersByAudience")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Offers by Audience", notes = "Get a list of offer locations based on audience information provided.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class)
    })
    public Response listByAudience(@ApiParam(value = "this is the limit of the index", required = true) @QueryParam("limit") @NotNull  Integer limit,@ApiParam(value = "this is the gender to list offers by") @QueryParam("gender")  String gender,@ApiParam(value = "this is the age to list offers by") @QueryParam("age")  Integer age,@ApiParam(value = "this is the category IDs to list offers by") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "this is the latitude to list offers by") @QueryParam("latitude")  Double latitude,@ApiParam(value = "this is the longitude to list offers by") @QueryParam("longitude")  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listByAudience(limit, gender, age, categoryIds, latitude, longitude, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/suggestion/latest")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "List Sent Suggestions ", notes = "Return list of recent trigger suggestions that have been sent to the user.", response = OfferListResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class)
    })
    public Response listLastestByAccount(@ApiParam(value = "The account to match offers for.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The timeframe in seconds of the latest suggestions", required = true) @QueryParam("timeframe") @NotNull  Integer timeframe,@ApiParam(value = "The type of trigger suggestions to return", required = true) @QueryParam("suggestionType") @NotNull  String suggestionType,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listLastestByAccount(accountId, timeframe, suggestionType, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/suggestion/send")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Send Suggestions", notes = "Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.", response = SirqulResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class)
    })
    public Response sendByAccount(@ApiParam(value = "The account to match offers for.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "the latitude", required = true) @QueryParam("latitude") @NotNull  Double latitude,@ApiParam(value = "the longitude", required = true) @QueryParam("longitude") @NotNull  Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sendByAccount(accountId, latitude, longitude, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/update")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Update Audience", notes = "Update a user defined audience.", response = AudienceResponse.class, tags={ "Audience", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class)
    })
    public Response updateAudience(@ApiParam(value = "The logged in user.", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "The id of the audience to update.", required = true) @QueryParam("audienceId") @NotNull  Long audienceId,@ApiParam(value = "The name of the audience") @QueryParam("name")  String name,@ApiParam(value = "The description of the audience") @QueryParam("description")  String description,@ApiParam(value = "The search tags") @QueryParam("searchTags")  String searchTags,@ApiParam(value = "The gender; possible values are: MALE, FEMALE, ANY") @QueryParam("gender")  String gender,@ApiParam(value = "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)") @QueryParam("ageGroups")  String ageGroups,@ApiParam(value = "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)") @QueryParam("categoryIds")  String categoryIds,@ApiParam(value = "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)") @QueryParam("applicationIds")  String applicationIds,@ApiParam(value = "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @QueryParam("gameExperienceLevel")  String gameExperienceLevel,@ApiParam(value = "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)") @QueryParam("devices")  String devices,@ApiParam(value = "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)") @QueryParam("deviceIds")  String deviceIds,@ApiParam(value = "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)") @QueryParam("deviceVersions")  String deviceVersions,@ApiParam(value = "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)") @QueryParam("locations")  String locations,@ApiParam(value = "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.") @QueryParam("radius")  String radius,@ApiParam(value = "if audience is active") @QueryParam("active")  Boolean active,@ApiParam(value = "If true, then notify matching users when they are inside the radius") @QueryParam("sendSuggestion")  Boolean sendSuggestion,@ApiParam(value = "Seconds from the start time of an event") @QueryParam("startTimeOffset")  Integer startTimeOffset,@ApiParam(value = "Seconds from the end time of an event") @QueryParam("endTimeOffset")  Integer endTimeOffset,@ApiParam(value = "the associate description") @QueryParam("associateDescription")  String associateDescription,@ApiParam(value = "The type of the object to center the audience geofence") @QueryParam("associateType")  String associateType,@ApiParam(value = "The ID of the object to center the audience geofence") @QueryParam("associateId")  Long associateId,@ApiParam(value = "Optional grouping id for the audience") @QueryParam("groupingId")  String groupingId,@ApiParam(value = "External custom client defined data") @QueryParam("metaData")  String metaData,@ApiParam(value = "Visibility of the audience") @QueryParam("visibility")  String visibility,@ApiParam(value = "Type of audience") @QueryParam("audienceType")  String audienceType,@ApiParam(value = "Use order for cohort") @QueryParam("useOrder")  Boolean useOrder,@ApiParam(value = "Cohort data for \"cohort\" audience type") @QueryParam("cohortRegionsData")  String cohortRegionsData,@ApiParam(value = "Filter results by application key") @QueryParam("appKey")  String appKey,@ApiParam(value = "Trilateration types") @QueryParam("trilaterationTypes")  String trilaterationTypes,@ApiParam(value = "If true, makes sure the audience name is unique") @QueryParam("uniqueName")  Boolean uniqueName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAudience(accountId, audienceId, name, description, searchTags, gender, ageGroups, categoryIds, applicationIds, gameExperienceLevel, devices, deviceIds, deviceVersions, locations, radius, active, sendSuggestion, startTimeOffset, endTimeOffset, associateDescription, associateType, associateId, groupingId, metaData, visibility, audienceType, useOrder, cohortRegionsData, appKey, trilaterationTypes, uniqueName, securityContext);
    }
}
