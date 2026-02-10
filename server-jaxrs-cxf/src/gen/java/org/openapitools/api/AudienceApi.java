package org.openapitools.api;

import org.openapitools.model.AgeGroupResponse;
import org.openapitools.model.AudienceDeviceResponse;
import org.openapitools.model.AudienceResponse;
import java.math.BigDecimal;
import org.openapitools.model.OfferListResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/audience")
@Api(value = "/", description = "")
public interface AudienceApi  {

    /**
     * Create Audience
     *
     * Create a user defined audience.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public AudienceResponse createAudience(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("name") @NotNull String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @QueryParam("sendSuggestion") @DefaultValue("true")Boolean sendSuggestion, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName);

    /**
     * Delete Audience
     *
     * Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteAudience(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("audienceId") @NotNull Long audienceId);

    /**
     * Get Age Groups
     *
     * Gets the list of available age groups that can be selected by consumers and retailers targeting offers.
     *
     */
    @GET
    @Path("/ageGroups")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Age Groups", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AgeGroupResponse.class, responseContainer = "List") })
    public List<AgeGroupResponse> getAgeGroups(@PathParam("version") BigDecimal version);

    /**
     * Get Audience
     *
     * Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public AudienceResponse getAudience(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("audienceId") @NotNull Long audienceId, @QueryParam("appKey") String appKey, @QueryParam("returnAccountCount") @DefaultValue("false")Boolean returnAccountCount, @QueryParam("returnAlbumCount") @DefaultValue("false")Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount);

    /**
     * Search Audiences
     *
     * Get the list audiences owned by the account
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Audiences", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SearchResponse.class, responseContainer = "List") })
    public List<SearchResponse> getAudienceList(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("albumIds") String albumIds, @QueryParam("keyword") String keyword, @QueryParam("keywordFields") @DefaultValue("SEARCH_TAGS,NAME,DESCRIPTION")String keywordFields, @QueryParam("sortField") @DefaultValue("NAME")String sortField, @QueryParam("descending") @DefaultValue("false")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("activeOnly") Boolean activeOnly, @QueryParam("groupByGroupingId") Boolean groupByGroupingId, @QueryParam("appKey") String appKey, @QueryParam("returnGlobal") Boolean returnGlobal, @QueryParam("exactKeyword") Boolean exactKeyword, @QueryParam("audienceType") String audienceType, @QueryParam("audienceTypes") String audienceTypes, @QueryParam("returnAccountCount") @DefaultValue("false")Boolean returnAccountCount, @QueryParam("returnAlbumCount") @DefaultValue("false")Boolean returnAlbumCount, @QueryParam("albumTypesForCount") String albumTypesForCount);

    /**
     * Get Devices
     *
     * Gets the list of available devices that can be selected by consumers and retailers.
     *
     */
    @GET
    @Path("/devices")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Devices", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AudienceDeviceResponse.class, responseContainer = "List") })
    public List<AudienceDeviceResponse> getDevices(@PathParam("version") BigDecimal version, @QueryParam("includeInactive") @NotNull Boolean includeInactive);

    /**
     * Get Experiences
     *
     * Gets the list of available experiences that can be selected by consumers and retailers.
     *
     */
    @GET
    @Path("/experiences")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Experiences", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse getExperiences(@PathParam("version") BigDecimal version);

    /**
     * Get GroupedAudiences
     *
     * Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.
     *
     */
    @GET
    @Path("/grouped/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get GroupedAudiences", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public AudienceResponse getGroupedAudiences(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("audienceGroupingId") @NotNull String audienceGroupingId);

    /**
     * List Suggestions by Audience
     *
     * List either Missions or Offers that the user matches the assigned audience.
     *
     */
    @POST
    @Path("/suggestion/list")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Suggestions by Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public OfferListResponse listByAccount(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("limit") @NotNull Integer limit, @QueryParam("suggestionType") @NotNull String suggestionType);

    /**
     * List Offers by Audience
     *
     * Get a list of offer locations based on audience information provided.
     *
     */
    @GET
    @Path("/suggestion/offersByAudience")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Offers by Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public OfferListResponse listByAudience(@PathParam("version") BigDecimal version, @QueryParam("limit") @NotNull Integer limit, @QueryParam("gender") String gender, @QueryParam("age") Integer age, @QueryParam("categoryIds") String categoryIds, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude);

    /**
     * List Sent Suggestions 
     *
     * Return list of recent trigger suggestions that have been sent to the user.
     *
     */
    @GET
    @Path("/suggestion/latest")
    @Produces({ "*/*" })
    @ApiOperation(value = "List Sent Suggestions ", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OfferListResponse.class) })
    public OfferListResponse listLastestByAccount(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("timeframe") @NotNull Integer timeframe, @QueryParam("suggestionType") @NotNull String suggestionType);

    /**
     * Send Suggestions
     *
     * Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.
     *
     */
    @POST
    @Path("/suggestion/send")
    @Produces({ "*/*" })
    @ApiOperation(value = "Send Suggestions", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse sendByAccount(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("latitude") @NotNull Double latitude, @QueryParam("longitude") @NotNull Double longitude);

    /**
     * Update Audience
     *
     * Update a user defined audience.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update Audience", tags={ "Audience" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AudienceResponse.class) })
    public AudienceResponse updateAudience(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("audienceId") @NotNull Long audienceId, @QueryParam("name") String name, @QueryParam("description") String description, @QueryParam("searchTags") String searchTags, @QueryParam("gender") String gender, @QueryParam("ageGroups") String ageGroups, @QueryParam("categoryIds") String categoryIds, @QueryParam("applicationIds") String applicationIds, @QueryParam("gameExperienceLevel") String gameExperienceLevel, @QueryParam("devices") String devices, @QueryParam("deviceIds") String deviceIds, @QueryParam("deviceVersions") String deviceVersions, @QueryParam("locations") String locations, @QueryParam("radius") String radius, @QueryParam("active") Boolean active, @QueryParam("sendSuggestion") Boolean sendSuggestion, @QueryParam("startTimeOffset") Integer startTimeOffset, @QueryParam("endTimeOffset") Integer endTimeOffset, @QueryParam("associateDescription") String associateDescription, @QueryParam("associateType") String associateType, @QueryParam("associateId") Long associateId, @QueryParam("groupingId") String groupingId, @QueryParam("metaData") String metaData, @QueryParam("visibility") String visibility, @QueryParam("audienceType") String audienceType, @QueryParam("useOrder") Boolean useOrder, @QueryParam("cohortRegionsData") String cohortRegionsData, @QueryParam("appKey") String appKey, @QueryParam("trilaterationTypes") String trilaterationTypes, @QueryParam("uniqueName") Boolean uniqueName);
}
