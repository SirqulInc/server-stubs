package controllers;

import java.math.BigDecimal;
import java.io.InputStream;
import apimodels.OrsonAiAddMovieResponse;
import apimodels.OrsonAiBatchResponse;
import apimodels.OrsonAiEmotionsResponse;
import apimodels.OrsonAiProtoResponse;
import apimodels.OrsonAiSTTResponse;
import apimodels.OrsonAiTTSResponse;
import apimodels.OrsonAiTechTuneResponse;
import apimodels.OrsonAiTopicsResponse;
import apimodels.OrsonAiVoiceCanvasResponse;
import apimodels.OrsonEpisodeResponse;
import apimodels.OrsonRenderResponse;

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
public abstract class OrsonApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addMovieHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String movieName, String thirdPartyAccountId, String tags, InputStream _file, String url, String paramCallback) throws Exception {
        OrsonAiAddMovieResponse obj = addMovie(request, version, accountId, movieName, thirdPartyAccountId, tags, _file, url, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiAddMovieResponse addMovie(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String movieName, String thirdPartyAccountId, String tags, InputStream _file, String url, String paramCallback) throws Exception;

    public Result aiDocsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String doc, Boolean returnTopics, Integer limit, Integer offset) throws Exception {
        OrsonAiProtoResponse obj = aiDocs(request, version, accountId, doc, returnTopics, limit, offset);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiProtoResponse aiDocs(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String doc, Boolean returnTopics, Integer limit, Integer offset) throws Exception;

    public Result aiFindImagesHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String text, String parseFlag, String fetchFlag, String size) throws Exception {
        OrsonAiProtoResponse obj = aiFindImages(request, version, accountId, text, parseFlag, fetchFlag, size);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiProtoResponse aiFindImages(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String text, String parseFlag, String fetchFlag, String size) throws Exception;

    public Result aiTagsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String tags, String conditional, Integer limit, Integer offset) throws Exception {
        OrsonAiProtoResponse obj = aiTags(request, version, accountId, tags, conditional, limit, offset);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiProtoResponse aiTags(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String tags, String conditional, Integer limit, Integer offset) throws Exception;

    public Result aiTextHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String terms, String conditional, Integer limit, Integer offset) throws Exception {
        OrsonAiProtoResponse obj = aiText(request, version, accountId, terms, conditional, limit, offset);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiProtoResponse aiText(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String terms, String conditional, Integer limit, Integer offset) throws Exception;

    public Result batchHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, Integer limit, String operations, InputStream _file, String url, String paramCallback) throws Exception {
        OrsonAiBatchResponse obj = batch(request, version, accountId, thirdPartyAccountId, limit, operations, _file, url, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiBatchResponse batch(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, Integer limit, String operations, InputStream _file, String url, String paramCallback) throws Exception;

    public Result createInstantEpisodeHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String data) throws Exception {
        OrsonEpisodeResponse obj = createInstantEpisode(request, version, accountId, data);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonEpisodeResponse createInstantEpisode(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String data) throws Exception;

    public Result createVoiceCanvasHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String dimensions, String thirdPartyAccountId, String text, InputStream _file, String url, Boolean parseFlag, Boolean fetchFlag, String paramCallback) throws Exception {
        OrsonAiVoiceCanvasResponse obj = createVoiceCanvas(request, version, accountId, dimensions, thirdPartyAccountId, text, _file, url, parseFlag, fetchFlag, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiVoiceCanvasResponse createVoiceCanvas(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String dimensions, String thirdPartyAccountId, String text, InputStream _file, String url, Boolean parseFlag, Boolean fetchFlag, String paramCallback) throws Exception;

    public Result emotionHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, InputStream _file, String url, String paramCallback) throws Exception {
        OrsonAiEmotionsResponse obj = emotion(request, version, accountId, thirdPartyAccountId, _file, url, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiEmotionsResponse emotion(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, InputStream _file, String url, String paramCallback) throws Exception;

    public Result getAddMovieResultHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiAddMovieResponse obj = getAddMovieResult(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiAddMovieResponse getAddMovieResult(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getBatchHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiBatchResponse obj = getBatch(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiBatchResponse getBatch(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getEmotionHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiEmotionsResponse obj = getEmotion(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiEmotionsResponse getEmotion(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getEpisodeStatusHttp(Http.Request request, BigDecimal version, Long episodeId, @NotNull Long accountId) throws Exception {
        OrsonEpisodeResponse obj = getEpisodeStatus(request, version, episodeId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonEpisodeResponse getEpisodeStatus(Http.Request request, BigDecimal version, Long episodeId, @NotNull Long accountId) throws Exception;

    public Result getRenderStatusHttp(Http.Request request, BigDecimal version, String renderId, @NotNull Long accountId) throws Exception {
        OrsonRenderResponse obj = getRenderStatus(request, version, renderId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonRenderResponse getRenderStatus(Http.Request request, BigDecimal version, String renderId, @NotNull Long accountId) throws Exception;

    public Result getSTTHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiSTTResponse obj = getSTT(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiSTTResponse getSTT(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getTTSHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiTTSResponse obj = getTTS(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTTSResponse getTTS(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getTechTuneHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiTechTuneResponse obj = getTechTune(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTechTuneResponse getTechTune(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getTopicsHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiTopicsResponse obj = getTopics(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTopicsResponse getTopics(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result getVoiceCanvasHttp(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception {
        OrsonAiVoiceCanvasResponse obj = getVoiceCanvas(request, version, requestId, accountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiVoiceCanvasResponse getVoiceCanvas(Http.Request request, BigDecimal version, String requestId, @NotNull Long accountId) throws Exception;

    public Result startVideoRenderHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String data) throws Exception {
        OrsonRenderResponse obj = startVideoRender(request, version, accountId, data);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonRenderResponse startVideoRender(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String data) throws Exception;

    public Result sttHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, String sourceLanguage, String targetLanguage, InputStream _file, String url, String paramCallback) throws Exception {
        OrsonAiSTTResponse obj = stt(request, version, accountId, thirdPartyAccountId, sourceLanguage, targetLanguage, _file, url, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiSTTResponse stt(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, String sourceLanguage, String targetLanguage, InputStream _file, String url, String paramCallback) throws Exception;

    public Result summarizeTopicsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, String doc, InputStream _file, String url, Integer limit, Integer offset, String paramCallback) throws Exception {
        OrsonAiTopicsResponse obj = summarizeTopics(request, version, accountId, thirdPartyAccountId, doc, _file, url, limit, offset, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTopicsResponse summarizeTopics(Http.Request request, BigDecimal version, @NotNull Long accountId, String thirdPartyAccountId, String doc, InputStream _file, String url, Integer limit, Integer offset, String paramCallback) throws Exception;

    public Result techTuneHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer numFacesExpected, String thirdPartyAccountId, InputStream _file, String url, String paramCallback) throws Exception {
        OrsonAiTechTuneResponse obj = techTune(request, version, accountId, numFacesExpected, thirdPartyAccountId, _file, url, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTechTuneResponse techTune(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull Integer numFacesExpected, String thirdPartyAccountId, InputStream _file, String url, String paramCallback) throws Exception;

    public Result ttsHttp(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String text, String thirdPartyAccountId, String language, String voice, String paramCallback) throws Exception {
        OrsonAiTTSResponse obj = tts(request, version, accountId, text, thirdPartyAccountId, language, voice, paramCallback);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OrsonAiTTSResponse tts(Http.Request request, BigDecimal version, @NotNull Long accountId, @NotNull String text, String thirdPartyAccountId, String language, String voice, String paramCallback) throws Exception;

}
