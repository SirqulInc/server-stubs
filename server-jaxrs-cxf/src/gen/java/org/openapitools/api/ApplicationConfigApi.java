package org.openapitools.api;

import org.openapitools.model.ApplicationConfigResponse;
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
@Path("/appconfig")
@Api(value = "/", description = "")
public interface ApplicationConfigApi  {

    /**
     * Create AppConfig
     *
     * Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won&#39;t be created.
     *
     */
    @POST
    @Path("/create")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create AppConfig", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public ApplicationConfigResponse createApplicationConfig(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") @NotNull String appKey, @QueryParam("configVersion") @NotNull String configVersion, @QueryParam("assetId") @NotNull Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid);

    /**
     * Delete AppConfig
     *
     * Mark the application configuration for deletion.
     *
     */
    @POST
    @Path("/delete")
    @Produces({ "*/*" })
    @ApiOperation(value = "Delete AppConfig", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse deleteApplicationConfig(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("configId") @NotNull Long configId);

    /**
     * Get AppConfig
     *
     * Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response.
     *
     */
    @GET
    @Path("/get")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get AppConfig", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public ApplicationConfigResponse getApplicationConfig(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("configId") @NotNull Long configId);

    /**
     * Get AppConfig by Version
     *
     * Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response. 
     *
     */
    @GET
    @Path("/getbyversion")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get AppConfig by Version", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public ApplicationConfigResponse getApplicationConfigByConfigVersion(@QueryParam("appKey") @NotNull String appKey, @QueryParam("configVersion") @NotNull String configVersion, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @QueryParam("allowOlderVersions") @DefaultValue("false")Boolean allowOlderVersions);

    /**
     * Search AppConfigs
     *
     * Gets all versions of application configurations in a particular app by the given appKey.
     *
     */
    @GET
    @Path("/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search AppConfigs", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class, responseContainer = "List") })
    public List<ApplicationConfigResponse> searchApplicationConfig(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("appKey") String appKey, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid, @QueryParam("configVersion") String configVersion, @QueryParam("sortField") @DefaultValue("CONFIG_VERSION_INDEX")String sortField, @QueryParam("descending") @DefaultValue("true")Boolean descending, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Update AppConfig
     *
     * pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won&#39;t be updated.
     *
     */
    @POST
    @Path("/update")
    @Produces({ "*/*" })
    @ApiOperation(value = "Update AppConfig", tags={ "Application Config" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ApplicationConfigResponse.class) })
    public ApplicationConfigResponse updateApplicationConfig(@QueryParam("accountId") @NotNull Long accountId, @QueryParam("configId") @NotNull Long configId, @QueryParam("appKey") String appKey, @QueryParam("configVersion") String configVersion, @QueryParam("assetId") Long assetId, @QueryParam("retailerId") Long retailerId, @QueryParam("retailerLocationId") Long retailerLocationId, @QueryParam("udid") String udid);
}
