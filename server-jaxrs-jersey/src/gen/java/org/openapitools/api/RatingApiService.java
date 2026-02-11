package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class RatingApiService {
    public abstract Response createRating( @NotNull String ratableType, @NotNull Long ratableId, @NotNull Integer ratingValue,String deviceId,Long accountId,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteRating( @NotNull Long ratingId,String deviceId,Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRatingIndexes( @NotNull String ratableType,String ratableIds,String categoryIds,String secondaryType,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Boolean returnRatable,Boolean returnOverallRating,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchRatings(String deviceId,Long accountId,Long filterAccountId,String ratableType,Long ratableId,String categoryIds,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRating( @NotNull Long ratingId,String deviceId,Long accountId,Integer ratingValue,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
}
