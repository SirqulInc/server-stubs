package controllers;

import apimodels.LikableResponse;
import apimodels.SearchResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-11T19:25:37.664944661Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class LikeApiControllerImp extends LikeApiControllerImpInterface {
    @Override
    public LikableResponse registerLike(Http.Request request, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String permissionableType, Long permissionableId, Boolean like, String app, String gameType, String appKey, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new LikableResponse();
    }

    @Override
    public LikableResponse removeLike(Http.Request request, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, Double latitude, Double longitude) throws Exception {
        //Do your magic!!!
        return new LikableResponse();
    }

    @Override
    public SearchResponse searchLikes(Http.Request request, @NotNull String likableType, @NotNull Long likableId, String deviceId, Long accountId, String connectionAccountIds, String sortField, Boolean descending, Long updatedSince, Long updatedBefore, Integer start, Integer limit) throws Exception {
        //Do your magic!!!
        return new SearchResponse();
    }

}
