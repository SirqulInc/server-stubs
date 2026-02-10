package controllers;

import java.math.BigDecimal;
import apimodels.SirqulResponse;
import apimodels.WordzWordResponse;

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
public abstract class WordApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createWordHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String word, @NotNull String definition, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, Long assetId, String ticketType, Long points) throws Exception {
        WordzWordResponse obj = createWord(request, version, accountId, word, definition, active, allocateTickets, ticketCount, assetId, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WordzWordResponse createWord(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String word, @NotNull String definition, @NotNull Boolean active, @NotNull Boolean allocateTickets, @NotNull Long ticketCount, Long assetId, String ticketType, Long points) throws Exception;

    public Result deleteWordHttp(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId) throws Exception {
        SirqulResponse obj = deleteWord(request, version, wordId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SirqulResponse deleteWord(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId) throws Exception;

    public Result getWordHttp(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId) throws Exception {
        WordzWordResponse obj = getWord(request, version, wordId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WordzWordResponse getWord(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId) throws Exception;

    public Result getWordsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String keyword) throws Exception {
        List<WordzWordResponse> obj = getWords(request, version, accountId, sortField, descending, activeOnly, start, limit, keyword);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (WordzWordResponse curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<WordzWordResponse> getWords(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String sortField, @NotNull Boolean descending, @NotNull Boolean activeOnly, @NotNull Integer start, @NotNull Integer limit, String keyword) throws Exception;

    public Result updateWordHttp(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId, @NotNull Long ticketCount, String wordText, String definition, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) throws Exception {
        WordzWordResponse obj = updateWord(request, version, wordId, accountId, ticketCount, wordText, definition, assetId, active, allocateTickets, ticketType, points);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract WordzWordResponse updateWord(Http.Request request, BigDecimal version, @NotNull Long wordId, @NotNull Long accountId, @NotNull Long ticketCount, String wordText, String definition, Long assetId, Boolean active, Boolean allocateTickets, String ticketType, Long points) throws Exception;

}
