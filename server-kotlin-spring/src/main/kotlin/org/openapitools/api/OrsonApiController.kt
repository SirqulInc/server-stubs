package org.openapitools.api

import org.openapitools.model.OrsonAiAddMovieResponse
import org.openapitools.model.OrsonAiBatchResponse
import org.openapitools.model.OrsonAiEmotionsResponse
import org.openapitools.model.OrsonAiProtoResponse
import org.openapitools.model.OrsonAiSTTResponse
import org.openapitools.model.OrsonAiTTSResponse
import org.openapitools.model.OrsonAiTechTuneResponse
import org.openapitools.model.OrsonAiTopicsResponse
import org.openapitools.model.OrsonAiVoiceCanvasResponse
import org.openapitools.model.OrsonEpisodeResponse
import org.openapitools.model.OrsonRenderResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class OrsonApiController() {

    @Operation(
        summary = "Add Movie",
        operationId = "addMovie",
        description = """Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiAddMovieResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/addMovie"
        value = [PATH_ADD_MOVIE],
        produces = ["*/*"]
    )
    fun addMovie(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Movie Name", required = true) @Valid @RequestParam(value = "movieName", required = true) movieName: kotlin.String,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "A user defined list (comma-delimited) of tags associated with the movie") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiAddMovieResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Docs",
        operationId = "aiDocs",
        description = """Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiProtoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/docs"
        value = [PATH_AI_DOCS],
        produces = ["*/*"]
    )
    fun aiDocs(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Doc", required = true) @Valid @RequestParam(value = "doc", required = true) doc: kotlin.String,
        @Parameter(description = "Return Topics") @Valid @RequestParam(value = "return_topics", required = false) returnTopics: kotlin.Boolean?,
        @Parameter(description = "Limit") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Offset") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?
    ): ResponseEntity<OrsonAiProtoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Find images",
        operationId = "aiFindImages",
        description = """Returns a list of URIs of images that match the text.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiProtoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/img"
        value = [PATH_AI_FIND_IMAGES],
        produces = ["*/*"]
    )
    fun aiFindImages(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Text", required = true) @Valid @RequestParam(value = "text", required = true) text: kotlin.String,
        @Parameter(description = "Parse Flag") @Valid @RequestParam(value = "parse_flag", required = false) parseFlag: kotlin.String?,
        @Parameter(description = "Fetch Flag") @Valid @RequestParam(value = "fetch_flag", required = false) fetchFlag: kotlin.String?,
        @Parameter(description = "Size") @Valid @RequestParam(value = "size", required = false) size: kotlin.String?
    ): ResponseEntity<OrsonAiProtoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tags",
        operationId = "aiTags",
        description = """Search the tags column of user provided tags using this endpoint.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiProtoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/tags"
        value = [PATH_AI_TAGS],
        produces = ["*/*"]
    )
    fun aiTags(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Tags", required = true) @Valid @RequestParam(value = "tags", required = true) tags: kotlin.String,
        @Parameter(description = "Conditional") @Valid @RequestParam(value = "conditional", required = false) conditional: kotlin.String?,
        @Parameter(description = "Limit") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Offset") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?
    ): ResponseEntity<OrsonAiProtoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Text",
        operationId = "aiText",
        description = """Search the movie text column of movie text using this endpoint.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiProtoResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/text"
        value = [PATH_AI_TEXT],
        produces = ["*/*"]
    )
    fun aiText(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Terms", required = true) @Valid @RequestParam(value = "terms", required = true) terms: kotlin.String,
        @Parameter(description = "Conditional") @Valid @RequestParam(value = "conditional", required = false) conditional: kotlin.String?,
        @Parameter(description = "Limit") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Offset") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?
    ): ResponseEntity<OrsonAiProtoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Batch Analysis",
        operationId = "batch",
        description = """Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiBatchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/batch"
        value = [PATH_BATCH],
        produces = ["*/*"]
    )
    fun batch(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "The number of topics to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions") @Valid @RequestParam(value = "operations", required = false) operations: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Creates an instant episode",
        operationId = "createInstantEpisode",
        description = """Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonEpisodeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/stories/episodes/instant"
        value = [PATH_CREATE_INSTANT_EPISODE],
        produces = ["*/*"]
    )
    fun createInstantEpisode(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Request Data String", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String
    ): ResponseEntity<OrsonEpisodeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create VoiceCanvas images",
        operationId = "createVoiceCanvas",
        description = """Create VoiceCanvas images for provided text, file upload, or file URL""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiVoiceCanvasResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/voiceCanvas"
        value = [PATH_CREATE_VOICE_CANVAS],
        produces = ["*/*"]
    )
    fun createVoiceCanvas(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Enum: \"256x256\" \"512x512\" \"1024x1024\"", required = true) @Valid @RequestParam(value = "dimensions", required = true) dimensions: kotlin.String,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "Provide a transcript or previously extracted topics for image generation") @Valid @RequestParam(value = "text", required = false) text: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When false, uses the raw value from text instead of identifying topics to fetch/generate from") @Valid @RequestParam(value = "parseFlag", required = false) parseFlag: kotlin.Boolean?,
        @Parameter(description = "When true, fetches images instead of generating them") @Valid @RequestParam(value = "fetchFlag", required = false) fetchFlag: kotlin.Boolean?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiVoiceCanvasResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Detect emotions",
        operationId = "emotion",
        description = """Detects emotions in an audio or video recording.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiEmotionsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/emotion"
        value = [PATH_EMOTION],
        produces = ["*/*"]
    )
    fun emotion(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiEmotionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Add Movie Result",
        operationId = "getAddMovieResult",
        description = """Get the result of an in progress Add Movie request from an earlier POST.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiAddMovieResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/addMovie/{requestId}"
        value = [PATH_GET_ADD_MOVIE_RESULT],
        produces = ["*/*"]
    )
    fun getAddMovieResult(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiAddMovieResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Batch Analysis Results",
        operationId = "getBatch",
        description = """Gets the completed Video Batch results, if done, or an error or status update if not.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiBatchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/batch/{requestId}"
        value = [PATH_GET_BATCH],
        produces = ["*/*"]
    )
    fun getBatch(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiBatchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Emotion Results",
        operationId = "getEmotion",
        description = """Checks the Emotion analysis and returns in progress, results, or error.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiEmotionsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/emotion/{requestId}"
        value = [PATH_GET_EMOTION],
        produces = ["*/*"]
    )
    fun getEmotion(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiEmotionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Check episode status",
        operationId = "getEpisodeStatus",
        description = """Gets a summary of the episode's status, including any renders.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonEpisodeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/stories/episodes/{episodeId}/status"
        value = [PATH_GET_EPISODE_STATUS],
        produces = ["*/*"]
    )
    fun getEpisodeStatus(
        @Parameter(description = "Episode ID", required = true) @PathVariable("episodeId") episodeId: kotlin.Long,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonEpisodeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Check episode status",
        operationId = "getRenderStatus",
        description = """Gets a summary of the episode's status, including any renders.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonRenderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/stories/renders/{renderId}/status"
        value = [PATH_GET_RENDER_STATUS],
        produces = ["*/*"]
    )
    fun getRenderStatus(
        @Parameter(description = "Render ID", required = true) @PathVariable("renderId") renderId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonRenderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Speach to Text Result",
        operationId = "getSTT",
        description = """The results of the video transcription and optional translation.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiSTTResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/stt/{requestId}"
        value = [PATH_GET_STT],
        produces = ["*/*"]
    )
    fun getSTT(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiSTTResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Text to Speach Result",
        operationId = "getTTS",
        description = """Check the status of an in progress Text-to-Speech call or download the result.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTTSResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/tts/{requestId}"
        value = [PATH_GET_TTS],
        produces = ["*/*"]
    )
    fun getTTS(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiTTSResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get TechTune Results",
        operationId = "getTechTune",
        description = """Get a result or continue waiting for a pending request for TechTune analysis.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTechTuneResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/techTune/{requestId}"
        value = [PATH_GET_TECH_TUNE],
        produces = ["*/*"]
    )
    fun getTechTune(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiTechTuneResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Topics",
        operationId = "getTopics",
        description = """Get the result of an in progress Topics Analysis from an earlier POST.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTopicsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/topics/{requestId}"
        value = [PATH_GET_TOPICS],
        produces = ["*/*"]
    )
    fun getTopics(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiTopicsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get VoiceCanvas images",
        operationId = "getVoiceCanvas",
        description = """Get a result or continue waiting for a pending request for VoiceCanvas Images.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiVoiceCanvasResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/orson/ai/voiceCanvas/{requestId}"
        value = [PATH_GET_VOICE_CANVAS],
        produces = ["*/*"]
    )
    fun getVoiceCanvas(
        @Parameter(description = "Orson Request Id", required = true) @PathVariable("requestId") requestId: kotlin.String,
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long
    ): ResponseEntity<OrsonAiVoiceCanvasResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Starts a StoryStitch video render",
        operationId = "startVideoRender",
        description = """Starts a StoryStitch video render to produce your final video, returning the status details.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonRenderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/stories/renders"
        value = [PATH_START_VIDEO_RENDER],
        produces = ["*/*"]
    )
    fun startVideoRender(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Request Data String", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String
    ): ResponseEntity<OrsonRenderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Speach to Text",
        operationId = "stt",
        description = """Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiSTTResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/stt"
        value = [PATH_STT],
        produces = ["*/*"]
    )
    fun stt(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "Source Language") @Valid @RequestParam(value = "sourceLanguage", required = false) sourceLanguage: kotlin.String?,
        @Parameter(description = "Target Language") @Valid @RequestParam(value = "targetLanguage", required = false) targetLanguage: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiSTTResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Summarize Topics",
        operationId = "summarizeTopics",
        description = """Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTopicsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/topics"
        value = [PATH_SUMMARIZE_TOPICS],
        produces = ["*/*"]
    )
    fun summarizeTopics(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "The text to get topics for.") @Valid @RequestParam(value = "doc", required = false) doc: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "The number of results to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The starting offset into the total result set to start from") @Valid @RequestParam(value = "offset", required = false) offset: kotlin.Int?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiTopicsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Detect Technical Issues",
        operationId = "techTune",
        description = """Analyses a movie file to detect technical issues, such as too few people in frame.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTechTuneResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/techTune"
        value = [PATH_TECH_TUNE],
        produces = ["*/*"]
    )
    fun techTune(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Number of expected faces", required = true) @Valid @RequestParam(value = "numFacesExpected", required = true) numFacesExpected: kotlin.Int,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "An uploaded recording to analyze (Currently limited to 10MB)") @Valid @RequestParam(value = "file", required = false) file: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "A recording file to download and analyze (Size limit: 1GB)") @Valid @RequestParam(value = "url", required = false) url: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiTechTuneResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Text to Speach",
        operationId = "tts",
        description = """Creates an audio file for the given text, with the option of language and voice selection.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrsonAiTTSResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/orson/ai/tts"
        value = [PATH_TTS],
        produces = ["*/*"]
    )
    fun tts(
        @NotNull @Parameter(description = "Sirqul Account Id", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Text", required = true) @Valid @RequestParam(value = "text", required = true) text: kotlin.String,
        @Parameter(description = "A third-party account id that is meaningful to your systems") @Valid @RequestParam(value = "thirdPartyAccountId", required = false) thirdPartyAccountId: kotlin.String?,
        @Parameter(description = "The language to use for the speaker and incoming text") @Valid @RequestParam(value = "language", required = false) language: kotlin.String?,
        @Parameter(description = "A language-specific voice to use, or picks the language default if not provided") @Valid @RequestParam(value = "voice", required = false) voice: kotlin.String?,
        @Parameter(description = "When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open") @Valid @RequestParam(value = "callback", required = false) paramCallback: kotlin.String?
    ): ResponseEntity<OrsonAiTTSResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_MOVIE: String = "/orson/ai/addMovie"
        const val PATH_AI_DOCS: String = "/orson/ai/docs"
        const val PATH_AI_FIND_IMAGES: String = "/orson/ai/img"
        const val PATH_AI_TAGS: String = "/orson/ai/tags"
        const val PATH_AI_TEXT: String = "/orson/ai/text"
        const val PATH_BATCH: String = "/orson/ai/batch"
        const val PATH_CREATE_INSTANT_EPISODE: String = "/orson/stories/episodes/instant"
        const val PATH_CREATE_VOICE_CANVAS: String = "/orson/ai/voiceCanvas"
        const val PATH_EMOTION: String = "/orson/ai/emotion"
        const val PATH_GET_ADD_MOVIE_RESULT: String = "/orson/ai/addMovie/{requestId}"
        const val PATH_GET_BATCH: String = "/orson/ai/batch/{requestId}"
        const val PATH_GET_EMOTION: String = "/orson/ai/emotion/{requestId}"
        const val PATH_GET_EPISODE_STATUS: String = "/orson/stories/episodes/{episodeId}/status"
        const val PATH_GET_RENDER_STATUS: String = "/orson/stories/renders/{renderId}/status"
        const val PATH_GET_STT: String = "/orson/ai/stt/{requestId}"
        const val PATH_GET_TTS: String = "/orson/ai/tts/{requestId}"
        const val PATH_GET_TECH_TUNE: String = "/orson/ai/techTune/{requestId}"
        const val PATH_GET_TOPICS: String = "/orson/ai/topics/{requestId}"
        const val PATH_GET_VOICE_CANVAS: String = "/orson/ai/voiceCanvas/{requestId}"
        const val PATH_START_VIDEO_RENDER: String = "/orson/stories/renders"
        const val PATH_STT: String = "/orson/ai/stt"
        const val PATH_SUMMARIZE_TOPICS: String = "/orson/ai/topics"
        const val PATH_TECH_TUNE: String = "/orson/ai/techTune"
        const val PATH_TTS: String = "/orson/ai/tts"
    }
}
