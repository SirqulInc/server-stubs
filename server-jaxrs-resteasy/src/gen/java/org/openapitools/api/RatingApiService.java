package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.RatingIndexResponse;
import org.openapitools.model.RatingResponse;
import org.openapitools.model.SirqulResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public interface RatingApiService {
      Response createRating(String ratableType,Long ratableId,Integer ratingValue,String deviceId,Long accountId,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteRating(Long ratingId,String deviceId,Long accountId,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRatingIndexes(String ratableType,String ratableIds,String categoryIds,String secondaryType,String keyword,String sortField,Boolean descending,Integer start,Integer limit,Double latitude,Double longitude,Boolean returnRatable,Boolean returnOverallRating,SecurityContext securityContext)
      throws NotFoundException;
      Response searchRatings(String deviceId,Long accountId,Long filterAccountId,String ratableType,Long ratableId,String categoryIds,String keyword,String sortField,Boolean descending,Integer start,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response updateRating(Long ratingId,String deviceId,Long accountId,Integer ratingValue,Long categoryId,String display,String description,String locationDescription,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException;


}
