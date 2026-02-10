import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.orson_ai_add_movie_response import OrsonAiAddMovieResponse  # noqa: E501
from openapi_server.models.orson_ai_batch_response import OrsonAiBatchResponse  # noqa: E501
from openapi_server.models.orson_ai_emotions_response import OrsonAiEmotionsResponse  # noqa: E501
from openapi_server.models.orson_ai_proto_response import OrsonAiProtoResponse  # noqa: E501
from openapi_server.models.orson_ai_stt_response import OrsonAiSTTResponse  # noqa: E501
from openapi_server.models.orson_ai_tts_response import OrsonAiTTSResponse  # noqa: E501
from openapi_server.models.orson_ai_tech_tune_response import OrsonAiTechTuneResponse  # noqa: E501
from openapi_server.models.orson_ai_topics_response import OrsonAiTopicsResponse  # noqa: E501
from openapi_server.models.orson_ai_voice_canvas_response import OrsonAiVoiceCanvasResponse  # noqa: E501
from openapi_server.models.orson_episode_response import OrsonEpisodeResponse  # noqa: E501
from openapi_server.models.orson_render_response import OrsonRenderResponse  # noqa: E501
from openapi_server import util


def add_movie(version, account_id, movie_name, third_party_account_id=None, tags=None, file=None, url=None, param_callback=None):  # noqa: E501
    """Add Movie

    Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term. # noqa: E501

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

    :rtype: Union[OrsonAiAddMovieResponse, Tuple[OrsonAiAddMovieResponse, int], Tuple[OrsonAiAddMovieResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ai_docs(version, account_id, doc, return_topics=None, limit=None, offset=None):  # noqa: E501
    """Search Docs

    Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document. # noqa: E501

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

    :rtype: Union[OrsonAiProtoResponse, Tuple[OrsonAiProtoResponse, int], Tuple[OrsonAiProtoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ai_find_images(version, account_id, text, parse_flag=None, fetch_flag=None, size=None):  # noqa: E501
    """Find images

    Returns a list of URIs of images that match the text. # noqa: E501

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

    :rtype: Union[OrsonAiProtoResponse, Tuple[OrsonAiProtoResponse, int], Tuple[OrsonAiProtoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ai_tags(version, account_id, tags, conditional=None, limit=None, offset=None):  # noqa: E501
    """Search Tags

    Search the tags column of user provided tags using this endpoint. # noqa: E501

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

    :rtype: Union[OrsonAiProtoResponse, Tuple[OrsonAiProtoResponse, int], Tuple[OrsonAiProtoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def ai_text(version, account_id, terms, conditional=None, limit=None, offset=None):  # noqa: E501
    """Search Text

    Search the movie text column of movie text using this endpoint. # noqa: E501

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

    :rtype: Union[OrsonAiProtoResponse, Tuple[OrsonAiProtoResponse, int], Tuple[OrsonAiProtoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def batch(version, account_id, third_party_account_id=None, limit=None, operations=None, file=None, url=None, param_callback=None):  # noqa: E501
    """Batch Analysis

    Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file.. # noqa: E501

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

    :rtype: Union[OrsonAiBatchResponse, Tuple[OrsonAiBatchResponse, int], Tuple[OrsonAiBatchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_instant_episode(version, account_id, data):  # noqa: E501
    """Creates an instant episode

    Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param data: Request Data String
    :type data: str

    :rtype: Union[OrsonEpisodeResponse, Tuple[OrsonEpisodeResponse, int], Tuple[OrsonEpisodeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_voice_canvas(version, account_id, dimensions, third_party_account_id=None, text=None, file=None, url=None, parse_flag=None, fetch_flag=None, param_callback=None):  # noqa: E501
    """Create VoiceCanvas images

    Create VoiceCanvas images for provided text, file upload, or file URL # noqa: E501

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

    :rtype: Union[OrsonAiVoiceCanvasResponse, Tuple[OrsonAiVoiceCanvasResponse, int], Tuple[OrsonAiVoiceCanvasResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def emotion(version, account_id, third_party_account_id=None, file=None, url=None, param_callback=None):  # noqa: E501
    """Detect emotions

    Detects emotions in an audio or video recording. # noqa: E501

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

    :rtype: Union[OrsonAiEmotionsResponse, Tuple[OrsonAiEmotionsResponse, int], Tuple[OrsonAiEmotionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_add_movie_result(version, request_id, account_id):  # noqa: E501
    """Get Add Movie Result

    Get the result of an in progress Add Movie request from an earlier POST. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiAddMovieResponse, Tuple[OrsonAiAddMovieResponse, int], Tuple[OrsonAiAddMovieResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_batch(version, request_id, account_id):  # noqa: E501
    """Get Batch Analysis Results

    Gets the completed Video Batch results, if done, or an error or status update if not. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiBatchResponse, Tuple[OrsonAiBatchResponse, int], Tuple[OrsonAiBatchResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_emotion(version, request_id, account_id):  # noqa: E501
    """Get Emotion Results

    Checks the Emotion analysis and returns in progress, results, or error. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiEmotionsResponse, Tuple[OrsonAiEmotionsResponse, int], Tuple[OrsonAiEmotionsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_episode_status(version, episode_id, account_id):  # noqa: E501
    """Check episode status

    Gets a summary of the episode&#39;s status, including any renders. # noqa: E501

    :param version: 
    :type version: 
    :param episode_id: Episode ID
    :type episode_id: int
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonEpisodeResponse, Tuple[OrsonEpisodeResponse, int], Tuple[OrsonEpisodeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_render_status(version, render_id, account_id):  # noqa: E501
    """Check episode status

    Gets a summary of the episode&#39;s status, including any renders. # noqa: E501

    :param version: 
    :type version: 
    :param render_id: Render ID
    :type render_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonRenderResponse, Tuple[OrsonRenderResponse, int], Tuple[OrsonRenderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stt(version, request_id, account_id):  # noqa: E501
    """Get Speach to Text Result

    The results of the video transcription and optional translation. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiSTTResponse, Tuple[OrsonAiSTTResponse, int], Tuple[OrsonAiSTTResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tech_tune(version, request_id, account_id):  # noqa: E501
    """Get TechTune Results

    Get a result or continue waiting for a pending request for TechTune analysis. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiTechTuneResponse, Tuple[OrsonAiTechTuneResponse, int], Tuple[OrsonAiTechTuneResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_topics(version, request_id, account_id):  # noqa: E501
    """Get Topics

    Get the result of an in progress Topics Analysis from an earlier POST. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiTopicsResponse, Tuple[OrsonAiTopicsResponse, int], Tuple[OrsonAiTopicsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tts(version, request_id, account_id):  # noqa: E501
    """Get Text to Speach Result

    Check the status of an in progress Text-to-Speech call or download the result. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiTTSResponse, Tuple[OrsonAiTTSResponse, int], Tuple[OrsonAiTTSResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_voice_canvas(version, request_id, account_id):  # noqa: E501
    """Get VoiceCanvas images

    Get a result or continue waiting for a pending request for VoiceCanvas Images. # noqa: E501

    :param version: 
    :type version: 
    :param request_id: Orson Request Id
    :type request_id: str
    :param account_id: Sirqul Account Id
    :type account_id: int

    :rtype: Union[OrsonAiVoiceCanvasResponse, Tuple[OrsonAiVoiceCanvasResponse, int], Tuple[OrsonAiVoiceCanvasResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def start_video_render(version, account_id, data):  # noqa: E501
    """Starts a StoryStitch video render

    Starts a StoryStitch video render to produce your final video, returning the status details. # noqa: E501

    :param version: 
    :type version: 
    :param account_id: Sirqul Account Id
    :type account_id: int
    :param data: Request Data String
    :type data: str

    :rtype: Union[OrsonRenderResponse, Tuple[OrsonRenderResponse, int], Tuple[OrsonRenderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def stt(version, account_id, third_party_account_id=None, source_language=None, target_language=None, file=None, url=None, param_callback=None):  # noqa: E501
    """Speach to Text

    Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages. # noqa: E501

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

    :rtype: Union[OrsonAiSTTResponse, Tuple[OrsonAiSTTResponse, int], Tuple[OrsonAiSTTResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def summarize_topics(version, account_id, third_party_account_id=None, doc=None, file=None, url=None, limit=None, offset=None, param_callback=None):  # noqa: E501
    """Summarize Topics

    Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score. # noqa: E501

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

    :rtype: Union[OrsonAiTopicsResponse, Tuple[OrsonAiTopicsResponse, int], Tuple[OrsonAiTopicsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def tech_tune(version, account_id, num_faces_expected, third_party_account_id=None, file=None, url=None, param_callback=None):  # noqa: E501
    """Detect Technical Issues

    Analyses a movie file to detect technical issues, such as too few people in frame. # noqa: E501

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

    :rtype: Union[OrsonAiTechTuneResponse, Tuple[OrsonAiTechTuneResponse, int], Tuple[OrsonAiTechTuneResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def tts(version, account_id, text, third_party_account_id=None, language=None, voice=None, param_callback=None):  # noqa: E501
    """Text to Speach

    Creates an audio file for the given text, with the option of language and voice selection. # noqa: E501

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

    :rtype: Union[OrsonAiTTSResponse, Tuple[OrsonAiTTSResponse, int], Tuple[OrsonAiTTSResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
