package controllers;

import apimodels.AccountResponse;
import java.math.BigDecimal;
import apimodels.SearchResponse;
import apimodels.SirqulResponse;
import apimodels.WrappedResponse;

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
public class FavoriteApiControllerImp extends FavoriteApiControllerImpInterface {
    @Override
    public WrappedResponse addFavorite(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new WrappedResponse();
    }

    @Override
    public SirqulResponse deleteFavorite(Http.Request request, BigDecimal version, String deviceId, Long accountId, Long favoriteId, Long favoritableId, String favoritableType) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public WrappedResponse getFavorite(Http.Request request, BigDecimal version, @NotNull Long favoriteId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new WrappedResponse();
    }

    @Override
    public SearchResponse searchFavorites(Http.Request request, BigDecimal version, @NotNull String favoritableType, @NotNull String sortField, @NotNull Boolean descending, @NotNull Integer start, @NotNull Integer limit, @NotNull Boolean activeOnly, @NotNull Boolean returnFullResponse, String deviceId, Long accountId, Long connectionAccountId, String secondaryType, String keyword, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new SearchResponse();
    }

    @Override
    public List<AccountResponse> whoHasFavorited(Http.Request request, BigDecimal version, @NotNull Long favoritableId, @NotNull String favoritableType, @NotNull Integer start, @NotNull Integer limit, String deviceId, Long accountId, Double latitude, Double longitude, String keyword) throws Exception {
        //Do your magic!!!
        return new ArrayList<AccountResponse>();
    }

}
