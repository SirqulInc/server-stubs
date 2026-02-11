package org.openapitools.api;

import org.openapitools.api.OrsonApiService;
import org.openapitools.api.factories.OrsonApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/orson")


@io.swagger.annotations.Api(description = "the orson API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-02-11T19:26:26.286774429Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
public class OrsonApi  {
   private final OrsonApiService delegate;

   public OrsonApi(@Context ServletConfig servletContext) {
      OrsonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OrsonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OrsonApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = OrsonApiServiceFactory.getOrsonApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/ai/addMovie")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Add Movie", notes = "Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class)
    })
    public Response addMovie(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Movie Name", required = true) @QueryParam("movieName") @NotNull  String movieName,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "A user defined list (comma-delimited) of tags associated with the movie") @QueryParam("tags")  String tags,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addMovie(accountId, movieName, thirdPartyAccountId, tags, _file, url, paramCallback, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/docs")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Docs", notes = "Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class)
    })
    public Response aiDocs(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Doc", required = true) @QueryParam("doc") @NotNull  String doc,@ApiParam(value = "Return Topics") @QueryParam("return_topics")  Boolean returnTopics,@ApiParam(value = "Limit") @QueryParam("limit")  Integer limit,@ApiParam(value = "Offset") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aiDocs(accountId, doc, returnTopics, limit, offset, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/img")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Find images", notes = "Returns a list of URIs of images that match the text.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class)
    })
    public Response aiFindImages(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Text", required = true) @QueryParam("text") @NotNull  String text,@ApiParam(value = "Parse Flag") @QueryParam("parse_flag")  String parseFlag,@ApiParam(value = "Fetch Flag") @QueryParam("fetch_flag")  String fetchFlag,@ApiParam(value = "Size") @QueryParam("size")  String size,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aiFindImages(accountId, text, parseFlag, fetchFlag, size, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/tags")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Tags", notes = "Search the tags column of user provided tags using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class)
    })
    public Response aiTags(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Tags", required = true) @QueryParam("tags") @NotNull  String tags,@ApiParam(value = "Conditional") @QueryParam("conditional")  String conditional,@ApiParam(value = "Limit") @QueryParam("limit")  Integer limit,@ApiParam(value = "Offset") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aiTags(accountId, tags, conditional, limit, offset, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/text")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Search Text", notes = "Search the movie text column of movie text using this endpoint.", response = OrsonAiProtoResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiProtoResponse.class)
    })
    public Response aiText(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Terms", required = true) @QueryParam("terms") @NotNull  String terms,@ApiParam(value = "Conditional") @QueryParam("conditional")  String conditional,@ApiParam(value = "Limit") @QueryParam("limit")  Integer limit,@ApiParam(value = "Offset") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.aiText(accountId, terms, conditional, limit, offset, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/batch")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Batch Analysis", notes = "Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class)
    })
    public Response batch(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "The number of topics to return") @QueryParam("limit")  Integer limit,@ApiParam(value = "The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions") @QueryParam("operations")  String operations,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.batch(accountId, thirdPartyAccountId, limit, operations, _file, url, paramCallback, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/stories/episodes/instant")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Creates an instant episode", notes = "Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class)
    })
    public Response createInstantEpisode(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Request Data String", required = true) @QueryParam("data") @NotNull  String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createInstantEpisode(accountId, data, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/voiceCanvas")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Create VoiceCanvas images", notes = "Create VoiceCanvas images for provided text, file upload, or file URL", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class)
    })
    public Response createVoiceCanvas(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Enum: \"256x256\" \"512x512\" \"1024x1024\"", required = true) @QueryParam("dimensions") @NotNull  String dimensions,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "Provide a transcript or previously extracted topics for image generation") @QueryParam("text")  String text,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When false, uses the raw value from text instead of identifying topics to fetch/generate from") @QueryParam("parseFlag")  Boolean parseFlag,@ApiParam(value = "When true, fetches images instead of generating them") @QueryParam("fetchFlag")  Boolean fetchFlag,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVoiceCanvas(accountId, dimensions, thirdPartyAccountId, text, _file, url, parseFlag, fetchFlag, paramCallback, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/emotion")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect emotions", notes = "Detects emotions in an audio or video recording.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class)
    })
    public Response emotion(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.emotion(accountId, thirdPartyAccountId, _file, url, paramCallback, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/addMovie/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Add Movie Result", notes = "Get the result of an in progress Add Movie request from an earlier POST.", response = OrsonAiAddMovieResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiAddMovieResponse.class)
    })
    public Response getAddMovieResult(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAddMovieResult(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/batch/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Batch Analysis Results", notes = "Gets the completed Video Batch results, if done, or an error or status update if not.", response = OrsonAiBatchResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiBatchResponse.class)
    })
    public Response getBatch(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBatch(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/emotion/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Emotion Results", notes = "Checks the Emotion analysis and returns in progress, results, or error.", response = OrsonAiEmotionsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiEmotionsResponse.class)
    })
    public Response getEmotion(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEmotion(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/stories/episodes/{episodeId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonEpisodeResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonEpisodeResponse.class)
    })
    public Response getEpisodeStatus(@ApiParam(value = "Episode ID", required = true) @PathParam("episodeId") @NotNull  Long episodeId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEpisodeStatus(episodeId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/stories/renders/{renderId}/status")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Check episode status", notes = "Gets a summary of the episode's status, including any renders.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class)
    })
    public Response getRenderStatus(@ApiParam(value = "Render ID", required = true) @PathParam("renderId") @NotNull  String renderId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRenderStatus(renderId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/stt/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Speach to Text Result", notes = "The results of the video transcription and optional translation.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class)
    })
    public Response getSTT(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSTT(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/tts/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Text to Speach Result", notes = "Check the status of an in progress Text-to-Speech call or download the result.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class)
    })
    public Response getTTS(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTTS(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/techTune/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get TechTune Results", notes = "Get a result or continue waiting for a pending request for TechTune analysis.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class)
    })
    public Response getTechTune(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTechTune(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/topics/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get Topics", notes = "Get the result of an in progress Topics Analysis from an earlier POST.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class)
    })
    public Response getTopics(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTopics(requestId, accountId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/ai/voiceCanvas/{requestId}")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Get VoiceCanvas images", notes = "Get a result or continue waiting for a pending request for VoiceCanvas Images.", response = OrsonAiVoiceCanvasResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiVoiceCanvasResponse.class)
    })
    public Response getVoiceCanvas(@ApiParam(value = "Orson Request Id", required = true) @PathParam("requestId") @NotNull  String requestId,@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVoiceCanvas(requestId, accountId, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/stories/renders")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Starts a StoryStitch video render", notes = "Starts a StoryStitch video render to produce your final video, returning the status details.", response = OrsonRenderResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonRenderResponse.class)
    })
    public Response startVideoRender(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Request Data String", required = true) @QueryParam("data") @NotNull  String data,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.startVideoRender(accountId, data, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/stt")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Speach to Text", notes = "Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.", response = OrsonAiSTTResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiSTTResponse.class)
    })
    public Response stt(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "Source Language") @QueryParam("sourceLanguage")  String sourceLanguage,@ApiParam(value = "Target Language") @QueryParam("targetLanguage")  String targetLanguage,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.stt(accountId, thirdPartyAccountId, sourceLanguage, targetLanguage, _file, url, paramCallback, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/topics")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Summarize Topics", notes = "Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.", response = OrsonAiTopicsResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTopicsResponse.class)
    })
    public Response summarizeTopics(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "The text to get topics for.") @QueryParam("doc")  String doc,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "The number of results to return") @QueryParam("limit")  Integer limit,@ApiParam(value = "The starting offset into the total result set to start from") @QueryParam("offset")  Integer offset,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.summarizeTopics(accountId, thirdPartyAccountId, doc, _file, url, limit, offset, paramCallback, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/techTune")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Detect Technical Issues", notes = "Analyses a movie file to detect technical issues, such as too few people in frame.", response = OrsonAiTechTuneResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTechTuneResponse.class)
    })
    public Response techTune(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Number of expected faces", required = true) @QueryParam("numFacesExpected") @NotNull  Integer numFacesExpected,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "An uploaded recording to analyze (Currently limited to 10MB)") @QueryParam("file")  File _file,@ApiParam(value = "A recording file to download and analyze (Size limit: 1GB)") @QueryParam("url")  String url,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.techTune(accountId, numFacesExpected, thirdPartyAccountId, _file, url, paramCallback, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/ai/tts")
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "Text to Speach", notes = "Creates an audio file for the given text, with the option of language and voice selection.", response = OrsonAiTTSResponse.class, tags={ "Orson", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = OrsonAiTTSResponse.class)
    })
    public Response tts(@ApiParam(value = "Sirqul Account Id", required = true) @QueryParam("accountId") @NotNull  Long accountId,@ApiParam(value = "Text", required = true) @QueryParam("text") @NotNull  String text,@ApiParam(value = "A third-party account id that is meaningful to your systems") @QueryParam("thirdPartyAccountId")  String thirdPartyAccountId,@ApiParam(value = "The language to use for the speaker and incoming text") @QueryParam("language")  String language,@ApiParam(value = "A language-specific voice to use, or picks the language default if not provided") @QueryParam("voice")  String voice,@ApiParam(value = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @QueryParam("callback")  String paramCallback,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.tts(accountId, text, thirdPartyAccountId, language, voice, paramCallback, securityContext);
    }
}
