package controllers;

import java.math.BigDecimal;
import apimodels.CoordsResponse;
import apimodels.GeoPointResponse;
import java.io.InputStream;
import apimodels.LocationSearchResponse;
import apimodels.SirqulResponse;
import apimodels.TrilatCacheRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LocationApiControllerImp extends LocationApiControllerImpInterface {
    @Override
    public SirqulResponse cacheTrilaterationData(Http.Request request, BigDecimal version, @NotNull String udid, Long sourceTime, Integer minimumSampleSize, String data, InputStream dataFile) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public SirqulResponse cacheTrilaterationDataGzip(Http.Request request, BigDecimal version, TrilatCacheRequest body) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public CoordsResponse getLocationByIp(Http.Request request, BigDecimal version, String ip) throws Exception {
        //Do your magic!!!
        return new CoordsResponse();
    }

    @Override
    public GeoPointResponse getLocationByTrilateration(Http.Request request, BigDecimal version, Long accountId, Double latitude, Double longitude, String data, String responseFilters) throws Exception {
        //Do your magic!!!
        return new GeoPointResponse();
    }

    @Override
    public LocationSearchResponse getLocations(Http.Request request, BigDecimal version, String deviceId, Long accountId, Double currentlatitude, Double currentlongitude, Double currentLatitude, Double currentLongitude, String query, String zipcode, String zipCode, Double selectedMaplatitude, Double selectedMaplongitude, Double selectedMapLatitude, Double selectedMapLongitude, Double searchRange, Boolean useGeocode, Integer i, Integer start, Integer l, Integer limit) throws Exception {
        //Do your magic!!!
        return new LocationSearchResponse();
    }

}
