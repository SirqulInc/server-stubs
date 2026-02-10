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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-09T20:49:20.380387445Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonApiController extends Controller {
    private final OrsonApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OrsonApiController(Config configuration, OrsonApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addMovie(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            tags = null;
        }
        String valuemovieName = request.getQueryString("movieName");
        String movieName;
        if (valuemovieName != null) {
            movieName = valuemovieName;
        } else {
            throw new IllegalArgumentException("'movieName' parameter is required");
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.addMovieHttp(request, version, accountId, movieName, thirdPartyAccountId, tags, _file, url, paramCallback);
    }

    @ApiAction
    public Result aiDocs(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuedoc = request.getQueryString("doc");
        String doc;
        if (valuedoc != null) {
            doc = valuedoc;
        } else {
            throw new IllegalArgumentException("'doc' parameter is required");
        }
        String valuereturnTopics = request.getQueryString("return_topics");
        Boolean returnTopics;
        if (valuereturnTopics != null) {
            returnTopics = Boolean.valueOf(valuereturnTopics);
        } else {
            returnTopics = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        return imp.aiDocsHttp(request, version, accountId, doc, returnTopics, limit, offset);
    }

    @ApiAction
    public Result aiFindImages(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetext = request.getQueryString("text");
        String text;
        if (valuetext != null) {
            text = valuetext;
        } else {
            throw new IllegalArgumentException("'text' parameter is required");
        }
        String valueparseFlag = request.getQueryString("parse_flag");
        String parseFlag;
        if (valueparseFlag != null) {
            parseFlag = valueparseFlag;
        } else {
            parseFlag = null;
        }
        String valuefetchFlag = request.getQueryString("fetch_flag");
        String fetchFlag;
        if (valuefetchFlag != null) {
            fetchFlag = valuefetchFlag;
        } else {
            fetchFlag = null;
        }
        String valuesize = request.getQueryString("size");
        String size;
        if (valuesize != null) {
            size = valuesize;
        } else {
            size = null;
        }
        return imp.aiFindImagesHttp(request, version, accountId, text, parseFlag, fetchFlag, size);
    }

    @ApiAction
    public Result aiTags(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuetags = request.getQueryString("tags");
        String tags;
        if (valuetags != null) {
            tags = valuetags;
        } else {
            throw new IllegalArgumentException("'tags' parameter is required");
        }
        String valueconditional = request.getQueryString("conditional");
        String conditional;
        if (valueconditional != null) {
            conditional = valueconditional;
        } else {
            conditional = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        return imp.aiTagsHttp(request, version, accountId, tags, conditional, limit, offset);
    }

    @ApiAction
    public Result aiText(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valueterms = request.getQueryString("terms");
        String terms;
        if (valueterms != null) {
            terms = valueterms;
        } else {
            throw new IllegalArgumentException("'terms' parameter is required");
        }
        String valueconditional = request.getQueryString("conditional");
        String conditional;
        if (valueconditional != null) {
            conditional = valueconditional;
        } else {
            conditional = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        return imp.aiTextHttp(request, version, accountId, terms, conditional, limit, offset);
    }

    @ApiAction
    public Result batch(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoperations = request.getQueryString("operations");
        String operations;
        if (valueoperations != null) {
            operations = valueoperations;
        } else {
            operations = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.batchHttp(request, version, accountId, thirdPartyAccountId, limit, operations, _file, url, paramCallback);
    }

    @ApiAction
    public Result createInstantEpisode(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        return imp.createInstantEpisodeHttp(request, version, accountId, data);
    }

    @ApiAction
    public Result createVoiceCanvas(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuedimensions = request.getQueryString("dimensions");
        String dimensions;
        if (valuedimensions != null) {
            dimensions = valuedimensions;
        } else {
            throw new IllegalArgumentException("'dimensions' parameter is required");
        }
        String valuetext = request.getQueryString("text");
        String text;
        if (valuetext != null) {
            text = valuetext;
        } else {
            text = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparseFlag = request.getQueryString("parseFlag");
        Boolean parseFlag;
        if (valueparseFlag != null) {
            parseFlag = Boolean.valueOf(valueparseFlag);
        } else {
            parseFlag = null;
        }
        String valuefetchFlag = request.getQueryString("fetchFlag");
        Boolean fetchFlag;
        if (valuefetchFlag != null) {
            fetchFlag = Boolean.valueOf(valuefetchFlag);
        } else {
            fetchFlag = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.createVoiceCanvasHttp(request, version, accountId, dimensions, thirdPartyAccountId, text, _file, url, parseFlag, fetchFlag, paramCallback);
    }

    @ApiAction
    public Result emotion(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.emotionHttp(request, version, accountId, thirdPartyAccountId, _file, url, paramCallback);
    }

    @ApiAction
    public Result getAddMovieResult(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getAddMovieResultHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getBatch(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getBatchHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getEmotion(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getEmotionHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getEpisodeStatus(Http.Request request, BigDecimal version,Long episodeId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getEpisodeStatusHttp(request, version, episodeId, accountId);
    }

    @ApiAction
    public Result getRenderStatus(Http.Request request, BigDecimal version,String renderId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getRenderStatusHttp(request, version, renderId, accountId);
    }

    @ApiAction
    public Result getSTT(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getSTTHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getTTS(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getTTSHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getTechTune(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getTechTuneHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getTopics(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getTopicsHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result getVoiceCanvas(Http.Request request, BigDecimal version,String requestId) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        return imp.getVoiceCanvasHttp(request, version, requestId, accountId);
    }

    @ApiAction
    public Result startVideoRender(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuedata = request.getQueryString("data");
        String data;
        if (valuedata != null) {
            data = valuedata;
        } else {
            throw new IllegalArgumentException("'data' parameter is required");
        }
        return imp.startVideoRenderHttp(request, version, accountId, data);
    }

    @ApiAction
    public Result stt(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuesourceLanguage = request.getQueryString("sourceLanguage");
        String sourceLanguage;
        if (valuesourceLanguage != null) {
            sourceLanguage = valuesourceLanguage;
        } else {
            sourceLanguage = null;
        }
        String valuetargetLanguage = request.getQueryString("targetLanguage");
        String targetLanguage;
        if (valuetargetLanguage != null) {
            targetLanguage = valuetargetLanguage;
        } else {
            targetLanguage = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.sttHttp(request, version, accountId, thirdPartyAccountId, sourceLanguage, targetLanguage, _file, url, paramCallback);
    }

    @ApiAction
    public Result summarizeTopics(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuedoc = request.getQueryString("doc");
        String doc;
        if (valuedoc != null) {
            doc = valuedoc;
        } else {
            doc = null;
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.summarizeTopicsHttp(request, version, accountId, thirdPartyAccountId, doc, _file, url, limit, offset, paramCallback);
    }

    @ApiAction
    public Result techTune(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuenumFacesExpected = request.getQueryString("numFacesExpected");
        Integer numFacesExpected;
        if (valuenumFacesExpected != null) {
            numFacesExpected = Integer.parseInt(valuenumFacesExpected);
        } else {
            throw new IllegalArgumentException("'numFacesExpected' parameter is required");
        }
        String value_file = request.getQueryString("file");
        InputStream _file;
        if (value_file != null) {
            _file = value_file;
        } else {
            _file = null;
        }
        String valueurl = request.getQueryString("url");
        String url;
        if (valueurl != null) {
            url = valueurl;
        } else {
            url = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.techTuneHttp(request, version, accountId, numFacesExpected, thirdPartyAccountId, _file, url, paramCallback);
    }

    @ApiAction
    public Result tts(Http.Request request, BigDecimal version) throws Exception {
        String valueaccountId = request.getQueryString("accountId");
        Long accountId;
        if (valueaccountId != null) {
            accountId = Long.parseLong(valueaccountId);
        } else {
            throw new IllegalArgumentException("'accountId' parameter is required");
        }
        String valuethirdPartyAccountId = request.getQueryString("thirdPartyAccountId");
        String thirdPartyAccountId;
        if (valuethirdPartyAccountId != null) {
            thirdPartyAccountId = valuethirdPartyAccountId;
        } else {
            thirdPartyAccountId = null;
        }
        String valuetext = request.getQueryString("text");
        String text;
        if (valuetext != null) {
            text = valuetext;
        } else {
            throw new IllegalArgumentException("'text' parameter is required");
        }
        String valuelanguage = request.getQueryString("language");
        String language;
        if (valuelanguage != null) {
            language = valuelanguage;
        } else {
            language = null;
        }
        String valuevoice = request.getQueryString("voice");
        String voice;
        if (valuevoice != null) {
            voice = valuevoice;
        } else {
            voice = null;
        }
        String valueparamCallback = request.getQueryString("callback");
        String paramCallback;
        if (valueparamCallback != null) {
            paramCallback = valueparamCallback;
        } else {
            paramCallback = null;
        }
        return imp.ttsHttp(request, version, accountId, text, thirdPartyAccountId, language, voice, paramCallback);
    }

}
