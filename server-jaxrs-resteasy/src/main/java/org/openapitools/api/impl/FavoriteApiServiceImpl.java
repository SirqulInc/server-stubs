package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AccountResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WrappedResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class FavoriteApiServiceImpl implements FavoriteApiService {
      public Response addFavorite(Long favoritableId,String favoritableType,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response deleteFavorite(String deviceId,Long accountId,Long favoriteId,Long favoritableId,String favoritableType,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getFavorite(Long favoriteId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response searchFavorites(String favoritableType,String sortField,Boolean descending,Integer start,Integer limit,Boolean activeOnly,Boolean returnFullResponse,String deviceId,Long accountId,Long connectionAccountId,String secondaryType,String keyword,Double latitude,Double longitude,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response whoHasFavorited(Long favoritableId,String favoritableType,Integer start,Integer limit,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
