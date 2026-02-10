package controllers;

import java.math.BigDecimal;
import apimodels.PackResponse;
import apimodels.SirqulResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class PackApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createPackHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull Long packOrder, @NotNull Integer price, @NotNull Boolean highest, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, String priceType, String gameLevelIds, Boolean inGame, String ticketType, Long points) throws Exception {
        PackResponse obj = createPack(request, version, accountId, title, packOrder, price, highest, allocateTickets, ticketCount, description, searchTags, active, gameType, appKey, packType, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, priceType, gameLevelIds, inGame, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PackResponse createPack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String title, @NotNull Long packOrder, @NotNull Integer price, @NotNull Boolean highest, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, String priceType, String gameLevelIds, Boolean inGame, String ticketType, Long points) throws Exception;

    public Result deletePackHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId) throws Exception {
        SirqulResponse obj = deletePack(request, version, accountId, packId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deletePack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId) throws Exception;

    public Result getPackHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean includeGameData) throws Exception {
        PackResponse obj = getPack(request, version, accountId, packId, includeGameData);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PackResponse getPack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean includeGameData) throws Exception;

    public Result searchPacksHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, String keyword, String packType, Integer start, Integer limit, Boolean includeGameData, Boolean includeInactive, String appKey) throws Exception {
        List<PackResponse> obj = searchPacks(request, version, accountId, sortField, descending, keyword, packType, start, limit, includeGameData, includeInactive, appKey);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PackResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PackResponse> searchPacks(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, String keyword, String packType, Integer start, Integer limit, Boolean includeGameData, Boolean includeInactive, String appKey) throws Exception;

    public Result updatePackHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String title, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, Long packOrder, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, Integer price, String priceType, String gameLevelIds, Boolean inGame, Boolean highest, String ticketType, Long points) throws Exception {
        PackResponse obj = updatePack(request, version, accountId, packId, allocateTickets, ticketCount, title, description, searchTags, active, gameType, appKey, packType, packOrder, sequenceType, backgroundId, imageId, startDate, endDate, authorOverride, price, priceType, gameLevelIds, inGame, highest, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PackResponse updatePack(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Long packId, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, String title, String description, String searchTags, Boolean active, String gameType, String appKey, String packType, Long packOrder, String sequenceType, Long backgroundId, Long imageId, Long startDate, Long endDate, String authorOverride, Integer price, String priceType, String gameLevelIds, Boolean inGame, Boolean highest, String ticketType, Long points) throws Exception;

}
