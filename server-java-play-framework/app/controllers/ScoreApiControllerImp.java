package controllers;

import java.math.BigDecimal;
import apimodels.ScoreResponse;

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
public class ScoreApiControllerImp extends ScoreApiControllerImpInterface {
    @Override
    public ScoreResponse createScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer points, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, Integer timeTaken, Boolean highest) throws Exception {
        //Do your magic!!!
        return new ScoreResponse();
    }

    @Override
    public ScoreResponse getScore(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId, String scoreObjectType, String scoreStatus) throws Exception {
        //Do your magic!!!
        return new ScoreResponse();
    }

    @Override
    public List<ScoreResponse> searchScores(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, Long missionId, Long gameId, Long packId, Long gameLevelId, Long gameObjectId) throws Exception {
        //Do your magic!!!
        return new ArrayList<ScoreResponse>();
    }

}
