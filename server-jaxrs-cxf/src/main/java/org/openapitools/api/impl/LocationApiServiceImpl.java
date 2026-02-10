package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CoordsResponse;
import java.io.File;
import org.openapitools.model.GeoPointResponse;
import org.openapitools.model.LocationSearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TrilatCacheRequest;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class LocationApiServiceImpl implements LocationApi {
    /**
     * Create Trilateration Data with File
     *
     * Creates trilateration samples for a source device (i.e. a router).
     *
     */
    public SirqulResponse cacheTrilaterationData(BigDecimal version, String udid, Long sourceTime, Integer minimumSampleSize, String data, File dataFile) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create Trilateration Data with Rest
     *
     * Creates trilateration samples for a source device (i.e. a router).
     *
     */
    public SirqulResponse cacheTrilaterationDataGzip(BigDecimal version, TrilatCacheRequest body) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Location by IP
     *
     * Get location information based on an IP address.
     *
     */
    public CoordsResponse getLocationByIp(BigDecimal version, String ip) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Location by Trilateration
     *
     * Send in device data and calculate a position based on signal strengths.
     *
     */
    public GeoPointResponse getLocationByTrilateration(BigDecimal version, Long accountId, Double latitude, Double longitude, String data, String responseFilters) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Regions or Postal Codes
     *
     * Searches geographic locations by proximity via address or keyword.
     *
     */
    public LocationSearchResponse getLocations(BigDecimal version, String deviceId, Long accountId, Double currentlatitude, Double currentlongitude, Double currentLatitude, Double currentLongitude, String query, String zipcode, String zipCode, Double selectedMaplatitude, Double selectedMaplongitude, Double selectedMapLatitude, Double selectedMapLongitude, Double searchRange, Boolean useGeocode, Integer i, Integer start, Integer l, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
