package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CoordsResponse;
import java.io.File;
import org.openapitools.model.Location;
import org.openapitools.model.LocationSearchResponse;
import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RetailerLocationResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.TrilatCacheRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class LocationApiService {
    public abstract Response cacheTrilaterationData( @NotNull String udid,Long sourceTime,Integer minimumSampleSize,String data,File dataFile,SecurityContext securityContext) throws NotFoundException;
    public abstract Response cacheTrilaterationDataGzip(TrilatCacheRequest body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createLocationV2(Location body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createRetailerLocationConsumer( @NotNull String appKey, @NotNull String name,String deviceId,Long accountId,String streetAddress,String streetAddress2,String city,String state,String postalCode,String country,String businessPhone,String businessPhoneExt,String website,String email,String detailsHeader,String detailsBody,String hours,String tags,Long logoAssetId,Long picture1AssetId,Long picture2AssetId,String categoryIds,String filterIds,String metaData,Boolean publicLocation,Boolean active,String locationType,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getLocationByIp(String ip,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getLocations(String deviceId,Long accountId,Double currentlatitude,Double currentlongitude,Double currentLatitude,Double currentLongitude,String query,String zipcode,String zipCode,Double selectedMaplatitude,Double selectedMaplongitude,Double selectedMapLatitude,Double selectedMapLongitude,Double searchRange,Boolean useGeocode,Integer i,Integer start,Integer l,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRetailerLocationConsumer( @NotNull Long retailerLocationId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchLocationRatingIndexes(String categoryIds,String keyword,String locationType,String sortField,Boolean descending,Integer start,Integer limit,Double searchRange,Double latitude,Double longitude,Boolean returnOverallRating,String distanceUnit,Boolean returnRetailer,Boolean returnAssets,Boolean returnOffers,Boolean returnCategories,Boolean returnFilters,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateLocationV2(Long id,Location body,SecurityContext securityContext) throws NotFoundException;
}
