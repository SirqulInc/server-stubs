package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import java.io.File;
import org.openapitools.model.OrsonAiAddMovieResponse;
import org.openapitools.model.OrsonAiBatchResponse;
import org.openapitools.model.OrsonAiEmotionsResponse;
import org.openapitools.model.OrsonAiProtoResponse;
import org.openapitools.model.OrsonAiSTTResponse;
import org.openapitools.model.OrsonAiTTSResponse;
import org.openapitools.model.OrsonAiTechTuneResponse;
import org.openapitools.model.OrsonAiTopicsResponse;
import org.openapitools.model.OrsonAiVoiceCanvasResponse;
import org.openapitools.model.OrsonEpisodeResponse;
import org.openapitools.model.OrsonRenderResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public abstract class OrsonApiService {
    public abstract Response addMovie( @NotNull Long accountId, @NotNull String movieName,String thirdPartyAccountId,String tags,File _file,String url,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response aiDocs( @NotNull Long accountId, @NotNull String doc,Boolean returnTopics,Integer limit,Integer offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response aiFindImages( @NotNull Long accountId, @NotNull String text,String parseFlag,String fetchFlag,String size,SecurityContext securityContext) throws NotFoundException;
    public abstract Response aiTags( @NotNull Long accountId, @NotNull String tags,String conditional,Integer limit,Integer offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response aiText( @NotNull Long accountId, @NotNull String terms,String conditional,Integer limit,Integer offset,SecurityContext securityContext) throws NotFoundException;
    public abstract Response batch( @NotNull Long accountId,String thirdPartyAccountId,Integer limit,String operations,File _file,String url,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createInstantEpisode( @NotNull Long accountId, @NotNull String data,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVoiceCanvas( @NotNull Long accountId, @NotNull String dimensions,String thirdPartyAccountId,String text,File _file,String url,Boolean parseFlag,Boolean fetchFlag,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response emotion( @NotNull Long accountId,String thirdPartyAccountId,File _file,String url,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAddMovieResult(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBatch(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getEmotion(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getEpisodeStatus(Long episodeId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRenderStatus(String renderId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSTT(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTTS(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTechTune(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTopics(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVoiceCanvas(String requestId, @NotNull Long accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response startVideoRender( @NotNull Long accountId, @NotNull String data,SecurityContext securityContext) throws NotFoundException;
    public abstract Response stt( @NotNull Long accountId,String thirdPartyAccountId,String sourceLanguage,String targetLanguage,File _file,String url,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response summarizeTopics( @NotNull Long accountId,String thirdPartyAccountId,String doc,File _file,String url,Integer limit,Integer offset,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response techTune( @NotNull Long accountId, @NotNull Integer numFacesExpected,String thirdPartyAccountId,File _file,String url,String paramCallback,SecurityContext securityContext) throws NotFoundException;
    public abstract Response tts( @NotNull Long accountId, @NotNull String text,String thirdPartyAccountId,String language,String voice,String paramCallback,SecurityContext securityContext) throws NotFoundException;
}
