package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AccountResponse;
import org.openapitools.model.SearchResponse;
import org.openapitools.model.SirqulResponse;
import org.openapitools.model.WrappedResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class FavoriteApiService {
    public abstract Response addFavorite( @NotNull Long favoritableId, @NotNull String favoritableType,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteFavorite(String deviceId,Long accountId,Long favoriteId,Long favoritableId,String favoritableType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getFavorite( @NotNull Long favoriteId,String deviceId,Long accountId,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchFavorites( @NotNull String favoritableType, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean returnFullResponse,String deviceId,Long accountId,Long connectionAccountId,String secondaryType,String keyword,Double latitude,Double longitude,SecurityContext securityContext) throws NotFoundException;
    public abstract Response whoHasFavorited( @NotNull Long favoritableId, @NotNull String favoritableType, @NotNull Integer start, @NotNull Integer limit,String deviceId,Long accountId,Double latitude,Double longitude,String keyword,SecurityContext securityContext) throws NotFoundException;
}
