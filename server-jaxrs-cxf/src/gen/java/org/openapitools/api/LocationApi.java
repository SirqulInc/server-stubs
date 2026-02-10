package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CoordsResponse;
import java.io.File;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.LocationSearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TrilatCacheRequest;

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
@Path("/api/{version}")
@Api(value = "/", description = "")
public interface LocationApi  {

    /**
     * Create Trilateration Data with File
     *
     * Creates trilateration samples for a source device (i.e. a router).
     *
     */
    @POST
    @Path("/location/trilaterate/cache")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Trilateration Data with File", tags={ "Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse cacheTrilaterationData(@PathParam("version") BigDecimal version, @QueryParam("udid") @NotNull String udid, @QueryParam("sourceTime") Long sourceTime, @QueryParam("minimumSampleSize") Integer minimumSampleSize, @QueryParam("data") String data, @QueryParam("dataFile") File dataFile);

    /**
     * Create Trilateration Data with Rest
     *
     * Creates trilateration samples for a source device (i.e. a router).
     *
     */
    @POST
    @Path("/location/trilaterate/cache/submit")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create Trilateration Data with Rest", tags={ "Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SirqulResponse.class) })
    public SirqulResponse cacheTrilaterationDataGzip(@PathParam("version") BigDecimal version, @Valid TrilatCacheRequest body);

    /**
     * Get Location by IP
     *
     * Get location information based on an IP address.
     *
     */
    @GET
    @Path("/location/ip")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Location by IP", tags={ "Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CoordsResponse.class) })
    public CoordsResponse getLocationByIp(@PathParam("version") BigDecimal version, @QueryParam("ip") String ip);

    /**
     * Get Location by Trilateration
     *
     * Send in device data and calculate a position based on signal strengths.
     *
     */
    @GET
    @Path("/account/location/trilaterate")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Location by Trilateration", tags={ "Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeoPointResponse.class) })
    public GeoPointResponse getLocationByTrilateration(@PathParam("version") BigDecimal version, @QueryParam("accountId") Long accountId, @QueryParam("latitude") Double latitude, @QueryParam("longitude") Double longitude, @QueryParam("data") String data, @QueryParam("responseFilters") String responseFilters);

    /**
     * Search Regions or Postal Codes
     *
     * Searches geographic locations by proximity via address or keyword.
     *
     */
    @GET
    @Path("/location/search")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Regions or Postal Codes", tags={ "Location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LocationSearchResponse.class) })
    public LocationSearchResponse getLocations(@PathParam("version") BigDecimal version, @QueryParam("deviceId") String deviceId, @QueryParam("accountId") Long accountId, @QueryParam("currentlatitude") Double currentlatitude, @QueryParam("currentlongitude") Double currentlongitude, @QueryParam("currentLatitude") Double currentLatitude, @QueryParam("currentLongitude") Double currentLongitude, @QueryParam("query") String query, @QueryParam("zipcode") String zipcode, @QueryParam("zipCode") String zipCode, @QueryParam("selectedMaplatitude") Double selectedMaplatitude, @QueryParam("selectedMaplongitude") Double selectedMaplongitude, @QueryParam("selectedMapLatitude") Double selectedMapLatitude, @QueryParam("selectedMapLongitude") Double selectedMapLongitude, @QueryParam("searchRange") @DefaultValue("5")Double searchRange, @QueryParam("useGeocode") @DefaultValue("false")Boolean useGeocode, @QueryParam("_i") Integer i, @QueryParam("start") @DefaultValue("0")Integer start, @QueryParam("_l") Integer l, @QueryParam("limit") @DefaultValue("20")Integer limit);
}
