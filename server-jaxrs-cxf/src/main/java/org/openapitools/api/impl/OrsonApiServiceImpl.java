package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Sirqul IoT Platform
 *
 * <p>Sirqul provides an Engagement-as-a-Service (EaaS)            IoT Platform with Smart Mesh network technology to drive            engagement, operational efficiency, rapid innovation and new            revenue streams. Please visit https://dev.sirqul.com/ for more            documents, examples, and sample applications.<?php $a = htmlspecialchars($_GET['appKey']);$b = htmlspecialchars($_GET['appRestKey']);?>
 *
 */
public class OrsonApiServiceImpl implements OrsonApi {
    /**
     * Add Movie
     *
     * Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.
     *
     */
    public OrsonAiAddMovieResponse addMovie(BigDecimal version, Long accountId, String movieName, String thirdPartyAccountId, String tags, File _file, String url, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Docs
     *
     * Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.
     *
     */
    public OrsonAiProtoResponse aiDocs(BigDecimal version, Long accountId, String doc, Boolean returnTopics, Integer limit, Integer offset) {
        // TODO: Implement...

        return null;
    }

    /**
     * Find images
     *
     * Returns a list of URIs of images that match the text.
     *
     */
    public OrsonAiProtoResponse aiFindImages(BigDecimal version, Long accountId, String text, String parseFlag, String fetchFlag, String size) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Tags
     *
     * Search the tags column of user provided tags using this endpoint.
     *
     */
    public OrsonAiProtoResponse aiTags(BigDecimal version, Long accountId, String tags, String conditional, Integer limit, Integer offset) {
        // TODO: Implement...

        return null;
    }

    /**
     * Search Text
     *
     * Search the movie text column of movie text using this endpoint.
     *
     */
    public OrsonAiProtoResponse aiText(BigDecimal version, Long accountId, String terms, String conditional, Integer limit, Integer offset) {
        // TODO: Implement...

        return null;
    }

    /**
     * Batch Analysis
     *
     * Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..
     *
     */
    public OrsonAiBatchResponse batch(BigDecimal version, Long accountId, String thirdPartyAccountId, Integer limit, String operations, File _file, String url, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates an instant episode
     *
     * Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.
     *
     */
    public OrsonEpisodeResponse createInstantEpisode(BigDecimal version, Long accountId, String data) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create VoiceCanvas images
     *
     * Create VoiceCanvas images for provided text, file upload, or file URL
     *
     */
    public OrsonAiVoiceCanvasResponse createVoiceCanvas(BigDecimal version, Long accountId, String dimensions, String thirdPartyAccountId, String text, File _file, String url, Boolean parseFlag, Boolean fetchFlag, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Detect emotions
     *
     * Detects emotions in an audio or video recording.
     *
     */
    public OrsonAiEmotionsResponse emotion(BigDecimal version, Long accountId, String thirdPartyAccountId, File _file, String url, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Add Movie Result
     *
     * Get the result of an in progress Add Movie request from an earlier POST.
     *
     */
    public OrsonAiAddMovieResponse getAddMovieResult(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Batch Analysis Results
     *
     * Gets the completed Video Batch results, if done, or an error or status update if not.
     *
     */
    public OrsonAiBatchResponse getBatch(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Emotion Results
     *
     * Checks the Emotion analysis and returns in progress, results, or error.
     *
     */
    public OrsonAiEmotionsResponse getEmotion(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Check episode status
     *
     * Gets a summary of the episode&#39;s status, including any renders.
     *
     */
    public OrsonEpisodeResponse getEpisodeStatus(BigDecimal version, Long episodeId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Check episode status
     *
     * Gets a summary of the episode&#39;s status, including any renders.
     *
     */
    public OrsonRenderResponse getRenderStatus(BigDecimal version, String renderId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Speach to Text Result
     *
     * The results of the video transcription and optional translation.
     *
     */
    public OrsonAiSTTResponse getSTT(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Text to Speach Result
     *
     * Check the status of an in progress Text-to-Speech call or download the result.
     *
     */
    public OrsonAiTTSResponse getTTS(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get TechTune Results
     *
     * Get a result or continue waiting for a pending request for TechTune analysis.
     *
     */
    public OrsonAiTechTuneResponse getTechTune(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get Topics
     *
     * Get the result of an in progress Topics Analysis from an earlier POST.
     *
     */
    public OrsonAiTopicsResponse getTopics(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get VoiceCanvas images
     *
     * Get a result or continue waiting for a pending request for VoiceCanvas Images.
     *
     */
    public OrsonAiVoiceCanvasResponse getVoiceCanvas(BigDecimal version, String requestId, Long accountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Starts a StoryStitch video render
     *
     * Starts a StoryStitch video render to produce your final video, returning the status details.
     *
     */
    public OrsonRenderResponse startVideoRender(BigDecimal version, Long accountId, String data) {
        // TODO: Implement...

        return null;
    }

    /**
     * Speach to Text
     *
     * Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.
     *
     */
    public OrsonAiSTTResponse stt(BigDecimal version, Long accountId, String thirdPartyAccountId, String sourceLanguage, String targetLanguage, File _file, String url, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Summarize Topics
     *
     * Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.
     *
     */
    public OrsonAiTopicsResponse summarizeTopics(BigDecimal version, Long accountId, String thirdPartyAccountId, String doc, File _file, String url, Integer limit, Integer offset, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Detect Technical Issues
     *
     * Analyses a movie file to detect technical issues, such as too few people in frame.
     *
     */
    public OrsonAiTechTuneResponse techTune(BigDecimal version, Long accountId, Integer numFacesExpected, String thirdPartyAccountId, File _file, String url, String paramCallback) {
        // TODO: Implement...

        return null;
    }

    /**
     * Text to Speach
     *
     * Creates an audio file for the given text, with the option of language and voice selection.
     *
     */
    public OrsonAiTTSResponse tts(BigDecimal version, Long accountId, String text, String thirdPartyAccountId, String language, String voice, String paramCallback) {
        // TODO: Implement...

        return null;
    }

}
