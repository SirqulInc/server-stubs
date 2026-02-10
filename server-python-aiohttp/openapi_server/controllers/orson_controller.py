from typing import List, Dict
from aiohttp import web

from openapi_server.models.orson_ai_add_movie_response import OrsonAiAddMovieResponse
from openapi_server.models.orson_ai_batch_response import OrsonAiBatchResponse
from openapi_server.models.orson_ai_emotions_response import OrsonAiEmotionsResponse
from openapi_server.models.orson_ai_proto_response import OrsonAiProtoResponse
from openapi_server.models.orson_ai_stt_response import OrsonAiSTTResponse
from openapi_server.models.orson_ai_tts_response import OrsonAiTTSResponse
from openapi_server.models.orson_ai_tech_tune_response import OrsonAiTechTuneResponse
from openapi_server.models.orson_ai_topics_response import OrsonAiTopicsResponse
from openapi_server.models.orson_ai_voice_canvas_response import OrsonAiVoiceCanvasResponse
from openapi_server.models.orson_episode_response import OrsonEpisodeResponse
from openapi_server.models.orson_render_response import OrsonRenderResponse
from openapi_server import util


async def add_movie(request: web.Request, version, account_id, movie_name, third_party_account_id=None, tags=None, file=None, url=None, param_callback=None) -> web.Response:
    """Add Movie

    Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param movie_name: Movie Name
    :type movie_name: str
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param tags: A user defined list (comma-delimited) of tags associated with the movie
    :type tags: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def ai_docs(request: web.Request, version, account_id, doc, return_topics=None, limit=None, offset=None) -> web.Response:
    """Search Docs

    Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param doc: Doc
    :type doc: str
    :param return_topics: Return Topics
    :type return_topics: bool
    :param limit: Limit
    :type limit: int
    :param offset: Offset
    :type offset: int

    """
    return web.Response(status=200)


async def ai_find_images(request: web.Request, version, account_id, text, parse_flag=None, fetch_flag=None, size=None) -> web.Response:
    """Find images

    Returns a list of URIs of images that match the text.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param text: Text
    :type text: str
    :param parse_flag: Parse Flag
    :type parse_flag: str
    :param fetch_flag: Fetch Flag
    :type fetch_flag: str
    :param size: Size
    :type size: str

    """
    return web.Response(status=200)


async def ai_tags(request: web.Request, version, account_id, tags, conditional=None, limit=None, offset=None) -> web.Response:
    """Search Tags

    Search the tags column of user provided tags using this endpoint.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param tags: Tags
    :type tags: str
    :param conditional: Conditional
    :type conditional: str
    :param limit: Limit
    :type limit: int
    :param offset: Offset
    :type offset: int

    """
    return web.Response(status=200)


async def ai_text(request: web.Request, version, account_id, terms, conditional=None, limit=None, offset=None) -> web.Response:
    """Search Text

    Search the movie text column of movie text using this endpoint.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param terms: Terms
    :type terms: str
    :param conditional: Conditional
    :type conditional: str
    :param limit: Limit
    :type limit: int
    :param offset: Offset
    :type offset: int

    """
    return web.Response(status=200)


async def batch(request: web.Request, version, account_id, third_party_account_id=None, limit=None, operations=None, file=None, url=None, param_callback=None) -> web.Response:
    """Batch Analysis

    Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file..

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param limit: The number of topics to return
    :type limit: int
    :param operations: The comma-delimited list of A/V batch analysis operations to run on this file. Possible values: Transcript,Topics,Emotions
    :type operations: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def create_instant_episode(request: web.Request, version, account_id, data) -> web.Response:
    """Creates an instant episode

    Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param data: Request Data String
    :type data: str

    """
    return web.Response(status=200)


