package controllers;

import java.math.BigDecimal;
import apimodels.GameResponse;
import apimodels.SirqulResponse;

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
public class GameApiControllerImp extends GameApiControllerImpInterface {
    @Override
    public GameResponse createGame(Http.Request request, BigDecimal version, Long accountId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception {
        //Do your magic!!!
        return new GameResponse();
    }

    @Override
    public SirqulResponse deleteGame(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long gameId) throws Exception {
        //Do your magic!!!
        return new SirqulResponse();
    }

    @Override
    public GameResponse getGame(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long gameId, Boolean includeGameData) throws Exception {
        //Do your magic!!!
        return new GameResponse();
    }

    @Override
    public GameResponse searchGames(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String appKey, @NotNull Integer start, @NotNull Integer limit, String keyword, String appVersion, Boolean includeGameData, Boolean includeInactive) throws Exception {
        //Do your magic!!!
        return new GameResponse();
    }

    @Override
    public GameResponse updateGame(Http.Request request, BigDecimal version, Long accountId, Long gameId, String appKey, String title, String description, String metaData, String packIds, Boolean includeGameData) throws Exception {
        //Do your magic!!!
        return new GameResponse();
    }

}
