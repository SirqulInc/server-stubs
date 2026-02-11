package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.OrsonApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/orson")


@io.swagger.annotations.Api(description = "the orson API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-11T19:26:53.173546244Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonApi  {

    @Inject OrsonApiService service;

    @POST
    @Path("/ai/addMovie")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Movie", notes = "Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public Response addMovie( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("movieName") String movieName, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("tags") String tags, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.addMovie(accountId,movieName,thirdPartyAccountId,tags,_file,url,paramCallback,securityContext);
    }
    @GET
    @Path("/ai/docs")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Docs", notes = "Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiDocs( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("doc") String doc, @QueryParam("return_topics") Boolean returnTopics, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiDocs(accountId,doc,returnTopics,limit,offset,securityContext);
    }
    @GET
    @Path("/ai/img")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find images", notes = "Returns a list of URIs of images that match the text.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiFindImages( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("text") String text, @QueryParam("parse_flag") String parseFlag, @QueryParam("fetch_flag") String fetchFlag, @QueryParam("size") String size,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiFindImages(accountId,text,parseFlag,fetchFlag,size,securityContext);
    }
    @GET
    @Path("/ai/tags")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tags", notes = "Search the tags column of user provided tags using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiTags( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("tags") String tags, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiTags(accountId,tags,conditional,limit,offset,securityContext);
    }
    @GET
    @Path("/ai/text")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Text", notes = "Search the movie text column of movie text using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class) })
    public Response aiText( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("terms") String terms, @QueryParam("conditional") String conditional, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.aiText(accountId,terms,conditional,limit,offset,securityContext);
    }
    @POST
    @Path("/ai/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Analysis", notes = "Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public Response batch( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("limit") Integer limit, @QueryParam("operations") String operations, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.batch(accountId,thirdPartyAccountId,limit,operations,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/stories/episodes/instant")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Creates an instant episode", notes = "Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public Response createInstantEpisode( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createInstantEpisode(accountId,data,securityContext);
    }
    @POST
    @Path("/ai/voiceCanvas")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create VoiceCanvas images", notes = "Create VoiceCanvas images for provided text, file upload, or file URL", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public Response createVoiceCanvas( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("dimensions") String dimensions, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("text") String text, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("parseFlag") Boolean parseFlag, @QueryParam("fetchFlag") Boolean fetchFlag, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVoiceCanvas(accountId,dimensions,thirdPartyAccountId,text,_file,url,parseFlag,fetchFlag,paramCallback,securityContext);
    }
    @POST
    @Path("/ai/emotion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect emotions", notes = "Detects emotions in an audio or video recording.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public Response emotion( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.emotion(accountId,thirdPartyAccountId,_file,url,paramCallback,securityContext);
    }
    @GET
    @Path("/ai/addMovie/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Add Movie Result", notes = "Get the result of an in progress Add Movie request from an earlier POST.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class) })
    public Response getAddMovieResult( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAddMovieResult(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/batch/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Batch Analysis Results", notes = "Gets the completed Video Batch results, if done, or an error or status update if not.", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class) })
    public Response getBatch( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBatch(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/emotion/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Emotion Results", notes = "Checks the Emotion analysis and returns in progress, results, or error.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class) })
    public Response getEmotion( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEmotion(requestId,accountId,securityContext);
    }
    @GET
    @Path("/stories/episodes/{episodeId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class) })
    public Response getEpisodeStatus( @PathParam("episodeId") Long episodeId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEpisodeStatus(episodeId,accountId,securityContext);
    }
    @GET
    @Path("/stories/renders/{renderId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public Response getRenderStatus( @PathParam("renderId") String renderId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRenderStatus(renderId,accountId,securityContext);
    }
    @GET
    @Path("/ai/stt/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Speach to Text Result", notes = "The results of the video transcription and optional translation.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public Response getSTT( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getSTT(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/tts/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Text to Speach Result", notes = "Check the status of an in progress Text-to-Speech call or download the result.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public Response getTTS( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTTS(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/techTune/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get TechTune Results", notes = "Get a result or continue waiting for a pending request for TechTune analysis.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public Response getTechTune( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTechTune(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/topics/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Topics", notes = "Get the result of an in progress Topics Analysis from an earlier POST.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public Response getTopics( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTopics(requestId,accountId,securityContext);
    }
    @GET
    @Path("/ai/voiceCanvas/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get VoiceCanvas images", notes = "Get a result or continue waiting for a pending request for VoiceCanvas Images.", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class) })
    public Response getVoiceCanvas( @PathParam("requestId") String requestId, @NotNull @QueryParam("accountId") Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVoiceCanvas(requestId,accountId,securityContext);
    }
    @POST
    @Path("/stories/renders")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Starts a StoryStitch video render", notes = "Starts a StoryStitch video render to produce your final video, returning the status details.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class) })
    public Response startVideoRender( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("data") String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.startVideoRender(accountId,data,securityContext);
    }
    @POST
    @Path("/ai/stt")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Speach to Text", notes = "Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class) })
    public Response stt( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("sourceLanguage") String sourceLanguage, @QueryParam("targetLanguage") String targetLanguage, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.stt(accountId,thirdPartyAccountId,sourceLanguage,targetLanguage,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/ai/topics")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summarize Topics", notes = "Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class) })
    public Response summarizeTopics( @NotNull @QueryParam("accountId") Long accountId, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("doc") String doc, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.summarizeTopics(accountId,thirdPartyAccountId,doc,_file,url,limit,offset,paramCallback,securityContext);
    }
    @POST
    @Path("/ai/techTune")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect Technical Issues", notes = "Analyses a movie file to detect technical issues, such as too few people in frame.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class) })
    public Response techTune( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("numFacesExpected") Integer numFacesExpected, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("file") File _file, @QueryParam("url") String url, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.techTune(accountId,numFacesExpected,thirdPartyAccountId,_file,url,paramCallback,securityContext);
    }
    @POST
    @Path("/ai/tts")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Text to Speach", notes = "Creates an audio file for the given text, with the option of language and voice selection.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class) })
    public Response tts( @NotNull @QueryParam("accountId") Long accountId, @NotNull @QueryParam("text") String text, @QueryParam("thirdPartyAccountId") String thirdPartyAccountId, @QueryParam("language") String language, @QueryParam("voice") String voice, @QueryParam("callback") String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.tts(accountId,text,thirdPartyAccountId,language,voice,paramCallback,securityContext);
    }
}