async def create_voice_canvas(request: web.Request, version, account_id, dimensions, third_party_account_id=None, text=None, file=None, url=None, parse_flag=None, fetch_flag=None, param_callback=None) -> web.Response:
    """Create VoiceCanvas images

    Create VoiceCanvas images for provided text, file upload, or file URL

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param dimensions: Enum: \&quot;256x256\&quot; \&quot;512x512\&quot; \&quot;1024x1024\&quot;
    :type dimensions: str
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param text: Provide a transcript or previously extracted topics for image generation
    :type text: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param parse_flag: When false, uses the raw value from text instead of identifying topics to fetch/generate from
    :type parse_flag: bool
    :param fetch_flag: When true, fetches images instead of generating them
    :type fetch_flag: bool
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def emotion(request: web.Request, version, account_id, third_party_account_id=None, file=None, url=None, param_callback=None) -> web.Response:
    """Detect emotions

    Detects emotions in an audio or video recording.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def get_add_movie_result(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Add Movie Result

    Get the result of an in progress Add Movie request from an earlier POST.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_batch(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Batch Analysis Results

    Gets the completed Video Batch results, if done, or an error or status update if not.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_emotion(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Emotion Results

    Checks the Emotion analysis and returns in progress, results, or error.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_episode_status(request: web.Request, version, episode_id, account_id) -> web.Response:
    """Check episode status

    Gets a summary of the episode&#39;s status, including any renders.

    :param version: 
    :type version: 
    :param episode_id: Episode ID
    :type episode_id: int
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_render_status(request: web.Request, version, render_id, account_id) -> web.Response:
    """Check episode status

    Gets a summary of the episode&#39;s status, including any renders.

    :param version: 
    :type version: 
    :param render_id: Render ID
    :type render_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_stt(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Speach to Text Result

    The results of the video transcription and optional translation.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_tech_tune(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get TechTune Results

    Get a result or continue waiting for a pending request for TechTune analysis.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_topics(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Topics

    Get the result of an in progress Topics Analysis from an earlier POST.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_tts(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get Text to Speach Result

    Check the status of an in progress Text-to-Speech call or download the result.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def get_voice_canvas(request: web.Request, version, request_id, account_id) -> web.Response:
    """Get VoiceCanvas images

    Get a result or continue waiting for a pending request for VoiceCanvas Images.

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    """
    return web.Response(status=200)


async def start_video_render(request: web.Request, version, account_id, data) -> web.Response:
    """Starts a StoryStitch video render

    Starts a StoryStitch video render to produce your final video, returning the status details.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param data: Request Data String
    :type data: str

    """
    return web.Response(status=200)


async def stt(request: web.Request, version, account_id, third_party_account_id=None, source_language=None, target_language=None, file=None, url=None, param_callback=None) -> web.Response:
    """Speach to Text

    Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param source_language: Source Language
    :type source_language: str
    :param target_language: Target Language
    :type target_language: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def summarize_topics(request: web.Request, version, account_id, third_party_account_id=None, doc=None, file=None, url=None, limit=None, offset=None, param_callback=None) -> web.Response:
    """Summarize Topics

    Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param doc: The text to get topics for.
    :type doc: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param limit: The number of results to return
    :type limit: int
    :param offset: The starting offset into the total result set to start from
    :type offset: int
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def tech_tune(request: web.Request, version, account_id, num_faces_expected, third_party_account_id=None, file=None, url=None, param_callback=None) -> web.Response:
    """Detect Technical Issues

    Analyses a movie file to detect technical issues, such as too few people in frame.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param num_faces_expected: Number of expected faces
    :type num_faces_expected: int
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param file: An uploaded recording to analyze (Currently limited to 10MB)
    :type file: str
    :param url: A recording file to download and analyze (Size limit: 1GB)
    :type url: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)


async def tts(request: web.Request, version, account_id, text, third_party_account_id=None, language=None, voice=None, param_callback=None) -> web.Response:
    """Text to Speach

    Creates an audio file for the given text, with the option of language and voice selection.

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param text: Text
    :type text: str
    :param third_party_account_id: A third-party account id that is meaningful to your systems
    :type third_party_account_id: str
    :param language: The language to use for the speaker and incoming text
    :type language: str
    :param voice: A language-specific voice to use, or picks the language default if not provided
    :type voice: str
    :param param_callback: When provided, Orson will return a 202 and POST the results to this URL when complete instead of holding the Request open
    :type param_callback: str

    """
    return web.Response(status=200)
