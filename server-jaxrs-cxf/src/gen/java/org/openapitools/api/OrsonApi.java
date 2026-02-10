package org.openapitools.api;

import java.math.BigDecimal;
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
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
@Path("/api/{version}/orson")
@Api(value = "/", description = "")
public interface OrsonApi  {

    /**
     * Add Movie
     *
     * Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.
     *
     */
    @POST
    @Path("/ai/addMovie")
    @Produces({ "*/*" })
    @ApiOperation(value = "Add Movie", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public OrsonAiAddMovieResponse addMovie(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("movieName") @NotNull String movieName, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("tags") String tags, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback);

    /**
     * Search Docs
     *
     * Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.
     *
     */
    @GET
    @Path("/ai/docs")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Docs", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public OrsonAiProtoResponse aiDocs(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("doc") @NotNull String doc, @QueryParam("return_topics") Boolean returnTopics, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    /**
     * Find images
     *
     * Returns a list of URIs of images that match the text.
     *
     */
    @GET
    @Path("/ai/img")
    @Produces({ "*/*" })
    @ApiOperation(value = "Find images", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public OrsonAiProtoResponse aiFindImages(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("text") @NotNull String text, @QueryParam("parse_flag") String parseFlag, @QueryParam("fetch_flag") String fetchFlag, @QueryParam("size") String size);

    /**
     * Search Tags
     *
     * Search the tags column of user provided tags using this endpoint.
     *
     */
    @GET
    @Path("/ai/tags")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Tags", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public OrsonAiProtoResponse aiTags(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("tags") @NotNull String tags, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    /**
     * Search Text
     *
     * Search the movie text column of movie text using this endpoint.
     *
     */
    @GET
    @Path("/ai/text")
    @Produces({ "*/*" })
    @ApiOperation(value = "Search Text", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public OrsonAiProtoResponse aiText(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("terms") @NotNull String terms, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    /**
     * Batch Analysis
     *
     * Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..
     *
     */
    @POST
    @Path("/ai/batch")
    @Produces({ "*/*" })
    @ApiOperation(value = "Batch Analysis", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public OrsonAiBatchResponse batch(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("limit") Integer limit, @QueryParam("operations") String operations, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback);

    /**
     * Creates an instant episode
     *
     * Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.
     *
     */
    @POST
    @Path("/stories/episodes/instant")
    @Produces({ "*/*" })
    @ApiOperation(value = "Creates an instant episode", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public OrsonEpisodeResponse createInstantEpisode(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("data") @NotNull String data);

    /**
     * Create VoiceCanvas images
     *
     * Create VoiceCanvas images for provided text, file upload, or file URL
     *
     */
    @POST
    @Path("/ai/voiceCanvas")
    @Produces({ "*/*" })
    @ApiOperation(value = "Create VoiceCanvas images", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public OrsonAiVoiceCanvasResponse createVoiceCanvas(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("dimensions") @NotNull String dimensions, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("text") String text, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("parseFlag") Boolean parseFlag, @QueryParam("fetchFlag") Boolean fetchFlag, @QueryParam("callback") String paramCallback);

    /**
     * Detect emotions
     *
     * Detects emotions in an audio or video recording.
     *
     */
    @POST
    @Path("/ai/emotion")
    @Produces({ "*/*" })
    @ApiOperation(value = "Detect emotions", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public OrsonAiEmotionsResponse emotion(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback);

    /**
     * Get Add Movie Result
     *
     * Get the result of an in progress Add Movie request from an earlier POST.
     *
     */
    @GET
    @Path("/ai/addMovie/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Add Movie Result", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public OrsonAiAddMovieResponse getAddMovieResult(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Batch Analysis Results
     *
     * Gets the completed Video Batch results, if done, or an error or status update if not.
     *
     */
    @GET
    @Path("/ai/batch/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Batch Analysis Results", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public OrsonAiBatchResponse getBatch(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Emotion Results
     *
     * Checks the Emotion analysis and returns in progress, results, or error.
     *
     */
    @GET
    @Path("/ai/emotion/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Emotion Results", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public OrsonAiEmotionsResponse getEmotion(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Check episode status
     *
     * Gets a summary of the episode&#39;s status, including any renders.
     *
     */
    @GET
    @Path("/stories/episodes/{episodeId}/status")
    @Produces({ "*/*" })
    @ApiOperation(value = "Check episode status", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public OrsonEpisodeResponse getEpisodeStatus(@PathParam("version") BigDecimal version, @PathParam("episodeId") Long episodeId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Check episode status
     *
     * Gets a summary of the episode&#39;s status, including any renders.
     *
     */
    @GET
    @Path("/stories/renders/{renderId}/status")
    @Produces({ "*/*" })
    @ApiOperation(value = "Check episode status", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public OrsonRenderResponse getRenderStatus(@PathParam("version") BigDecimal version, @PathParam("renderId") String renderId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Speach to Text Result
     *
     * The results of the video transcription and optional translation.
     *
     */
    @GET
    @Path("/ai/stt/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Speach to Text Result", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public OrsonAiSTTResponse getSTT(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Text to Speach Result
     *
     * Check the status of an in progress Text-to-Speech call or download the result.
     *
     */
    @GET
    @Path("/ai/tts/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Text to Speach Result", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public OrsonAiTTSResponse getTTS(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get TechTune Results
     *
     * Get a result or continue waiting for a pending request for TechTune analysis.
     *
     */
    @GET
    @Path("/ai/techTune/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get TechTune Results", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public OrsonAiTechTuneResponse getTechTune(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get Topics
     *
     * Get the result of an in progress Topics Analysis from an earlier POST.
     *
     */
    @GET
    @Path("/ai/topics/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Topics", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public OrsonAiTopicsResponse getTopics(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Get VoiceCanvas images
     *
     * Get a result or continue waiting for a pending request for VoiceCanvas Images.
     *
     */
    @GET
    @Path("/ai/voiceCanvas/{requestId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get VoiceCanvas images", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public OrsonAiVoiceCanvasResponse getVoiceCanvas(@PathParam("version") BigDecimal version, @PathParam("requestId") String requestId, @QueryParam("accountId") @NotNull Long accountId);

    /**
     * Starts a StoryStitch video render
     *
     * Starts a StoryStitch video render to produce your final video, returning the status details.
     *
     */
    @POST
    @Path("/stories/renders")
    @Produces({ "*/*" })
    @ApiOperation(value = "Starts a StoryStitch video render", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public OrsonRenderResponse startVideoRender(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("data") @NotNull String data);

    /**
     * Speach to Text
     *
     * Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.
     *
     */
    @POST
    @Path("/ai/stt")
    @Produces({ "*/*" })
    @ApiOperation(value = "Speach to Text", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public OrsonAiSTTResponse stt(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("sourceLanguage") String sourceLanguage, @QueryParam("targetLanguage") String targetLanguage, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback);

    /**
     * Summarize Topics
     *
     * Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.
     *
     */
    @POST
    @Path("/ai/topics")
    @Produces({ "*/*" })
    @ApiOperation(value = "Summarize Topics", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public OrsonAiTopicsResponse summarizeTopics(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("doc") String doc, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("callback") String paramCallback);

    /**
     * Detect Technical Issues
     *
     * Analyses a movie file to detect technical issues, such as too few people in frame.
     *
     */
    @POST
    @Path("/ai/techTune")
    @Produces({ "*/*" })
    @ApiOperation(value = "Detect Technical Issues", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public OrsonAiTechTuneResponse techTune(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("numFacesExpected") @NotNull Integer numFacesExpected, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback);

    /**
     * Text to Speach
     *
     * Creates an audio file for the given text, with the option of language and voice selection.
     *
     */
    @POST
    @Path("/ai/tts")
    @Produces({ "*/*" })
    @ApiOperation(value = "Text to Speach", tags={ "Orson" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public OrsonAiTTSResponse tts(@PathParam("version") BigDecimal version, @QueryParam("accountId") @NotNull Long accountId, @QueryParam("text") @NotNull String text, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("language") String language, @QueryParam("voice") String voice, @QueryParam("callback") String paramCallback);
}
