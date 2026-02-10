package api

import play.api.libs.json._
import model.BigDecimal
import model.OrsonAiAddMovieResponse
import model.OrsonAiBatchResponse
import model.OrsonAiEmotionsResponse
import model.OrsonAiProtoResponse
import model.OrsonAiSTTResponse
import model.OrsonAiTTSResponse
import model.OrsonAiTechTuneResponse
import model.OrsonAiTopicsResponse
import model.OrsonAiVoiceCanvasResponse
import model.OrsonEpisodeResponse
import model.OrsonRenderResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OrsonApi {
  /**
    * Add Movie
    * Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.
    * @param accountId Sirqul Account Id
    * @param movieName Movie Name
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param tags A user defined list (comma-delimited) of tags associated with the movie
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def addMovie(version: BigDecimal, accountId: Long, movieName: String, thirdPartyAccountId: Option[String], tags: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiAddMovieResponse

  /**
    * Search Docs
    * Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.
    * @param accountId Sirqul Account Id
    * @param doc Doc
    * @param returnTopics Return Topics
    * @param limit Limit
    * @param offset Offset
    */
  def aiDocs(version: BigDecimal, accountId: Long, doc: String, returnTopics: Option[Boolean], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse

  /**
    * Find images
    * Returns a list of URIs of images that match the text.
    * @param accountId Sirqul Account Id
    * @param text Text
    * @param parseFlag Parse Flag
    * @param fetchFlag Fetch Flag
    * @param size Size
    */
  def aiFindImages(version: BigDecimal, accountId: Long, text: String, parseFlag: Option[String], fetchFlag: Option[String], size: Option[String]): OrsonAiProtoResponse

  /**
    * Search Tags
    * Search the tags column of user provided tags using this endpoint.
    * @param accountId Sirqul Account Id
    * @param tags Tags
    * @param conditional Conditional
    * @param limit Limit
    * @param offset Offset
    */
  def aiTags(version: BigDecimal, accountId: Long, tags: String, conditional: Option[String], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse

  /**
    * Search Text
    * Search the movie text column of movie text using this endpoint.
    * @param accountId Sirqul Account Id
    * @param terms Terms
    * @param conditional Conditional
    * @param limit Limit
    * @param offset Offset
    */
  def aiText(version: BigDecimal, accountId: Long, terms: String, conditional: Option[String], limit: Option[Int], offset: Option[Int]): OrsonAiProtoResponse

  /**
    * Batch Analysis
    * Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..
    * @param accountId Sirqul Account Id
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param limit The number of topics to return
    * @param operations The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def batch(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], limit: Option[Int], operations: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiBatchResponse

  /**
    * Creates an instant episode
    * Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.
    * @param accountId Sirqul Account Id
    * @param data Request Data String
    */
  def createInstantEpisode(version: BigDecimal, accountId: Long, data: String): OrsonEpisodeResponse

  /**
    * Create VoiceCanvas images
    * Create VoiceCanvas images for provided text, file upload, or file URL
    * @param accountId Sirqul Account Id
    * @param dimensions Enum: \&quot;256x256\&quot; \&quot;512x512\&quot; \&quot;1024x1024\&quot;
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param text Provide a transcript or previously extracted topics for image generation
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param parseFlag When false, uses the raw value from text instead of identifying topics to fetch/generate from
    * @param fetchFlag When true, fetches images instead of generating them
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def createVoiceCanvas(version: BigDecimal, accountId: Long, dimensions: String, thirdPartyAccountId: Option[String], text: Option[String], file: Option[TemporaryFile], url: Option[String], parseFlag: Option[Boolean], fetchFlag: Option[Boolean], callback: Option[String]): OrsonAiVoiceCanvasResponse

  /**
    * Detect emotions
    * Detects emotions in an audio or video recording.
    * @param accountId Sirqul Account Id
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def emotion(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiEmotionsResponse

  /**
    * Get Add Movie Result
    * Get the result of an in progress Add Movie request from an earlier POST.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getAddMovieResult(version: BigDecimal, requestId: String, accountId: Long): OrsonAiAddMovieResponse

  /**
    * Get Batch Analysis Results
    * Gets the completed Video Batch results, if done, or an error or status update if not.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getBatch(version: BigDecimal, requestId: String, accountId: Long): OrsonAiBatchResponse

  /**
    * Get Emotion Results
    * Checks the Emotion analysis and returns in progress, results, or error.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getEmotion(version: BigDecimal, requestId: String, accountId: Long): OrsonAiEmotionsResponse

  /**
    * Check episode status
    * Gets a summary of the episode&#39;s status, including any renders.
    * @param episodeId Episode ID
    * @param accountId Sirqul Account Id
    */
  def getEpisodeStatus(version: BigDecimal, episodeId: Long, accountId: Long): OrsonEpisodeResponse

  /**
    * Check episode status
    * Gets a summary of the episode&#39;s status, including any renders.
    * @param renderId Render ID
    * @param accountId Sirqul Account Id
    */
  def getRenderStatus(version: BigDecimal, renderId: String, accountId: Long): OrsonRenderResponse

  /**
    * Get Speach to Text Result
    * The results of the video transcription and optional translation.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getSTT(version: BigDecimal, requestId: String, accountId: Long): OrsonAiSTTResponse

  /**
    * Get Text to Speach Result
    * Check the status of an in progress Text-to-Speech call or download the result.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getTTS(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTTSResponse

  /**
    * Get TechTune Results
    * Get a result or continue waiting for a pending request for TechTune analysis.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getTechTune(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTechTuneResponse

  /**
    * Get Topics
    * Get the result of an in progress Topics Analysis from an earlier POST.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getTopics(version: BigDecimal, requestId: String, accountId: Long): OrsonAiTopicsResponse

  /**
    * Get VoiceCanvas images
    * Get a result or continue waiting for a pending request for VoiceCanvas Images.
    * @param requestId Orson Request Id
    * @param accountId Sirqul Account Id
    */
  def getVoiceCanvas(version: BigDecimal, requestId: String, accountId: Long): OrsonAiVoiceCanvasResponse

  /**
    * Starts a StoryStitch video render
    * Starts a StoryStitch video render to produce your final video, returning the status details.
    * @param accountId Sirqul Account Id
    * @param data Request Data String
    */
  def startVideoRender(version: BigDecimal, accountId: Long, data: String): OrsonRenderResponse

  /**
    * Speach to Text
    * Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.
    * @param accountId Sirqul Account Id
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param sourceLanguage Source Language
    * @param targetLanguage Target Language
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def stt(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], sourceLanguage: Option[String], targetLanguage: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiSTTResponse

  /**
    * Summarize Topics
    * Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.
    * @param accountId Sirqul Account Id
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param doc The text to get topics for.
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param limit The number of results to return
    * @param offset The starting offset into the total result set to start from
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def summarizeTopics(version: BigDecimal, accountId: Long, thirdPartyAccountId: Option[String], doc: Option[String], file: Option[TemporaryFile], url: Option[String], limit: Option[Int], offset: Option[Int], callback: Option[String]): OrsonAiTopicsResponse

  /**
    * Detect Technical Issues
    * Analyses a movie file to detect technical issues, such as too few people in frame.
    * @param accountId Sirqul Account Id
    * @param numFacesExpected Number of expected faces
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param file An uploaded recording to analyze (Currently limited to 10MB)
    * @param url A recording file to download and analyze (Size limit: 1GB)
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def techTune(version: BigDecimal, accountId: Long, numFacesExpected: Int, thirdPartyAccountId: Option[String], file: Option[TemporaryFile], url: Option[String], callback: Option[String]): OrsonAiTechTuneResponse

  /**
    * Text to Speach
    * Creates an audio file for the given text, with the option of language and voice selection.
    * @param accountId Sirqul Account Id
    * @param text Text
    * @param thirdPartyAccountId A third-party account id that is meaningful to your systems
    * @param language The language to use for the speaker and incoming text
    * @param voice A language-specific voice to use, or picks the language default if not provided
    * @param callback When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    */
  def tts(version: BigDecimal, accountId: Long, text: String, thirdPartyAccountId: Option[String], language: Option[String], voice: Option[String], callback: Option[String]): OrsonAiTTSResponse
}
